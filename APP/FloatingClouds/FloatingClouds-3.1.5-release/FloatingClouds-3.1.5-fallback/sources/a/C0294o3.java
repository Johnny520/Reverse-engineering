package a;

/* JADX INFO: renamed from: a.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0294o3 extends a.C0435w1 {
    public static <T> int c0(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            int r1 = r1.size()
            int r1 = r1 + (-1)
            return r1
    }

    public static <T> java.util.List<T> d0(T... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r0 = "asList(...)"
            a.C0193i9.d(r1, r0)
            return r1
        Ld:
            a.Y5 r1 = a.Y5.f351a
            return r1
    }

    public static java.util.ArrayList e0(java.lang.Object... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            a.E1 r1 = new a.E1
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static void f0() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }
}
