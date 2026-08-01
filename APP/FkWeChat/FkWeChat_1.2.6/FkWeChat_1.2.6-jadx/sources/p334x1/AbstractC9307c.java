package p334x1;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p121i3.EnumC3191u;
import p172l8.C4700i0;
import p250r1.AbstractC6458h;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6461k;
import p265s1.AbstractC7127q0;
import p265s1.AbstractC7133r1;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7134r2;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: x1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9307c {

    /* JADX INFO: renamed from: a */
    public InterfaceC7134r2 f31856a;

    /* JADX INFO: renamed from: b */
    public boolean f31857b;

    /* JADX INFO: renamed from: c */
    public AbstractC7133r1 f31858c;

    /* JADX INFO: renamed from: d */
    public float f31859d = 1.0f;

    /* JADX INFO: renamed from: e */
    public EnumC3191u f31860e = EnumC3191u.f8484q;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0184l f31861f = new a();

    /* JADX INFO: renamed from: x1.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m36281a(InterfaceC8487f interfaceC8487f) {
            AbstractC9307c.this.mo36270j(interfaceC8487f);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m36281a((InterfaceC8487f) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo36267a(float f10);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo36268b(AbstractC7133r1 abstractC7133r1);

    /* JADX INFO: renamed from: c */
    public boolean m36275c(EnumC3191u enumC3191u) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m36276d(float f10) {
        if (this.f31859d == f10) {
            return;
        }
        if (!mo36267a(f10)) {
            if (f10 == 1.0f) {
                InterfaceC7134r2 interfaceC7134r2 = this.f31856a;
                if (interfaceC7134r2 != null) {
                    interfaceC7134r2.mo28060e(f10);
                }
                this.f31857b = false;
            } else {
                m36280i().mo28060e(f10);
                this.f31857b = true;
            }
        }
        this.f31859d = f10;
    }

    /* JADX INFO: renamed from: e */
    public final void m36277e(AbstractC7133r1 abstractC7133r1) {
        if (AbstractC1061t.m3842c(this.f31858c, abstractC7133r1)) {
            return;
        }
        if (!mo36268b(abstractC7133r1)) {
            if (abstractC7133r1 == null) {
                InterfaceC7134r2 interfaceC7134r2 = this.f31856a;
                if (interfaceC7134r2 != null) {
                    interfaceC7134r2.mo28061f(null);
                }
                this.f31857b = false;
            } else {
                m36280i().mo28061f(abstractC7133r1);
                this.f31857b = true;
            }
        }
        this.f31858c = abstractC7133r1;
    }

    /* JADX INFO: renamed from: f */
    public final void m36278f(EnumC3191u enumC3191u) {
        if (this.f31860e != enumC3191u) {
            m36275c(enumC3191u);
            this.f31860e = enumC3191u;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m36279g(InterfaceC8487f interfaceC8487f, long j10, float f10, AbstractC7133r1 abstractC7133r1) {
        m36276d(f10);
        m36277e(abstractC7133r1);
        m36278f(interfaceC8487f.getLayoutDirection());
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() & 4294967295L)) - Float.intBitsToFloat(i11);
        interfaceC8487f.mo18044n1().mo32632f().mo32643h(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.f31857b) {
                        long jM25569c = C6455e.f20314b.m25569c();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        C6457g c6457gM25597c = AbstractC6458h.m25597c(jM25569c, C6461k.m25616d((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        InterfaceC7088i1 interfaceC7088i1Mo32635i = interfaceC8487f.mo18044n1().mo32635i();
                        try {
                            interfaceC7088i1Mo32635i.mo27840l(c6457gM25597c, m36280i());
                            mo36270j(interfaceC8487f);
                            interfaceC7088i1Mo32635i.mo27847w();
                        } catch (Throwable th) {
                            interfaceC7088i1Mo32635i.mo27847w();
                            throw th;
                        }
                    } else {
                        mo36270j(interfaceC8487f);
                    }
                }
            } catch (Throwable th2) {
                interfaceC8487f.mo18044n1().mo32632f().mo32643h(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        interfaceC8487f.mo18044n1().mo32632f().mo32643h(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    /* JADX INFO: renamed from: h */
    public abstract long mo36269h();

    /* JADX INFO: renamed from: i */
    public final InterfaceC7134r2 m36280i() {
        InterfaceC7134r2 interfaceC7134r2 = this.f31856a;
        if (interfaceC7134r2 != null) {
            return interfaceC7134r2;
        }
        InterfaceC7134r2 interfaceC7134r2M28093a = AbstractC7127q0.m28093a();
        this.f31856a = interfaceC7134r2M28093a;
        return interfaceC7134r2M28093a;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo36270j(InterfaceC8487f interfaceC8487f);
}
