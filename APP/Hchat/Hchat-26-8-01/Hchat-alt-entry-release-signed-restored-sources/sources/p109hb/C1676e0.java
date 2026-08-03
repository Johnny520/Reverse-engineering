package p109hb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import java.util.Set;
import na.C2921i;
import na.C2922j;
import p010aa.C0033a;
import p010aa.C0040h;
import p051db.C0763a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p144k.C2209s1;
import p197n9.C2912a;
import p211o9.C3104q;
import p243q9.C3471g;
import p276sf.C3967n;
import p332wb.C4810da;
import p332wb.C4989iq;
import p332wb.C5491y2;
import tf.AbstractC4156d0;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: hb.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1676e0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5540g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5541h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5542i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5543j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1676e0(int i9, C2912a c2912a, InterfaceC1809a1 interfaceC1809a1) {
        this.f5540g = 5;
        this.f5541h = i9;
        this.f5542i = c2912a;
        this.f5543j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f5540g) {
            case 0:
                C5491y2.m9820a2((Activity) this.f5542i, "设置秒数", this.f5541h, 0, 59, (C1703z) this.f5543j, new C2209s1(7));
                break;
            case 1:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), Integer.valueOf(((C0763a) this.f5543j).f2286a));
                break;
            case 2:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C2921i) this.f5543j);
                break;
            case 3:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C0033a) this.f5543j);
                break;
            case 4:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C3104q) this.f5543j);
                break;
            case 5:
                C2912a c2912a = (C2912a) this.f5542i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f5543j;
                Set set = c2912a.f9411c;
                interfaceC1809a1.setValue(this.f5541h == set.size() ? AbstractC4156d0.m8352T((Set) interfaceC1809a1.getValue(), set) : AbstractC4156d0.m8353U((Set) interfaceC1809a1.getValue(), set));
                break;
            case 6:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C4297h) this.f5543j);
                break;
            case 7:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C0040h) this.f5543j);
                break;
            case 8:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C2922j) this.f5543j);
                break;
            case 9:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C3471g) this.f5543j);
                break;
            case 10:
                ((InterfaceC1235p) this.f5542i).invoke(Integer.valueOf(this.f5541h), (C4298i) this.f5543j);
                break;
            case 11:
                Context context = (Context) this.f5542i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f5543j;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    Toast.makeText(context, "当前页面无法打开文件选择器", 0).show();
                } else {
                    C4989iq.f17987a.m9726b(activity, this.f5541h, new C4810da(interfaceC1231l, context, 2));
                }
                return C3967n.f12976a;
            default:
                C5491y2.m9820a2((Activity) this.f5542i, "设置秒数", this.f5541h, 0, 59, (C1703z) this.f5543j, new C2209s1(25));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1676e0(Object obj, int i9, Object obj2, int i10) {
        this.f5540g = i10;
        this.f5542i = obj;
        this.f5541h = i9;
        this.f5543j = obj2;
    }
}
