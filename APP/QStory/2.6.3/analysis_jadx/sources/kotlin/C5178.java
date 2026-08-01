package kotlin;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte f14741;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4395.m8905(this.f14741 & DefaultClassResolver.NAME, ((C5178) obj).f14741 & DefaultClassResolver.NAME);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5178) {
            return this.f14741 == ((C5178) obj).f14741;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f14741);
    }

    public final String toString() {
        return String.valueOf(this.f14741 & DefaultClassResolver.NAME);
    }
}
