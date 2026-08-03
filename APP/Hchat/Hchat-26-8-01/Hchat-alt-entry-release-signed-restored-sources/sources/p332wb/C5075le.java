package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p036c9.C0447i0;
import p080fb.C1107c;
import p080fb.C1109c1;
import p080fb.C1192y;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p211o9.C3104q;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.le */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5075le implements InterfaceC1231l {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ InterfaceC1809a1 f18630A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ InterfaceC1809a1 f18631B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ InterfaceC1809a1 f18632C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ InterfaceC1809a1 f18633D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC1809a1 f18634E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC1809a1 f18635F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC1809a1 f18636G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC1809a1 f18637H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC1809a1 f18638I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC1809a1 f18639J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f18640K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f18641L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f18642M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f18643N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Object f18644O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Object f18645P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Object f18646Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Object f18647R;

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ Object f18648S;

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object f18649T;

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Object f18650U;

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ InterfaceC1809a1 f18651V;

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ InterfaceC1809a1 f18652W;

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ InterfaceC1809a1 f18653X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1809a1 f18654Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1809a1 f18655Z;

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ InterfaceC1809a1 f18656a0;

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ InterfaceC1809a1 f18657b0;

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ InterfaceC1809a1 f18658c0;

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Object f18659d0;

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ Object f18660e0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18661g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f18662h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f18663i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18664j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18665k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18666l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18667m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f18668n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f18669o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f18670p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ String f18671q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f18672r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f18673s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f18674t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f18675u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f18676v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f18677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f18678x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f18679y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC1809a1 f18680z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5075le(List list, C1192y c1192y, C1109c1 c1109c1, C1107c c1107c, Context context, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, String str, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, C1845j1 c1845j18, C1845j1 c1845j19, C1845j1 c1845j110, C1845j1 c1845j111, C1845j1 c1845j112, C1845j1 c1845j113, C1845j1 c1845j114, C1845j1 c1845j115, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, C1845j1 c1845j116, C5518yt c5518yt, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123, InterfaceC1809a1 interfaceC1809a124, InterfaceC1809a1 interfaceC1809a125, InterfaceC1809a1 interfaceC1809a126, C5453wt c5453wt) {
        this.f18662h = list;
        this.f18640K = c1192y;
        this.f18641L = c1109c1;
        this.f18642M = c1107c;
        this.f18663i = context;
        this.f18643N = c1845j1;
        this.f18664j = interfaceC1809a1;
        this.f18665k = interfaceC1809a12;
        this.f18666l = interfaceC1809a13;
        this.f18667m = interfaceC1809a14;
        this.f18668n = interfaceC1809a15;
        this.f18669o = interfaceC1809a16;
        this.f18670p = interfaceC1809a17;
        this.f18671q = str;
        this.f18644O = c1845j12;
        this.f18645P = c1845j13;
        this.f18646Q = c1845j14;
        this.f18647R = c1845j15;
        this.f18648S = c1845j16;
        this.f18649T = c1845j17;
        this.f18650U = c1845j18;
        this.f18651V = c1845j19;
        this.f18652W = c1845j110;
        this.f18653X = c1845j111;
        this.f18654Y = c1845j112;
        this.f18655Z = c1845j113;
        this.f18656a0 = c1845j114;
        this.f18657b0 = c1845j115;
        this.f18672r = interfaceC1809a18;
        this.f18673s = interfaceC1809a19;
        this.f18674t = interfaceC1809a110;
        this.f18675u = interfaceC1809a111;
        this.f18676v = interfaceC1809a112;
        this.f18677w = interfaceC1809a113;
        this.f18678x = interfaceC1809a114;
        this.f18679y = interfaceC1809a115;
        this.f18680z = interfaceC1809a116;
        this.f18630A = interfaceC1809a117;
        this.f18631B = interfaceC1809a118;
        this.f18658c0 = c1845j116;
        this.f18659d0 = c5518yt;
        this.f18632C = interfaceC1809a119;
        this.f18633D = interfaceC1809a120;
        this.f18634E = interfaceC1809a121;
        this.f18635F = interfaceC1809a122;
        this.f18636G = interfaceC1809a123;
        this.f18637H = interfaceC1809a124;
        this.f18638I = interfaceC1809a125;
        this.f18639J = interfaceC1809a126;
        this.f18660e0 = c5453wt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C3623h c3623h;
        boolean z9;
        Object obj2;
        int i9;
        switch (this.f18661g) {
            case 0:
                C3104q c3104q = (C3104q) this.f18640K;
                ArrayList arrayList = (ArrayList) this.f18642M;
                List list = (List) this.f18641L;
                String str = (String) this.f18643N;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f18650U;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f18659d0;
                String str2 = (String) this.f18644O;
                String str3 = (String) this.f18645P;
                String str4 = (String) this.f18646Q;
                String str5 = (String) this.f18647R;
                String str6 = (String) this.f18648S;
                String str7 = (String) this.f18649T;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18660e0;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19732b4, 3);
                List list2 = this.f18662h;
                String str8 = this.f18671q;
                Context context = this.f18663i;
                C3623h.m7604a(c3623h2, null, new C3874d(-642622547, new C4905g7(list2, c3104q, arrayList, list, str8, str, interfaceC1231l, context), true), 3);
                if (c3104q != null) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19740c4, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(2101296584, new C0447i0(1, str, str8), true), 3);
                    z9 = true;
                    c3623h = c3623h2;
                    obj2 = null;
                    i9 = 3;
                } else {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19748d4, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(1126788433, new C5326t1(22, this.f18664j, this.f18665k), true), 3);
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19756e4, 3);
                    c3623h = c3623h2;
                    C3623h.m7604a(c3623h, null, new C3874d(1240415315, new C5366u8(this.f18666l, sharedPreferences, str8, this.f18667m, this.f18668n, this.f18669o, context, str2, str3, this.f18670p, this.f18672r, this.f18673s, this.f18674t, str4, str5, str6, str7), true), 3);
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19764f4, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(1354042197, new C5105mb(this.f18675u, sharedPreferences, str8, this.f18676v, this.f18677w, context, this.f18678x, this.f18679y, this.f18680z, this.f18630A, this.f18631B, this.f18632C, this.f18633D, this.f18634E, this.f18635F, this.f18636G, this.f18637H, this.f18638I, this.f18639J), true), 3);
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19772g4, 3);
                    z9 = true;
                    obj2 = null;
                    i9 = 3;
                    C3623h.m7604a(c3623h, null, new C3874d(1467669079, new C4801d1(this.f18651V, sharedPreferences, str8, this.f18652W, this.f18653X, this.f18654Y, this.f18655Z, this.f18656a0, this.f18657b0, this.f18658c0), true), 3);
                }
                C3623h.m7604a(c3623h, obj2, AbstractC5193p0.f19780h4, i9);
                C3623h.m7604a(c3623h, obj2, new C3874d(1483754671, new C4880ff(interfaceC1220a, 4), z9), i9);
                return C3967n.f12976a;
            default:
                C1192y c1192y = (C1192y) this.f18640K;
                C1109c1 c1109c1 = (C1109c1) this.f18641L;
                C1107c c1107c = (C1107c) this.f18642M;
                C1845j1 c1845j1 = (C1845j1) this.f18643N;
                C1845j1 c1845j12 = (C1845j1) this.f18644O;
                C1845j1 c1845j13 = (C1845j1) this.f18645P;
                C1845j1 c1845j14 = (C1845j1) this.f18646Q;
                C1845j1 c1845j15 = (C1845j1) this.f18647R;
                C1845j1 c1845j16 = (C1845j1) this.f18648S;
                C1845j1 c1845j17 = (C1845j1) this.f18649T;
                C1845j1 c1845j18 = (C1845j1) this.f18650U;
                C1845j1 c1845j19 = (C1845j1) this.f18651V;
                C1845j1 c1845j110 = (C1845j1) this.f18652W;
                C1845j1 c1845j111 = (C1845j1) this.f18653X;
                C1845j1 c1845j112 = (C1845j1) this.f18654Y;
                C1845j1 c1845j113 = (C1845j1) this.f18655Z;
                C1845j1 c1845j114 = (C1845j1) this.f18656a0;
                C1845j1 c1845j115 = (C1845j1) this.f18657b0;
                C1845j1 c1845j116 = (C1845j1) this.f18658c0;
                C5518yt c5518yt = (C5518yt) this.f18659d0;
                C5453wt c5453wt = (C5453wt) this.f18660e0;
                String str9 = (String) obj;
                str9.getClass();
                c1845j1.setValue(this.f18662h);
                InterfaceC1809a1 interfaceC1809a1 = this.f18664j;
                interfaceC1809a1.setValue(c1192y);
                String str10 = c1192y != null ? c1192y.f4006b : null;
                if (str10 == null) {
                    str10 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                InterfaceC1809a1 interfaceC1809a12 = this.f18665k;
                interfaceC1809a12.setValue(str10);
                InterfaceC1809a1 interfaceC1809a13 = this.f18666l;
                interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                InterfaceC1809a1 interfaceC1809a14 = this.f18667m;
                interfaceC1809a14.setValue(str9);
                InterfaceC1809a1 interfaceC1809a15 = this.f18668n;
                interfaceC1809a15.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                Context context2 = this.f18663i;
                C5491y2.m9774F0(context2, c1109c1);
                InterfaceC1809a1 interfaceC1809a16 = this.f18669o;
                interfaceC1809a16.setValue(null);
                InterfaceC1809a1 interfaceC1809a17 = this.f18670p;
                C5491y2.m9812X0(interfaceC1809a17, 0);
                boolean zM9843t1 = C5491y2.m9843t1(context2, this.f18671q, c1845j12, c1845j13, c1845j14, c1845j15, c1845j16, c1845j17, c1845j18, c1845j19, c1845j110, c1845j111, c1845j112, c1845j113, c1845j114, c1845j115, this.f18672r, this.f18673s, this.f18674t, this.f18675u, this.f18676v, this.f18677w, this.f18678x, this.f18679y, this.f18680z, this.f18630A, this.f18631B, c1845j1, c1845j116, interfaceC1809a16, c5518yt, this.f18632C, interfaceC1809a13, interfaceC1809a15, interfaceC1809a17, this.f18633D, interfaceC1809a1, interfaceC1809a12, this.f18634E, this.f18635F, this.f18636G, this.f18637H, this.f18638I, this.f18639J, c5453wt, interfaceC1809a14, c1107c.f3585b, c1107c.f3594k, c1107c.f3595l, Opcodes.ASM4);
                if (zM9843t1) {
                    Toast.makeText(context2, "正在重新生成", 0).show();
                }
                return Boolean.valueOf(zM9843t1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C5075le(C3104q c3104q, List list, ArrayList arrayList, List list2, String str, String str2, InterfaceC1231l interfaceC1231l, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, String str3, String str4, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, String str5, String str6, String str7, String str8, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123, InterfaceC1809a1 interfaceC1809a124, InterfaceC1809a1 interfaceC1809a125, InterfaceC1809a1 interfaceC1809a126, InterfaceC1809a1 interfaceC1809a127, InterfaceC1809a1 interfaceC1809a128, InterfaceC1809a1 interfaceC1809a129, InterfaceC1809a1 interfaceC1809a130, InterfaceC1809a1 interfaceC1809a131, InterfaceC1809a1 interfaceC1809a132, InterfaceC1809a1 interfaceC1809a133, InterfaceC1809a1 interfaceC1809a134, InterfaceC1220a interfaceC1220a) {
        this.f18640K = c3104q;
        this.f18662h = list;
        this.f18642M = arrayList;
        this.f18641L = list2;
        this.f18671q = str;
        this.f18643N = str2;
        this.f18650U = interfaceC1231l;
        this.f18663i = context;
        this.f18664j = interfaceC1809a1;
        this.f18665k = interfaceC1809a12;
        this.f18666l = interfaceC1809a13;
        this.f18659d0 = sharedPreferences;
        this.f18667m = interfaceC1809a14;
        this.f18668n = interfaceC1809a15;
        this.f18669o = interfaceC1809a16;
        this.f18644O = str3;
        this.f18645P = str4;
        this.f18670p = interfaceC1809a17;
        this.f18672r = interfaceC1809a18;
        this.f18673s = interfaceC1809a19;
        this.f18674t = interfaceC1809a110;
        this.f18646Q = str5;
        this.f18647R = str6;
        this.f18648S = str7;
        this.f18649T = str8;
        this.f18675u = interfaceC1809a111;
        this.f18676v = interfaceC1809a112;
        this.f18677w = interfaceC1809a113;
        this.f18678x = interfaceC1809a114;
        this.f18679y = interfaceC1809a115;
        this.f18680z = interfaceC1809a116;
        this.f18630A = interfaceC1809a117;
        this.f18631B = interfaceC1809a118;
        this.f18632C = interfaceC1809a119;
        this.f18633D = interfaceC1809a120;
        this.f18634E = interfaceC1809a121;
        this.f18635F = interfaceC1809a122;
        this.f18636G = interfaceC1809a123;
        this.f18637H = interfaceC1809a124;
        this.f18638I = interfaceC1809a125;
        this.f18639J = interfaceC1809a126;
        this.f18651V = interfaceC1809a127;
        this.f18652W = interfaceC1809a128;
        this.f18653X = interfaceC1809a129;
        this.f18654Y = interfaceC1809a130;
        this.f18655Z = interfaceC1809a131;
        this.f18656a0 = interfaceC1809a132;
        this.f18657b0 = interfaceC1809a133;
        this.f18658c0 = interfaceC1809a134;
        this.f18660e0 = interfaceC1220a;
    }
}
