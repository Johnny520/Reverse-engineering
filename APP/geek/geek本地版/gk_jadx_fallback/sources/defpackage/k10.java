package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k10 extends defpackage.n10 implements java.util.Iterator {
    public defpackage.l10 a;
    public defpackage.l10 b;
    public final /* synthetic */ int c;

    public k10(defpackage.l10 r1, defpackage.l10 r2, int r3) {
            r0 = this;
            r0.c = r3
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    @Override // defpackage.n10
    public final void a(defpackage.l10 r4) {
            r3 = this;
            l10 r0 = r3.a
            r1 = 0
            if (r0 != r4) goto Ld
            l10 r0 = r3.b
            if (r4 != r0) goto Ld
            r3.b = r1
            r3.a = r1
        Ld:
            l10 r0 = r3.a
            if (r0 != r4) goto L1d
            int r2 = r3.c
            switch(r2) {
                case 0: goto L19;
                default: goto L16;
            }
        L16:
            l10 r0 = r0.c
            goto L1b
        L19:
            l10 r0 = r0.d
        L1b:
            r3.a = r0
        L1d:
            l10 r0 = r3.b
            if (r0 != r4) goto L2e
            l10 r4 = r3.a
            if (r0 == r4) goto L2c
            if (r4 != 0) goto L28
            goto L2c
        L28:
            l10 r1 = r3.b(r0)
        L2c:
            r3.b = r1
        L2e:
            return
    }

    public final defpackage.l10 b(defpackage.l10 r2) {
            r1 = this;
            int r0 = r1.c
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            l10 r2 = r2.d
            return r2
        L8:
            l10 r2 = r2.c
            return r2
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            l10 r0 = r1.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            l10 r0 = r2.b
            l10 r1 = r2.a
            if (r0 == r1) goto Le
            if (r1 != 0) goto L9
            goto Le
        L9:
            l10 r1 = r2.b(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.b = r1
            return r0
    }
}
