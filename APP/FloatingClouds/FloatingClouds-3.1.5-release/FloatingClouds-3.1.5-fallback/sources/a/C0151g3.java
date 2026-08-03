package a;

/* JADX INFO: renamed from: a.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0151g3 implements a.InterfaceC0268md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f479a;
    public final java.lang.String b;
    public final java.util.List<java.lang.String> c;
    public final java.lang.String d;
    public final int e;

    public C0151g3() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public C0151g3(java.lang.String r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            a.Y5 r0 = a.Y5.f351a
            r5 = r5 & 16
            if (r5 == 0) goto L7
            r4 = 0
        L7:
            r1.<init>()
            r1.f479a = r2
            r1.b = r3
            r1.c = r0
            java.lang.String r2 = ""
            r1.d = r2
            r1.e = r4
            return
    }

    @Override // a.InterfaceC0268md
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f479a
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a.C0151g3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.g3 r5 = (a.C0151g3) r5
            java.lang.String r1 = r5.f479a
            java.lang.String r3 = r4.f479a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<java.lang.String> r1 = r4.c
            java.util.List<java.lang.String> r3 = r5.c
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            int r1 = r4.e
            int r5 = r5.e
            if (r1 == r5) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f479a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = a.C0487z.b(r2, r0, r1)
            java.util.List<java.lang.String> r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.d
            int r0 = a.C0487z.b(r0, r2, r1)
            int r1 = r3.e
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClassRule(ruleId="
            r0.<init>(r1)
            java.lang.String r1 = r2.f479a
            r0.append(r1)
            java.lang.String r1 = ", classNameSubstring="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", interfaceNames="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", superClassName="
            r0.append(r1)
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
