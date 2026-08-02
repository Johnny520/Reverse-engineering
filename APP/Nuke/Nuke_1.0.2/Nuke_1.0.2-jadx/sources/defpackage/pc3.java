package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pc3 extends tw2 implements mn0 {
    public final /* synthetic */ boolean l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc3(boolean z, t00 t00Var) {
        super(2, t00Var);
        this.l = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((pc3) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new pc3(this.l, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        fg1.T(obj);
        List<mz> list = (List) dd3.h().a();
        List<cr0> list2 = (List) dd3.i().a();
        Iterable<qs1> iterable = this.l ? (List) dd3.m(yc3.j, "SELECT r.username, r.alias, r.nickname, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE 'gh_%'", null, new yb3(16)).a() : be0.h;
        if (list == null || list2 == null || iterable == null) {
            return kc3.a;
        }
        pb1 pb1VarE = eu.E();
        for (mz mzVar : list) {
            pb1VarE.add(new jc3(mzVar.a, mzVar.a(), mzVar.g, sc3.h));
        }
        for (cr0 cr0Var : list2) {
            String str = cr0Var.a;
            String str2 = cr0Var.b;
            if (pv2.s0(str2)) {
                str2 = cr0Var.a;
            }
            pb1VarE.add(new jc3(str, str2, cr0Var.e, sc3.i));
        }
        for (qs1 qs1Var : iterable) {
            String str3 = qs1Var.a;
            String str4 = qs1Var.c;
            if (pv2.s0(str4)) {
                str4 = qs1Var.a;
            }
            pb1VarE.add(new jc3(str3, str4, qs1Var.d, sc3.j));
        }
        pb1 pb1VarZ = eu.z(pb1VarE);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = pb1VarZ.listIterator(0);
        while (true) {
            vs0 vs0Var = (vs0) listIterator;
            if (!vs0Var.hasNext()) {
                break;
            }
            Object next = vs0Var.next();
            if (!pv2.s0(((jc3) next).a)) {
                arrayList.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((jc3) obj2).a)) {
                arrayList2.add(obj2);
            }
        }
        return new lc3(du.A0(arrayList2, new wh(new sl0(26), 5)));
    }
}
