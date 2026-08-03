package a;

/* JADX INFO: loaded from: classes.dex */
public class R7 extends a.E2 implements a.Q7, a.InterfaceC0300o9, a.P7 {
    public final int g;
    public final int h;

    public R7(int r7, java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0.g = r7
            r7 = 0
            r0.h = r7
            return
    }

    @Override // a.Q7
    public final int b() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public final a.InterfaceC0300o9 d() {
            r1 = this;
            a.Uc r0 = a.Tc.f281a
            r0.getClass()
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L41
        L3:
            boolean r0 = r3 instanceof a.R7
            if (r0 == 0) goto L43
            a.R7 r3 = (a.R7) r3
            java.lang.String r0 = r3.d
            java.lang.String r1 = r2.d
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56
            int r0 = r2.h
            int r1 = r3.h
            if (r0 != r1) goto L56
            int r0 = r2.g
            int r1 = r3.g
            if (r0 != r1) goto L56
            java.lang.Object r0 = r2.b
            java.lang.Object r1 = r3.b
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L56
            a.a3 r0 = r2.c()
            a.a3 r3 = r3.c()
            boolean r3 = a.C0193i9.a(r0, r3)
            if (r3 == 0) goto L56
        L41:
            r3 = 1
            return r3
        L43:
            boolean r0 = r3 instanceof a.R7
            if (r0 == 0) goto L56
            a.o9 r0 = r2.f66a
            if (r0 != 0) goto L51
            r2.d()
            r2.f66a = r2
            r0 = r2
        L51:
            boolean r3 = r3.equals(r0)
            return r3
        L56:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            a.a3 r0 = r3.c()
            r1 = 31
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            a.a3 r0 = r3.c()
            int r0 = r0.hashCode()
            int r0 = r0 * r1
        L13:
            java.lang.String r2 = r3.d
            int r0 = a.C0487z.b(r2, r0, r1)
            java.lang.String r1 = r3.e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            a.o9 r0 = r3.f66a
            if (r0 != 0) goto La
            r3.d()
            r3.f66a = r3
            r0 = r3
        La:
            if (r0 == r3) goto L11
            java.lang.String r0 = r0.toString()
            return r0
        L11:
            java.lang.String r0 = "<init>"
            java.lang.String r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "constructor (Kotlin reflection is not available)"
            return r0
        L1e:
            java.lang.String r0 = "function "
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = a.C0487z.g(r0, r1, r2)
            return r0
    }
}
