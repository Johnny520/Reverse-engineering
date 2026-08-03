package p302ud;

import ac.C0058k;
import ae.C0074e;
import af.C0084g;
import be.C0280f0;
import be.C0282g0;
import bsh.C0353j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.function.Function;
import md.AbstractC2828e;
import md.C2829f;
import md.EnumC2824a;
import me.C2833a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import p012ah.C0086a;
import p020b5.C0189h;
import p020b5.C0192k;
import p025bc.C0262l;
import p025bc.InterfaceC0253c;
import p025bc.InterfaceC0254d;
import p069f.C0956r;
import p081fc.C1202e;
import p083fe.C1214a;
import p084ff.C1219e;
import p096g8.C1367h;
import p110hc.InterfaceC1704a;
import p121i4.C1962c0;
import p128ic.C2037b;
import p136j8.C2095f;
import p141jf.AbstractC2125a;
import p141jf.C2126b;
import p141jf.C2128d;
import p141jf.C2130f;
import p199nd.AbstractC2963b0;
import p199nd.C2981m;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3129b;
import p215od.C3130c;
import p232pc.C3379a;
import p232pc.C3380b;
import p232pc.C3381c;
import p232pc.C3382d;
import p232pc.C3384f;
import p232pc.C3385g;
import p232pc.C3389k;
import p245qc.C3495e;
import p246qd.AbstractC3506j;
import p246qd.C3510n;
import p246qd.EnumC3513q;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;
import p351xe.C5787h;

