package p000;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244h5 {

    /* JADX INFO: renamed from: a */
    public final String f348a;

    /* JADX INFO: renamed from: b */
    public final String f349b;

    /* JADX INFO: renamed from: c */
    public final String f350c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0244h5(String str, String str2, String str3) {
        this.f348a = str == null ? "" : str.trim();
        this.f349b = str2 != null ? str2.trim() : "";
        this.f350c = AbstractC0260i5.m518C(str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m511a() {
        String str = this.f350c;
        if (str.length() > 0) {
            return str;
        }
        String str2 = this.f348a;
        return str2.startsWith("u_") ? "UID ".concat(AbstractC0260i5.m545L(str2)) : str2;
    }
}
