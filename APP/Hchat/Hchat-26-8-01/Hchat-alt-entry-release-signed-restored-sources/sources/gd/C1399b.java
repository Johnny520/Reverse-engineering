package gd;

import ac.AbstractC0063p;
import ac.C0058k;
import af.C0084g;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.function.Function;
import md.C2829f;
import md.EnumC2824a;
import p003a2.C0014a;
import p005a5.C0016a;
import p014b.C0126e;
import p025bc.C0257g;
import p081fc.C1198a;
import p081fc.C1199b;
import p081fc.C1203f;
import p082fd.C1204a;
import p082fd.C1210g;
import p105h6.C1614f;
import p105h6.C1615g;
import p110hc.InterfaceC1704a;
import p111hd.C1707a;
import p111hd.C1708b;
import p128ic.C2036a;
import p140jd.AbstractC2124c;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: gd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1399b {

    /* JADX INFO: renamed from: c */
    public static final C1614f f4652c;

    /* JADX INFO: renamed from: a */
    public final C4309e f4653a;

    /* JADX INFO: renamed from: b */
    public final C0257g f4654b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1615g c1615gM423p = AbstractC0063p.m423p();
        c1615gM423p.f5303c = 6;
        c1615gM423p.f5309i = false;
        f4652c = c1615gM423p.m4133a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1399b(C4309e c4309e) {
        this.f4653a = c4309e;
        this.f4654b = c4309e.f14371k.f14435a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3802a(C1204a c1204a, AbstractC3506j abstractC3506j) {
        C1203f c1203f = new C1203f(this.f4654b);
        c1204a.m3292s(c1203f, abstractC3506j);
        return c1203f.f4035a.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1707a m3803b(C4309e c4309e, C1204a c1204a) {
        EnumC2824a enumC2824a;
        C0257g c0257g;
        Iterator it;
        String str;
        String[] strArr;
        C0257g c0257g2 = this.f4654b;
        final C1204a c1204a2 = c1204a == null ? new C1204a(c4309e, c0257g2) : new C1204a(c4309e, c1204a);
        C3128a c3128a = c4309e.f14373m;
        C1707a c1707a = new C1707a();
        c1707a.m4339Z(c3128a.m6645j());
        if (c3128a.m6649n()) {
            c3128a.m6642f();
        }
        if (!c4309e.m8658c0()) {
            c4309e.f14375o.getClass();
        }
        int i9 = c4309e.f14375o.f488b;
        AbstractC3506j abstractC3506j = c4309e.f14376p;
        if (abstractC3506j != null && !abstractC3506j.equals(AbstractC3506j.f11394k)) {
            if (!c4309e.f9217g.mo6235a(EnumC2824a.f9169v)) {
                c1707a.m4340a0(m3802a(c1204a2, abstractC3506j));
            }
        }
        if (!c4309e.f14377q.isEmpty()) {
            final int i10 = 0;
            c1707a.m4338Y(AbstractC5798s.m10509c(c4309e.f14377q, new Function(this) { // from class: gd.a

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1399b f4650b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f4650b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i10) {
                        case 0:
                            return this.f4650b.m3802a(c1204a2, (AbstractC3506j) obj);
                        default:
                            return this.f4650b.m3802a(c1204a2, (AbstractC3506j) obj);
                    }
                }
            }));
        }
        C1203f c1203f = new C1203f(c0257g2);
        String str2 = c0257g2.f720F;
        AbstractC2124c.m5341b(c1203f, c4309e);
        AbstractC2124c.m5343d(c1203f, c4309e);
        c1204a2.m3277b(c1203f);
        c1203f.f4035a.getClass();
        c1707a.f5694e = new ArrayList();
        Iterator it2 = c4309e.f14381u.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            enumC2824a = EnumC2824a.f9166s;
            if (!zHasNext) {
                break;
            }
            C4311g c4311g = (C4311g) it2.next();
            C2829f c2829f = c4311g.f9217g;
            C3130c c3130c = c4311g.f14390l;
            if (!c2829f.mo6235a(enumC2824a)) {
                C1708b c1708b = new C1708b();
                String str3 = c3130c.f10147h;
                c3130c.m6655b();
                C1203f c1203f2 = new C1203f(c0257g2);
                c1204a2.m3278c(c1203f2, c4311g);
                c1203f2.f4035a.getClass();
                int i11 = c4311g.f14391m.f488b;
                c1707a.f5694e.add(c1708b);
            }
        }
        c1707a.f5695f = new ArrayList();
        Iterator it3 = c4309e.f14380t.iterator();
        while (it3.hasNext()) {
            C4322r c4322r = (C4322r) it3.next();
            C2829f c2829f2 = c4322r.f9217g;
            C0016a c0016a = c4322r.f14413n;
            C3131d c3131d = c4322r.f14410k;
            if (!c2829f2.mo6235a(enumC2824a)) {
                C1708b c1708b2 = new C1708b();
                c3131d.f10150g.equals(c3131d.f10157n);
                m3802a(c1204a2, c4322r.f14419t);
                final int i12 = 1;
                AbstractC5798s.m10509c(c3131d.f10152i, new Function(this) { // from class: gd.a

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1399b f4650b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f4650b = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        switch (i12) {
                            case 0:
                                return this.f4650b.m3802a(c1204a2, (AbstractC3506j) obj);
                            default:
                                return this.f4650b.m3802a(c1204a2, (AbstractC3506j) obj);
                        }
                    }
                });
                C1210g c1210g = new C1210g(c1204a2, c4322r);
                C1199b c1199b = new C1199b(c0257g2);
                c1210g.m3317b(c1199b);
                c1199b.f4035a.getClass();
                int i13 = c4322r.f14412m.f488b;
                if (c4322r.f14415p) {
                    List list = Collections.EMPTY_LIST;
                } else {
                    C1199b c1199bM8712c = c4322r.f14411l.f14371k.m8712c();
                    try {
                        c1210g.m3319d(c1199bM8712c);
                        C1198a c1198a = (C1198a) c1199bM8712c.m3266w();
                        String str4 = c1198a.f4025b;
                        if (str4.isEmpty()) {
                            List list2 = Collections.EMPTY_LIST;
                        } else {
                            String[] strArrSplit = str4.split(str2);
                            C0126e c0126e = c1198a.f4026c;
                            Map map = (Map) c0126e.f332h;
                            long j3 = (c4322r.f14415p ? 0L : ((C0058k) c0016a.f56i).f176h) + 16;
                            c0257g = c0257g2;
                            int length = strArrSplit.length;
                            it = it3;
                            ArrayList arrayList = new ArrayList(length);
                            int length2 = str2.length();
                            int length3 = 0;
                            str = str2;
                            int i14 = 0;
                            while (i14 < length) {
                                String str5 = strArrSplit[i14];
                                int i15 = length;
                                int i16 = i14;
                                C0014a c0014a = new C0014a(19);
                                C0126e c0126e2 = c0126e;
                                InterfaceC1704a interfaceC1704a = (InterfaceC1704a) ((NavigableMap) c0126e.f333i).get(Integer.valueOf(length3));
                                if (interfaceC1704a instanceof C2036a) {
                                    strArr = strArrSplit;
                                    Long.toHexString((((long) ((C2036a) interfaceC1704a).f6871g) * 2) + j3);
                                } else {
                                    strArr = strArrSplit;
                                }
                                arrayList.add(c0014a);
                                length3 = str5.length() + length2 + length3;
                                i14 = i16 + 1;
                                c0126e = c0126e2;
                                length = i15;
                                strArrSplit = strArr;
                            }
                            Long.toHexString(!c4322r.f14415p ? 0L : ((C0058k) c0016a.f56i).f176h);
                            c1707a.f5695f.add(c1708b2);
                            it3 = it;
                            c0257g2 = c0257g;
                            str2 = str;
                        }
                    } catch (Exception e6) {
                        throw new C0084g("Method generation error", e6);
                    }
                }
                c0257g = c0257g2;
                it = it3;
                str = str2;
                Long.toHexString(!c4322r.f14415p ? 0L : ((C0058k) c0016a.f56i).f176h);
                c1707a.f5695f.add(c1708b2);
                it3 = it;
                c0257g2 = c0257g;
                str2 = str;
            }
        }
        List<C4309e> list3 = c4309e.f14382v;
        if (!list3.isEmpty()) {
            c1707a.f5696g = new ArrayList(list3.size());
            for (C4309e c4309e2 : list3) {
                if (!c4309e2.f9217g.mo6235a(enumC2824a)) {
                    c1707a.f5696g.add(m3803b(c4309e2, c1204a2));
                }
            }
        }
        if (!c4309e.f14373m.m6650o()) {
            Collections.sort(AbstractC5798s.m10509c(c1204a2.m3286l(), new C0640b(19)));
        }
        return c1707a;
    }
}
