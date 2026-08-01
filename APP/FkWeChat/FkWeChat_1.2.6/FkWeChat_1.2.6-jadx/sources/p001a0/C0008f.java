package p001a0;

import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p250r1.AbstractC6451a;
import p250r1.AbstractC6460j;
import p250r1.AbstractC6462l;
import p250r1.C6457g;
import p265s1.AbstractC7124p2;

/* JADX INFO: renamed from: a0.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0008f extends AbstractC0003a {
    public C0008f(InterfaceC0004b interfaceC0004b, InterfaceC0004b interfaceC0004b2, InterfaceC0004b interfaceC0004b3, InterfaceC0004b interfaceC0004b4) {
        super(interfaceC0004b, interfaceC0004b2, interfaceC0004b3, interfaceC0004b4);
    }

    @Override // p001a0.AbstractC0003a
    /* JADX INFO: renamed from: d */
    public AbstractC7124p2 mo6d(long j10, float f10, float f11, float f12, float f13, EnumC3191u enumC3191u) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new AbstractC7124p2.b(AbstractC6462l.m25629b(j10));
        }
        C6457g c6457gM25629b = AbstractC6462l.m25629b(j10);
        EnumC3191u enumC3191u2 = EnumC3191u.f8484q;
        float f14 = enumC3191u == enumC3191u2 ? f10 : f11;
        long jM25527b = AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
        float f15 = enumC3191u == enumC3191u2 ? f11 : f10;
        long jM25527b2 = AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32));
        float f16 = enumC3191u == enumC3191u2 ? f12 : f13;
        long jM25527b3 = AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L));
        float f17 = enumC3191u == enumC3191u2 ? f13 : f12;
        return new AbstractC7124p2.c(AbstractC6460j.m25609b(c6457gM25629b, jM25527b, jM25527b2, jM25527b3, AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0008f)) {
            return false;
        }
        C0008f c0008f = (C0008f) obj;
        return AbstractC1061t.m3842c(m10h(), c0008f.m10h()) && AbstractC1061t.m3842c(m9g(), c0008f.m9g()) && AbstractC1061t.m3842c(m7e(), c0008f.m7e()) && AbstractC1061t.m3842c(m8f(), c0008f.m8f());
    }

    public int hashCode() {
        return (((((m10h().hashCode() * 31) + m9g().hashCode()) * 31) + m7e().hashCode()) * 31) + m8f().hashCode();
    }

    @Override // p001a0.AbstractC0003a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0008f mo5b(InterfaceC0004b interfaceC0004b, InterfaceC0004b interfaceC0004b2, InterfaceC0004b interfaceC0004b3, InterfaceC0004b interfaceC0004b4) {
        return new C0008f(interfaceC0004b, interfaceC0004b2, interfaceC0004b3, interfaceC0004b4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + m10h() + ", topEnd = " + m9g() + ", bottomEnd = " + m7e() + ", bottomStart = " + m8f() + ')';
    }
}
