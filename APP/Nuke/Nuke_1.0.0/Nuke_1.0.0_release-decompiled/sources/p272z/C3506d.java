package p272z;

import com.bumptech.glide.AbstractC1922d;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p204n0.C2684c;
import p204n0.C2685d;
import p204n0.C2686e;
import p211o0.AbstractC2767z;
import p211o0.C2732G;
import p211o0.C2733H;
import p211o0.InterfaceC2738M;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: z.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3506d implements InterfaceC2738M {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3503a f10914a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3503a f10915b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3503a f10916c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3503a f10917d;

    public C3506d(InterfaceC3503a interfaceC3503a, InterfaceC3503a interfaceC3503a2, InterfaceC3503a interfaceC3503a3, InterfaceC3503a interfaceC3503a4) {
        this.f10914a = interfaceC3503a;
        this.f10915b = interfaceC3503a2;
        this.f10916c = interfaceC3503a3;
        this.f10917d = interfaceC3503a4;
    }

    /* JADX INFO: renamed from: b */
    public static C3506d m5760b(C3506d c3506d, InterfaceC3503a interfaceC3503a, InterfaceC3503a interfaceC3503a2, InterfaceC3503a interfaceC3503a3, InterfaceC3503a interfaceC3503a4, int i5) {
        if ((i5 & 1) != 0) {
            interfaceC3503a = c3506d.f10914a;
        }
        if ((i5 & 2) != 0) {
            interfaceC3503a2 = c3506d.f10915b;
        }
        if ((i5 & 4) != 0) {
            interfaceC3503a3 = c3506d.f10916c;
        }
        if ((i5 & 8) != 0) {
            interfaceC3503a4 = c3506d.f10917d;
        }
        c3506d.getClass();
        return new C3506d(interfaceC3503a, interfaceC3503a2, interfaceC3503a3, interfaceC3503a4);
    }

    @Override // p211o0.InterfaceC2738M
    /* JADX INFO: renamed from: a */
    public final AbstractC2767z mo1116a(long j5, EnumC2017m enumC2017m, InterfaceC2007c interfaceC2007c) {
        float fMo5759a = this.f10914a.mo5759a(j5, interfaceC2007c);
        float fMo5759a2 = this.f10915b.mo5759a(j5, interfaceC2007c);
        float fMo5759a3 = this.f10916c.mo5759a(j5, interfaceC2007c);
        float fMo5759a4 = this.f10917d.mo5759a(j5, interfaceC2007c);
        float fM4662b = C2686e.m4662b(j5);
        float f2 = fMo5759a + fMo5759a4;
        if (f2 > fM4662b) {
            float f5 = fM4662b / f2;
            fMo5759a *= f5;
            fMo5759a4 *= f5;
        }
        float f6 = fMo5759a2 + fMo5759a3;
        if (f6 > fM4662b) {
            float f7 = fM4662b / f6;
            fMo5759a2 *= f7;
            fMo5759a3 *= f7;
        }
        if (fMo5759a < 0.0f || fMo5759a2 < 0.0f || fMo5759a3 < 0.0f || fMo5759a4 < 0.0f) {
            AbstractC3204b.m5475a("Corner size in Px can't be negative(topStart = " + fMo5759a + ", topEnd = " + fMo5759a2 + ", bottomEnd = " + fMo5759a3 + ", bottomStart = " + fMo5759a4 + ")!");
        }
        if (fMo5759a + fMo5759a2 + fMo5759a3 + fMo5759a4 == 0.0f) {
            return new C2732G(AbstractC1922d.m3425d(0L, j5));
        }
        C2684c c2684cM3425d = AbstractC1922d.m3425d(0L, j5);
        EnumC2017m enumC2017m2 = EnumC2017m.f6742d;
        float f8 = enumC2017m == enumC2017m2 ? fMo5759a : fMo5759a2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
        if (enumC2017m == enumC2017m2) {
            fMo5759a = fMo5759a2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo5759a)) << 32) | (((long) Float.floatToRawIntBits(fMo5759a)) & 4294967295L);
        float f9 = enumC2017m == enumC2017m2 ? fMo5759a3 : fMo5759a4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
        if (enumC2017m != enumC2017m2) {
            fMo5759a4 = fMo5759a3;
        }
        return new C2733H(new C2685d(c2684cM3425d.f8558a, c2684cM3425d.f8559b, c2684cM3425d.f8560c, c2684cM3425d.f8561d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo5759a4)) << 32) | (((long) Float.floatToRawIntBits(fMo5759a4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3506d)) {
            return false;
        }
        C3506d c3506d = (C3506d) obj;
        return AbstractC1665j.m2981a(this.f10914a, c3506d.f10914a) && AbstractC1665j.m2981a(this.f10915b, c3506d.f10915b) && AbstractC1665j.m2981a(this.f10916c, c3506d.f10916c) && AbstractC1665j.m2981a(this.f10917d, c3506d.f10917d);
    }

    public final int hashCode() {
        return this.f10917d.hashCode() + ((this.f10916c.hashCode() + ((this.f10915b.hashCode() + (this.f10914a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f10914a + ", topEnd = " + this.f10915b + ", bottomEnd = " + this.f10916c + ", bottomStart = " + this.f10917d + ')';
    }
}