/* JADX INFO: renamed from: ud.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4309e extends AbstractC2963b0 implements Comparable {

    /* JADX INFO: renamed from: F */
    public static final InterfaceC2844b f14365F = AbstractC2846d.m6274b(C4309e.class);

    /* JADX INFO: renamed from: A */
    public List f14366A;

    /* JADX INFO: renamed from: B */
    public List f14367B;

    /* JADX INFO: renamed from: C */
    public List f14368C;

    /* JADX INFO: renamed from: D */
    public Map f14369D;

    /* JADX INFO: renamed from: E */
    public C0262l f14370E;

    /* JADX INFO: renamed from: k */
    public final C4325u f14371k;

    /* JADX INFO: renamed from: l */
    public final C2126b f14372l;

    /* JADX INFO: renamed from: m */
    public final C3128a f14373m;

    /* JADX INFO: renamed from: n */
    public C4323s f14374n;

    /* JADX INFO: renamed from: o */
    public C0192k f14375o;

    /* JADX INFO: renamed from: p */
    public AbstractC3506j f14376p;

    /* JADX INFO: renamed from: q */
    public List f14377q;

    /* JADX INFO: renamed from: r */
    public List f14378r;

    /* JADX INFO: renamed from: s */
    public String f14379s;

    /* JADX INFO: renamed from: t */
    public List f14380t;

    /* JADX INFO: renamed from: u */
    public List f14381u;

    /* JADX INFO: renamed from: v */
    public List f14382v;

    /* JADX INFO: renamed from: w */
    public List f14383w;

    /* JADX INFO: renamed from: x */
    public C4309e f14384x;

    /* JADX INFO: renamed from: y */
    public volatile int f14385y;

    /* JADX INFO: renamed from: z */
    public List f14386z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4309e(C4325u c4325u, C2126b c2126b) {
        List list = Collections.EMPTY_LIST;
        this.f14378r = list;
        this.f14382v = list;
        this.f14383w = list;
        this.f14384x = this;
        this.f14385y = 1;
        this.f14386z = list;
        this.f14366A = list;
        this.f14367B = list;
        this.f14368C = list;
        this.f14369D = Collections.EMPTY_MAP;
        this.f14371k = c4325u;
        C3128a c3128aM6637e = C3128a.m6637e(c4325u, AbstractC3506j.m7360x(c2126b.m5349b()));
        this.f14373m = c3128aM6637e;
        C4323s c4323sM8708I = C4323s.m8708I(c4325u, c3128aM6637e.m6647l());
        c4323sM8708I.f14430o.add(this);
        this.f14374n = c4323sM8708I;
        C0058k c0058kM356g = c2126b.f7086a.m356g();
        C0956r c0956r = c2126b.f7087b;
        C2126b c2126b2 = new C2126b(c0058kM356g, new C0956r(((C0058k) c0956r.f3013f).m356g(), ((C0058k) c0956r.f3014g).m356g()));
        this.f14372l = c2126b2;
        m8661f0(c2126b2, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static C4309e m8645T(C4325u c4325u, C3128a c3128a, int i9) {
        C4309e c4309e = new C4309e(c4325u, c3128a, i9);
        c4309e.m6231w(EnumC2824a.f9159m);
        c4309e.f14379s = "synthetic";
        c4309e.f14385y = 4;
        c4325u.f14448n.add(c4309e);
        c4325u.f14446l.put(c4309e.f14373m, c4309e);
        c4325u.f14447m.put(c4309e.m8655Z(), c4309e);
        return c4309e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8646g0(C4309e c4309e) {
        C2829f c2829f = c4309e.f9217g;
        C3126c c3126c = C3126c.f10132e;
        C3380b c3380b = (C3380b) c2829f.mo6237c(c3126c);
        if (c3380b != null) {
            c4309e.m6228E(c3126c);
            for (Map.Entry entry : c3380b.f10914g.entrySet()) {
                C4322r c4322rM8669n0 = c4309e.m8669n0((String) entry.getKey());
                if (c4322rM8669n0 != null) {
                    c4322rM8669n0.m6233y(new C3379a((C2958a) entry.getValue()));
                } else {
                    c4309e.m6383L("Method from annotation default annotation not found: " + ((String) entry.getKey()));
                }
            }
        }
        C3128a c3128a = c4309e.f14373m;
        C2829f c2829f2 = c4309e.f9217g;
        C3126c c3126c2 = C3126c.f10130c;
        C3389k c3389k = (C3389k) c2829f2.mo6237c(c3126c2);
        if (c3389k == null) {
            return;
        }
        String strM9262f = c3389k.f10926g;
        if (strM9262f.endsWith(".java")) {
            strM9262f = AbstractC4855en.m9262f(5, 0, strM9262f);
        }
        if (!strM9262f.isEmpty() && !strM9262f.equals("SourceFile")) {
            if (c3128a == null) {
                return;
            }
            String str = c3128a.f10139h;
            if (!strM9262f.equals(str)) {
                C3128a c3128a2 = c3128a.f10142k;
                while (true) {
                    if (c3128a2 != null) {
                        String str2 = c3128a2.f10139h;
                        if (str2.equals(strM9262f) || str2.startsWith(strM9262f.concat("$"))) {
                            break;
                        } else {
                            c3128a2 = c3128a2.f10142k;
                        }
                    } else if (strM9262f.contains("$")) {
                        if (!strM9262f.endsWith("$" + str)) {
                            if (!str.contains("$") || !str.startsWith(strM9262f)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        c4309e.m6228E(c3126c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static void m8647h0(InterfaceC0254d interfaceC0254d) {
        NavigableMap navigableMap = (NavigableMap) interfaceC0254d.mo1011c().f333i;
        if (navigableMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : navigableMap.entrySet()) {
            InterfaceC1704a interfaceC1704a = (InterfaceC1704a) entry.getValue();
            if (interfaceC1704a.mo4336j() == 7) {
                ((C2037b) interfaceC1704a).f6872g.mo4337t(((Integer) entry.getKey()).intValue());
            }
        }
        navigableMap.values().removeIf(new C4306b(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: O */
    public final C0192k mo6386O() {
        return this.f14375o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: P */
    public final C4309e mo6387P() {
        if (m8659d0()) {
            return this.f14384x;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: Q */
    public final void mo6388Q(C0192k c0192k) {
        this.f14375o = c0192k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m8648R(C4311g c4311g) {
        List list = this.f14381u;
        if (list == null || list.isEmpty()) {
            this.f14381u = new ArrayList(1);
        }
        this.f14381u.add(c4311g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m8649S(C4309e c4309e) {
        if (this.f14383w.isEmpty()) {
            this.f14383w = new ArrayList(5);
        }
        c4309e.m6233y(new C2981m(this));
        this.f14383w.add(c4309e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final AbstractC3506j m8650U(C2126b c2126b) {
        C0058k c0058k = c2126b.f7086a;
        c0058k.m336B(8);
        String strM373y = c0058k.m373y(((ByteBuffer) c0058k.f177i).getInt());
        if (strM373y != null) {
            return AbstractC3506j.m7360x(strM373y);
        }
        C3128a c3128a = this.f14373m;
        if (c3128a.f10138g.mo7350l().equals("java.lang.Object") || (this.f14375o.f488b & 32768) != 0) {
            return null;
        }
        C0086a.m452k("No super class in ".concat(String.valueOf(c3128a.f10138g)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final synchronized InterfaceC0254d m8651V() {
        InterfaceC0254d c1202e;
        if (m8659d0()) {
            return InterfaceC0254d.f707a;
        }
        InterfaceC0253c interfaceC0253c = this.f14371k.f14435a.f742k;
        String strM8655Z = m8655Z();
        InterfaceC0254d interfaceC0254dMo1008v = interfaceC0253c.mo1008v(strM8655Z);
        if (interfaceC0254dMo1008v != InterfaceC0254d.f707a) {
            return interfaceC0254dMo1008v;
        }
        try {
            c1202e = this.f14371k.f14452r.m1990b(this);
            m8647h0(c1202e);
        } catch (Exception | StackOverflowError e6) {
            C5787h.m10468a(this, "Code generation failed", e6);
            c1202e = new C1202e(AbstractC5798s.m10513g(e6));
        }
        if (c1202e != InterfaceC0254d.f707a) {
            interfaceC0253c.mo1007r(strM8655Z, c1202e);
        }
        return c1202e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final void m8652W() {
        C2126b c2126b = this.f14372l;
        if (c2126b == null) {
            return;
        }
        this.f9217g = AbstractC2828e.f9216h;
        m8670o0();
        C2095f c2095f = this.f14371k.f14438d;
        ((HashMap) c2095f.f7002c).remove(this);
        ((C3129b) c2095f.f7001b).f10144a.entrySet().removeIf(new C0282g0(this, 3));
        m8661f0(c2126b, true);
        this.f14382v.forEach(new C0074e(28));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final InterfaceC4316l m8653X(Object obj, boolean z9) {
        return this.f14371k.f14438d.m5206f(this, obj, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final InterfaceC4316l m8654Y(C3510n c3510n) {
        EnumC3513q enumC3513qMo7343o;
        C2095f c2095f = this.f14371k.f14438d;
        if (!c2095f.f7000a || (enumC3513qMo7343o = c3510n.f11419i.mo7343o()) == null) {
            return null;
        }
        long j3 = c3510n.f11422l;
        switch (enumC3513qMo7343o.ordinal()) {
            case 0:
                return c2095f.m5206f(this, Boolean.valueOf(j3 == 1), false);
            case 1:
                return c2095f.m5206f(this, Character.valueOf((char) j3), Math.abs(j3) > 10);
            case 2:
                return c2095f.m5206f(this, Byte.valueOf((byte) j3), Math.abs(j3) > 10);
            case 3:
                return c2095f.m5206f(this, Short.valueOf((short) j3), Math.abs(j3) > 100);
            case 4:
                return c2095f.m5206f(this, Integer.valueOf((int) j3), Math.abs(j3) > 100);
            case 5:
                float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
                return c2095f.m5206f(this, Float.valueOf(fIntBitsToFloat), Float.compare(fIntBitsToFloat, 0.0f) == 0);
            case 6:
                return c2095f.m5206f(this, Long.valueOf(j3), Math.abs(j3) > 1000);
            case 7:
                double dLongBitsToDouble = Double.longBitsToDouble(j3);
                return c2095f.m5206f(this, Double.valueOf(dLongBitsToDouble), Double.compare(dLongBitsToDouble, 0.0d) == 0);
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final String m8655Z() {
        return this.f14373m.f10138g.mo7350l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final C4309e m8656a0() {
        C4309e c4309e = this.f14384x;
        return c4309e == this ? this : c4309e.m8656a0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final AbstractC3506j m8657b0() {
        AbstractC3506j abstractC3506j = this.f14373m.f10138g;
        return AbstractC5798s.m10520n(this.f14378r) ? AbstractC3506j.m7358e(abstractC3506j, this.f14378r) : abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final boolean m8658c0() {
        AbstractC3506j abstractC3506j;
        return this.f14375o.m850b() && (abstractC3506j = this.f14376p) != null && abstractC3506j.mo7350l().equals(AbstractC3506j.f11397n.f11369K);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14373m.compareTo(((C4309e) obj).f14373m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final boolean m8659d0() {
        return this.f14384x != this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m8660e0() {
        for (C4322r c4322r : this.f14380t) {
            try {
                c4322r.m8702a0();
            } catch (Exception e6) {
                c4322r.getClass();
                C5787h.m10468a(c4322r, "Method load error", e6);
            }
        }
        Iterator it = this.f14382v.iterator();
        while (it.hasNext()) {
            ((C4309e) it.next()).m8660e0();
        }
        this.f14385y = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4309e) {
            return this.f14373m.equals(((C4309e) obj).f14373m);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final void m8661f0(C2126b c2126b, boolean z9) {
        int i9;
        List listM344J;
        C3385g c3385g;
        C3128a c3128a = this.f14373m;
        try {
            ArrayList arrayListM5348a = c2126b.m5348a();
            C0058k c0058k = c2126b.f7086a;
            m6234z(arrayListM5348a);
            C3384f c3384f = (C3384f) this.f9217g.mo6237c(C3126c.f10131d);
            if (c3384f == null || (c3385g = (C3385g) c3384f.f10918g.get(c2126b.m5349b())) == null) {
                c0058k.m336B(4);
                i9 = ((ByteBuffer) c0058k.f177i).getInt();
            } else {
                i9 = c3385g.f10921c;
            }
            int i10 = 1;
            this.f14375o = new C0192k(i9, i10, 3);
            this.f14376p = m8650U(c2126b);
            c0058k.m336B(12);
            int i11 = ((ByteBuffer) c0058k.f177i).getInt();
            if (i11 == 0) {
                listM344J = Collections.EMPTY_LIST;
            } else {
                c0058k.m351a(i11);
                listM344J = c0058k.m344J();
            }
            this.f14377q = AbstractC5798s.m10509c(listM344J, new C2833a(14));
            this.f14379s = ((C1219e) c0058k.f178j).f4085b;
            final int i12 = 0;
            C3495e c3495e = new C3495e(new Function(this) { // from class: ud.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C4309e f14363b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f14363b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List list;
                    switch (i12) {
                        case 0:
                            C2128d c2128d = (C2128d) obj;
                            C4309e c4309e = this.f14363b;
                            C4311g c4311g = new C4311g(c4309e, C3130c.m6654a(c4309e.f14371k, c2128d), c2128d.f7094e);
                            ArrayList arrayList = new ArrayList(2);
                            C2958a c2958a = c2128d.f7096g;
                            if (c2958a != null) {
                                arrayList.add(c2958a);
                            }
                            C0956r c0956r = c2128d.f7090a;
                            if (c0956r == null) {
                                C0353j.m1305c("Annotation parser not initialized");
                                return null;
                            }
                            AbstractC2125a.m5347a(null, arrayList, c0956r.m2353d(c2128d.f7095f));
                            c4311g.m6234z(arrayList);
                            return c4311g;
                        default:
                            C2130f c2130f = (C2130f) obj;
                            C4322r c4322r = new C4322r(this.f14363b, c2130f);
                            ArrayList arrayList2 = new ArrayList();
                            C0956r c0956r2 = c2130f.f7106a;
                            C3381c c3381c = null;
                            AbstractC2125a.m5347a(null, arrayList2, c0956r2.m2353d(c2130f.f7109d));
                            int i13 = c2130f.f7110e;
                            C0058k c0058k2 = (C0058k) c0956r2.f3013f;
                            if (i13 == 0) {
                                list = Collections.EMPTY_LIST;
                            } else {
                                c0058k2.m351a(i13);
                                ByteBuffer byteBuffer = (ByteBuffer) c0058k2.f177i;
                                int i14 = byteBuffer.getInt();
                                if (i14 == 0) {
                                    list = Collections.EMPTY_LIST;
                                } else {
                                    ArrayList arrayList3 = new ArrayList(i14);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        int i16 = byteBuffer.getInt();
                                        int iPosition = byteBuffer.position();
                                        arrayList3.add(c0956r2.m2353d(i16));
                                        c0058k2.m351a(iPosition);
                                    }
                                    list = arrayList3;
                                }
                            }
                            if (!list.isEmpty()) {
                                ArrayList arrayList4 = new ArrayList(list.size());
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(C3382d.m7166b((List) it.next()));
                                }
                                c3381c = new C3381c(arrayList4);
                            }
                            if (c3381c != null) {
                                arrayList2.add(c3381c);
                            }
                            c4322r.m6234z(arrayList2);
                            return c4322r;
                    }
                }
            });
            final int i13 = 1;
            C3495e c3495e2 = new C3495e(new Function(this) { // from class: ud.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C4309e f14363b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f14363b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List list;
                    switch (i13) {
                        case 0:
                            C2128d c2128d = (C2128d) obj;
                            C4309e c4309e = this.f14363b;
                            C4311g c4311g = new C4311g(c4309e, C3130c.m6654a(c4309e.f14371k, c2128d), c2128d.f7094e);
                            ArrayList arrayList = new ArrayList(2);
                            C2958a c2958a = c2128d.f7096g;
                            if (c2958a != null) {
                                arrayList.add(c2958a);
                            }
                            C0956r c0956r = c2128d.f7090a;
                            if (c0956r == null) {
                                C0353j.m1305c("Annotation parser not initialized");
                                return null;
                            }
                            AbstractC2125a.m5347a(null, arrayList, c0956r.m2353d(c2128d.f7095f));
                            c4311g.m6234z(arrayList);
                            return c4311g;
                        default:
                            C2130f c2130f = (C2130f) obj;
                            C4322r c4322r = new C4322r(this.f14363b, c2130f);
                            ArrayList arrayList2 = new ArrayList();
                            C0956r c0956r2 = c2130f.f7106a;
                            C3381c c3381c = null;
                            AbstractC2125a.m5347a(null, arrayList2, c0956r2.m2353d(c2130f.f7109d));
                            int i132 = c2130f.f7110e;
                            C0058k c0058k2 = (C0058k) c0956r2.f3013f;
                            if (i132 == 0) {
                                list = Collections.EMPTY_LIST;
                            } else {
                                c0058k2.m351a(i132);
                                ByteBuffer byteBuffer = (ByteBuffer) c0058k2.f177i;
                                int i14 = byteBuffer.getInt();
                                if (i14 == 0) {
                                    list = Collections.EMPTY_LIST;
                                } else {
                                    ArrayList arrayList3 = new ArrayList(i14);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        int i16 = byteBuffer.getInt();
                                        int iPosition = byteBuffer.position();
                                        arrayList3.add(c0956r2.m2353d(i16));
                                        c0058k2.m351a(iPosition);
                                    }
                                    list = arrayList3;
                                }
                            }
                            if (!list.isEmpty()) {
                                ArrayList arrayList4 = new ArrayList(list.size());
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(C3382d.m7166b((List) it.next()));
                                }
                                c3381c = new C3381c(arrayList4);
                            }
                            if (c3381c != null) {
                                arrayList2.add(c3381c);
                            }
                            c4322r.m6234z(arrayList2);
                            return c4322r;
                    }
                }
            });
            c2126b.m5352e(c3495e, c3495e2);
            List list = c3495e.f11360b;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            this.f14381u = list;
            List list2 = c3495e2.f11360b;
            if (list2 == null) {
                list2 = Collections.EMPTY_LIST;
            }
            this.f14380t = list2;
            if (z9) {
                m8664k0();
            }
            List<C4311g> list3 = this.f14381u;
            if (!list3.isEmpty()) {
                for (C4311g c4311g : list3) {
                    C0192k c0192k = c4311g.f14391m;
                    if (c0192k.m856h() && c0192k.m851c()) {
                        if (c4311g.f9217g.mo6237c(C3126c.f10133f) == null) {
                            c4311g.m6233y(C2958a.f9703i);
                        }
                    }
                }
            }
            m8646g0(this);
            if (c3128a.f10139h.equals("package-info") && this.f14381u.isEmpty() && this.f14380t.isEmpty()) {
                m6231w(EnumC2824a.f9126L);
                m6231w(EnumC2824a.f9171x);
            }
            this.f14369D = new HashMap(this.f14380t.size());
            for (C4322r c4322r : this.f14380t) {
                this.f14369D.put(c4322r.f14410k, c4322r);
            }
            if ((this.f14375o.f488b & 32768) == 0) {
                i10 = 0;
            }
            if (i10 != 0) {
                m6383L("Modules not supported yet");
            }
        } catch (Exception e6) {
            throw new C0084g("Error decode class: ".concat(String.valueOf(c3128a)), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14373m.f10138g.f11410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final void m8662i0(C4309e c4309e) {
        List list = this.f14386z;
        if (list != null && !list.isEmpty() && list.remove(c4309e) && list.isEmpty()) {
            list = Collections.EMPTY_LIST;
        }
        this.f14386z = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final void m8663j0(String str) {
        int iIndexOf = str.indexOf(46);
        C3128a c3128a = this.f14373m;
        if (iIndexOf == -1) {
            c3128a.m6639a(str);
            return;
        }
        boolean zM6650o = c3128a.m6650o();
        AbstractC3506j abstractC3506jM7360x = AbstractC3506j.m7360x(str);
        C4325u c4325u = this.f14371k;
        C3128a c3128a2 = new C3128a(c4325u, abstractC3506jM7360x, zM6650o);
        String strM6647l = c3128a2.m6647l();
        String str2 = c3128a2.f10139h;
        if (c3128a.m6650o()) {
            if (!strM6647l.equals(c3128a.m6647l())) {
                m6382K("Can't change package for inner class: " + String.valueOf(this) + " to " + str);
            }
            c3128a.m6639a(str2);
            return;
        }
        if (strM6647l.equals(c3128a.m6645j())) {
            c3128a.m6639a(str2);
            return;
        }
        if (c3128a.m6650o()) {
            C0086a.m452k("Can't change package for inner class: ".concat(String.valueOf(c3128a)));
            return;
        }
        C4323s c4323s = this.f14374n;
        c4325u.getClass();
        if (c4323s.f14430o.remove(this) && c4323s.f14430o.isEmpty() && c4323s.f14429n.isEmpty()) {
            c4325u.m8714e(c4323s);
        }
        C4323s c4323sM8708I = C4323s.m8708I(c4325u, strM6647l);
        c4323sM8708I.f14430o.add(this);
        this.f14374n = c4323sM8708I;
        Collections.sort(c4325u.f14450p);
        if (c3128a.m6650o()) {
            C0086a.m452k("Can't change package for inner class");
            return;
        }
        C1367h c1367h = new C1367h(strM6647l, str2);
        c3128a.m6641c(c1367h);
        c3128a.f10143l = c1367h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m8664k0() {
        C4325u c4325u = this.f14371k;
        C1962c0 c1962c0Mo1049f = c4325u.f14435a.f743l.mo1049f(c4325u);
        if (c1962c0Mo1049f == null) {
            f14365F.mo6254h(this, "Can't restore usage data for class: {}");
            return;
        }
        this.f14386z = C1962c0.m4858j((Set) ((C0189h) c1962c0Mo1049f.f6664b).f474a.get(this));
        this.f14367B = C1962c0.m4858j((Set) ((C0189h) c1962c0Mo1049f.f6665c).f474a.get(this));
        this.f14368C = C1962c0.m4858j((Set) ((C0189h) c1962c0Mo1049f.f6666d).f474a.get(this));
        for (C4311g c4311g : this.f14381u) {
            c4311g.f14393o = C1962c0.m4858j((Set) ((C0189h) c1962c0Mo1049f.f6667e).f474a.get(c4311g));
        }
        for (C4322r c4322r : this.f14380t) {
            c4322r.f14408H = C1962c0.m4858j((Set) ((C0189h) c1962c0Mo1049f.f6668f).f474a.get(c4322r));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final C4311g m8665l0(C3130c c3130c) {
        for (C4311g c4311g : this.f14381u) {
            if (c4311g.f14390l.equals(c3130c)) {
                return c4311g;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: m */
    public final String mo8666m() {
        return this.f14379s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final C4322r m8667m0(String str) {
        for (C4322r c4322r : this.f14380t) {
            if (c4322r.f14410k.f10154k.equals(str)) {
                return c4322r;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: n */
    public final C4325u mo8668n() {
        return this.f14371k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final C4322r m8669n0(String str) {
        for (C4322r c4322r : this.f14380t) {
            if (c4322r.f14410k.f10150g.equals(str)) {
                return c4322r;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public final void m8670o0() {
        if (this.f14385y == 1) {
            return;
        }
        synchronized (this.f14373m) {
            this.f14380t.forEach(new C0074e(29));
            this.f14382v.forEach(new C4308d(0));
            this.f14381u.forEach(new C4308d(1));
            m6229F();
            this.f14385y = 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m8671p0(C0280f0 c0280f0) {
        C1214a c1214a = this.f14371k.f14443i;
        Object objM8657b0 = m8657b0();
        if (!this.f14376p.equals(AbstractC3506j.f11394k)) {
            c0280f0.accept(objM8657b0, this.f14376p);
            c1214a.m3347n(this.f14376p, c0280f0);
        }
        for (AbstractC3506j abstractC3506j : this.f14377q) {
            c0280f0.accept(objM8657b0, abstractC3506j);
            c1214a.m3347n(abstractC3506j, c0280f0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14373m.f10141j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    public final String typeName() {
        return "class";
    }

    public C4309e(C4325u c4325u, C3128a c3128a, int i9) {
        List list = Collections.EMPTY_LIST;
        this.f14378r = list;
        this.f14382v = list;
        this.f14383w = list;
        this.f14384x = this;
        this.f14385y = 1;
        this.f14386z = list;
        this.f14366A = list;
        this.f14367B = list;
        this.f14368C = list;
        this.f14369D = Collections.EMPTY_MAP;
        this.f14371k = c4325u;
        this.f14372l = null;
        this.f14373m = c3128a;
        this.f14377q = new ArrayList();
        this.f14380t = new ArrayList();
        this.f14381u = new ArrayList();
        this.f14375o = new C0192k(i9, 1, 3);
        C4323s c4323sM8708I = C4323s.m8708I(c4325u, c3128a.m6647l());
        c4323sM8708I.f14430o.add(this);
        this.f14374n = c4323sM8708I;
    }
}
