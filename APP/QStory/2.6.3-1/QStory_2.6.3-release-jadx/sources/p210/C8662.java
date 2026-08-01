package p210;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Locale f21720;

    public C8662(Locale locale) {
        this.f21720 = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C8662)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC5227.m9466(this.f21720.toLanguageTag(), ((C8662) obj).f21720.toLanguageTag());
    }

    public final int hashCode() {
        return this.f21720.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f21720.toLanguageTag();
    }
}
