package com.lxj.xpopup.core;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2270;
import androidx.core.view.AbstractC2284;
import androidx.core.view.C2271;
import androidx.core.view.InterfaceC2287;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.C2332;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2369;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2389;
import androidx.lifecycle.Lifecycle$Event;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.enums.PopupAnimation;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC3786;
import com.lxj.xpopup.util.AbstractC3788;
import com.lxj.xpopup.util.ViewTreeObserverOnGlobalLayoutListenerC3787;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p275.AbstractC8355;
import p275.AbstractC8356;
import p275.C8354;
import p276.AbstractC8357;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3776 extends FrameLayout implements InterfaceC2389, InterfaceC2388, InterfaceC2287 {
    protected AbstractC8356 blurAnimator;
    public DialogC3783 dialog;
    Runnable dismissWithRunnable;
    protected Runnable doAfterDismissTask;
    protected Runnable doAfterShowTask;
    protected Handler handler;
    private boolean hasModifySoftMode;
    public boolean hasMoveUp;
    private final Runnable initTask;
    protected boolean isCreated;
    protected C2386 lifecycleRegistry;
    protected AbstractC8355 popupContentAnimator;
    public C3784 popupInfo;
    public PopupStatus popupStatus;
    private int preSoftMode;
    protected C8354 shadowBgAnimator;
    private RunnableC3777 showSoftInputTask;
    private final int touchSlop;
    private float x;
    private float y;

    public AbstractC3776(Context context) {
        super(context);
        this.popupStatus = PopupStatus.Dismiss;
        this.hasMoveUp = false;
        this.isCreated = false;
        this.handler = new Handler(Looper.getMainLooper());
        AbstractC3781 abstractC3781 = (AbstractC3781) this;
        this.doAfterDismissTask = new RunnableC3780(abstractC3781, 0);
        this.hasModifySoftMode = false;
        this.preSoftMode = -1;
        this.doAfterShowTask = new RunnableC3780(abstractC3781, 1);
        this.initTask = new RunnableC3780(abstractC3781, 2);
        if (context instanceof Application) {
            C5925.m11310("XPopup的Context必须是Activity类型！");
            throw null;
        }
        this.lifecycleRegistry = new C2386(this, true);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setId(View.generateViewId());
        View viewInflate = LayoutInflater.from(context).cloneInContext(context).inflate(getInnerLayoutId(), (ViewGroup) this, false);
        viewInflate.setAlpha(0.0f);
        addView(viewInflate);
    }

    public void addOnUnhandledKeyListener(View view) {
        AbstractC2270.m4240(view, this);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2284.m4278(view, this);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(this);
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = C2271.f6595;
            synchronized (arrayList2) {
                try {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            return;
                        }
                    }
                    C2271.f6595.add(new WeakReference(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void delayDismiss(long j) {
        if (j < 0) {
            j = 0;
        }
        this.handler.postDelayed(new RunnableC3779(this, 1), j);
    }

    public void delayDismissWith(long j, Runnable runnable) {
        this.dismissWithRunnable = runnable;
        delayDismiss(j);
    }

    public void destroy() {
        View view;
        AbstractC2270.m4240(this, this);
        this.lifecycleRegistry.m4499(Lifecycle$Event.ON_DESTROY);
        this.lifecycleRegistry.mo4502(this);
        C3784 c3784 = this.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
            this.popupInfo.getClass();
            this.popupInfo.getClass();
            this.popupInfo.getClass();
            this.popupInfo = null;
        }
        DialogC3783 dialogC3783 = this.dialog;
        if (dialogC3783 != null) {
            if (dialogC3783.isShowing()) {
                this.dialog.dismiss();
            }
            this.dialog.f11813 = null;
            this.dialog = null;
        }
        C8354 c8354 = this.shadowBgAnimator;
        if (c8354 == null || (view = c8354.f23035) == null) {
            return;
        }
        view.animate().cancel();
    }

    public abstract void dismiss();

    public void dismissOrHideSoftInput() {
        if (AbstractC3788.m8104(getHostWindow()) == 0) {
            dismiss();
        } else {
            SparseArray sparseArray = AbstractC3786.f11822;
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void dismissWith(Runnable runnable) {
        this.dismissWithRunnable = runnable;
        dismiss();
    }

    public void doAfterShow() {
        this.handler.removeCallbacks(this.doAfterShowTask);
        this.handler.postDelayed(this.doAfterShowTask, getAnimationDuration());
    }

    public void focusAndProcessBackPress() {
        Object objInvoke;
        Field declaredField;
        if (this.popupInfo != null) {
            setFocusableInTouchMode(true);
            setFocusable(true);
            if (Build.VERSION.SDK_INT >= 28) {
                addOnUnhandledKeyListener(this);
            } else {
                setOnKeyListener(new ViewOnKeyListenerC3778(this));
            }
            ArrayList arrayList = new ArrayList();
            AbstractC3788.m8105(arrayList, (ViewGroup) getPopupContentView());
            if (arrayList.size() <= 0) {
                this.popupInfo.getClass();
                return;
            }
            this.preSoftMode = getHostWindow().getAttributes().softInputMode;
            this.popupInfo.getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                EditText editText = (EditText) arrayList.get(i);
                if (Build.VERSION.SDK_INT >= 28) {
                    addOnUnhandledKeyListener(editText);
                } else {
                    try {
                        Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", null);
                        if (!declaredMethod.isAccessible()) {
                            declaredMethod.setAccessible(true);
                        }
                        objInvoke = declaredMethod.invoke(editText, null);
                        declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnKeyListener");
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                    } catch (Exception unused) {
                    }
                    if (declaredField.get(objInvoke) == null) {
                        editText.setOnKeyListener(new ViewOnKeyListenerC3778(this));
                    }
                }
                if (i == 0) {
                    this.popupInfo.getClass();
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                    this.popupInfo.getClass();
                }
            }
        }
    }

    public AbstractC8355 genAnimatorByPopupType() {
        C3784 c3784 = this.popupInfo;
        if (c3784 == null) {
            return null;
        }
        c3784.getClass();
        return null;
    }

    public int getActivityContentLeft() {
        if (!AbstractC3788.m8110(getContext())) {
            return 0;
        }
        int[] iArr = new int[2];
        AbstractC3788.m8107(this).getWindow().getDecorView().findViewById(android.R.id.content).getLocationInWindow(iArr);
        return iArr[0];
    }

    public View getActivityContentView() {
        return AbstractC3788.m8107(this).getWindow().getDecorView().findViewById(android.R.id.content);
    }

    public int getAnimationDuration() {
        if (this.popupInfo == null) {
            return 0;
        }
        if (PopupAnimation.NoAnimation == null) {
            return 1;
        }
        return AbstractC8357.f23038 + 1;
    }

    public Window getHostWindow() {
        C3784 c3784 = this.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
        }
        DialogC3783 dialogC3783 = this.dialog;
        if (dialogC3783 == null) {
            return null;
        }
        return dialogC3783.getWindow();
    }

    public int getImplLayoutId() {
        return -1;
    }

    public abstract int getInnerLayoutId();

    public List<String> getInternalFragmentNames() {
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public AbstractC2402 getLifecycle() {
        return this.lifecycleRegistry;
    }

    public int getMaxHeight() {
        this.popupInfo.getClass();
        return 0;
    }

    public int getMaxWidth() {
        this.popupInfo.getClass();
        return 0;
    }

    public AbstractC8355 getPopupAnimator() {
        return null;
    }

    public View getPopupContentView() {
        return getChildAt(0);
    }

    public int getPopupHeight() {
        this.popupInfo.getClass();
        return 0;
    }

    public View getPopupImplView() {
        return ((ViewGroup) getPopupContentView()).getChildAt(0);
    }

    public int getPopupWidth() {
        this.popupInfo.getClass();
        return 0;
    }

    public int getShadowBgColor() {
        C3784 c3784 = this.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
        }
        return AbstractC8357.f23036;
    }

    public int getStatusBarBgColor() {
        C3784 c3784 = this.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
        }
        return AbstractC8357.f23037;
    }

    public View getWindowDecorView() {
        if (getHostWindow() == null) {
            return null;
        }
        return (ViewGroup) getHostWindow().getDecorView();
    }

    public void init() {
        if (this.shadowBgAnimator == null) {
            int animationDuration = getAnimationDuration();
            int shadowBgColor = getShadowBgColor();
            C8354 c8354 = new C8354(this, animationDuration, null);
            c8354.f23033 = new ArgbEvaluator();
            c8354.f23032 = shadowBgColor;
            this.shadowBgAnimator = c8354;
        }
        this.popupInfo.getClass();
        if (!this.isCreated) {
            initPopupContent();
        }
        if (!this.isCreated) {
            this.isCreated = true;
            onCreate();
            this.lifecycleRegistry.m4499(Lifecycle$Event.ON_CREATE);
            this.popupInfo.getClass();
        }
        this.handler.postDelayed(this.initTask, 10L);
    }

    public void initAnimator() {
        getPopupContentView().setAlpha(1.0f);
        AbstractC8355 abstractC8355GenAnimatorByPopupType = genAnimatorByPopupType();
        this.popupContentAnimator = abstractC8355GenAnimatorByPopupType;
        if (abstractC8355GenAnimatorByPopupType == null) {
            this.popupContentAnimator = getPopupAnimator();
        }
        if (this.popupInfo != null) {
            this.shadowBgAnimator.mo13864();
        }
        AbstractC8355 abstractC8355 = this.popupContentAnimator;
        if (abstractC8355 != null) {
            abstractC8355.mo13864();
        }
    }

    public abstract void initPopupContent();

    public boolean isDismiss() {
        return this.popupStatus == PopupStatus.Dismiss;
    }

    public boolean isShow() {
        return this.popupStatus != PopupStatus.Dismiss;
    }

    public boolean onBackPressed() {
        return false;
    }

    public abstract void onCreate();

    @InterfaceC2369(Lifecycle$Event.ON_DESTROY)
    public void onDestroy() {
        onDetachedFromWindow();
        DialogC3783 dialogC3783 = this.dialog;
        if (dialogC3783 != null) {
            dialogC3783.dismiss();
        }
        destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getWindowDecorView() != null) {
            Window hostWindow = getHostWindow();
            SparseArray sparseArray = AbstractC3786.f11822;
            View viewFindViewById = hostWindow.findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                SparseArray sparseArray2 = AbstractC3786.f11822;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) sparseArray2.get(getId());
                if (onGlobalLayoutListener != null) {
                    viewFindViewById.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    sparseArray2.remove(getId());
                }
            }
        }
        this.handler.removeCallbacksAndMessages(null);
        C3784 c3784 = this.popupInfo;
        if (c3784 != null && c3784.f11814) {
            destroy();
        }
        if (getContext() != null && (getContext() instanceof FragmentActivity)) {
            ((FragmentActivity) getContext()).getLifecycle().mo4502(this);
        }
        this.popupStatus = PopupStatus.Dismiss;
        this.showSoftInputTask = null;
        this.hasMoveUp = false;
    }

    public abstract void onDismiss();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = r9.getPopupImplView()
            r1.getGlobalVisibleRect(r0)
            float r1 = r10.getX()
            float r2 = r10.getY()
            boolean r0 = com.lxj.xpopup.util.AbstractC3788.m8108(r1, r2, r0)
            r1 = 1
            if (r0 != 0) goto L83
            int r0 = r10.getAction()
            if (r0 == 0) goto L74
            if (r0 == r1) goto L3a
            r2 = 2
            if (r0 == r2) goto L2a
            r2 = 3
            if (r0 == r2) goto L3a
            goto L83
        L2a:
            com.lxj.xpopup.core.飘花落叶言子楪苏哲兰世 r10 = r9.popupInfo
            if (r10 == 0) goto L83
            r10.getClass()
            r9.dismiss()
            com.lxj.xpopup.core.飘花落叶言子楪苏哲兰世 r9 = r9.popupInfo
            r9.getClass()
            return r1
        L3a:
            float r0 = r10.getX()
            float r2 = r9.x
            float r0 = r0 - r2
            float r2 = r10.getY()
            float r3 = r9.y
            float r2 = r2 - r3
            double r3 = (double) r0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            double r7 = (double) r2
            double r5 = java.lang.Math.pow(r7, r5)
            double r5 = r5 + r3
            double r2 = java.lang.Math.sqrt(r5)
            float r0 = (float) r2
            r9.passTouchThrough(r10)
            int r10 = r9.touchSlop
            float r10 = (float) r10
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6e
            com.lxj.xpopup.core.飘花落叶言子楪苏哲兰世 r10 = r9.popupInfo
            if (r10 == 0) goto L6e
            r10.getClass()
            r9.dismiss()
        L6e:
            r10 = 0
            r9.x = r10
            r9.y = r10
            return r1
        L74:
            float r0 = r10.getX()
            r9.x = r0
            float r0 = r10.getY()
            r9.y = r0
            r9.passTouchThrough(r10)
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.core.AbstractC3776.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.view.InterfaceC2287
    public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return processKeyEvent(keyEvent.getKeyCode(), keyEvent);
    }

    public void passTouchThrough(MotionEvent motionEvent) {
        C3784 c3784 = this.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
            this.popupInfo.getClass();
        }
    }

    public boolean processKeyEvent(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1 || this.popupInfo == null) {
            return false;
        }
        if (onBackPressed()) {
            return true;
        }
        this.popupInfo.getClass();
        this.popupInfo.getClass();
        dismissOrHideSoftInput();
        return true;
    }

    public AbstractC3776 show() {
        Activity activityM8107 = AbstractC3788.m8107(this);
        if (activityM8107 != null && !activityM8107.isFinishing()) {
            if (this.popupInfo == null) {
                C5925.m11310("popupInfo is null, if your popup object is used once, do not set isDestroyOnDismiss(true) !");
                return null;
            }
            PopupStatus popupStatus = this.popupStatus;
            PopupStatus popupStatus2 = PopupStatus.Showing;
            if (popupStatus != popupStatus2 && popupStatus != PopupStatus.Dismissing) {
                this.popupStatus = popupStatus2;
                DialogC3783 dialogC3783 = this.dialog;
                if (dialogC3783 == null || !dialogC3783.isShowing()) {
                    if (this.popupInfo == null) {
                        C5925.m11310("如果弹窗对象是复用的，则不要设置isDestroyOnDismiss(true)");
                        return null;
                    }
                    if (getContext() instanceof FragmentActivity) {
                        ((FragmentActivity) getContext()).getLifecycle().mo4503(this);
                    }
                    if (getLayoutParams() == null) {
                        View decorView = AbstractC3788.m8107(this).getWindow().getDecorView();
                        View viewFindViewById = decorView.findViewById(android.R.id.navigationBarBackground);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getActivityContentView().getMeasuredWidth(), decorView.getMeasuredHeight() - ((!AbstractC3788.m8110(getContext()) || (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) ? viewFindViewById != null ? (!AbstractC3788.m8110(getContext()) || (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) ? viewFindViewById.getMeasuredHeight() : viewFindViewById.getMeasuredWidth() : 0 : 0));
                        if (AbstractC3788.m8110(getContext())) {
                            marginLayoutParams.leftMargin = getActivityContentLeft();
                        }
                        setLayoutParams(marginLayoutParams);
                    }
                    this.popupInfo.getClass();
                    if (this.dialog == null) {
                        DialogC3783 dialogC37832 = new DialogC3783(getContext(), R.style._XPopup_TransparentDialog);
                        if (getParent() != null) {
                            ((ViewGroup) getParent()).removeView(this);
                        }
                        dialogC37832.f11813 = this;
                        this.dialog = dialogC37832;
                    }
                    Activity activityM81072 = AbstractC3788.m8107(this);
                    if (activityM81072 != null && !activityM81072.isFinishing() && !this.dialog.isShowing()) {
                        this.dialog.show();
                    }
                    Window hostWindow = getHostWindow();
                    C3775 c3775 = new C3775(this);
                    SparseArray sparseArray = AbstractC3786.f11822;
                    if ((hostWindow.getAttributes().flags & 512) != 0) {
                        hostWindow.clearFlags(512);
                    }
                    FrameLayout frameLayout = (FrameLayout) hostWindow.findViewById(android.R.id.content);
                    ViewTreeObserverOnGlobalLayoutListenerC3787 viewTreeObserverOnGlobalLayoutListenerC3787 = new ViewTreeObserverOnGlobalLayoutListenerC3787(hostWindow, new int[]{AbstractC3786.m8101(hostWindow)}, c3775);
                    frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3787);
                    AbstractC3786.f11822.append(getId(), viewTreeObserverOnGlobalLayoutListenerC3787);
                    init();
                    return this;
                }
            }
        }
        return this;
    }

    public void showSoftInput(View view) {
        if (this.popupInfo != null) {
            RunnableC3777 runnableC3777 = this.showSoftInputTask;
            if (runnableC3777 == null) {
                RunnableC3777 runnableC37772 = new RunnableC3777();
                runnableC37772.f11806 = view;
                this.showSoftInputTask = runnableC37772;
            } else {
                this.handler.removeCallbacks(runnableC3777);
            }
            this.handler.postDelayed(this.showSoftInputTask, 10L);
        }
    }

    public void smartDismiss() {
        this.handler.post(new RunnableC3779(this, 0));
    }

    public void toggle() {
        if (isShow()) {
            dismiss();
        } else {
            show();
        }
    }

    public void tryRemoveFragments() {
        if (getContext() instanceof FragmentActivity) {
            AbstractC2313 supportFragmentManager = ((FragmentActivity) getContext()).getSupportFragmentManager();
            List listM964 = supportFragmentManager.f6784.m964();
            List<String> internalFragmentNames = getInternalFragmentNames();
            if (listM964 == null || listM964.size() <= 0 || internalFragmentNames == null) {
                return;
            }
            for (int i = 0; i < listM964.size(); i++) {
                if (internalFragmentNames.contains(((AbstractComponentCallbacksC2338) listM964.get(i)).getClass().getSimpleName())) {
                    C2332 c2332 = new C2332(supportFragmentManager);
                    c2332.m4432((AbstractComponentCallbacksC2338) listM964.get(i));
                    c2332.m4428(true);
                }
            }
        }
    }

    public void applyDarkTheme() {
    }

    public void applyLightTheme() {
    }

    public void beforeDismiss() {
    }

    public void beforeShow() {
    }

    public void onShow() {
    }

    public void onKeyboardHeightChange(int i) {
    }
}
