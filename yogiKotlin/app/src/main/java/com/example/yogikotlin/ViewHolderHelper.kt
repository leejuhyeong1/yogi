package com.example.yogikotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer


open class ViewHolderHelper(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer