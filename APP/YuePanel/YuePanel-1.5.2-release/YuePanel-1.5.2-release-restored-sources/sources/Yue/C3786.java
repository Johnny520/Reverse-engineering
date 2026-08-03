package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3786 extends AbstractC6792<char[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final char[] f6972;

    public C3786(int i) {
        super(i);
        this.f6972 = new char[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m10389(char c) {
        char[] cArr = this.f6972;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        cArr[iM3255] = c;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "<this>");
        return cArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final char[] m10391() {
        return m21493(this.f6972, new char[m21492()]);
    }
}
