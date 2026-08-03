package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import na.C2922j;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p036c9.C0482r0;
import p036c9.C0500x0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3967n;
import sh.C4029m1;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import ua.C4298i;

/* JADX INFO: renamed from: wb.ra */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5269ra implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20380g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20381h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20382i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20383j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20384k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20385l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20386m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20387n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5269ra(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, int i9) {
        this.f20380g = i9;
        this.f20381h = sharedPreferences;
        this.f20382i = interfaceC1809a1;
        this.f20383j = interfaceC1809a12;
        this.f20384k = interfaceC1809a13;
        this.f20385l = interfaceC1809a14;
        this.f20386m = interfaceC1809a15;
        this.f20387n = interfaceC1809a16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f20380g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 0;
                    final SharedPreferences sharedPreferences = this.f20381h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f20382i;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f20383j;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f20384k;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f20385l;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f20386m;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f20387n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1703102735, new InterfaceC1235p() { // from class: wb.ic
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object next;
                            String str;
                            Object next2;
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "transfer_auto_enable", "自动收款", "自动领取待收款转账", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1;
                                        String strM6836i = ((List) interfaceC1809a17.getValue()).isEmpty() ? "暂无模板" : AbstractC3199a.m6836i(((List) interfaceC1809a17.getValue()).size(), " 个模板");
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a12, 9);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("收款规则模板", strM6836i, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a13;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        List list = (List) interfaceC1809a17.getValue();
                                        if (AbstractC3149m.m6721t0(str2)) {
                                            str = "旧版全局设置";
                                        } else {
                                            Iterator it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    if (((C4298i) next).f14300a.equals(str2)) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            C4298i c4298i = (C4298i) next;
                                            str = c4298i != null ? c4298i.f14301b : "模板不存在，使用全局设置";
                                        }
                                        List listM99x0 = AbstractC0000a.m99x0(new C4825dq(HttpUrl.FRAGMENT_ENCODE_SET, "旧版全局设置"));
                                        List<C4298i> list2 = (List) interfaceC1809a17.getValue();
                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                        for (C4298i c4298i2 : list2) {
                                            arrayList.add(new C4825dq(c4298i2.f14300a, c4298i2.f14301b));
                                        }
                                        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList);
                                        String str3 = (String) interfaceC1809a18.getValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P2 = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a14;
                                        if (zM4538h || objM4514P2 == c1823e) {
                                            objM4514P2 = new C5143ng(interfaceC1809a18, sharedPreferences2, interfaceC1809a17, interfaceC1809a19);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9353I2("默认规则", str, arrayListM8397F1, str3, (InterfaceC1231l) objM4514P2, false, c1836h02, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM6836i2 = ((List) interfaceC1809a19.getValue()).isEmpty() ? "暂无单独配置" : AbstractC3199a.m6836i(((List) interfaceC1809a19.getValue()).size(), " 个聊天");
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a15, 10);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("适用聊天", strM6836i2, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4749bf(interfaceC1809a16, 11);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", "一次给多个聊天分配同一规则", (InterfaceC1220a) objM4514P4, c1836h02, 438);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("全部抢", 0), new C3958e("白名单（只抢指定人）", 1), new C3958e("黑名单（不抢指定人）", 2));
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a1;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C5535ze(interfaceC1809a110, 26);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_auto_mode", "过滤模式", arrayListM9699w6, 0, (InterfaceC1231l) objM4514P5, c1836h03, 221616, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("无限制", 0), new C3958e("只抢含关键词的", 1), new C3958e("屏蔽含关键词的", 2));
                                        Object objM4514P6 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a12;
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a13;
                                        if (objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4029m1(7, interfaceC1809a111, interfaceC1809a112);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_kw_mode", "关键词过滤", arrayListM9699w62, 0, (InterfaceC1231l) objM4514P6, c1836h03, 221616, 0);
                                        if (((Number) interfaceC1809a111.getValue()).intValue() != 0) {
                                            c1836h03.m4525a0(-235058299);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a112.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5535ze(interfaceC1809a112, 27);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9304C1("关键词列表", "多个关键词用 | 分隔", str4, 0, (InterfaceC1231l) objM4514P7, c1836h03, 24630, 8);
                                            c1836h03 = c1836h03;
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-234917032);
                                            c1836h03.m4553p(false);
                                        }
                                        int iIntValue4 = ((Number) interfaceC1809a110.getValue()).intValue();
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a15;
                                        if (iIntValue4 == 1) {
                                            c1836h03.m4525a0(-234858876);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a14;
                                            String strM9403O4 = AbstractC4955ho.m9403O4((String) interfaceC1809a114.getValue());
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C0500x0(21, interfaceC1809a114, interfaceC1809a113);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9503b("白名单", strM9403O4, (InterfaceC1220a) objM4514P8, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a110.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-234242844);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a16;
                                            String strM9403O42 = AbstractC4955ho.m9403O4((String) interfaceC1809a115.getValue());
                                            Object objM4514P9 = c1836h03.m4514P();
                                            if (objM4514P9 == c1823e2) {
                                                objM4514P9 = new C0500x0(22, interfaceC1809a115, interfaceC1809a113);
                                                c1836h03.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9503b("黑名单", strM9403O42, (InterfaceC1220a) objM4514P9, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-233670088);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a1;
                                        String strM6836i3 = ((List) interfaceC1809a116.getValue()).isEmpty() ? "暂无模板，进入后添加不同群的抢包策略" : AbstractC3199a.m6836i(((List) interfaceC1809a116.getValue()).size(), " 个模板，进入后新增或修改");
                                        Object objM4514P10 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5371ud(interfaceC1809a12, 29);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9704x3("红包模板", strM6836i3, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a13;
                                        String strM6836i4 = ((List) interfaceC1809a117.getValue()).isEmpty() ? "暂无适用聊天，未命中时走默认规则" : AbstractC3199a.m6836i(((List) interfaceC1809a117.getValue()).size(), " 个聊天，进入后分配模板");
                                        Object objM4514P11 = c1836h04.m4514P();
                                        if (objM4514P11 == c1823e3) {
                                            objM4514P11 = new C4749bf(interfaceC1809a14, 0);
                                            c1836h04.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9704x3("适用聊天", strM6836i4, (InterfaceC1220a) objM4514P11, c1836h04, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a15;
                                        String str5 = (String) interfaceC1809a118.getValue();
                                        List list3 = (List) interfaceC1809a116.getValue();
                                        if (AbstractC3149m.m6721t0(str5)) {
                                            str5 = "旧版全局设置";
                                        } else {
                                            Iterator it2 = list3.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    if (((C2922j) next2).f9512a.equals(str5)) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            C2922j c2922j = (C2922j) next2;
                                            if (c2922j != null) {
                                                String str6 = c2922j.f9513b;
                                                if (!AbstractC3149m.m6721t0(str6)) {
                                                    str5 = str6;
                                                }
                                            } else {
                                                str5 = "模板不存在，当前会回到旧版全局设置";
                                            }
                                        }
                                        SharedPreferences sharedPreferences4 = sharedPreferences;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P12 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P12 == c1823e3) {
                                            C0482r0 c0482r0 = new C0482r0(interfaceC1809a116, interfaceC1809a118, sharedPreferences4, interfaceC1809a117, interfaceC1809a16, 14);
                                            c1836h04.m4545k0(c0482r0);
                                            objM4514P12 = c0482r0;
                                        }
                                        AbstractC4955ho.m9704x3("默认规则", str5, (InterfaceC1220a) objM4514P12, c1836h04, 6);
                                    } else {
                                        c1836h04.m4519V();
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
                    final SharedPreferences sharedPreferences2 = this.f20381h;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f20382i;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f20383j;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f20384k;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f20385l;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f20386m;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f20387n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(632757100, new InterfaceC1235p() { // from class: wb.ic
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object next;
                            String str;
                            Object next2;
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "transfer_auto_enable", "自动收款", "自动领取待收款转账", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                        String strM6836i = ((List) interfaceC1809a172.getValue()).isEmpty() ? "暂无模板" : AbstractC3199a.m6836i(((List) interfaceC1809a172.getValue()).size(), " 个模板");
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a18, 9);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("收款规则模板", strM6836i, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a19;
                                        String str2 = (String) interfaceC1809a182.getValue();
                                        List list = (List) interfaceC1809a172.getValue();
                                        if (AbstractC3149m.m6721t0(str2)) {
                                            str = "旧版全局设置";
                                        } else {
                                            Iterator it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    if (((C4298i) next).f14300a.equals(str2)) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            C4298i c4298i = (C4298i) next;
                                            str = c4298i != null ? c4298i.f14301b : "模板不存在，使用全局设置";
                                        }
                                        List listM99x0 = AbstractC0000a.m99x0(new C4825dq(HttpUrl.FRAGMENT_ENCODE_SET, "旧版全局设置"));
                                        List<C4298i> list2 = (List) interfaceC1809a172.getValue();
                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                        for (C4298i c4298i2 : list2) {
                                            arrayList.add(new C4825dq(c4298i2.f14300a, c4298i2.f14301b));
                                        }
                                        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList);
                                        String str3 = (String) interfaceC1809a182.getValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P2 = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a110;
                                        if (zM4538h || objM4514P2 == c1823e) {
                                            objM4514P2 = new C5143ng(interfaceC1809a182, sharedPreferences22, interfaceC1809a172, interfaceC1809a192);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9353I2("默认规则", str, arrayListM8397F1, str3, (InterfaceC1231l) objM4514P2, false, c1836h02, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM6836i2 = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无单独配置" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个聊天");
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a111, 10);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("适用聊天", strM6836i2, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4749bf(interfaceC1809a112, 11);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", "一次给多个聊天分配同一规则", (InterfaceC1220a) objM4514P4, c1836h02, 438);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("全部抢", 0), new C3958e("白名单（只抢指定人）", 1), new C3958e("黑名单（不抢指定人）", 2));
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a17;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C5535ze(interfaceC1809a1102, 26);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_auto_mode", "过滤模式", arrayListM9699w6, 0, (InterfaceC1231l) objM4514P5, c1836h03, 221616, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("无限制", 0), new C3958e("只抢含关键词的", 1), new C3958e("屏蔽含关键词的", 2));
                                        Object objM4514P6 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a18;
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a19;
                                        if (objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4029m1(7, interfaceC1809a1112, interfaceC1809a1122);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_kw_mode", "关键词过滤", arrayListM9699w62, 0, (InterfaceC1231l) objM4514P6, c1836h03, 221616, 0);
                                        if (((Number) interfaceC1809a1112.getValue()).intValue() != 0) {
                                            c1836h03.m4525a0(-235058299);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5535ze(interfaceC1809a1122, 27);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9304C1("关键词列表", "多个关键词用 | 分隔", str4, 0, (InterfaceC1231l) objM4514P7, c1836h03, 24630, 8);
                                            c1836h03 = c1836h03;
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-234917032);
                                            c1836h03.m4553p(false);
                                        }
                                        int iIntValue4 = ((Number) interfaceC1809a1102.getValue()).intValue();
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a111;
                                        if (iIntValue4 == 1) {
                                            c1836h03.m4525a0(-234858876);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a110;
                                            String strM9403O4 = AbstractC4955ho.m9403O4((String) interfaceC1809a114.getValue());
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C0500x0(21, interfaceC1809a114, interfaceC1809a113);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9503b("白名单", strM9403O4, (InterfaceC1220a) objM4514P8, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a1102.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-234242844);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a112;
                                            String strM9403O42 = AbstractC4955ho.m9403O4((String) interfaceC1809a115.getValue());
                                            Object objM4514P9 = c1836h03.m4514P();
                                            if (objM4514P9 == c1823e2) {
                                                objM4514P9 = new C0500x0(22, interfaceC1809a115, interfaceC1809a113);
                                                c1836h03.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9503b("黑名单", strM9403O42, (InterfaceC1220a) objM4514P9, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-233670088);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a17;
                                        String strM6836i3 = ((List) interfaceC1809a116.getValue()).isEmpty() ? "暂无模板，进入后添加不同群的抢包策略" : AbstractC3199a.m6836i(((List) interfaceC1809a116.getValue()).size(), " 个模板，进入后新增或修改");
                                        Object objM4514P10 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5371ud(interfaceC1809a18, 29);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9704x3("红包模板", strM6836i3, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a19;
                                        String strM6836i4 = ((List) interfaceC1809a117.getValue()).isEmpty() ? "暂无适用聊天，未命中时走默认规则" : AbstractC3199a.m6836i(((List) interfaceC1809a117.getValue()).size(), " 个聊天，进入后分配模板");
                                        Object objM4514P11 = c1836h04.m4514P();
                                        if (objM4514P11 == c1823e3) {
                                            objM4514P11 = new C4749bf(interfaceC1809a110, 0);
                                            c1836h04.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9704x3("适用聊天", strM6836i4, (InterfaceC1220a) objM4514P11, c1836h04, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a111;
                                        String str5 = (String) interfaceC1809a118.getValue();
                                        List list3 = (List) interfaceC1809a116.getValue();
                                        if (AbstractC3149m.m6721t0(str5)) {
                                            str5 = "旧版全局设置";
                                        } else {
                                            Iterator it2 = list3.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    if (((C2922j) next2).f9512a.equals(str5)) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            C2922j c2922j = (C2922j) next2;
                                            if (c2922j != null) {
                                                String str6 = c2922j.f9513b;
                                                if (!AbstractC3149m.m6721t0(str6)) {
                                                    str5 = str6;
                                                }
                                            } else {
                                                str5 = "模板不存在，当前会回到旧版全局设置";
                                            }
                                        }
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P12 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P12 == c1823e3) {
                                            C0482r0 c0482r0 = new C0482r0(interfaceC1809a116, interfaceC1809a118, sharedPreferences4, interfaceC1809a117, interfaceC1809a112, 14);
                                            c1836h04.m4545k0(c0482r0);
                                            objM4514P12 = c0482r0;
                                        }
                                        AbstractC4955ho.m9704x3("默认规则", str5, (InterfaceC1220a) objM4514P12, c1836h04, 6);
                                    } else {
                                        c1836h04.m4519V();
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
                    final SharedPreferences sharedPreferences3 = this.f20381h;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f20382i;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f20383j;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f20384k;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f20385l;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f20386m;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f20387n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-519740630, new InterfaceC1235p() { // from class: wb.ic
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object next;
                            String str;
                            Object next2;
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "transfer_auto_enable", "自动收款", "自动领取待收款转账", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a113;
                                        String strM6836i = ((List) interfaceC1809a172.getValue()).isEmpty() ? "暂无模板" : AbstractC3199a.m6836i(((List) interfaceC1809a172.getValue()).size(), " 个模板");
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a114, 9);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("收款规则模板", strM6836i, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a115;
                                        String str2 = (String) interfaceC1809a182.getValue();
                                        List list = (List) interfaceC1809a172.getValue();
                                        if (AbstractC3149m.m6721t0(str2)) {
                                            str = "旧版全局设置";
                                        } else {
                                            Iterator it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    if (((C4298i) next).f14300a.equals(str2)) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            C4298i c4298i = (C4298i) next;
                                            str = c4298i != null ? c4298i.f14301b : "模板不存在，使用全局设置";
                                        }
                                        List listM99x0 = AbstractC0000a.m99x0(new C4825dq(HttpUrl.FRAGMENT_ENCODE_SET, "旧版全局设置"));
                                        List<C4298i> list2 = (List) interfaceC1809a172.getValue();
                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                        for (C4298i c4298i2 : list2) {
                                            arrayList.add(new C4825dq(c4298i2.f14300a, c4298i2.f14301b));
                                        }
                                        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList);
                                        String str3 = (String) interfaceC1809a182.getValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P2 = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a116;
                                        if (zM4538h || objM4514P2 == c1823e) {
                                            objM4514P2 = new C5143ng(interfaceC1809a182, sharedPreferences22, interfaceC1809a172, interfaceC1809a192);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9353I2("默认规则", str, arrayListM8397F1, str3, (InterfaceC1231l) objM4514P2, false, c1836h02, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM6836i2 = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无单独配置" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个聊天");
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a117, 10);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("适用聊天", strM6836i2, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4749bf(interfaceC1809a118, 11);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", "一次给多个聊天分配同一规则", (InterfaceC1220a) objM4514P4, c1836h02, 438);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("全部抢", 0), new C3958e("白名单（只抢指定人）", 1), new C3958e("黑名单（不抢指定人）", 2));
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a113;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C5535ze(interfaceC1809a1102, 26);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_auto_mode", "过滤模式", arrayListM9699w6, 0, (InterfaceC1231l) objM4514P5, c1836h03, 221616, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("无限制", 0), new C3958e("只抢含关键词的", 1), new C3958e("屏蔽含关键词的", 2));
                                        Object objM4514P6 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a114;
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a115;
                                        if (objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4029m1(7, interfaceC1809a1112, interfaceC1809a1122);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_kw_mode", "关键词过滤", arrayListM9699w62, 0, (InterfaceC1231l) objM4514P6, c1836h03, 221616, 0);
                                        if (((Number) interfaceC1809a1112.getValue()).intValue() != 0) {
                                            c1836h03.m4525a0(-235058299);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5535ze(interfaceC1809a1122, 27);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9304C1("关键词列表", "多个关键词用 | 分隔", str4, 0, (InterfaceC1231l) objM4514P7, c1836h03, 24630, 8);
                                            c1836h03 = c1836h03;
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-234917032);
                                            c1836h03.m4553p(false);
                                        }
                                        int iIntValue4 = ((Number) interfaceC1809a1102.getValue()).intValue();
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a117;
                                        if (iIntValue4 == 1) {
                                            c1836h03.m4525a0(-234858876);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a116;
                                            String strM9403O4 = AbstractC4955ho.m9403O4((String) interfaceC1809a1142.getValue());
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C0500x0(21, interfaceC1809a1142, interfaceC1809a1132);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9503b("白名单", strM9403O4, (InterfaceC1220a) objM4514P8, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a1102.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-234242844);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a118;
                                            String strM9403O42 = AbstractC4955ho.m9403O4((String) interfaceC1809a1152.getValue());
                                            Object objM4514P9 = c1836h03.m4514P();
                                            if (objM4514P9 == c1823e2) {
                                                objM4514P9 = new C0500x0(22, interfaceC1809a1152, interfaceC1809a1132);
                                                c1836h03.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9503b("黑名单", strM9403O42, (InterfaceC1220a) objM4514P9, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-233670088);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a113;
                                        String strM6836i3 = ((List) interfaceC1809a1162.getValue()).isEmpty() ? "暂无模板，进入后添加不同群的抢包策略" : AbstractC3199a.m6836i(((List) interfaceC1809a1162.getValue()).size(), " 个模板，进入后新增或修改");
                                        Object objM4514P10 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5371ud(interfaceC1809a114, 29);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9704x3("红包模板", strM6836i3, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a115;
                                        String strM6836i4 = ((List) interfaceC1809a1172.getValue()).isEmpty() ? "暂无适用聊天，未命中时走默认规则" : AbstractC3199a.m6836i(((List) interfaceC1809a1172.getValue()).size(), " 个聊天，进入后分配模板");
                                        Object objM4514P11 = c1836h04.m4514P();
                                        if (objM4514P11 == c1823e3) {
                                            objM4514P11 = new C4749bf(interfaceC1809a116, 0);
                                            c1836h04.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9704x3("适用聊天", strM6836i4, (InterfaceC1220a) objM4514P11, c1836h04, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a117;
                                        String str5 = (String) interfaceC1809a1182.getValue();
                                        List list3 = (List) interfaceC1809a1162.getValue();
                                        if (AbstractC3149m.m6721t0(str5)) {
                                            str5 = "旧版全局设置";
                                        } else {
                                            Iterator it2 = list3.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    if (((C2922j) next2).f9512a.equals(str5)) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            C2922j c2922j = (C2922j) next2;
                                            if (c2922j != null) {
                                                String str6 = c2922j.f9513b;
                                                if (!AbstractC3149m.m6721t0(str6)) {
                                                    str5 = str6;
                                                }
                                            } else {
                                                str5 = "模板不存在，当前会回到旧版全局设置";
                                            }
                                        }
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P12 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P12 == c1823e3) {
                                            C0482r0 c0482r0 = new C0482r0(interfaceC1809a1162, interfaceC1809a1182, sharedPreferences4, interfaceC1809a1172, interfaceC1809a118, 14);
                                            c1836h04.m4545k0(c0482r0);
                                            objM4514P12 = c0482r0;
                                        }
                                        AbstractC4955ho.m9704x3("默认规则", str5, (InterfaceC1220a) objM4514P12, c1836h04, 6);
                                    } else {
                                        c1836h04.m4519V();
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
