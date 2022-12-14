// Generated by view binder compiler. Do not edit!
package com.amaurypm.esprimo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amaurypm.esprimo.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Button btnVerificar;

  @NonNull
  public final CardView cardSelector;

  @NonNull
  public final CardView cardValues;

  @NonNull
  public final ConstraintLayout clMain;

  @NonNull
  public final Spinner formulasSpinner;

  @NonNull
  public final ImageView imagenFormula;

  @NonNull
  public final TextView infoText;

  @NonNull
  public final EditText inputPrimero;

  @NonNull
  public final EditText inputSegundo;

  @NonNull
  public final TextView primero;

  @NonNull
  public final TextView segundo;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull Button btnVerificar,
      @NonNull CardView cardSelector, @NonNull CardView cardValues,
      @NonNull ConstraintLayout clMain, @NonNull Spinner formulasSpinner,
      @NonNull ImageView imagenFormula, @NonNull TextView infoText, @NonNull EditText inputPrimero,
      @NonNull EditText inputSegundo, @NonNull TextView primero, @NonNull TextView segundo,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.btnVerificar = btnVerificar;
    this.cardSelector = cardSelector;
    this.cardValues = cardValues;
    this.clMain = clMain;
    this.formulasSpinner = formulasSpinner;
    this.imagenFormula = imagenFormula;
    this.infoText = infoText;
    this.inputPrimero = inputPrimero;
    this.inputSegundo = inputSegundo;
    this.primero = primero;
    this.segundo = segundo;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.btnVerificar;
      Button btnVerificar = ViewBindings.findChildViewById(rootView, id);
      if (btnVerificar == null) {
        break missingId;
      }

      id = R.id.card_selector;
      CardView cardSelector = ViewBindings.findChildViewById(rootView, id);
      if (cardSelector == null) {
        break missingId;
      }

      id = R.id.card_values;
      CardView cardValues = ViewBindings.findChildViewById(rootView, id);
      if (cardValues == null) {
        break missingId;
      }

      ConstraintLayout clMain = (ConstraintLayout) rootView;

      id = R.id.formulas_spinner;
      Spinner formulasSpinner = ViewBindings.findChildViewById(rootView, id);
      if (formulasSpinner == null) {
        break missingId;
      }

      id = R.id.imagenFormula;
      ImageView imagenFormula = ViewBindings.findChildViewById(rootView, id);
      if (imagenFormula == null) {
        break missingId;
      }

      id = R.id.info_text;
      TextView infoText = ViewBindings.findChildViewById(rootView, id);
      if (infoText == null) {
        break missingId;
      }

      id = R.id.inputPrimero;
      EditText inputPrimero = ViewBindings.findChildViewById(rootView, id);
      if (inputPrimero == null) {
        break missingId;
      }

      id = R.id.inputSegundo;
      EditText inputSegundo = ViewBindings.findChildViewById(rootView, id);
      if (inputSegundo == null) {
        break missingId;
      }

      id = R.id.primero;
      TextView primero = ViewBindings.findChildViewById(rootView, id);
      if (primero == null) {
        break missingId;
      }

      id = R.id.segundo;
      TextView segundo = ViewBindings.findChildViewById(rootView, id);
      if (segundo == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, appBarLayout, btnVerificar,
          cardSelector, cardValues, clMain, formulasSpinner, imagenFormula, infoText, inputPrimero,
          inputSegundo, primero, segundo, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
