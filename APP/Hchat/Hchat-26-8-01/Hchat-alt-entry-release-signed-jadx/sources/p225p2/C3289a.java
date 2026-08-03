package p225p2;

import gg.AbstractC1416l;
import java.util.Locale;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3289a {

    /* JADX INFO: renamed from: a */
    public final Locale f10459a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3289a(Locale locale) {
        this.f10459a = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3289a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC1416l.m3825a(this.f10459a.toLanguageTag(), ((C3289a) obj).f10459a.toLanguageTag());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10459a.toLanguageTag().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f10459a.toLanguageTag();
    }
}
