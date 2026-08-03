package p063e9;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p068eh.AbstractC0921a;
import p153k8.C2351o;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: e9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0833d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2533g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2534h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0832c f2535i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f2536j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2351o f2537k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0833d(String str, C0832c c0832c, Context context, C2351o c2351o, int i9) {
        this.f2533g = i9;
        this.f2534h = str;
        this.f2535i = c0832c;
        this.f2536j = context;
        this.f2537k = c2351o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        switch (this.f2533g) {
            case 0:
                Context context = this.f2536j;
                C2351o c2351o = this.f2537k;
                AtomicBoolean atomicBoolean = C0846q.f2580a;
                ConcurrentHashMap concurrentHashMap = C0846q.f2587h;
                String str = this.f2534h;
                Long l10 = (Long) concurrentHashMap.get(str);
                if (l10 != null) {
                    if (System.currentTimeMillis() - l10.longValue() < 1500) {
                    }
                }
                C0832c c0832c = this.f2535i;
                if (!C0846q.m2115A(c0832c, str)) {
                    try {
                        C0846q.m2141z(context, c0832c, C0846q.m2120e(context, c0832c, c2351o));
                        c3959f = C3967n.f12976a;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        AbstractC0921a.m2261x("[Hchat:CustomNotification] 发送自定义通知失败: ", thM8182b.getMessage(), thM8182b);
                    }
                    break;
                }
                break;
            default:
                C0846q.f2583d.execute(new RunnableC0833d(this.f2534h, this.f2535i, this.f2536j, this.f2537k, 0));
                break;
        }
    }
}
