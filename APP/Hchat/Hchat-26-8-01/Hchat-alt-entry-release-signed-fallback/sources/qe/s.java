package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.s f10985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qd.j f10987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.List f10988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.util.List f10990f;

    public s(qd.s r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f10989e = r0
            r1.f10985a = r2
            return
    }

    public final boolean a() {
            r3 = this;
            boolean r0 = r3.f10986b
            if (r0 == 0) goto L5
            goto L21
        L5:
            java.util.List r0 = r3.f10988d
            int r0 = r0.size()
            int r1 = r3.f10989e
            r2 = 1
            int r1 = r1 + r2
            int r1 = r1 % r0
            r3.f10989e = r1
            java.util.List r0 = r3.f10988d
            java.lang.Object r0 = r0.get(r1)
            qd.j r0 = (qd.j) r0
            r3.f10987c = r0
            int r0 = r3.f10989e
            if (r0 != 0) goto L21
            return r2
        L21:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            qd.s r1 = r2.f10985a
            java.lang.String r1 = r1.o()
            r0.append(r1)
            boolean r1 = r2.f10986b
            if (r1 == 0) goto L1d
            java.lang.String r1 = ", resolved type: "
            r0.append(r1)
            qd.j r1 = r2.f10987c
            r0.append(r1)
            goto L3b
        L1d:
            java.lang.String r1 = ", currentType="
            r0.append(r1)
            qd.j r1 = r2.f10987c
            r0.append(r1)
            java.lang.String r1 = ", candidateTypes="
            r0.append(r1)
            java.util.List r1 = r2.f10988d
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            java.util.List r1 = r2.f10990f
            r0.append(r1)
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
