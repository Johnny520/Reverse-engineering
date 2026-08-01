package p000;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class de0 {

    /* JADX INFO: renamed from: a */
    public final RunnableC0802ug f1059a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f1060b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f1061c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public de0(RunnableC0802ug runnableC0802ug) {
        this.f1059a = runnableC0802ug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m686a() {
        this.f1060b.remove((Object) null);
        ce0 ce0Var = (ce0) this.f1061c.remove(null);
        if (ce0Var != null) {
            ce0Var.f795a.mo4015b(ce0Var.f796b);
            ce0Var.f796b = null;
        }
        this.f1059a.run();
    }
}
