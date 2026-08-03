package com.google.android.material.dialog;

/* JADX INFO: loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends androidx.appcompat.app.DialogInterfaceC7281.C7282 {

    @Yue.InterfaceC0642
    private static final int DEF_STYLE_ATTR = 0;

    @Yue.InterfaceC6018
    private static final int DEF_STYLE_RES = 0;

    @Yue.InterfaceC0642
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = 0;

    @Yue.InterfaceC4544
    private android.graphics.drawable.Drawable background;

    @Yue.InterfaceC4410
    private final android.graphics.Rect backgroundInsets;

    static {
            int r0 = com.google.android.material.R.attr.alertDialogStyle
            com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR = r0
            int r0 = com.google.android.material.R.style.MaterialAlertDialog_MaterialComponents
            com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.materialAlertDialogTheme
            com.google.android.material.dialog.MaterialAlertDialogBuilder.MATERIAL_ALERT_DIALOG_THEME_OVERLAY = r0
            return
    }

    public MaterialAlertDialogBuilder(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialAlertDialogBuilder(@Yue.InterfaceC4410 android.content.Context r7, int r8) {
            r6 = this;
            android.content.Context r0 = createMaterialAlertDialogThemedContext(r7)
            int r7 = getOverridingThemeResId(r7, r8)
            r6.<init>(r0, r7)
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources$Theme r8 = r7.getTheme()
            int r0 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR
            int r1 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES
            android.graphics.Rect r2 = com.google.android.material.dialog.MaterialDialogs.getDialogBackgroundInsets(r7, r0, r1)
            r6.backgroundInsets = r2
            int r2 = com.google.android.material.R.attr.colorSurface
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            int r2 = com.google.android.material.color.MaterialColors.getColor(r7, r2, r3)
            int[] r3 = com.google.android.material.R.styleable.MaterialAlertDialog
            r4 = 0
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r4, r3, r0, r1)
            int r5 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundTint
            int r2 = r3.getColor(r5, r2)
            r3.recycle()
            com.google.android.material.shape.MaterialShapeDrawable r3 = new com.google.android.material.shape.MaterialShapeDrawable
            r3.<init>(r7, r4, r0, r1)
            r3.initializeElevationOverlay(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r2)
            r3.setFillColor(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r7 < r0) goto L79
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r1 = 1
            r8.resolveAttribute(r0, r7, r1)
            android.content.Context r8 = r6.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r7.getDimension(r8)
            int r7 = r7.type
            r0 = 5
            if (r7 != r0) goto L79
            r7 = 0
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto L79
            r3.setCornerSize(r8)
        L79:
            r6.background = r3
            return
    }

    private static android.content.Context createMaterialAlertDialogThemedContext(@Yue.InterfaceC4410 android.content.Context r4) {
            int r0 = getMaterialAlertDialogThemeOverlay(r4)
            int r1 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR
            int r2 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES
            r3 = 0
            android.content.Context r4 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r4, r3, r1, r2)
            if (r0 != 0) goto L10
            return r4
        L10:
            Yue.ۥ۟ۧۤۡ r1 = new Yue.ۥ۟ۧۤۡ
            r1.<init>(r4, r0)
            return r1
    }

    private static int getMaterialAlertDialogThemeOverlay(@Yue.InterfaceC4410 android.content.Context r1) {
            int r0 = com.google.android.material.dialog.MaterialAlertDialogBuilder.MATERIAL_ALERT_DIALOG_THEME_OVERLAY
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolve(r1, r0)
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            int r1 = r1.data
            return r1
    }

    private static int getOverridingThemeResId(@Yue.InterfaceC4410 android.content.Context r0, int r1) {
            if (r1 != 0) goto L6
            int r1 = getMaterialAlertDialogThemeOverlay(r0)
        L6:
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    public androidx.appcompat.app.DialogInterfaceC7281 create() {
            r5 = this;
            androidx.appcompat.app.ۥ۟۟ r0 = super.create()
            android.view.Window r1 = r0.getWindow()
            android.view.View r2 = r1.getDecorView()
            android.graphics.drawable.Drawable r3 = r5.background
            boolean r4 = r3 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r4 == 0) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable r3 = (com.google.android.material.shape.MaterialShapeDrawable) r3
            float r4 = Yue.C6794.m26131(r2)
            r3.setElevation(r4)
        L1b:
            android.graphics.drawable.Drawable r3 = r5.background
            android.graphics.Rect r4 = r5.backgroundInsets
            android.graphics.drawable.InsetDrawable r3 = com.google.android.material.dialog.MaterialDialogs.insetDrawable(r3, r4)
            r1.setBackgroundDrawable(r3)
            com.google.android.material.dialog.InsetDialogOnTouchListener r1 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.graphics.Rect r3 = r5.backgroundInsets
            r1.<init>(r0, r3)
            r2.setOnTouchListener(r1)
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.background
            return r0
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setAdapter(@Yue.InterfaceC4544 android.widget.ListAdapter r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setAdapter(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setAdapter(@Yue.InterfaceC4544 android.widget.ListAdapter r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setAdapter(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackground(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.background = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetBottom(@Yue.InterfaceC4992 int r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.backgroundInsets
            r0.bottom = r2
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetEnd(@Yue.InterfaceC4992 int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L18
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.left = r3
            goto L1c
        L18:
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.right = r3
        L1c:
            return r2
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetStart(@Yue.InterfaceC4992 int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L18
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.right = r3
            goto L1c
        L18:
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.left = r3
        L1c:
            return r2
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetTop(@Yue.InterfaceC4992 int r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.backgroundInsets
            r0.top = r2
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setCancelable(boolean r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setCancelable(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setCancelable(boolean r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setCancelable(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setCursor(@Yue.InterfaceC4544 android.database.Cursor r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2, @Yue.InterfaceC4410 java.lang.String r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setCursor(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setCursor(@Yue.InterfaceC4544 android.database.Cursor r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2, @Yue.InterfaceC4410 java.lang.String r3) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setCursor(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setCustomTitle(@Yue.InterfaceC4544 android.view.View r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setCustomTitle(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setCustomTitle(@Yue.InterfaceC4544 android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setCustomTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setIcon(@Yue.InterfaceC2004 int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setIcon(@Yue.InterfaceC2004 int r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setIconAttribute(@Yue.InterfaceC0642 int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setIconAttribute(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setIconAttribute(@Yue.InterfaceC0642 int r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setIconAttribute(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setItems(@Yue.InterfaceC0577 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setItems(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setItems(@Yue.InterfaceC4544 java.lang.CharSequence[] r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setItems(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setItems(@Yue.InterfaceC0577 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setItems(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setItems(@Yue.InterfaceC4544 java.lang.CharSequence[] r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setItems(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setMessage(@Yue.InterfaceC5971 int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMessage(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setMessage(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMessage(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMessage(@Yue.InterfaceC5971 int r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setMessage(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMessage(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setMessage(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setMultiChoiceItems(@Yue.InterfaceC0577 int r1, @Yue.InterfaceC4544 boolean[] r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMultiChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setMultiChoiceItems(@Yue.InterfaceC4544 android.database.Cursor r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 android.content.DialogInterface.OnMultiChoiceClickListener r4) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMultiChoiceItems(r1, r2, r3, r4)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setMultiChoiceItems(@Yue.InterfaceC4544 java.lang.CharSequence[] r1, @Yue.InterfaceC4544 boolean[] r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMultiChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMultiChoiceItems(@Yue.InterfaceC0577 int r1, @Yue.InterfaceC4544 boolean[] r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setMultiChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMultiChoiceItems(@Yue.InterfaceC4544 android.database.Cursor r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 android.content.DialogInterface.OnMultiChoiceClickListener r4) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setMultiChoiceItems(r1, r2, r3, r4)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMultiChoiceItems(@Yue.InterfaceC4544 java.lang.CharSequence[] r1, @Yue.InterfaceC4544 boolean[] r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setMultiChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setNegativeButton(@Yue.InterfaceC5971 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNegativeButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setNegativeButton(@Yue.InterfaceC4544 java.lang.CharSequence r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNegativeButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButton(@Yue.InterfaceC5971 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setNegativeButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButton(@Yue.InterfaceC4544 java.lang.CharSequence r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setNegativeButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setNegativeButtonIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNegativeButtonIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButtonIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setNegativeButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setNeutralButton(@Yue.InterfaceC5971 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNeutralButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setNeutralButton(@Yue.InterfaceC4544 java.lang.CharSequence r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNeutralButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButton(@Yue.InterfaceC5971 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setNeutralButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButton(@Yue.InterfaceC4544 java.lang.CharSequence r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setNeutralButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setNeutralButtonIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNeutralButtonIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButtonIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setNeutralButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setOnCancelListener(@Yue.InterfaceC4544 android.content.DialogInterface.OnCancelListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnCancelListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnCancelListener(@Yue.InterfaceC4544 android.content.DialogInterface.OnCancelListener r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setOnCancelListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setOnDismissListener(@Yue.InterfaceC4544 android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnDismissListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnDismissListener(@Yue.InterfaceC4544 android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setOnDismissListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setOnItemSelectedListener(@Yue.InterfaceC4544 android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnItemSelectedListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnItemSelectedListener(@Yue.InterfaceC4544 android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setOnItemSelectedListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setOnKeyListener(@Yue.InterfaceC4544 android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnKeyListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnKeyListener(@Yue.InterfaceC4544 android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setOnKeyListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setPositiveButton(@Yue.InterfaceC5971 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setPositiveButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setPositiveButton(@Yue.InterfaceC4544 java.lang.CharSequence r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setPositiveButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButton(@Yue.InterfaceC5971 int r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setPositiveButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButton(@Yue.InterfaceC4544 java.lang.CharSequence r1, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setPositiveButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setPositiveButtonIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setPositiveButtonIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButtonIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setPositiveButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setSingleChoiceItems(@Yue.InterfaceC0577 int r1, int r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setSingleChoiceItems(@Yue.InterfaceC4544 android.database.Cursor r1, int r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r4) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3, r4)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setSingleChoiceItems(@Yue.InterfaceC4544 android.widget.ListAdapter r1, int r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setSingleChoiceItems(@Yue.InterfaceC4544 java.lang.CharSequence[] r1, int r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(@Yue.InterfaceC0577 int r1, int r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(@Yue.InterfaceC4544 android.database.Cursor r1, int r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r4) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setSingleChoiceItems(r1, r2, r3, r4)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(@Yue.InterfaceC4544 android.widget.ListAdapter r1, int r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(@Yue.InterfaceC4544 java.lang.CharSequence[] r1, int r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setTitle(@Yue.InterfaceC5971 int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setTitle(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setTitle(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setTitle(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setTitle(@Yue.InterfaceC5971 int r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setTitle(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setView(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setView(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.DialogInterfaceC7281.C7282 setView(@Yue.InterfaceC4544 android.view.View r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setView(r1)
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setView(int r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setView(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7281.C7282
    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setView(@Yue.InterfaceC4544 android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.ۥ۟۟$ۥ r1 = super.setView(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }
}
