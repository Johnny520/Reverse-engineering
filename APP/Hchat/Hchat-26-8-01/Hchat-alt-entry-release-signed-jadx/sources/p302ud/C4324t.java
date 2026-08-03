package p302ud;

import ac.C0058k;
import af.C0084g;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import me.C2833a;
import mh.InterfaceC2844b;
import p084ff.C1219e;
import p141jf.C2126b;
import p215od.C3128a;
import p246qd.AbstractC3506j;
import p334wd.AbstractC5553a;
import p351xe.AbstractC5798s;
import p351xe.C5787h;

/* JADX INFO: renamed from: ud.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4324t implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14432a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4325u f14433b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4324t(C4325u c4325u, int i9) {
        this.f14432a = i9;
        this.f14433b = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int iM9965a;
        int i9 = this.f14432a;
        C4309e c4309e = null;
        String strConcat = null;
        C4325u c4325u = this.f14433b;
        switch (i9) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                c4325u.getClass();
                C3128a c3128a = (C3128a) entry.getKey();
                List<C4309e> list = (List) entry.getValue();
                InterfaceC2844b interfaceC2844b = AbstractC5553a.f22655a;
                int iM9965a2 = -1;
                for (C4309e c4309e2 : list) {
                    if (c4309e == null || ((iM9965a = AbstractC5553a.m9965a(c4309e2.f14379s)) != -1 && (iM9965a2 == -1 || iM9965a < iM9965a2))) {
                        iM9965a2 = AbstractC5553a.m9965a(c4309e2.f14379s);
                        c4309e = c4309e2;
                    }
                }
                c4325u.f14446l.put(c3128a, c4309e);
                c4325u.f14447m.put(c4309e.m8655Z(), c4309e);
                String str = c4309e.f14379s;
                String str2 = (String) list.stream().map(new C2833a(16)).sorted().collect(Collectors.joining("\n  "));
                C4325u.f14434v.mo6255i("Found duplicated class: {}, count: {}, sources:\n  {}\n Keep class with source: {}, others will be removed.", c3128a, Integer.valueOf(list.size()), str2, str);
                c4309e.m6383L("Classes with same name are omitted, all sources:\n  " + str2 + "\n");
                return;
            default:
                C2126b c2126b = (C2126b) obj;
                c4325u.getClass();
                try {
                    C4309e c4309e3 = new C4309e(c4325u, c2126b);
                    c4325u.f14448n.add(c4309e3);
                    c4325u.f14446l.put(c4309e3.f14373m, c4309e3);
                    c4325u.f14447m.put(c4309e3.m8655Z(), c4309e3);
                    break;
                } catch (Exception e6) {
                    InterfaceC2844b interfaceC2844b2 = C4325u.f14434v;
                    try {
                        String strM5349b = c2126b.m5349b();
                        try {
                            strConcat = C3128a.m6637e(c4325u, AbstractC3506j.m7360x(strM5349b)).f10139h;
                        } catch (Exception e7) {
                            interfaceC2844b2.mo6260n(strM5349b, "Failed to get name for class with type {}", e7);
                        }
                        if (strConcat == null || strConcat.isEmpty()) {
                            strConcat = "CLASS_".concat(strM5349b);
                        }
                        C0058k c0058k = c2126b.f7086a;
                        c0058k.m336B(4);
                        int i10 = ((ByteBuffer) c0058k.f177i).getInt();
                        InterfaceC2844b interfaceC2844b3 = C4309e.f14365F;
                        C3128a c3128aM6637e = C3128a.m6637e(c4325u, AbstractC3506j.m7360x(strConcat));
                        if (c4325u.m8715f(c3128aM6637e) != null) {
                            throw new C0084g("Class already exist: ".concat(strConcat));
                        }
                        C5787h.m10468a(C4309e.m8645T(c4325u, c3128aM6637e, i10), "Load error", e6);
                    } catch (Exception unused) {
                        interfaceC2844b2.mo6260n(((C1219e) c2126b.f7086a.f178j).f4085b, "Failed to load class from file: {}", e6);
                    }
                    break;
                }
                AbstractC5798s.m10507a();
                return;
        }
    }
}
