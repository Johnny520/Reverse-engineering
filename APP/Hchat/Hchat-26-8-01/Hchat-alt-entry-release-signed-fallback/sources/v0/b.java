package v0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i0.a2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v0.j f13867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v0.f f13868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f13870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object[] f13871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v0.e f13872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v0.a f13873m;

    public b(v0.j r1, v0.f r2, java.lang.String r3, java.lang.Object r4, java.lang.Object[] r5) {
            r0 = this;
            r0.<init>()
            r0.f13867g = r1
            r0.f13868h = r2
            r0.f13869i = r3
            r0.f13870j = r4
            r0.f13871k = r5
            v0.a r1 = new v0.a
            r2 = 0
            r1.<init>(r0, r2)
            r0.f13873m = r1
            return
    }

    public final void a() {
            r4 = this;
            v0.f r0 = r4.f13868h
            v0.e r1 = r4.f13872l
            if (r1 != 0) goto L62
            if (r0 == 0) goto L61
            v0.a r1 = r4.f13873m
            java.lang.Object r2 = r1.invoke()
            if (r2 == 0) goto L59
            boolean r3 = r0.a(r2)
            if (r3 != 0) goto L59
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            boolean r1 = r2 instanceof w0.n
            if (r1 == 0) goto L51
            w0.n r2 = (w0.n) r2
            i0.e r1 = r2.b()
            i0.e r3 = i0.e.f5867j
            if (r1 == r3) goto L39
            i0.e r1 = r2.b()
            i0.e r3 = i0.e.f5870m
            if (r1 == r3) goto L39
            i0.e r1 = r2.b()
            i0.e r3 = i0.e.f5868k
            if (r1 == r3) goto L39
            java.lang.String r1 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"
            goto L55
        L39:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "MutableState containing "
            r1.<init>(r3)
            java.lang.Object r2 = r2.getValue()
            r1.append(r2)
            java.lang.String r2 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L55
        L51:
            java.lang.String r1 = v0.k.a(r2)
        L55:
            r0.<init>(r1)
            throw r0
        L59:
            java.lang.String r2 = r4.f13869i
            v0.e r0 = r0.e(r2, r1)
            r4.f13872l = r0
        L61:
            return
        L62:
            v0.e r0 = r4.f13872l
            java.lang.String r1 = ") is not null"
            java.lang.String r2 = "entry("
            okio.a.h(r0, r2, r1)
            return
    }

    @Override // i0.a2
    public final void d() {
            r1 = this;
            v0.e r0 = r1.f13872l
            if (r0 == 0) goto L9
            b5.c r0 = (b5.c) r0
            r0.Z()
        L9:
            return
    }

    @Override // i0.a2
    public final void f() {
            r1 = this;
            v0.e r0 = r1.f13872l
            if (r0 == 0) goto L9
            b5.c r0 = (b5.c) r0
            r0.Z()
        L9:
            return
    }

    @Override // i0.a2
    public final void j() {
            r0 = this;
            r0.a()
            return
    }
}
