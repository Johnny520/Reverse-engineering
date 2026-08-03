package p000a;

import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.InterfaceC1118g;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: a.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0481ab {

    /* JADX INFO: renamed from: a */
    public final Runnable f1802a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC0595gb> f1803b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final HashMap f1804c = new HashMap();

    /* JADX INFO: renamed from: a.ab$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC1116e f1805a;

        /* JADX INFO: renamed from: b */
        public InterfaceC1118g f1806b;

        public a(AbstractC1116e abstractC1116e, InterfaceC1118g interfaceC1118g) {
            this.f1805a = abstractC1116e;
            this.f1806b = interfaceC1118g;
            abstractC1116e.mo2592a(interfaceC1118g);
        }
    }

    public C0481ab(Runnable runnable) {
        this.f1802a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m1171a(InterfaceC0595gb interfaceC0595gb) {
        this.f1803b.remove(interfaceC0595gb);
        a aVar = (a) this.f1804c.remove(interfaceC0595gb);
        if (aVar != null) {
            aVar.f1805a.mo2594c(aVar.f1806b);
            aVar.f1806b = null;
        }
        this.f1802a.run();
    }
}
