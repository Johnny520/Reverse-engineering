package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k43 extends i43 {

    /* JADX INFO: renamed from: k */
    public final ez1 f5338k;

    public k43(ez1 ez1Var) {
        this.f5338k = ez1Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4270j;
        this.f4270j = i + 2;
        Object[] objArr = this.f4268h;
        return new fk1(this.f5338k, objArr[i], objArr[i + 1]);
    }
}
