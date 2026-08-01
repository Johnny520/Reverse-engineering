package p160;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f20729 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC7635) {
            return AbstractC4394.m8917(this.f20729, ((AbstractC7635) obj).f20729);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20729.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f20729 + ')';
    }
}
