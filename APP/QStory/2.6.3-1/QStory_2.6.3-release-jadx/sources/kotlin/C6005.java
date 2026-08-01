package kotlin;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6005 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short f15081;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC5227.m9464(this.f15081 & 65535, ((C6005) obj).f15081 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6005) {
            return this.f15081 == ((C6005) obj).f15081;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f15081);
    }

    public final String toString() {
        return String.valueOf(this.f15081 & 65535);
    }
}
