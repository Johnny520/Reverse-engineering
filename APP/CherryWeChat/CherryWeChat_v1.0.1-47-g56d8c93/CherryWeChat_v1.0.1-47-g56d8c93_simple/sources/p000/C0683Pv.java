package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Pv */
/* JADX INFO: loaded from: classes.dex */
public final class C0683Pv {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f2182a;

    /* JADX INFO: renamed from: b */
    public final C0752Rf f2183b;

    /* JADX INFO: renamed from: c */
    public final C0649P3 f2184c;

    /* JADX INFO: renamed from: d */
    public final C0752Rf f2185d;

    /* JADX INFO: renamed from: e */
    public final C2756yc f2186e;

    /* JADX INFO: renamed from: f */
    public final C0752Rf f2187f;

    /* JADX INFO: renamed from: g */
    public final C0752Rf f2188g;

    /* JADX INFO: renamed from: h */
    public final C0649P3 f2189h;

    /* JADX INFO: renamed from: i */
    public final C0633Oo f2190i;

    /* JADX INFO: renamed from: j */
    public final C2656w4 f2191j;

    public C0683Pv() {
        this.f2189h = new C0649P3(25);
        this.f2190i = new C0633Oo();
        C2656w4 r3 = new C2656w4(new C1110Zt(20), new C0668Pg(3), new C0668Pg(4));
        this.f2191j = r3;
        this.f2182a = new C0649P3(r3);
        this.f2183b = new C0752Rf(0);
        this.f2184c = new C0649P3(28);
        this.f2185d = new C0752Rf(2);
        this.f2186e = new C2756yc(0);
        this.f2187f = new C0752Rf(3);
        this.f2188g = new C0752Rf(1);
        List r0 = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList r1 = new ArrayList(r0.size());
        r1.add("legacy_prepend_all");
        Iterator r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        r1.add((String) r02.next());
        goto L4
    L6:
        r1.add("legacy_append");
        C0649P3 r03 = this.f2184c;
        monitor-enter(r03);
        ArrayList r2 = new ArrayList((ArrayList) r03.f2089b);     // Catch: Throwable -> L12
        ((ArrayList) r03.f2089b).clear();     // Catch: Throwable -> L12
        Iterator r32 = r1.iterator();     // Catch: Throwable -> L12
    L10:
        if (r32.hasNext() == false) goto L14;
        String r4 = (String) r32.next();     // Catch: Throwable -> L12
        ((ArrayList) r03.f2089b).add(r4);     // Catch: Throwable -> L12
        goto L10
    L14:
        Iterator r22 = r2.iterator();     // Catch: Throwable -> L12
    L15:
        if (r22.hasNext() == false) goto L21;
        String r33 = (String) r22.next();     // Catch: Throwable -> L12
        if (r1.contains(r33) == true) goto L15;
        ((ArrayList) r03.f2089b).add(r33);     // Catch: Throwable -> L12
        goto L15
    L21:
        monitor-exit(r03);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final void m1373a(Class r4, InterfaceC0667Pf r5) {
        C0752Rf r0 = this.f2183b;
        monitor-enter(r0);
        r0.f2389a.add(new C0710Qf(r4, r5));     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m1374b(Class r4, InterfaceC2647vw r5) {
        C0752Rf r0 = this.f2185d;
        monitor-enter(r0);
        r0.f2389a.add(new C2690ww(r4, r5));     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final void m1375c(Class r4, Class r5, InterfaceC1233bs r6) {
        C0649P3 r0 = this.f2182a;
        monitor-enter(r0);
        C2428qs r1 = (C2428qs) r0.f2089b;     // Catch: Throwable -> L17
        monitor-enter(r1);     // Catch: Throwable -> L17
        C2385ps r2 = new C2385ps(r4, r5, r6);     // Catch: Throwable -> L13
        ArrayList r42 = (ArrayList) r1.f8520a;     // Catch: Throwable -> L13
        r42.add(r42.size(), r2);     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L17
        ((C2756yc) r0.f2090c).f9385a.clear();     // Catch: Throwable -> L17
        monitor-exit(r0);
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final void m1376d(String r3, Class r4, Class r5, InterfaceC2518sw r6) {
        C0649P3 r0 = this.f2184c;
        monitor-enter(r0);
        r0.m1274D(r3).add(new C2561tw(r4, r5, r6));     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m1377e() {
        C0752Rf r0 = this.f2188g;
        monitor-enter(r0);
        ArrayList r1 = r0.f2389a;     // Catch: Throwable -> L11
        monitor-exit(r0);
        if (r1.isEmpty() == true) goto L10;
        return r1;
    L10:
        throw new C0597Nv("Failed to find image header parser.");
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final List m1378f(Object r9) {
        C0649P3 r0 = this.f2182a;
        r0.getClass();
        Class<?> r1 = r9.getClass();
        monitor-enter(r0);
        C1294cs r2 = (C1294cs) ((C2756yc) r0.f2090c).f9385a.get(r1);     // Catch: Throwable -> L14
        if (r2 != null) goto L7;
        List r22 = null;
    L8:
        if (r22 != null) goto L16;
        r22 = Collections.unmodifiableList(((C2428qs) r0.f2089b).m4873k(r1));     // Catch: Throwable -> L14
        if (((C1294cs) ((C2756yc) r0.f2090c).f9385a.put(r1, new C1294cs(r22))) == null) goto L16;
        throw new IllegalStateException("Already cached loaders for model: " + r1);     // Catch: Throwable -> L14
    L16:
        monitor-exit(r0);
        if (r22.isEmpty() == true) goto L33;
        int r02 = r22.size();
        List r12 = Collections.EMPTY_LIST;
        boolean r4 = true;
        int r5 = 0;
    L20:
        if (r5 >= r02) goto L28;
        InterfaceC1189as r6 = (InterfaceC1189as) r22.get(r5);
        if (r6.mo994a(r9) == false) goto L26;
        if (r4 == false) goto L25;
        r12 = new ArrayList(r02 - r5);
        r4 = false;
    L25:
        r12.add(r6);
    L26:
        r5 = r5 + 1;
        goto L20
    L28:
        if (r12.isEmpty() == true) goto L31;
        return r12;
    L31:
        throw new C0597Nv("Found ModelLoaders for model class: " + r22 + ", but none that handle this specific model instance: " + r9);
    L33:
        throw new C0597Nv("Failed to find any ModelLoaders registered for model class: " + r9.getClass());
    L7:
        r22 = r2.f4730a;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2713xc m1379g(Object r7) {
        C2756yc r0 = this.f2186e;
        monitor-enter(r0);
        AbstractC0714Qj.m1487i(r7);     // Catch: Throwable -> L12
        InterfaceC2670wc r1 = (InterfaceC2670wc) r0.f9385a.get(r7.getClass());     // Catch: Throwable -> L12
        if (r1 != null) goto L14;
        Iterator r2 = r0.f9385a.values().iterator();     // Catch: Throwable -> L12
    L8:
        if (r2.hasNext() == false) goto L14;
        InterfaceC2670wc r3 = (InterfaceC2670wc) r2.next();     // Catch: Throwable -> L12
        if (r3.mo4771a().isAssignableFrom(r7.getClass()) == false) goto L8;
        r1 = r3;
    L14:
        if (r1 != null) goto L16;
        r1 = C2756yc.f9384b;     // Catch: Throwable -> L12
    L16:
        InterfaceC2713xc r72 = r1.mo4772b(r7);     // Catch: Throwable -> L12
        monitor-exit(r0);
        return r72;
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public final void m1380h(InterfaceC2670wc r4) {
        C2756yc r0 = this.f2186e;
        monitor-enter(r0);
        r0.f9385a.put(r4.mo4771a(), r4);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public final void m1381i(Class r4, Class r5, InterfaceC2819zw r6) {
        C0752Rf r0 = this.f2187f;
        monitor-enter(r0);
        r0.f2389a.add(new C0055BB(r4, r5, r6));     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
