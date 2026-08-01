package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p80 implements ee, fe {
    public static final p80 a = null;

    static {
        a = new p80();
    }

    @Override // defpackage.ge
    public final ee b(fe r2) {
        ip.o("key", r2);
        if (ip.i(this, r2) == false) goto L5;
        return this;
    L5:
        return null;
    }

    @Override // defpackage.ge
    public final ge g(fe r1) {
        return ff.B(this, r1);
    }

    @Override // defpackage.ge
    public final Object h(Object r1, wm r2) {
        return r2.e(r1, this);
    }

    @Override // defpackage.ge
    public final ge i(ge r1) {
        return ff.E(this, r1);
    }

    @Override // defpackage.ee
    public final fe getKey() {
        return this;
    }
}
