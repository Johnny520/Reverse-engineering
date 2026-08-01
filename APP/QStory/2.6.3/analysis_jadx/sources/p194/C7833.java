package p194;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7833 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Locale f21375;

    public C7833(Locale locale) {
        this.f21375 = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7833)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC4395.m8907(this.f21375.toLanguageTag(), ((C7833) obj).f21375.toLanguageTag());
    }

    public final int hashCode() {
        return this.f21375.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f21375.toLanguageTag();
    }
}
