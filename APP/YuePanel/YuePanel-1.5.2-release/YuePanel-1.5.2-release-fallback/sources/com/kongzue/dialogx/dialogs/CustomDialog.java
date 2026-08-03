package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class CustomDialog extends com.kongzue.dialogx.interfaces.BaseDialog {
    public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterAnimRes = 0;
    public static int overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static int overrideExitDuration = -1;
    protected com.kongzue.dialogx.dialogs.CustomDialog.ALIGN align;
    protected int alignViewGravity;
    private android.view.ViewTreeObserver.OnPreDrawListener baseViewDrawListener;
    protected int[] baseViewLoc;
    protected java.lang.ref.WeakReference<android.view.View> baseViewWeakReference;
    protected boolean bkgInterceptTouch;
    protected com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.CustomDialog> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> dialogXAnimImpl;
    protected int enterAnimResId;
    protected int exitAnimResId;
    protected int height;
    protected boolean hideWithExitAnim;
    protected int[] marginRelativeBaseView;
    protected int maskColor;
    protected com.kongzue.dialogx.dialogs.CustomDialog me;
    protected com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.CustomDialog> onBackPressedListener;
    protected com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.CustomDialog> onBackgroundMaskClickListener;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> onBindView;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN privateCancelable;
    private android.view.ViewTreeObserver viewTreeObserver;
    protected int width;





    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.CustomDialog$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN = null;

        static {
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN = r0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP_LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT_TOP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L3e
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP_RIGHT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L49
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT_TOP     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L54
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM_LEFT     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L60
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L6c
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L78
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM_CENTER     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L84
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM_RIGHT     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L90
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> L9c
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.CENTER     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> La8
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT_CENTER     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN     // Catch: java.lang.NoSuchFieldError -> Lcc
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT_CENTER     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    public enum ALIGN extends java.lang.Enum<com.kongzue.dialogx.dialogs.CustomDialog.ALIGN> {
        private static final /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog.ALIGN[] $VALUES = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN BOTTOM = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN BOTTOM_CENTER = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN BOTTOM_LEFT = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN BOTTOM_RIGHT = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN CENTER = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN LEFT = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN LEFT_BOTTOM = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN LEFT_CENTER = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN LEFT_TOP = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN RIGHT = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN RIGHT_BOTTOM = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN RIGHT_CENTER = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN RIGHT_TOP = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN TOP = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN TOP_CENTER = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN TOP_LEFT = null;
        public static final com.kongzue.dialogx.dialogs.CustomDialog.ALIGN TOP_RIGHT = null;

        static {
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r0 = r1
                java.lang.String r2 = "CENTER"
                r3 = 0
                r1.<init>(r2, r3)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.CENTER = r1
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r2 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r1 = r2
                java.lang.String r3 = "TOP"
                r4 = 1
                r2.<init>(r3, r4)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP = r2
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r3 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r2 = r3
                java.lang.String r4 = "TOP_CENTER"
                r5 = 2
                r3.<init>(r4, r5)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP_CENTER = r3
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r4 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r3 = r4
                java.lang.String r5 = "TOP_LEFT"
                r6 = 3
                r4.<init>(r5, r6)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP_LEFT = r4
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r5 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r4 = r5
                java.lang.String r6 = "TOP_RIGHT"
                r7 = 4
                r5.<init>(r6, r7)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.TOP_RIGHT = r5
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r6 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r5 = r6
                java.lang.String r7 = "BOTTOM"
                r8 = 5
                r6.<init>(r7, r8)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM = r6
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r7 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r6 = r7
                java.lang.String r8 = "BOTTOM_CENTER"
                r9 = 6
                r7.<init>(r8, r9)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM_CENTER = r7
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r8 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r7 = r8
                java.lang.String r9 = "BOTTOM_LEFT"
                r10 = 7
                r8.<init>(r9, r10)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM_LEFT = r8
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r9 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r8 = r9
                java.lang.String r10 = "BOTTOM_RIGHT"
                r11 = 8
                r9.<init>(r10, r11)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.BOTTOM_RIGHT = r9
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r10 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r9 = r10
                java.lang.String r11 = "LEFT"
                r12 = 9
                r10.<init>(r11, r12)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT = r10
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r11 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r10 = r11
                java.lang.String r12 = "LEFT_CENTER"
                r13 = 10
                r11.<init>(r12, r13)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT_CENTER = r11
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r12 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r11 = r12
                java.lang.String r13 = "LEFT_TOP"
                r14 = 11
                r12.<init>(r13, r14)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT_TOP = r12
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r13 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r12 = r13
                java.lang.String r14 = "LEFT_BOTTOM"
                r15 = 12
                r13.<init>(r14, r15)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.LEFT_BOTTOM = r13
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r14 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r13 = r14
                java.lang.String r15 = "RIGHT"
                r17 = r0
                r0 = 13
                r14.<init>(r15, r0)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT = r14
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r0 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r14 = r0
                java.lang.String r15 = "RIGHT_CENTER"
                r18 = r1
                r1 = 14
                r0.<init>(r15, r1)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT_CENTER = r0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r0 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r15 = r0
                java.lang.String r1 = "RIGHT_TOP"
                r19 = r2
                r2 = 15
                r0.<init>(r1, r2)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT_TOP = r0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r0 = new com.kongzue.dialogx.dialogs.CustomDialog$ALIGN
                r16 = r0
                java.lang.String r1 = "RIGHT_BOTTOM"
                r2 = 16
                r0.<init>(r1, r2)
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.RIGHT_BOTTOM = r0
                r0 = r17
                r1 = r18
                r2 = r19
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN[] r0 = new com.kongzue.dialogx.dialogs.CustomDialog.ALIGN[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
                com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.$VALUES = r0
                return
        }

        ALIGN(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.dialogs.CustomDialog.ALIGN valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.dialogs.CustomDialog$ALIGN> r0 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = (com.kongzue.dialogx.dialogs.CustomDialog.ALIGN) r1
                return r1
        }

        public static com.kongzue.dialogx.dialogs.CustomDialog.ALIGN[] values() {
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN[] r0 = (com.kongzue.dialogx.dialogs.CustomDialog.ALIGN[]) r0
                return r0
        }
    }

    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        com.kongzue.dialogx.dialogs.CustomDialog.ALIGN alignCache;
        public com.kongzue.dialogx.util.views.MaxRelativeLayout boxCustom;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        boolean initSetCustomViewLayoutListener;
        final /* synthetic */ com.kongzue.dialogx.dialogs.CustomDialog this$0;









        public DialogImpl(com.kongzue.dialogx.dialogs.CustomDialog r2, android.view.View r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.initSetCustomViewLayoutListener = r0
                if (r3 != 0) goto Lb
                return
            Lb:
                com.kongzue.dialogx.dialogs.CustomDialog.access$000(r2, r3)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r3.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r1.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r3 = r3.findViewById(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r3
                r1.boxCustom = r3
                r1.init()
                r2.dialogImpl = r1
                r1.refreshView()
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r2) {
                r1 = this;
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r1.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                if (r2 == 0) goto Lf
                r0 = 0
                r2.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.CustomDialog r2 = r1.this$0
                boolean r2 = com.kongzue.dialogx.dialogs.CustomDialog.access$1800(r2)
                if (r2 != 0) goto L2b
                com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r1.boxCustom
                if (r2 == 0) goto L2b
                com.kongzue.dialogx.dialogs.CustomDialog r2 = r1.this$0
                r0 = 1
                com.kongzue.dialogx.dialogs.CustomDialog.access$1902(r2, r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r1.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$7 r0 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$7
                r0.<init>(r1)
                r2.post(r0)
            L2b:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$8 r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$8
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.boxCustom
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r6.boxCustom
                android.view.animation.Animation r7 = r7.getAnimation()
            L10:
                r0 = 0
                if (r7 == 0) goto L22
                long r2 = r7.getDuration()
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L1d
                goto L22
            L1d:
                long r2 = r7.getDuration()
                goto L24
            L22:
                r2 = 300(0x12c, double:1.48E-321)
            L24:
                int r7 = com.kongzue.dialogx.dialogs.CustomDialog.overrideEnterDuration
                if (r7 < 0) goto L29
                long r2 = (long) r7
            L29:
                com.kongzue.dialogx.dialogs.CustomDialog r7 = r6.this$0
                long r4 = com.kongzue.dialogx.dialogs.CustomDialog.access$2500(r7)
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L39
                com.kongzue.dialogx.dialogs.CustomDialog r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.CustomDialog.access$2600(r7)
            L39:
                return r2
        }

        public long getExitAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.boxCustom
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r6.boxCustom
                android.view.animation.Animation r7 = r7.getAnimation()
            L10:
                if (r7 == 0) goto L22
                long r0 = r7.getDuration()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L1d
                goto L22
            L1d:
                long r0 = r7.getDuration()
                goto L24
            L22:
                r0 = 300(0x12c, double:1.48E-321)
            L24:
                int r7 = com.kongzue.dialogx.dialogs.CustomDialog.overrideExitDuration
                if (r7 < 0) goto L29
                long r0 = (long) r7
            L29:
                com.kongzue.dialogx.dialogs.CustomDialog r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.CustomDialog.access$2300(r7)
                r4 = -1
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L3b
                com.kongzue.dialogx.dialogs.CustomDialog r7 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.CustomDialog.access$2400(r7)
            L3b:
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r3 = this;
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r3.this$0
                int[] r1 = r0.baseViewLoc
                if (r1 != 0) goto L3c
                android.view.View r0 = r0.baseView()
                if (r0 == 0) goto L3c
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r3.this$0
                r1 = 4
                int[] r1 = new int[r1]
                r0.baseViewLoc = r1
                android.view.View r0 = r0.baseView()
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r3.this$0
                int[] r1 = r1.baseViewLoc
                r0.getLocationInWindow(r1)
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r3.this$0
                int[] r1 = r0.baseViewLoc
                android.view.View r0 = r0.baseView()
                int r0 = r0.getWidth()
                r2 = 2
                r1[r2] = r0
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r3.this$0
                int[] r1 = r0.baseViewLoc
                android.view.View r0 = r0.baseView()
                int r0 = r0.getHeight()
                r2 = 3
                r1[r2] = r0
            L3c:
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r3.this$0
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r3.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r3.this$0
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r1.me
                r0.setParentDialog(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$1
                r1.<init>(r3)
                r0.setOnLifecycleCallBack(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$2
                r1.<init>(r3)
                r0.setOnBackPressedListener(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$3
                r1.<init>(r3)
                r0.post(r1)
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r3.this$0
                com.kongzue.dialogx.dialogs.CustomDialog.access$800(r0)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r9 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                if (r0 == 0) goto L1c3
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r9.this$0
                android.app.Activity r0 = r0.getOwnActivity()
                if (r0 != 0) goto Le
                goto L1c3
            Le:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.getMaxWidth()
                r0.setMaxWidth(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.getMaxHeight()
                r0.setMaxHeight(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.getMinWidth()
                r0.setMinimumWidth(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.getMinHeight()
                r0.setMinimumHeight(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                boolean r1 = r1.isEnableImmersiveMode()
                r0.setAutoUnsafePlacePadding(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int[] r1 = com.kongzue.dialogx.dialogs.CustomDialog.access$900(r1)
                r2 = 0
                r1 = r1[r2]
                com.kongzue.dialogx.dialogs.CustomDialog r3 = r9.this$0
                int[] r3 = com.kongzue.dialogx.dialogs.CustomDialog.access$1000(r3)
                r4 = 1
                r3 = r3[r4]
                com.kongzue.dialogx.dialogs.CustomDialog r5 = r9.this$0
                int[] r5 = com.kongzue.dialogx.dialogs.CustomDialog.access$1100(r5)
                r6 = 2
                r5 = r5[r6]
                com.kongzue.dialogx.dialogs.CustomDialog r6 = r9.this$0
                int[] r6 = com.kongzue.dialogx.dialogs.CustomDialog.access$1200(r6)
                r7 = 3
                r6 = r6[r7]
                r0.setRootPadding(r1, r3, r5, r6)
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r9.this$0
                android.view.View r0 = r0.baseView()
                r1 = -2
                if (r0 == 0) goto Lb1
                boolean r0 = r9.initSetCustomViewLayoutListener
                if (r0 != 0) goto L14c
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                if (r0 == 0) goto L89
                android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
                r0.<init>(r1, r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r9.boxCustom
                r1.setLayoutParams(r0)
            L89:
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$4 r0 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$4
                r0.<init>(r9)
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = r9.boxCustom
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
                com.kongzue.dialogx.dialogs.CustomDialog.access$1302(r1, r3)
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                android.view.ViewTreeObserver r1 = com.kongzue.dialogx.dialogs.CustomDialog.access$1300(r1)
                com.kongzue.dialogx.dialogs.CustomDialog r3 = r9.this$0
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$5 r5 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$5
                r5.<init>(r9, r0)
                android.view.ViewTreeObserver$OnPreDrawListener r0 = com.kongzue.dialogx.dialogs.CustomDialog.access$1402(r3, r5)
                r1.addOnPreDrawListener(r0)
                r9.initSetCustomViewLayoutListener = r4
                goto L14c
            Lb1:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                if (r0 == 0) goto L14c
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                if (r0 == 0) goto Lc7
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r3 = r9.alignCache
                if (r3 == 0) goto Lcc
                com.kongzue.dialogx.dialogs.CustomDialog r4 = r9.this$0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r4 = r4.align
                if (r3 == r4) goto Lcc
            Lc7:
                android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
                r0.<init>(r1, r1)
            Lcc:
                int[] r1 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN
                com.kongzue.dialogx.dialogs.CustomDialog r3 = r9.this$0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r3 = r3.align
                int r3 = r3.ordinal()
                r1 = r1[r3]
                r3 = 14
                r4 = 15
                r5 = 11
                r6 = 12
                r7 = 10
                r8 = 13
                switch(r1) {
                    case 1: goto L136;
                    case 2: goto L136;
                    case 3: goto L12c;
                    case 4: goto L12c;
                    case 5: goto L122;
                    case 6: goto L122;
                    case 7: goto L11b;
                    case 8: goto L11b;
                    case 9: goto L111;
                    case 10: goto L111;
                    case 11: goto L107;
                    case 12: goto L107;
                    case 13: goto Lfd;
                    case 14: goto Lf2;
                    case 15: goto Lf2;
                    case 16: goto Le8;
                    case 17: goto Le8;
                    default: goto Le7;
                }
            Le7:
                goto L141
            Le8:
                r0.removeRule(r8)
                r0.addRule(r5)
                r0.addRule(r4)
                goto L141
            Lf2:
                r0.removeRule(r8)
                r1 = 5
                r0.addRule(r1)
                r0.addRule(r4)
                goto L141
            Lfd:
                r0.removeRule(r7)
                r0.removeRule(r6)
                r0.addRule(r8)
                goto L141
            L107:
                r0.removeRule(r8)
                r0.addRule(r6)
                r0.addRule(r5)
                goto L141
            L111:
                r0.removeRule(r8)
                r0.addRule(r6)
                r0.addRule(r3)
                goto L141
            L11b:
                r0.removeRule(r8)
                r0.addRule(r6)
                goto L141
            L122:
                r0.removeRule(r8)
                r0.addRule(r7)
                r0.addRule(r5)
                goto L141
            L12c:
                r0.removeRule(r8)
                r0.addRule(r7)
                r0.addRule(r3)
                goto L141
            L136:
                r0.removeRule(r8)
                r0.addRule(r7)
                r1 = 9
                r0.addRule(r1)
            L141:
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = r1.align
                r9.alignCache = r1
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r9.boxCustom
                r1.setLayoutParams(r0)
            L14c:
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r9.this$0
                boolean r1 = r0.bkgInterceptTouch
                if (r1 == 0) goto L16a
                boolean r0 = r0.isCancelable()
                if (r0 == 0) goto L163
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl$6
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                goto L16f
            L163:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                r1 = 0
                r0.setOnClickListener(r1)
                goto L16f
            L16a:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                r0.setClickable(r2)
            L16f:
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r9.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r0.onBindView
                if (r0 == 0) goto L188
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L188
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                if (r0 == 0) goto L188
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r2 = r1.onBindView
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r1.me
                r2.bindParent(r0, r1)
            L188:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                if (r0 == 0) goto L1b3
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.width
                r2 = -1
                if (r1 == r2) goto L19f
                r0.setMaxWidth(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.width
                r0.setMinimumWidth(r1)
            L19f:
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r9.this$0
                int r0 = r0.height
                if (r0 == r2) goto L1b3
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r9.boxCustom
                r1.setMaxHeight(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r9.boxCustom
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.height
                r0.setMinimumHeight(r1)
            L1b3:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                com.kongzue.dialogx.dialogs.CustomDialog r1 = r9.this$0
                int r1 = r1.getMaskColor()
                r0.setBackgroundColor(r1)
                com.kongzue.dialogx.dialogs.CustomDialog r0 = r9.this$0
                com.kongzue.dialogx.dialogs.CustomDialog.access$1700(r0)
            L1c3:
                return
        }
    }

    static {
            return
    }

    public CustomDialog() {
            r1 = this;
            r1.<init>()
            r1.me = r1
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            r1.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            r1.exitAnimResId = r0
            com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r0 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.CENTER
            r1.align = r0
            r0 = 0
            r1.maskColor = r0
            r0 = 1
            r1.bkgInterceptTouch = r0
            r0 = -1
            r1.alignViewGravity = r0
            r1.width = r0
            r1.height = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1.marginRelativeBaseView = r0
            return
    }

    public CustomDialog(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r2) {
            r1 = this;
            r1.<init>()
            r1.me = r1
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            r1.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            r1.exitAnimResId = r0
            com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r0 = com.kongzue.dialogx.dialogs.CustomDialog.ALIGN.CENTER
            r1.align = r0
            r0 = 0
            r1.maskColor = r0
            r0 = 1
            r1.bkgInterceptTouch = r0
            r0 = -1
            r1.alignViewGravity = r0
            r1.width = r0
            r1.height = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1.marginRelativeBaseView = r0
            r1.onBindView = r2
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.CustomDialog r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ int[] access$1000(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ boolean access$102(com.kongzue.dialogx.dialogs.CustomDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ int[] access$1100(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1200(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ android.view.ViewTreeObserver access$1300(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            android.view.ViewTreeObserver r0 = r0.viewTreeObserver
            return r0
    }

    public static /* synthetic */ android.view.ViewTreeObserver access$1302(com.kongzue.dialogx.dialogs.CustomDialog r0, android.view.ViewTreeObserver r1) {
            r0.viewTreeObserver = r1
            return r1
    }

    public static /* synthetic */ android.view.ViewTreeObserver.OnPreDrawListener access$1400(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r0.baseViewDrawListener
            return r0
    }

    public static /* synthetic */ android.view.ViewTreeObserver.OnPreDrawListener access$1402(com.kongzue.dialogx.dialogs.CustomDialog r0, android.view.ViewTreeObserver.OnPreDrawListener r1) {
            r0.baseViewDrawListener = r1
            return r1
    }

    public static /* synthetic */ boolean access$1500(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ void access$1600(com.kongzue.dialogx.dialogs.CustomDialog r0, android.view.ViewTreeObserver r1, android.view.ViewTreeObserver.OnPreDrawListener r2) {
            r0.removeDrawListener(r1, r2)
            return
    }

    public static /* synthetic */ void access$1700(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$1800(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$1902(com.kongzue.dialogx.dialogs.CustomDialog r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$2000(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public static /* synthetic */ boolean access$202(com.kongzue.dialogx.dialogs.CustomDialog r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ void access$2100(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ android.view.animation.Animation access$2200(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            android.view.animation.Animation r0 = r0.getEnterAnimation()
            return r0
    }

    public static /* synthetic */ long access$2300(com.kongzue.dialogx.dialogs.CustomDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$2400(com.kongzue.dialogx.dialogs.CustomDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$2500(com.kongzue.dialogx.dialogs.CustomDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$2600(com.kongzue.dialogx.dialogs.CustomDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ void access$300(com.kongzue.dialogx.dialogs.CustomDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$400(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ boolean access$502(com.kongzue.dialogx.dialogs.CustomDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$600(com.kongzue.dialogx.dialogs.CustomDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$700(com.kongzue.dialogx.dialogs.CustomDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$800(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ int[] access$900(com.kongzue.dialogx.dialogs.CustomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static com.kongzue.dialogx.dialogs.CustomDialog build() {
            com.kongzue.dialogx.dialogs.CustomDialog r0 = new com.kongzue.dialogx.dialogs.CustomDialog
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.CustomDialog build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            com.kongzue.dialogx.dialogs.CustomDialog r0 = new com.kongzue.dialogx.dialogs.CustomDialog
            r0.<init>()
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r0.setCustomView(r1)
            return r1
    }

    private android.view.animation.Animation getEnterAnimation() {
            r7 = this;
            int r0 = r7.enterAnimResId
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            if (r0 != r1) goto L58
            int r0 = r7.exitAnimResId
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            if (r0 != r1) goto L58
            android.view.View r0 = r7.baseView()
            if (r0 != 0) goto L58
            int[] r0 = com.kongzue.dialogx.dialogs.CustomDialog.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN
            com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r1 = r7.align
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3b;
                case 2: goto L32;
                case 3: goto L3b;
                case 4: goto L3b;
                case 5: goto L3b;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L32;
                case 9: goto L20;
                case 10: goto L20;
                case 11: goto L20;
                case 12: goto L29;
                case 13: goto L1f;
                case 14: goto L32;
                case 15: goto L32;
                case 16: goto L29;
                case 17: goto L29;
                default: goto L1f;
            }
        L1f:
            goto L43
        L20:
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_bottom_enter
            r7.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_bottom_exit
            r7.exitAnimResId = r0
            goto L43
        L29:
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_right_enter
            r7.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_right_exit
            r7.exitAnimResId = r0
            goto L43
        L32:
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_left_enter
            r7.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_left_exit
            r7.exitAnimResId = r0
            goto L43
        L3b:
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_top_enter
            r7.enterAnimResId = r0
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_top_exit
            r7.exitAnimResId = r0
        L43:
            android.app.Activity r0 = r7.getOwnActivity()
            int r1 = r7.enterAnimResId
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r0.setInterpolator(r1)
            goto L6c
        L58:
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            int r1 = com.kongzue.dialogx.dialogs.CustomDialog.overrideEnterAnimRes
            if (r1 == 0) goto L5f
            r0 = r1
        L5f:
            int r1 = r7.enterAnimResId
            if (r1 == 0) goto L64
            r0 = r1
        L64:
            android.app.Activity r1 = r7.getOwnActivity()
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
        L6c:
            long r1 = r0.getDuration()
            int r3 = com.kongzue.dialogx.dialogs.CustomDialog.overrideEnterDuration
            if (r3 < 0) goto L75
            long r1 = (long) r3
        L75:
            long r3 = r7.enterAnimDuration
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L7e
            r1 = r3
        L7e:
            r0.setDuration(r1)
            return r0
    }

    private void removeDrawListener(android.view.ViewTreeObserver r2, android.view.ViewTreeObserver.OnPreDrawListener r3) {
            r1 = this;
            if (r2 == 0) goto Le
            if (r3 == 0) goto Le
            boolean r0 = r2.isAlive()
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r2.removeOnPreDrawListener(r3)     // Catch: java.lang.Exception -> Le
        Le:
            return
    }

    public static com.kongzue.dialogx.dialogs.CustomDialog show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            com.kongzue.dialogx.dialogs.CustomDialog r0 = new com.kongzue.dialogx.dialogs.CustomDialog
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.CustomDialog show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1, com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r2) {
            com.kongzue.dialogx.dialogs.CustomDialog r0 = new com.kongzue.dialogx.dialogs.CustomDialog
            r0.<init>(r1)
            r0.align = r2
            r0.show()
            return r0
    }

    public android.view.View baseView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.baseViewWeakReference
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        Lc:
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog baseView(android.view.View r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            java.lang.ref.WeakReference<android.view.View> r0 = r1.baseViewWeakReference
            if (r0 == 0) goto Ld
            r0.clear()
            r2 = 0
            r1.baseViewWeakReference = r2
            goto L14
        Ld:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.baseViewWeakReference = r0
        L14:
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            r0.dismiss()
            return
    }

    public com.kongzue.dialogx.dialogs.CustomDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
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

    public void dismiss() {
            r1 = this;
            com.kongzue.dialogx.dialogs.CustomDialog$2 r0 = new com.kongzue.dialogx.dialogs.CustomDialog$2
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.CustomDialog.ALIGN getAlign() {
            r1 = this;
            com.kongzue.dialogx.dialogs.CustomDialog$ALIGN r0 = r1.align
            return r0
    }

    public int getAlignBaseViewGravity() {
            r1 = this;
            int r0 = r1.alignViewGravity
            return r0
    }

    public android.view.View getBaseView() {
            r1 = this;
            android.view.View r0 = r1.baseView()
            return r0
    }

    public int[] getBaseViewMargin() {
            r1 = this;
            int[] r0 = r1.marginRelativeBaseView
            return r0
    }

    public int getBaseViewMarginBottom(int r2) {
            r1 = this;
            int[] r2 = r1.marginRelativeBaseView
            r0 = 3
            r2 = r2[r0]
            return r2
    }

    public int getBaseViewMarginLeft(int r2) {
            r1 = this;
            int[] r2 = r1.marginRelativeBaseView
            r0 = 0
            r2 = r2[r0]
            return r2
    }

    public int getBaseViewMarginRight(int r2) {
            r1 = this;
            int[] r2 = r1.marginRelativeBaseView
            r0 = 2
            r2 = r2[r0]
            return r2
    }

    public int getBaseViewMarginTop(int r2) {
            r1 = this;
            int[] r2 = r1.marginRelativeBaseView
            r0 = 1
            r2 = r2[r0]
            return r2
    }

    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.CustomDialog> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.CustomDialog$3 r0 = new com.kongzue.dialogx.dialogs.CustomDialog$3
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    public long getEnterAnimDuration() {
            r2 = this;
            long r0 = r2.enterAnimDuration
            return r0
    }

    public int getEnterAnimResId() {
            r1 = this;
            int r0 = r1.enterAnimResId
            return r0
    }

    public long getExitAnimDuration() {
            r2 = this;
            long r0 = r2.exitAnimDuration
            return r0
    }

    public int getExitAnimResId() {
            r1 = this;
            int r0 = r1.exitAnimResId
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getMaskColor() {
            r1 = this;
            int r0 = r1.maskColor
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.CustomDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.onBackPressedListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.CustomDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public void hide() {
            r2 = this;
            r0 = 1
            r2.isHide = r0
            r0 = 0
            r2.hideWithExitAnim = r0
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L15
            android.view.View r0 = r2.getDialogView()
            r1 = 8
            r0.setVisibility(r1)
        L15:
            return
    }

    public void hideWithExitAnim() {
            r3 = this;
            r0 = 1
            r3.hideWithExitAnim = r0
            r3.isHide = r0
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L2d
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxCustom
            r0.doExitAnim(r3, r1)
            com.kongzue.dialogx.dialogs.CustomDialog$4 r0 = new com.kongzue.dialogx.dialogs.CustomDialog$4
            r0.<init>(r3)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r1 = r3.getDialogImpl()
            r2 = 0
            long r1 = r1.getExitAnimationDuration(r2)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
        L2d:
            return
    }

    public boolean isAlignBaseViewGravity(int r2) {
            r1 = this;
            int r0 = r1.alignViewGravity
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public boolean isAutoUnsafePlacePadding() {
            r1 = this;
            boolean r0 = r1.isEnableImmersiveMode()
            return r0
    }

    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
            r4 = this;
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = r4.privateCancelable
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto Lb
            r1 = r2
        Lb:
            return r1
        Lc:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.CustomDialog.overrideCancelable
            if (r0 == 0) goto L16
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto L15
            r1 = r2
        L15:
            return r1
        L16:
            boolean r0 = r4.cancelable
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.CustomDialog r1) {
            r0 = this;
            return
    }

    public void onGetBaseViewLoc(int[] r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.CustomDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
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

    public void onShow(com.kongzue.dialogx.dialogs.CustomDialog r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.CustomDialog$1 r0 = new com.kongzue.dialogx.dialogs.CustomDialog$1
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.CustomDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r2 = this;
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L46
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            if (r0 == 0) goto L3c
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L3c
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.baseViewDrawListener
            if (r0 == 0) goto L3c
            android.view.ViewTreeObserver r1 = r2.viewTreeObserver
            if (r1 == 0) goto L20
            r2.removeDrawListener(r1, r0)
            goto L37
        L20:
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L37
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.baseViewDrawListener
            r2.removeDrawListener(r0, r1)
        L37:
            r0 = 0
            r2.baseViewDrawListener = r0
            r2.viewTreeObserver = r0
        L3c:
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r0 = 0
            r2.isShow = r0
        L46:
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            if (r0 == 0) goto L5d
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L5d
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r2.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L5d:
            r0 = 0
            r2.enterAnimDuration = r0
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L74
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            goto L76
        L74:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_custom
        L76:
            android.view.View r0 = r2.createView(r0)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl
            r1.<init>(r2, r0)
            r2.dialogImpl = r1
            if (r0 == 0) goto L88
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r2.me
            r0.setTag(r1)
        L88:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.CustomDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setAlign(com.kongzue.dialogx.dialogs.CustomDialog.ALIGN r1) {
            r0 = this;
            r0.align = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseView(android.view.View r2) {
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

    public com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseViewGravity(int r2) {
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

    public com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseViewGravity(android.view.View r1, int r2) {
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

    public com.kongzue.dialogx.dialogs.CustomDialog setAlignBaseViewGravity(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            int[] r3 = new int[]{r3, r4, r5, r6}
            r0.marginRelativeBaseView = r3
            r0.refreshUI()
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r0.setAlignBaseViewGravity(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setAnimResId(int r1, int r2) {
            r0 = this;
            r0.enterAnimResId = r1
            r0.exitAnimResId = r2
            return r0
    }

    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.CustomDialog setAutoUnsafePlacePadding(boolean r1) {
            r0 = this;
            r0.setEnableImmersiveMode(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.marginRelativeBaseView = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMargin(int[] r1) {
            r0 = this;
            r0.marginRelativeBaseView = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginBottom(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 3
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginLeft(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 0
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginRight(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 2
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBaseViewMarginTop(int r3) {
            r2 = this;
            int[] r0 = r2.marginRelativeBaseView
            r1 = 1
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setCancelable(boolean r1) {
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

    public com.kongzue.dialogx.dialogs.CustomDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.CustomDialog setData(java.lang.String r2, java.lang.Object r3) {
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

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.CustomDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.CustomDialog r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.CustomDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setEnterAnimResId(int r1) {
            r0 = this;
            r0.enterAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setExitAnimResId(int r1) {
            r0 = this;
            r0.exitAnimResId = r1
            return r0
    }

    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.CustomDialog setFullScreen(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            r0.setEnableImmersiveMode(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setHeight(int r1) {
            r0 = this;
            r0.height = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.CustomDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.CustomDialog setThisOrderIndex(int r2) {
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

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.CustomDialog setWidth(int r1) {
            r0 = this;
            r0.width = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.CustomDialog show() {
            r3 = this;
            boolean r0 = r3.isHide
            if (r0 == 0) goto L58
            android.view.View r0 = r3.getDialogView()
            if (r0 == 0) goto L58
            boolean r0 = r3.isShow
            if (r0 == 0) goto L58
            boolean r0 = r3.hideWithExitAnim
            r1 = 0
            if (r0 == 0) goto L50
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L50
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L50
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.boxCustom
            r0.doShowAnim(r3, r2)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            r0.setVisibility(r1)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxCustom
            android.view.animation.Animation r1 = r3.getEnterAnimation()
            r0.startAnimation(r1)
            goto L57
        L50:
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
        L57:
            return r3
        L58:
            super.beforeShow()
            android.view.View r0 = r3.getDialogView()
            if (r0 != 0) goto L8c
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L74
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            goto L76
        L74:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_custom
        L76:
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto L88
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r3.me
            r0.setTag(r1)
        L88:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L93
        L8c:
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L93:
            return r3
    }

    public com.kongzue.dialogx.dialogs.CustomDialog show(android.app.Activity r3) {
            r2 = this;
            super.beforeShow()
            android.view.View r0 = r2.getDialogView()
            if (r0 != 0) goto L34
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L1c
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            goto L1e
        L1c:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_custom
        L1e:
            android.view.View r0 = r2.createView(r0)
            com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.CustomDialog$DialogImpl
            r1.<init>(r2, r0)
            r2.dialogImpl = r1
            if (r0 == 0) goto L30
            com.kongzue.dialogx.dialogs.CustomDialog r1 = r2.me
            r0.setTag(r1)
        L30:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
            goto L3b
        L34:
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
        L3b:
            return r2
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.CustomDialog r0 = r1.show()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
