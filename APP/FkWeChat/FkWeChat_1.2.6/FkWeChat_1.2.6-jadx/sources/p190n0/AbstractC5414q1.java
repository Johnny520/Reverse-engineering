package p190n0;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p104h3.EnumC2856i;
import p121i3.C3179i;
import p250r1.C6455e;
import p277t2.C8072g0;

/* JADX INFO: renamed from: n0.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5414q1 {

    /* JADX INFO: renamed from: a */
    public static final float f16665a;

    /* JADX INFO: renamed from: b */
    public static final float f16666b;

    /* JADX INFO: renamed from: c */
    public static final C8072g0 f16667c = new C8072g0("SelectionHandleInfo", (InterfaceC0188p) null, 2, (AbstractC1043k) null);

    static {
        float f10 = 25;
        f16665a = C3179i.m12003k(f10);
        f16666b = C3179i.m12003k(f10);
    }

    /* JADX INFO: renamed from: a */
    public static final long m22004a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: b */
    public static final float m22005b() {
        return f16666b;
    }

    /* JADX INFO: renamed from: c */
    public static final float m22006c() {
        return f16665a;
    }

    /* JADX INFO: renamed from: d */
    public static final C8072g0 m22007d() {
        return f16667c;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m22008e(EnumC2856i enumC2856i, boolean z10) {
        if (enumC2856i != EnumC2856i.f7467q || z10) {
            return enumC2856i == EnumC2856i.f7468r && z10;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m22009f(boolean z10, EnumC2856i enumC2856i, boolean z11) {
        return z10 ? m22008e(enumC2856i, z11) : !m22008e(enumC2856i, z11);
    }
}
