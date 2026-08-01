package p132j;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3492d {
    /* JADX INFO: renamed from: a */
    public static final void m13015a(String str) {
        str.getClass();
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: b */
    public static final void m13016b(String str) {
        str.getClass();
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m13017c(String str) {
        str.getClass();
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: d */
    public static final void m13018d(String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }
}
