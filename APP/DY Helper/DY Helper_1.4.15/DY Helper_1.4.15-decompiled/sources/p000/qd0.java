package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f8969 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f8970 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicReference f8971 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.qd0.f8969 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.qd0.f8970 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p000.qd0.f8971 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m4865(java.lang.ClassLoader r5) {
            r5.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = p000.qd0.f8971
            r0.set(r5)
            be0 r0 = p000.be0.f1670
            r0.m936()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.qd0.f8970
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L18
            goto L27
        L18:
            o7 r1 = new o7
            r4 = 25
            r1.<init>(r4)
            r0.m937()
            java.util.concurrent.CopyOnWriteArrayList r4 = p000.be0.f1672
            r4.add(r1)
        L27:
            zd0 r0 = r0.m935()
            if (r0 == 0) goto L83
            boolean r0 = r0.f13044
            if (r0 != r3) goto L83
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qd0.f8969
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 != 0) goto L3a
            return r3
        L3a:
            r20 r0 = new r20
            r1 = 10
            r0.<init>(r5, r1)
            java.lang.String r1 = "relation"
            m4866(r1, r0)
            r20 r0 = new r20
            r1 = 11
            r0.<init>(r5, r1)
            java.lang.String r1 = "message"
            m4866(r1, r0)
            r20 r0 = new r20
            r1 = 12
            r0.<init>(r5, r1)
            java.lang.String r1 = "message_status"
            m4866(r1, r0)
            r20 r0 = new r20
            r1 = 13
            r0.<init>(r5, r1)
            java.lang.String r1 = "share"
            m4866(r1, r0)
            r20 r0 = new r20
            r1 = 14
            r0.<init>(r5, r1)
            java.lang.String r1 = "discovery"
            m4866(r1, r0)
            r20 r0 = new r20
            r1 = 15
            r0.<init>(r5, r1)
            java.lang.String r5 = "message_page_reveal"
            m4866(r5, r0)
            return r3
        L83:
            java.lang.String r5 = "r3988e153d6d986ff"
            java.lang.String r0 = "feature configuration disabled, skip hook installation"
            p000.C0888ux.m5975(r5, r0)
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static void m4866(java.lang.String r3, p000.p70 r4) {
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        Lc:
            boolean r0 = r4 instanceof p000.eo1
            java.lang.String r1 = "r3988e153d6d986ff"
            if (r0 != 0) goto L1e
            r0 = r4
            s62 r0 = (p000.s62) r0
            java.lang.String r0 = " hook installed"
            java.lang.String r0 = r3.concat(r0)
            p000.C0888ux.m5975(r1, r0)
        L1e:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L3f
            java.lang.String r0 = r4.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = " hook unavailable: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            p000.C0888ux.m5977(r1, r3, r4)
        L3f:
            return
    }
}
