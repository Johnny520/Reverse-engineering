package p010k;

import p000a.AbstractC0001b;
import p011l.C0195c;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0178h extends AbstractC0183m {
    static {
        Double.doubleToLongBits(0.0d);
        Double.doubleToLongBits(1.0d);
    }

    /* JADX INFO: renamed from: j */
    public static C0178h m434j(long j2) {
        return new C0178h(j2);
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Double.toString(Double.longBitsToDouble(mo439i()));
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f765j;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "double";
    }

    public final String toString() {
        long jMo439i = mo439i();
        return "double{0x" + AbstractC0001b.m14t(jMo439i) + " / " + Double.longBitsToDouble(jMo439i) + '}';
    }
}
