package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: qw */
/* JADX INFO: loaded from: classes.dex */
public final class C2432qw implements InterfaceC2627vc, InterfaceC2498sc {

    /* JADX INFO: renamed from: a */
    public final RunnableC0320Hc f8530a;

    /* JADX INFO: renamed from: b */
    public final C0234Fc f8531b;

    /* JADX INFO: renamed from: c */
    public int f8532c;

    /* JADX INFO: renamed from: d */
    public int f8533d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0802Sm f8534e;

    /* JADX INFO: renamed from: f */
    public List f8535f;

    /* JADX INFO: renamed from: g */
    public int f8536g;

    /* JADX INFO: renamed from: h */
    public volatile C1108Zr f8537h;

    /* JADX INFO: renamed from: i */
    public File f8538i;

    /* JADX INFO: renamed from: j */
    public C2475rw f8539j;

    public C2432qw(C0234Fc r2, RunnableC0320Hc r3) {
        this.f8533d = -1;
        this.f8531b = r2;
        this.f8530a = r3;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public final void mo635b(Exception r5) {
        this.f8530a.mo670a(this.f8539j, r5, this.f8537h.f3503c, 4);
    }

    @Override // p000.InterfaceC2627vc
    /* JADX INFO: renamed from: c */
    public final boolean mo727c() {
        ArrayList r2 = this.f8531b.m473a();
        boolean r4 = false;
        if (r2.isEmpty() == true) goto L66;
        C0234Fc r3 = this.f8531b;
        C0683Pv r5 = r3.f735c.m1544a();
        Class<?> r6 = r3.f736d.getClass();
        Class r7 = r3.f739g;
        Class r32 = r3.f743k;
        C0649P3 r8 = r5.f2189h;
        C2291ns r9 = (C2291ns) ((AtomicReference) r8.f2089b).getAndSet(null);
        if (r9 != null) goto L8;
        r9 = new C2291ns(r6, r7, r32);
    L9:
        C0521M4 r11 = (C0521M4) r8.f2090c;
        monitor-enter(r11);
        List r12 = (List) ((C0521M4) r8.f2090c).get(r9);     // Catch: Throwable -> L71
        monitor-exit(r11);     // Catch: Throwable -> L71
        ((AtomicReference) r8.f2089b).set(r9);
        List r122 = r12;
        if (r12 != null) goto L42;
        ArrayList r123 = new ArrayList();
        C0649P3 r82 = r5.f2182a;
        monitor-enter(r82);
        ArrayList r92 = ((C2428qs) r82.f2089b).m4881s(r6);     // Catch: Throwable -> L38
        monitor-exit(r82);
        Iterator r83 = r92.iterator();
    L21:
        if (r83.hasNext() == false) goto L30;
        Iterator r93 = r5.f2184c.m1276F((Class) r83.next(), r7).iterator();
    L24:
        if (r93.hasNext() == false) goto L21;
        Class r112 = (Class) r93.next();
        if (r5.f2187f.m1541b(r112, r32).isEmpty() == true) goto L24;
        if (r123.contains(r112) == true) goto L24;
        r123.add(r112);
        goto L24
    L30:
        C0649P3 r52 = r5.f2189h;
        List r84 = Collections.unmodifiableList(r123);
        C0521M4 r94 = (C0521M4) r52.f2090c;
        monitor-enter(r94);
        ((C0521M4) r52.f2090c).put(new C2291ns(r6, r7, r32), r84);     // Catch: Throwable -> L35
        monitor-exit(r94);     // Catch: Throwable -> L35
        r122 = r123;
    L35:
        th = move-exception;
        throw th;
    L38:
        th = move-exception;
        throw th;
    L42:
        if (r122.isEmpty() == true) goto L44;
    L48:
        List r0 = this.f8535f;
        if (r0 != null) goto L51;
    L62:
        int r02 = this.f8533d + 1;
        this.f8533d = r02;
        if (r02 < r122.size()) goto L68;
        int r03 = this.f8532c + 1;
        this.f8532c = r03;
        if (r03 >= r2.size()) goto L66;
        this.f8533d = 0;
    L68:
        InterfaceC0802Sm r15 = (InterfaceC0802Sm) r2.get(this.f8532c);
        Class r04 = (Class) r122.get(this.f8533d);
        InterfaceC0098CB r19 = this.f8531b.m477e(r04);
        C0234Fc r33 = this.f8531b;
        this.f8539j = new C2475rw(r33.f735c.f2396a, r15, r33.f746n, r33.f737e, r33.f738f, r19, r04, r33.f741i);
        File r05 = r33.f740h.m96a().mo1725b(this.f8539j);
        this.f8538i = r05;
        if (r05 == null) goto L48;
        this.f8534e = r15;
        this.f8535f = this.f8531b.f735c.m1544a().m1378f(r05);
        this.f8536g = 0;
        goto L48
    L51:
        if (this.f8536g >= r0.size()) goto L62;
        this.f8537h = null;
    L53:
        if (r4 == true) goto L61;
        if (this.f8536g >= this.f8535f.size()) goto L61;
        List r06 = this.f8535f;
        int r22 = this.f8536g;
        this.f8536g = r22 + 1;
        InterfaceC1189as r07 = (InterfaceC1189as) r06.get(r22);
        File r23 = this.f8538i;
        C0234Fc r53 = this.f8531b;
        this.f8537h = r07.mo995b(r23, r53.f737e, r53.f738f, r53.f741i);
        if (this.f8537h == null) goto L53;
        if (this.f8531b.m475c(this.f8537h.f3503c.mo912a()) == null) goto L53;
        this.f8537h.f3503c.mo915d(this.f8531b.f747o, this);
        r4 = true;
    L61:
        return r4;
    L44:
        if (File.class.equals(this.f8531b.f743k) == true) goto L66;
        throw new IllegalStateException("Failed to find any load path from " + this.f8531b.f736d.getClass() + " to " + this.f8531b.f743k);
    L71:
        th = move-exception;
        throw th;
    L8:
        r9.f8041a = r6;
        r9.f8042b = r7;
        r9.f8043c = r32;
    L66:
        return false;
    }

    @Override // p000.InterfaceC2627vc
    public final void cancel() {
        C1108Zr r0 = this.f8537h;
        if (r0 == null) goto L6;
        r0.f3503c.cancel();
        return;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public final void mo638e(Object r7) {
        this.f8530a.mo671b(this.f8534e, r7, this.f8537h.f3503c, 4, this.f8539j);
    }
}
