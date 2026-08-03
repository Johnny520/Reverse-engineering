package a;

/* JADX INFO: renamed from: a.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0338qb implements a.InterfaceC0268md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f656a;
    public final java.lang.String b;
    public final java.util.List<java.lang.String> c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final boolean g;

    public C0338qb(java.lang.String r1, java.lang.String r2, java.util.List r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f656a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r1 = 80
            r0.f = r1
            r0.g = r6
            return
    }

    @Override // a.InterfaceC0268md
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f656a
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L50
        L3:
            boolean r0 = r3 instanceof a.C0338qb
            if (r0 != 0) goto L8
            goto L4e
        L8:
            a.qb r3 = (a.C0338qb) r3
            java.lang.String r0 = r3.f656a
            java.lang.String r1 = r2.f656a
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 != 0) goto L15
            goto L4e
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L20
            goto L4e
        L20:
            java.util.List<java.lang.String> r0 = r2.c
            java.util.List<java.lang.String> r1 = r3.c
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L4e
        L2b:
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L36
            goto L4e
        L36:
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L41
            goto L4e
        L41:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 == r1) goto L48
            goto L4e
        L48:
            boolean r0 = r2.g
            boolean r3 = r3.g
            if (r0 == r3) goto L50
        L4e:
            r3 = 0
            return r3
        L50:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f656a
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
            java.lang.String r2 = r3.e
            int r0 = a.C0487z.b(r2, r0, r1)
            int r2 = r3.f
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.g
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MethodRule(ruleId="
            r0.<init>(r1)
            java.lang.String r1 = r2.f656a
            r0.append(r1)
            java.lang.String r1 = ", returnType="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", paramTypes="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", methodNameSubstring="
            r0.append(r1)
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", declaredClassRuleId="
            r0.append(r1)
            java.lang.String r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", searchSuperClasses="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
