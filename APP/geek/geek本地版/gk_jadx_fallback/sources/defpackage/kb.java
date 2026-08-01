package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kb implements defpackage.ge, java.io.Serializable {
    public final defpackage.ge a;
    public final defpackage.ee b;

    public kb(defpackage.ee r2, defpackage.ge r3) {
            r1 = this;
            java.lang.String r0 = "left"
            defpackage.ip.o(r0, r3)
            r1.<init>()
            r1.a = r3
            r1.b = r2
            return
    }

    @Override // defpackage.ge
    public final defpackage.ee b(defpackage.fe r3) {
            r2 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r3)
            r0 = r2
        L6:
            ee r1 = r0.b
            ee r1 = r1.b(r3)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            ge r0 = r0.a
            boolean r1 = r0 instanceof defpackage.kb
            if (r1 == 0) goto L18
            kb r0 = (defpackage.kb) r0
            goto L6
        L18:
            ee r3 = r0.b(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 == r7) goto L61
            boolean r0 = r7 instanceof defpackage.kb
            r1 = 0
            if (r0 == 0) goto L60
            kb r7 = (defpackage.kb) r7
            r0 = 2
            r2 = r7
            r3 = r0
        Lc:
            ge r2 = r2.a
            boolean r4 = r2 instanceof defpackage.kb
            r5 = 0
            if (r4 == 0) goto L16
            kb r2 = (defpackage.kb) r2
            goto L17
        L16:
            r2 = r5
        L17:
            if (r2 != 0) goto L5d
            r2 = r6
        L1a:
            ge r2 = r2.a
            boolean r4 = r2 instanceof defpackage.kb
            if (r4 == 0) goto L23
            kb r2 = (defpackage.kb) r2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 != 0) goto L5a
            if (r3 != r0) goto L60
            r0 = r6
        L29:
            ee r2 = r0.b
            fe r3 = r2.getKey()
            ee r3 = r7.b(r3)
            boolean r2 = defpackage.ip.i(r3, r2)
            if (r2 != 0) goto L3b
            r7 = r1
            goto L57
        L3b:
            ge r0 = r0.a
            boolean r2 = r0 instanceof defpackage.kb
            if (r2 == 0) goto L44
            kb r0 = (defpackage.kb) r0
            goto L29
        L44:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            defpackage.ip.m(r2, r0)
            ee r0 = (defpackage.ee) r0
            fe r2 = r0.getKey()
            ee r7 = r7.b(r2)
            boolean r7 = defpackage.ip.i(r7, r0)
        L57:
            if (r7 == 0) goto L60
            goto L61
        L5a:
            int r0 = r0 + 1
            goto L1a
        L5d:
            int r3 = r3 + 1
            goto Lc
        L60:
            return r1
        L61:
            r7 = 1
            return r7
    }

    @Override // defpackage.ge
    public final defpackage.ge g(defpackage.fe r4) {
            r3 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r4)
            ee r0 = r3.b
            ee r1 = r0.b(r4)
            ge r2 = r3.a
            if (r1 == 0) goto L10
            return r2
        L10:
            ge r4 = r2.g(r4)
            if (r4 != r2) goto L17
            return r3
        L17:
            wi r1 = defpackage.wi.a
            if (r4 != r1) goto L1c
            return r0
        L1c:
            kb r1 = new kb
            r1.<init>(r0, r4)
            return r1
    }

    @Override // defpackage.ge
    public final java.lang.Object h(java.lang.Object r2, defpackage.wm r3) {
            r1 = this;
            ge r0 = r1.a
            java.lang.Object r2 = r0.h(r2, r3)
            ee r0 = r1.b
            java.lang.Object r2 = r3.e(r2, r0)
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ge r0 = r2.a
            int r0 = r0.hashCode()
            ee r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.ge
    public final defpackage.ge i(defpackage.ge r1) {
            r0 = this;
            ge r1 = defpackage.a80.y(r0, r1)
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            jb r1 = new jb
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.Object r1 = r3.h(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
