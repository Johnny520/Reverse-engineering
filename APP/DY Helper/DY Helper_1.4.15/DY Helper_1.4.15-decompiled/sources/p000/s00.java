package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class s00 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f9638 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f9639 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f9640 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.s00.f9638 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.s00.f9639 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.s00.f9640 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m5312(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.reflect.Field m5313(java.lang.Class r2, p000.r00 r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            java.lang.reflect.Field r2 = m5316(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.reflect.Field m5314(java.lang.ClassLoader r2, p000.r00 r3) {
            java.lang.String r0 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L13:
            boolean r0 = r2 instanceof p000.eo1
            r1 = 0
            if (r0 == 0) goto L19
            r2 = r1
        L19:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L1e
            return r1
        L1e:
            java.lang.reflect.Field r2 = m5313(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static void m5315(p000.r00 r4, java.lang.ClassLoader r5, boolean r6) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = r4.f9190
            java.lang.reflect.Field r0 = p000.C0666ox.m4322(r0, r5)
            r1 = 1
            if (r0 == 0) goto Lf
            r0.setAccessible(r1)
            return
        Lf:
            if (r6 == 0) goto L30
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0666ox.f8305
            boolean r6 = r6.get()
            if (r6 == 0) goto L30
            kx r6 = r4.f9190
            java.lang.String r0 = r6.f6297
            wa r2 = new wa
            r3 = 10
            r2.<init>(r5, r3, r4)
            java.lang.reflect.Field r6 = p000.C0666ox.m4315(r6, r5, r0, r2)
            if (r6 == 0) goto L2d
            r6.setAccessible(r1)
        L2d:
            if (r6 == 0) goto L30
            return
        L30:
            java.lang.reflect.Field r4 = m5314(r5, r4)
            if (r4 == 0) goto L39
            r4.setAccessible(r1)
        L39:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.reflect.Field m5316(java.util.AbstractCollection r4, p000.r00 r5) {
            f7 r0 = new f7
            r1 = 1
            r0.<init>(r1, r4)
            q00 r4 = new q00
            r1 = 0
            r4.<init>(r1)
            y30 r1 = new y30
            r2 = 1
            r1.<init>(r0, r2, r4)
            θ r4 = new θ
            r0 = 14
            r4.<init>(r0, r5)
            t52 r5 = new t52
            r5.<init>(r1, r4)
            qt r4 = new qt
            r0 = 10
            r4.<init>(r0)
            java.util.List r5 = p000.us1.m5949(r5)
            p000.AbstractC0019ai.m168(r5, r4)
            java.util.Iterator r4 = r5.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L39
            jz r4 = p000.C0450jz.f5672
            goto L5b
        L39:
            java.lang.Object r5 = r4.next()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L48
            java.util.List r4 = p000.AbstractC1021yh.m6896(r5)
            goto L5b
        L48:
            java.util.ArrayList r5 = p000.lz1.m3696(r5)
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()
            r5.add(r0)
            goto L4c
        L5a:
            r4 = r5
        L5b:
            java.lang.Object r5 = p000.AbstractC0984xh.m6640(r4)
            l91 r5 = (p000.l91) r5
            if (r5 != 0) goto L64
            goto L87
        L64:
            java.lang.Object r0 = r5.f6503
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r3 = 3000(0xbb8, float:4.204E-42)
            if (r1 >= r3) goto L71
            goto L87
        L71:
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r2, r4)
            l91 r4 = (p000.l91) r4
            if (r4 == 0) goto L89
            java.lang.Object r4 = r4.f6503
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r0 = r0.intValue()
            if (r4 != r0) goto L89
        L87:
            r4 = 0
            return r4
        L89:
            java.lang.Object r4 = r5.f6502
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.setAccessible(r2)
            return r4
    }
}
