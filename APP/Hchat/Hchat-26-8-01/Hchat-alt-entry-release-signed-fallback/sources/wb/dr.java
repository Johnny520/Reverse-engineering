package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class dr implements wb.p3, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.view.View f15773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f15774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f15775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f15777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f15778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.view.View f15779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f15780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout f15781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.widget.FrameLayout f15782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1.c1 f15783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.a1 f15784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.view.View f15785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wb.zh f15786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f15787u;

    public dr(android.view.View r1, android.view.ViewGroup r2, android.view.ViewGroup r3, int r4, android.view.ViewGroup.LayoutParams r5, android.graphics.drawable.Drawable r6, android.view.View r7, java.util.ArrayList r8, android.widget.FrameLayout r9, android.widget.FrameLayout r10, y1.c1 r11, c9.a1 r12, android.view.View r13, wb.zh r14) {
            r0 = this;
            r0.<init>()
            r0.f15773g = r1
            r0.f15774h = r2
            r0.f15775i = r3
            r0.f15776j = r4
            r0.f15777k = r5
            r0.f15778l = r6
            r0.f15779m = r7
            r0.f15780n = r8
            r0.f15781o = r9
            r0.f15782p = r10
            r0.f15783q = r11
            r0.f15784r = r12
            r0.f15785s = r13
            r0.f15786t = r14
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 1
            r1.<init>(r2)
            r0.f15787u = r1
            return
    }

    public final void a() {
            r12 = this;
            y1.c1 r1 = r12.f15783q
            r0 = 1
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f15787u
            boolean r0 = r3.compareAndSet(r0, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            android.view.View r0 = r12.f15785s
            if (r0 == 0) goto L14
            r0.removeOnAttachStateChangeListener(r12)
        L14:
            android.view.ViewGroup r4 = r12.f15775i
            if (r4 == r0) goto L1b
            r4.removeOnAttachStateChangeListener(r12)
        L1b:
            r1.f()     // Catch: java.lang.Throwable -> L1e
        L1e:
            android.view.ViewParent r0 = r1.getParent()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L29
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L2f
            r0.removeView(r1)
        L2f:
            wb.fr r0 = wb.fr.f16252a     // Catch: java.lang.Throwable -> L49
            android.view.View r2 = r12.f15773g     // Catch: java.lang.Throwable -> L49
            android.view.ViewGroup r3 = r12.f15774h     // Catch: java.lang.Throwable -> L49
            int r5 = r12.f15776j     // Catch: java.lang.Throwable -> L49
            android.view.ViewGroup$LayoutParams r6 = r12.f15777k     // Catch: java.lang.Throwable -> L49
            android.graphics.drawable.Drawable r7 = r12.f15778l     // Catch: java.lang.Throwable -> L49
            android.view.View r8 = r12.f15779m     // Catch: java.lang.Throwable -> L49
            java.util.ArrayList r9 = r12.f15780n     // Catch: java.lang.Throwable -> L49
            android.widget.FrameLayout r10 = r12.f15781o     // Catch: java.lang.Throwable -> L49
            android.widget.FrameLayout r11 = r12.f15782p     // Catch: java.lang.Throwable -> L49
            wb.fr.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L49
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L50:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L5f
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:Script] 恢复模块悬浮底栏失败: "
            eh.a.x(r3, r2, r0)
        L5f:
            x6.d.p(r1)
            c9.a1 r0 = r12.f15784r
            androidx.lifecycle.s r1 = r0.f1096h
            androidx.lifecycle.l r2 = r1.f300c
            androidx.lifecycle.l r3 = androidx.lifecycle.l.f289g
            if (r2 == r3) goto L6f
            r1.g(r3)
        L6f:
            r3.a r1 = r0.f1099k
            r1.a()
            androidx.lifecycle.e0 r0 = r0.f1098j
            r0.a()
            wb.zh r0 = r12.f15786t
            r0.invoke()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.a()
            return
    }
}
