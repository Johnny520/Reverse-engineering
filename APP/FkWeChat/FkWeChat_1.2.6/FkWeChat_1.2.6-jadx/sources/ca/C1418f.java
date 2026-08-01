package ca;

import ba.C1083k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p081fa.InterfaceC2393u;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p098g9.InterfaceC2557k;
import p111ha.InterfaceC2937x;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5106t;
import p213oa.C5695f;
import p229p9.InterfaceC5993d0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6007i;
import p230pb.AbstractC6059a;
import p326w9.AbstractC9206a;
import p342x9.InterfaceC9468b;
import za.AbstractC9915m;
import za.C9906d;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: ca.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1418f implements InterfaceC9913k {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC2557k[] f4193f = {AbstractC1052o0.m3814i(new C1038h0(C1418f.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b */
    public final C1083k f4194b;

    /* JADX INFO: renamed from: c */
    public final C1415d0 f4195c;

    /* JADX INFO: renamed from: d */
    public final C1421g0 f4196d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2407i f4197e;

    public C1418f(C1083k c1083k, InterfaceC2393u interfaceC2393u, C1415d0 c1415d0) {
        c1083k.getClass();
        interfaceC2393u.getClass();
        c1415d0.getClass();
        this.f4194b = c1083k;
        this.f4195c = c1415d0;
        this.f4196d = new C1421g0(c1083k, interfaceC2393u, c1415d0);
        this.f4197e = c1083k.m3941e().mo8663f(new C1416e(this));
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC9913k[] m5512k(C1418f c1418f) {
        Collection collectionValues = c1418f.f4195c.m5507U0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            InterfaceC9913k interfaceC9913kM10675c = c1418f.f4194b.m3937a().m3897b().m10675c(c1418f.f4195c, (InterfaceC2937x) it.next());
            if (interfaceC9913kM10675c != null) {
                arrayList.add(interfaceC9913kM10675c);
            }
        }
        return (InterfaceC9913k[]) AbstractC6059a.m24123b(arrayList).toArray(new InterfaceC9913k[0]);
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        m5522l(c5695f, interfaceC9468b);
        C1421g0 c1421g0 = this.f4196d;
        InterfaceC9913k[] interfaceC9913kArrM5521j = m5521j();
        Collection collectionMo5513a = c1421g0.mo5513a(c5695f, interfaceC9468b);
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArrM5521j) {
            collectionMo5513a = AbstractC6059a.m24122a(collectionMo5513a, interfaceC9913k.mo5513a(c5695f, interfaceC9468b));
        }
        return collectionMo5513a == null ? AbstractC5068b1.m20483e() : collectionMo5513a;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        InterfaceC9913k[] interfaceC9913kArrM5521j = m5521j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArrM5521j) {
            AbstractC5070c0.m20492E(linkedHashSet, interfaceC9913k.mo5514b());
        }
        linkedHashSet.addAll(this.f4196d.mo5514b());
        return linkedHashSet;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        m5522l(c5695f, interfaceC9468b);
        C1421g0 c1421g0 = this.f4196d;
        InterfaceC9913k[] interfaceC9913kArrM5521j = m5521j();
        Collection collectionMo5515c = c1421g0.mo5515c(c5695f, interfaceC9468b);
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArrM5521j) {
            collectionMo5515c = AbstractC6059a.m24122a(collectionMo5515c, interfaceC9913k.mo5515c(c5695f, interfaceC9468b));
        }
        return collectionMo5515c == null ? AbstractC5068b1.m20483e() : collectionMo5515c;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        InterfaceC9913k[] interfaceC9913kArrM5521j = m5521j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArrM5521j) {
            AbstractC5070c0.m20492E(linkedHashSet, interfaceC9913k.mo5516d());
        }
        linkedHashSet.addAll(this.f4196d.mo5516d());
        return linkedHashSet;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        Set setM38460a = AbstractC9915m.m38460a(AbstractC5106t.m20692L(m5521j()));
        if (setM38460a == null) {
            return null;
        }
        setM38460a.addAll(this.f4196d.mo5517e());
        return setM38460a;
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        m5522l(c5695f, interfaceC9468b);
        InterfaceC5995e interfaceC5995eMo5518f = this.f4196d.mo5518f(c5695f, interfaceC9468b);
        if (interfaceC5995eMo5518f != null) {
            return interfaceC5995eMo5518f;
        }
        InterfaceC6004h interfaceC6004h = null;
        for (InterfaceC9913k interfaceC9913k : m5521j()) {
            InterfaceC6004h interfaceC6004hMo5518f = interfaceC9913k.mo5518f(c5695f, interfaceC9468b);
            if (interfaceC6004hMo5518f != null) {
                if (!(interfaceC6004hMo5518f instanceof InterfaceC6007i) || !((InterfaceC5993d0) interfaceC6004hMo5518f).mo5576R()) {
                    return interfaceC6004hMo5518f;
                }
                if (interfaceC6004h == null) {
                    interfaceC6004h = interfaceC6004hMo5518f;
                }
            }
        }
        return interfaceC6004h;
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        C1421g0 c1421g0 = this.f4196d;
        InterfaceC9913k[] interfaceC9913kArrM5521j = m5521j();
        Collection collectionMo5519g = c1421g0.mo5519g(c9906d, interfaceC0184l);
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArrM5521j) {
            collectionMo5519g = AbstractC6059a.m24122a(collectionMo5519g, interfaceC9913k.mo5519g(c9906d, interfaceC0184l));
        }
        return collectionMo5519g == null ? AbstractC5068b1.m20483e() : collectionMo5519g;
    }

    /* JADX INFO: renamed from: i */
    public final C1421g0 m5520i() {
        return this.f4196d;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC9913k[] m5521j() {
        return (InterfaceC9913k[]) AbstractC2411m.m8702a(this.f4197e, this, f4193f[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m5522l(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        AbstractC9206a.m35842b(this.f4194b.m3937a().m3907l(), interfaceC9468b, this.f4195c, c5695f);
    }

    public String toString() {
        return "scope for " + this.f4195c;
    }
}
