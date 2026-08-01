package p002A1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import me.dartcv.nuke.BuildConfig;
import p010B3.AbstractActivityC0224c;
import p021D3.RunnableC0270g;
import p030F1.C0436a;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p135b.AbstractActivityC1823k;
import p135b.C1809A;
import p135b.C1815c;
import p135b.RunnableC1814b;

/* JADX INFO: renamed from: A1.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0117F implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f499d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractActivityC0224c f500e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0117F(AbstractActivityC0224c abstractActivityC0224c, int i5) {
        this.f499d = i5;
        this.f500e = abstractActivityC0224c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f499d) {
            case 0:
                return AbstractC0116E.m164f(this.f500e);
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f500e.reportFullyDrawn();
                return C0891q.f2780a;
            case 2:
                return AbstractActivityC1823k.m3292b(this.f500e);
            case 3:
                C0436a c0436a = new C0436a();
                this.f500e.getNavigationEventDispatcher().m700b(c0436a);
                return c0436a;
            case 4:
                AbstractActivityC0224c abstractActivityC0224c = this.f500e;
                return new C0120I(abstractActivityC0224c.getApplication(), abstractActivityC0224c, abstractActivityC0224c.getIntent() != null ? abstractActivityC0224c.getIntent().getExtras() : null);
            default:
                AbstractActivityC0224c abstractActivityC0224c2 = this.f500e;
                C1809A c1809a = new C1809A(new RunnableC1814b(abstractActivityC0224c2, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC1665j.m2981a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0224c2.getLifecycle().mo184a(new C1815c(0, c1809a, abstractActivityC0224c2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0270g(5, abstractActivityC0224c2, c1809a));
                    }
                }
                return c1809a;
        }
    }
}
