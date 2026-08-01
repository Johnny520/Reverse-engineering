package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw extends defpackage.d8 implements defpackage.hm, defpackage.an, defpackage.xp {
    public final int g;
    public final /* synthetic */ int h;

    public xw(int r7, java.lang.Object r8) {
            r6 = this;
            r6.h = r7
            java.lang.String r4 = "updateEnabledCallbacks()V"
            r5 = 0
            java.lang.Class<androidx.activity.a> r2 = androidx.activity.a.class
            java.lang.String r3 = "updateEnabledCallbacks"
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 0
            r0.g = r7
            return
    }

    @Override // defpackage.hm
    public final java.lang.Object a() {
            r1 = this;
            int r0 = r1.h
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            androidx.activity.a r0 = (androidx.activity.a) r0
            r0.d()
            vh r0 = defpackage.vh.n
            return r0
        Lf:
            java.lang.Object r0 = r1.b
            androidx.activity.a r0 = (androidx.activity.a) r0
            r0.d()
            vh r0 = defpackage.vh.n
            return r0
    }

    @Override // defpackage.an
    public final int b() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final defpackage.xp d() {
            r1 = this;
            k00 r0 = defpackage.j00.a
            r0.getClass()
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L3b
        L3:
            boolean r0 = r3 instanceof defpackage.xw
            if (r0 == 0) goto L3d
            xw r3 = (defpackage.xw) r3
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            int r0 = r2.g
            int r1 = r3.g
            if (r0 != r1) goto L50
            java.lang.Object r0 = r2.b
            java.lang.Object r1 = r3.b
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto L50
            la r0 = r2.c()
            la r3 = r3.c()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L50
        L3b:
            r3 = 1
            return r3
        L3d:
            boolean r0 = r3 instanceof defpackage.xw
            if (r0 == 0) goto L50
            xp r0 = r2.a
            if (r0 != 0) goto L4b
            r2.d()
            r2.a = r2
            r0 = r2
        L4b:
            boolean r3 = r3.equals(r0)
            return r3
        L50:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r3.c()
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
            xp r0 = r3.a
            if (r0 != 0) goto La
            r3.d()
            r3.a = r3
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
            java.lang.String r0 = defpackage.z30.j(r0, r1, r2)
            return r0
    }
}
