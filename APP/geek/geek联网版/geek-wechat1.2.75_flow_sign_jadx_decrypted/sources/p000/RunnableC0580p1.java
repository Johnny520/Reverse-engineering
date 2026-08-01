package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0580p1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f3562b;

    public /* synthetic */ RunnableC0580p1(Activity activity, int i) {
        this.f3561a = i;
        this.f3562b = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r4;
        switch (this.f3561a) {
            case Base64.DEFAULT /* 0 */:
                Activity activity = this.f3562b;
                if (!activity.isFinishing()) {
                    Handler handler = AbstractC0691s1.f4186g;
                    Method method = AbstractC0691s1.f4185f;
                    int i = Build.VERSION.SDK_INT;
                    if (i < 28) {
                        ?? r52 = 27;
                        if (((i != 26 && i != 27) || method != null) && (AbstractC0691s1.f4184e != null || AbstractC0691s1.f4183d != null)) {
                            try {
                                Object obj2 = AbstractC0691s1.f4182c.get(activity);
                                if (obj2 != null && (obj = AbstractC0691s1.f4181b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    C0654r1 c0654r1 = new C0654r1(activity);
                                    application.registerActivityLifecycleCallbacks(c0654r1);
                                    handler.post(new RunnableC0282h1(c0654r1, obj2, 1, false));
                                    ?? r42 = (i == 26 || i == 27) ? 1 : 0;
                                    try {
                                        if (r42 != 0) {
                                            try {
                                                Boolean bool = Boolean.FALSE;
                                                r42 = application;
                                                r52 = c0654r1;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } catch (Throwable th) {
                                                th = th;
                                                r4 = application;
                                                r5 = c0654r1;
                                                handler.post(new RunnableC0282h1(r4, r5, 2, false));
                                                throw th;
                                            }
                                        } else {
                                            r42 = application;
                                            r52 = c0654r1;
                                            activity.recreate();
                                        }
                                        handler.post(new RunnableC0282h1(r42, r52, 2, false));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r4 = r42;
                                        r5 = r52;
                                    }
                                    break;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        activity.recreate();
                    } else {
                        activity.recreate();
                    }
                }
                break;
            default:
                try {
                    C0893xh.m2687g(this.f3562b);
                } catch (Throwable unused2) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "MenuLaunch_Crash", "tw==\n", "0vI8ySRxU5w=\n");
                }
                break;
        }
    }
}
