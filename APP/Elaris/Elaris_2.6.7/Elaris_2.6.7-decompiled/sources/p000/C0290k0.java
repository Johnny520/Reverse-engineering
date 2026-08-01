package p000;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0290k0 {

    /* JADX INFO: renamed from: a */
    public final int f477a;

    /* JADX INFO: renamed from: b */
    public final String f478b;

    /* JADX INFO: renamed from: c */
    public final long f479c;

    /* JADX INFO: renamed from: d */
    public final long f480d;

    /* JADX INFO: renamed from: e */
    public final long f481e;

    /* JADX INFO: renamed from: f */
    public final String f482f;

    /* JADX INFO: renamed from: g */
    public final long f483g;

    /* JADX INFO: renamed from: h */
    public final long f484h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0290k0(int i, String str, long j, long j2, long j3, String str2, long j4, long j5) {
        this.f477a = i;
        this.f478b = str;
        this.f479c = j;
        this.f480d = j2;
        this.f481e = j3;
        this.f482f = str2;
        this.f483g = j4;
        this.f484h = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m735a() {
        int i = this.f477a;
        if ((i == 1 || i == 2) && this.f478b.length() > 0) {
            return this.f479c > 0 || this.f480d > 0 || this.f481e > 0;
        }
        return false;
    }
}
