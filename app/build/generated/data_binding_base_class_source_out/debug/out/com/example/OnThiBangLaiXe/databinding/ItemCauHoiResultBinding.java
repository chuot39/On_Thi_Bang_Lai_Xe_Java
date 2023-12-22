// Generated by view binder compiler. Do not edit!
package com.example.OnThiBangLaiXe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ItemCauHoiResultBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView img;

  @NonNull
  public final ImageView imgBB;

  @NonNull
  public final ImageView imgCauhoidiemliet;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final TextView txtCau;

  @NonNull
  public final TextView txtContent;

  private ItemCauHoiResultBinding(@NonNull LinearLayout rootView, @NonNull ImageView img,
      @NonNull ImageView imgBB, @NonNull ImageView imgCauhoidiemliet,
      @NonNull LinearLayout linearLayout3, @NonNull TextView txtCau, @NonNull TextView txtContent) {
    this.rootView = rootView;
    this.img = img;
    this.imgBB = imgBB;
    this.imgCauhoidiemliet = imgCauhoidiemliet;
    this.linearLayout3 = linearLayout3;
    this.txtCau = txtCau;
    this.txtContent = txtContent;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCauHoiResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCauHoiResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_cau_hoi_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCauHoiResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img;
      ImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.imgBB;
      ImageView imgBB = ViewBindings.findChildViewById(rootView, id);
      if (imgBB == null) {
        break missingId;
      }

      id = R.id.img_cauhoidiemliet;
      ImageView imgCauhoidiemliet = ViewBindings.findChildViewById(rootView, id);
      if (imgCauhoidiemliet == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.txtCau;
      TextView txtCau = ViewBindings.findChildViewById(rootView, id);
      if (txtCau == null) {
        break missingId;
      }

      id = R.id.txtContent;
      TextView txtContent = ViewBindings.findChildViewById(rootView, id);
      if (txtContent == null) {
        break missingId;
      }

      return new ItemCauHoiResultBinding((LinearLayout) rootView, img, imgBB, imgCauhoidiemliet,
          linearLayout3, txtCau, txtContent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}