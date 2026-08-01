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
import com.lxj.xpopup.util.AbstractC3785;
import com.lxj.xpopup.util.AbstractC3787;
import com.lxj.xpopup.util.ViewTreeObserverOnGlobalLayoutListenerC3786;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p275.AbstractC8354;
import p275.AbstractC8355;
import p275.C8353;
import p276.AbstractC8356;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3775 extends FrameLayout implements InterfaceC2389, InterfaceC2388, InterfaceC2287 {
    protected AbstractC8355 blurAnimator;
    public DialogC3782 dialog;
    Runnable dismissWithRunnable;
    protected Runnable doAfterDismissTask;
    protected Runnable doAfterShowTask;
    protected Handler handler;
    private boolean hasModifySoftMode;
    public boolean hasMoveUp;
    private final Runnable initTask;
    protected boolean isCreated;
    protected C2386 lifecycleRegistry;
    protected AbstractC8354 popupContentAnimator;
    public C3783 popupInfo;
    public PopupStatus popupStatus;
    private int preSoftMode;
    protected C8353 shadowBgAnimator;
    private RunnableC3776 showSoftInputTask;
    private final int touchSlop;
    private float x;
    private float y;

    public AbstractC3775(Context context) {
        super(context);
        this.popupStatus = PopupStatus.Dismiss;
        this.hasMoveUp = false;
        this.isCreated = false;
        this.handler = new Handler(Looper.getMainLooper());
        AbstractC3780 abstractC3780 = (AbstractC3780) this;
        this.doAfterDismissTask = new RunnableC3779(abstractC3780, 0);
        this.hasModifySoftMode = false;
        this.preSoftMode = -1;
        this.doAfterShowTask = new RunnableC3779(abstractC3780, 1);
        this.initTask = new RunnableC3779(abstractC3780, 2);
        if (context instanceof Application) {
            C5919.m11249("XPopup的Context必须是Activity类型！");
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
        AbstractC2270.m4230(view, this);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2284.m4268(view, this);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(this);
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = C2271.f6594;
            synchronized (arrayList2) {
                try {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            return;
                        }
                    }
                    C2271.f6594.add(new WeakReference(view));
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
        this.handler.postDelayed(new RunnableC3778(this, 1), j);
    }

    public void delayDismissWith(long j, Runnable runnable) {
        this.dismissWithRunnable = runnable;
        delayDismiss(j);
    }

    public void destroy() {
        View view;
        AbstractC2270.m4230(this, this);
        this.lifecycleRegistry.m4489(Lifecycle$Event.ON_DESTROY);
        this.lifecycleRegistry.mo4492(this);
        C3783 c3783 = this.popupInfo;
        if (c3783 != null) {
            c3783.getClass();
            this.popupInfo.getClass();
            this.popupInfo.getClass();
            this.popupInfo.getClass();
            this.popupInfo = null;
        }
        DialogC3782 dialogC3782 = this.dialog;
        if (dialogC3782 != null) {
            if (dialogC3782.isShowing()) {
                this.dialog.dismiss();
            }
            this.dialog.f11808 = null;
            this.dialog = null;
        }
        C8353 c8353 = this.shadowBgAnimator;
        if (c8353 == null || (view = c8353.f23036) == null) {
            return;
        }
        view.animate().cancel();
    }

    public abstract void dismiss();

    public void dismissOrHideSoftInput() {
        if (AbstractC3787.m8117(getHostWindow()) == 0) {
            dismiss();
        } else {
            SparseArray sparseArray = AbstractC3785.f11817;
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
                setOnKeyListener(new ViewOnKeyListenerC3777(this));
            }
            ArrayList arrayList = new ArrayList();
            AbstractC3787.m8118(arrayList, (ViewGroup) getPopupContentView());
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
                        editText.setOnKeyListener(new ViewOnKeyListenerC3777(this));
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

    public AbstractC8354 genAnimatorByPopupType() {
        C3783 c3783 = this.popupInfo;
        if (c3783 == null) {
            return null;
        }
        c3783.getClass();
        return null;
    }

    public int getActivityContentLeft() {
        if (!AbstractC3787.m8123(getContext())) {
            return 0;
        }
        int[] iArr = new int[2];
        AbstractC3787.m8120(this).getWindow().getDecorView().findViewById(android.R.id.content).getLocationInWindow(iArr);
        return iArr[0];
    }

    public View getActivityContentView() {
        return AbstractC3787.m8120(this).getWindow().getDecorView().findViewById(android.R.id.content);
    }

    public int getAnimationDuration() {
        if (this.popupInfo == null) {
            return 0;
        }
        if (PopupAnimation.NoAnimation == null) {
            return 1;
        }
        return AbstractC8356.f23039 + 1;
    }

    public Window getHostWindow() {
        C3783 c3783 = this.popupInfo;
        if (c3783 != null) {
            c3783.getClass();
        }
        DialogC3782 dialogC3782 = this.dialog;
        if (dialogC3782 == null) {
            return null;
        }
        return dialogC3782.getWindow();
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

    public AbstractC8354 getPopupAnimator() {
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
        C3783 c3783 = this.popupInfo;
        if (c3783 != null) {
            c3783.getClass();
        }
        return AbstractC8356.f23037;
    }

    public int getStatusBarBgColor() {
        C3783 c3783 = this.popupInfo;
        if (c3783 != null) {
            c3783.getClass();
        }
        return AbstractC8356.f23038;
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
            C8353 c8353 = new C8353(this, animationDuration, null);
            c8353.f23034 = new ArgbEvaluator();
            c8353.f23033 = shadowBgColor;
            this.shadowBgAnimator = c8353;
        }
        this.popupInfo.getClass();
        if (!this.isCreated) {
            initPopupContent();
        }
        if (!this.isCreated) {
            this.isCreated = true;
            onCreate();
            this.lifecycleRegistry.m4489(Lifecycle$Event.ON_CREATE);
            this.popupInfo.getClass();
        }
        this.handler.postDelayed(this.initTask, 10L);
    }

    public void initAnimator() {
        getPopupContentView().setAlpha(1.0f);
        AbstractC8354 abstractC8354GenAnimatorByPopupType = genAnimatorByPopupType();
        this.popupContentAnimator = abstractC8354GenAnimatorByPopupType;
        if (abstractC8354GenAnimatorByPopupType == null) {
            this.popupContentAnimator = getPopupAnimator();
        }
        if (this.popupInfo != null) {
            this.shadowBgAnimator.mo13847();
        }
        AbstractC8354 abstractC8354 = this.popupContentAnimator;
        if (abstractC8354 != null) {
            abstractC8354.mo13847();
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
        DialogC3782 dialogC3782 = this.dialog;
        if (dialogC3782 != null) {
            dialogC3782.dismiss();
        }
        destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getWindowDecorView() != null) {
            Window hostWindow = getHostWindow();
            SparseArray sparseArray = AbstractC3785.f11817;
            View viewFindViewById = hostWindow.findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                SparseArray sparseArray2 = AbstractC3785.f11817;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) sparseArray2.get(getId());
                if (onGlobalLayoutListener != null) {
                    viewFindViewById.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    sparseArray2.remove(getId());
                }
            }
        }
        this.handler.removeCallbacksAndMessages(null);
        C3783 c3783 = this.popupInfo;
        if (c3783 != null && c3783.f11809) {
            destroy();
        }
        if (getContext() != null && (getContext() instanceof FragmentActivity)) {
            ((FragmentActivity) getContext()).getLifecycle().mo4492(this);
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
            boolean r0 = com.lxj.xpopup.util.AbstractC3787.m8121(r1, r2, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.core.AbstractC3775.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.view.InterfaceC2287
    public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return processKeyEvent(keyEvent.getKeyCode(), keyEvent);
    }

    public void passTouchThrough(MotionEvent motionEvent) {
        C3783 c3783 = this.popupInfo;
        if (c3783 != null) {
            c3783.getClass();
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

    public AbstractC3775 show() {
        Activity activityM8120 = AbstractC3787.m8120(this);
        if (activityM8120 != null && !activityM8120.isFinishing()) {
            if (this.popupInfo == null) {
                C5919.m11249("popupInfo is null, if your popup object is used once, do not set isDestroyOnDismiss(true) !");
                return null;
            }
            PopupStatus popupStatus = this.popupStatus;
            PopupStatus popupStatus2 = PopupStatus.Showing;
            if (popupStatus != popupStatus2 && popupStatus != PopupStatus.Dismissing) {
                this.popupStatus = popupStatus2;
                DialogC3782 dialogC3782 = this.dialog;
                if (dialogC3782 == null || !dialogC3782.isShowing()) {
                    if (this.popupInfo == null) {
                        C5919.m11249("如果弹窗对象是复用的，则不要设置isDestroyOnDismiss(true)");
                        return null;
                    }
                    if (getContext() instanceof FragmentActivity) {
                        ((FragmentActivity) getContext()).getLifecycle().mo4493(this);
                    }
                    if (getLayoutParams() == null) {
                        View decorView = AbstractC3787.m8120(this).getWindow().getDecorView();
                        View viewFindViewById = decorView.findViewById(android.R.id.navigationBarBackground);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getActivityContentView().getMeasuredWidth(), decorView.getMeasuredHeight() - ((!AbstractC3787.m8123(getContext()) || (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) ? viewFindViewById != null ? (!AbstractC3787.m8123(getContext()) || (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) ? viewFindViewById.getMeasuredHeight() : viewFindViewById.getMeasuredWidth() : 0 : 0));
                        if (AbstractC3787.m8123(getContext())) {
                            marginLayoutParams.leftMargin = getActivityContentLeft();
                        }
                        setLayoutParams(marginLayoutParams);
                    }
                    this.popupInfo.getClass();
                    if (this.dialog == null) {
                        DialogC3782 dialogC37822 = new DialogC3782(getContext(), R.style._XPopup_TransparentDialog);
                        if (getParent() != null) {
                            ((ViewGroup) getParent()).removeView(this);
                        }
                        dialogC37822.f11808 = this;
                        this.dialog = dialogC37822;
                    }
                    Activity activityM81202 = AbstractC3787.m8120(this);
                    if (activityM81202 != null && !activityM81202.isFinishing() && !this.dialog.isShowing()) {
                        this.dialog.show();
                    }
                    Window hostWindow = getHostWindow();
                    C3774 c3774 = new C3774(this);
                    SparseArray sparseArray = AbstractC3785.f11817;
                    if ((hostWindow.getAttributes().flags & 512) != 0) {
                        hostWindow.clearFlags(512);
                    }
                    FrameLayout frameLayout = (FrameLayout) hostWindow.findViewById(android.R.id.content);
                    ViewTreeObserverOnGlobalLayoutListenerC3786 viewTreeObserverOnGlobalLayoutListenerC3786 = new ViewTreeObserverOnGlobalLayoutListenerC3786(hostWindow, new int[]{AbstractC3785.m8114(hostWindow)}, c3774);
                    frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3786);
                    AbstractC3785.f11817.append(getId(), viewTreeObserverOnGlobalLayoutListenerC3786);
                    init();
                    return this;
                }
            }
        }
        return this;
    }

    public void showSoftInput(View view) {
        if (this.popupInfo != null) {
            RunnableC3776 runnableC3776 = this.showSoftInputTask;
            if (runnableC3776 == null) {
                RunnableC3776 runnableC37762 = new RunnableC3776();
                runnableC37762.f11801 = view;
                this.showSoftInputTask = runnableC37762;
            } else {
                this.handler.removeCallbacks(runnableC3776);
            }
            this.handler.postDelayed(this.showSoftInputTask, 10L);
        }
    }

    public void smartDismiss() {
        this.handler.post(new RunnableC3778(this, 0));
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
            List listM963 = supportFragmentManager.f6783.m963();
            List<String> internalFragmentNames = getInternalFragmentNames();
            if (listM963 == null || listM963.size() <= 0 || internalFragmentNames == null) {
                return;
            }
            for (int i = 0; i < listM963.size(); i++) {
                if (internalFragmentNames.contains(((AbstractComponentCallbacksC2338) listM963.get(i)).getClass().getSimpleName())) {
                    C2332 c2332 = new C2332(supportFragmentManager);
                    c2332.m4422((AbstractComponentCallbacksC2338) listM963.get(i));
                    c2332.m4418(true);
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
