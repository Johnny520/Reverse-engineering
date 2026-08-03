package p000;

import android.graphics.Typeface;
import android.os.StrictMode;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1159h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: B0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0044B0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93a;

    /* JADX INFO: renamed from: b */
    public Object f94b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f95c;

    public /* synthetic */ RunnableC0044B0(int r1, Object r2, Object r3) {
        this.f93a = r1;
        this.f95c = r2;
        this.f94b = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f93a) {
            case 0: goto L73;
            case 1: goto L69;
            case 2: goto L67;
            case 3: goto L60;
            case 4: goto L40;
            case 5: goto L12;
            case 6: goto L10;
            default: goto L4;
        };
    L4:
        C2228mE r0 = ((SwipeDismissBehavior) this.f95c).f4402a;
        if (r0 != null) goto L7;
        return;
    L7:
        if (r0.m4491f() == false) goto L110;
        ((View) this.f94b).postOnAnimation(this);
        return;
    L110:
        return;
    L10:
        ((C0754Rh) this.f94b).accept(this.f95c);
        return;
    L12:
        int r02 = 0;
    L97:
        ((Runnable) this.f94b).run();     // Catch: Throwable -> L15
    L17:
        Runnable r1 = ((C1377eo) this.f95c).m2669w();     // Catch: Throwable -> L27
        if (r1 == null) goto L111;
        this.f94b = r1;     // Catch: Throwable -> L27
        r02 = r02 + 1;     // Catch: Throwable -> L27
        if (r02 < 16) goto L97;
        C1377eo r12 = (C1377eo) this.f95c;     // Catch: Throwable -> L27
        AbstractC1217bc r2 = r12.f4913c;     // Catch: Throwable -> L27
        if (r2.mo2333u(r12) == false) goto L97;
        C1377eo r03 = (C1377eo) this.f95c;     // Catch: Throwable -> L27
        AbstractC1406fG.m2713m0(r03.f4913c, r03, this);     // Catch: Throwable -> L27
        return;
    L29:
        th = move-exception;
        throw new C1324de(th, r2, r12);     // Catch: Throwable -> L27
    L111:
        return;
    L15:
        th = move-exception;
        AbstractC0628Oj.m1222B(C0366If.f1247a, th);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        C1377eo r13 = (C1377eo) this.f95c;
        monitor-enter(r13.f4916f);
        C1377eo.f4911g.decrementAndGet(r13);     // Catch: Throwable -> L37
        throw th;
    L37:
        th = move-exception;
        throw th;
    L40:
        C0801Sl r04 = (C0801Sl) this.f94b;
        C0973Wl r14 = (C0973Wl) this.f95c;
        RecyclerView r22 = r14.f3045q;
        if (r22 != null) goto L43;
        return;
    L43:
        if (r22.isAttachedToWindow() == true) goto L45;
        return;
    L45:
        if (r04.f2518k == false) goto L47;
        return;
    L47:
        if (r04.f2512e.getAbsoluteAdapterPosition() == (-1)) goto L115;
        AbstractC1159h r05 = r14.f3045q.getItemAnimator();
        if (r05 != null) goto L51;
    L52:
        ArrayList r06 = r14.f3044p;
        int r23 = r06.size();
        int r3 = 0;
    L53:
        if (r3 >= r23) goto L58;
        if (((C0801Sl) r06.get(r3)).f2519l == false) goto L56;
        r3 = r3 + 1;
    L56:
        r14.f3045q.post(this);
        return;
    L58:
        r14.f3041m.mo1535n();
        return;
    L51:
        if (r05.mo2250f() == true) goto L56;
    L115:
        return;
    L60:
        ThreadFactoryC0928Vj r07 = (ThreadFactoryC0928Vj) this.f95c;
        if (r07.f2893d == false) goto L94;
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
    L94:
        ((Runnable) this.f94b).run();     // Catch: Throwable -> L65
        return;
    L65:
        r07.f2892c.getClass();
        return;
    L67:
        C2377pk r08 = C2377pk.m4818a();
        r08.getClass();
        AbstractC2622vD.m5130a();
        r08.f8369d.set(true);
        ((ViewTreeObserverOnDrawListenerC2718xh) this.f95c).f9297b.f9396b = true;
        View r09 = ((ViewTreeObserverOnDrawListenerC2718xh) this.f95c).f9296a;
        ViewTreeObserverOnDrawListenerC2718xh r15 = (ViewTreeObserverOnDrawListenerC2718xh) this.f94b;
        r09.getViewTreeObserver().removeOnDrawListener(r15);
        ((ViewTreeObserverOnDrawListenerC2718xh) this.f95c).f9297b.f9395a.clear();
        return;
    L69:
        C1017Xm r010 = (C1017Xm) this.f94b;
        Typeface r16 = (Typeface) this.f95c;
        AbstractC0585Nj r011 = (AbstractC0585Nj) r010.f3226b;
        if (r011 == null) goto L118;
        r011.mo1160J(r16);
        return;
    L118:
        return;
    L73:
        C2781z0 r012 = (C2781z0) this.f94b;
        C0130D0 r17 = (C0130D0) this.f95c;
        MenuC2204lr r24 = r17.f304c;
        if (r24 == null) goto L78;
        InterfaceC2113jr r32 = r24.f7664e;
        if (r32 == null) goto L78;
        r32.mo241n(r24);
    L78:
        View r25 = (View) r17.f309h;
        if (r25 != null) goto L81;
    L90:
        r17.f322u = null;
        return;
    L81:
        if (r25.getWindowToken() == null) goto L90;
        if (r012.m5291b() == false) goto L86;
    L89:
        r17.f320s = r012;
        goto L90
    L86:
        if (r012.f9319e == null) goto L90;
        r012.m5293d(0, 0, false, false);
        goto L89
    }

    public /* synthetic */ RunnableC0044B0(Object r1, Object r2, int r3, boolean r4) {
        this.f93a = r3;
        this.f94b = r1;
        this.f95c = r2;
    }

    public RunnableC0044B0(SwipeDismissBehavior r1, View r2, boolean r3) {
        this.f93a = 7;
        this.f95c = r1;
        this.f94b = r2;
    }

    public RunnableC0044B0(C0973Wl r1, C0801Sl r2, int r3) {
        this.f93a = 4;
        this.f95c = r1;
        this.f94b = r2;
    }
}
