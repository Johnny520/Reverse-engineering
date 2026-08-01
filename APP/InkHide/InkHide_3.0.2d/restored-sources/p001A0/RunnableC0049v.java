package p001A0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import p080o.AbstractC0777c;
import p080o.C0776b;
import p080o.RunnableC0775a;

/* JADX INFO: renamed from: A0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0049v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f289b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0049v(Activity activity, int i2) {
        this.f288a = i2;
        this.f289b = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0096 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0070 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Handler handler;
        Activity activity = this.f289b;
        switch (this.f288a) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
                Context applicationContext = activity.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = activity;
                }
                C0052y.m96a(activity, applicationContext, "lifecycle-resume");
                break;
            default:
                if (!activity.isFinishing()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 28) {
                        Class cls = AbstractC0777c.f2606a;
                        ?? r5 = 27;
                        ?? r6 = 26;
                        boolean z2 = i2 == 26 || i2 == 27;
                        Method method = AbstractC0777c.f2611f;
                        if ((!z2 || method != null) && (AbstractC0777c.f2610e != null || AbstractC0777c.f2609d != null)) {
                            try {
                                Object obj2 = AbstractC0777c.f2608c.get(activity);
                                if (obj2 != null && (obj = AbstractC0777c.f2607b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    C0776b c0776b = new C0776b(activity);
                                    application.registerActivityLifecycleCallbacks(c0776b);
                                    Handler handler2 = AbstractC0777c.f2612g;
                                    handler2.post(new RunnableC0775a(c0776b, obj2, 0));
                                    try {
                                        if (i2 == 26 || i2 == 27) {
                                            try {
                                                Boolean bool = Boolean.FALSE;
                                                r6 = application;
                                                handler = handler2;
                                                r5 = c0776b;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } catch (Throwable th) {
                                                th = th;
                                                handler = handler2;
                                                r6 = application;
                                                r5 = c0776b;
                                                handler.post(new RunnableC0775a(r6, r5, 1, false));
                                                throw th;
                                            }
                                        } else {
                                            r6 = application;
                                            r5 = c0776b;
                                            handler = handler2;
                                            activity.recreate();
                                        }
                                        handler.post(new RunnableC0775a(r6, r5, 1, false));
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    break;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        activity.recreate();
                    } else {
                        Class cls2 = AbstractC0777c.f2606a;
                        activity.recreate();
                    }
                }
                break;
        }
    }
}
