package p000;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0298k8 {

    /* JADX INFO: renamed from: a */
    public final int f497a;

    /* JADX INFO: renamed from: b */
    public final String f498b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0298k8(String str, int i) {
        this.f497a = i != 1 ? 2 : 1;
        this.f498b = str == null ? "" : str.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m736a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f497a == 1 ? "u:" : "g:");
        sb.append(this.f498b);
        return sb.toString();
    }
}
