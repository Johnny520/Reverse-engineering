package p086ff;

import p116hf.AbstractC3030m;
import p116hf.C3021d;
import p147jf.InterfaceC3863e;

/* JADX INFO: renamed from: ff.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2441i {

    /* JADX INFO: renamed from: a */
    public static InterfaceC2434b f6614a;

    static {
        InterfaceC3863e interfaceC3863eM8841m = AbstractC2438f.m8841m();
        if (interfaceC3863eM8841m != null) {
            f6614a = interfaceC3863eM8841m.mo11181b();
            return;
        }
        AbstractC3030m.m11188b("Failed to find provider");
        AbstractC3030m.m11188b("Defaulting to BasicMarkerFactory.");
        f6614a = new C3021d();
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2440h m8855a(String str) {
        return f6614a.mo8795a(str);
    }
}
