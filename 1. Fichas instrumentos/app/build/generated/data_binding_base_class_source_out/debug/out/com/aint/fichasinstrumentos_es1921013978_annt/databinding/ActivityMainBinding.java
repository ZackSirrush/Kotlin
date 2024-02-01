// Generated by view binder compiler. Do not edit!
package com.aint.fichasinstrumentos_es1921013978_annt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aint.fichasinstrumentos_es1921013978_annt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView DatosGenerales;

  @NonNull
  public final ImageButton botonCuerdas;

  @NonNull
  public final ImageButton botonElectricos;

  @NonNull
  public final ImageButton botonPercusion;

  @NonNull
  public final ImageButton botonViento;

  @NonNull
  public final View fondo;

  @NonNull
  public final ImageView imagenprincipal;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView titulo;

  @NonNull
  public final TextView tvcuerda;

  @NonNull
  public final TextView tvelectricos;

  @NonNull
  public final TextView tvpercusion;

  @NonNull
  public final TextView tvviento;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull TextView DatosGenerales,
      @NonNull ImageButton botonCuerdas, @NonNull ImageButton botonElectricos,
      @NonNull ImageButton botonPercusion, @NonNull ImageButton botonViento, @NonNull View fondo,
      @NonNull ImageView imagenprincipal, @NonNull TableLayout tableLayout,
      @NonNull TextView titulo, @NonNull TextView tvcuerda, @NonNull TextView tvelectricos,
      @NonNull TextView tvpercusion, @NonNull TextView tvviento) {
    this.rootView = rootView;
    this.DatosGenerales = DatosGenerales;
    this.botonCuerdas = botonCuerdas;
    this.botonElectricos = botonElectricos;
    this.botonPercusion = botonPercusion;
    this.botonViento = botonViento;
    this.fondo = fondo;
    this.imagenprincipal = imagenprincipal;
    this.tableLayout = tableLayout;
    this.titulo = titulo;
    this.tvcuerda = tvcuerda;
    this.tvelectricos = tvelectricos;
    this.tvpercusion = tvpercusion;
    this.tvviento = tvviento;
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
      id = R.id.DatosGenerales;
      TextView DatosGenerales = ViewBindings.findChildViewById(rootView, id);
      if (DatosGenerales == null) {
        break missingId;
      }

      id = R.id.botonCuerdas;
      ImageButton botonCuerdas = ViewBindings.findChildViewById(rootView, id);
      if (botonCuerdas == null) {
        break missingId;
      }

      id = R.id.botonElectricos;
      ImageButton botonElectricos = ViewBindings.findChildViewById(rootView, id);
      if (botonElectricos == null) {
        break missingId;
      }

      id = R.id.botonPercusion;
      ImageButton botonPercusion = ViewBindings.findChildViewById(rootView, id);
      if (botonPercusion == null) {
        break missingId;
      }

      id = R.id.botonViento;
      ImageButton botonViento = ViewBindings.findChildViewById(rootView, id);
      if (botonViento == null) {
        break missingId;
      }

      id = R.id.fondo;
      View fondo = ViewBindings.findChildViewById(rootView, id);
      if (fondo == null) {
        break missingId;
      }

      id = R.id.imagenprincipal;
      ImageView imagenprincipal = ViewBindings.findChildViewById(rootView, id);
      if (imagenprincipal == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.titulo;
      TextView titulo = ViewBindings.findChildViewById(rootView, id);
      if (titulo == null) {
        break missingId;
      }

      id = R.id.tvcuerda;
      TextView tvcuerda = ViewBindings.findChildViewById(rootView, id);
      if (tvcuerda == null) {
        break missingId;
      }

      id = R.id.tvelectricos;
      TextView tvelectricos = ViewBindings.findChildViewById(rootView, id);
      if (tvelectricos == null) {
        break missingId;
      }

      id = R.id.tvpercusion;
      TextView tvpercusion = ViewBindings.findChildViewById(rootView, id);
      if (tvpercusion == null) {
        break missingId;
      }

      id = R.id.tvviento;
      TextView tvviento = ViewBindings.findChildViewById(rootView, id);
      if (tvviento == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, DatosGenerales, botonCuerdas,
          botonElectricos, botonPercusion, botonViento, fondo, imagenprincipal, tableLayout, titulo,
          tvcuerda, tvelectricos, tvpercusion, tvviento);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}