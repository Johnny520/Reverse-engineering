package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends defpackage.wu {
    public final /* synthetic */ int l;
    public final /* synthetic */ defpackage.j1 m;

    public f1(defpackage.j1 r9, android.content.Context r10, defpackage.c50 r11, android.view.View r12) {
            r8 = this;
            r0 = 0
            r8.l = r0
            r8.m = r9
            r6 = 2130968608(0x7f040020, float:1.7545874E38)
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            ou r10 = r3.A
            int r10 = r10.x
            r11 = 32
            r10 = r10 & r11
            if (r10 != r11) goto L1b
            goto L25
        L1b:
            i1 r10 = r9.i
            if (r10 != 0) goto L23
            fv r10 = r9.h
            android.view.View r10 = (android.view.View) r10
        L23:
            r1.e = r10
        L25:
            l0 r9 = r9.w
            r1.h = r9
            tu r10 = r1.i
            if (r10 == 0) goto L30
            r10.e(r9)
        L30:
            return
    }

    public f1(defpackage.j1 r9, android.content.Context r10, defpackage.ku r11, android.view.View r12) {
            r8 = this;
            r0 = 1
            r8.l = r0
            r8.m = r9
            r6 = 2130968608(0x7f040020, float:1.7545874E38)
            r7 = 0
            r5 = 1
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10 = 8388613(0x800005, float:1.175495E-38)
            r1.f = r10
            l0 r9 = r9.w
            r1.h = r9
            tu r10 = r1.i
            if (r10 == 0) goto L21
            r10.e(r9)
        L21:
            return
    }

    @Override // defpackage.wu
    public final void c() {
            r3 = this;
            int r0 = r3.l
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            j1 r0 = r3.m
            ku r1 = r0.c
            if (r1 == 0) goto Lf
            r2 = 1
            r1.c(r2)
        Lf:
            r1 = 0
            r0.s = r1
            super.c()
            return
        L16:
            r0 = 0
            j1 r1 = r3.m
            r1.t = r0
            r1.getClass()
            super.c()
            return
    }
}
