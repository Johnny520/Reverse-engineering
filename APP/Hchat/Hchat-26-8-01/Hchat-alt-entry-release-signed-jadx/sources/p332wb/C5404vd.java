package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p080fb.C1107c;
import p080fb.C1109c1;
import p080fb.C1176t0;
import p080fb.C1192y;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3199a;
import p249qg.InterfaceC3599t;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.vd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5404vd implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21362g = 3;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21363h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21364i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21365j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21366k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21367l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21368m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21369n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21370o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f21371p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f21372q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f21373r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f21374s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f21375t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f21376u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21377v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f21378w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5404vd(Context context, InterfaceC1809a1 interfaceC1809a1, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f21378w = context;
        this.f21364i = interfaceC1809a1;
        this.f21363h = c1845j1;
        this.f21365j = interfaceC1809a12;
        this.f21366k = interfaceC1809a13;
        this.f21367l = interfaceC1809a14;
        this.f21368m = interfaceC1809a15;
        this.f21369n = interfaceC1809a16;
        this.f21370o = interfaceC1809a17;
        this.f21371p = interfaceC1809a18;
        this.f21372q = interfaceC1809a19;
        this.f21373r = interfaceC1809a110;
        this.f21374s = interfaceC1809a111;
        this.f21375t = interfaceC1809a112;
        this.f21376u = interfaceC1809a113;
        this.f21377v = interfaceC1809a114;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        switch (this.f21362g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21363h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21371p;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21372q;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21373r;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21374s;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f21377v;
                Context context = (Context) this.f21378w;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19809l1, 3);
                InterfaceC1809a1 interfaceC1809a15 = this.f21364i;
                InterfaceC1809a1 interfaceC1809a16 = this.f21365j;
                InterfaceC1809a1 interfaceC1809a17 = this.f21366k;
                InterfaceC1809a1 interfaceC1809a18 = this.f21367l;
                InterfaceC1809a1 interfaceC1809a19 = this.f21368m;
                InterfaceC1809a1 interfaceC1809a110 = this.f21369n;
                InterfaceC1809a1 interfaceC1809a111 = this.f21370o;
                C3623h.m7604a(c3623h, null, new C3874d(419009060, new C5268r9(interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, sharedPreferences, interfaceC1809a1), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19817m1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(249390118, new C4873f8(interfaceC1809a12, interfaceC1809a1, interfaceC1809a13, interfaceC1809a14, 3), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19825n1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(79771176, new C4774c7(interfaceC1809a19, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a110, interfaceC1809a111, sharedPreferences, interfaceC3599t, context, this.f21375t, interfaceC1809a14, this.f21376u, 5), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19833o1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-89847766, new C4848eg(context, 1), true), 3);
                break;
            case 1:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21363h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f21371p;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f21372q;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f21373r;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f21374s;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f21377v;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f21378w;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19606J5, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-1274450764, new C5265r6(sharedPreferences2, 21), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19613K5, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(260945906, new C5334t9(sharedPreferences2, this.f21364i, this.f21365j, this.f21366k, this.f21367l, this.f21368m, this.f21369n, this.f21370o, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, this.f21375t, this.f21376u, interfaceC1809a116, interfaceC1809a117, 3), true), 3);
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f21371p;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f21372q;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f21373r;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f21374s;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f21363h;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f21377v;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f21378w;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19859r3, 3);
                InterfaceC1809a1 interfaceC1809a125 = this.f21364i;
                InterfaceC1809a1 interfaceC1809a126 = this.f21365j;
                InterfaceC1809a1 interfaceC1809a127 = this.f21366k;
                InterfaceC1809a1 interfaceC1809a128 = this.f21367l;
                InterfaceC1809a1 interfaceC1809a129 = this.f21368m;
                InterfaceC1809a1 interfaceC1809a130 = this.f21369n;
                C3623h.m7604a(c3623h3, null, new C3874d(-1280131443, new C5367u9(interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, this.f21370o, 1), true), 3);
                if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19867s3, 3);
                    InterfaceC1809a1 interfaceC1809a131 = this.f21375t;
                    C3623h.m7604a(c3623h3, null, new C3874d(1674882408, new C5367u9(interfaceC1809a118, interfaceC1809a130, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, interfaceC1809a131, this.f21376u, 2), true), 3);
                    if (!AbstractC1416l.m3825a((String) interfaceC1809a131.getValue(), WeChatSnsPost.TYPE_CARD)) {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19875t3, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(478807683, new C5293s1(interfaceC1809a122, 5), true), 3);
                    }
                    if (!AbstractC1416l.m3825a((String) interfaceC1809a131.getValue(), WeChatSnsPost.TYPE_TEXT)) {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19882u3, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(557996986, new C5326t1(2, interfaceC1809a123, interfaceC1809a124), true), 3);
                    }
                }
                return C3967n.f12976a;
            case 3:
                Context context2 = (Context) this.f21378w;
                C1845j1 c1845j1 = (C1845j1) this.f21363h;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f21371p;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f21372q;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f21373r;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f21374s;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f21377v;
                C1176t0 c1176t0 = (C1176t0) obj;
                c1176t0.getClass();
                C5491y2.m9840r1(context2, this.f21364i, c1845j1, this.f21365j, this.f21366k, this.f21367l, this.f21368m, this.f21369n, this.f21370o, interfaceC1809a132, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, this.f21375t, this.f21376u, c1176t0);
                interfaceC1809a136.setValue(Boolean.FALSE);
                return C3967n.f12976a;
            case 4:
                C1845j1 c1845j12 = (C1845j1) this.f21370o;
                C1845j1 c1845j13 = (C1845j1) this.f21371p;
                C1845j1 c1845j14 = (C1845j1) this.f21372q;
                C1845j1 c1845j15 = (C1845j1) this.f21373r;
                C1845j1 c1845j16 = (C1845j1) this.f21374s;
                C1845j1 c1845j17 = (C1845j1) this.f21375t;
                C1845j1 c1845j18 = (C1845j1) this.f21376u;
                C1845j1 c1845j19 = (C1845j1) this.f21363h;
                Context context3 = (Context) this.f21378w;
                C5518yt c5518yt = (C5518yt) this.f21377v;
                String str = (String) obj;
                str.getClass();
                Iterator it = ((List) c1845j12.getValue()).iterator();
                int i9 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i9 = -1;
                    } else if (!AbstractC1416l.m3825a(((C1107c) it.next()).f3586c, str)) {
                        i9++;
                    }
                }
                if (!((Boolean) c1845j13.getValue()).booleanValue() && !((Boolean) c1845j14.getValue()).booleanValue() && !((Boolean) c1845j15.getValue()).booleanValue() && !C5491y2.m9781I0(c1845j16, c1845j17, c1845j18, c1845j19) && i9 >= 0) {
                    List list = (List) c1845j12.getValue();
                    int i10 = i9 + 1;
                    List listM8403L1 = AbstractC4166m.m8403L1(i10, list);
                    List listM8419q1 = AbstractC4166m.m8419q1(i10, list);
                    C1192y c1192yM9776G0 = C5491y2.m9776G0(listM8403L1);
                    InterfaceC1809a1 interfaceC1809a137 = this.f21364i;
                    C5491y2.m9837o1(c5518yt, context3, listM8403L1, listM8419q1, "回滚会话", new C5531za(listM8403L1, c1192yM9776G0, (C1109c1) interfaceC1809a137.getValue(), context3, c1845j12, this.f21365j, this.f21366k, this.f21367l, this.f21368m, interfaceC1809a137, this.f21369n));
                }
                return C3967n.f12976a;
            default:
                List list2 = (List) this.f21371p;
                C1192y c1192y = (C1192y) this.f21372q;
                C1109c1 c1109c1 = (C1109c1) this.f21373r;
                C1107c c1107c = (C1107c) this.f21374s;
                Context context4 = (Context) this.f21378w;
                C1845j1 c1845j110 = (C1845j1) this.f21375t;
                C1845j1 c1845j111 = (C1845j1) this.f21376u;
                C1845j1 c1845j112 = (C1845j1) this.f21363h;
                C1845j1 c1845j113 = (C1845j1) this.f21377v;
                String str2 = (String) obj;
                str2.getClass();
                c1845j110.setValue(list2);
                this.f21364i.setValue(c1192y);
                this.f21365j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f21366k.setValue(str2);
                this.f21367l.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                C5491y2.m9774F0(context4, c1109c1);
                this.f21368m.setValue(null);
                C5491y2.m9812X0(this.f21369n, 0);
                c1845j111.setValue(c1107c.f3585b);
                c1845j112.setValue(c1107c.f3594k);
                c1845j113.setValue(c1107c.f3595l);
                if (list2.isEmpty()) {
                    InterfaceC1809a1 interfaceC1809a138 = this.f21370o;
                    AbstractC3199a.m6848u((Number) interfaceC1809a138.getValue(), 1, interfaceC1809a138);
                }
                Toast.makeText(context4, "已覆盖后续记录并填入原消息", 0).show();
                return Boolean.TRUE;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5404vd(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115) {
        this.f21363h = sharedPreferences;
        this.f21364i = interfaceC1809a1;
        this.f21365j = interfaceC1809a12;
        this.f21366k = interfaceC1809a13;
        this.f21367l = interfaceC1809a14;
        this.f21368m = interfaceC1809a15;
        this.f21369n = interfaceC1809a16;
        this.f21370o = interfaceC1809a17;
        this.f21371p = interfaceC1809a18;
        this.f21372q = interfaceC1809a19;
        this.f21373r = interfaceC1809a110;
        this.f21374s = interfaceC1809a111;
        this.f21375t = interfaceC1809a112;
        this.f21376u = interfaceC1809a113;
        this.f21377v = interfaceC1809a114;
        this.f21378w = interfaceC1809a115;
    }

    public /* synthetic */ C5404vd(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC3599t interfaceC3599t, Context context, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f21364i = interfaceC1809a1;
        this.f21365j = interfaceC1809a12;
        this.f21366k = interfaceC1809a13;
        this.f21367l = interfaceC1809a14;
        this.f21368m = interfaceC1809a15;
        this.f21369n = interfaceC1809a16;
        this.f21370o = interfaceC1809a17;
        this.f21363h = sharedPreferences;
        this.f21371p = interfaceC1809a18;
        this.f21372q = interfaceC1809a19;
        this.f21373r = interfaceC1809a110;
        this.f21374s = interfaceC1809a111;
        this.f21377v = interfaceC3599t;
        this.f21378w = context;
        this.f21375t = interfaceC1809a112;
        this.f21376u = interfaceC1809a113;
    }

    public /* synthetic */ C5404vd(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116) {
        this.f21364i = interfaceC1809a1;
        this.f21365j = interfaceC1809a12;
        this.f21366k = interfaceC1809a13;
        this.f21367l = interfaceC1809a14;
        this.f21368m = interfaceC1809a15;
        this.f21369n = interfaceC1809a16;
        this.f21370o = interfaceC1809a17;
        this.f21371p = interfaceC1809a18;
        this.f21372q = interfaceC1809a19;
        this.f21373r = interfaceC1809a110;
        this.f21374s = interfaceC1809a111;
        this.f21375t = interfaceC1809a112;
        this.f21376u = interfaceC1809a113;
        this.f21363h = interfaceC1809a114;
        this.f21377v = interfaceC1809a115;
        this.f21378w = interfaceC1809a116;
    }

    public /* synthetic */ C5404vd(C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, C1845j1 c1845j18, C1845j1 c1845j19, Context context, C1845j1 c1845j110, C1845j1 c1845j111, C1845j1 c1845j112, C1845j1 c1845j113, C1845j1 c1845j114, C5518yt c5518yt) {
        this.f21370o = c1845j1;
        this.f21371p = c1845j12;
        this.f21372q = c1845j13;
        this.f21373r = c1845j14;
        this.f21374s = c1845j15;
        this.f21375t = c1845j16;
        this.f21376u = c1845j17;
        this.f21363h = c1845j18;
        this.f21364i = c1845j19;
        this.f21378w = context;
        this.f21365j = c1845j110;
        this.f21366k = c1845j111;
        this.f21367l = c1845j112;
        this.f21368m = c1845j113;
        this.f21369n = c1845j114;
        this.f21377v = c5518yt;
    }

    public /* synthetic */ C5404vd(List list, C1192y c1192y, C1109c1 c1109c1, C1107c c1107c, Context context, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, InterfaceC1809a1 interfaceC1809a17) {
        this.f21371p = list;
        this.f21372q = c1192y;
        this.f21373r = c1109c1;
        this.f21374s = c1107c;
        this.f21378w = context;
        this.f21375t = c1845j1;
        this.f21364i = interfaceC1809a1;
        this.f21365j = interfaceC1809a12;
        this.f21366k = interfaceC1809a13;
        this.f21367l = interfaceC1809a14;
        this.f21368m = interfaceC1809a15;
        this.f21369n = interfaceC1809a16;
        this.f21376u = c1845j12;
        this.f21363h = c1845j13;
        this.f21377v = c1845j14;
        this.f21370o = interfaceC1809a17;
    }
}
