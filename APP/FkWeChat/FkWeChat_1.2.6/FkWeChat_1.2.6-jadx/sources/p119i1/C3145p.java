package p119i1;

import java.util.Arrays;
import p117i.C3067k0;

/* JADX INFO: renamed from: i1.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3145p {

    /* JADX INFO: renamed from: a */
    public final C3067k0 f8390a;

    public C3145p(long[] jArr) {
        C3067k0 c3067k0;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c3067k0 = new C3067k0(jArrCopyOf.length);
            c3067k0.m11382e(c3067k0.f8228b, jArrCopyOf);
        } else {
            c3067k0 = new C3067k0(0, 1, null);
        }
        this.f8390a = c3067k0;
    }

    /* JADX INFO: renamed from: a */
    public final void m11837a(long j10) {
        this.f8390a.m11381d(j10);
    }

    /* JADX INFO: renamed from: b */
    public final long[] m11838b() {
        C3067k0 c3067k0 = this.f8390a;
        int i10 = c3067k0.f8228b;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = c3067k0.f8227a;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}
