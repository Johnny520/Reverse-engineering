package p182m5;

import bsh.C1193i2;
import bsh.C1259t2;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Collection;
import p006a5.AbstractC0068d;
import p225p5.C5953a;
import p225p5.C5957e;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6516u;
import p254r5.C6488a0;
import p254r5.C6490b0;
import p254r5.C6491c;
import p254r5.C6492c0;
import p254r5.C6493d;
import p254r5.C6496e0;
import p254r5.C6497f;
import p254r5.C6499g;
import p254r5.C6505j;
import p254r5.C6506k;
import p254r5.C6507l;
import p254r5.C6508m;
import p254r5.C6509n;
import p254r5.C6510o;
import p254r5.C6513r;
import p254r5.C6517v;
import p254r5.C6519x;
import p254r5.C6520y;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4980a1 {

    /* JADX INFO: renamed from: a */
    public final C5009p f15118a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8819a f15119b;

    public C4980a1(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        if (c5009p == null) {
            C1259t2.m5095a("file == null");
            throw null;
        }
        if (interfaceC8819a == null) {
            C1259t2.m5095a("out == null");
            throw null;
        }
        this.f15118a = c5009p;
        this.f15119b = interfaceC8819a;
    }

    /* JADX INFO: renamed from: a */
    public static void m20102a(C5009p c5009p, C5953a c5953a) {
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        C5020u0 c5020u0M20259t = c5009p.m20259t();
        c5024w0M20260u.m20313u(c5953a.m23933z());
        for (C5957e c5957e : c5953a.m23932y()) {
            c5020u0M20259t.m20303u(c5957e.m23944c());
            m20103b(c5009p, c5957e.m23945g());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20103b(C5009p c5009p, AbstractC6487a abstractC6487a) {
        if (abstractC6487a instanceof C6491c) {
            m20102a(c5009p, ((C6491c) abstractC6487a).m25736k());
            return;
        }
        if (!(abstractC6487a instanceof C6493d)) {
            c5009p.m20263x(abstractC6487a);
            return;
        }
        C6493d.a aVarM25746k = ((C6493d) abstractC6487a).m25746k();
        int size = aVarM25746k.size();
        for (int i10 = 0; i10 < size; i10++) {
            m20103b(c5009p, aVarM25746k.get(i10));
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m20104c(AbstractC6487a abstractC6487a) {
        if (m20105d(abstractC6487a) == 30) {
            return "null";
        }
        return abstractC6487a.mo25729j() + ' ' + abstractC6487a.mo6828g();
    }

    /* JADX INFO: renamed from: d */
    public static int m20105d(AbstractC6487a abstractC6487a) {
        if (abstractC6487a instanceof C6499g) {
            return 0;
        }
        if (abstractC6487a instanceof C6490b0) {
            return 2;
        }
        if (abstractC6487a instanceof C6505j) {
            return 3;
        }
        if (abstractC6487a instanceof C6510o) {
            return 4;
        }
        if (abstractC6487a instanceof C6517v) {
            return 6;
        }
        if (abstractC6487a instanceof C6509n) {
            return 16;
        }
        if (abstractC6487a instanceof C6506k) {
            return 17;
        }
        if (abstractC6487a instanceof C6488a0) {
            return 21;
        }
        if (abstractC6487a instanceof C6519x) {
            return 22;
        }
        if (abstractC6487a instanceof C6492c0) {
            return 23;
        }
        if (abstractC6487a instanceof C6496e0) {
            return 24;
        }
        if (abstractC6487a instanceof C6508m) {
            return 25;
        }
        if (abstractC6487a instanceof C6520y) {
            return 26;
        }
        if (abstractC6487a instanceof C6507l) {
            return 27;
        }
        if (abstractC6487a instanceof C6493d) {
            return 28;
        }
        if (abstractC6487a instanceof C6491c) {
            return 29;
        }
        if (abstractC6487a instanceof C6513r) {
            return 30;
        }
        if (abstractC6487a instanceof C6497f) {
            return 31;
        }
        C1193i2.m4438a("Shouldn't happen");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public void m20106e(C5953a c5953a, boolean z10) {
        boolean z11 = z10 && this.f15119b.mo33828k();
        C5020u0 c5020u0M20259t = this.f15118a.m20259t();
        C5024w0 c5024w0M20260u = this.f15118a.m20260u();
        C6496e0 c6496e0M23933z = c5953a.m23933z();
        int iM20311s = c5024w0M20260u.m20311s(c6496e0M23933z);
        if (z11) {
            this.f15119b.mo33823a("  type_idx: " + AbstractC8826h.m33901j(iM20311s) + " // " + c6496e0M23933z.mo6828g());
        }
        this.f15119b.mo33868i(c5024w0M20260u.m20311s(c5953a.m23933z()));
        Collection<C5957e> collectionM23932y = c5953a.m23932y();
        int size = collectionM23932y.size();
        if (z11) {
            this.f15119b.mo33823a("  size: " + AbstractC8826h.m33901j(size));
        }
        this.f15119b.mo33868i(size);
        int i10 = 0;
        for (C5957e c5957e : collectionM23932y) {
            C6492c0 c6492c0M23944c = c5957e.m23944c();
            int iM20301s = c5020u0M20259t.m20301s(c6492c0M23944c);
            AbstractC6487a abstractC6487aM23945g = c5957e.m23945g();
            if (z11) {
                this.f15119b.mo33825d(0, "  elements[" + i10 + "]:");
                i10++;
                this.f15119b.mo33823a("    name_idx: " + AbstractC8826h.m33901j(iM20301s) + " // " + c6492c0M23944c.mo6828g());
            }
            this.f15119b.mo33868i(iM20301s);
            if (z11) {
                this.f15119b.mo33823a("    value: " + m20104c(abstractC6487aM23945g));
            }
            m20108g(abstractC6487aM23945g);
        }
        if (z11) {
            this.f15119b.mo33827j();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m20107f(C6493d c6493d, boolean z10) {
        boolean z11 = z10 && this.f15119b.mo33828k();
        C6493d.a aVarM25746k = c6493d.m25746k();
        int size = aVarM25746k.size();
        if (z11) {
            this.f15119b.mo33823a("  size: " + AbstractC8826h.m33901j(size));
        }
        this.f15119b.mo33868i(size);
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC6487a abstractC6487a = aVarM25746k.get(i10);
            if (z11) {
                this.f15119b.mo33823a("  [" + Integer.toHexString(i10) + "] " + m20104c(abstractC6487a));
            }
            m20108g(abstractC6487a);
        }
        if (z11) {
            this.f15119b.mo33827j();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m20108g(AbstractC6487a abstractC6487a) {
        int iM20105d = m20105d(abstractC6487a);
        if (iM20105d != 0 && iM20105d != 6 && iM20105d != 2) {
            if (iM20105d == 3) {
                AbstractC0068d.m223c(this.f15119b, iM20105d, ((AbstractC6516u) abstractC6487a).mo25797t());
                return;
            }
            if (iM20105d != 4) {
                if (iM20105d == 16) {
                    AbstractC0068d.m221a(this.f15119b, iM20105d, ((C6509n) abstractC6487a).mo25797t() << 32);
                    return;
                }
                if (iM20105d == 17) {
                    AbstractC0068d.m221a(this.f15119b, iM20105d, ((C6506k) abstractC6487a).mo25797t());
                    return;
                }
                switch (iM20105d) {
                    case Opcodes.ILOAD /* 21 */:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20256q().m20267s(((C6488a0) abstractC6487a).m25731k()));
                        break;
                    case Opcodes.LLOAD /* 22 */:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20254o().m20155s((C6519x) abstractC6487a));
                        break;
                    case Opcodes.FLOAD /* 23 */:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20259t().m20301s((C6492c0) abstractC6487a));
                        break;
                    case Opcodes.DLOAD /* 24 */:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20260u().m20311s((C6496e0) abstractC6487a));
                        break;
                    case Opcodes.ALOAD /* 25 */:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20249j().m20307t((C6508m) abstractC6487a));
                        break;
                    case 26:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20255p().m20180t((C6520y) abstractC6487a));
                        break;
                    case 27:
                        AbstractC0068d.m223c(this.f15119b, iM20105d, this.f15118a.m20249j().m20307t(((C6507l) abstractC6487a).m25778p()));
                        break;
                    case 28:
                        this.f15119b.writeByte(iM20105d);
                        m20107f((C6493d) abstractC6487a, false);
                        break;
                    case 29:
                        this.f15119b.writeByte(iM20105d);
                        m20106e(((C6491c) abstractC6487a).m25736k(), false);
                        break;
                    case 30:
                        this.f15119b.writeByte(iM20105d);
                        break;
                    case 31:
                        this.f15119b.writeByte((((C6497f) abstractC6487a).mo25796s() << 5) | iM20105d);
                        break;
                    default:
                        C1193i2.m4438a("Shouldn't happen");
                        break;
                }
                return;
            }
        }
        AbstractC0068d.m222b(this.f15119b, iM20105d, ((AbstractC6516u) abstractC6487a).mo25797t());
    }
}
