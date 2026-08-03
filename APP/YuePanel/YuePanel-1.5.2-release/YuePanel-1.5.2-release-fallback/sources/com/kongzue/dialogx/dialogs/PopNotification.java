package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class PopNotification extends com.kongzue.dialogx.interfaces.BaseDialog implements com.kongzue.dialogx.interfaces.NoTouchInterface {
    public static final int TIME_NO_AUTO_DISMISS_DELAY = -1;
    public static int maxShowCount = Integer.MAX_VALUE;
    public static com.kongzue.dialogx.interfaces.PopMoveDisplacementInterceptor<com.kongzue.dialogx.dialogs.PopNotification> moveDisplacementInterceptor = null;
    public static int overrideEnterAnimRes = 0;
    public static long overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static long overrideExitDuration = -1;
    protected static java.util.List<com.kongzue.dialogx.dialogs.PopNotification> popNotificationList;
    protected com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN align;
    protected long autoDismissDelay;
    protected java.util.Timer autoDismissTimer;
    protected boolean autoTintIconInLightOrDarkMode;
    protected float backgroundRadius;
    protected int[] bodyMargin;
    protected java.lang.CharSequence buttonText;
    protected com.kongzue.dialogx.util.TextInfo buttonTextInfo;
    private float defaultTop;
    protected com.kongzue.dialogx.dialogs.PopNotification.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopNotification> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> dialogXAnimImpl;
    protected int enterAnimResId;
    protected int exitAnimResId;
    protected android.graphics.Bitmap iconBitmap;
    protected android.graphics.drawable.Drawable iconDrawable;
    protected int iconResId;
    protected int iconSize;
    protected com.kongzue.dialogx.dialogs.PopNotification me;
    protected java.lang.CharSequence message;
    protected com.kongzue.dialogx.util.TextInfo messageTextInfo;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> onBindView;
    protected com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> onButtonClickListener;
    protected com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> onPopNotificationClickListener;
    protected boolean preRecycle;
    protected boolean slideToClose;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN tintIcon;
    protected java.lang.CharSequence title;
    protected com.kongzue.dialogx.util.TextInfo titleTextInfo;







    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.PopNotification$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN = null;

        static {
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN[] r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN = r0
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP_INSIDE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN     // Catch: java.lang.NoSuchFieldError -> L3e
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM_INSIDE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        private java.util.List<android.view.View> blurViews;
        public android.view.ViewGroup boxBody;
        public android.widget.RelativeLayout boxCustom;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        public android.widget.ImageView imgDialogxPopIcon;
        final /* synthetic */ com.kongzue.dialogx.dialogs.PopNotification this$0;
        public android.widget.TextView txtDialogxButton;
        public android.widget.TextView txtDialogxPopMessage;
        public android.widget.TextView txtDialogxPopTitle;












        public DialogImpl(com.kongzue.dialogx.dialogs.PopNotification r2, android.view.View r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                if (r3 != 0) goto L8
                return
            L8:
                com.kongzue.dialogx.dialogs.PopNotification.access$000(r2, r3)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r3.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r1.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.box_body
                android.view.View r0 = r3.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r1.boxBody = r0
                int r0 = com.kongzue.dialogx.R.id.img_dialogx_pop_icon
                android.view.View r0 = r3.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.imgDialogxPopIcon = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialogx_pop_title
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogxPopTitle = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialogx_pop_message
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogxPopMessage = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialogx_button
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogxButton = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r0 = r3.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r1.boxCustom = r0
                java.util.List r3 = com.kongzue.dialogx.dialogs.PopNotification.access$100(r2, r3)
                r1.blurViews = r3
                r1.init()
                r2.dialogImpl = r1
                r1.refreshView()
                return
        }

        public static /* synthetic */ java.util.List access$1700(com.kongzue.dialogx.dialogs.PopNotification.DialogImpl r0) {
                java.util.List<android.view.View> r0 = r0.blurViews
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r3) {
                r2 = this;
                com.kongzue.dialogx.dialogs.PopNotification r0 = r2.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                r0 = 0
                if (r3 == 0) goto Lf
                r3.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.PopNotification r3 = r2.this$0
                boolean r3 = com.kongzue.dialogx.dialogs.PopNotification.access$4100(r3)
                if (r3 != 0) goto L50
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.boxRoot
                if (r3 == 0) goto L50
                com.kongzue.dialogx.dialogs.PopNotification r3 = r2.this$0
                r1 = 1
                com.kongzue.dialogx.dialogs.PopNotification.access$4202(r3, r1)
                android.widget.RelativeLayout r3 = r2.boxCustom
                r1 = 8
                r3.setVisibility(r1)
                android.view.ViewGroup r3 = r2.boxBody
                r3.setFocusable(r0)
                android.view.ViewGroup r3 = r2.boxBody
                r3.setClickable(r0)
                android.view.ViewGroup r3 = r2.boxBody
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$9 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$9
                r1.<init>(r2)
                r3.setOnTouchListener(r1)
                android.widget.TextView r3 = r2.txtDialogxButton
                r3.setFocusable(r0)
                android.widget.TextView r3 = r2.txtDialogxButton
                r3.setClickable(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.boxRoot
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$10 r0 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$10
                r0.<init>(r2)
                r3.post(r0)
            L50:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.PopNotification r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$11 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$11
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                android.view.ViewGroup r0 = r6.boxBody
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                android.view.ViewGroup r7 = r6.boxBody
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
                long r4 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterDuration
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L2b
                r2 = r4
            L2b:
                com.kongzue.dialogx.dialogs.PopNotification r7 = r6.this$0
                long r4 = com.kongzue.dialogx.dialogs.PopNotification.access$4800(r7)
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L3b
                com.kongzue.dialogx.dialogs.PopNotification r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.PopNotification.access$4900(r7)
            L3b:
                return r2
        }

        public long getExitAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                android.view.ViewGroup r0 = r6.boxBody
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                android.view.ViewGroup r7 = r6.boxBody
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
                long r4 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitDuration
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L2b
                r2 = r4
            L2b:
                com.kongzue.dialogx.dialogs.PopNotification r7 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.PopNotification.access$4600(r7)
                r4 = -1
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 == 0) goto L3d
                com.kongzue.dialogx.dialogs.PopNotification r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.PopNotification.access$4700(r7)
            L3d:
                return r2
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r7 = this;
                com.kongzue.dialogx.dialogs.PopNotification r0 = r7.this$0
                com.kongzue.dialogx.util.TextInfo r1 = r0.titleTextInfo
                if (r1 != 0) goto La
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.titleTextInfo
                r0.titleTextInfo = r1
            La:
                com.kongzue.dialogx.util.TextInfo r1 = r0.messageTextInfo
                if (r1 != 0) goto L12
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.messageTextInfo
                r0.messageTextInfo = r1
            L12:
                com.kongzue.dialogx.util.TextInfo r1 = r0.buttonTextInfo
                if (r1 != 0) goto L1a
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.buttonTextInfo
                r0.buttonTextInfo = r1
            L1a:
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.PopNotification.access$200(r0)
                if (r0 != 0) goto L27
                com.kongzue.dialogx.dialogs.PopNotification r0 = r7.this$0
                java.lang.Integer r1 = com.kongzue.dialogx.DialogX.backgroundColor
                com.kongzue.dialogx.dialogs.PopNotification.access$302(r0, r1)
            L27:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r7.this$0
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.PopNotification r1 = r7.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r7.this$0
                java.util.Timer r1 = r0.autoDismissTimer
                if (r1 != 0) goto L40
                r0.showShort()
            L40:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                r1 = 0
                r0.setClickable(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                r0.setFocusable(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                com.kongzue.dialogx.dialogs.PopNotification r2 = r7.this$0
                com.kongzue.dialogx.dialogs.PopNotification r2 = r2.me
                r0.setParentDialog(r2)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                r0.setAutoUnsafePlacePadding(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$1
                r1.<init>(r7)
                r0.setOnLifecycleCallBack(r1)
                android.view.ViewGroup r0 = r7.boxBody
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                com.kongzue.dialogx.dialogs.PopNotification r1 = r7.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r2 = r1.align
                if (r2 != 0) goto L75
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r2 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
                r1.align = r2
            L75:
                int[] r2 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = r1.align
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 10
                r3 = 1
                r4 = 13
                if (r1 == r3) goto La5
                r5 = 2
                r6 = 12
                if (r1 == r5) goto L99
                r3 = 3
                if (r1 == r3) goto L8f
                goto Lab
            L8f:
                r0.removeRule(r2)
                r0.removeRule(r6)
                r0.addRule(r4)
                goto Lab
            L99:
                r0.removeRule(r4)
                r0.addRule(r6)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r7.boxRoot
                r1.setAutoUnsafePlacePadding(r3)
                goto Lab
            La5:
                r0.removeRule(r4)
                r0.addRule(r2)
            Lab:
                android.view.ViewGroup r1 = r7.boxBody
                r1.setLayoutParams(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$2
                r1.<init>(r7)
                r0.setOnSafeInsetsChangeListener(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$3
                r1.<init>(r7)
                r0.setOnBackPressedListener(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$4
                r1.<init>(r7)
                r0.post(r1)
                android.view.ViewGroup r0 = r7.boxBody
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$5
                r1.<init>(r7)
                r0.setOnClickListener(r1)
                android.widget.TextView r0 = r7.txtDialogxButton
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$6
                r1.<init>(r7)
                r0.setOnClickListener(r1)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r7.this$0
                com.kongzue.dialogx.dialogs.PopNotification.access$2600(r0)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r9 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r9.boxRoot
                if (r0 != 0) goto L5
                return
            L5:
                com.kongzue.dialogx.dialogs.PopNotification r1 = r9.this$0
                int[] r1 = com.kongzue.dialogx.dialogs.PopNotification.access$2700(r1)
                r2 = 0
                r1 = r1[r2]
                com.kongzue.dialogx.dialogs.PopNotification r3 = r9.this$0
                int[] r3 = com.kongzue.dialogx.dialogs.PopNotification.access$2800(r3)
                r4 = 1
                r3 = r3[r4]
                com.kongzue.dialogx.dialogs.PopNotification r5 = r9.this$0
                int[] r5 = com.kongzue.dialogx.dialogs.PopNotification.access$2900(r5)
                r6 = 2
                r5 = r5[r6]
                com.kongzue.dialogx.dialogs.PopNotification r7 = r9.this$0
                int[] r7 = com.kongzue.dialogx.dialogs.PopNotification.access$3000(r7)
                r8 = 3
                r7 = r7[r8]
                r0.setRootPadding(r1, r3, r5, r7)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.PopNotification.access$3100(r0)
                if (r0 == 0) goto L63
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                android.view.ViewGroup r1 = r9.boxBody
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.PopNotification.access$3200(r0)
                int r3 = r3.intValue()
                r0.tintColor(r1, r3)
                java.util.List<android.view.View> r0 = r9.blurViews
                if (r0 == 0) goto L63
                java.util.Iterator r0 = r0.iterator()
            L4b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.PopNotification r3 = r9.this$0
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.PopNotification.access$3300(r3)
                r1.setOverlayColor(r3)
                goto L4b
            L63:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r0 = r0.onBindView
                r1 = 8
                if (r0 == 0) goto L82
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L82
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r3 = r0.onBindView
                android.widget.RelativeLayout r5 = r9.boxCustom
                com.kongzue.dialogx.dialogs.PopNotification r0 = r0.me
                r3.bindParent(r5, r0)
                android.widget.RelativeLayout r0 = r9.boxCustom
                r0.setVisibility(r2)
                goto L87
            L82:
                android.widget.RelativeLayout r0 = r9.boxCustom
                r0.setVisibility(r1)
            L87:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                float r0 = r0.backgroundRadius
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 <= 0) goto Ldd
                android.view.ViewGroup r0 = r9.boxBody
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
                if (r0 == 0) goto Lac
                android.view.ViewGroup r0 = r9.boxBody
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                if (r0 == 0) goto Lac
                com.kongzue.dialogx.dialogs.PopNotification r3 = r9.this$0
                float r3 = r3.backgroundRadius
                r0.setCornerRadius(r3)
            Lac:
                android.view.ViewGroup r0 = r9.boxBody
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$7 r3 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$7
                r3.<init>(r9)
                r0.setOutlineProvider(r3)
                android.view.ViewGroup r0 = r9.boxBody
                r0.setClipToOutline(r4)
                java.util.List<android.view.View> r0 = r9.blurViews
                if (r0 == 0) goto Ldd
                java.util.Iterator r0 = r0.iterator()
            Lc3:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto Ldd
                java.lang.Object r3 = r0.next()
                android.view.View r3 = (android.view.View) r3
                com.kongzue.dialogx.interfaces.BlurViewType r3 = (com.kongzue.dialogx.interfaces.BlurViewType) r3
                com.kongzue.dialogx.dialogs.PopNotification r5 = r9.this$0
                float r5 = r5.backgroundRadius
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r3.setRadiusPx(r5)
                goto Lc3
            Ldd:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                android.widget.TextView r3 = r9.txtDialogxPopTitle
                java.lang.CharSequence r5 = r0.title
                com.kongzue.dialogx.dialogs.PopNotification.access$3400(r0, r3, r5)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                android.widget.TextView r3 = r9.txtDialogxPopMessage
                java.lang.CharSequence r5 = r0.message
                com.kongzue.dialogx.dialogs.PopNotification.access$3500(r0, r3, r5)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                android.widget.TextView r3 = r9.txtDialogxButton
                java.lang.CharSequence r5 = r0.buttonText
                com.kongzue.dialogx.dialogs.PopNotification.access$3600(r0, r3, r5)
                android.widget.TextView r0 = r9.txtDialogxPopTitle
                com.kongzue.dialogx.dialogs.PopNotification r3 = r9.this$0
                com.kongzue.dialogx.util.TextInfo r3 = r3.titleTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r3)
                android.widget.TextView r0 = r9.txtDialogxPopMessage
                com.kongzue.dialogx.dialogs.PopNotification r3 = r9.this$0
                com.kongzue.dialogx.util.TextInfo r3 = r3.messageTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r3)
                android.widget.TextView r0 = r9.txtDialogxButton
                com.kongzue.dialogx.dialogs.PopNotification r3 = r9.this$0
                com.kongzue.dialogx.util.TextInfo r3 = r3.buttonTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r3)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                android.graphics.Bitmap r0 = r0.iconBitmap
                if (r0 == 0) goto L12e
                boolean r0 = r0.isRecycled()
                if (r0 != 0) goto L12e
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                com.kongzue.dialogx.dialogs.PopNotification r1 = r9.this$0
                android.graphics.Bitmap r1 = r1.iconBitmap
                r0.setImageBitmap(r1)
                goto L15b
            L12e:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                android.graphics.drawable.Drawable r3 = r0.iconDrawable
                if (r3 == 0) goto L143
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                com.kongzue.dialogx.dialogs.PopNotification r1 = r9.this$0
                android.graphics.drawable.Drawable r1 = r1.iconDrawable
                r0.setImageDrawable(r1)
                goto L15b
            L143:
                int r0 = r0.iconResId
                if (r0 == 0) goto L156
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                com.kongzue.dialogx.dialogs.PopNotification r1 = r9.this$0
                int r1 = r1.iconResId
                r0.setImageResource(r1)
                goto L15b
            L156:
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setVisibility(r1)
            L15b:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = r0.tintIcon
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
                r5 = 0
                if (r1 != r3) goto L17a
                boolean r0 = r0.autoTintIconInLightOrDarkMode
                if (r0 == 0) goto L174
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                android.widget.TextView r1 = r9.txtDialogxPopTitle
                android.content.res.ColorStateList r1 = r1.getTextColors()
                r0.setImageTintList(r1)
                goto L17f
            L174:
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setImageTintList(r5)
                goto L17f
            L17a:
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                r0.setImageTintList(r5)
            L17f:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                int r0 = r0.iconSize
                if (r0 <= 0) goto L198
                android.widget.ImageView r0 = r9.imgDialogxPopIcon
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                com.kongzue.dialogx.dialogs.PopNotification r1 = r9.this$0
                int r1 = r1.iconSize
                r0.width = r1
                r0.height = r1
                android.widget.ImageView r1 = r9.imgDialogxPopIcon
                r1.setLayoutParams(r0)
            L198:
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                boolean r0 = r0.slideToClose
                if (r0 == 0) goto L1a9
                android.view.ViewGroup r0 = r9.boxBody
                com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$8 r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl$8
                r1.<init>(r9)
                r0.setOnTouchListener(r1)
                goto L1ae
            L1a9:
                android.view.ViewGroup r0 = r9.boxBody
                r0.setOnTouchListener(r5)
            L1ae:
                android.view.ViewGroup r0 = r9.boxBody
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                com.kongzue.dialogx.dialogs.PopNotification r1 = r9.this$0
                int[] r1 = r1.bodyMargin
                r2 = r1[r2]
                r3 = -1
                if (r2 == r3) goto L1c1
                r0.leftMargin = r2
            L1c1:
                r2 = r1[r4]
                if (r2 == r3) goto L1c7
                r0.topMargin = r2
            L1c7:
                r2 = r1[r6]
                if (r2 == r3) goto L1cd
                r0.rightMargin = r2
            L1cd:
                r1 = r1[r8]
                if (r1 == r3) goto L1d3
                r0.bottomMargin = r1
            L1d3:
                android.view.ViewGroup r1 = r9.boxBody
                r1.setLayoutParams(r0)
                com.kongzue.dialogx.dialogs.PopNotification r0 = r9.this$0
                com.kongzue.dialogx.dialogs.PopNotification.access$4000(r0)
                return
        }
    }

    static {
            return
    }

    public PopNotification() {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            return
    }

    public PopNotification(int r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.title = r4
            return
    }

    public PopNotification(int r4, int r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.title = r4
            java.lang.String r4 = r3.getString(r5)
            r3.message = r4
            return
    }

    public PopNotification(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            java.lang.String r4 = r3.getString(r5)
            r3.title = r4
            java.lang.String r4 = r3.getString(r6)
            r3.message = r4
            return
    }

    public PopNotification(int r4, int r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            java.lang.String r4 = r3.getString(r5)
            r3.title = r4
            java.lang.String r4 = r3.getString(r6)
            r3.message = r4
            java.lang.String r4 = r3.getString(r7)
            r3.buttonText = r4
            return
    }

    public PopNotification(int r4, int r5, int r6, int r7, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r8) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            java.lang.String r4 = r3.getString(r5)
            r3.title = r4
            java.lang.String r4 = r3.getString(r6)
            r3.message = r4
            java.lang.String r4 = r3.getString(r7)
            r3.buttonText = r4
            r3.onBindView = r8
            return
    }

    public PopNotification(int r4, int r5, int r6, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r7) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            java.lang.String r4 = r3.getString(r5)
            r3.title = r4
            java.lang.String r4 = r3.getString(r6)
            r3.message = r4
            r3.onBindView = r7
            return
    }

    public PopNotification(int r4, int r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.title = r4
            java.lang.String r4 = r3.getString(r5)
            r3.message = r4
            r3.onBindView = r6
            return
    }

    public PopNotification(int r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            java.lang.String r4 = r3.getString(r4)
            r3.title = r4
            r3.onBindView = r5
            return
    }

    public PopNotification(int r4, java.lang.CharSequence r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.title = r5
            return
    }

    public PopNotification(int r4, java.lang.CharSequence r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.title = r5
            r3.onBindView = r6
            return
    }

    public PopNotification(int r4, java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.title = r5
            r3.message = r6
            return
    }

    public PopNotification(int r4, java.lang.CharSequence r5, java.lang.CharSequence r6, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r7) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.title = r5
            r3.message = r6
            r3.onBindView = r7
            return
    }

    public PopNotification(int r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.title = r5
            r3.message = r6
            r3.buttonText = r7
            return
    }

    public PopNotification(int r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r8) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.iconResId = r4
            r3.title = r5
            r3.message = r6
            r3.buttonText = r7
            r3.onBindView = r8
            return
    }

    public PopNotification(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.onBindView = r4
            return
    }

    public PopNotification(java.lang.CharSequence r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.title = r4
            return
    }

    public PopNotification(java.lang.CharSequence r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.title = r4
            r3.onBindView = r5
            return
    }

    public PopNotification(java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.title = r4
            r3.message = r5
            return
    }

    public PopNotification(java.lang.CharSequence r4, java.lang.CharSequence r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 0
            r3.enterAnimResId = r0
            r3.exitAnimResId = r0
            r1 = 1
            r3.autoTintIconInLightOrDarkMode = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.slideToClose = r1
            com.kongzue.dialogx.util.TextInfo r2 = new com.kongzue.dialogx.util.TextInfo
            r2.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r2.setBold(r1)
            r3.buttonTextInfo = r1
            r1 = -1
            int[] r1 = new int[]{r1, r1, r1, r1}
            r3.bodyMargin = r1
            r1 = -9223372036854775808
            r3.autoDismissDelay = r1
            r3.preRecycle = r0
            r3.title = r4
            r3.message = r5
            r3.onBindView = r6
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.PopNotification r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ java.util.List access$100(com.kongzue.dialogx.dialogs.PopNotification r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static /* synthetic */ float access$1000(com.kongzue.dialogx.dialogs.PopNotification r0) {
            float r0 = r0.defaultTop
            return r0
    }

    public static /* synthetic */ float access$1002(com.kongzue.dialogx.dialogs.PopNotification r0, float r1) {
            r0.defaultTop = r1
            return r1
    }

    public static /* synthetic */ void access$1100(com.kongzue.dialogx.dialogs.PopNotification r0, int r1) {
            r0.moveBack(r1)
            return
    }

    public static /* synthetic */ java.lang.Integer access$1200(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1300(com.kongzue.dialogx.dialogs.PopNotification r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getIntStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1400(com.kongzue.dialogx.dialogs.PopNotification r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getColorNullable(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1500(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Float access$1600(com.kongzue.dialogx.dialogs.PopNotification r0, java.lang.Float r1) {
            java.lang.Float r0 = r0.getFloatStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1800(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1900(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$200(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$2000(com.kongzue.dialogx.dialogs.PopNotification r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ boolean access$2100(com.kongzue.dialogx.dialogs.PopNotification r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ void access$2200(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ void access$2300(com.kongzue.dialogx.dialogs.PopNotification r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ boolean access$2400(com.kongzue.dialogx.dialogs.PopNotification r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ void access$2500(com.kongzue.dialogx.dialogs.PopNotification r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$2600(com.kongzue.dialogx.dialogs.PopNotification r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ int[] access$2700(com.kongzue.dialogx.dialogs.PopNotification r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$2800(com.kongzue.dialogx.dialogs.PopNotification r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$2900(com.kongzue.dialogx.dialogs.PopNotification r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3000(com.kongzue.dialogx.dialogs.PopNotification r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$302(com.kongzue.dialogx.dialogs.PopNotification r0, java.lang.Integer r1) {
            r0.backgroundColor = r1
            return r1
    }

    public static /* synthetic */ java.lang.Integer access$3100(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3200(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3300(com.kongzue.dialogx.dialogs.PopNotification r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$3400(com.kongzue.dialogx.dialogs.PopNotification r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$3500(com.kongzue.dialogx.dialogs.PopNotification r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$3600(com.kongzue.dialogx.dialogs.PopNotification r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$3700(com.kongzue.dialogx.dialogs.PopNotification r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ long access$3800(com.kongzue.dialogx.dialogs.PopNotification r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$3900(com.kongzue.dialogx.dialogs.PopNotification r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ void access$4000(com.kongzue.dialogx.dialogs.PopNotification r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$402(com.kongzue.dialogx.dialogs.PopNotification r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ boolean access$4100(com.kongzue.dialogx.dialogs.PopNotification r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$4202(com.kongzue.dialogx.dialogs.PopNotification r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$4300(com.kongzue.dialogx.dialogs.PopNotification r0) {
            r0.waitForDismiss()
            return
    }

    public static /* synthetic */ void access$4400(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ void access$4500(com.kongzue.dialogx.dialogs.PopNotification r0, int r1) {
            r0.moveFront(r1)
            return
    }

    public static /* synthetic */ long access$4600(com.kongzue.dialogx.dialogs.PopNotification r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4700(com.kongzue.dialogx.dialogs.PopNotification r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4800(com.kongzue.dialogx.dialogs.PopNotification r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4900(com.kongzue.dialogx.dialogs.PopNotification r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ boolean access$5000(com.kongzue.dialogx.dialogs.PopNotification r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ boolean access$502(com.kongzue.dialogx.dialogs.PopNotification r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ int access$5100(com.kongzue.dialogx.dialogs.PopNotification r0) {
            int r0 = r0.countDisplayPopNotificationNum()
            return r0
    }

    public static /* synthetic */ boolean access$5200(com.kongzue.dialogx.dialogs.PopNotification r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ void access$600(com.kongzue.dialogx.dialogs.PopNotification r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$700(com.kongzue.dialogx.dialogs.PopNotification r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ boolean access$802(com.kongzue.dialogx.dialogs.PopNotification r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$900(com.kongzue.dialogx.dialogs.PopNotification r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static com.kongzue.dialogx.dialogs.PopNotification build() {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopNotification r1 = r0.setStyle(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.PopNotification build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopNotification r1 = r0.setCustomView(r1)
            return r1
    }

    private int countDisplayPopNotificationNum() {
            r3 = this;
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r1
        L7:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r2 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            int r2 = r2.size()
            if (r1 >= r2) goto L22
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r2 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            java.lang.Object r2 = r2.get(r1)
            com.kongzue.dialogx.dialogs.PopNotification r2 = (com.kongzue.dialogx.dialogs.PopNotification) r2
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

    private boolean isNoSetCustomDelay() {
            r4 = this;
            long r0 = r4.autoDismissDelay
            r2 = -9223372036854775808
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private void moveBack(int r13) {
            r12 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r3 = r12.getDialogImpl()
            if (r3 == 0) goto Lf5
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r3 = r12.getDialogImpl()
            android.view.ViewGroup r3 = r3.boxBody
            if (r3 == 0) goto Lf5
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r3 = r12.getDialogImpl()
            android.view.ViewGroup r3 = r3.boxBody
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r4 = r12.getDialogImpl()
            if (r4 == 0) goto Lf5
            if (r3 != 0) goto L21
            goto Lf5
        L21:
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r12.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r4 = r4.popNotificationSettings()
            if (r4 == 0) goto L35
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r12.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r4 = r4.popNotificationSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = r4.align()
            r12.align = r4
        L35:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = r12.align
            if (r4 != 0) goto L3d
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
            r12.align = r4
        L3d:
            float r4 = r3.getY()
            java.lang.Object r5 = r3.getTag()
            boolean r5 = r5 instanceof com.kongzue.dialogx.util.PopValueAnimator
            if (r5 == 0) goto L5c
            java.lang.Object r4 = r3.getTag()
            com.kongzue.dialogx.util.PopValueAnimator r4 = (com.kongzue.dialogx.util.PopValueAnimator) r4
            r4.end()
            java.lang.Object r4 = r3.getTag()
            com.kongzue.dialogx.util.PopValueAnimator r4 = (com.kongzue.dialogx.util.PopValueAnimator) r4
            float r4 = r4.getEndValue()
        L5c:
            int[] r5 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r6 = r12.align
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            if (r5 == r2) goto L86
            if (r5 == r1) goto L83
            r7 = 3
            if (r5 == r7) goto L83
            r7 = 4
            if (r5 == r7) goto L79
            r7 = 5
            if (r5 == r7) goto L83
            r13 = 0
        L77:
            r8 = r13
            goto L8a
        L79:
            float r13 = (float) r13
            float r4 = r4 + r13
            int r13 = r3.getPaddingTop()
            float r13 = (float) r13
        L80:
            float r13 = r4 - r13
            goto L77
        L83:
            float r13 = (float) r13
            float r13 = r13 * r6
            goto L80
        L86:
            float r13 = (float) r13
            float r13 = r13 * r6
            float r13 = r13 + r4
            goto L77
        L8a:
            com.kongzue.dialogx.interfaces.PopMoveDisplacementInterceptor<com.kongzue.dialogx.dialogs.PopNotification> r4 = com.kongzue.dialogx.dialogs.PopNotification.moveDisplacementInterceptor
            if (r4 == 0) goto Lbc
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r13 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r13 != 0) goto L94
            r5 = r0
            goto L9b
        L94:
            com.kongzue.dialogx.dialogs.PopNotification r5 = r12.me
            int r13 = r13.indexOf(r5)
            r5 = r13
        L9b:
            com.kongzue.dialogx.dialogs.PopNotification r6 = r12.me
            float r7 = r3.getY()
            int r13 = r3.getHeight()
            float r13 = (float) r13
            float r9 = r3.getScaleY()
            float r13 = r13 / r9
            int r9 = (int) r13
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r13 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r13 != 0) goto Lb2
            r10 = r2
            goto Lb7
        Lb2:
            int r13 = r13.size()
            r10 = r13
        Lb7:
            r11 = 1
            float r8 = r4.resetAnimY(r5, r6, r7, r8, r9, r10, r11)
        Lbc:
            float r13 = r3.getY()
            float r4 = r3.getY()
            float[] r1 = new float[r1]
            r1[r0] = r4
            r1[r2] = r8
            com.kongzue.dialogx.util.PopValueAnimator r0 = com.kongzue.dialogx.util.PopValueAnimator.ofFloat(r1)
            r3.setTag(r0)
            com.kongzue.dialogx.dialogs.PopNotification$2 r1 = new com.kongzue.dialogx.dialogs.PopNotification$2
            r1.<init>(r12, r8, r13)
            r0.addUpdateListener(r1)
            long r1 = r12.enterAnimDuration
            r3 = -1
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 != 0) goto Le3
            r1 = 300(0x12c, double:1.48E-321)
        Le3:
            android.animation.ValueAnimator r13 = r0.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r13.setInterpolator(r1)
            r0.start()
        Lf5:
            return
    }

    private void moveFront(int r13) {
            r12 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r3 = r12.getDialogImpl()
            if (r3 == 0) goto Lf1
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r3 = r12.getDialogImpl()
            android.view.ViewGroup r3 = r3.boxBody
            if (r3 == 0) goto Lf1
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r3 = r12.getDialogImpl()
            android.view.ViewGroup r3 = r3.boxBody
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r4 = r12.getDialogImpl()
            if (r4 == 0) goto Lf1
            if (r3 != 0) goto L21
            goto Lf1
        L21:
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r12.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r4 = r4.popNotificationSettings()
            if (r4 == 0) goto L35
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r12.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r4 = r4.popNotificationSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = r4.align()
            r12.align = r4
        L35:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = r12.align
            if (r4 != 0) goto L3d
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
            r12.align = r4
        L3d:
            float r4 = r3.getY()
            java.lang.Object r5 = r3.getTag()
            boolean r5 = r5 instanceof com.kongzue.dialogx.util.PopValueAnimator
            if (r5 == 0) goto L5c
            java.lang.Object r4 = r3.getTag()
            com.kongzue.dialogx.util.PopValueAnimator r4 = (com.kongzue.dialogx.util.PopValueAnimator) r4
            r4.end()
            java.lang.Object r4 = r3.getTag()
            com.kongzue.dialogx.util.PopValueAnimator r4 = (com.kongzue.dialogx.util.PopValueAnimator) r4
            float r4 = r4.getEndValue()
        L5c:
            int[] r5 = com.kongzue.dialogx.dialogs.PopNotification.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r6 = r12.align
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            if (r5 == r2) goto L85
            if (r5 == r1) goto L82
            r7 = 3
            if (r5 == r7) goto L82
            r7 = 4
            if (r5 == r7) goto L79
            r7 = 5
            if (r5 == r7) goto L82
            r13 = 0
        L77:
            r8 = r13
            goto L8a
        L79:
            float r13 = (float) r13
            float r4 = r4 - r13
            int r13 = r3.getPaddingTop()
            float r13 = (float) r13
        L80:
            float r13 = r13 + r4
            goto L77
        L82:
            float r13 = (float) r13
            float r13 = r13 * r6
            goto L80
        L85:
            float r13 = (float) r13
            float r13 = r13 * r6
            float r13 = r4 - r13
            goto L77
        L8a:
            com.kongzue.dialogx.interfaces.PopMoveDisplacementInterceptor<com.kongzue.dialogx.dialogs.PopNotification> r4 = com.kongzue.dialogx.dialogs.PopNotification.moveDisplacementInterceptor
            if (r4 == 0) goto Lbc
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r13 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r13 != 0) goto L94
            r5 = r0
            goto L9b
        L94:
            com.kongzue.dialogx.dialogs.PopNotification r5 = r12.me
            int r13 = r13.indexOf(r5)
            r5 = r13
        L9b:
            com.kongzue.dialogx.dialogs.PopNotification r6 = r12.me
            float r7 = r3.getY()
            int r13 = r3.getHeight()
            float r13 = (float) r13
            float r9 = r3.getScaleY()
            float r13 = r13 / r9
            int r9 = (int) r13
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r13 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r13 != 0) goto Lb2
            r10 = r2
            goto Lb7
        Lb2:
            int r13 = r13.size()
            r10 = r13
        Lb7:
            r11 = 0
            float r8 = r4.resetAnimY(r5, r6, r7, r8, r9, r10, r11)
        Lbc:
            float r13 = r3.getY()
            float[] r1 = new float[r1]
            r1[r0] = r13
            r1[r2] = r8
            com.kongzue.dialogx.util.PopValueAnimator r0 = com.kongzue.dialogx.util.PopValueAnimator.ofFloat(r1)
            r3.setTag(r0)
            com.kongzue.dialogx.dialogs.PopNotification$3 r1 = new com.kongzue.dialogx.dialogs.PopNotification$3
            r1.<init>(r12, r8, r13)
            r0.addUpdateListener(r1)
            long r1 = r12.exitAnimDuration
            r3 = -1
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 != 0) goto Ldf
            r1 = 300(0x12c, double:1.48E-321)
        Ldf:
            android.animation.ValueAnimator r13 = r0.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r13.setInterpolator(r1)
            r0.start()
        Lf1:
            return
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, int r2) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, int r2, int r3) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, int r2, int r3, int r4) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r7, int r8, int r9, int r10, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r11) {
            com.kongzue.dialogx.dialogs.PopNotification r6 = new com.kongzue.dialogx.dialogs.PopNotification
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.show()
            return r6
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, int r2, int r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r4) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, int r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r3) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r2) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, java.lang.CharSequence r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r3) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r4) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(int r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r11) {
            com.kongzue.dialogx.dialogs.PopNotification r6 = new com.kongzue.dialogx.dialogs.PopNotification
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.show()
            return r6
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(java.lang.CharSequence r1) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r2) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopNotification show(java.lang.CharSequence r1, java.lang.CharSequence r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r3) {
            com.kongzue.dialogx.dialogs.PopNotification r0 = new com.kongzue.dialogx.dialogs.PopNotification
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    private void waitForDismiss() {
            r2 = this;
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
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
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r1 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r0.<init>(r1)
            Yue.ۥۡۤۤۡ r1 = new Yue.ۥۡۤۤۡ
            r1.<init>()
            r0.removeIf(r1)
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
        L33:
            return
    }

    public com.kongzue.dialogx.dialogs.PopNotification appendMessage(java.lang.CharSequence r4) {
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

    public com.kongzue.dialogx.dialogs.PopNotification autoDismiss(long r3) {
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
            com.kongzue.dialogx.dialogs.PopNotification$1 r1 = new com.kongzue.dialogx.dialogs.PopNotification$1
            r1.<init>(r2)
            r0.schedule(r1, r3)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification bringToFront() {
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

    public com.kongzue.dialogx.dialogs.PopNotification cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopNotification cleanAllAction() {
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
            com.kongzue.dialogx.dialogs.PopNotification$5 r0 = new com.kongzue.dialogx.dialogs.PopNotification$5
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN getAlign() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = r1.align
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
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopNotification> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopNotification> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.PopNotification$6 r0 = new com.kongzue.dialogx.dialogs.PopNotification$6
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> r0 = r1.dialogXAnimImpl
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

    public android.graphics.Bitmap getIconBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.iconBitmap
            return r0
    }

    public android.graphics.drawable.Drawable getIconDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.iconDrawable
            return r0
    }

    public int getIconResId() {
            r1 = this;
            int r0 = r1.iconResId
            return r0
    }

    public int getIconSize() {
            r1 = this;
            int r0 = r1.iconSize
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

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> getOnButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r0 = r1.onButtonClickListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> getOnPopNotificationClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r0 = r1.onPopNotificationClickListener
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.backgroundRadius
            return r0
    }

    public boolean getTintIcon() {
            r2 = this;
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = r2.tintIcon
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.title
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getTitleTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.titleTextInfo
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

    public com.kongzue.dialogx.dialogs.PopNotification iconError() {
            r2 = this;
            r0 = 0
            r2.setTintIcon(r0)
            int r0 = com.kongzue.dialogx.R.mipmap.ico_dialogx_error
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            int r1 = r1.defaultIconError()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r0 = r0.popNotificationSettings()
            int r0 = r0.defaultIconError()
        L2a:
            r1 = 1104150528(0x41d00000, float:26.0)
            int r1 = r2.dip2px(r1)
            r2.setIconSize(r1)
            r2.setIconResId(r0)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification iconSuccess() {
            r2 = this;
            r0 = 0
            r2.setTintIcon(r0)
            int r0 = com.kongzue.dialogx.R.mipmap.ico_dialogx_success
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            int r1 = r1.defaultIconSuccess()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r0 = r0.popNotificationSettings()
            int r0 = r0.defaultIconSuccess()
        L2a:
            r1 = 1104150528(0x41d00000, float:26.0)
            int r1 = r2.dip2px(r1)
            r2.setIconSize(r1)
            r2.setIconResId(r0)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification iconWarning() {
            r2 = this;
            r0 = 0
            r2.setTintIcon(r0)
            int r0 = com.kongzue.dialogx.R.mipmap.ico_dialogx_warning
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            int r1 = r1.defaultIconWarning()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r0 = r0.popNotificationSettings()
            int r0 = r0.defaultIconWarning()
        L2a:
            r1 = 1104150528(0x41d00000, float:26.0)
            int r1 = r2.dip2px(r1)
            r2.setIconSize(r1)
            r2.setIconResId(r0)
            return r2
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            boolean r0 = r1.autoTintIconInLightOrDarkMode
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isSlideToClose() {
            r1 = this;
            boolean r0 = r1.slideToClose
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification noAutoDismiss() {
            r2 = this;
            r0 = -1
            r2.autoDismiss(r0)
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.PopNotification r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.PopNotification onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopNotification> r1) {
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

    public void onShow(com.kongzue.dialogx.dialogs.PopNotification r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.PopNotification$4 r0 = new com.kongzue.dialogx.dialogs.PopNotification$4
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopNotification removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r0 = r1.onBindView
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
            if (r0 == 0) goto L10
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r0 = 0
            r6.isShow = r0
        L10:
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r0 = r6.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r0 = r6.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopNotification
            if (r0 == 0) goto L44
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 == 0) goto L3e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopNotification r0 = (com.kongzue.dialogx.dialogs.PopNotification) r0
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L44
            r0.dismiss()
        L44:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 != 0) goto L4f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopNotification.popNotificationList = r0
        L4f:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L5d
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material
            goto L5f
        L5d:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material_dark
        L5f:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            if (r1 == 0) goto Leb
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto L85
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r0 = r0.popNotificationSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        L85:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = r1.align()
            r6.align = r1
            if (r1 != 0) goto L97
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
            r6.align = r1
        L97:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r2 = r2.popNotificationSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto Lc1
            int r3 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterAnimRes
            if (r3 != 0) goto Lc1
            if (r1 == 0) goto Lbe
            goto Lc2
        Lbe:
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_enter
            goto Lc2
        Lc1:
            r1 = r3
        Lc2:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto Ld2
            int r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitAnimRes
            if (r1 != 0) goto Ld2
            if (r2 == 0) goto Lcf
            goto Ld3
        Lcf:
            int r2 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_exit
            goto Ld3
        Ld2:
            r2 = r1
        Ld3:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Ldf
            long r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterDuration
        Ldf:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto Le9
            long r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitDuration
        Le9:
            r6.exitAnimDuration = r1
        Leb:
            r1 = 0
            r6.enterAnimDuration = r1
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L101
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L101:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl
            r1.<init>(r6, r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L113
            com.kongzue.dialogx.dialogs.PopNotification r1 = r6.me
            r0.setTag(r1)
        L113:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopNotification setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopNotification> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopNotification setAlign(com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN r1) {
            r0 = this;
            r0.align = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setAnimResId(int r1, int r2) {
            r0 = this;
            r0.enterAnimResId = r1
            r0.exitAnimResId = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setAutoTintIconInLightOrDarkMode(boolean r1) {
            r0 = this;
            r0.autoTintIconInLightOrDarkMode = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.buttonText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.buttonText = r1
            r0.onButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            r0 = this;
            r0.onButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.buttonText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r2) {
            r0 = this;
            r0.buttonText = r1
            r0.onButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setButtonTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.buttonTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopNotification setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopNotification setData(java.lang.String r2, java.lang.Object r3) {
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
            com.kongzue.dialogx.dialogs.PopNotification r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopNotification setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopNotification> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.PopNotification r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopNotification setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setEnterAnimResId(int r1) {
            r0 = this;
            r0.enterAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setExitAnimResId(int r1) {
            r0 = this;
            r0.exitAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setIcon(android.graphics.Bitmap r1) {
            r0 = this;
            r0.iconBitmap = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.iconDrawable = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setIconResId(int r1) {
            r0 = this;
            r0.iconResId = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setIconSize(int r1) {
            r0 = this;
            r0.iconSize = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMargin(int r3, int r4, int r5, int r6) {
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

    public com.kongzue.dialogx.dialogs.PopNotification setMarginBottom(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 3
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMarginLeft(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 0
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMarginRight(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 2
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMarginTop(int r3) {
            r2 = this;
            int[] r0 = r2.bodyMargin
            r1 = 1
            r0[r1] = r3
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setOnButtonClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            r0 = this;
            r0.onButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setOnPopNotificationClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.PopNotification> r1) {
            r0 = this;
            r0.onPopNotificationClickListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setSlideToClose(boolean r1) {
            r0 = this;
            r0.slideToClose = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopNotification setThisOrderIndex(int r2) {
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
            com.kongzue.dialogx.dialogs.PopNotification r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopNotification setTintIcon(boolean r1) {
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

    public com.kongzue.dialogx.dialogs.PopNotification setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.titleTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopNotification show() {
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
            if (r0 != 0) goto L13e
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopNotification
            if (r0 == 0) goto L3c
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 == 0) goto L6f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6f
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopNotification r0 = (com.kongzue.dialogx.dialogs.PopNotification) r0
            r0.dismiss()
            goto L6f
        L3c:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 == 0) goto L6f
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r2 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r0.<init>(r2)
        L47:
            int r2 = r0.size()
            if (r1 >= r2) goto L6f
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopNotification r2 = (com.kongzue.dialogx.dialogs.PopNotification) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopNotification.maxShowCount
            if (r3 < r4) goto L6c
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopNotification.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L6c
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r3 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r3.remove(r2)
        L6c:
            int r1 = r1 + 1
            goto L47
        L6f:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 != 0) goto L7a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopNotification.popNotificationList = r0
        L7a:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L88
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material
            goto L8a
        L88:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material_dark
        L8a:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            if (r1 == 0) goto L116
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Lb0
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r0 = r0.popNotificationSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Lb0:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = r1.align()
            r6.align = r1
            if (r1 != 0) goto Lc2
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
            r6.align = r1
        Lc2:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r2 = r2.popNotificationSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto Lec
            int r3 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterAnimRes
            if (r3 != 0) goto Lec
            if (r1 == 0) goto Le9
            goto Led
        Le9:
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_enter
            goto Led
        Lec:
            r1 = r3
        Led:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto Lfd
            int r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitAnimRes
            if (r1 != 0) goto Lfd
            if (r2 == 0) goto Lfa
            goto Lfe
        Lfa:
            int r2 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_exit
            goto Lfe
        Lfd:
            r2 = r1
        Lfe:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10a
            long r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterDuration
        L10a:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L114
            long r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitDuration
        L114:
            r6.exitAnimDuration = r1
        L116:
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L128
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L128:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl
            r1.<init>(r6, r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L13a
            com.kongzue.dialogx.dialogs.PopNotification r1 = r6.me
            r0.setTag(r1)
        L13a:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L145
        L13e:
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L145:
            return r6
    }

    public com.kongzue.dialogx.dialogs.PopNotification show(android.app.Activity r7) {
            r6 = this;
            super.beforeShow()
            android.view.View r0 = r6.getDialogView()
            if (r0 != 0) goto Lfb
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopNotification
            if (r0 == 0) goto L2c
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopNotification r0 = (com.kongzue.dialogx.dialogs.PopNotification) r0
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L2c
            r0.dismiss()
        L2c:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            if (r0 != 0) goto L37
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopNotification.popNotificationList = r0
        L37:
            java.util.List<com.kongzue.dialogx.dialogs.PopNotification> r0 = com.kongzue.dialogx.dialogs.PopNotification.popNotificationList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L45
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material
            goto L47
        L45:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material_dark
        L47:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            if (r1 == 0) goto Ld3
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto L6d
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r0 = r0.popNotificationSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        L6d:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = r1.align()
            r6.align = r1
            if (r1 != 0) goto L7f
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
            r6.align = r1
        L7f:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r1 = r1.popNotificationSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings r2 = r2.popNotificationSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto La9
            int r3 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterAnimRes
            if (r3 != 0) goto La9
            if (r1 == 0) goto La6
            goto Laa
        La6:
            int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_enter
            goto Laa
        La9:
            r1 = r3
        Laa:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto Lba
            int r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitAnimRes
            if (r1 != 0) goto Lba
            if (r2 == 0) goto Lb7
            goto Lbb
        Lb7:
            int r2 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_exit
            goto Lbb
        Lba:
            r2 = r1
        Lbb:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Lc7
            long r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideEnterDuration
        Lc7:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto Ld1
            long r1 = com.kongzue.dialogx.dialogs.PopNotification.overrideExitDuration
        Ld1:
            r6.exitAnimDuration = r1
        Ld3:
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto Le5
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        Le5:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopNotification$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopNotification$DialogImpl
            r1.<init>(r6, r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto Lf7
            com.kongzue.dialogx.dialogs.PopNotification r1 = r6.me
            r0.setTag(r1)
        Lf7:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r7, r0)
            goto L102
        Lfb:
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r7, r0)
        L102:
            return r6
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopNotification r0 = r1.show()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification showAlways() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopNotification r0 = r1.noAutoDismiss()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopNotification showLong() {
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

    public com.kongzue.dialogx.dialogs.PopNotification showShort() {
            r2 = this;
            boolean r0 = r2.isNoSetCustomDelay()
            if (r0 == 0) goto Lb
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.autoDismiss(r0)
        Lb:
            boolean r0 = r2.preShow
            if (r0 != 0) goto L16
            boolean r0 = r2.isShow
            if (r0 != 0) goto L16
            r2.show()
        L16:
            return r2
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
