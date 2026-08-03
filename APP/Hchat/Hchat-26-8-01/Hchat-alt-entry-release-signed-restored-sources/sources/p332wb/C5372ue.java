package p332wb;

import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p010aa.C0040h;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import sh.C4029m1;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: wb.ue */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5372ue implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21099g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f21100h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21101i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21102j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21103k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21104l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21105m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5372ue(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, List list, int i9) {
        this.f21099g = i9;
        this.f21101i = interfaceC1809a1;
        this.f21102j = interfaceC1809a12;
        this.f21103k = interfaceC1809a13;
        this.f21104l = interfaceC1809a14;
        this.f21105m = interfaceC1809a15;
        this.f21100h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        final List list;
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1809a1 interfaceC1809a12;
        C1823e c1823e;
        InterfaceC1809a1 interfaceC1809a13;
        InterfaceC1809a1 interfaceC1809a14;
        boolean zM4534f;
        Object objM4514P;
        final List list2;
        int i9;
        boolean z9;
        final List list3;
        int i10;
        boolean z10;
        final List list4;
        InterfaceC1809a1 interfaceC1809a15;
        InterfaceC1809a1 interfaceC1809a16;
        C1823e c1823e2;
        InterfaceC1809a1 interfaceC1809a17;
        InterfaceC1809a1 interfaceC1809a18;
        boolean zM4534f2;
        Object objM4514P2;
        C1836h0 c1836h0 = (C1836h0) obj;
        switch (this.f21099g) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final InterfaceC1809a1 interfaceC1809a19 = this.f21101i;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a19.getValue()).booleanValue();
                    boolean zM4534f3 = c1836h0.m4534f(interfaceC1809a19);
                    final InterfaceC1809a1 interfaceC1809a110 = this.f21102j;
                    boolean zM4534f4 = zM4534f3 | c1836h0.m4534f(interfaceC1809a110);
                    final InterfaceC1809a1 interfaceC1809a111 = this.f21103k;
                    boolean zM4534f5 = zM4534f4 | c1836h0.m4534f(interfaceC1809a111);
                    final InterfaceC1809a1 interfaceC1809a112 = this.f21104l;
                    boolean zM4534f6 = zM4534f5 | c1836h0.m4534f(interfaceC1809a112);
                    final InterfaceC1809a1 interfaceC1809a113 = this.f21105m;
                    boolean zM4534f7 = zM4534f6 | c1836h0.m4534f(interfaceC1809a113);
                    List list5 = this.f21100h;
                    boolean zM4538h = zM4534f7 | c1836h0.m4538h(list5);
                    Object objM4514P3 = c1836h0.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h || objM4514P3 == c1823e3) {
                        final int i11 = 0;
                        list = list5;
                        InterfaceC1231l interfaceC1231l = new InterfaceC1231l() { // from class: wb.kh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                switch (i11) {
                                    case 0:
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        interfaceC1809a19.setValue(bool);
                                        if (zBooleanValue2) {
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a110;
                                            if (!((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a111;
                                                if (((Set) interfaceC1809a115.getValue()).isEmpty()) {
                                                    InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a112;
                                                    if (AbstractC3149m.m6721t0((String) interfaceC1809a116.getValue())) {
                                                        AbstractC4955ho.m9480Y1(list, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116);
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue3 = bool.booleanValue();
                                        interfaceC1809a19.setValue(bool);
                                        if (zBooleanValue3) {
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a110;
                                            if (!((Boolean) interfaceC1809a117.getValue()).booleanValue()) {
                                                InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a111;
                                                if (((Set) interfaceC1809a118.getValue()).isEmpty()) {
                                                    InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a112;
                                                    if (AbstractC3149m.m6721t0((String) interfaceC1809a119.getValue())) {
                                                        AbstractC4955ho.m9432S1(list, interfaceC1809a113, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119);
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        interfaceC1809a1 = interfaceC1809a112;
                        interfaceC1809a12 = interfaceC1809a113;
                        c1836h0.m4545k0(interfaceC1231l);
                        objM4514P3 = interfaceC1231l;
                    } else {
                        interfaceC1809a1 = interfaceC1809a112;
                        interfaceC1809a12 = interfaceC1809a113;
                        list = list5;
                    }
                    final InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a12;
                    final List list6 = list;
                    AbstractC4955ho.m9410P3(zBooleanValue, "默认专属规则", "开启后不依赖模板，直接按下方类型和关键词屏蔽", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
                    if (((Boolean) interfaceC1809a19.getValue()).booleanValue()) {
                        c1836h0.m4525a0(1313322397);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zM4534f8 = c1836h0.m4534f(interfaceC1809a114) | c1836h0.m4538h(list6) | c1836h0.m4534f(interfaceC1809a110) | c1836h0.m4534f(interfaceC1809a111) | c1836h0.m4534f(interfaceC1809a1);
                        Object objM4514P4 = c1836h0.m4514P();
                        if (zM4534f8) {
                            c1823e = c1823e3;
                        } else {
                            c1823e = c1823e3;
                            if (objM4514P4 != c1823e) {
                                interfaceC1809a13 = interfaceC1809a1;
                                interfaceC1809a14 = interfaceC1809a110;
                            }
                            AbstractC4955ho.m9503b("套用已选模板规则", "把上方模板的类型和关键词复制到这里", (InterfaceC1220a) objM4514P4, c1836h0, 54);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                            zM4534f = c1836h0.m4534f(interfaceC1809a14) | c1836h0.m4534f(interfaceC1809a13);
                            objM4514P = c1836h0.m4514P();
                            if (!zM4534f || objM4514P == c1823e) {
                                objM4514P = new C4029m1(11, interfaceC1809a14, interfaceC1809a13);
                                c1836h0.m4545k0(objM4514P);
                            }
                            C1823e c1823e4 = c1823e;
                            AbstractC4955ho.m9410P3(zBooleanValue2, "所有消息", "开启后默认范围内全部类型生效", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                            if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                                c1836h0.m4525a0(1313954053);
                                c1836h0.m4525a0(-1620181133);
                                for (C4838e6 c4838e6 : AbstractC4955ho.m9618n6()) {
                                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                    boolean zContains = ((Set) interfaceC1809a111.getValue()).contains(c4838e6.f16756a);
                                    String str = c4838e6.f16757b;
                                    String str2 = c4838e6.f16758c;
                                    boolean zM4534f9 = c1836h0.m4534f(interfaceC1809a111) | c1836h0.m4534f(c4838e6) | c1836h0.m4534f(interfaceC1809a13);
                                    Object objM4514P5 = c1836h0.m4514P();
                                    if (zM4534f9 || objM4514P5 == c1823e4) {
                                        objM4514P5 = new C5111mh(c4838e6, interfaceC1809a111, interfaceC1809a13, 0);
                                        c1836h0.m4545k0(objM4514P5);
                                    }
                                    AbstractC4955ho.m9410P3(zContains, str, str2, false, (InterfaceC1231l) objM4514P5, c1836h0, 0, 8);
                                }
                                c1836h0.m4553p(false);
                                if (((Set) interfaceC1809a111.getValue()).contains(WeChatSnsPost.TYPE_TEXT)) {
                                    c1836h0.m4525a0(1314915208);
                                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                    String str3 = (String) interfaceC1809a13.getValue();
                                    boolean zM4534f10 = c1836h0.m4534f(interfaceC1809a13);
                                    Object objM4514P6 = c1836h0.m4514P();
                                    if (zM4534f10 || objM4514P6 == c1823e4) {
                                        objM4514P6 = new C4980ih(interfaceC1809a13, 6);
                                        c1836h0.m4545k0(objM4514P6);
                                    }
                                    AbstractC4955ho.m9304C1("文字关键词", "仅文字消息生效；多个用 |、逗号或换行分隔，留空则全部文字命中", str3, 2, (InterfaceC1231l) objM4514P6, c1836h0, 3126, 0);
                                    c1836h0.m4553p(false);
                                } else {
                                    c1836h0.m4525a0(1315290959);
                                    c1836h0.m4553p(false);
                                }
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(1315316751);
                                c1836h0.m4553p(false);
                            }
                            c1836h0.m4553p(false);
                        }
                        final int i12 = 0;
                        final InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a1;
                        InterfaceC1220a interfaceC1220a = new InterfaceC1220a() { // from class: wb.lh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        AbstractC4955ho.m9480Y1(list6, interfaceC1809a114, interfaceC1809a110, interfaceC1809a111, interfaceC1809a115);
                                        break;
                                    default:
                                        AbstractC4955ho.m9432S1(list6, interfaceC1809a114, interfaceC1809a110, interfaceC1809a111, interfaceC1809a115);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        interfaceC1809a14 = interfaceC1809a110;
                        interfaceC1809a111 = interfaceC1809a111;
                        interfaceC1809a13 = interfaceC1809a115;
                        c1836h0.m4545k0(interfaceC1220a);
                        objM4514P4 = interfaceC1220a;
                        AbstractC4955ho.m9503b("套用已选模板规则", "把上方模板的类型和关键词复制到这里", (InterfaceC1220a) objM4514P4, c1836h0, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zBooleanValue22 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                        zM4534f = c1836h0.m4534f(interfaceC1809a14) | c1836h0.m4534f(interfaceC1809a13);
                        objM4514P = c1836h0.m4514P();
                        if (!zM4534f) {
                            objM4514P = new C4029m1(11, interfaceC1809a14, interfaceC1809a13);
                            c1836h0.m4545k0(objM4514P);
                            C1823e c1823e42 = c1823e;
                            AbstractC4955ho.m9410P3(zBooleanValue22, "所有消息", "开启后默认范围内全部类型生效", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                            if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                            }
                            c1836h0.m4553p(false);
                        }
                    } else {
                        c1836h0.m4525a0(1315338575);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = 1;
                boolean z11 = false;
                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list7 = this.f21100h;
                    if (list7.isEmpty()) {
                        c1836h0.m4525a0(343475359);
                        AbstractC4955ho.m9657s0("暂无模板。先新增模板，或开启下方专属规则。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(343590090);
                        int i14 = 0;
                        for (Object obj3 : list7) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            final C0040h c0040h = (C0040h) obj3;
                            final InterfaceC1809a1 interfaceC1809a116 = this.f21101i;
                            boolean zContains2 = ((Set) interfaceC1809a116.getValue()).contains(c0040h.f131a);
                            String strM2249l = c0040h.f132b;
                            if (AbstractC3149m.m6721t0(strM2249l)) {
                                strM2249l = AbstractC0921a.m2249l(i15, "模板 ");
                            }
                            String strM9653r5 = AbstractC4955ho.m9653r5(c0040h);
                            boolean zM4534f11 = c1836h0.m4534f(interfaceC1809a116) | c1836h0.m4538h(c0040h);
                            final InterfaceC1809a1 interfaceC1809a117 = this.f21102j;
                            boolean zM4534f12 = zM4534f11 | c1836h0.m4534f(interfaceC1809a117) | c1836h0.m4538h(list7);
                            final InterfaceC1809a1 interfaceC1809a118 = this.f21103k;
                            boolean zM4534f13 = zM4534f12 | c1836h0.m4534f(interfaceC1809a118);
                            final InterfaceC1809a1 interfaceC1809a119 = this.f21104l;
                            boolean zM4534f14 = zM4534f13 | c1836h0.m4534f(interfaceC1809a119);
                            int i16 = i13;
                            final InterfaceC1809a1 interfaceC1809a120 = this.f21105m;
                            boolean zM4534f15 = zM4534f14 | c1836h0.m4534f(interfaceC1809a120);
                            Object objM4514P7 = c1836h0.m4514P();
                            if (zM4534f15 || objM4514P7 == C1851l.f6155a) {
                                final int i17 = 1;
                                list2 = list7;
                                InterfaceC1231l interfaceC1231l2 = new InterfaceC1231l() { // from class: wb.rh
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1231l
                                    public final Object invoke(Object obj4) {
                                        switch (i17) {
                                            case 0:
                                                String str4 = c0040h.f131a;
                                                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                                                InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a116;
                                                interfaceC1809a121.setValue(zBooleanValue3 ? AbstractC4156d0.m8354V((Set) interfaceC1809a121.getValue(), str4) : AbstractC4156d0.m8351S((Set) interfaceC1809a121.getValue(), str4));
                                                if (!((Boolean) interfaceC1809a117.getValue()).booleanValue()) {
                                                    AbstractC4955ho.m9432S1(list2, interfaceC1809a121, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120);
                                                }
                                                break;
                                            default:
                                                String str5 = c0040h.f131a;
                                                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                                                InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a116;
                                                interfaceC1809a122.setValue(zBooleanValue4 ? AbstractC4156d0.m8354V((Set) interfaceC1809a122.getValue(), str5) : AbstractC4156d0.m8351S((Set) interfaceC1809a122.getValue(), str5));
                                                if (!((Boolean) interfaceC1809a117.getValue()).booleanValue()) {
                                                    AbstractC4955ho.m9480Y1(list2, interfaceC1809a122, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120);
                                                }
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h0.m4545k0(interfaceC1231l2);
                                objM4514P7 = interfaceC1231l2;
                            } else {
                                list2 = list7;
                            }
                            int i18 = i14;
                            AbstractC4955ho.m9410P3(zContains2, strM2249l, strM9653r5, false, (InterfaceC1231l) objM4514P7, c1836h0, 0, 8);
                            if (i18 < list2.size() - 1) {
                                c1836h0.m4525a0(1054221242);
                                i9 = i16;
                                z9 = false;
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, i9);
                            } else {
                                i9 = i16;
                                z9 = false;
                                c1836h0.m4525a0(-1678866410);
                            }
                            c1836h0.m4553p(z9);
                            i14 = i15;
                            i13 = i9;
                            z11 = z9;
                            list7 = list2;
                        }
                        c1836h0.m4553p(z11);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = 1;
                boolean z12 = false;
                if (c1836h0.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list8 = this.f21100h;
                    if (list8.isEmpty()) {
                        c1836h0.m4525a0(1777575515);
                        AbstractC4955ho.m9657s0("暂无模板。先新增模板，再回到这里选择。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1777688324);
                        int i20 = 0;
                        for (Object obj4 : list8) {
                            int i21 = i20 + 1;
                            if (i20 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            final C0040h c0040h2 = (C0040h) obj4;
                            final InterfaceC1809a1 interfaceC1809a121 = this.f21101i;
                            boolean zContains3 = ((Set) interfaceC1809a121.getValue()).contains(c0040h2.f131a);
                            String strM2249l2 = c0040h2.f132b;
                            if (AbstractC3149m.m6721t0(strM2249l2)) {
                                strM2249l2 = AbstractC0921a.m2249l(i21, "模板 ");
                            }
                            String strM9653r52 = AbstractC4955ho.m9653r5(c0040h2);
                            boolean zM4534f16 = c1836h0.m4534f(interfaceC1809a121) | c1836h0.m4538h(c0040h2);
                            final InterfaceC1809a1 interfaceC1809a122 = this.f21102j;
                            boolean zM4534f17 = zM4534f16 | c1836h0.m4534f(interfaceC1809a122) | c1836h0.m4538h(list8);
                            final InterfaceC1809a1 interfaceC1809a123 = this.f21103k;
                            boolean zM4534f18 = zM4534f17 | c1836h0.m4534f(interfaceC1809a123);
                            final InterfaceC1809a1 interfaceC1809a124 = this.f21104l;
                            boolean zM4534f19 = zM4534f18 | c1836h0.m4534f(interfaceC1809a124);
                            int i22 = i19;
                            final InterfaceC1809a1 interfaceC1809a125 = this.f21105m;
                            boolean zM4534f20 = zM4534f19 | c1836h0.m4534f(interfaceC1809a125);
                            Object objM4514P8 = c1836h0.m4514P();
                            if (zM4534f20 || objM4514P8 == C1851l.f6155a) {
                                final int i23 = 0;
                                list3 = list8;
                                InterfaceC1231l interfaceC1231l3 = new InterfaceC1231l() { // from class: wb.rh
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1231l
                                    public final Object invoke(Object obj42) {
                                        switch (i23) {
                                            case 0:
                                                String str4 = c0040h2.f131a;
                                                boolean zBooleanValue3 = ((Boolean) obj42).booleanValue();
                                                InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a121;
                                                interfaceC1809a1212.setValue(zBooleanValue3 ? AbstractC4156d0.m8354V((Set) interfaceC1809a1212.getValue(), str4) : AbstractC4156d0.m8351S((Set) interfaceC1809a1212.getValue(), str4));
                                                if (!((Boolean) interfaceC1809a122.getValue()).booleanValue()) {
                                                    AbstractC4955ho.m9432S1(list3, interfaceC1809a1212, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125);
                                                }
                                                break;
                                            default:
                                                String str5 = c0040h2.f131a;
                                                boolean zBooleanValue4 = ((Boolean) obj42).booleanValue();
                                                InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a121;
                                                interfaceC1809a1222.setValue(zBooleanValue4 ? AbstractC4156d0.m8354V((Set) interfaceC1809a1222.getValue(), str5) : AbstractC4156d0.m8351S((Set) interfaceC1809a1222.getValue(), str5));
                                                if (!((Boolean) interfaceC1809a122.getValue()).booleanValue()) {
                                                    AbstractC4955ho.m9480Y1(list3, interfaceC1809a1222, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125);
                                                }
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h0.m4545k0(interfaceC1231l3);
                                objM4514P8 = interfaceC1231l3;
                            } else {
                                list3 = list8;
                            }
                            int i24 = i20;
                            AbstractC4955ho.m9410P3(zContains3, strM2249l2, strM9653r52, false, (InterfaceC1231l) objM4514P8, c1836h0, 0, 8);
                            if (i24 < list3.size() - 1) {
                                c1836h0.m4525a0(1752973930);
                                i10 = i22;
                                z10 = false;
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, i10);
                            } else {
                                i10 = i22;
                                z10 = false;
                                c1836h0.m4525a0(-1492369562);
                            }
                            c1836h0.m4553p(z10);
                            i20 = i21;
                            i19 = i10;
                            z12 = z10;
                            list8 = list3;
                        }
                        c1836h0.m4553p(z12);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    final InterfaceC1809a1 interfaceC1809a126 = this.f21101i;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                    String str4 = ((Boolean) interfaceC1809a126.getValue()).booleanValue() ? "开启后只按下方勾选屏蔽，不改动模板本身" : "关闭时跟随上方模板；开启后可直接给这个名单勾选文字、红包等类型";
                    boolean zM4534f21 = c1836h0.m4534f(interfaceC1809a126);
                    final InterfaceC1809a1 interfaceC1809a127 = this.f21102j;
                    boolean zM4534f22 = zM4534f21 | c1836h0.m4534f(interfaceC1809a127);
                    final InterfaceC1809a1 interfaceC1809a128 = this.f21103k;
                    boolean zM4534f23 = zM4534f22 | c1836h0.m4534f(interfaceC1809a128);
                    final InterfaceC1809a1 interfaceC1809a129 = this.f21104l;
                    boolean zM4534f24 = zM4534f23 | c1836h0.m4534f(interfaceC1809a129);
                    final InterfaceC1809a1 interfaceC1809a130 = this.f21105m;
                    boolean zM4534f25 = zM4534f24 | c1836h0.m4534f(interfaceC1809a130);
                    List list9 = this.f21100h;
                    boolean zM4538h2 = zM4534f25 | c1836h0.m4538h(list9);
                    Object objM4514P9 = c1836h0.m4514P();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P9 == c1823e5) {
                        final int i25 = 1;
                        list4 = list9;
                        InterfaceC1231l interfaceC1231l4 = new InterfaceC1231l() { // from class: wb.kh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj32) {
                                Boolean bool = (Boolean) obj32;
                                switch (i25) {
                                    case 0:
                                        boolean zBooleanValue23 = bool.booleanValue();
                                        interfaceC1809a126.setValue(bool);
                                        if (zBooleanValue23) {
                                            InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a127;
                                            if (!((Boolean) interfaceC1809a1142.getValue()).booleanValue()) {
                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a128;
                                                if (((Set) interfaceC1809a1152.getValue()).isEmpty()) {
                                                    InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a129;
                                                    if (AbstractC3149m.m6721t0((String) interfaceC1809a1162.getValue())) {
                                                        AbstractC4955ho.m9480Y1(list4, interfaceC1809a130, interfaceC1809a1142, interfaceC1809a1152, interfaceC1809a1162);
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue32 = bool.booleanValue();
                                        interfaceC1809a126.setValue(bool);
                                        if (zBooleanValue32) {
                                            InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a127;
                                            if (!((Boolean) interfaceC1809a1172.getValue()).booleanValue()) {
                                                InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a128;
                                                if (((Set) interfaceC1809a1182.getValue()).isEmpty()) {
                                                    InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a129;
                                                    if (AbstractC3149m.m6721t0((String) interfaceC1809a1192.getValue())) {
                                                        AbstractC4955ho.m9432S1(list4, interfaceC1809a130, interfaceC1809a1172, interfaceC1809a1182, interfaceC1809a1192);
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        interfaceC1809a15 = interfaceC1809a129;
                        interfaceC1809a16 = interfaceC1809a130;
                        c1836h0.m4545k0(interfaceC1231l4);
                        objM4514P9 = interfaceC1231l4;
                    } else {
                        interfaceC1809a15 = interfaceC1809a129;
                        interfaceC1809a16 = interfaceC1809a130;
                        list4 = list9;
                    }
                    final InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a16;
                    final List list10 = list4;
                    AbstractC4955ho.m9410P3(zBooleanValue3, "本名单专属规则", str4, false, (InterfaceC1231l) objM4514P9, c1836h0, 48, 8);
                    if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-1060334344);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zM4534f26 = c1836h0.m4534f(interfaceC1809a131) | c1836h0.m4538h(list10) | c1836h0.m4534f(interfaceC1809a127) | c1836h0.m4534f(interfaceC1809a128) | c1836h0.m4534f(interfaceC1809a15);
                        Object objM4514P10 = c1836h0.m4514P();
                        if (zM4534f26) {
                            c1823e2 = c1823e5;
                        } else {
                            c1823e2 = c1823e5;
                            if (objM4514P10 != c1823e2) {
                                interfaceC1809a17 = interfaceC1809a15;
                                interfaceC1809a18 = interfaceC1809a127;
                            }
                            AbstractC4955ho.m9503b("套用已选模板规则", "把上方模板的类型和关键词复制到这里", (InterfaceC1220a) objM4514P10, c1836h0, 54);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                            zM4534f2 = c1836h0.m4534f(interfaceC1809a18) | c1836h0.m4534f(interfaceC1809a17);
                            objM4514P2 = c1836h0.m4514P();
                            if (!zM4534f2 || objM4514P2 == c1823e2) {
                                objM4514P2 = new C4029m1(15, interfaceC1809a18, interfaceC1809a17);
                                c1836h0.m4545k0(objM4514P2);
                            }
                            InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P2;
                            C1823e c1823e6 = c1823e2;
                            AbstractC4955ho.m9410P3(zBooleanValue4, "所有消息", "开启后该名单命中范围内全部类型生效", false, interfaceC1231l5, c1836h0, 432, 8);
                            if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                                c1836h0.m4525a0(-1059699805);
                                c1836h0.m4525a0(-311277291);
                                for (C4838e6 c4838e62 : AbstractC4955ho.m9618n6()) {
                                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                    boolean zContains4 = ((Set) interfaceC1809a128.getValue()).contains(c4838e62.f16756a);
                                    String str5 = c4838e62.f16757b;
                                    String str6 = c4838e62.f16758c;
                                    boolean zM4534f27 = c1836h0.m4534f(interfaceC1809a128) | c1836h0.m4534f(c4838e62) | c1836h0.m4534f(interfaceC1809a17);
                                    Object objM4514P11 = c1836h0.m4514P();
                                    if (zM4534f27 || objM4514P11 == c1823e6) {
                                        objM4514P11 = new C5111mh(c4838e62, interfaceC1809a128, interfaceC1809a17, 2);
                                        c1836h0.m4545k0(objM4514P11);
                                    }
                                    AbstractC4955ho.m9410P3(zContains4, str5, str6, false, (InterfaceC1231l) objM4514P11, c1836h0, 0, 8);
                                }
                                c1836h0.m4553p(false);
                                if (((Set) interfaceC1809a128.getValue()).contains(WeChatSnsPost.TYPE_TEXT)) {
                                    c1836h0.m4525a0(-1058738650);
                                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                    String str7 = (String) interfaceC1809a17.getValue();
                                    boolean zM4534f28 = c1836h0.m4534f(interfaceC1809a17);
                                    Object objM4514P12 = c1836h0.m4514P();
                                    if (zM4534f28 || objM4514P12 == c1823e6) {
                                        objM4514P12 = new C4752bi(interfaceC1809a17, 7);
                                        c1836h0.m4545k0(objM4514P12);
                                    }
                                    AbstractC4955ho.m9304C1("文字关键词", "仅文字消息生效；多个用 |、逗号或换行分隔，留空则全部文字命中", str7, 2, (InterfaceC1231l) objM4514P12, c1836h0, 3126, 0);
                                    c1836h0.m4553p(false);
                                } else {
                                    c1836h0.m4525a0(-1058362899);
                                    c1836h0.m4553p(false);
                                }
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(-1058337107);
                                c1836h0.m4553p(false);
                            }
                            c1836h0.m4553p(false);
                        }
                        final int i26 = 1;
                        final InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a15;
                        InterfaceC1220a interfaceC1220a2 = new InterfaceC1220a() { // from class: wb.lh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        AbstractC4955ho.m9480Y1(list10, interfaceC1809a131, interfaceC1809a127, interfaceC1809a128, interfaceC1809a132);
                                        break;
                                    default:
                                        AbstractC4955ho.m9432S1(list10, interfaceC1809a131, interfaceC1809a127, interfaceC1809a128, interfaceC1809a132);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        interfaceC1809a18 = interfaceC1809a127;
                        interfaceC1809a128 = interfaceC1809a128;
                        interfaceC1809a17 = interfaceC1809a132;
                        c1836h0.m4545k0(interfaceC1220a2);
                        objM4514P10 = interfaceC1220a2;
                        AbstractC4955ho.m9503b("套用已选模板规则", "把上方模板的类型和关键词复制到这里", (InterfaceC1220a) objM4514P10, c1836h0, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zBooleanValue42 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                        zM4534f2 = c1836h0.m4534f(interfaceC1809a18) | c1836h0.m4534f(interfaceC1809a17);
                        objM4514P2 = c1836h0.m4514P();
                        if (!zM4534f2) {
                            objM4514P2 = new C4029m1(15, interfaceC1809a18, interfaceC1809a17);
                            c1836h0.m4545k0(objM4514P2);
                            InterfaceC1231l interfaceC1231l52 = (InterfaceC1231l) objM4514P2;
                            C1823e c1823e62 = c1823e2;
                            AbstractC4955ho.m9410P3(zBooleanValue42, "所有消息", "开启后该名单命中范围内全部类型生效", false, interfaceC1231l52, c1836h0, 432, 8);
                            if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                            }
                            c1836h0.m4553p(false);
                        }
                    } else {
                        c1836h0.m4525a0(-1058315283);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5372ue(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, int i9) {
        this.f21099g = i9;
        this.f21100h = list;
        this.f21101i = interfaceC1809a1;
        this.f21102j = interfaceC1809a12;
        this.f21103k = interfaceC1809a13;
        this.f21104l = interfaceC1809a14;
        this.f21105m = interfaceC1809a15;
    }
}
