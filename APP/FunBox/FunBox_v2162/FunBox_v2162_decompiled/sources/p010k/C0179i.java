package p010k;

import p000a.AbstractC0001b;
import p011l.C0195c;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0179i extends AbstractC0182l {
    static {
        Float.floatToIntBits(0.0f);
        Float.floatToIntBits(1.0f);
        Float.floatToIntBits(2.0f);
    }

    /* JADX INFO: renamed from: j */
    public static C0179i m435j(int i2) {
        return new C0179i(i2);
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Float.toString(Float.intBitsToFloat(mo438h()));
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f766k;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "float";
    }

    public final String toString() {
        int iMo438h = mo438h();
        return "float{0x" + AbstractC0001b.m13s(iMo438h) + " / " + Float.intBitsToFloat(iMo438h) + '}';
    }
}
