package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 implements Handler.Callback {
    public static final i51 b = new i51(19);
    public volatile x82 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x82 a(Context context) {
        if (context == null) {
            s.j("You cannot start a load on a null Context");
            return null;
        }
        char[] cArr = b93.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application) && (context instanceof ContextWrapper)) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                return a(contextWrapper.getBaseContext());
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = new x82(a.a(context.getApplicationContext()), new eb(2), new eb(18), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
