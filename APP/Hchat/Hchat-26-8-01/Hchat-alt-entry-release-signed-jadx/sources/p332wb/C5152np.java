package p332wb;

import android.content.Context;
import android.widget.Toast;
import gb.C1391o;
import gb.C1395s;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p144k.C2173g1;
import p218og.AbstractC3149m;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.np */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5152np implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19271g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1391o f19272h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f19273i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC3599t f19274j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19275k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f19276l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f19277m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f19278n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f19279o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f19280p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f19281q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f19282r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5152np(C1391o c1391o, Context context, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f19272h = c1391o;
        this.f19273i = context;
        this.f19274j = interfaceC3599t;
        this.f19275k = interfaceC1809a1;
        this.f19276l = interfaceC1809a12;
        this.f19277m = interfaceC1809a13;
        this.f19278n = interfaceC1809a14;
        this.f19279o = interfaceC1809a15;
        this.f19280p = interfaceC1809a16;
        this.f19281q = interfaceC1809a17;
        this.f19282r = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f19271g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f19275k;
                if (((String) interfaceC1809a1.getValue()) == null && ((String) this.f19276l.getValue()) == null) {
                    C1391o c1391o = this.f19272h;
                    interfaceC1809a1.setValue(c1391o.f4617a);
                    AbstractC3603v.m7563q(this.f19274j, null, new C2173g1(this.f19273i, c1391o, interfaceC1809a1, this.f19277m, this.f19278n, this.f19279o, this.f19280p, this.f19281q, this.f19282r, null), 3);
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a12 = this.f19275k;
                if (!((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                    C1395s c1395s = (C1395s) this.f19276l.getValue();
                    Context context = this.f19273i;
                    InterfaceC1809a1 interfaceC1809a13 = this.f19277m;
                    if (c1395s == null) {
                        String str = (String) interfaceC1809a13.getValue();
                        if (AbstractC3149m.m6721t0(str)) {
                            str = "当前微信账号资料尚未就绪";
                        }
                        Toast.makeText(context, str, 1).show();
                    } else {
                        InterfaceC1809a1 interfaceC1809a14 = this.f19278n;
                        boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                        interfaceC1809a12.setValue(Boolean.TRUE);
                        interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        AbstractC3603v.m7563q(this.f19274j, null, new C4793cq(zBooleanValue, context, this.f19272h, interfaceC1809a14, this.f19279o, this.f19280p, this.f19281q, this.f19282r, interfaceC1809a13, interfaceC1809a12, null), 3);
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5152np(C1391o c1391o, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f19272h = c1391o;
        this.f19274j = interfaceC3599t;
        this.f19275k = interfaceC1809a1;
        this.f19276l = interfaceC1809a12;
        this.f19273i = context;
        this.f19277m = interfaceC1809a13;
        this.f19278n = interfaceC1809a14;
        this.f19279o = interfaceC1809a15;
        this.f19280p = interfaceC1809a16;
        this.f19281q = interfaceC1809a17;
        this.f19282r = interfaceC1809a18;
    }
}
