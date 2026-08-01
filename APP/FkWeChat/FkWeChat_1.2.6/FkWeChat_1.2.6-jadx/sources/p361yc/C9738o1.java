package p361yc;

import java.lang.ref.SoftReference;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: yc.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9738o1 {

    /* JADX INFO: renamed from: a */
    public volatile SoftReference f33007a = new SoftReference(null);

    /* JADX INFO: renamed from: a */
    public final synchronized Object m37990a(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        Object obj = this.f33007a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = interfaceC0173a.invoke();
        this.f33007a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
