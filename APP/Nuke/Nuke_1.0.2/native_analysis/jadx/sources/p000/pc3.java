package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pc3 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f8256l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc3(boolean z, t00 t00Var) {
        super(2, t00Var);
        this.f8256l = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((pc3) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new pc3(this.f8256l, t00Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        fg1.m1627T(obj);
        List<C0479mz> list = (List) dd3.m1000h().mo514a();
        List<cr0> list2 = (List) dd3.m1001i().mo514a();
        Iterable<qs1> iterable = this.f8256l ? (List) dd3.m1005m(yc3.f13410j, "SELECT r.username, r.alias, r.nickname, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE 'gh_%'", null, new yb3(16)).mo514a() : be0.f819h;
        if (list == null || list2 == null || iterable == null) {
            return kc3.f5459a;
        }
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        for (C0479mz c0479mz : list) {
            pb1VarM1424E.add(new jc3(c0479mz.f6923a, c0479mz.m3219a(), c0479mz.f6929g, sc3.f10046h));
        }
        for (cr0 cr0Var : list2) {
            String str = cr0Var.f1693a;
            String str2 = cr0Var.f1694b;
            if (pv2.m4006s0(str2)) {
                str2 = cr0Var.f1693a;
            }
            pb1VarM1424E.add(new jc3(str, str2, cr0Var.f1697e, sc3.f10047i));
        }
        for (qs1 qs1Var : iterable) {
            String str3 = qs1Var.f9152a;
            String str4 = qs1Var.f9154c;
            if (pv2.m4006s0(str4)) {
                str4 = qs1Var.f9152a;
            }
            pb1VarM1424E.add(new jc3(str3, str4, qs1Var.f9155d, sc3.f10048j));
        }
        pb1 pb1VarM1476z = AbstractC0179eu.m1476z(pb1VarM1424E);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = pb1VarM1476z.listIterator(0);
        while (true) {
            vs0 vs0Var = (vs0) listIterator;
            if (!vs0Var.hasNext()) {
                break;
            }
            Object next = vs0Var.next();
            if (!pv2.m4006s0(((jc3) next).f4964a)) {
                arrayList.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((jc3) obj2).f4964a)) {
                arrayList2.add(obj2);
            }
        }
        return new lc3(AbstractC0142du.m1143A0(arrayList2, new C0847wh(new sl0(26), 5)));
    }
}
