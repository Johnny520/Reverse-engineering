package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4492 extends AbstractC6792<double[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final double[] f9447;

    public C4492(int i) {
        super(i);
        this.f9447 = new double[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m13095(double d) {
        double[] dArr = this.f9447;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        dArr[iM3255] = d;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return dArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final double[] m13097() {
        return m21493(this.f9447, new double[m21492()]);
    }
}
