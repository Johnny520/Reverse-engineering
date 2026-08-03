package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class WaitDialog extends com.kongzue.dialogx.interfaces.BaseDialog {
    public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterAnimRes = 0;
    public static int overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static int overrideExitDuration = -1;
    protected float backgroundRadius;
    protected boolean bkgInterceptTouch;
    protected int customEnterAnimResId;
    protected int customExitAnimResId;
    protected java.util.Timer delayDismissTimer;
    protected java.lang.ref.WeakReference<com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl> dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.WaitDialog> dialogLifecycleCallback;
    private java.lang.ref.WeakReference<android.view.View> dialogView;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> dialogXAnimImpl;
    protected java.lang.Integer maskColor;
    protected java.lang.CharSequence message;
    protected com.kongzue.dialogx.util.TextInfo messageTextInfo;
    protected com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.WaitDialog> onBackPressedListener;
    protected com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> onBackgroundMaskClickListener;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.WaitDialog> onBindView;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN privateCancelable;
    protected com.kongzue.dialogx.dialogs.WaitDialog.TYPE readyTipType;
    protected int showType;
    protected long tipShowDuration;
    protected float waitProgress;







    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.WaitDialog$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE = null;

        static {
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.WaitDialog.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE = r0
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.WARNING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.ERROR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        public com.kongzue.dialogx.util.views.MaxRelativeLayout bkg;
        private java.util.List<android.view.View> blurViews;
        public android.widget.RelativeLayout boxCustomView;
        public android.widget.RelativeLayout boxProgress;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        private int layoutResId;
        private float oldProgress;
        public com.kongzue.dialogx.interfaces.ProgressViewInterface progressView;
        final /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog this$0;
        public android.widget.TextView txtInfo;








        /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8, reason: invalid class name */
        public class AnonymousClass8 implements java.lang.Runnable {
            final /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl this$1;
            final /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog.TYPE val$tip;



            public AnonymousClass8(com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.val$tip = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.dialogs.WaitDialog r0 = r0.this$0
                    com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = r4.val$tip
                    int r1 = r1.ordinal()
                    r0.showType = r1
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.progressView
                    if (r0 != 0) goto L13
                    return
                L13:
                    int[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE
                    com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = r4.val$tip
                    int r1 = r1.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    if (r0 == r1) goto L42
                    r1 = 2
                    if (r0 == r1) goto L3a
                    r1 = 3
                    if (r0 == r1) goto L32
                    r1 = 4
                    if (r0 == r1) goto L2a
                    goto L49
                L2a:
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.progressView
                    r0.loading()
                    return
                L32:
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.progressView
                    r0.error()
                    goto L49
                L3a:
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.progressView
                    r0.success()
                    goto L49
                L42:
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.progressView
                    r0.warning()
                L49:
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    android.widget.RelativeLayout r0 = r0.boxProgress
                    if (r0 == 0) goto L62
                    int r0 = r0.getVisibility()
                    if (r0 != 0) goto L62
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.progressView
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8$1 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8$1
                    r1.<init>(r4)
                    r0.whenShowTick(r1)
                    goto L90
                L62:
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.dialogs.WaitDialog r0 = r0.this$0
                    com.kongzue.dialogx.interfaces.DialogLifecycleCallback r0 = r0.getDialogLifecycleCallback()
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r4.this$1
                    com.kongzue.dialogx.dialogs.WaitDialog r1 = r1.this$0
                    r0.onShow(r1)
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    r0.refreshView()
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r4.this$1
                    com.kongzue.dialogx.dialogs.WaitDialog r0 = r0.this$0
                    long r0 = r0.tipShowDuration
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L90
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8$2 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8$2
                    r0.<init>(r4)
                    com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r4.this$1
                    com.kongzue.dialogx.dialogs.WaitDialog r1 = r1.this$0
                    long r1 = r1.tipShowDuration
                    com.kongzue.dialogx.dialogs.WaitDialog.access$5100(r0, r1)
                L90:
                    return
            }
        }

        public DialogImpl(com.kongzue.dialogx.dialogs.WaitDialog r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.oldProgress = r0
                boolean r0 = r2.isLightTheme()
                int r0 = r2.getCustomDialogLayoutResId(r0)
                if (r0 == 0) goto L1b
                boolean r3 = r2.isLightTheme()
                int r3 = r2.getCustomDialogLayoutResId(r3)
            L1b:
                r1.layoutResId = r3
                return
        }

        public DialogImpl(com.kongzue.dialogx.dialogs.WaitDialog r5, android.view.View r6) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.oldProgress = r0
                if (r6 != 0) goto Lc
                return
            Lc:
                com.kongzue.dialogx.dialogs.WaitDialog.access$1100(r5, r6)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r6.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r4.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.bkg
                android.view.View r0 = r6.findViewById(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
                r4.bkg = r0
                int r0 = com.kongzue.dialogx.R.id.box_progress
                android.view.View r0 = r6.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r4.boxProgress = r0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$1200(r5)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r0 = r0.overrideWaitTipRes()
                android.app.Activity r1 = r5.getOwnActivity()
                boolean r2 = r5.isLightTheme()
                com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r0.overrideWaitView(r1, r2)
                android.view.View r0 = (android.view.View) r0
                if (r0 != 0) goto L4e
                com.kongzue.dialogx.util.views.ProgressView r0 = new com.kongzue.dialogx.util.views.ProgressView
                android.app.Activity r1 = r5.getOwnActivity()
                r0.<init>(r1)
            L4e:
                r1 = r0
                com.kongzue.dialogx.interfaces.ProgressViewInterface r1 = (com.kongzue.dialogx.interfaces.ProgressViewInterface) r1
                r4.progressView = r1
                android.widget.RelativeLayout r1 = r4.boxProgress
                android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
                r3 = -1
                r2.<init>(r3, r3)
                r1.addView(r0, r2)
                int r0 = com.kongzue.dialogx.R.id.box_customView
                android.view.View r0 = r6.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r4.boxCustomView = r0
                int r0 = com.kongzue.dialogx.R.id.txt_info
                android.view.View r6 = r6.findViewById(r0)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r4.txtInfo = r6
                r4.init()
                com.kongzue.dialogx.dialogs.WaitDialog.access$1000(r5, r4)
                r4.refreshView()
                return
        }

        private java.lang.CharSequence getDefaultTipText(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
                r1 = this;
                int[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.AnonymousClass7.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L1f
                r0 = 2
                if (r2 == r0) goto L1c
                r0 = 3
                if (r2 == r0) goto L19
                r0 = 4
                if (r2 == r0) goto L16
                r2 = 0
                return r2
            L16:
                java.lang.CharSequence r2 = com.kongzue.dialogx.DialogX.defaultWaitDialogWaitingText
                return r2
            L19:
                java.lang.CharSequence r2 = com.kongzue.dialogx.DialogX.defaultTipDialogErrorText
                return r2
            L1c:
                java.lang.CharSequence r2 = com.kongzue.dialogx.DialogX.defaultTipDialogSuccessText
                return r2
            L1f:
                java.lang.CharSequence r2 = com.kongzue.dialogx.DialogX.defaultTipDialogWarningText
                return r2
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r3) {
                r2 = this;
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r2.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                if (r0 != 0) goto Le
                return
            Le:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r2.this$0
                android.app.Activity r0 = r0.getOwnActivity()
                if (r0 != 0) goto L17
                return
            L17:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r2.this$0
                boolean r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$4300(r0)
                if (r0 != 0) goto L33
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                if (r0 == 0) goto L33
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r2.this$0
                r1 = 1
                com.kongzue.dialogx.dialogs.WaitDialog.access$4402(r0, r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$6
                r1.<init>(r2, r3)
                r0.post(r1)
            L33:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$7 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$7
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.bkg
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r6.bkg
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
                int r7 = com.kongzue.dialogx.dialogs.WaitDialog.overrideEnterDuration
                if (r7 < 0) goto L29
                long r2 = (long) r7
            L29:
                com.kongzue.dialogx.dialogs.WaitDialog r7 = r6.this$0
                long r4 = com.kongzue.dialogx.dialogs.WaitDialog.access$4900(r7)
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L39
                com.kongzue.dialogx.dialogs.WaitDialog r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.WaitDialog.access$5000(r7)
            L39:
                return r2
        }

        public long getExitAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.bkg
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r6.bkg
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
                int r7 = com.kongzue.dialogx.dialogs.WaitDialog.overrideExitDuration
                if (r7 < 0) goto L29
                long r0 = (long) r7
            L29:
                com.kongzue.dialogx.dialogs.WaitDialog r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.WaitDialog.access$4700(r7)
                r4 = -1
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L3b
                com.kongzue.dialogx.dialogs.WaitDialog r7 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$4800(r7)
            L3b:
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r5 = this;
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                android.view.View r0 = r0.getDialogView()
                if (r0 == 0) goto L18
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r5.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
            L18:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                com.kongzue.dialogx.util.TextInfo r1 = r0.messageTextInfo
                if (r1 != 0) goto L22
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.tipTextInfo
                r0.messageTextInfo = r1
            L22:
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$1300(r0)
                if (r0 != 0) goto L2f
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                java.lang.Integer r1 = com.kongzue.dialogx.DialogX.tipBackgroundColor
                com.kongzue.dialogx.dialogs.WaitDialog.access$1402(r0, r1)
            L2f:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                java.lang.ref.WeakReference r1 = com.kongzue.dialogx.dialogs.WaitDialog.access$1500(r0)
                java.lang.Object r1 = r1.get()
                android.view.View r1 = (android.view.View) r1
                java.util.List r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$1600(r0, r1)
                r5.blurViews = r0
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                boolean r1 = r0.isLightTheme()
                if (r1 == 0) goto L4c
                int r1 = com.kongzue.dialogx.R.color.dialogxWaitBkgDark
                goto L4e
            L4c:
                int r1 = com.kongzue.dialogx.R.color.dialogxWaitBkgLight
            L4e:
                int r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$1700(r0, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r5.this$0
                r2 = 1097859072(0x41700000, float:15.0)
                int r1 = r1.dip2px(r2)
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                com.kongzue.dialogx.dialogs.WaitDialog r2 = r5.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.WaitDialog.access$1800(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r2 = r2.overrideWaitTipRes()
                if (r2 == 0) goto Lb7
                com.kongzue.dialogx.dialogs.WaitDialog r2 = r5.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r3 = com.kongzue.dialogx.dialogs.WaitDialog.access$1900(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r3 = r3.overrideWaitTipRes()
                int r3 = r3.overrideRadiusPx()
                float r3 = (float) r3
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                java.lang.Float r1 = com.kongzue.dialogx.dialogs.WaitDialog.access$2000(r2, r3, r1)
                com.kongzue.dialogx.dialogs.WaitDialog r2 = r5.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r3 = com.kongzue.dialogx.dialogs.WaitDialog.access$2100(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r3 = r3.overrideWaitTipRes()
                com.kongzue.dialogx.dialogs.WaitDialog r4 = r5.this$0
                boolean r4 = r4.isLightTheme()
                int r3 = r3.overrideBackgroundColorRes(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.kongzue.dialogx.dialogs.WaitDialog r4 = r5.this$0
                boolean r4 = r4.isLightTheme()
                if (r4 == 0) goto La9
                int r4 = com.kongzue.dialogx.R.color.dialogxWaitBkgDark
                goto Lab
            La9:
                int r4 = com.kongzue.dialogx.R.color.dialogxWaitBkgLight
            Lab:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.WaitDialog.access$2200(r2, r3, r4)
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$2300(r2, r3, r0)
            Lb7:
                java.util.List<android.view.View> r2 = r5.blurViews
                if (r2 == 0) goto Le4
                java.util.Iterator r2 = r2.iterator()
            Lbf:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L105
                java.lang.Object r3 = r2.next()
                android.view.View r3 = (android.view.View) r3
                com.kongzue.dialogx.interfaces.BlurViewType r3 = (com.kongzue.dialogx.interfaces.BlurViewType) r3
                com.kongzue.dialogx.dialogs.WaitDialog r4 = r5.this$0
                java.lang.Integer r4 = com.kongzue.dialogx.dialogs.WaitDialog.access$2400(r4)
                if (r4 != 0) goto Ld7
                r4 = r0
                goto Ldd
            Ld7:
                com.kongzue.dialogx.dialogs.WaitDialog r4 = r5.this$0
                java.lang.Integer r4 = com.kongzue.dialogx.dialogs.WaitDialog.access$2500(r4)
            Ldd:
                r3.setOverlayColor(r4)
                r3.setRadiusPx(r1)
                goto Lbf
            Le4:
                com.kongzue.dialogx.dialogs.WaitDialog r2 = r5.this$0
                android.content.res.Resources r2 = r2.getResources()
                int r3 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_wait_bkg
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
                android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
                int r0 = r0.intValue()
                r2.setColor(r0)
                float r0 = r1.floatValue()
                r2.setCornerRadius(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r5.bkg
                r0.setBackground(r2)
            L105:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r5.boxRoot
                r1 = 1
                r0.setClickable(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r5.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r5.this$0
                r0.setParentDialog(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r5.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$1
                r1.<init>(r5)
                r0.setOnLifecycleCallBack(r1)
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = r0.readyTipType
                if (r0 == 0) goto L139
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE
                if (r0 == r1) goto L139
                com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r5.progressView
                r0.noLoading()
                com.kongzue.dialogx.interfaces.ProgressViewInterface r0 = r5.progressView
                android.view.View r0 = (android.view.View) r0
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$2
                r1.<init>(r5)
                r2 = 100
                r0.postDelayed(r1, r2)
            L139:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r5.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$3
                r1.<init>(r5)
                r0.setOnBackPressedListener(r1)
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                com.kongzue.dialogx.dialogs.WaitDialog.access$3100(r0)
                return
        }

        public void lazyCreate() {
                r5 = this;
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                int r1 = r5.layoutResId
                android.view.View r0 = r0.createView(r1)
                if (r0 != 0) goto Lb
                return
            Lb:
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r5.this$0
                r1.setWaitDialogView(r0)
                int r1 = com.kongzue.dialogx.R.id.box_root
                android.view.View r1 = r0.findViewById(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r1
                r5.boxRoot = r1
                int r1 = com.kongzue.dialogx.R.id.bkg
                android.view.View r1 = r0.findViewById(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r1
                r5.bkg = r1
                int r1 = com.kongzue.dialogx.R.id.box_progress
                android.view.View r1 = r0.findViewById(r1)
                android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
                r5.boxProgress = r1
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r5.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r1 = com.kongzue.dialogx.dialogs.WaitDialog.access$800(r1)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r1 = r1.overrideWaitTipRes()
                com.kongzue.dialogx.dialogs.WaitDialog r2 = r5.this$0
                android.app.Activity r2 = r2.getOwnActivity()
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r5.this$0
                boolean r3 = r3.isLightTheme()
                com.kongzue.dialogx.interfaces.ProgressViewInterface r1 = r1.overrideWaitView(r2, r3)
                android.view.View r1 = (android.view.View) r1
                if (r1 != 0) goto L57
                com.kongzue.dialogx.util.views.ProgressView r1 = new com.kongzue.dialogx.util.views.ProgressView
                com.kongzue.dialogx.dialogs.WaitDialog r2 = r5.this$0
                android.app.Activity r2 = r2.getOwnActivity()
                r1.<init>(r2)
            L57:
                r2 = r1
                com.kongzue.dialogx.interfaces.ProgressViewInterface r2 = (com.kongzue.dialogx.interfaces.ProgressViewInterface) r2
                r5.progressView = r2
                android.widget.RelativeLayout r2 = r5.boxProgress
                android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
                r4 = -1
                r3.<init>(r4, r4)
                r2.addView(r1, r3)
                int r1 = com.kongzue.dialogx.R.id.box_customView
                android.view.View r1 = r0.findViewById(r1)
                android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
                r5.boxCustomView = r1
                int r1 = com.kongzue.dialogx.R.id.txt_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r5.txtInfo = r1
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r5.this$0
                java.util.List r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$900(r1, r0)
                r5.blurViews = r0
                r5.init()
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r5.this$0
                com.kongzue.dialogx.dialogs.WaitDialog.access$1000(r0, r5)
                r5.refreshView()
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r8 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                if (r0 == 0) goto L227
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                android.app.Activity r0 = r0.getOwnActivity()
                if (r0 != 0) goto Le
                goto L227
            Le:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                boolean r1 = r1.isEnableImmersiveMode()
                r0.setAutoUnsafePlacePadding(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                int[] r1 = com.kongzue.dialogx.dialogs.WaitDialog.access$3200(r1)
                r2 = 0
                r1 = r1[r2]
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                int[] r3 = com.kongzue.dialogx.dialogs.WaitDialog.access$3300(r3)
                r4 = 1
                r3 = r3[r4]
                com.kongzue.dialogx.dialogs.WaitDialog r5 = r8.this$0
                int[] r5 = com.kongzue.dialogx.dialogs.WaitDialog.access$3400(r5)
                r6 = 2
                r5 = r5[r6]
                com.kongzue.dialogx.dialogs.WaitDialog r6 = r8.this$0
                int[] r6 = com.kongzue.dialogx.dialogs.WaitDialog.access$3500(r6)
                r7 = 3
                r6 = r6[r7]
                r0.setRootPadding(r1, r3, r5, r6)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.bkg
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                int r1 = r1.getMaxWidth()
                r0.setMaxWidth(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.bkg
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                int r1 = r1.getMaxHeight()
                r0.setMaxHeight(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.bkg
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                int r1 = r1.getMinWidth()
                r0.setMinWidth(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.bkg
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                int r1 = r1.getMinHeight()
                r0.setMinHeight(r1)
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$3600(r0)
                if (r0 == 0) goto Lbb
                java.util.List<android.view.View> r0 = r8.blurViews
                if (r0 == 0) goto L96
                java.util.Iterator r0 = r0.iterator()
            L7e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lbb
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.WaitDialog.access$3700(r3)
                r1.setOverlayColor(r3)
                goto L7e
            L96:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_wait_bkg
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                int r1 = r1.getBackgroundColor()
                r0.setColor(r1)
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                float r1 = r1.getRadius()
                r0.setCornerRadius(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r8.bkg
                r1.setBackground(r0)
            Lbb:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$3800(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r0 = r0.overrideWaitTipRes()
                if (r0 == 0) goto L117
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r1 = com.kongzue.dialogx.dialogs.WaitDialog.access$3900(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$WaitTipRes r1 = r1.overrideWaitTipRes()
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                boolean r3 = r3.isLightTheme()
                int r1 = r1.overrideTextColorRes(r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                boolean r3 = r3.isLightTheme()
                if (r3 == 0) goto Lea
                int r3 = com.kongzue.dialogx.R.color.white
                goto Lec
            Lea:
                int r3 = com.kongzue.dialogx.R.color.black
            Lec:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.WaitDialog.access$4000(r0, r1, r3)
                int r0 = r0.intValue()
                android.widget.TextView r1 = r8.txtInfo
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                android.content.res.Resources r3 = r3.getResources()
                int r3 = r3.getColor(r0)
                r1.setTextColor(r3)
                com.kongzue.dialogx.interfaces.ProgressViewInterface r1 = r8.progressView
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                android.content.res.Resources r3 = r3.getResources()
                int r0 = r3.getColor(r0)
                r1.setColor(r0)
                goto L142
            L117:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                boolean r0 = r0.isLightTheme()
                if (r0 == 0) goto L122
                int r0 = com.kongzue.dialogx.R.color.white
                goto L124
            L122:
                int r0 = com.kongzue.dialogx.R.color.black
            L124:
                android.widget.TextView r1 = r8.txtInfo
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                android.content.res.Resources r3 = r3.getResources()
                int r3 = r3.getColor(r0)
                r1.setTextColor(r3)
                com.kongzue.dialogx.interfaces.ProgressViewInterface r1 = r8.progressView
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                android.content.res.Resources r3 = r3.getResources()
                int r0 = r3.getColor(r0)
                r1.setColor(r0)
            L142:
                java.lang.Integer r0 = com.kongzue.dialogx.DialogX.tipProgressColor
                if (r0 == 0) goto L14f
                com.kongzue.dialogx.interfaces.ProgressViewInterface r1 = r8.progressView
                int r0 = r0.intValue()
                r1.setColor(r0)
            L14f:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                float r0 = r0.waitProgress
                r1 = 0
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 < 0) goto L16f
                r1 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 > 0) goto L16f
                float r1 = r8.oldProgress
                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r1 == 0) goto L16f
                com.kongzue.dialogx.interfaces.ProgressViewInterface r1 = r8.progressView
                r1.progress(r0)
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                float r0 = r0.waitProgress
                r8.oldProgress = r0
            L16f:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                float r0 = r0.backgroundRadius
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L1aa
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.bkg
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$4
                r1.<init>(r8)
                r0.setOutlineProvider(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.bkg
                r0.setClipToOutline(r4)
                java.util.List<android.view.View> r0 = r8.blurViews
                if (r0 == 0) goto L1aa
                java.util.Iterator r0 = r0.iterator()
            L190:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1aa
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.WaitDialog r3 = r8.this$0
                float r3 = r3.backgroundRadius
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r1.setRadiusPx(r3)
                goto L190
            L1aa:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                android.widget.TextView r1 = r8.txtInfo
                java.lang.CharSequence r3 = r0.message
                if (r3 != 0) goto L1b8
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r3 = r0.readyTipType
                java.lang.CharSequence r3 = r8.getDefaultTipText(r3)
            L1b8:
                com.kongzue.dialogx.dialogs.WaitDialog.access$4100(r0, r1, r3)
                android.widget.TextView r0 = r8.txtInfo
                com.kongzue.dialogx.dialogs.WaitDialog r1 = r8.this$0
                com.kongzue.dialogx.util.TextInfo r1 = r1.messageTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r1)
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                java.lang.Integer r0 = r0.maskColor
                if (r0 == 0) goto L1d3
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r8.boxRoot
                int r0 = r0.intValue()
                r1.setBackgroundColor(r0)
            L1d3:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r0.onBindView
                r1 = 8
                if (r0 == 0) goto L1f5
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L1f5
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.WaitDialog> r3 = r0.onBindView
                android.widget.RelativeLayout r4 = r8.boxCustomView
                r3.bindParent(r4, r0)
                android.widget.RelativeLayout r0 = r8.boxCustomView
                r0.setVisibility(r2)
                android.widget.RelativeLayout r0 = r8.boxProgress
                r0.setVisibility(r1)
                goto L1ff
            L1f5:
                android.widget.RelativeLayout r0 = r8.boxCustomView
                r0.setVisibility(r1)
                android.widget.RelativeLayout r0 = r8.boxProgress
                r0.setVisibility(r2)
            L1ff:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                boolean r1 = r0.bkgInterceptTouch
                if (r1 == 0) goto L21d
                boolean r0 = r0.isCancelable()
                if (r0 == 0) goto L216
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$5
                r1.<init>(r8)
                r0.setOnClickListener(r1)
                goto L222
            L216:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                r1 = 0
                r0.setOnClickListener(r1)
                goto L222
            L21d:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                r0.setClickable(r2)
            L222:
                com.kongzue.dialogx.dialogs.WaitDialog r0 = r8.this$0
                com.kongzue.dialogx.dialogs.WaitDialog.access$4200(r0)
            L227:
                return
        }

        public void showTip(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
                r1 = this;
                com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8
                r0.<init>(r1, r2)
                com.kongzue.dialogx.dialogs.WaitDialog.access$5200(r0)
                return
        }
    }

    public enum TYPE extends java.lang.Enum<com.kongzue.dialogx.dialogs.WaitDialog.TYPE> {
        private static final /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog.TYPE[] $VALUES = null;
        public static final com.kongzue.dialogx.dialogs.WaitDialog.TYPE ERROR = null;

        @java.lang.Deprecated
        public static final com.kongzue.dialogx.dialogs.WaitDialog.TYPE NONE = null;

        @java.lang.Deprecated
        public static final com.kongzue.dialogx.dialogs.WaitDialog.TYPE PROGRESSING = null;
        public static final com.kongzue.dialogx.dialogs.WaitDialog.TYPE SUCCESS = null;
        public static final com.kongzue.dialogx.dialogs.WaitDialog.TYPE WARNING = null;

        static {
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = new com.kongzue.dialogx.dialogs.WaitDialog$TYPE
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE = r0
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = new com.kongzue.dialogx.dialogs.WaitDialog$TYPE
                java.lang.String r2 = "SUCCESS"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.dialogs.WaitDialog.TYPE.SUCCESS = r1
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r2 = new com.kongzue.dialogx.dialogs.WaitDialog$TYPE
                java.lang.String r3 = "WARNING"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.dialogs.WaitDialog.TYPE.WARNING = r2
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r3 = new com.kongzue.dialogx.dialogs.WaitDialog$TYPE
                java.lang.String r4 = "ERROR"
                r5 = 3
                r3.<init>(r4, r5)
                com.kongzue.dialogx.dialogs.WaitDialog.TYPE.ERROR = r3
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r4 = new com.kongzue.dialogx.dialogs.WaitDialog$TYPE
                java.lang.String r5 = "PROGRESSING"
                r6 = 4
                r4.<init>(r5, r6)
                com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING = r4
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE[] r0 = new com.kongzue.dialogx.dialogs.WaitDialog.TYPE[]{r0, r1, r2, r3, r4}
                com.kongzue.dialogx.dialogs.WaitDialog.TYPE.$VALUES = r0
                return
        }

        TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.dialogs.WaitDialog.TYPE valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.dialogs.WaitDialog$TYPE> r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = (com.kongzue.dialogx.dialogs.WaitDialog.TYPE) r1
                return r1
        }

        public static com.kongzue.dialogx.dialogs.WaitDialog.TYPE[] values() {
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE[] r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.dialogs.WaitDialog$TYPE[] r0 = (com.kongzue.dialogx.dialogs.WaitDialog.TYPE[]) r0
                return r0
        }
    }

    static {
            return
    }

    public WaitDialog() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.bkgInterceptTouch = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultWaitAndTipDialogBackgroundRadius
            float r0 = (float) r0
            r2.backgroundRadius = r0
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.tipShowDuration = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.waitProgress = r0
            r0 = -1
            r2.showType = r0
            r0 = 0
            r2.maskColor = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            r0.<init>(r1)
            r2.ownActivity = r0
            boolean r0 = com.kongzue.dialogx.DialogX.cancelableTipDialog
            r2.cancelable = r0
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$000(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$100(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$1000(com.kongzue.dialogx.dialogs.WaitDialog r0, com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl r1) {
            r0.setDialogImpl(r1)
            return
    }

    public static /* synthetic */ void access$1100(com.kongzue.dialogx.dialogs.WaitDialog r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1200(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1300(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1402(com.kongzue.dialogx.dialogs.WaitDialog r0, java.lang.Integer r1) {
            r0.backgroundColor = r1
            return r1
    }

    public static /* synthetic */ java.lang.ref.WeakReference access$1500(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            java.lang.ref.WeakReference<android.view.View> r0 = r0.dialogView
            return r0
    }

    public static /* synthetic */ java.util.List access$1600(com.kongzue.dialogx.dialogs.WaitDialog r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static /* synthetic */ int access$1700(com.kongzue.dialogx.dialogs.WaitDialog r0, int r1) {
            int r0 = r0.getColor(r1)
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1800(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1900(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$200(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Float access$2000(com.kongzue.dialogx.dialogs.WaitDialog r0, java.lang.Float r1, java.lang.Float r2) {
            java.lang.Float r0 = r0.getFloatStyleAttr(r1, r2)
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$2100(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2200(com.kongzue.dialogx.dialogs.WaitDialog r0, java.lang.Integer r1, java.lang.Integer r2) {
            java.lang.Integer r0 = r0.getIntStyleAttr(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2300(com.kongzue.dialogx.dialogs.WaitDialog r0, java.lang.Integer r1, java.lang.Integer r2) {
            java.lang.Integer r0 = r0.getColorNullable(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2400(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2500(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ boolean access$2602(com.kongzue.dialogx.dialogs.WaitDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ boolean access$2702(com.kongzue.dialogx.dialogs.WaitDialog r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ void access$2800(com.kongzue.dialogx.dialogs.WaitDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$2900(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ void access$300(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public static /* synthetic */ void access$3000(com.kongzue.dialogx.dialogs.WaitDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$3100(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ int[] access$3200(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3300(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3400(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3500(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3600(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3700(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$3800(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$3900(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$400(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$4000(com.kongzue.dialogx.dialogs.WaitDialog r0, java.lang.Integer r1, java.lang.Integer r2) {
            java.lang.Integer r0 = r0.getIntStyleAttr(r1, r2)
            return r0
    }

    public static /* synthetic */ void access$4100(com.kongzue.dialogx.dialogs.WaitDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4200(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$4300(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$4402(com.kongzue.dialogx.dialogs.WaitDialog r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$4500(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public static /* synthetic */ void access$4600(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ long access$4700(com.kongzue.dialogx.dialogs.WaitDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4800(com.kongzue.dialogx.dialogs.WaitDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4900(com.kongzue.dialogx.dialogs.WaitDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$500(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ long access$5000(com.kongzue.dialogx.dialogs.WaitDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ void access$5100(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ void access$5200(java.lang.Runnable r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$600(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$700(android.app.Activity r0, android.view.View r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0, r1)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$800(com.kongzue.dialogx.dialogs.WaitDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.util.List access$900(com.kongzue.dialogx.dialogs.WaitDialog r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog build() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = new com.kongzue.dialogx.dialogs.WaitDialog
            r0.<init>()
            return r0
    }

    public static void dismiss() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L9
            r0.doDismiss()
        L9:
            return
    }

    public static void dismiss(long r1) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L9
            r0.doDismiss(r1)
        L9:
            return
    }

    public static void dismiss(android.app.Activity r0) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance(r0)
            if (r0 == 0) goto L9
            r0.doDismiss()
        L9:
            return
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog getInstance() {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance(r0)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog getInstance(android.app.Activity r3) {
            if (r3 != 0) goto L6
            android.app.Activity r3 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
        L6:
            boolean r0 = com.kongzue.dialogx.interfaces.BaseDialog.isActivityDestroyed(r3)
            if (r0 == 0) goto Le
            r3 = 0
            return r3
        Le:
            java.util.List r0 = com.kongzue.dialogx.interfaces.BaseDialog.getRunningDialogList()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            com.kongzue.dialogx.interfaces.BaseDialog r1 = (com.kongzue.dialogx.interfaces.BaseDialog) r1
            boolean r2 = r1 instanceof com.kongzue.dialogx.dialogs.WaitDialog
            if (r2 == 0) goto L16
            boolean r2 = r1.isShow()
            if (r2 == 0) goto L16
            android.app.Activity r2 = r1.getOwnActivity()
            if (r2 != r3) goto L16
            com.kongzue.dialogx.dialogs.WaitDialog r1 = (com.kongzue.dialogx.dialogs.WaitDialog) r1
            return r1
        L35:
            com.kongzue.dialogx.dialogs.WaitDialog r3 = new com.kongzue.dialogx.dialogs.WaitDialog
            r3.<init>()
            return r3
    }

    public static java.lang.CharSequence getMessage() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = me()
            java.lang.CharSequence r0 = r0.message
            return r0
    }

    public static int getType() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = me()
            int r0 = r0.showType
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog instanceBuild() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = new com.kongzue.dialogx.dialogs.WaitDialog
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog me() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 != 0) goto La
            com.kongzue.dialogx.dialogs.WaitDialog r0 = instanceBuild()
        La:
            return r0
    }

    private void setDialogImpl(com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl> r0 = r1.dialogImpl
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()
            if (r0 == r2) goto L11
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.dialogImpl = r0
        L11:
            return
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog setMessage(int r1) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto Ld
            r0.preMessage(r1)
            r0.refreshUI()
            return r0
        Ld:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog setMessage(java.lang.CharSequence r1) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto Ld
            r0.preMessage(r1)
            r0.refreshUI()
            return r0
        Ld:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(float r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L1c
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING
            r0.setTip(r1)
            r0.setProgress(r2)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r0.getDialogImpl()
            if (r2 != 0) goto L18
            r0.show()
            goto L1b
        L18:
            r0.cancelDelayDismissTimer()
        L1b:
            return r0
        L1c:
            com.kongzue.dialogx.dialogs.WaitDialog r2 = instanceBuild()
            return r2
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(int r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L19
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE
            r0.setTip(r2, r1)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r0.getDialogImpl()
            if (r2 != 0) goto L15
            r0.show()
            goto L18
        L15:
            r0.cancelDelayDismissTimer()
        L18:
            return r0
        L19:
            com.kongzue.dialogx.dialogs.WaitDialog r2 = instanceBuild()
            return r2
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(int r2, float r3) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L1c
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING
            r0.setTip(r2, r1)
            r0.setProgress(r3)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r0.getDialogImpl()
            if (r2 != 0) goto L18
            r0.show()
            goto L1b
        L18:
            r0.cancelDelayDismissTimer()
        L1b:
            return r0
        L1c:
            com.kongzue.dialogx.dialogs.WaitDialog r2 = instanceBuild()
            return r2
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, float r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = getInstance(r1)
            if (r1 == 0) goto L1c
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING
            r1.setTip(r0)
            r1.setProgress(r2)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L18
            r1.show()
            goto L1b
        L18:
            r1.cancelDelayDismissTimer()
        L1b:
            return r1
        L1c:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, int r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = getInstance(r1)
            if (r1 == 0) goto L19
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE
            r1.setTip(r2, r0)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L15
            r1.show()
            goto L18
        L15:
            r1.cancelDelayDismissTimer()
        L18:
            return r1
        L19:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, int r2, float r3) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = getInstance(r1)
            if (r1 == 0) goto L1c
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING
            r1.setTip(r2, r0)
            r1.setProgress(r3)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L18
            r1.show()
            goto L1b
        L18:
            r1.cancelDelayDismissTimer()
        L1b:
            return r1
        L1c:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = getInstance(r1)
            if (r1 == 0) goto L19
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE
            r1.setTip(r2, r0)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L15
            r1.show()
            goto L18
        L15:
            r1.cancelDelayDismissTimer()
        L18:
            return r1
        L19:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, java.lang.CharSequence r2, float r3) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = getInstance(r1)
            if (r1 == 0) goto L1c
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING
            r1.setTip(r2, r0)
            r1.setProgress(r3)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L18
            r1.show()
            goto L1b
        L18:
            r1.cancelDelayDismissTimer()
        L1b:
            return r1
        L1c:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L19
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE
            r0.setTip(r2, r1)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r0.getDialogImpl()
            if (r2 != 0) goto L15
            r0.show()
            goto L18
        L15:
            r0.cancelDelayDismissTimer()
        L18:
            return r0
        L19:
            com.kongzue.dialogx.dialogs.WaitDialog r2 = instanceBuild()
            return r2
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(java.lang.CharSequence r2, float r3) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L1c
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.PROGRESSING
            r0.setTip(r2, r1)
            r0.setProgress(r3)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r0.getDialogImpl()
            if (r2 != 0) goto L18
            r0.show()
            goto L1b
        L18:
            r0.cancelDelayDismissTimer()
        L1b:
            return r0
        L1c:
            com.kongzue.dialogx.dialogs.WaitDialog r2 = instanceBuild()
            return r2
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog showTipWithDefaultText(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L18
            r1 = 0
            r0.setTip(r1, r2)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r0.getDialogImpl()
            if (r2 != 0) goto L14
            r0.show()
            goto L17
        L14:
            r0.cancelDelayDismissTimer()
        L17:
            return r0
        L18:
            com.kongzue.dialogx.dialogs.WaitDialog r2 = instanceBuild()
            return r2
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog showWaitWithDefaultText() {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = getInstance()
            if (r0 == 0) goto L1a
            r1 = 0
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r2 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.NONE
            r0.setTip(r1, r2)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r0.getDialogImpl()
            if (r1 != 0) goto L16
            r0.show()
            goto L19
        L16:
            r0.cancelDelayDismissTimer()
        L19:
            return r0
        L1a:
            com.kongzue.dialogx.dialogs.WaitDialog r0 = instanceBuild()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog appendMessage(java.lang.CharSequence r4) {
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

    public com.kongzue.dialogx.dialogs.WaitDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            dismiss()
            return
    }

    public void cancelDelayDismissTimer() {
            r1 = this;
            java.util.Timer r0 = r1.delayDismissTimer
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public com.kongzue.dialogx.dialogs.WaitDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    public void cleanInstance() {
            r2 = this;
            r0 = 0
            r2.isShow = r0
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback r0 = r2.getDialogLifecycleCallback()
            r0.onDismiss(r2)
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            r2.setLifecycleState(r0)
            java.lang.ref.WeakReference<com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl> r0 = r2.dialogImpl
            if (r0 == 0) goto L16
            r0.clear()
        L16:
            r0 = 0
            r2.dialogImpl = r0
            java.lang.ref.WeakReference<android.view.View> r1 = r2.dialogView
            if (r1 == 0) goto L20
            r1.clear()
        L20:
            r2.dialogView = r0
            r2.dialogLifecycleCallback = r0
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.ownActivity
            if (r0 == 0) goto L2b
            r0.clear()
        L2b:
            com.kongzue.dialogx.interfaces.BaseDialog.gc()
            return
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

    public void doDismiss() {
            r1 = this;
            r0 = 0
            r1.isShow = r0
            com.kongzue.dialogx.dialogs.WaitDialog$4 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$4
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public void doDismiss(long r3) {
            r2 = this;
            r2.cancelDelayDismissTimer()
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r2.delayDismissTimer = r0
            com.kongzue.dialogx.dialogs.WaitDialog$5 r1 = new com.kongzue.dialogx.dialogs.WaitDialog$5
            r1.<init>(r2)
            r0.schedule(r1, r3)
            return
    }

    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl getDialogImpl() {
            r1 = this;
            java.lang.ref.WeakReference<com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl> r0 = r1.dialogImpl
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = (com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl) r0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.WaitDialog> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.WaitDialog$6 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$6
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    public long getExitAnimDuration() {
            r2 = this;
            long r0 = r2.exitAnimDuration
            return r0
    }

    public java.lang.CharSequence getMessageContent() {
            r1 = this;
            java.lang.CharSequence r0 = r1.message
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getMessageTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.messageTextInfo
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.WaitDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.onBackPressedListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.waitProgress
            return r0
    }

    public float getRadius() {
            r2 = this;
            float r0 = r2.backgroundRadius
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto Le
            r0 = 1097859072(0x41700000, float:15.0)
            int r0 = r2.dip2px(r0)
            float r0 = (float) r0
        Le:
            return r0
    }

    public android.view.View getWaitDialogView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.dialogView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
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
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.WaitDialog.overrideCancelable
            if (r0 == 0) goto L16
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto L15
            r1 = r2
        L15:
            return r1
        L16:
            boolean r0 = com.kongzue.dialogx.DialogX.cancelableTipDialog
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isLightTheme() {
            r2 = this;
            com.kongzue.dialogx.DialogX$THEME r0 = com.kongzue.dialogx.DialogX.tipTheme
            if (r0 != 0) goto L9
            boolean r0 = super.isLightTheme()
            return r0
        L9:
            com.kongzue.dialogx.DialogX$THEME r1 = com.kongzue.dialogx.DialogX.THEME.LIGHT
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
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

    public com.kongzue.dialogx.dialogs.WaitDialog preMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog preMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.WaitDialog$3 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$3
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.WaitDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r0 = this;
            r0.refreshUI()
            return
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.WaitDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setAnimResId(int r1, int r2) {
            r0 = this;
            r0.customEnterAnimResId = r1
            r0.customExitAnimResId = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setCancelable(boolean r1) {
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

    public com.kongzue.dialogx.dialogs.WaitDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.WaitDialog setData(java.lang.String r2, java.lang.Object r3) {
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
            com.kongzue.dialogx.dialogs.WaitDialog r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.WaitDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Ld
            com.kongzue.dialogx.dialogs.WaitDialog r0 = me()
            r2.onShow(r0)
        Ld:
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.WaitDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.WaitDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setEnterAnimResId(int r1) {
            r0 = this;
            r0.customEnterAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setExitAnimResId(int r1) {
            r0 = this;
            r0.customExitAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMessageContent(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMessageContent(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setProgress(float r1) {
            r0 = this;
            r0.waitProgress = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.WaitDialog setThisOrderIndex(int r2) {
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
            com.kongzue.dialogx.dialogs.WaitDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public void setTip(int r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.showTip(r2)
            r0.refreshUI()
            return
    }

    public void setTip(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r1) {
            r0 = this;
            r0.showTip(r1)
            return
    }

    public void setTip(java.lang.CharSequence r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            r0 = this;
            r0.message = r1
            r0.showTip(r2)
            r0.refreshUI()
            return
    }

    public void setTipShowDuration(long r1) {
            r0 = this;
            r0.tipShowDuration = r1
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r1 = r0.readyTipType
            r0.showTip(r1)
            return
    }

    public com.kongzue.dialogx.dialogs.WaitDialog setTipType(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r1) {
            r0 = this;
            r0.showTip(r1)
            return r0
    }

    public void setWaitDialogView(android.view.View r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.dialogView = r0
            r1.setDialogView(r2)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.WaitDialog show() {
            r1 = this;
            super.beforeShow()
            com.kongzue.dialogx.dialogs.WaitDialog$1 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$1
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return r1
    }

    public com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r2) {
            r1 = this;
            super.beforeShow()
            com.kongzue.dialogx.dialogs.WaitDialog$2 r0 = new com.kongzue.dialogx.dialogs.WaitDialog$2
            r0.<init>(r1, r2)
            r2.runOnUiThread(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.WaitDialog r0 = r1.show()
            return r0
    }

    public void showTip(int r2, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r3) {
            r1 = this;
            int r0 = r3.ordinal()
            r1.showType = r0
            java.lang.String r2 = r1.getString(r2)
            r1.message = r2
            r1.readyTipType = r3
            r1.show()
            return
    }

    public void showTip(android.app.Activity r2, int r3, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r4) {
            r1 = this;
            int r0 = r4.ordinal()
            r1.showType = r0
            java.lang.String r3 = r1.getString(r3)
            r1.message = r3
            r1.readyTipType = r4
            r1.show(r2)
            return
    }

    public void showTip(android.app.Activity r2, java.lang.CharSequence r3, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r4) {
            r1 = this;
            int r0 = r4.ordinal()
            r1.showType = r0
            r1.message = r3
            r1.readyTipType = r4
            r1.show(r2)
            return
    }

    public void showTip(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            r1 = this;
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = r1.readyTipType
            if (r0 != r2) goto L5
            return
        L5:
            int r0 = r2.ordinal()
            r1.showType = r0
            r1.readyTipType = r2
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 == 0) goto L1a
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r0 = r1.getDialogImpl()
            r0.showTip(r2)
        L1a:
            return
    }

    public void showTip(java.lang.CharSequence r2, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r3) {
            r1 = this;
            int r0 = r3.ordinal()
            r1.showType = r0
            r1.message = r2
            r1.readyTipType = r3
            r1.show()
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            dismiss()
            return
    }
}
