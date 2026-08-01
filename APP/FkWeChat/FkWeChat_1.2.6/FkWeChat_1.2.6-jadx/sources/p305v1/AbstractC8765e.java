package p305v1;

import p215oc.C5729x;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6459i;
import p250r1.C6461k;
import p265s1.AbstractC7124p2;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: v1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8765e {
    /* JADX INFO: renamed from: a */
    public static final void m33727a(InterfaceC8487f interfaceC8487f, C8761c c8761c) {
        c8761c.m33650h(interfaceC8487f.mo18044n1().mo32635i(), interfaceC8487f.mo18044n1().mo32634h());
    }

    /* JADX INFO: renamed from: b */
    public static final void m33728b(C8761c c8761c, AbstractC7124p2 abstractC7124p2) {
        if (abstractC7124p2 instanceof AbstractC7124p2.b) {
            AbstractC7124p2.b bVar = (AbstractC7124p2.b) abstractC7124p2;
            long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(bVar.m28088b().m25583l())) << 32) | (((long) Float.floatToRawIntBits(bVar.m28088b().m25586o())) & 4294967295L));
            C6457g c6457gM28088b = bVar.m28088b();
            float fM25584m = c6457gM28088b.m25584m() - c6457gM28088b.m25583l();
            C6457g c6457gM28088b2 = bVar.m28088b();
            c8761c.m33633U(jM25551e, C6461k.m25616d((((long) Float.floatToRawIntBits(c6457gM28088b2.m25580i() - c6457gM28088b2.m25586o())) & 4294967295L) | (Float.floatToRawIntBits(fM25584m) << 32)));
            return;
        }
        if (abstractC7124p2 instanceof AbstractC7124p2.a) {
            c8761c.m33630R(((AbstractC7124p2.a) abstractC7124p2).m28087b());
            return;
        }
        if (!(abstractC7124p2 instanceof AbstractC7124p2.c)) {
            C5729x.m23182a();
            return;
        }
        AbstractC7124p2.c cVar = (AbstractC7124p2.c) abstractC7124p2;
        if (cVar.m28090c() != null) {
            c8761c.m33630R(cVar.m28090c());
            return;
        }
        C6459i c6459iM28089b = cVar.m28089b();
        long jM25551e2 = C6455e.m25551e((((long) Float.floatToRawIntBits(c6459iM28089b.m25602e())) << 32) | (((long) Float.floatToRawIntBits(c6459iM28089b.m25604g())) & 4294967295L));
        float fM25607j = c6459iM28089b.m25607j();
        c8761c.m33638Z(jM25551e2, C6461k.m25616d((((long) Float.floatToRawIntBits(c6459iM28089b.m25601d())) & 4294967295L) | (Float.floatToRawIntBits(fM25607j) << 32)), Float.intBitsToFloat((int) (c6459iM28089b.m25599b() >> 32)));
    }
}
