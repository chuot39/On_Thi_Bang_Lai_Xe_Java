// Generated by view binder compiler. Do not edit!
package com.example.OnThiBangLaiXe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.OnThiBangLaiXe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityKetQuaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAll;

  @NonNull
  public final Button btnFalse;

  @NonNull
  public final Button btnNull;

  @NonNull
  public final Button btnTrue;

  @NonNull
  public final FrameLayout fm;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView txtLyDo;

  @NonNull
  public final TextView txtResult;

  @NonNull
  public final View view;

  private ActivityKetQuaBinding(@NonNull LinearLayout rootView, @NonNull Button btnAll,
      @NonNull Button btnFalse, @NonNull Button btnNull, @NonNull Button btnTrue,
      @NonNull FrameLayout fm, @NonNull LinearLayout linearLayout2, @NonNull TextView txtLyDo,
      @NonNull TextView txtResult, @NonNull View view) {
    this.rootView = rootView;
    this.btnAll = btnAll;
    this.btnFalse = btnFalse;
    this.btnNull = btnNull;
    this.btnTrue = btnTrue;
    this.fm = fm;
    this.linearLayout2 = linearLayout2;
    this.txtLyDo = txtLyDo;
    this.txtResult = txtResult;
    this.view = view;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKetQuaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKetQuaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ket_qua, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKetQuaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAll;
      Button btnAll = ViewBindings.findChildViewById(rootView, id);
      if (btnAll == null) {
        break missingId;
      }

      id = R.id.btnFalse;
      Button btnFalse = ViewBindings.findChildViewById(rootView, id);
      if (btnFalse == null) {
        break missingId;
      }

      id = R.id.btnNull;
      Button btnNull = ViewBindings.findChildViewById(rootView, id);
      if (btnNull == null) {
        break missingId;
      }

      id = R.id.btnTrue;
      Button btnTrue = ViewBindings.findChildViewById(rootView, id);
      if (btnTrue == null) {
        break missingId;
      }

      id = R.id.fm;
      FrameLayout fm = ViewBindings.findChildViewById(rootView, id);
      if (fm == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.txtLyDo;
      TextView txtLyDo = ViewBindings.findChildViewById(rootView, id);
      if (txtLyDo == null) {
        break missingId;
      }

      id = R.id.txtResult;
      TextView txtResult = ViewBindings.findChildViewById(rootView, id);
      if (txtResult == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new ActivityKetQuaBinding((LinearLayout) rootView, btnAll, btnFalse, btnNull, btnTrue,
          fm, linearLayout2, txtLyDo, txtResult, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
