package p015b0;

import p004a3.AbstractC0042h;
import p010a9.InterfaceC0173a;
import p104h3.AbstractC2869v;
import p121i3.AbstractC3174d;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;
import p135j2.InterfaceC3578w;
import p185m8.AbstractC5114x;
import p250r1.AbstractC6458h;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6461k;
import p299ub.AbstractC8611a0;
import p319w2.AbstractC9039a0;
import p319w2.C9122q3;
import p319w2.C9147v3;
import p319w2.InterfaceC9143v;

/* JADX INFO: renamed from: b0.q3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0839q3 {

    /* JADX INFO: renamed from: a */
    public static final String f2649a = AbstractC8611a0.m33065J("H", 10);

    /* JADX INFO: renamed from: a */
    public static final long m3157a(C9147v3 c9147v3, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar, String str, int i10) {
        InterfaceC9143v interfaceC9143vM35063a = AbstractC9039a0.m35063a(str, c9147v3, AbstractC3174d.m11985b(0, 0, 0, 0, 15, null), interfaceC3175e, bVar, (64 & 32) != 0 ? AbstractC5114x.m20800o() : AbstractC5114x.m20800o(), (64 & 64) != 0 ? AbstractC5114x.m20800o() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & 256) != 0 ? AbstractC2869v.f7516a.m10306a() : AbstractC2869v.f7516a.m10306a());
        return C3189s.m12082c((((long) AbstractC0783i3.m2945a(interfaceC9143vM35063a.mo35081b())) << 32) | (((long) AbstractC0783i3.m2945a(interfaceC9143vM35063a.mo35080a())) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m3158b(C9147v3 c9147v3, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f2649a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return m3157a(c9147v3, interfaceC3175e, bVar, str, i10);
    }

    /* JADX INFO: renamed from: c */
    public static final C6457g m3159c(C9122q3 c9122q3, InterfaceC3578w interfaceC3578w, int i10, InterfaceC0173a interfaceC0173a) {
        C6457g c6457gM35385d = i10 < c9122q3.m35393l().m35370j().length() ? c9122q3.m35385d(i10) : i10 != 0 ? c9122q3.m35385d(i10 - 1) : new C6457g(0.0f, 0.0f, 1.0f, (int) (((C3189s) interfaceC0173a.invoke()).m12087h() & 4294967295L));
        long jMo13252u0 = interfaceC3578w.mo13252u0(C6455e.m25551e((((long) Float.floatToRawIntBits(c6457gM35385d.m25586o())) & 4294967295L) | (((long) Float.floatToRawIntBits(c6457gM35385d.m25583l())) << 32)));
        return AbstractC6458h.m25597c(C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo13252u0 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo13252u0 & 4294967295L)))) & 4294967295L)), C6461k.m25616d((((long) Float.floatToRawIntBits(c6457gM35385d.m25580i() - c6457gM35385d.m25586o())) & 4294967295L) | (((long) Float.floatToRawIntBits(c6457gM35385d.m25584m() - c6457gM35385d.m25583l())) << 32)));
    }

    /* JADX INFO: renamed from: d */
    public static final String m3160d() {
        return f2649a;
    }
}
