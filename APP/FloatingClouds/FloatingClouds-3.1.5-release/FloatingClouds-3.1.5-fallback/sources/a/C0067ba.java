package a;

/* JADX INFO: renamed from: a.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0067ba extends a.C0048aa {
    public static <K, V> java.util.Map<K, V> E(a.C0267mc<? extends K, ? extends V>... r2) {
            int r0 = r2.length
            if (r0 <= 0) goto L11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = a.C0048aa.C(r1)
            r0.<init>(r1)
            F(r0, r2)
            return r0
        L11:
            a.Z5 r2 = a.Z5.f369a
            return r2
    }

    public static final void F(java.util.LinkedHashMap r4, a.C0267mc[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r5[r1]
            A r3 = r2.f578a
            B r2 = r2.b
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L2
        L10:
            return
    }

    public static java.util.Map G(java.util.ArrayList r3) {
            a.Z5 r0 = a.Z5.f369a
            int r1 = r3.size()
            if (r1 == 0) goto L3d
            r0 = 1
            if (r1 == r0) goto L31
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r3.size()
            int r1 = a.C0048aa.C(r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            a.mc r1 = (a.C0267mc) r1
            A r2 = r1.f578a
            B r1 = r1.b
            r0.put(r2, r1)
            goto L1c
        L30:
            return r0
        L31:
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            a.mc r3 = (a.C0267mc) r3
            java.util.Map r3 = a.C0048aa.D(r3)
            return r3
        L3d:
            return r0
    }

    public static java.util.Map H(java.util.LinkedHashMap r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L38
            r1 = 1
            if (r0 == r1) goto L13
            java.util.LinkedHashMap r2 = I(r2)
            return r2
        L13:
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = java.util.Collections.singletonMap(r0, r2)
            java.lang.String r0 = "with(...)"
            a.C0193i9.d(r2, r0)
            return r2
        L38:
            a.Z5 r2 = a.Z5.f369a
            return r2
    }

    public static java.util.LinkedHashMap I(java.util.Map r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }
}
