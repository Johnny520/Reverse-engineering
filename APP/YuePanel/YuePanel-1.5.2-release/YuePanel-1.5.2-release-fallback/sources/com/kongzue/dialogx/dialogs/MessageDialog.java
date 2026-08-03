package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class MessageDialog extends com.kongzue.dialogx.interfaces.BaseDialog {
    public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterAnimRes = 0;
    public static int overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static int overrideExitDuration = -1;
    protected float backgroundRadius;
    protected boolean bkgInterceptTouch;
    protected int buttonOrientation;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT buttonSelectResult;
    protected com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback cancelButtonClickListener;
    protected java.lang.CharSequence cancelText;
    protected com.kongzue.dialogx.util.TextInfo cancelTextInfo;
    protected int customEnterAnimResId;
    protected int customExitAnimResId;
    protected com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.MessageDialog> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> dialogXAnimImpl;
    protected boolean hideWithExitAnim;
    protected java.lang.String inputHintText;
    protected com.kongzue.dialogx.util.InputInfo inputInfo;
    protected java.lang.String inputText;
    protected java.lang.Integer maskColor;
    protected com.kongzue.dialogx.dialogs.MessageDialog me;
    protected java.lang.CharSequence message;
    protected com.kongzue.dialogx.util.TextInfo messageTextInfo;
    protected com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback okButtonClickListener;
    protected java.lang.CharSequence okText;
    protected com.kongzue.dialogx.util.TextInfo okTextInfo;
    protected com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> onBackPressedListener;
    protected com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> onBackgroundMaskClickListener;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> onBindView;
    protected com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback otherButtonClickListener;
    protected java.lang.CharSequence otherText;
    protected com.kongzue.dialogx.util.TextInfo otherTextInfo;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN privateCancelable;
    protected java.lang.CharSequence title;
    protected android.graphics.drawable.Drawable titleIcon;
    protected com.kongzue.dialogx.util.TextInfo titleTextInfo;





    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        public com.kongzue.dialogx.util.views.MaxRelativeLayout bkg;
        private java.util.List<android.view.View> blurViews;
        public android.widget.LinearLayout boxButton;
        public android.widget.RelativeLayout boxCustom;
        public android.view.ViewGroup boxList;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        public android.widget.TextView btnSelectNegative;
        public android.widget.TextView btnSelectOther;
        public android.widget.TextView btnSelectPositive;
        public com.kongzue.dialogx.interfaces.ScrollController scrollView;
        public android.view.View spaceOtherButton;
        public android.view.View splitHorizontal;
        final /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog this$0;
        public android.widget.TextView txtDialogTip;
        public android.widget.TextView txtDialogTitle;
        public android.widget.EditText txtInput;










        public DialogImpl(com.kongzue.dialogx.dialogs.MessageDialog r2, android.view.View r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                if (r3 != 0) goto L8
                return
            L8:
                com.kongzue.dialogx.dialogs.MessageDialog.access$000(r2, r3)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r3.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r1.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.bkg
                android.view.View r0 = r3.findViewById(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
                r1.bkg = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialog_title
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogTitle = r0
                int r0 = com.kongzue.dialogx.R.id.scrollView
                android.view.View r0 = r3.findViewById(r0)
                com.kongzue.dialogx.interfaces.ScrollController r0 = (com.kongzue.dialogx.interfaces.ScrollController) r0
                r1.scrollView = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialog_tip
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.txtDialogTip = r0
                int r0 = com.kongzue.dialogx.R.id.box_list
                android.view.View r0 = r3.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r1.boxList = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r0 = r3.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r1.boxCustom = r0
                int r0 = com.kongzue.dialogx.R.id.txt_input
                android.view.View r0 = r3.findViewById(r0)
                android.widget.EditText r0 = (android.widget.EditText) r0
                r1.txtInput = r0
                int r0 = com.kongzue.dialogx.R.id.box_button
                android.view.View r0 = r3.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r1.boxButton = r0
                int r0 = com.kongzue.dialogx.R.id.btn_selectOther
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.btnSelectOther = r0
                int r0 = com.kongzue.dialogx.R.id.space_other_button
                android.view.View r0 = r3.findViewById(r0)
                r1.spaceOtherButton = r0
                java.lang.String r0 = "split"
                android.view.View r0 = r3.findViewWithTag(r0)
                r1.splitHorizontal = r0
                int r0 = com.kongzue.dialogx.R.id.btn_selectNegative
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.btnSelectNegative = r0
                int r0 = com.kongzue.dialogx.R.id.btn_selectPositive
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.btnSelectPositive = r0
                java.util.List r3 = com.kongzue.dialogx.dialogs.MessageDialog.access$100(r2, r3)
                r1.blurViews = r3
                r1.init()
                r2.dialogImpl = r1
                r1.refreshView()
                return
        }

        public static /* synthetic */ java.util.List access$1600(com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl r0) {
                java.util.List<android.view.View> r0 = r0.blurViews
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r3) {
                r2 = this;
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                if (r3 == 0) goto Lf
                r0 = 0
                r3.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.MessageDialog r3 = r2.this$0
                android.app.Activity r3 = r3.getOwnActivity()
                if (r3 != 0) goto L18
                return
            L18:
                com.kongzue.dialogx.dialogs.MessageDialog r3 = r2.this$0
                boolean r3 = com.kongzue.dialogx.dialogs.MessageDialog.access$7600(r3)
                if (r3 != 0) goto L44
                com.kongzue.dialogx.interfaces.DialogXAnimInterface r3 = r2.getDialogXAnimImpl()
                if (r3 == 0) goto L44
                com.kongzue.dialogx.dialogs.MessageDialog r3 = r2.this$0
                r0 = 1
                com.kongzue.dialogx.dialogs.MessageDialog.access$7702(r3, r0)
                com.kongzue.dialogx.interfaces.DialogXAnimInterface r3 = r2.getDialogXAnimImpl()
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r2.bkg
                r3.doExitAnim(r0, r1)
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$8 r3 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$8
                r3.<init>(r2)
                r0 = 0
                long r0 = r2.getExitAnimationDuration(r0)
                com.kongzue.dialogx.dialogs.MessageDialog.access$7900(r3, r0)
            L44:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$9 r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$9
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r0.dialogXAnimImpl
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
                int r7 = com.kongzue.dialogx.dialogs.MessageDialog.overrideEnterDuration
                if (r7 < 0) goto L29
                long r2 = (long) r7
            L29:
                com.kongzue.dialogx.dialogs.MessageDialog r7 = r6.this$0
                long r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$8600(r7)
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L39
                com.kongzue.dialogx.dialogs.MessageDialog r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$8700(r7)
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
                int r7 = com.kongzue.dialogx.dialogs.MessageDialog.overrideExitDuration
                if (r7 < 0) goto L29
                long r0 = (long) r7
            L29:
                com.kongzue.dialogx.dialogs.MessageDialog r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$8400(r7)
                r4 = -1
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L3b
                com.kongzue.dialogx.dialogs.MessageDialog r7 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.MessageDialog.access$8500(r7)
            L3b:
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r2 = this;
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
                r0.buttonSelectResult = r1
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.MessageDialog r1 = r2.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                com.kongzue.dialogx.util.TextInfo r1 = r0.titleTextInfo
                if (r1 != 0) goto L1e
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.titleTextInfo
                r0.titleTextInfo = r1
            L1e:
                com.kongzue.dialogx.util.TextInfo r1 = r0.messageTextInfo
                if (r1 != 0) goto L26
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.messageTextInfo
                r0.messageTextInfo = r1
            L26:
                com.kongzue.dialogx.util.TextInfo r1 = r0.okTextInfo
                if (r1 != 0) goto L2e
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.okButtonTextInfo
                r0.okTextInfo = r1
            L2e:
                com.kongzue.dialogx.util.TextInfo r1 = r0.okTextInfo
                if (r1 != 0) goto L36
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.buttonTextInfo
                r0.okTextInfo = r1
            L36:
                com.kongzue.dialogx.util.TextInfo r1 = r0.cancelTextInfo
                if (r1 != 0) goto L3e
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.buttonTextInfo
                r0.cancelTextInfo = r1
            L3e:
                com.kongzue.dialogx.util.TextInfo r1 = r0.otherTextInfo
                if (r1 != 0) goto L46
                com.kongzue.dialogx.util.TextInfo r1 = com.kongzue.dialogx.DialogX.buttonTextInfo
                r0.otherTextInfo = r1
            L46:
                com.kongzue.dialogx.util.InputInfo r1 = r0.inputInfo
                if (r1 != 0) goto L4e
                com.kongzue.dialogx.util.InputInfo r1 = com.kongzue.dialogx.DialogX.inputInfo
                r0.inputInfo = r1
            L4e:
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.MessageDialog.access$200(r0)
                if (r0 != 0) goto L5b
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                java.lang.Integer r1 = com.kongzue.dialogx.DialogX.backgroundColor
                com.kongzue.dialogx.dialogs.MessageDialog.access$302(r0, r1)
            L5b:
                android.widget.TextView r0 = r2.txtDialogTitle
                android.text.TextPaint r0 = r0.getPaint()
                r1 = 1
                r0.setFakeBoldText(r1)
                android.widget.TextView r0 = r2.btnSelectNegative
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
                android.widget.TextView r0 = r2.btnSelectPositive
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
                android.widget.TextView r0 = r2.btnSelectOther
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
                android.widget.TextView r0 = r2.txtDialogTip
                android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
                r0.setMovementMethod(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                r1 = 0
                r0.setBkgAlpha(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.MessageDialog r1 = r2.this$0
                com.kongzue.dialogx.dialogs.MessageDialog r1 = r1.me
                r0.setParentDialog(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$1
                r1.<init>(r2)
                r0.setOnLifecycleCallBack(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.boxRoot
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$2
                r1.<init>(r2)
                r0.setOnBackPressedListener(r1)
                android.widget.TextView r0 = r2.btnSelectPositive
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$3
                r1.<init>(r2)
                r0.setOnClickListener(r1)
                android.widget.TextView r0 = r2.btnSelectNegative
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$4
                r1.<init>(r2)
                r0.setOnClickListener(r1)
                android.widget.TextView r0 = r2.btnSelectOther
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$5
                r1.<init>(r2)
                r0.setOnClickListener(r1)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r2.this$0
                com.kongzue.dialogx.dialogs.MessageDialog.access$3000(r0)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r16 = this;
                r1 = r16
                r2 = 0
                r3 = 1
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                if (r0 == 0) goto L753
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.app.Activity r0 = r0.getOwnActivity()
                if (r0 != 0) goto L12
                goto L753
            L12:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                boolean r4 = r4.isEnableImmersiveMode()
                r0.setAutoUnsafePlacePadding(r4)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                if (r0 == 0) goto L44
                java.lang.Integer r0 = r0.getBottomLineColor()
                if (r0 == 0) goto L44
                android.widget.EditText r0 = r1.txtInput
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r4 = r4.inputInfo
                java.lang.Integer r4 = r4.getBottomLineColor()
                int r4 = r4.intValue()
                android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
                r0.setColorFilter(r4, r5)
            L44:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                if (r0 == 0) goto L151
                java.lang.Integer r0 = r0.getCursorColor()
                if (r0 == 0) goto L151
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                java.lang.Integer r0 = r0.getCursorColor()
                int r0 = r0.intValue()
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 29
                java.lang.String r6 = "中设置光标颜色时发生错误！"
                java.lang.String r7 = "DialogX: 在对话框"
                java.lang.String r8 = "mCursorDrawableRes"
                java.lang.Class<android.widget.TextView> r9 = android.widget.TextView.class
                if (r4 < r5) goto Ld5
                android.widget.EditText r4 = r1.txtInput
                android.graphics.drawable.Drawable r4 = Yue.C6148.m23009(r4)
                if (r4 == 0) goto L88
                android.widget.EditText r4 = r1.txtInput
                android.graphics.drawable.Drawable r4 = Yue.C6148.m23009(r4)
                android.graphics.drawable.Drawable r4 = r4.mutate()
                android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
                android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
                r5.<init>(r0, r6)
                r4.setColorFilter(r5)
                goto L151
            L88:
                java.lang.reflect.Field r4 = r9.getDeclaredField(r8)     // Catch: java.lang.Throwable -> Lb0
                r4.setAccessible(r3)     // Catch: java.lang.Throwable -> Lb0
                android.widget.EditText r5 = r1.txtInput     // Catch: java.lang.Throwable -> Lb0
                int r8 = com.kongzue.dialogx.R.drawable.rect_dialogx_defalut_edittxt_cursor     // Catch: java.lang.Throwable -> Lb0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb0
                r4.set(r5, r8)     // Catch: java.lang.Throwable -> Lb0
                android.widget.EditText r4 = r1.txtInput     // Catch: java.lang.Throwable -> Lb0
                android.graphics.drawable.Drawable r4 = Yue.C6148.m23009(r4)     // Catch: java.lang.Throwable -> Lb0
                android.graphics.drawable.Drawable r4 = r4.mutate()     // Catch: java.lang.Throwable -> Lb0
                android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> Lb0
                android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch: java.lang.Throwable -> Lb0
                r5.<init>(r0, r8)     // Catch: java.lang.Throwable -> Lb0
                r4.setColorFilter(r5)     // Catch: java.lang.Throwable -> Lb0
                goto L151
            Lb0:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                java.lang.String r5 = r5.dialogKey()
                r4.append(r5)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                com.kongzue.dialogx.dialogs.MessageDialog.access$3100(r4)
                boolean r4 = com.kongzue.dialogx.DialogX.DEBUGMODE
                if (r4 == 0) goto L151
                r0.printStackTrace()
                goto L151
            Ld5:
                java.lang.reflect.Field r4 = r9.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L12e
                r4.setAccessible(r3)     // Catch: java.lang.Throwable -> L12e
                android.widget.EditText r5 = r1.txtInput     // Catch: java.lang.Throwable -> L12e
                int r4 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L12e
                java.lang.String r5 = "mEditor"
                java.lang.reflect.Field r5 = r9.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L12e
                r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L12e
                android.widget.EditText r8 = r1.txtInput     // Catch: java.lang.Throwable -> L12e
                java.lang.Object r5 = r5.get(r8)     // Catch: java.lang.Throwable -> L12e
                java.lang.Class r8 = r5.getClass()     // Catch: java.lang.Throwable -> L12e
                java.lang.String r9 = "mCursorDrawable"
                java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch: java.lang.Throwable -> L12e
                r8.setAccessible(r3)     // Catch: java.lang.Throwable -> L12e
                android.widget.EditText r9 = r1.txtInput     // Catch: java.lang.Throwable -> L12e
                android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L12e
                android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> L12e
                android.graphics.drawable.Drawable r9 = r9.getDrawable(r4)     // Catch: java.lang.Throwable -> L12e
                android.widget.EditText r10 = r1.txtInput     // Catch: java.lang.Throwable -> L12e
                android.content.Context r10 = r10.getContext()     // Catch: java.lang.Throwable -> L12e
                android.content.res.Resources r10 = r10.getResources()     // Catch: java.lang.Throwable -> L12e
                android.graphics.drawable.Drawable r4 = r10.getDrawable(r4)     // Catch: java.lang.Throwable -> L12e
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[]{r9, r4}     // Catch: java.lang.Throwable -> L12e
                r9 = r4[r2]     // Catch: java.lang.Throwable -> L12e
                android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch: java.lang.Throwable -> L12e
                r9.setColorFilter(r0, r10)     // Catch: java.lang.Throwable -> L12e
                r9 = r4[r3]     // Catch: java.lang.Throwable -> L12e
                r9.setColorFilter(r0, r10)     // Catch: java.lang.Throwable -> L12e
                r8.set(r5, r4)     // Catch: java.lang.Throwable -> L12e
                goto L151
            L12e:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                java.lang.String r5 = r5.dialogKey()
                r4.append(r5)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                com.kongzue.dialogx.dialogs.MessageDialog.access$3200(r4)
                boolean r4 = com.kongzue.dialogx.DialogX.DEBUGMODE
                if (r4 == 0) goto L151
                r0.printStackTrace()
            L151:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                int[] r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$3300(r4)
                r4 = r4[r2]
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                int[] r5 = com.kongzue.dialogx.dialogs.MessageDialog.access$3400(r5)
                r5 = r5[r3]
                com.kongzue.dialogx.dialogs.MessageDialog r6 = r1.this$0
                int[] r6 = com.kongzue.dialogx.dialogs.MessageDialog.access$3500(r6)
                r7 = 2
                r6 = r6[r7]
                com.kongzue.dialogx.dialogs.MessageDialog r8 = r1.this$0
                int[] r8 = com.kongzue.dialogx.dialogs.MessageDialog.access$3600(r8)
                r9 = 3
                r8 = r8[r9]
                r0.setRootPadding(r4, r5, r6, r8)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.MessageDialog.access$3700(r0)
                if (r0 == 0) goto L203
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r4 = r1.bkg
                java.lang.Integer r5 = com.kongzue.dialogx.dialogs.MessageDialog.access$3800(r0)
                int r5 = r5.intValue()
                r0.tintColor(r4, r5)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.MessageDialog.access$3900(r0)
                boolean r0 = r0.tintButtonBackground()
                if (r0 == 0) goto L1c8
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.btnSelectOther
                java.lang.Integer r5 = com.kongzue.dialogx.dialogs.MessageDialog.access$4000(r0)
                int r5 = r5.intValue()
                r0.tintColor(r4, r5)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.btnSelectNegative
                java.lang.Integer r5 = com.kongzue.dialogx.dialogs.MessageDialog.access$4100(r0)
                int r5 = r5.intValue()
                r0.tintColor(r4, r5)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.btnSelectPositive
                java.lang.Integer r5 = com.kongzue.dialogx.dialogs.MessageDialog.access$4200(r0)
                int r5 = r5.intValue()
                r0.tintColor(r4, r5)
            L1c8:
                java.util.List<android.view.View> r0 = r1.blurViews
                if (r0 == 0) goto L203
                java.lang.String r0 = "#blurViews != null"
                com.kongzue.dialogx.dialogs.MessageDialog.access$4300(r0)
                java.util.List<android.view.View> r0 = r1.blurViews
                java.util.Iterator r0 = r0.iterator()
            L1d7:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L203
                java.lang.Object r4 = r0.next()
                android.view.View r4 = (android.view.View) r4
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "#blurView: "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                com.kongzue.dialogx.dialogs.MessageDialog.access$4400(r5)
                com.kongzue.dialogx.interfaces.BlurViewType r4 = (com.kongzue.dialogx.interfaces.BlurViewType) r4
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                java.lang.Integer r5 = com.kongzue.dialogx.dialogs.MessageDialog.access$4500(r5)
                r4.setOverlayColor(r5)
                goto L1d7
            L203:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.bkg
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                int r4 = r4.getMaxWidth()
                r0.setMaxWidth(r4)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.bkg
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                int r4 = r4.getMaxHeight()
                r0.setMaxHeight(r4)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.bkg
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                int r4 = r4.getMinWidth()
                r0.setMinimumWidth(r4)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.bkg
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                int r4 = r4.getMinHeight()
                r0.setMinimumHeight(r4)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                java.lang.String r4 = "dialogx_editbox"
                android.view.View r0 = r0.findViewWithTag(r4)
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r4.me
                boolean r4 = r4 instanceof com.kongzue.dialogx.dialogs.InputDialog
                r5 = 8
                if (r4 == 0) goto L253
                if (r0 == 0) goto L246
                r0.setVisibility(r2)
            L246:
                android.widget.EditText r0 = r1.txtInput
                r0.setVisibility(r2)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                android.widget.EditText r4 = r1.txtInput
                r0.bindFocusView(r4)
                goto L25d
            L253:
                if (r0 == 0) goto L258
                r0.setVisibility(r5)
            L258:
                android.widget.EditText r0 = r1.txtInput
                r0.setVisibility(r5)
            L25d:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                r0.setClickable(r3)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                java.lang.Integer r0 = r0.maskColor
                if (r0 == 0) goto L271
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r1.boxRoot
                int r0 = r0.intValue()
                r4.setBackgroundColor(r0)
            L271:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                float r0 = r0.backgroundRadius
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 <= 0) goto L2ac
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.bkg
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$6 r4 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$6
                r4.<init>(r1)
                r0.setOutlineProvider(r4)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.bkg
                r0.setClipToOutline(r3)
                java.util.List<android.view.View> r0 = r1.blurViews
                if (r0 == 0) goto L2ac
                java.util.Iterator r0 = r0.iterator()
            L292:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L2ac
                java.lang.Object r4 = r0.next()
                android.view.View r4 = (android.view.View) r4
                com.kongzue.dialogx.interfaces.BlurViewType r4 = (com.kongzue.dialogx.interfaces.BlurViewType) r4
                com.kongzue.dialogx.dialogs.MessageDialog r6 = r1.this$0
                float r6 = r6.backgroundRadius
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                r4.setRadiusPx(r6)
                goto L292
            L2ac:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.txtDialogTitle
                java.lang.CharSequence r6 = r0.title
                if (r6 != 0) goto L2b6
                java.lang.CharSequence r6 = com.kongzue.dialogx.DialogX.defaultMessageDialogTitleText
            L2b6:
                com.kongzue.dialogx.dialogs.MessageDialog.access$4600(r0, r4, r6)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.txtDialogTip
                java.lang.CharSequence r6 = r0.message
                com.kongzue.dialogx.dialogs.MessageDialog.access$4700(r0, r4, r6)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.btnSelectPositive
                java.lang.CharSequence r6 = r0.okText
                com.kongzue.dialogx.dialogs.MessageDialog.access$4800(r0, r4, r6)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.btnSelectNegative
                java.lang.CharSequence r6 = r0.cancelText
                com.kongzue.dialogx.dialogs.MessageDialog.access$4900(r0, r4, r6)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.widget.TextView r4 = r1.btnSelectOther
                java.lang.CharSequence r6 = r0.otherText
                com.kongzue.dialogx.dialogs.MessageDialog.access$5000(r0, r4, r6)
                android.widget.EditText r0 = r1.txtInput
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                java.lang.String r4 = r4.inputText
                r0.setText(r4)
                android.widget.EditText r0 = r1.txtInput
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                java.lang.String r4 = r4.inputHintText
                r0.setHint(r4)
                android.view.View r0 = r1.spaceOtherButton
                if (r0 == 0) goto L300
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                java.lang.CharSequence r4 = r4.otherText
                if (r4 != 0) goto L2fd
                r0.setVisibility(r5)
                goto L300
            L2fd:
                r0.setVisibility(r2)
            L300:
                android.widget.TextView r0 = r1.txtDialogTitle
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.util.TextInfo r4 = r4.titleTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r4)
                android.widget.TextView r0 = r1.txtDialogTip
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.util.TextInfo r4 = r4.messageTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r4)
                android.widget.TextView r0 = r1.btnSelectPositive
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.util.TextInfo r4 = r4.okTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r4)
                android.widget.TextView r0 = r1.btnSelectNegative
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.util.TextInfo r4 = r4.cancelTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r4)
                android.widget.TextView r0 = r1.btnSelectOther
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.util.TextInfo r4 = r4.otherTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r4)
                android.widget.LinearLayout r0 = r1.boxButton
                if (r0 == 0) goto L355
                android.widget.TextView r4 = r1.btnSelectNegative
                if (r4 == 0) goto L33b
                int r4 = r4.getVisibility()
                if (r4 == 0) goto L34f
            L33b:
                android.widget.TextView r4 = r1.btnSelectOther
                if (r4 == 0) goto L345
                int r4 = r4.getVisibility()
                if (r4 == 0) goto L34f
            L345:
                android.widget.TextView r4 = r1.btnSelectPositive
                if (r4 == 0) goto L351
                int r4 = r4.getVisibility()
                if (r4 != 0) goto L351
            L34f:
                r4 = r2
                goto L352
            L351:
                r4 = r5
            L352:
                r0.setVisibility(r4)
            L355:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                android.graphics.drawable.Drawable r0 = r0.titleIcon
                r4 = 0
                if (r0 == 0) goto L380
                android.widget.TextView r0 = r1.txtDialogTitle
                float r0 = r0.getTextSize()
                int r0 = (int) r0
                com.kongzue.dialogx.dialogs.MessageDialog r6 = r1.this$0
                android.graphics.drawable.Drawable r6 = r6.titleIcon
                r6.setBounds(r2, r2, r0, r0)
                android.widget.TextView r0 = r1.txtDialogTitle
                com.kongzue.dialogx.dialogs.MessageDialog r6 = r1.this$0
                r8 = 1092616192(0x41200000, float:10.0)
                int r6 = r6.dip2px(r8)
                r0.setCompoundDrawablePadding(r6)
                android.widget.TextView r0 = r1.txtDialogTitle
                com.kongzue.dialogx.dialogs.MessageDialog r6 = r1.this$0
                android.graphics.drawable.Drawable r6 = r6.titleIcon
                r0.setCompoundDrawables(r6, r4, r4, r4)
            L380:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                r6 = 4
                r8 = -1
                if (r0 == 0) goto L404
                int r0 = r0.getInputType()
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r10 = r10.inputInfo
                int r10 = r10.getMAX_LENGTH()
                if (r10 == r8) goto L3b9
                r10 = r0 & 15
                if (r10 == r3) goto L3a3
                if (r10 == r7) goto L3a3
                if (r10 == r9) goto L3a3
                if (r10 == r6) goto L3a3
                r0 = r0 & (-16)
                r0 = r0 | r3
            L3a3:
                android.widget.EditText r10 = r1.txtInput
                android.text.InputFilter$LengthFilter r11 = new android.text.InputFilter$LengthFilter
                com.kongzue.dialogx.dialogs.MessageDialog r12 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r12 = r12.inputInfo
                int r12 = r12.getMAX_LENGTH()
                r11.<init>(r12)
                android.text.InputFilter[] r12 = new android.text.InputFilter[r3]
                r12[r2] = r11
                r10.setFilters(r12)
            L3b9:
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r10 = r10.inputInfo
                boolean r10 = r10.isMultipleLines()
                if (r10 == 0) goto L3c6
                r10 = 131072(0x20000, float:1.83671E-40)
                r0 = r0 | r10
            L3c6:
                android.widget.EditText r10 = r1.txtInput
                r10.setInputType(r0)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                com.kongzue.dialogx.util.TextInfo r0 = r0.getTextInfo()
                if (r0 == 0) goto L3e2
                android.widget.EditText r0 = r1.txtInput
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r10 = r10.inputInfo
                com.kongzue.dialogx.util.TextInfo r10 = r10.getTextInfo()
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r0, r10)
            L3e2:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                android.text.InputFilter[] r0 = r0.getInputFilters()
                if (r0 == 0) goto L404
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r0 = r0.inputInfo
                android.text.InputFilter[] r0 = r0.getInputFilters()
                int r0 = r0.length
                if (r0 <= 0) goto L404
                android.widget.EditText r0 = r1.txtInput
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.util.InputInfo r10 = r10.inputInfo
                android.text.InputFilter[] r10 = r10.getInputFilters()
                r0.setFilters(r10)
            L404:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                java.lang.CharSequence r0 = r0.okText
                boolean r0 = com.kongzue.dialogx.interfaces.BaseDialog.isNull(r0)
                r0 = r0 ^ r3
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                java.lang.CharSequence r10 = r10.cancelText
                boolean r10 = com.kongzue.dialogx.interfaces.BaseDialog.isNull(r10)
                if (r10 != 0) goto L418
                int r0 = r0 + r3
            L418:
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                java.lang.CharSequence r10 = r10.otherText
                boolean r10 = com.kongzue.dialogx.interfaces.BaseDialog.isNull(r10)
                if (r10 != 0) goto L423
                int r0 = r0 + r3
            L423:
                android.view.View r10 = r1.splitHorizontal
                if (r10 == 0) goto L43e
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r12 = com.kongzue.dialogx.dialogs.MessageDialog.access$5100(r11)
                com.kongzue.dialogx.dialogs.MessageDialog r13 = r1.this$0
                boolean r13 = r13.isLightTheme()
                int r12 = r12.splitColorRes(r13)
                int r11 = com.kongzue.dialogx.dialogs.MessageDialog.access$5200(r11, r12)
                r10.setBackgroundColor(r11)
            L43e:
                android.widget.LinearLayout r10 = r1.boxButton
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                int r11 = r11.buttonOrientation
                r10.setOrientation(r11)
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                int r11 = r10.buttonOrientation
                r12 = 1065353216(0x3f800000, float:1.0)
                r13 = 5
                if (r11 != r3) goto L56c
                com.kongzue.dialogx.interfaces.DialogXStyle r10 = com.kongzue.dialogx.dialogs.MessageDialog.access$5300(r10)
                int[] r10 = r10.verticalButtonOrder()
                if (r10 == 0) goto L6bf
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r10 = com.kongzue.dialogx.dialogs.MessageDialog.access$5400(r10)
                int[] r10 = r10.verticalButtonOrder()
                int r10 = r10.length
                if (r10 == 0) goto L6bf
                android.widget.LinearLayout r10 = r1.boxButton
                r10.removeAllViews()
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r10 = com.kongzue.dialogx.dialogs.MessageDialog.access$5500(r10)
                int[] r10 = r10.verticalButtonOrder()
                int r11 = r10.length
                r14 = r2
            L478:
                if (r14 >= r11) goto L6bf
                r15 = r10[r14]
                if (r15 == r3) goto L539
                if (r15 == r7) goto L50c
                if (r15 == r9) goto L4df
                if (r15 == r6) goto L4c6
                if (r15 == r13) goto L488
                goto L565
            L488:
                android.view.View r15 = new android.view.View
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                android.app.Activity r2 = r2.getOwnActivity()
                r15.<init>(r2)
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                android.content.res.Resources r2 = r2.getResources()
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$6200(r4)
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                boolean r5 = r5.isLightTheme()
                int r4 = r4.splitColorRes(r5)
                int r2 = r2.getColor(r4)
                r15.setBackgroundColor(r2)
                android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$6300(r4)
                int r4 = r4.splitWidthPx()
                r2.<init>(r8, r4)
                android.widget.LinearLayout r4 = r1.boxButton
                r4.addView(r15, r2)
                goto L565
            L4c6:
                android.widget.Space r2 = new android.widget.Space
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                android.app.Activity r4 = r4.getOwnActivity()
                r2.<init>(r4)
                android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
                r4.<init>(r8, r8)
                r4.weight = r12
                android.widget.LinearLayout r5 = r1.boxButton
                r5.addView(r2, r4)
                goto L565
            L4df:
                android.widget.LinearLayout r2 = r1.boxButton
                android.widget.TextView r4 = r1.btnSelectOther
                r2.addView(r4)
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$5800(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$VerticalButtonRes r2 = r2.overrideVerticalButtonRes()
                if (r2 == 0) goto L565
                android.widget.TextView r2 = r1.btnSelectOther
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$5900(r4)
                com.kongzue.dialogx.interfaces.DialogXStyle$VerticalButtonRes r4 = r4.overrideVerticalButtonRes()
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                boolean r5 = r5.isLightTheme()
                int r4 = r4.overrideVerticalOtherButtonBackgroundRes(r0, r5)
                r2.setBackgroundResource(r4)
                goto L565
            L50c:
                android.widget.LinearLayout r2 = r1.boxButton
                android.widget.TextView r4 = r1.btnSelectNegative
                r2.addView(r4)
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$6000(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$VerticalButtonRes r2 = r2.overrideVerticalButtonRes()
                if (r2 == 0) goto L565
                android.widget.TextView r2 = r1.btnSelectNegative
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$6100(r4)
                com.kongzue.dialogx.interfaces.DialogXStyle$VerticalButtonRes r4 = r4.overrideVerticalButtonRes()
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                boolean r5 = r5.isLightTheme()
                int r4 = r4.overrideVerticalCancelButtonBackgroundRes(r0, r5)
                r2.setBackgroundResource(r4)
                goto L565
            L539:
                android.widget.LinearLayout r2 = r1.boxButton
                android.widget.TextView r4 = r1.btnSelectPositive
                r2.addView(r4)
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$5600(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$VerticalButtonRes r2 = r2.overrideVerticalButtonRes()
                if (r2 == 0) goto L565
                android.widget.TextView r2 = r1.btnSelectPositive
                com.kongzue.dialogx.dialogs.MessageDialog r4 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r4 = com.kongzue.dialogx.dialogs.MessageDialog.access$5700(r4)
                com.kongzue.dialogx.interfaces.DialogXStyle$VerticalButtonRes r4 = r4.overrideVerticalButtonRes()
                com.kongzue.dialogx.dialogs.MessageDialog r5 = r1.this$0
                boolean r5 = r5.isLightTheme()
                int r4 = r4.overrideVerticalOkButtonBackgroundRes(r0, r5)
                r2.setBackgroundResource(r4)
            L565:
                int r14 = r14 + r3
                r2 = 0
                r4 = 0
                r5 = 8
                goto L478
            L56c:
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$6400(r10)
                int[] r2 = r2.horizontalButtonOrder()
                if (r2 == 0) goto L6bf
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$6500(r2)
                int[] r2 = r2.horizontalButtonOrder()
                int r2 = r2.length
                if (r2 == 0) goto L6bf
                android.widget.LinearLayout r2 = r1.boxButton
                r2.removeAllViews()
                com.kongzue.dialogx.dialogs.MessageDialog r2 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.MessageDialog.access$6600(r2)
                int[] r2 = r2.horizontalButtonOrder()
                int r4 = r2.length
                r5 = 0
            L594:
                if (r5 >= r4) goto L6bf
                r10 = r2[r5]
                if (r10 == r3) goto L690
                if (r10 == r7) goto L663
                if (r10 == r9) goto L636
                if (r10 == r6) goto L5ff
                if (r10 == r13) goto L5a4
                goto L6bc
            L5a4:
                android.widget.LinearLayout r10 = r1.boxButton
                int r10 = r10.getChildCount()
                if (r10 < r3) goto L6bc
                android.widget.LinearLayout r10 = r1.boxButton
                int r11 = r10.getChildCount()
                int r11 = r11 - r3
                android.view.View r10 = r10.getChildAt(r11)
                int r10 = r10.getVisibility()
                r11 = 8
                if (r10 != r11) goto L5c1
                goto L6bc
            L5c1:
                android.view.View r10 = new android.view.View
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                android.app.Activity r11 = r11.getOwnActivity()
                r10.<init>(r11)
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                android.content.res.Resources r11 = r11.getResources()
                com.kongzue.dialogx.dialogs.MessageDialog r14 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r14 = com.kongzue.dialogx.dialogs.MessageDialog.access$7300(r14)
                com.kongzue.dialogx.dialogs.MessageDialog r15 = r1.this$0
                boolean r15 = r15.isLightTheme()
                int r14 = r14.splitColorRes(r15)
                int r11 = r11.getColor(r14)
                r10.setBackgroundColor(r11)
                android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
                com.kongzue.dialogx.dialogs.MessageDialog r14 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r14 = com.kongzue.dialogx.dialogs.MessageDialog.access$7400(r14)
                int r14 = r14.splitWidthPx()
                r11.<init>(r14, r8)
                android.widget.LinearLayout r14 = r1.boxButton
                r14.addView(r10, r11)
                goto L6bc
            L5ff:
                android.widget.LinearLayout r10 = r1.boxButton
                int r10 = r10.getChildCount()
                if (r10 < r3) goto L6bc
                android.widget.LinearLayout r10 = r1.boxButton
                int r11 = r10.getChildCount()
                int r11 = r11 - r3
                android.view.View r10 = r10.getChildAt(r11)
                int r10 = r10.getVisibility()
                r11 = 8
                if (r10 != r11) goto L61c
                goto L6bc
            L61c:
                android.widget.Space r10 = new android.widget.Space
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                android.app.Activity r11 = r11.getOwnActivity()
                r10.<init>(r11)
                android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
                r14 = -2
                r11.<init>(r8, r14)
                r11.weight = r12
                android.widget.LinearLayout r14 = r1.boxButton
                r14.addView(r10, r11)
                goto L6bc
            L636:
                android.widget.LinearLayout r10 = r1.boxButton
                android.widget.TextView r11 = r1.btnSelectOther
                r10.addView(r11)
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r10 = com.kongzue.dialogx.dialogs.MessageDialog.access$6900(r10)
                com.kongzue.dialogx.interfaces.DialogXStyle$HorizontalButtonRes r10 = r10.overrideHorizontalButtonRes()
                if (r10 == 0) goto L6bc
                android.widget.TextView r10 = r1.btnSelectOther
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r11 = com.kongzue.dialogx.dialogs.MessageDialog.access$7000(r11)
                com.kongzue.dialogx.interfaces.DialogXStyle$HorizontalButtonRes r11 = r11.overrideHorizontalButtonRes()
                com.kongzue.dialogx.dialogs.MessageDialog r14 = r1.this$0
                boolean r14 = r14.isLightTheme()
                int r11 = r11.overrideHorizontalOtherButtonBackgroundRes(r0, r14)
                r10.setBackgroundResource(r11)
                goto L6bc
            L663:
                android.widget.LinearLayout r10 = r1.boxButton
                android.widget.TextView r11 = r1.btnSelectNegative
                r10.addView(r11)
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r10 = com.kongzue.dialogx.dialogs.MessageDialog.access$7100(r10)
                com.kongzue.dialogx.interfaces.DialogXStyle$HorizontalButtonRes r10 = r10.overrideHorizontalButtonRes()
                if (r10 == 0) goto L6bc
                android.widget.TextView r10 = r1.btnSelectNegative
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r11 = com.kongzue.dialogx.dialogs.MessageDialog.access$7200(r11)
                com.kongzue.dialogx.interfaces.DialogXStyle$HorizontalButtonRes r11 = r11.overrideHorizontalButtonRes()
                com.kongzue.dialogx.dialogs.MessageDialog r14 = r1.this$0
                boolean r14 = r14.isLightTheme()
                int r11 = r11.overrideHorizontalCancelButtonBackgroundRes(r0, r14)
                r10.setBackgroundResource(r11)
                goto L6bc
            L690:
                android.widget.LinearLayout r10 = r1.boxButton
                android.widget.TextView r11 = r1.btnSelectPositive
                r10.addView(r11)
                com.kongzue.dialogx.dialogs.MessageDialog r10 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r10 = com.kongzue.dialogx.dialogs.MessageDialog.access$6700(r10)
                com.kongzue.dialogx.interfaces.DialogXStyle$HorizontalButtonRes r10 = r10.overrideHorizontalButtonRes()
                if (r10 == 0) goto L6bc
                android.widget.TextView r10 = r1.btnSelectPositive
                com.kongzue.dialogx.dialogs.MessageDialog r11 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r11 = com.kongzue.dialogx.dialogs.MessageDialog.access$6800(r11)
                com.kongzue.dialogx.interfaces.DialogXStyle$HorizontalButtonRes r11 = r11.overrideHorizontalButtonRes()
                com.kongzue.dialogx.dialogs.MessageDialog r14 = r1.this$0
                boolean r14 = r14.isLightTheme()
                int r11 = r11.overrideHorizontalOkButtonBackgroundRes(r0, r14)
                r10.setBackgroundResource(r11)
            L6bc:
                int r5 = r5 + r3
                goto L594
            L6bf:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                boolean r2 = r0.bkgInterceptTouch
                if (r2 == 0) goto L6dd
                boolean r0 = r0.isCancelable()
                if (r0 == 0) goto L6d6
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$7 r2 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl$7
                r2.<init>(r1)
                r0.setOnClickListener(r2)
                goto L6e3
            L6d6:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                r2 = 0
                r0.setOnClickListener(r2)
                goto L6e3
            L6dd:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.boxRoot
                r2 = 0
                r0.setClickable(r2)
            L6e3:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r0.onBindView
                if (r0 == 0) goto L747
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L747
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r2 = r0.onBindView
                android.widget.RelativeLayout r3 = r1.boxCustom
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r0.me
                r2.bindParent(r3, r0)
                android.widget.RelativeLayout r0 = r1.boxCustom
                r2 = 0
                r0.setVisibility(r2)
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r0.onBindView
                android.view.View r0 = r0.getCustomView()
                boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.ScrollController
                if (r0 == 0) goto L724
                com.kongzue.dialogx.interfaces.ScrollController r0 = r1.scrollView
                boolean r3 = r0 instanceof com.kongzue.dialogx.util.views.DialogScrollView
                if (r3 == 0) goto L717
                com.kongzue.dialogx.util.views.DialogScrollView r0 = (com.kongzue.dialogx.util.views.DialogScrollView) r0
                r0.setVerticalScrollBarEnabled(r2)
            L717:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r0.onBindView
                android.view.View r0 = r0.getCustomView()
                com.kongzue.dialogx.interfaces.ScrollController r0 = (com.kongzue.dialogx.interfaces.ScrollController) r0
                r1.scrollView = r0
                goto L74e
            L724:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r0.onBindView
                android.view.View r0 = r0.getCustomView()
                java.lang.String r2 = "ScrollController"
                android.view.View r0 = r0.findViewWithTag(r2)
                boolean r2 = r0 instanceof com.kongzue.dialogx.interfaces.ScrollController
                if (r2 == 0) goto L74e
                com.kongzue.dialogx.interfaces.ScrollController r2 = r1.scrollView
                boolean r3 = r2 instanceof com.kongzue.dialogx.util.views.DialogScrollView
                if (r3 == 0) goto L742
                com.kongzue.dialogx.util.views.DialogScrollView r2 = (com.kongzue.dialogx.util.views.DialogScrollView) r2
                r3 = 0
                r2.setVerticalScrollBarEnabled(r3)
            L742:
                com.kongzue.dialogx.interfaces.ScrollController r0 = (com.kongzue.dialogx.interfaces.ScrollController) r0
                r1.scrollView = r0
                goto L74e
            L747:
                android.widget.RelativeLayout r0 = r1.boxCustom
                r2 = 8
                r0.setVisibility(r2)
            L74e:
                com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.this$0
                com.kongzue.dialogx.dialogs.MessageDialog.access$7500(r0)
            L753:
                return
        }
    }

    static {
            return
    }

    public MessageDialog() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            return
    }

    public MessageDialog(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            return
    }

    public MessageDialog(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            return
    }

    public MessageDialog(int r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            java.lang.String r2 = r1.getString(r5)
            r1.cancelText = r2
            return
    }

    public MessageDialog(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            java.lang.String r2 = r1.getString(r5)
            r1.cancelText = r2
            java.lang.String r2 = r1.getString(r6)
            r1.otherText = r2
            return
    }

    public MessageDialog(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r1.message = r2
            return
    }

    public MessageDialog(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r1.title = r2
            r1.message = r3
            return
    }

    public MessageDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            return
    }

    public MessageDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            r1.cancelText = r5
            return
    }

    public MessageDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bkgInterceptTouch = r0
            r1.me = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r1.buttonSelectResult = r0
            r0 = 0
            r1.maskColor = r0
            int r0 = com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius
            float r0 = (float) r0
            r1.backgroundRadius = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            r1.cancelText = r5
            r1.otherText = r6
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.MessageDialog r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ java.util.List access$100(com.kongzue.dialogx.dialogs.MessageDialog r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1100(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1200(com.kongzue.dialogx.dialogs.MessageDialog r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getIntStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1300(com.kongzue.dialogx.dialogs.MessageDialog r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getColorNullable(r1)
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1400(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Float access$1500(com.kongzue.dialogx.dialogs.MessageDialog r0, java.lang.Float r1) {
            java.lang.Float r0 = r0.getFloatStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1700(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1800(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$1900(com.kongzue.dialogx.dialogs.MessageDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ java.lang.Integer access$200(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ boolean access$2000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            boolean r0 = r0.autoShowInputKeyboard
            return r0
    }

    public static /* synthetic */ void access$2100(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.EditText r1, boolean r2) {
            r0.imeShow(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$2202(com.kongzue.dialogx.dialogs.MessageDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$2300(com.kongzue.dialogx.dialogs.MessageDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$2400(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.EditText r1, boolean r2) {
            r0.imeShow(r1, r2)
            return
    }

    public static /* synthetic */ void access$2500(com.kongzue.dialogx.dialogs.MessageDialog r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$2600(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.EditText r1, boolean r2) {
            r0.imeShow(r1, r2)
            return
    }

    public static /* synthetic */ void access$2700(com.kongzue.dialogx.dialogs.MessageDialog r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$2800(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.EditText r1, boolean r2) {
            r0.imeShow(r1, r2)
            return
    }

    public static /* synthetic */ void access$2900(com.kongzue.dialogx.dialogs.MessageDialog r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$3000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ java.lang.Integer access$302(com.kongzue.dialogx.dialogs.MessageDialog r0, java.lang.Integer r1) {
            r0.backgroundColor = r1
            return r1
    }

    public static /* synthetic */ void access$3100(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ void access$3200(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ int[] access$3300(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3400(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3500(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3600(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3700(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3800(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$3900(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$4000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ boolean access$402(com.kongzue.dialogx.dialogs.MessageDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ java.lang.Integer access$4100(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$4200(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$4300(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ void access$4400(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ java.lang.Integer access$4500(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$4600(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4700(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4800(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4900(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$5000(com.kongzue.dialogx.dialogs.MessageDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$502(com.kongzue.dialogx.dialogs.MessageDialog r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5100(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ int access$5200(com.kongzue.dialogx.dialogs.MessageDialog r0, int r1) {
            int r0 = r0.getColor(r1)
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5300(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5400(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5500(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5600(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5700(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5800(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$5900(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$600(com.kongzue.dialogx.dialogs.MessageDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6100(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6200(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6300(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6400(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6500(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6600(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6700(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6800(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$6900(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$700(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$7000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$7100(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$7200(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$7300(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$7400(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$7500(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$7600(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$7702(com.kongzue.dialogx.dialogs.MessageDialog r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$7800(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public static /* synthetic */ void access$7900(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$800(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$8000(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$8100(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$8200(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$8300(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ long access$8400(com.kongzue.dialogx.dialogs.MessageDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$8500(com.kongzue.dialogx.dialogs.MessageDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$8600(com.kongzue.dialogx.dialogs.MessageDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$8700(com.kongzue.dialogx.dialogs.MessageDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$900(com.kongzue.dialogx.dialogs.MessageDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog build() {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>()
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r0.setStyle(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>()
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r0.setCustomView(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(int r1, int r2) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(int r1, int r2, int r3) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(int r1, int r2, int r3, int r4) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(int r7, int r8, int r9, int r10, int r11) {
            com.kongzue.dialogx.dialogs.MessageDialog r6 = new com.kongzue.dialogx.dialogs.MessageDialog
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

    public static com.kongzue.dialogx.dialogs.MessageDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            com.kongzue.dialogx.dialogs.MessageDialog r0 = new com.kongzue.dialogx.dialogs.MessageDialog
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageDialog show(java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, java.lang.CharSequence r11) {
            com.kongzue.dialogx.dialogs.MessageDialog r6 = new com.kongzue.dialogx.dialogs.MessageDialog
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

    public com.kongzue.dialogx.dialogs.MessageDialog appendMessage(java.lang.CharSequence r4) {
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

    public com.kongzue.dialogx.dialogs.MessageDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog bringToFront() {
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

    public com.kongzue.dialogx.dialogs.MessageDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog cleanAllAction() {
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
            com.kongzue.dialogx.dialogs.MessageDialog$2 r0 = new com.kongzue.dialogx.dialogs.MessageDialog$2
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    public int getButtonOrientation() {
            r1 = this;
            int r0 = r1.buttonOrientation
            return r0
    }

    public com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT getButtonSelectResult() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = r1.buttonSelectResult
            return r0
    }

    public java.lang.CharSequence getCancelButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.cancelText
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> getCancelButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.cancelButtonClickListener
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnDialogButtonClickListener) r0
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getCancelTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.cancelTextInfo
            return r0
    }

    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.MessageDialog> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.MessageDialog$3 r0 = new com.kongzue.dialogx.dialogs.MessageDialog$3
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.dialogXAnimImpl
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

    public java.lang.String getInputText() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.dialogImpl
            android.widget.EditText r0 = r0.txtInput
            if (r0 == 0) goto Lf
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            return r0
        Lf:
            java.lang.String r0 = ""
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

    public java.lang.CharSequence getOkButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.okText
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> getOkButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.okButtonClickListener
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnDialogButtonClickListener) r0
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getOkTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.okTextInfo
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBackPressedListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public java.lang.CharSequence getOtherButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.otherText
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> getOtherButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.otherButtonClickListener
            com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnDialogButtonClickListener) r0
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getOtherTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.otherTextInfo
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.backgroundRadius
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.title
            return r0
    }

    public android.graphics.drawable.Drawable getTitleIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.titleIcon
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
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L2f
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r3.me
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.bkg
            r0.doExitAnim(r1, r2)
            com.kongzue.dialogx.dialogs.MessageDialog$4 r0 = new com.kongzue.dialogx.dialogs.MessageDialog$4
            r0.<init>(r3)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r1 = r3.getDialogImpl()
            r2 = 0
            long r1 = r1.getExitAnimationDuration(r2)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
        L2f:
            return
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
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.MessageDialog.overrideCancelable
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

    public com.kongzue.dialogx.dialogs.MessageDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.MessageDialog r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.MessageDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
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

    public void onShow(com.kongzue.dialogx.dialogs.MessageDialog r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.MessageDialog$1 r0 = new com.kongzue.dialogx.dialogs.MessageDialog$1
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.MessageDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r3 = this;
            android.view.View r0 = r3.getDialogView()
            if (r0 == 0) goto L10
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r0 = 0
            r3.isShow = r0
        L10:
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            if (r0 == 0) goto L32
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            r0.removeAllViews()
        L32:
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L45
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            goto L4f
        L45:
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r3.style
            boolean r1 = r3.isLightTheme()
            int r0 = r0.layout(r1)
        L4f:
            if (r0 != 0) goto L5c
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L5a
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material
            goto L5c
        L5a:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material_dark
        L5c:
            r1 = 0
            r3.enterAnimDuration = r1
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto L72
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r3.me
            r0.setTag(r1)
        L72:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setAnimResId(int r1, int r2) {
            r0 = this;
            r0.customEnterAnimResId = r1
            r0.customExitAnimResId = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setButtonOrientation(int r1) {
            r0 = this;
            r0.buttonOrientation = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.cancelText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelButtonClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.cancelTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCancelable(boolean r1) {
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

    public com.kongzue.dialogx.dialogs.MessageDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageDialog setData(java.lang.String r2, java.lang.Object r3) {
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
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setEnterAnimResId(int r1) {
            r0 = this;
            r0.customEnterAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setExitAnimResId(int r1) {
            r0 = this;
            r0.customExitAnimResId = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.okText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkButtonClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.okTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.otherText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherButtonClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.otherTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageDialog setThisOrderIndex(int r2) {
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
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTitle(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.titleIcon = r2
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.titleIcon = r0
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.titleIcon = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageDialog setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.titleTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageDialog show() {
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
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L34
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r3.me
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r2 = r3.getDialogImpl()
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
            if (r0 != 0) goto L85
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L58
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
            goto L62
        L58:
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r3.style
            boolean r1 = r3.isLightTheme()
            int r0 = r0.layout(r1)
        L62:
            if (r0 != 0) goto L6f
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L6d
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material
            goto L6f
        L6d:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material_dark
        L6f:
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto L81
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r3.me
            r0.setTag(r1)
        L81:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L8c
        L85:
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L8c:
            return r3
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.show()
            return r0
    }

    public void show(android.app.Activity r3) {
            r2 = this;
            super.beforeShow()
            android.view.View r0 = r2.getDialogView()
            if (r0 != 0) goto L49
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L1c
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
            goto L26
        L1c:
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.style
            boolean r1 = r2.isLightTheme()
            int r0 = r0.layout(r1)
        L26:
            if (r0 != 0) goto L33
            boolean r0 = r2.isLightTheme()
            if (r0 == 0) goto L31
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material
            goto L33
        L31:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material_dark
        L33:
            android.view.View r0 = r2.createView(r0)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl
            r1.<init>(r2, r0)
            r2.dialogImpl = r1
            if (r0 == 0) goto L45
            com.kongzue.dialogx.dialogs.MessageDialog r1 = r2.me
            r0.setTag(r1)
        L45:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
            goto L50
        L49:
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
        L50:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
