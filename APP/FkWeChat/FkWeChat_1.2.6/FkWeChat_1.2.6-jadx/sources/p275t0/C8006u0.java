package p275t0;

import p163l.InterfaceC4317k;
import p248r.C6426b;
import p248r.C6429e;
import p248r.InterfaceC6425a;
import p248r.InterfaceC6431g;
import p248r.InterfaceC6436l;

/* JADX INFO: renamed from: t0.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8006u0 {

    /* JADX INFO: renamed from: a */
    public static final C8006u0 f26623a = new C8006u0();

    /* JADX INFO: renamed from: a */
    public final InterfaceC4317k m30775a(InterfaceC6431g interfaceC6431g) {
        if ((interfaceC6431g instanceof InterfaceC6436l.b) || (interfaceC6431g instanceof InterfaceC6425a.b) || (interfaceC6431g instanceof C6429e) || (interfaceC6431g instanceof C6426b)) {
            return AbstractC8009v0.f26636b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4317k m30776b(InterfaceC6431g interfaceC6431g) {
        if (!(interfaceC6431g instanceof InterfaceC6436l.b) && !(interfaceC6431g instanceof InterfaceC6425a.b)) {
            if (interfaceC6431g instanceof C6429e) {
                return AbstractC8009v0.f26638d;
            }
            if (interfaceC6431g instanceof C6426b) {
                return AbstractC8009v0.f26637c;
            }
            return null;
        }
        return AbstractC8009v0.f26637c;
    }
}
