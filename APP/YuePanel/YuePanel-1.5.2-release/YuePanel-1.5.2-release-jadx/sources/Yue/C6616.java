package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6616 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C6616 f16978 = new C6616(false, false);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C6616 f16979 = new C6616(true, true);

    /* JADX INFO: renamed from: ۥ */
    public final boolean f2176;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f2177;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6616(boolean z, boolean z2) {
        this.f2176 = z;
        this.f2177 = z2;
    }

    /* JADX INFO: renamed from: ۥ */
    public static String m3082(String str) {
        return C6396.m2839(str.trim());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m3083(String str) {
        String strTrim = str.trim();
        return !this.f2177 ? C6396.m2839(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C3456 m20991(C3456 c3456) {
        if (c3456 != null && !this.f2177) {
            c3456.m9206();
        }
        return c3456;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m20992(String str) {
        String strTrim = str.trim();
        return !this.f2176 ? C6396.m2839(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m20993() {
        return this.f2177;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m20994() {
        return this.f2176;
    }

    public C6616(C6616 c6616) {
        this(c6616.f2176, c6616.f2177);
    }
}
