package p260rb;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: rb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6582a {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f20646a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final Void m26151a(String str) {
        str.getClass();
        throw new IllegalStateException(str.toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m26152b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return m26151a(str);
    }
}
