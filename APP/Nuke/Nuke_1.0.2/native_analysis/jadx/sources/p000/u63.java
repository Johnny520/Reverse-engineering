package p000;

import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u63 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final u63 f11119c = new u63(v63.f11798a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        return ((UByteArray) obj).f5697h.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        t63 t63Var = (t63) obj;
        t63Var.getClass();
        byte bMo903r = interfaceC0826vx.mo4558e(this.f2302b, i).mo903r();
        t63Var.mo629b(t63Var.mo630d() + 1);
        byte[] bArr = t63Var.f10584a;
        int i2 = t63Var.f10585b;
        t63Var.f10585b = i2 + 1;
        bArr[i2] = bMo903r;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        byte[] bArr = ((UByteArray) obj).f5697h;
        t63 t63Var = new t63();
        t63Var.f10584a = bArr;
        t63Var.f10585b = bArr.length;
        t63Var.mo629b(10);
        return t63Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new UByteArray(new byte[0]);
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        byte[] bArr = ((UByteArray) obj).f5697h;
        interfaceC0863wx.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1195t(this.f2302b, i2).mo1184i(bArr[i2]);
        }
    }
}
