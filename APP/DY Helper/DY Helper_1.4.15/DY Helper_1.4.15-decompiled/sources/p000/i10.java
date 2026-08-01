package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i10 implements p000.e10 {

    /* JADX INFO: renamed from: α */
    public static final p000.i10 f4867 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f4868 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f4869 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile java.lang.ClassLoader f4870;

    /* JADX INFO: renamed from: ε */
    public static final p000.q00 f4871 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.q00 f4872 = null;

    static {
            i10 r0 = new i10
            r0.<init>()
            p000.i10.f4867 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.i10.f4868 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.i10.f4869 = r0
            q00 r0 = new q00
            r1 = 18
            r0.<init>(r1)
            p000.i10.f4871 = r0
            q00 r0 = new q00
            r1 = 19
            r0.<init>(r1)
            p000.i10.f4872 = r0
            return
    }

    @Override // p000.e10
    /* JADX INFO: renamed from: α */
    public final int mo1833() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.e10
    /* JADX INFO: renamed from: β */
    public final boolean mo1834(java.lang.Object r1, android.view.MotionEvent r2) {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m2580() {
            r8 = this;
            boolean r0 = p000.ui1.m5867()
            r1 = 1
            r2 = 4
            java.lang.String r3 = "r884b4b855564017b"
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L6f
            java.lang.String r0 = "feed_double_tap_like_block_enabled"
            boolean r0 = p000.ui1.m5887(r0, r4)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L1e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L25
            r0 = r6
        L25:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6f
            java.lang.ClassLoader r0 = p000.i10.f4870
            if (r0 != 0) goto L32
            goto L81
        L32:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.i10.f4869
            boolean r1 = r6.compareAndSet(r4, r1)
            if (r1 != 0) goto L3b
            goto L81
        L3b:
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.g10.f4192     // Catch: java.lang.Throwable -> L43
            p000.g10.m2222(r0, r8)     // Catch: java.lang.Throwable -> L43
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r8 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r8)
            r8 = r0
        L4a:
            boolean r0 = r8 instanceof p000.eo1
            if (r0 != 0) goto L56
            r0 = r8
            s62 r0 = (p000.s62) r0
            java.lang.String r0 = "双击点赞屏蔽策略已启用"
            p000.C0888ux.m5988(r3, r0, r5, r2, r5)
        L56:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L81
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.i10.f4869
            r0.set(r4)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "启用双击点赞屏蔽策略失败: "
            java.lang.String r8 = p000.lz1.m3687(r0, r8)
            p000.C0888ux.m5988(r3, r8, r5, r2, r5)
            goto L81
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.i10.f4869
            boolean r0 = r0.compareAndSet(r1, r4)
            if (r0 == 0) goto L81
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.g10.f4192
            p000.g10.m2226(r8)
            java.lang.String r8 = "双击点赞屏蔽策略已移除"
            p000.C0888ux.m5988(r3, r8, r5, r2, r5)
        L81:
            return
    }
}
