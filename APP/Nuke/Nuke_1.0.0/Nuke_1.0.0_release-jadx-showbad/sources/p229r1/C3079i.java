package p229r1;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p135b.RunnableC1814b;

/* JADX INFO: renamed from: r1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3079i {

    /* JADX INFO: renamed from: a */
    public final RunnableC1814b f9793a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f9794b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f9795c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3079i(RunnableC1814b runnableC1814b) {
        this.f9793a = runnableC1814b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5398a() {
        this.f9794b.remove((Object) null);
        C3078h c3078h = (C3078h) this.f9795c.remove(null);
        if (c3078h != null) {
            c3078h.f9791a.mo185b(c3078h.f9792b);
            c3078h.f9792b = null;
        }
        this.f9793a.run();
    }
}
