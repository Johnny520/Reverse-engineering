package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: jh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0350jh implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5029h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f5030i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f5031j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f5032k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ xk1 f5033l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ kx1 f5034m;

    public /* synthetic */ C0350jh(List list, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, kx1 kx1Var, int i) {
        this.f5029h = i;
        this.f5030i = list;
        this.f5031j = xk1Var;
        this.f5032k = xk1Var2;
        this.f5033l = xk1Var3;
        this.f5034m = kx1Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f5029h;
        a83 a83Var = a83.f116a;
        rh1 rh1Var = rh1.f9587a;
        C0160eb c0160eb = C0520nx.f7360a;
        final kx1 kx1Var = this.f5034m;
        xk1 xk1Var = this.f5033l;
        xk1 xk1Var2 = this.f5032k;
        final xk1 xk1Var3 = this.f5031j;
        final List list = this.f5030i;
        final int i2 = 1;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    String str = (String) xk1Var2.getValue();
                    Object objM1956L = go0Var.m1956L();
                    if (objM1956L == c0160eb) {
                        objM1956L = new C0260h0(xk1Var2, 17);
                        go0Var.m1981f0(objM1956L);
                    }
                    tp0.m5357b(str, (in0) objM1956L, null, rg3.m4462P(R.string.auto_receive_redpacket_search_contacts, go0Var), null, null, false, 0, 0, false, false, null, null, null, go0Var, 48, 0, 16372);
                    rp0.m4529O(go0Var, AbstractC0731te.m5186O(rh1Var, 10.0f));
                    yi0 yi0Var = AbstractC0731te.f10693e;
                    ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(10.0f, new C0676s(2)), C0700sn.f10231s, go0Var, 6);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, yi0Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, C0256gx.f3730e, ob2VarM3265a);
                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var, C0256gx.f3732g);
                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                    String strM4462P = rg3.m4462P(R.string.auto_receive_redpacket_select_all, go0Var);
                    boolean z4 = !list.isEmpty();
                    g71 g71Var = new g71(1.0f, true);
                    boolean zM1980f = go0Var.m1980f(xk1Var3) | go0Var.m1984h(list);
                    Object objM1956L2 = go0Var.m1956L();
                    if (zM1980f || objM1956L2 == c0160eb) {
                        final int i3 = 0;
                        objM1956L2 = new xm0() { // from class: mh
                            @Override // p000.xm0
                            /* JADX INFO: renamed from: a */
                            public final Object mo6a() {
                                int i4 = i3;
                                a83 a83Var2 = a83.f116a;
                                xk1 xk1Var4 = xk1Var3;
                                List list2 = list;
                                switch (i4) {
                                    case 0:
                                        Set set = (Set) xk1Var4.getValue();
                                        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((s62) it.next()).f9944a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set, arrayList));
                                        break;
                                    case 1:
                                        Set set2 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((g33) it2.next()).f3298a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set2, arrayList2));
                                        break;
                                    default:
                                        Set set3 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((jc3) it3.next()).f4964a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set3, arrayList3));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var.m1981f0(objM1956L2);
                    }
                    AbstractC0691se.m4847r(strM4462P, (xm0) objM1956L2, g71Var, z4, 0, go0Var, 0, 48);
                    String strM4462P2 = rg3.m4462P(R.string.auto_receive_redpacket_clear_selection, go0Var);
                    boolean z5 = !((Set) xk1Var3.getValue()).isEmpty();
                    g71 g71Var2 = new g71(1.0f, true);
                    boolean zM1980f2 = go0Var.m1980f(xk1Var3);
                    Object objM1956L3 = go0Var.m1956L();
                    if (zM1980f2 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0186f0(xk1Var3, 12);
                        go0Var.m1981f0(objM1956L3);
                    }
                    AbstractC0691se.m4847r(strM4462P2, (xm0) objM1956L3, g71Var2, z5, 0, go0Var, 0, 48);
                    go0Var.m1994p(true);
                    rp0.m4529O(go0Var, AbstractC0731te.m5186O(rh1Var, 10.0f));
                    w62 w62Var = (w62) xk1Var.getValue();
                    if (!t11.m5086l(w62Var, v62.f11797a)) {
                        final int i4 = 0;
                        if (t11.m5086l(w62Var, t62.f10583a)) {
                            go0Var.m1966W(1994566487);
                            s11.m4688d(xe1.m6126i0(-1832512475, new nn0() { // from class: nh
                                @Override // p000.nn0
                                /* JADX INFO: renamed from: e */
                                public final Object mo489e(Object obj4, Object obj5, Object obj6) {
                                    int i5 = i4;
                                    a83 a83Var2 = a83.f116a;
                                    C0160eb c0160eb2 = C0520nx.f7360a;
                                    rh1 rh1Var2 = rh1.f9587a;
                                    kx1 kx1Var2 = kx1Var;
                                    switch (i5) {
                                        case 0:
                                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((C0069bv) obj4).getClass();
                                            go0 go0Var2 = (go0) interfaceC0596px2;
                                            if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                go0Var2.m1961R();
                                            } else {
                                                s11.m4690e(rg3.m4462P(R.string.auto_receive_redpacket_load_contacts_failed, go0Var2), go0Var2, 0);
                                                String strM5687f = vi0.m5687f(rh1Var2, 12.0f, go0Var2, R.string.auto_receive_redpacket_retry, go0Var2);
                                                Object objM1956L4 = go0Var2.m1956L();
                                                if (objM1956L4 == c0160eb2) {
                                                    objM1956L4 = new C0600q0(kx1Var2, 3);
                                                    go0Var2.m1981f0(objM1956L4);
                                                }
                                                AbstractC0691se.m4847r(strM5687f, (xm0) objM1956L4, null, false, 0, go0Var2, 48, 60);
                                            }
                                            break;
                                        case 1:
                                            InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((C0069bv) obj4).getClass();
                                            go0 go0Var3 = (go0) interfaceC0596px3;
                                            if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                go0Var3.m1961R();
                                            } else {
                                                t11.m5083i(rg3.m4462P(R.string.auto_receive_transfer_money_load_contacts_failed, go0Var3), go0Var3, 0);
                                                String strM5687f2 = vi0.m5687f(rh1Var2, 12.0f, go0Var3, R.string.auto_receive_transfer_money_retry, go0Var3);
                                                Object objM1956L5 = go0Var3.m1956L();
                                                if (objM1956L5 == c0160eb2) {
                                                    objM1956L5 = new C0600q0(kx1Var2, 4);
                                                    go0Var3.m1981f0(objM1956L5);
                                                }
                                                AbstractC0691se.m4847r(strM5687f2, (xm0) objM1956L5, null, false, 0, go0Var3, 48, 60);
                                            }
                                            break;
                                        default:
                                            InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((C0069bv) obj4).getClass();
                                            go0 go0Var4 = (go0) interfaceC0596px4;
                                            if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                go0Var4.m1961R();
                                            } else {
                                                AbstractC0691se.m4841l(rg3.m4462P(R.string.wechat_contact_selector_load_contacts_failed, go0Var4), go0Var4, 0);
                                                String strM5687f3 = vi0.m5687f(rh1Var2, 12.0f, go0Var4, R.string.wechat_contact_selector_retry, go0Var4);
                                                Object objM1956L6 = go0Var4.m1956L();
                                                if (objM1956L6 == c0160eb2) {
                                                    objM1956L6 = new C0600q0(kx1Var2, 6);
                                                    go0Var4.m1981f0(objM1956L6);
                                                }
                                                AbstractC0691se.m4847r(strM5687f3, (xm0) objM1956L6, null, false, 0, go0Var4, 48, 60);
                                            }
                                            break;
                                    }
                                    return a83Var2;
                                }
                            }, go0Var), go0Var, 6);
                            go0Var.m1994p(false);
                        } else if (!(w62Var instanceof u62)) {
                            go0Var.m1966W(757059037);
                            go0Var.m1994p(false);
                            c80.m675s();
                        } else {
                            go0Var.m1966W(1995156169);
                            if (list.isEmpty()) {
                                go0Var.m1966W(1995164818);
                                s11.m4688d(op0.f7756c, go0Var, 6);
                                z = false;
                                go0Var.m1994p(false);
                            } else {
                                go0Var.m1966W(1995456528);
                                uh1 uh1VarM5187P = AbstractC0731te.m5187P(yi0Var, 0.0f, 360.0f, 1);
                                boolean zM1984h = go0Var.m1984h(list) | go0Var.m1980f(xk1Var3);
                                Object objM1956L4 = go0Var.m1956L();
                                if (zM1984h || objM1956L4 == c0160eb) {
                                    objM1956L4 = new C0543oh(list, xk1Var3, 0);
                                    go0Var.m1981f0(objM1956L4);
                                }
                                rg3.m4468d(6, 510, null, null, null, go0Var, null, (in0) objM1956L4, null, uh1VarM5187P, null, false);
                                z = false;
                                go0Var.m1994p(false);
                            }
                            go0Var.m1994p(z);
                        }
                    } else {
                        go0Var.m1966W(1993991778);
                        s11.m4688d(op0.f7755b, go0Var, 6);
                        go0Var.m1994p(false);
                    }
                }
                break;
            case 1:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    String str2 = (String) xk1Var2.getValue();
                    Object objM1956L5 = go0Var2.m1956L();
                    if (objM1956L5 == c0160eb) {
                        objM1956L5 = new C0260h0(xk1Var2, 22);
                        go0Var2.m1981f0(objM1956L5);
                    }
                    tp0.m5357b(str2, (in0) objM1956L5, null, rg3.m4462P(R.string.auto_receive_transfer_money_search_contacts, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 48, 0, 16372);
                    rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 10.0f));
                    yi0 yi0Var2 = AbstractC0731te.f10693e;
                    ob2 ob2VarM3265a2 = nb2.m3265a(new C0884xf(10.0f, new C0676s(2)), C0700sn.f10231s, go0Var2, 6);
                    int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                    yy1 yy1VarM1990l2 = go0Var2.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, yi0Var2);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy2 = C0256gx.f3727b;
                    go0Var2.m1969Z();
                    if (go0Var2.f3613S) {
                        go0Var2.m1989k(c0367jy2);
                    } else {
                        go0Var2.m1987i0();
                    }
                    yf3.m6268c(go0Var2, C0256gx.f3730e, ob2VarM3265a2);
                    yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l2);
                    yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                    yf3.m6267b(go0Var2, C0256gx.f3732g);
                    yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M2);
                    String strM4462P3 = rg3.m4462P(R.string.auto_receive_transfer_money_select_all, go0Var2);
                    boolean z6 = !list.isEmpty();
                    g71 g71Var3 = new g71(1.0f, true);
                    boolean zM1980f3 = go0Var2.m1980f(xk1Var3) | go0Var2.m1984h(list);
                    Object objM1956L6 = go0Var2.m1956L();
                    if (zM1980f3 || objM1956L6 == c0160eb) {
                        objM1956L6 = new xm0() { // from class: mh
                            @Override // p000.xm0
                            /* JADX INFO: renamed from: a */
                            public final Object mo6a() {
                                int i42 = i2;
                                a83 a83Var2 = a83.f116a;
                                xk1 xk1Var4 = xk1Var3;
                                List list2 = list;
                                switch (i42) {
                                    case 0:
                                        Set set = (Set) xk1Var4.getValue();
                                        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((s62) it.next()).f9944a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set, arrayList));
                                        break;
                                    case 1:
                                        Set set2 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((g33) it2.next()).f3298a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set2, arrayList2));
                                        break;
                                    default:
                                        Set set3 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((jc3) it3.next()).f4964a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set3, arrayList3));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var2.m1981f0(objM1956L6);
                    }
                    AbstractC0691se.m4847r(strM4462P3, (xm0) objM1956L6, g71Var3, z6, 0, go0Var2, 0, 48);
                    String strM4462P4 = rg3.m4462P(R.string.auto_receive_transfer_money_clear_selection, go0Var2);
                    boolean z7 = !((Set) xk1Var3.getValue()).isEmpty();
                    g71 g71Var4 = new g71(1.0f, true);
                    boolean zM1980f4 = go0Var2.m1980f(xk1Var3);
                    Object objM1956L7 = go0Var2.m1956L();
                    if (zM1980f4 || objM1956L7 == c0160eb) {
                        objM1956L7 = new C0186f0(xk1Var3, 14);
                        go0Var2.m1981f0(objM1956L7);
                    }
                    AbstractC0691se.m4847r(strM4462P4, (xm0) objM1956L7, g71Var4, z7, 0, go0Var2, 0, 48);
                    go0Var2.m1994p(true);
                    rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 10.0f));
                    k33 k33Var = (k33) xk1Var.getValue();
                    if (t11.m5086l(k33Var, j33.f4888a)) {
                        go0Var2.m1966W(978404700);
                        t11.m5082h(pp0.f8432a, go0Var2, 6);
                        go0Var2.m1994p(false);
                    } else if (t11.m5086l(k33Var, h33.f3812a)) {
                        go0Var2.m1966W(979053964);
                        final int i5 = 1;
                        t11.m5082h(xe1.m6126i0(-586620484, new nn0() { // from class: nh
                            @Override // p000.nn0
                            /* JADX INFO: renamed from: e */
                            public final Object mo489e(Object obj4, Object obj5, Object obj6) {
                                int i52 = i5;
                                a83 a83Var2 = a83.f116a;
                                C0160eb c0160eb2 = C0520nx.f7360a;
                                rh1 rh1Var2 = rh1.f9587a;
                                kx1 kx1Var2 = kx1Var;
                                switch (i52) {
                                    case 0:
                                        InterfaceC0596px interfaceC0596px22 = (InterfaceC0596px) obj5;
                                        int iIntValue22 = ((Integer) obj6).intValue();
                                        ((C0069bv) obj4).getClass();
                                        go0 go0Var22 = (go0) interfaceC0596px22;
                                        if (!go0Var22.m1958O(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                            go0Var22.m1961R();
                                        } else {
                                            s11.m4690e(rg3.m4462P(R.string.auto_receive_redpacket_load_contacts_failed, go0Var22), go0Var22, 0);
                                            String strM5687f = vi0.m5687f(rh1Var2, 12.0f, go0Var22, R.string.auto_receive_redpacket_retry, go0Var22);
                                            Object objM1956L42 = go0Var22.m1956L();
                                            if (objM1956L42 == c0160eb2) {
                                                objM1956L42 = new C0600q0(kx1Var2, 3);
                                                go0Var22.m1981f0(objM1956L42);
                                            }
                                            AbstractC0691se.m4847r(strM5687f, (xm0) objM1956L42, null, false, 0, go0Var22, 48, 60);
                                        }
                                        break;
                                    case 1:
                                        InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        ((C0069bv) obj4).getClass();
                                        go0 go0Var3 = (go0) interfaceC0596px3;
                                        if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            go0Var3.m1961R();
                                        } else {
                                            t11.m5083i(rg3.m4462P(R.string.auto_receive_transfer_money_load_contacts_failed, go0Var3), go0Var3, 0);
                                            String strM5687f2 = vi0.m5687f(rh1Var2, 12.0f, go0Var3, R.string.auto_receive_transfer_money_retry, go0Var3);
                                            Object objM1956L52 = go0Var3.m1956L();
                                            if (objM1956L52 == c0160eb2) {
                                                objM1956L52 = new C0600q0(kx1Var2, 4);
                                                go0Var3.m1981f0(objM1956L52);
                                            }
                                            AbstractC0691se.m4847r(strM5687f2, (xm0) objM1956L52, null, false, 0, go0Var3, 48, 60);
                                        }
                                        break;
                                    default:
                                        InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        ((C0069bv) obj4).getClass();
                                        go0 go0Var4 = (go0) interfaceC0596px4;
                                        if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            go0Var4.m1961R();
                                        } else {
                                            AbstractC0691se.m4841l(rg3.m4462P(R.string.wechat_contact_selector_load_contacts_failed, go0Var4), go0Var4, 0);
                                            String strM5687f3 = vi0.m5687f(rh1Var2, 12.0f, go0Var4, R.string.wechat_contact_selector_retry, go0Var4);
                                            Object objM1956L62 = go0Var4.m1956L();
                                            if (objM1956L62 == c0160eb2) {
                                                objM1956L62 = new C0600q0(kx1Var2, 6);
                                                go0Var4.m1981f0(objM1956L62);
                                            }
                                            AbstractC0691se.m4847r(strM5687f3, (xm0) objM1956L62, null, false, 0, go0Var4, 48, 60);
                                        }
                                        break;
                                }
                                return a83Var2;
                            }
                        }, go0Var2), go0Var2, 6);
                        go0Var2.m1994p(false);
                    } else if (!(k33Var instanceof i33)) {
                        go0Var2.m1966W(170109027);
                        go0Var2.m1994p(false);
                        c80.m675s();
                    } else {
                        go0Var2.m1966W(979723037);
                        if (list.isEmpty()) {
                            go0Var2.m1966W(979731748);
                            t11.m5082h(pp0.f8433b, go0Var2, 6);
                            z2 = false;
                            go0Var2.m1994p(false);
                        } else {
                            go0Var2.m1966W(980104120);
                            int i6 = 1;
                            uh1 uh1VarM5187P2 = AbstractC0731te.m5187P(yi0Var2, 0.0f, 360.0f, 1);
                            boolean zM1984h2 = go0Var2.m1984h(list) | go0Var2.m1980f(xk1Var3);
                            Object objM1956L8 = go0Var2.m1956L();
                            if (zM1984h2 || objM1956L8 == c0160eb) {
                                objM1956L8 = new C0543oh(list, xk1Var3, i6);
                                go0Var2.m1981f0(objM1956L8);
                            }
                            rg3.m4468d(6, 510, null, null, null, go0Var2, null, (in0) objM1956L8, null, uh1VarM5187P2, null, false);
                            z2 = false;
                            go0Var2.m1994p(false);
                        }
                        go0Var2.m1994p(z2);
                    }
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.m1961R();
                } else {
                    String str3 = (String) xk1Var2.getValue();
                    Object objM1956L9 = go0Var3.m1956L();
                    if (objM1956L9 == c0160eb) {
                        objM1956L9 = new C0590pr(xk1Var2, 27);
                        go0Var3.m1981f0(objM1956L9);
                    }
                    tp0.m5357b(str3, (in0) objM1956L9, null, rg3.m4462P(R.string.wechat_contact_selector_search_contacts, go0Var3), null, null, false, 0, 0, false, false, null, null, null, go0Var3, 48, 0, 16372);
                    rp0.m4529O(go0Var3, AbstractC0731te.m5186O(rh1Var, 10.0f));
                    yi0 yi0Var3 = AbstractC0731te.f10693e;
                    ob2 ob2VarM3265a3 = nb2.m3265a(new C0884xf(10.0f, new C0676s(2)), C0700sn.f10231s, go0Var3, 6);
                    int iHashCode3 = Long.hashCode(go0Var3.f3614T);
                    yy1 yy1VarM1990l3 = go0Var3.m1990l();
                    uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var3, yi0Var3);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy3 = C0256gx.f3727b;
                    go0Var3.m1969Z();
                    if (go0Var3.f3613S) {
                        go0Var3.m1989k(c0367jy3);
                    } else {
                        go0Var3.m1987i0();
                    }
                    yf3.m6268c(go0Var3, C0256gx.f3730e, ob2VarM3265a3);
                    yf3.m6268c(go0Var3, C0256gx.f3729d, yy1VarM1990l3);
                    yf3.m6268c(go0Var3, C0256gx.f3731f, Integer.valueOf(iHashCode3));
                    yf3.m6267b(go0Var3, C0256gx.f3732g);
                    yf3.m6268c(go0Var3, C0256gx.f3728c, uh1VarM5285M3);
                    String strM4462P5 = rg3.m4462P(R.string.wechat_contact_selector_select_all, go0Var3);
                    boolean z8 = !list.isEmpty();
                    g71 g71Var5 = new g71(1.0f, true);
                    boolean zM1980f5 = go0Var3.m1980f(xk1Var3) | go0Var3.m1984h(list);
                    Object objM1956L10 = go0Var3.m1956L();
                    if (zM1980f5 || objM1956L10 == c0160eb) {
                        final int i7 = 2;
                        objM1956L10 = new xm0() { // from class: mh
                            @Override // p000.xm0
                            /* JADX INFO: renamed from: a */
                            public final Object mo6a() {
                                int i42 = i7;
                                a83 a83Var2 = a83.f116a;
                                xk1 xk1Var4 = xk1Var3;
                                List list2 = list;
                                switch (i42) {
                                    case 0:
                                        Set set = (Set) xk1Var4.getValue();
                                        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((s62) it.next()).f9944a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set, arrayList));
                                        break;
                                    case 1:
                                        Set set2 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((g33) it2.next()).f3298a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set2, arrayList2));
                                        break;
                                    default:
                                        Set set3 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((jc3) it3.next()).f4964a);
                                        }
                                        xk1Var4.setValue(np2.m3354c0(set3, arrayList3));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var3.m1981f0(objM1956L10);
                    }
                    AbstractC0691se.m4847r(strM4462P5, (xm0) objM1956L10, g71Var5, z8, 0, go0Var3, 0, 48);
                    String strM4462P6 = rg3.m4462P(R.string.wechat_contact_selector_clear_selection, go0Var3);
                    boolean z9 = !((Set) xk1Var3.getValue()).isEmpty();
                    g71 g71Var6 = new g71(1.0f, true);
                    boolean zM1980f6 = go0Var3.m1980f(xk1Var3);
                    Object objM1956L11 = go0Var3.m1956L();
                    int i8 = 3;
                    if (zM1980f6 || objM1956L11 == c0160eb) {
                        objM1956L11 = new a02(xk1Var3, 3);
                        go0Var3.m1981f0(objM1956L11);
                    }
                    AbstractC0691se.m4847r(strM4462P6, (xm0) objM1956L11, g71Var6, z9, 0, go0Var3, 0, 48);
                    go0Var3.m1994p(true);
                    rp0.m4529O(go0Var3, AbstractC0731te.m5186O(rh1Var, 10.0f));
                    nc3 nc3Var = (nc3) xk1Var.getValue();
                    if (t11.m5086l(nc3Var, mc3.f6566a)) {
                        go0Var3.m1966W(1564531403);
                        AbstractC0691se.m4840k(gf1.f3484a, go0Var3, 6);
                        go0Var3.m1994p(false);
                    } else if (t11.m5086l(nc3Var, kc3.f5459a)) {
                        go0Var3.m1966W(1565184976);
                        final int i9 = 2;
                        AbstractC0691se.m4840k(xe1.m6126i0(-1237089794, new nn0() { // from class: nh
                            @Override // p000.nn0
                            /* JADX INFO: renamed from: e */
                            public final Object mo489e(Object obj4, Object obj5, Object obj6) {
                                int i52 = i9;
                                a83 a83Var2 = a83.f116a;
                                C0160eb c0160eb2 = C0520nx.f7360a;
                                rh1 rh1Var2 = rh1.f9587a;
                                kx1 kx1Var2 = kx1Var;
                                switch (i52) {
                                    case 0:
                                        InterfaceC0596px interfaceC0596px22 = (InterfaceC0596px) obj5;
                                        int iIntValue22 = ((Integer) obj6).intValue();
                                        ((C0069bv) obj4).getClass();
                                        go0 go0Var22 = (go0) interfaceC0596px22;
                                        if (!go0Var22.m1958O(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                            go0Var22.m1961R();
                                        } else {
                                            s11.m4690e(rg3.m4462P(R.string.auto_receive_redpacket_load_contacts_failed, go0Var22), go0Var22, 0);
                                            String strM5687f = vi0.m5687f(rh1Var2, 12.0f, go0Var22, R.string.auto_receive_redpacket_retry, go0Var22);
                                            Object objM1956L42 = go0Var22.m1956L();
                                            if (objM1956L42 == c0160eb2) {
                                                objM1956L42 = new C0600q0(kx1Var2, 3);
                                                go0Var22.m1981f0(objM1956L42);
                                            }
                                            AbstractC0691se.m4847r(strM5687f, (xm0) objM1956L42, null, false, 0, go0Var22, 48, 60);
                                        }
                                        break;
                                    case 1:
                                        InterfaceC0596px interfaceC0596px32 = (InterfaceC0596px) obj5;
                                        int iIntValue32 = ((Integer) obj6).intValue();
                                        ((C0069bv) obj4).getClass();
                                        go0 go0Var32 = (go0) interfaceC0596px32;
                                        if (!go0Var32.m1958O(iIntValue32 & 1, (iIntValue32 & 17) != 16)) {
                                            go0Var32.m1961R();
                                        } else {
                                            t11.m5083i(rg3.m4462P(R.string.auto_receive_transfer_money_load_contacts_failed, go0Var32), go0Var32, 0);
                                            String strM5687f2 = vi0.m5687f(rh1Var2, 12.0f, go0Var32, R.string.auto_receive_transfer_money_retry, go0Var32);
                                            Object objM1956L52 = go0Var32.m1956L();
                                            if (objM1956L52 == c0160eb2) {
                                                objM1956L52 = new C0600q0(kx1Var2, 4);
                                                go0Var32.m1981f0(objM1956L52);
                                            }
                                            AbstractC0691se.m4847r(strM5687f2, (xm0) objM1956L52, null, false, 0, go0Var32, 48, 60);
                                        }
                                        break;
                                    default:
                                        InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        ((C0069bv) obj4).getClass();
                                        go0 go0Var4 = (go0) interfaceC0596px4;
                                        if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            go0Var4.m1961R();
                                        } else {
                                            AbstractC0691se.m4841l(rg3.m4462P(R.string.wechat_contact_selector_load_contacts_failed, go0Var4), go0Var4, 0);
                                            String strM5687f3 = vi0.m5687f(rh1Var2, 12.0f, go0Var4, R.string.wechat_contact_selector_retry, go0Var4);
                                            Object objM1956L62 = go0Var4.m1956L();
                                            if (objM1956L62 == c0160eb2) {
                                                objM1956L62 = new C0600q0(kx1Var2, 6);
                                                go0Var4.m1981f0(objM1956L62);
                                            }
                                            AbstractC0691se.m4847r(strM5687f3, (xm0) objM1956L62, null, false, 0, go0Var4, 48, 60);
                                        }
                                        break;
                                }
                                return a83Var2;
                            }
                        }, go0Var3), go0Var3, 6);
                        go0Var3.m1994p(false);
                    } else if (!(nc3Var instanceof lc3)) {
                        go0Var3.m1966W(189016471);
                        go0Var3.m1994p(false);
                        c80.m675s();
                    } else {
                        go0Var3.m1966W(1565927798);
                        if (list.isEmpty()) {
                            go0Var3.m1966W(1565936819);
                            AbstractC0691se.m4840k(gf1.f3485b, go0Var3, 6);
                            z3 = false;
                            go0Var3.m1994p(false);
                        } else {
                            go0Var3.m1966W(1566312725);
                            uh1 uh1VarM5187P3 = AbstractC0731te.m5187P(yi0Var3, 0.0f, 360.0f, 1);
                            boolean zM1984h3 = go0Var3.m1984h(list) | go0Var3.m1980f(xk1Var3);
                            Object objM1956L12 = go0Var3.m1956L();
                            if (zM1984h3 || objM1956L12 == c0160eb) {
                                objM1956L12 = new C0543oh(list, xk1Var3, i8);
                                go0Var3.m1981f0(objM1956L12);
                            }
                            rg3.m4468d(6, 510, null, null, null, go0Var3, null, (in0) objM1956L12, null, uh1VarM5187P3, null, false);
                            z3 = false;
                            go0Var3.m1994p(false);
                        }
                        go0Var3.m1994p(z3);
                    }
                }
                break;
        }
        return a83Var;
    }
}
