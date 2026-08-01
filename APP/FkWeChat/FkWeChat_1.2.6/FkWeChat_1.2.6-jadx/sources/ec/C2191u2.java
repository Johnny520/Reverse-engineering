package ec;

import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: ec.u2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2191u2 extends CancellationException implements InterfaceC2125e0 {

    /* JADX INFO: renamed from: q */
    public final transient InterfaceC2198w1 f6019q;

    public C2191u2(String str, InterfaceC2198w1 interfaceC2198w1) {
        super(str);
        this.f6019q = interfaceC2198w1;
    }

    @Override // ec.InterfaceC2125e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2191u2 mo5383a() {
        String message = getMessage();
        if (message == null) {
            message = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        C2191u2 c2191u2 = new C2191u2(message, this.f6019q);
        c2191u2.initCause(this);
        return c2191u2;
    }

    public C2191u2(String str) {
        this(str, null);
    }
}
