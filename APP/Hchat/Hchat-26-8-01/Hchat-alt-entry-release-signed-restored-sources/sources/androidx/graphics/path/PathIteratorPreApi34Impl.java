package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i9, float f3);

    private final native void destroyInternalPathIterator(long j3);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j3);

    @FastNative
    private final native int internalPathIteratorNext(long j3, float[] fArr, int i9);

    @FastNative
    private final native int internalPathIteratorPeek(long j3);

    @FastNative
    private final native int internalPathIteratorRawSize(long j3);

    @FastNative
    private final native int internalPathIteratorSize(long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
