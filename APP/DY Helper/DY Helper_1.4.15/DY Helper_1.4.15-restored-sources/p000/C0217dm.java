package p000;

/* JADX INFO: renamed from: dm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0217dm {

    /* JADX INFO: renamed from: α */
    public static final p000.C0217dm f3216 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f3217 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f3218 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.HashSet f3219 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.C0876ul f3220 = null;

    static {
            dm r0 = new dm
            r0.<init>()
            p000.C0217dm.f3216 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0217dm.f3217 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0217dm.f3218 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            p000.C0217dm.f3219 = r0
            ul r0 = new ul
            r1 = 17
            r0.<init>(r1)
            p000.C0217dm.f3220 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1774(java.lang.ClassLoader r7) {
            java.util.Set r0 = p000.AbstractC0253em.f3591
            r7.getClass()
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9EF7F2FE1F6FF4FE6B4A7480A0A9E6D128F8AF32912FFFC8EA4A580082EEF875A9FDE1007A42A37CB2FED7CCCA300AA4E523CA56094EE2540D07678E1F90F349"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r7 = p000.qe0.m4877(r7, r0)
            r0 = 0
            jz r1 = p000.C0450jz.f5672
            if (r7 != 0) goto L17
            goto L5b
        L17:
            java.lang.reflect.Field[] r2 = r7.getDeclaredFields()
            r2.getClass()
            int r3 = r2.length
            r4 = r0
        L20:
            if (r4 >= r3) goto L5b
            r5 = r2[r4]
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.Class r5 = r5.getType()
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L58
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()
            r7.getClass()
            ss1 r7 = p000.AbstractC0312g7.m2232(r7)
            ul r1 = new ul
            r2 = 18
            r1.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r7, r3, r1)
            ul r7 = new ul
            r1 = 19
            r7.<init>(r1)
            t52 r7 = p000.us1.m5945(r2, r7)
            java.util.List r1 = p000.us1.m5948(r7)
            goto L5b
        L58:
            int r4 = r4 + 1
            goto L20
        L5b:
            java.util.Iterator r7 = r1.iterator()
        L5f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r7.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            xl r3 = new xl
            r4 = 3
            r3.<init>(r4, r0)
            dm r4 = p000.C0217dm.f3216
            r4.m1778(r2, r3)
            goto L5f
        L77:
            int r7 = r1.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "comment input bind hooks installed: count="
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "rd44bdb4944a23356"
            p000.C0888ux.m5975(r0, r7)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m1775(java.lang.ClassLoader r9) {
            java.util.Set r0 = p000.AbstractC0253em.f3591
            r9.getClass()
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~791C379118E47E8B07D05A90B0CB4AAAEFB24B3BF0773879FC833D3987C0B1293BF3"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = p000.qe0.m4877(r9, r0)
            r1 = 1
            jz r2 = p000.C0450jz.f5672
            if (r0 != 0) goto L18
            r0 = r2
            goto L3e
        L18:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            ul r3 = new ul
            r4 = 24
            r3.<init>(r4)
            y30 r4 = new y30
            r4.<init>(r0, r1, r3)
            ul r0 = new ul
            r3 = 25
            r0.<init>(r3)
            t52 r0 = p000.us1.m5945(r4, r0)
            java.util.List r0 = p000.us1.m5948(r0)
        L3e:
            java.util.Iterator r3 = r0.iterator()
        L42:
            boolean r4 = r3.hasNext()
            r5 = 0
            dm r6 = p000.C0217dm.f3216
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            xl r7 = new xl
            r8 = 5
            r7.<init>(r8, r5)
            r6.m1778(r4, r7)
            goto L42
        L5b:
            java.util.Set r3 = p000.AbstractC0253em.f3591
            java.lang.String r3 = "X.C242500wE"
            java.lang.Class r9 = p000.qe0.m4877(r9, r3)
            if (r9 != 0) goto L66
            goto L8c
        L66:
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()
            r9.getClass()
            ss1 r9 = p000.AbstractC0312g7.m2232(r9)
            ul r2 = new ul
            r3 = 22
            r2.<init>(r3)
            y30 r3 = new y30
            r3.<init>(r9, r1, r2)
            ul r9 = new ul
            r1 = 23
            r9.<init>(r1)
            t52 r9 = p000.us1.m5945(r3, r9)
            java.util.List r2 = p000.us1.m5948(r9)
        L8c:
            java.util.Iterator r9 = r2.iterator()
        L90:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r9.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            xl r3 = new xl
            r4 = 6
            r3.<init>(r4, r5)
            r6.m1778(r1, r3)
            goto L90
        La6:
            int r9 = r0.size()
            int r0 = r2.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "legacy comment hooks installed: readers="
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = ", checks="
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            java.lang.String r0 = "rd44bdb4944a23356"
            p000.C0888ux.m5975(r0, r9)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m1776(java.lang.ClassLoader r10) {
            java.util.Set r0 = p000.AbstractC0253em.f3591
            r10.getClass()
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8107C98B374AA73AD003D84FDB16B9ADC2F32C07489E2A986"
            java.lang.String r1 = p000.jf0.m2957(r0)
            java.lang.Class r1 = p000.qe0.m4877(r10, r1)
            r2 = 1
            jz r3 = p000.C0450jz.f5672
            if (r1 != 0) goto L18
            r1 = r3
            goto L3e
        L18:
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            ss1 r1 = p000.AbstractC0312g7.m2232(r1)
            ul r4 = new ul
            r5 = 20
            r4.<init>(r5)
            y30 r5 = new y30
            r5.<init>(r1, r2, r4)
            ul r1 = new ul
            r4 = 21
            r1.<init>(r4)
            t52 r1 = p000.us1.m5945(r5, r1)
            java.util.List r1 = p000.us1.m5948(r1)
        L3e:
            java.util.Iterator r4 = r1.iterator()
        L42:
            boolean r5 = r4.hasNext()
            r6 = 0
            dm r7 = p000.C0217dm.f3216
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            xl r8 = new xl
            r9 = 7
            r8.<init>(r9, r6)
            r7.m1778(r5, r8)
            goto L42
        L5b:
            java.util.Set r4 = p000.AbstractC0253em.f3591
            java.lang.Object r4 = p000.qe0.f8982
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r10 = p000.qe0.m4877(r10, r0)
            if (r10 != 0) goto L6a
            goto L90
        L6a:
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            r10.getClass()
            ss1 r10 = p000.AbstractC0312g7.m2232(r10)
            ul r0 = new ul
            r3 = 26
            r0.<init>(r3)
            y30 r3 = new y30
            r3.<init>(r10, r2, r0)
            ul r10 = new ul
            r0 = 27
            r10.<init>(r0)
            t52 r10 = p000.us1.m5945(r3, r10)
            java.util.List r3 = p000.us1.m5948(r10)
        L90:
            java.util.Iterator r10 = r3.iterator()
        L94:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r10.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            xl r2 = new xl
            r4 = 8
            r2.<init>(r4, r6)
            r7.m1778(r0, r2)
            goto L94
        Lab:
            int r10 = r1.size()
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "related search hooks installed: eligibility="
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = ", registration="
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "rd44bdb4944a23356"
            p000.C0888ux.m5975(r0, r10)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1777(java.lang.String r2) {
            r0 = 0
            boolean r2 = p000.ui1.m5887(r2, r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> La
            goto L11
        La:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof p000.eo1
            if (r1 == 0) goto L18
            r2 = r0
        L18:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final synchronized void m1778(java.lang.reflect.Method r3, p000.m01 r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r3.toGenericString()     // Catch: java.lang.Throwable -> L16
            java.util.HashSet r1 = p000.C0217dm.f3219     // Catch: java.lang.Throwable -> L16
            boolean r0 = r1.add(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lf
            monitor-exit(r2)
            return
        Lf:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L16
            r0.m6775(r3, r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
