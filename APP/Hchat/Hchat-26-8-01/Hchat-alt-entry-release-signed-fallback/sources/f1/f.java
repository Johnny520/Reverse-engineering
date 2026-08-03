package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f1.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f3047g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.t f3048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f3049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.b f3050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.e f3052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1.d f3053f;

    public f(y1.t r4) {
            r3 = this;
            r3.<init>()
            r3.f3048a = r4
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f3049b = r0
            f1.d r0 = new f1.d
            r0.<init>(r3)
            r3.f3053f = r0
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L2b
            android.content.Context r1 = r4.getContext()
            boolean r2 = r3.f3051d
            if (r2 != 0) goto L2b
            android.content.Context r1 = r1.getApplicationContext()
            r1.registerComponentCallbacks(r0)
            r0 = 1
            r3.f3051d = r0
        L2b:
            f1.e r0 = new f1.e
            r1 = 0
            r0.<init>(r3, r1)
            r4.addOnAttachStateChangeListener(r0)
            return
    }

    @Override // f1.z
    public final void a(i1.b r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3049b
            monitor-enter(r0)
            boolean r1 = r3.f6151s     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto Ld
            r1 = 1
            r3.f6151s = r1     // Catch: java.lang.Throwable -> Lf
            r3.b()     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // f1.z
    public final b.e b() {
            r3 = this;
            b.e r0 = r3.f3052e
            if (r0 != 0) goto Le
            b.e r0 = new b.e
            r1 = 20
            r2 = 0
            r0.<init>(r1, r2)
            r3.f3052e = r0
        Le:
            return r0
    }

    @Override // f1.z
    public final i1.b c() {
            r5 = this;
            java.lang.Object r0 = r5.f3049b
            monitor-enter(r0)
            y1.t r1 = r5.f3048a     // Catch: java.lang.Throwable -> L16
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r3 = 29
            if (r2 < r3) goto Le
            f1.a.a(r1)     // Catch: java.lang.Throwable -> L16
        Le:
            if (r2 < r3) goto L18
            i1.g r1 = new i1.g     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            goto L48
        L16:
            r1 = move-exception
            goto L4f
        L18:
            boolean r1 = f1.f.f3047g     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L3d
            i1.e r1 = new i1.e     // Catch: java.lang.Throwable -> L2e
            y1.t r2 = r5.f3048a     // Catch: java.lang.Throwable -> L2e
            f1.v r3 = new f1.v     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
            h1.b r4 = new h1.b     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r1 = 0
            f1.f.f3047g = r1     // Catch: java.lang.Throwable -> L16
            i1.i r1 = new i1.i     // Catch: java.lang.Throwable -> L16
            y1.t r2 = r5.f3048a     // Catch: java.lang.Throwable -> L16
            j1.a r2 = r5.d(r2)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            goto L48
        L3d:
            i1.i r1 = new i1.i     // Catch: java.lang.Throwable -> L16
            y1.t r2 = r5.f3048a     // Catch: java.lang.Throwable -> L16
            j1.a r2 = r5.d(r2)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
        L48:
            i1.b r2 = new i1.b     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r2
        L4f:
            monitor-exit(r0)
            throw r1
    }

    public final j1.a d(y1.t r4) {
            r3 = this;
            j1.b r0 = r3.f3050c
            if (r0 != 0) goto L23
            android.content.Context r0 = r4.getContext()
            j1.b r1 = new j1.b
            r1.<init>(r0)
            r0 = 0
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            r0 = 2131099716(0x7f060044, float:1.7811793E38)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setTag(r0, r2)
            r0 = -1
            r4.addView(r1, r0)
            r3.f3050c = r1
            return r1
        L23:
            return r0
    }
}
