// Generated by view binder compiler. Do not edit!
package com.amaurypm.esprimo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amaurypm.esprimo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pl.droidsonroids.gif.GifImageView;

public final class ActivitySplashBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cl;

  @NonNull
  public final GifImageView gifImageView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvHello;

  private ActivitySplashBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout cl,
      @NonNull GifImageView gifImageView, @NonNull TextView textView, @NonNull TextView tvHello) {
    this.rootView = rootView;
    this.cl = cl;
    this.gifImageView = gifImageView;
    this.textView = textView;
    this.tvHello = tvHello;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cl = (ConstraintLayout) rootView;

      id = R.id.gifImageView;
      GifImageView gifImageView = ViewBindings.findChildViewById(rootView, id);
      if (gifImageView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvHello;
      TextView tvHello = ViewBindings.findChildViewById(rootView, id);
      if (tvHello == null) {
        break missingId;
      }

      return new ActivitySplashBinding((ConstraintLayout) rootView, cl, gifImageView, textView,
          tvHello);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
