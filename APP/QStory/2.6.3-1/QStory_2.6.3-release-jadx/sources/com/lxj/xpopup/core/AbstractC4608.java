package com.lxj.xpopup.core;

import android.R;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import androidx.core.view.AbstractC3103;
import androidx.core.view.AbstractC3117;
import androidx.core.view.C3104;
import androidx.core.view.InterfaceC3120;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3165;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3202;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3222;
import androidx.lifecycle.Lifecycle$Event;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.lxj.xpopup.enums.PopupAnimation;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC4618;
import com.lxj.xpopup.util.AbstractC4620;
import com.lxj.xpopup.util.ViewTreeObserverOnGlobalLayoutListenerC4619;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p291.AbstractC9184;
import p291.AbstractC9185;
import p291.C9183;
import p292.AbstractC9186;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4608 extends FrameLayout implements InterfaceC3222, InterfaceC3221, InterfaceC3120 {
    protected AbstractC9185 blurAnimator;
    public DialogC4615 dialog;
    Runnable dismissWithRunnable;
    protected Runnable doAfterDismissTask;
    protected Runnable doAfterShowTask;
    protected Handler handler;
    private boolean hasModifySoftMode;
    public boolean hasMoveUp;
    private final Runnable initTask;
    protected boolean isCreated;
    protected C3219 lifecycleRegistry;
    protected AbstractC9184 popupContentAnimator;
    public C4616 popupInfo;
    public PopupStatus popupStatus;
    private int preSoftMode;
    protected C9183 shadowBgAnimator;
    private RunnableC4609 showSoftInputTask;
    private final int touchSlop;

    /* JADX INFO: renamed from: x */
    private float f293x;

    /* JADX INFO: renamed from: y */
    private float f294y;

    public AbstractC4608(Context context) {
        super(context);
        this.popupStatus = PopupStatus.Dismiss;
        this.hasMoveUp = false;
        this.isCreated = false;
        this.handler = new Handler(Looper.getMainLooper());
        AbstractC4613 abstractC4613 = (AbstractC4613) this;
        this.doAfterDismissTask = new RunnableC4612(abstractC4613, 0);
        this.hasModifySoftMode = false;
        this.preSoftMode = -1;
        this.doAfterShowTask = new RunnableC4612(abstractC4613, 1);
        this.initTask = new RunnableC4612(abstractC4613, 2);
        if (context instanceof Application) {
            C6755.m11869("XPopup的Context必须是Activity类型！");
            throw null;
        }
        this.lifecycleRegistry = new C3219(this, true);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setId(View.generateViewId());
        View viewInflate = LayoutInflater.from(context).cloneInContext(context).inflate(getInnerLayoutId(), (ViewGroup) this, false);
        viewInflate.setAlpha(0.0f);
        addView(viewInflate);
    }

    public void addOnUnhandledKeyListener(View view) {
        AbstractC3103.m4800(view, this);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC3117.m4838(view, this);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0328R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C0328R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(this);
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = C3104.f6940;
            synchronized (arrayList2) {
                try {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            return;
                        }
                    }
                    C3104.f6940.add(new WeakReference(view));
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
        this.handler.postDelayed(new RunnableC4611(this, 1), j);
    }

    public void delayDismissWith(long j, Runnable runnable) {
        this.dismissWithRunnable = runnable;
        delayDismiss(j);
    }

    public void destroy() {
        View view;
        AbstractC3103.m4800(this, this);
        this.lifecycleRegistry.m5059(Lifecycle$Event.ON_DESTROY);
        this.lifecycleRegistry.mo5062(this);
        C4616 c4616 = this.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
            this.popupInfo.getClass();
            this.popupInfo.getClass();
            this.popupInfo.getClass();
            this.popupInfo = null;
        }
        DialogC4615 dialogC4615 = this.dialog;
        if (dialogC4615 != null) {
            if (dialogC4615.isShowing()) {
                this.dialog.dismiss();
            }
            this.dialog.f12158 = null;
            this.dialog = null;
        }
        C9183 c9183 = this.shadowBgAnimator;
        if (c9183 == null || (view = c9183.f23380) == null) {
            return;
        }
        view.animate().cancel();
    }

    public abstract void dismiss();

    public void dismissOrHideSoftInput() {
        if (AbstractC4620.m8663(getHostWindow()) == 0) {
            dismiss();
        } else {
            SparseArray sparseArray = AbstractC4618.f12167;
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
                setOnKeyListener(new ViewOnKeyListenerC4610(this));
            }
            ArrayList arrayList = new ArrayList();
            AbstractC4620.m8664(arrayList, (ViewGroup) getPopupContentView());
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
                        editText.setOnKeyListener(new ViewOnKeyListenerC4610(this));
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

    public AbstractC9184 genAnimatorByPopupType() {
        C4616 c4616 = this.popupInfo;
        if (c4616 == null) {
            return null;
        }
        c4616.getClass();
        return null;
    }

    public int getActivityContentLeft() {
        if (!AbstractC4620.m8669(getContext())) {
            return 0;
        }
        int[] iArr = new int[2];
        AbstractC4620.m8666(this).getWindow().getDecorView().findViewById(R.id.content).getLocationInWindow(iArr);
        return iArr[0];
    }

    public View getActivityContentView() {
        return AbstractC4620.m8666(this).getWindow().getDecorView().findViewById(R.id.content);
    }

    public int getAnimationDuration() {
        if (this.popupInfo == null) {
            return 0;
        }
        if (PopupAnimation.NoAnimation == null) {
            return 1;
        }
        return AbstractC9186.f23383 + 1;
    }

    public Window getHostWindow() {
        C4616 c4616 = this.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
        }
        DialogC4615 dialogC4615 = this.dialog;
        if (dialogC4615 == null) {
            return null;
        }
        return dialogC4615.getWindow();
    }

    public int getImplLayoutId() {
        return -1;
    }

    public abstract int getInnerLayoutId();

    public List<String> getInternalFragmentNames() {
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public AbstractC3235 getLifecycle() {
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

    public AbstractC9184 getPopupAnimator() {
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
        C4616 c4616 = this.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
        }
        return AbstractC9186.f23381;
    }

    public int getStatusBarBgColor() {
        C4616 c4616 = this.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
        }
        return AbstractC9186.f23382;
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
            C9183 c9183 = new C9183(this, animationDuration, null);
            c9183.f23378 = new ArgbEvaluator();
            c9183.f23377 = shadowBgColor;
            this.shadowBgAnimator = c9183;
        }
        this.popupInfo.getClass();
        if (!this.isCreated) {
            initPopupContent();
        }
        if (!this.isCreated) {
            this.isCreated = true;
            onCreate();
            this.lifecycleRegistry.m5059(Lifecycle$Event.ON_CREATE);
            this.popupInfo.getClass();
        }
        this.handler.postDelayed(this.initTask, 10L);
    }

    public void initAnimator() {
        getPopupContentView().setAlpha(1.0f);
        AbstractC9184 abstractC9184GenAnimatorByPopupType = genAnimatorByPopupType();
        this.popupContentAnimator = abstractC9184GenAnimatorByPopupType;
        if (abstractC9184GenAnimatorByPopupType == null) {
            this.popupContentAnimator = getPopupAnimator();
        }
        if (this.popupInfo != null) {
            this.shadowBgAnimator.mo14423();
        }
        AbstractC9184 abstractC9184 = this.popupContentAnimator;
        if (abstractC9184 != null) {
            abstractC9184.mo14423();
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

    @InterfaceC3202(Lifecycle$Event.ON_DESTROY)
    public void onDestroy() {
        onDetachedFromWindow();
        DialogC4615 dialogC4615 = this.dialog;
        if (dialogC4615 != null) {
            dialogC4615.dismiss();
        }
        destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getWindowDecorView() != null) {
            Window hostWindow = getHostWindow();
            SparseArray sparseArray = AbstractC4618.f12167;
            View viewFindViewById = hostWindow.findViewById(R.id.content);
            if (viewFindViewById != null) {
                SparseArray sparseArray2 = AbstractC4618.f12167;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) sparseArray2.get(getId());
                if (onGlobalLayoutListener != null) {
                    viewFindViewById.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    sparseArray2.remove(getId());
                }
            }
        }
        this.handler.removeCallbacksAndMessages(null);
        C4616 c4616 = this.popupInfo;
        if (c4616 != null && c4616.f12159) {
            destroy();
        }
        if (getContext() != null && (getContext() instanceof FragmentActivity)) {
            ((FragmentActivity) getContext()).getLifecycle().mo5062(this);
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
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4616 c4616;
        Rect rect = new Rect();
        getPopupImplView().getGlobalVisibleRect(rect);
        if (!AbstractC4620.m8667(motionEvent.getX(), motionEvent.getY(), rect)) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        C4616 c46162 = this.popupInfo;
                        if (c46162 != null) {
                            c46162.getClass();
                            dismiss();
                            this.popupInfo.getClass();
                            return true;
                        }
                    }
                }
                float fSqrt = (float) Math.sqrt(Math.pow(motionEvent.getY() - this.f294y, 2.0d) + Math.pow(motionEvent.getX() - this.f293x, 2.0d));
                passTouchThrough(motionEvent);
                if (fSqrt < this.touchSlop && (c4616 = this.popupInfo) != null) {
                    c4616.getClass();
                    dismiss();
                }
                this.f293x = 0.0f;
                this.f294y = 0.0f;
                return true;
            }
            this.f293x = motionEvent.getX();
            this.f294y = motionEvent.getY();
            passTouchThrough(motionEvent);
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC3120
    public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return processKeyEvent(keyEvent.getKeyCode(), keyEvent);
    }

    public void passTouchThrough(MotionEvent motionEvent) {
        C4616 c4616 = this.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
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

    public AbstractC4608 show() {
        Activity activityM8666 = AbstractC4620.m8666(this);
        if (activityM8666 != null && !activityM8666.isFinishing()) {
            if (this.popupInfo == null) {
                C6755.m11869("popupInfo is null, if your popup object is used once, do not set isDestroyOnDismiss(true) !");
                return null;
            }
            PopupStatus popupStatus = this.popupStatus;
            PopupStatus popupStatus2 = PopupStatus.Showing;
            if (popupStatus != popupStatus2 && popupStatus != PopupStatus.Dismissing) {
                this.popupStatus = popupStatus2;
                DialogC4615 dialogC4615 = this.dialog;
                if (dialogC4615 == null || !dialogC4615.isShowing()) {
                    if (this.popupInfo == null) {
                        C6755.m11869("如果弹窗对象是复用的，则不要设置isDestroyOnDismiss(true)");
                        return null;
                    }
                    if (getContext() instanceof FragmentActivity) {
                        ((FragmentActivity) getContext()).getLifecycle().mo5063(this);
                    }
                    if (getLayoutParams() == null) {
                        View decorView = AbstractC4620.m8666(this).getWindow().getDecorView();
                        View viewFindViewById = decorView.findViewById(R.id.navigationBarBackground);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getActivityContentView().getMeasuredWidth(), decorView.getMeasuredHeight() - ((!AbstractC4620.m8669(getContext()) || (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) ? viewFindViewById != null ? (!AbstractC4620.m8669(getContext()) || (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) ? viewFindViewById.getMeasuredHeight() : viewFindViewById.getMeasuredWidth() : 0 : 0));
                        if (AbstractC4620.m8669(getContext())) {
                            marginLayoutParams.leftMargin = getActivityContentLeft();
                        }
                        setLayoutParams(marginLayoutParams);
                    }
                    this.popupInfo.getClass();
                    if (this.dialog == null) {
                        DialogC4615 dialogC46152 = new DialogC4615(getContext(), C0328R.style._XPopup_TransparentDialog);
                        if (getParent() != null) {
                            ((ViewGroup) getParent()).removeView(this);
                        }
                        dialogC46152.f12158 = this;
                        this.dialog = dialogC46152;
                    }
                    Activity activityM86662 = AbstractC4620.m8666(this);
                    if (activityM86662 != null && !activityM86662.isFinishing() && !this.dialog.isShowing()) {
                        this.dialog.show();
                    }
                    Window hostWindow = getHostWindow();
                    C4607 c4607 = new C4607(this);
                    SparseArray sparseArray = AbstractC4618.f12167;
                    if ((hostWindow.getAttributes().flags & 512) != 0) {
                        hostWindow.clearFlags(512);
                    }
                    FrameLayout frameLayout = (FrameLayout) hostWindow.findViewById(R.id.content);
                    ViewTreeObserverOnGlobalLayoutListenerC4619 viewTreeObserverOnGlobalLayoutListenerC4619 = new ViewTreeObserverOnGlobalLayoutListenerC4619(hostWindow, new int[]{AbstractC4618.m8660(hostWindow)}, c4607);
                    frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4619);
                    AbstractC4618.f12167.append(getId(), viewTreeObserverOnGlobalLayoutListenerC4619);
                    init();
                    return this;
                }
            }
        }
        return this;
    }

    public void showSoftInput(View view) {
        if (this.popupInfo != null) {
            RunnableC4609 runnableC4609 = this.showSoftInputTask;
            if (runnableC4609 == null) {
                RunnableC4609 runnableC46092 = new RunnableC4609();
                runnableC46092.f12151 = view;
                this.showSoftInputTask = runnableC46092;
            } else {
                this.handler.removeCallbacks(runnableC4609);
            }
            this.handler.postDelayed(this.showSoftInputTask, 10L);
        }
    }

    public void smartDismiss() {
        this.handler.post(new RunnableC4611(this, 0));
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
            AbstractC3146 supportFragmentManager = ((FragmentActivity) getContext()).getSupportFragmentManager();
            List listM1524 = supportFragmentManager.f7129.m1524();
            List<String> internalFragmentNames = getInternalFragmentNames();
            if (listM1524 == null || listM1524.size() <= 0 || internalFragmentNames == null) {
                return;
            }
            for (int i = 0; i < listM1524.size(); i++) {
                if (internalFragmentNames.contains(((AbstractComponentCallbacksC3171) listM1524.get(i)).getClass().getSimpleName())) {
                    C3165 c3165 = new C3165(supportFragmentManager);
                    c3165.m4992((AbstractComponentCallbacksC3171) listM1524.get(i));
                    c3165.m4988(true);
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
