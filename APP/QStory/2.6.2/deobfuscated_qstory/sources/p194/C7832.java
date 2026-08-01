package p194;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7832 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Locale f21378;

    public C7832(Locale locale) {
        this.f21378 = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7832)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC4394.m8917(this.f21378.toLanguageTag(), ((C7832) obj).f21378.toLanguageTag());
    }

    public final int hashCode() {
        return this.f21378.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f21378.toLanguageTag();
    }
}
