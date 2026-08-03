package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.BlurViewType;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnIconChangeCallBack;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.kongzue.dialogx.util.DialogXViewLoc;
import com.kongzue.dialogx.util.ItemDivider;
import com.kongzue.dialogx.util.PopMenuArrayAdapter;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.kongzue.dialogx.util.views.PopMenuListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PopMenu extends BaseDialog {
    public static long overrideEnterDuration = -1;
    public static long overrideExitDuration = -1;
    private ViewTreeObserver.OnDrawListener baseViewDrawListener;
    protected WeakReference<View> baseViewWeakReference;
    private boolean closing;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<PopMenu> dialogLifecycleCallback;
    protected DialogXAnimInterface<PopMenu> dialogXAnimImpl;
    protected boolean hideWithExitAnim;
    protected List<Integer> iconResIds;
    protected boolean isEnterAnimRunning;
    protected ItemDivider itemDivider;
    protected List<CharSequence> menuList;
    protected PopMenuArrayAdapter menuListAdapter;
    protected MenuItemLayoutRefreshCallback<PopMenu> menuMenuItemLayoutRefreshCallback;
    protected TextInfo menuTextInfo;
    protected OnBackPressedListener<PopMenu> onBackPressedListener;
    protected OnBackgroundMaskClickListener<PopMenu> onBackgroundMaskClickListener;
    protected OnBindView<PopMenu> onBindView;
    protected OnIconChangeCallBack<PopMenu> onIconChangeCallBack;
    protected OnMenuItemClickListener<PopMenu> onMenuItemClickListener;
    private int selectIndex;
    protected int selectItemYDeviation;
    private ViewTreeObserver viewTreeObserver;

    /* JADX INFO: renamed from: me */
    protected PopMenu f4166me = this;
    protected boolean bkgInterceptTouch = true;
    protected boolean autoTintIconInLightOrDarkMode = true;
    protected boolean overlayBaseView = true;
    protected int width = -1;
    protected int height = -1;
    protected boolean offScreen = false;
    protected float backgroundRadius = DialogX.defaultPopMenuBackgroundRadius;
    protected int pressedIndex = -1;
    protected Map<Integer, Boolean> menuUsability = new HashMap();
    protected int alignGravity = -1;
    protected DialogXViewLoc baseViewLoc = new DialogXViewLoc();
    public boolean notCheckHash = false;
    public int lastHash = -1;

    public class DialogImpl implements DialogConvertViewInterface {
        private List<View> blurViews;
        public MaxRelativeLayout boxBody;
        public RelativeLayout boxCustom;
        public DialogXBaseRelativeLayout boxRoot;
        public PopMenuListView listMenu;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            PopMenu.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.boxBody = (MaxRelativeLayout) view.findViewById(C2413R.id.box_body);
            this.boxCustom = (RelativeLayout) view.findViewById(C2413R.id.box_custom);
            this.listMenu = (PopMenuListView) view.findViewById(C2413R.id.listMenu);
            this.boxBody.setVisibility(4);
            this.blurViews = PopMenu.this.findAllBlurView(view);
            this.boxBody.setX(-1.0f);
            this.boxBody.setY(-1.0f);
            init();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isUseBlurBackground() {
            return (((BaseDialog) PopMenu.this).style.popMenuSettings() == null || ((BaseDialog) PopMenu.this).style.popMenuSettings().blurBackgroundSettings() == null || !((BaseDialog) PopMenu.this).style.popMenuSettings().blurBackgroundSettings().blurBackground()) ? false : true;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = PopMenu.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (((BaseDialog) PopMenu.this).dismissAnimFlag || this.boxRoot == null) {
                return;
            }
            ((BaseDialog) PopMenu.this).dismissAnimFlag = true;
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    DialogXAnimInterface<PopMenu> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doExitAnim(PopMenu.this.f4166me, dialogImpl.boxBody);
                    BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (PopMenu.this.baseViewDrawListener != null) {
                                if (PopMenu.this.viewTreeObserver != null) {
                                    PopMenu popMenu = PopMenu.this;
                                    popMenu.removeDrawListener(popMenu.viewTreeObserver, PopMenu.this.baseViewDrawListener);
                                } else if (PopMenu.this.baseView() != null) {
                                    PopMenu popMenu2 = PopMenu.this;
                                    popMenu2.removeDrawListener(popMenu2.baseView().getViewTreeObserver(), PopMenu.this.baseViewDrawListener);
                                }
                                PopMenu.this.baseViewDrawListener = null;
                                PopMenu.this.viewTreeObserver = null;
                            }
                            BaseDialog.dismiss(PopMenu.this.getDialogView());
                        }
                    }, DialogImpl.this.getExitAnimationDuration(null));
                }
            });
        }

        public DialogXAnimInterface<PopMenu> getDialogXAnimImpl() {
            PopMenu popMenu = PopMenu.this;
            if (popMenu.dialogXAnimImpl == null) {
                popMenu.dialogXAnimImpl = new DialogXAnimInterface<PopMenu>() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.8
                    int selectMenuIndex = -1;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(PopMenu popMenu2, ViewGroup viewGroup) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(PopMenu.this.getOwnActivity() == null ? DialogImpl.this.boxRoot.getContext() : PopMenu.this.getOwnActivity(), C2413R.anim.anim_dialogx_default_exit);
                        long exitAnimationDuration = DialogImpl.this.getExitAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setDuration(exitAnimationDuration);
                        DialogImpl.this.boxBody.startAnimation(animationLoadAnimation);
                        DialogImpl.this.boxRoot.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(exitAnimationDuration);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setDuration(exitAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.8.3
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogImpl dialogImpl = DialogImpl.this;
                                if (dialogImpl.boxRoot == null || PopMenu.this.baseView() != null) {
                                    return;
                                }
                                DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doShowAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doShowAnim(PopMenu popMenu2, ViewGroup viewGroup) {
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration(null);
                        if (PopMenu.this.baseView() == null) {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) DialogImpl.this.boxBody.getLayoutParams();
                            layoutParams.addRule(13);
                            layoutParams.width = PopMenu.this.getWidth() != -1 ? PopMenu.this.getWidth() : -1;
                            layoutParams.leftMargin = PopMenu.this.dip2px(50.0f);
                            layoutParams.rightMargin = PopMenu.this.dip2px(50.0f);
                            DialogImpl.this.boxBody.setLayoutParams(layoutParams);
                            DialogImpl.this.boxBody.setAlpha(0.0f);
                            if (!DialogImpl.this.isUseBlurBackground()) {
                                DialogImpl.this.boxBody.setElevation(PopMenu.this.dip2px(20.0f));
                            }
                            DialogImpl.this.boxBody.setVisibility(0);
                            DialogImpl.this.boxBody.animate().alpha(1.0f).setDuration(enterAnimationDuration);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(enterAnimationDuration);
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.8.2
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            valueAnimatorOfFloat.start();
                            return;
                        }
                        final int bodyRealHeight = PopMenu.this.getBodyRealHeight();
                        DialogImpl.this.boxBody.getLayoutParams().height = 1;
                        DialogImpl dialogImpl = DialogImpl.this;
                        if (PopMenu.this.overlayBaseView && !dialogImpl.listMenu.isCanScroll()) {
                            if (PopMenu.this.baseView() instanceof TextView) {
                                String string = ((TextView) PopMenu.this.baseView()).getText().toString();
                                Iterator<CharSequence> it = PopMenu.this.menuList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    CharSequence next = it.next();
                                    if (TextUtils.equals(next.toString(), string)) {
                                        this.selectMenuIndex = PopMenu.this.menuList.indexOf(next);
                                        break;
                                    }
                                }
                            }
                            int i = this.selectMenuIndex;
                            if (i != -1) {
                                int[] iArr = new int[2];
                                if (DialogImpl.this.listMenu.getChildAt(i) != null) {
                                    int measuredHeight = DialogImpl.this.listMenu.getChildAt(this.selectMenuIndex).getMeasuredHeight();
                                    DialogImpl.this.listMenu.getChildAt(this.selectMenuIndex).getLocationInWindow(iArr);
                                    PopMenu.this.selectItemYDeviation = (int) (((r5.baseView().getMeasuredHeight() / 2.0f) - (iArr[1] - DialogImpl.this.boxBody.getY())) - (measuredHeight / 2.0f));
                                }
                            }
                        }
                        PopMenu.this.refreshMenuLoc();
                        PopMenu popMenu3 = PopMenu.this;
                        popMenu3.selectItemYDeviation = (int) (popMenu3.getMenuLoc().getY() - PopMenu.this.baseViewLoc.getY());
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.8.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (!((BaseDialog) PopMenu.this).isShow || PopMenu.this.getDialogImpl() == null || PopMenu.this.getDialogImpl().boxBody == null) {
                                    return;
                                }
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                PopMenu popMenu4 = PopMenu.this;
                                popMenu4.isEnterAnimRunning = fFloatValue != 1.0f;
                                DialogXViewLoc menuLoc = popMenu4.getMenuLoc();
                                int i2 = fFloatValue == 1.0f ? -2 : (int) (bodyRealHeight * fFloatValue);
                                DialogImpl.this.boxBody.getLayoutParams().height = i2;
                                DialogImpl.this.boxBody.getLayoutParams().width = PopMenu.this.getWidth() == -1 ? PopMenu.this.baseView().getWidth() : PopMenu.this.getWidth();
                                float f = i2;
                                if (DialogImpl.this.boxBody.getY() + f > DialogImpl.this.boxRoot.getSafeHeight()) {
                                    DialogImpl dialogImpl2 = DialogImpl.this;
                                    dialogImpl2.boxBody.setY(dialogImpl2.boxRoot.getSafeHeight() - f);
                                }
                                if (menuLoc.getX() == -1.0f) {
                                    menuLoc = PopMenu.this.baseViewLoc;
                                }
                                float x = menuLoc.getX();
                                float y = PopMenu.this.baseViewLoc.getY();
                                float useAreaHeight = y + (r5.selectItemYDeviation * fFloatValue);
                                if (!PopMenu.this.offScreen) {
                                    if (x < 0.0f) {
                                        x = 0.0f;
                                    }
                                    if (useAreaHeight < 0.0f) {
                                        useAreaHeight = 0.0f;
                                    }
                                    if (r4.boxBody.getWidth() + x > DialogImpl.this.boxRoot.getUseAreaWidth()) {
                                        x = DialogImpl.this.boxRoot.getUseAreaWidth() - DialogImpl.this.boxBody.getWidth();
                                    }
                                    if (DialogImpl.this.boxBody.getHeight() + useAreaHeight > DialogImpl.this.boxRoot.getUseAreaHeight()) {
                                        useAreaHeight = DialogImpl.this.boxRoot.getUseAreaHeight() - DialogImpl.this.boxBody.getHeight();
                                    }
                                }
                                DialogImpl.this.boxBody.setX(x);
                                DialogImpl.this.boxBody.setY(useAreaHeight);
                                DialogImpl.this.boxBody.requestLayout();
                                if (DialogImpl.this.boxBody.getVisibility() != 0) {
                                    DialogImpl.this.boxBody.setVisibility(0);
                                }
                                if (DialogImpl.this.isUseBlurBackground()) {
                                    DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            }
                        });
                        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
                        valueAnimatorOfFloat2.setDuration(enterAnimationDuration);
                        valueAnimatorOfFloat2.start();
                    }
                };
            }
            return PopMenu.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxBody.getAnimation() != null) {
                animation = this.boxBody.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 150L : animation.getDuration();
            long j = PopMenu.overrideEnterDuration;
            if (j >= 0) {
                duration = j;
            }
            return ((BaseDialog) PopMenu.this).enterAnimDuration >= 0 ? ((BaseDialog) PopMenu.this).enterAnimDuration : duration;
        }

        public long getExitAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxBody.getAnimation() != null) {
                animation = this.boxBody.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 150L : animation.getDuration();
            long j = PopMenu.overrideExitDuration;
            if (j >= 0) {
                duration = j;
            }
            return ((BaseDialog) PopMenu.this).exitAnimDuration != -1 ? ((BaseDialog) PopMenu.this).exitAnimDuration : duration;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            int iOverrideMenuDividerDrawableRes;
            int iOverrideMenuDividerHeight;
            PopMenu.this.closing = false;
            PopMenu popMenu = PopMenu.this;
            if (popMenu.menuListAdapter == null) {
                PopMenu popMenu2 = PopMenu.this;
                popMenu.menuListAdapter = new PopMenuArrayAdapter(popMenu2.f4166me, popMenu2.getOwnActivity(), PopMenu.this.menuList);
            }
            this.boxRoot.setParentDialog(PopMenu.this.f4166me);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    ((BaseDialog) PopMenu.this).isShow = false;
                    PopMenu.this.getDialogLifecycleCallback().onDismiss(PopMenu.this.f4166me);
                    PopMenu popMenu3 = PopMenu.this;
                    popMenu3.onDismiss(popMenu3.f4166me);
                    PopMenu.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    PopMenu popMenu4 = PopMenu.this;
                    popMenu4.menuListAdapter = null;
                    popMenu4.dialogImpl = null;
                    popMenu4.baseView(null);
                    PopMenu.this.dialogLifecycleCallback = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) PopMenu.this).isShow = true;
                    ((BaseDialog) PopMenu.this).preShow = false;
                    PopMenu.this.setLifecycleState(Lifecycle.State.CREATED);
                    PopMenu.this.onDialogShow();
                    PopMenu.this.getDialogLifecycleCallback().onShow(PopMenu.this.f4166me);
                    PopMenu popMenu3 = PopMenu.this;
                    popMenu3.onShow(popMenu3.f4166me);
                    PopMenu.this.refreshUI();
                }
            });
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.2
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    PopMenu popMenu3 = PopMenu.this;
                    OnBackPressedListener<PopMenu> onBackPressedListener = popMenu3.onBackPressedListener;
                    if (onBackPressedListener != null) {
                        if (!onBackPressedListener.onBackPressed(popMenu3.f4166me)) {
                            return true;
                        }
                        PopMenu.this.dismiss();
                        return true;
                    }
                    if (!popMenu3.isCancelable()) {
                        return true;
                    }
                    PopMenu.this.dismiss();
                    return true;
                }
            });
            this.listMenu.setMaxHeight(PopMenu.this.getRootFrameLayout() == null ? PopMenu.this.dip2px(500.0f) : PopMenu.this.getRootFrameLayout().getMeasuredHeight() - PopMenu.this.dip2px(150.0f));
            this.boxBody.setVisibility(4);
            this.boxBody.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    Integer colorNullable;
                    Float floatStyleAttr;
                    DialogXAnimInterface<PopMenu> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doShowAnim(PopMenu.this.f4166me, dialogImpl.boxBody);
                    PopMenu.this.setLifecycleState(Lifecycle.State.RESUMED);
                    if (((BaseDialog) PopMenu.this).style.popMenuSettings() == null || ((BaseDialog) PopMenu.this).style.popMenuSettings().blurBackgroundSettings() == null) {
                        colorNullable = null;
                        floatStyleAttr = null;
                    } else {
                        PopMenu popMenu3 = PopMenu.this;
                        colorNullable = popMenu3.getColorNullable(popMenu3.getIntStyleAttr(Integer.valueOf(((BaseDialog) popMenu3).style.popMenuSettings().blurBackgroundSettings().blurForwardColorRes(PopMenu.this.isLightTheme()))));
                        floatStyleAttr = PopMenu.this.getFloatStyleAttr(Float.valueOf(((BaseDialog) r1).style.popMenuSettings().blurBackgroundSettings().blurBackgroundRoundRadiusPx()));
                    }
                    if (DialogImpl.this.blurViews != null) {
                        Iterator it = DialogImpl.this.blurViews.iterator();
                        while (it.hasNext()) {
                            BlurViewType blurViewType = (BlurViewType) ((View) it.next());
                            blurViewType.setOverlayColor(((BaseDialog) PopMenu.this).backgroundColor == null ? colorNullable : ((BaseDialog) PopMenu.this).backgroundColor);
                            blurViewType.setRadiusPx(floatStyleAttr);
                        }
                    }
                }
            });
            if (((BaseDialog) PopMenu.this).style.popMenuSettings() != null) {
                iOverrideMenuDividerDrawableRes = ((BaseDialog) PopMenu.this).style.popMenuSettings().overrideMenuDividerDrawableRes(PopMenu.this.isLightTheme());
                iOverrideMenuDividerHeight = ((BaseDialog) PopMenu.this).style.popMenuSettings().overrideMenuDividerHeight(PopMenu.this.isLightTheme());
            } else {
                iOverrideMenuDividerDrawableRes = 0;
                iOverrideMenuDividerHeight = 0;
            }
            if (iOverrideMenuDividerDrawableRes == 0) {
                iOverrideMenuDividerDrawableRes = PopMenu.this.isLightTheme() ? C2413R.drawable.rect_dialogx_material_menu_split_divider : C2413R.drawable.rect_dialogx_material_menu_split_divider_night;
            }
            this.listMenu.setOverScrollMode(2);
            this.listMenu.setVerticalScrollBarEnabled(false);
            this.listMenu.setDivider(PopMenu.this.getResources().getDrawable(iOverrideMenuDividerDrawableRes));
            this.listMenu.setDividerHeight(iOverrideMenuDividerHeight);
            this.listMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.4
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    if (PopMenu.this.isMenuItemEnable(i)) {
                        PopMenu.this.haptic(view);
                        PopMenu.this.selectIndex = i;
                        if (PopMenu.this.closing) {
                            return;
                        }
                        PopMenu popMenu3 = PopMenu.this;
                        popMenu3.lastHash = popMenu3.menuList.hashCode();
                        OnMenuItemClickListener<PopMenu> onMenuItemClickListener = PopMenu.this.getOnMenuItemClickListener();
                        PopMenu popMenu4 = PopMenu.this;
                        boolean zOnClick = onMenuItemClickListener.onClick(popMenu4.f4166me, popMenu4.menuList.get(i), i);
                        PopMenu popMenu5 = PopMenu.this;
                        if (!popMenu5.notCheckHash && popMenu5.lastHash == popMenu5.menuList.hashCode() && zOnClick) {
                            zOnClick = false;
                        }
                        if (zOnClick) {
                            return;
                        }
                        PopMenu.this.dismiss();
                    }
                }
            });
            PopMenu.this.onDialogInit();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            GradientDrawable gradientDrawable;
            if (this.boxRoot == null || PopMenu.this.getOwnActivity() == null) {
                return;
            }
            this.boxRoot.setAutoUnsafePlacePadding(PopMenu.this.isEnableImmersiveMode());
            this.boxRoot.setRootPadding(((BaseDialog) PopMenu.this).screenPaddings[0], ((BaseDialog) PopMenu.this).screenPaddings[1], ((BaseDialog) PopMenu.this).screenPaddings[2], ((BaseDialog) PopMenu.this).screenPaddings[3]);
            if (this.listMenu.getAdapter() == null) {
                this.listMenu.setAdapter((ListAdapter) PopMenu.this.menuListAdapter);
            } else {
                List<CharSequence> menuList = PopMenu.this.menuListAdapter.getMenuList();
                PopMenu popMenu = PopMenu.this;
                if (menuList != popMenu.menuList) {
                    PopMenu popMenu2 = PopMenu.this;
                    popMenu.menuListAdapter = new PopMenuArrayAdapter(popMenu2.f4166me, popMenu2.getOwnActivity(), PopMenu.this.menuList);
                    this.listMenu.setAdapter((ListAdapter) PopMenu.this.menuListAdapter);
                } else {
                    popMenu.menuListAdapter.notifyDataSetChanged();
                }
            }
            PopMenu popMenu3 = PopMenu.this;
            if (!popMenu3.bkgInterceptTouch) {
                this.boxRoot.setClickable(false);
            } else if (popMenu3.isCancelable()) {
                this.boxRoot.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        PopMenu popMenu4 = PopMenu.this;
                        OnBackgroundMaskClickListener<PopMenu> onBackgroundMaskClickListener = popMenu4.onBackgroundMaskClickListener;
                        if (onBackgroundMaskClickListener == null || !onBackgroundMaskClickListener.onClick(popMenu4.f4166me, view)) {
                            DialogImpl.this.doDismiss(view);
                        }
                    }
                });
            } else {
                this.boxRoot.setOnClickListener(null);
            }
            if (((BaseDialog) PopMenu.this).backgroundColor != null) {
                PopMenu popMenu4 = PopMenu.this;
                popMenu4.tintColor(this.boxBody, ((BaseDialog) popMenu4).backgroundColor.intValue());
            }
            if (PopMenu.this.backgroundRadius > -1.0f) {
                if ((this.boxBody.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) this.boxBody.getBackground()) != null) {
                    gradientDrawable.setCornerRadius(PopMenu.this.backgroundRadius);
                }
                this.boxBody.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.PopMenu.DialogImpl.6
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PopMenu.this.backgroundRadius);
                    }
                });
                this.boxBody.setClipToOutline(true);
                List<View> list = this.blurViews;
                if (list != null) {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        ((BlurViewType) ((View) it.next())).setRadiusPx(Float.valueOf(PopMenu.this.backgroundRadius));
                    }
                }
            }
            OnBindView<PopMenu> onBindView = PopMenu.this.onBindView;
            if (onBindView == null || onBindView.getCustomView() == null) {
                this.boxCustom.setVisibility(8);
            } else {
                PopMenu popMenu5 = PopMenu.this;
                popMenu5.onBindView.bindParent(this.boxCustom, popMenu5.f4166me);
                this.boxCustom.setVisibility(0);
            }
            int i = PopMenu.this.width;
            if (i != -1) {
                this.boxBody.setMaxWidth(i);
                this.boxBody.setMinimumWidth(PopMenu.this.width);
            }
            int i2 = PopMenu.this.height;
            if (i2 != -1) {
                this.boxBody.setMaxHeight(i2);
                this.boxBody.setMinimumHeight(PopMenu.this.height);
            }
            if (((BaseDialog) PopMenu.this).backgroundColor != null) {
                PopMenu popMenu6 = PopMenu.this;
                popMenu6.tintColor(this.boxBody, ((BaseDialog) popMenu6).backgroundColor.intValue());
                List<View> list2 = this.blurViews;
                if (list2 != null) {
                    Iterator<View> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((BlurViewType) ((View) it2.next())).setOverlayColor(((BaseDialog) PopMenu.this).backgroundColor);
                    }
                }
            }
            PopMenu popMenu7 = PopMenu.this;
            ItemDivider itemDivider = popMenu7.itemDivider;
            if (itemDivider != null) {
                this.listMenu.setDivider(itemDivider.createDividerDrawable(popMenu7.getOwnActivity(), PopMenu.this.isLightTheme()));
                this.listMenu.setDividerHeight(PopMenu.this.itemDivider.getWidth());
            }
            PopMenu.this.onDialogRefreshUI();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PopMenu build() {
        return new PopMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBodyRealHeight() {
        if (getDialogImpl() == null) {
            return 0;
        }
        getDialogImpl().boxBody.measure(View.MeasureSpec.makeMeasureSpec(((View) getDialogImpl().boxBody.getParent()).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(((View) getDialogImpl().boxBody.getParent()).getHeight(), Integer.MIN_VALUE));
        return getDialogImpl().boxBody.getMeasuredHeight();
    }

    private String[] getTextArray(int[] iArr) {
        String[] strArr = new String[iArr == null ? 0 : iArr.length];
        int i = 0;
        while (true) {
            if (i >= (iArr == null ? 0 : iArr.length)) {
                return strArr;
            }
            strArr[i] = getString(iArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshMenuLoc() {
        if (getDialogImpl() == null || getDialogImpl().boxRoot == null || baseView() == null) {
            return;
        }
        getDialogImpl().boxBody.setTag(null);
        DialogXViewLoc menuLoc = getMenuLoc();
        getDialogImpl().boxBody.setTag(menuLoc);
        if (!this.isEnterAnimRunning) {
            if (menuLoc.getX() != getDialogImpl().boxBody.getX()) {
                getDialogImpl().boxBody.setX(menuLoc.getX());
            }
            if (menuLoc.getY() != getDialogImpl().boxBody.getY()) {
                getDialogImpl().boxBody.setY(menuLoc.getY());
            }
        }
        if (getDialogImpl().boxBody.getWidth() != menuLoc.getW()) {
            getDialogImpl().boxBody.setLayoutParams(new RelativeLayout.LayoutParams((int) menuLoc.getW(), -2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDrawListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnDrawListener onDrawListener) {
        if (viewTreeObserver == null || onDrawListener == null || !viewTreeObserver.isAlive()) {
            return;
        }
        try {
            viewTreeObserver.removeOnDrawListener(onDrawListener);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu baseView(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.baseViewWeakReference) == null) {
            this.baseViewWeakReference = new WeakReference<>(view);
        } else {
            weakReference.clear();
            this.baseViewWeakReference = null;
        }
        return this;
    }

    public PopMenu bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public PopMenu bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public PopMenu cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public PopMenu cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public PopMenu disableAllMenu() {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .disableAllMenu()执行失败，请先初始化菜单项 menuList");
        } else {
            for (int i = 0; i < this.menuList.size(); i++) {
                this.menuUsability.put(Integer.valueOf(i), Boolean.FALSE);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu disableMenu(int... iArr) {
        for (int i : iArr) {
            this.menuUsability.put(Integer.valueOf(i), Boolean.FALSE);
        }
        return this;
    }

    public void dismiss() {
        this.closing = true;
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopMenu.3
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = PopMenu.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(null);
            }
        });
    }

    public PopMenu enableAllMenu() {
        this.menuUsability.clear();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu enableMenu(int... iArr) {
        for (int i : iArr) {
            this.menuUsability.put(Integer.valueOf(i), Boolean.TRUE);
        }
        return this;
    }

    public int getAlignGravity() {
        return this.alignGravity;
    }

    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    public View getBaseView() {
        return baseView();
    }

    public View getCustomView() {
        OnBindView<PopMenu> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<PopMenu> getDialogLifecycleCallback() {
        DialogLifecycleCallback<PopMenu> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<PopMenu>() { // from class: com.kongzue.dialogx.dialogs.PopMenu.5
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<PopMenu> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<Integer> getIconResIds() {
        return this.iconResIds;
    }

    public ItemDivider getItemDivider() {
        return this.itemDivider;
    }

    public List<CharSequence> getMenuList() {
        return this.menuList;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0178 A[PHI: r5 r8
  0x0178: PHI (r5v42 int) = (r5v17 int), (r5v47 int) binds: [B:77:0x0202, B:49:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r8v29 int) = (r8v9 int), (r8v38 int) binds: [B:77:0x0202, B:49:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogXViewLoc getMenuLoc() {
        int i;
        int iMax;
        if (getDialogImpl().boxBody.getTag() instanceof DialogXViewLoc) {
            return (DialogXViewLoc) getDialogImpl().boxBody.getTag();
        }
        DialogXViewLoc dialogXViewLoc = new DialogXViewLoc();
        MaxRelativeLayout maxRelativeLayout = getDialogImpl().boxBody;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = getDialogImpl().boxRoot;
        int x = (int) this.baseViewLoc.getX();
        int y = (int) this.baseViewLoc.getY();
        if (this.alignGravity != -1) {
            int iMax2 = isAlignGravity(16) ? Math.max(0, ((baseView().getMeasuredHeight() / 2) + y) - (maxRelativeLayout.getHeight() / 2)) : 0;
            if (isAlignGravity(1)) {
                iMax = Math.max(0, (getWidth() > 0 ? (baseView().getMeasuredWidth() / 2) - (getWidth() / 2) : 0) + x);
            } else {
                iMax = 0;
            }
            if (isAlignGravity(17)) {
                iMax = Math.max(0, (getWidth() > 0 ? (baseView().getMeasuredWidth() / 2) - (getWidth() / 2) : 0) + x);
                iMax2 = Math.max(0, ((baseView().getMeasuredHeight() / 2) + y) - (maxRelativeLayout.getHeight() / 2));
            }
            if (this.overlayBaseView) {
                if (isAlignGravity(48)) {
                    iMax2 = (baseView().getMeasuredHeight() + y) - maxRelativeLayout.getHeight();
                    if (iMax == 0) {
                        iMax = Math.max(0, (getWidth() > 0 ? (baseView().getMeasuredWidth() / 2) - (getWidth() / 2) : 0) + x);
                    }
                }
                if (isAlignGravity(3)) {
                    iMax = Math.max(0, (baseView().getMeasuredWidth() + x) - maxRelativeLayout.getWidth());
                    if (iMax2 == 0) {
                        iMax2 = Math.max(0, ((baseView().getMeasuredHeight() / 2) + y) - (maxRelativeLayout.getHeight() / 2));
                    }
                }
                if (isAlignGravity(5)) {
                    if (iMax2 == 0) {
                        iMax2 = Math.max(0, ((baseView().getMeasuredHeight() / 2) + y) - (maxRelativeLayout.getHeight() / 2));
                    }
                    iMax = x;
                }
                if (!isAlignGravity(80)) {
                    y = iMax2;
                } else if (iMax == 0) {
                    iMax = Math.max(0, x + (getWidth() > 0 ? (baseView().getMeasuredWidth() / 2) - (getWidth() / 2) : 0));
                }
                if (!this.offScreen) {
                    if (iMax < 0) {
                        iMax = 0;
                    }
                    if (maxRelativeLayout.getWidth() + iMax > dialogXBaseRelativeLayout.getUseAreaWidth()) {
                        iMax = dialogXBaseRelativeLayout.getUseAreaWidth() - maxRelativeLayout.getWidth();
                    }
                    i = y >= 0 ? y : 0;
                    y = maxRelativeLayout.getHeight() + i > dialogXBaseRelativeLayout.getUseAreaHeight() ? dialogXBaseRelativeLayout.getUseAreaHeight() - maxRelativeLayout.getHeight() : i;
                }
                dialogXViewLoc.setX(iMax).setY(y);
            } else {
                if (isAlignGravity(48)) {
                    iMax2 = Math.max(0, y - maxRelativeLayout.getHeight());
                    if (iMax == 0) {
                        iMax = Math.max(0, (getWidth() > 0 ? (baseView().getMeasuredWidth() / 2) - (getWidth() / 2) : 0) + x);
                    }
                }
                if (isAlignGravity(3)) {
                    iMax = Math.max(0, x - maxRelativeLayout.getWidth());
                    if (iMax2 == 0) {
                        iMax2 = Math.max(0, ((baseView().getMeasuredHeight() / 2) + y) - (maxRelativeLayout.getHeight() / 2));
                    }
                }
                if (isAlignGravity(5)) {
                    iMax = Math.max(0, baseView().getWidth() + x);
                    if (iMax2 == 0) {
                        iMax2 = Math.max(0, ((baseView().getMeasuredHeight() / 2) + y) - (maxRelativeLayout.getHeight() / 2));
                    }
                }
                if (isAlignGravity(80)) {
                    y = Math.max(0, y + baseView().getHeight());
                    if (iMax == 0) {
                        iMax = Math.max(0, x + (getWidth() > 0 ? (baseView().getMeasuredWidth() / 2) - (getWidth() / 2) : 0));
                    }
                }
                if (!this.offScreen) {
                }
                dialogXViewLoc.setX(iMax).setY(y);
            }
        } else {
            int height = this.height;
            if (height == -1) {
                height = baseView().getHeight();
            }
            int x2 = (int) this.baseViewLoc.getX();
            float y2 = this.baseViewLoc.getY();
            if (this.overlayBaseView) {
                height = 0;
            }
            int useAreaHeight = (int) (y2 + height + this.selectItemYDeviation);
            if (!this.offScreen) {
                if (x2 < 0) {
                    x2 = 0;
                }
                if (maxRelativeLayout.getWidth() + x2 > dialogXBaseRelativeLayout.getUseAreaWidth()) {
                    x2 = dialogXBaseRelativeLayout.getUseAreaWidth() - maxRelativeLayout.getWidth();
                }
                i = useAreaHeight >= 0 ? useAreaHeight : 0;
                useAreaHeight = maxRelativeLayout.getHeight() + i > dialogXBaseRelativeLayout.getUseAreaHeight() ? dialogXBaseRelativeLayout.getUseAreaHeight() - maxRelativeLayout.getHeight() : i;
            }
            dialogXViewLoc.setX(x2).setY(useAreaHeight);
        }
        int width = this.width;
        if (width == -1) {
            width = baseView().getWidth();
        }
        int height2 = this.height;
        if (height2 == -1) {
            height2 = baseView().getHeight();
        }
        dialogXViewLoc.setW(width).setH(height2);
        return dialogXViewLoc;
    }

    public MenuItemLayoutRefreshCallback<PopMenu> getMenuMenuItemLayoutRefreshCallback() {
        return this.menuMenuItemLayoutRefreshCallback;
    }

    public TextInfo getMenuTextInfo() {
        TextInfo textInfo = this.menuTextInfo;
        return textInfo == null ? DialogX.menuTextInfo : textInfo;
    }

    public OnBackPressedListener<PopMenu> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public OnBackgroundMaskClickListener<PopMenu> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public OnIconChangeCallBack<PopMenu> getOnIconChangeCallBack() {
        return this.onIconChangeCallBack;
    }

    public OnMenuItemClickListener<PopMenu> getOnMenuItemClickListener() {
        OnMenuItemClickListener<PopMenu> onMenuItemClickListener = this.onMenuItemClickListener;
        return onMenuItemClickListener == null ? new OnMenuItemClickListener<PopMenu>() { // from class: com.kongzue.dialogx.dialogs.PopMenu.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z */
            @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
            public boolean onClick(PopMenu popMenu, CharSequence charSequence, int i) {
                return false;
            }
        } : onMenuItemClickListener;
    }

    public int getPressedIndex() {
        return this.pressedIndex;
    }

    public float getRadius() {
        return this.backgroundRadius;
    }

    public int getSelectIndex() {
        return this.selectIndex;
    }

    public CharSequence getSelectMenuText() {
        List<CharSequence> list = this.menuList;
        return list == null ? "" : list.get(this.selectIndex);
    }

    public int getWidth() {
        return this.width;
    }

    public void hide() {
        this.isHide = true;
        this.hideWithExitAnim = false;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
    }

    public void hideWithExitAnim() {
        this.hideWithExitAnim = true;
        this.isHide = true;
        if (getDialogImpl() != null) {
            getDialogImpl().getDialogXAnimImpl().doExitAnim(this.f4166me, getDialogImpl().boxBody);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopMenu.7
                @Override // java.lang.Runnable
                public void run() {
                    if (PopMenu.this.getDialogView() != null) {
                        PopMenu.this.getDialogView().setVisibility(8);
                    }
                }
            }, getDialogImpl().getExitAnimationDuration(null));
        }
    }

    public boolean isAlignGravity(int i) {
        return (this.alignGravity & i) == i;
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
        return this.autoTintIconInLightOrDarkMode;
    }

    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        return true;
    }

    public boolean isMenuItemEnable(int i) {
        Boolean bool = this.menuUsability.get(Integer.valueOf(i));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isOffScreen() {
        return this.offScreen;
    }

    public boolean isOverlayBaseView() {
        return this.overlayBaseView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDismiss(PopMenu popMenu) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(PopMenu popMenu) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopMenu.4
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = PopMenu.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public PopMenu removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        if (getDialogView() != null) {
            ViewTreeObserver.OnDrawListener onDrawListener = this.baseViewDrawListener;
            if (onDrawListener != null) {
                ViewTreeObserver viewTreeObserver = this.viewTreeObserver;
                if (viewTreeObserver != null) {
                    removeDrawListener(viewTreeObserver, onDrawListener);
                } else if (baseView() != null) {
                    removeDrawListener(baseView().getViewTreeObserver(), this.baseViewDrawListener);
                }
                this.baseViewDrawListener = null;
            }
            BaseDialog.dismiss(getDialogView());
            this.isShow = false;
        }
        if (getDialogImpl().boxCustom != null) {
            getDialogImpl().boxCustom.removeAllViews();
        }
        show();
    }

    public PopMenu setActionRunnable(int i, DialogXRunnable<PopMenu> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public PopMenu setAlignGravity(int i) {
        this.alignGravity = i;
        refreshMenuLoc();
        return this;
    }

    public PopMenu setAutoTintIconInLightOrDarkMode(boolean z) {
        this.autoTintIconInLightOrDarkMode = z;
        return this;
    }

    public PopMenu setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public PopMenu setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    public PopMenu setBaseView(View view) {
        baseView(view);
        refreshUI();
        return this;
    }

    public PopMenu setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public PopMenu setCustomView(OnBindView<PopMenu> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public PopMenu setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public PopMenu setDialogLifecycleCallback(DialogLifecycleCallback<PopMenu> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4166me);
        }
        return this;
    }

    public PopMenu setDialogXAnimImpl(DialogXAnimInterface<PopMenu> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public PopMenu setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    public PopMenu setHeight(int i) {
        this.height = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu setIconResIds(int... iArr) {
        if (this.iconResIds == null) {
            this.iconResIds = new ArrayList();
        }
        for (int i : iArr) {
            this.iconResIds.add(Integer.valueOf(i));
        }
        refreshUI();
        return this;
    }

    public PopMenu setItemDivider(ItemDivider itemDivider) {
        this.itemDivider = itemDivider;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu setMenuList(List<CharSequence> list) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
        refreshUI();
        return this;
    }

    public PopMenu setMenuMenuItemLayoutRefreshCallback(MenuItemLayoutRefreshCallback<PopMenu> menuItemLayoutRefreshCallback) {
        this.menuMenuItemLayoutRefreshCallback = menuItemLayoutRefreshCallback;
        return this;
    }

    public PopMenu setMenuTextInfo(TextInfo textInfo) {
        this.menuTextInfo = textInfo;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu setMenus(String... strArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        refreshUI();
        return this;
    }

    public PopMenu setOffScreen(boolean z) {
        this.offScreen = z;
        return this;
    }

    public PopMenu setOnBackPressedListener(OnBackPressedListener<PopMenu> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        return this;
    }

    public PopMenu setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<PopMenu> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        refreshUI();
        return this;
    }

    public PopMenu setOnIconChangeCallBack(OnIconChangeCallBack<PopMenu> onIconChangeCallBack) {
        this.onIconChangeCallBack = onIconChangeCallBack;
        return this;
    }

    public PopMenu setOnMenuItemClickListener(OnMenuItemClickListener<PopMenu> onMenuItemClickListener) {
        this.onMenuItemClickListener = onMenuItemClickListener;
        return this;
    }

    public PopMenu setOverlayBaseView(boolean z) {
        this.overlayBaseView = z;
        refreshUI();
        return this;
    }

    public PopMenu setPressedIndex(int i) {
        this.pressedIndex = i;
        refreshUI();
        return this;
    }

    public PopMenu setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenu setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public PopMenu setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public PopMenu setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    public PopMenu setWidth(int i) {
        this.width = i;
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static PopMenu build(DialogXStyle dialogXStyle) {
        return new PopMenu().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static PopMenu show(CharSequence... charSequenceArr) {
        PopMenu popMenu = new PopMenu(charSequenceArr);
        popMenu.show();
        return popMenu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public int getIconResIds(int i) {
        List<Integer> list = this.iconResIds;
        if (list == null || i < 0 || i >= list.size()) {
            return 0;
        }
        return this.iconResIds.get(i).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PopMenu onDismiss(DialogXRunnable<PopMenu> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PopMenu onShow(DialogXRunnable<PopMenu> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopMenu setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopMenu setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopMenu setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public PopMenu disableMenu(CharSequence... charSequenceArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .disableMenu(" + charSequenceArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (CharSequence charSequence : charSequenceArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(charSequence)), Boolean.FALSE);
            }
        }
        return this;
    }

    public PopMenu enableMenu(CharSequence... charSequenceArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .enableMenu(" + charSequenceArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (CharSequence charSequence : charSequenceArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(charSequence)), Boolean.TRUE);
            }
        }
        return this;
    }

    public PopMenu setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public PopMenu setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public static PopMenu show(String... strArr) {
        PopMenu popMenu = new PopMenu(strArr);
        popMenu.show();
        return popMenu;
    }

    public PopMenu setMenuList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        refreshUI();
        return this;
    }

    public PopMenu setMenus(CharSequence... charSequenceArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(charSequenceArr));
        refreshUI();
        return this;
    }

    public View baseView() {
        WeakReference<View> weakReference = this.baseViewWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static PopMenu show(List<CharSequence> list) {
        PopMenu popMenu = new PopMenu(list);
        popMenu.show();
        return popMenu;
    }

    public PopMenu setIconResIds(List<Integer> list) {
        this.iconResIds = list;
        refreshUI();
        return this;
    }

    public PopMenu setMenuList(CharSequence[] charSequenceArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(charSequenceArr));
        refreshUI();
        return this;
    }

    public PopMenu setMenus(int... iArr) {
        this.menuList = Arrays.asList(getTextArray(iArr));
        this.menuListAdapter = null;
        refreshUI();
        return this;
    }

    public static PopMenu show(View view, CharSequence[] charSequenceArr) {
        PopMenu popMenu = new PopMenu(view, charSequenceArr);
        popMenu.show();
        return popMenu;
    }

    public PopMenu disableMenu(String... strArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .disableMenu(" + strArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (String str : strArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(str)), Boolean.FALSE);
            }
        }
        return this;
    }

    public PopMenu enableMenu(String... strArr) {
        List<CharSequence> list = this.menuList;
        if (list == null || list.isEmpty()) {
            BaseDialog.error("DialogX: " + dialogKey() + " .enableMenu(" + strArr + ")执行失败，请先初始化菜单项 menuList");
        } else {
            for (String str : strArr) {
                this.menuUsability.put(Integer.valueOf(this.menuList.indexOf(str)), Boolean.TRUE);
            }
        }
        return this;
    }

    public static PopMenu show(View view, List<CharSequence> list) {
        PopMenu popMenu = new PopMenu(view, list);
        popMenu.show();
        return popMenu;
    }

    public static PopMenu show(View view, CharSequence[] charSequenceArr, OnBindView<PopMenu> onBindView) {
        PopMenu popMenu = new PopMenu(view, charSequenceArr, onBindView);
        popMenu.show();
        return popMenu;
    }

    public static PopMenu show(View view, List<CharSequence> list, OnBindView<PopMenu> onBindView) {
        PopMenu popMenu = new PopMenu(view, list, onBindView);
        popMenu.show();
        return popMenu;
    }

    public PopMenu(View view, List<CharSequence> list) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
        baseView(view);
    }

    public static PopMenu show(CharSequence[] charSequenceArr, OnBindView<PopMenu> onBindView) {
        PopMenu popMenu = new PopMenu(charSequenceArr, onBindView);
        popMenu.show();
        return popMenu;
    }

    public static PopMenu show(List<CharSequence> list, OnBindView<PopMenu> onBindView) {
        PopMenu popMenu = new PopMenu(list, onBindView);
        popMenu.show();
        return popMenu;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopMenu show() {
        if (this.isHide && getDialogView() != null && this.isShow) {
            if (this.hideWithExitAnim && getDialogImpl() != null) {
                getDialogImpl().boxBody.clearAnimation();
                getDialogView().setVisibility(0);
                getDialogImpl().boxRoot.animate().alpha(1.0f);
                getDialogImpl().getDialogXAnimImpl().doShowAnim(this.f4166me, getDialogImpl().boxBody);
            } else {
                getDialogView().setVisibility(0);
            }
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_popmenu_material : C2413R.layout.layout_dialogx_popmenu_material_dark;
            if (getStyle().popMenuSettings() != null && getStyle().popMenuSettings().layout(isLightTheme()) != 0) {
                customDialogLayoutResId = getStyle().popMenuSettings().layout(isLightTheme());
            }
            if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
                customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4166me);
            }
            BaseDialog.show(viewCreateView);
        } else {
            BaseDialog.show(getDialogView());
        }
        if (baseView() != null) {
            ViewTreeObserver viewTreeObserver = baseView().getViewTreeObserver();
            this.viewTreeObserver = viewTreeObserver;
            ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.1
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    int[] iArr = new int[2];
                    if (PopMenu.this.baseView() == null) {
                        if (PopMenu.this.viewTreeObserver != null) {
                            PopMenu popMenu = PopMenu.this;
                            popMenu.removeDrawListener(popMenu.viewTreeObserver, this);
                            PopMenu.this.viewTreeObserver = null;
                            PopMenu.this.baseViewDrawListener = null;
                            return;
                        }
                        return;
                    }
                    PopMenu.this.baseView().getLocationInWindow(iArr);
                    if (PopMenu.this.getDialogImpl() == null || PopMenu.this.baseViewLoc.isSameLoc(iArr) || PopMenu.this.baseView().getVisibility() != 0) {
                        return;
                    }
                    PopMenu.this.baseViewLoc.set(iArr);
                    PopMenu.this.refreshMenuLoc();
                }
            };
            this.baseViewDrawListener = onDrawListener;
            viewTreeObserver.addOnDrawListener(onDrawListener);
        }
        return this;
    }

    public PopMenu(View view, CharSequence[] charSequenceArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(charSequenceArr));
        baseView(view);
    }

    public PopMenu show(Activity activity) {
        if (this.isHide && getDialogView() != null && this.isShow) {
            if (this.hideWithExitAnim && getDialogImpl() != null) {
                getDialogImpl().boxBody.clearAnimation();
                getDialogView().setVisibility(0);
                getDialogImpl().boxRoot.animate().alpha(1.0f);
                getDialogImpl().getDialogXAnimImpl().doShowAnim(this.f4166me, getDialogImpl().boxBody);
            } else {
                getDialogView().setVisibility(0);
            }
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_popmenu_material : C2413R.layout.layout_dialogx_popmenu_material_dark;
            if (getStyle().popMenuSettings() != null && getStyle().popMenuSettings().layout(isLightTheme()) != 0) {
                customDialogLayoutResId = getStyle().popMenuSettings().layout(isLightTheme());
            }
            if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
                customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4166me);
            }
            BaseDialog.show(activity, viewCreateView);
        } else {
            BaseDialog.show(activity, getDialogView());
        }
        if (baseView() != null) {
            ViewTreeObserver viewTreeObserver = baseView().getViewTreeObserver();
            this.viewTreeObserver = viewTreeObserver;
            ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.kongzue.dialogx.dialogs.PopMenu.2
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    int[] iArr = new int[2];
                    if (PopMenu.this.baseView() == null) {
                        if (PopMenu.this.viewTreeObserver != null) {
                            PopMenu popMenu = PopMenu.this;
                            popMenu.removeDrawListener(popMenu.viewTreeObserver, this);
                            PopMenu.this.viewTreeObserver = null;
                            PopMenu.this.baseViewDrawListener = null;
                            return;
                        }
                        return;
                    }
                    PopMenu.this.baseView().getLocationInWindow(iArr);
                    if (PopMenu.this.getDialogImpl() == null || PopMenu.this.baseViewLoc.isSameLoc(iArr) || PopMenu.this.baseView().getVisibility() != 0) {
                        return;
                    }
                    PopMenu.this.baseViewLoc.set(iArr);
                    PopMenu.this.refreshMenuLoc();
                }
            };
            this.baseViewDrawListener = onDrawListener;
            viewTreeObserver.addOnDrawListener(onDrawListener);
        }
        return this;
    }

    public PopMenu(List<CharSequence> list) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
    }

    public PopMenu(CharSequence... charSequenceArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(charSequenceArr));
    }

    public PopMenu(String... strArr) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
    }

    public PopMenu(OnBindView<PopMenu> onBindView) {
        this.onBindView = onBindView;
    }

    public PopMenu(View view, OnBindView<PopMenu> onBindView) {
        baseView(view);
        this.onBindView = onBindView;
    }

    public PopMenu(View view, List<CharSequence> list, OnBindView<PopMenu> onBindView) {
        baseView(view);
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
        this.onBindView = onBindView;
    }

    public PopMenu(View view, CharSequence[] charSequenceArr, OnBindView<PopMenu> onBindView) {
        baseView(view);
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(charSequenceArr));
        this.onBindView = onBindView;
    }

    public PopMenu(List<CharSequence> list, OnBindView<PopMenu> onBindView) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(list);
        this.onBindView = onBindView;
    }

    public PopMenu(CharSequence[] charSequenceArr, OnBindView<PopMenu> onBindView) {
        ArrayList arrayList = new ArrayList();
        this.menuList = arrayList;
        arrayList.addAll(Arrays.asList(charSequenceArr));
        this.onBindView = onBindView;
    }
}
