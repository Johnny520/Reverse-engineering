package p093v;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: v.d */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1019d implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f3620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f3621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1018c f3622d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3623e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CallableC1019d(String str, Context context, C1018c c1018c, int i2, int i3) {
        this.f3619a = i3;
        this.f3620b = str;
        this.f3621c = context;
        this.f3622d = c1018c;
        this.f3623e = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3619a) {
            case 0:
                return AbstractC1022g.m2220a(this.f3620b, this.f3621c, this.f3622d, this.f3623e);
            default:
                try {
                    return AbstractC1022g.m2220a(this.f3620b, this.f3621c, this.f3622d, this.f3623e);
                } catch (Throwable unused) {
                    return new C1021f(-3);
                }
        }
    }
}
