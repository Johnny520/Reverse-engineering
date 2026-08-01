package ca;

import ba.C1083k;
import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import gb.AbstractC2718v0;
import gb.EnumC2671h2;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011aa.InterfaceC0202g;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p050da.AbstractC1929b;
import p066ea.InterfaceC2058a;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2371b;
import p081fa.InterfaceC2373c;
import p081fa.InterfaceC2377e;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2380h;
import p081fa.InterfaceC2385m;
import p081fa.InterfaceC2387o;
import p081fa.InterfaceC2396x;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2408j;
import p098g9.InterfaceC2557k;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p212o9.C5668d;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.AbstractC6054y;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6039s1;
import p259ra.AbstractC6569n;
import p327wa.AbstractC9211e;
import p358y9.AbstractC9626i0;
import p373z9.AbstractC9888a;
import ua.AbstractC8590g;
import ua.C8579a;
import ua.C8592i;
import ua.C8594k;
import ua.C8602s;
import ua.C8604u;

/* JADX INFO: renamed from: ca.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1426j implements InterfaceC0202g {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC2557k[] f4216i = {AbstractC1052o0.m3814i(new C1038h0(C1426j.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), AbstractC1052o0.m3814i(new C1038h0(C1426j.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), AbstractC1052o0.m3814i(new C1038h0(C1426j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: a */
    public final C1083k f4217a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2369a f4218b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2408j f4219c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2407i f4220d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2058a f4221e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2407i f4222f;

    /* JADX INFO: renamed from: g */
    public final boolean f4223g;

    /* JADX INFO: renamed from: h */
    public final boolean f4224h;

    public C1426j(C1083k c1083k, InterfaceC2369a interfaceC2369a, boolean z10) {
        c1083k.getClass();
        interfaceC2369a.getClass();
        this.f4217a = c1083k;
        this.f4218b = interfaceC2369a;
        this.f4219c = c1083k.m3941e().mo8662e(new C1420g(this));
        this.f4220d = c1083k.m3941e().mo8663f(new C1422h(this));
        this.f4221e = c1083k.m3937a().m3915t().mo7413a(interfaceC2369a);
        this.f4222f = c1083k.m3941e().mo8663f(new C1424i(this));
        this.f4223g = interfaceC2369a.mo8596i();
        this.f4224h = interfaceC2369a.mo8597y() || z10;
    }

    /* JADX INFO: renamed from: f */
    public static final Map m5545f(C1426j c1426j) {
        Collection<InterfaceC2371b> collectionMo8594c = c1426j.f4218b.mo8594c();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2371b interfaceC2371b : collectionMo8594c) {
            C5695f name = interfaceC2371b.getName();
            if (name == null) {
                name = AbstractC9626i0.f32764c;
            }
            AbstractC8590g abstractC8590gM5554m = c1426j.m5554m(interfaceC2371b);
            C4711r c4711rM18815a = abstractC8590gM5554m != null ? AbstractC4717x.m18815a(name, abstractC8590gM5554m) : null;
            if (c4711rM18815a != null) {
                arrayList.add(c4711rM18815a);
            }
        }
        return AbstractC5109u0.m20778s(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final C5692c m5546h(C1426j c1426j) {
        C5691b c5691bMo8595h = c1426j.f4218b.mo8595h();
        if (c5691bMo8595h != null) {
            return c5691bMo8595h.m22982a();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC2650c1 m5547r(C1426j c1426j) {
        C5692c c5692cMo5549d = c1426j.mo5549d();
        if (c5692cMo5549d == null) {
            return C3381l.m12703d(EnumC3380k.f9282U0, c1426j.f4218b.toString());
        }
        InterfaceC5995e interfaceC5995eM22900f = C5668d.m22900f(C5668d.f17816a, c5692cMo5549d, c1426j.f4217a.m3940d().mo12669t(), null, 4, null);
        if (interfaceC5995eM22900f == null) {
            InterfaceC2379g interfaceC2379gMo8593C = c1426j.f4218b.mo8593C();
            interfaceC5995eM22900f = interfaceC2379gMo8593C != null ? c1426j.f4217a.m3937a().m3909n().mo3947a(interfaceC2379gMo8593C) : null;
            if (interfaceC5995eM22900f == null) {
                interfaceC5995eM22900f = c1426j.m5550g(c5692cMo5549d);
            }
        }
        return interfaceC5995eM22900f.mo7508x();
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        return (Map) AbstractC2411m.m8702a(this.f4222f, this, f4216i[2]);
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: d */
    public C5692c mo5549d() {
        return (C5692c) AbstractC2411m.m8703b(this.f4219c, this, f4216i[0]);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC5995e m5550g(C5692c c5692c) {
        return AbstractC6054y.m24114d(this.f4217a.m3940d(), C5691b.f17894d.m22993c(c5692c), this.f4217a.m3937a().m3897b().m10677f().m5840r());
    }

    @Override // p011aa.InterfaceC0202g
    /* JADX INFO: renamed from: i */
    public boolean mo439i() {
        return this.f4223g;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC2058a getSource() {
        return this.f4221e;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2650c1 getType() {
        return (AbstractC2650c1) AbstractC2411m.m8702a(this.f4220d, this, f4216i[1]);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5553l() {
        return this.f4224h;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC8590g m5554m(InterfaceC2371b interfaceC2371b) {
        if (interfaceC2371b instanceof InterfaceC2387o) {
            return C8592i.m33012f(C8592i.f28628a, ((InterfaceC2387o) interfaceC2371b).getValue(), null, 2, null);
        }
        if (interfaceC2371b instanceof InterfaceC2385m) {
            InterfaceC2385m interfaceC2385m = (InterfaceC2385m) interfaceC2371b;
            return m5557p(interfaceC2385m.mo8631b(), interfaceC2385m.mo8632d());
        }
        if (!(interfaceC2371b instanceof InterfaceC2377e)) {
            if (interfaceC2371b instanceof InterfaceC2373c) {
                return m5555n(((InterfaceC2373c) interfaceC2371b).mo8600a());
            }
            if (interfaceC2371b instanceof InterfaceC2380h) {
                return m5558q(((InterfaceC2380h) interfaceC2371b).mo8624c());
            }
            return null;
        }
        InterfaceC2377e interfaceC2377e = (InterfaceC2377e) interfaceC2371b;
        C5695f name = interfaceC2377e.getName();
        if (name == null) {
            name = AbstractC9626i0.f32764c;
        }
        name.getClass();
        return m5556o(name, interfaceC2377e.mo8606e());
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC8590g m5555n(InterfaceC2369a interfaceC2369a) {
        return new C8579a(new C1426j(this.f4217a, interfaceC2369a, false, 4, null));
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC8590g m5556o(C5695f c5695f, List list) {
        AbstractC2706r0 abstractC2706r0M20924m;
        if (AbstractC2718v0.m9643a(getType())) {
            return null;
        }
        InterfaceC5995e interfaceC5995eM35857l = AbstractC9211e.m35857l(this);
        interfaceC5995eM35857l.getClass();
        InterfaceC6039s1 interfaceC6039s1M38372b = AbstractC9888a.m38372b(c5695f, interfaceC5995eM35857l);
        if (interfaceC6039s1M38372b == null || (abstractC2706r0M20924m = interfaceC6039s1M38372b.getType()) == null) {
            abstractC2706r0M20924m = this.f4217a.m3937a().m3908m().mo12669t().m20924m(EnumC2691m2.f7042u, C3381l.m12703d(EnumC3380k.f9280T0, new String[0]));
            abstractC2706r0M20924m.getClass();
        }
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC8590g abstractC8590gM5554m = m5554m((InterfaceC2371b) it.next());
            if (abstractC8590gM5554m == null) {
                abstractC8590gM5554m = new C8604u();
            }
            arrayList.add(abstractC8590gM5554m);
        }
        return C8592i.f28628a.m33013b(arrayList, abstractC2706r0M20924m);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC8590g m5557p(C5691b c5691b, C5695f c5695f) {
        if (c5691b == null || c5695f == null) {
            return null;
        }
        return new C8594k(c5691b, c5695f);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC8590g m5558q(InterfaceC2396x interfaceC2396x) {
        return C8602s.f28646b.m33040a(this.f4217a.m3943g().m7014p(interfaceC2396x, AbstractC1929b.m6997b(EnumC2671h2.f7006r, false, false, null, 7, null)));
    }

    public String toString() {
        return AbstractC6569n.m25895O(AbstractC6569n.f20552h, this, null, 2, null);
    }

    public /* synthetic */ C1426j(C1083k c1083k, InterfaceC2369a interfaceC2369a, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(c1083k, interfaceC2369a, (i10 & 4) != 0 ? false : z10);
    }
}
