package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends defpackage.t50 {
    public final /* synthetic */ int e;

    public p90(int r1, java.lang.Class r2, int r3, int r4, int r5) {
            r0 = this;
            r0.e = r5
            r0.<init>()
            r0.a = r1
            r0.d = r2
            r0.c = r3
            r0.b = r4
            return
    }

    @Override // defpackage.t50
    public final java.lang.Object b(android.view.View r2) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L13;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            boolean r2 = defpackage.ca0.c(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Le:
            java.lang.CharSequence r2 = defpackage.ca0.b(r2)
            return r2
        L13:
            boolean r2 = defpackage.ca0.d(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // defpackage.t50
    public final void c(android.view.View r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L15;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            defpackage.ca0.g(r2, r3)
            return
        Lf:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            defpackage.ca0.h(r2, r3)
            return
        L15:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            defpackage.ca0.i(r2, r3)
            return
    }

    @Override // defpackage.t50
    public final boolean e(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L32;
                case 1: goto L27;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L15
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r0
        L16:
            if (r4 == 0) goto L20
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            if (r3 != r4) goto L24
            r0 = r1
        L24:
            r3 = r0 ^ 1
            return r3
        L27:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            r3 = r3 ^ 1
            return r3
        L32:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L42
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L42
            r3 = r1
            goto L43
        L42:
            r3 = r0
        L43:
            if (r4 == 0) goto L4d
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
            r4 = r1
            goto L4e
        L4d:
            r4 = r0
        L4e:
            if (r3 != r4) goto L51
            r0 = r1
        L51:
            r3 = r0 ^ 1
            return r3
    }
}
