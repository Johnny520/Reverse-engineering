package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4886 extends AbstractC6792<float[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final float[] f11237;

    public C4886(int i) {
        super(i);
        this.f11237 = new float[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m15087(float f) {
        float[] fArr = this.f11237;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        fArr[iM3255] = f;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return fArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final float[] m15089() {
        return m21493(this.f11237, new float[m21492()]);
    }
}
