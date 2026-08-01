package bsh;

/* JADX INFO: renamed from: bsh.f4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1177f4 extends RuntimeException {

    /* JADX INFO: renamed from: q */
    public C1163d2 f3553q;

    public C1177f4(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, Throwable th) {
        this.f3553q = new C1163d2(str, interfaceC1188h3, c1174f1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3553q.getMessage();
    }
}
