package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.ComponentCallbacks2C0099a;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 implements Handler.Callback {

    /* JADX INFO: renamed from: b */
    public static final i51 f13363b = new i51(19);

    /* JADX INFO: renamed from: a */
    public volatile x82 f13364a;

    /* JADX INFO: renamed from: a */
    public final x82 m6228a(Context context) {
        if (context == null) {
            C0676s.m4651j("You cannot start a load on a null Context");
            return null;
        }
        char[] cArr = b93.f747a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application) && (context instanceof ContextWrapper)) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                return m6228a(contextWrapper.getBaseContext());
            }
        }
        if (this.f13364a == null) {
            synchronized (this) {
                try {
                    if (this.f13364a == null) {
                        this.f13364a = new x82(ComponentCallbacks2C0099a.m868a(context.getApplicationContext()), new C0160eb(2), new C0160eb(18), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f13364a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
