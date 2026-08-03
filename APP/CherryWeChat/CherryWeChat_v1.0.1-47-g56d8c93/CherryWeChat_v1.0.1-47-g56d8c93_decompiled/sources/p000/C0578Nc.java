package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: Nc */
/* JADX INFO: loaded from: classes.dex */
public final class C0578Nc implements InterfaceC1136ab {

    /* JADX INFO: renamed from: a */
    public final Context f1875a;

    /* JADX INFO: renamed from: b */
    public final C1429fw f1876b;

    public C0578Nc(Context context, C1429fw c1429fw) {
        this.f1875a = context.getApplicationContext();
        this.f1876b = c1429fw;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
        C2692wy c2692wyM5266b = C2692wy.m5266b(this.f1875a);
        C1429fw c1429fw = this.f1876b;
        synchronized (c2692wyM5266b) {
            ((HashSet) c2692wyM5266b.f9266d).remove(c1429fw);
            if (c2692wyM5266b.f9264b && ((HashSet) c2692wyM5266b.f9266d).isEmpty()) {
                C1094Zd c1094Zd = (C1094Zd) c2692wyM5266b.f9265c;
                ((ConnectivityManager) ((C0061Bb) c1094Zd.f3479c).get()).unregisterNetworkCallback((C2649vy) c1094Zd.f3480d);
                c2692wyM5266b.f9264b = false;
            }
        }
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
        C2692wy c2692wyM5266b = C2692wy.m5266b(this.f1875a);
        C1429fw c1429fw = this.f1876b;
        synchronized (c2692wyM5266b) {
            ((HashSet) c2692wyM5266b.f9266d).add(c1429fw);
            if (!c2692wyM5266b.f9264b && !((HashSet) c2692wyM5266b.f9266d).isEmpty()) {
                C1094Zd c1094Zd = (C1094Zd) c2692wyM5266b.f9265c;
                C0061Bb c0061Bb = (C0061Bb) c1094Zd.f3479c;
                boolean z = false;
                c1094Zd.f3477a = ((ConnectivityManager) c0061Bb.get()).getActiveNetwork() != null;
                try {
                    ((ConnectivityManager) c0061Bb.get()).registerDefaultNetworkCallback((C2649vy) c1094Zd.f3480d);
                    z = true;
                } catch (RuntimeException unused) {
                }
                c2692wyM5266b.f9264b = z;
            }
        }
    }
}
