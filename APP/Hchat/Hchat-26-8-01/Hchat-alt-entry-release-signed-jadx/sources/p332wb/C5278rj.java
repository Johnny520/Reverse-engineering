package p332wb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import bi.AbstractC0316d;
import bi.C0314b;
import gb.C1379c;
import gb.C1391o;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p028c1.AbstractC0378h;
import p036c9.C0467n0;
import p036c9.C0475p0;
import p063e9.C0832c;
import p063e9.C0848s;
import p065eb.C0859c0;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p080fb.C1107c;
import p080fb.C1113d1;
import p080fb.C1165q1;
import p080fb.C1186w;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p177m2.AbstractC2772p;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3211e;
import p222p.C3213e1;
import p222p.C3216f1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p249qg.InterfaceC3599t;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p280t2.C4095k;
import p306v.AbstractC4360e;
import p315v8.C4521a;
import p315v8.C4538r;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5843e;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.rj */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5278rj implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20470g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f20471h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f20472i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f20473j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5278rj(String str, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1) {
        this.f20470g = 14;
        this.f20471h = str;
        this.f20472i = interfaceC1220a;
        this.f20473j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m9741e(Object obj, Object obj2) {
        boolean z9;
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f20472i;
        C0035c c0035c = (C0035c) this.f20471h;
        C0467n0 c0467n0 = (C0467n0) this.f20473j;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4639u(null);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = AbstractC1874r.m4639u(0);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P2;
            Object objM4514P3 = c1836h0.m4514P();
            if (objM4514P3 == c1823e) {
                objM4514P3 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P3);
            }
            InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) objM4514P3;
            Object objM4514P4 = c1836h0.m4514P();
            if (objM4514P4 == c1823e) {
                objM4514P4 = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P4);
            }
            InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) objM4514P4;
            Object objM4514P5 = c1836h0.m4514P();
            if (objM4514P5 == c1823e) {
                objM4514P5 = AbstractC1874r.m4632n(c1836h0);
                c1836h0.m4545k0(objM4514P5);
            }
            InterfaceC3599t interfaceC3599t = (InterfaceC3599t) objM4514P5;
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h0, 0);
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6901d);
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
            float f3 = 10;
            AbstractC4045s.m8250n("发送到当前聊天？", AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 4, 0.0f, 0.0f, f3, 6), ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h0, 24630, 0, 261096);
            C5491y2 c5491y2 = C5491y2.f22068p;
            c5491y2.m9913r((String) interfaceC1809a1.getValue(), ((Number) interfaceC1809a12.getValue()).intValue(), ((Boolean) interfaceC1809a13.getValue()).booleanValue(), (String) interfaceC1809a14.getValue(), c1836h0, 24576);
            InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f3, 0.0f, 6, 5);
            C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(8), C5840b.f23770p, c1836h0, 6);
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
            C3216f1 c3216f1 = C3216f1.f10272a;
            c5491y2.m9899k("取消", interfaceC1220a, c3216f1.m6897a(c5850l, true), false, c1836h0, 24582, 8);
            String str = ((String) interfaceC1809a1.getValue()) == null ? "预览" : "重载";
            boolean zM4538h = c1836h0.m4538h(interfaceC3599t) | c1836h0.m4534f(c0035c);
            Object objM4514P6 = c1836h0.m4514P();
            if (zM4538h || objM4514P6 == c1823e) {
                z9 = true;
                C0475p0 c0475p0 = new C0475p0(interfaceC3599t, interfaceC1809a13, interfaceC1809a14, c0035c, interfaceC1809a1, interfaceC1809a12, 17);
                c1836h0.m4545k0(c0475p0);
                objM4514P6 = c0475p0;
            } else {
                z9 = true;
            }
            c5491y2.m9899k(str, (InterfaceC1220a) objM4514P6, c3216f1.m6897a(c5850l, z9), false, c1836h0, 24576, 8);
            boolean zM4534f = c1836h0.m4534f(interfaceC1220a) | c1836h0.m4534f(c0467n0);
            Object objM4514P7 = c1836h0.m4514P();
            if (zM4534f || objM4514P7 == c1823e) {
                objM4514P7 = new C5475xi(interfaceC1220a, 22, c0467n0);
                c1836h0.m4545k0(objM4514P7);
            }
            c5491y2.m9899k("发送", (InterfaceC1220a) objM4514P7, c3216f1.m6897a(c5850l, z9), true, c1836h0, 27654, 0);
            c1836h0.m4553p(z9);
            c1836h0.m4553p(z9);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        C0832c c0832c;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1809a1 interfaceC1809a12;
        switch (this.f20470g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9651r3((Context) this.f20471h, (C0859c0) this.f20473j, (InterfaceC1220a) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(65));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9391N0((Context) this.f20471h, (C4871f6) this.f20473j, (InterfaceC1220a) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9335G0((C4770c3) this.f20471h, (InterfaceC1220a) this.f20472i, (InterfaceC1231l) this.f20473j, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 3:
                Context context = (Context) this.f20471h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f20473j;
                C0848s c0848s = (C0848s) this.f20472i;
                C0832c c0832c2 = (C0832c) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                c0832c2.getClass();
                List<C0832c> list = (List) interfaceC1809a13.getValue();
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list));
                for (C0832c c0832cM2114a : list) {
                    if (AbstractC1416l.m3825a(c0832cM2114a.f2511b, c0832c2.f2511b)) {
                        c0832c = c0832c2;
                        arrayList = arrayList3;
                        c0832cM2114a = C0832c.m2114a(c0832cM2114a, null, null, null, false, false, zBooleanValue, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388575);
                    } else {
                        c0832c = c0832c2;
                        arrayList = arrayList3;
                    }
                    arrayList.add(c0832cM2114a);
                    arrayList3 = arrayList;
                    c0832c2 = c0832c;
                }
                AbstractC4955ho.m9603m0(c0848s, interfaceC1809a13, arrayList3);
                Toast.makeText(context, zBooleanValue ? "已启用该会话规则" : "已关闭该会话规则", 0).show();
                break;
            case 4:
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f20473j;
                C4538r c4538r = (C4538r) this.f20472i;
                Context context2 = (Context) this.f20471h;
                C4521a c4521a = (C4521a) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                c4521a.getClass();
                List<C4521a> list2 = (List) interfaceC1809a14.getValue();
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list2));
                for (C4521a c4521aM8946a : list2) {
                    if (c4521aM8946a.f14897a.equals(c4521a.f14897a)) {
                        arrayList2 = arrayList4;
                        c4521aM8946a = C4521a.m8946a(c4521a, null, zBooleanValue2, false, null, null, null, null, false, 0L, false, null, false, null, 16379);
                    } else {
                        arrayList2 = arrayList4;
                    }
                    arrayList2.add(c4521aM8946a);
                    arrayList4 = arrayList2;
                }
                AbstractC4955ho.m9584k(c4538r, context2, interfaceC1809a14, arrayList4);
                return C3967n.f12976a;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9711y2((C4792cp) this.f20471h, (InterfaceC1220a) this.f20472i, (InterfaceC1231l) this.f20473j, (C1836h0) obj, AbstractC1874r.m4617C(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9611n((Set) this.f20471h, (InterfaceC1220a) this.f20472i, (InterfaceC1231l) this.f20473j, (C1836h0) obj, AbstractC1874r.m4617C(49));
                break;
            case 7:
                C1391o c1391o = (C1391o) this.f20471h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f20473j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f20472i;
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
                    String str = c1391o.f4619c;
                    if (AbstractC3149m.m6721t0(str)) {
                        str = c1391o.f4617a;
                    }
                    AbstractC4045s.m8250n("确定删除“" + ((Object) str) + "”吗？线上插件及全部历史版本都会被删除，本地插件不会删除。此操作无法撤销。", null, ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24576, 0, 262122);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, (float) 14, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g((float) 10), C5840b.f23770p, c1836h0, 6);
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
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a15);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C4919gl(interfaceC1809a15, 26);
                        c1836h0.m4545k0(objM4514P);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a2, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 6, 1912);
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a15) | c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C5095m1(interfaceC1220a, interfaceC1809a15, 1);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P2;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("确认删除", interfaceC1220a3, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 6, 1912);
                    c1836h0.m4553p(true);
                    c1836h0.m4553p(true);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9860D((String) this.f20473j, (String) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(391));
                break;
            case 9:
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f20471h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f20473j;
                C1379c c1379c = (C1379c) this.f20472i;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C3256t c3256tM6935a2 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
                    int iHashCode3 = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l3 = c1836h02.m4546l();
                    C5850l c5850l2 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h02, c5850l2);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y2);
                    } else {
                        c1836h02.m4551n0();
                    }
                    C5597e c5597e5 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e5, c1836h02, c3256tM6935a2);
                    C5597e c5597e6 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e6, c1836h02, c3878hM4546l3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    C5597e c5597e7 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e7, c1836h02, numValueOf2);
                    C5593d c5593d2 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d2, c1836h02);
                    C5597e c5597e8 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e8, c1836h02, interfaceC5853oM10543c3);
                    AbstractC4045s.m8250n("确定删除这条评论吗？此操作无法撤销。", null, ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h02, 24582, 0, 262122);
                    InterfaceC5853o interfaceC5853oM6886p2 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 14, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a2 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h02, 6);
                    int iHashCode4 = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l4 = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c4 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6886p2);
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y2);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e5, c1836h02, c3213e1M6892a2);
                    AbstractC1874r.m4615A(c5597e6, c1836h02, c3878hM4546l4);
                    AbstractC2091b.m5169p(iHashCode4, c1836h02, c5597e7, c1836h02, c5593d2);
                    AbstractC1874r.m4615A(c5597e8, c1836h02, interfaceC5853oM10543c4);
                    boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a16);
                    Object objM4514P3 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4534f3 || objM4514P3 == c1823e2) {
                        objM4514P3 = new C4919gl(interfaceC1809a16, 24);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P3;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a4, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h02), null, c1836h02, 6, 1912);
                    boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a16) | c1836h02.m4534f(interfaceC1231l) | c1836h02.m4538h(c1379c);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4534f4 || objM4514P4 == c1823e2) {
                        objM4514P4 = new C5538zh(interfaceC1231l, c1379c, interfaceC1809a16, 6);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P4;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("确认删除", interfaceC1220a5, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h02), null, c1836h02, 6, 1912);
                    c1836h02.m4553p(true);
                    c1836h02.m4553p(true);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9862E((C1391o) this.f20473j, (InterfaceC1220a) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(393));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20473j).m9922y1((Context) this.f20471h, (InterfaceC1220a) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20473j).m9864G((Context) this.f20471h, (InterfaceC1231l) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((C4892fr) this.f20471h).m9277b((Activity) this.f20473j, (C3874d) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            case 14:
                String str2 = (String) this.f20471h;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f20472i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f20473j;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C3256t c3256tM6935a3 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h03, 0);
                    int iHashCode5 = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l5 = c1836h03.m4546l();
                    C5850l c5850l3 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c5 = AbstractC5839a.m10543c(c1836h03, c5850l3);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y3 = C5601f.f22758b;
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y3);
                    } else {
                        c1836h03.m4551n0();
                    }
                    C5597e c5597e9 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e9, c1836h03, c3256tM6935a3);
                    C5597e c5597e10 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e10, c1836h03, c3878hM4546l5);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    C5597e c5597e11 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e11, c1836h03, numValueOf3);
                    C5593d c5593d3 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d3, c1836h03);
                    C5597e c5597e12 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e12, c1836h03, interfaceC5853oM10543c5);
                    AbstractC4045s.m8250n("确定删除“" + str2 + "”吗？", null, ((C0314b) c1836h03.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h03, 24576, 0, 262122);
                    InterfaceC5853o interfaceC5853oM6886p3 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l3, 1.0f), 0.0f, (float) 14, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a3 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g((float) 10), C5840b.f23770p, c1836h03, 6);
                    int iHashCode6 = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l6 = c1836h03.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c6 = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM6886p3);
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y3);
                    } else {
                        c1836h03.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e9, c1836h03, c3213e1M6892a3);
                    AbstractC1874r.m4615A(c5597e10, c1836h03, c3878hM4546l6);
                    AbstractC2091b.m5169p(iHashCode6, c1836h03, c5597e11, c1836h03, c5593d3);
                    AbstractC1874r.m4615A(c5597e12, c1836h03, interfaceC5853oM10543c6);
                    Object objM4514P5 = c1836h03.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (objM4514P5 == c1823e3) {
                        interfaceC1809a1 = interfaceC1809a17;
                        objM4514P5 = new C5020jp(interfaceC1809a1, 29);
                        c1836h03.m4545k0(objM4514P5);
                    } else {
                        interfaceC1809a1 = interfaceC1809a17;
                    }
                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P5;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a7, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h03), null, c1836h03, 54, 1912);
                    boolean zM4534f5 = c1836h03.m4534f(interfaceC1220a6);
                    Object objM4514P6 = c1836h03.m4514P();
                    if (zM4534f5 || objM4514P6 == c1823e3) {
                        objM4514P6 = new C5095m1(interfaceC1220a6, interfaceC1809a1, 2);
                        c1836h03.m4545k0(objM4514P6);
                    }
                    InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P6;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("删除", interfaceC1220a8, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h03), null, c1836h03, 6, 1912);
                    c1836h03.m4553p(true);
                    c1836h03.m4553p(true);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 15:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9892g0((String) this.f20473j, (InterfaceC1220a) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
            case 16:
                String str3 = (String) this.f20471h;
                String str4 = (String) this.f20473j;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f20472i;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str5 = AbstractC1416l.m3825a(str3, (String) interfaceC1809a18.getValue()) ? "已选择" : AbstractC1416l.m3825a(str3, str4) ? "当前模型" : HttpUrl.FRAGMENT_ENCODE_SET;
                    boolean zM4534f6 = c1836h04.m4534f(interfaceC1809a18) | c1836h04.m4534f(str3);
                    Object objM4514P7 = c1836h04.m4514P();
                    if (zM4534f6 || objM4514P7 == C1851l.f6155a) {
                        objM4514P7 = new C4751bh(str3, interfaceC1809a18, 1);
                        c1836h04.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9503b(str3, str5, (InterfaceC1220a) objM4514P7, c1836h04, 0);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 17:
                C1113d1 c1113d1 = (C1113d1) this.f20471h;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f20473j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f20472i;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C3256t c3256tM6935a4 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h05, 0);
                    int iHashCode7 = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l7 = c1836h05.m4546l();
                    C5850l c5850l4 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c7 = AbstractC5839a.m10543c(c1836h05, c5850l4);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y4 = C5601f.f22758b;
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(c5660y4);
                    } else {
                        c1836h05.m4551n0();
                    }
                    C5597e c5597e13 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e13, c1836h05, c3256tM6935a4);
                    C5597e c5597e14 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e14, c1836h05, c3878hM4546l7);
                    Integer numValueOf4 = Integer.valueOf(iHashCode7);
                    C5597e c5597e15 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e15, c1836h05, numValueOf4);
                    C5593d c5593d4 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d4, c1836h05);
                    C5597e c5597e16 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e16, c1836h05, interfaceC5853oM10543c7);
                    String str6 = c1113d1.f3637b;
                    if (AbstractC3149m.m6721t0(str6)) {
                        str6 = "新对话";
                    }
                    AbstractC4045s.m8250n("确定删除“" + ((Object) str6) + "”吗？此操作无法撤销。", null, ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24576, 0, 262122);
                    InterfaceC5853o interfaceC5853oM6886p4 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l4, 1.0f), 0.0f, (float) 14, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a4 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g((float) 10), C5840b.f23770p, c1836h05, 6);
                    int iHashCode8 = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l8 = c1836h05.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c8 = AbstractC5839a.m10543c(c1836h05, interfaceC5853oM6886p4);
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(c5660y4);
                    } else {
                        c1836h05.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e13, c1836h05, c3213e1M6892a4);
                    AbstractC1874r.m4615A(c5597e14, c1836h05, c3878hM4546l8);
                    AbstractC2091b.m5169p(iHashCode8, c1836h05, c5597e15, c1836h05, c5593d4);
                    AbstractC1874r.m4615A(c5597e16, c1836h05, interfaceC5853oM10543c8);
                    Object objM4514P8 = c1836h05.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (objM4514P8 == c1823e4) {
                        interfaceC1809a12 = interfaceC1809a19;
                        objM4514P8 = new C5020jp(interfaceC1809a12, 27);
                        c1836h05.m4545k0(objM4514P8);
                    } else {
                        interfaceC1809a12 = interfaceC1809a19;
                    }
                    InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P8;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消", interfaceC1220a9, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 54, 1912);
                    boolean zM4534f7 = c1836h05.m4534f(interfaceC1231l2) | c1836h05.m4538h(c1113d1);
                    Object objM4514P9 = c1836h05.m4514P();
                    if (zM4534f7 || objM4514P9 == c1823e4) {
                        objM4514P9 = new C5538zh(interfaceC1231l2, c1113d1, interfaceC1809a12, 12);
                        c1836h05.m4545k0(objM4514P9);
                    }
                    InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P9;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("删除", interfaceC1220a10, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 6, 1912);
                    c1836h05.m4553p(true);
                    c1836h05.m4553p(true);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 18:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9876U((String) this.f20473j, (String) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9910p0((C1165q1) this.f20473j, (InterfaceC1220a) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9914r0((C1165q1) this.f20473j, (String) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
            case 21:
                C1107c c1107c = (C1107c) this.f20471h;
                String str7 = (String) this.f20473j;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) this.f20472i;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C3256t c3256tM6935a5 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h06, 0);
                    int iHashCode9 = Long.hashCode(c1836h06.f6095T);
                    C3878h c3878hM4546l9 = c1836h06.m4546l();
                    C5850l c5850l5 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c9 = AbstractC5839a.m10543c(c1836h06, c5850l5);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y5 = C5601f.f22758b;
                    c1836h06.m4531d0();
                    if (c1836h06.f6094S) {
                        c1836h06.m4544k(c5660y5);
                    } else {
                        c1836h06.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h06, c3256tM6935a5);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h06, c3878hM4546l9);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h06, Integer.valueOf(iHashCode9));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h06);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h06, interfaceC5853oM10543c9);
                    String str8 = c1107c.f3584a;
                    List list3 = c1107c.f3594k;
                    AbstractC4955ho.m9296B1("角色", AbstractC1416l.m3825a(str8, "user") ? "用户" : AbstractC1416l.m3825a(str8, "tool") ? "工具" : "Agent", null, c1836h06, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    AbstractC4955ho.m9296B1("时间", AbstractC4955ho.m9511b7(c1107c.f3596m), null, c1836h06, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    AbstractC4955ho.m9296B1("状态", str7, null, c1836h06, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    AbstractC4955ho.m9296B1("字符数", String.valueOf(c1107c.f3585b.length()), null, c1836h06, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    AbstractC4955ho.m9296B1("Token 估算", String.valueOf(C1186w.m3226j(HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m99x0(c1107c), null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET)), null, c1836h06, 6, 4);
                    if (list3.isEmpty()) {
                        c1836h06.m4525a0(-426818764);
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(-426938889);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9296B1("附件", String.valueOf(list3.size()), null, c1836h06, 6, 4);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4045s.m8251o("关闭", interfaceC1220a11, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l5, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h06), null, c1836h06, 390, 1912);
                    c1836h06.m4553p(true);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 22:
                Activity activity = (Activity) this.f20471h;
                C3874d c3874d = (C3874d) this.f20473j;
                C5134n7 c5134n7 = (C5134n7) this.f20472i;
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    C5491y2.f22068p.m9907o(activity, AbstractC3879i.m8071e(2119937901, new C5539zi(c3874d, 9, c5134n7), c1836h07), c1836h07, 432);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 23:
                InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) this.f20472i;
                String str9 = (String) this.f20471h;
                InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) this.f20473j;
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C5850l c5850l6 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l6, 1.0f), 0.0f, 560, 1);
                    C3211e c3211e = AbstractC3226j.f10300c;
                    C5843e c5843e = C5840b.f23773s;
                    C3256t c3256tM6935a6 = AbstractC3253s.m6935a(c3211e, c5843e, c1836h08, 0);
                    int iHashCode10 = Long.hashCode(c1836h08.f6095T);
                    C3878h c3878hM4546l10 = c1836h08.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c10 = AbstractC5839a.m10543c(c1836h08, interfaceC5853oM6904g);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y6 = C5601f.f22758b;
                    c1836h08.m4531d0();
                    if (c1836h08.f6094S) {
                        c1836h08.m4544k(c5660y6);
                    } else {
                        c1836h08.m4551n0();
                    }
                    C5597e c5597e17 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e17, c1836h08, c3256tM6935a6);
                    C5597e c5597e18 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e18, c1836h08, c3878hM4546l10);
                    Integer numValueOf5 = Integer.valueOf(iHashCode10);
                    C5597e c5597e19 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e19, c1836h08, numValueOf5);
                    C5593d c5593d5 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d5, c1836h08);
                    C5597e c5597e20 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e20, c1836h08, interfaceC5853oM10543c10);
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l6, 1.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    float f3 = 8;
                    InterfaceC5853o interfaceC5853oM1337b = AbstractC0378h.m1337b(interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false)), AbstractC4360e.m8800a(f3));
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    float f10 = 12;
                    InterfaceC5853o interfaceC5853oM6882l = AbstractC3208d.m6882l(AbstractC2192n.m5441r(AbstractC2192n.m5433j(AbstractC2192n.m5430g(interfaceC5853oM1337b, C1034w.m2634b(((C0314b) c1836h08.m4542j(c1858m2)).m1237g(), 0.06f), AbstractC0996c0.f3162b), false, null, null, interfaceC1220a12, 15), AbstractC2192n.m5440q(c1836h08), true, true), f10);
                    C3256t c3256tM6935a7 = AbstractC3253s.m6935a(c3211e, c5843e, c1836h08, 0);
                    int iHashCode11 = Long.hashCode(c1836h08.f6095T);
                    C3878h c3878hM4546l11 = c1836h08.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c11 = AbstractC5839a.m10543c(c1836h08, interfaceC5853oM6882l);
                    c1836h08.m4531d0();
                    if (c1836h08.f6094S) {
                        c1836h08.m4544k(c5660y6);
                    } else {
                        c1836h08.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e17, c1836h08, c3256tM6935a7);
                    AbstractC1874r.m4615A(c5597e18, c1836h08, c3878hM4546l11);
                    AbstractC2091b.m5169p(iHashCode11, c1836h08, c5597e19, c1836h08, c5593d5);
                    AbstractC1874r.m4615A(c5597e20, c1836h08, interfaceC5853oM10543c11);
                    AbstractC4045s.m8250n(str9, AbstractC3222h1.m6901d(c5850l6, 1.0f), ((C0314b) c1836h08.m4542j(c1858m2)).m1237g(), AbstractC5700d.m10248D(12), null, AbstractC2772p.f9007b, 0L, null, AbstractC5700d.m10248D(17), 0, false, 0, 0, null, null, c1836h08, 24624, 48, 259944);
                    c1836h08.m4553p(true);
                    InterfaceC5853o interfaceC5853oM6886p5 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l6, 1.0f), 0.0f, f10, 0.0f, 2, 5);
                    C3213e1 c3213e1M6892a5 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(f3), C5840b.f23770p, c1836h08, 6);
                    int iHashCode12 = Long.hashCode(c1836h08.f6095T);
                    C3878h c3878hM4546l12 = c1836h08.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c12 = AbstractC5839a.m10543c(c1836h08, interfaceC5853oM6886p5);
                    c1836h08.m4531d0();
                    if (c1836h08.f6094S) {
                        c1836h08.m4544k(c5660y6);
                    } else {
                        c1836h08.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e17, c1836h08, c3213e1M6892a5);
                    AbstractC1874r.m4615A(c5597e18, c1836h08, c3878hM4546l12);
                    AbstractC2091b.m5169p(iHashCode12, c1836h08, c5597e19, c1836h08, c5593d5);
                    AbstractC1874r.m4615A(c5597e20, c1836h08, interfaceC5853oM10543c12);
                    C5491y2 c5491y2 = C5491y2.f22068p;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    c5491y2.m9899k("关闭", interfaceC1220a13, new C3248q0(1.0f, true), false, c1836h08, 24582, 8);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    c5491y2.m9899k("复制日志", interfaceC1220a12, new C3248q0(1.0f, true), true, c1836h08, 27654, 0);
                    c1836h08.m4553p(true);
                    c1836h08.m4553p(true);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 24:
                return m9741e(obj, obj2);
            case 25:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20473j).m9907o((Context) this.f20471h, (C3874d) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f20471h).m9859C1((String) this.f20473j, (InterfaceC1231l) this.f20472i, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5278rj(InterfaceC1220a interfaceC1220a, Object obj, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f20470g = i9;
        this.f20472i = interfaceC1220a;
        this.f20471h = obj;
        this.f20473j = interfaceC1220a2;
    }

    public /* synthetic */ C5278rj(Object obj, Context context, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        this.f20470g = i10;
        this.f20473j = obj;
        this.f20471h = context;
        this.f20472i = interfaceC3955b;
    }

    public /* synthetic */ C5278rj(Object obj, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i9, int i10) {
        this.f20470g = i10;
        this.f20471h = obj;
        this.f20472i = interfaceC1220a;
        this.f20473j = interfaceC1231l;
    }

    public /* synthetic */ C5278rj(Object obj, Object obj2, Object obj3, int i9) {
        this.f20470g = i9;
        this.f20471h = obj;
        this.f20473j = obj2;
        this.f20472i = obj3;
    }

    public /* synthetic */ C5278rj(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.f20470g = i10;
        this.f20471h = obj;
        this.f20473j = obj2;
        this.f20472i = obj3;
    }

    public /* synthetic */ C5278rj(Context context, InterfaceC1809a1 interfaceC1809a1, C4538r c4538r) {
        this.f20470g = 4;
        this.f20473j = interfaceC1809a1;
        this.f20472i = c4538r;
        this.f20471h = context;
    }
}
