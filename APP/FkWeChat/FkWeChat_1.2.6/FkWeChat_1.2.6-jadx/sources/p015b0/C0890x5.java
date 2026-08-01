package p015b0;

import p018b3.InterfaceC0956i0;

/* JADX INFO: renamed from: b0.x5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890x5 implements InterfaceC0956i0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0956i0 f2797b;

    /* JADX INFO: renamed from: c */
    public final int f2798c;

    /* JADX INFO: renamed from: d */
    public final int f2799d;

    public C0890x5(InterfaceC0956i0 interfaceC0956i0, int i10, int i11) {
        this.f2797b = interfaceC0956i0;
        this.f2798c = i10;
        this.f2799d = i11;
    }

    @Override // p018b3.InterfaceC0956i0
    /* JADX INFO: renamed from: a */
    public int mo3267a(int i10) {
        int iMo3267a = this.f2797b.mo3267a(i10);
        if (i10 >= 0 && i10 <= this.f2799d) {
            AbstractC0897y5.m3302h(iMo3267a, this.f2798c, i10);
        }
        return iMo3267a;
    }

    @Override // p018b3.InterfaceC0956i0
    /* JADX INFO: renamed from: b */
    public int mo3268b(int i10) {
        int iMo3268b = this.f2797b.mo3268b(i10);
        if (i10 >= 0 && i10 <= this.f2798c) {
            AbstractC0897y5.m3301g(iMo3268b, this.f2799d, i10);
        }
        return iMo3268b;
    }
}
