package p142j9;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p298u9.C8576k;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: j9.a3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3654a3 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMap f10149a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final C8576k m13610a(Class cls) {
        cls.getClass();
        ClassLoader classLoaderM34034j = AbstractC8865f.m34034j(cls);
        C3719n3 c3719n3 = new C3719n3(classLoaderM34034j);
        ConcurrentMap concurrentMap = f10149a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(c3719n3);
        if (weakReference != null) {
            C8576k c8576k = (C8576k) weakReference.get();
            if (c8576k != null) {
                return c8576k;
            }
            concurrentMap.remove(c3719n3, weakReference);
        }
        C8576k c8576kM32994a = C8576k.f28617c.m32994a(classLoaderM34034j);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f10149a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(c3719n3, new WeakReference(c8576kM32994a));
                if (weakReference2 == null) {
                    return c8576kM32994a;
                }
                C8576k c8576k2 = (C8576k) weakReference2.get();
                if (c8576k2 != null) {
                    return c8576k2;
                }
                concurrentMap2.remove(c3719n3, weakReference2);
            } finally {
                c3719n3.m13841a(null);
            }
        }
    }
}
