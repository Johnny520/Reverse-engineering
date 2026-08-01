package p000;

/* JADX INFO: renamed from: pz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0633pz {

    /* JADX INFO: renamed from: h */
    public static final int f4997h = 8;

    /* JADX INFO: renamed from: a */
    private final String f4998a;

    /* JADX INFO: renamed from: b */
    private final String f4999b;

    /* JADX INFO: renamed from: c */
    private final String f5000c;

    /* JADX INFO: renamed from: d */
    private final int f5001d;

    /* JADX INFO: renamed from: e */
    private final int f5002e;

    /* JADX INFO: renamed from: f */
    private final boolean f5003f;

    /* JADX INFO: renamed from: g */
    private final Object f5004g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0633pz(String str, String str2, String str3, int i, int i2, boolean z, Object obj) {
        this.f4998a = str;
        this.f4999b = str2;
        this.f5000c = str3;
        this.f5001d = i;
        this.f5002e = i2;
        this.f5003f = z;
        this.f5004g = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C0633pz m3165i(C0633pz c0633pz, String str, String str2, String str3, int i, int i2, boolean z, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            str = c0633pz.f4998a;
        }
        if ((i3 & 2) != 0) {
            str2 = c0633pz.f4999b;
        }
        if ((i3 & 4) != 0) {
            str3 = c0633pz.f5000c;
        }
        if ((i3 & 8) != 0) {
            i = c0633pz.f5001d;
        }
        if ((i3 & 16) != 0) {
            i2 = c0633pz.f5002e;
        }
        if ((i3 & 32) != 0) {
            z = c0633pz.f5003f;
        }
        if ((i3 & 64) != 0) {
            obj = c0633pz.f5004g;
        }
        boolean z2 = z;
        Object obj3 = obj;
        int i4 = i2;
        String str4 = str3;
        return c0633pz.m3173h(str, str2, str4, i, i4, z2, obj3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3166a() {
        return this.f4998a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3167b() {
        return this.f4999b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m3168c() {
        return this.f5000c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m3169d() {
        return this.f5001d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m3170e() {
        return this.f5002e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0633pz)) {
            return false;
        }
        C0633pz c0633pz = (C0633pz) obj;
        return p30.m3002l(this.f4998a, c0633pz.f4998a) && p30.m3002l(this.f4999b, c0633pz.f4999b) && p30.m3002l(this.f5000c, c0633pz.f5000c) && this.f5001d == c0633pz.f5001d && this.f5002e == c0633pz.f5002e && this.f5003f == c0633pz.f5003f && p30.m3002l(this.f5004g, c0633pz.f5004g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m3171f() {
        return this.f5003f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m3172g() {
        return this.f5004g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C0633pz m3173h(String str, String str2, String str3, int i, int i2, boolean z, Object obj) {
        return new C0633pz(str, str2, str3, i, i2, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.f4998a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4999b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5000c;
        int iM4145c = AbstractC0748t1.m4145c(AbstractC0748t1.m4144b(this.f5002e, AbstractC0748t1.m4144b(this.f5001d, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31, this.f5003f);
        Object obj = this.f5004g;
        return iM4145c + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m3174j() {
        return this.f5002e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m3175k() {
        return this.f5004g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m3176l() {
        return this.f4998a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m3177m() {
        return this.f5000c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m3178n() {
        return this.f4999b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m3179o() {
        return this.f5001d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m3180p() {
        return this.f5003f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ImageBeanInfo(livePhotoVideoFileId=" + this.f4998a + ", url=" + this.f4999b + ", original=" + this.f5000c + ", width=" + this.f5001d + ", height=" + this.f5002e + ", isLivePhoto=" + this.f5003f + ", livePhotoObject=" + this.f5004g + ")";
    }
}
