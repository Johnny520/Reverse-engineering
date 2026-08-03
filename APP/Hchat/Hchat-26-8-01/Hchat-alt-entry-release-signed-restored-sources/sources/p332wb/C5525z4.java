package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import gg.C1414j;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p154k9.C2366j;
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
import p243q9.C3471g;
import p266s0.C3878h;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.z4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5525z4 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22318g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f22319h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22320i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22321j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f22322k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f22323l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f22324m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5525z4(int i9, InterfaceC1220a interfaceC1220a, String str, String str2, C5491y2 c5491y2, InterfaceC5853o interfaceC5853o, boolean z9) {
        this.f22322k = c5491y2;
        this.f22320i = str;
        this.f22321j = str2;
        this.f22319h = z9;
        this.f22323l = interfaceC1220a;
        this.f22324m = interfaceC5853o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        C5850l c5850l;
        InterfaceC1220a interfaceC1220a;
        switch (this.f22318g) {
            case 0:
                C5491y2 c5491y2 = (C5491y2) this.f22322k;
                String str = (String) this.f22320i;
                String str2 = (String) this.f22321j;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f22323l;
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) this.f22324m;
                ((Integer) obj2).getClass();
                c5491y2.m9886d(AbstractC1874r.m4617C(199687), interfaceC1220a2, (C1836h0) obj, str, str2, interfaceC5853o, this.f22319h);
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f22322k;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f22323l;
                String str3 = (String) this.f22320i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f22324m;
                String str4 = (String) this.f22321j;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                    boolean z9 = this.f22319h;
                    String str5 = z9 ? "隐藏伪集赞入口，已伪造的点赞仍然显示" : "隐藏伪评论入口，已伪造的评论仍然显示";
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a12) | c1836h0.m4538h(sharedPreferences) | c1836h0.m4534f(str3);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C5402vb(sharedPreferences, str3, interfaceC1809a12, 1);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "隐藏长按菜单", str5, false, (InterfaceC1231l) objM4514P, c1836h0, 48, 8);
                    if (((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-1979915949);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1980448343);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String str6 = z9 ? "伪集赞自定义文本" : "伪评论自定义文本";
                        String str7 = (String) interfaceC1809a13.getValue();
                        boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a13) | c1836h0.m4538h(sharedPreferences) | c1836h0.m4534f(str4);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4534f2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C5402vb(sharedPreferences, str4, interfaceC1809a13, 2);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9304C1(str6, "完整替换朋友圈长按菜单文字", str7, 0, (InterfaceC1231l) objM4514P2, c1836h0, 48, 8);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                final C2366j c2366j = (C2366j) this.f22322k;
                final C5229q3 c5229q3 = (C5229q3) this.f22320i;
                final Context context = (Context) this.f22321j;
                final InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f22323l;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f22324m;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5850l c5850l2 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM5441r = AbstractC2192n.m5441r(AbstractC3222h1.m6901d(c5850l2, 1.0f), AbstractC2192n.m5440q(c1836h02), true, true);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
                    int iHashCode = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM5441r);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h02, c3256tM6935a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h02, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h02);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c);
                    String str8 = c2366j.f7773b;
                    String str9 = c2366j.f7774c;
                    boolean zM4538h = c1836h02.m4538h(c5229q3) | c1836h02.m4538h(c2366j);
                    Object objM4514P3 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h || objM4514P3 == c1823e2) {
                        interfaceC1809a1 = interfaceC1809a15;
                        final int i9 = 0;
                        objM4514P3 = new InterfaceC1231l() { // from class: wb.mk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj3) {
                                switch (i9) {
                                    case 0:
                                        String str10 = (String) obj3;
                                        str10.getClass();
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j, str10, null, null, null, null, false, 125)));
                                        break;
                                    case 1:
                                        String str11 = (String) obj3;
                                        str11.getClass();
                                        boolean zEquals = str11.equals("activity");
                                        C2366j c2366j2 = c2366j;
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j2, null, str11, zEquals ? c2366j2.f7775d : HttpUrl.FRAGMENT_ENCODE_SET, null, null, false, 115)));
                                        break;
                                    default:
                                        String str12 = (String) obj3;
                                        str12.getClass();
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j, null, null, str12, null, null, false, 119)));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P3);
                    } else {
                        interfaceC1809a1 = interfaceC1809a15;
                    }
                    AbstractC4955ho.m9304C1("名称", "显示在展开菜单中的名称", str8, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                    String str10 = AbstractC1416l.m3825a(str9, "module_settings") ? "打开 Hchat 设置" : AbstractC1416l.m3825a(str9, "plugin_agent") ? "展开或收起插件 Agent" : "打开微信页面";
                    List listM101y0 = AbstractC0000a.m101y0(new C4825dq("activity", "微信页面"), new C4825dq("module_settings", "模块设置"), new C4825dq("plugin_agent", "插件 Agent"));
                    String str11 = c2366j.f7774c;
                    boolean zM4538h2 = c1836h02.m4538h(c5229q3) | c1836h02.m4538h(c2366j);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4538h2 || objM4514P4 == c1823e2) {
                        final int i10 = 1;
                        objM4514P4 = new InterfaceC1231l() { // from class: wb.mk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj3) {
                                switch (i10) {
                                    case 0:
                                        String str102 = (String) obj3;
                                        str102.getClass();
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j, str102, null, null, null, null, false, 125)));
                                        break;
                                    case 1:
                                        String str112 = (String) obj3;
                                        str112.getClass();
                                        boolean zEquals = str112.equals("activity");
                                        C2366j c2366j2 = c2366j;
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j2, null, str112, zEquals ? c2366j2.f7775d : HttpUrl.FRAGMENT_ENCODE_SET, null, null, false, 115)));
                                        break;
                                    default:
                                        String str12 = (String) obj3;
                                        str12.getClass();
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j, null, null, str12, null, null, false, 119)));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9353I2("动作类型", str10, listM101y0, str11, (InterfaceC1231l) objM4514P4, false, c1836h02, 6, 32);
                    if (AbstractC1416l.m3825a(str9, "activity")) {
                        c1836h02.m4525a0(1533461272);
                        String str12 = c2366j.f7775d;
                        boolean zM4538h3 = c1836h02.m4538h(c5229q3) | c1836h02.m4538h(c2366j);
                        Object objM4514P5 = c1836h02.m4514P();
                        if (zM4538h3 || objM4514P5 == c1823e2) {
                            final int i11 = 2;
                            objM4514P5 = new InterfaceC1231l() { // from class: wb.mk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj3) {
                                    switch (i11) {
                                        case 0:
                                            String str102 = (String) obj3;
                                            str102.getClass();
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j, str102, null, null, null, null, false, 125)));
                                            break;
                                        case 1:
                                            String str112 = (String) obj3;
                                            str112.getClass();
                                            boolean zEquals = str112.equals("activity");
                                            C2366j c2366j2 = c2366j;
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j2, null, str112, zEquals ? c2366j2.f7775d : HttpUrl.FRAGMENT_ENCODE_SET, null, null, false, 115)));
                                            break;
                                        default:
                                            String str122 = (String) obj3;
                                            str122.getClass();
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q3, C2366j.m5671a(c2366j, null, null, str122, null, null, false, 119)));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h02.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9304C1("Activity 类名", "填写微信页面的完整 Activity 类名", str12, 0, (InterfaceC1231l) objM4514P5, c1836h02, 54, 8);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1533797622);
                        c1836h02.m4553p(false);
                    }
                    String str13 = c2366j.f7776e;
                    boolean zM4538h4 = c1836h02.m4538h(context) | c1836h02.m4538h(c2366j) | c1836h02.m4538h(c5229q3);
                    Object objM4514P6 = c1836h02.m4514P();
                    if (zM4538h4 || objM4514P6 == c1823e2) {
                        final int i12 = 0;
                        c5850l = c5850l2;
                        objM4514P6 = new InterfaceC1220a() { // from class: wb.nk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        final C2366j c2366j2 = c2366j;
                                        String str14 = "item-" + c2366j2.f7772a + "-" + System.nanoTime();
                                        final int i13 = 0;
                                        final C5229q3 c5229q32 = c5229q3;
                                        final Context context2 = context;
                                        final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                        AbstractC4955ho.m9447U0(context2, str14, new InterfaceC1231l() { // from class: wb.e7
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj3) {
                                                switch (i13) {
                                                    case 0:
                                                        String str15 = (String) obj3;
                                                        str15.getClass();
                                                        C2366j c2366j3 = c2366j2;
                                                        String str16 = c2366j3.f7776e;
                                                        C5229q3 c5229q33 = c5229q32;
                                                        C2366j c2366j4 = c5229q33.f20119a;
                                                        if (!AbstractC1416l.m3825a(str16, c2366j4 != null ? c2366j4.f7776e : null)) {
                                                            AbstractC2043a.m5039m(context2, c2366j3.f7776e);
                                                        }
                                                        interfaceC1809a16.setValue(C5229q3.m9737a(c5229q33, C2366j.m5671a(c2366j3, null, null, null, str15, null, false, 111)));
                                                        break;
                                                    default:
                                                        String str17 = (String) obj3;
                                                        str17.getClass();
                                                        C2366j c2366j5 = c2366j2;
                                                        String str18 = c2366j5.f7777f;
                                                        C5229q3 c5229q34 = c5229q32;
                                                        C2366j c2366j6 = c5229q34.f20119a;
                                                        if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                            AbstractC2043a.m5039m(context2, c2366j5.f7777f);
                                                        }
                                                        interfaceC1809a16.setValue(C5229q3.m9737a(c5229q34, C2366j.m5671a(c2366j5, null, null, null, null, str17, false, 95)));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        });
                                        break;
                                    case 1:
                                        C2366j c2366j3 = c2366j;
                                        String str15 = c2366j3.f7776e;
                                        C5229q3 c5229q33 = c5229q3;
                                        C2366j c2366j4 = c5229q33.f20119a;
                                        if (!AbstractC1416l.m3825a(str15, c2366j4 != null ? c2366j4.f7776e : null)) {
                                            AbstractC2043a.m5039m(context, c2366j3.f7776e);
                                        }
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q33, C2366j.m5671a(c2366j3, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, false, 111)));
                                        break;
                                    case 2:
                                        final C2366j c2366j5 = c2366j;
                                        String str16 = "item-dark-" + c2366j5.f7772a + "-" + System.nanoTime();
                                        final int i14 = 1;
                                        final C5229q3 c5229q34 = c5229q3;
                                        final Context context3 = context;
                                        final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                        AbstractC4955ho.m9447U0(context3, str16, new InterfaceC1231l() { // from class: wb.e7
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj3) {
                                                switch (i14) {
                                                    case 0:
                                                        String str152 = (String) obj3;
                                                        str152.getClass();
                                                        C2366j c2366j32 = c2366j5;
                                                        String str162 = c2366j32.f7776e;
                                                        C5229q3 c5229q332 = c5229q34;
                                                        C2366j c2366j42 = c5229q332.f20119a;
                                                        if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                            AbstractC2043a.m5039m(context3, c2366j32.f7776e);
                                                        }
                                                        interfaceC1809a17.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                        break;
                                                    default:
                                                        String str17 = (String) obj3;
                                                        str17.getClass();
                                                        C2366j c2366j52 = c2366j5;
                                                        String str18 = c2366j52.f7777f;
                                                        C5229q3 c5229q342 = c5229q34;
                                                        C2366j c2366j6 = c5229q342.f20119a;
                                                        if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                            AbstractC2043a.m5039m(context3, c2366j52.f7777f);
                                                        }
                                                        interfaceC1809a17.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        });
                                        break;
                                    default:
                                        C2366j c2366j6 = c2366j;
                                        String str17 = c2366j6.f7777f;
                                        C5229q3 c5229q35 = c5229q3;
                                        C2366j c2366j7 = c5229q35.f20119a;
                                        if (!AbstractC1416l.m3825a(str17, c2366j7 != null ? c2366j7.f7777f : null)) {
                                            AbstractC2043a.m5039m(context, c2366j6.f7777f);
                                        }
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q35, C2366j.m5671a(c2366j6, null, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, false, 95)));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P6);
                    } else {
                        c5850l = c5850l2;
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P6;
                    InterfaceC1220a interfaceC1220a4 = null;
                    if (AbstractC3149m.m6721t0(c2366j.f7776e)) {
                        c1836h02.m4525a0(1534540753);
                        c1836h02.m4553p(false);
                        interfaceC1220a = null;
                    } else {
                        c1836h02.m4525a0(1534562578);
                        boolean zM4538h5 = c1836h02.m4538h(c2366j) | c1836h02.m4538h(c5229q3) | c1836h02.m4538h(context);
                        Object objM4514P7 = c1836h02.m4514P();
                        if (zM4538h5 || objM4514P7 == c1823e2) {
                            final int i13 = 1;
                            InterfaceC1220a interfaceC1220a5 = new InterfaceC1220a() { // from class: wb.nk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            final C2366j c2366j2 = c2366j;
                                            String str14 = "item-" + c2366j2.f7772a + "-" + System.nanoTime();
                                            final int i132 = 0;
                                            final C5229q3 c5229q32 = c5229q3;
                                            final Context context2 = context;
                                            final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                            AbstractC4955ho.m9447U0(context2, str14, new InterfaceC1231l() { // from class: wb.e7
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1231l
                                                public final Object invoke(Object obj3) {
                                                    switch (i132) {
                                                        case 0:
                                                            String str152 = (String) obj3;
                                                            str152.getClass();
                                                            C2366j c2366j32 = c2366j2;
                                                            String str162 = c2366j32.f7776e;
                                                            C5229q3 c5229q332 = c5229q32;
                                                            C2366j c2366j42 = c5229q332.f20119a;
                                                            if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                                AbstractC2043a.m5039m(context2, c2366j32.f7776e);
                                                            }
                                                            interfaceC1809a16.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                            break;
                                                        default:
                                                            String str17 = (String) obj3;
                                                            str17.getClass();
                                                            C2366j c2366j52 = c2366j2;
                                                            String str18 = c2366j52.f7777f;
                                                            C5229q3 c5229q342 = c5229q32;
                                                            C2366j c2366j6 = c5229q342.f20119a;
                                                            if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                                AbstractC2043a.m5039m(context2, c2366j52.f7777f);
                                                            }
                                                            interfaceC1809a16.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                            break;
                                                    }
                                                    return C3967n.f12976a;
                                                }
                                            });
                                            break;
                                        case 1:
                                            C2366j c2366j3 = c2366j;
                                            String str15 = c2366j3.f7776e;
                                            C5229q3 c5229q33 = c5229q3;
                                            C2366j c2366j4 = c5229q33.f20119a;
                                            if (!AbstractC1416l.m3825a(str15, c2366j4 != null ? c2366j4.f7776e : null)) {
                                                AbstractC2043a.m5039m(context, c2366j3.f7776e);
                                            }
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q33, C2366j.m5671a(c2366j3, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, false, 111)));
                                            break;
                                        case 2:
                                            final C2366j c2366j5 = c2366j;
                                            String str16 = "item-dark-" + c2366j5.f7772a + "-" + System.nanoTime();
                                            final int i14 = 1;
                                            final C5229q3 c5229q34 = c5229q3;
                                            final Context context3 = context;
                                            final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                            AbstractC4955ho.m9447U0(context3, str16, new InterfaceC1231l() { // from class: wb.e7
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1231l
                                                public final Object invoke(Object obj3) {
                                                    switch (i14) {
                                                        case 0:
                                                            String str152 = (String) obj3;
                                                            str152.getClass();
                                                            C2366j c2366j32 = c2366j5;
                                                            String str162 = c2366j32.f7776e;
                                                            C5229q3 c5229q332 = c5229q34;
                                                            C2366j c2366j42 = c5229q332.f20119a;
                                                            if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                                AbstractC2043a.m5039m(context3, c2366j32.f7776e);
                                                            }
                                                            interfaceC1809a17.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                            break;
                                                        default:
                                                            String str17 = (String) obj3;
                                                            str17.getClass();
                                                            C2366j c2366j52 = c2366j5;
                                                            String str18 = c2366j52.f7777f;
                                                            C5229q3 c5229q342 = c5229q34;
                                                            C2366j c2366j6 = c5229q342.f20119a;
                                                            if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                                AbstractC2043a.m5039m(context3, c2366j52.f7777f);
                                                            }
                                                            interfaceC1809a17.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                            break;
                                                    }
                                                    return C3967n.f12976a;
                                                }
                                            });
                                            break;
                                        default:
                                            C2366j c2366j6 = c2366j;
                                            String str17 = c2366j6.f7777f;
                                            C5229q3 c5229q35 = c5229q3;
                                            C2366j c2366j7 = c5229q35.f20119a;
                                            if (!AbstractC1416l.m3825a(str17, c2366j7 != null ? c2366j7.f7777f : null)) {
                                                AbstractC2043a.m5039m(context, c2366j6.f7777f);
                                            }
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q35, C2366j.m5671a(c2366j6, null, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, false, 95)));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h02.m4545k0(interfaceC1220a5);
                            objM4514P7 = interfaceC1220a5;
                        }
                        c1836h02.m4553p(false);
                        interfaceC1220a = (InterfaceC1220a) objM4514P7;
                    }
                    AbstractC4955ho.m9415Q0("浅色模式图标", str13, "未选择时使用内置图标", interfaceC1220a3, interfaceC1220a, c1836h02, 390);
                    String str14 = c2366j.f7777f;
                    boolean zM4538h6 = c1836h02.m4538h(context) | c1836h02.m4538h(c2366j) | c1836h02.m4538h(c5229q3);
                    Object objM4514P8 = c1836h02.m4514P();
                    if (zM4538h6 || objM4514P8 == c1823e2) {
                        final int i14 = 2;
                        InterfaceC1220a interfaceC1220a6 = new InterfaceC1220a() { // from class: wb.nk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        final C2366j c2366j2 = c2366j;
                                        String str142 = "item-" + c2366j2.f7772a + "-" + System.nanoTime();
                                        final int i132 = 0;
                                        final C5229q3 c5229q32 = c5229q3;
                                        final Context context2 = context;
                                        final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                        AbstractC4955ho.m9447U0(context2, str142, new InterfaceC1231l() { // from class: wb.e7
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj3) {
                                                switch (i132) {
                                                    case 0:
                                                        String str152 = (String) obj3;
                                                        str152.getClass();
                                                        C2366j c2366j32 = c2366j2;
                                                        String str162 = c2366j32.f7776e;
                                                        C5229q3 c5229q332 = c5229q32;
                                                        C2366j c2366j42 = c5229q332.f20119a;
                                                        if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                            AbstractC2043a.m5039m(context2, c2366j32.f7776e);
                                                        }
                                                        interfaceC1809a16.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                        break;
                                                    default:
                                                        String str17 = (String) obj3;
                                                        str17.getClass();
                                                        C2366j c2366j52 = c2366j2;
                                                        String str18 = c2366j52.f7777f;
                                                        C5229q3 c5229q342 = c5229q32;
                                                        C2366j c2366j6 = c5229q342.f20119a;
                                                        if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                            AbstractC2043a.m5039m(context2, c2366j52.f7777f);
                                                        }
                                                        interfaceC1809a16.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        });
                                        break;
                                    case 1:
                                        C2366j c2366j3 = c2366j;
                                        String str15 = c2366j3.f7776e;
                                        C5229q3 c5229q33 = c5229q3;
                                        C2366j c2366j4 = c5229q33.f20119a;
                                        if (!AbstractC1416l.m3825a(str15, c2366j4 != null ? c2366j4.f7776e : null)) {
                                            AbstractC2043a.m5039m(context, c2366j3.f7776e);
                                        }
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q33, C2366j.m5671a(c2366j3, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, false, 111)));
                                        break;
                                    case 2:
                                        final C2366j c2366j5 = c2366j;
                                        String str16 = "item-dark-" + c2366j5.f7772a + "-" + System.nanoTime();
                                        final int i142 = 1;
                                        final C5229q3 c5229q34 = c5229q3;
                                        final Context context3 = context;
                                        final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                        AbstractC4955ho.m9447U0(context3, str16, new InterfaceC1231l() { // from class: wb.e7
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj3) {
                                                switch (i142) {
                                                    case 0:
                                                        String str152 = (String) obj3;
                                                        str152.getClass();
                                                        C2366j c2366j32 = c2366j5;
                                                        String str162 = c2366j32.f7776e;
                                                        C5229q3 c5229q332 = c5229q34;
                                                        C2366j c2366j42 = c5229q332.f20119a;
                                                        if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                            AbstractC2043a.m5039m(context3, c2366j32.f7776e);
                                                        }
                                                        interfaceC1809a17.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                        break;
                                                    default:
                                                        String str17 = (String) obj3;
                                                        str17.getClass();
                                                        C2366j c2366j52 = c2366j5;
                                                        String str18 = c2366j52.f7777f;
                                                        C5229q3 c5229q342 = c5229q34;
                                                        C2366j c2366j6 = c5229q342.f20119a;
                                                        if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                            AbstractC2043a.m5039m(context3, c2366j52.f7777f);
                                                        }
                                                        interfaceC1809a17.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        });
                                        break;
                                    default:
                                        C2366j c2366j6 = c2366j;
                                        String str17 = c2366j6.f7777f;
                                        C5229q3 c5229q35 = c5229q3;
                                        C2366j c2366j7 = c5229q35.f20119a;
                                        if (!AbstractC1416l.m3825a(str17, c2366j7 != null ? c2366j7.f7777f : null)) {
                                            AbstractC2043a.m5039m(context, c2366j6.f7777f);
                                        }
                                        interfaceC1809a14.setValue(C5229q3.m9737a(c5229q35, C2366j.m5671a(c2366j6, null, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, false, 95)));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(interfaceC1220a6);
                        objM4514P8 = interfaceC1220a6;
                    }
                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P8;
                    if (AbstractC3149m.m6721t0(c2366j.f7777f)) {
                        c1836h02.m4525a0(1535731153);
                    } else {
                        c1836h02.m4525a0(1535753474);
                        boolean zM4538h7 = c1836h02.m4538h(c2366j) | c1836h02.m4538h(c5229q3) | c1836h02.m4538h(context);
                        Object objM4514P9 = c1836h02.m4514P();
                        if (zM4538h7 || objM4514P9 == c1823e2) {
                            final int i15 = 3;
                            InterfaceC1220a interfaceC1220a8 = new InterfaceC1220a() { // from class: wb.nk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            final C2366j c2366j2 = c2366j;
                                            String str142 = "item-" + c2366j2.f7772a + "-" + System.nanoTime();
                                            final int i132 = 0;
                                            final C5229q3 c5229q32 = c5229q3;
                                            final Context context2 = context;
                                            final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                            AbstractC4955ho.m9447U0(context2, str142, new InterfaceC1231l() { // from class: wb.e7
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1231l
                                                public final Object invoke(Object obj3) {
                                                    switch (i132) {
                                                        case 0:
                                                            String str152 = (String) obj3;
                                                            str152.getClass();
                                                            C2366j c2366j32 = c2366j2;
                                                            String str162 = c2366j32.f7776e;
                                                            C5229q3 c5229q332 = c5229q32;
                                                            C2366j c2366j42 = c5229q332.f20119a;
                                                            if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                                AbstractC2043a.m5039m(context2, c2366j32.f7776e);
                                                            }
                                                            interfaceC1809a16.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                            break;
                                                        default:
                                                            String str17 = (String) obj3;
                                                            str17.getClass();
                                                            C2366j c2366j52 = c2366j2;
                                                            String str18 = c2366j52.f7777f;
                                                            C5229q3 c5229q342 = c5229q32;
                                                            C2366j c2366j6 = c5229q342.f20119a;
                                                            if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                                AbstractC2043a.m5039m(context2, c2366j52.f7777f);
                                                            }
                                                            interfaceC1809a16.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                            break;
                                                    }
                                                    return C3967n.f12976a;
                                                }
                                            });
                                            break;
                                        case 1:
                                            C2366j c2366j3 = c2366j;
                                            String str15 = c2366j3.f7776e;
                                            C5229q3 c5229q33 = c5229q3;
                                            C2366j c2366j4 = c5229q33.f20119a;
                                            if (!AbstractC1416l.m3825a(str15, c2366j4 != null ? c2366j4.f7776e : null)) {
                                                AbstractC2043a.m5039m(context, c2366j3.f7776e);
                                            }
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q33, C2366j.m5671a(c2366j3, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, false, 111)));
                                            break;
                                        case 2:
                                            final C2366j c2366j5 = c2366j;
                                            String str16 = "item-dark-" + c2366j5.f7772a + "-" + System.nanoTime();
                                            final int i142 = 1;
                                            final C5229q3 c5229q34 = c5229q3;
                                            final Context context3 = context;
                                            final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                            AbstractC4955ho.m9447U0(context3, str16, new InterfaceC1231l() { // from class: wb.e7
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1231l
                                                public final Object invoke(Object obj3) {
                                                    switch (i142) {
                                                        case 0:
                                                            String str152 = (String) obj3;
                                                            str152.getClass();
                                                            C2366j c2366j32 = c2366j5;
                                                            String str162 = c2366j32.f7776e;
                                                            C5229q3 c5229q332 = c5229q34;
                                                            C2366j c2366j42 = c5229q332.f20119a;
                                                            if (!AbstractC1416l.m3825a(str162, c2366j42 != null ? c2366j42.f7776e : null)) {
                                                                AbstractC2043a.m5039m(context3, c2366j32.f7776e);
                                                            }
                                                            interfaceC1809a17.setValue(C5229q3.m9737a(c5229q332, C2366j.m5671a(c2366j32, null, null, null, str152, null, false, 111)));
                                                            break;
                                                        default:
                                                            String str17 = (String) obj3;
                                                            str17.getClass();
                                                            C2366j c2366j52 = c2366j5;
                                                            String str18 = c2366j52.f7777f;
                                                            C5229q3 c5229q342 = c5229q34;
                                                            C2366j c2366j6 = c5229q342.f20119a;
                                                            if (!AbstractC1416l.m3825a(str18, c2366j6 != null ? c2366j6.f7777f : null)) {
                                                                AbstractC2043a.m5039m(context3, c2366j52.f7777f);
                                                            }
                                                            interfaceC1809a17.setValue(C5229q3.m9737a(c5229q342, C2366j.m5671a(c2366j52, null, null, null, null, str17, false, 95)));
                                                            break;
                                                    }
                                                    return C3967n.f12976a;
                                                }
                                            });
                                            break;
                                        default:
                                            C2366j c2366j6 = c2366j;
                                            String str17 = c2366j6.f7777f;
                                            C5229q3 c5229q35 = c5229q3;
                                            C2366j c2366j7 = c5229q35.f20119a;
                                            if (!AbstractC1416l.m3825a(str17, c2366j7 != null ? c2366j7.f7777f : null)) {
                                                AbstractC2043a.m5039m(context, c2366j6.f7777f);
                                            }
                                            interfaceC1809a14.setValue(C5229q3.m9737a(c5229q35, C2366j.m5671a(c2366j6, null, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, false, 95)));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h02.m4545k0(interfaceC1220a8);
                            objM4514P9 = interfaceC1220a8;
                        }
                        interfaceC1220a4 = (InterfaceC1220a) objM4514P9;
                    }
                    c1836h02.m4553p(false);
                    AbstractC4955ho.m9415Q0("深色模式图标", str14, "未选择时沿用浅色模式图标", interfaceC1220a7, interfaceC1220a4, c1836h02, 390);
                    InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC3222h1.m6901d(c5850l, 1.0f), 16, 12);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(8), C5840b.f23770p, c1836h02, 6);
                    int iHashCode2 = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l2 = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6883m);
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h02, c3213e1M6892a);
                    AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h02, c5597e3, c1836h02, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c2);
                    boolean zM4538h8 = c1836h02.m4538h(context);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4538h8 || objM4514P10 == c1823e2) {
                        objM4514P10 = new C5381un(context, interfaceC1809a14, 1);
                        c1836h02.m4545k0(objM4514P10);
                    }
                    InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) ((C1414j) objM4514P10);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a9, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h02), null, c1836h02, 6, 1912);
                    boolean z10 = this.f22319h;
                    boolean zM4536g = c1836h02.m4536g(z10) | c1836h02.m4538h(context) | c1836h02.m4538h(c2366j) | c1836h02.m4538h(c5229q3);
                    Object objM4514P11 = c1836h02.m4514P();
                    if (zM4536g || objM4514P11 == c1823e2) {
                        C5180ok c5180ok = new C5180ok(context, interfaceC1809a1, interfaceC1809a14, c2366j, c5229q3, z10);
                        c1836h02.m4545k0(c5180ok);
                        objM4514P11 = c5180ok;
                    }
                    InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P11;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("保存", interfaceC1220a10, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h02), null, c1836h02, 6, 1912);
                    c1836h02.m4553p(true);
                    c1836h02.m4553p(true);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9643q4((String) this.f22320i, (String) this.f22321j, (String) this.f22322k, this.f22319h, (InterfaceC1220a) this.f22323l, (InterfaceC1220a) this.f22324m, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9676u1((Context) this.f22322k, (C3471g) this.f22320i, this.f22319h, (InterfaceC1220a) this.f22323l, (InterfaceC1231l) this.f22321j, (InterfaceC1220a) this.f22324m, (C1836h0) obj, AbstractC1874r.m4617C(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9566i((InterfaceC4544a) this.f22322k, this.f22319h, (List) this.f22320i, (InterfaceC1220a) this.f22323l, (InterfaceC1231l) this.f22321j, (InterfaceC1220a) this.f22324m, (C1836h0) obj, AbstractC1874r.m4617C(196609));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5525z4(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, C2366j c2366j, C5229q3 c5229q3, boolean z9) {
        this.f22322k = c2366j;
        this.f22320i = c5229q3;
        this.f22321j = context;
        this.f22323l = interfaceC1809a1;
        this.f22319h = z9;
        this.f22324m = interfaceC1809a12;
    }

    public /* synthetic */ C5525z4(Context context, C3471g c3471g, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f22322k = context;
        this.f22320i = c3471g;
        this.f22319h = z9;
        this.f22323l = interfaceC1220a;
        this.f22321j = interfaceC1231l;
        this.f22324m = interfaceC1220a2;
    }

    public /* synthetic */ C5525z4(String str, String str2, String str3, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f22320i = str;
        this.f22321j = str2;
        this.f22322k = str3;
        this.f22319h = z9;
        this.f22323l = interfaceC1220a;
        this.f22324m = interfaceC1220a2;
    }

    public /* synthetic */ C5525z4(InterfaceC4544a interfaceC4544a, boolean z9, List list, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f22322k = interfaceC4544a;
        this.f22319h = z9;
        this.f22320i = list;
        this.f22323l = interfaceC1220a;
        this.f22321j = interfaceC1231l;
        this.f22324m = interfaceC1220a2;
    }

    public /* synthetic */ C5525z4(boolean z9, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a12, String str2) {
        this.f22319h = z9;
        this.f22322k = interfaceC1809a1;
        this.f22323l = sharedPreferences;
        this.f22320i = str;
        this.f22324m = interfaceC1809a12;
        this.f22321j = str2;
    }
}
