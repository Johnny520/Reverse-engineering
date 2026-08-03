package p080fb;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.HttpUrl;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: fb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1103b {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f3553a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final Set f3554b = AbstractC2091b.m5168o();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2825a(Call call) {
        call.getClass();
        AtomicBoolean atomicBoolean = this.f3553a;
        if (atomicBoolean.get()) {
            call.cancel();
            return;
        }
        Set set = this.f3554b;
        set.getClass();
        set.add(call);
        if (atomicBoolean.get() && set.remove(call)) {
            call.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2826b(Throwable th2) {
        if (!this.f3553a.get() && !(th2 instanceof CancellationException)) {
            if (!(th2 instanceof IOException)) {
                return false;
            }
            String message = th2.getMessage();
            if (message == null) {
                message = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6709h0(message, "cancel", true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m2827c() {
        return this.f3553a.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2828d() {
        if (this.f3553a.get()) {
            throw new CancellationException("Agent 已中断");
        }
    }
}
