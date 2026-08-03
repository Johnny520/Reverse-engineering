package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7786 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4225 f3081;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final Object[] f3082;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7774<Object>[] f23325;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f23326;

    public C7786(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i) {
        this.f3081 = interfaceC4225;
        this.f3082 = new Object[i];
        this.f23325 = new InterfaceC7774[i];
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3885(@InterfaceC6399 InterfaceC7774<?> interfaceC7774, @InterfaceC6489 Object obj) {
        Object[] objArr = this.f3082;
        int i = this.f23326;
        objArr[i] = obj;
        InterfaceC7774<Object>[] interfaceC7774Arr = this.f23325;
        this.f23326 = i + 1;
        interfaceC7774Arr[i] = interfaceC7774;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3886(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        int length = this.f23325.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC7774<Object> interfaceC7774 = this.f23325[length];
            C5499.m17100(interfaceC7774);
            interfaceC7774.mo12179(interfaceC4225, this.f3082[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
