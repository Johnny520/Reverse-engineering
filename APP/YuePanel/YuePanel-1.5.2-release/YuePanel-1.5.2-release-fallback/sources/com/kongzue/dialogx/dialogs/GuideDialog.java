package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class GuideDialog extends com.kongzue.dialogx.dialogs.CustomDialog {
    int[] baseViewLocCache;
    protected int[] baseViewLocationCoordinateCompensation;
    protected java.lang.Integer maskColor;
    protected com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.GuideDialog> onStageLightPathClickListener;
    protected float stageLightFilletRadius;
    android.graphics.Paint stageLightPaint;
    android.view.View stageLightPathStub;
    protected com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE stageLightType;
    protected android.graphics.drawable.Drawable tipImage;



    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.GuideDialog$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE = null;

        static {
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE[] r0 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.GuideDialog.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE = r0
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.CIRCLE_OUTSIDE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.GuideDialog.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.CIRCLE_INSIDE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.GuideDialog.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.RECTANGLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.dialogs.GuideDialog.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.SQUARE_INSIDE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.kongzue.dialogx.dialogs.GuideDialog.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.SQUARE_OUTSIDE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public enum STAGE_LIGHT_TYPE extends java.lang.Enum<com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE> {
        private static final /* synthetic */ com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE[] $VALUES = null;
        public static final com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE CIRCLE_INSIDE = null;
        public static final com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE CIRCLE_OUTSIDE = null;
        public static final com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE RECTANGLE = null;
        public static final com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE SQUARE_INSIDE = null;
        public static final com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE SQUARE_OUTSIDE = null;

        static {
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r0 = new com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE
                java.lang.String r1 = "RECTANGLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.RECTANGLE = r0
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = new com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE
                java.lang.String r2 = "SQUARE_OUTSIDE"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.SQUARE_OUTSIDE = r1
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r2 = new com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE
                java.lang.String r3 = "SQUARE_INSIDE"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.SQUARE_INSIDE = r2
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r3 = new com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE
                java.lang.String r4 = "CIRCLE_OUTSIDE"
                r5 = 3
                r3.<init>(r4, r5)
                com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.CIRCLE_OUTSIDE = r3
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r4 = new com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE
                java.lang.String r5 = "CIRCLE_INSIDE"
                r6 = 4
                r4.<init>(r5, r6)
                com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.CIRCLE_INSIDE = r4
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE[] r0 = new com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE[]{r0, r1, r2, r3, r4}
                com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.$VALUES = r0
                return
        }

        STAGE_LIGHT_TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE> r0 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r1 = (com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE) r1
                return r1
        }

        public static com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE[] values() {
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE[] r0 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE[] r0 = (com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE[]) r0
                return r0
        }
    }

    public GuideDialog() {
            r1 = this;
            r1.<init>()
            com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r0 = com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE.CIRCLE_OUTSIDE
            r1.stageLightType = r0
            r0 = 0
            r1.maskColor = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1.baseViewLocationCoordinateCompensation = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_alpha_enter
            r1.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            r1.exitAnimResId = r0
            r0 = 81
            r1.alignViewGravity = r0
            return
    }

    public GuideDialog(int r2) {
            r1 = this;
            r1.<init>()
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.tipImage = r2
            return
    }

    public GuideDialog(int r2, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r3) {
            r1 = this;
            r1.<init>()
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.tipImage = r2
            r1.align = r3
            return
    }

    public GuideDialog(android.graphics.Bitmap r3) {
            r2 = this;
            r2.<init>()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.tipImage = r0
            return
    }

    public GuideDialog(android.graphics.Bitmap r3, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r4) {
            r2 = this;
            r2.<init>()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.tipImage = r0
            r2.align = r4
            return
    }

    public GuideDialog(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>()
            r0.tipImage = r1
            return
    }

    public GuideDialog(android.graphics.drawable.Drawable r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            r0 = this;
            r0.<init>()
            r0.tipImage = r1
            r0.align = r2
            return
    }

    public GuideDialog(android.view.View r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            android.content.res.Resources r1 = r0.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.tipImage = r1
            return
    }

    public GuideDialog(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.alignViewGravity = r3
            android.content.res.Resources r1 = r0.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.tipImage = r1
            return
    }

    public GuideDialog(android.view.View r2, android.graphics.Bitmap r3) {
            r1 = this;
            r1.<init>()
            r1.baseView(r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r1.getResources()
            r2.<init>(r0, r3)
            r1.tipImage = r2
            return
    }

    public GuideDialog(android.view.View r1, android.graphics.Bitmap r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.alignViewGravity = r3
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r0.getResources()
            r1.<init>(r3, r2)
            r0.tipImage = r1
            return
    }

    public GuideDialog(android.view.View r1, android.graphics.drawable.Drawable r2) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.tipImage = r2
            return
    }

    public GuideDialog(android.view.View r1, android.graphics.drawable.Drawable r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.alignViewGravity = r3
            r0.tipImage = r2
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.stageLightType = r2
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.stageLightType = r2
            android.content.res.Resources r1 = r0.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r0.tipImage = r1
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            android.content.res.Resources r1 = r0.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r0.tipImage = r1
            r0.stageLightType = r2
            r0.alignViewGravity = r4
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.Bitmap r3) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.stageLightType = r2
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r0.getResources()
            r1.<init>(r2, r3)
            r0.tipImage = r1
            return
    }

    public GuideDialog(android.view.View r2, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r3, android.graphics.Bitmap r4, int r5) {
            r1 = this;
            r1.<init>()
            r1.baseView(r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r1.getResources()
            r2.<init>(r0, r4)
            r1.tipImage = r2
            r1.stageLightType = r3
            r1.alignViewGravity = r5
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.drawable.Drawable r3) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.stageLightType = r2
            r0.tipImage = r3
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.drawable.Drawable r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.tipImage = r3
            r0.stageLightType = r2
            r0.alignViewGravity = r4
            return
    }

    public GuideDialog(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.baseView(r1)
            r0.stageLightType = r2
            r0.onBindView = r3
            r0.alignViewGravity = r4
            return
    }

    public GuideDialog(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.<init>()
            r0.onBindView = r1
            return
    }

    public GuideDialog(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            r0 = this;
            r0.<init>()
            r0.onBindView = r1
            r0.align = r2
            return
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog build() {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>()
            return r0
    }

    private android.graphics.Paint getStageLightPaint() {
            r2 = this;
            android.graphics.Paint r0 = r2.stageLightPaint
            if (r0 != 0) goto L1d
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.stageLightPaint = r0
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.stageLightPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.stageLightPaint
            r1 = 1
            r0.setAntiAlias(r1)
        L1d:
            android.graphics.Paint r0 = r2.stageLightPaint
            return r0
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(int r1) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(int r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            r0.align = r2
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.graphics.Bitmap r1) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.graphics.Bitmap r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            r0.align = r2
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.graphics.drawable.Drawable r1) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.graphics.drawable.Drawable r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, int r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, int r2, int r3) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, android.graphics.Bitmap r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, android.graphics.Bitmap r2, int r3) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, android.graphics.drawable.Drawable r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, android.graphics.drawable.Drawable r2, int r3) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, int r3) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, int r3, int r4) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3, r4)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.Bitmap r3) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.Bitmap r3, int r4) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3, r4)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.drawable.Drawable r3) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, android.graphics.drawable.Drawable r3, int r4) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3, r4)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(android.view.View r1, com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r3, int r4) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1, r2, r3, r4)
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.GuideDialog show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            com.kongzue.dialogx.dialogs.GuideDialog r0 = new com.kongzue.dialogx.dialogs.GuideDialog
            r0.<init>(r1)
            r0.align = r2
            r0.show()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog baseView(android.view.View r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.baseView(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog baseView(android.view.View r1) {
            r0 = this;
            super.baseView(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.bindDismissWithLifecycleOwner(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog bringToFront() {
            r1 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r0 = r1.bringToFront()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            r0.dismiss()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog cleanAction(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.cleanAction(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog cleanAllAction() {
            r1 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r0 = r1.cleanAllAction()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public java.lang.String dialogKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r2.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int[] getBaseViewLocationCoordinateCompensation() {
            r1 = this;
            int[] r0 = r1.baseViewLocationCoordinateCompensation
            return r0
    }

    public int getBaseViewLocationCoordinateCompensationBottom() {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 3
            r0 = r0[r1]
            return r0
    }

    public int getBaseViewLocationCoordinateCompensationLeft() {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getBaseViewLocationCoordinateCompensationRight() {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    public int getBaseViewLocationCoordinateCompensationTop() {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.GuideDialog> getOnStageLightPathClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.GuideDialog> r0 = r1.onStageLightPathClickListener
            return r0
    }

    public float getStageLightFilletRadius() {
            r1 = this;
            float r0 = r1.stageLightFilletRadius
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE getStageLightType() {
            r1 = this;
            com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r0 = r1.stageLightType
            return r0
    }

    public android.graphics.drawable.Drawable getTipImage() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.tipImage
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void onDialogRefreshUI() {
            r3 = this;
            super.onDialogRefreshUI()
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r3.onBindView
            if (r0 != 0) goto L5e
            android.graphics.drawable.Drawable r0 = r3.tipImage
            if (r0 == 0) goto L5e
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            r1 = 0
            r0.setFocusable(r1)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            r0.setFocusableInTouchMode(r1)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            r2 = 0
            r0.setOnClickListener(r2)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            r0.setClickable(r1)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.app.Activity r1 = r3.getOwnActivity()
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = r3.tipImage
            r0.setImageDrawable(r1)
            r1 = 1
            r0.setAdjustViewBounds(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            com.kongzue.dialogx.dialogs.GuideDialog$1 r1 = new com.kongzue.dialogx.dialogs.GuideDialog$1
            r1.<init>(r3, r0)
            r3.onBindView = r1
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            com.kongzue.dialogx.dialogs.CustomDialog r2 = r3.me
            r1.bindParent(r0, r2)
        L5e:
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r0 = r3.getOnStageLightPathClickListener()
            if (r0 == 0) goto L89
            android.view.View r0 = r3.baseView()
            if (r0 == 0) goto L89
            android.view.View r0 = new android.view.View
            android.app.Activity r1 = r3.getOwnActivity()
            r0.<init>(r1)
            r3.stageLightPathStub = r0
            com.kongzue.dialogx.dialogs.GuideDialog$2 r1 = new com.kongzue.dialogx.dialogs.GuideDialog$2
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r0.boxRoot
            android.view.View r1 = r3.stageLightPathStub
            r0.addView(r1)
            goto La2
        L89:
            android.view.View r0 = r3.stageLightPathStub
            if (r0 == 0) goto La2
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto La2
            android.view.View r0 = r3.stageLightPathStub
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.stageLightPathStub
            r0.removeView(r1)
        La2:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void onDialogShow() {
            r1 = this;
            super.onDialogShow()
            android.view.View r0 = r1.baseView()
            if (r0 != 0) goto L1b
            java.lang.Integer r0 = r1.maskColor
            if (r0 != 0) goto L14
            int r0 = com.kongzue.dialogx.R.color.black50
            int r0 = r1.getColor(r0)
            goto L18
        L14:
            int r0 = r0.intValue()
        L18:
            super.setMaskColor(r0)
        L1b:
            return
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.onDismiss(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public void onGetBaseViewLoc(int[] r15) {
            r14 = this;
            int[] r0 = r14.baseViewLocCache
            boolean r0 = java.util.Arrays.equals(r15, r0)
            if (r0 == 0) goto L9
            return
        L9:
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r14.getDialogImpl()
            if (r0 != 0) goto L10
            return
        L10:
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r0.boxRoot
            int r0 = r0.getWidth()
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r1 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.boxRoot
            int r1 = r1.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r2 = 0
            r3 = r15[r2]
            int[] r4 = r14.baseViewLocationCoordinateCompensation
            r2 = r4[r2]
            int r3 = r3 + r2
            r2 = 1
            r5 = r15[r2]
            r6 = r4[r2]
            int r5 = r5 + r6
            r6 = 2
            r7 = r15[r6]
            r8 = r4[r6]
            int r7 = r7 + r8
            r8 = 3
            r9 = r15[r8]
            r4 = r4[r8]
            int r9 = r9 + r4
            int r4 = r7 / 2
            int r10 = r9 / 2
            android.view.View r11 = r14.stageLightPathStub
            if (r11 == 0) goto L89
            float r11 = r11.getX()
            float r12 = (float) r3
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L65
            android.view.View r11 = r14.stageLightPathStub
            float r11 = r11.getY()
            float r13 = (float) r5
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L89
        L65:
            android.view.View r11 = r14.stageLightPathStub
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            if (r11 != 0) goto L75
            android.widget.RelativeLayout$LayoutParams r11 = new android.widget.RelativeLayout$LayoutParams
            r11.<init>(r7, r9)
            goto L79
        L75:
            r11.width = r7
            r11.height = r9
        L79:
            android.view.View r13 = r14.stageLightPathStub
            r13.setLayoutParams(r11)
            android.view.View r11 = r14.stageLightPathStub
            r11.setX(r12)
            android.view.View r11 = r14.stageLightPathStub
            float r12 = (float) r5
            r11.setY(r12)
        L89:
            int[] r11 = com.kongzue.dialogx.dialogs.GuideDialog.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE
            com.kongzue.dialogx.dialogs.GuideDialog$STAGE_LIGHT_TYPE r12 = r14.stageLightType
            int r12 = r12.ordinal()
            r11 = r11[r12]
            r12 = 4
            if (r11 == r2) goto L106
            if (r11 == r6) goto Lf4
            if (r11 == r8) goto Ldf
            if (r11 == r12) goto Lc0
            r2 = 5
            if (r11 == r2) goto La1
            goto L11d
        La1:
            int r2 = java.lang.Math.max(r7, r9)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r3 = r3 + r4
            int r4 = r2 / 2
            int r3 = r3 - r4
            float r7 = (float) r3
            int r5 = r5 + r10
            int r5 = r5 - r4
            float r4 = (float) r5
            int r3 = r3 + r2
            float r3 = (float) r3
            int r5 = r5 + r2
            float r2 = (float) r5
            r6.<init>(r7, r4, r3, r2)
            float r2 = r14.stageLightFilletRadius
            android.graphics.Paint r3 = r14.getStageLightPaint()
            r1.drawRoundRect(r6, r2, r2, r3)
            goto L11d
        Lc0:
            int r2 = java.lang.Math.min(r7, r9)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r3 = r3 + r4
            int r4 = r2 / 2
            int r3 = r3 - r4
            float r7 = (float) r3
            int r5 = r5 + r10
            int r5 = r5 - r4
            float r4 = (float) r5
            int r3 = r3 + r2
            float r3 = (float) r3
            int r5 = r5 + r2
            float r2 = (float) r5
            r6.<init>(r7, r4, r3, r2)
            float r2 = r14.stageLightFilletRadius
            android.graphics.Paint r3 = r14.getStageLightPaint()
            r1.drawRoundRect(r6, r2, r2, r3)
            goto L11d
        Ldf:
            android.graphics.RectF r2 = new android.graphics.RectF
            float r4 = (float) r3
            float r6 = (float) r5
            int r3 = r3 + r7
            float r3 = (float) r3
            int r5 = r5 + r9
            float r5 = (float) r5
            r2.<init>(r4, r6, r3, r5)
            float r3 = r14.stageLightFilletRadius
            android.graphics.Paint r4 = r14.getStageLightPaint()
            r1.drawRoundRect(r2, r3, r3, r4)
            goto L11d
        Lf4:
            int r2 = java.lang.Math.min(r7, r9)
            int r2 = r2 / r6
            int r3 = r3 + r4
            float r3 = (float) r3
            int r5 = r5 + r10
            float r4 = (float) r5
            float r2 = (float) r2
            android.graphics.Paint r5 = r14.getStageLightPaint()
            r1.drawCircle(r3, r4, r2, r5)
            goto L11d
        L106:
            int r2 = r4 * r4
            int r6 = r10 * r10
            int r2 = r2 + r6
            double r6 = (double) r2
            double r6 = java.lang.Math.sqrt(r6)
            int r2 = (int) r6
            int r3 = r3 + r4
            float r3 = (float) r3
            int r5 = r5 + r10
            float r4 = (float) r5
            float r2 = (float) r2
            android.graphics.Paint r5 = r14.getStageLightPaint()
            r1.drawCircle(r3, r4, r2, r5)
        L11d:
            android.graphics.Paint r2 = r14.stageLightPaint
            r3 = 0
            r2.setXfermode(r3)
            java.lang.Integer r2 = r14.maskColor
            if (r2 != 0) goto L12e
            int r2 = com.kongzue.dialogx.R.color.black50
            int r2 = r14.getColor(r2)
            goto L132
        L12e:
            int r2 = r2.intValue()
        L132:
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_OUT
            r1.drawColor(r2, r3)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r14.getResources()
            r1.<init>(r2, r0)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r0.boxRoot
            r0.setBackground(r1)
            int[] r15 = java.util.Arrays.copyOf(r15, r12)
            r14.baseViewLocCache = r15
            return
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.onShow(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onShowRunnable = r1
            boolean r1 = r0.isShow()
            if (r1 == 0) goto Lf
            com.kongzue.dialogx.interfaces.DialogXRunnable r1 = r0.onShowRunnable
            if (r1 == 0) goto Lf
            r1.run(r0)
        Lf:
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r0 = r1.removeCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setActionRunnable(int r1, com.kongzue.dialogx.interfaces.DialogXRunnable r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setActionRunnable(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.CustomDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setAlign(com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAlign(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setAlign(com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r1) {
            r0 = this;
            r0.align = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseViewGravity(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAlignBaseViewGravity(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseViewGravity(android.view.View r1, int r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAlignBaseViewGravity(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseViewGravity(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAlignBaseViewGravity(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setAlignBaseViewGravity(int r2) {
            r1 = this;
            r1.alignViewGravity = r2
            android.view.View r2 = r1.baseView()
            if (r2 == 0) goto L16
            r2 = 4
            int[] r2 = new int[r2]
            r1.baseViewLoc = r2
            android.view.View r2 = r1.baseView()
            int[] r0 = r1.baseViewLoc
            r2.getLocationInWindow(r0)
        L16:
            r2 = 1
            r1.setFullScreen(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setAlignBaseViewGravity(android.view.View r2) {
            r1 = this;
            r1.baseView(r2)
            r0 = 4
            int[] r0 = new int[r0]
            r1.baseViewLoc = r0
            r2.getLocationInWindow(r0)
            r2 = 1
            r1.setFullScreen(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setAlignBaseViewGravity(android.view.View r1, int r2) {
            r0 = this;
            r0.baseView(r1)
            r0.alignViewGravity = r2
            r2 = 4
            int[] r2 = new int[r2]
            r0.baseViewLoc = r2
            r1.getLocationInWindow(r2)
            r1 = 1
            r0.setFullScreen(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setAlignBaseViewGravity(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            int[] r3 = new int[]{r3, r4, r5, r6}
            r0.marginRelativeBaseView = r3
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAlignBaseViewGravity(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setAnimResId(int r1, int r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAnimResId(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setAnimResId(int r1, int r2) {
            r0 = this;
            r0.enterAnimResId = r1
            r0.exitAnimResId = r2
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setAutoUnsafePlacePadding(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setAutoUnsafePlacePadding(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setAutoUnsafePlacePadding(boolean r1) {
            r0 = this;
            super.setAutoUnsafePlacePadding(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensation(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.baseViewLocationCoordinateCompensation = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensation(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.baseViewLocationCoordinateCompensation = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensation(int[] r1) {
            r0 = this;
            r0.baseViewLocationCoordinateCompensation = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensationBottom(int r3) {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 3
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensationLeft(int r3) {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 0
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensationRight(int r3) {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 2
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewLocationCoordinateCompensationTop(int r3) {
            r2 = this;
            int[] r0 = r2.baseViewLocationCoordinateCompensation
            r1 = 1
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBaseViewMargin(r1, r2, r3, r4)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMargin(int[] r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBaseViewMargin(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.marginRelativeBaseView = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewMargin(int[] r1) {
            r0 = this;
            r0.marginRelativeBaseView = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginBottom(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBaseViewMarginBottom(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewMarginBottom(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 3
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginLeft(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBaseViewMarginLeft(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewMarginLeft(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 0
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginRight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBaseViewMarginRight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewMarginRight(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 2
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginTop(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBaseViewMarginTop(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBaseViewMarginTop(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 1
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setBkgInterceptTouch(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setCancelable(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setCancelable(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setCancelable(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            goto L7
        L5:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.FALSE
        L7:
            r0.privateCancelable = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setCustomDialogLayoutResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setCustomDialogLayoutResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setCustomDialogLayoutResId(int r1, boolean r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setCustomDialogLayoutResId(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setCustomView(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setData(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.data = r0
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setDialogImplMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setDialogLifecycleCallback(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.CustomDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.CustomDialog r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setDialogXAnimImpl(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setEnterAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setEnterAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setEnterAnimResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setEnterAnimResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setEnterAnimResId(int r1) {
            r0 = this;
            r0.enterAnimResId = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setExitAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setExitAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setExitAnimResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setExitAnimResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setExitAnimResId(int r1) {
            r0 = this;
            r0.exitAnimResId = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setFullScreen(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setFullScreen(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setFullScreen(boolean r1) {
            r0 = this;
            super.setFullScreen(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setHeight(int r1) {
            r0 = this;
            r0.height = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setMaskColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setOnBackPressedListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setOnBackgroundMaskClickListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setOnStageLightPathClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.GuideDialog> r1) {
            r0 = this;
            r0.onStageLightPathClickListener = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setRootPadding(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setRootPadding(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setRootPadding(r1, r2, r3, r4)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setStageLightFilletRadius(float r1) {
            r0 = this;
            r0.stageLightFilletRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setStageLightType(com.kongzue.dialogx.dialogs.GuideDialog.STAGE_LIGHT_TYPE r1) {
            r0 = this;
            r0.stageLightType = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setStyle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setTheme(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setThisOrderIndex(int r2) {
            r1 = this;
            r1.thisOrderIndex = r2
            android.view.View r0 = r1.getDialogView()
            if (r0 == 0) goto L10
            android.view.View r0 = r1.getDialogView()
            float r2 = (float) r2
            r0.setTranslationZ(r2)
        L10:
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setTipImage(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.tipImage = r2
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setTipImage(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.tipImage = r0
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.GuideDialog setTipImage(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.tipImage = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog setWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.setWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog setWidth(int r1) {
            r0 = this;
            r0.width = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r0 = r1.show()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog show(android.app.Activity r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r1 = r0.show(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.GuideDialog show() {
            r0 = this;
            super.show()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public com.kongzue.dialogx.dialogs.GuideDialog show(android.app.Activity r1) {
            r0 = this;
            super.show(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.GuideDialog r0 = r1.show()
            return r0
    }
}
