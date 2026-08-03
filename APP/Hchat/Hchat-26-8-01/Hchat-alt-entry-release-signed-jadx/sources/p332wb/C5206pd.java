package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.pd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5206pd implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19960g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f19961h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f19962i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f19963j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19964k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f19965l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5206pd(SharedPreferences sharedPreferences, String str, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f19960g = i9;
        this.f19961h = sharedPreferences;
        this.f19962i = str;
        this.f19963j = interfaceC1231l;
        this.f19964k = interfaceC1809a1;
        this.f19965l = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f19960g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 0;
                    final SharedPreferences sharedPreferences = this.f19961h;
                    final String str = this.f19962i;
                    final InterfaceC1231l interfaceC1231l = this.f19963j;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f19964k;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f19965l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1323288536, new InterfaceC1235p() { // from class: wb.jg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            C1836h0 c1836h02 = (C1836h0) obj4;
                            switch (i11) {
                                case 0:
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a1;
                                        String str2 = ((Number) interfaceC1809a13.getValue()).intValue() == 1 ? "除黑名单外均可点赞" : "只点赞白名单好友";
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("白名单", 0), new C3958e("黑名单", 1));
                                        int iIntValue3 = ((Number) interfaceC1809a13.getValue()).intValue();
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5242qg(sharedPreferences2, interfaceC1809a13, 22);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9361J2("名单模式", str2, arrayListM9699w6, iIntValue3, (InterfaceC1231l) objM4514P, false, c1836h02, 6);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String str3 = ((Number) interfaceC1809a13.getValue()).intValue() == 1 ? "黑名单" : "白名单";
                                        InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l2);
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (zM4534f || objM4514P2 == c1823e) {
                                            objM4514P2 = new C5161o1(interfaceC1231l2, interfaceC1809a13, 8);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b(str3, str, (InterfaceC1220a) objM4514P2, c1836h02, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a12;
                                        String str4 = (String) interfaceC1809a14.getValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5242qg(interfaceC1809a14, sharedPreferences2, 23);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9695w2("同一人每天点赞数量", "每天最多点赞同一人的朋友圈条数，0 表示不限制", str4, (InterfaceC1231l) objM4514P3, c1836h02, 54);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                default:
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a1;
                                        String str5 = ((Number) interfaceC1809a15.getValue()).intValue() == 1 ? "除黑名单外均可评论" : "只评论白名单好友";
                                        ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("白名单", 0), new C3958e("黑名单", 1));
                                        int iIntValue5 = ((Number) interfaceC1809a15.getValue()).intValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        boolean zM4538h3 = c1836h02.m4538h(sharedPreferences3);
                                        Object objM4514P4 = c1836h02.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C4818di(sharedPreferences3, interfaceC1809a15, 28);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9361J2("名单模式", str5, arrayListM9699w62, iIntValue5, (InterfaceC1231l) objM4514P4, false, c1836h02, 6);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String str6 = ((Number) interfaceC1809a15.getValue()).intValue() == 1 ? "黑名单" : "白名单";
                                        InterfaceC1231l interfaceC1231l3 = interfaceC1231l;
                                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l3);
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (zM4534f2 || objM4514P5 == c1823e2) {
                                            objM4514P5 = new C5161o1(interfaceC1231l3, interfaceC1809a15, 12);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9503b(str6, str, (InterfaceC1220a) objM4514P5, c1836h02, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a12;
                                        String str7 = (String) interfaceC1809a16.getValue();
                                        boolean zM4538h4 = c1836h02.m4538h(sharedPreferences3);
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (zM4538h4 || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4818di(interfaceC1809a16, sharedPreferences3, 29);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9695w2("同一人每天评论数量", "每天最多评论同一人的朋友圈条数，0 表示不限制", str7, (InterfaceC1231l) objM4514P6, c1836h02, 54);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i12 = 1;
                    final SharedPreferences sharedPreferences2 = this.f19961h;
                    final String str2 = this.f19962i;
                    final InterfaceC1231l interfaceC1231l2 = this.f19963j;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f19964k;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f19965l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-37189219, new InterfaceC1235p() { // from class: wb.jg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            C1836h0 c1836h02 = (C1836h0) obj4;
                            switch (i12) {
                                case 0:
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a13;
                                        String str22 = ((Number) interfaceC1809a132.getValue()).intValue() == 1 ? "除黑名单外均可点赞" : "只点赞白名单好友";
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("白名单", 0), new C3958e("黑名单", 1));
                                        int iIntValue3 = ((Number) interfaceC1809a132.getValue()).intValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5242qg(sharedPreferences22, interfaceC1809a132, 22);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9361J2("名单模式", str22, arrayListM9699w6, iIntValue3, (InterfaceC1231l) objM4514P, false, c1836h02, 6);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String str3 = ((Number) interfaceC1809a132.getValue()).intValue() == 1 ? "黑名单" : "白名单";
                                        InterfaceC1231l interfaceC1231l22 = interfaceC1231l2;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l22);
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (zM4534f || objM4514P2 == c1823e) {
                                            objM4514P2 = new C5161o1(interfaceC1231l22, interfaceC1809a132, 8);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b(str3, str2, (InterfaceC1220a) objM4514P2, c1836h02, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a14;
                                        String str4 = (String) interfaceC1809a142.getValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5242qg(interfaceC1809a142, sharedPreferences22, 23);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9695w2("同一人每天点赞数量", "每天最多点赞同一人的朋友圈条数，0 表示不限制", str4, (InterfaceC1231l) objM4514P3, c1836h02, 54);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                default:
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a13;
                                        String str5 = ((Number) interfaceC1809a15.getValue()).intValue() == 1 ? "除黑名单外均可评论" : "只评论白名单好友";
                                        ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("白名单", 0), new C3958e("黑名单", 1));
                                        int iIntValue5 = ((Number) interfaceC1809a15.getValue()).intValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        boolean zM4538h3 = c1836h02.m4538h(sharedPreferences3);
                                        Object objM4514P4 = c1836h02.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C4818di(sharedPreferences3, interfaceC1809a15, 28);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9361J2("名单模式", str5, arrayListM9699w62, iIntValue5, (InterfaceC1231l) objM4514P4, false, c1836h02, 6);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String str6 = ((Number) interfaceC1809a15.getValue()).intValue() == 1 ? "黑名单" : "白名单";
                                        InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l3);
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (zM4534f2 || objM4514P5 == c1823e2) {
                                            objM4514P5 = new C5161o1(interfaceC1231l3, interfaceC1809a15, 12);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9503b(str6, str2, (InterfaceC1220a) objM4514P5, c1836h02, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                        String str7 = (String) interfaceC1809a16.getValue();
                                        boolean zM4538h4 = c1836h02.m4538h(sharedPreferences3);
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (zM4538h4 || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4818di(interfaceC1809a16, sharedPreferences3, 29);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9695w2("同一人每天评论数量", "每天最多评论同一人的朋友圈条数，0 表示不限制", str7, (InterfaceC1231l) objM4514P6, c1836h02, 54);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
