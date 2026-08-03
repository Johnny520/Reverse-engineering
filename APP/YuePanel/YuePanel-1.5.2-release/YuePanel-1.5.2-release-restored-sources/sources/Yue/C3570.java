package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3570 extends AbstractC6792<boolean[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final boolean[] f6122;

    public C3570(int i) {
        super(i);
        this.f6122 = new boolean[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m9560(boolean z) {
        boolean[] zArr = this.f6122;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        zArr[iM3255] = z;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 boolean[] zArr) {
        C5499.m17103(zArr, "<this>");
        return zArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean[] m9562() {
        return m21493(this.f6122, new boolean[m21492()]);
    }
}
