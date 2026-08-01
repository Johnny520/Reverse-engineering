package p105V;

import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;
import p186k.C2404A;
import p186k.C2408E;

/* JADX INFO: renamed from: V.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1479a {

    /* JADX INFO: renamed from: a */
    public final C2408E f5171a;

    /* JADX INFO: renamed from: a */
    public static final Object m2750a(C2408E c2408e) {
        Object objM4272g = c2408e.m4272g(null);
        if (objM4272g == null) {
            return null;
        }
        if (!(objM4272g instanceof C2404A)) {
            c2408e.m4276k(null);
            return objM4272g;
        }
        C2404A c2404a = (C2404A) objM4272g;
        if (c2404a.m4250h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i5 = c2404a.f7767b - 1;
        Object objM4248f = c2404a.m4248f(i5);
        c2404a.m4253k(i5);
        AbstractC1665j.m2983c(objM4248f, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c2404a.m4250h()) {
            c2408e.m4276k(null);
        }
        if (c2404a.f7767b == 1) {
            c2408e.m4278m(null, c2404a.m4247e());
        }
        return objM4248f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p186k.C2404A m2751b(p186k.C2408E r14) {
        /*
            boolean r0 = r14.m4274i()
            if (r0 == 0) goto Le
            k.A r14 = p186k.AbstractC2413J.f7814b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            p117X2.AbstractC1665j.m2983c(r14, r0)
            return r14
        Le:
            k.A r0 = new k.A
            r0.<init>()
            java.lang.Object[] r1 = r14.f7789c
            long[] r14 = r14.f7787a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L1e:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L60
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L5e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof p186k.C2404A
            if (r11 == 0) goto L52
            k.A r10 = (p186k.C2404A) r10
            r0.m4245c(r10)
            goto L5a
        L52:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            p117X2.AbstractC1665j.m2983c(r10, r11)
            r0.m4243a(r10)
        L5a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L5e:
            if (r7 != r8) goto L65
        L60:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L1e
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p105V.C1479a.m2751b(k.E):k.A");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1479a) {
            return AbstractC1665j.m2981a(this.f5171a, ((C1479a) obj).f5171a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5171a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f5171a + ')';
    }
}
