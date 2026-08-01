package p039d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: d.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1846a {

    /* JADX INFO: renamed from: a */
    public final Set f4891a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public volatile Context f4892b;

    /* JADX INFO: renamed from: a */
    public final void m6537a(InterfaceC1847b interfaceC1847b) {
        interfaceC1847b.getClass();
        Context context = this.f4892b;
        if (context != null) {
            interfaceC1847b.mo2767a(context);
        }
        this.f4891a.add(interfaceC1847b);
    }

    /* JADX INFO: renamed from: b */
    public final void m6538b() {
        this.f4892b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m6539c(Context context) {
        context.getClass();
        this.f4892b = context;
        Iterator it = this.f4891a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1847b) it.next()).mo2767a(context);
        }
    }
}
