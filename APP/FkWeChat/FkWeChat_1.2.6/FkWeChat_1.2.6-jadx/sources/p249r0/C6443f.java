package p249r0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: r0.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6443f {

    /* JADX INFO: renamed from: a */
    public final Map f20261a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final Map f20262b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final InterfaceC6442e m25486a(C6445h c6445h) {
        return (InterfaceC6442e) this.f20262b.get(c6445h);
    }

    /* JADX INFO: renamed from: b */
    public final C6445h m25487b(InterfaceC6442e interfaceC6442e) {
        return (C6445h) this.f20261a.get(interfaceC6442e);
    }

    /* JADX INFO: renamed from: c */
    public final void m25488c(InterfaceC6442e interfaceC6442e) {
        C6445h c6445h = (C6445h) this.f20261a.get(interfaceC6442e);
        if (c6445h != null) {
        }
        this.f20261a.remove(interfaceC6442e);
    }

    /* JADX INFO: renamed from: d */
    public final void m25489d(InterfaceC6442e interfaceC6442e, C6445h c6445h) {
        this.f20261a.put(interfaceC6442e, c6445h);
        this.f20262b.put(c6445h, interfaceC6442e);
    }
}
