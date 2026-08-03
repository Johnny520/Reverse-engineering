package p081fc;

import java.util.concurrent.ConcurrentHashMap;
import p025bc.InterfaceC0253c;
import p025bc.InterfaceC0254d;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fc.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1200c implements InterfaceC0253c {

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f4031g = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4031g.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025bc.InterfaceC0253c
    /* JADX INFO: renamed from: r */
    public final void mo1007r(String str, InterfaceC0254d interfaceC0254d) {
        this.f4031g.put(str, interfaceC0254d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2249l(this.f4031g.size(), "InMemoryCodeCache: size=");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025bc.InterfaceC0253c
    /* JADX INFO: renamed from: v */
    public final InterfaceC0254d mo1008v(String str) {
        InterfaceC0254d interfaceC0254d = (InterfaceC0254d) this.f4031g.get(str);
        return interfaceC0254d == null ? InterfaceC0254d.f707a : interfaceC0254d;
    }
}
