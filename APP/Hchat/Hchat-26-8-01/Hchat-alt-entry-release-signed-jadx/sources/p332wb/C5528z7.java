package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import p036c9.C0497w0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p243q9.C3471g;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.z7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5528z7 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22340g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f22341h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22342i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22343j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f22344k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ SharedPreferences f22345l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f22346m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f22347n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f22348o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f22349p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f22350q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f22351r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f22352s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f22353t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5528z7(Context context, String str, SharedPreferences sharedPreferences, String str2, String str3, String str4, String str5, List list, C3641z c3641z, InterfaceC1220a interfaceC1220a, C5225q c5225q, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, int i9) {
        this.f22348o = context;
        this.f22341h = str;
        this.f22345l = sharedPreferences;
        this.f22342i = str2;
        this.f22343j = str3;
        this.f22344k = str4;
        this.f22346m = str5;
        this.f22349p = list;
        this.f22350q = c3641z;
        this.f22347n = interfaceC1220a;
        this.f22353t = c5225q;
        this.f22351r = interfaceC1220a2;
        this.f22352s = interfaceC1220a3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1823e c1823e;
        Object c5236qa;
        C1823e c1823e2;
        switch (this.f22340g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9692w((Context) this.f22348o, (String) this.f22341h, this.f22345l, (String) this.f22342i, (String) this.f22343j, (String) this.f22344k, (String) this.f22346m, (List) this.f22349p, (C3641z) this.f22350q, (InterfaceC1220a) this.f22347n, (C5225q) this.f22353t, (InterfaceC1220a) this.f22351r, (InterfaceC1220a) this.f22352s, (C1836h0) obj, AbstractC1874r.m4617C(807103537));
                break;
            case 1:
                C3471g c3471g = (C3471g) this.f22348o;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f22349p;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f22350q;
                String str = (String) this.f22341h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f22351r;
                String str2 = (String) this.f22342i;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f22352s;
                String str3 = (String) this.f22343j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f22353t;
                String str4 = (String) this.f22344k;
                String str5 = (String) this.f22346m;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22347n;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1823e c1823e3 = C1851l.f6155a;
                    if (c3471g == null) {
                        c1836h0.m4525a0(1599575597);
                        boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4534f(interfaceC1809a12) | c1836h0.m4534f(str) | c1836h0.m4534f(interfaceC1809a13) | c1836h0.m4534f(str2) | c1836h0.m4534f(interfaceC1809a14) | c1836h0.m4534f(str3) | c1836h0.m4534f(interfaceC1809a15) | c1836h0.m4534f(str4);
                        SharedPreferences sharedPreferences = this.f22345l;
                        boolean zM4538h = zM4534f | c1836h0.m4538h(sharedPreferences) | c1836h0.m4534f(str5);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4538h || objM4514P == c1823e3) {
                            c1823e = c1823e3;
                            c5236qa = new C5236qa(str, str2, str3, str4, sharedPreferences, str5, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15);
                            c1836h0.m4545k0(c5236qa);
                        } else {
                            c5236qa = objM4514P;
                            c1823e = c1823e3;
                        }
                        AbstractC4955ho.m9503b("恢复全局内容", "跟随全局类型并覆盖本群模板", (InterfaceC1220a) c5236qa, c1836h0, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        c1836h0.m4553p(false);
                    } else {
                        c1823e = c1823e3;
                        c1836h0.m4525a0(1600803755);
                        c1836h0.m4553p(false);
                    }
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C5040kc(interfaceC1220a, 18);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("删除当前群", "移除监听和本群专属配置", (InterfaceC1220a) objM4514P2, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f22341h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f22342i;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f22343j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f22344k;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f22346m;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f22349p;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f22350q;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f22347n;
                Context context = (Context) this.f22348o;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f22351r;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f22352s;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f22353t;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str6 = (String) interfaceC1809a16.getValue();
                    if (AbstractC3149m.m6721t0(str6)) {
                        str6 = "未设置模型";
                    }
                    boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a16);
                    Object objM4514P3 = c1836h02.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4534f3 || objM4514P3 == c1823e4) {
                        c1823e2 = c1823e4;
                        objM4514P3 = new C0497w0(interfaceC1809a16, interfaceC1809a113, interfaceC1809a114, 1);
                        c1836h02.m4545k0(objM4514P3);
                    } else {
                        c1823e2 = c1823e4;
                    }
                    AbstractC4955ho.m9503b("模型选择", str6, (InterfaceC1220a) objM4514P3, c1836h02, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str7 = (String) interfaceC1809a115.getValue();
                    if (AbstractC3149m.m6721t0(str7)) {
                        str7 = "测试当前模型的流式和非流式请求";
                    }
                    boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a17) | c1836h02.m4534f(interfaceC1809a18) | c1836h02.m4534f(interfaceC1809a19) | c1836h02.m4534f(interfaceC1809a110) | c1836h02.m4534f(interfaceC1809a16) | c1836h02.m4534f(interfaceC1809a111) | c1836h02.m4534f(interfaceC1809a112);
                    SharedPreferences sharedPreferences2 = this.f22345l;
                    boolean zM4538h2 = zM4534f4 | c1836h02.m4538h(sharedPreferences2) | c1836h02.m4538h(interfaceC3599t) | c1836h02.m4538h(context);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4538h2 || objM4514P4 == c1823e2) {
                        C5236qa c5236qa2 = new C5236qa(sharedPreferences2, interfaceC3599t, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a16, interfaceC1809a111, interfaceC1809a112, interfaceC1809a115, context);
                        c1836h02.m4545k0(c5236qa2);
                        objM4514P4 = c5236qa2;
                    }
                    AbstractC4955ho.m9503b("测试连通性", str7, (InterfaceC1220a) objM4514P4, c1836h02, 6);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5528z7(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, SharedPreferences sharedPreferences, InterfaceC3599t interfaceC3599t, Context context, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f22341h = interfaceC1809a1;
        this.f22342i = interfaceC1809a12;
        this.f22343j = interfaceC1809a13;
        this.f22344k = interfaceC1809a14;
        this.f22346m = interfaceC1809a15;
        this.f22349p = interfaceC1809a16;
        this.f22350q = interfaceC1809a17;
        this.f22345l = sharedPreferences;
        this.f22347n = interfaceC3599t;
        this.f22348o = context;
        this.f22351r = interfaceC1809a18;
        this.f22352s = interfaceC1809a19;
        this.f22353t = interfaceC1809a110;
    }

    public /* synthetic */ C5528z7(C3471g c3471g, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, String str, InterfaceC1809a1 interfaceC1809a13, String str2, InterfaceC1809a1 interfaceC1809a14, String str3, InterfaceC1809a1 interfaceC1809a15, String str4, SharedPreferences sharedPreferences, String str5, InterfaceC1220a interfaceC1220a) {
        this.f22348o = c3471g;
        this.f22349p = interfaceC1809a1;
        this.f22350q = interfaceC1809a12;
        this.f22341h = str;
        this.f22351r = interfaceC1809a13;
        this.f22342i = str2;
        this.f22352s = interfaceC1809a14;
        this.f22343j = str3;
        this.f22353t = interfaceC1809a15;
        this.f22344k = str4;
        this.f22345l = sharedPreferences;
        this.f22346m = str5;
        this.f22347n = interfaceC1220a;
    }
}
