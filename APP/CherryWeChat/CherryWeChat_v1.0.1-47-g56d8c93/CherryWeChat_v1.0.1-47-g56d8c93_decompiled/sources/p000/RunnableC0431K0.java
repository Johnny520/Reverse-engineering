package p000;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.gyf.immersionbar.OSUtils;
import com.gyf.immersionbar.RunnableC1286a;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.WeakHashMap;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: K0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0431K0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1418a;

    /* JADX INFO: renamed from: b */
    public Object f1419b;

    public /* synthetic */ RunnableC0431K0(int i, Object obj) {
        this.f1418a = i;
        this.f1419b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m888a() {
        RunnableC1286a runnableC1286a = (RunnableC1286a) this.f1419b;
        if (runnableC1286a == null || !runnableC1286a.f4719l) {
            return;
        }
        runnableC1286a.f4715h.getClass();
    }

    /* JADX INFO: renamed from: b */
    public void m889b() {
        RunnableC1286a runnableC1286a = (RunnableC1286a) this.f1419b;
        if (runnableC1286a != null) {
            runnableC1286a.m2518h();
            if (OSUtils.isEMUI3_x() && runnableC1286a.f4719l && !runnableC1286a.f4713f && runnableC1286a.f4715h.f8077e) {
                runnableC1286a.m2514d();
            } else {
                runnableC1286a.m2513c();
            }
            m888a();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m890c() {
        RunnableC1286a runnableC1286a;
        RunnableC1286a runnableC1286a2 = (RunnableC1286a) this.f1419b;
        if (runnableC1286a2 != null) {
            if (runnableC1286a2.f4708a != null) {
                int i = C1052Ye.f3352d;
                ArrayList arrayList = AbstractC1009Xe.f3214a.f3353a;
                if (arrayList != null) {
                    arrayList.remove(runnableC1286a2);
                }
                int i2 = C0121Cs.f290a;
                C0121Cs c0121Cs = AbstractC0078Bs.f187a;
                runnableC1286a2.f4715h.getClass();
                c0121Cs.getClass();
            }
            if (runnableC1286a2.f4714g && (runnableC1286a = runnableC1286a2.f4712e) != null) {
                runnableC1286a.f4715h.getClass();
            }
            runnableC1286a2.f4719l = false;
            this.f1419b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m891d() {
        RunnableC1286a runnableC1286a = (RunnableC1286a) this.f1419b;
        if (runnableC1286a != null) {
            runnableC1286a.m2518h();
            if (runnableC1286a.f4713f || !runnableC1286a.f4719l || runnableC1286a.f4715h == null) {
                return;
            }
            if (OSUtils.isEMUI3_x() && runnableC1286a.f4715h.f8078f) {
                runnableC1286a.m2514d();
            } else {
                runnableC1286a.f4715h.getClass();
            }
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Activity activity;
        int iM1741j;
        TextView textView = null;
        int iM1741j2 = 0;
        switch (this.f1418a) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.f1419b).run();
                return;
            case 1:
                C2428qs c2428qs = (C2428qs) this.f1419b;
                c2428qs.getClass();
                while (true) {
                    try {
                        c2428qs.m4874l((C0517M0) ((ReferenceQueue) c2428qs.f8522c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewOnTouchListenerC0504Lo viewOnTouchListenerC0504Lo = (ViewOnTouchListenerC0504Lo) this.f1419b;
                C0365Ie c0365Ie = viewOnTouchListenerC0504Lo.f1642c;
                C1203b5 c1203b5 = viewOnTouchListenerC0504Lo.f1640a;
                if (viewOnTouchListenerC0504Lo.f1654o) {
                    if (viewOnTouchListenerC0504Lo.f1652m) {
                        viewOnTouchListenerC0504Lo.f1652m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c1203b5.f4120e = jCurrentAnimationTimeMillis;
                        c1203b5.f4122g = -1L;
                        c1203b5.f4121f = jCurrentAnimationTimeMillis;
                        c1203b5.f4123h = 0.5f;
                    }
                    if ((c1203b5.f4122g > 0 && AnimationUtils.currentAnimationTimeMillis() > c1203b5.f4122g + ((long) c1203b5.f4124i)) || !viewOnTouchListenerC0504Lo.m988e()) {
                        viewOnTouchListenerC0504Lo.f1654o = false;
                        return;
                    }
                    if (viewOnTouchListenerC0504Lo.f1653n) {
                        viewOnTouchListenerC0504Lo.f1653n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c0365Ie.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c1203b5.f4121f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM2323a = c1203b5.m2323a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c1203b5.f4121f;
                    c1203b5.f4121f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0504Lo.f1656q.scrollListBy((int) (j * ((fM2323a * 4.0f) + ((-4.0f) * fM2323a * fM2323a)) * c1203b5.f4119d));
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    c0365Ie.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                C1204b6 c1204b6 = (C1204b6) this.f1419b;
                c1204b6.f4127c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1204b6.f4129e;
                C2228mE c2228mE = bottomSheetBehavior.f4423O;
                if (c2228mE != null && c2228mE.m4491f()) {
                    c1204b6.m2324a(c1204b6.f4126b);
                    return;
                } else {
                    if (bottomSheetBehavior.f4422N == 2) {
                        bottomSheetBehavior.m2431C(c1204b6.f4126b);
                        return;
                    }
                    return;
                }
            case 4:
                DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd = (DialogInterfaceOnCancelListenerC0450Kd) this.f1419b;
                dialogInterfaceOnCancelListenerC0450Kd.f1471U.onDismiss(dialogInterfaceOnCancelListenerC0450Kd.f1479c0);
                return;
            case 5:
                C0365Ie c0365Ie2 = (C0365Ie) this.f1419b;
                c0365Ie2.f1246l = null;
                c0365Ie2.drawableStateChanged();
                return;
            case 6:
                C1545ih c1545ih = (C1545ih) this.f1419b;
                ValueAnimator valueAnimator = c1545ih.f5495z;
                int i = c1545ih.f5468A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c1545ih.f5468A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.f1419b;
                if (abstractComponentCallbacksC1503hi.f5299H != null) {
                    abstractComponentCallbacksC1503hi.m2868b().getClass();
                    return;
                }
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                ((AbstractC2805zi) this.f1419b).m5427y(true);
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                RunnableC1286a runnableC1286a = (RunnableC1286a) this.f1419b;
                if (runnableC1286a == null || (activity = runnableC1286a.f4708a) == null) {
                    return;
                }
                new C2262n5(activity);
                throw null;
            case 10:
                C0973Wl c0973Wl = (C0973Wl) this.f1419b;
                if (c0973Wl.f3031c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = c0973Wl.f3028A;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    AbstractC1160i layoutManager = c0973Wl.f3045q.getLayoutManager();
                    if (c0973Wl.f3054z == null) {
                        c0973Wl.f3054z = new Rect();
                    }
                    layoutManager.calculateItemDecorationsForChild(c0973Wl.f3031c.itemView, c0973Wl.f3054z);
                    if (layoutManager.canScrollHorizontally()) {
                        int i2 = (int) (c0973Wl.f3038j + c0973Wl.f3036h);
                        int paddingLeft = (i2 - c0973Wl.f3054z.left) - c0973Wl.f3045q.getPaddingLeft();
                        float f = c0973Wl.f3036h;
                        iM1741j = ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c0973Wl.f3031c.itemView.getWidth() + i2) + c0973Wl.f3054z.right) - (c0973Wl.f3045q.getWidth() - c0973Wl.f3045q.getPaddingRight())) <= 0)) ? 0 : paddingLeft;
                    }
                    if (layoutManager.canScrollVertically()) {
                        int i3 = (int) (c0973Wl.f3039k + c0973Wl.f3037i);
                        int paddingTop = (i3 - c0973Wl.f3054z.top) - c0973Wl.f3045q.getPaddingTop();
                        float f2 = c0973Wl.f3037i;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((c0973Wl.f3031c.itemView.getHeight() + i3) + c0973Wl.f3054z.bottom) - (c0973Wl.f3045q.getHeight() - c0973Wl.f3045q.getPaddingBottom())) > 0)) {
                            iM1741j2 = paddingTop;
                        }
                    }
                    if (iM1741j != 0) {
                        AbstractC0887Ul abstractC0887Ul = c0973Wl.f3041m;
                        RecyclerView recyclerView = c0973Wl.f3045q;
                        int width = c0973Wl.f3031c.itemView.getWidth();
                        c0973Wl.f3045q.getWidth();
                        iM1741j = abstractC0887Ul.m1741j(recyclerView, width, iM1741j, j3);
                    }
                    int i4 = iM1741j;
                    if (iM1741j2 != 0) {
                        AbstractC0887Ul abstractC0887Ul2 = c0973Wl.f3041m;
                        RecyclerView recyclerView2 = c0973Wl.f3045q;
                        int height = c0973Wl.f3031c.itemView.getHeight();
                        c0973Wl.f3045q.getHeight();
                        iM1741j2 = abstractC0887Ul2.m1741j(recyclerView2, height, iM1741j2, j3);
                    }
                    if (i4 == 0 && iM1741j2 == 0) {
                        c0973Wl.f3028A = Long.MIN_VALUE;
                        return;
                    }
                    if (c0973Wl.f3028A == Long.MIN_VALUE) {
                        c0973Wl.f3028A = jCurrentTimeMillis;
                    }
                    c0973Wl.f3045q.scrollBy(i4, iM1741j2);
                    AbstractC1166o abstractC1166o = c0973Wl.f3031c;
                    if (abstractC1166o != null) {
                        c0973Wl.m1857l(abstractC1166o);
                    }
                    c0973Wl.f3045q.removeCallbacks(c0973Wl.f3046r);
                    RecyclerView recyclerView3 = c0973Wl.f3045q;
                    WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                C0762Rp c0762Rp = (C0762Rp) this.f1419b;
                CherryDevServer cherryDevServer = CherryDevServer.INSTANCE;
                if (cherryDevServer.isRunning()) {
                    TextView textView2 = c0762Rp.f2419k;
                    if (textView2 == null) {
                        AbstractC0295Gu.m625r(-129063767242805L);
                    } else {
                        textView = textView2;
                    }
                    textView.setText(cherryDevServer.getConnectionCount() + AbstractC0295Gu.m625r(-129141076654133L));
                    Handler handler = c0762Rp.f2422n;
                    if (handler != null) {
                        handler.postDelayed(this, 2000L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ComponentCallbacks2C1473gw componentCallbacks2C1473gw = (ComponentCallbacks2C1473gw) this.f1419b;
                componentCallbacks2C1473gw.f5218c.mo1508l(componentCallbacks2C1473gw);
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f1419b;
                if (searchView$SearchAutoComplete.f3801f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f3801f = false;
                    return;
                }
                return;
            case 14:
                ((StaggeredGridLayoutManager) this.f1419b).m2193d();
                return;
            case 15:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1419b).f4621c.f3612g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 16:
                ((Toolbar) this.f1419b).m2117u();
                return;
            case 17:
                C2577uB c2577uB = (C2577uB) this.f1419b;
                Window.Callback callback = c2577uB.f8930b;
                Menu menuM5081q = c2577uB.m5081q();
                MenuC2204lr menuC2204lr = menuM5081q instanceof MenuC2204lr ? (MenuC2204lr) menuM5081q : null;
                if (menuC2204lr != null) {
                    menuC2204lr.m4442w();
                }
                try {
                    menuM5081q.clear();
                    if (!callback.onCreatePanelMenu(0, menuM5081q) || !callback.onPreparePanel(0, null, menuM5081q)) {
                        menuM5081q.clear();
                        break;
                    }
                    if (menuC2204lr != null) {
                        menuC2204lr.m4441v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menuC2204lr != null) {
                        menuC2204lr.m4441v();
                    }
                    throw th;
                }
            case 18:
                ((C2228mE) this.f1419b).m4498m(0);
                return;
            default:
                C0230FE c0230fe = (C0230FE) this.f1419b;
                c0230fe.setScrollState(0);
                c0230fe.m466p();
                return;
        }
    }

    public RunnableC0431K0(Activity activity) {
        this.f1418a = 9;
        if (activity == null || ((RunnableC1286a) this.f1419b) != null) {
            return;
        }
        this.f1419b = new RunnableC1286a(activity);
    }
}
