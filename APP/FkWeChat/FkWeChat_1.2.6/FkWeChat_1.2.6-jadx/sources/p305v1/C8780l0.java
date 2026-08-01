package p305v1;

import android.graphics.Outline;
import p215oc.C5725t;
import p265s1.C7132r0;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: v1.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8780l0 {

    /* JADX INFO: renamed from: a */
    public static final C8780l0 f29293a = new C8780l0();

    /* JADX INFO: renamed from: a */
    public final void m33753a(Outline outline, InterfaceC7144t2 interfaceC7144t2) {
        if (interfaceC7144t2 instanceof C7132r0) {
            outline.setPath(((C7132r0) interfaceC7144t2).m28188v());
        } else {
            C5725t.m23179a("Unable to obtain android.graphics.Path");
        }
    }
}
