package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m10 extends defpackage.n10 implements java.util.Iterator {
    public defpackage.l10 a;
    public boolean b;
    public final /* synthetic */ defpackage.o10 c;

    public m10(defpackage.o10 r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r1 = 1
            r0.b = r1
            return
    }

    @Override // defpackage.n10
    public final void a(defpackage.l10 r2) {
            r1 = this;
            l10 r0 = r1.a
            if (r2 != r0) goto Lf
            l10 r2 = r0.d
            r1.a = r2
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.b = r2
        Lf:
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            boolean r0 = r3.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            o10 r0 = r3.c
            l10 r0 = r0.a
            if (r0 == 0) goto Ld
            return r2
        Ld:
            return r1
        Le:
            l10 r0 = r3.a
            if (r0 == 0) goto L17
            l10 r0 = r0.c
            if (r0 == 0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto Le
            r0 = 0
            r1.b = r0
            o10 r0 = r1.c
            l10 r0 = r0.a
            r1.a = r0
            goto L18
        Le:
            l10 r0 = r1.a
            if (r0 == 0) goto L15
            l10 r0 = r0.c
            goto L16
        L15:
            r0 = 0
        L16:
            r1.a = r0
        L18:
            l10 r0 = r1.a
            return r0
    }
}
