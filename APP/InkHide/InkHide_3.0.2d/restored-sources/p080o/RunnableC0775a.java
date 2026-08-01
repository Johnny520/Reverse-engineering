package p080o;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Method;
import p004C.C0066j;
import p069i.C0651W;
import p093v.C1020e;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0775a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2599c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0775a(Object obj, Object obj2, int i2) {
        this.f2597a = i2;
        this.f2598b = obj;
        this.f2599c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2597a) {
            case 0:
                ((C0776b) this.f2598b).f2600a = this.f2599c;
                return;
            case 1:
                ((Application) this.f2599c).unregisterActivityLifecycleCallbacks((C0776b) this.f2598b);
                return;
            case 2:
                try {
                    Method method = AbstractC0777c.f2609d;
                    Object obj = this.f2598b;
                    Object obj2 = this.f2599c;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0777c.f2610e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                C0651W c0651w = (C0651W) ((C0066j) this.f2598b).f312c;
                if (c0651w != null) {
                    c0651w.m1267b((Typeface) this.f2599c);
                    return;
                }
                return;
            default:
                ((C1020e) this.f2598b).mo1575a(this.f2599c);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0775a(Object obj, Object obj2, int i2, boolean z2) {
        this.f2597a = i2;
        this.f2599c = obj;
        this.f2598b = obj2;
    }
}
