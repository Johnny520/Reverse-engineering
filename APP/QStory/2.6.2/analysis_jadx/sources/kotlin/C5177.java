package kotlin;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5177 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte f14741;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4394.m8915(this.f14741 & DefaultClassResolver.NAME, ((C5177) obj).f14741 & DefaultClassResolver.NAME);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5177) {
            return this.f14741 == ((C5177) obj).f14741;
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
