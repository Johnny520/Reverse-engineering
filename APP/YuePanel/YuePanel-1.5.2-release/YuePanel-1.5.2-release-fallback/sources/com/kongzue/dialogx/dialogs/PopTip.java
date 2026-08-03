package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class PopTip extends com.kongzue.dialogx.interfaces.BaseDialog implements com.kongzue.dialogx.interfaces.NoTouchInterface {
    public static final int TIME_NO_AUTO_DISMISS_DELAY = -1;
    public static int maxShowCount = Integer.MAX_VALUE;
    public static com.kongzue.dialogx.interfaces.PopMoveDisplacementInterceptor<com.kongzue.dialogx.dialogs.PopTip> moveDisplacementInterceptor = null;
    public static int overrideEnterAnimRes = 0;
    public static long overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static long overrideExitDuration = -1;
    protected static java.util.List<com.kongzue.dialogx.dialogs.PopTip> popTipList;
    protected com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN align;
    protected long autoDismissDelay;
    protected java.util.Timer autoDismissTimer;
    protected float backgroundRadius;
    protected int[] bodyMargin;
    protected java.lang.CharSequence buttonText;
    protected com.kongzue.dialogx.util.TextInfo buttonTextInfo;
    protected com.kongzue.dialogx.dialogs.PopTip.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopTip> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> dialogXAnimImpl;
    protected int enterAnimResId;
    protected int exitAnimResId;
    protected int iconResId;
    protected com.kongzue.dialogx.dialogs.PopTip me;
    protected java.lang.CharSequence message;
    protected com.kongzue.dialogx.util.TextInfo messageTextInfo;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> onBindView;
    protected com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> onButtonClickListener;
    protected com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> onPopTipClickListener;
    protected boolean preRecycle;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN tintIcon;







    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.PopTip$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN = null;

        static {
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN[] r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.PopTip.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN = r0
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.TOP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.PopTip.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.PopTip.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.dialogs.PopTip.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.TOP_INSIDE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.kongzue.dialogx.dialogs.PopTip.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L3e
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM_INSIDE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        private java.util.List<android.view.View> blurViews;
        public android.widget.LinearLayout boxBody;
        public android.widget.RelativeLayout boxCustom;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        public android.widget.ImageView imgDialogxPopIcon;
        final /* synthetic */ com.kongzue.dialogx.dialogs.PopTip this$0;
        public android.widget.TextView txtDialogxButton;
        public android.widget.TextView txtDialogxPopText;










        public DialogImpl(com.kongzue.dialogx.dialogs.PopTip r2, android.view.View r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                if (r3 != 0) goto L8
                return
            L8:
                com.kongzue.dialogx.dialogs.PopTip.access$000(r2, r3)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r3.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r1.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.box_body
                android.view.View r0 = r3.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r1.boxBody = r0
                int r0 = com.kongzue.dialogx.R.id.img_dialogx_pop_icon
                android.view.View r0 = r3.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.imgDialogxPopIcon = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialogx_pop_text
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogxPopText = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r0 = r3.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r1.boxCustom = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialogx_button
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogxButton = r0
                java.util.List r3 = com.kongzue.dialogx.dialogs.PopTip.access$100(r2, r3)
                r1.blurViews = r3
                r1.init()
                r2.dialogImpl = r1
                r1.refreshView()
                return
        }

        public static /* synthetic */ void access$4500(com.kongzue.dialogx.dialogs.PopTip.DialogImpl r0) {
                r0.applyPopTipAlign()
                return
        }

        private void applyPopTipAlign() {
                r6 = this;
                android.widget.LinearLayout r0 = r6.boxBody
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                com.kongzue.dialogx.dialogs.PopTip r1 = r6.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r2 = r1.align
                if (r2 != 0) goto L12
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r2 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
                r1.align = r2
            L12:
                int[] r2 = com.kongzue.dialogx.dialogs.PopTip.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 1
                r3 = 13
                r4 = 12
                r5 = 10
                if (r1 == r2) goto L40
                r2 = 2
                if (r1 == r2) goto L36
                r2 = 3
                if (r1 == r2) goto L2c
                goto L49
            L2c:
                r0.removeRule(r5)
                r0.removeRule(r4)
                r0.addRule(r3)
                goto L49
            L36:
                r0.removeRule(r5)
                r0.removeRule(r3)
                r0.addRule(r4)
                goto L49
            L40:
                r0.removeRule(r4)
                r0.removeRule(r3)
                r0.addRule(r5)
            L49:
                android.widget.LinearLayout r1 = r6.boxBody
                r1.setLayoutParams(r0)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r2) {
                r1 = this;
                com.kongzue.dialogx.dialogs.PopTip r0 = r1.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                if (r2 == 0) goto Lf
                r0 = 0
                r2.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.PopTip r2 = r1.this$0
                boolean r2 = com.kongzue.dialogx.dialogs.PopTip.access$2500(r2)
                if (r2 != 0) goto L2b
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r1.boxRoot
                if (r2 == 0) goto L2b
                com.kongzue.dialogx.dialogs.PopTip r2 = r1.this$0
                r0 = 1
                com.kongzue.dialogx.dialogs.PopTip.access$2602(r2, r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r1.boxRoot
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$8 r0 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$8
                r0.<init>(r1)
                r2.post(r0)
            L2b:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$9 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$9
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                android.widget.LinearLayout r0 = r6.boxBody
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                android.widget.LinearLayout r7 = r6.boxBody
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
                long r4 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L2b
                r2 = r4
            L2b:
                com.kongzue.dialogx.dialogs.PopTip r7 = r6.this$0
                long r4 = com.kongzue.dialogx.dialogs.PopTip.access$3200(r7)
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L3b
                com.kongzue.dialogx.dialogs.PopTip r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.PopTip.access$3300(r7)
            L3b:
                return r2
        }

        public long getExitAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                android.widget.LinearLayout r0 = r6.boxBody
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                android.widget.LinearLayout r7 = r6.boxBody
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
                long r4 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L2b
                r2 = r4
            L2b:
                com.kongzue.dialogx.dialogs.PopTip r7 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.PopTip.access$3000(r7)
                r4 = -1
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 == 0) goto L3d
                com.kongzue.dialogx.dialogs.PopTip r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.PopTip.access$3100(r7)
            L3d:
                return r2
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r2 = this;
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.PopTip r1 = r2.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                com.kongzue.dialogx.util.TextInfo r1 = r0.messageTextInfo
                if (r1 != 0) goto L1a
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.popTextInfo
                r0.messageTextInfo = r1
            L1a:
                com.kongzue.dialogx.util.TextInfo r1 = r0.buttonTextInfo
                if (r1 != 0) goto L22
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.buttonTextInfo
                r0.buttonTextInfo = r1
            L22:
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.PopTip.access$200(r0)
                if (r0 != 0) goto L2f
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                java.lang.Integer r1 = com.kongzue.dialogx.DialogX.backgroundColor
                com.kongzue.dialogx.dialogs.PopTip.access$302(r0, r1)
            L2f:
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                java.util.Timer r1 = r0.autoDismissTimer
                if (r1 != 0) goto L38
                r0.showShort()
            L38:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.PopTip r1 = r2.this$0
                com.kongzue.dialogx.dialogs.PopTip r1 = r1.me
                r0.setParentDialog(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                r1 = 1
                r0.setAutoUnsafePlacePadding(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$1
                r1.<init>(r2)
                r0.setOnLifecycleCallBack(r1)
                r2.applyPopTipAlign()
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$2
                r1.<init>(r2)
                r0.setOnSafeInsetsChangeListener(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$3
                r1.<init>(r2)
                r0.setOnBackPressedListener(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$4
                r1.<init>(r2)
                r0.post(r1)
                android.widget.TextView r0 = r2.txtDialogxButton
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$5
                r1.<init>(r2)
                r0.setOnClickListener(r1)
                com.kongzue.dialogx.dialogs.PopTip r0 = r2.this$0
                com.kongzue.dialogx.dialogs.PopTip.access$1200(r0)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r9 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                if (r0 == 0) goto L199
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                android.app.Activity r0 = r0.getOwnActivity()
                if (r0 != 0) goto Le
                goto L199
            Le:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                com.kongzue.dialogx.dialogs.PopTip r1 = r9.this$0
                int[] r1 = com.kongzue.dialogx.dialogs.PopTip.access$1300(r1)
                r2 = 0
                r1 = r1[r2]
                com.kongzue.dialogx.dialogs.PopTip r3 = r9.this$0
                int[] r3 = com.kongzue.dialogx.dialogs.PopTip.access$1400(r3)
                r4 = 1
                r3 = r3[r4]
                com.kongzue.dialogx.dialogs.PopTip r5 = r9.this$0
                int[] r5 = com.kongzue.dialogx.dialogs.PopTip.access$1500(r5)
                r6 = 2
                r5 = r5[r6]
                com.kongzue.dialogx.dialogs.PopTip r7 = r9.this$0
                int[] r7 = com.kongzue.dialogx.dialogs.PopTip.access$1600(r7)
                r8 = 3
                r7 = r7[r8]
                r0.setRootPadding(r1, r3, r5, r7)
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.PopTip.access$1700(r0)
                if (r0 == 0) goto L7d
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                android.widget.LinearLayout r1 = r9.boxBody
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.PopTip.access$1800(r0)
                int r3 = r3.intValue()
                r0.tintColor(r1, r3)
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                android.widget.TextView r1 = r9.txtDialogxButton
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.PopTip.access$1900(r0)
                int r3 = r3.intValue()
                r0.tintColor(r1, r3)
                java.util.List<android.view.View> r0 = r9.blurViews
                if (r0 == 0) goto L7d
                java.util.Iterator r0 = r0.iterator()
            L65:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L7d
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.PopTip r3 = r9.this$0
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.PopTip.access$2000(r3)
                r1.setOverlayColor(r3)
                goto L65
            L7d:
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r0 = r0.onBindView
                r1 = 8
                if (r0 == 0) goto L9c
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L9c
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r3 = r0.onBindView
                android.widget.RelativeLayout r5 = r9.boxCustom
                com.kongzue.dialogx.dialogs.PopTip r0 = r0.me
                r3.bindParent(r5, r0)
                android.widget.RelativeLayout r0 = r9.boxCustom
                r0.setVisibility(r2)
                goto La1
            L9c:
                android.widget.RelativeLayout r0 = r9.boxCustom
                r0.setVisibility(r1)
            La1:
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                android.widget.TextView r3 = r9.txtDialogxPopText
                java.lang.CharSequence r5 = r0.message
                com.kongzue.dialogx.dialogs.PopTip.access$2100(r0, r3, r5)
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                android.widget.TextView r3 = r9.txtDialogxButton
                java.lang.CharSequence r5 = r0.buttonText
                com.kongzue.dialogx.dialogs.PopTip.access$2200(r0, r3, r5)
                android.widget.TextView r0 = r9.txtDialogxPopText
                com.kongzue.dialogx.dialogs.PopTip r3 = r9.this$0
                com.kongzue.dialogx.util.TextInfo r3 = r3.messageTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r3)
                android.widget.TextView r0 = r9.txtDialogxButton
                com.kongzue.dialogx.dialogs.PopTip r3 = r9.this$0
                com.kongzue.dialogx.util.TextInfo r3 = r3.buttonTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r3)
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                int r0 = r0.iconResId
                r3 = 0
                if (r0 == 0) goto Lf4
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                com.kongzue.dialogx.dialogs.PopTip r1 = r9.this$0
                int r1 = r1.iconResId
                r0.setImageResource(r1)
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                boolean r0 = r0.isTintIcon()
                if (r0 == 0) goto Lee
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                android.widget.TextView r1 = r9.txtDialogxPopText
                android.content.res.ColorStateList r1 = r1.getTextColors()
                r0.setImageTintList(r1)
                goto Lf9
            Lee:
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setImageTintList(r3)
                goto Lf9
            Lf4:
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setVisibility(r1)
            Lf9:
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                float r0 = r0.backgroundRadius
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L14f
                android.widget.LinearLayout r0 = r9.boxBody
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
                if (r0 == 0) goto L11e
                android.widget.LinearLayout r0 = r9.boxBody
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                if (r0 == 0) goto L11e
                com.kongzue.dialogx.dialogs.PopTip r1 = r9.this$0
                float r1 = r1.backgroundRadius
                r0.setCornerRadius(r1)
            L11e:
                android.widget.LinearLayout r0 = r9.boxBody
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$6
                r1.<init>(r9)
                r0.setOutlineProvider(r1)
                android.widget.LinearLayout r0 = r9.boxBody
                r0.setClipToOutline(r4)
                java.util.List<android.view.View> r0 = r9.blurViews
                if (r0 == 0) goto L14f
                java.util.Iterator r0 = r0.iterator()
            L135:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L14f
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.PopTip r5 = r9.this$0
                float r5 = r5.backgroundRadius
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r1.setRadiusPx(r5)
                goto L135
            L14f:
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r0 = r0.onPopTipClickListener
                if (r0 == 0) goto L160
                android.widget.LinearLayout r0 = r9.boxBody
                com.kongzue.dialogx.dialogs.PopTip$DialogImpl$7 r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl$7
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                goto L16a
            L160:
                android.widget.LinearLayout r0 = r9.boxBody
                r0.setOnClickListener(r3)
                android.widget.LinearLayout r0 = r9.boxBody
                r0.setClickable(r2)
            L16a:
                android.widget.LinearLayout r0 = r9.boxBody
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                com.kongzue.dialogx.dialogs.PopTip r1 = r9.this$0
                int[] r1 = r1.bodyMargin
                r2 = r1[r2]
                r3 = -1
                if (r2 == r3) goto L17d
                r0.leftMargin = r2
            L17d:
                r2 = r1[r4]
                if (r2 == r3) goto L183
                r0.topMargin = r2
            L183:
                r2 = r1[r6]
                if (r2 == r3) goto L189
                r0.rightMargin = r2
            L189:
                r1 = r1[r8]
                if (r1 == r3) goto L18f
                r0.bottomMargin = r1
            L18f:
                android.widget.LinearLayout r1 = r9.boxBody
                r1.setLayoutParams(r0)
                com.kongzue.dialogx.dialogs.PopTip r0 = r9.this$0
                com.kongzue.dialogx.dialogs.PopTip.access$2400(r0)
            L199:
                return
        }
    }

    static {
            return
    }

    public PopTip() {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            return
    }

    public PopTip(int r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.message = r4
            return
    }

    public PopTip(int r4, int r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.message = r4
            java.lang.String r4 = r3.getString(r5)
            r3.buttonText = r4
            return
    }

    public PopTip(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            java.lang.String r4 = r3.getString(r5)
            r3.message = r4
            java.lang.String r4 = r3.getString(r6)
            r3.buttonText = r4
            return
    }

    public PopTip(int r4, int r5, int r6, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r7) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            java.lang.String r4 = r3.getString(r5)
            r3.message = r4
            java.lang.String r4 = r3.getString(r6)
            r3.buttonText = r4
            r3.onBindView = r7
            return
    }

    public PopTip(int r4, int r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.message = r4
            java.lang.String r4 = r3.getString(r5)
            r3.buttonText = r4
            r3.onBindView = r6
            return
    }

    public PopTip(int r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.message = r4
            r3.onBindView = r5
            return
    }

    public PopTip(int r4, java.lang.CharSequence r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.message = r5
            return
    }

    public PopTip(int r4, java.lang.CharSequence r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.message = r5
            r3.onBindView = r6
            return
    }

    public PopTip(int r4, java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.message = r5
            r3.buttonText = r6
            return
    }

    public PopTip(int r4, java.lang.CharSequence r5, java.lang.CharSequence r6, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r7) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.message = r5
            r3.buttonText = r6
            r3.onBindView = r7
            return
    }

    public PopTip(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.onBindView = r4
            return
    }

    public PopTip(java.lang.CharSequence r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.message = r4
            return
    }

    public PopTip(java.lang.CharSequence r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.message = r4
            r3.onBindView = r5
            return
    }

    public PopTip(java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.message = r4
            r3.buttonText = r5
            return
    }

    public PopTip(java.lang.CharSequence r4, java.lang.CharSequence r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius
            float r1 = (float) r1
            r3.backgroundRadius = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            r2 = 1
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r2)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r3.preRecycle = r0
            r3.message = r4
            r3.buttonText = r5
            r3.onBindView = r6
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.PopTip r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ java.util.List access$100(com.kongzue.dialogx.dialogs.PopTip r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static /* synthetic */ void access$1000(com.kongzue.dialogx.dialogs.PopTip r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$1100(com.kongzue.dialogx.dialogs.PopTip r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$1200(com.kongzue.dialogx.dialogs.PopTip r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ int[] access$1300(com.kongzue.dialogx.dialogs.PopTip r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1400(com.kongzue.dialogx.dialogs.PopTip r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1500(com.kongzue.dialogx.dialogs.PopTip r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$1600(com.kongzue.dialogx.dialogs.PopTip r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1700(com.kongzue.dialogx.dialogs.PopTip r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1800(com.kongzue.dialogx.dialogs.PopTip r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1900(com.kongzue.dialogx.dialogs.PopTip r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$200(com.kongzue.dialogx.dialogs.PopTip r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2000(com.kongzue.dialogx.dialogs.PopTip r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$2100(com.kongzue.dialogx.dialogs.PopTip r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$2200(com.kongzue.dialogx.dialogs.PopTip r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$2300(com.kongzue.dialogx.dialogs.PopTip r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$2400(com.kongzue.dialogx.dialogs.PopTip r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$2500(com.kongzue.dialogx.dialogs.PopTip r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$2602(com.kongzue.dialogx.dialogs.PopTip r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$2700(com.kongzue.dialogx.dialogs.PopTip r0) {
            r0.waitForDismiss()
            return
    }

    public static /* synthetic */ void access$2800(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ void access$2900(com.kongzue.dialogx.dialogs.PopTip r0) {
            r0.moveFront()
            return
    }

    public static /* synthetic */ long access$3000(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$302(com.kongzue.dialogx.dialogs.PopTip r0, java.lang.Integer r1) {
            r0.backgroundColor = r1
            return r1
    }

    public static /* synthetic */ long access$3100(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$3200(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$3300(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$3400(com.kongzue.dialogx.dialogs.PopTip r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$3500(com.kongzue.dialogx.dialogs.PopTip r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ boolean access$3600(com.kongzue.dialogx.dialogs.PopTip r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ int access$3700(com.kongzue.dialogx.dialogs.PopTip r0) {
            int r0 = r0.countDisplayPopTipsNum()
            return r0
    }

    public static /* synthetic */ long access$3800(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$3900(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$4000(com.kongzue.dialogx.dialogs.PopTip r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ boolean access$402(com.kongzue.dialogx.dialogs.PopTip r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$4100(com.kongzue.dialogx.dialogs.PopTip r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ boolean access$4200(com.kongzue.dialogx.dialogs.PopTip r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ long access$4300(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4400(com.kongzue.dialogx.dialogs.PopTip r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ boolean access$502(com.kongzue.dialogx.dialogs.PopTip r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ void access$600(com.kongzue.dialogx.dialogs.PopTip r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$700(com.kongzue.dialogx.dialogs.PopTip r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ boolean access$802(com.kongzue.dialogx.dialogs.PopTip r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$900(com.kongzue.dialogx.dialogs.PopTip r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static com.kongzue.dialogx.dialogs.PopTip build() {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip r1 = r0.setStyle(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.PopTip build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip r1 = r0.setCustomView(r1)
            return r1
    }

    private int countDisplayPopTipsNum() {
            r3 = this;
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r1
        L7:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r2 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r2 = r2.size()
            if (r1 >= r2) goto L22
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r2 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            java.lang.Object r2 = r2.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            if (r2 == 0) goto L1f
            boolean r2 = r2.preRecycle
            if (r2 != 0) goto L1f
            int r0 = r0 + 1
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            return r0
    }

    private void moveBack() {
            r2 = this;
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            if (r0 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            android.widget.LinearLayout r0 = r0.boxBody
            if (r0 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            if (r0 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            android.widget.LinearLayout r0 = r0.boxBody
            if (r0 != 0) goto L1d
            goto L2c
        L1d:
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            android.widget.LinearLayout r0 = r0.boxBody
            com.kongzue.dialogx.dialogs.PopTip$2 r1 = new com.kongzue.dialogx.dialogs.PopTip$2
            r1.<init>(r2, r0)
            r0.post(r1)
        L2c:
            return
    }

    private void moveFront() {
            r2 = this;
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            if (r0 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            android.widget.LinearLayout r0 = r0.boxBody
            if (r0 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            if (r0 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            android.widget.LinearLayout r0 = r0.boxBody
            if (r0 != 0) goto L1d
            goto L2c
        L1d:
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r2.getDialogImpl()
            android.widget.LinearLayout r0 = r0.boxBody
            com.kongzue.dialogx.dialogs.PopTip$3 r1 = new com.kongzue.dialogx.dialogs.PopTip$3
            r1.<init>(r2, r0)
            r0.post(r1)
        L2c:
            return
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, int r2) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, int r2, int r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r4) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, int r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r3) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r2) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, java.lang.CharSequence r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r3) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r4) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(java.lang.CharSequence r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r2) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip show(java.lang.CharSequence r1, java.lang.CharSequence r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r3) {
            com.kongzue.dialogx.dialogs.PopTip r0 = new com.kongzue.dialogx.dialogs.PopTip
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip tip(int r0) {
            com.kongzue.dialogx.dialogs.PopTip r0 = show(r0)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip tip(int r0, int r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = show(r0, r1)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip tip(int r0, java.lang.String r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = show(r0, r1)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip tip(int r0, java.lang.String r1, java.lang.String r2) {
            com.kongzue.dialogx.dialogs.PopTip r0 = show(r0, r1, r2)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip tip(java.lang.String r0) {
            com.kongzue.dialogx.dialogs.PopTip r0 = show(r0)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopTip tip(java.lang.String r0, java.lang.String r1) {
            com.kongzue.dialogx.dialogs.PopTip r0 = show(r0, r1)
            return r0
    }

    private void waitForDismiss() {
            r2 = this;
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            r0 = 1
            r2.preRecycle = r0
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L1d
            android.view.View r0 = r2.getDialogView()
            r1 = 8
            r0.setVisibility(r1)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r1 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r1)
            Yue.ۥۡۤۤۢ r1 = new Yue.ۥۡۤۤۢ
            r1.<init>()
            r0.removeIf(r1)
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
        L33:
            return
    }

    public com.kongzue.dialogx.dialogs.PopTip appendMessage(java.lang.CharSequence r4) {
            r3 = this;
            java.lang.CharSequence r0 = r3.message
            r1 = 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r1)
            r3.message = r4
            r3.refreshUI()
            return r3
    }

    public com.kongzue.dialogx.dialogs.PopTip autoDismiss(long r3) {
            r2 = this;
            r2.autoDismissDelay = r3
            java.util.Timer r0 = r2.autoDismissTimer
            if (r0 == 0) goto L9
            r0.cancel()
        L9:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L10
            return r2
        L10:
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r2.autoDismissTimer = r0
            com.kongzue.dialogx.dialogs.PopTip$1 r1 = new com.kongzue.dialogx.dialogs.PopTip$1
            r1.<init>(r2)
            r0.schedule(r1, r3)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip bringToFront() {
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

    public com.kongzue.dialogx.dialogs.PopTip cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void cleanActivityContext() {
            r1 = this;
            super.cleanActivityContext()
            android.view.View r0 = r1.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopTip cleanAllAction() {
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
            com.kongzue.dialogx.dialogs.PopTip$5 r0 = new com.kongzue.dialogx.dialogs.PopTip$5
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN getAlign() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = r1.align
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    public java.lang.CharSequence getButtonText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.buttonText
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getButtonTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.buttonTextInfo
            return r0
    }

    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopTip> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopTip> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.PopTip$6 r0 = new com.kongzue.dialogx.dialogs.PopTip$6
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> r0 = r1.dialogXAnimImpl
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

    public int getIconResId() {
            r1 = this;
            int r0 = r1.iconResId
            return r0
    }

    public int getMarginBottom() {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 3
            r0 = r0[r1]
            return r0
    }

    public int getMarginLeft() {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getMarginRight() {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    public int getMarginTop() {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public java.lang.CharSequence getMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.message
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getMessageTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.messageTextInfo
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> getOnButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r0 = r1.onButtonClickListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> getOnPopTipClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r0 = r1.onPopTipClickListener
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
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L12
            android.view.View r0 = r2.getDialogView()
            r1 = 8
            r0.setVisibility(r1)
        L12:
            return
    }

    public com.kongzue.dialogx.dialogs.PopTip iconError() {
            r2 = this;
            r0 = 0
            r2.setTintIcon(r0)
            int r0 = com.kongzue.dialogx.R.mipmap.ico_dialogx_error
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            int r1 = r1.defaultIconError()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            int r0 = r0.defaultIconError()
        L2a:
            r2.setIconResId(r0)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip iconSuccess() {
            r2 = this;
            r0 = 0
            r2.setTintIcon(r0)
            int r0 = com.kongzue.dialogx.R.mipmap.ico_dialogx_success
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            int r1 = r1.defaultIconSuccess()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            int r0 = r0.defaultIconSuccess()
        L2a:
            r2.setIconResId(r0)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip iconWarning() {
            r2 = this;
            r0 = 0
            r2.setTintIcon(r0)
            int r0 = com.kongzue.dialogx.R.mipmap.ico_dialogx_warning
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            int r1 = r1.defaultIconWarning()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            int r0 = r0.defaultIconWarning()
        L2a:
            r2.setIconResId(r0)
            return r2
    }

    @java.lang.Deprecated
    public boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            boolean r0 = r1.isTintIcon()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isTintIcon() {
            r2 = this;
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = r2.tintIcon
            if (r0 != 0) goto L1b
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            if (r0 == 0) goto L1b
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r0 = r0.tintIcon()
            return r0
        L1b:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = r2.tintIcon
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r1) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip noAutoDismiss() {
            r2 = this;
            r0 = -1
            r2.autoDismiss(r0)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopTip> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.PopTip r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.PopTip onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopTip> r1) {
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

    public void onShow(com.kongzue.dialogx.dialogs.PopTip r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.PopTip$4 r0 = new com.kongzue.dialogx.dialogs.PopTip$4
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopTip removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    public void resetAutoDismissTimer() {
            r2 = this;
            long r0 = r2.autoDismissDelay
            r2.autoDismiss(r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r6 = this;
            android.view.View r0 = r6.getDialogView()
            r1 = 0
            if (r0 == 0) goto L10
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r6.isShow = r1
        L10:
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r6.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r6.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopTip
            if (r0 == 0) goto L45
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L3e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r0 = (com.kongzue.dialogx.dialogs.PopTip) r0
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L80
            r0.dismiss()
            goto L80
        L45:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L80
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r2 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r2)
        L50:
            int r2 = r0.size()
            if (r1 >= r2) goto L80
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            if (r3 >= r4) goto L68
            r2.moveBack()
            goto L7d
        L68:
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L7a
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r3 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r3.remove(r2)
            goto L7d
        L7a:
            r2.moveBack()
        L7d:
            int r1 = r1 + 1
            goto L50
        L80:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 != 0) goto L8b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip.popTipList = r0
        L8b:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L99
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material
            goto L9b
        L99:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material_dark
        L9b:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L136
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Lc1
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Lc1:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r6.align
            if (r1 != 0) goto Le2
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            if (r1 != 0) goto Ld6
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
            r6.align = r1
            goto Le2
        Ld6:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            r6.align = r1
        Le2:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r2 = r2.popTipSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto L10c
            int r3 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterAnimRes
            if (r3 != 0) goto L10c
            if (r1 == 0) goto L109
            goto L10d
        L109:
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            goto L10d
        L10c:
            r1 = r3
        L10d:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto L11d
            int r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitAnimRes
            if (r1 != 0) goto L11d
            if (r2 == 0) goto L11a
            goto L11e
        L11a:
            int r2 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            goto L11e
        L11d:
            r2 = r1
        L11e:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L12a
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
        L12a:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L134
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
        L134:
            r6.exitAnimDuration = r1
        L136:
            r1 = 0
            r6.enterAnimDuration = r1
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L14c
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L14c:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl
            r1.<init>(r6, r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L15e
            com.kongzue.dialogx.dialogs.PopTip r1 = r6.me
            r0.setTag(r1)
        L15e:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopTip setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopTip> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopTip setAlign(com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN r1) {
            r0 = this;
            r0.align = r1
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = r0.getDialogImpl()
            if (r1 == 0) goto Lf
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = r0.getDialogImpl()
            com.kongzue.dialogx.dialogs.PopTip.DialogImpl.access$4500(r1)
        Lf:
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setAnimResId(int r1, int r2) {
            r0 = this;
            r0.enterAnimResId = r1
            r0.exitAnimResId = r2
            return r0
    }

    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.PopTip setAutoTintIconInLightOrDarkMode(boolean r1) {
            r0 = this;
            r0.setTintIcon(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.buttonText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.buttonText = r1
            r0.onButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r1) {
            r0 = this;
            r0.onButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.buttonText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r2) {
            r0 = this;
            r0.buttonText = r1
            r0.onButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setButtonTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.buttonTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopTip setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopTip> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopTip setData(java.lang.String r2, java.lang.Object r3) {
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
            com.kongzue.dialogx.dialogs.PopTip r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopTip setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopTip> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.PopTip r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopTip setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopTip> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setEnterAnimResId(int r1) {
            r0 = this;
            r0.enterAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setExitAnimResId(int r1) {
            r0 = this;
            r0.exitAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setIconResId(int r1) {
            r0 = this;
            r0.iconResId = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setMargin(int r3, int r4, int r5, int r6) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip setMarginBottom(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 3
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip setMarginLeft(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 0
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip setMarginRight(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 2
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip setMarginTop(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 1
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setOnButtonClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r1) {
            r0 = this;
            r0.onButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setOnPopTipClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopTip> r1) {
            r0 = this;
            r0.onPopTipClickListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopTip setThisOrderIndex(int r2) {
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
            com.kongzue.dialogx.dialogs.PopTip r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopTip setTintIcon(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            goto L7
        L5:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.FALSE
        L7:
            r0.tintIcon = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopTip show() {
            r6 = this;
            boolean r0 = r6.isHide
            r1 = 0
            if (r0 == 0) goto L13
            android.view.View r0 = r6.getDialogView()
            if (r0 == 0) goto L13
            android.view.View r0 = r6.getDialogView()
            r0.setVisibility(r1)
            return r6
        L13:
            super.beforeShow()
            android.view.View r0 = r6.getDialogView()
            if (r0 != 0) goto L159
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopTip
            if (r0 == 0) goto L40
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L39
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r0 = (com.kongzue.dialogx.dialogs.PopTip) r0
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L7b
            r0.dismiss()
            goto L7b
        L40:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L7b
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r2 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r2)
        L4b:
            int r2 = r0.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            if (r3 >= r4) goto L63
            r2.moveBack()
            goto L78
        L63:
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L75
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r3 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r3.remove(r2)
            goto L78
        L75:
            r2.moveBack()
        L78:
            int r1 = r1 + 1
            goto L4b
        L7b:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 != 0) goto L86
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip.popTipList = r0
        L86:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L94
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material
            goto L96
        L94:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material_dark
        L96:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L131
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Lbc
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Lbc:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r6.align
            if (r1 != 0) goto Ldd
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            if (r1 != 0) goto Ld1
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
            r6.align = r1
            goto Ldd
        Ld1:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            r6.align = r1
        Ldd:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r2 = r2.popTipSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto L107
            int r3 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterAnimRes
            if (r3 != 0) goto L107
            if (r1 == 0) goto L104
            goto L108
        L104:
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            goto L108
        L107:
            r1 = r3
        L108:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto L118
            int r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitAnimRes
            if (r1 != 0) goto L118
            if (r2 == 0) goto L115
            goto L119
        L115:
            int r2 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            goto L119
        L118:
            r2 = r1
        L119:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L125
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
        L125:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L12f
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
        L12f:
            r6.exitAnimDuration = r1
        L131:
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L143
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L143:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl
            r1.<init>(r6, r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L155
            com.kongzue.dialogx.dialogs.PopTip r1 = r6.me
            r0.setTag(r1)
        L155:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L160
        L159:
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L160:
            return r6
    }

    public com.kongzue.dialogx.dialogs.PopTip show(android.app.Activity r7) {
            r6 = this;
            super.beforeShow()
            android.view.View r0 = r6.getDialogView()
            if (r0 != 0) goto L147
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopTip
            if (r0 == 0) goto L2d
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r0 = (com.kongzue.dialogx.dialogs.PopTip) r0
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L69
            r0.dismiss()
            goto L69
        L2d:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L69
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r1 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r1)
            r1 = 0
        L39:
            int r2 = r0.size()
            if (r1 >= r2) goto L69
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            if (r3 >= r4) goto L51
            r2.moveBack()
            goto L66
        L51:
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L63
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r3 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r3.remove(r2)
            goto L66
        L63:
            r2.moveBack()
        L66:
            int r1 = r1 + 1
            goto L39
        L69:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 != 0) goto L74
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip.popTipList = r0
        L74:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L82
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material
            goto L84
        L82:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material_dark
        L84:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L11f
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Laa
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Laa:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r6.align
            if (r1 != 0) goto Lcb
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            if (r1 != 0) goto Lbf
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
            r6.align = r1
            goto Lcb
        Lbf:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            r6.align = r1
        Lcb:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r2 = r2.popTipSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto Lf5
            int r3 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterAnimRes
            if (r3 != 0) goto Lf5
            if (r1 == 0) goto Lf2
            goto Lf6
        Lf2:
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            goto Lf6
        Lf5:
            r1 = r3
        Lf6:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto L106
            int r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitAnimRes
            if (r1 != 0) goto L106
            if (r2 == 0) goto L103
            goto L107
        L103:
            int r2 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            goto L107
        L106:
            r2 = r1
        L107:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L113
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
        L113:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L11d
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
        L11d:
            r6.exitAnimDuration = r1
        L11f:
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L131
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L131:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl
            r1.<init>(r6, r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L143
            com.kongzue.dialogx.dialogs.PopTip r1 = r6.me
            r0.setTag(r1)
        L143:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r7, r0)
            goto L14e
        L147:
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r7, r0)
        L14e:
            return r6
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopTip r0 = r1.show()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip showAlways() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopTip r0 = r1.noAutoDismiss()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopTip showLong() {
            r2 = this;
            r0 = 3500(0xdac, double:1.729E-320)
            r2.autoDismiss(r0)
            boolean r0 = r2.preShow
            if (r0 != 0) goto L10
            boolean r0 = r2.isShow
            if (r0 != 0) goto L10
            r2.show()
        L10:
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopTip showShort() {
            r2 = this;
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.autoDismiss(r0)
            boolean r0 = r2.preShow
            if (r0 != 0) goto L10
            boolean r0 = r2.isShow
            if (r0 != 0) goto L10
            r2.show()
        L10:
            return r2
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
