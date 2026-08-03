package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0178h extends AbstractC0183m {
    static {
        Double.doubleToLongBits(0.0d);
        Double.doubleToLongBits(1.0d);
    }

    /* JADX INFO: renamed from: j */
    public static C0178h m434j(long r1) {
        return new C0178h(r1);
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Double.toString(Double.longBitsToDouble(mo439i()));
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f765j;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "double";
    }

    public final String toString() {
        long r0 = mo439i();
        return "double{0x" + RuntimeDexGenerator.m14t(r0) + " / " + Double.longBitsToDouble(r0) + '}';
    }
}
