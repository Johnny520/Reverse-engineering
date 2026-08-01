package af;

import bf.AbstractC1118a;
import cf.C1539h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import org.luckypray.dexkit.DexKitBridge;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p069ef.C2216a;
import p172l8.AbstractC4706m;
import p172l8.C4700i0;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: af.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0333f extends AbstractC1118a {

    /* JADX INFO: renamed from: q */
    public static final a f848q = new a(null);

    /* JADX INFO: renamed from: d */
    public final String f849d;

    /* JADX INFO: renamed from: e */
    public final int f850e;

    /* JADX INFO: renamed from: f */
    public final String f851f;

    /* JADX INFO: renamed from: g */
    public final Integer f852g;

    /* JADX INFO: renamed from: h */
    public final List f853h;

    /* JADX INFO: renamed from: i */
    public final List f854i;

    /* JADX INFO: renamed from: j */
    public final List f855j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4705l f856k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4705l f857l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4705l f858m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC4705l f859n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4705l f860o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC4705l f861p;

    /* JADX INFO: renamed from: af.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f862r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0333f f863s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f864t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f865u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DexKitBridge dexKitBridge, C0333f c0333f, int i10, int i11) {
            super(0);
            this.f862r = dexKitBridge;
            this.f863s = c0333f;
            this.f864t = i10;
            this.f865u = i11;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f862r.m23358r0(this.f863s.m4018b(this.f864t, this.f865u));
        }
    }

    /* JADX INFO: renamed from: af.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {
        public c() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2216a invoke() {
            return new C2216a(C0333f.this.m1020h());
        }
    }

    /* JADX INFO: renamed from: af.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f867r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0333f f868s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f869t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DexKitBridge dexKitBridge, C0333f c0333f, int i10) {
            super(0);
            this.f867r = dexKitBridge;
            this.f868s = c0333f;
            this.f869t = i10;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0336i invoke() {
            DexKitBridge dexKitBridge = this.f867r;
            List list = this.f868s.f855j;
            C0333f c0333f = this.f868s;
            int i10 = this.f869t;
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(c0333f.m4018b(i10, ((Number) it.next()).intValue())));
            }
            return dexKitBridge.m23360w0(AbstractC5081g0.m20556Y0(arrayList));
        }
    }

    /* JADX INFO: renamed from: af.f$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f870r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0333f f871s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f872t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DexKitBridge dexKitBridge, C0333f c0333f, int i10) {
            super(0);
            this.f870r = dexKitBridge;
            this.f871s = c0333f;
            this.f872t = i10;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0334g invoke() {
            DexKitBridge dexKitBridge = this.f870r;
            List list = this.f871s.f853h;
            C0333f c0333f = this.f871s;
            int i10 = this.f872t;
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(c0333f.m4018b(i10, ((Number) it.next()).intValue())));
            }
            return dexKitBridge.m23347P0(AbstractC5081g0.m20556Y0(arrayList));
        }
    }

    /* JADX INFO: renamed from: af.f$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f873r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0333f f874s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f875t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DexKitBridge dexKitBridge, C0333f c0333f, int i10) {
            super(0);
            this.f873r = dexKitBridge;
            this.f874s = c0333f;
            this.f875t = i10;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0339l invoke() {
            DexKitBridge dexKitBridge = this.f873r;
            List list = this.f874s.f854i;
            C0333f c0333f = this.f874s;
            int i10 = this.f875t;
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(c0333f.m4018b(i10, ((Number) it.next()).intValue())));
            }
            return dexKitBridge.m23341F0(AbstractC5081g0.m20556Y0(arrayList));
        }
    }

    /* JADX INFO: renamed from: af.f$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ DexKitBridge f877s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f878t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DexKitBridge dexKitBridge, int i10) {
            super(0);
            this.f877s = dexKitBridge;
            this.f878t = i10;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0333f invoke() {
            Integer num = C0333f.this.f852g;
            if (num != null) {
                return (C0333f) this.f877s.m23347P0(new long[]{C0333f.this.m4018b(this.f878t, num.intValue())}).m1012a();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: af.f$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final h f879r = new h();

        public h() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(C0333f c0333f) {
            c0333f.getClass();
            return c0333f.m1024l();
        }
    }

    public C0333f(DexKitBridge dexKitBridge, int i10, int i11, String str, int i12, String str2, Integer num, List list, List list2, List list3) {
        super(dexKitBridge, i10, i11);
        this.f849d = str;
        this.f850e = i12;
        this.f851f = str2;
        this.f852g = num;
        this.f853h = list;
        this.f854i = list2;
        this.f855j = list3;
        this.f856k = AbstractC4706m.m18787a(new c());
        this.f857l = AbstractC4706m.m18787a(new g(dexKitBridge, i11));
        this.f858m = AbstractC4706m.m18787a(new e(dexKitBridge, this, i11));
        this.f859n = AbstractC4706m.m18787a(new f(dexKitBridge, this, i11));
        this.f860o = AbstractC4706m.m18787a(new d(dexKitBridge, this, i11));
        this.f861p = AbstractC4706m.m18787a(new b(dexKitBridge, this, i11, i10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0333f) && AbstractC1061t.m3842c(this.f851f, ((C0333f) obj).f851f);
    }

    /* JADX INFO: renamed from: h */
    public final String m1020h() {
        return this.f851f;
    }

    public int hashCode() {
        return this.f851f.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C2216a m1021i() {
        return (C2216a) this.f856k.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final int m1022j() {
        return this.f853h.size();
    }

    /* JADX INFO: renamed from: k */
    public final C0334g m1023k() {
        return (C0334g) this.f858m.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final String m1024l() {
        return m1021i().m7984b();
    }

    /* JADX INFO: renamed from: m */
    public final C0333f m1025m() {
        return (C0333f) this.f857l.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final C2216a m1026n() {
        return m1021i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f850e;
        if (i10 > 0) {
            sb2.append(Modifier.toString(i10) + " ");
        }
        sb2.append("class " + m1024l());
        C0333f c0333fM1025m = m1025m();
        if (c0333fM1025m != null) {
            sb2.append(" extends ");
            sb2.append(c0333fM1025m.m1024l());
        }
        if (m1022j() > 0) {
            sb2.append(" implements ");
            sb2.append(AbstractC5081g0.m20585s0(m1023k(), ", ", null, null, 0, null, h.f879r, 30, null));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: af.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0333f m1027a(DexKitBridge dexKitBridge, C1539h c1539h) {
            dexKitBridge.getClass();
            c1539h.getClass();
            int iM6059s = c1539h.m6059s();
            int iM6057q = c1539h.m6057q();
            String strM6062v = c1539h.m6062v();
            String str = strM6062v == null ? _UrlKt.FRAGMENT_ENCODE_SET : strM6062v;
            int iM6055o = c1539h.m6055o();
            String strM6056p = c1539h.m6056p();
            String str2 = strM6056p == null ? _UrlKt.FRAGMENT_ENCODE_SET : strM6056p;
            int iM6063w = c1539h.m6063w();
            Integer numValueOf = iM6063w == -1 ? null : Integer.valueOf(iM6063w);
            ArrayList arrayList = new ArrayList();
            int iM6060t = c1539h.m6060t();
            for (int i10 = 0; i10 < iM6060t; i10++) {
                arrayList.add(Integer.valueOf(c1539h.m6064x(i10)));
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            ArrayList arrayList2 = new ArrayList();
            int iM6061u = c1539h.m6061u();
            for (int i11 = 0; i11 < iM6061u; i11++) {
                arrayList2.add(Integer.valueOf(c1539h.m6065y(i11)));
            }
            C4700i0 c4700i02 = C4700i0.f13910a;
            ArrayList arrayList3 = new ArrayList();
            int iM6058r = c1539h.m6058r();
            for (int i12 = 0; i12 < iM6058r; i12++) {
                arrayList3.add(Integer.valueOf(c1539h.m6054n(i12)));
            }
            C4700i0 c4700i03 = C4700i0.f13910a;
            return new C0333f(dexKitBridge, iM6059s, iM6057q, str, iM6055o, str2, numValueOf, arrayList, arrayList2, arrayList3, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0333f(DexKitBridge dexKitBridge, int i10, int i11, String str, int i12, String str2, Integer num, List list, List list2, List list3, AbstractC1043k abstractC1043k) {
        this(dexKitBridge, i10, i11, str, i12, str2, num, list, list2, list3);
    }
}
