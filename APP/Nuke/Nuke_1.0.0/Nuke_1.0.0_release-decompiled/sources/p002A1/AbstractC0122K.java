package p002A1;

import java.util.Iterator;
import p024E1.C0280a;

/* JADX INFO: renamed from: A1.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0122K {

    /* JADX INFO: renamed from: a */
    public final C0280a f513a = new C0280a();

    /* JADX INFO: renamed from: a */
    public final void m173a() {
        C0280a c0280a = this.f513a;
        if (c0280a != null && !c0280a.f905d) {
            c0280a.f905d = true;
            synchronized (c0280a.f902a) {
                try {
                    Iterator it = c0280a.f903b.values().iterator();
                    while (it.hasNext()) {
                        C0280a.m486a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0280a.f904c.iterator();
                    while (it2.hasNext()) {
                        C0280a.m486a((AutoCloseable) it2.next());
                    }
                    c0280a.f904c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo174b();
    }

    /* JADX INFO: renamed from: b */
    public void mo174b() {
    }
}
