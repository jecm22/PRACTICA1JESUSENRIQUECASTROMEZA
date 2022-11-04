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

public final class ActivityResultBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView resultado;

  @NonNull
  public final TextView val1;

  private ActivityResultBinding(@NonNull ConstraintLayout rootView, @NonNull TextView resultado,
      @NonNull TextView val1) {
    this.rootView = rootView;
    this.resultado = resultado;
    this.val1 = val1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.resultado;
      TextView resultado = ViewBindings.findChildViewById(rootView, id);
      if (resultado == null) {
        break missingId;
      }

      id = R.id.val1;
      TextView val1 = ViewBindings.findChildViewById(rootView, id);
      if (val1 == null) {
        break missingId;
      }

      return new ActivityResultBinding((ConstraintLayout) rootView, resultado, val1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}