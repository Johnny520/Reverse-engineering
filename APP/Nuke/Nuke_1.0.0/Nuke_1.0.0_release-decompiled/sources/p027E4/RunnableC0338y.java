package p027E4;

import android.os.StrictMode;
import android.util.Log;
import com.bumptech.glide.AbstractC1923e;
import me.dartcv.nuke.BuildConfig;
import p074O2.C1052j;
import p102U1.ThreadFactoryC1473c;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2153p;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p166g3.C2187d;
import p190k3.C2459g;

/* JADX INFO: renamed from: E4.y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0338y implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1067d;

    /* JADX INFO: renamed from: e */
    public Object f1068e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1069f;

    public /* synthetic */ RunnableC0338y(int i5, Object obj, Object obj2) {
        this.f1067d = i5;
        this.f1068e = obj;
        this.f1069f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1067d) {
            case 0:
                AbstractC1923e.m3448G((C0337x) this.f1068e).mo278i(AbstractC1784a.m3229o((Throwable) this.f1069f));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ThreadFactoryC1473c threadFactoryC1473c = (ThreadFactoryC1473c) this.f1069f;
                if (threadFactoryC1473c.f5157d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f1068e).run();
                } catch (Throwable th) {
                    threadFactoryC1473c.f5156c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
                break;
            case 2:
                ((C2135g) this.f1068e).m3960E((C2187d) this.f1069f);
                break;
            default:
                C2459g c2459g = (C2459g) this.f1069f;
                AbstractC2153p abstractC2153p = c2459g.f7936g;
                int i5 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1068e).run();
                    } catch (Throwable th2) {
                        AbstractC2162v.m3990l(C1052j.f3286d, th2);
                    }
                    Runnable runnableM4389G = c2459g.m4389G();
                    if (runnableM4389G == null) {
                        break;
                    } else {
                        this.f1068e = runnableM4389G;
                        i5++;
                        if (i5 >= 16 && abstractC2153p.mo3975E(c2459g)) {
                            abstractC2153p.mo1207D(c2459g, this);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0338y(Object obj, Runnable runnable, int i5) {
        this.f1067d = i5;
        this.f1069f = obj;
        this.f1068e = runnable;
    }
}
