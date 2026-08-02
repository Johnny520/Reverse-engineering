package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j43 extends i43 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f4891k;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4891k) {
            case 0:
                int i = this.f4270j;
                this.f4270j = i + 2;
                Object[] objArr = this.f4268h;
                return new se1(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f4270j;
                this.f4270j = i2 + 2;
                return this.f4268h[i2];
            default:
                int i3 = this.f4270j;
                this.f4270j = i3 + 2;
                return this.f4268h[i3 + 1];
        }
    }
}
