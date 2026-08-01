package p076P;

import p091S.AbstractC1236h;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: P.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1066L {

    /* JADX INFO: renamed from: a */
    public static final int f3318a = 1;

    /* JADX INFO: renamed from: b */
    public static final float f3319b = AbstractC1236h.f4213b;

    /* JADX INFO: renamed from: c */
    public static final float f3320c = AbstractC1236h.f4214c;

    /* JADX INFO: renamed from: a */
    public static final void m2128a(InterfaceC2903d interfaceC2903d, int i5, long j5, float f2, float f5) {
        if (i5 == 1) {
            float f6 = f2 / 2.0f;
            InterfaceC2903d.m5100A(interfaceC2903d, j5, f6, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32)) - f6) - f5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) / 2.0f)) & 4294967295L), null, 120);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32)) - f2) - f5;
        InterfaceC2903d.m5104h(interfaceC2903d, j5, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) - f2) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))), 120);
    }
}
