package p000a;

import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a.r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800r7 {

    /* JADX INFO: renamed from: a */
    public final Object f3164a;

    /* JADX INFO: renamed from: b */
    public boolean f3165b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3166c;

    public C0800r7(ComponentActivity.InterfaceExecutorC0971e interfaceExecutorC0971e, C0004A3 c0004a3) {
        C0631i9.m1482e(interfaceExecutorC0971e, "executor");
        this.f3164a = new Object();
        this.f3166c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m1859a() {
        synchronized (this.f3164a) {
            try {
                this.f3165b = true;
                Iterator it = this.f3166c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0819s7) it.next()).mo31a();
                }
                this.f3166c.clear();
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
