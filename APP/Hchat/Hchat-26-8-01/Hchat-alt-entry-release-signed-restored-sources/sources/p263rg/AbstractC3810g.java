package p263rg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ci.C0589j;
import java.lang.reflect.InvocationTargetException;
import p080fb.AbstractC1184v0;
import p190n2.ChoreographerFrameCallbackC2889x;
import p249qg.AbstractC3553c0;
import p249qg.C3564g;
import p276sf.C3959f;
import p353xg.C5808e;
import vg.AbstractC4564m;

/* JADX INFO: renamed from: rg.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3810g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f12500a = 0;
    private static volatile Choreographer choreographer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object c3959f;
        try {
            c3959f = new C3808e(m7999b(Looper.getMainLooper()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m7998a(C3564g c3564g) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new ChoreographerFrameCallbackC2889x(c3564g, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final Handler m7999b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Object m8000c(C0589j c0589j) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(c0589j));
            c3564g.m7513p();
            choreographer2.postFrameCallback(new ChoreographerFrameCallbackC2889x(c3564g, 1));
            return c3564g.m7512o();
        }
        C3564g c3564g2 = new C3564g(1, AbstractC1184v0.m3214x(c0589j));
        c3564g2.m7513p();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m7998a(c3564g2);
        } else {
            C5808e c5808e = AbstractC3553c0.f11555a;
            AbstractC4564m.f15049a.mo7538w(c3564g2.f11567k, new RunnableC3809f(c3564g2, 0));
        }
        return c3564g2.m7512o();
    }
}
