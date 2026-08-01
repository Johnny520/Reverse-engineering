package p287;

import kotlin.Metadata;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世兰苏哲;", "", "", "x", "飘花落叶言子楪世苏兰哲", "(J)J", "state", "飘花落叶言子楪世苏哲兰", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class C8402 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m13966(long x) {
        long j = (x ^ (x >>> 33)) * 7109453100751455733L;
        return ((j ^ (j >>> 28)) * (-3808689974395783757L)) >>> 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m13967(long state) {
        short s = (short) (state & 65535);
        short s2 = (short) ((state >>> 16) & 65535);
        int i = ((short) (s + s2)) & 65535;
        short s3 = (short) (((short) ((i >>> 7) | (i << 9))) + s);
        short s4 = (short) (s2 ^ s);
        int i2 = s & 65535;
        short s5 = (short) (((short) (((short) ((i2 >>> 3) | (i2 << 13))) ^ s4)) ^ (s4 << 5));
        int i3 = s4 & 65535;
        return (((((long) ((short) ((i3 >>> 6) | (i3 << 10)))) & 65535) | ((((long) s3) & 65535) << 16)) << 16) | (65535 & ((long) s5));
    }
}
