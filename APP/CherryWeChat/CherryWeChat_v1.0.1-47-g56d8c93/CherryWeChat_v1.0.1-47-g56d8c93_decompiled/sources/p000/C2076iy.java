package p000;

/* JADX INFO: renamed from: iy */
/* JADX INFO: loaded from: classes.dex */
public final class C2076iy extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2076iy f7331c = new C2076iy(C2120jy.f7449a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C1519hy c1519hy = (C1519hy) obj;
        short sMo1776q = interfaceC0919Va.mo1776q(this.f7545b, i);
        c1519hy.mo40b(c1519hy.mo41d() + 1);
        short[] sArr = c1519hy.f5375a;
        int i2 = c1519hy.f5376b;
        c1519hy.f5376b = i2 + 1;
        sArr[i2] = sMo1776q;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        short[] sArr = (short[]) obj;
        C1519hy c1519hy = new C1519hy();
        c1519hy.f5375a = sArr;
        c1519hy.f5376b = sArr.length;
        c1519hy.mo40b(10);
        return c1519hy;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new short[0];
    }
}
