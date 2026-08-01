package p248;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.C1104;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.bumptech.glide.load.resource.bitmap.C3864;
import java.util.Iterator;
import java.util.List;
import p091.C7787;
import p091.C7790;
import p246.C8882;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8901 implements Handler.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7787 f22599 = new C7787(17);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8886 f22601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile ComponentCallbacks2C3896 f22603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1104 f22602 = new C1104(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8882 f22600 = new C8882(f22599);

    public C8901() {
        this.f22601 = (C3864.f9995 && C3864.f9996) ? new C8887() : new C7790(15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14113(List list, C1104 c1104) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) it.next();
            if (abstractComponentCallbacksC3171 != null && (obj = abstractComponentCallbacksC3171.f7226) != null) {
                c1104.put(obj, abstractComponentCallbacksC3171);
                m14113(abstractComponentCallbacksC3171.m5002().f7129.m1524(), c1104);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m14114(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m14114(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ComponentCallbacks2C3896 m14115(FragmentActivity fragmentActivity) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return m14116(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            C6755.m11869("You cannot start a load for a destroyed activity");
            return null;
        }
        this.f22601.mo12837(fragmentActivity);
        Activity activityM14114 = m14114(fragmentActivity);
        return this.f22600.m14103(fragmentActivity, ComponentCallbacks2C3890.m7327(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityM14114 == null || !activityM14114.isFinishing());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ComponentCallbacks2C3896 m14116(Context context) {
        if (context == null) {
            C6755.m11869("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m14115((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m14116(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f22603 == null) {
            synchronized (this) {
                try {
                    if (this.f22603 == null) {
                        this.f22603 = new ComponentCallbacks2C3896(ComponentCallbacks2C3890.m7327(context.getApplicationContext()), new C7790(14), new C7787(16), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f22603;
    }
}
