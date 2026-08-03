package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenDialog extends com.kongzue.dialogx.interfaces.BaseDialog implements com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog {
    public static final int ACTIVITY_CONTENT_RADIUS_DEFAULT = -1;
    public static final int ACTIVITY_CONTENT_RADIUS_KEEP = -2;
    public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterDuration = -1;
    public static int overrideExitDuration = -1;
    protected float activityContentRadius;
    protected boolean allowInterceptTouch;
    protected float backgroundRadius;
    protected boolean bottomNonSafetyAreaBySelf;
    private java.lang.Integer deviceRadiusCache;
    protected com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.FullScreenDialog> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> dialogXAnimImpl;
    protected boolean hideActivityContentView;
    protected boolean hideWithExitAnim;
    protected boolean hideZoomBackground;
    protected java.lang.Integer maskColor;
    protected com.kongzue.dialogx.dialogs.FullScreenDialog me;
    protected com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.FullScreenDialog> onBackPressedListener;
    protected com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.FullScreenDialog> onBackgroundMaskClickListener;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> onBindView;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN privateCancelable;





    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        public com.kongzue.dialogx.util.views.MaxRelativeLayout bkg;
        public float bkgEnterAimY;
        public android.widget.RelativeLayout boxBkg;
        public android.widget.RelativeLayout boxCustom;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        private boolean enterAnimRunning;
        protected int enterY;
        private com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor fullScreenDialogTouchEventInterceptor;
        public com.kongzue.dialogx.util.views.ActivityScreenShotImageView imgZoomActivity;
        private android.graphics.Rect mUnsafeRect;
        public com.kongzue.dialogx.interfaces.ScrollController scrollView;
        final /* synthetic */ com.kongzue.dialogx.dialogs.FullScreenDialog this$0;












        public DialogImpl(com.kongzue.dialogx.dialogs.FullScreenDialog r4, android.view.View r5) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3.bkgEnterAimY = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r1 = 0
                r0.<init>(r1, r1, r1, r1)
                r3.mUnsafeRect = r0
                r0 = 1
                r3.enterAnimRunning = r0
                if (r5 != 0) goto L17
                return
            L17:
                com.kongzue.dialogx.dialogs.FullScreenDialog.access$000(r4, r5)
                int r0 = com.kongzue.dialogx.R.id.img_zoom_activity
                android.view.View r0 = r5.findViewById(r0)
                com.kongzue.dialogx.util.views.ActivityScreenShotImageView r0 = (com.kongzue.dialogx.util.views.ActivityScreenShotImageView) r0
                r3.imgZoomActivity = r0
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r5.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r3.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.box_bkg
                android.view.View r0 = r5.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r3.boxBkg = r0
                int r0 = com.kongzue.dialogx.R.id.bkg
                android.view.View r0 = r5.findViewById(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
                r3.bkg = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r0 = r5.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r3.boxCustom = r0
                com.kongzue.dialogx.util.views.ActivityScreenShotImageView r0 = r3.imgZoomActivity
                boolean r2 = r4.hideActivityContentView
                r0.hideActivityContentView = r2
                r0.bindDialog(r4)
                boolean r0 = r4.hideZoomBackground
                if (r0 == 0) goto L66
                int r0 = com.kongzue.dialogx.R.color.black20
                r5.setBackgroundResource(r0)
                com.kongzue.dialogx.util.views.ActivityScreenShotImageView r5 = r3.imgZoomActivity
                r0 = 8
                r5.setVisibility(r0)
                goto L70
            L66:
                int r0 = com.kongzue.dialogx.R.color.black
                r5.setBackgroundResource(r0)
                com.kongzue.dialogx.util.views.ActivityScreenShotImageView r5 = r3.imgZoomActivity
                r5.setVisibility(r1)
            L70:
                r3.init()
                r4.dialogImpl = r3
                r3.refreshView()
                return
        }

        public static /* synthetic */ void access$1000(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0) {
                r0.makeEnterY()
                return
        }

        public static /* synthetic */ boolean access$1100(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0) {
                boolean r0 = r0.enterAnimRunning
                return r0
        }

        public static /* synthetic */ boolean access$1102(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0, boolean r1) {
                r0.enterAnimRunning = r1
                return r1
        }

        public static /* synthetic */ void access$1300(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0, int r1, int r2, boolean r3) {
                r0.doShowAnimRepeat(r1, r2, r3)
                return
        }

        public static /* synthetic */ com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor access$702(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0, com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r1) {
                r0.fullScreenDialogTouchEventInterceptor = r1
                return r1
        }

        public static /* synthetic */ android.graphics.Rect access$900(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0) {
                android.graphics.Rect r0 = r0.mUnsafeRect
                return r0
        }

        private void doShowAnimRepeat(int r4, int r5, boolean r6) {
                r3 = this;
                r0 = 1
                r3.enterAnimRunning = r0
                long r0 = r3.getEnterAnimationDuration()
                int[] r4 = new int[]{r4, r5}
                android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofInt(r4)
                r4.setDuration(r0)
                android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
                r2.<init>()
                r4.setInterpolator(r2)
                Yue.ۥۣ۠۠ۢ r2 = new Yue.ۥۣ۠۠ۢ
                r2.<init>(r3, r5)
                r4.addUpdateListener(r2)
                r4.start()
                com.kongzue.dialogx.util.views.MaxRelativeLayout r4 = r3.bkg
                r5 = 0
                r4.setVisibility(r5)
                if (r6 != 0) goto L45
                r4 = 2
                float[] r4 = new float[r4]
                r4 = {x0046: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
                r4.setDuration(r0)
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$10 r5 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$10
                r5.<init>(r3)
                r4.addUpdateListener(r5)
                r4.start()
            L45:
                return
        }

        private boolean isMatchParentHeightCustomView() {
                r3 = this;
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r3.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r0.onBindView
                r1 = 0
                if (r0 == 0) goto L21
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L21
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r3.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r0.onBindView
                android.view.View r0 = r0.getCustomView()
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L21
                int r0 = r0.height
                r2 = -1
                if (r0 != r2) goto L21
                r1 = 1
            L21:
                return r1
        }

        private /* synthetic */ void lambda$doShowAnimRepeat$0(int r5, android.animation.ValueAnimator r6) {
                r4 = this;
                java.lang.Object r0 = r6.getAnimatedValue()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r4.bkg
                float r2 = (float) r0
                r1.setY(r2)
                r4.makeEnterY()
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r4.boxRoot
                float r1 = r1.getSafeHeight()
                int r2 = r4.enterY
                float r2 = (float) r2
                float r1 = r1 - r2
                r2 = 0
                int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r3 >= 0) goto L23
                r1 = r2
            L23:
                float r2 = r4.bkgEnterAimY
                int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r2 == 0) goto L34
                r4.bkgEnterAimY = r1
                r6.cancel()
                int r5 = (int) r1
                r6 = 1
                r4.doShowAnimRepeat(r0, r5, r6)
                goto L39
            L34:
                if (r0 < r5) goto L39
                r5 = 0
                r4.enterAnimRunning = r5
            L39:
                return
        }

        private void makeEnterY() {
                r2 = this;
                android.widget.RelativeLayout r0 = r2.boxCustom
                int r0 = r0.getHeight()
                if (r0 == 0) goto Le
                boolean r1 = r2.isMatchParentHeightCustomView()
                if (r1 == 0) goto L15
            Le:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                float r0 = r0.getSafeHeight()
                int r0 = (int) r0
            L15:
                r2.enterY = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m30645(com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r0, int r1, android.animation.ValueAnimator r2) {
                r0.lambda$doShowAnimRepeat$0(r1, r2)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r3) {
                r2 = this;
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r2.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                if (r3 == 0) goto Lf
                r0 = 0
                r3.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.FullScreenDialog r3 = r2.this$0
                android.app.Activity r3 = r3.getOwnActivity()
                if (r3 != 0) goto L18
                return
            L18:
                com.kongzue.dialogx.dialogs.FullScreenDialog r3 = r2.this$0
                boolean r3 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$2200(r3)
                if (r3 != 0) goto L45
                com.kongzue.dialogx.interfaces.DialogXAnimInterface r3 = r2.getDialogXAnimImpl()
                if (r3 == 0) goto L45
                com.kongzue.dialogx.dialogs.FullScreenDialog r3 = r2.this$0
                r0 = 1
                com.kongzue.dialogx.dialogs.FullScreenDialog.access$2302(r3, r0)
                com.kongzue.dialogx.interfaces.DialogXAnimInterface r3 = r2.getDialogXAnimImpl()
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r2.this$0
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r0.me
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r2.bkg
                r3.doExitAnim(r0, r1)
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$9 r3 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$9
                r3.<init>(r2)
                long r0 = r2.getExitAnimationDuration()
                com.kongzue.dialogx.dialogs.FullScreenDialog.access$2500(r3, r0)
            L45:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$11 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$11
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration() {
                r6 = this;
                int r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.overrideEnterDuration
                if (r0 < 0) goto L6
                long r0 = (long) r0
                goto L8
            L6:
                r0 = 300(0x12c, double:1.48E-321)
            L8:
                com.kongzue.dialogx.dialogs.FullScreenDialog r2 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$3000(r2)
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L1a
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$3100(r0)
            L1a:
                return r0
        }

        public float getEnterY() {
                r2 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                float r0 = r0.getSafeHeight()
                int r1 = r2.enterY
                float r1 = (float) r1
                float r0 = r0 - r1
                r1 = 0
                float r0 = java.lang.Math.max(r1, r0)
                return r0
        }

        public long getExitAnimationDuration() {
                r6 = this;
                int r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.overrideExitDuration
                if (r0 < 0) goto L6
                long r0 = (long) r0
                goto L8
            L6:
                r0 = 300(0x12c, double:1.48E-321)
            L8:
                com.kongzue.dialogx.dialogs.FullScreenDialog r2 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$2800(r2)
                r4 = -1
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L1a
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$2900(r0)
            L1a:
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r3 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r3.this$0
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r1.me
                r0.setParentDialog(r1)
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r3.this$0
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r3.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$1
                r1.<init>(r3)
                r0.setOnLifecycleCallBack(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$2
                r1.<init>(r3)
                r0.setOnBackPressedListener(r1)
                com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0 = new com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r3.this$0
                com.kongzue.dialogx.dialogs.FullScreenDialog r2 = r1.me
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r1 = r1.dialogImpl
                r0.<init>(r2, r1)
                r3.fullScreenDialogTouchEventInterceptor = r0
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                r1 = 0
                r0.setBkgAlpha(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$3
                r1.<init>(r3)
                r0.post(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$4
                r1.<init>(r3)
                r0.setOnSafeInsetsChangeListener(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r3.bkg
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$5
                r1.<init>(r3)
                r0.setOnYChanged(r1)
                android.widget.RelativeLayout r0 = r3.boxCustom
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$6
                r1.<init>(r3)
                r0.addOnLayoutChangeListener(r1)
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r3.this$0
                com.kongzue.dialogx.dialogs.FullScreenDialog.access$1400(r0)
                return
        }

        public void preDismiss() {
                r7 = this;
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r7.this$0
                boolean r0 = r0.isCancelable()
                if (r0 == 0) goto Le
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                r7.doDismiss(r0)
                goto L45
            Le:
                int r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.overrideExitDuration
                if (r0 < 0) goto L14
                long r0 = (long) r0
                goto L16
            L14:
                r0 = 300(0x12c, double:1.48E-321)
            L16:
                com.kongzue.dialogx.dialogs.FullScreenDialog r2 = r7.this$0
                long r2 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$2600(r2)
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L28
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r7.this$0
                long r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$2700(r0)
            L28:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r7.bkg
                float r3 = r2.getY()
                float r4 = r7.bkgEnterAimY
                r5 = 2
                float[] r5 = new float[r5]
                r6 = 0
                r5[r6] = r3
                r3 = 1
                r5[r3] = r4
                java.lang.String r3 = "y"
                android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
                r2.setDuration(r0)
                r2.start()
            L45:
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r11 = this;
                r0 = 8
                r1 = 3
                r2 = 2
                r3 = 1
                r4 = 0
                r5 = 0
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                if (r6 == 0) goto L167
                com.kongzue.dialogx.dialogs.FullScreenDialog r6 = r11.this$0
                android.app.Activity r6 = r6.getOwnActivity()
                if (r6 != 0) goto L15
                goto L167
            L15:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                boolean r7 = r7.isEnableImmersiveMode()
                r6.setAutoUnsafePlacePadding(r7)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                int[] r7 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$1500(r7)
                r7 = r7[r4]
                com.kongzue.dialogx.dialogs.FullScreenDialog r8 = r11.this$0
                int[] r8 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$1600(r8)
                r8 = r8[r3]
                com.kongzue.dialogx.dialogs.FullScreenDialog r9 = r11.this$0
                int[] r9 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$1700(r9)
                r9 = r9[r2]
                com.kongzue.dialogx.dialogs.FullScreenDialog r10 = r11.this$0
                int[] r10 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$1800(r10)
                r10 = r10[r1]
                r6.setRootPadding(r7, r8, r9, r10)
                com.kongzue.dialogx.dialogs.FullScreenDialog r6 = r11.this$0
                java.lang.Integer r6 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$1900(r6)
                if (r6 == 0) goto L5c
                com.kongzue.dialogx.dialogs.FullScreenDialog r6 = r11.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r11.bkg
                java.lang.Integer r8 = com.kongzue.dialogx.dialogs.FullScreenDialog.access$2000(r6)
                int r8 = r8.intValue()
                r6.tintColor(r7, r8)
            L5c:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                int r7 = r7.getMaxWidth()
                r6.setMaxWidth(r7)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                int r7 = r7.getMaxHeight()
                r6.setMaxHeight(r7)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                int r7 = r7.getMinWidth()
                r6.setMinimumWidth(r7)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                int r7 = r7.getMinHeight()
                r6.setMinimumHeight(r7)
                com.kongzue.dialogx.dialogs.FullScreenDialog r6 = r11.this$0
                boolean r6 = r6.isCancelable()
                if (r6 == 0) goto L9b
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$7 r7 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$7
                r7.<init>(r11)
                r6.setOnClickListener(r7)
                goto La1
            L9b:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                r7 = 0
                r6.setOnClickListener(r7)
            La1:
                com.kongzue.dialogx.dialogs.FullScreenDialog r6 = r11.this$0
                float r6 = r6.backgroundRadius
                r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto Leb
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                android.graphics.drawable.Drawable r6 = r6.getBackground()
                boolean r6 = r6 instanceof android.graphics.drawable.GradientDrawable
                if (r6 == 0) goto Ldc
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                android.graphics.drawable.Drawable r6 = r6.getBackground()
                android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
                if (r6 == 0) goto Ldc
                com.kongzue.dialogx.dialogs.FullScreenDialog r7 = r11.this$0
                float r7 = r7.backgroundRadius
                float[] r8 = new float[r0]
                r8[r4] = r7
                r8[r3] = r7
                r8[r2] = r7
                r8[r1] = r7
                r1 = 4
                r8[r1] = r5
                r1 = 5
                r8[r1] = r5
                r1 = 6
                r8[r1] = r5
                r1 = 7
                r8[r1] = r5
                r6.setCornerRadii(r8)
            Ldc:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.bkg
                com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$8 r2 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl$8
                r2.<init>(r11)
                r1.setOutlineProvider(r2)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.bkg
                r1.setClipToOutline(r3)
            Leb:
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                java.lang.Integer r1 = r1.maskColor
                if (r1 == 0) goto Lfa
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r11.boxRoot
                int r1 = r1.intValue()
                r2.setBackgroundColor(r1)
            Lfa:
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r2 = r1.onBindView
                if (r2 == 0) goto L136
                android.widget.RelativeLayout r3 = r11.boxCustom
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r1.me
                r2.bindParent(r3, r1)
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r1 = r1.onBindView
                android.view.View r1 = r1.getCustomView()
                boolean r1 = r1 instanceof com.kongzue.dialogx.interfaces.ScrollController
                if (r1 == 0) goto L120
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r1 = r1.onBindView
                android.view.View r1 = r1.getCustomView()
                com.kongzue.dialogx.interfaces.ScrollController r1 = (com.kongzue.dialogx.interfaces.ScrollController) r1
                r11.scrollView = r1
                goto L136
            L120:
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r1 = r1.onBindView
                android.view.View r1 = r1.getCustomView()
                java.lang.String r2 = "ScrollController"
                android.view.View r1 = r1.findViewWithTag(r2)
                boolean r2 = r1 instanceof com.kongzue.dialogx.interfaces.ScrollController
                if (r2 == 0) goto L136
                com.kongzue.dialogx.interfaces.ScrollController r1 = (com.kongzue.dialogx.interfaces.ScrollController) r1
                r11.scrollView = r1
            L136:
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                boolean r2 = r1.hideZoomBackground
                if (r2 == 0) goto L14b
                android.view.View r1 = r1.getDialogView()
                int r2 = com.kongzue.dialogx.R.color.black20
                r1.setBackgroundResource(r2)
                com.kongzue.dialogx.util.views.ActivityScreenShotImageView r1 = r11.imgZoomActivity
                r1.setVisibility(r0)
                goto L159
            L14b:
                android.view.View r0 = r1.getDialogView()
                int r1 = com.kongzue.dialogx.R.color.black
                r0.setBackgroundResource(r1)
                com.kongzue.dialogx.util.views.ActivityScreenShotImageView r0 = r11.imgZoomActivity
                r0.setVisibility(r4)
            L159:
                com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0 = r11.fullScreenDialogTouchEventInterceptor
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r11.this$0
                com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r1.me
                r0.refresh(r1, r11)
                com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r11.this$0
                com.kongzue.dialogx.dialogs.FullScreenDialog.access$2100(r0)
            L167:
                return
        }

        public com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl setScrollView(com.kongzue.dialogx.interfaces.ScrollController r1) {
                r0 = this;
                r0.scrollView = r1
                return r0
        }
    }

    static {
            return
    }

    public FullScreenDialog() {
            r1 = this;
            r1.<init>()
            int r0 = com.kongzue.dialogx.DialogX.defaultFullScreenDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.activityContentRadius = r0
            r0 = 1
            r1.allowInterceptTouch = r0
            r0 = 0
            r1.bottomNonSafetyAreaBySelf = r0
            r0 = 0
            r1.maskColor = r0
            r1.me = r1
            return
    }

    public FullScreenDialog(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.kongzue.dialogx.DialogX.defaultFullScreenDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.activityContentRadius = r0
            r0 = 1
            r1.allowInterceptTouch = r0
            r0 = 0
            r1.bottomNonSafetyAreaBySelf = r0
            r0 = 0
            r1.maskColor = r0
            r1.me = r1
            r1.onBindView = r2
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.FullScreenDialog r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ boolean access$102(com.kongzue.dialogx.dialogs.FullScreenDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ float access$1200(com.kongzue.dialogx.dialogs.FullScreenDialog r0, float r1, float r2, float r3) {
            float r0 = r0.getActivityZoomRadius(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void access$1400(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ int[] access$1500(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1600(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1700(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1800(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1900(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2000(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ boolean access$202(com.kongzue.dialogx.dialogs.FullScreenDialog r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ void access$2100(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$2200(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$2302(com.kongzue.dialogx.dialogs.FullScreenDialog r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$2400(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public static /* synthetic */ void access$2500(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ long access$2600(com.kongzue.dialogx.dialogs.FullScreenDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$2700(com.kongzue.dialogx.dialogs.FullScreenDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$2800(com.kongzue.dialogx.dialogs.FullScreenDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$2900(com.kongzue.dialogx.dialogs.FullScreenDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ void access$300(com.kongzue.dialogx.dialogs.FullScreenDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ long access$3000(com.kongzue.dialogx.dialogs.FullScreenDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$3100(com.kongzue.dialogx.dialogs.FullScreenDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ void access$400(com.kongzue.dialogx.dialogs.FullScreenDialog r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ boolean access$502(com.kongzue.dialogx.dialogs.FullScreenDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$600(com.kongzue.dialogx.dialogs.FullScreenDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$800(com.kongzue.dialogx.dialogs.FullScreenDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static com.kongzue.dialogx.dialogs.FullScreenDialog build() {
            com.kongzue.dialogx.dialogs.FullScreenDialog r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.FullScreenDialog build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            com.kongzue.dialogx.dialogs.FullScreenDialog r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog
            r0.<init>(r1)
            return r0
    }

    private float getActivityZoomRadius(float r1, float r2, float r3) {
            r0 = this;
            float r2 = r2 - r1
            float r3 = r3 * r2
            float r1 = r1 + r3
            return r1
    }

    public static com.kongzue.dialogx.dialogs.FullScreenDialog show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            com.kongzue.dialogx.dialogs.FullScreenDialog r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog bringToFront() {
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

    public com.kongzue.dialogx.dialogs.FullScreenDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog cleanAllAction() {
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
            com.kongzue.dialogx.dialogs.FullScreenDialog$2 r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog$2
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public float getActivityContentRadius() {
            r3 = this;
            float r0 = r3.activityContentRadius
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L8
            goto L28
        L8:
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L14
            int r0 = r3.getDeviceRadius()
        L12:
            float r0 = (float) r0
            goto L28
        L14:
            float r0 = r3.getRadius()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            float r0 = r3.getRadius()
            goto L28
        L21:
            r0 = 1097859072(0x41700000, float:15.0)
            int r0 = r3.dip2px(r0)
            goto L12
        L28:
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public int getDeviceRadius() {
            r5 = this;
            java.lang.Integer r0 = r5.deviceRadiusCache
            if (r0 != 0) goto Lb9
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5.deviceRadiusCache = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L45
            android.widget.FrameLayout r1 = r5.getRootFrameLayout()
            if (r1 != 0) goto L1c
            android.view.WindowInsets r1 = com.kongzue.dialogx.interfaces.BaseDialog.publicWindowInsets()
            goto L24
        L1c:
            android.widget.FrameLayout r1 = r5.getRootFrameLayout()
            android.view.WindowInsets r1 = r1.getRootWindowInsets()
        L24:
            if (r1 == 0) goto L45
            android.view.RoundedCorner r2 = Yue.C0809.m4749(r1, r0)
            r3 = 1
            android.view.RoundedCorner r1 = Yue.C0809.m4749(r1, r3)
            if (r2 == 0) goto L45
            if (r1 == 0) goto L45
            int r2 = Yue.C0810.m4750(r2)
            int r1 = Yue.C0810.m4750(r1)
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.deviceRadiusCache = r1
        L45:
            java.lang.Integer r1 = r5.deviceRadiusCache
            int r1 = r1.intValue()
            if (r1 != 0) goto L8a
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L8a
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "getInt"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L86
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Exception -> L86
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "ro.miui.notch.radius"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L86
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Exception -> L86
            r2 = 0
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L86
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L86
            r0.intValue()     // Catch: java.lang.Exception -> L86
            r5.deviceRadiusCache = r0     // Catch: java.lang.Exception -> L86
            goto L8a
        L86:
            r0 = move-exception
            r0.printStackTrace()
        L8a:
            java.lang.Integer r0 = r5.deviceRadiusCache
            int r0 = r0.intValue()
            if (r0 != 0) goto Lb9
            com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r5.me     // Catch: java.lang.Exception -> Lb5
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "rounded_corner_radius"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            int r0 = r0.getIdentifier(r1, r2, r3)     // Catch: java.lang.Exception -> Lb5
            if (r0 <= 0) goto Lb9
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r5.me     // Catch: java.lang.Exception -> Lb5
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Lb5
            int r0 = r1.getDimensionPixelSize(r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lb5
            r5.deviceRadiusCache = r0     // Catch: java.lang.Exception -> Lb5
            goto Lb9
        Lb5:
            r0 = move-exception
            r0.printStackTrace()
        Lb9:
            java.lang.Integer r0 = r5.deviceRadiusCache
            int r0 = r0.intValue()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.FullScreenDialog> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.FullScreenDialog$3 r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog$3
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    public long getEnterAnimDuration() {
            r2 = this;
            long r0 = r2.enterAnimDuration
            return r0
    }

    public long getExitAnimDuration() {
            r2 = this;
            long r0 = r2.exitAnimDuration
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.FullScreenDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r1.onBackPressedListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.FullScreenDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.backgroundRadius
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

    public com.kongzue.dialogx.dialogs.FullScreenDialog hideActivityContentView(boolean r1) {
            r0 = this;
            r0.hideActivityContentView = r1
            return r0
    }

    public void hideWithExitAnim() {
            r3 = this;
            r0 = 1
            r3.hideWithExitAnim = r0
            r3.isHide = r0
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L2e
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r3.me
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.bkg
            r0.doExitAnim(r1, r2)
            com.kongzue.dialogx.dialogs.FullScreenDialog$4 r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog$4
            r0.<init>(r3)
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r1 = r3.getDialogImpl()
            long r1 = r1.getExitAnimationDuration()
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
        L2e:
            return
    }

    public boolean isAllowInterceptTouch() {
            r1 = this;
            boolean r0 = r1.allowInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog
    public boolean isBottomNonSafetyAreaBySelf() {
            r1 = this;
            boolean r0 = r1.bottomNonSafetyAreaBySelf
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
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.FullScreenDialog.overrideCancelable
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

    public boolean isHideZoomBackground() {
            r1 = this;
            boolean r0 = r1.hideZoomBackground
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.FullScreenDialog r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
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

    public void onShow(com.kongzue.dialogx.dialogs.FullScreenDialog r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.FullScreenDialog$1 r0 = new com.kongzue.dialogx.dialogs.FullScreenDialog$1
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r2 = this;
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L10
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r0 = 0
            r2.isShow = r0
        L10:
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r2.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r2.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            r0 = 0
            r2.enterAnimDuration = r0
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L38
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            goto L43
        L38:
            boolean r0 = r2.isLightTheme()
            if (r0 == 0) goto L41
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen
            goto L43
        L41:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen_dark
        L43:
            android.view.View r0 = r2.createView(r0)
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl
            r1.<init>(r2, r0)
            r2.dialogImpl = r1
            if (r0 == 0) goto L55
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r2.me
            r0.setTag(r1)
        L55:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.FullScreenDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setActivityContentRadius(float r1) {
            r0 = this;
            r0.activityContentRadius = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setAllowInterceptTouch(boolean r1) {
            r0 = this;
            r0.allowInterceptTouch = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setBottomNonSafetyAreaBySelf(boolean r1) {
            r0 = this;
            r0.bottomNonSafetyAreaBySelf = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setCancelable(boolean r1) {
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

    public com.kongzue.dialogx.dialogs.FullScreenDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.FullScreenDialog setData(java.lang.String r2, java.lang.Object r3) {
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
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setDeviceRadius(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.deviceRadiusCache = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.FullScreenDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.FullScreenDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setHideZoomBackground(boolean r1) {
            r0 = this;
            r0.hideZoomBackground = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.FullScreenDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.FullScreenDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.FullScreenDialog setThisOrderIndex(int r2) {
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
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.FullScreenDialog show() {
            r3 = this;
            boolean r0 = r3.isHide
            if (r0 == 0) goto L3c
            android.view.View r0 = r3.getDialogView()
            if (r0 == 0) goto L3c
            boolean r0 = r3.isShow
            if (r0 == 0) goto L3c
            boolean r0 = r3.hideWithExitAnim
            r1 = 0
            if (r0 == 0) goto L34
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L34
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r3.me
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.bkg
            r0.doShowAnim(r1, r2)
            goto L3b
        L34:
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
        L3b:
            return r3
        L3c:
            super.beforeShow()
            android.view.View r0 = r3.getDialogView()
            if (r0 != 0) goto L79
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L58
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            goto L63
        L58:
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L61
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen
            goto L63
        L61:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen_dark
        L63:
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto L75
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r3.me
            r0.setTag(r1)
        L75:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L80
        L79:
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L80:
            return r3
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.FullScreenDialog r0 = r1.show()
            return r0
    }

    public void show(android.app.Activity r3) {
            r2 = this;
            super.beforeShow()
            android.view.View r0 = r2.getDialogView()
            if (r0 != 0) goto L3d
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L1c
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            goto L27
        L1c:
            boolean r0 = r2.isLightTheme()
            if (r0 == 0) goto L25
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen
            goto L27
        L25:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen_dark
        L27:
            android.view.View r0 = r2.createView(r0)
            com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.FullScreenDialog$DialogImpl
            r1.<init>(r2, r0)
            r2.dialogImpl = r1
            if (r0 == 0) goto L39
            com.kongzue.dialogx.dialogs.FullScreenDialog r1 = r2.me
            r0.setTag(r1)
        L39:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
            goto L44
        L3d:
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
        L44:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
