package p232;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.C0257;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.bumptech.glide.load.resource.bitmap.C3031;
import java.util.Iterator;
import java.util.List;
import p075.C6957;
import p075.C6960;
import p230.C8052;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8071 implements Handler.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6957 f22256 = new C6957(17);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8056 f22258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile ComponentCallbacks2C3063 f22260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0257 f22259 = new C0257(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8052 f22257 = new C8052(f22256);

    public C8071() {
        this.f22258 = (C3031.f9648 && C3031.f9649) ? new C8057() : new C6960(15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13525(List list, C0257 c0257) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) it.next();
            if (abstractComponentCallbacksC2338 != null && (obj = abstractComponentCallbacksC2338.f6880) != null) {
                c0257.put(obj, abstractComponentCallbacksC2338);
                m13525(abstractComponentCallbacksC2338.m4432().f6783.m963(), c0257);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m13526(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m13526(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ComponentCallbacks2C3063 m13527(FragmentActivity fragmentActivity) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return m13528(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            C5919.m11249("You cannot start a load for a destroyed activity");
            return null;
        }
        this.f22258.mo12251(fragmentActivity);
        Activity activityM13526 = m13526(fragmentActivity);
        return this.f22257.m13515(fragmentActivity, ComponentCallbacks2C3057.m6722(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityM13526 == null || !activityM13526.isFinishing());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ComponentCallbacks2C3063 m13528(Context context) {
        if (context == null) {
            C5919.m11249("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m13527((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m13528(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f22260 == null) {
            synchronized (this) {
                try {
                    if (this.f22260 == null) {
                        this.f22260 = new ComponentCallbacks2C3063(ComponentCallbacks2C3057.m6722(context.getApplicationContext()), new C6960(14), new C6957(16), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f22260;
    }
}
