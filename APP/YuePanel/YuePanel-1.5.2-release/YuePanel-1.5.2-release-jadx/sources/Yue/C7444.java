package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7444 extends AbstractC6792<short[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final short[] f22555;

    public C7444(int i) {
        super(i);
        this.f22555 = new short[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m23319(short s) {
        short[] sArr = this.f22555;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        sArr[iM3255] = s;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "<this>");
        return sArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final short[] m23321() {
        return m21493(this.f22555, new short[m21492()]);
    }
}
