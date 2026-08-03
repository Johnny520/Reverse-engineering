package a;

/* JADX INFO: loaded from: classes.dex */
public class N1 extends a.C0435w1 {
    public static java.util.ArrayList c0(java.lang.Object[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            if (r3 == 0) goto L10
            r0.add(r3)
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            return r0
    }

    public static <T> T d0(T[] r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            int r0 = r1.length
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public static java.lang.String e0(java.lang.Object[] r6, java.lang.String r7, a.D7 r8, int r9) {
            r0 = r9 & 1
            if (r0 == 0) goto L6
            java.lang.String r7 = ", "
        L6:
            r9 = r9 & 32
            if (r9 == 0) goto Lb
            r8 = 0
        Lb:
            java.lang.String r9 = "<this>"
            a.C0193i9.e(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = ""
            r9.append(r0)
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L1d:
            if (r2 >= r1) goto L2e
            r4 = r6[r2]
            r5 = 1
            int r3 = r3 + r5
            if (r3 <= r5) goto L28
            r9.append(r7)
        L28:
            a.C0282n9.e(r9, r4, r8)
            int r2 = r2 + 1
            goto L1d
        L2e:
            r9.append(r0)
            java.lang.String r6 = r9.toString()
            return r6
    }

    public static <T> java.util.List<T> f0(T[] r2, java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto L9
            goto L1a
        L9:
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "copyOf(...)"
            a.C0193i9.d(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto L1a
            java.util.Arrays.sort(r2, r3)
        L1a:
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r3 = "asList(...)"
            a.C0193i9.d(r2, r3)
            return r2
    }

    public static <T> java.util.List<T> g0(T[] r3) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r3, r0)
            int r0 = r3.length
            if (r0 == 0) goto L1e
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            a.E1 r1 = new a.E1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
        L17:
            r3 = r3[r2]
            java.util.List r3 = a.C0435w1.K(r3)
            return r3
        L1e:
            a.Y5 r3 = a.Y5.f351a
            return r3
    }
}
