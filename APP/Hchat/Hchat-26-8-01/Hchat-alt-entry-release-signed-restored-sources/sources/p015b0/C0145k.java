package p015b0;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import bi.AbstractC0316d;
import bi.C0314b;
import ca.C0524k;
import gg.AbstractC1416l;
import gg.C1422r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p011ab.C0045e;
import p025bc.AbstractC0255e;
import p036c9.C0414a;
import p036c9.C0452j1;
import p036c9.C0467n0;
import p036c9.C0475p0;
import p036c9.C0482r0;
import p036c9.C0500x0;
import p051db.C0763a;
import p051db.C0765c;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p100h0.C1511d1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.C2209s1;
import p154k9.C2366j;
import p174m.C2629m2;
import p174m.C2637o2;
import p211o9.C3104q;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
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
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p280t2.C4095k;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4412n0;
import p315v8.C4521a;
import p321w.AbstractC4634s;
import p332wb.AbstractC4955ho;
import p332wb.C4736b2;
import p332wb.C4759bp;
import p332wb.C4792cp;
import p332wb.C4825dq;
import p332wb.C4842ea;
import p332wb.C4900g2;
import p332wb.C4916gi;
import p332wb.C4936h5;
import p332wb.C4957hq;
import p332wb.C5040kc;
import p332wb.C5095m1;
import p332wb.C5113mj;
import p332wb.C5177oh;
import p332wb.C5209pg;
import p332wb.C5243qh;
import p332wb.C5275rg;
import p332wb.C5337tc;
import p332wb.C5341tg;
import p332wb.C5391v0;
import p332wb.C5402vb;
import p332wb.C5491y2;
import p332wb.EnumC5325t0;
import p332wb.EnumC5358u0;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p345x8.C5709b;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;
import sh.C4029m1;
import sh.C4056v1;
import tf.AbstractC4166m;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: b0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0145k implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f383g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f384h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f385i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f386j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0145k(String str, InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, int i9) {
        this.f383g = 28;
        this.f386j = str;
        this.f384h = interfaceC1231l;
        this.f385i = interfaceC5853o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m717e(Object obj, Object obj2) {
        String str = (String) this.f385i;
        C4957hq c4957hq = (C4957hq) this.f384h;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f386j;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC4955ho.m9296B1("名称", str, null, c1836h0, 6, 4);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            AbstractC4955ho.m9296B1("ID", c4957hq.f17732b.f9494b, null, c1836h0, 6, 4);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = new C4916gi(interfaceC1809a1, 14);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9410P3(zBooleanValue, "启用", "关闭后这个聊天不会按模板自动抢红包", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final Object m718f(Object obj, Object obj2) {
        C5391v0 c5391v0 = (C5391v0) this.f385i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f386j;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            EnumC5325t0 enumC5325t0 = (EnumC5325t0) interfaceC1809a1.getValue();
            boolean z9 = c5391v0.f21263f;
            boolean z10 = c5391v0.f21259b == EnumC5358u0.f20981j;
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4534f(interfaceC1809a12);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = new C4029m1(10, interfaceC1809a1, interfaceC1809a12);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9478Y(enumC5325t0, z9, z10, (InterfaceC1231l) objM4514P, c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m719g(Object obj, Object obj2) {
        int i9;
        List list = (List) this.f385i;
        List list2 = (List) this.f386j;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            c1836h0.m4519V();
        } else if (list.isEmpty()) {
            c1836h0.m4525a0(1331936459);
            AbstractC4955ho.m9657s0("请先新增收款规则模板。", c1836h0, 6);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4525a0(1332026452);
            int i10 = 0;
            for (Object obj3 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                C4298i c4298i = (C4298i) obj3;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    i9 = 0;
                    while (it.hasNext()) {
                        if (AbstractC1416l.m3825a(((C4297h) it.next()).f14292e, c4298i.f14300a) && (i9 = i9 + 1) < 0) {
                            AbstractC0000a.m30P0();
                            throw null;
                        }
                    }
                } else {
                    i9 = 0;
                }
                String str = c4298i.f14301b;
                String str2 = i9 + " 个聊天 · " + AbstractC4955ho.m9698w5(c4298i);
                boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c4298i);
                Object objM4514P = c1836h0.m4514P();
                if (zM4534f || objM4514P == C1851l.f6155a) {
                    objM4514P = new C4056v1(interfaceC1231l, 16, c4298i);
                    c1836h0.m4545k0(objM4514P);
                }
                AbstractC4955ho.m9704x3(str, str2, (InterfaceC1220a) objM4514P, c1836h0, 0);
                if (i10 < list.size() - 1) {
                    c1836h0.m4525a0(540357431);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                } else {
                    c1836h0.m4525a0(-428775367);
                }
                c1836h0.m4553p(false);
                i10 = i11;
            }
            c1836h0.m4553p(false);
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final Object m720h(Object obj, Object obj2) {
        List list = (List) this.f385i;
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f386j;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strM6836i = list.isEmpty() ? "未添加关键词" : AbstractC3199a.m6836i(list.size(), " 个关键词");
            boolean zM4534f = c1836h0.m4534f(interfaceC1220a);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = new C5040kc(interfaceC1220a, 5);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9503b("关键词管理", strM6836i, (InterfaceC1220a) objM4514P, c1836h0, 6);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            AbstractC4955ho.m9402O3(sharedPreferences, "keyword_notify_any_group", "任意关键词-群聊通知", "群聊文字或引用消息都触发", false, c1836h0, 28080);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            AbstractC4955ho.m9402O3(sharedPreferences, "keyword_notify_any_private", "任意关键词-私聊通知", "私聊文字或引用消息都触发", false, c1836h0, 28080);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final Object m721i(Object obj, Object obj2) {
        int i9;
        String str;
        boolean z9;
        Object c5243qh;
        int i10;
        C0765c c0765c = (C0765c) this.f385i;
        Context context = (Context) this.f386j;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            List listM188v = C0014a.m188v(c0765c);
            int i11 = c0765c.f2295h;
            c1836h0.m4525a0(129797599);
            Iterator it = listM188v.iterator();
            int i12 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                C1823e c1823e = C1851l.f6155a;
                if (zHasNext) {
                    Object next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    long jLongValue = ((Number) next).longValue();
                    if (i12 > 0) {
                        c1836h0.m4525a0(-1034457025);
                        z9 = false;
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    } else {
                        z9 = false;
                        c1836h0.m4525a0(-2003383247);
                    }
                    c1836h0.m4553p(z9);
                    String strM2249l = AbstractC0921a.m2249l(i13, "计划时间 ");
                    String strM9511b7 = AbstractC4955ho.m9511b7(jLongValue);
                    boolean zM4538h = c1836h0.m4538h(context) | c1836h0.m4538h(listM188v) | c1836h0.m4532e(jLongValue) | c1836h0.m4530d(i12) | c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0765c);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == c1823e) {
                        C0765c c0765c2 = c0765c;
                        i10 = i13;
                        InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
                        c5243qh = new C5243qh(context, listM188v, jLongValue, interfaceC1231l2, c0765c2, i12);
                        interfaceC1231l = interfaceC1231l2;
                        c0765c = c0765c2;
                        c1836h0.m4545k0(c5243qh);
                    } else {
                        c5243qh = objM4514P;
                        i10 = i13;
                    }
                    AbstractC4955ho.m9503b(strM2249l, strM9511b7, (InterfaceC1220a) c5243qh, c1836h0, 0);
                    i12 = i10;
                } else {
                    c1836h0.m4553p(false);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    boolean zM4538h2 = c1836h0.m4538h(context) | c1836h0.m4538h(listM188v) | c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0765c);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C0467n0((Object) context, (Object) listM188v, interfaceC1231l, (Object) c0765c, 14);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("新增计划时间", "同一任务可在多个时间分别执行", (InterfaceC1220a) objM4514P2, c1836h0, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    if (i11 != 1) {
                        i9 = 2;
                        str = i11 != 2 ? "单次" : "每周";
                    } else {
                        i9 = 2;
                        str = "每天";
                    }
                    List listM101y0 = AbstractC0000a.m101y0(new C4825dq("0", "单次"), new C4825dq("1", "每天"), new C4825dq("2", "每周"));
                    String str2 = str;
                    String strValueOf = String.valueOf(i11);
                    boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0765c);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4534f || objM4514P3 == c1823e) {
                        objM4514P3 = new C5275rg(4, c0765c, interfaceC1231l);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    int i14 = i9;
                    AbstractC4955ho.m9353I2("重复方式", str2, listM101y0, strValueOf, (InterfaceC1231l) objM4514P3, false, c1836h0, 6, 32);
                    if (i11 == i14) {
                        c1836h0.m4525a0(-267694798);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        Set set = c0765c.f2296i;
                        boolean zM4538h3 = c1836h0.m4538h(c0765c) | c1836h0.m4534f(interfaceC1231l);
                        Object objM4514P4 = c1836h0.m4514P();
                        if (zM4538h3 || objM4514P4 == c1823e) {
                            objM4514P4 = new C5275rg(c0765c, interfaceC1231l);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9624o3(set, (InterfaceC1231l) objM4514P4, c1836h0, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-267229674);
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    boolean z10 = c0765c.f2299l;
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0765c);
                    Object objM4514P5 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P5 == c1823e) {
                        objM4514P5 = new C5275rg(6, c0765c, interfaceC1231l);
                        c1836h0.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9410P3(z10, "超时补发", "微信进程错过执行时间后，恢复时自动补发", false, (InterfaceC1231l) objM4514P5, c1836h0, 432, 8);
                }
            }
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    private final Object m722j(Object obj, Object obj2) {
        C0765c c0765c = (C0765c) this.f385i;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f386j;
        ArrayList arrayList = (ArrayList) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strValueOf = String.valueOf(c0765c.f2297j);
            boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0765c);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (zM4534f || objM4514P == c1823e) {
                objM4514P = new C5275rg(7, c0765c, interfaceC1231l);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9695w2("聊天间隔", "单位秒，多个聊天之间的等待时间", strValueOf, (InterfaceC1231l) objM4514P, c1836h0, 54);
            if (arrayList.size() > 1) {
                c1836h0.m4525a0(1279064199);
                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                String strValueOf2 = String.valueOf(c0765c.f2298k);
                boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0765c);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4534f2 || objM4514P2 == c1823e) {
                    objM4514P2 = new C5275rg(8, c0765c, interfaceC1231l);
                    c1836h0.m4545k0(objM4514P2);
                }
                AbstractC4955ho.m9695w2("多条间隔", "单位秒，同一聊天连续发送的等待时间", strValueOf2, (InterfaceC1231l) objM4514P2, c1836h0, 48);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(1279675395);
                c1836h0.m4553p(false);
            }
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    private final Object m723k(Object obj, Object obj2) {
        ArrayList arrayList = ((C4792cp) this.f385i).f16421b;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f386j;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i9 = 0;
            for (Object obj3 : arrayList) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                C4759bp c4759bp = (C4759bp) obj3;
                boolean z9 = c4759bp.f16109b == ((Number) interfaceC1809a1.getValue()).intValue();
                boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4534f(c4759bp) | c1836h0.m4534f(interfaceC1231l);
                Object objM4514P = c1836h0.m4514P();
                if (zM4534f || objM4514P == C1851l.f6155a) {
                    objM4514P = new C0045e(c4759bp, interfaceC1231l, interfaceC1809a1, 28);
                    c1836h0.m4545k0(objM4514P);
                }
                AbstractC4955ho.m9703x2(c4759bp, z9, (InterfaceC1220a) objM4514P, c1836h0, 0);
                if (i9 < arrayList.size() - 1) {
                    c1836h0.m4525a0(-956993136);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                } else {
                    c1836h0.m4525a0(397997312);
                }
                c1836h0.m4553p(false);
                i9 = i10;
            }
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    private final Object m724l(Object obj, Object obj2) {
        C4936h5 c4936h5 = (C4936h5) this.f385i;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f386j;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f384h;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strM6836i = AbstractC3199a.m6836i(c4936h5.f17527b.size(), " 个名单项");
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = new C2209s1(25);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9704x3("已选择", strM6836i, (InterfaceC1220a) objM4514P, c1836h0, 390);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4534f || objM4514P2 == c1823e) {
                objM4514P2 = new C5341tg(interfaceC1809a1, 10);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC4955ho.m9410P3(zBooleanValue, "启用名单", "关闭后保留名单但不参与匹配", false, (InterfaceC1231l) objM4514P2, c1836h0, 432, 8);
            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
            boolean zM3825a = AbstractC1416l.m3825a((String) interfaceC1809a12.getValue(), "exclude");
            boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a12);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P3 == c1823e) {
                objM4514P3 = new C5341tg(interfaceC1809a12, 11);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC4955ho.m9410P3(zM3825a, "排除名单", "开启后这些名单命中时跳过屏蔽", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:419:0x0659 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0278  */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v63, types: [int] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r8v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        int i10;
        Object obj3;
        int i11;
        C1823e c1823e;
        int i12;
        float f3;
        int i13;
        Object c0524k;
        final int i14;
        C1823e c1823e2;
        C2366j c2366j;
        C1836h0 c1836h0;
        ?? r2;
        InterfaceC1220a interfaceC1220a;
        Object obj4;
        int i15;
        Object obj5;
        C1823e c1823e3;
        C1836h0 c1836h02;
        boolean zM4534f;
        C1823e c1823e4;
        Object next;
        switch (this.f383g) {
            case 0:
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) this.f385i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f386j;
                C3874d c3874d = (C3874d) this.f384h;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM4514P = c1836h03.m4514P();
                    if (objM4514P == C1851l.f6155a) {
                        objM4514P = new C0146l(interfaceC1809a1, 0);
                        c1836h03.m4545k0(objM4514P);
                    }
                    InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(interfaceC5853o, (InterfaceC1231l) objM4514P);
                    InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, true);
                    int iHashCode = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l = c1836h03.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM8889m);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y);
                    } else {
                        c1836h03.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, interfaceC4412n0M6930d);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h03, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c);
                    c3874d.invoke(c1836h03, 0);
                    c1836h03.m4553p(true);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                Activity activity = (Activity) this.f385i;
                C3874d c3874d2 = (C3874d) this.f384h;
                C0475p0 c0475p0 = (C0475p0) this.f386j;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0452j1.f1326a.m1467h(activity, AbstractC3879i.m8071e(63693787, new C0151q(c3874d2, 4, c0475p0), c1836h04), c1836h04, 432);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f385i).m1467h((Context) this.f386j, (C3874d) this.f384h, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            case 3:
                C1422r c1422r = (C1422r) this.f385i;
                C2637o2 c2637o2 = (C2637o2) this.f386j;
                C2629m2 c2629m2 = (C2629m2) this.f384h;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM6095h = c2637o2.m6095h(c2637o2.m6091d(fFloatValue - c1422r.f4735g));
                C2637o2 c2637o22 = c2629m2.f8556a;
                c1422r.f4735g += c2637o2.m6091d(c2637o2.m6094g(c2637o22.m6090c(c2637o22.f8598k, jM6095h, 1)));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4634s.m9064g((InterfaceC5853o) this.f385i, (C1511d1) this.f386j, (C3874d) this.f384h, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
            case 5:
                C0414a c0414a = (C0414a) this.f385i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f386j;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f384h;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h05, 0);
                    int iHashCode2 = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l2 = c1836h05.m4546l();
                    C5850l c5850l = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h05, c5850l);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(c5660y2);
                    } else {
                        c1836h05.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h05, c3256tM6935a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h05, c3878hM4546l2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h05, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h05);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h05, interfaceC5853oM10543c2);
                    AbstractC4045s.m8250n(AbstractC0921a.m2251n("确定删除“", c0414a.f1180b, "”？聊天记录、联系人和群聊不会被删除。"), null, ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24576, 0, 262122);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h05, 6);
                    int iHashCode3 = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l3 = c1836h05.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h05, interfaceC5853oM6886p);
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(c5660y2);
                    } else {
                        c1836h05.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h05, c3213e1M6892a);
                    AbstractC1874r.m4615A(c5597e2, c1836h05, c3878hM4546l3);
                    AbstractC2091b.m5169p(iHashCode3, c1836h05, c5597e3, c1836h05, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h05, interfaceC5853oM10543c3);
                    boolean zM4534f2 = c1836h05.m4534f(interfaceC1809a12);
                    Object objM4514P2 = c1836h05.m4514P();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zM4534f2 || objM4514P2 == c1823e5) {
                        objM4514P2 = new C0144j(interfaceC1809a12, 17);
                        c1836h05.m4545k0(objM4514P2);
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P2;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a3, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 6, 1912);
                    boolean zM4534f3 = c1836h05.m4534f(interfaceC1809a12) | c1836h05.m4534f(interfaceC1220a2);
                    Object objM4514P3 = c1836h05.m4514P();
                    if (zM4534f3 || objM4514P3 == c1823e5) {
                        objM4514P3 = new C5095m1(interfaceC1220a2, interfaceC1809a12, 0);
                        c1836h05.m4545k0(objM4514P3);
                    }
                    InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P3;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("确认删除", interfaceC1220a4, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 6, 1912);
                    c1836h05.m4553p(true);
                    c1836h05.m4553p(true);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                List list = (List) this.f385i;
                ArrayList arrayList = (ArrayList) this.f386j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f384h;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i16 = 1;
                if (!c1836h06.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c1836h06.m4519V();
                } else if (list.isEmpty()) {
                    c1836h06.m4525a0(-685832523);
                    AbstractC4955ho.m9657s0("暂无聊天分组", c1836h06, 6);
                    c1836h06.m4553p(false);
                } else if (arrayList.isEmpty()) {
                    c1836h06.m4525a0(-685830440);
                    AbstractC4955ho.m9657s0("没有匹配的聊天分组", c1836h06, 6);
                    c1836h06.m4553p(false);
                } else {
                    c1836h06.m4525a0(214180076);
                    int i17 = 0;
                    for (Object obj6 : arrayList) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C4900g2 c4900g2 = (C4900g2) obj6;
                        int i19 = c4900g2.f17325b;
                        C0414a c0414a2 = c4900g2.f17324a;
                        String strM1020i = AbstractC0255e.m1020i(AbstractC3156t.m6736Z(i19, "  "), c0414a2.f1180b);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c0414a2.f1183e.size());
                        sb2.append(" 个直属会话");
                        if (list.isEmpty()) {
                            i9 = i16;
                            i10 = 0;
                        } else {
                            Iterator it = list.iterator();
                            int i20 = 0;
                            while (it.hasNext()) {
                                int i21 = i16;
                                if (AbstractC1416l.m3825a(((C0414a) it.next()).f1181c, c0414a2.f1179a) && (i20 = i20 + 1) < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                                i16 = i21;
                            }
                            i9 = i16;
                            i10 = i20;
                        }
                        if (i10 > 0) {
                            sb2.append(" · ");
                            sb2.append(i10);
                            sb2.append(" 个子分组");
                        }
                        if (c4900g2.f17325b > 0) {
                            sb2.append("\n");
                            sb2.append(c4900g2.f17326c);
                        }
                        String string = sb2.toString();
                        boolean zM4534f4 = c1836h06.m4534f(interfaceC1231l) | c1836h06.m4538h(c4900g2);
                        Object objM4514P4 = c1836h06.m4514P();
                        if (!zM4534f4) {
                            obj3 = objM4514P4;
                            if (objM4514P4 == C1851l.f6155a) {
                                C4736b2 c4736b2 = new C4736b2(interfaceC1231l, c4900g2, 0);
                                c1836h06.m4545k0(c4736b2);
                                obj3 = c4736b2;
                            }
                        }
                        AbstractC4955ho.m9704x3(strM1020i, string, (InterfaceC1220a) obj3, c1836h06, 0);
                        if (i17 < arrayList.size() - 1) {
                            c1836h06.m4525a0(582173041);
                            i11 = i9;
                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, i11);
                        } else {
                            i11 = i9;
                            c1836h06.m4525a0(867508543);
                        }
                        c1836h06.m4553p(false);
                        i16 = i11;
                        i17 = i18;
                    }
                    c1836h06.m4553p(false);
                }
                return C3967n.f12976a;
            case 7:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f385i).m9905n((Activity) this.f386j, (C3874d) this.f384h, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            case 8:
                Activity activity2 = (Activity) this.f385i;
                C3874d c3874d3 = (C3874d) this.f384h;
                C0482r0 c0482r0 = (C0482r0) this.f386j;
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C5491y2.f22060h.m9905n(activity2, AbstractC3879i.m8071e(961891475, new C0151q(c3874d3, 15, c0482r0), c1836h07), c1836h07, 432);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f385i).m9903m((String) this.f386j, (InterfaceC1231l) this.f384h, (C1836h0) obj, AbstractC1874r.m4617C(28039));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f385i).m9907o((Context) this.f386j, (C3874d) this.f384h, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            case 11:
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f386j;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f385i;
                String str = (String) this.f384h;
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    boolean zM4534f5 = c1836h08.m4534f(interfaceC1809a13) | c1836h08.m4538h(sharedPreferences) | c1836h08.m4534f(str);
                    Object objM4514P5 = c1836h08.m4514P();
                    if (zM4534f5 || objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C5402vb(sharedPreferences, str, interfaceC1809a13, 3);
                        c1836h08.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "使用非好友", "仅在伪评论选择器中额外加入群成员", false, (InterfaceC1231l) objM4514P5, c1836h08, 432, 8);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f385i;
                Context context = (Context) this.f384h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f386j;
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    String str2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue() ? "记录 Java、Native 和 ANR 异常，并在下次启动时显示日志" : "关闭后不再捕获或弹出异常日志";
                    boolean zM4538h = c1836h09.m4538h(sharedPreferences2) | c1836h09.m4538h(context);
                    Object objM4514P6 = c1836h09.m4514P();
                    if (zM4538h || objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C5337tc(sharedPreferences2, context, interfaceC1809a14, 7);
                        c1836h09.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "捕获异常日志", str2, false, (InterfaceC1231l) objM4514P6, c1836h09, 48, 8);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 13:
                Activity activity3 = (Activity) this.f385i;
                Context context2 = (Context) this.f386j;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f384h;
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zM4538h2 = c1836h010.m4538h(activity3) | c1836h010.m4538h(context2);
                    Object objM4514P7 = c1836h010.m4514P();
                    C1823e c1823e6 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P7 == c1823e6) {
                        objM4514P7 = new C4056v1(activity3, 12, context2);
                        c1836h010.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9503b("导出配置", HttpUrl.FRAGMENT_ENCODE_SET, (InterfaceC1220a) objM4514P7, c1836h010, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                    boolean zM4538h3 = c1836h010.m4538h(activity3) | c1836h010.m4538h(context2) | c1836h010.m4534f(interfaceC1220a5);
                    Object objM4514P8 = c1836h010.m4514P();
                    if (zM4538h3 || objM4514P8 == c1823e6) {
                        objM4514P8 = new C0045e(activity3, context2, interfaceC1220a5, 19);
                        c1836h010.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9503b("导入配置", HttpUrl.FRAGMENT_ENCODE_SET, (InterfaceC1220a) objM4514P8, c1836h010, 54);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 14:
                final InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f386j;
                final Context context3 = (Context) this.f385i;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f384h;
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                boolean z9 = false;
                if (c1836h011.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zIsEmpty = ((List) interfaceC1809a15.getValue()).isEmpty();
                    float f10 = 0.0f;
                    C1823e c1823e7 = C1851l.f6155a;
                    if (zIsEmpty) {
                        c1836h011.m4525a0(1428165309);
                        AbstractC4045s.m8250n("暂无快捷项", AbstractC3208d.m6883m(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 16, 18), ((C0314b) c1836h011.m4542j(AbstractC0316d.f944a)).m1238h(), 0L, null, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h011, 54, 0, 261112);
                        C1836h0 c1836h012 = c1836h011;
                        c1836h012.m4553p(false);
                        f3 = 0.0f;
                        c1823e = c1823e7;
                        i12 = 1;
                        r2 = 0;
                        c1836h0 = c1836h012;
                    } else {
                        int i22 = 1;
                        c1836h011.m4525a0(1428599154);
                        int i23 = 0;
                        for (Object obj7 : (List) interfaceC1809a15.getValue()) {
                            int i24 = i23 + 1;
                            if (i23 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C2366j c2366j2 = (C2366j) obj7;
                            if (i23 > 0) {
                                c1836h011.m4525a0(-193175619);
                                AbstractC4955ho.m9312D1(f10, c1836h011, z9 ? 1 : 0, i22);
                            } else {
                                c1836h011.m4525a0(-1693463437);
                            }
                            c1836h011.m4553p(z9);
                            boolean z10 = z9 ? 1 : 0;
                            ?? r82 = z9;
                            if (i23 > 0) {
                                r82 = i22;
                            }
                            int i25 = i23 < AbstractC0000a.m54b0((List) interfaceC1809a15.getValue()) ? i22 : z10 ? 1 : 0;
                            boolean zM4538h4 = c1836h011.m4538h(context3) | c1836h011.m4530d(i23) | c1836h011.m4538h(c2366j2);
                            Object objM4514P9 = c1836h011.m4514P();
                            if (zM4538h4 || objM4514P9 == c1823e7) {
                                i13 = i22;
                                i14 = i23;
                                c1823e2 = c1823e7;
                                c2366j = c2366j2;
                                c0524k = new C0524k(interfaceC1809a15, i14, c2366j, context3, 7);
                                c1836h011.m4545k0(c0524k);
                            } else {
                                i13 = i22;
                                c0524k = objM4514P9;
                                c1823e2 = c1823e7;
                                c2366j = c2366j2;
                                i14 = i23;
                            }
                            InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) c0524k;
                            boolean zM4530d = c1836h011.m4530d(i14) | c1836h011.m4538h(context3);
                            Object objM4514P10 = c1836h011.m4514P();
                            Object obj8 = objM4514P10;
                            if (zM4530d || objM4514P10 == c1823e2) {
                                final int i26 = 0;
                                InterfaceC1220a interfaceC1220a6 = new InterfaceC1220a() { // from class: wb.hg
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                int i27 = i14;
                                                if (i27 > 0) {
                                                    InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a15;
                                                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a17.getValue());
                                                    arrayListM8409R1.add(i27 - 1, (C2366j) arrayListM8409R1.remove(i27));
                                                    AbstractC4955ho.m9455V0(context3, interfaceC1809a17, arrayListM8409R1);
                                                }
                                                break;
                                            default:
                                                InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a15;
                                                int iM54b0 = AbstractC0000a.m54b0((List) interfaceC1809a18.getValue());
                                                int i28 = i14;
                                                if (i28 < iM54b0) {
                                                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a18.getValue());
                                                    arrayListM8409R12.add(i28 + 1, (C2366j) arrayListM8409R12.remove(i28));
                                                    AbstractC4955ho.m9455V0(context3, interfaceC1809a18, arrayListM8409R12);
                                                }
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h011.m4545k0(interfaceC1220a6);
                                obj8 = interfaceC1220a6;
                            }
                            InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) obj8;
                            boolean zM4530d2 = c1836h011.m4530d(i14) | c1836h011.m4538h(context3);
                            Object objM4514P11 = c1836h011.m4514P();
                            Object obj9 = objM4514P11;
                            if (zM4530d2 || objM4514P11 == c1823e2) {
                                final int i27 = 1;
                                InterfaceC1220a interfaceC1220a8 = new InterfaceC1220a() { // from class: wb.hg
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                int i272 = i14;
                                                if (i272 > 0) {
                                                    InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a15;
                                                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a17.getValue());
                                                    arrayListM8409R1.add(i272 - 1, (C2366j) arrayListM8409R1.remove(i272));
                                                    AbstractC4955ho.m9455V0(context3, interfaceC1809a17, arrayListM8409R1);
                                                }
                                                break;
                                            default:
                                                InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a15;
                                                int iM54b0 = AbstractC0000a.m54b0((List) interfaceC1809a18.getValue());
                                                int i28 = i14;
                                                if (i28 < iM54b0) {
                                                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a18.getValue());
                                                    arrayListM8409R12.add(i28 + 1, (C2366j) arrayListM8409R12.remove(i28));
                                                    AbstractC4955ho.m9455V0(context3, interfaceC1809a18, arrayListM8409R12);
                                                }
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h011.m4545k0(interfaceC1220a8);
                                obj9 = interfaceC1220a8;
                            }
                            InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) obj9;
                            boolean zM4538h5 = c1836h011.m4538h(c2366j);
                            Object objM4514P12 = c1836h011.m4514P();
                            Object obj10 = objM4514P12;
                            if (zM4538h5 || objM4514P12 == c1823e2) {
                                C4056v1 c4056v1 = new C4056v1(c2366j, 15, interfaceC1809a16);
                                c1836h011.m4545k0(c4056v1);
                                obj10 = c4056v1;
                            }
                            InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) obj10;
                            boolean zM4538h6 = c1836h011.m4538h(context3) | c1836h011.m4538h(c2366j);
                            Object objM4514P13 = c1836h011.m4514P();
                            if (zM4538h6 || objM4514P13 == c1823e2) {
                                objM4514P13 = new C0045e(context3, c2366j, interfaceC1809a15, 25);
                                c1836h011.m4545k0(objM4514P13);
                            }
                            AbstractC4955ho.m9463W0(c2366j, r82, i25, interfaceC1231l2, interfaceC1220a7, interfaceC1220a9, interfaceC1220a10, (InterfaceC1220a) objM4514P13, c1836h011, 0);
                            z9 = false;
                            i22 = i13;
                            i23 = i24;
                            c1823e7 = c1823e2;
                            f10 = 0.0f;
                        }
                        c1823e = c1823e7;
                        i12 = i22;
                        boolean z11 = z9 ? 1 : 0;
                        c1836h011.m4553p(z11);
                        f3 = 0.0f;
                        r2 = z11;
                        c1836h0 = c1836h011;
                    }
                    AbstractC4955ho.m9312D1(f3, c1836h0, r2, i12);
                    Object objM4514P14 = c1836h0.m4514P();
                    Object obj11 = objM4514P14;
                    if (objM4514P14 == c1823e) {
                        C0500x0 c0500x0 = new C0500x0(25, interfaceC1809a15, interfaceC1809a16);
                        c1836h0.m4545k0(c0500x0);
                        obj11 = c0500x0;
                    }
                    AbstractC4955ho.m9503b("新增快捷项", "添加微信页面、模块设置或插件 Agent 入口", (InterfaceC1220a) obj11, c1836h0, 438);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 15:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f385i;
                Set set = (Set) this.f386j;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) this.f384h;
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC4955ho.m9402O3(sharedPreferences3, "qq_music_order_enable", "启用 QQ 点歌", "在聊天中响应点歌指令", false, c1836h013, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "qq_music_order_intercept_own_command", "拦截自己的点歌指令", "点击发送后不发送原指令，直接执行点歌", false, c1836h013, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "qq_music_order_send_as_card", "点歌发送卡片", "开启后发送音乐卡片，可与歌曲语音同时发送", true, c1836h013, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "qq_music_order_send_as_voice", "点歌发送语音", "开启后发送歌曲语音，可与音乐卡片同时发送", false, c1836h013, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                    AbstractC4955ho.m9503b("允许他人点歌的聊天", set.isEmpty() ? "未选择" : AbstractC0921a.m2250m(set.size(), "已选 ", " 个聊天"), interfaceC1220a11, c1836h013, 6);
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            case 16:
                C4521a c4521a = (C4521a) this.f385i;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f386j;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f384h;
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String strM9355I4 = AbstractC4955ho.m9355I4(c4521a.f14904h);
                    boolean zM4534f6 = c1836h014.m4534f(interfaceC1231l3) | c1836h014.m4538h(c4521a);
                    Object objM4514P15 = c1836h014.m4514P();
                    C1823e c1823e8 = C1851l.f6155a;
                    if (zM4534f6 || objM4514P15 == c1823e8) {
                        objM4514P15 = new C4842ea(interfaceC1231l3, c4521a, 1);
                        c1836h014.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9503b("选择消息类型", strM9355I4, (InterfaceC1220a) objM4514P15, c1836h014, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h014, 0, 1);
                    boolean z12 = c4521a.f14907k;
                    boolean zM4534f7 = c1836h014.m4534f(interfaceC1231l4) | c1836h014.m4538h(c4521a);
                    Object objM4514P16 = c1836h014.m4514P();
                    if (zM4534f7 || objM4514P16 == c1823e8) {
                        objM4514P16 = new C5209pg(interfaceC1231l4, c4521a, 0);
                        c1836h014.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9410P3(z12, "包含关键词", "开启后仅转发命中关键词的消息", false, (InterfaceC1231l) objM4514P16, c1836h014, 432, 8);
                    if (c4521a.f14907k) {
                        c1836h014.m4525a0(1991504166);
                        AbstractC4955ho.m9312D1(0.0f, c1836h014, 0, 1);
                        String str3 = c4521a.f14908l;
                        boolean zM4534f8 = c1836h014.m4534f(interfaceC1231l4) | c1836h014.m4538h(c4521a);
                        Object objM4514P17 = c1836h014.m4514P();
                        if (zM4534f8 || objM4514P17 == c1823e8) {
                            objM4514P17 = new C5209pg(interfaceC1231l4, c4521a, 1);
                            c1836h014.m4545k0(objM4514P17);
                        }
                        AbstractC4955ho.m9304C1("包含关键词内容", "多个关键词用 |、逗号或换行分隔", str3, 2, (InterfaceC1231l) objM4514P17, c1836h014, 3126, 0);
                        c1836h014.m4553p(false);
                    } else {
                        c1836h014.m4525a0(1991764597);
                        c1836h014.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h014, 0, 1);
                    boolean z13 = c4521a.f14909m;
                    boolean zM4534f9 = c1836h014.m4534f(interfaceC1231l4) | c1836h014.m4538h(c4521a);
                    Object objM4514P18 = c1836h014.m4514P();
                    if (zM4534f9 || objM4514P18 == c1823e8) {
                        objM4514P18 = new C5209pg(interfaceC1231l4, c4521a, 2);
                        c1836h014.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9410P3(z13, "排除关键词", "开启后不转发命中关键词的消息", false, (InterfaceC1231l) objM4514P18, c1836h014, 432, 8);
                    if (c4521a.f14909m) {
                        c1836h014.m4525a0(1992056710);
                        AbstractC4955ho.m9312D1(0.0f, c1836h014, 0, 1);
                        String str4 = c4521a.f14910n;
                        boolean zM4534f10 = c1836h014.m4534f(interfaceC1231l4) | c1836h014.m4538h(c4521a);
                        Object objM4514P19 = c1836h014.m4514P();
                        if (zM4534f10 || objM4514P19 == c1823e8) {
                            objM4514P19 = new C5209pg(interfaceC1231l4, c4521a, 3);
                            c1836h014.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9304C1("排除关键词内容", "多个关键词用 |、逗号或换行分隔", str4, 2, (InterfaceC1231l) objM4514P19, c1836h014, 3126, 0);
                        c1836h014.m4553p(false);
                    } else {
                        c1836h014.m4525a0(1992317141);
                        c1836h014.m4553p(false);
                    }
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
            case 17:
                C0765c c0765c = (C0765c) this.f385i;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f386j;
                InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) this.f384h;
                C1836h0 c1836h015 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h015.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ArrayList arrayListM9445T6 = AbstractC4955ho.m9445T6(c0765c);
                    int i28 = c0765c.f2308u;
                    int i29 = c0765c.f2305r;
                    boolean zIsEmpty2 = arrayListM9445T6.isEmpty();
                    C1823e c1823e9 = C1851l.f6155a;
                    if (zIsEmpty2) {
                        C1823e c1823e10 = c1823e9;
                        c1836h015.m4525a0(-355515092);
                        String str5 = i29 != 1 ? "朋友圈" : "聊天";
                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("0", "聊天"), new C4825dq("1", "朋友圈"));
                        String strValueOf = String.valueOf(i29);
                        zM4534f = c1836h015.m4534f(interfaceC1231l5) | c1836h015.m4538h(c0765c);
                        Object objM4514P20 = c1836h015.m4514P();
                        if (zM4534f) {
                            c1823e4 = c1823e10;
                            if (objM4514P20 == c1823e4) {
                            }
                            c1836h02 = c1836h015;
                            i15 = i29;
                            obj5 = "1";
                            obj4 = "0";
                            interfaceC1220a = interfaceC1220a12;
                            c1823e3 = c1823e4;
                            AbstractC4955ho.m9353I2("发送到", str5, listM101y0, strValueOf, (InterfaceC1231l) objM4514P20, false, c1836h02, 6, 32);
                            c1836h02.m4553p(false);
                            if (i15 != 0) {
                                c1836h02.m4525a0(-354761978);
                                AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                String str6 = i28 == 1 ? "微信原生群发助手" : "模块通道";
                                List listM101y02 = AbstractC0000a.m101y0(new C4825dq(obj4, "模块通道"), new C4825dq(obj5, "微信原生群发助手"));
                                String strValueOf2 = String.valueOf(i28);
                                boolean zM4534f11 = c1836h02.m4534f(interfaceC1231l5) | c1836h02.m4538h(c0765c);
                                Object objM4514P21 = c1836h02.m4514P();
                                if (zM4534f11 || objM4514P21 == c1823e3) {
                                    objM4514P21 = new C5275rg(11, c0765c, interfaceC1231l5);
                                    c1836h02.m4545k0(objM4514P21);
                                }
                                AbstractC4955ho.m9353I2("发送通道", str6, listM101y02, strValueOf2, (InterfaceC1231l) objM4514P21, false, c1836h02, 6, 32);
                                AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                String str7 = i28 == 1 ? "选择好友" : "选择聊天";
                                String strM9502a7 = AbstractC4955ho.m9502a7(c0765c.f2293f);
                                InterfaceC1220a interfaceC1220a13 = interfaceC1220a;
                                boolean zM4534f12 = c1836h02.m4534f(interfaceC1220a13);
                                Object objM4514P22 = c1836h02.m4514P();
                                if (zM4534f12 || objM4514P22 == c1823e3) {
                                    objM4514P22 = new C5040kc(interfaceC1220a13, 21);
                                    c1836h02.m4545k0(objM4514P22);
                                }
                                AbstractC4955ho.m9503b(str7, strM9502a7, (InterfaceC1220a) objM4514P22, c1836h02, 0);
                                c1836h02.m4553p(false);
                            } else {
                                c1836h02.m4525a0(-353089838);
                                c1836h02.m4553p(false);
                            }
                        } else {
                            c1823e4 = c1823e10;
                        }
                        objM4514P20 = new C5275rg(10, c0765c, interfaceC1231l5);
                        c1836h015.m4545k0(objM4514P20);
                        c1836h02 = c1836h015;
                        i15 = i29;
                        obj5 = "1";
                        obj4 = "0";
                        interfaceC1220a = interfaceC1220a12;
                        c1823e3 = c1823e4;
                        AbstractC4955ho.m9353I2("发送到", str5, listM101y0, strValueOf, (InterfaceC1231l) objM4514P20, false, c1836h02, 6, 32);
                        c1836h02.m4553p(false);
                        if (i15 != 0) {
                        }
                    } else {
                        Iterator it2 = arrayListM9445T6.iterator();
                        while (it2.hasNext()) {
                            if (((C0763a) it2.next()).f2286a == 8) {
                                c1836h015.m4525a0(-355621794);
                                AbstractC4955ho.m9296B1("发送到", "聊天", null, c1836h015, 54, 4);
                                c1836h015.m4553p(false);
                                interfaceC1220a = interfaceC1220a12;
                                obj4 = "0";
                                i15 = i29;
                                obj5 = "1";
                                c1823e3 = c1823e9;
                                c1836h02 = c1836h015;
                                if (i15 != 0) {
                                }
                            } else {
                                c1823e9 = c1823e9;
                            }
                        }
                        C1823e c1823e102 = c1823e9;
                        c1836h015.m4525a0(-355515092);
                        if (i29 != 1) {
                        }
                        List listM101y03 = AbstractC0000a.m101y0(new C4825dq("0", "聊天"), new C4825dq("1", "朋友圈"));
                        String strValueOf3 = String.valueOf(i29);
                        zM4534f = c1836h015.m4534f(interfaceC1231l5) | c1836h015.m4538h(c0765c);
                        Object objM4514P202 = c1836h015.m4514P();
                        if (zM4534f) {
                        }
                        objM4514P202 = new C5275rg(10, c0765c, interfaceC1231l5);
                        c1836h015.m4545k0(objM4514P202);
                        c1836h02 = c1836h015;
                        i15 = i29;
                        obj5 = "1";
                        obj4 = "0";
                        interfaceC1220a = interfaceC1220a12;
                        c1823e3 = c1823e4;
                        AbstractC4955ho.m9353I2("发送到", str5, listM101y03, strValueOf3, (InterfaceC1231l) objM4514P202, false, c1836h02, 6, 32);
                        c1836h02.m4553p(false);
                        if (i15 != 0) {
                        }
                    }
                } else {
                    c1836h015.m4519V();
                }
                return C3967n.f12976a;
            case 18:
                List list2 = (List) this.f385i;
                ArrayList arrayList2 = (ArrayList) this.f384h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f386j;
                C1836h0 c1836h016 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!c1836h016.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    c1836h016.m4519V();
                } else if (list2.isEmpty()) {
                    c1836h016.m4525a0(-549788779);
                    AbstractC4955ho.m9657s0("暂无模板。先进入“回复模板管理”新增模板。", c1836h016, 6);
                    c1836h016.m4553p(false);
                } else {
                    c1836h016.m4525a0(-549689579);
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (((C3104q) next).f10045a.equals((String) interfaceC1809a17.getValue())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    C3104q c3104q = (C3104q) next;
                    String strM9608m5 = c3104q != null ? AbstractC4955ho.m9608m5(c3104q) : "未选择";
                    String str8 = (String) interfaceC1809a17.getValue();
                    boolean zM4534f13 = c1836h016.m4534f(interfaceC1809a17);
                    Object objM4514P23 = c1836h016.m4514P();
                    if (zM4534f13 || objM4514P23 == C1851l.f6155a) {
                        objM4514P23 = new C5177oh(interfaceC1809a17, 10);
                        c1836h016.m4545k0(objM4514P23);
                    }
                    AbstractC4955ho.m9353I2("选择模板", strM9608m5, arrayList2, str8, (InterfaceC1231l) objM4514P23, false, c1836h016, 6, 32);
                    c1836h016.m4553p(false);
                }
                return C3967n.f12976a;
            case 19:
                return m717e(obj, obj2);
            case 20:
                return m718f(obj, obj2);
            case 21:
                return m719g(obj, obj2);
            case 22:
                return m720h(obj, obj2);
            case 23:
                return m721i(obj, obj2);
            case 24:
                return m722j(obj, obj2);
            case 25:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9616n4((String) this.f385i, (String) this.f386j, (InterfaceC1231l) this.f384h, (C1836h0) obj, AbstractC1874r.m4617C(391));
                break;
            case 26:
                return m723k(obj, obj2);
            case 27:
                return m724l(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9385M2((String) this.f386j, (InterfaceC1231l) this.f384h, (InterfaceC5853o) this.f385i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                C5709b c5709b = (C5709b) this.f385i;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f386j;
                InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) this.f384h;
                C1836h0 c1836h017 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h017.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean z14 = c5709b.f23216r;
                    boolean zM4534f14 = c1836h017.m4534f(interfaceC1231l6) | c1836h017.m4538h(c5709b);
                    Object objM4514P24 = c1836h017.m4514P();
                    if (zM4534f14 || objM4514P24 == C1851l.f6155a) {
                        objM4514P24 = new C5113mj(12, interfaceC1231l6, c5709b);
                        c1836h017.m4545k0(objM4514P24);
                    }
                    AbstractC4955ho.m9410P3(z14, "引用回复", "文本和 AI 可引用原消息回复", false, (InterfaceC1231l) objM4514P24, c1836h017, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h017, 0, 1);
                    AbstractC4955ho.m9503b("回复步骤", AbstractC4955ho.m9599l5(c5709b.f23217s), interfaceC1220a14, c1836h017, 6);
                } else {
                    c1836h017.m4519V();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0145k(InterfaceC1809a1 interfaceC1809a1, Object obj, Object obj2, int i9) {
        this.f383g = i9;
        this.f386j = interfaceC1809a1;
        this.f385i = obj;
        this.f384h = obj2;
    }

    public /* synthetic */ C0145k(Object obj, Object obj2, Object obj3, int i9) {
        this.f383g = i9;
        this.f385i = obj;
        this.f386j = obj2;
        this.f384h = obj3;
    }

    public /* synthetic */ C0145k(Object obj, Object obj2, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        this.f383g = i10;
        this.f385i = obj;
        this.f386j = obj2;
        this.f384h = interfaceC3955b;
    }

    public /* synthetic */ C0145k(int i9, Object obj, Object obj2, Object obj3, boolean z9) {
        this.f383g = i9;
        this.f385i = obj;
        this.f384h = obj2;
        this.f386j = obj3;
    }
}
