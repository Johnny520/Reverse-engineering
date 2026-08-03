package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.u8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5366u8 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21024g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21025h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21026i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21027j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21028k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21029l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21030m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21031n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21032o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f21033p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f21034q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f21035r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f21036s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f21037t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f21038u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21039v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f21040w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21041x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5366u8(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f21040w = sharedPreferences;
        this.f21025h = context;
        this.f21041x = interfaceC1220a;
        this.f21026i = interfaceC1809a1;
        this.f21027j = interfaceC1809a12;
        this.f21028k = interfaceC1809a13;
        this.f21029l = interfaceC1809a14;
        this.f21030m = interfaceC1809a15;
        this.f21031n = interfaceC1809a16;
        this.f21032o = interfaceC1809a17;
        this.f21033p = interfaceC1809a18;
        this.f21034q = interfaceC1809a19;
        this.f21035r = interfaceC1809a110;
        this.f21036s = interfaceC1809a111;
        this.f21037t = interfaceC1809a112;
        this.f21038u = interfaceC1809a113;
        this.f21039v = interfaceC1809a114;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C1836h0 c1836h0;
        switch (this.f21024g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21040w;
                Context context = (Context) this.f21025h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21041x;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21033p;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21034q;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21035r;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21036s;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21037t;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21038u;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21039v;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM4538h = c1836h02.m4538h(sharedPreferences) | c1836h02.m4538h(context);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        c1836h0 = c1836h02;
                        C5411vk c5411vk = new C5411vk(sharedPreferences, context, this.f21026i, this.f21027j, this.f21028k, this.f21029l, this.f21030m, this.f21031n, this.f21032o, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17);
                        c1836h0.m4545k0(c5411vk);
                        objM4514P = c5411vk;
                    } else {
                        c1836h0 = c1836h02;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P, "返回", interfaceC1220a, null, null, c1836h0, 390, 48);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                C4060x c4060x = (C4060x) this.f21040w;
                C3641z c3641z = (C3641z) this.f21041x;
                Context context2 = (Context) this.f21025h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21033p;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21034q;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f21035r;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f21036s;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f21037t;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f21038u;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f21039v;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h03.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h2 = c1836h03.m4538h(context2);
                    Object objM4514P2 = c1836h03.m4514P();
                    if (zM4538h2 || objM4514P2 == C1851l.f6155a) {
                        C5246qk c5246qk = new C5246qk(context2, this.f21026i, this.f21027j, this.f21028k, this.f21029l, this.f21030m, this.f21031n, this.f21032o, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114);
                        c1836h03.m4545k0(c5246qk);
                        objM4514P2 = c5246qk;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 2:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21040w;
                List list = (List) this.f21025h;
                String str = (String) this.f21033p;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21034q;
                String str2 = (String) this.f21035r;
                List list2 = (List) this.f21036s;
                String str3 = (String) this.f21037t;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f21038u;
                String str4 = (String) this.f21039v;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f21041x;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(2113428317, new C5176og(sharedPreferences2, list, str, interfaceC1231l, str2, list2, str3, interfaceC1231l2, str4, interfaceC1220a2, this.f21026i, this.f21027j, this.f21028k, this.f21029l, this.f21030m, this.f21031n, this.f21032o), c1836h04), c1836h04, 48, 1);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 3:
                Context context3 = (Context) this.f21025h;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f21033p;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f21034q;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f21035r;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f21036s;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f21037t;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f21038u;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f21039v;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f21040w;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f21041x;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(976477546, new C5176og(this.f21026i, this.f21027j, this.f21028k, context3, this.f21029l, this.f21030m, this.f21031n, this.f21032o, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, interfaceC1809a122, interfaceC1809a123), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                break;
            default:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f21040w;
                String str5 = (String) this.f21041x;
                Context context4 = (Context) this.f21025h;
                String str6 = (String) this.f21034q;
                String str7 = (String) this.f21035r;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f21033p;
                String str8 = (String) this.f21036s;
                String str9 = (String) this.f21037t;
                String str10 = (String) this.f21038u;
                String str11 = (String) this.f21039v;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-739753420, new C5176og(this.f21026i, sharedPreferences3, str5, this.f21027j, this.f21028k, this.f21029l, context4, str6, str7, this.f21030m, this.f21031n, this.f21032o, interfaceC1809a124, str8, str9, str10, str11), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5366u8(SharedPreferences sharedPreferences, List list, String str, InterfaceC1231l interfaceC1231l, String str2, List list2, String str3, InterfaceC1231l interfaceC1231l2, String str4, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f21040w = sharedPreferences;
        this.f21025h = list;
        this.f21033p = str;
        this.f21034q = interfaceC1231l;
        this.f21035r = str2;
        this.f21036s = list2;
        this.f21037t = str3;
        this.f21038u = interfaceC1231l2;
        this.f21039v = str4;
        this.f21041x = interfaceC1220a;
        this.f21026i = interfaceC1809a1;
        this.f21027j = interfaceC1809a12;
        this.f21028k = interfaceC1809a13;
        this.f21029l = interfaceC1809a14;
        this.f21030m = interfaceC1809a15;
        this.f21031n = interfaceC1809a16;
        this.f21032o = interfaceC1809a17;
    }

    public /* synthetic */ C5366u8(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, Context context, String str2, String str3, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, String str4, String str5, String str6, String str7) {
        this.f21026i = interfaceC1809a1;
        this.f21040w = sharedPreferences;
        this.f21041x = str;
        this.f21027j = interfaceC1809a12;
        this.f21028k = interfaceC1809a13;
        this.f21029l = interfaceC1809a14;
        this.f21025h = context;
        this.f21034q = str2;
        this.f21035r = str3;
        this.f21030m = interfaceC1809a15;
        this.f21031n = interfaceC1809a16;
        this.f21032o = interfaceC1809a17;
        this.f21033p = interfaceC1809a18;
        this.f21036s = str4;
        this.f21037t = str5;
        this.f21038u = str6;
        this.f21039v = str7;
    }

    public /* synthetic */ C5366u8(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, Context context, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116) {
        this.f21026i = interfaceC1809a1;
        this.f21027j = interfaceC1809a12;
        this.f21028k = interfaceC1809a13;
        this.f21025h = context;
        this.f21029l = interfaceC1809a14;
        this.f21030m = interfaceC1809a15;
        this.f21031n = interfaceC1809a16;
        this.f21032o = interfaceC1809a17;
        this.f21033p = interfaceC1809a18;
        this.f21034q = interfaceC1809a19;
        this.f21035r = interfaceC1809a110;
        this.f21036s = interfaceC1809a111;
        this.f21037t = interfaceC1809a112;
        this.f21038u = interfaceC1809a113;
        this.f21039v = interfaceC1809a114;
        this.f21040w = interfaceC1809a115;
        this.f21041x = interfaceC1809a116;
    }

    public /* synthetic */ C5366u8(C4060x c4060x, C3641z c3641z, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f21040w = c4060x;
        this.f21041x = c3641z;
        this.f21025h = context;
        this.f21026i = interfaceC1809a1;
        this.f21027j = interfaceC1809a12;
        this.f21028k = interfaceC1809a13;
        this.f21029l = interfaceC1809a14;
        this.f21030m = interfaceC1809a15;
        this.f21031n = interfaceC1809a16;
        this.f21032o = interfaceC1809a17;
        this.f21033p = interfaceC1809a18;
        this.f21034q = interfaceC1809a19;
        this.f21035r = interfaceC1809a110;
        this.f21036s = interfaceC1809a111;
        this.f21037t = interfaceC1809a112;
        this.f21038u = interfaceC1809a113;
        this.f21039v = interfaceC1809a114;
    }
}
