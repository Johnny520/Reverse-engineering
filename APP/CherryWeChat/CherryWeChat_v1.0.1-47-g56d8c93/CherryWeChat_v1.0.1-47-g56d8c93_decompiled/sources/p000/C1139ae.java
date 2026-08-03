package p000;

import java.io.File;

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: classes.dex */
public final class C1139ae {

    /* JADX INFO: renamed from: a */
    public final String f3599a;

    /* JADX INFO: renamed from: b */
    public final long[] f3600b;

    /* JADX INFO: renamed from: c */
    public final File[] f3601c;

    /* JADX INFO: renamed from: d */
    public final File[] f3602d;

    /* JADX INFO: renamed from: e */
    public boolean f3603e;

    /* JADX INFO: renamed from: f */
    public C1094Zd f3604f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1219be f3605g;

    public C1139ae(C1219be c1219be, String str) {
        this.f3605g = c1219be;
        this.f3599a = str;
        int i = c1219be.f4163g;
        File file = c1219be.f4157a;
        this.f3600b = new long[i];
        this.f3601c = new File[i];
        this.f3602d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f3601c[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f3602d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m2054a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f3600b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
