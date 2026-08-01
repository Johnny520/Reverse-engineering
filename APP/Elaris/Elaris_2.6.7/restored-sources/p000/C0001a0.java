package p000;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0001a0 {

    /* JADX INFO: renamed from: a */
    public final int f0a;

    /* JADX INFO: renamed from: b */
    public final String f1b;

    /* JADX INFO: renamed from: c */
    public final String f2c;

    /* JADX INFO: renamed from: d */
    public final String f3d;

    /* JADX INFO: renamed from: e */
    public final long f4e;

    /* JADX INFO: renamed from: f */
    public final long f5f;

    /* JADX INFO: renamed from: g */
    public final long f6g;

    /* JADX INFO: renamed from: h */
    public final long f7h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0001a0(int i, String str, String str2, String str3, long j, long j2, long j3, long j4) {
        this.f0a = i;
        this.f1b = str == null ? "" : str;
        this.f2c = str2;
        this.f3d = str3;
        this.f4e = j;
        this.f5f = j2;
        this.f6g = j3;
        this.f7h = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m4a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f0a + "|" + this.f1b);
        sb.append("|");
        sb.append(this.f2c);
        sb.append("|");
        sb.append(this.f3d);
        sb.append("|");
        sb.append(this.f4e);
        sb.append("|");
        sb.append(this.f5f);
        sb.append("|");
        sb.append(this.f6g);
        sb.append("|");
        sb.append(this.f7h);
        return sb.toString();
    }
}
