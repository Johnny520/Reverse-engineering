package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᛳᲇᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0725 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3386;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3387;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long[] f3388;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0016 f3389;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final File[] f3390;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2115 f3391;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final File[] f3392;

    public C0725(C0016 c0016, String str) {
        this.f3389 = c0016;
        this.f3387 = str;
        int i = c0016.f2682;
        File file = c0016.f2690;
        this.f3388 = new long[i];
        if (c0016.f2689) {
            this.f3390 = new File[i];
            this.f3392 = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.f3390[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.f3392[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final File m1666(int i) {
        File[] fileArr = this.f3390;
        if (fileArr != null) {
            return fileArr[i];
        }
        return new File(this.f3389.f2690, this.f3387 + "." + i);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final File m1667(int i) {
        File[] fileArr = this.f3392;
        if (fileArr != null) {
            return fileArr[i];
        }
        return new File(this.f3389.f2690, this.f3387 + "." + i + ".tmp");
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m1668() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f3388) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
