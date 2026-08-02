package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g90 {

    /* JADX INFO: renamed from: a */
    public final String f3358a;

    /* JADX INFO: renamed from: b */
    public final long[] f3359b;

    /* JADX INFO: renamed from: c */
    public final File[] f3360c;

    /* JADX INFO: renamed from: d */
    public final File[] f3361d;

    /* JADX INFO: renamed from: e */
    public boolean f3362e;

    /* JADX INFO: renamed from: f */
    public f90 f3363f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ h90 f3364g;

    public g90(h90 h90Var, String str) {
        this.f3364g = h90Var;
        this.f3358a = str;
        int i = h90Var.f3914n;
        File file = h90Var.f3908h;
        this.f3359b = new long[i];
        if (h90Var.f3915o) {
            this.f3360c = new File[i];
            this.f3361d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.f3360c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.f3361d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final File m1812a(int i) {
        File[] fileArr = this.f3360c;
        if (fileArr != null) {
            return fileArr[i];
        }
        return new File(this.f3364g.f3908h, this.f3358a + "." + i);
    }

    /* JADX INFO: renamed from: b */
    public final File m1813b(int i) {
        File[] fileArr = this.f3361d;
        if (fileArr != null) {
            return fileArr[i];
        }
        return new File(this.f3364g.f3908h, this.f3358a + "." + i + ".tmp");
    }

    /* JADX INFO: renamed from: c */
    public final String m1814c() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f3359b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
