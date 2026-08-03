package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends r7.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.nio.charset.CharsetDecoder f11577n = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.String f11578m;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r7.r.f11577n = r0
            return
    }

    @Override // r7.b
    public final void L() {
            r1 = this;
            byte[] r0 = r1.f11553k
            java.lang.String r0 = r1.N(r0)
            r1.f11578m = r0
            return
    }

    public abstract java.lang.String N(byte[] r1);
}
