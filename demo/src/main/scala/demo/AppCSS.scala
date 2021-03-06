package demo

import chandu0101.scalajs.react.components.reactsplitpane.ReactSplitPane
import chandu0101.scalajs.react.components.{
  Pager,
  ReactDraggable,
  ReactListView,
  ReactSearchBox,
  ReactTable,
  ReactTagsInputCss,
  SpinnerCss,
  hljs
}
import demo.components._
import demo.components.materialui._

import scalacss.ProdDefaults._
import scalacss.ScalaCssReact._
import scalacss.internal.mutable.GlobalRegistry

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      LeftNav.Style,
      LeftNavPage.Style,
      MuiButtonsDemo.Style,
      MuiPaperDemo.Style,
      MuiSwitchesDemo.Style,
      MuiTabsDemo.Style,
      MobileTearSheet.Style,
      ReactTable.DefaultStyle,
      ReactListView.DefaultStyle,
      ReactSearchBox.DefaultStyle,
      Pager.DefaultStyle,
      ScalaCSSTutorial.Style,
      InfoTemplate.Style,
      ReactInfiniteDemo.styles,
      ReactDraggable.Style,
      MuiTabsDemo.Style,
      ReactSplitPane.DefaultStyle,
      ReactDraggable.Style,
    )

    /* touch objects to force namespace import */
    hljs.Css.Github
    ReactTagsInputCss
    SpinnerCss

    GlobalRegistry.addToDocumentOnRegistration()
  }
}
