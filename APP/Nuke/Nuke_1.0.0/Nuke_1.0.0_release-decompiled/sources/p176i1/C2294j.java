package p176i1;

import android.os.Handler;
import android.os.Looper;
import me.dartcv.nuke.BuildConfig;
import p028F.RunnableC0342c;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p153e1.C2016l;

/* JADX INFO: renamed from: i1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2294j extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7477e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2310z f7478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2294j(C2310z c2310z, int i5) {
        super(1);
        this.f7477e = i5;
        this.f7478f = c2310z;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f7477e) {
            case 0:
                InterfaceC0430v interfaceC0430vMo643n = ((InterfaceC0430v) obj).mo643n();
                AbstractC1665j.m2982b(interfaceC0430vMo643n);
                this.f7478f.m4141m(interfaceC0430vMo643n);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C2016l c2016l = new C2016l(((C2016l) obj).f6741a);
                C2310z c2310z = this.f7478f;
                c2310z.m6329setPopupContentSizefhxjrPA(c2016l);
                c2310z.m4142n();
                break;
            default:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) obj;
                C2310z c2310z2 = this.f7478f;
                Handler handler = c2310z2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1599a.mo6a();
                } else {
                    Handler handler2 = c2310z2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0342c(interfaceC1599a, 5));
                    }
                }
                break;
        }
        return C0891q.f2780a;
    }
}
