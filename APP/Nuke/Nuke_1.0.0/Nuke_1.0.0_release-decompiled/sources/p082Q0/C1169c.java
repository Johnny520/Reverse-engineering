package p082Q0;

import java.util.Arrays;
import p011B4.AbstractC0231b;
import p260x.C3421d;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1169c {

    /* JADX INFO: renamed from: a */
    public final long f3830a;

    /* JADX INFO: renamed from: b */
    public final long f3831b;

    /* JADX INFO: renamed from: c */
    public final long f3832c;

    /* JADX INFO: renamed from: d */
    public final long f3833d;

    /* JADX INFO: renamed from: e */
    public final long f3834e;

    /* JADX INFO: renamed from: f */
    public final float[] f3835f;

    /* JADX INFO: renamed from: g */
    public final C3421d f3836g;

    public C1169c(long j5, long j6, long j7, long j8, long j9, float[] fArr, C3421d c3421d) {
        this.f3830a = j5;
        this.f3831b = j6;
        this.f3832c = j7;
        this.f3833d = j8;
        this.f3834e = j9;
        this.f3835f = fArr;
        this.f3836g = c3421d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<Q0.c> r2 = p082Q0.C1169c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            Q0.c r7 = (p082Q0.C1169c) r7
            long r2 = r6.f3830a
            long r4 = r7.f3830a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f3831b
            long r4 = r7.f3831b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f3834e
            long r4 = r7.f3834e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f3832c
            long r4 = r7.f3832c
            boolean r2 = p153e1.C2014j.m3700a(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f3833d
            long r4 = r7.f3833d
            boolean r2 = p153e1.C2014j.m3700a(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f3835f
            float[] r3 = r6.f3835f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            x.d r2 = r6.f3836g
            x.d r7 = r7.f3836g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p082Q0.C1169c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM392c = AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(Long.hashCode(this.f3830a) * 31, 31, this.f3831b), 31, this.f3834e), 31, this.f3832c), 31, this.f3833d);
        float[] fArr = this.f3835f;
        return this.f3836g.hashCode() + ((iM392c + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
