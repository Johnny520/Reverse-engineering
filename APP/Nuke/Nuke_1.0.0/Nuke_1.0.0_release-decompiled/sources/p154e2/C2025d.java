package p154e2;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import com.bumptech.glide.ComponentCallbacks2C1947p;
import p110W0.C1577b;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: e2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2025d implements Handler.Callback {

    /* JADX INFO: renamed from: b */
    public static final C1577b f6754b = new C1577b(21);

    /* JADX INFO: renamed from: a */
    public volatile ComponentCallbacks2C1947p f6755a;

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacks2C1947p m3722a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC2511o.f8029a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application) && (context instanceof ContextWrapper)) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                return m3722a(contextWrapper.getBaseContext());
            }
        }
        if (this.f6755a == null) {
            synchronized (this) {
                try {
                    if (this.f6755a == null) {
                        this.f6755a = new ComponentCallbacks2C1947p(ComponentCallbacks2C1921c.m3413a(context.getApplicationContext()), new C1577b(17), new C1577b(19), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f6755a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
