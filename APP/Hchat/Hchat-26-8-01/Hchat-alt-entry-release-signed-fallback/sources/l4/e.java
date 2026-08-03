package l4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements l4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4.d0 f7838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4.z f7840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h4.u f7841d;

    public e(v4.d0 r1, int r2, v4.z r3, h4.u r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L17
            if (r4 == 0) goto L10
            r0.f7838a = r1
            r0.f7839b = r2
            r0.f7840c = r3
            r0.f7841d = r4
            return
        L10:
            java.lang.String r1 = "attributes == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L17:
            java.lang.String r1 = "definingClass == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // l4.a
    public final v4.d0 b() {
            r1 = this;
            v4.d0 r0 = r1.f7838a
            return r0
    }

    @Override // l4.a
    public final int c() {
            r1 = this;
            int r0 = r1.f7839b
            return r0
    }

    @Override // l4.a
    public final v4.z d() {
            r1 = this;
            v4.z r0 = r1.f7840c
            return r0
    }

    @Override // l4.a
    public final v4.c0 e() {
            r1 = this;
            v4.z r0 = r1.f7840c
            v4.c0 r0 = r0.f14132h
            return r0
    }

    @Override // l4.a
    public final h4.u getAttributes() {
            r1 = this;
            h4.u r0 = r1.f7841d
            return r0
    }

    @Override // l4.a
    public final v4.c0 getName() {
            r1 = this;
            v4.z r0 = r1.f7840c
            v4.c0 r0 = r0.f14131g
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            v4.z r1 = r2.f7840c
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
