package p061e;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import p099y.AbstractC1048L;
import p099y.C1054S;

/* JADX INFO: renamed from: e.l */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0536l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0545u f1758b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0536l(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u, int i2) {
        this.f1757a = i2;
        this.f1758b = layoutInflaterFactory2C0545u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ViewGroup viewGroup;
        boolean z2 = true;
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1758b;
        int i2 = 0;
        switch (this.f1757a) {
            case 0:
                if ((1 & layoutInflaterFactory2C0545u.f1813T) != 0) {
                    layoutInflaterFactory2C0545u.m1113t(0);
                }
                if ((layoutInflaterFactory2C0545u.f1813T & 4096) != 0) {
                    layoutInflaterFactory2C0545u.m1113t(108);
                }
                layoutInflaterFactory2C0545u.f1812S = false;
                layoutInflaterFactory2C0545u.f1813T = 0;
                break;
            default:
                layoutInflaterFactory2C0545u.f1832q.showAtLocation(layoutInflaterFactory2C0545u.f1831p, 55, 0, 0);
                C1054S c1054s = layoutInflaterFactory2C0545u.f1834s;
                if (c1054s != null) {
                    c1054s.m2304b();
                }
                if (!layoutInflaterFactory2C0545u.f1835t || (viewGroup = layoutInflaterFactory2C0545u.f1836u) == null) {
                    z2 = false;
                } else {
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    if (!viewGroup.isLaidOut()) {
                    }
                }
                if (!z2) {
                    layoutInflaterFactory2C0545u.f1831p.setAlpha(1.0f);
                    layoutInflaterFactory2C0545u.f1831p.setVisibility(0);
                } else {
                    layoutInflaterFactory2C0545u.f1831p.setAlpha(0.0f);
                    C1054S c1054sM2282a = AbstractC1048L.m2282a(layoutInflaterFactory2C0545u.f1831p);
                    c1054sM2282a.m2303a(1.0f);
                    layoutInflaterFactory2C0545u.f1834s = c1054sM2282a;
                    c1054sM2282a.m2306d(new C0538n(i2, this));
                }
                break;
        }
    }
}
