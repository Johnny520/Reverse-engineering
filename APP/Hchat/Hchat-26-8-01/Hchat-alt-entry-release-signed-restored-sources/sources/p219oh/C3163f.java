package p219oh;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import mh.InterfaceC2843a;
import mh.InterfaceC2844b;

/* JADX INFO: renamed from: oh.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3163f implements InterfaceC2843a {

    /* JADX INFO: renamed from: g */
    public volatile boolean f10225g = false;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f10226h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public final LinkedBlockingQueue f10227i = new LinkedBlockingQueue();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2843a
    /* JADX INFO: renamed from: d */
    public final synchronized InterfaceC2844b mo5872d(String str) {
        C3162e c3162e;
        c3162e = (C3162e) this.f10226h.get(str);
        if (c3162e == null) {
            c3162e = new C3162e(str, this.f10227i, this.f10225g);
            this.f10226h.put(str, c3162e);
        }
        return c3162e;
    }
}
