package yyds;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᛵᲇᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1227 implements Handler.Callback {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0135 f5639 = new C0135(23);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public volatile ComponentCallbacks2C2272 f5640;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1505 f5641 = new C1505(0);

    public C1227() {
        new HashMap();
        File file = C0434.f2197;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Activity m2499(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m2499(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ComponentCallbacks2C2272 m2500(Context context) {
        if (context == null) {
            C0188.m798("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    return m2500(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    C0188.m798("You cannot start a load for a destroyed activity");
                    return null;
                }
                Activity activityM2499 = m2499(fragmentActivity);
                if (activityM2499 != null) {
                    activityM2499.isFinishing();
                }
                ComponentCallbacks2C0040.m249(fragmentActivity.getApplicationContext());
                throw null;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m2500(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f5640 == null) {
            synchronized (this) {
                try {
                    if (this.f5640 == null) {
                        this.f5640 = new ComponentCallbacks2C2272(ComponentCallbacks2C0040.m249(context.getApplicationContext()), new C1586(), new C1586(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f5640;
    }
}
