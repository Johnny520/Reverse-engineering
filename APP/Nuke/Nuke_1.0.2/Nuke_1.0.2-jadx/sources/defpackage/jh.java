package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ xk1 j;
    public final /* synthetic */ xk1 k;
    public final /* synthetic */ xk1 l;
    public final /* synthetic */ kx1 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jh(List list, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, kx1 kx1Var, int i) {
        this.h = i;
        this.i = list;
        this.j = xk1Var;
        this.k = xk1Var2;
        this.l = xk1Var3;
        this.m = kx1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.h;
        a83 a83Var = a83.a;
        rh1 rh1Var = rh1.a;
        eb ebVar = nx.a;
        final kx1 kx1Var = this.m;
        xk1 xk1Var = this.l;
        xk1 xk1Var2 = this.k;
        final xk1 xk1Var3 = this.j;
        final List list = this.i;
        final int i2 = 1;
        switch (i) {
            case 0:
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    String str = (String) xk1Var2.getValue();
                    Object objL = go0Var.L();
                    if (objL == ebVar) {
                        objL = new h0(xk1Var2, 17);
                        go0Var.f0(objL);
                    }
                    tp0.b(str, (in0) objL, null, rg3.P(R.string.auto_receive_redpacket_search_contacts, go0Var), null, null, false, 0, 0, false, false, null, null, null, go0Var, 48, 0, 16372);
                    rp0.O(go0Var, te.O(rh1Var, 10.0f));
                    yi0 yi0Var = te.e;
                    ob2 ob2VarA = nb2.a(new xf(10.0f, new s(2)), sn.s, go0Var, 6);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, yi0Var);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, ob2VarA);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    String strP = rg3.P(R.string.auto_receive_redpacket_select_all, go0Var);
                    boolean z4 = !list.isEmpty();
                    g71 g71Var = new g71(1.0f, true);
                    boolean zF = go0Var.f(xk1Var3) | go0Var.h(list);
                    Object objL2 = go0Var.L();
                    if (zF || objL2 == ebVar) {
                        final int i3 = 0;
                        objL2 = new xm0() { // from class: mh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.xm0
                            public final Object a() {
                                int i4 = i3;
                                a83 a83Var2 = a83.a;
                                xk1 xk1Var4 = xk1Var3;
                                List list2 = list;
                                switch (i4) {
                                    case 0:
                                        Set set = (Set) xk1Var4.getValue();
                                        ArrayList arrayList = new ArrayList(eu.B(list2, 10));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((s62) it.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set, arrayList));
                                        break;
                                    case 1:
                                        Set set2 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList2 = new ArrayList(eu.B(list2, 10));
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((g33) it2.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set2, arrayList2));
                                        break;
                                    default:
                                        Set set3 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList3 = new ArrayList(eu.B(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((jc3) it3.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set3, arrayList3));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var.f0(objL2);
                    }
                    se.r(strP, (xm0) objL2, g71Var, z4, 0, go0Var, 0, 48);
                    String strP2 = rg3.P(R.string.auto_receive_redpacket_clear_selection, go0Var);
                    boolean z5 = !((Set) xk1Var3.getValue()).isEmpty();
                    g71 g71Var2 = new g71(1.0f, true);
                    boolean zF2 = go0Var.f(xk1Var3);
                    Object objL3 = go0Var.L();
                    if (zF2 || objL3 == ebVar) {
                        objL3 = new f0(xk1Var3, 12);
                        go0Var.f0(objL3);
                    }
                    se.r(strP2, (xm0) objL3, g71Var2, z5, 0, go0Var, 0, 48);
                    go0Var.p(true);
                    rp0.O(go0Var, te.O(rh1Var, 10.0f));
                    w62 w62Var = (w62) xk1Var.getValue();
                    if (!t11.l(w62Var, v62.a)) {
                        final int i4 = 0;
                        if (t11.l(w62Var, t62.a)) {
                            go0Var.W(1994566487);
                            s11.d(xe1.i0(-1832512475, new nn0() { // from class: nh
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.nn0
                                public final Object e(Object obj4, Object obj5, Object obj6) {
                                    int i5 = i4;
                                    a83 a83Var2 = a83.a;
                                    eb ebVar2 = nx.a;
                                    rh1 rh1Var2 = rh1.a;
                                    kx1 kx1Var2 = kx1Var;
                                    switch (i5) {
                                        case 0:
                                            px pxVar2 = (px) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((bv) obj4).getClass();
                                            go0 go0Var2 = (go0) pxVar2;
                                            if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                go0Var2.R();
                                            } else {
                                                s11.e(rg3.P(R.string.auto_receive_redpacket_load_contacts_failed, go0Var2), go0Var2, 0);
                                                String strF = vi0.f(rh1Var2, 12.0f, go0Var2, R.string.auto_receive_redpacket_retry, go0Var2);
                                                Object objL4 = go0Var2.L();
                                                if (objL4 == ebVar2) {
                                                    objL4 = new q0(kx1Var2, 3);
                                                    go0Var2.f0(objL4);
                                                }
                                                se.r(strF, (xm0) objL4, null, false, 0, go0Var2, 48, 60);
                                            }
                                            break;
                                        case 1:
                                            px pxVar3 = (px) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((bv) obj4).getClass();
                                            go0 go0Var3 = (go0) pxVar3;
                                            if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                go0Var3.R();
                                            } else {
                                                t11.i(rg3.P(R.string.auto_receive_transfer_money_load_contacts_failed, go0Var3), go0Var3, 0);
                                                String strF2 = vi0.f(rh1Var2, 12.0f, go0Var3, R.string.auto_receive_transfer_money_retry, go0Var3);
                                                Object objL5 = go0Var3.L();
                                                if (objL5 == ebVar2) {
                                                    objL5 = new q0(kx1Var2, 4);
                                                    go0Var3.f0(objL5);
                                                }
                                                se.r(strF2, (xm0) objL5, null, false, 0, go0Var3, 48, 60);
                                            }
                                            break;
                                        default:
                                            px pxVar4 = (px) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((bv) obj4).getClass();
                                            go0 go0Var4 = (go0) pxVar4;
                                            if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                go0Var4.R();
                                            } else {
                                                se.l(rg3.P(R.string.wechat_contact_selector_load_contacts_failed, go0Var4), go0Var4, 0);
                                                String strF3 = vi0.f(rh1Var2, 12.0f, go0Var4, R.string.wechat_contact_selector_retry, go0Var4);
                                                Object objL6 = go0Var4.L();
                                                if (objL6 == ebVar2) {
                                                    objL6 = new q0(kx1Var2, 6);
                                                    go0Var4.f0(objL6);
                                                }
                                                se.r(strF3, (xm0) objL6, null, false, 0, go0Var4, 48, 60);
                                            }
                                            break;
                                    }
                                    return a83Var2;
                                }
                            }, go0Var), go0Var, 6);
                            go0Var.p(false);
                        } else if (!(w62Var instanceof u62)) {
                            go0Var.W(757059037);
                            go0Var.p(false);
                            c80.s();
                        } else {
                            go0Var.W(1995156169);
                            if (list.isEmpty()) {
                                go0Var.W(1995164818);
                                s11.d(op0.c, go0Var, 6);
                                z = false;
                                go0Var.p(false);
                            } else {
                                go0Var.W(1995456528);
                                uh1 uh1VarP = te.P(yi0Var, 0.0f, 360.0f, 1);
                                boolean zH = go0Var.h(list) | go0Var.f(xk1Var3);
                                Object objL4 = go0Var.L();
                                if (zH || objL4 == ebVar) {
                                    objL4 = new oh(list, xk1Var3, 0);
                                    go0Var.f0(objL4);
                                }
                                rg3.d(6, 510, null, null, null, go0Var, null, (in0) objL4, null, uh1VarP, null, false);
                                z = false;
                                go0Var.p(false);
                            }
                            go0Var.p(z);
                        }
                    } else {
                        go0Var.W(1993991778);
                        s11.d(op0.b, go0Var, 6);
                        go0Var.p(false);
                    }
                }
                break;
            case 1:
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    String str2 = (String) xk1Var2.getValue();
                    Object objL5 = go0Var2.L();
                    if (objL5 == ebVar) {
                        objL5 = new h0(xk1Var2, 22);
                        go0Var2.f0(objL5);
                    }
                    tp0.b(str2, (in0) objL5, null, rg3.P(R.string.auto_receive_transfer_money_search_contacts, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 48, 0, 16372);
                    rp0.O(go0Var2, te.O(rh1Var, 10.0f));
                    yi0 yi0Var2 = te.e;
                    ob2 ob2VarA2 = nb2.a(new xf(10.0f, new s(2)), sn.s, go0Var2, 6);
                    int iHashCode2 = Long.hashCode(go0Var2.T);
                    yy1 yy1VarL2 = go0Var2.l();
                    uh1 uh1VarM2 = tl.M(go0Var2, yi0Var2);
                    hx.c.getClass();
                    jy jyVar2 = gx.b;
                    go0Var2.Z();
                    if (go0Var2.S) {
                        go0Var2.k(jyVar2);
                    } else {
                        go0Var2.i0();
                    }
                    yf3.c(go0Var2, gx.e, ob2VarA2);
                    yf3.c(go0Var2, gx.d, yy1VarL2);
                    yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode2));
                    yf3.b(go0Var2, gx.g);
                    yf3.c(go0Var2, gx.c, uh1VarM2);
                    String strP3 = rg3.P(R.string.auto_receive_transfer_money_select_all, go0Var2);
                    boolean z6 = !list.isEmpty();
                    g71 g71Var3 = new g71(1.0f, true);
                    boolean zF3 = go0Var2.f(xk1Var3) | go0Var2.h(list);
                    Object objL6 = go0Var2.L();
                    if (zF3 || objL6 == ebVar) {
                        objL6 = new xm0() { // from class: mh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.xm0
                            public final Object a() {
                                int i42 = i2;
                                a83 a83Var2 = a83.a;
                                xk1 xk1Var4 = xk1Var3;
                                List list2 = list;
                                switch (i42) {
                                    case 0:
                                        Set set = (Set) xk1Var4.getValue();
                                        ArrayList arrayList = new ArrayList(eu.B(list2, 10));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((s62) it.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set, arrayList));
                                        break;
                                    case 1:
                                        Set set2 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList2 = new ArrayList(eu.B(list2, 10));
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((g33) it2.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set2, arrayList2));
                                        break;
                                    default:
                                        Set set3 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList3 = new ArrayList(eu.B(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((jc3) it3.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set3, arrayList3));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var2.f0(objL6);
                    }
                    se.r(strP3, (xm0) objL6, g71Var3, z6, 0, go0Var2, 0, 48);
                    String strP4 = rg3.P(R.string.auto_receive_transfer_money_clear_selection, go0Var2);
                    boolean z7 = !((Set) xk1Var3.getValue()).isEmpty();
                    g71 g71Var4 = new g71(1.0f, true);
                    boolean zF4 = go0Var2.f(xk1Var3);
                    Object objL7 = go0Var2.L();
                    if (zF4 || objL7 == ebVar) {
                        objL7 = new f0(xk1Var3, 14);
                        go0Var2.f0(objL7);
                    }
                    se.r(strP4, (xm0) objL7, g71Var4, z7, 0, go0Var2, 0, 48);
                    go0Var2.p(true);
                    rp0.O(go0Var2, te.O(rh1Var, 10.0f));
                    k33 k33Var = (k33) xk1Var.getValue();
                    if (t11.l(k33Var, j33.a)) {
                        go0Var2.W(978404700);
                        t11.h(pp0.a, go0Var2, 6);
                        go0Var2.p(false);
                    } else if (t11.l(k33Var, h33.a)) {
                        go0Var2.W(979053964);
                        final int i5 = 1;
                        t11.h(xe1.i0(-586620484, new nn0() { // from class: nh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.nn0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                int i52 = i5;
                                a83 a83Var2 = a83.a;
                                eb ebVar2 = nx.a;
                                rh1 rh1Var2 = rh1.a;
                                kx1 kx1Var2 = kx1Var;
                                switch (i52) {
                                    case 0:
                                        px pxVar22 = (px) obj5;
                                        int iIntValue22 = ((Integer) obj6).intValue();
                                        ((bv) obj4).getClass();
                                        go0 go0Var22 = (go0) pxVar22;
                                        if (!go0Var22.O(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                            go0Var22.R();
                                        } else {
                                            s11.e(rg3.P(R.string.auto_receive_redpacket_load_contacts_failed, go0Var22), go0Var22, 0);
                                            String strF = vi0.f(rh1Var2, 12.0f, go0Var22, R.string.auto_receive_redpacket_retry, go0Var22);
                                            Object objL42 = go0Var22.L();
                                            if (objL42 == ebVar2) {
                                                objL42 = new q0(kx1Var2, 3);
                                                go0Var22.f0(objL42);
                                            }
                                            se.r(strF, (xm0) objL42, null, false, 0, go0Var22, 48, 60);
                                        }
                                        break;
                                    case 1:
                                        px pxVar3 = (px) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        ((bv) obj4).getClass();
                                        go0 go0Var3 = (go0) pxVar3;
                                        if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            go0Var3.R();
                                        } else {
                                            t11.i(rg3.P(R.string.auto_receive_transfer_money_load_contacts_failed, go0Var3), go0Var3, 0);
                                            String strF2 = vi0.f(rh1Var2, 12.0f, go0Var3, R.string.auto_receive_transfer_money_retry, go0Var3);
                                            Object objL52 = go0Var3.L();
                                            if (objL52 == ebVar2) {
                                                objL52 = new q0(kx1Var2, 4);
                                                go0Var3.f0(objL52);
                                            }
                                            se.r(strF2, (xm0) objL52, null, false, 0, go0Var3, 48, 60);
                                        }
                                        break;
                                    default:
                                        px pxVar4 = (px) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        ((bv) obj4).getClass();
                                        go0 go0Var4 = (go0) pxVar4;
                                        if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            go0Var4.R();
                                        } else {
                                            se.l(rg3.P(R.string.wechat_contact_selector_load_contacts_failed, go0Var4), go0Var4, 0);
                                            String strF3 = vi0.f(rh1Var2, 12.0f, go0Var4, R.string.wechat_contact_selector_retry, go0Var4);
                                            Object objL62 = go0Var4.L();
                                            if (objL62 == ebVar2) {
                                                objL62 = new q0(kx1Var2, 6);
                                                go0Var4.f0(objL62);
                                            }
                                            se.r(strF3, (xm0) objL62, null, false, 0, go0Var4, 48, 60);
                                        }
                                        break;
                                }
                                return a83Var2;
                            }
                        }, go0Var2), go0Var2, 6);
                        go0Var2.p(false);
                    } else if (!(k33Var instanceof i33)) {
                        go0Var2.W(170109027);
                        go0Var2.p(false);
                        c80.s();
                    } else {
                        go0Var2.W(979723037);
                        if (list.isEmpty()) {
                            go0Var2.W(979731748);
                            t11.h(pp0.b, go0Var2, 6);
                            z2 = false;
                            go0Var2.p(false);
                        } else {
                            go0Var2.W(980104120);
                            int i6 = 1;
                            uh1 uh1VarP2 = te.P(yi0Var2, 0.0f, 360.0f, 1);
                            boolean zH2 = go0Var2.h(list) | go0Var2.f(xk1Var3);
                            Object objL8 = go0Var2.L();
                            if (zH2 || objL8 == ebVar) {
                                objL8 = new oh(list, xk1Var3, i6);
                                go0Var2.f0(objL8);
                            }
                            rg3.d(6, 510, null, null, null, go0Var2, null, (in0) objL8, null, uh1VarP2, null, false);
                            z2 = false;
                            go0Var2.p(false);
                        }
                        go0Var2.p(z2);
                    }
                }
                break;
            default:
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.R();
                } else {
                    String str3 = (String) xk1Var2.getValue();
                    Object objL9 = go0Var3.L();
                    if (objL9 == ebVar) {
                        objL9 = new pr(xk1Var2, 27);
                        go0Var3.f0(objL9);
                    }
                    tp0.b(str3, (in0) objL9, null, rg3.P(R.string.wechat_contact_selector_search_contacts, go0Var3), null, null, false, 0, 0, false, false, null, null, null, go0Var3, 48, 0, 16372);
                    rp0.O(go0Var3, te.O(rh1Var, 10.0f));
                    yi0 yi0Var3 = te.e;
                    ob2 ob2VarA3 = nb2.a(new xf(10.0f, new s(2)), sn.s, go0Var3, 6);
                    int iHashCode3 = Long.hashCode(go0Var3.T);
                    yy1 yy1VarL3 = go0Var3.l();
                    uh1 uh1VarM3 = tl.M(go0Var3, yi0Var3);
                    hx.c.getClass();
                    jy jyVar3 = gx.b;
                    go0Var3.Z();
                    if (go0Var3.S) {
                        go0Var3.k(jyVar3);
                    } else {
                        go0Var3.i0();
                    }
                    yf3.c(go0Var3, gx.e, ob2VarA3);
                    yf3.c(go0Var3, gx.d, yy1VarL3);
                    yf3.c(go0Var3, gx.f, Integer.valueOf(iHashCode3));
                    yf3.b(go0Var3, gx.g);
                    yf3.c(go0Var3, gx.c, uh1VarM3);
                    String strP5 = rg3.P(R.string.wechat_contact_selector_select_all, go0Var3);
                    boolean z8 = !list.isEmpty();
                    g71 g71Var5 = new g71(1.0f, true);
                    boolean zF5 = go0Var3.f(xk1Var3) | go0Var3.h(list);
                    Object objL10 = go0Var3.L();
                    if (zF5 || objL10 == ebVar) {
                        final int i7 = 2;
                        objL10 = new xm0() { // from class: mh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.xm0
                            public final Object a() {
                                int i42 = i7;
                                a83 a83Var2 = a83.a;
                                xk1 xk1Var4 = xk1Var3;
                                List list2 = list;
                                switch (i42) {
                                    case 0:
                                        Set set = (Set) xk1Var4.getValue();
                                        ArrayList arrayList = new ArrayList(eu.B(list2, 10));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((s62) it.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set, arrayList));
                                        break;
                                    case 1:
                                        Set set2 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList2 = new ArrayList(eu.B(list2, 10));
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((g33) it2.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set2, arrayList2));
                                        break;
                                    default:
                                        Set set3 = (Set) xk1Var4.getValue();
                                        ArrayList arrayList3 = new ArrayList(eu.B(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((jc3) it3.next()).a);
                                        }
                                        xk1Var4.setValue(np2.c0(set3, arrayList3));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var3.f0(objL10);
                    }
                    se.r(strP5, (xm0) objL10, g71Var5, z8, 0, go0Var3, 0, 48);
                    String strP6 = rg3.P(R.string.wechat_contact_selector_clear_selection, go0Var3);
                    boolean z9 = !((Set) xk1Var3.getValue()).isEmpty();
                    g71 g71Var6 = new g71(1.0f, true);
                    boolean zF6 = go0Var3.f(xk1Var3);
                    Object objL11 = go0Var3.L();
                    int i8 = 3;
                    if (zF6 || objL11 == ebVar) {
                        objL11 = new a02(xk1Var3, 3);
                        go0Var3.f0(objL11);
                    }
                    se.r(strP6, (xm0) objL11, g71Var6, z9, 0, go0Var3, 0, 48);
                    go0Var3.p(true);
                    rp0.O(go0Var3, te.O(rh1Var, 10.0f));
                    nc3 nc3Var = (nc3) xk1Var.getValue();
                    if (t11.l(nc3Var, mc3.a)) {
                        go0Var3.W(1564531403);
                        se.k(gf1.a, go0Var3, 6);
                        go0Var3.p(false);
                    } else if (t11.l(nc3Var, kc3.a)) {
                        go0Var3.W(1565184976);
                        final int i9 = 2;
                        se.k(xe1.i0(-1237089794, new nn0() { // from class: nh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.nn0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                int i52 = i9;
                                a83 a83Var2 = a83.a;
                                eb ebVar2 = nx.a;
                                rh1 rh1Var2 = rh1.a;
                                kx1 kx1Var2 = kx1Var;
                                switch (i52) {
                                    case 0:
                                        px pxVar22 = (px) obj5;
                                        int iIntValue22 = ((Integer) obj6).intValue();
                                        ((bv) obj4).getClass();
                                        go0 go0Var22 = (go0) pxVar22;
                                        if (!go0Var22.O(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                            go0Var22.R();
                                        } else {
                                            s11.e(rg3.P(R.string.auto_receive_redpacket_load_contacts_failed, go0Var22), go0Var22, 0);
                                            String strF = vi0.f(rh1Var2, 12.0f, go0Var22, R.string.auto_receive_redpacket_retry, go0Var22);
                                            Object objL42 = go0Var22.L();
                                            if (objL42 == ebVar2) {
                                                objL42 = new q0(kx1Var2, 3);
                                                go0Var22.f0(objL42);
                                            }
                                            se.r(strF, (xm0) objL42, null, false, 0, go0Var22, 48, 60);
                                        }
                                        break;
                                    case 1:
                                        px pxVar32 = (px) obj5;
                                        int iIntValue32 = ((Integer) obj6).intValue();
                                        ((bv) obj4).getClass();
                                        go0 go0Var32 = (go0) pxVar32;
                                        if (!go0Var32.O(iIntValue32 & 1, (iIntValue32 & 17) != 16)) {
                                            go0Var32.R();
                                        } else {
                                            t11.i(rg3.P(R.string.auto_receive_transfer_money_load_contacts_failed, go0Var32), go0Var32, 0);
                                            String strF2 = vi0.f(rh1Var2, 12.0f, go0Var32, R.string.auto_receive_transfer_money_retry, go0Var32);
                                            Object objL52 = go0Var32.L();
                                            if (objL52 == ebVar2) {
                                                objL52 = new q0(kx1Var2, 4);
                                                go0Var32.f0(objL52);
                                            }
                                            se.r(strF2, (xm0) objL52, null, false, 0, go0Var32, 48, 60);
                                        }
                                        break;
                                    default:
                                        px pxVar4 = (px) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        ((bv) obj4).getClass();
                                        go0 go0Var4 = (go0) pxVar4;
                                        if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            go0Var4.R();
                                        } else {
                                            se.l(rg3.P(R.string.wechat_contact_selector_load_contacts_failed, go0Var4), go0Var4, 0);
                                            String strF3 = vi0.f(rh1Var2, 12.0f, go0Var4, R.string.wechat_contact_selector_retry, go0Var4);
                                            Object objL62 = go0Var4.L();
                                            if (objL62 == ebVar2) {
                                                objL62 = new q0(kx1Var2, 6);
                                                go0Var4.f0(objL62);
                                            }
                                            se.r(strF3, (xm0) objL62, null, false, 0, go0Var4, 48, 60);
                                        }
                                        break;
                                }
                                return a83Var2;
                            }
                        }, go0Var3), go0Var3, 6);
                        go0Var3.p(false);
                    } else if (!(nc3Var instanceof lc3)) {
                        go0Var3.W(189016471);
                        go0Var3.p(false);
                        c80.s();
                    } else {
                        go0Var3.W(1565927798);
                        if (list.isEmpty()) {
                            go0Var3.W(1565936819);
                            se.k(gf1.b, go0Var3, 6);
                            z3 = false;
                            go0Var3.p(false);
                        } else {
                            go0Var3.W(1566312725);
                            uh1 uh1VarP3 = te.P(yi0Var3, 0.0f, 360.0f, 1);
                            boolean zH3 = go0Var3.h(list) | go0Var3.f(xk1Var3);
                            Object objL12 = go0Var3.L();
                            if (zH3 || objL12 == ebVar) {
                                objL12 = new oh(list, xk1Var3, i8);
                                go0Var3.f0(objL12);
                            }
                            rg3.d(6, 510, null, null, null, go0Var3, null, (in0) objL12, null, uh1VarP3, null, false);
                            z3 = false;
                            go0Var3.p(false);
                        }
                        go0Var3.p(z3);
                    }
                }
                break;
        }
        return a83Var;
    }
}
