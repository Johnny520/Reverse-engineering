package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C1024;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.platform.C2743;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.core.view.AbstractC3103;
import androidx.core.widget.C3128;
import androidx.core.widget.ViewOnTouchListenerC3126;
import androidx.lifecycle.Lifecycle$State;
import bsh.C3466;
import bsh.classpath.C3436;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.bumptech.glide.load.engine.C3828;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.C4597;
import com.kongzue.dialogx.util.RunnableC4598;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.lxj.xpopup.core.AbstractC4608;
import com.lxj.xpopup.core.AbstractC4613;
import com.lxj.xpopup.enums.PopupPosition;
import com.lxj.xpopup.util.AbstractC4620;
import com.lxj.xpopup.widget.LoadingView;
import com.lxj.xpopup.widget.PopupDrawerLayout;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5227;
import p026.AbstractC7017;
import p031.AbstractC7065;
import p031.C7063;
import p031.C7064;
import p038.AbstractC7125;
import p038.AbstractC7135;
import p038.DialogInterfaceOnDismissListenerC7128;
import p038.ViewOnClickListenerC7127;
import p044.DialogC7147;
import p049.AbstractC7166;
import p060.C7285;
import p166.AbstractC8412;
import p185.C8546;
import p206.MenuC8631;
import p267.AbstractC9004;
import p273.C9027;
import p273.C9029;
import p273.C9034;
import p273.C9038;
import p273.C9041;
import p273.C9046;
import p273.C9050;
import p273.C9062;
import p273.C9065;
import p273.RunnableC9028;
import p273.RunnableC9033;
import p273.RunnableC9042;
import p273.RunnableC9059;
import p402.C9904;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0909 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f481;

    public /* synthetic */ RunnableC0909(Object obj, int i) {
        this.f481 = i;
        this.f480 = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0227 A[Catch: Exception -> 0x028a, TryCatch #3 {Exception -> 0x028a, blocks: (B:79:0x01ad, B:81:0x01b3, B:83:0x01cf, B:85:0x01e7, B:93:0x0222, B:91:0x0207, B:92:0x0221, B:95:0x0227, B:96:0x027e, B:97:0x0289, B:82:0x01b6, B:87:0x01ef), top: B:288:0x01ad, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027e A[Catch: Exception -> 0x028a, TryCatch #3 {Exception -> 0x028a, blocks: (B:79:0x01ad, B:81:0x01b3, B:83:0x01cf, B:85:0x01e7, B:93:0x0222, B:91:0x0207, B:92:0x0221, B:95:0x0227, B:96:0x027e, B:97:0x0289, B:82:0x01b6, B:87:0x01ef), top: B:288:0x01ad, inners: #6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int actionMasked;
        AbstractC7065 abstractC7065M12270;
        long jNanoTime;
        Activity activity;
        int i = 5;
        EditText editText = null;
        ViewGroup viewGroup = null;
        int i2 = 1;
        switch (this.f481) {
            case 0:
                C0907 c0907 = (C0907) this.f480;
                Window.Callback callback = c0907.f471;
                Menu menuM736 = c0907.m736();
                MenuC8631 menuC8631 = menuM736 instanceof MenuC8631 ? (MenuC8631) menuM736 : null;
                if (menuC8631 != null) {
                    menuC8631.m13718();
                }
                try {
                    menuM736.clear();
                    if (!callback.onCreatePanelMenu(0, menuM736) || !callback.onPreparePanel(0, null, menuM736)) {
                        menuM736.clear();
                        break;
                    }
                    if (menuC8631 != null) {
                        menuC8631.m13720();
                        return;
                    }
                    return;
                } finally {
                    if (menuC8631 != null) {
                        menuC8631.m13720();
                    }
                }
            case 1:
                C1024 c1024 = (C1024) this.f480;
                c1024.f1037 = null;
                c1024.drawableStateChanged();
                return;
            case 2:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f480;
                if (searchView$SearchAutoComplete.f822) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f822 = false;
                    return;
                }
                return;
            case 3:
                ((Toolbar) this.f480).m1061();
                return;
            case 4:
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) this.f480;
                viewTreeObserverOnGlobalLayoutListenerC2719.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                viewTreeObserverOnGlobalLayoutListenerC2719.m4092(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, viewTreeObserverOnGlobalLayoutListenerC2719.f5812, false);
                return;
            case 5:
                ViewOnTouchListenerC3126 viewOnTouchListenerC3126 = (ViewOnTouchListenerC3126) this.f480;
                C1024 c10242 = viewOnTouchListenerC3126.f7026;
                C3128 c3128 = viewOnTouchListenerC3126.f7027;
                if (viewOnTouchListenerC3126.f7011) {
                    if (viewOnTouchListenerC3126.f7013) {
                        viewOnTouchListenerC3126.f7013 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c3128.f7029 = jCurrentAnimationTimeMillis;
                        c3128.f7035 = -1L;
                        c3128.f7028 = jCurrentAnimationTimeMillis;
                        c3128.f7034 = 0.5f;
                    }
                    if ((c3128.f7035 > 0 && AnimationUtils.currentAnimationTimeMillis() > c3128.f7035 + ((long) c3128.f7036)) || !viewOnTouchListenerC3126.m4867()) {
                        viewOnTouchListenerC3126.f7011 = false;
                        return;
                    }
                    if (viewOnTouchListenerC3126.f7012) {
                        viewOnTouchListenerC3126.f7012 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c10242.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c3128.f7028 == 0) {
                        C3466.m5899("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM4874 = c3128.m4874(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c3128.f7028;
                    c3128.f7028 = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC3126.f7017.scrollListBy((int) (j * ((fM4874 * 4.0f) + ((-4.0f) * fM4874 * fM4874)) * c3128.f7030));
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    c10242.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ComponentCallbacks2C3896 componentCallbacks2C3896 = (ComponentCallbacks2C3896) this.f480;
                componentCallbacks2C3896.f10146.mo12836(componentCallbacks2C3896);
                return;
            case 7:
                Process.setThreadPriority(10);
                ((Runnable) this.f480).run();
                return;
            case 8:
                C1171 c1171 = (C1171) this.f480;
                while (true) {
                    try {
                        c1171.m1529((C3828) ((ReferenceQueue) c1171.f1439).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 9:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f480).f10986.f11122;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 10:
                C4597 c4597 = (C4597) this.f480;
                while (c4597.f12060) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c4597.f12061;
                    long j2 = c4597.f12062;
                    if (jCurrentTimeMillis < j2) {
                        float interpolation = jCurrentTimeMillis / j2;
                        Interpolator interpolator = c4597.f12058;
                        if (interpolator != null) {
                            interpolation = interpolator.getInterpolation(interpolation);
                        }
                        float f = c4597.f12065;
                        float fM706 = AbstractC0900.m706(c4597.f12064, f, interpolation, f);
                        if (c4597.f12059 != null) {
                            if (c4597.f12063 == null) {
                                c4597.f12063 = new Handler(Looper.getMainLooper());
                            }
                            c4597.f12063.post(new RunnableC4598(this, fM706));
                        }
                    } else {
                        c4597.f12060 = false;
                        int i3 = c4597.f12067;
                        if (i3 == -1 || c4597.f12068 < i3) {
                            c4597.f12068++;
                            c4597.f12061 = System.currentTimeMillis();
                            c4597.f12060 = true;
                        }
                    }
                    try {
                        Thread.sleep(c4597.f12066);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return;
            case 11:
                int i4 = AbstractC4620.f12179;
                AbstractC4608 abstractC4608 = (AbstractC4608) this.f480;
                if (abstractC4608.popupInfo != null) {
                    ArrayList arrayList = new ArrayList();
                    AbstractC4620.m8664(arrayList, abstractC4608);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            EditText editText2 = (EditText) it.next();
                            if (editText2.isFocused()) {
                                editText = editText2;
                            }
                        }
                    }
                    int height = abstractC4608.getPopupContentView().getHeight();
                    int width = abstractC4608.getPopupContentView().getWidth();
                    if (abstractC4608.getPopupImplView() != null) {
                        Math.min(height, abstractC4608.getPopupImplView().getMeasuredHeight());
                        Math.min(width, abstractC4608.getPopupImplView().getMeasuredWidth());
                    }
                    abstractC4608.getMeasuredHeight();
                    if (editText != null) {
                        editText.getLocationInWindow(new int[2]);
                        editText.getMeasuredHeight();
                    }
                    abstractC4608.getPopupContentView().animate().translationY(-(abstractC4608 instanceof AbstractC4613 ? i4 : 0)).setDuration(150L).setInterpolator(new LinearInterpolator()).start();
                    return;
                }
                return;
            case 12:
                LoadingView loadingView = (LoadingView) this.f480;
                loadingView.f12251++;
                loadingView.postInvalidate(0, 0, loadingView.getMeasuredWidth(), loadingView.getMeasuredHeight());
                loadingView.postDelayed(loadingView.f12238, 80L);
                return;
            case 13:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) this.f480;
                C8546 c8546 = popupDrawerLayout.f12268;
                OverScroller overScroller = c8546.f21291;
                c8546.m13582();
                if (c8546.f21281 == 2) {
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    overScroller.abortAnimation();
                    int currX2 = overScroller.getCurrX();
                    int currY2 = overScroller.getCurrY();
                    c8546.f21288.mo7229(c8546.f21289, currX2, currY2, currX2 - currX, currY2 - currY);
                }
                c8546.f21284 = C8546.f21275;
                c8546.m13584(0);
                View view = popupDrawerLayout.f12271;
                c8546.m13587(view, popupDrawerLayout.f12275 == PopupPosition.Left ? -view.getMeasuredWidth() : popupDrawerLayout.getMeasuredWidth(), 0);
                WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                popupDrawerLayout.postInvalidateOnAnimation();
                return;
            case 14:
                C7063 c7063 = (C7063) this.f480;
                synchronized (c7063) {
                    c7063.f17528++;
                    abstractC7065M12270 = c7063.m12270();
                }
                if (abstractC7065M12270 == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    AbstractC7065 abstractC7065 = abstractC7065M12270;
                    try {
                        threadCurrentThread.setName(abstractC7065.f17540);
                        Logger logger = ((C7063) this.f480).f17525;
                        C7064 c7064 = abstractC7065.f17538;
                        c7064.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            AbstractC9004.m14189(logger, abstractC7065, c7064, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jMo12212 = abstractC7065.mo12212();
                            if (zIsLoggable) {
                                AbstractC9004.m14189(logger, abstractC7065, c7064, "finished run in " + AbstractC9004.m14202(System.nanoTime() - jNanoTime));
                            }
                            C7063 c70632 = (C7063) this.f480;
                            synchronized (c70632) {
                                C7063.m12266(c70632, abstractC7065, jMo12212, true);
                                abstractC7065M12270 = c70632.m12270();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                AbstractC9004.m14189(logger, abstractC7065, c7064, "failed a run in " + AbstractC9004.m14202(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            C7063 c70633 = (C7063) this.f480;
                            synchronized (c70633) {
                                C7063.m12266(c70633, abstractC7065, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } finally {
                            threadCurrentThread.setName(name);
                        }
                    }
                } while (abstractC7065M12270 != null);
                threadCurrentThread.setName(name);
                return;
            case 15:
                Activity activity2 = ((ViewOnClickListenerC7127) this.f480).f17737;
                DialogC7147 dialogC7147 = new DialogC7147(activity2);
                int color = activity2.getColor(C0328R.color.____res_0x2406048d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(color);
                if (Build.VERSION.SDK_INT >= 29) {
                    gradientDrawable.setCornerRadius(0.0f);
                }
                gradientDrawable.setAlpha(200);
                gradientDrawable.setCornerRadius(40.0f);
                dialogC7147.getWindow().setBackgroundDrawable(gradientDrawable);
                dialogC7147.setOnDismissListener(new DialogInterfaceOnDismissListenerC7128(i));
                dialogC7147.setContentView(AbstractC7135.m12386(dialogC7147, activity2, AbstractC7135.f17761));
                dialogC7147.show();
                AbstractC7125.f17730.setVisibility(8);
                return;
            case 16:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) this.f480;
                try {
                    Object obj = methodHookParam.thisObject;
                    if (obj instanceof Activity) {
                        activity = (Activity) obj;
                    } else {
                        Method declaredMethod = obj.getClass().getDeclaredMethod("getActivity", null);
                        declaredMethod.setAccessible(true);
                        activity = (Activity) declaredMethod.invoke(methodHookParam.thisObject, null);
                    }
                    Class<?> clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.widget.FormSimpleItem");
                    for (Field field : methodHookParam.thisObject.getClass().getDeclaredFields()) {
                        if (field.getType() == clsM12425) {
                            try {
                                field.setAccessible(true);
                                viewGroup = (ViewGroup) ((View) field.get(methodHookParam.thisObject)).getParent();
                                if (viewGroup instanceof LinearLayout) {
                                    if (viewGroup != null) {
                                        throw new RuntimeException("没有获取到父布局");
                                    }
                                    View view2 = (View) clsM12425.getConstructor(Context.class).newInstance(activity);
                                    clsM12425.getDeclaredMethod("setLeftText", CharSequence.class).invoke(view2, activity.getString(C0328R.string.app_name));
                                    clsM12425.getDeclaredMethod("setRightText", CharSequence.class).invoke(view2, ">");
                                    view2.setOnClickListener(new ViewOnClickListenerC7127(activity, i2));
                                    viewGroup.addView(view2, 0);
                                    return;
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException("反射获取布局异常 \n" + e2);
                            }
                        }
                    }
                    if (viewGroup != null) {
                    }
                } catch (Exception e3) {
                    C3466.m5899("设置入口项没有成功注入".concat(AbstractC7017.m12161(e3)));
                    return;
                }
                break;
            case 17:
                ((C7285) this.f480).invalidate();
                return;
            case 18:
                ((AbstractC8412) this.f480).setScrollState(0);
                return;
            case 19:
                ((C8546) this.f480).m13584(0);
                return;
            case 20:
                C1171 c11712 = ((RunnableC9059) this.f480).f23056;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c11712.f1440;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC4570.m8590(((C9062) c11712.f1438).m8614());
                return;
            case 21:
                C9038 c9038 = (C9038) ((C9065) this.f480).f23077;
                EditText editText3 = c9038.f22990;
                if (editText3 == null) {
                    return;
                }
                editText3.requestFocus();
                c9038.f22990.setFocusableInTouchMode(true);
                c9038.f22985.m8613(c9038.f22990, true);
                EditText editText4 = c9038.f22990;
                editText4.setSelection(editText4.getText().length());
                c9038.f22985.getClass();
                return;
            case 22:
                C9038 c90382 = (C9038) this.f480;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c90382.f22980;
                if (dialogXBaseRelativeLayout2 != null) {
                    dialogXBaseRelativeLayout2.setVisibility(8);
                }
                AbstractC4570.m8590(c90382.f22985.m8614());
                return;
            case 23:
                ((C9034) this.f480).mo14280();
                return;
            case 24:
                C9041 c9041 = (C9041) ((RunnableC9042) this.f480).f23008.f7808;
                ArrayList arrayList2 = C9041.f22994;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    return;
                }
                if (c9041.m8614() != null) {
                    c9041.m8614().setVisibility(8);
                }
                new CopyOnWriteArrayList(C9041.f22994).removeIf(new C3436(i));
                AbstractC4570.m8590(c9041.m8614());
                return;
            case 25:
                C9029 c9029 = (C9029) ((C9065) this.f480).f23077;
                if (c9029.f22937.m8617() == null) {
                    return;
                }
                C9027 c9027 = c9029.f22937;
                if (c9027.f22917 == null) {
                    c9027.f22917 = new C9046(c9029, i);
                }
                c9027.f22917.m14301(c9027);
                c9029.f22937.mo8602();
                new C9050(i).mo8625(c9029.f22937);
                c9029.f22937.m8605(Lifecycle$State.RESUMED);
                return;
            case 26:
                C9029 c90292 = ((RunnableC9033) this.f480).f22943;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout3 = c90292.f22932;
                if (dialogXBaseRelativeLayout3 != null) {
                    dialogXBaseRelativeLayout3.setVisibility(8);
                }
                WeakReference weakReference = c90292.f22937.f22922;
                AbstractC4570.m8590(weakReference != null ? (View) weakReference.get() : null);
                return;
            case 27:
                C9029 c90293 = (C9029) ((RunnableC9028) this.f480).f22926.f11953;
                if (c90293.f22937.f22923 > -1) {
                    c90293.m14276(null);
                    return;
                }
                return;
            case 28:
                C2743 c2743 = (C2743) this.f480;
                c2743.f5971 = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c2743.f5968;
                C8546 c85462 = bottomSheetBehavior.f10368;
                if (c85462 != null && c85462.m13577(true)) {
                    c2743.m4166(c2743.f5970);
                    return;
                } else {
                    if (bottomSheetBehavior.f10372 == 2) {
                        bottomSheetBehavior.m7583(c2743.f5970);
                        return;
                    }
                    return;
                }
            default:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C9904 c9904 = (C9904) this.f480;
                long j3 = 5 - ((jCurrentTimeMillis2 - c9904.f25783) / 1000);
                TextView textView = c9904.f25784;
                if (j3 <= 0) {
                    if (textView == null) {
                        AbstractC5227.m9467("btnMarkAllRead");
                        throw null;
                    }
                    textView.setText("全部已读");
                    c9904.f25781 = null;
                    return;
                }
                if (textView == null) {
                    AbstractC5227.m9467("btnMarkAllRead");
                    throw null;
                }
                textView.setText("全部已读 (" + j3 + "s)");
                c9904.f25780.postDelayed(this, 1000L);
                return;
        }
    }
}
