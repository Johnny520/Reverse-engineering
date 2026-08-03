package p001;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۟.w8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0443w8 {

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final long f1840 = TimeUnit.SECONDS.toNanos(5);

    /* JADX INFO: renamed from: ۥ */
    public int f1172;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f1173;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1841;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final Uri f1842;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final int f1843;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int f1845;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final int f1846;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public final Bitmap.Config f1853;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public final int f1854;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final List<InterfaceC0381rb> f1844 = null;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final boolean f1847 = false;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final boolean f1848 = false;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final boolean f1849 = false;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final float f1850 = 0.0f;

    /* JADX INFO: renamed from: ۥ۠ */
    public final float f1174 = 0.0f;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final float f1851 = 0.0f;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public final boolean f1852 = false;

    /* JADX INFO: renamed from: ۟.w8$a */
    public static final class a {

        /* JADX INFO: renamed from: ۥ */
        public Uri f1175;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1176 = 0;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Bitmap.Config f1855;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public int f1856;

        public a(Uri uri, Bitmap.Config config) {
            this.f1175 = uri;
            this.f1855 = config;
        }
    }

    public C0443w8(Uri uri, int i, int i2, int i3, Bitmap.Config config, int i4) {
        this.f1842 = uri;
        this.f1843 = i;
        this.f1845 = i2;
        this.f1846 = i3;
        this.f1853 = config;
        this.f1854 = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f1843;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f1842);
        }
        List<InterfaceC0381rb> list = this.f1844;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC0381rb interfaceC0381rb : this.f1844) {
                sb.append(' ');
                sb.append(interfaceC0381rb.m930());
            }
        }
        if (this.f1845 > 0) {
            sb.append(" resize(");
            sb.append(this.f1845);
            sb.append(',');
            sb.append(this.f1846);
            sb.append(')');
        }
        if (this.f1847) {
            sb.append(" centerCrop");
        }
        if (this.f1848) {
            sb.append(" centerInside");
        }
        if (this.f1850 != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f1850);
            if (this.f1852) {
                sb.append(" @ ");
                sb.append(this.f1174);
                sb.append(',');
                sb.append(this.f1851);
            }
            sb.append(')');
        }
        if (this.f1853 != null) {
            sb.append(' ');
            sb.append(this.f1853);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m957() {
        return (this.f1845 == 0 && this.f1846 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final String m958() {
        StringBuilder sb;
        long jNanoTime = System.nanoTime() - this.f1173;
        if (jNanoTime > f1840) {
            sb = new StringBuilder();
            sb.append(m1264());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(jNanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(m1264());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m1263() {
        return m957() || this.f1850 != 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final String m1264() {
        StringBuilder sbM1039 = C0167c4.m1039("[R");
        sbM1039.append(this.f1172);
        sbM1039.append(']');
        return sbM1039.toString();
    }
}
