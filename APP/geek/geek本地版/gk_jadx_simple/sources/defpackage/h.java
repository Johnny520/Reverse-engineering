package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ee {
    public final fe a;

    public h(fe r1) {
        this.a = r1;
    }

    @Override // defpackage.ge
    public ee b(fe r2) {
        ip.o("key", r2);
        if (ip.i(getKey(), r2) == false) goto L5;
        return this;
    L5:
        return null;
    }

    @Override // defpackage.ge
    public ge g(fe r1) {
        return ff.B(this, r1);
    }

    @Override // defpackage.ee
    public final fe getKey() {
        return this.a;
    }

    @Override // defpackage.ge
    public final Object h(Object r1, wm r2) {
        return r2.e(r1, this);
    }

    @Override // defpackage.ge
    public final ge i(ge r1) {
        return ff.E(this, r1);
    }
}
