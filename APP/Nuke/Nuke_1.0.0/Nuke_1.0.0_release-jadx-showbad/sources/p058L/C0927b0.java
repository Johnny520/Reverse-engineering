package p058L;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1120g;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p132a3.C1801a;
import p137b3.InterfaceC1855c;

/* JADX INFO: renamed from: L.b0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0927b0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2907d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1599a f2908e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0927b0(InterfaceC1599a interfaceC1599a, int i5) {
        this.f2907d = i5;
        this.f2908e = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f2907d;
        C0891q c0891q = C0891q.f2780a;
        InterfaceC1599a interfaceC1599a = this.f2908e;
        switch (i5) {
            case 0:
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1136w interfaceC1136w = (InterfaceC1136w) obj;
                Object objMo6a = interfaceC1599a.mo6a();
                if (Float.isNaN(((Number) objMo6a).floatValue())) {
                    objMo6a = null;
                }
                Float f2 = (Float) objMo6a;
                C1120g c1120g = new C1120g(f2 != null ? f2.floatValue() : 0.0f, new C1801a(1.0f));
                InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
                C1135v c1135v = AbstractC1132s.f3740c;
                InterfaceC1855c interfaceC1855c = AbstractC1134u.f3766a[1];
                interfaceC1136w.mo1128a(c1135v, c1120g);
                break;
            default:
                interfaceC1599a.mo6a();
                break;
        }
        return c0891q;
    }
}
