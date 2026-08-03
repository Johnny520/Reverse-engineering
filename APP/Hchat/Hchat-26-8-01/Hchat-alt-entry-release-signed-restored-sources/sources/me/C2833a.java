package me;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import p012ah.C0086a;
import p025bc.EnumC0251a;
import p068eh.AbstractC0921a;
import p098gc.C1396a;
import p098gc.C1397b;
import p136j8.C2104o;
import p199nd.C2982n;
import p215od.C3129b;
import p246qd.AbstractC3506j;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.AbstractC3516a;
import p247qe.C3535r;
import p247qe.InterfaceC3521d;
import p289te.C4148b;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p332wb.AbstractC4855en;
import p350xd.C5776c;
import p350xd.C5777d;
import p351xe.AbstractC5795p;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: me.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2833a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9224a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean z9;
        switch (this.f9224a) {
            case 0:
                return new C2838f((C3515s) obj);
            case 1:
                return new ArrayList();
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC4855en.m9264h(String.valueOf(entry.getKey()), ": \n -> ", AbstractC5798s.m10516j((Iterable) entry.getValue(), "\n -> "));
            case 3:
                return new HashSet();
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((Set) entry2.getValue()).stream().map(new C2982n(((EnumC0251a) entry2.getKey()).name(), 0));
            case 5:
                return new C3129b();
            case 6:
                return AbstractC3506j.m7362z((String) obj);
            case 7:
                return String.valueOf((AbstractC3506j) obj);
            case 8:
                return ((C3515s) obj).m7410o();
            case 9:
                return ((InterfaceC3521d) obj).getType();
            case 10:
                C4322r c4322r = (C4322r) obj;
                boolean z10 = false;
                try {
                    if (!new C3535r(c4322r).m7445d()) {
                        c4322r.m6383L("Multi-variable type inference failed");
                    }
                    Iterator it = c4322r.f14404D.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                        } else if (!((AbstractC3506j) ((C3515s) it.next()).f11447l.f10677h).mo7345w()) {
                        }
                    }
                } catch (Exception e6) {
                    c4322r.m6383L("Multi-variable type inference failed. Error: " + AbstractC5798s.m10513g(e6));
                }
                return Boolean.valueOf(z10);
            case 11:
                return ((AbstractC3516a) obj).f11450b.stream();
            case 12:
                return new HashSet();
            case 13:
                ((C4148b) obj).f13674i.getClass();
                return "dex-input";
            case 14:
                return AbstractC3506j.m7360x((String) obj);
            case 15:
                return ((C4309e) obj).f14373m;
            case 16:
                return ((C4309e) obj).f14379s;
            case 17:
                return ((C4309e) obj).f14380t.stream();
            case 18:
                return ((C4309e) obj).m8655Z();
            case 19:
                if (obj == null) {
                    return new C1397b();
                }
                C0086a.m445d();
                return null;
            case 20:
                if (obj == null) {
                    return new C1396a();
                }
                C0086a.m445d();
                return null;
            case 21:
                return ((Boolean) obj).booleanValue() ? "yes" : "no";
            case 22:
                String str = (String) obj;
                String lowerCase = str.trim().toLowerCase(Locale.ROOT);
                if (lowerCase.equals("yes") || lowerCase.equals("true")) {
                    z9 = true;
                } else {
                    if (!lowerCase.equals("no") && !lowerCase.equals("false")) {
                        C2104o.m5294t(AbstractC0921a.m2251n("Unknown value '", str, "' for option 'dex-input.verify-checksum', expect: 'yes' or 'no'"));
                        return null;
                    }
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 23:
                return ((InterfaceC4314j) obj).mo8644k();
            case 24:
                return ((C5776c) obj).f23509b;
            case 25:
                return obj == C5777d.f23510m ? "default" : obj.toString();
            case 26:
                return ((C4305a) obj).f14354o;
            case 27:
                C3514r c3514r = (C3514r) obj;
                return AbstractC4855en.m9264h(String.valueOf(c3514r), " from ", String.valueOf(c3514r.f11420j));
            case 28:
                ((AbstractC5795p) obj).getClass();
                throw null;
            default:
                return (AbstractC5795p) obj;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.a.y(ud.r, ud.a, boolean):java.util.ArrayList, a7.a.g(ud.u, mc.a):pd.n, bc.k.e():void, fd.h.<init>():void, g4.a.g(ud.r, gf.a, boolean, java.util.ArrayList):pd.l, nd.o.b(nd.b0, bc.a, java.lang.String):void, nd.o.toString():java.lang.String, od.d.c(ud.u, od.a, java.lang.String, mc.a):od.d, od.d.d(ud.u, jf.h):od.d, p4.t.C(gf.a, boolean):pd.o, qd.s.c(ud.r):java.lang.String, ud.e.f0(jf.b, boolean):void, ud.r.s():java.util.List, ud.t.accept(java.lang.Object):void, xd.b.k():java.lang.String, xd.d.i():java.util.List, xd.d.toString():java.lang.String, xd.d.u():java.util.List, xe.l.b(java.util.List, java.util.function.Function):void, xe.l.l(ud.r, ud.p):void] */
    public /* synthetic */ C2833a(int i9) {
        this.f9224a = i9;
    }
}
