package p373z9;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p081fa.InterfaceC2371b;
import p081fa.InterfaceC2385m;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5695f;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6039s1;
import p243q9.EnumC6342q;
import p243q9.EnumC6343r;
import ua.AbstractC8590g;
import ua.C8581b;
import ua.C8594k;

/* JADX INFO: renamed from: z9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9893f {

    /* JADX INFO: renamed from: a */
    public static final C9893f f33368a = new C9893f();

    /* JADX INFO: renamed from: b */
    public static final Map f33369b = AbstractC5109u0.m20771l(AbstractC4717x.m18815a("PACKAGE", EnumSet.noneOf(EnumC6343r.class)), AbstractC4717x.m18815a("TYPE", EnumSet.of(EnumC6343r.f19905J, EnumC6343r.f19918W)), AbstractC4717x.m18815a("ANNOTATION_TYPE", EnumSet.of(EnumC6343r.f19906K)), AbstractC4717x.m18815a("TYPE_PARAMETER", EnumSet.of(EnumC6343r.f19907L)), AbstractC4717x.m18815a("FIELD", EnumSet.of(EnumC6343r.f19909N)), AbstractC4717x.m18815a("LOCAL_VARIABLE", EnumSet.of(EnumC6343r.f19910O)), AbstractC4717x.m18815a("PARAMETER", EnumSet.of(EnumC6343r.f19911P)), AbstractC4717x.m18815a("CONSTRUCTOR", EnumSet.of(EnumC6343r.f19912Q)), AbstractC4717x.m18815a("METHOD", EnumSet.of(EnumC6343r.f19913R, EnumC6343r.f19914S, EnumC6343r.f19915T)), AbstractC4717x.m18815a("TYPE_USE", EnumSet.of(EnumC6343r.f19916U)));

    /* JADX INFO: renamed from: c */
    public static final Map f33370c = AbstractC5109u0.m20771l(AbstractC4717x.m18815a("RUNTIME", EnumC6342q.f19889q), AbstractC4717x.m18815a("CLASS", EnumC6342q.f19890r), AbstractC4717x.m18815a("SOURCE", EnumC6342q.f19891s));

    /* JADX INFO: renamed from: e */
    public static final AbstractC2706r0 m38390e(InterfaceC6005h0 interfaceC6005h0) {
        AbstractC2706r0 type;
        interfaceC6005h0.getClass();
        InterfaceC6039s1 interfaceC6039s1M38372b = AbstractC9888a.m38372b(C9891d.f33362a.m38387d(), interfaceC6005h0.mo12669t().m20927p(C5135p.a.f15538H));
        return (interfaceC6039s1M38372b == null || (type = interfaceC6039s1M38372b.getType()) == null) ? C3381l.m12703d(EnumC3380k.f9278S0, new String[0]) : type;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC8590g m38391b(InterfaceC2371b interfaceC2371b) {
        InterfaceC2385m interfaceC2385m = interfaceC2371b instanceof InterfaceC2385m ? (InterfaceC2385m) interfaceC2371b : null;
        if (interfaceC2385m != null) {
            Map map = f33370c;
            C5695f c5695fMo8632d = interfaceC2385m.mo8632d();
            EnumC6342q enumC6342q = (EnumC6342q) map.get(c5695fMo8632d != null ? c5695fMo8632d.m23030c() : null);
            if (enumC6342q != null) {
                C5691b c5691bM22993c = C5691b.f17894d.m22993c(C5135p.a.f15544K);
                C5695f c5695fM23027j = C5695f.m23027j(enumC6342q.name());
                c5695fM23027j.getClass();
                return new C8594k(c5691bM22993c, c5695fM23027j);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Set m38392c(String str) {
        EnumSet enumSet = (EnumSet) f33369b.get(str);
        return enumSet != null ? enumSet : AbstractC5068b1.m20483e();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC8590g m38393d(List list) {
        list.getClass();
        ArrayList<InterfaceC2385m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC2385m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC6343r> arrayList2 = new ArrayList();
        for (InterfaceC2385m interfaceC2385m : arrayList) {
            C9893f c9893f = f33368a;
            C5695f c5695fMo8632d = interfaceC2385m.mo8632d();
            AbstractC5070c0.m20492E(arrayList2, c9893f.m38392c(c5695fMo8632d != null ? c5695fMo8632d.m23030c() : null));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(arrayList2, 10));
        for (EnumC6343r enumC6343r : arrayList2) {
            C5691b c5691bM22993c = C5691b.f17894d.m22993c(C5135p.a.f15542J);
            C5695f c5695fM23027j = C5695f.m23027j(enumC6343r.name());
            c5695fM23027j.getClass();
            arrayList3.add(new C8594k(c5691bM22993c, c5695fM23027j));
        }
        return new C8581b(arrayList3, C9892e.f33367q);
    }
}
