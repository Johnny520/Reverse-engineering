package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class BottomDialog extends com.kongzue.dialogx.interfaces.BaseDialog implements com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog {
    public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterDuration = -1;
    public static int overrideExitDuration = -1;
    protected boolean allowInterceptTouch;
    protected float backgroundRadius;
    protected boolean bkgInterceptTouch;
    protected float bottomDialogMaxHeight;
    protected boolean bottomNonSafetyAreaBySelf;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT buttonSelectResult;
    protected com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback cancelButtonClickListener;
    protected java.lang.CharSequence cancelText;
    protected com.kongzue.dialogx.util.TextInfo cancelTextInfo;
    protected com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.BottomDialog> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> dialogXAnimImpl;
    protected boolean hideWithExitAnim;
    protected boolean isHide;
    protected java.lang.Integer maskColor;
    protected com.kongzue.dialogx.dialogs.BottomDialog me;
    protected com.kongzue.dialogx.util.TextInfo menuTextInfo;
    protected java.lang.CharSequence message;
    protected com.kongzue.dialogx.util.TextInfo messageTextInfo;
    protected com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback okButtonClickListener;
    protected java.lang.CharSequence okText;
    protected com.kongzue.dialogx.util.TextInfo okTextInfo;
    protected com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> onBackPressedListener;
    protected com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> onBackgroundMaskClickListener;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> onBindView;
    protected com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback otherButtonClickListener;
    protected java.lang.CharSequence otherText;
    protected com.kongzue.dialogx.util.TextInfo otherTextInfo;
    protected com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN privateCancelable;
    protected boolean scrollableWhenContentLargeThanVisibleRange;
    protected java.lang.CharSequence title;
    protected android.graphics.drawable.Drawable titleIcon;
    protected com.kongzue.dialogx.util.TextInfo titleTextInfo;





    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        public com.kongzue.dialogx.util.views.MaxRelativeLayout bkg;
        public float bkgEnterAimY;
        private java.util.List<android.view.View> blurViews;
        private com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor bottomDialogTouchEventInterceptor;
        public android.widget.RelativeLayout boxBkg;
        public android.view.ViewGroup boxBody;
        public android.widget.LinearLayout boxButton;
        public android.view.ViewGroup boxCancel;
        public android.widget.LinearLayout boxContent;
        public android.widget.RelativeLayout boxCustom;
        public android.view.ViewGroup boxList;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        public android.widget.TextView btnSelectNegative;
        public android.widget.TextView btnSelectOther;
        public android.widget.TextView btnSelectPositive;
        public android.view.View imgSplit;
        public android.widget.ImageView imgTab;
        public com.kongzue.dialogx.interfaces.ScrollController scrollView;
        public android.widget.ImageView splitSelectOther;
        public android.widget.ImageView splitSelectPositive;
        final /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog this$0;
        public android.widget.TextView txtDialogTip;
        public android.widget.TextView txtDialogTitle;













        public DialogImpl(com.kongzue.dialogx.dialogs.BottomDialog r6, android.view.View r7) {
                r5 = this;
                r5.this$0 = r6
                r5.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r5.bkgEnterAimY = r0
                if (r7 != 0) goto Lc
                return
            Lc:
                com.kongzue.dialogx.dialogs.BottomDialog.access$000(r6, r7)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r7.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r5.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.box_bkg
                android.view.View r0 = r7.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r5.boxBkg = r0
                int r0 = com.kongzue.dialogx.R.id.bkg
                android.view.View r0 = r7.findViewById(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
                r5.bkg = r0
                int r0 = com.kongzue.dialogx.R.id.img_tab
                android.view.View r0 = r7.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r5.imgTab = r0
                int r0 = com.kongzue.dialogx.R.id.box_body
                android.view.View r0 = r7.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r5.boxBody = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialog_title
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.txtDialogTitle = r0
                int r0 = com.kongzue.dialogx.R.id.scrollView
                android.view.View r0 = r7.findViewById(r0)
                com.kongzue.dialogx.interfaces.ScrollController r0 = (com.kongzue.dialogx.interfaces.ScrollController) r0
                r5.scrollView = r0
                int r0 = com.kongzue.dialogx.R.id.box_content
                android.view.View r0 = r7.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r5.boxContent = r0
                int r0 = com.kongzue.dialogx.R.id.txt_dialog_tip
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.txtDialogTip = r0
                java.lang.String r0 = "split"
                android.view.View r0 = r7.findViewWithTag(r0)
                r5.imgSplit = r0
                int r0 = com.kongzue.dialogx.R.id.box_list
                android.view.View r0 = r7.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r5.boxList = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r0 = r7.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r5.boxCustom = r0
                boolean r0 = r6.scrollableWhenContentLargeThanVisibleRange
                if (r0 != 0) goto Lab
                android.widget.TextView r0 = r5.txtDialogTitle
                android.view.ViewParent r0 = r0.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.widget.LinearLayout r1 = r5.boxContent
                android.view.ViewParent r1 = r1.getParent()
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                android.widget.LinearLayout r2 = r5.boxContent
                r1.removeView(r2)
                android.widget.LinearLayout r1 = r5.boxContent
                android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
                r3 = -1
                r4 = -2
                r2.<init>(r3, r4)
                r3 = 1
                r0.addView(r1, r3, r2)
            Lab:
                java.lang.String r0 = "cancelBox"
                android.view.View r0 = r7.findViewWithTag(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r5.boxCancel = r0
                int r0 = com.kongzue.dialogx.R.id.box_button
                android.view.View r0 = r7.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r5.boxButton = r0
                int r0 = com.kongzue.dialogx.R.id.btn_selectNegative
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.btnSelectNegative = r0
                int r0 = com.kongzue.dialogx.R.id.btn_selectOther
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.btnSelectOther = r0
                int r0 = com.kongzue.dialogx.R.id.btn_selectPositive
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.btnSelectPositive = r0
                java.lang.String r0 = "imgPositiveButtonSplit"
                android.view.View r0 = r7.findViewWithTag(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r5.splitSelectPositive = r0
                java.lang.String r0 = "imgOtherButtonSplit"
                android.view.View r0 = r7.findViewWithTag(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r5.splitSelectOther = r0
                java.util.List r7 = com.kongzue.dialogx.dialogs.BottomDialog.access$100(r6, r7)
                r5.blurViews = r7
                r5.init()
                r6.dialogImpl = r5
                r5.refreshView()
                return
        }

        public static /* synthetic */ com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor access$1002(com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl r0, com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r1) {
                r0.bottomDialogTouchEventInterceptor = r1
                return r1
        }

        public static /* synthetic */ java.util.List access$2200(com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl r0) {
                java.util.List<android.view.View> r0 = r0.blurViews
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r3) {
                r2 = this;
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r2.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                if (r3 == 0) goto Lf
                r0 = 0
                r3.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.BottomDialog r3 = r2.this$0
                android.app.Activity r3 = r3.getOwnActivity()
                if (r3 != 0) goto L18
                return
            L18:
                com.kongzue.dialogx.dialogs.BottomDialog r3 = r2.this$0
                boolean r3 = com.kongzue.dialogx.dialogs.BottomDialog.access$4400(r3)
                if (r3 != 0) goto L43
                com.kongzue.dialogx.interfaces.DialogXAnimInterface r3 = r2.getDialogXAnimImpl()
                if (r3 == 0) goto L43
                com.kongzue.dialogx.dialogs.BottomDialog r3 = r2.this$0
                r0 = 1
                com.kongzue.dialogx.dialogs.BottomDialog.access$4502(r3, r0)
                com.kongzue.dialogx.interfaces.DialogXAnimInterface r3 = r2.getDialogXAnimImpl()
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r2.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r2.bkg
                r3.doExitAnim(r0, r1)
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$11 r3 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$11
                r3.<init>(r2)
                long r0 = r2.getExitAnimationDuration()
                com.kongzue.dialogx.dialogs.BottomDialog.access$4700(r3, r0)
            L43:
                return
        }

        public com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor getBottomDialogTouchEventInterceptor() {
                r1 = this;
                com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0 = r1.bottomDialogTouchEventInterceptor
                return r0
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$12 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$12
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration() {
                r6 = this;
                int r0 = com.kongzue.dialogx.dialogs.BottomDialog.overrideEnterDuration
                if (r0 < 0) goto L6
                long r0 = (long) r0
                goto L8
            L6:
                r0 = 300(0x12c, double:1.48E-321)
            L8:
                com.kongzue.dialogx.dialogs.BottomDialog r2 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.BottomDialog.access$5200(r2)
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L1a
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.BottomDialog.access$5300(r0)
            L1a:
                return r0
        }

        public long getExitAnimationDuration() {
                r6 = this;
                int r0 = com.kongzue.dialogx.dialogs.BottomDialog.overrideExitDuration
                if (r0 < 0) goto L6
                long r0 = (long) r0
                goto L8
            L6:
                r0 = 300(0x12c, double:1.48E-321)
            L8:
                com.kongzue.dialogx.dialogs.BottomDialog r2 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.BottomDialog.access$5000(r2)
                r4 = -1
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L1a
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.BottomDialog.access$5100(r0)
            L1a:
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r3 = this;
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r3.this$0
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
                r0.buttonSelectResult = r1
                android.view.View r0 = r0.getDialogView()
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.this$0
                int r1 = r1.getThisOrderIndex()
                float r1 = (float) r1
                r0.setTranslationZ(r1)
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r3.this$0
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
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.BottomDialog.access$200(r0)
                if (r0 != 0) goto L53
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r3.this$0
                java.lang.Integer r1 = com.kongzue.dialogx.DialogX.backgroundColor
                com.kongzue.dialogx.dialogs.BottomDialog.access$302(r0, r1)
            L53:
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r3.this$0
                java.lang.CharSequence r1 = r0.cancelText
                if (r1 != 0) goto L5d
                java.lang.String r1 = com.kongzue.dialogx.DialogX.cancelButtonText
                r0.cancelText = r1
            L5d:
                android.widget.TextView r0 = r3.txtDialogTitle
                r1 = 1
                if (r0 == 0) goto L69
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
            L69:
                android.widget.TextView r0 = r3.btnSelectNegative
                if (r0 == 0) goto L74
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
            L74:
                android.widget.TextView r0 = r3.btnSelectPositive
                if (r0 == 0) goto L7f
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
            L7f:
                android.widget.TextView r0 = r3.btnSelectOther
                if (r0 == 0) goto L8a
                android.text.TextPaint r0 = r0.getPaint()
                r0.setFakeBoldText(r1)
            L8a:
                android.widget.RelativeLayout r0 = r3.boxBkg
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.this$0
                android.widget.FrameLayout r1 = r1.getRootFrameLayout()
                if (r1 != 0) goto La0
                android.content.res.Resources r1 = android.content.res.Resources.getSystem()
                android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
                int r1 = r1.heightPixels
            L9e:
                float r1 = (float) r1
                goto Lab
            La0:
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.this$0
                android.widget.FrameLayout r1 = r1.getRootFrameLayout()
                int r1 = r1.getMeasuredHeight()
                goto L9e
            Lab:
                r0.setY(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.this$0
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r1.me
                r0.setParentDialog(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$1 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$1
                r1.<init>(r3)
                r0.setOnLifecycleCallBack(r1)
                android.widget.TextView r0 = r3.btnSelectNegative
                if (r0 == 0) goto Lcd
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$2 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$2
                r1.<init>(r3)
                r0.setOnClickListener(r1)
            Lcd:
                android.widget.TextView r0 = r3.btnSelectOther
                if (r0 == 0) goto Ld9
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$3 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$3
                r1.<init>(r3)
                r0.setOnClickListener(r1)
            Ld9:
                android.widget.TextView r0 = r3.btnSelectPositive
                if (r0 == 0) goto Le5
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$4
                r1.<init>(r3)
                r0.setOnClickListener(r1)
            Le5:
                android.view.View r0 = r3.imgSplit
                if (r0 == 0) goto L127
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r3.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.BottomDialog.access$1400(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.this$0
                boolean r1 = r1.isLightTheme()
                int r0 = r0.overrideMenuDividerDrawableRes(r1)
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r1 = com.kongzue.dialogx.dialogs.BottomDialog.access$1500(r1)
                com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r1 = r1.overrideBottomDialogRes()
                com.kongzue.dialogx.dialogs.BottomDialog r2 = r3.this$0
                boolean r2 = r2.isLightTheme()
                int r1 = r1.overrideMenuDividerHeight(r2)
                if (r0 == 0) goto L118
                android.view.View r2 = r3.imgSplit
                r2.setBackgroundResource(r0)
            L118:
                if (r1 == 0) goto L127
                android.view.View r0 = r3.imgSplit
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r0.height = r1
                android.view.View r1 = r3.imgSplit
                r1.setLayoutParams(r0)
            L127:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.boxRoot
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$5
                r1.<init>(r3)
                r0.setOnBackPressedListener(r1)
                android.widget.RelativeLayout r0 = r3.boxBkg
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$6
                r1.<init>(r3)
                r0.post(r1)
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$7 r0 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$7
                r0.<init>(r3)
                long r1 = r3.getEnterAnimationDuration()
                com.kongzue.dialogx.dialogs.BottomDialog.access$2500(r0, r1)
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r3.this$0
                com.kongzue.dialogx.dialogs.BottomDialog.access$2600(r0)
                return
        }

        public void preDismiss() {
                r7 = this;
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r7.this$0
                boolean r0 = r0.isCancelable()
                if (r0 == 0) goto L30
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r7.this$0
                com.kongzue.dialogx.interfaces.DialogLifecycleCallback r0 = r0.getDialogLifecycleCallback()
                boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.BottomDialogSlideEventLifecycleCallback
                if (r0 == 0) goto L2a
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r7.this$0
                com.kongzue.dialogx.interfaces.DialogLifecycleCallback r0 = r0.getDialogLifecycleCallback()
                com.kongzue.dialogx.interfaces.BottomDialogSlideEventLifecycleCallback r0 = (com.kongzue.dialogx.interfaces.BottomDialogSlideEventLifecycleCallback) r0
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r7.this$0
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r1.me
                boolean r0 = r0.onSlideClose(r1)
                if (r0 != 0) goto L29
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                r7.doDismiss(r0)
            L29:
                return
            L2a:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.boxRoot
                r7.doDismiss(r0)
                goto L6e
            L30:
                int r0 = com.kongzue.dialogx.dialogs.BottomDialog.overrideExitDuration
                if (r0 < 0) goto L36
                long r0 = (long) r0
                goto L38
            L36:
                r0 = 300(0x12c, double:1.48E-321)
            L38:
                com.kongzue.dialogx.dialogs.BottomDialog r2 = r7.this$0
                long r2 = com.kongzue.dialogx.dialogs.BottomDialog.access$4800(r2)
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L4a
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r7.this$0
                long r0 = com.kongzue.dialogx.dialogs.BottomDialog.access$4900(r0)
            L4a:
                android.widget.RelativeLayout r2 = r7.boxBkg
                float r3 = r2.getY()
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r7.boxRoot
                android.graphics.Rect r4 = r4.getUnsafePlace()
                int r4 = r4.top
                float r4 = (float) r4
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
            L6e:
                return
        }

        public void reBuild() {
                r1 = this;
                r1.init()
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r1.this$0
                r0.dialogImpl = r1
                r1.refreshView()
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
                if (r6 == 0) goto L31c
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.app.Activity r6 = r6.getOwnActivity()
                if (r6 != 0) goto L15
                goto L31c
            L15:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                int r7 = r7.getMaxWidth()
                r6.setMaxWidth(r7)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                int r7 = r7.getMaxHeight()
                r6.setMaxHeight(r7)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                int r7 = r7.getMinWidth()
                r6.setMinimumWidth(r7)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                int r7 = r7.getMinHeight()
                r6.setMinimumHeight(r7)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                boolean r7 = r7.isEnableImmersiveMode()
                r6.setAutoUnsafePlacePadding(r7)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                int[] r7 = com.kongzue.dialogx.dialogs.BottomDialog.access$2700(r7)
                r7 = r7[r4]
                com.kongzue.dialogx.dialogs.BottomDialog r8 = r11.this$0
                int[] r8 = com.kongzue.dialogx.dialogs.BottomDialog.access$2800(r8)
                r8 = r8[r3]
                com.kongzue.dialogx.dialogs.BottomDialog r9 = r11.this$0
                int[] r9 = com.kongzue.dialogx.dialogs.BottomDialog.access$2900(r9)
                r9 = r9[r2]
                com.kongzue.dialogx.dialogs.BottomDialog r10 = r11.this$0
                int[] r10 = com.kongzue.dialogx.dialogs.BottomDialog.access$3000(r10)
                r10 = r10[r1]
                r6.setRootPadding(r7, r8, r9, r10)
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                java.lang.Integer r6 = com.kongzue.dialogx.dialogs.BottomDialog.access$3100(r6)
                if (r6 == 0) goto Le1
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r11.bkg
                java.lang.Integer r8 = com.kongzue.dialogx.dialogs.BottomDialog.access$3200(r6)
                int r8 = r8.intValue()
                r6.tintColor(r7, r8)
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r6 = com.kongzue.dialogx.dialogs.BottomDialog.access$3300(r6)
                boolean r6 = r6.tintButtonBackground()
                if (r6 == 0) goto Lc1
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.widget.TextView r7 = r11.btnSelectOther
                java.lang.Integer r8 = com.kongzue.dialogx.dialogs.BottomDialog.access$3400(r6)
                int r8 = r8.intValue()
                r6.tintColor(r7, r8)
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.widget.TextView r7 = r11.btnSelectNegative
                java.lang.Integer r8 = com.kongzue.dialogx.dialogs.BottomDialog.access$3500(r6)
                int r8 = r8.intValue()
                r6.tintColor(r7, r8)
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.widget.TextView r7 = r11.btnSelectPositive
                java.lang.Integer r8 = com.kongzue.dialogx.dialogs.BottomDialog.access$3600(r6)
                int r8 = r8.intValue()
                r6.tintColor(r7, r8)
            Lc1:
                java.util.List<android.view.View> r6 = r11.blurViews
                if (r6 == 0) goto Le1
                java.util.Iterator r6 = r6.iterator()
            Lc9:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto Le1
                java.lang.Object r7 = r6.next()
                android.view.View r7 = (android.view.View) r7
                com.kongzue.dialogx.interfaces.BlurViewType r7 = (com.kongzue.dialogx.interfaces.BlurViewType) r7
                com.kongzue.dialogx.dialogs.BottomDialog r8 = r11.this$0
                java.lang.Integer r8 = com.kongzue.dialogx.dialogs.BottomDialog.access$3700(r8)
                r7.setOverlayColor(r8)
                goto Lc9
            Le1:
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.widget.TextView r7 = r11.txtDialogTitle
                java.lang.CharSequence r8 = r6.title
                com.kongzue.dialogx.dialogs.BottomDialog.access$3800(r6, r7, r8)
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.widget.TextView r7 = r11.txtDialogTip
                java.lang.CharSequence r8 = r6.message
                com.kongzue.dialogx.dialogs.BottomDialog.access$3900(r6, r7, r8)
                android.widget.TextView r6 = r11.txtDialogTitle
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                com.kongzue.dialogx.util.TextInfo r7 = r7.titleTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r6, r7)
                android.widget.TextView r6 = r11.txtDialogTip
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                com.kongzue.dialogx.util.TextInfo r7 = r7.messageTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r6, r7)
                android.widget.TextView r6 = r11.btnSelectNegative
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                com.kongzue.dialogx.util.TextInfo r7 = r7.cancelTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r6, r7)
                android.widget.TextView r6 = r11.btnSelectOther
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                com.kongzue.dialogx.util.TextInfo r7 = r7.otherTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r6, r7)
                android.widget.TextView r6 = r11.btnSelectPositive
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
                com.kongzue.dialogx.util.TextInfo r7 = r7.okTextInfo
                com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r6, r7)
                android.widget.LinearLayout r6 = r11.boxButton
                if (r6 == 0) goto L148
                android.widget.TextView r7 = r11.btnSelectNegative
                if (r7 == 0) goto L12e
                int r7 = r7.getVisibility()
                if (r7 == 0) goto L142
            L12e:
                android.widget.TextView r7 = r11.btnSelectOther
                if (r7 == 0) goto L138
                int r7 = r7.getVisibility()
                if (r7 == 0) goto L142
            L138:
                android.widget.TextView r7 = r11.btnSelectPositive
                if (r7 == 0) goto L144
                int r7 = r7.getVisibility()
                if (r7 != 0) goto L144
            L142:
                r7 = r4
                goto L145
            L144:
                r7 = r0
            L145:
                r6.setVisibility(r7)
            L148:
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                android.graphics.drawable.Drawable r6 = r6.titleIcon
                r7 = 0
                if (r6 == 0) goto L173
                android.widget.TextView r6 = r11.txtDialogTitle
                float r6 = r6.getTextSize()
                int r6 = (int) r6
                com.kongzue.dialogx.dialogs.BottomDialog r8 = r11.this$0
                android.graphics.drawable.Drawable r8 = r8.titleIcon
                r8.setBounds(r4, r4, r6, r6)
                android.widget.TextView r6 = r11.txtDialogTitle
                com.kongzue.dialogx.dialogs.BottomDialog r8 = r11.this$0
                r9 = 1092616192(0x41200000, float:10.0)
                int r8 = r8.dip2px(r9)
                r6.setCompoundDrawablePadding(r8)
                android.widget.TextView r6 = r11.txtDialogTitle
                com.kongzue.dialogx.dialogs.BottomDialog r8 = r11.this$0
                android.graphics.drawable.Drawable r8 = r8.titleIcon
                r6.setCompoundDrawables(r8, r7, r7, r7)
            L173:
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                boolean r8 = r6.bkgInterceptTouch
                if (r8 == 0) goto L190
                boolean r6 = r6.isCancelable()
                if (r6 == 0) goto L18a
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$8 r7 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$8
                r7.<init>(r11)
                r6.setOnClickListener(r7)
                goto L195
            L18a:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                r6.setOnClickListener(r7)
                goto L195
            L190:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r11.boxRoot
                r6.setClickable(r4)
            L195:
                android.widget.RelativeLayout r6 = r11.boxBkg
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$9 r7 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$9
                r7.<init>(r11)
                r6.setOnClickListener(r7)
                com.kongzue.dialogx.dialogs.BottomDialog r6 = r11.this$0
                float r6 = r6.backgroundRadius
                r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L20b
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                android.graphics.drawable.Drawable r6 = r6.getBackground()
                boolean r6 = r6 instanceof android.graphics.drawable.GradientDrawable
                if (r6 == 0) goto L1da
                com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r11.bkg
                android.graphics.drawable.Drawable r6 = r6.getBackground()
                android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
                if (r6 == 0) goto L1da
                com.kongzue.dialogx.dialogs.BottomDialog r7 = r11.this$0
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
            L1da:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.bkg
                com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$10 r2 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl$10
                r2.<init>(r11)
                r1.setOutlineProvider(r2)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.bkg
                r1.setClipToOutline(r3)
                java.util.List<android.view.View> r1 = r11.blurViews
                if (r1 == 0) goto L20b
                java.util.Iterator r1 = r1.iterator()
            L1f1:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L20b
                java.lang.Object r2 = r1.next()
                android.view.View r2 = (android.view.View) r2
                com.kongzue.dialogx.interfaces.BlurViewType r2 = (com.kongzue.dialogx.interfaces.BlurViewType) r2
                com.kongzue.dialogx.dialogs.BottomDialog r3 = r11.this$0
                float r3 = r3.backgroundRadius
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r2.setRadiusPx(r3)
                goto L1f1
            L20b:
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                java.lang.Integer r1 = r1.maskColor
                if (r1 == 0) goto L223
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r11.boxRoot
                android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
                com.kongzue.dialogx.dialogs.BottomDialog r3 = r11.this$0
                java.lang.Integer r3 = r3.maskColor
                int r3 = r3.intValue()
                r2.<init>(r3)
                r1.setBackground(r2)
            L223:
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1 = r1.onBindView
                if (r1 == 0) goto L27f
                android.view.View r1 = r1.getCustomView()
                if (r1 == 0) goto L27f
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r2 = r1.onBindView
                android.widget.RelativeLayout r3 = r11.boxCustom
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r1.me
                r2.bindParent(r3, r1)
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1 = r1.onBindView
                android.view.View r1 = r1.getCustomView()
                boolean r1 = r1 instanceof com.kongzue.dialogx.interfaces.ScrollController
                if (r1 == 0) goto L25e
                com.kongzue.dialogx.interfaces.ScrollController r1 = r11.scrollView
                boolean r2 = r1 instanceof com.kongzue.dialogx.util.views.DialogScrollView
                if (r2 == 0) goto L251
                com.kongzue.dialogx.util.views.DialogScrollView r1 = (com.kongzue.dialogx.util.views.DialogScrollView) r1
                r1.setVerticalScrollBarEnabled(r4)
            L251:
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1 = r1.onBindView
                android.view.View r1 = r1.getCustomView()
                com.kongzue.dialogx.interfaces.ScrollController r1 = (com.kongzue.dialogx.interfaces.ScrollController) r1
                r11.scrollView = r1
                goto L27f
            L25e:
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1 = r1.onBindView
                android.view.View r1 = r1.getCustomView()
                java.lang.String r2 = "ScrollController"
                android.view.View r1 = r1.findViewWithTag(r2)
                boolean r2 = r1 instanceof com.kongzue.dialogx.interfaces.ScrollController
                if (r2 == 0) goto L27f
                com.kongzue.dialogx.interfaces.ScrollController r2 = r11.scrollView
                boolean r3 = r2 instanceof com.kongzue.dialogx.util.views.DialogScrollView
                if (r3 == 0) goto L27b
                com.kongzue.dialogx.util.views.DialogScrollView r2 = (com.kongzue.dialogx.util.views.DialogScrollView) r2
                r2.setVerticalScrollBarEnabled(r4)
            L27b:
                com.kongzue.dialogx.interfaces.ScrollController r1 = (com.kongzue.dialogx.interfaces.ScrollController) r1
                r11.scrollView = r1
            L27f:
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                boolean r1 = r1.isAllowInterceptTouch()
                if (r1 == 0) goto L297
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                boolean r1 = r1.isCancelable()
                if (r1 == 0) goto L297
                android.widget.ImageView r1 = r11.imgTab
                if (r1 == 0) goto L29e
                r1.setVisibility(r4)
                goto L29e
            L297:
                android.widget.ImageView r1 = r11.imgTab
                if (r1 == 0) goto L29e
                r1.setVisibility(r0)
            L29e:
                com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r1 = r11.bottomDialogTouchEventInterceptor
                if (r1 == 0) goto L2a9
                com.kongzue.dialogx.dialogs.BottomDialog r2 = r11.this$0
                com.kongzue.dialogx.dialogs.BottomDialog r2 = r2.me
                r1.refresh(r2, r11)
            L2a9:
                android.view.View r1 = r11.imgSplit
                if (r1 == 0) goto L2c9
                android.widget.TextView r1 = r11.txtDialogTitle
                int r1 = r1.getVisibility()
                if (r1 == 0) goto L2c4
                android.widget.TextView r1 = r11.txtDialogTip
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L2be
                goto L2c4
            L2be:
                android.view.View r1 = r11.imgSplit
                r1.setVisibility(r0)
                goto L2c9
            L2c4:
                android.view.View r1 = r11.imgSplit
                r1.setVisibility(r4)
            L2c9:
                android.view.ViewGroup r1 = r11.boxCancel
                if (r1 == 0) goto L2e2
                com.kongzue.dialogx.dialogs.BottomDialog r1 = r11.this$0
                java.lang.CharSequence r1 = r1.cancelText
                boolean r1 = com.kongzue.dialogx.interfaces.BaseDialog.isNull(r1)
                if (r1 == 0) goto L2dd
                android.view.ViewGroup r1 = r11.boxCancel
                r1.setVisibility(r0)
                goto L2e2
            L2dd:
                android.view.ViewGroup r0 = r11.boxCancel
                r0.setVisibility(r4)
            L2e2:
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r11.this$0
                android.widget.TextView r1 = r11.btnSelectPositive
                java.lang.CharSequence r2 = r0.okText
                com.kongzue.dialogx.dialogs.BottomDialog.access$4000(r0, r1, r2)
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r11.this$0
                android.widget.TextView r1 = r11.btnSelectNegative
                java.lang.CharSequence r2 = r0.cancelText
                com.kongzue.dialogx.dialogs.BottomDialog.access$4100(r0, r1, r2)
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r11.this$0
                android.widget.TextView r1 = r11.btnSelectOther
                java.lang.CharSequence r2 = r0.otherText
                com.kongzue.dialogx.dialogs.BottomDialog.access$4200(r0, r1, r2)
                android.widget.ImageView r0 = r11.splitSelectPositive
                if (r0 == 0) goto L30a
                android.widget.TextView r1 = r11.btnSelectPositive
                int r1 = r1.getVisibility()
                r0.setVisibility(r1)
            L30a:
                android.widget.ImageView r0 = r11.splitSelectOther
                if (r0 == 0) goto L317
                android.widget.TextView r1 = r11.btnSelectOther
                int r1 = r1.getVisibility()
                r0.setVisibility(r1)
            L317:
                com.kongzue.dialogx.dialogs.BottomDialog r0 = r11.this$0
                com.kongzue.dialogx.dialogs.BottomDialog.access$4300(r0)
            L31c:
                return
        }
    }

    static {
            return
    }

    public BottomDialog() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            return
    }

    public BottomDialog(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            java.lang.String r3 = r2.getString(r4)
            r2.message = r3
            return
    }

    public BottomDialog(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            java.lang.String r3 = r2.getString(r4)
            r2.message = r3
            java.lang.String r3 = r2.getString(r5)
            r2.okText = r3
            return
    }

    public BottomDialog(int r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            java.lang.String r3 = r2.getString(r4)
            r2.message = r3
            java.lang.String r3 = r2.getString(r5)
            r2.okText = r3
            java.lang.String r3 = r2.getString(r6)
            r2.cancelText = r3
            return
    }

    public BottomDialog(int r3, int r4, int r5, int r6, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r7) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            java.lang.String r3 = r2.getString(r4)
            r2.message = r3
            java.lang.String r3 = r2.getString(r5)
            r2.okText = r3
            java.lang.String r3 = r2.getString(r6)
            r2.cancelText = r3
            r2.onBindView = r7
            return
    }

    public BottomDialog(int r3, int r4, int r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            java.lang.String r3 = r2.getString(r4)
            r2.message = r3
            java.lang.String r3 = r2.getString(r5)
            r2.okText = r3
            r2.onBindView = r6
            return
    }

    public BottomDialog(int r3, int r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            java.lang.String r3 = r2.getString(r4)
            r2.message = r3
            r2.onBindView = r5
            return
    }

    public BottomDialog(int r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            java.lang.String r3 = r2.getString(r3)
            r2.title = r3
            r2.onBindView = r4
            return
    }

    public BottomDialog(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.onBindView = r3
            return
    }

    public BottomDialog(java.lang.CharSequence r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.onBindView = r4
            return
    }

    public BottomDialog(java.lang.CharSequence r3, java.lang.CharSequence r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.message = r4
            return
    }

    public BottomDialog(java.lang.CharSequence r3, java.lang.CharSequence r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.message = r4
            r2.onBindView = r5
            return
    }

    public BottomDialog(java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.message = r4
            r2.okText = r5
            return
    }

    public BottomDialog(java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.message = r4
            r2.okText = r5
            r2.onBindView = r6
            return
    }

    public BottomDialog(java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.message = r4
            r2.okText = r5
            r2.cancelText = r6
            return
    }

    public BottomDialog(java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r7) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = 0
            r2.bottomNonSafetyAreaBySelf = r1
            r1 = 0
            r2.maskColor = r1
            r2.bkgInterceptTouch = r0
            int r1 = com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius
            float r1 = (float) r1
            r2.backgroundRadius = r1
            com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE
            r2.buttonSelectResult = r1
            r2.scrollableWhenContentLargeThanVisibleRange = r0
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.cancelTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r0)
            r2.okTextInfo = r1
            com.kongzue.dialogx.util.TextInfo r1 = new com.kongzue.dialogx.util.TextInfo
            r1.<init>()
            com.kongzue.dialogx.util.TextInfo r0 = r1.setBold(r0)
            r2.otherTextInfo = r0
            r0 = 0
            r2.bottomDialogMaxHeight = r0
            r2.me = r2
            r2.title = r3
            r2.message = r4
            r2.okText = r5
            r2.cancelText = r6
            r2.onBindView = r7
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.BottomDialog r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ java.util.List access$100(com.kongzue.dialogx.dialogs.BottomDialog r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static /* synthetic */ void access$1100(com.kongzue.dialogx.dialogs.BottomDialog r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$1200(com.kongzue.dialogx.dialogs.BottomDialog r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ void access$1300(com.kongzue.dialogx.dialogs.BottomDialog r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1400(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1500(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1600(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1700(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1800(com.kongzue.dialogx.dialogs.BottomDialog r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getIntStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1900(com.kongzue.dialogx.dialogs.BottomDialog r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getColorNullable(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$200(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$2000(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Float access$2100(com.kongzue.dialogx.dialogs.BottomDialog r0, java.lang.Float r1) {
            java.lang.Float r0 = r0.getFloatStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2300(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2400(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$2500(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ void access$2600(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ int[] access$2700(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$2800(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$2900(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3000(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$302(com.kongzue.dialogx.dialogs.BottomDialog r0, java.lang.Integer r1) {
            r0.backgroundColor = r1
            return r1
    }

    public static /* synthetic */ java.lang.Integer access$3100(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3200(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$3300(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3400(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3500(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3600(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3700(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$3800(com.kongzue.dialogx.dialogs.BottomDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$3900(com.kongzue.dialogx.dialogs.BottomDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4000(com.kongzue.dialogx.dialogs.BottomDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$402(com.kongzue.dialogx.dialogs.BottomDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$4100(com.kongzue.dialogx.dialogs.BottomDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4200(com.kongzue.dialogx.dialogs.BottomDialog r0, android.widget.TextView r1, java.lang.CharSequence r2) {
            r0.showText(r1, r2)
            return
    }

    public static /* synthetic */ void access$4300(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ boolean access$4400(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$4502(com.kongzue.dialogx.dialogs.BottomDialog r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$4600(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public static /* synthetic */ void access$4700(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ long access$4800(com.kongzue.dialogx.dialogs.BottomDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$4900(com.kongzue.dialogx.dialogs.BottomDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$5000(com.kongzue.dialogx.dialogs.BottomDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ boolean access$502(com.kongzue.dialogx.dialogs.BottomDialog r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ long access$5100(com.kongzue.dialogx.dialogs.BottomDialog r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$5200(com.kongzue.dialogx.dialogs.BottomDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$5300(com.kongzue.dialogx.dialogs.BottomDialog r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ void access$600(com.kongzue.dialogx.dialogs.BottomDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$700(com.kongzue.dialogx.dialogs.BottomDialog r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ boolean access$802(com.kongzue.dialogx.dialogs.BottomDialog r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$900(com.kongzue.dialogx.dialogs.BottomDialog r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog build() {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>()
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r0.setStyle(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>()
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r0.setCustomView(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r1, int r2) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r1, int r2, int r3) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r1, int r2, int r3, int r4) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r7, int r8, int r9, int r10, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r11) {
            com.kongzue.dialogx.dialogs.BottomDialog r6 = new com.kongzue.dialogx.dialogs.BottomDialog
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

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r1, int r2, int r3, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r4) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r1, int r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r3) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(int r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r3) {
            com.kongzue.dialogx.dialogs.BottomDialog r0 = new com.kongzue.dialogx.dialogs.BottomDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog appendMessage(java.lang.CharSequence r4) {
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

    public com.kongzue.dialogx.dialogs.BottomDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog bringToFront() {
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

    public com.kongzue.dialogx.dialogs.BottomDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog cleanAllAction() {
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
            com.kongzue.dialogx.dialogs.BottomDialog$2 r0 = new com.kongzue.dialogx.dialogs.BottomDialog$2
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

    public float getBottomDialogMaxHeight() {
            r1 = this;
            float r0 = r1.bottomDialogMaxHeight
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

    public com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> getCancelButtonClickListener() {
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
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.BottomDialog> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.BottomDialog$3 r0 = new com.kongzue.dialogx.dialogs.BottomDialog$3
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.dialogXAnimImpl
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

    public com.kongzue.dialogx.util.TextInfo getOkTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.okTextInfo
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBackPressedListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public java.lang.CharSequence getOtherButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.otherText
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
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L2e
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.me
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.bkg
            r0.doExitAnim(r1, r2)
            com.kongzue.dialogx.dialogs.BottomDialog$4 r0 = new com.kongzue.dialogx.dialogs.BottomDialog$4
            r0.<init>(r3)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r1 = r3.getDialogImpl()
            long r1 = r1.getExitAnimationDuration()
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
        L2e:
            return
    }

    public boolean isAllowInterceptTouch() {
            r2 = this;
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r2.allowInterceptTouch
            if (r0 == 0) goto L1b
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r0 = r0.touchSlide()
            if (r0 == 0) goto L1b
            r1 = 1
        L1b:
            return r1
    }

    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
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
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.BottomDialog.overrideCancelable
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

    public boolean isScrollableWhenContentLargeThanVisibleRange() {
            r1 = this;
            boolean r0 = r1.scrollableWhenContentLargeThanVisibleRange
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.BottomDialog r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.BottomDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
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

    public void onShow(com.kongzue.dialogx.dialogs.BottomDialog r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.BottomDialog$1 r0 = new com.kongzue.dialogx.dialogs.BottomDialog$1
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.BottomDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBindView
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
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            if (r0 == 0) goto L32
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            r0.removeAllViews()
        L32:
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L3b
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material
            goto L3d
        L3b:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material_dark
        L3d:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r3.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r1 = r1.overrideBottomDialogRes()
            if (r1 == 0) goto L53
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r3.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r1 = r3.isLightTheme()
            int r0 = r0.overrideDialogLayout(r1)
        L53:
            boolean r1 = r3.isLightTheme()
            int r1 = r3.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L65
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
        L65:
            r1 = 0
            r3.enterAnimDuration = r1
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto L7b
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.me
            r0.setTag(r1)
        L7b:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.BottomDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setAllowInterceptTouch(boolean r1) {
            r0 = this;
            r0.allowInterceptTouch = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setBottomDialogMaxHeight(float r1) {
            r0 = this;
            r0.bottomDialogMaxHeight = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setBottomNonSafetyAreaBySelf(boolean r1) {
            r0 = this;
            r0.bottomNonSafetyAreaBySelf = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.cancelText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelButtonClickListener(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.cancelTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCancelable(boolean r1) {
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

    public com.kongzue.dialogx.dialogs.BottomDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomDialog setData(java.lang.String r2, java.lang.Object r3) {
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
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.BottomDialog r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOkButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOkButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOkButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.okText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.okTextInfo = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.otherText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.otherTextInfo = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setScrollableWhenContentLargeThanVisibleRange(boolean r1) {
            r0 = this;
            r0.scrollableWhenContentLargeThanVisibleRange = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomDialog setThisOrderIndex(int r2) {
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
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTitle(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTitleIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.titleIcon = r2
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTitleIcon(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.titleIcon = r0
            r2.refreshUI()
            return r2
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.titleIcon = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomDialog setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.titleTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomDialog show() {
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
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L34
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.me
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r2 = r3.getDialogImpl()
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
            if (r0 != 0) goto L8e
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L4e
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material
            goto L50
        L4e:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material_dark
        L50:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r3.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r1 = r1.overrideBottomDialogRes()
            if (r1 == 0) goto L66
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r3.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r1 = r3.isLightTheme()
            int r0 = r0.overrideDialogLayout(r1)
        L66:
            boolean r1 = r3.isLightTheme()
            int r1 = r3.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L78
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
        L78:
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto L8a
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r3.me
            r0.setTag(r1)
        L8a:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L95
        L8e:
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L95:
            return r3
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomDialog r0 = r1.show()
            return r0
    }

    public void show(android.app.Activity r3) {
            r2 = this;
            super.beforeShow()
            android.view.View r0 = r2.getDialogView()
            if (r0 != 0) goto L52
            boolean r0 = r2.isLightTheme()
            if (r0 == 0) goto L12
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material
            goto L14
        L12:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material_dark
        L14:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r2.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r1 = r1.overrideBottomDialogRes()
            if (r1 == 0) goto L2a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r1 = r2.isLightTheme()
            int r0 = r0.overrideDialogLayout(r1)
        L2a:
            boolean r1 = r2.isLightTheme()
            int r1 = r2.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L3c
            boolean r0 = r2.isLightTheme()
            int r0 = r2.getCustomDialogLayoutResId(r0)
        L3c:
            android.view.View r0 = r2.createView(r0)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r1 = new com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl
            r1.<init>(r2, r0)
            r2.dialogImpl = r1
            if (r0 == 0) goto L4e
            com.kongzue.dialogx.dialogs.BottomDialog r1 = r2.me
            r0.setTag(r1)
        L4e:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
            goto L59
        L52:
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r3, r0)
        L59:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
