package p332wb;

import android.content.Context;
import android.widget.Toast;
import java.util.List;
import p000a.AbstractC0000a;
import p080fb.C1186w;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p345x8.C5726s;

/* JADX INFO: renamed from: wb.ld */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5074ld implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18625g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f18626h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18627i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18628j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18629k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5074ld(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f18626h = context;
        this.f18627i = interfaceC1809a1;
        this.f18628j = interfaceC1809a12;
        this.f18629k = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Object c3959f;
        switch (this.f18625g) {
            case 0:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f18627i;
                int i9 = 0;
                for (Object obj2 : (List) interfaceC1809a1.getValue()) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    C3623h.m7604a(c3623h, null, new C3874d(557486494, new C5500yb(i9, 2), true), 3);
                    C3623h.m7604a(c3623h, null, new C3874d(1481039879, new C5106mc((C5726s) obj2, interfaceC1809a1, i9, this.f18626h, this.f18628j, this.f18629k), true), 3);
                    i9 = i10;
                }
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19880u1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(838014583, new C5373uf(interfaceC1809a1, 3), true), 3);
                return C3967n.f12976a;
            default:
                Context context = this.f18626h;
                InterfaceC1809a1 interfaceC1809a12 = this.f18627i;
                InterfaceC1809a1 interfaceC1809a13 = this.f18628j;
                InterfaceC1809a1 interfaceC1809a14 = this.f18629k;
                String str = (String) obj;
                str.getClass();
                try {
                    interfaceC1809a13.setValue(C1186w.m3237u(context, (String) interfaceC1809a12.getValue(), str).f3937b);
                    int iIntValue = ((Number) interfaceC1809a14.getValue()).intValue();
                    interfaceC1809a14.setValue(Integer.valueOf(iIntValue + 1));
                    c3959f = Integer.valueOf(iIntValue);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    String message = thM8182b.getMessage();
                    if (message == null) {
                        message = "重命名失败";
                    }
                    Toast.makeText(context, message, 0).show();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5074ld(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f18627i = interfaceC1809a1;
        this.f18626h = context;
        this.f18628j = interfaceC1809a12;
        this.f18629k = interfaceC1809a13;
    }
}
