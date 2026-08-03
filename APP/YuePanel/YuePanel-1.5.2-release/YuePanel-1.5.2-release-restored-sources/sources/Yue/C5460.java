package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5460 extends AbstractC6792<int[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final int[] f13422;

    public C5460(int i) {
        super(i);
        this.f13422 = new int[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m16975(int i) {
        int[] iArr = this.f13422;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        iArr[iM3255] = i;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "<this>");
        return iArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int[] m16977() {
        return m21493(this.f13422, new int[m21492()]);
    }
}
