package p332wb;

import android.content.Context;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.concurrent.ConcurrentHashMap;
import p080fb.C1109c1;
import p080fb.C1113d1;
import p080fb.C1125g1;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.qs */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5254qs implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20288g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20289h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20290i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20291j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20292k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1845j1 f20293l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C5518yt f20294m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1845j1 f20295n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20296o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20297p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f20298q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f20299r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f20300s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f20301t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5254qs(Context context, String str, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a1, C1845j1 c1845j12, C5518yt c5518yt, C1845j1 c1845j13, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f20289h = context;
        this.f20290i = str;
        this.f20291j = c1845j1;
        this.f20292k = interfaceC1809a1;
        this.f20293l = c1845j12;
        this.f20294m = c5518yt;
        this.f20295n = c1845j13;
        this.f20296o = interfaceC1809a12;
        this.f20297p = interfaceC1809a13;
        this.f20298q = interfaceC1809a14;
        this.f20299r = interfaceC1809a15;
        this.f20300s = interfaceC1809a16;
        this.f20301t = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C5518yt c5518yt;
        switch (this.f20288g) {
            case 0:
                C1845j1 c1845j1 = this.f20293l;
                InterfaceC1809a1 interfaceC1809a1 = this.f20291j;
                String str = this.f20290i;
                Context context = this.f20289h;
                C5518yt c5518yt2 = this.f20294m;
                C1845j1 c1845j12 = this.f20295n;
                InterfaceC1809a1 interfaceC1809a12 = this.f20292k;
                InterfaceC1809a1 interfaceC1809a13 = this.f20296o;
                InterfaceC1809a1 interfaceC1809a14 = this.f20297p;
                InterfaceC1809a1 interfaceC1809a15 = this.f20298q;
                InterfaceC1809a1 interfaceC1809a16 = this.f20299r;
                InterfaceC1809a1 interfaceC1809a17 = this.f20300s;
                InterfaceC1809a1 interfaceC1809a18 = this.f20301t;
                C1113d1 c1113d1 = (C1113d1) obj;
                c1113d1.getClass();
                C5491y2.m9834l1(c1845j1, interfaceC1809a1, str, context, c5518yt2, c1845j12, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, c1113d1, true);
                break;
            default:
                Context context2 = this.f20289h;
                String str2 = this.f20290i;
                InterfaceC1809a1 interfaceC1809a19 = this.f20291j;
                InterfaceC1809a1 interfaceC1809a110 = this.f20292k;
                C1845j1 c1845j13 = this.f20293l;
                C5518yt c5518yt3 = this.f20294m;
                C1845j1 c1845j14 = this.f20295n;
                InterfaceC1809a1 interfaceC1809a111 = this.f20296o;
                InterfaceC1809a1 interfaceC1809a112 = this.f20297p;
                InterfaceC1809a1 interfaceC1809a113 = this.f20298q;
                InterfaceC1809a1 interfaceC1809a114 = this.f20299r;
                InterfaceC1809a1 interfaceC1809a115 = this.f20300s;
                InterfaceC1809a1 interfaceC1809a116 = this.f20301t;
                C1113d1 c1113d12 = (C1113d1) obj;
                c1113d12.getClass();
                boolean z9 = c1113d12.f3648m;
                String str3 = c1113d12.f3636a;
                if (z9) {
                    Toast.makeText(context2, "请先解锁该对话", 0).show();
                } else {
                    ConcurrentHashMap concurrentHashMap = AbstractC5420vt.f21558a;
                    str3.getClass();
                    ConcurrentHashMap concurrentHashMap2 = AbstractC5420vt.f21558a;
                    C5518yt c5518yt4 = (C5518yt) concurrentHashMap2.get(str3);
                    if (c5518yt4 != null) {
                        if (!c5518yt4.m9936L()) {
                            c5518yt = c5518yt3;
                            if (c5518yt4.f22261E.getValue() != null || c5518yt4.f22260D.getValue() != null || c5518yt4.f22258B.getValue() != null || c5518yt4.f22259C.getValue() != null) {
                            }
                        }
                        Toast.makeText(context2, "该对话正在运行或有待确认操作，请先处理后再删除", 0).show();
                    } else {
                        c5518yt = c5518yt3;
                    }
                    C5491y2.m9774F0(context2, str3.equals(str2) ? (C1109c1) interfaceC1809a19.getValue() : c1113d12.f3650o);
                    C1125g1 c1125g1 = C1125g1.f3676a;
                    C1125g1.m2861e(context2, str3);
                    concurrentHashMap2.remove(str3);
                    if (AbstractC1416l.m3825a(AbstractC5420vt.f21559b, str3)) {
                        AbstractC5420vt.f21559b = null;
                    }
                    interfaceC1809a110.setValue(Integer.valueOf(((Number) interfaceC1809a110.getValue()).intValue() + 1));
                    if (str3.equals(str2)) {
                        C1113d1 c1113d13 = (C1113d1) AbstractC4166m.m8424v1(C1125g1.m2865i(context2));
                        if (c1113d13 == null) {
                            C5491y2.m9833k1(c1845j13, interfaceC1809a19, str2, context2, c5518yt, c1845j14, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, false);
                        } else {
                            C5491y2.m9834l1(c1845j13, interfaceC1809a19, str2, context2, c5518yt, c1845j14, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, c1113d13, false);
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5254qs(C1845j1 c1845j1, C1845j1 c1845j12, String str, Context context, C5518yt c5518yt, C1845j1 c1845j13, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f20293l = c1845j1;
        this.f20291j = c1845j12;
        this.f20290i = str;
        this.f20289h = context;
        this.f20294m = c5518yt;
        this.f20295n = c1845j13;
        this.f20292k = interfaceC1809a1;
        this.f20296o = interfaceC1809a12;
        this.f20297p = interfaceC1809a13;
        this.f20298q = interfaceC1809a14;
        this.f20299r = interfaceC1809a15;
        this.f20300s = interfaceC1809a16;
        this.f20301t = interfaceC1809a17;
    }
}
