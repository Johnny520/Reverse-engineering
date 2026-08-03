package p332wb;

import android.content.SharedPreferences;
import bi.AbstractC0316d;
import bi.C0314b;
import gg.AbstractC1416l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p172lg.C2561a;
import p172lg.C2563c;
import p172lg.C2564d;
import p177m2.AbstractC2772p;
import p177m2.C2767k;
import p218og.AbstractC3149m;
import p218og.C3140d;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3256t;
import p259r9.AbstractC3754e0;
import p266s0.C3878h;
import p276sf.C3967n;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4008f1;
import sh.AbstractC4045s;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.n8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5135n8 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19131g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f19132h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19133i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19134j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5135n8(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f19131g = i9;
        this.f19132h = sharedPreferences;
        this.f19133i = interfaceC1809a1;
        this.f19134j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m9730e(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h0, 0);
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, c5850l);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            AbstractC4045s.m8250n("检测依据来自微信支付接口返回文案。支付风控或服务端文案变化可能产生检测失败，请先小范围验证结果。", null, ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24582, 0, 262122);
            SharedPreferences sharedPreferences = this.f19132h;
            boolean zM4538h = c1836h0.m4538h(sharedPreferences);
            Object objM4514P = c1836h0.m4514P();
            InterfaceC1809a1 interfaceC1809a1 = this.f19134j;
            C1823e c1823e = C1851l.f6155a;
            if (zM4538h || objM4514P == c1823e) {
                objM4514P = new C5037k9(sharedPreferences, this.f19133i, interfaceC1809a1, 0);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4045s.m8251o("确认启用", (InterfaceC1220a) objM4514P, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 390, 1912);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = new C5070l9(interfaceC1809a1, 0);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC4045s.m8251o("取消", (InterfaceC1220a) objM4514P2, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 438, 1912);
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        String strM6836i;
        boolean z9;
        String strM6836i2;
        boolean z10;
        String strM6836i3;
        boolean z11;
        switch (this.f19131g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f19133i;
                    String strM6836i4 = AbstractC3199a.m6836i(((Number) interfaceC1809a12.getValue()).intValue(), " 点");
                    C2564d c2564d = new C2564d(1, 6, 1);
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c2564d));
                    Iterator it = c2564d.iterator();
                    while (true) {
                        C2563c c2563c = (C2563c) it;
                        if (c2563c.f8317i) {
                            int iIntValue2 = ((Number) c2563c.next()).intValue();
                            arrayList.add(new C4759bp(AbstractC3199a.m6836i(iIntValue2, " 点"), iIntValue2, HttpUrl.FRAGMENT_ENCODE_SET));
                        } else {
                            int iIntValue3 = ((Number) interfaceC1809a12.getValue()).intValue();
                            SharedPreferences sharedPreferences = this.f19132h;
                            boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                            Object objM4514P = c1836h0.m4514P();
                            C1823e c1823e = C1851l.f6155a;
                            if (zM4538h || objM4514P == c1823e) {
                                objM4514P = new C5435wb(sharedPreferences, interfaceC1809a12, 26);
                                c1836h0.m4545k0(objM4514P);
                            }
                            AbstractC4955ho.m9361J2("骰子点数", strM6836i4, arrayList, iIntValue3, (InterfaceC1231l) objM4514P, false, c1836h0, 6);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            InterfaceC1809a1 interfaceC1809a13 = this.f19134j;
                            int iIntValue4 = ((Number) interfaceC1809a13.getValue()).intValue();
                            String str = iIntValue4 != 2 ? iIntValue4 != 3 ? "剪刀" : "布" : "石头";
                            List listM101y0 = AbstractC0000a.m101y0(new C4759bp("剪刀", 1, HttpUrl.FRAGMENT_ENCODE_SET), new C4759bp("石头", 2, HttpUrl.FRAGMENT_ENCODE_SET), new C4759bp("布", 3, HttpUrl.FRAGMENT_ENCODE_SET));
                            int iIntValue5 = ((Number) interfaceC1809a13.getValue()).intValue();
                            boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                            Object objM4514P2 = c1836h0.m4514P();
                            if (zM4538h2 || objM4514P2 == c1823e) {
                                objM4514P2 = new C5435wb(sharedPreferences, interfaceC1809a13, 27);
                                c1836h0.m4545k0(objM4514P2);
                            }
                            AbstractC4955ho.m9361J2("猜拳结果", str, listM101y0, iIntValue5, (InterfaceC1231l) objM4514P2, false, c1836h0, 6);
                        }
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a14 = this.f19133i;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    SharedPreferences sharedPreferences2 = this.f19132h;
                    boolean zM4538h3 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P3 = c1836h02.m4514P();
                    InterfaceC1809a1 interfaceC1809a15 = this.f19134j;
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h3 || objM4514P3 == c1823e2) {
                        objM4514P3 = new C4746bc(sharedPreferences2, interfaceC1809a14, interfaceC1809a15, 1);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "使用固定结果", "直接发送下方设置的骰子点数或猜拳结果", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                    boolean zM4538h4 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4538h4 || objM4514P4 == c1823e2) {
                        objM4514P4 = new C4746bc(sharedPreferences2, interfaceC1809a15, interfaceC1809a14, 2);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "发送时选择", "每次发送骰子或猜拳前弹出结果选择", false, (InterfaceC1231l) objM4514P4, c1836h02, 432, 8);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a16 = this.f19133i;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                    SharedPreferences sharedPreferences3 = this.f19132h;
                    boolean zM4538h5 = c1836h03.m4538h(sharedPreferences3);
                    Object objM4514P5 = c1836h03.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h5 || objM4514P5 == c1823e3) {
                        objM4514P5 = new C5435wb(sharedPreferences3, interfaceC1809a16, 14);
                        c1836h03.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "朋友圈关键词屏蔽", "隐藏正文命中任意关键词的朋友圈", false, (InterfaceC1231l) objM4514P5, c1836h03, 432, 8);
                    if (((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                        c1836h03.m4525a0(421439180);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a17 = this.f19134j;
                        String str2 = (String) interfaceC1809a17.getValue();
                        boolean zM4538h6 = c1836h03.m4538h(sharedPreferences3);
                        Object objM4514P6 = c1836h03.m4514P();
                        if (zM4538h6 || objM4514P6 == c1823e3) {
                            objM4514P6 = new C5435wb(sharedPreferences3, interfaceC1809a17, 15);
                            c1836h03.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9304C1("屏蔽关键词", "多个关键词用逗号或换行分隔", str2, 3, (InterfaceC1231l) objM4514P6, c1836h03, 3126, 0);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(421901421);
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a18 = this.f19133i;
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    SharedPreferences sharedPreferences4 = this.f19132h;
                    boolean zM4538h7 = c1836h04.m4538h(sharedPreferences4);
                    Object objM4514P7 = c1836h04.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h7 || objM4514P7 == c1823e4) {
                        objM4514P7 = new C5435wb(sharedPreferences4, interfaceC1809a18, 18);
                        c1836h04.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "伪造语音时长", "发送语音时使用自定义显示时长", false, (InterfaceC1231l) objM4514P7, c1836h04, 432, 8);
                    if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                        c1836h04.m4525a0(761803436);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        InterfaceC1809a1 interfaceC1809a19 = this.f19134j;
                        String str3 = (String) interfaceC1809a19.getValue();
                        boolean zM4538h8 = c1836h04.m4538h(sharedPreferences4);
                        Object objM4514P8 = c1836h04.m4514P();
                        if (zM4538h8 || objM4514P8 == c1823e4) {
                            objM4514P8 = new C5435wb(sharedPreferences4, interfaceC1809a19, 19);
                            c1836h04.m4545k0(objM4514P8);
                        }
                        AbstractC4955ho.m9695w2("显示时长", "单位秒，1-60", str3, (InterfaceC1231l) objM4514P8, c1836h04, 54);
                        c1836h04.m4553p(false);
                    } else {
                        c1836h04.m4525a0(762751943);
                        c1836h04.m4553p(false);
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a110 = this.f19133i;
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                    SharedPreferences sharedPreferences5 = this.f19132h;
                    boolean zM4538h9 = c1836h05.m4538h(sharedPreferences5);
                    Object objM4514P9 = c1836h05.m4514P();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zM4538h9 || objM4514P9 == c1823e5) {
                        objM4514P9 = new C5435wb(sharedPreferences5, interfaceC1809a110, 21);
                        c1836h05.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "启用消息气泡", "使用本地图片替换微信原生消息气泡", false, (InterfaceC1231l) objM4514P9, c1836h05, 432, 8);
                    if (((Boolean) interfaceC1809a110.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-1041512979);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a111 = this.f19134j;
                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                        boolean zM4538h10 = c1836h05.m4538h(sharedPreferences5);
                        Object objM4514P10 = c1836h05.m4514P();
                        if (zM4538h10 || objM4514P10 == c1823e5) {
                            objM4514P10 = new C5435wb(sharedPreferences5, interfaceC1809a111, 22);
                            c1836h05.m4545k0(objM4514P10);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue6, "深色模式单独设置", "未设置深色气泡时自动沿用对应浅色气泡", false, (InterfaceC1231l) objM4514P10, c1836h05, 432, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-1040932535);
                        c1836h05.m4553p(false);
                    }
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a112 = this.f19133i;
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                    SharedPreferences sharedPreferences6 = this.f19132h;
                    boolean zM4538h11 = c1836h06.m4538h(sharedPreferences6);
                    Object objM4514P11 = c1836h06.m4514P();
                    C1823e c1823e6 = C1851l.f6155a;
                    if (zM4538h11 || objM4514P11 == c1823e6) {
                        objM4514P11 = new C5435wb(sharedPreferences6, interfaceC1809a112, 13);
                        c1836h06.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue7, "启用圆角头像", "统一应用到微信界面和通知头像", false, (InterfaceC1231l) objM4514P11, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a112.getValue()).booleanValue()) {
                        c1836h06.m4525a0(-840566175);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        C5850l c5850l = C5850l.f23787a;
                        InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC3222h1.m6901d(c5850l, 1.0f), 16, 14);
                        C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h06, 0);
                        int iHashCode = Long.hashCode(c1836h06.f6095T);
                        C3878h c3878hM4546l = c1836h06.m4546l();
                        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h06, interfaceC5853oM6883m);
                        InterfaceC5605g.f22815f.getClass();
                        C5660y c5660y = C5601f.f22758b;
                        c1836h06.m4531d0();
                        if (c1836h06.f6094S) {
                            c1836h06.m4544k(c5660y);
                        } else {
                            c1836h06.m4551n0();
                        }
                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h06, c3256tM6935a);
                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h06, c3878hM4546l);
                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h06, Integer.valueOf(iHashCode));
                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h06);
                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h06, interfaceC5853oM10543c);
                        InterfaceC1809a1 interfaceC1809a113 = this.f19134j;
                        AbstractC4045s.m8250n(AbstractC0921a.m2250m(AbstractC2043a.m5018X((AbstractC2043a.m5018X(AbstractC3754e0.m7907q(((Number) interfaceC1809a113.getValue()).floatValue(), 0.1f, 0.5f) * 100.0f) / 100.0f) * 100.0f), "圆角弧度 ", "%"), null, ((C0314b) c1836h06.m4542j(AbstractC0316d.f944a)).m1237g(), 0L, C2767k.f9000j, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h06, 1572864, 0, 262074);
                        float fFloatValue = ((Number) interfaceC1809a113.getValue()).floatValue();
                        Object objM4514P12 = c1836h06.m4514P();
                        if (objM4514P12 == c1823e6) {
                            interfaceC1809a1 = interfaceC1809a113;
                            objM4514P12 = new C4944hd(interfaceC1809a1, 18);
                            c1836h06.m4545k0(objM4514P12);
                        } else {
                            interfaceC1809a1 = interfaceC1809a113;
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P12;
                        InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
                        C2561a c2561a = new C2561a(0.1f, 0.5f);
                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences6);
                        Object objM4514P13 = c1836h06.m4514P();
                        if (zM4538h12 || objM4514P13 == c1823e6) {
                            objM4514P13 = new C5173od(sharedPreferences6, interfaceC1809a1, 0);
                            c1836h06.m4545k0(objM4514P13);
                        }
                        AbstractC4008f1.m8230a(fFloatValue, interfaceC1231l, interfaceC5853oM6886p, false, c2561a, 39, (InterfaceC1220a) objM4514P13, 0.0f, null, null, true, AbstractC0000a.m101y0(Float.valueOf(0.1f), Float.valueOf(0.2f), Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)), 0.0f, c1836h06, 197040, 10120);
                        c1836h06.m4553p(true);
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(-838970915);
                        c1836h06.m4553p(false);
                    }
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a114 = this.f19133i;
                    String str4 = (String) interfaceC1809a114.getValue();
                    String str5 = AbstractC1416l.m3825a(str4, "custom") ? "使用自定义时间格式" : AbstractC1416l.m3825a(str4, "hidden") ? "隐藏微信原生聊天时间" : "保持微信原样";
                    List listM101y02 = AbstractC0000a.m101y0(new C4825dq("original", "微信原样"), new C4825dq("custom", "自定义"), new C4825dq("hidden", "隐藏"));
                    String str6 = (String) interfaceC1809a114.getValue();
                    SharedPreferences sharedPreferences7 = this.f19132h;
                    boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                    Object objM4514P14 = c1836h07.m4514P();
                    C1823e c1823e7 = C1851l.f6155a;
                    if (zM4538h13 || objM4514P14 == c1823e7) {
                        objM4514P14 = new C5435wb(sharedPreferences7, interfaceC1809a114, 3);
                        c1836h07.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9353I2("显示方式", str5, listM101y02, str6, (InterfaceC1231l) objM4514P14, false, c1836h07, 6, 32);
                    if (AbstractC1416l.m3825a((String) interfaceC1809a114.getValue(), "custom")) {
                        c1836h07.m4525a0(110549503);
                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                        InterfaceC1809a1 interfaceC1809a115 = this.f19134j;
                        String str7 = (String) interfaceC1809a115.getValue();
                        boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                        Object objM4514P15 = c1836h07.m4514P();
                        if (zM4538h14 || objM4514P15 == c1823e7) {
                            objM4514P15 = new C5435wb(sharedPreferences7, interfaceC1809a115, 4);
                            c1836h07.m4545k0(objM4514P15);
                        }
                        AbstractC4955ho.m9304C1("时间格式", "例如 yyyy-MM-dd HH:mm:ss", str7, 0, (InterfaceC1231l) objM4514P15, c1836h07, 54, 8);
                        c1836h07.m4553p(false);
                    } else {
                        c1836h07.m4525a0(111105922);
                        c1836h07.m4553p(false);
                    }
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a116 = this.f19133i;
                    long jLongValue = ((Number) interfaceC1809a116.getValue()).longValue();
                    InterfaceC1809a1 interfaceC1809a117 = this.f19134j;
                    String strM9264h = jLongValue <= 0 ? "尚未执行" : AbstractC4855en.m9264h(new SimpleDateFormat("MM-dd HH:mm:ss", Locale.CHINA).format(new Date(((Number) interfaceC1809a116.getValue()).longValue())), " · ", (String) interfaceC1809a117.getValue());
                    SharedPreferences sharedPreferences8 = this.f19132h;
                    boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                    Object objM4514P16 = c1836h08.m4514P();
                    if (zM4538h15 || objM4514P16 == C1851l.f6155a) {
                        objM4514P16 = new C5037k9(sharedPreferences8, interfaceC1809a116, interfaceC1809a117, 1);
                        c1836h08.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9503b("刷新状态", strM9264h, (InterfaceC1220a) objM4514P16, c1836h08, 6);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a118 = this.f19133i;
                    boolean zBooleanValue8 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                    SharedPreferences sharedPreferences9 = this.f19132h;
                    boolean zM4538h16 = c1836h09.m4538h(sharedPreferences9);
                    Object objM4514P17 = c1836h09.m4514P();
                    C1823e c1823e8 = C1851l.f6155a;
                    if (zM4538h16 || objM4514P17 == c1823e8) {
                        objM4514P17 = new C5108me(sharedPreferences9, interfaceC1809a118, 16);
                        c1836h09.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue8, "自动发送祝福语", "抢到红包后发送祝福语", false, (InterfaceC1231l) objM4514P17, c1836h09, 432, 8);
                    if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                        c1836h09.m4525a0(-418355906);
                        AbstractC4955ho.m9312D1(0.0f, c1836h09, 0, 1);
                        InterfaceC1809a1 interfaceC1809a119 = this.f19134j;
                        String str8 = (String) interfaceC1809a119.getValue();
                        Object objM4514P18 = c1836h09.m4514P();
                        if (objM4514P18 == c1823e8) {
                            objM4514P18 = new C5109mf(interfaceC1809a119, 24);
                            c1836h09.m4545k0(objM4514P18);
                        }
                        AbstractC4955ho.m9304C1("祝福语内容", "抢到红包后发送的文字", str8, 0, (InterfaceC1231l) objM4514P18, c1836h09, 24630, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h09, 0, 1);
                        AbstractC4955ho.m9402O3(sharedPreferences9, "hb_wish_random", "随机祝福语", "从模板中随机选择", false, c1836h09, 28080);
                        c1836h09.m4553p(false);
                    } else {
                        c1836h09.m4525a0(-418081060);
                        c1836h09.m4553p(false);
                    }
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a120 = this.f19133i;
                    boolean zBooleanValue9 = ((Boolean) interfaceC1809a120.getValue()).booleanValue();
                    SharedPreferences sharedPreferences10 = this.f19132h;
                    boolean zM4538h17 = c1836h010.m4538h(sharedPreferences10);
                    Object objM4514P19 = c1836h010.m4514P();
                    C1823e c1823e9 = C1851l.f6155a;
                    if (zM4538h17 || objM4514P19 == c1823e9) {
                        objM4514P19 = new C5441wh(sharedPreferences10, interfaceC1809a120, 2);
                        c1836h010.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue9, "记录运行日志", "只保留最近 200 条", false, (InterfaceC1231l) objM4514P19, c1836h010, 432, 8);
                    if (((Boolean) interfaceC1809a120.getValue()).booleanValue()) {
                        c1836h010.m4525a0(1643313531);
                        AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                        InterfaceC1809a1 interfaceC1809a121 = this.f19134j;
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a121.getValue())) {
                            strM6836i = "暂无记录";
                        } else {
                            String str9 = (String) interfaceC1809a121.getValue();
                            str9.getClass();
                            C3140d c3140d = new C3140d(str9);
                            int i9 = 0;
                            while (c3140d.hasNext()) {
                                c3140d.next();
                                i9++;
                                if (i9 < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                            strM6836i = AbstractC3199a.m6836i(i9, " 条记录");
                        }
                        boolean zM4538h18 = c1836h010.m4538h(sharedPreferences10);
                        Object objM4514P20 = c1836h010.m4514P();
                        if (zM4538h18 || objM4514P20 == c1823e9) {
                            objM4514P20 = new C5173od(sharedPreferences10, interfaceC1809a121, 2);
                            c1836h010.m4545k0(objM4514P20);
                        }
                        AbstractC4955ho.m9503b("刷新日志", strM6836i, (InterfaceC1220a) objM4514P20, c1836h010, 6);
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a121.getValue())) {
                            z9 = false;
                            c1836h010.m4525a0(1644414992);
                            c1836h010.m4553p(false);
                        } else {
                            c1836h010.m4525a0(1643643309);
                            AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                            AbstractC4045s.m8250n(AbstractC3149m.m6701P0(5000, (String) interfaceC1809a121.getValue()), AbstractC3208d.m6882l(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 16), ((C0314b) c1836h010.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, AbstractC2772p.f9007b, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h010, 24624, 0, 261992);
                            c1836h010 = c1836h010;
                            z9 = false;
                            AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                            boolean zM4538h19 = c1836h010.m4538h(sharedPreferences10);
                            Object objM4514P21 = c1836h010.m4514P();
                            if (zM4538h19 || objM4514P21 == c1823e9) {
                                objM4514P21 = new C5173od(sharedPreferences10, interfaceC1809a121, 3);
                                c1836h010.m4545k0(objM4514P21);
                            }
                            AbstractC4955ho.m9503b("清空日志", "删除当前自动点赞运行记录", (InterfaceC1220a) objM4514P21, c1836h010, 54);
                            c1836h010.m4553p(false);
                        }
                        c1836h010.m4553p(z9);
                    } else {
                        c1836h010.m4525a0(1644440784);
                        c1836h010.m4553p(false);
                    }
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a122 = this.f19133i;
                    boolean zBooleanValue10 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                    SharedPreferences sharedPreferences11 = this.f19132h;
                    boolean zM4538h20 = c1836h011.m4538h(sharedPreferences11);
                    Object objM4514P22 = c1836h011.m4514P();
                    C1823e c1823e10 = C1851l.f6155a;
                    if (zM4538h20 || objM4514P22 == c1823e10) {
                        objM4514P22 = new C5441wh(sharedPreferences11, interfaceC1809a122, 6);
                        c1836h011.m4545k0(objM4514P22);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue10, "记录运行日志", "记录自动转发执行情况", false, (InterfaceC1231l) objM4514P22, c1836h011, 432, 8);
                    if (((Boolean) interfaceC1809a122.getValue()).booleanValue()) {
                        c1836h011.m4525a0(-1491931932);
                        AbstractC4955ho.m9312D1(0.0f, c1836h011, 0, 1);
                        InterfaceC1809a1 interfaceC1809a123 = this.f19134j;
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a123.getValue())) {
                            strM6836i2 = "暂无记录";
                        } else {
                            String str10 = (String) interfaceC1809a123.getValue();
                            str10.getClass();
                            C3140d c3140d2 = new C3140d(str10);
                            int i10 = 0;
                            while (c3140d2.hasNext()) {
                                c3140d2.next();
                                i10++;
                                if (i10 < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                            strM6836i2 = AbstractC3199a.m6836i(i10, " 条记录");
                        }
                        boolean zM4538h21 = c1836h011.m4538h(sharedPreferences11);
                        Object objM4514P23 = c1836h011.m4514P();
                        if (zM4538h21 || objM4514P23 == c1823e10) {
                            objM4514P23 = new C5173od(sharedPreferences11, interfaceC1809a123, 4);
                            c1836h011.m4545k0(objM4514P23);
                        }
                        AbstractC4955ho.m9503b("刷新日志", strM6836i2, (InterfaceC1220a) objM4514P23, c1836h011, 6);
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a123.getValue())) {
                            z10 = false;
                            c1836h011.m4525a0(-1490596948);
                            c1836h011.m4553p(false);
                        } else {
                            c1836h011.m4525a0(-1491371514);
                            AbstractC4955ho.m9312D1(0.0f, c1836h011, 0, 1);
                            AbstractC4045s.m8250n(AbstractC3149m.m6701P0(5000, (String) interfaceC1809a123.getValue()), AbstractC3208d.m6882l(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 16), ((C0314b) c1836h011.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, AbstractC2772p.f9007b, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h011, 24624, 0, 261992);
                            c1836h011 = c1836h011;
                            z10 = false;
                            AbstractC4955ho.m9312D1(0.0f, c1836h011, 0, 1);
                            boolean zM4538h22 = c1836h011.m4538h(sharedPreferences11);
                            Object objM4514P24 = c1836h011.m4514P();
                            if (zM4538h22 || objM4514P24 == c1823e10) {
                                objM4514P24 = new C5173od(sharedPreferences11, interfaceC1809a123, 5);
                                c1836h011.m4545k0(objM4514P24);
                            }
                            AbstractC4955ho.m9503b("清空日志", "删除当前自动转发运行记录", (InterfaceC1220a) objM4514P24, c1836h011, 54);
                            c1836h011.m4553p(false);
                        }
                        c1836h011.m4553p(z10);
                    } else {
                        c1836h011.m4525a0(-1490571156);
                        c1836h011.m4553p(false);
                    }
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a124 = this.f19133i;
                    boolean zBooleanValue11 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                    SharedPreferences sharedPreferences12 = this.f19132h;
                    boolean zM4538h23 = c1836h012.m4538h(sharedPreferences12);
                    Object objM4514P25 = c1836h012.m4514P();
                    C1823e c1823e11 = C1851l.f6155a;
                    if (zM4538h23 || objM4514P25 == c1823e11) {
                        objM4514P25 = new C4818di(sharedPreferences12, interfaceC1809a124, 5);
                        c1836h012.m4545k0(objM4514P25);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue11, "朋友圈自动点赞", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P25, c1836h012, 432, 8);
                    if (((Boolean) interfaceC1809a124.getValue()).booleanValue()) {
                        c1836h012.m4525a0(1823974877);
                        AbstractC4955ho.m9312D1(0.0f, c1836h012, 0, 1);
                        InterfaceC1809a1 interfaceC1809a125 = this.f19134j;
                        boolean zBooleanValue12 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                        boolean zM4538h24 = c1836h012.m4538h(sharedPreferences12);
                        Object objM4514P26 = c1836h012.m4514P();
                        if (zM4538h24 || objM4514P26 == c1823e11) {
                            objM4514P26 = new C4818di(sharedPreferences12, interfaceC1809a125, 6);
                            c1836h012.m4545k0(objM4514P26);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue12, "点赞自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P26, c1836h012, 432, 8);
                        c1836h012.m4553p(false);
                    } else {
                        c1836h012.m4525a0(1824268943);
                        c1836h012.m4553p(false);
                    }
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                return m9730e(obj, obj2);
            default:
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a126 = this.f19133i;
                    boolean zBooleanValue13 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                    SharedPreferences sharedPreferences13 = this.f19132h;
                    boolean zM4538h25 = c1836h013.m4538h(sharedPreferences13);
                    Object objM4514P27 = c1836h013.m4514P();
                    C1823e c1823e12 = C1851l.f6155a;
                    if (zM4538h25 || objM4514P27 == c1823e12) {
                        objM4514P27 = new C5019jo(sharedPreferences13, interfaceC1809a126, 9);
                        c1836h013.m4545k0(objM4514P27);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue13, "记录运行日志", "只保留最近 200 条", false, (InterfaceC1231l) objM4514P27, c1836h013, 432, 8);
                    if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                        c1836h013.m4525a0(-1537986704);
                        AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                        InterfaceC1809a1 interfaceC1809a127 = this.f19134j;
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue())) {
                            strM6836i3 = "暂无记录";
                        } else {
                            String str11 = (String) interfaceC1809a127.getValue();
                            str11.getClass();
                            C3140d c3140d3 = new C3140d(str11);
                            int i11 = 0;
                            while (c3140d3.hasNext()) {
                                c3140d3.next();
                                i11++;
                                if (i11 < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                            strM6836i3 = AbstractC3199a.m6836i(i11, " 条记录");
                        }
                        boolean zM4538h26 = c1836h013.m4538h(sharedPreferences13);
                        Object objM4514P28 = c1836h013.m4514P();
                        if (zM4538h26 || objM4514P28 == c1823e12) {
                            objM4514P28 = new C5173od(sharedPreferences13, interfaceC1809a127, 7);
                            c1836h013.m4545k0(objM4514P28);
                        }
                        AbstractC4955ho.m9503b("刷新日志", strM6836i3, (InterfaceC1220a) objM4514P28, c1836h013, 6);
                        if (AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue())) {
                            z11 = false;
                            c1836h013.m4525a0(-1536879477);
                            c1836h013.m4553p(false);
                        } else {
                            c1836h013.m4525a0(-1537654043);
                            AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                            AbstractC4045s.m8250n(AbstractC3149m.m6701P0(5000, (String) interfaceC1809a127.getValue()), AbstractC3208d.m6882l(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 16), ((C0314b) c1836h013.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, AbstractC2772p.f9007b, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h013, 24624, 0, 261992);
                            c1836h013 = c1836h013;
                            z11 = false;
                            AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                            boolean zM4538h27 = c1836h013.m4538h(sharedPreferences13);
                            Object objM4514P29 = c1836h013.m4514P();
                            if (zM4538h27 || objM4514P29 == c1823e12) {
                                objM4514P29 = new C5173od(sharedPreferences13, interfaceC1809a127, 8);
                                c1836h013.m4545k0(objM4514P29);
                            }
                            AbstractC4955ho.m9503b("清空日志", "删除当前自动评论运行记录", (InterfaceC1220a) objM4514P29, c1836h013, 54);
                            c1836h013.m4553p(false);
                        }
                        c1836h013.m4553p(z11);
                    } else {
                        c1836h013.m4525a0(-1536853685);
                        c1836h013.m4553p(false);
                    }
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
