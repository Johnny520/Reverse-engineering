package p229p9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p213oa.C5692c;

/* JADX INFO: renamed from: p9.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6038s0 {
    /* JADX INFO: renamed from: a */
    public static final void m24064a(InterfaceC6026o0 interfaceC6026o0, C5692c c5692c, Collection collection) {
        interfaceC6026o0.getClass();
        c5692c.getClass();
        collection.getClass();
        if (interfaceC6026o0 instanceof InterfaceC6041t0) {
            ((InterfaceC6041t0) interfaceC6026o0).mo3932b(c5692c, collection);
        } else {
            collection.addAll(interfaceC6026o0.mo3933c(c5692c));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m24065b(InterfaceC6026o0 interfaceC6026o0, C5692c c5692c) {
        interfaceC6026o0.getClass();
        c5692c.getClass();
        return interfaceC6026o0 instanceof InterfaceC6041t0 ? ((InterfaceC6041t0) interfaceC6026o0).mo3931a(c5692c) : m24066c(interfaceC6026o0, c5692c).isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public static final List m24066c(InterfaceC6026o0 interfaceC6026o0, C5692c c5692c) {
        interfaceC6026o0.getClass();
        c5692c.getClass();
        ArrayList arrayList = new ArrayList();
        m24064a(interfaceC6026o0, c5692c, arrayList);
        return arrayList;
    }
}
