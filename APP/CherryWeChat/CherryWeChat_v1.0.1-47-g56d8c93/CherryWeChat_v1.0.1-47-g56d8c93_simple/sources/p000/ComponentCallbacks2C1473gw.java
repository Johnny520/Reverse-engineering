package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: gw */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1473gw implements ComponentCallbacks2, InterfaceC0975Wn {

    /* JADX INFO: renamed from: k */
    public static final C2252mw f5215k = null;

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacks2C1273a f5216a;

    /* JADX INFO: renamed from: b */
    public final Context f5217b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0718Qn f5218c;

    /* JADX INFO: renamed from: d */
    public final C2692wy f5219d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2209lw f5220e;

    /* JADX INFO: renamed from: f */
    public final C1488hA f5221f;

    /* JADX INFO: renamed from: g */
    public final RunnableC0431K0 f5222g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1136ab f5223h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f5224i;

    /* JADX INFO: renamed from: j */
    public final C2252mw f5225j;

    static {
        C2252mw r0 = (C2252mw) new C2252mw().m5310d(Bitmap.class);
        r0.f9365n = true;
        f5215k = r0;
        ((C2252mw) new C2252mw().m5310d(C0026Aj.class)).f9365n = true;
        C2252mw r02 = (C2252mw) ((C2252mw) ((C2252mw) new C2252mw().m5311e(C0922Vd.f2880d)).m5317l()).m5322q();
    }

    public ComponentCallbacks2C1473gw(ComponentCallbacks2C1273a r5, InterfaceC0718Qn r6, InterfaceC2209lw r7, Context r8) {
        C2692wy r0 = new C2692wy();
        C2220m6 r1 = r5.f4342f;
        this.f5221f = new C1488hA();
        RunnableC0431K0 r2 = new RunnableC0431K0(12, this);
        this.f5222g = r2;
        this.f5216a = r5;
        this.f5218c = r6;
        this.f5220e = r7;
        this.f5219d = r0;
        this.f5217b = r8;
        Context r72 = r8.getApplicationContext();
        C1429fw r82 = new C1429fw(this, r0);
        r1.getClass();
        if (AbstractC0295Gu.m610c(r72, "android.permission.ACCESS_NETWORK_STATE") != 0) goto L5;
        InterfaceC1136ab r02 = new C0578Nc(r72, r82);
    L6:
        this.f5223h = r02;
        ArrayList r73 = r5.f4343g;
        monitor-enter(r73);
    L44:
        th = move-exception;
        throw th;
    L9:
        if (r5.f4343g.contains(this) == true) goto L47;
        r5.f4343g.add(this);     // Catch: Throwable -> L44
        monitor-exit(r73);     // Catch: Throwable -> L44
        char[] r74 = AbstractC2622vD.f9104a;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L15;
        boolean r75 = true;
    L16:
        if (r75 == true) goto L18;
        AbstractC2622vD.m5135f().post(r2);
    L19:
        r6.mo1508l(r02);
        this.f5224i = new CopyOnWriteArrayList(r5.f4339c.f2400e);
        C0756Rj r52 = r5.f4339c;
        monitor-enter(r52);
    L24:
        th = move-exception;
        throw th;
    L22:
        if (r52.f2405j != null) goto L26;
        r52.f2399d.getClass();     // Catch: Throwable -> L24
        C2252mw r62 = new C2252mw();     // Catch: Throwable -> L24
        r62.f9365n = true;     // Catch: Throwable -> L24
        r52.f2405j = r62;     // Catch: Throwable -> L24
    L26:
        C2252mw r63 = r52.f2405j;     // Catch: Throwable -> L24
        monitor-exit(r52);
        monitor-enter(this);
        C2252mw r53 = (C2252mw) r63.mo2302c();     // Catch: Throwable -> L39
        if (r53.f9365n == true) goto L32;
    L36:
        r53.f9366o = true;     // Catch: Throwable -> L39
        r53.f9365n = true;     // Catch: Throwable -> L39
        this.f5225j = r53;     // Catch: Throwable -> L39
        monitor-exit(this);
        return;
    L32:
        if (r53.f9366o == true) goto L36;
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        throw th;
    L18:
        r6.mo1508l(this);
        goto L19
    L15:
        r75 = false;
        goto L16
    L47:
        throw new IllegalStateException("Cannot register already registered manager");     // Catch: Throwable -> L44
    L5:
        r02 = new C1234bt();
        goto L6
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final synchronized void mo392b() {
        monitor-enter(this);
        this.f5221f.mo392b();     // Catch: Throwable -> L21
        m2832m();     // Catch: Throwable -> L21
        C2692wy r0 = this.f5219d;     // Catch: Throwable -> L21
        Iterator r1 = AbstractC2622vD.m5134e((Set) r0.f9265c).iterator();     // Catch: Throwable -> L21
    L5:
        if (r1.hasNext() == false) goto L7;
        r0.m5267a((InterfaceC1026Xv) r1.next());     // Catch: Throwable -> L21
        goto L5
    L7:
        ((HashSet) r0.f9266d).clear();     // Catch: Throwable -> L21
        this.f5218c.mo1507d(this);     // Catch: Throwable -> L21
        this.f5218c.mo1507d(this.f5223h);     // Catch: Throwable -> L21
        RunnableC0431K0 r02 = this.f5222g;     // Catch: Throwable -> L21
        AbstractC2622vD.m5135f().removeCallbacks(r02);     // Catch: Throwable -> L21
        ComponentCallbacks2C1273a r03 = this.f5216a;     // Catch: Throwable -> L21
        ArrayList r12 = r03.f4343g;     // Catch: Throwable -> L21
        monitor-enter(r12);     // Catch: Throwable -> L21
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L10:
        if (r03.f4343g.contains(this) == false) goto L18;
        r03.f4343g.remove(this);     // Catch: Throwable -> L15
        monitor-exit(r12);     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L18:
        throw new IllegalStateException("Cannot unregister not yet registered manager");     // Catch: Throwable -> L15
    L21:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final synchronized void mo394d() {
        monitor-enter(this);
        this.f5221f.mo394d();     // Catch: Throwable -> L6
        m2834o();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final synchronized void mo401k() {
        monitor-enter(this);
        m2835p();     // Catch: Throwable -> L6
        this.f5221f.mo401k();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: l */
    public final void m2831l(InterfaceC1444gA r5) {
        if (r5 == null) goto L29;
        boolean r0 = m2836q(r5);
        InterfaceC1026Xv r1 = r5.mo391a();
        if (r0 == true) goto L23;
        ComponentCallbacks2C1273a r02 = this.f5216a;
        ArrayList r2 = r02.f4343g;
        monitor-enter(r2);
        Iterator r03 = r02.f4343g.iterator();     // Catch: Throwable -> L15
    L10:
        if (r03.hasNext() == false) goto L17;
        if (((ComponentCallbacks2C1473gw) r03.next()).m2836q(r5) == false) goto L10;
        monitor-exit(r2);     // Catch: Throwable -> L15
        return;
    L17:
        monitor-exit(r2);     // Catch: Throwable -> L15
        if (r1 == null) goto L28;
        r5.mo397g(null);
        r1.clear();
        return;
    L28:
        return;
    L15:
        th = move-exception;
        throw th;
    L23:
        return;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m2832m() {
        monitor-enter(this);
        Iterator r0 = AbstractC2622vD.m5134e(this.f5221f.f5258a).iterator();     // Catch: Throwable -> L7
    L5:
        if (r0.hasNext() == false) goto L9;
        m2831l((InterfaceC1444gA) r0.next());     // Catch: Throwable -> L7
        goto L5
    L9:
        this.f5221f.f5258a.clear();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: n */
    public final C1193aw m2833n(String r5) {
        return new C1193aw(this.f5216a, this, Drawable.class, this.f5217b).m2300C(r5);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m2834o() {
        monitor-enter(this);
        C2692wy r0 = this.f5219d;     // Catch: Throwable -> L12
        r0.f9264b = true;     // Catch: Throwable -> L12
        Iterator r1 = AbstractC2622vD.m5134e((Set) r0.f9265c).iterator();     // Catch: Throwable -> L12
    L4:
        if (r1.hasNext() == false) goto L10;
        InterfaceC1026Xv r2 = (InterfaceC1026Xv) r1.next();     // Catch: Throwable -> L12
        if (r2.isRunning() == false) goto L4;
        r2.mo1937d();     // Catch: Throwable -> L12
        ((HashSet) r0.f9266d).add(r2);     // Catch: Throwable -> L12
        goto L4
    L10:
        monitor-exit(this);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m2835p() {
        monitor-enter(this);
        C2692wy r0 = this.f5219d;     // Catch: Throwable -> L14
        r0.f9264b = false;     // Catch: Throwable -> L14
        Iterator r1 = AbstractC2622vD.m5134e((Set) r0.f9265c).iterator();     // Catch: Throwable -> L14
    L5:
        if (r1.hasNext() == false) goto L11;
        InterfaceC1026Xv r2 = (InterfaceC1026Xv) r1.next();     // Catch: Throwable -> L14
        if (r2.mo1942k() == true) goto L5;
        if (r2.isRunning() == true) goto L5;
        r2.mo1941j();     // Catch: Throwable -> L14
        goto L5
    L11:
        ((HashSet) r0.f9266d).clear();     // Catch: Throwable -> L14
        monitor-exit(this);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m2836q(InterfaceC1444gA r4) {
        monitor-enter(this);
        InterfaceC1026Xv r0 = r4.mo391a();     // Catch: Throwable -> L13
        if (r0 != null) goto L9;
        monitor-exit(this);
        return true;
    L9:
        if (this.f5219d.m5267a(r0) == false) goto L15;
        this.f5221f.f5258a.remove(r4);     // Catch: Throwable -> L13
        r4.mo397g(null);     // Catch: Throwable -> L13
        monitor-exit(this);
        return true;
    L15:
        monitor-exit(this);
        return false;
    L13:
        th = move-exception;
        throw th;
    }

    public final synchronized String toString() {
        monitor-enter(this);
        String r0 = super.toString() + "{tracker=" + this.f5219d + ", treeNode=" + this.f5220e + "}";     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }
}
