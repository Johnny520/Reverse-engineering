package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cv0 implements Serializable {

    /* JADX INFO: renamed from: d */
    public final Object f897d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [org.luckypray.dexkit.cache.CacheBridgeStore.getCachedList$innerGet$10(org.luckypray.dexkit.DexKitCacheBridge$Cache, java.lang.String, boolean):cv0, org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult.copy$default(org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult, org.luckypray.dexkit.DexKitCacheBridge$ResultSource, cv0, int, java.lang.Object):org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult] */
    public /* synthetic */ cv0(Object obj) {
        this.f897d = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Throwable m604a(Object obj) {
        if (obj instanceof bv0) {
            return ((bv0) obj).f593d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m605b(Object obj) {
        if (obj instanceof bv0) {
            return ((bv0) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof cv0) {
            return p30.m3002l(this.f897d, ((cv0) obj).f897d);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f897d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m605b(this.f897d);
    }
}
