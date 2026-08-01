package p179m2;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p349y0.C9508c;

/* JADX INFO: renamed from: m2.n3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4882n3 {

    /* JADX INFO: renamed from: a */
    public final C9508c f14579a = new C9508c(new Reference[16], 0);

    /* JADX INFO: renamed from: b */
    public final ReferenceQueue f14580b = new ReferenceQueue();

    /* JADX INFO: renamed from: a */
    public final void m19524a() {
        Reference referencePoll;
        do {
            referencePoll = this.f14580b.poll();
            if (referencePoll != null) {
                this.f14579a.m37043p(referencePoll);
            }
        } while (referencePoll != null);
    }

    /* JADX INFO: renamed from: b */
    public final Object m19525b() {
        m19524a();
        while (this.f14579a.m37039l() != 0) {
            Object obj = ((Reference) this.f14579a.m37045r(r0.m37039l() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m19526c(Object obj) {
        m19524a();
        this.f14579a.m37029b(new WeakReference(obj, this.f14580b));
    }
}
