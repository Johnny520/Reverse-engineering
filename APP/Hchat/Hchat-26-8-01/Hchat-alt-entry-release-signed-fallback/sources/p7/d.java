package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.d f10274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.d f10275s;

    public d() {
            r3 = this;
            r0 = 516(0x204, float:7.23E-43)
            r3.<init>(r0)
            r7.d r0 = new r7.d
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            r3.f10274r = r0
            r7.d r2 = new r7.d
            r2.<init>(r1)
            r3.f10275s = r2
            r3.P(r0)
            r3.P(r2)
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.Q()
            r1 = 16
            if (r0 == r1) goto Ld
            java.lang.String r0 = super.toString()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.d> r1 = p7.d.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {count="
            r0.append(r1)
            r7.d r1 = r2.f10274r
            r0.append(r1)
            java.lang.String r1 = ", actor="
            r0.append(r1)
            r7.d r1 = r2.f10275s
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
