package a;

/* JADX INFO: renamed from: a.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0048aa extends a.C0282n9 {
    public static int C(int r1) {
            if (r1 >= 0) goto L3
            return r1
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            return r1
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    public static <K, V> java.util.Map<K, V> D(a.C0267mc<? extends K, ? extends V> r1) {
            java.lang.String r0 = "pair"
            a.C0193i9.e(r1, r0)
            A r0 = r1.f578a
            B r1 = r1.b
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "singletonMap(...)"
            a.C0193i9.d(r1, r0)
            return r1
    }
}
