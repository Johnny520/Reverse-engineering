package androidx.compose.ui.semantics;

import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.collection.C0266;
import androidx.collection.C0279;
import java.util.Iterator;
import kotlin.InterfaceC5168;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.C5554;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1956 implements InterfaceC1944, Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f5776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0266 f5777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f5778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0236 f5779;

    public C1956() {
        long[] jArr = AbstractC0290.f1007;
        this.f5779 = new C0236();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1956)) {
            return false;
        }
        C1956 c1956 = (C1956) obj;
        return AbstractC4395.m8907(this.f5779, c1956.f5779) && this.f5778 == c1956.f5778 && this.f5776 == c1956.f5776;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5776) + AbstractC0053.m141(this.f5779.hashCode() * 31, 31, this.f5778);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0266 c0266 = this.f5777;
        if (c0266 == null) {
            C0236 c0236 = this.f5779;
            c0236.getClass();
            C0266 c02662 = new C0266(c0236);
            this.f5777 = c02662;
            c0266 = c02662;
        }
        return ((C0279) c0266.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f5778
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f5776
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            androidx.collection.飘花落叶言子世兰楪苏哲 r4 = r0.f5779
            java.lang.Object[] r5 = r4.f880
            java.lang.Object[] r6 = r4.f879
            long[] r4 = r4.f881
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            androidx.compose.ui.semantics.飘花落叶言子楪兰苏哲世 r8 = (androidx.compose.ui.semantics.C1947) r8
            r1.append(r2)
            java.lang.String r2 = r8.f5758
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = androidx.compose.ui.platform.AbstractC1916.m3624(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.C1956.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3670(C1956 c1956) {
        C0236 c0236 = c1956.f5779;
        Object[] objArr = c0236.f880;
        Object[] objArr2 = c0236.f879;
        long[] jArr = c0236.f881;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C1947 c1947 = (C1947) obj;
                        C0236 c02362 = this.f5779;
                        Object objM757 = c02362.m757(c1947);
                        c1947.getClass();
                        Object objInvoke = c1947.f5757.invoke(objM757, obj2);
                        if (objInvoke != null) {
                            c02362.m755(c1947, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m3671(C1947 c1947) {
        Object objM757 = this.f5779.m757(c1947);
        if (objM757 != null) {
            return objM757;
        }
        C5554.m10883(c1947, "Key not present: ", " - consider getOrElse or getOrNull");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.semantics.C1956 m3672() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r1 = new androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲
            r1.<init>()
            boolean r2 = r0.f5778
            r1.f5778 = r2
            boolean r2 = r0.f5776
            r1.f5776 = r2
            androidx.collection.飘花落叶言子世兰楪苏哲 r2 = r1.f5779
            r2.getClass()
            androidx.collection.飘花落叶言子世兰楪苏哲 r0 = r0.f5779
            r0.getClass()
            java.lang.Object[] r3 = r0.f880
            java.lang.Object[] r4 = r0.f879
            long[] r0 = r0.f881
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L60
            r6 = 0
            r7 = r6
        L26:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L40:
            if (r12 >= r10) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.m755(r14, r13)
        L55:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L40
        L59:
            if (r10 != r11) goto L60
        L5b:
            if (r7 == r5) goto L60
            int r7 = r7 + 1
            goto L26
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.C1956.m3672():androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲");
    }

    @Override // androidx.compose.ui.semantics.InterfaceC1944
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3590(C1947 c1947, Object obj) {
        boolean z = obj instanceof C1941;
        C0236 c0236 = this.f5779;
        if (z && c0236.m752(c1947)) {
            Object objM757 = c0236.m757(c1947);
            objM757.getClass();
            C1941 c1941 = (C1941) objM757;
            C1941 c19412 = (C1941) obj;
            String str = c19412.f5707;
            if (str == null) {
                str = c1941.f5707;
            }
            InterfaceC5168 interfaceC5168 = c19412.f5706;
            if (interfaceC5168 == null) {
                interfaceC5168 = c1941.f5706;
            }
            c0236.m755(c1947, new C1941(str, interfaceC5168));
        } else {
            c0236.m755(c1947, obj);
        }
        c1947.getClass();
    }
}
