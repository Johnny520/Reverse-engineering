package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f10894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qd.j f10895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.List f10896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ic.d f10900g;

    public k() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f10896c = r0
            return
    }

    public final qd.s a() {
            r2 = this;
            java.util.List r0 = r2.f10896c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.List r0 = r2.f10896c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            qd.s r0 = (qd.s) r0
            return r0
        L12:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "CodeVar without SSA variables attached: "
            java.lang.String r0 = r1.concat(r0)
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.f10897d
            if (r0 == 0) goto L7
            java.lang.String r0 = "final "
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            qd.j r1 = r4.f10895b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r4.f10894a
            java.lang.String r3 = " "
            java.lang.String r0 = wb.en.i(r0, r1, r3, r2)
            return r0
    }
}
