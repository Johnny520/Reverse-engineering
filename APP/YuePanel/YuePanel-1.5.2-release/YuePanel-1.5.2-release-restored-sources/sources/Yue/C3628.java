package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3628 extends AbstractC6792<byte[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f6365;

    public C3628(int i) {
        super(i);
        this.f6365 = new byte[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m9770(byte b) {
        byte[] bArr = this.f6365;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        bArr[iM3255] = b;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return bArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final byte[] m9772() {
        return m21493(this.f6365, new byte[m21492()]);
    }
}
