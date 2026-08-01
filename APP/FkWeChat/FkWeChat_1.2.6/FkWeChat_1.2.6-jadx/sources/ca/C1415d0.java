package ca;

import ba.AbstractC1075c;
import ba.AbstractC1080h;
import ba.C1083k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import la.C4723c;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2393u;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p098g9.InterfaceC2557k;
import p111ha.AbstractC2936w;
import p111ha.C2938y;
import p111ha.InterfaceC2937x;
import p128ia.C3368a;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5691b;
import p213oa.C5692c;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p243q9.InterfaceC6333h;
import p273s9.AbstractC7216h0;
import p343xa.C9474d;

/* JADX INFO: renamed from: ca.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1415d0 extends AbstractC7216h0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ InterfaceC2557k[] f4180E = {AbstractC1052o0.m3814i(new C1038h0(C1415d0.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), AbstractC1052o0.m3814i(new C1038h0(C1415d0.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* JADX INFO: renamed from: A */
    public final C1418f f4181A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC2407i f4182B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC6333h f4183C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC2407i f4184D;

    /* JADX INFO: renamed from: w */
    public final InterfaceC2393u f4185w;

    /* JADX INFO: renamed from: x */
    public final C1083k f4186x;

    /* JADX INFO: renamed from: y */
    public final C4723c f4187y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC2407i f4188z;

    /* JADX INFO: renamed from: ca.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4189a;

        static {
            int[] iArr = new int[C3368a.a.values().length];
            try {
                iArr[C3368a.a.f9174y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3368a.a.f9171v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4189a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415d0(C1083k c1083k, InterfaceC2393u interfaceC2393u) {
        super(c1083k.m3940d(), interfaceC2393u.mo8648d());
        c1083k.getClass();
        interfaceC2393u.getClass();
        this.f4185w = interfaceC2393u;
        C1083k c1083kM3888f = AbstractC1075c.m3888f(c1083k, this, null, 0, 6, null);
        this.f4186x = c1083kM3888f;
        this.f4187y = c1083k.m3937a().m3897b().m10677f().m5829g().mo5860g();
        this.f4188z = c1083kM3888f.m3941e().mo8663f(new C1407a0(this));
        this.f4181A = new C1418f(c1083kM3888f, interfaceC2393u, this);
        this.f4182B = c1083kM3888f.m3941e().mo8658a(new C1410b0(this), AbstractC5114x.m20800o());
        this.f4183C = c1083kM3888f.m3937a().m3904i().m37622b() ? InterfaceC6333h.f19873o.m25003b() : AbstractC1080h.m3928a(c1083kM3888f, interfaceC2393u);
        this.f4184D = c1083kM3888f.m3941e().mo8663f(new C1413c0(this));
    }

    /* JADX INFO: renamed from: S0 */
    public static final Map m5503S0(C1415d0 c1415d0) {
        List<String> listMo10586a = c1415d0.f4186x.m3937a().m3910o().mo10586a(c1415d0.mo24031d().m22994a());
        ArrayList arrayList = new ArrayList();
        for (String str : listMo10586a) {
            C5691b.a aVar = C5691b.f17894d;
            C5692c c5692cM36907e = C9474d.m36905d(str).m36907e();
            c5692cM36907e.getClass();
            InterfaceC2937x interfaceC2937xM10731b = AbstractC2936w.m10731b(c1415d0.f4186x.m3937a().m3905j(), aVar.m22993c(c5692cM36907e), c1415d0.f4187y);
            C4711r c4711rM18815a = interfaceC2937xM10731b != null ? AbstractC4717x.m18815a(str, interfaceC2937xM10731b) : null;
            if (c4711rM18815a != null) {
                arrayList.add(c4711rM18815a);
            }
        }
        return AbstractC5109u0.m20778s(arrayList);
    }

    /* JADX INFO: renamed from: X0 */
    public static final HashMap m5504X0(C1415d0 c1415d0) {
        HashMap map = new HashMap();
        for (Map.Entry entry : c1415d0.m5507U0().entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC2937x interfaceC2937x = (InterfaceC2937x) entry.getValue();
            C9474d c9474dM36905d = C9474d.m36905d(str);
            c9474dM36905d.getClass();
            C3368a c3368aMo10733b = interfaceC2937x.mo10733b();
            int i10 = a.f4189a[c3368aMo10733b.m12592c().ordinal()];
            if (i10 == 1) {
                String strM12594e = c3368aMo10733b.m12594e();
                if (strM12594e != null) {
                    map.put(c9474dM36905d, C9474d.m36905d(strM12594e));
                }
            } else if (i10 == 2) {
                map.put(c9474dM36905d, c9474dM36905d);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final List m5505Y0(C1415d0 c1415d0) {
        Collection collectionMo8647D = c1415d0.f4185w.mo8647D();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collectionMo8647D, 10));
        Iterator it = collectionMo8647D.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2393u) it.next()).mo8648d());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC5995e m5506T0(InterfaceC2379g interfaceC2379g) {
        interfaceC2379g.getClass();
        return this.f4181A.m5520i().m5531k0(interfaceC2379g);
    }

    /* JADX INFO: renamed from: U0 */
    public final Map m5507U0() {
        return (Map) AbstractC2411m.m8702a(this.f4188z, this, f4180E[0]);
    }

    @Override // p229p9.InterfaceC6023n0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C1418f mo5510v() {
        return this.f4181A;
    }

    /* JADX INFO: renamed from: W0 */
    public final List m5509W0() {
        return (List) this.f4182B.invoke();
    }

    @Override // p243q9.AbstractC6327b, p243q9.InterfaceC6326a
    public InterfaceC6333h getAnnotations() {
        return this.f4183C;
    }

    @Override // p273s9.AbstractC7216h0, p273s9.AbstractC7227n, p229p9.InterfaceC6028p
    public InterfaceC6003g1 getSource() {
        return new C2938y(this);
    }

    @Override // p273s9.AbstractC7216h0, p273s9.AbstractC7225m
    public String toString() {
        return "Lazy Java package fragment: " + mo24031d() + " of module " + this.f4186x.m3937a().m3908m();
    }
}
