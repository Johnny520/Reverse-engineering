package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0179i extends AbstractC0182l {
    static {
        Float.floatToIntBits(0.0f);
        Float.floatToIntBits(1.0f);
        Float.floatToIntBits(2.0f);
    }

    /* JADX INFO: renamed from: j */
    public static C0179i m435j(int r1) {
        return new C0179i(r1);
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Float.toString(Float.intBitsToFloat(mo438h()));
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f766k;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "float";
    }

    public final String toString() {
        int r0 = mo438h();
        return "float{0x" + RuntimeDexGenerator.m13s(r0) + " / " + Float.intBitsToFloat(r0) + '}';
    }
}
