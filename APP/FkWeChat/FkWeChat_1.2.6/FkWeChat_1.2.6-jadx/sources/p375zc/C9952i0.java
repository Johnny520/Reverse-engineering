package p375zc;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: zc.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9952i0 {

    /* JADX INFO: renamed from: a */
    public final Map f33535a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final C9950h0 m38565a() {
        return new C9950h0(this.f33535a);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC9957l m38566b(String str, AbstractC9957l abstractC9957l) {
        str.getClass();
        abstractC9957l.getClass();
        return (AbstractC9957l) this.f33535a.put(str, abstractC9957l);
    }
}
