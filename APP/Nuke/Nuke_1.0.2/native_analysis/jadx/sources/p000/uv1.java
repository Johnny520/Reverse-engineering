package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 extends AbstractC0731te {

    /* JADX INFO: renamed from: j */
    public final db2 f11514j;

    /* JADX INFO: renamed from: k */
    public final C0915y9 f11515k;

    public uv1(db2 db2Var) {
        C0915y9 c0915y9M117a;
        this.f11514j = db2Var;
        if (AbstractC0570p7.m3790z(db2Var)) {
            c0915y9M117a = null;
        } else {
            c0915y9M117a = AbstractC0011aa.m117a();
            C0915y9.m6230b(c0915y9M117a, db2Var);
        }
        this.f11515k = c0915y9M117a;
    }

    @Override // p000.AbstractC0731te
    /* JADX INFO: renamed from: D */
    public final o62 mo5004D() {
        db2 db2Var = this.f11514j;
        return new o62(db2Var.f1956a, db2Var.f1957b, db2Var.f1958c, db2Var.f1959d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uv1) {
            return this.f11514j.equals(((uv1) obj).f11514j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11514j.hashCode();
    }
}
