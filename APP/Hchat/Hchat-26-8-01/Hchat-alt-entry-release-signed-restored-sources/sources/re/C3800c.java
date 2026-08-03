package re;

import ac.C0058k;
import bd.InterfaceC0268a;
import be.AbstractC0269a;
import com.alibaba.fastjson2.reader.C0632k;
import gf.C1402a;
import gf.C1404c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import nc.C2959b;
import okhttp3.internal.http2.Settings;
import p005a5.C0016a;
import p012ah.C0086a;
import p020b5.C0189h;
import p038ce.C0553f;
import p084ff.C1219e;
import p121i4.C1962c0;
import p129ig.AbstractC2043a;
import p141jf.C2128d;
import p141jf.C2132h;
import p199nd.AbstractC2963b0;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p232pc.C3381c;
import p232pc.C3382d;
import p245qc.C3491a;
import p245qc.C3494d;
import p246qd.AbstractC3506j;
import p281t3.AbstractC4106c;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4325u;
import p351xe.C5787h;
import sc.InterfaceC3952a;

/* JADX INFO: renamed from: re.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3800c extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f12485g = AbstractC2846d.m6274b(C3800c.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m7992i(C1962c0 c1962c0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((C0189h) c1962c0.f6664b).m834c(new C0553f(1));
        ((C0189h) c1962c0.f6665c).m834c(new C0553f(2));
        ((C0189h) c1962c0.f6666d).m834c(new C0553f(3));
        ((C0189h) c1962c0.f6667e).m834c(new C0553f(4));
        ((C0189h) c1962c0.f6668f).m834c(new C0553f(5));
        InterfaceC2844b interfaceC2844b = f12485g;
        if (interfaceC2844b.mo6250d()) {
            interfaceC2844b.mo6270x(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "Apply usage data in {}ms");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m7993j(AbstractC2963b0 abstractC2963b0, C2959b c2959b, C1962c0 c1962c0) {
        c1962c0.m4859c(abstractC2963b0, AbstractC3506j.m7362z(c2959b.f9707b));
        Iterator it = c2959b.f9708c.values().iterator();
        while (it.hasNext()) {
            m7995l(abstractC2963b0, (C2958a) it.next(), c1962c0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m7994k(AbstractC2963b0 abstractC2963b0, C3382d c3382d, C1962c0 c1962c0) {
        if (c3382d != null) {
            HashMap map = c3382d.f10916g;
            if (map.isEmpty()) {
                return;
            }
            Iterator it = (map.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(map.values())).iterator();
            while (it.hasNext()) {
                m7993j(abstractC2963b0, (C2959b) it.next(), c1962c0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m7995l(AbstractC2963b0 abstractC2963b0, C2958a c2958a, C1962c0 c1962c0) {
        Object obj = c2958a.f9705h;
        int iM8279b = AbstractC4106c.m8279b(c2958a.f9704g);
        if (iM8279b == 16) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m7995l(abstractC2963b0, (C2958a) it.next(), c1962c0);
            }
            return;
        }
        if (iM8279b == 17) {
            m7993j(abstractC2963b0, (C2959b) obj, c1962c0);
            return;
        }
        switch (iM8279b) {
            case 10:
                c1962c0.m4859c(abstractC2963b0, AbstractC3506j.m7362z((String) obj));
                break;
            case 11:
            case 12:
                if (obj instanceof C2128d) {
                    c1962c0.m4864h(abstractC2963b0, C3130c.m6654a(abstractC2963b0.mo8668n(), (C2128d) obj));
                } else if (!(obj instanceof C3130c)) {
                    C0086a.m452k("Unexpected field type class: ".concat(String.valueOf(C2958a.class)));
                } else {
                    c1962c0.m4864h(abstractC2963b0, (C3130c) obj);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m7996m(C4325u c4325u, C4322r c4322r, C1402a c1402a, C1962c0 c1962c0) {
        C2132h c2132h;
        C4322r c4322rM8718i;
        C0189h c0189h = (C0189h) c1962c0.f6668f;
        C1404c c1404c = c1402a.f4662d;
        C0058k c0058k = c1402a.f4660b;
        if ((c1404c == null ? 1 : c1404c.f4708b) == 1) {
            return;
        }
        int iM8279b = AbstractC4106c.m8279b(c1404c.f4710d);
        if (iM8279b == 1) {
            c1402a.m3806a();
            c1962c0.m4861e(c4322r, AbstractC3506j.m7362z(c1402a.m3807b()));
            return;
        }
        if (iM8279b == 3) {
            c1402a.m3806a();
            c0058k.m351a((c1402a.f4671m * 8) + ((C1219e) c0058k.f178j).f4087d.f7101e);
            C4311g c4311gM8717h = c4325u.m8717h(c4325u.f14439e.m1199h(new C3130c(C3128a.m6636d(c4325u, c0058k.m373y(c0058k.m346L())), c0058k.m371v(((ByteBuffer) c0058k.f177i).getInt()), AbstractC3506j.m7362z(c0058k.m373y(c0058k.m346L())))));
            if (c4311gM8717h != null) {
                c1962c0.m4862f(c4322r, c4311gM8717h.f14389k);
                ((C0189h) c1962c0.f6667e).m832a(c4311gM8717h, c4322r);
                c1962c0.m4861e(c4322r, c4311gM8717h.f14392n);
                return;
            }
            return;
        }
        if (iM8279b == 4) {
            c1402a.m3806a();
            InterfaceC3952a interfaceC3952a = c1402a.f4672n;
            if (interfaceC3952a != null) {
                c2132h = (C2132h) interfaceC3952a;
            } else {
                int i9 = c1402a.f4671m;
                c2132h = new C2132h();
                c2132h.f7114a = ((((C1219e) c0058k.f178j).f4084a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                c2132h.f7119f = i9;
                c2132h.f7120g = c0058k;
            }
            C4322r c4322rM8718i2 = c4325u.m8718i(C3131d.m6659d(c4325u, c2132h));
            if (c4322rM8718i2 != null) {
                c1962c0.m4862f(c4322r, c4322rM8718i2.f14411l);
                c0189h.m832a(c4322rM8718i2, c4322r);
                c1962c0.m4861e(c4322r, c4322rM8718i2.f14419t);
                c4322rM8718i2.f14410k.f10152i.forEach(new C3799b(c1962c0, c4322r, 0));
                return;
            }
            return;
        }
        if (iM8279b != 5) {
            return;
        }
        c1402a.m3806a();
        C3491a c3491aM5048v = AbstractC2043a.m5048v(c1402a);
        C3494d c3494d = null;
        if (c3491aM5048v != null) {
            ArrayList arrayList = c3491aM5048v.f11351a;
            if (4 < arrayList.size()) {
                C2958a c2958a = (C2958a) arrayList.get(4);
                if (c2958a.f9704g == 16) {
                    c3494d = (C3494d) c2958a.f9705h;
                }
            }
        }
        if (c3494d == null || (c4322rM8718i = c4325u.m8718i(C3131d.m6659d(c4325u, c3494d.m7336a()))) == null) {
            return;
        }
        c1962c0.m4862f(c4322r, c4322rM8718i.f14411l);
        c0189h.m832a(c4322rM8718i, c4322r);
        c1962c0.m4861e(c4322r, c4322rM8718i.f14419t);
        c4322rM8718i.f14410k.f10152i.forEach(new C3799b(c1962c0, c4322r, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        return "UsageInfoVisitor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        C3126c c3126c;
        C0016a c0016a;
        InterfaceC0268a interfaceC0268a = c4325u.f14435a.f743l;
        C1962c0 c1962c0Mo1049f = interfaceC0268a.mo1049f(c4325u);
        if (c1962c0Mo1049f != null) {
            try {
                m7992i(c1962c0Mo1049f);
                return;
            } catch (Exception e6) {
                f12485g.mo6251e("Failed to apply cached usage data", e6);
            }
        }
        C1962c0 c1962c0 = new C1962c0(c4325u);
        for (C4309e c4309e : c4325u.f14448n) {
            c1962c0.m4865i(c4309e.f14376p, new C3798a(c1962c0, c4309e, 0));
            Iterator it = c4309e.f14377q.iterator();
            while (it.hasNext()) {
                c1962c0.m4865i((AbstractC3506j) it.next(), new C3798a(c1962c0, c4309e, 0));
            }
            Iterator it2 = c4309e.f14378r.iterator();
            while (it2.hasNext()) {
                c1962c0.m4865i((AbstractC3506j) it2.next(), new C3798a(c1962c0, c4309e, 0));
            }
            Iterator it3 = c4309e.f14381u.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                c3126c = C3126c.f10128a;
                if (!zHasNext) {
                    break;
                }
                C4311g c4311g = (C4311g) it3.next();
                c1962c0.m4865i(c4311g.f14392n, new C3798a(c1962c0, c4309e, 0));
                m7994k(c4311g, (C3382d) c4311g.f9217g.mo6237c(c3126c), c1962c0);
            }
            m7994k(c4309e, (C3382d) c4309e.f9217g.mo6237c(c3126c), c1962c0);
            for (C4322r c4322r : c4309e.f14380t) {
                m7994k(c4322r, (C3382d) c4322r.f9217g.mo6237c(c3126c), c1962c0);
                C3381c c3381c = (C3381c) c4322r.f9217g.mo6237c(C3126c.f10134g);
                if (c3381c != null) {
                    Iterator it4 = c3381c.f10915g.iterator();
                    while (it4.hasNext()) {
                        m7994k(c4322r, (C3382d) it4.next(), c1962c0);
                    }
                }
                c1962c0.m4861e(c4322r, c4322r.f14419t);
                Iterator it5 = c4322r.mo2218c().iterator();
                while (it5.hasNext()) {
                    c1962c0.m4861e(c4322r, (AbstractC3506j) it5.next());
                }
                try {
                    if (!c4322r.f14415p && (c0016a = c4322r.f14413n) != null) {
                        c0016a.m214r(new C0632k(c4322r.f14411l.f14371k, c4322r, c1962c0, 4));
                    }
                } catch (Exception e7) {
                    C5787h.m10468a(c4322r, "Dependency scan failed", e7);
                }
            }
        }
        interfaceC0268a.mo1050p(c4325u, c1962c0);
        m7992i(c1962c0);
    }
}
