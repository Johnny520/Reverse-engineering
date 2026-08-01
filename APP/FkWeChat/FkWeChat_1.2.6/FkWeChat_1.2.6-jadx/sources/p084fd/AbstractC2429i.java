package p084fd;

import android.os.Handler;
import android.os.HandlerThread;
import cd.C1517b;
import java.lang.reflect.Method;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: fd.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2429i {

    /* JADX INFO: renamed from: a */
    public static final Handler f6590a;

    /* JADX INFO: renamed from: b */
    public static Method f6591b;

    /* JADX INFO: renamed from: c */
    public static Method f6592c;

    static {
        HandlerThread handlerThread = new HandlerThread("NetSceneThread");
        handlerThread.start();
        f6590a = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8776a(Object obj) {
        try {
            f6592c.invoke(f6591b.invoke(null, null), obj);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("NetworkBridge", "sendNetScene error", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8777b() {
        try {
            Class<?> cls = C1517b.findClass().pkg("com.tencent.mm.modelbase").usingStrings("MicroMsg.Mvvm.NetSceneObserverOwner").get();
            Class<?> cls2 = C1517b.findClass().pkg("com.tencent.mm.modelbase").usingStrings("MicroMsg.NetSceneBase").get();
            f6591b = C1517b.findMethod().paramCount(0).returnType(cls.getName()).get();
            f6592c = C1517b.findMethod().inClass(cls.getName()).returnType("boolean").params(cls2.getName()).get();
        } catch (Throwable th) {
            AbstractC8924d.m34265e("NetworkBridge", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8778c(final Object obj) {
        if (obj == null) {
            AbstractC8924d.m34263c("NetworkBridge", "netScene is null");
        } else if (f6591b == null || f6592c == null) {
            AbstractC8924d.m34263c("NetworkBridge", "method not inited");
        } else {
            f6590a.post(new Runnable() { // from class: fd.h
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2429i.m8776a(obj);
                }
            });
        }
    }
}
