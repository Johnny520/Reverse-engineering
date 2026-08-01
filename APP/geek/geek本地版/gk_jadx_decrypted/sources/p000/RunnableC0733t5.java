package p000;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;
import io.fastkv.LimitExecutor;
import io.fastkv.MPFastKV;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: t5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0733t5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4508b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4509c;

    public /* synthetic */ RunnableC0733t5(Object obj, int i, Object obj2) {
        this.f4507a = i;
        this.f4508b = obj;
        this.f4509c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4507a;
        Object obj = this.f4509c;
        Object obj2 = this.f4508b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                ExecutorC0770u5 executorC0770u5 = (ExecutorC0770u5) obj2;
                Runnable runnable = (Runnable) obj;
                executorC0770u5.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0770u5.m2420a();
                }
            case Base64.NO_PADDING /* 1 */:
                ((C0551o9) obj2).mo96f((String) obj);
                return;
            case Base64.NO_WRAP /* 2 */:
                ((ViewGroup) obj2).removeView((View) ((i00) obj).f2326b);
                return;
            case 3:
                ((LimitExecutor) obj2).lambda$wrapTask$0((Runnable) obj);
                return;
            case 4:
                ((MPFastKV) obj2).lambda$updateFile$0((String) obj);
                return;
            case 5:
                String str = (String) obj2;
                String str2 = (String) obj;
                ClassLoader classLoader = AbstractC0143d9.f1405a;
                if (classLoader != null) {
                    AbstractC0796uv.m2473c(classLoader, str, str2);
                    return;
                }
                return;
            case 6:
                String str3 = (String) obj2;
                i00 i00Var = (i00) obj;
                ClassLoader classLoader2 = AbstractC0143d9.f1405a;
                if (classLoader2 != null) {
                    Handler handler = AbstractC0796uv.f4772a;
                    AbstractC0796uv.m2476f(classLoader2, str3, (String) i00Var.f2326b);
                    return;
                }
                return;
            case 7:
                ((C0312hv) obj2).mo10a();
                ((CountDownLatch) obj).countDown();
                return;
            case 8:
                ((InterfaceC0713sm) obj2).mo96f((String) obj);
                return;
            case 9:
                ((AbstractC0979zt) obj2).mo2609J((Typeface) obj);
                return;
            default:
                Activity activity = (Activity) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                try {
                    C0819vh.m2511d(activity, viewGroup);
                    return;
                } catch (Throwable unused) {
                    z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "TitleSpoofer", "Fg==\n", "c8HJlSTQVfc=\n");
                    return;
                }
        }
    }
}
