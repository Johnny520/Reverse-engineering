package p121i4;

import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import p012ah.C0086a;
import p020b5.C0189h;
import p025bc.AbstractC0255e;
import p066ed.C0909b;
import p071f1.C1005h;
import p149k4.C2240b;
import p163l4.InterfaceC2473b;
import p192n4.C2893a;
import p199nd.AbstractC2963b0;
import p215od.C3130c;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p281t3.AbstractC4106c;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4325u;
import p326w4.C4683c;
import p351xe.AbstractC5798s;
import re.C3798a;
import re.C3799b;

/* JADX INFO: renamed from: i4.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1962c0 {

    /* JADX INFO: renamed from: a */
    public final Object f6663a;

    /* JADX INFO: renamed from: b */
    public final Object f6664b;

    /* JADX INFO: renamed from: c */
    public final Object f6665c;

    /* JADX INFO: renamed from: d */
    public final Object f6666d;

    /* JADX INFO: renamed from: e */
    public final Object f6667e;

    /* JADX INFO: renamed from: f */
    public final Object f6668f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1962c0(C1958a0 c1958a0, C1972m c1972m, C2893a c2893a) {
        InterfaceC2473b interfaceC2473b = c1972m.f6687a;
        if (c2893a == null) {
            C0353j.m1305c("dexOptions == null");
            throw null;
        }
        this.f6663a = c1958a0;
        this.f6664b = c1972m.f6689c.f5258d;
        this.f6665c = c1972m;
        this.f6666d = c1972m.f6691e;
        this.f6667e = new C1005h(this);
        this.f6668f = c2893a;
        C2240b c2240b = c1972m.f6688b;
        c2240b.m5480d();
        if ((c2240b.f7419e & Opcodes.ACC_INTERFACE) == 0 || interfaceC2473b.mo4878d().f14827g.f14760g.equals("<clinit>") || c2893a.m6293a(24)) {
            return;
        }
        String str = String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", (interfaceC2473b.mo4877c() & 8) != 0 ? "static" : "default", 24, 13, interfaceC2473b.mo4876b().f14784g.mo4901a(), interfaceC2473b.mo4878d().mo4901a());
        StringBuilder sbM1027p = AbstractC0255e.m1027p("WARNING in ", interfaceC2473b.mo4876b().f14784g.mo4901a(), ".", interfaceC2473b.mo4878d().mo4901a(), ": ");
        sbM1027p.append(str);
        c2893a.f9349a.println(sbM1027p.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1960b0 m4856a() {
        return new C1960b0("stack mismatch: illegal top-of-stack for opcode", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C4683c m4857b(C4683c c4683c, C4683c c4683c2) {
        C4683c c4683c3;
        C4683c c4683c4 = C4683c.f15645x;
        return c4683c2 == c4683c4 ? c4683c.m9196t() ? c4683c4 : c4683c.m9187e() : (c4683c == C4683c.f15613E && c4683c2.m9192p() && c4683c2.m9190k().m9196t()) ? c4683c2 : (c4683c == C4683c.f15637p && c4683c2 == (c4683c3 = C4683c.f15626R)) ? c4683c3 : c4683c.m9187e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static List m4858j(Set set) {
        if (set == null || set.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m4859c(AbstractC2963b0 abstractC2963b0, AbstractC3506j abstractC3506j) {
        Consumer c3798a;
        String str;
        int iM8279b = AbstractC4106c.m8279b(abstractC2963b0.mo4336j());
        if (iM8279b == 0) {
            c3798a = new C3798a(this, (C4309e) abstractC2963b0, 1);
        } else if (iM8279b == 1) {
            c3798a = new C3798a(this, ((C4311g) abstractC2963b0).f14389k, 2);
        } else {
            if (iM8279b != 2) {
                switch (abstractC2963b0.mo4336j()) {
                    case 1:
                        str = "CLASS";
                        break;
                    case 2:
                        str = "FIELD";
                        break;
                    case 3:
                        str = "METHOD";
                        break;
                    case 4:
                        str = "PKG";
                        break;
                    case 5:
                        str = "VAR";
                        break;
                    case 6:
                        str = "VAR_REF";
                        break;
                    case 7:
                        str = "DECLARATION";
                        break;
                    case 8:
                        str = "OFFSET";
                        break;
                    case 9:
                        str = "END";
                        break;
                    default:
                        str = "null";
                        break;
                }
                C0086a.m452k("Unexpected use type: ".concat(str));
                return;
            }
            c3798a = new C3799b(this, (C4322r) abstractC2963b0, 2);
        }
        m4865i(abstractC3506j, c3798a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m4860d(C4309e c4309e, C4309e c4309e2) {
        C4309e c4309eM8656a0 = c4309e.m8656a0();
        ((C0189h) this.f6664b).m832a(c4309eM8656a0, c4309e2.m8656a0());
        C0189h c0189h = (C0189h) this.f6665c;
        c0189h.m832a(c4309e2, c4309e);
        c0189h.m832a(c4309e2, c4309eM8656a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m4861e(C4322r c4322r, AbstractC3506j abstractC3506j) {
        m4865i(abstractC3506j, new C3799b(this, c4322r, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m4862f(C4322r c4322r, C4309e c4309e) {
        C4309e c4309e2 = c4322r.f14411l;
        m4860d(c4309e2, c4309e);
        if (c4309e2 != c4309e) {
            ((C0189h) this.f6666d).m832a(c4309e, c4322r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m4863g(String str) {
        InterfaceC2473b interfaceC2473b = ((C1972m) this.f6665c).f6687a;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ERROR in ", interfaceC2473b.mo4876b().f14784g.mo4901a(), ".", interfaceC2473b.mo4878d().mo4901a(), ": ");
        sbM1027p.append(str);
        throw new C1960b0(sbM1027p.toString(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m4864h(AbstractC2963b0 abstractC2963b0, C3130c c3130c) {
        C4311g c4311gM8717h = ((C4325u) this.f6663a).m8717h(c3130c);
        if (c4311gM8717h == null) {
            return;
        }
        C4309e c4309e = c4311gM8717h.f14389k;
        int iM8279b = AbstractC4106c.m8279b(abstractC2963b0.mo4336j());
        if (iM8279b == 0) {
            m4860d((C4309e) abstractC2963b0, c4309e);
        } else {
            if (iM8279b != 2) {
                return;
            }
            C4322r c4322r = (C4322r) abstractC2963b0;
            m4862f(c4322r, c4309e);
            ((C0189h) this.f6667e).m832a(c4311gM8717h, c4322r);
            m4861e(c4322r, c4311gM8717h.f14392n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m4865i(AbstractC3506j abstractC3506j, Consumer consumer) {
        C4325u c4325u = (C4325u) this.f6663a;
        if (abstractC3506j == null || abstractC3506j == AbstractC3506j.f11394k) {
            return;
        }
        if (abstractC3506j instanceof C3497a) {
            m4865i(abstractC3506j.mo7341h(), consumer);
            return;
        }
        if (abstractC3506j.mo7351v()) {
            C0909b c0909bM2214c = c4325u.f14453s.m2214c(abstractC3506j);
            if (c0909bM2214c != null && c0909bM2214c.f2831f == 4) {
                c4325u.f14445k.getClass();
            }
            C4309e c4309eM8716g = c4325u.m8716g(abstractC3506j);
            if (c4309eM8716g != null) {
                consumer.accept(c4309eM8716g);
            }
            List listMo7346j = abstractC3506j.mo7346j();
            if (AbstractC5798s.m10520n(listMo7346j)) {
                Iterator it = listMo7346j.iterator();
                while (it.hasNext()) {
                    m4865i((AbstractC3506j) it.next(), consumer);
                }
            }
            List listMo7348i = abstractC3506j.mo7348i();
            if (AbstractC5798s.m10520n(listMo7348i)) {
                Iterator it2 = listMo7348i.iterator();
                while (it2.hasNext()) {
                    m4865i((AbstractC3506j) it2.next(), consumer);
                }
            }
            AbstractC3506j abstractC3506jMo7356r = abstractC3506j.mo7356r();
            if (abstractC3506jMo7356r != null) {
                m4865i(abstractC3506jMo7356r, consumer);
            }
        }
    }

    public C1962c0(C4325u c4325u) {
        this.f6664b = new C0189h();
        this.f6665c = new C0189h();
        this.f6666d = new C0189h();
        this.f6667e = new C0189h();
        this.f6668f = new C0189h();
        this.f6663a = c4325u;
    }
}
