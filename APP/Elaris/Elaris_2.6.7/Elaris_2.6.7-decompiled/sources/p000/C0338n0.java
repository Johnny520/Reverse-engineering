package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: n0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0338n0 {

    /* JADX INFO: renamed from: a */
    public int f583a;

    /* JADX INFO: renamed from: b */
    public boolean f584b;

    /* JADX INFO: renamed from: c */
    public final Serializable f585c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: long */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Serializable, long[]] */
    public C0338n0(long[] jArr) {
        ?? r8 = (long[]) jArr.clone();
        this.f585c = r8;
        int length = r8.length;
        int i = 0;
        long j = -1;
        while (i < length) {
            long j2 = r8[i];
            if (j2 < 0 || j2 < j) {
                throw new IllegalArgumentException("stage delays must be non-negative and ordered");
            }
            i++;
            j = j2;
        }
    }

    public C0338n0(String str, int i) {
        int iM1071x = AbstractC0486u9.m1071x(i);
        this.f583a = iM1071x;
        this.f584b = iM1071x != 0;
        this.f585c = str;
    }
}
