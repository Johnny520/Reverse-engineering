package p152;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0955;
import androidx.core.content.InterfaceC2998;
import androidx.core.util.InterfaceC3021;
import androidx.window.layout.C3431;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p152.C8352;
import p152.C8356;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8356 implements InterfaceC8350 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0955 f20745;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f20746;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f20747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8352 f20748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SidecarInterface f20749;

    public C8356(Context context) {
        context.getClass();
        SidecarInterface sidecarInterfaceM13306 = AbstractC8355.m13306(context);
        C8352 c8352 = new C8352();
        this.f20749 = sidecarInterfaceM13306;
        this.f20748 = c8352;
        this.f20747 = new LinkedHashMap();
        this.f20746 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13307() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f20749;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!AbstractC5227.m9466(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f20749;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f20749;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f20749;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!AbstractC5227.m9466(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f20749;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!AbstractC5227.m9466(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f20749;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!AbstractC5227.m9466(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                objInvoke.getClass();
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            rect.getClass();
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                objInvoke2.getClass();
                if (arrayList.equals((List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13308(C6686 c6686) {
        this.f20745 = new C0955(c6686);
        SidecarInterface sidecarInterface = this.f20749;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f20748, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    newDeviceState.getClass();
                    Collection<Activity> collectionValues = this.f8099.f20747.values();
                    C8356 c8356 = this.f8099;
                    for (Activity activity : collectionValues) {
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = c8356.f20749) != null) {
                            windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        C0955 c0955 = c8356.f20745;
                        if (c0955 != null) {
                            c0955.m934(activity, c8356.f20748.m13303(windowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    SidecarDeviceState sidecarDeviceState;
                    windowToken.getClass();
                    newLayout.getClass();
                    Activity activity = (Activity) this.f8099.f20747.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    C8356 c8356 = this.f8099;
                    C8352 c8352 = c8356.f20748;
                    SidecarInterface sidecarInterface2 = c8356.f20749;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    C3431 c3431M13303 = c8352.m13303(newLayout, sidecarDeviceState);
                    C0955 c0955 = this.f8099.f20745;
                    if (c0955 != null) {
                        c0955.m934(activity, c3431M13303);
                    }
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13309(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f20747;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f20749;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f20749) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C0955 c0955 = this.f20745;
        if (c0955 != null) {
            c0955.m934(activity, m13311(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f20746;
        if (linkedHashMap2.get(activity) == null && (activity instanceof InterfaceC2998)) {
            InterfaceC3021 interfaceC3021 = new InterfaceC3021() { // from class: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏世兰哲
                @Override // androidx.core.util.InterfaceC3021
                public final void accept(Object obj) {
                    C8356 c8356 = this.f20734;
                    C0955 c09552 = c8356.f20745;
                    if (c09552 != null) {
                        Activity activity2 = activity;
                        c09552.m934(activity2, c8356.m13311(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, interfaceC3021);
            ((InterfaceC2998) activity).addOnConfigurationChangedListener(interfaceC3021);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13310(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f20749;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f20746;
        InterfaceC3021 interfaceC3021 = (InterfaceC3021) linkedHashMap.get(activity);
        if (interfaceC3021 != null) {
            if (activity instanceof InterfaceC2998) {
                ((InterfaceC2998) activity).removeOnConfigurationChangedListener(interfaceC3021);
            }
            linkedHashMap.remove(activity);
        }
        C0955 c0955 = this.f20745;
        if (c0955 != null) {
            ReentrantLock reentrantLock = (ReentrantLock) c0955.f665;
            reentrantLock.lock();
            try {
                ((WeakHashMap) c0955.f663).put(activity, null);
            } finally {
                reentrantLock.unlock();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f20747;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f20749) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3431 m13311(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C3431(EmptyList.INSTANCE);
        }
        SidecarInterface sidecarInterface = this.f20749;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.f20749;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f20748.m13303(windowLayoutInfo, sidecarDeviceState);
    }
}
