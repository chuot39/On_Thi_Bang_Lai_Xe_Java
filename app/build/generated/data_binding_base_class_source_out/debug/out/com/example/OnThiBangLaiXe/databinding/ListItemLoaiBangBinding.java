// Generated by view binder compiler. Do not edit!
package com.example.OnThiBangLaiXe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.OnThiBangLaiXe.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ListItemLoaiBangBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  private ListItemLoaiBangBinding(@NonNull TextView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemLoaiBangBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemLoaiBangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_loai_bang, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemLoaiBangBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ListItemLoaiBangBinding((TextView) rootView);
  }
}
