package p186m9;

import gb.AbstractC2675i2;
import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p213oa.C5691b;
import p213oa.C5695f;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;

/* JADX INFO: renamed from: m9.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5139t {

    /* JADX INFO: renamed from: a */
    public static final C5139t f15642a = new C5139t();

    /* JADX INFO: renamed from: b */
    public static final Set f15643b;

    /* JADX INFO: renamed from: c */
    public static final Set f15644c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f15645d;

    /* JADX INFO: renamed from: e */
    public static final HashMap f15646e;

    /* JADX INFO: renamed from: f */
    public static final HashMap f15647f;

    /* JADX INFO: renamed from: g */
    public static final Set f15648g;

    static {
        EnumC5138s[] enumC5138sArrValues = EnumC5138s.values();
        ArrayList arrayList = new ArrayList(enumC5138sArrValues.length);
        for (EnumC5138s enumC5138s : enumC5138sArrValues) {
            arrayList.add(enumC5138s.m20980h());
        }
        f15643b = AbstractC5081g0.m20564c1(arrayList);
        EnumC5137r[] enumC5137rArrValues = EnumC5137r.values();
        ArrayList arrayList2 = new ArrayList(enumC5137rArrValues.length);
        for (EnumC5137r enumC5137r : enumC5137rArrValues) {
            arrayList2.add(enumC5137r.m20976c());
        }
        f15644c = AbstractC5081g0.m20564c1(arrayList2);
        f15645d = new HashMap();
        f15646e = new HashMap();
        f15647f = AbstractC5109u0.m20770k(AbstractC4717x.m18815a(EnumC5137r.f15625s, C5695f.m23027j("ubyteArrayOf")), AbstractC4717x.m18815a(EnumC5137r.f15626t, C5695f.m23027j("ushortArrayOf")), AbstractC4717x.m18815a(EnumC5137r.f15627u, C5695f.m23027j("uintArrayOf")), AbstractC4717x.m18815a(EnumC5137r.f15628v, C5695f.m23027j("ulongArrayOf")));
        EnumC5138s[] enumC5138sArrValues2 = EnumC5138s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC5138s enumC5138s2 : enumC5138sArrValues2) {
            linkedHashSet.add(enumC5138s2.m20978c().m22988h());
        }
        f15648g = linkedHashSet;
        for (EnumC5138s enumC5138s3 : EnumC5138s.values()) {
            f15645d.put(enumC5138s3.m20978c(), enumC5138s3.m20979g());
            f15646e.put(enumC5138s3.m20979g(), enumC5138s3.m20978c());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m20981d(AbstractC2706r0 abstractC2706r0) {
        InterfaceC6004h interfaceC6004hMo5602u;
        abstractC2706r0.getClass();
        if (AbstractC2675i2.m9475w(abstractC2706r0) || (interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u()) == null) {
            return false;
        }
        return f15642a.m20984c(interfaceC6004hMo5602u);
    }

    /* JADX INFO: renamed from: a */
    public final C5691b m20982a(C5691b c5691b) {
        c5691b.getClass();
        return (C5691b) f15645d.get(c5691b);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20983b(C5695f c5695f) {
        c5695f.getClass();
        return f15648g.contains(c5695f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20984c(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC6019m.mo7443b();
        return (interfaceC6019mMo7443b instanceof InterfaceC6023n0) && AbstractC1061t.m3842c(((InterfaceC6023n0) interfaceC6019mMo7443b).mo24031d(), C5135p.f15488A) && f15643b.contains(interfaceC6019m.getName());
    }
}
