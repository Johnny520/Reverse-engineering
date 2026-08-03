package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import be.AbstractC0283h;
import bi.AbstractC0316d;
import bi.C0314b;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p015b0.C0144j;
import p015b0.C0145k;
import p015b0.C0146l;
import p015b0.C0151q;
import p015b0.C0153s;
import p028c1.AbstractC0378h;
import p040d0.C0646c;
import p057e1.C0807b;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p072f2.AbstractC1052o;
import p072f2.C1039b;
import p078f9.C1092c;
import p078f9.C1094e;
import p078f9.C1095f;
import p078f9.C1096g;
import p078f9.C1097h;
import p080fb.C1113d1;
import p080fb.C1165q1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p126ia.C2020n;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p144k.C2209s1;
import p153k8.C2355s;
import p197n9.C2912a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3241o;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p259r9.C3766p;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p267s1.C3914t;
import p269s3.AbstractC3924b;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p293u2.InterfaceC4233c;
import p300ub.AbstractC4302b;
import p306v.C4359d;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4412n0;
import p315v8.C4521a;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4955ho;
import p332wb.C4770c3;
import p332wb.C4804d4;
import p332wb.C4969i5;
import p332wb.C4980ih;
import p332wb.C5012jh;
import p332wb.C5020jp;
import p332wb.C5034k6;
import p332wb.C5070l9;
import p332wb.C5086lp;
import p332wb.C5113mj;
import p332wb.C5132n5;
import p332wb.C5134n7;
import p332wb.C5172oc;
import p332wb.C5177oh;
import p332wb.C5235q9;
import p332wb.C5278rj;
import p332wb.C5292s0;
import p332wb.C5402vb;
import p332wb.C5491y2;
import p332wb.C5538zh;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p345x8.C5709b;
import p345x8.C5728u;
import p346x9.C5739f;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;
import sh.C4006f;
import sh.C4056v1;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: c9.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0479q0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1417g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1418h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1419i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1420j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1421k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0479q0(C1094e c1094e, C1097h c1097h, C1092c c1092c, Activity activity) {
        this.f1417g = 2;
        this.f1419i = c1094e;
        this.f1418h = c1097h;
        this.f1421k = c1092c;
        this.f1420j = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m1498e(Object obj, Object obj2) {
        String str = (String) this.f1419i;
        C4969i5 c4969i5 = (C4969i5) this.f1420j;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1418h;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1421k;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strM9600l6 = AbstractC4955ho.m9600l6(c4969i5.f17772b);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = new C2209s1(25);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9704x3(str, strM9600l6, (InterfaceC1220a) objM4514P, c1836h0, 384);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4534f || objM4514P2 == c1823e) {
                objM4514P2 = new C5177oh(interfaceC1809a1, 0);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC4955ho.m9410P3(zBooleanValue, "启用名单", "关闭后该名单不参与屏蔽消息匹配", false, (InterfaceC1231l) objM4514P2, c1836h0, 432, 8);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            boolean zM3825a = AbstractC1416l.m3825a((String) interfaceC1809a12.getValue(), "exclude");
            boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a12);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P3 == c1823e) {
                objM4514P3 = new C5177oh(interfaceC1809a12, 1);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC4955ho.m9410P3(zM3825a, "排除名单", "开启后命中该名单时跳过屏蔽；关闭时按下方模板屏蔽", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m1499f(Object obj, Object obj2) {
        C1823e c1823e;
        boolean zM4534f;
        Object objM4514P;
        boolean zM4534f2;
        Object objM4514P2;
        final C5709b c5709b = (C5709b) this.f1419i;
        final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1420j;
        final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1418h;
        final InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1421k;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i9 = c5709b.f23205g;
            Set set = c5709b.f23207i;
            Set set2 = c5709b.f23206h;
            String strM9443T4 = AbstractC4955ho.m9443T4(i9);
            List listM9451U4 = AbstractC4955ho.m9451U4();
            int i10 = c5709b.f23205g;
            boolean zM4534f3 = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c5709b);
            Object objM4514P3 = c1836h0.m4514P();
            C1823e c1823e2 = C1851l.f6155a;
            if (zM4534f3 || objM4514P3 == c1823e2) {
                objM4514P3 = new C5113mj(5, interfaceC1231l, c5709b);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC4955ho.m9361J2("生效范围", strM9443T4, listM9451U4, i10, (InterfaceC1231l) objM4514P3, false, c1836h0, 6);
            if (c5709b.f23205g == 3) {
                c1836h0.m4525a0(182267203);
                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                Set set3 = set2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : set3) {
                    if (!AbstractC4955ho.m9492Z5((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                String strM9403O4 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(arrayList));
                boolean zM4534f4 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                Object objM4514P4 = c1836h0.m4514P();
                if (zM4534f4) {
                    c1823e = c1823e2;
                } else {
                    c1823e = c1823e2;
                    if (objM4514P4 == c1823e) {
                    }
                    AbstractC4955ho.m9503b("选择指定好友", strM9403O4, (InterfaceC1220a) objM4514P4, c1836h0, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : set3) {
                        if (AbstractC4955ho.m9492Z5((String) obj4)) {
                            arrayList2.add(obj4);
                        }
                    }
                    String strM9403O42 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(arrayList2));
                    zM4534f = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                    objM4514P = c1836h0.m4514P();
                    if (!zM4534f || objM4514P == c1823e) {
                        final int i11 = 1;
                        objM4514P = new InterfaceC1220a() { // from class: wb.nj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        C5709b c5709b2 = c5709b;
                                        Set set4 = c5709b2.f23206h;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj5 : set4) {
                                            if (!AbstractC4955ho.m9492Z5((String) obj5)) {
                                                arrayList3.add(obj5);
                                            }
                                        }
                                        interfaceC1231l2.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList3), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                        break;
                                    case 1:
                                        C5709b c5709b3 = c5709b;
                                        Set set5 = c5709b3.f23206h;
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj6 : set5) {
                                            if (AbstractC4955ho.m9492Z5((String) obj6)) {
                                                arrayList4.add(obj6);
                                            }
                                        }
                                        interfaceC1231l2.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList4), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                        break;
                                    case 2:
                                        C5709b c5709b4 = c5709b;
                                        interfaceC1231l2.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                        break;
                                    case 3:
                                        C5709b c5709b5 = c5709b;
                                        Set set6 = c5709b5.f23207i;
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj7 : set6) {
                                            if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                                arrayList5.add(obj7);
                                            }
                                        }
                                        interfaceC1231l2.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                        break;
                                    case 4:
                                        C5709b c5709b6 = c5709b;
                                        Set set7 = c5709b6.f23207i;
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj8 : set7) {
                                            if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                                arrayList6.add(obj8);
                                            }
                                        }
                                        interfaceC1231l2.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                        break;
                                    default:
                                        C5709b c5709b7 = c5709b;
                                        interfaceC1231l2.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("选择指定群聊", strM9403O42, (InterfaceC1220a) objM4514P, c1836h0, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String strM9403O43 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(c5709b.f23208j));
                    zM4534f2 = c1836h0.m4534f(interfaceC1231l3) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                    objM4514P2 = c1836h0.m4514P();
                    if (!zM4534f2 || objM4514P2 == c1823e) {
                        final int i12 = 2;
                        objM4514P2 = new InterfaceC1220a() { // from class: wb.nj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        C5709b c5709b2 = c5709b;
                                        Set set4 = c5709b2.f23206h;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj5 : set4) {
                                            if (!AbstractC4955ho.m9492Z5((String) obj5)) {
                                                arrayList3.add(obj5);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList3), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                        break;
                                    case 1:
                                        C5709b c5709b3 = c5709b;
                                        Set set5 = c5709b3.f23206h;
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj6 : set5) {
                                            if (AbstractC4955ho.m9492Z5((String) obj6)) {
                                                arrayList4.add(obj6);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList4), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                        break;
                                    case 2:
                                        C5709b c5709b4 = c5709b;
                                        interfaceC1231l3.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                        break;
                                    case 3:
                                        C5709b c5709b5 = c5709b;
                                        Set set6 = c5709b5.f23207i;
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj7 : set6) {
                                            if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                                arrayList5.add(obj7);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                        break;
                                    case 4:
                                        C5709b c5709b6 = c5709b;
                                        Set set7 = c5709b6.f23207i;
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj8 : set7) {
                                            if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                                arrayList6.add(obj8);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                        break;
                                    default:
                                        C5709b c5709b7 = c5709b;
                                        interfaceC1231l3.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("选择指定群成员", strM9403O43, (InterfaceC1220a) objM4514P2, c1836h0, 6);
                    c1836h0.m4553p(false);
                }
                final int i13 = 0;
                objM4514P4 = new InterfaceC1220a() { // from class: wb.nj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1220a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                C5709b c5709b2 = c5709b;
                                Set set4 = c5709b2.f23206h;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj5 : set4) {
                                    if (!AbstractC4955ho.m9492Z5((String) obj5)) {
                                        arrayList3.add(obj5);
                                    }
                                }
                                interfaceC1231l2.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList3), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                break;
                            case 1:
                                C5709b c5709b3 = c5709b;
                                Set set5 = c5709b3.f23206h;
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj6 : set5) {
                                    if (AbstractC4955ho.m9492Z5((String) obj6)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                interfaceC1231l2.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList4), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                break;
                            case 2:
                                C5709b c5709b4 = c5709b;
                                interfaceC1231l2.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                break;
                            case 3:
                                C5709b c5709b5 = c5709b;
                                Set set6 = c5709b5.f23207i;
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj7 : set6) {
                                    if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                        arrayList5.add(obj7);
                                    }
                                }
                                interfaceC1231l2.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                break;
                            case 4:
                                C5709b c5709b6 = c5709b;
                                Set set7 = c5709b6.f23207i;
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj8 : set7) {
                                    if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                        arrayList6.add(obj8);
                                    }
                                }
                                interfaceC1231l2.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                break;
                            default:
                                C5709b c5709b7 = c5709b;
                                interfaceC1231l2.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                break;
                        }
                        return C3967n.f12976a;
                    }
                };
                c1836h0.m4545k0(objM4514P4);
                AbstractC4955ho.m9503b("选择指定好友", strM9403O4, (InterfaceC1220a) objM4514P4, c1836h0, 6);
                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                ArrayList arrayList22 = new ArrayList();
                while (r5.hasNext()) {
                }
                String strM9403O422 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(arrayList22));
                zM4534f = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                objM4514P = c1836h0.m4514P();
                if (!zM4534f) {
                    final int i112 = 1;
                    objM4514P = new InterfaceC1220a() { // from class: wb.nj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            switch (i112) {
                                case 0:
                                    C5709b c5709b2 = c5709b;
                                    Set set4 = c5709b2.f23206h;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj5 : set4) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj5)) {
                                            arrayList3.add(obj5);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList3), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                    break;
                                case 1:
                                    C5709b c5709b3 = c5709b;
                                    Set set5 = c5709b3.f23206h;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj6 : set5) {
                                        if (AbstractC4955ho.m9492Z5((String) obj6)) {
                                            arrayList4.add(obj6);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList4), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                    break;
                                case 2:
                                    C5709b c5709b4 = c5709b;
                                    interfaceC1231l2.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                    break;
                                case 3:
                                    C5709b c5709b5 = c5709b;
                                    Set set6 = c5709b5.f23207i;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj7 : set6) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                            arrayList5.add(obj7);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                    break;
                                case 4:
                                    C5709b c5709b6 = c5709b;
                                    Set set7 = c5709b6.f23207i;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj8 : set7) {
                                        if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                            arrayList6.add(obj8);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                    break;
                                default:
                                    C5709b c5709b7 = c5709b;
                                    interfaceC1231l2.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    c1836h0.m4545k0(objM4514P);
                    AbstractC4955ho.m9503b("选择指定群聊", strM9403O422, (InterfaceC1220a) objM4514P, c1836h0, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String strM9403O432 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(c5709b.f23208j));
                    zM4534f2 = c1836h0.m4534f(interfaceC1231l3) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                    objM4514P2 = c1836h0.m4514P();
                    if (!zM4534f2) {
                        final int i122 = 2;
                        objM4514P2 = new InterfaceC1220a() { // from class: wb.nj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i122) {
                                    case 0:
                                        C5709b c5709b2 = c5709b;
                                        Set set4 = c5709b2.f23206h;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj5 : set4) {
                                            if (!AbstractC4955ho.m9492Z5((String) obj5)) {
                                                arrayList3.add(obj5);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList3), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                        break;
                                    case 1:
                                        C5709b c5709b3 = c5709b;
                                        Set set5 = c5709b3.f23206h;
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj6 : set5) {
                                            if (AbstractC4955ho.m9492Z5((String) obj6)) {
                                                arrayList4.add(obj6);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList4), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                        break;
                                    case 2:
                                        C5709b c5709b4 = c5709b;
                                        interfaceC1231l3.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                        break;
                                    case 3:
                                        C5709b c5709b5 = c5709b;
                                        Set set6 = c5709b5.f23207i;
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj7 : set6) {
                                            if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                                arrayList5.add(obj7);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                        break;
                                    case 4:
                                        C5709b c5709b6 = c5709b;
                                        Set set7 = c5709b6.f23207i;
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj8 : set7) {
                                            if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                                arrayList6.add(obj8);
                                            }
                                        }
                                        interfaceC1231l3.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                        break;
                                    default:
                                        C5709b c5709b7 = c5709b;
                                        interfaceC1231l3.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P2);
                        AbstractC4955ho.m9503b("选择指定群成员", strM9403O432, (InterfaceC1220a) objM4514P2, c1836h0, 6);
                        c1836h0.m4553p(false);
                    }
                }
            } else {
                c1836h0.m4525a0(184346931);
                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                Set set4 = set;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : set4) {
                    if (!AbstractC4955ho.m9492Z5((String) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                String strM9403O44 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(arrayList3));
                boolean zM4534f5 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                Object objM4514P5 = c1836h0.m4514P();
                if (zM4534f5 || objM4514P5 == c1823e2) {
                    final int i14 = 3;
                    objM4514P5 = new InterfaceC1220a() { // from class: wb.nj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    C5709b c5709b2 = c5709b;
                                    Set set42 = c5709b2.f23206h;
                                    ArrayList arrayList32 = new ArrayList();
                                    for (Object obj52 : set42) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj52)) {
                                            arrayList32.add(obj52);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList32), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                    break;
                                case 1:
                                    C5709b c5709b3 = c5709b;
                                    Set set5 = c5709b3.f23206h;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj6 : set5) {
                                        if (AbstractC4955ho.m9492Z5((String) obj6)) {
                                            arrayList4.add(obj6);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList4), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                    break;
                                case 2:
                                    C5709b c5709b4 = c5709b;
                                    interfaceC1231l2.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                    break;
                                case 3:
                                    C5709b c5709b5 = c5709b;
                                    Set set6 = c5709b5.f23207i;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj7 : set6) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                            arrayList5.add(obj7);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                    break;
                                case 4:
                                    C5709b c5709b6 = c5709b;
                                    Set set7 = c5709b6.f23207i;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj8 : set7) {
                                        if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                            arrayList6.add(obj8);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                    break;
                                default:
                                    C5709b c5709b7 = c5709b;
                                    interfaceC1231l2.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    c1836h0.m4545k0(objM4514P5);
                }
                AbstractC4955ho.m9503b("选择排除好友", strM9403O44, (InterfaceC1220a) objM4514P5, c1836h0, 6);
                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : set4) {
                    if (AbstractC4955ho.m9492Z5((String) obj6)) {
                        arrayList4.add(obj6);
                    }
                }
                String strM9403O45 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(arrayList4));
                boolean zM4534f6 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                Object objM4514P6 = c1836h0.m4514P();
                if (zM4534f6 || objM4514P6 == c1823e2) {
                    final int i15 = 4;
                    objM4514P6 = new InterfaceC1220a() { // from class: wb.nj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    C5709b c5709b2 = c5709b;
                                    Set set42 = c5709b2.f23206h;
                                    ArrayList arrayList32 = new ArrayList();
                                    for (Object obj52 : set42) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj52)) {
                                            arrayList32.add(obj52);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList32), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                    break;
                                case 1:
                                    C5709b c5709b3 = c5709b;
                                    Set set5 = c5709b3.f23206h;
                                    ArrayList arrayList42 = new ArrayList();
                                    for (Object obj62 : set5) {
                                        if (AbstractC4955ho.m9492Z5((String) obj62)) {
                                            arrayList42.add(obj62);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList42), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                    break;
                                case 2:
                                    C5709b c5709b4 = c5709b;
                                    interfaceC1231l2.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                    break;
                                case 3:
                                    C5709b c5709b5 = c5709b;
                                    Set set6 = c5709b5.f23207i;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj7 : set6) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                            arrayList5.add(obj7);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                    break;
                                case 4:
                                    C5709b c5709b6 = c5709b;
                                    Set set7 = c5709b6.f23207i;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj8 : set7) {
                                        if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                            arrayList6.add(obj8);
                                        }
                                    }
                                    interfaceC1231l2.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                    break;
                                default:
                                    C5709b c5709b7 = c5709b;
                                    interfaceC1231l2.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    c1836h0.m4545k0(objM4514P6);
                }
                AbstractC4955ho.m9503b("选择排除群聊", strM9403O45, (InterfaceC1220a) objM4514P6, c1836h0, 6);
                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                String strM9403O46 = AbstractC4955ho.m9403O4(AbstractC4955ho.m9316D5(c5709b.f23209k));
                boolean zM4534f7 = c1836h0.m4534f(interfaceC1231l3) | c1836h0.m4538h(c5709b) | c1836h0.m4534f(interfaceC1231l);
                Object objM4514P7 = c1836h0.m4514P();
                if (zM4534f7 || objM4514P7 == c1823e2) {
                    final int i16 = 5;
                    objM4514P7 = new InterfaceC1220a() { // from class: wb.nj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    C5709b c5709b2 = c5709b;
                                    Set set42 = c5709b2.f23206h;
                                    ArrayList arrayList32 = new ArrayList();
                                    for (Object obj52 : set42) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj52)) {
                                            arrayList32.add(obj52);
                                        }
                                    }
                                    interfaceC1231l3.invoke(new C5391v0("选择指定好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList32), new C5113mj(17, interfaceC1231l, c5709b2), true, Opcodes.CHECKCAST));
                                    break;
                                case 1:
                                    C5709b c5709b3 = c5709b;
                                    Set set5 = c5709b3.f23206h;
                                    ArrayList arrayList42 = new ArrayList();
                                    for (Object obj62 : set5) {
                                        if (AbstractC4955ho.m9492Z5((String) obj62)) {
                                            arrayList42.add(obj62);
                                        }
                                    }
                                    interfaceC1231l3.invoke(new C5391v0("选择指定群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList42), new C5113mj(18, interfaceC1231l, c5709b3), false, 224));
                                    break;
                                case 2:
                                    C5709b c5709b4 = c5709b;
                                    interfaceC1231l3.invoke(new C4804d4("选择指定群成员", AbstractC4955ho.m9316D5(c5709b4.f23208j), new C5113mj(13, interfaceC1231l, c5709b4), null));
                                    break;
                                case 3:
                                    C5709b c5709b5 = c5709b;
                                    Set set6 = c5709b5.f23207i;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj7 : set6) {
                                        if (!AbstractC4955ho.m9492Z5((String) obj7)) {
                                            arrayList5.add(obj7);
                                        }
                                    }
                                    interfaceC1231l3.invoke(new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(arrayList5), new C5113mj(14, interfaceC1231l, c5709b5), true, Opcodes.CHECKCAST));
                                    break;
                                case 4:
                                    C5709b c5709b6 = c5709b;
                                    Set set7 = c5709b6.f23207i;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj8 : set7) {
                                        if (AbstractC4955ho.m9492Z5((String) obj8)) {
                                            arrayList6.add(obj8);
                                        }
                                    }
                                    interfaceC1231l3.invoke(new C5391v0("选择排除群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5(arrayList6), new C5113mj(16, interfaceC1231l, c5709b6), false, 224));
                                    break;
                                default:
                                    C5709b c5709b7 = c5709b;
                                    interfaceC1231l3.invoke(new C4804d4("选择排除群成员", AbstractC4955ho.m9316D5(c5709b7.f23209k), new C5113mj(15, interfaceC1231l, c5709b7), null));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    c1836h0.m4545k0(objM4514P7);
                }
                AbstractC4955ho.m9503b("选择排除群成员", strM9403O46, (InterfaceC1220a) objM4514P7, c1836h0, 6);
                c1836h0.m4553p(false);
            }
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m1500g(Object obj, Object obj2) {
        InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1419i;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1420j;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1418h;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1421k;
        InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj;
        interfaceC4544a.getClass();
        AbstractC4955ho.m9346H3(sharedPreferences, interfaceC1809a1, interfaceC1809a12);
        interfaceC1235p.invoke(interfaceC4544a, (C4770c3) obj2);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final Object m1501h(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        AbstractC4955ho.m9666t0((String) this.f1419i, (String) this.f1420j, (InterfaceC1220a) this.f1418h, (InterfaceC1235p) this.f1421k, (C1836h0) obj, AbstractC1874r.m4617C(385));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final Object m1502i(Object obj, Object obj2) {
        String str = (String) this.f1419i;
        List list = (List) this.f1420j;
        ((Integer) obj2).getClass();
        AbstractC4955ho.m9334G(AbstractC1874r.m4617C(385), (InterfaceC1220a) this.f1418h, (InterfaceC1231l) this.f1421k, (C1836h0) obj, str, list);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    private final Object m1503j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        AbstractC4955ho.m9328F1((C5739f) this.f1419i, (InterfaceC1220a) this.f1420j, (InterfaceC1231l) this.f1418h, (InterfaceC1220a) this.f1421k, (C1836h0) obj, AbstractC1874r.m4617C(49));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    private final Object m1504k(Object obj, Object obj2) {
        C4804d4 c4804d4 = (C4804d4) this.f1419i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1420j;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1418h;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1421k;
        List list = (List) obj;
        Throwable th2 = (Throwable) obj2;
        C3147k c3147k = AbstractC4955ho.f17686a;
        interfaceC1809a1.setValue(Boolean.FALSE);
        if (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "读取群聊失败";
            }
            interfaceC1809a12.setValue(message);
        } else {
            Set set = c4804d4.f16501d;
            if (set != null) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (set2.contains(((C5292s0) obj3).f20550a)) {
                        arrayList.add(obj3);
                    }
                }
                list = arrayList;
            }
            interfaceC1809a13.setValue(list);
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    private final Object m1505l(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        boolean z9;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1419i;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1420j;
        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1418h;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1421k;
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
            C5597e c5597e = C5601f.f22761e;
            AbstractC1874r.m4615A(c5597e, c1836h0, c3256tM6935a);
            C5597e c5597e2 = C5601f.f22760d;
            AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C5597e c5597e3 = C5601f.f22762f;
            AbstractC1874r.m4615A(c5597e3, c1836h0, numValueOf);
            C5593d c5593d = C5601f.f22763g;
            AbstractC1874r.m4641w(c5593d, c1836h0);
            C5597e c5597e4 = C5601f.f22759c;
            AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c);
            String str = (String) interfaceC1809a12.getValue();
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a12);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (zM4534f || objM4514P == c1823e) {
                objM4514P = new C5086lp(interfaceC1809a12, 17);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9304C1("配置名称", "用于区分不同服务和模型", str, 0, (InterfaceC1231l) objM4514P, c1836h0, 54, 8);
            InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
            C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h0, 6);
            int iHashCode2 = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l2 = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6886p);
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(c5597e, c1836h0, c3213e1M6892a);
            AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l2);
            AbstractC2091b.m5169p(iHashCode2, c1836h0, c5597e3, c1836h0, c5593d);
            AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c2);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                interfaceC1809a1 = interfaceC1809a13;
                objM4514P2 = new C5020jp(interfaceC1809a1, 28);
                c1836h0.m4545k0(objM4514P2);
            } else {
                interfaceC1809a1 = interfaceC1809a13;
            }
            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P2;
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            AbstractC4045s.m8251o("取消", interfaceC1220a, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 54, 1912);
            boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a12) | c1836h0.m4534f(interfaceC1231l) | c1836h0.m4534f(interfaceC1231l2);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P3 == c1823e) {
                z9 = true;
                C0467n0 c0467n0 = new C0467n0(interfaceC1231l, (Object) interfaceC1231l2, (Object) interfaceC1809a12, (Object) interfaceC1809a1, 26);
                c1836h0.m4545k0(c0467n0);
                objM4514P3 = c0467n0;
            } else {
                z9 = true;
            }
            InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            boolean z10 = z9;
            AbstractC4045s.m8251o("确认", interfaceC1220a2, new C3248q0(1.0f, z9), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 6, 1912);
            c1836h0.m4553p(z10);
            c1836h0.m4553p(z10);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    private final Object m1506m(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        Object c0467n0;
        boolean z9;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1419i;
        InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1420j;
        C1113d1 c1113d1 = (C1113d1) this.f1418h;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1421k;
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
            C5597e c5597e = C5601f.f22761e;
            AbstractC1874r.m4615A(c5597e, c1836h0, c3256tM6935a);
            C5597e c5597e2 = C5601f.f22760d;
            AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C5597e c5597e3 = C5601f.f22762f;
            AbstractC1874r.m4615A(c5597e3, c1836h0, numValueOf);
            C5593d c5593d = C5601f.f22763g;
            AbstractC1874r.m4641w(c5593d, c1836h0);
            C5597e c5597e4 = C5601f.f22759c;
            AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c);
            String str = (String) interfaceC1809a12.getValue();
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = new C5086lp(interfaceC1809a12, 2);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9304C1("对话标题", "最多 32 个字符", str, 0, (InterfaceC1231l) objM4514P, c1836h0, 24630, 8);
            InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
            C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h0, 6);
            int iHashCode2 = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l2 = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6886p);
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(c5597e, c1836h0, c3213e1M6892a);
            AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l2);
            AbstractC2091b.m5169p(iHashCode2, c1836h0, c5597e3, c1836h0, c5593d);
            AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c2);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                interfaceC1809a1 = interfaceC1809a13;
                objM4514P2 = new C5020jp(interfaceC1809a1, 5);
                c1836h0.m4545k0(objM4514P2);
            } else {
                interfaceC1809a1 = interfaceC1809a13;
            }
            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P2;
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            AbstractC4045s.m8251o("取消", interfaceC1220a, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 54, 1912);
            boolean zM4534f = c1836h0.m4534f(interfaceC1235p) | c1836h0.m4538h(c1113d1);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f || objM4514P3 == c1823e) {
                z9 = true;
                c0467n0 = new C0467n0(interfaceC1235p, c1113d1, interfaceC1809a12, interfaceC1809a1, 23);
                c1836h0.m4545k0(c0467n0);
            } else {
                z9 = true;
                c0467n0 = objM4514P3;
            }
            InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) c0467n0;
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            boolean z10 = z9;
            AbstractC4045s.m8251o("保存", interfaceC1220a2, new C3248q0(1.0f, z9), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 6, 1912);
            c1836h0.m4553p(z10);
            c1836h0.m4553p(z10);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    private final Object m1507n(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((C5491y2) this.f1419i).m9908o0((C1165q1) this.f1420j, (InterfaceC1231l) this.f1418h, (InterfaceC1220a) this.f1421k, (C1836h0) obj, AbstractC1874r.m4617C(3073));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    private final Object m1508o(Object obj, Object obj2) throws JSONException {
        ((Integer) obj2).getClass();
        ((C5491y2) this.f1419i).m9919u0((Context) this.f1420j, (C5034k6) this.f1418h, (C2020n) this.f1421k, (C1836h0) obj, AbstractC1874r.m4617C(3073));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    private final Object m1509p(Object obj, Object obj2) {
        InterfaceC4233c interfaceC4233c = (InterfaceC4233c) this.f1419i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1420j;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1418h;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1421k;
        C3914t c3914t = (C3914t) obj;
        c3914t.getClass();
        c3914t.m8118a();
        interfaceC1809a1.setValue(Float.valueOf(Float.intBitsToFloat((int) (((C0807b) obj2).f2414a & 4294967295L)) + ((Number) interfaceC1809a1.getValue()).floatValue()));
        float fFloatValue = ((Number) interfaceC1809a12.getValue()).floatValue();
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fFloatValue <= 0.0f) {
            fValueOf = null;
        }
        float fMo1601x0 = interfaceC4233c.mo1601x0(6) + (fValueOf != null ? fValueOf.floatValue() : interfaceC4233c.mo1601x0(56));
        while (true) {
            float f3 = -fMo1601x0;
            if (((Number) interfaceC1809a1.getValue()).floatValue() <= f3 * 0.5f) {
                if (!((Boolean) ((InterfaceC1231l) interfaceC1809a13.getValue()).invoke(-1)).booleanValue()) {
                    interfaceC1809a1.setValue(Float.valueOf(f3 * 0.45f));
                    break;
                }
                interfaceC1809a1.setValue(Float.valueOf(((Number) interfaceC1809a1.getValue()).floatValue() + fMo1601x0));
            } else {
                break;
            }
        }
        while (true) {
            if (((Number) interfaceC1809a1.getValue()).floatValue() >= fMo1601x0 * 0.5f) {
                if (!((Boolean) ((InterfaceC1231l) interfaceC1809a13.getValue()).invoke(1)).booleanValue()) {
                    interfaceC1809a1.setValue(Float.valueOf(fMo1601x0 * 0.45f));
                    break;
                }
                interfaceC1809a1.setValue(Float.valueOf(((Number) interfaceC1809a1.getValue()).floatValue() - fMo1601x0));
            } else {
                break;
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        Activity activity;
        C1096g c1096g;
        C2355s c2355s;
        WeChatMessage weChatMessageM5661c;
        C2355s c2355s2;
        WeChatMessage weChatMessageM5663e;
        Long lM1163i;
        Iterator it;
        Activity activity2;
        boolean z9;
        C5292s0 c5292s0;
        Context context;
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1809a1 interfaceC1809a12;
        int i9;
        int i10 = this.f1417g;
        C5850l c5850l = C5850l.f23787a;
        int i11 = 6;
        C1823e c1823e = C1851l.f6155a;
        C3967n c3967n = C3967n.f12976a;
        int i12 = 2;
        Object obj3 = this.f1421k;
        int i13 = 13;
        Object obj4 = this.f1418h;
        Object obj5 = this.f1420j;
        Object obj6 = this.f1419i;
        switch (i10) {
            case 0:
                C0416a1 c0416a1 = (C0416a1) obj6;
                Activity activity3 = (Activity) obj5;
                C3874d c3874d = (C3874d) obj4;
                C0475p0 c0475p0 = (C0475p0) obj3;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1874r.m4619a(AbstractC3924b.f12884a.mo4582a(c0416a1), AbstractC3879i.m8071e(-202705722, new C0145k(1, (Object) activity3, (Object) c3874d, (Object) c0475p0, false), c1836h0), c1836h0, 48);
                } else {
                    c1836h0.m4519V();
                }
                return c3967n;
            case 1:
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) obj6;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj5;
                C3874d c3874d2 = (C3874d) obj4;
                C0646c c0646c = (C0646c) obj3;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM4514P = c1836h02.m4514P();
                    if (objM4514P == c1823e) {
                        objM4514P = new C0146l(interfaceC1809a13, 7);
                        c1836h02.m4545k0(objM4514P);
                    }
                    InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(interfaceC5853o, (InterfaceC1231l) objM4514P);
                    InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, true);
                    int iHashCode = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM8889m);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, interfaceC4412n0M6930d);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
                    c3874d2.invoke(c1836h02, 0);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (objM4514P2 == c1823e) {
                        objM4514P2 = new C0144j(interfaceC1809a13, 10);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    c0646c.m1795b((InterfaceC1220a) objM4514P2, c1836h02, 6);
                    c1836h02.m4553p(true);
                } else {
                    c1836h02.m4519V();
                }
                return c3967n;
            case 2:
                Activity activity4 = (Activity) obj5;
                String strM1160g0 = (String) obj;
                String strM1160g02 = (String) obj2;
                strM1160g0.getClass();
                strM1160g02.getClass();
                Context context2 = ((C1094e) obj6).f3512a.f12143a;
                long j3 = ((C1097h) obj4).f3529a;
                Object obj7 = ((C1092c) obj3).f3508b;
                if (WeChatApis.message() == null || (c2355s = WeChatApis.messageStoreApi) == null || (weChatMessageM5661c = c2355s.m5661c(j3)) == null) {
                    activity = activity4;
                    c1096g = new C1096g();
                } else if (AbstractC0283h.m1123C(weChatMessageM5661c)) {
                    String str = weChatMessageM5661c.content;
                    SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context2, "Hchat_edit_message_backup");
                    String strM1169l = AbstractC0283h.m1169l(weChatMessageM5661c.msgId);
                    if (!sharedPreferencesM8640c.contains(strM1169l)) {
                        sharedPreferencesM8640c.edit().putString(strM1169l, weChatMessageM5661c.content).apply();
                    }
                    if (weChatMessageM5661c.isTransfer()) {
                        String strBodyContent = weChatMessageM5661c.bodyContent();
                        String strM1161h = AbstractC0283h.m1161h(strM1160g0);
                        if (strM1161h == null || (lM1163i = AbstractC0283h.m1163i(strM1161h)) == null) {
                            activity = activity4;
                            strM1160g0 = null;
                        } else {
                            long jLongValue = lM1163i.longValue();
                            String strConcat = "￥".concat(strM1161h);
                            Iterator it2 = AbstractC0000a.m101y0("total_fee", "feederval", "fee").iterator();
                            String str2 = strBodyContent;
                            boolean z10 = false;
                            while (it2.hasNext()) {
                                Iterator it3 = it2;
                                String str3 = strBodyContent;
                                String strM1143W = AbstractC0283h.m1143W(str2, (String) it2.next(), String.valueOf(jLongValue));
                                if (!AbstractC1416l.m3825a(strM1143W, str2)) {
                                    str2 = strM1143W;
                                    z10 = true;
                                }
                                it2 = it3;
                                strBodyContent = str3;
                            }
                            String str4 = strBodyContent;
                            String strM1143W2 = AbstractC0283h.m1143W(str2, "feedesc", strConcat);
                            if (!AbstractC1416l.m3825a(strM1143W2, str2)) {
                                str2 = strM1143W2;
                                z10 = true;
                            }
                            Iterator it4 = AbstractC0000a.m101y0("title", "desc", "payerdes", "receiverdes").iterator();
                            while (it4.hasNext()) {
                                String str5 = (String) it4.next();
                                String strM1178p0 = AbstractC0283h.m1178p0(str2, str5);
                                if (AbstractC3149m.m6721t0(strM1178p0)) {
                                    it = it4;
                                    activity2 = activity4;
                                    z9 = z10;
                                } else {
                                    it = it4;
                                    z9 = z10;
                                    activity2 = activity4;
                                    String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3149m.m6703R0(strM1178p0).toString(), ",", HttpUrl.FRAGMENT_ENCODE_SET, false);
                                    if (!AbstractC3149m.m6709h0(strM1178p0, "￥", false) && !AbstractC3149m.m6709h0(strM1178p0, "¥", false) && !AbstractC3149m.m6709h0(strM1178p0, "元", false)) {
                                        Pattern patternCompile = Pattern.compile("[0-9]+(?:\\.[0-9]{1,2})?");
                                        patternCompile.getClass();
                                        if (patternCompile.matcher(strM6737a0).matches()) {
                                        }
                                        activity4 = activity2;
                                    }
                                    String strM1143W3 = AbstractC0283h.m1143W(str2, str5, strConcat);
                                    if (AbstractC1416l.m3825a(strM1143W3, str2)) {
                                        z10 = z9;
                                    } else {
                                        str2 = strM1143W3;
                                        z10 = true;
                                    }
                                    it4 = it;
                                    activity4 = activity2;
                                }
                                it4 = it;
                                z10 = z9;
                                activity4 = activity2;
                            }
                            activity = activity4;
                            strM1160g0 = z10 ? str2 : str4;
                        }
                        if (strM1160g0 == null) {
                            c1096g = new C1096g();
                        }
                    } else {
                        activity = activity4;
                        if (weChatMessageM5661c.isQuote()) {
                            strM1160g0 = AbstractC0283h.m1160g0(weChatMessageM5661c.bodyContent(), strM1160g0, strM1160g02);
                        }
                    }
                    String strM1166j0 = AbstractC0283h.m1166j0(weChatMessageM5661c, strM1160g0);
                    C1095f c1095fM1158f0 = AbstractC0283h.m1158f0(weChatMessageM5661c, strM1166j0, obj7);
                    boolean z11 = c1095fM1158f0.f3519a;
                    if (z11 && weChatMessageM5661c.isQuote() && !AbstractC3149m.m6721t0(strM1160g02)) {
                        String strBodyContent2 = weChatMessageM5661c.bodyContent();
                        Long lM6743g0 = AbstractC3156t.m6743g0(AbstractC0283h.m1186x(AbstractC0283h.m1178p0(AbstractC0283h.m1176o0(strBodyContent2), "svrid"), AbstractC0283h.m1178p0(strBodyContent2, "svrid")));
                        long jLongValue2 = lM6743g0 != null ? lM6743g0.longValue() : 0L;
                        if (jLongValue2 > 0 && WeChatApis.message() != null && (c2355s2 = WeChatApis.messageStoreApi) != null && (((weChatMessageM5663e = c2355s2.m5663e(jLongValue2, weChatMessageM5661c.talker)) != null || (weChatMessageM5663e = c2355s2.m5662d(jLongValue2)) != null) && AbstractC0283h.m1123C(weChatMessageM5663e))) {
                            SharedPreferences sharedPreferencesM8640c2 = AbstractC4302b.m8640c(context2, "Hchat_edit_message_backup");
                            String strM1169l2 = AbstractC0283h.m1169l(weChatMessageM5663e.msgId);
                            if (!sharedPreferencesM8640c2.contains(strM1169l2)) {
                                sharedPreferencesM8640c2.edit().putString(strM1169l2, weChatMessageM5663e.content).apply();
                            }
                            if (weChatMessageM5663e.isQuote()) {
                                strM1160g02 = AbstractC0283h.m1160g0(weChatMessageM5663e.bodyContent(), AbstractC0283h.m1178p0(weChatMessageM5663e.bodyContent(), "title"), strM1160g02);
                            }
                            AbstractC0283h.m1158f0(weChatMessageM5663e, AbstractC0283h.m1166j0(weChatMessageM5663e, strM1160g02), null);
                        }
                    }
                    if (z11) {
                        AbstractC0283h.m1148a0(weChatMessageM5661c, strM1166j0);
                    }
                    boolean z12 = c1095fM1158f0.f3519a;
                    c1096g = new C1096g(weChatMessageM5661c.msgId, str, strM1166j0, AbstractC0283h.m1181s(weChatMessageM5661c, str), AbstractC0283h.m1181s(weChatMessageM5661c, strM1166j0), z12, z12 && !c1095fM1158f0.f3520b, weChatMessageM5661c.isTransfer());
                } else {
                    c1096g = new C1096g();
                    activity = activity4;
                }
                boolean z13 = c1096g.f3521a;
                C1094e.m2816d(activity, !z13 ? "修改失败" : c1096g.f3522b ? "已修改，退出重进聊天后生效" : "已修改");
                return Boolean.valueOf(z13);
            case 3:
                InterfaceC5853o interfaceC5853o2 = (InterfaceC5853o) obj6;
                C4359d c4359d = (C4359d) obj5;
                C4006f c4006f = (C4006f) obj3;
                C3874d c3874d3 = (C3874d) obj4;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM4514P3 = c1836h03.m4514P();
                    if (objM4514P3 == c1823e) {
                        objM4514P3 = new C3766p(2);
                        c1836h03.m4545k0(objM4514P3);
                    }
                    AtomicInteger atomicInteger = AbstractC1052o.f3345a;
                    InterfaceC5853o interfaceC5853oM5430g = AbstractC2192n.m5430g(AbstractC0378h.m1337b(interfaceC5853o2.mo10549d(new C1039b(false, (InterfaceC1231l) objM4514P3)), c4359d), c4006f.f13118a, AbstractC0996c0.f3162b);
                    InterfaceC4412n0 interfaceC4412n0M6930d2 = AbstractC3241o.m6930d(C5840b.f23761g, true);
                    int iHashCode2 = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l2 = c1836h03.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM5430g);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y2);
                    } else {
                        c1836h03.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, interfaceC4412n0M6930d2);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l2);
                    AbstractC1874r.m4638t(c1836h03, Integer.valueOf(iHashCode2), C5601f.f22762f);
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c2);
                    c3874d3.invoke(c1836h03, 0);
                    c1836h03.m4553p(true);
                } else {
                    c1836h03.m4519V();
                }
                return c3967n;
            case 4:
                C0416a1 c0416a12 = (C0416a1) obj6;
                Activity activity5 = (Activity) obj5;
                C3874d c3874d4 = (C3874d) obj4;
                C0482r0 c0482r0 = (C0482r0) obj3;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC1874r.m4619a(AbstractC3924b.f12884a.mo4582a(c0416a12), AbstractC3879i.m8071e(-1790801080, new C0145k(8, (Object) activity5, (Object) c3874d4, (Object) c0482r0, false), c1836h04), c1836h04, 48);
                } else {
                    c1836h04.m4519V();
                }
                return c3967n;
            case 5:
                C1097h c1097h = (C1097h) obj6;
                C0479q0 c0479q0 = (C0479q0) obj5;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj4;
                C0467n0 c0467n0 = (C0467n0) obj3;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C5491y2 c5491y2 = C5491y2.f22060h;
                    boolean zM4534f = c1836h05.m4534f(c0479q0) | c1836h05.m4534f(interfaceC1220a);
                    Object objM4514P4 = c1836h05.m4514P();
                    if (zM4534f || objM4514P4 == c1823e) {
                        objM4514P4 = new C0151q(c0479q0, 16, interfaceC1220a);
                        c1836h05.m4545k0(objM4514P4);
                    }
                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) objM4514P4;
                    boolean zM4534f2 = c1836h05.m4534f(c0467n0) | c1836h05.m4534f(interfaceC1220a);
                    Object objM4514P5 = c1836h05.m4514P();
                    if (zM4534f2 || objM4514P5 == c1823e) {
                        objM4514P5 = new C4056v1(c0467n0, i11, interfaceC1220a);
                        c1836h05.m4545k0(objM4514P5);
                    }
                    c5491y2.m9911q(c1097h, interfaceC1235p, (InterfaceC1220a) objM4514P5, interfaceC1220a, c1836h05, 24576);
                } else {
                    c1836h05.m4519V();
                }
                return c3967n;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9482Y3((List) obj6, (List) obj5, (InterfaceC1220a) obj4, (InterfaceC1231l) obj3, (C1836h0) obj, AbstractC1874r.m4617C(385));
                return c3967n;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9456V1((Context) obj6, (C5132n5) obj5, (InterfaceC1220a) obj4, (InterfaceC1231l) obj3, (C1836h0) obj, AbstractC1874r.m4617C(385));
                return c3967n;
            case 8:
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                String str6 = (String) obj5;
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj4;
                String str7 = (String) obj3;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(sharedPreferences, str6, interfaceC4544a.mo4984b(), str7, false, c1836h06, 0);
                } else {
                    c1836h06.m4519V();
                }
                return c3967n;
            case 9:
                Context context3 = (Context) obj6;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    Object objM4514P6 = c1836h07.m4514P();
                    if (objM4514P6 == c1823e) {
                        objM4514P6 = new C5070l9(interfaceC1809a15, 13);
                        c1836h07.m4545k0(objM4514P6);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P6;
                    boolean zM4538h = c1836h07.m4538h(context3);
                    Object objM4514P7 = c1836h07.m4514P();
                    if (zM4538h || objM4514P7 == c1823e) {
                        objM4514P7 = new C5172oc(interfaceC1809a14, context3, interfaceC1809a16);
                        c1836h07.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9313D2(zBooleanValue, interfaceC1220a2, (InterfaceC1231l) objM4514P7, c1836h07, 3504);
                } else {
                    c1836h07.m4519V();
                }
                return c3967n;
            case 10:
                List list = (List) obj6;
                Context context4 = (Context) obj5;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj4;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c1836h08.m4519V();
                } else if (list.isEmpty()) {
                    c1836h08.m4525a0(-586914986);
                    AbstractC4045s.m8250n("暂无插件", AbstractC3208d.m6883m(c5850l, 16, 14), ((C0314b) c1836h08.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h08, 24630, 0, 262120);
                    c1836h08.m4553p(false);
                } else {
                    c1836h08.m4525a0(-586560160);
                    int i14 = 0;
                    for (Object obj8 : list) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C0859c0 c0859c0 = (C0859c0) obj8;
                        Boolean bool = (Boolean) ((Map) interfaceC1809a17.getValue()).get(c0859c0.f2626a);
                        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : ScriptPluginRuntime.INSTANCE.isPluginEnabled(context4, c0859c0.f2626a);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c0859c0.f2628c.getName());
                        sb2.append("\n作者: ");
                        String str8 = c0859c0.f2630e;
                        if (AbstractC3149m.m6721t0(str8)) {
                            str8 = "未知";
                        }
                        sb2.append(str8);
                        sb2.append(" | 更新于: ");
                        String str9 = c0859c0.f2632g;
                        if (AbstractC3149m.m6721t0(str9)) {
                            str9 = "未知";
                        }
                        sb2.append(str9);
                        String string = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        String str10 = c0859c0.f2633h;
                        if (str10 == null) {
                            str10 = "未知";
                        }
                        sb3.append(str10);
                        sb3.append("(");
                        String str11 = c0859c0.f2631f;
                        if (AbstractC3149m.m6721t0(str11)) {
                            str11 = "未知";
                        }
                        String strM2255r = AbstractC0921a.m2255r(sb3, str11, ")");
                        boolean zCanOpenSettings = ScriptPluginRuntime.INSTANCE.canOpenSettings(c0859c0);
                        boolean zM4534f3 = c1836h08.m4534f(interfaceC1231l) | c1836h08.m4538h(c0859c0);
                        Object objM4514P8 = c1836h08.m4514P();
                        Object obj9 = objM4514P8;
                        if (zM4534f3 || objM4514P8 == c1823e) {
                            C5235q9 c5235q9 = new C5235q9(interfaceC1231l, c0859c0, 1);
                            c1836h08.m4545k0(c5235q9);
                            obj9 = c5235q9;
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) obj9;
                        boolean zM4538h2 = c1836h08.m4538h(c0859c0) | c1836h08.m4538h(context4);
                        Object objM4514P9 = c1836h08.m4514P();
                        Object obj10 = objM4514P9;
                        if (zM4538h2 || objM4514P9 == c1823e) {
                            C4056v1 c4056v1 = new C4056v1(c0859c0, i13, context4);
                            c1836h08.m4545k0(c4056v1);
                            obj10 = c4056v1;
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) obj10;
                        boolean zM4534f4 = c1836h08.m4534f(interfaceC1809a17) | c1836h08.m4538h(c0859c0) | c1836h08.m4538h(context4);
                        Object objM4514P10 = c1836h08.m4514P();
                        Object obj11 = objM4514P10;
                        if (zM4534f4 || objM4514P10 == c1823e) {
                            C0153s c0153s = new C0153s(29, context4, c0859c0, interfaceC1809a17);
                            c1836h08.m4545k0(c0153s);
                            obj11 = c0153s;
                        }
                        AbstractC4955ho.m9660s3(zBooleanValue2, strM2255r, string, zCanOpenSettings, interfaceC1220a3, interfaceC1220a4, (InterfaceC1231l) obj11, c1836h08, 0);
                        if (i14 != list.size() - 1) {
                            c1836h08.m4525a0(-214649195);
                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                        } else {
                            c1836h08.m4525a0(1935823003);
                        }
                        c1836h08.m4553p(false);
                        i14 = i15;
                        i13 = 13;
                    }
                    c1836h08.m4553p(false);
                }
                return c3967n;
            case 11:
                String str12 = (String) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) obj4;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) obj3;
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h09, 0);
                    int iHashCode3 = Long.hashCode(c1836h09.f6095T);
                    C3878h c3878hM4546l3 = c1836h09.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h09, c5850l);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y3 = C5601f.f22758b;
                    c1836h09.m4531d0();
                    if (c1836h09.f6094S) {
                        c1836h09.m4544k(c5660y3);
                    } else {
                        c1836h09.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h09, c3256tM6935a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h09, c3878hM4546l3);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h09, Integer.valueOf(iHashCode3));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h09);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h09, interfaceC5853oM10543c3);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str12);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj12 : arrayList) {
                        if (!AbstractC3149m.m6721t0((String) obj12)) {
                            arrayList2.add(obj12);
                        }
                    }
                    String strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8403L1(6, arrayList2), "、", null, null, null, 62);
                    if (!AbstractC3149m.m6721t0(strM8392A1)) {
                        sb4.append("\n\n");
                        sb4.append(strM8392A1);
                    }
                    if (arrayList.size() > 6) {
                        sb4.append(" 等");
                    }
                    AbstractC4045s.m8250n(sb4.toString(), null, ((C0314b) c1836h09.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h09, 24576, 0, 262122);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h09, 6);
                    int iHashCode4 = Long.hashCode(c1836h09.f6095T);
                    C3878h c3878hM4546l4 = c1836h09.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c4 = AbstractC5839a.m10543c(c1836h09, interfaceC5853oM6886p);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y4 = C5601f.f22758b;
                    c1836h09.m4531d0();
                    if (c1836h09.f6094S) {
                        c1836h09.m4544k(c5660y4);
                    } else {
                        c1836h09.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h09, c3213e1M6892a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h09, c3878hM4546l4);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h09, Integer.valueOf(iHashCode4));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h09);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h09, interfaceC5853oM10543c4);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a5, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h09), null, c1836h09, 6, 1912);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("确认删除", interfaceC1220a6, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h09), null, c1836h09, 6, 1912);
                    c1836h09.m4553p(true);
                    c1836h09.m4553p(true);
                } else {
                    c1836h09.m4519V();
                }
                return c3967n;
            case 12:
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) obj6;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) obj5;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj4;
                String str13 = (String) obj3;
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    String strMo4984b = interfaceC4544a2.mo4984b();
                    String strMo4986d = interfaceC4544a2.mo4986d();
                    boolean zM4534f5 = c1836h010.m4534f(interfaceC1809a18) | c1836h010.m4538h(sharedPreferences2) | c1836h010.m4534f(str13);
                    Object objM4514P11 = c1836h010.m4514P();
                    if (zM4534f5 || objM4514P11 == c1823e) {
                        objM4514P11 = new C5402vb(sharedPreferences2, str13, interfaceC1809a18, 5);
                        c1836h010.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, strMo4984b, strMo4986d, false, (InterfaceC1231l) objM4514P11, c1836h010, 0, 8);
                } else {
                    c1836h010.m4519V();
                }
                return c3967n;
            case 13:
                ArrayList arrayList3 = (ArrayList) obj6;
                Context context5 = (Context) obj5;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    int i16 = 0;
                    for (Object obj13 : arrayList3) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C5292s0 c5292s02 = (C5292s0) obj13;
                        int iIntValue12 = ((Number) interfaceC1809a19.getValue()).intValue();
                        boolean zM4538h3 = c1836h011.m4538h(c5292s02) | c1836h011.m4538h(context5);
                        Object objM4514P12 = c1836h011.m4514P();
                        if (zM4538h3 || objM4514P12 == c1823e) {
                            Context context6 = context5;
                            c5292s0 = c5292s02;
                            objM4514P12 = new C0467n0(c5292s0, context6, interfaceC1809a110, interfaceC1809a19, 13);
                            context = context6;
                            interfaceC1809a1 = interfaceC1809a110;
                            interfaceC1809a12 = interfaceC1809a19;
                            c1836h011.m4545k0(objM4514P12);
                        } else {
                            context = context5;
                            c5292s0 = c5292s02;
                            interfaceC1809a1 = interfaceC1809a110;
                            interfaceC1809a12 = interfaceC1809a19;
                        }
                        AbstractC4955ho.m9558h0(context, c5292s0, iIntValue12, (InterfaceC1220a) objM4514P12, c1836h011, 0);
                        if (i16 != arrayList3.size() - 1) {
                            c1836h011.m4525a0(-29711368);
                            AbstractC4955ho.m9312D1(0.0f, c1836h011, 0, 1);
                        } else {
                            c1836h011.m4525a0(-921038952);
                        }
                        c1836h011.m4553p(false);
                        interfaceC1809a19 = interfaceC1809a12;
                        i16 = i17;
                        interfaceC1809a110 = interfaceC1809a1;
                        context5 = context;
                    }
                } else {
                    c1836h011.m4519V();
                }
                return c3967n;
            case 14:
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) obj6;
                Set set = (Set) obj5;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj4;
                C2912a c2912a = (C2912a) obj3;
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String str14 = (String) interfaceC1809a111.getValue();
                    boolean zM4534f6 = c1836h012.m4534f(interfaceC1809a111);
                    Object objM4514P13 = c1836h012.m4514P();
                    if (zM4534f6 || objM4514P13 == c1823e) {
                        objM4514P13 = new C4980ih(interfaceC1809a111, 2);
                        c1836h012.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9304C1("标签名称", "用于任务和名单选择器", str14, 0, (InterfaceC1231l) objM4514P13, c1836h012, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h012, 0, 1);
                    String strM2250m = set.isEmpty() ? "未选择群聊" : AbstractC0921a.m2250m(set.size(), "已选择 ", " 个群聊");
                    boolean zM4534f7 = c1836h012.m4534f(interfaceC1231l2) | c1836h012.m4538h(c2912a);
                    Object objM4514P14 = c1836h012.m4514P();
                    if (zM4534f7 || objM4514P14 == c1823e) {
                        objM4514P14 = new C5012jh(interfaceC1231l2, c2912a, 0);
                        c1836h012.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9503b("标签群聊", strM2250m, (InterfaceC1220a) objM4514P14, c1836h012, 6);
                } else {
                    c1836h012.m4519V();
                }
                return c3967n;
            case 15:
                final C4521a c4521a = (C4521a) obj6;
                final InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) obj5;
                Context context7 = (Context) obj4;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) obj3;
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    Set set2 = c4521a.f14901e;
                    Set set3 = c4521a.f14902f;
                    String strM2250m2 = set2.isEmpty() ? "未选择" : AbstractC0921a.m2250m(set2.size(), "已选择 ", " 个会话");
                    boolean zM4534f8 = c1836h013.m4534f(interfaceC1235p2) | c1836h013.m4538h(c4521a);
                    Object objM4514P15 = c1836h013.m4514P();
                    if (zM4534f8 || objM4514P15 == c1823e) {
                        final int i18 = false ? 1 : 0;
                        objM4514P15 = new InterfaceC1220a() { // from class: wb.ki
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        interfaceC1235p2.invoke(c4521a, EnumC4864f.f17035g);
                                        break;
                                    default:
                                        interfaceC1235p2.invoke(c4521a, EnumC4864f.f17036h);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h013.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9503b("监听会话", strM2250m2, (InterfaceC1220a) objM4514P15, c1836h013, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                    String strM2250m3 = set3.isEmpty() ? "不限群成员" : AbstractC0921a.m2250m(set3.size(), "已选择 ", " 个群成员");
                    boolean zM4538h4 = c1836h013.m4538h(c4521a) | c1836h013.m4538h(context7) | c1836h013.m4534f(interfaceC1231l3);
                    Object objM4514P16 = c1836h013.m4514P();
                    if (zM4538h4 || objM4514P16 == c1823e) {
                        i9 = 1;
                        objM4514P16 = new C5538zh(c4521a, context7, interfaceC1231l3, i9);
                        c1836h013.m4545k0(objM4514P16);
                    } else {
                        i9 = 1;
                    }
                    AbstractC4955ho.m9503b("群成员范围", strM2250m3, (InterfaceC1220a) objM4514P16, c1836h013, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, i9);
                    Set set4 = c4521a.f14903g;
                    String strM2250m4 = set4.isEmpty() ? "未选择" : AbstractC0921a.m2250m(set4.size(), "已选择 ", " 个会话");
                    boolean zM4534f9 = c1836h013.m4534f(interfaceC1235p2) | c1836h013.m4538h(c4521a);
                    Object objM4514P17 = c1836h013.m4514P();
                    if (zM4534f9 || objM4514P17 == c1823e) {
                        final int i19 = 1;
                        objM4514P17 = new InterfaceC1220a() { // from class: wb.ki
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        interfaceC1235p2.invoke(c4521a, EnumC4864f.f17035g);
                                        break;
                                    default:
                                        interfaceC1235p2.invoke(c4521a, EnumC4864f.f17036h);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h013.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9503b("转发会话", strM2250m4, (InterfaceC1220a) objM4514P17, c1836h013, 6);
                } else {
                    c1836h013.m4519V();
                }
                return c3967n;
            case 16:
                return m1498e(obj, obj2);
            case 17:
                C5728u c5728u = (C5728u) obj6;
                Context context8 = (Context) obj5;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    String str15 = c5728u.f23333a;
                    StringBuilder sb5 = new StringBuilder();
                    String str16 = c5728u.f23337e;
                    if (AbstractC3149m.m6721t0(str16)) {
                        str16 = "未设置模型";
                    }
                    sb5.append(str16);
                    if (AbstractC1416l.m3825a(str15, (String) interfaceC1809a112.getValue())) {
                        sb5.append(" · 当前");
                    }
                    if (AbstractC1416l.m3825a(str15, (String) interfaceC1809a113.getValue()) && !AbstractC1416l.m3825a(str15, (String) interfaceC1809a112.getValue())) {
                        sb5.append(" · 已选择");
                    }
                    String string2 = sb5.toString();
                    boolean zM4538h5 = c1836h014.m4538h(c5728u) | c1836h014.m4538h(context8);
                    Object objM4514P18 = c1836h014.m4514P();
                    if (zM4538h5 || objM4514P18 == c1823e) {
                        objM4514P18 = new C5538zh(c5728u, context8, interfaceC1809a113, i12);
                        c1836h014.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9503b(str15, string2, (InterfaceC1220a) objM4514P18, c1836h014, 0);
                } else {
                    c1836h014.m4519V();
                }
                return c3967n;
            case 18:
                return m1499f(obj, obj2);
            case 19:
                return m1500g(obj, obj2);
            case 20:
                return m1501h(obj, obj2);
            case 21:
                return m1502i(obj, obj2);
            case 22:
                return m1503j(obj, obj2);
            case 23:
                return m1504k(obj, obj2);
            case 24:
                return m1505l(obj, obj2);
            case 25:
                return m1506m(obj, obj2);
            case 26:
                return m1507n(obj, obj2);
            case 27:
                return m1508o(obj, obj2);
            case 28:
                return m1509p(obj, obj2);
            default:
                C0416a1 c0416a13 = (C0416a1) obj6;
                Activity activity6 = (Activity) obj5;
                C3874d c3874d5 = (C3874d) obj4;
                C5134n7 c5134n7 = (C5134n7) obj3;
                C1836h0 c1836h015 = (C1836h0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c1836h015.m4516S(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    AbstractC1874r.m4619a(AbstractC3924b.f12884a.mo4582a(c0416a13), AbstractC3879i.m8071e(-1124104542, new C5278rj(activity6, c3874d5, c5134n7, 22), c1836h015), c1836h015, 48);
                } else {
                    c1836h015.m4519V();
                }
                return c3967n;
        }
    }

    public /* synthetic */ C0479q0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1417g = i9;
        this.f1419i = obj;
        this.f1420j = obj2;
        this.f1418h = obj3;
        this.f1421k = obj4;
    }

    public /* synthetic */ C0479q0(Object obj, Object obj2, InterfaceC3955b interfaceC3955b, InterfaceC3955b interfaceC3955b2, int i9, int i10) {
        this.f1417g = i10;
        this.f1419i = obj;
        this.f1420j = obj2;
        this.f1418h = interfaceC3955b;
        this.f1421k = interfaceC3955b2;
    }

    public /* synthetic */ C0479q0(InterfaceC5853o interfaceC5853o, C4359d c4359d, C4006f c4006f, C3874d c3874d) {
        this.f1417g = 3;
        this.f1419i = interfaceC5853o;
        this.f1420j = c4359d;
        this.f1421k = c4006f;
        this.f1418h = c3874d;
    }
}
