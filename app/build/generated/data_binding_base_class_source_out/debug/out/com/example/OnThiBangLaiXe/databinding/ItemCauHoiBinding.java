// Generated by view binder compiler. Do not edit!
package com.example.OnThiBangLaiXe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.OnThiBangLaiXe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCauHoiBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final ImageView ivCauHoi;

  @NonNull
  public final ImageView ivDungSai;

  @NonNull
  public final ImageView ivSave;

  @NonNull
  public final RadioButton rbA;

  @NonNull
  public final RadioButton rbB;

  @NonNull
  public final RadioButton rbC;

  @NonNull
  public final RadioButton rbD;

  @NonNull
  public final RecyclerView rvGiaiThichBienBao;

  @NonNull
  public final TextView txtDungSai;

  @NonNull
  public final TextView txtGiaiThichCauHoi;

  @NonNull
  public final TextView txtNoiDungCauHoi;

  @NonNull
  public final TextView txtSoCauHoi;

  private ItemCauHoiBinding(@NonNull LinearLayout rootView, @NonNull ConstraintLayout header,
      @NonNull ImageView ivCauHoi, @NonNull ImageView ivDungSai, @NonNull ImageView ivSave,
      @NonNull RadioButton rbA, @NonNull RadioButton rbB, @NonNull RadioButton rbC,
      @NonNull RadioButton rbD, @NonNull RecyclerView rvGiaiThichBienBao,
      @NonNull TextView txtDungSai, @NonNull TextView txtGiaiThichCauHoi,
      @NonNull TextView txtNoiDungCauHoi, @NonNull TextView txtSoCauHoi) {
    this.rootView = rootView;
    this.header = header;
    this.ivCauHoi = ivCauHoi;
    this.ivDungSai = ivDungSai;
    this.ivSave = ivSave;
    this.rbA = rbA;
    this.rbB = rbB;
    this.rbC = rbC;
    this.rbD = rbD;
    this.rvGiaiThichBienBao = rvGiaiThichBienBao;
    this.txtDungSai = txtDungSai;
    this.txtGiaiThichCauHoi = txtGiaiThichCauHoi;
    this.txtNoiDungCauHoi = txtNoiDungCauHoi;
    this.txtSoCauHoi = txtSoCauHoi;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCauHoiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCauHoiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_cau_hoi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCauHoiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.header;
      ConstraintLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.ivCauHoi;
      ImageView ivCauHoi = ViewBindings.findChildViewById(rootView, id);
      if (ivCauHoi == null) {
        break missingId;
      }

      id = R.id.ivDungSai;
      ImageView ivDungSai = ViewBindings.findChildViewById(rootView, id);
      if (ivDungSai == null) {
        break missingId;
      }

      id = R.id.ivSave;
      ImageView ivSave = ViewBindings.findChildViewById(rootView, id);
      if (ivSave == null) {
        break missingId;
      }

      id = R.id.rbA;
      RadioButton rbA = ViewBindings.findChildViewById(rootView, id);
      if (rbA == null) {
        break missingId;
      }

      id = R.id.rbB;
      RadioButton rbB = ViewBindings.findChildViewById(rootView, id);
      if (rbB == null) {
        break missingId;
      }

      id = R.id.rbC;
      RadioButton rbC = ViewBindings.findChildViewById(rootView, id);
      if (rbC == null) {
        break missingId;
      }

      id = R.id.rbD;
      RadioButton rbD = ViewBindings.findChildViewById(rootView, id);
      if (rbD == null) {
        break missingId;
      }

      id = R.id.rvGiaiThichBienBao;
      RecyclerView rvGiaiThichBienBao = ViewBindings.findChildViewById(rootView, id);
      if (rvGiaiThichBienBao == null) {
        break missingId;
      }

      id = R.id.txtDungSai;
      TextView txtDungSai = ViewBindings.findChildViewById(rootView, id);
      if (txtDungSai == null) {
        break missingId;
      }

      id = R.id.txtGiaiThichCauHoi;
      TextView txtGiaiThichCauHoi = ViewBindings.findChildViewById(rootView, id);
      if (txtGiaiThichCauHoi == null) {
        break missingId;
      }

      id = R.id.txtNoiDungCauHoi;
      TextView txtNoiDungCauHoi = ViewBindings.findChildViewById(rootView, id);
      if (txtNoiDungCauHoi == null) {
        break missingId;
      }

      id = R.id.txtSoCauHoi;
      TextView txtSoCauHoi = ViewBindings.findChildViewById(rootView, id);
      if (txtSoCauHoi == null) {
        break missingId;
      }

      return new ItemCauHoiBinding((LinearLayout) rootView, header, ivCauHoi, ivDungSai, ivSave,
          rbA, rbB, rbC, rbD, rvGiaiThichBienBao, txtDungSai, txtGiaiThichCauHoi, txtNoiDungCauHoi,
          txtSoCauHoi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
