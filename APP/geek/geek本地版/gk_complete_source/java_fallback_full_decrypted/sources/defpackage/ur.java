package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur extends defpackage.d8 implements defpackage.hm, defpackage.xp {
    public final boolean g;

    public ur(defpackage.vr r7) {
            r6 = this;
            java.lang.String r4 = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"
            r5 = 1
            java.lang.Class<ff> r2 = defpackage.ff.class
            java.lang.String r3 = "classSimpleName"
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 0
            r0.g = r7
            return
    }

    @Override // defpackage.hm
    public final java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.b
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public final defpackage.xp d() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L5
            return r1
        L5:
            xp r0 = r1.a
            if (r0 != 0) goto L11
            k00 r0 = defpackage.j00.a
            r0.getClass()
            r1.a = r1
            return r1
        L11:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.ur
            if (r0 == 0) goto L37
            ur r3 = (defpackage.ur) r3
            la r0 = r2.c()
            la r1 = r3.c()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.Object r0 = r2.b
            java.lang.Object r3 = r3.b
            boolean r3 = defpackage.ip.i(r0, r3)
            if (r3 == 0) goto L44
        L35:
            r3 = 1
            return r3
        L37:
            boolean r0 = r3 instanceof defpackage.ur
            if (r0 == 0) goto L44
            xp r0 = r2.d()
            boolean r3 = r3.equals(r0)
            return r3
        L44:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            la r0 = r3.c()
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.d
            int r0 = defpackage.z30.e(r2, r0, r1)
            java.lang.String r1 = r3.e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            xp r0 = r3.d()
            if (r0 == r3) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r1 = r3.d
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = defpackage.z30.l(r0, r1, r2)
            return r0
    }
}
