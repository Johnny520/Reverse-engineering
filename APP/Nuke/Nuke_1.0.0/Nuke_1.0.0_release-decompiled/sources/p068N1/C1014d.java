package p068N1;

import java.io.File;

/* JADX INFO: renamed from: N1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1014d {

    /* JADX INFO: renamed from: a */
    public final String f3132a;

    /* JADX INFO: renamed from: b */
    public final long[] f3133b;

    /* JADX INFO: renamed from: c */
    public final File[] f3134c;

    /* JADX INFO: renamed from: d */
    public final File[] f3135d;

    /* JADX INFO: renamed from: e */
    public boolean f3136e;

    /* JADX INFO: renamed from: f */
    public C1013c f3137f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1015e f3138g;

    public C1014d(C1015e c1015e, String str) {
        this.f3138g = c1015e;
        this.f3132a = str;
        int i5 = c1015e.f3145j;
        File file = c1015e.f3139d;
        this.f3133b = new long[i5];
        this.f3134c = new File[i5];
        this.f3135d = new File[i5];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(i6);
            this.f3134c[i6] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f3135d[i6] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m2087a() {
        StringBuilder sb = new StringBuilder();
        for (long j5 : this.f3133b) {
            sb.append(' ');
            sb.append(j5);
        }
        return sb.toString();
    }
}
