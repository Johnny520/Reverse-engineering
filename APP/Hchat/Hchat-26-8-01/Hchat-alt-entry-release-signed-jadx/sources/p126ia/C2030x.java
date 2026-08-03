package p126ia;

import android.app.Activity;
import p085fg.InterfaceC1220a;
import p099h.Hchat.utils.KavaReflector;
import p276sf.C3967n;

/* JADX INFO: renamed from: ia.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2030x implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6860g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2007a0 f6861h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2030x(C2007a0 c2007a0, int i9) {
        this.f6860g = i9;
        this.f6861h = c2007a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f6860g) {
            case 0:
                return KavaReflector.loadClass("androidx.recyclerview.widget.RecyclerView", this.f6861h.f6758a.f12145c);
            default:
                C2007a0 c2007a0 = this.f6861h;
                for (String str : c2007a0.f6759b.m809d()) {
                    C2009c c2009cM815l = c2007a0.f6759b.m815l(str);
                    synchronized (c2007a0.f6768k) {
                        Object obj = c2007a0.m4955m(str).f10806b;
                        if (obj != null && c2007a0.m4951h(str, obj, c2007a0.m4948d(c2009cM815l), C2007a0.m4944g(c2009cM815l), c2007a0.m4950f(), c2007a0.m4949e())) {
                            c2007a0.f6759b.m806a(str, c2009cM815l);
                        }
                    }
                }
                Activity activityM4943c = C2007a0.m4943c();
                if (activityM4943c != null) {
                    c2007a0.m4956n(activityM4943c, null);
                }
                return C3967n.f12976a;
        }
    }
}
