// Generated by view binder compiler. Do not edit!
package com.example.OnThiBangLaiXe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.OnThiBangLaiXe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.relex.circleindicator.CircleIndicator;

public final class ActivityOnBoardingBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleIndicator CircleIndicator;

  @NonNull
  public final LinearLayout layoutNext;

  @NonNull
  public final RelativeLayout lyBottom;

  @NonNull
  public final TextView tvSkip;

  @NonNull
  public final ViewPager vp;

  private ActivityOnBoardingBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleIndicator CircleIndicator, @NonNull LinearLayout layoutNext,
      @NonNull RelativeLayout lyBottom, @NonNull TextView tvSkip, @NonNull ViewPager vp) {
    this.rootView = rootView;
    this.CircleIndicator = CircleIndicator;
    this.layoutNext = layoutNext;
    this.lyBottom = lyBottom;
    this.tvSkip = tvSkip;
    this.vp = vp;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_on_boarding, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOnBoardingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CircleIndicator;
      CircleIndicator CircleIndicator = ViewBindings.findChildViewById(rootView, id);
      if (CircleIndicator == null) {
        break missingId;
      }

      id = R.id.layout_next;
      LinearLayout layoutNext = ViewBindings.findChildViewById(rootView, id);
      if (layoutNext == null) {
        break missingId;
      }

      id = R.id.lyBottom;
      RelativeLayout lyBottom = ViewBindings.findChildViewById(rootView, id);
      if (lyBottom == null) {
        break missingId;
      }

      id = R.id.tvSkip;
      TextView tvSkip = ViewBindings.findChildViewById(rootView, id);
      if (tvSkip == null) {
        break missingId;
      }

      id = R.id.vp;
      ViewPager vp = ViewBindings.findChildViewById(rootView, id);
      if (vp == null) {
        break missingId;
      }

      return new ActivityOnBoardingBinding((RelativeLayout) rootView, CircleIndicator, layoutNext,
          lyBottom, tvSkip, vp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
