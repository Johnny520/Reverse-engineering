package p119i1;

import p057e1.AbstractC1995w;
import p057e1.C1975c0;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i1.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3144o0 {

    /* JADX INFO: renamed from: a */
    public int f8387a;

    /* JADX INFO: renamed from: b */
    public int[] f8388b = new int[16];

    /* JADX INFO: renamed from: c */
    public C1975c0[] f8389c = new C1975c0[16];

    /* JADX INFO: renamed from: a */
    public final boolean m11830a(Object obj) {
        int iM11831b;
        int i10 = this.f8387a;
        int iM7200a = AbstractC1995w.m7200a(obj);
        if (i10 > 0) {
            iM11831b = m11831b(obj, iM7200a);
            if (iM11831b >= 0) {
                return false;
            }
        } else {
            iM11831b = -1;
        }
        int i11 = -(iM11831b + 1);
        C1975c0[] c1975c0Arr = this.f8389c;
        int length = c1975c0Arr.length;
        if (i10 == length) {
            int i12 = length * 2;
            C1975c0[] c1975c0Arr2 = new C1975c0[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            System.arraycopy(c1975c0Arr, i11, c1975c0Arr2, i13, i10 - i11);
            System.arraycopy(this.f8389c, 0, c1975c0Arr2, 0, i11);
            AbstractC5102r.m20658j(this.f8388b, iArr, i13, i11, i10);
            AbstractC5102r.m20663o(this.f8388b, iArr, 0, 0, i11, 6, null);
            this.f8389c = c1975c0Arr2;
            this.f8388b = iArr;
        } else {
            int i14 = i11 + 1;
            System.arraycopy(c1975c0Arr, i11, c1975c0Arr, i14, i10 - i11);
            int[] iArr2 = this.f8388b;
            AbstractC5102r.m20658j(iArr2, iArr2, i14, i11, i10);
        }
        this.f8389c[i11] = new C1975c0(obj);
        this.f8388b[i11] = iM7200a;
        this.f8387a++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m11831b(Object obj, int i10) {
        int i11 = this.f8387a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f8388b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    C1975c0 c1975c0 = this.f8389c[i13];
                    return obj == (c1975c0 != null ? c1975c0.get() : null) ? i13 : m11832c(i13, obj, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f8387a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f8388b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f8389c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f8387a;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m11832c(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f8388b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            e1.c0[] r2 = r3.f8389c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f8387a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f8388b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            e1.c0[] r2 = r3.f8389c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f8387a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: p119i1.C3144o0.m11832c(int, java.lang.Object, int):int");
    }

    /* JADX INFO: renamed from: d */
    public final int[] m11833d() {
        return this.f8388b;
    }

    /* JADX INFO: renamed from: e */
    public final int m11834e() {
        return this.f8387a;
    }

    /* JADX INFO: renamed from: f */
    public final C1975c0[] m11835f() {
        return this.f8389c;
    }

    /* JADX INFO: renamed from: g */
    public final void m11836g(int i10) {
        this.f8387a = i10;
    }
}
