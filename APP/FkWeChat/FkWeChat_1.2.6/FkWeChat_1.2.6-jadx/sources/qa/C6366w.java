package qa;

import java.util.List;

/* JADX INFO: renamed from: qa.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6366w extends RuntimeException {

    /* JADX INFO: renamed from: q */
    public final List f20061q;

    public C6366w(InterfaceC6360q interfaceC6360q) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f20061q = null;
    }

    /* JADX INFO: renamed from: a */
    public C6355l m25316a() {
        return new C6355l(getMessage());
    }
}
