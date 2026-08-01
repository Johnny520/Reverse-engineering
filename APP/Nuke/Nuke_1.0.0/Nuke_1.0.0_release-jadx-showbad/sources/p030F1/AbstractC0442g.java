package p030F1;

import p135b.C1809A;
import p135b.C1836x;
import p178i3.C2318C;

/* JADX INFO: renamed from: F1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442g {

    /* JADX INFO: renamed from: a */
    public C0438c f1323a;

    /* JADX INFO: renamed from: b */
    public boolean f1324b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m709a() {
        C0438c c0438c = this.f1323a;
        if (c0438c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f1324b) {
            c0438c.m702d(this, null);
        }
        C0443h c0443h = c0438c.f1315b;
        C1836x c1836x = c0438c.f1314a;
        c0443h.getClass();
        if (equals(c0443h.f1332h) && -1 == c0443h.f1331g) {
            AbstractC0440e abstractC0440eM713c = c0443h.f1330f;
            if (abstractC0440eM713c == null) {
                abstractC0440eM713c = c0443h.m713c(-1);
            }
            c0443h.f1330f = null;
            c0443h.f1331g = 0;
            c0443h.f1332h = null;
            if (abstractC0440eM713c == null) {
                Runnable runnable = ((C1809A) c1836x.f6236e).f6190a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                abstractC0440eM713c.mo704b();
            }
            C2318C c2318c = c0443h.f1325a;
            c2318c.getClass();
            c2318c.m4147g(null, C0444i.f1339b);
        }
        this.f1324b = false;
    }

    /* JADX INFO: renamed from: b */
    public void mo710b(boolean z5) {
    }
}
