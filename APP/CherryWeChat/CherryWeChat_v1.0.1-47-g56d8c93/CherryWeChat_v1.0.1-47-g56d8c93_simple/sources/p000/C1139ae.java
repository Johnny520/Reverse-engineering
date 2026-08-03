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

    public C1139ae(C1219be r7, String r8) {
        this.f3605g = r7;
        this.f3599a = r8;
        int r0 = r7.f4163g;
        File r72 = r7.f4157a;
        this.f3600b = new long[r0];
        this.f3601c = new File[r0];
        this.f3602d = new File[r0];
        StringBuilder r1 = new StringBuilder(r8);
        r1.append('.');
        int r82 = r1.length();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.append(r2);
        this.f3601c[r2] = new File(r72, r1.toString());
        r1.append(".tmp");
        this.f3602d[r2] = new File(r72, r1.toString());
        r1.setLength(r82);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: a */
    public final String m2054a() {
        StringBuilder r0 = new StringBuilder();
        long[] r1 = this.f3600b;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        long r4 = r1[r3];
        r0.append(' ');
        r0.append(r4);
        r3 = r3 + 1;
        goto L3
    L6:
        return r0.toString();
    }
}
