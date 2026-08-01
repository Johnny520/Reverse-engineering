package p116hf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p086ff.InterfaceC2434b;
import p086ff.InterfaceC2440h;
import p376zd.C9987e;

/* JADX INFO: renamed from: hf.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3021d implements InterfaceC2434b {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap f8020a = new ConcurrentHashMap();

    @Override // p086ff.InterfaceC2434b
    /* JADX INFO: renamed from: a */
    public InterfaceC2440h mo8795a(String str) {
        if (str == null) {
            C9987e.m38645a("Marker name cannot be null");
            return null;
        }
        InterfaceC2440h c3020c = (InterfaceC2440h) this.f8020a.get(str);
        if (c3020c == null) {
            c3020c = new C3020c(str);
            InterfaceC2440h interfaceC2440h = (InterfaceC2440h) this.f8020a.putIfAbsent(str, c3020c);
            if (interfaceC2440h != null) {
                return interfaceC2440h;
            }
        }
        return c3020c;
    }
}
