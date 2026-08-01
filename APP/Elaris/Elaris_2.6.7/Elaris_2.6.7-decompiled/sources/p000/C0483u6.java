package p000;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0483u6 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f940a;

    /* JADX INFO: renamed from: b */
    public final Method f941b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0483u6(Object obj, Method method) {
        this.f940a = new WeakReference(obj);
        this.f941b = method;
    }
}
