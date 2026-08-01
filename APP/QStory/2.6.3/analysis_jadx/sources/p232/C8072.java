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
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.bumptech.glide.load.resource.bitmap.C3032;
import java.util.Iterator;
import java.util.List;
import p075.C6958;
import p075.C6961;
import p230.C8053;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8072 implements Handler.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6958 f22254 = new C6958(17);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8057 f22256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile ComponentCallbacks2C3064 f22258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0257 f22257 = new C0257(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8053 f22255 = new C8053(f22254);

    public C8072() {
        this.f22256 = (C3032.f9650 && C3032.f9651) ? new C8058() : new C6961(15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13554(List list, C0257 c0257) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) it.next();
            if (abstractComponentCallbacksC2338 != null && (obj = abstractComponentCallbacksC2338.f6881) != null) {
                c0257.put(obj, abstractComponentCallbacksC2338);
                m13554(abstractComponentCallbacksC2338.m4442().f6784.m964(), c0257);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m13555(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m13555(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ComponentCallbacks2C3064 m13556(FragmentActivity fragmentActivity) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return m13557(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            C5925.m11310("You cannot start a load for a destroyed activity");
            return null;
        }
        this.f22256.mo12278(fragmentActivity);
        Activity activityM13555 = m13555(fragmentActivity);
        return this.f22255.m13544(fragmentActivity, ComponentCallbacks2C3058.m6767(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityM13555 == null || !activityM13555.isFinishing());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ComponentCallbacks2C3064 m13557(Context context) {
        if (context == null) {
            C5925.m11310("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m13556((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m13557(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f22258 == null) {
            synchronized (this) {
                try {
                    if (this.f22258 == null) {
                        this.f22258 = new ComponentCallbacks2C3064(ComponentCallbacks2C3058.m6767(context.getApplicationContext()), new C6961(14), new C6958(16), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f22258;
    }
}
