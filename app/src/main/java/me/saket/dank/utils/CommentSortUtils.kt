package me.saket.dank.utils

import android.support.annotation.StringRes
import me.saket.dank.R
import net.dean.jraw.models.CommentSort
import net.dean.jraw.models.CommentSort.CONFIDENCE
import net.dean.jraw.models.CommentSort.CONTROVERSIAL
import net.dean.jraw.models.CommentSort.LIVE
import net.dean.jraw.models.CommentSort.NEW
import net.dean.jraw.models.CommentSort.OLD
import net.dean.jraw.models.CommentSort.QA
import net.dean.jraw.models.CommentSort.RANDOM
import net.dean.jraw.models.CommentSort.TOP

// TODO Kotlin: Convert to extension functions?
object CommentSortUtils {

  @StringRes
  fun sortingDisplayTextRes(sort: CommentSort): Int {
    return when (sort) {
      CONFIDENCE -> R.string.comment_sorting_best
      TOP -> R.string.comment_sorting_top
      NEW -> R.string.comment_sorting_new
      CONTROVERSIAL -> R.string.comment_sorting_controversial
      OLD -> R.string.comment_sorting_old
      QA -> R.string.comment_sorting_qna
      RANDOM -> R.string.comment_sorting_random
      LIVE -> R.string.comment_sorting_live
    }
  }
}
