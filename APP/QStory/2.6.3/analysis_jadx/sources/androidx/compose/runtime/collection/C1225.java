package androidx.compose.runtime.collection;

import androidx.collection.C0236;
import androidx.collection.C0244;
import io.ktor.util.C4211;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0236 f3522;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.collection.C0244 m2056(androidx.collection.C0236 r14) {
        /*
            boolean r0 = r14.m760()
            if (r0 == 0) goto Lc
            androidx.collection.飘花落叶言子世哲苏楪兰 r14 = androidx.collection.AbstractC0287.f1002
            r14.getClass()
            return r14
        Lc:
            androidx.collection.飘花落叶言子世哲苏楪兰 r0 = new androidx.collection.飘花落叶言子世哲苏楪兰
            r0.<init>()
            java.lang.Object[] r1 = r14.f879
            long[] r14 = r14.f881
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1c:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof androidx.collection.C0244
            if (r11 == 0) goto L50
            androidx.collection.飘花落叶言子世哲苏楪兰 r10 = (androidx.collection.C0244) r10
            r0.m774(r10)
            goto L56
        L50:
            r10.getClass()
            r0.m775(r10)
        L56:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L5a:
            if (r7 != r8) goto L61
        L5c:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1c
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.C1225.m2056(androidx.collection.飘花落叶言子世兰楪苏哲):androidx.collection.飘花落叶言子世哲苏楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m2057(C0236 c0236) {
        Object objM757 = c0236.m757(null);
        if (objM757 == null) {
            return null;
        }
        if (!(objM757 instanceof C0244)) {
            c0236.m758(null);
            return objM757;
        }
        C0244 c0244 = (C0244) objM757;
        if (c0244.m879()) {
            C4211.m8617("List is empty.");
            return null;
        }
        int i = c0244.f1004 - 1;
        Object objM881 = c0244.m881(i);
        c0244.m777(i);
        objM881.getClass();
        if (c0244.m879()) {
            c0236.m758(null);
        }
        if (c0244.f1004 == 1) {
            c0236.m755(null, c0244.m882());
        }
        return objM881;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1225) {
            return this.f3522.equals(((C1225) obj).f3522);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3522.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f3522 + ')';
    }
}
