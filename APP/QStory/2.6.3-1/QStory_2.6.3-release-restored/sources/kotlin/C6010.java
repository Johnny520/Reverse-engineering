package kotlin;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6010 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte f15086;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC5227.m9464(this.f15086 & DefaultClassResolver.NAME, ((C6010) obj).f15086 & DefaultClassResolver.NAME);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6010) {
            return this.f15086 == ((C6010) obj).f15086;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f15086);
    }

    public final String toString() {
        return String.valueOf(this.f15086 & DefaultClassResolver.NAME);
    }
}
