package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
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

/* JADX INFO: renamed from: wb.s7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5299s7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20593g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20594h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20595i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20596j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20597k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20598l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20599m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5299s7(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, int i9) {
        this.f20593g = i9;
        this.f20594h = sharedPreferences;
        this.f20595i = interfaceC1809a1;
        this.f20596j = interfaceC1809a12;
        this.f20597k = interfaceC1809a13;
        this.f20598l = interfaceC1809a14;
        this.f20599m = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f20593g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 0;
                    final SharedPreferences sharedPreferences = this.f20594h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f20595i;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f20596j;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f20597k;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f20598l;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f20599m;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(880125811, new InterfaceC1235p() { // from class: wb.v8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5108me(sharedPreferences2, interfaceC1809a16, 2);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈自动刷新", "按设定间隔获取新的朋友圈内容", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(-947006311);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a12;
                                            String str = (String) interfaceC1809a17.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5108me(interfaceC1809a17, sharedPreferences2);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("刷新间隔", "单位秒，最少 0 秒", str, (InterfaceC1231l) objM4514P2, c1836h02, 54);
                                            C1836h0 c1836h03 = c1836h02;
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a13;
                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                                            boolean zM4538h3 = c1836h03.m4538h(sharedPreferences2);
                                            Object objM4514P3 = c1836h03.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences2, interfaceC1809a18, 4);
                                                c1836h03.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue2, "限制刷新时段", "支持跨零点时段", false, (InterfaceC1231l) objM4514P3, c1836h03, 432, 8);
                                            if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                                                c1836h03.m4525a0(-946302580);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a14;
                                                String str2 = (String) interfaceC1809a19.getValue();
                                                boolean zM4538h4 = c1836h03.m4538h(sharedPreferences2);
                                                Object objM4514P4 = c1836h03.m4514P();
                                                if (zM4538h4 || objM4514P4 == c1823e) {
                                                    objM4514P4 = new C5108me(sharedPreferences2, interfaceC1809a19, 5);
                                                    c1836h03.m4545k0(objM4514P4);
                                                }
                                                AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P4, c1836h03, "开始时间", str2, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a15;
                                                String str3 = (String) interfaceC1809a110.getValue();
                                                boolean zM4538h5 = c1836h03.m4538h(sharedPreferences2);
                                                Object objM4514P5 = c1836h03.m4514P();
                                                if (zM4538h5 || objM4514P5 == c1823e) {
                                                    objM4514P5 = new C5108me(sharedPreferences2, interfaceC1809a110, 6);
                                                    c1836h03.m4545k0(objM4514P5);
                                                }
                                                AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P5, c1836h03, "结束时间", str3, false);
                                                c1836h03 = c1836h03;
                                                c1836h03.m4553p(false);
                                            } else {
                                                c1836h03.m4525a0(-945715409);
                                                c1836h03.m4553p(false);
                                            }
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-945693585);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a1;
                                        String str4 = ((Number) interfaceC1809a111.getValue()).intValue() == 1 ? "在范围内随机等待" : "每条等待固定时间";
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("固定延迟", 0), new C3958e("随机延迟", 1));
                                        int iIntValue4 = ((Number) interfaceC1809a111.getValue()).intValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences3);
                                        Object objM4514P6 = c1836h04.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h6 || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C5242qg(sharedPreferences3, interfaceC1809a111, 8);
                                            c1836h04.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9361J2("转发延迟", str4, arrayListM9699w6, iIntValue4, (InterfaceC1231l) objM4514P6, false, c1836h04, 6);
                                        if (((Number) interfaceC1809a111.getValue()).intValue() == 0) {
                                            c1836h04.m4525a0(-679594483);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a12;
                                            String str5 = (String) interfaceC1809a112.getValue();
                                            boolean zM4538h7 = c1836h04.m4538h(sharedPreferences3);
                                            Object objM4514P7 = c1836h04.m4514P();
                                            if (zM4538h7 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5242qg(interfaceC1809a112, sharedPreferences3, 9);
                                                c1836h04.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("等待时间", "单位秒，最少 0 秒", str5, (InterfaceC1231l) objM4514P7, c1836h04, 54);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(-678898967);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a13;
                                            String str6 = (String) interfaceC1809a113.getValue();
                                            boolean zM4538h8 = c1836h04.m4538h(sharedPreferences3);
                                            Object objM4514P8 = c1836h04.m4514P();
                                            if (zM4538h8 || objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5242qg(interfaceC1809a113, sharedPreferences3, 10);
                                                c1836h04.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最短等待", "单位秒，最少 0 秒", str6, (InterfaceC1231l) objM4514P8, c1836h04, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a14;
                                            String str7 = (String) interfaceC1809a114.getValue();
                                            boolean zM4538h9 = c1836h04.m4538h(sharedPreferences3);
                                            Object objM4514P9 = c1836h04.m4514P();
                                            if (zM4538h9 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5242qg(interfaceC1809a114, sharedPreferences3, 11);
                                                c1836h04.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9695w2("最长等待", "单位秒，不能小于最短等待", str7, (InterfaceC1231l) objM4514P9, c1836h04, 54);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a15;
                                        String str8 = (String) interfaceC1809a115.getValue();
                                        boolean zM4538h10 = c1836h04.m4538h(sharedPreferences3);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h10 || objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5242qg(interfaceC1809a115, sharedPreferences3, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("每日转发上限", "每天最多转发的朋友圈数量，0 表示不限制", str8, (InterfaceC1231l) objM4514P10, c1836h04, 54);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a1;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zBooleanValue3) {
                                            c1836h05.m4525a0(849085301);
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a12;
                                            String str9 = (String) interfaceC1809a117.getValue();
                                            List list = AbstractC4955ho.f17696k;
                                            boolean zM4538h11 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P11 = c1836h05.m4514P();
                                            if (zM4538h11 || objM4514P11 == c1823e3) {
                                                objM4514P11 = new C5242qg(sharedPreferences4, interfaceC1809a117, 5);
                                                c1836h05.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9571i4("通知标题", "留空使用默认标题", str9, list, 0, (InterfaceC1231l) objM4514P11, c1836h05, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a13;
                                            String str10 = (String) interfaceC1809a118.getValue();
                                            boolean zM4538h12 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P12 = c1836h05.m4514P();
                                            if (zM4538h12 || objM4514P12 == c1823e3) {
                                                objM4514P12 = new C5242qg(sharedPreferences4, interfaceC1809a118, 6);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9571i4("通知内容", "留空使用发布者、类型和完整正文", str10, list, 2, (InterfaceC1231l) objM4514P12, c1836h05, 24630, 0);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(849786831);
                                            c1836h05.m4553p(false);
                                        }
                                        if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(849835935);
                                            if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(720152033);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            } else {
                                                c1836h05.m4525a0(849889999);
                                            }
                                            c1836h05.m4553p(false);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a15;
                                            String str11 = (String) interfaceC1809a119.getValue();
                                            List list2 = AbstractC4955ho.f17696k;
                                            boolean zM4538h13 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (zM4538h13 || objM4514P13 == c1823e3) {
                                                objM4514P13 = new C5242qg(sharedPreferences4, interfaceC1809a119, 7);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9571i4("Toast内容", "留空使用默认提醒", str11, list2, 2, (InterfaceC1231l) objM4514P13, c1836h05, 24630, 0);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(850251087);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i12 = 2;
                    final SharedPreferences sharedPreferences2 = this.f20594h;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f20595i;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f20596j;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f20597k;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f20598l;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f20599m;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1690132947, new InterfaceC1235p() { // from class: wb.v8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a16;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5108me(sharedPreferences22, interfaceC1809a162, 2);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈自动刷新", "按设定间隔获取新的朋友圈内容", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a162.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(-947006311);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                            String str = (String) interfaceC1809a172.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5108me(interfaceC1809a172, sharedPreferences22);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("刷新间隔", "单位秒，最少 0 秒", str, (InterfaceC1231l) objM4514P2, c1836h02, 54);
                                            C1836h0 c1836h03 = c1836h02;
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a18;
                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a182.getValue()).booleanValue();
                                            boolean zM4538h3 = c1836h03.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h03.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a182, 4);
                                                c1836h03.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue2, "限制刷新时段", "支持跨零点时段", false, (InterfaceC1231l) objM4514P3, c1836h03, 432, 8);
                                            if (((Boolean) interfaceC1809a182.getValue()).booleanValue()) {
                                                c1836h03.m4525a0(-946302580);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a19;
                                                String str2 = (String) interfaceC1809a192.getValue();
                                                boolean zM4538h4 = c1836h03.m4538h(sharedPreferences22);
                                                Object objM4514P4 = c1836h03.m4514P();
                                                if (zM4538h4 || objM4514P4 == c1823e) {
                                                    objM4514P4 = new C5108me(sharedPreferences22, interfaceC1809a192, 5);
                                                    c1836h03.m4545k0(objM4514P4);
                                                }
                                                AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P4, c1836h03, "开始时间", str2, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a110;
                                                String str3 = (String) interfaceC1809a1102.getValue();
                                                boolean zM4538h5 = c1836h03.m4538h(sharedPreferences22);
                                                Object objM4514P5 = c1836h03.m4514P();
                                                if (zM4538h5 || objM4514P5 == c1823e) {
                                                    objM4514P5 = new C5108me(sharedPreferences22, interfaceC1809a1102, 6);
                                                    c1836h03.m4545k0(objM4514P5);
                                                }
                                                AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P5, c1836h03, "结束时间", str3, false);
                                                c1836h03 = c1836h03;
                                                c1836h03.m4553p(false);
                                            } else {
                                                c1836h03.m4525a0(-945715409);
                                                c1836h03.m4553p(false);
                                            }
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-945693585);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a16;
                                        String str4 = ((Number) interfaceC1809a111.getValue()).intValue() == 1 ? "在范围内随机等待" : "每条等待固定时间";
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("固定延迟", 0), new C3958e("随机延迟", 1));
                                        int iIntValue4 = ((Number) interfaceC1809a111.getValue()).intValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences3);
                                        Object objM4514P6 = c1836h04.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h6 || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C5242qg(sharedPreferences3, interfaceC1809a111, 8);
                                            c1836h04.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9361J2("转发延迟", str4, arrayListM9699w6, iIntValue4, (InterfaceC1231l) objM4514P6, false, c1836h04, 6);
                                        if (((Number) interfaceC1809a111.getValue()).intValue() == 0) {
                                            c1836h04.m4525a0(-679594483);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a17;
                                            String str5 = (String) interfaceC1809a112.getValue();
                                            boolean zM4538h7 = c1836h04.m4538h(sharedPreferences3);
                                            Object objM4514P7 = c1836h04.m4514P();
                                            if (zM4538h7 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5242qg(interfaceC1809a112, sharedPreferences3, 9);
                                                c1836h04.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("等待时间", "单位秒，最少 0 秒", str5, (InterfaceC1231l) objM4514P7, c1836h04, 54);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(-678898967);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a18;
                                            String str6 = (String) interfaceC1809a113.getValue();
                                            boolean zM4538h8 = c1836h04.m4538h(sharedPreferences3);
                                            Object objM4514P8 = c1836h04.m4514P();
                                            if (zM4538h8 || objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5242qg(interfaceC1809a113, sharedPreferences3, 10);
                                                c1836h04.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最短等待", "单位秒，最少 0 秒", str6, (InterfaceC1231l) objM4514P8, c1836h04, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a19;
                                            String str7 = (String) interfaceC1809a114.getValue();
                                            boolean zM4538h9 = c1836h04.m4538h(sharedPreferences3);
                                            Object objM4514P9 = c1836h04.m4514P();
                                            if (zM4538h9 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5242qg(interfaceC1809a114, sharedPreferences3, 11);
                                                c1836h04.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9695w2("最长等待", "单位秒，不能小于最短等待", str7, (InterfaceC1231l) objM4514P9, c1836h04, 54);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a110;
                                        String str8 = (String) interfaceC1809a115.getValue();
                                        boolean zM4538h10 = c1836h04.m4538h(sharedPreferences3);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h10 || objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5242qg(interfaceC1809a115, sharedPreferences3, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("每日转发上限", "每天最多转发的朋友圈数量，0 表示不限制", str8, (InterfaceC1231l) objM4514P10, c1836h04, 54);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a16;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zBooleanValue3) {
                                            c1836h05.m4525a0(849085301);
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a17;
                                            String str9 = (String) interfaceC1809a117.getValue();
                                            List list = AbstractC4955ho.f17696k;
                                            boolean zM4538h11 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P11 = c1836h05.m4514P();
                                            if (zM4538h11 || objM4514P11 == c1823e3) {
                                                objM4514P11 = new C5242qg(sharedPreferences4, interfaceC1809a117, 5);
                                                c1836h05.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9571i4("通知标题", "留空使用默认标题", str9, list, 0, (InterfaceC1231l) objM4514P11, c1836h05, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a18;
                                            String str10 = (String) interfaceC1809a118.getValue();
                                            boolean zM4538h12 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P12 = c1836h05.m4514P();
                                            if (zM4538h12 || objM4514P12 == c1823e3) {
                                                objM4514P12 = new C5242qg(sharedPreferences4, interfaceC1809a118, 6);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9571i4("通知内容", "留空使用发布者、类型和完整正文", str10, list, 2, (InterfaceC1231l) objM4514P12, c1836h05, 24630, 0);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(849786831);
                                            c1836h05.m4553p(false);
                                        }
                                        if (((Boolean) interfaceC1809a19.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(849835935);
                                            if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(720152033);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            } else {
                                                c1836h05.m4525a0(849889999);
                                            }
                                            c1836h05.m4553p(false);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a110;
                                            String str11 = (String) interfaceC1809a119.getValue();
                                            List list2 = AbstractC4955ho.f17696k;
                                            boolean zM4538h13 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (zM4538h13 || objM4514P13 == c1823e3) {
                                                objM4514P13 = new C5242qg(sharedPreferences4, interfaceC1809a119, 7);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9571i4("Toast内容", "留空使用默认提醒", str11, list2, 2, (InterfaceC1231l) objM4514P13, c1836h05, 24630, 0);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(850251087);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
                    final int i13 = 1;
                    final SharedPreferences sharedPreferences3 = this.f20594h;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f20595i;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f20596j;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f20597k;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f20598l;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f20599m;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-970142510, new InterfaceC1235p() { // from class: wb.v8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a111;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5108me(sharedPreferences22, interfaceC1809a162, 2);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈自动刷新", "按设定间隔获取新的朋友圈内容", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a162.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(-947006311);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a112;
                                            String str = (String) interfaceC1809a172.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5108me(interfaceC1809a172, sharedPreferences22);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("刷新间隔", "单位秒，最少 0 秒", str, (InterfaceC1231l) objM4514P2, c1836h02, 54);
                                            C1836h0 c1836h03 = c1836h02;
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a113;
                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a182.getValue()).booleanValue();
                                            boolean zM4538h3 = c1836h03.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h03.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a182, 4);
                                                c1836h03.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue2, "限制刷新时段", "支持跨零点时段", false, (InterfaceC1231l) objM4514P3, c1836h03, 432, 8);
                                            if (((Boolean) interfaceC1809a182.getValue()).booleanValue()) {
                                                c1836h03.m4525a0(-946302580);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a114;
                                                String str2 = (String) interfaceC1809a192.getValue();
                                                boolean zM4538h4 = c1836h03.m4538h(sharedPreferences22);
                                                Object objM4514P4 = c1836h03.m4514P();
                                                if (zM4538h4 || objM4514P4 == c1823e) {
                                                    objM4514P4 = new C5108me(sharedPreferences22, interfaceC1809a192, 5);
                                                    c1836h03.m4545k0(objM4514P4);
                                                }
                                                AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P4, c1836h03, "开始时间", str2, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a115;
                                                String str3 = (String) interfaceC1809a1102.getValue();
                                                boolean zM4538h5 = c1836h03.m4538h(sharedPreferences22);
                                                Object objM4514P5 = c1836h03.m4514P();
                                                if (zM4538h5 || objM4514P5 == c1823e) {
                                                    objM4514P5 = new C5108me(sharedPreferences22, interfaceC1809a1102, 6);
                                                    c1836h03.m4545k0(objM4514P5);
                                                }
                                                AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P5, c1836h03, "结束时间", str3, false);
                                                c1836h03 = c1836h03;
                                                c1836h03.m4553p(false);
                                            } else {
                                                c1836h03.m4525a0(-945715409);
                                                c1836h03.m4553p(false);
                                            }
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-945693585);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a111;
                                        String str4 = ((Number) interfaceC1809a1112.getValue()).intValue() == 1 ? "在范围内随机等待" : "每条等待固定时间";
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("固定延迟", 0), new C3958e("随机延迟", 1));
                                        int iIntValue4 = ((Number) interfaceC1809a1112.getValue()).intValue();
                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences32);
                                        Object objM4514P6 = c1836h04.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h6 || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C5242qg(sharedPreferences32, interfaceC1809a1112, 8);
                                            c1836h04.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9361J2("转发延迟", str4, arrayListM9699w6, iIntValue4, (InterfaceC1231l) objM4514P6, false, c1836h04, 6);
                                        if (((Number) interfaceC1809a1112.getValue()).intValue() == 0) {
                                            c1836h04.m4525a0(-679594483);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a112;
                                            String str5 = (String) interfaceC1809a1122.getValue();
                                            boolean zM4538h7 = c1836h04.m4538h(sharedPreferences32);
                                            Object objM4514P7 = c1836h04.m4514P();
                                            if (zM4538h7 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5242qg(interfaceC1809a1122, sharedPreferences32, 9);
                                                c1836h04.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("等待时间", "单位秒，最少 0 秒", str5, (InterfaceC1231l) objM4514P7, c1836h04, 54);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(-678898967);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a113;
                                            String str6 = (String) interfaceC1809a1132.getValue();
                                            boolean zM4538h8 = c1836h04.m4538h(sharedPreferences32);
                                            Object objM4514P8 = c1836h04.m4514P();
                                            if (zM4538h8 || objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5242qg(interfaceC1809a1132, sharedPreferences32, 10);
                                                c1836h04.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最短等待", "单位秒，最少 0 秒", str6, (InterfaceC1231l) objM4514P8, c1836h04, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a114;
                                            String str7 = (String) interfaceC1809a1142.getValue();
                                            boolean zM4538h9 = c1836h04.m4538h(sharedPreferences32);
                                            Object objM4514P9 = c1836h04.m4514P();
                                            if (zM4538h9 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5242qg(interfaceC1809a1142, sharedPreferences32, 11);
                                                c1836h04.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9695w2("最长等待", "单位秒，不能小于最短等待", str7, (InterfaceC1231l) objM4514P9, c1836h04, 54);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a115;
                                        String str8 = (String) interfaceC1809a1152.getValue();
                                        boolean zM4538h10 = c1836h04.m4538h(sharedPreferences32);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h10 || objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5242qg(interfaceC1809a1152, sharedPreferences32, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("每日转发上限", "每天最多转发的朋友圈数量，0 表示不限制", str8, (InterfaceC1231l) objM4514P10, c1836h04, 54);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a111;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zBooleanValue3) {
                                            c1836h05.m4525a0(849085301);
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a112;
                                            String str9 = (String) interfaceC1809a117.getValue();
                                            List list = AbstractC4955ho.f17696k;
                                            boolean zM4538h11 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P11 = c1836h05.m4514P();
                                            if (zM4538h11 || objM4514P11 == c1823e3) {
                                                objM4514P11 = new C5242qg(sharedPreferences4, interfaceC1809a117, 5);
                                                c1836h05.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9571i4("通知标题", "留空使用默认标题", str9, list, 0, (InterfaceC1231l) objM4514P11, c1836h05, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a113;
                                            String str10 = (String) interfaceC1809a118.getValue();
                                            boolean zM4538h12 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P12 = c1836h05.m4514P();
                                            if (zM4538h12 || objM4514P12 == c1823e3) {
                                                objM4514P12 = new C5242qg(sharedPreferences4, interfaceC1809a118, 6);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9571i4("通知内容", "留空使用发布者、类型和完整正文", str10, list, 2, (InterfaceC1231l) objM4514P12, c1836h05, 24630, 0);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(849786831);
                                            c1836h05.m4553p(false);
                                        }
                                        if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(849835935);
                                            if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(720152033);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            } else {
                                                c1836h05.m4525a0(849889999);
                                            }
                                            c1836h05.m4553p(false);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a115;
                                            String str11 = (String) interfaceC1809a119.getValue();
                                            List list2 = AbstractC4955ho.f17696k;
                                            boolean zM4538h13 = c1836h05.m4538h(sharedPreferences4);
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (zM4538h13 || objM4514P13 == c1823e3) {
                                                objM4514P13 = new C5242qg(sharedPreferences4, interfaceC1809a119, 7);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9571i4("Toast内容", "留空使用默认提醒", str11, list2, 2, (InterfaceC1231l) objM4514P13, c1836h05, 24630, 0);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(850251087);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
