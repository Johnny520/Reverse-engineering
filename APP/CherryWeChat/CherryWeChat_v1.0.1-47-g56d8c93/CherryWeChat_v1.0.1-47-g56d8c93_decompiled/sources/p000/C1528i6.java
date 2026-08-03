package p000;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1528i6 extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C1528i6 f5411c = new C1528i6(C2572u6.f8919a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C1396f6 c1396f6 = (C1396f6) obj;
        byte bMo1774n = interfaceC0919Va.mo1774n(this.f7545b, i);
        c1396f6.mo40b(c1396f6.mo41d() + 1);
        byte[] bArr = c1396f6.f4958a;
        int i2 = c1396f6.f4959b;
        c1396f6.f4959b = i2 + 1;
        bArr[i2] = bMo1774n;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        byte[] bArr = (byte[]) obj;
        C1396f6 c1396f6 = new C1396f6();
        c1396f6.f4958a = bArr;
        c1396f6.f4959b = bArr.length;
        c1396f6.mo40b(10);
        return c1396f6;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new byte[0];
    }
}
