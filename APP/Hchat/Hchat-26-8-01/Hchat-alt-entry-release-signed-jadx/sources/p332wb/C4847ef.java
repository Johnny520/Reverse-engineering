package p332wb;

import android.app.Activity;
import android.content.Context;
import bi.AbstractC0316d;
import bi.C0314b;
import java.util.ArrayList;
import java.util.Set;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p197n9.C2912a;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p266s0.C3878h;
import p276sf.C3967n;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.ef */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4847ef implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16895g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f16896h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f16897i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f16898j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f16899k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f16900l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f16901m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f16902n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4847ef(Context context, C2912a c2912a, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f16899k = context;
        this.f16900l = c2912a;
        this.f16896h = z9;
        this.f16901m = interfaceC1220a;
        this.f16897i = interfaceC1231l;
        this.f16898j = interfaceC1231l2;
        this.f16902n = interfaceC1220a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ae  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1220a interfaceC1220a;
        C5597e c5597e;
        C1823e c1823e;
        Activity activity;
        boolean z9;
        C5597e c5597e2;
        C5593d c5593d;
        C5597e c5597e3;
        C5850l c5850l;
        C5660y c5660y;
        C5597e c5597e4;
        float f3;
        C1823e c1823e2;
        C1836h0 c1836h0;
        InterfaceC1220a interfaceC1220a2;
        boolean z10;
        Activity activity2;
        InterfaceC1231l interfaceC1231l;
        boolean zM4534f;
        Object objM4514P;
        InterfaceC1809a1 interfaceC1809a12;
        boolean z11;
        switch (this.f16895g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f16899k;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f16898j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f16900l;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f16901m;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f16902n;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z12 = this.f16896h;
                    C1823e c1823e3 = C1851l.f6155a;
                    if (z12) {
                        c1836h02.m4525a0(1029665346);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1029214637);
                        String strM9582j6 = AbstractC4955ho.m9582j6((String) interfaceC1809a13.getValue());
                        InterfaceC1231l interfaceC1231l3 = this.f16897i;
                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l3) | c1836h02.m4534f(interfaceC1809a13);
                        Object objM4514P2 = c1836h02.m4514P();
                        if (zM4534f2 || objM4514P2 == c1823e3) {
                            objM4514P2 = new C5161o1(interfaceC1231l3, interfaceC1809a13, 9);
                            c1836h02.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9503b("仅显示成员通知", strM9582j6, (InterfaceC1220a) objM4514P2, c1836h02, 6);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        String strM9582j62 = AbstractC4955ho.m9582j6((String) interfaceC1809a14.getValue());
                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1231l2) | c1836h02.m4534f(interfaceC1809a14);
                        Object objM4514P3 = c1836h02.m4514P();
                        if (zM4534f3 || objM4514P3 == c1823e3) {
                            objM4514P3 = new C5161o1(interfaceC1231l2, interfaceC1809a14, 10);
                            c1836h02.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9503b("屏蔽成员通知", strM9582j62, (InterfaceC1220a) objM4514P3, c1836h02, 6);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        c1836h02.m4553p(false);
                    }
                    boolean zBooleanValue = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                    boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a15);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4534f4 || objM4514P4 == c1823e3) {
                        objM4514P4 = new C4916gi(interfaceC1809a15, 10);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "屏蔽@所有人", "命中 @所有人 时不弹通知", false, (InterfaceC1231l) objM4514P4, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                    boolean zM4534f5 = c1836h02.m4534f(interfaceC1809a16);
                    Object objM4514P5 = c1836h02.m4514P();
                    if (zM4534f5 || objM4514P5 == c1823e3) {
                        objM4514P5 = new C4916gi(interfaceC1809a16, 11);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "屏蔽@我", "命中 @我 时不弹通知", false, (InterfaceC1231l) objM4514P5, c1836h02, 432, 8);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9505b1((Context) this.f16899k, (C2912a) this.f16900l, this.f16896h, (InterfaceC1220a) this.f16901m, this.f16897i, (InterfaceC1231l) this.f16898j, (InterfaceC1220a) this.f16902n, (C1836h0) obj, AbstractC1874r.m4617C(3137));
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f16898j;
                Set set = (Set) this.f16899k;
                String str = (String) this.f16900l;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f16901m;
                Activity activity3 = (Activity) this.f16902n;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM4534f6 = c1836h03.m4534f(arrayList) | c1836h03.m4534f(set);
                    Object objM4514P6 = c1836h03.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4534f6 || objM4514P6 == c1823e4) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set) {
                            int iIntValue3 = ((Number) obj3).intValue();
                            if (iIntValue3 >= 0 && iIntValue3 < arrayList.size()) {
                                arrayList2.add(obj3);
                            }
                        }
                        objM4514P6 = AbstractC1874r.m4639u(AbstractC4166m.m8412U1(arrayList2));
                        c1836h03.m4545k0(objM4514P6);
                    }
                    InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) objM4514P6;
                    C5850l c5850l2 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l2, 1.0f);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h03, 0);
                    int iHashCode = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l = c1836h03.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM6901d);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y2);
                    } else {
                        c1836h03.m4551n0();
                    }
                    C5597e c5597e5 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e5, c1836h03, c3256tM6935a);
                    C5597e c5597e6 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e6, c1836h03, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e7 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e7, c1836h03, numValueOf);
                    C5593d c5593d2 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d2, c1836h03);
                    C5597e c5597e8 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e8, c1836h03, interfaceC5853oM10543c);
                    if (AbstractC3149m.m6721t0(str)) {
                        interfaceC1809a1 = interfaceC1809a17;
                        interfaceC1220a = interfaceC1220a3;
                        c5597e = c5597e5;
                        c1823e = c1823e4;
                        activity = activity3;
                        z9 = false;
                        c5597e2 = c5597e6;
                        c5593d = c5593d2;
                        c5597e3 = c5597e7;
                        c5850l = c5850l2;
                        c5660y = c5660y2;
                        c5597e4 = c5597e8;
                        f3 = 1.0f;
                        c1836h03.m4525a0(1782596584);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(1782271921);
                        c5660y = c5660y2;
                        interfaceC1809a1 = interfaceC1809a17;
                        interfaceC1220a = interfaceC1220a3;
                        c1823e = c1823e4;
                        activity = activity3;
                        c5850l = c5850l2;
                        c5597e2 = c5597e6;
                        c5597e3 = c5597e7;
                        c5593d = c5593d2;
                        c5597e4 = c5597e8;
                        c5597e = c5597e5;
                        f3 = 1.0f;
                        z9 = false;
                        AbstractC4045s.m8250n(str, AbstractC3208d.m6886p(c5850l2, 4, 0.0f, 0.0f, 10, 6), ((C0314b) c1836h03.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h03, 24624, 0, 262120);
                        c1836h03 = c1836h03;
                        c1836h03.m4553p(false);
                    }
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l, f3), 0.0f, 360, 1);
                    InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a1;
                    boolean zM4538h = c1836h03.m4538h(arrayList) | c1836h03.m4534f(interfaceC1809a18);
                    Object objM4514P7 = c1836h03.m4514P();
                    if (zM4538h) {
                        c1823e2 = c1823e;
                    } else {
                        c1823e2 = c1823e;
                        if (objM4514P7 == c1823e2) {
                        }
                        c1836h0 = c1836h03;
                        AbstractC0000a.m53b(interfaceC5853oM6904g, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P7, c1836h0, 6, 510);
                        InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, f3), 0.0f, 10, 0.0f, 6, 5);
                        C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(8), C5840b.f23770p, c1836h0, 6);
                        int iHashCode2 = Long.hashCode(c1836h0.f6095T);
                        C3878h c3878hM4546l2 = c1836h0.m4546l();
                        InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6886p);
                        c1836h0.m4531d0();
                        if (c1836h0.f6094S) {
                            c1836h0.m4551n0();
                        } else {
                            c1836h0.m4544k(c5660y);
                        }
                        AbstractC1874r.m4615A(c5597e, c1836h0, c3213e1M6892a);
                        AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l2);
                        AbstractC2091b.m5169p(iHashCode2, c1836h0, c5597e3, c1836h0, c5593d);
                        AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c2);
                        C5491y2 c5491y2 = C5491y2.f22068p;
                        if (f3 <= 0.0d) {
                            AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                        }
                        interfaceC1220a2 = interfaceC1220a;
                        c5491y2.m9899k("取消", interfaceC1220a2, new C3248q0(f3, true), false, c1836h0, 24582, 8);
                        boolean zM4534f7 = c1836h0.m4534f(interfaceC1809a18);
                        z10 = this.f16896h;
                        activity2 = activity;
                        boolean zM4536g = zM4534f7 | c1836h0.m4536g(z10) | c1836h0.m4534f(interfaceC1220a2) | c1836h0.m4538h(activity2);
                        interfaceC1231l = this.f16897i;
                        zM4534f = zM4536g | c1836h0.m4534f(interfaceC1231l);
                        objM4514P = c1836h0.m4514P();
                        if (!zM4534f || objM4514P == c1823e2) {
                            interfaceC1809a12 = interfaceC1809a18;
                            z11 = z10;
                            C5013ji c5013ji = new C5013ji(z11, interfaceC1220a2, activity2, interfaceC1809a12, interfaceC1231l, 2);
                            c1836h0.m4545k0(c5013ji);
                            objM4514P = c5013ji;
                        } else {
                            interfaceC1809a12 = interfaceC1809a18;
                            z11 = z10;
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P;
                        if (f3 <= 0.0d) {
                            AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                        }
                        c5491y2.m9899k("确定", interfaceC1220a4, new C3248q0(f3, true), (((Set) interfaceC1809a12.getValue()).isEmpty() || z11) ? true : z9, c1836h0, 24582, 0);
                        c1836h0.m4553p(true);
                        c1836h0.m4553p(true);
                    }
                    objM4514P7 = new C5068l7(arrayList, 19, interfaceC1809a18);
                    c1836h03.m4545k0(objM4514P7);
                    c1836h0 = c1836h03;
                    AbstractC0000a.m53b(interfaceC5853oM6904g, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P7, c1836h0, 6, 510);
                    InterfaceC5853o interfaceC5853oM6886p2 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, f3), 0.0f, 10, 0.0f, 6, 5);
                    C3213e1 c3213e1M6892a2 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(8), C5840b.f23770p, c1836h0, 6);
                    int iHashCode22 = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l22 = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c22 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6886p2);
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h0, c3213e1M6892a2);
                    AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l22);
                    AbstractC2091b.m5169p(iHashCode22, c1836h0, c5597e3, c1836h0, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c22);
                    C5491y2 c5491y22 = C5491y2.f22068p;
                    if (f3 <= 0.0d) {
                    }
                    interfaceC1220a2 = interfaceC1220a;
                    c5491y22.m9899k("取消", interfaceC1220a2, new C3248q0(f3, true), false, c1836h0, 24582, 8);
                    boolean zM4534f72 = c1836h0.m4534f(interfaceC1809a18);
                    z10 = this.f16896h;
                    activity2 = activity;
                    boolean zM4536g2 = zM4534f72 | c1836h0.m4536g(z10) | c1836h0.m4534f(interfaceC1220a2) | c1836h0.m4538h(activity2);
                    interfaceC1231l = this.f16897i;
                    zM4534f = zM4536g2 | c1836h0.m4534f(interfaceC1231l);
                    objM4514P = c1836h0.m4514P();
                    if (zM4534f) {
                        interfaceC1809a12 = interfaceC1809a18;
                        z11 = z10;
                        C5013ji c5013ji2 = new C5013ji(z11, interfaceC1220a2, activity2, interfaceC1809a12, interfaceC1231l, 2);
                        c1836h0.m4545k0(c5013ji2);
                        objM4514P = c5013ji2;
                        InterfaceC1220a interfaceC1220a42 = (InterfaceC1220a) objM4514P;
                        if (f3 <= 0.0d) {
                        }
                        if (((Set) interfaceC1809a12.getValue()).isEmpty()) {
                            c5491y22.m9899k("确定", interfaceC1220a42, new C3248q0(f3, true), (((Set) interfaceC1809a12.getValue()).isEmpty() || z11) ? true : z9, c1836h0, 24582, 0);
                            c1836h0.m4553p(true);
                            c1836h0.m4553p(true);
                        }
                    }
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4847ef(ArrayList arrayList, Set set, String str, InterfaceC1220a interfaceC1220a, boolean z9, Activity activity, InterfaceC1231l interfaceC1231l) {
        this.f16898j = arrayList;
        this.f16899k = set;
        this.f16900l = str;
        this.f16901m = interfaceC1220a;
        this.f16896h = z9;
        this.f16902n = activity;
        this.f16897i = interfaceC1231l;
    }

    public /* synthetic */ C4847ef(boolean z9, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16896h = z9;
        this.f16897i = interfaceC1231l;
        this.f16899k = interfaceC1809a1;
        this.f16898j = interfaceC1231l2;
        this.f16900l = interfaceC1809a12;
        this.f16901m = interfaceC1809a13;
        this.f16902n = interfaceC1809a14;
    }
}
