package com.google.android.material.dialog;

import Yue.C4198;
import Yue.C8273;
import Yue.InterfaceC3397;
import Yue.InterfaceC3451;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC8650;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends DialogInterfaceC8650.C1585 {

    @InterfaceC3451
    private static final int DEF_STYLE_ATTR = C1980R.attr.alertDialogStyle;

    @InterfaceC7651
    private static final int DEF_STYLE_RES = C1980R.style.MaterialAlertDialog_MaterialComponents;

    @InterfaceC3451
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = C1980R.attr.materialAlertDialogTheme;

    @InterfaceC6490
    private Drawable background;

    @InterfaceC6391
    private final Rect backgroundInsets;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialAlertDialogBuilder(@InterfaceC6391 Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(@InterfaceC6391 Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context contextWrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? contextWrap : new C4198(contextWrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(@InterfaceC6391 Context context) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private static int getOverridingThemeResId(@InterfaceC6391 Context context, int i) {
        return i == 0 ? getMaterialAlertDialogThemeOverlay(context) : i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    public DialogInterfaceC8650 create() {
        DialogInterfaceC8650 dialogInterfaceC8650Create = super.create();
        Window window = dialogInterfaceC8650Create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(C8273.m27347(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(dialogInterfaceC8650Create, this.backgroundInsets));
        return dialogInterfaceC8650Create;
    }

    @InterfaceC6490
    public Drawable getBackground() {
        return this.background;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackground(@InterfaceC6490 Drawable drawable) {
        this.background = drawable;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(@InterfaceC6844 int i) {
        this.backgroundInsets.bottom = i;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(@InterfaceC6844 int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i;
        } else {
            this.backgroundInsets.right = i;
        }
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetStart(@InterfaceC6844 int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i;
        } else {
            this.backgroundInsets.left = i;
        }
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetTop(@InterfaceC6844 int i) {
        this.backgroundInsets.top = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialAlertDialogBuilder(@InterfaceC6391 Context context, int i) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = DEF_STYLE_ATTR;
        int i3 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i2, i3);
        int color = MaterialColors.getColor(context2, C1980R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, C1980R.styleable.MaterialAlertDialog, i2, i3);
        int color2 = typedArrayObtainStyledAttributes.getColor(C1980R.styleable.MaterialAlertDialog_backgroundTint, color);
        typedArrayObtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i2, i3);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.background = materialShapeDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setAdapter(@InterfaceC6490 ListAdapter listAdapter, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelable(Z)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCancelable(boolean z) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCursor(Landroid/database/Cursor;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCursor(@InterfaceC6490 Cursor cursor, @InterfaceC6490 DialogInterface.OnClickListener onClickListener, @InterfaceC6391 String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCustomTitle(Landroid/view/View;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCustomTitle(@InterfaceC6490 View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setIconAttribute(I)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIconAttribute(@InterfaceC3451 int i) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setNegativeButtonIcon(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@InterfaceC6490 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setNeutralButtonIcon(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@InterfaceC6490 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnCancelListener(@InterfaceC6490 DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnDismissListener(@InterfaceC6490 DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@InterfaceC6490 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnKeyListener(@InterfaceC6490 DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setPositiveButtonIcon(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@InterfaceC6490 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    /* JADX DEBUG: Method merged with bridge method: setIcon(I)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(@InterfaceC4525 int i) {
        return (MaterialAlertDialogBuilder) super.setIcon(i);
    }

    /* JADX DEBUG: Method merged with bridge method: setItems(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(@InterfaceC3397 int i, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(I)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(@InterfaceC7613 int i) {
        return (MaterialAlertDialogBuilder) super.setMessage(i);
    }

    /* JADX DEBUG: Method merged with bridge method: setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(@InterfaceC7613 int i, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(@InterfaceC7613 int i, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(@InterfaceC7613 int i, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(I)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(@InterfaceC7613 int i) {
        return (MaterialAlertDialogBuilder) super.setTitle(i);
    }

    /* JADX DEBUG: Method merged with bridge method: setView(I)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(int i) {
        return (MaterialAlertDialogBuilder) super.setView(i);
    }

    /* JADX DEBUG: Method merged with bridge method: setIcon(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(@InterfaceC6490 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    /* JADX DEBUG: Method merged with bridge method: setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(@InterfaceC6490 CharSequence[] charSequenceArr, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(@InterfaceC6490 CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    /* JADX DEBUG: Method merged with bridge method: setMultiChoiceItems(I[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@InterfaceC3397 int i, @InterfaceC6490 boolean[] zArr, @InterfaceC6490 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(@InterfaceC6490 CharSequence charSequence, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(@InterfaceC6490 CharSequence charSequence, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(@InterfaceC6490 CharSequence charSequence, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(@InterfaceC6490 CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    /* JADX DEBUG: Method merged with bridge method: setView(Landroid/view/View;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(@InterfaceC6490 View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    /* JADX DEBUG: Method merged with bridge method: setMultiChoiceItems([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@InterfaceC6490 CharSequence[] charSequenceArr, @InterfaceC6490 boolean[] zArr, @InterfaceC6490 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setSingleChoiceItems(IILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@InterfaceC3397 int i, int i2, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i, i2, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setMultiChoiceItems(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@InterfaceC6490 Cursor cursor, @InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6490 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setSingleChoiceItems(Landroid/database/Cursor;ILjava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@InterfaceC6490 Cursor cursor, int i, @InterfaceC6391 String str, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@InterfaceC6490 CharSequence[] charSequenceArr, int i, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    /* JADX DEBUG: Method merged with bridge method: setSingleChoiceItems(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ; */
    @Override // androidx.appcompat.app.DialogInterfaceC8650.C1585
    @InterfaceC6391
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@InterfaceC6490 ListAdapter listAdapter, int i, @InterfaceC6490 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }
}
