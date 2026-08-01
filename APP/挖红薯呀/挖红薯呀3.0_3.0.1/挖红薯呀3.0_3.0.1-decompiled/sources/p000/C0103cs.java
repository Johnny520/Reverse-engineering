package p000;

/* JADX INFO: renamed from: cs */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0103cs implements y00 {

    /* JADX INFO: renamed from: d */
    public final boolean f884d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0103cs(boolean z) {
        this.f884d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y00
    /* JADX INFO: renamed from: b */
    public final boolean mo599b() {
        return this.f884d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y00
    /* JADX INFO: renamed from: d */
    public final sj0 mo600d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f884d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
