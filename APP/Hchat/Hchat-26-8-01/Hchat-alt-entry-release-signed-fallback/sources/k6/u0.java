package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements h6.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f7373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f7374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h6.n f7375i;

    public u0(java.lang.Class r1, java.lang.Class r2, h6.n r3) {
            r0 = this;
            r0.<init>()
            r0.f7373g = r1
            r0.f7374h = r2
            r0.f7375i = r3
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r1, n6.a r2) {
            r0 = this;
            java.lang.Class r1 = r2.f9028a
            java.lang.Class r2 = r0.f7373g
            if (r1 == r2) goto Ld
            java.lang.Class r2 = r0.f7374h
            if (r1 != r2) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            h6.n r1 = r0.f7375i
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f7374h
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class r1 = r2.f7373g
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            h6.n r1 = r2.f7375i
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
