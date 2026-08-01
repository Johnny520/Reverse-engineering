package p000;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.megatronking.stringfog.Base64;
import io.fastkv.LimitExecutor;
import io.fastkv.MPFastKV;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: t5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0732t5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4413c;

    public /* synthetic */ RunnableC0732t5(Object obj, int i, Object obj2) {
        this.f4411a = i;
        this.f4412b = obj;
        this.f4413c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4411a;
        Object obj = this.f4413c;
        Object obj2 = this.f4412b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                ExecutorC0769u5 executorC0769u5 = (ExecutorC0769u5) obj2;
                Runnable runnable = (Runnable) obj;
                executorC0769u5.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0769u5.m2438a();
                }
            case Base64.NO_PADDING /* 1 */:
                ((ViewGroup) obj2).removeView((FrameLayout) obj);
                return;
            case Base64.NO_WRAP /* 2 */:
                ((e30) obj2).mo26f((String) obj);
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
                ClassLoader classLoader = AbstractC0551o9.f3420a;
                if (classLoader != null) {
                    AbstractC0083bw.m543c(classLoader, str, str2);
                    return;
                }
                return;
            case 6:
                String str3 = (String) obj2;
                p00 p00Var = (p00) obj;
                ClassLoader classLoader2 = AbstractC0551o9.f3420a;
                if (classLoader2 != null) {
                    Handler handler = AbstractC0083bw.f783a;
                    AbstractC0083bw.m546f(classLoader2, str3, (String) p00Var.f3560b);
                    return;
                }
                return;
            case 7:
                ((C0610pv) obj2).mo474a();
                ((CountDownLatch) obj).countDown();
                return;
            case 8:
                ((InterfaceC0786um) obj2).mo26f((String) obj);
                return;
            case 9:
                ((AbstractC0498mu) obj2).mo969x((Typeface) obj);
                return;
            default:
                Activity activity = (Activity) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                try {
                    C0893xh.m2685e(activity, viewGroup);
                    return;
                } catch (Throwable unused) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("3mdfTbgC9MflaE5T\n", "ig4rId1RhKg=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                    return;
                }
        }
    }
}
