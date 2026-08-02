package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tv1 extends AbstractC0731te {

    /* JADX INFO: renamed from: j */
    public final o62 f10974j;

    public tv1(o62 o62Var) {
        this.f10974j = o62Var;
    }

    @Override // p000.AbstractC0731te
    /* JADX INFO: renamed from: D */
    public final o62 mo5004D() {
        return this.f10974j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tv1) {
            return this.f10974j.equals(((tv1) obj).f10974j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10974j.hashCode();
    }
}
