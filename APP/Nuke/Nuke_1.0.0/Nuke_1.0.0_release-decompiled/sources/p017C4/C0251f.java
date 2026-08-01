package p017C4;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p005A4.InterfaceC0161a;
import p005A4.InterfaceC0162b;

/* JADX INFO: renamed from: C4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0251f implements InterfaceC0161a {

    /* JADX INFO: renamed from: d */
    public volatile boolean f835d = false;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f836e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedBlockingQueue f837f = new LinkedBlockingQueue();

    @Override // p005A4.InterfaceC0161a
    /* JADX INFO: renamed from: g */
    public final synchronized InterfaceC0162b mo155g() {
        C0250e c0250e;
        c0250e = (C0250e) this.f836e.get("KavaRef");
        if (c0250e == null) {
            c0250e = new C0250e(this.f837f, this.f835d);
            this.f836e.put("KavaRef", c0250e);
        }
        return c0250e;
    }
}
