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

/* JADX INFO: renamed from: K0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0431K0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1418a;

    /* JADX INFO: renamed from: b */
    public Object f1419b;

    public /* synthetic */ RunnableC0431K0(int r1, Object r2) {
        this.f1418a = r1;
        this.f1419b = r2;
    }

    /* JADX INFO: renamed from: a */
    public void m888a() {
        RunnableC1286a r0 = (RunnableC1286a) this.f1419b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f4719l == false) goto L9;
        r0.f4715h.getClass();
        return;
    }

    /* JADX INFO: renamed from: b */
    public void m889b() {
        RunnableC1286a r0 = (RunnableC1286a) this.f1419b;
        if (r0 == null) goto L17;
        r0.m2518h();
        if (OSUtils.isEMUI3_x() == true) goto L8;
        r0.m2513c();
    L15:
        m888a();
        return;
    L8:
        if (r0.f4719l == true) goto L10;
    L14:
        r0.m2513c();
        goto L15
    L10:
        if (r0.f4713f == true) goto L14;
        if (r0.f4715h.f8077e == false) goto L14;
        r0.m2514d();
        goto L15
    }

    /* JADX INFO: renamed from: c */
    public void m890c() {
        RunnableC1286a r0 = (RunnableC1286a) this.f1419b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f4708a == null) goto L12;
        int r1 = C1052Ye.f3352d;
        ArrayList r12 = AbstractC1009Xe.f3214a.f3353a;
        if (r12 == null) goto L10;
        r12.remove(r0);
    L10:
        int r13 = C0121Cs.f290a;
        C0121Cs r14 = AbstractC0078Bs.f187a;
        r0.f4715h.getClass();
        r14.getClass();
    L12:
        if (r0.f4714g == false) goto L16;
        RunnableC1286a r15 = r0.f4712e;
        if (r15 == null) goto L16;
        r15.f4715h.getClass();
    L16:
        r0.f4719l = false;
        this.f1419b = null;
    }

    /* JADX INFO: renamed from: d */
    public void m891d() {
        RunnableC1286a r0 = (RunnableC1286a) this.f1419b;
        if (r0 == null) goto L18;
        r0.m2518h();
        if (r0.f4713f == false) goto L7;
        return;
    L7:
        if (r0.f4719l == true) goto L9;
        return;
    L9:
        if (r0.f4715h != null) goto L11;
        return;
    L11:
        if (OSUtils.isEMUI3_x() == true) goto L13;
    L16:
        r0.f4715h.getClass();
        return;
    L13:
        if (r0.f4715h.f8078f == false) goto L16;
        r0.m2514d();
        return;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        long r2 = 0;
        TextView r7 = null;
        int r8 = 0;
        switch(this.f1418a) {
            case 0: goto L161;
            case 1: goto L157;
            case 2: goto L134;
            case 3: goto L125;
            case 4: goto L123;
            case 5: goto L121;
            case 6: goto L114;
            case 7: goto L110;
            case 8: goto L108;
            case 9: goto L100;
            case 10: goto L50;
            case 11: goto L40;
            case 12: goto L38;
            case 13: goto L34;
            case 14: goto L32;
            case 15: goto L30;
            case 16: goto L28;
            case 17: goto L8;
            case 18: goto L6;
            default: goto L4;
        };
    L4:
        C0230FE r0 = (C0230FE) this.f1419b;
        r0.setScrollState(0);
        r0.m466p();
        return;
    L6:
        ((C2228mE) this.f1419b).m4498m(0);
        return;
    L8:
        C2577uB r02 = (C2577uB) this.f1419b;
        Window.Callback r22 = r02.f8930b;
        Menu r03 = r02.m5081q();
        if ((r03 instanceof MenuC2204lr) == false) goto L11;
        MenuC2204lr r3 = (MenuC2204lr) r03;
    L12:
        if (r3 == null) goto L165;
        r3.m4442w();
    L165:
        r03.clear();     // Catch: Throwable -> L19
        if (r22.onCreatePanelMenu(0, r03) == true) goto L17;
    L21:
        r03.clear();     // Catch: Throwable -> L19
    L22:
        if (r3 == null) goto L170;
        r3.m4441v();
        return;
    L170:
        return;
    L17:
        if (r22.onPreparePanel(0, null, r03) == true) goto L22;
    L19:
        th = move-exception;
        if (r3 == null) goto L27;
        r3.m4441v();
    L27:
        throw th;
    L11:
        r3 = null;
        goto L12
    L28:
        ((Toolbar) this.f1419b).m2117u();
        return;
    L30:
        CheckableImageButton r04 = ((TextInputLayout) this.f1419b).f4621c.f3612g;
        r04.performClick();
        r04.jumpDrawablesToCurrentState();
        return;
    L32:
        ((StaggeredGridLayoutManager) this.f1419b).m2193d();
        return;
    L34:
        SearchView$SearchAutoComplete r05 = (SearchView$SearchAutoComplete) this.f1419b;
        if (r05.f3801f == false) goto L171;
        ((InputMethodManager) r05.getContext().getSystemService("input_method")).showSoftInput(r05, 0);
        r05.f3801f = false;
        return;
    L171:
        return;
    L38:
        ComponentCallbacks2C1473gw r06 = (ComponentCallbacks2C1473gw) this.f1419b;
        r06.f5218c.mo1508l(r06);
        return;
    L40:
        C0762Rp r07 = (C0762Rp) this.f1419b;
        CherryDevServer r23 = CherryDevServer.INSTANCE;
        if (r23.isRunning() == false) goto L172;
        TextView r32 = r07.f2419k;
        if (r32 != null) goto L45;
        AbstractC0295Gu.m625r(-129063767242805L);
    L46:
        r7.setText(r23.getConnectionCount() + AbstractC0295Gu.m625r(-129141076654133L));
        Handler r08 = r07.f2422n;
        if (r08 == null) goto L173;
        r08.postDelayed(this, 2000);
        return;
    L173:
        return;
    L45:
        r7 = r32;
        goto L46
    L172:
        return;
    L50:
        C0973Wl r09 = (C0973Wl) this.f1419b;
        if (r09.f3031c == null) goto L174;
        long r5 = System.currentTimeMillis();
        long r9 = r09.f3028A;
        if (r9 != Long.MIN_VALUE) goto L55;
    L54:
        long r17 = r2;
        AbstractC1160i r24 = r09.f3045q.getLayoutManager();
        if (r09.f3054z != null) goto L59;
        r09.f3054z = new Rect();
    L59:
        r24.calculateItemDecorationsForChild(r09.f3031c.itemView, r09.f3054z);
        if (r24.canScrollHorizontally() == false) goto L70;
        int r33 = (int) (r09.f3038j + r09.f3036h);
        int r72 = (r33 - r09.f3054z.left) - r09.f3045q.getPaddingLeft();
        float r92 = r09.f3036h;
        if (r92 >= 0.0f) goto L66;
        if (r72 >= 0) goto L66;
    L64:
        int r16 = r72;
    L72:
        if (r24.canScrollVertically() == false) goto L82;
        int r25 = (int) (r09.f3039k + r09.f3037i);
        int r34 = (r25 - r09.f3054z.top) - r09.f3045q.getPaddingTop();
        float r73 = r09.f3037i;
        if (r73 >= 0.0f) goto L78;
        if (r34 >= 0) goto L78;
    L76:
        r8 = r34;
    L78:
        if (r73 <= 0.0f) goto L82;
        r34 = ((r09.f3031c.itemView.getHeight() + r25) + r09.f3054z.bottom) - (r09.f3045q.getHeight() - r09.f3045q.getPaddingBottom());
        if (r34 > 0) goto L76;
    L82:
        if (r16 == 0) goto L84;
        AbstractC0887Ul r13 = r09.f3041m;
        RecyclerView r14 = r09.f3045q;
        int r15 = r09.f3031c.itemView.getWidth();
        r09.f3045q.getWidth();
        r16 = r13.m1741j(r14, r15, r16, r17);
    L84:
        int r26 = r16;
        if (r8 == 0) goto L88;
        AbstractC0887Ul r132 = r09.f3041m;
        RecyclerView r142 = r09.f3045q;
        int r152 = r09.f3031c.itemView.getHeight();
        r09.f3045q.getHeight();
        r8 = r132.m1741j(r142, r152, r8, r17);
    L88:
        if (r26 != 0) goto L93;
        if (r8 != 0) goto L93;
        r09.f3028A = Long.MIN_VALUE;
        return;
    L93:
        if (r09.f3028A != Long.MIN_VALUE) goto L95;
        r09.f3028A = r5;
    L95:
        r09.f3045q.scrollBy(r26, r8);
        AbstractC1166o r27 = r09.f3031c;
        if (r27 == null) goto L98;
        r09.m1857l(r27);
    L98:
        r09.f3045q.removeCallbacks(r09.f3046r);
        RecyclerView r010 = r09.f3045q;
        WeakHashMap r28 = AbstractC2185lE.f7617a;
        r010.postOnAnimation(this);
        return;
    L66:
        if (r92 <= 0.0f) goto L70;
        r72 = ((r09.f3031c.itemView.getWidth() + r33) + r09.f3054z.right) - (r09.f3045q.getWidth() - r09.f3045q.getPaddingRight());
        if (r72 > 0) goto L64;
    L70:
        r16 = 0;
        goto L72
    L55:
        r2 = r5 - r9;
        goto L54
    L174:
        return;
    L100:
        RunnableC1286a r011 = (RunnableC1286a) this.f1419b;
        if (r011 == null) goto L107;
        Activity r012 = r011.f4708a;
        if (r012 == null) goto L176;
        new C2262n5(r012);
        throw null;
    L176:
        return;
    L107:
        return;
    L108:
        ((AbstractC2805zi) this.f1419b).m5427y(true);
        return;
    L110:
        AbstractComponentCallbacksC1503hi r013 = (AbstractComponentCallbacksC1503hi) this.f1419b;
        if (r013.f5299H == null) goto L177;
        r013.m2868b().getClass();
        return;
    L177:
        return;
    L114:
        C1545ih r014 = (C1545ih) this.f1419b;
        ValueAnimator r29 = r014.f5495z;
        int r35 = r014.f5468A;
        if (r35 == 1) goto L118;
        if (r35 != 2) goto L178;
    L119:
        r014.f5468A = 3;
        r29.setFloatValues(new float[]{((Float) r29.getAnimatedValue()).floatValue(), 0.0f});
        r29.setDuration(500);
        r29.start();
        return;
    L178:
        return;
    L118:
        r29.cancel();
        goto L119
    L121:
        C0365Ie r015 = (C0365Ie) this.f1419b;
        r015.f1246l = null;
        r015.drawableStateChanged();
        return;
    L123:
        DialogInterfaceOnCancelListenerC0450Kd r016 = (DialogInterfaceOnCancelListenerC0450Kd) this.f1419b;
        r016.f1471U.onDismiss(r016.f1479c0);
        return;
    L125:
        C1204b6 r017 = (C1204b6) this.f1419b;
        r017.f4127c = false;
        BottomSheetBehavior r210 = (BottomSheetBehavior) r017.f4129e;
        C2228mE r36 = r210.f4423O;
        if (r36 == null) goto L131;
        if (r36.m4491f() == false) goto L131;
        r017.m2324a(r017.f4126b);
        return;
    L131:
        if (r210.f4422N != 2) goto L180;
        r210.m2431C(r017.f4126b);
        return;
    L180:
        return;
    L134:
        ViewOnTouchListenerC0504Lo r018 = (ViewOnTouchListenerC0504Lo) this.f1419b;
        C0365Ie r4 = r018.f1642c;
        C1203b5 r52 = r018.f1640a;
        if (r018.f1654o == true) goto L138;
        return;
    L138:
        if (r018.f1652m == false) goto L141;
        r018.f1652m = false;
        long r6 = AnimationUtils.currentAnimationTimeMillis();
        r52.f4120e = r6;
        r52.f4122g = -1;
        r52.f4121f = r6;
        r52.f4123h = 0.5f;
    L141:
        if (r52.f4122g <= 0) goto L146;
        if (AnimationUtils.currentAnimationTimeMillis() <= (r52.f4122g + ((long) r52.f4124i))) goto L146;
    L147:
        r018.f1654o = false;
        return;
    L146:
        if (r018.m988e() == false) goto L147;
        if (r018.f1653n == false) goto L152;
        r018.f1653n = false;
        long r93 = SystemClock.uptimeMillis();
        MotionEvent r62 = MotionEvent.obtain(r93, r93, 3, 0.0f, 0.0f, 0);
        r4.onTouchEvent(r62);
        r62.recycle();
    L152:
        if (r52.f4121f == 0) goto L156;
        long r211 = AnimationUtils.currentAnimationTimeMillis();
        float r63 = r52.m2323a(r211);
        long r74 = r211 - r52.f4121f;
        r52.f4121f = r211;
        r018.f1656q.scrollListBy((int) ((r74 * ((r63 * 4.0f) + (((-4.0f) * r63) * r63))) * r52.f4119d));
        WeakHashMap r019 = AbstractC2185lE.f7617a;
        r4.postOnAnimation(this);
        return;
    L156:
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
    L157:
        C2428qs r020 = (C2428qs) this.f1419b;
        r020.getClass();
    L163:
        r020.m4874l((C0517M0) ((ReferenceQueue) r020.f8522c).remove());     // Catch: InterruptedException -> L160
    L160:
        Thread.currentThread().interrupt();
        goto L163
    L161:
        Process.setThreadPriority(10);
        ((Runnable) this.f1419b).run();
    }

    public RunnableC0431K0(Activity r2) {
        this.f1418a = 9;
        if (r2 != null) goto L5;
        return;
    L5:
        if (((RunnableC1286a) this.f1419b) != null) goto L9;
        this.f1419b = new RunnableC1286a(r2);
        return;
    }
}
