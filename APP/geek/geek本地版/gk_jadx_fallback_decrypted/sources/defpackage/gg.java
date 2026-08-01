package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gg implements defpackage.i20 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public gg(java.io.File r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            hk r2 = defpackage.hk.a
            r1.c = r2
            return
    }

    public gg(java.lang.CharSequence r2, defpackage.oh r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            java.lang.String r0 = "input"
            defpackage.ip.o(r0, r2)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // defpackage.i20
    public final java.util.Iterator iterator() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            fk r0 = new fk
            r0.<init>(r1)
            return r0
        Lb:
            fg r0 = new fg
            r0.<init>(r1)
            return r0
    }
}
