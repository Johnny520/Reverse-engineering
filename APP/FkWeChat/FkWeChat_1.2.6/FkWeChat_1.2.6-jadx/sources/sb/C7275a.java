package sb;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p376zd.C10010p0;

/* JADX INFO: renamed from: sb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7275a implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f24172a;

    public C7275a(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        this.f24172a = new AtomicReference(interfaceC7282h);
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        InterfaceC7282h interfaceC7282h = (InterfaceC7282h) this.f24172a.getAndSet(null);
        if (interfaceC7282h != null) {
            return interfaceC7282h.iterator();
        }
        C10010p0.m38820a("This sequence can be consumed only once.");
        return null;
    }
}
