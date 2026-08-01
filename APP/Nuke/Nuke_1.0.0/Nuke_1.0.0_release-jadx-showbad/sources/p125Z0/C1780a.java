package p125Z0;

import java.util.Locale;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: Z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1780a {

    /* JADX INFO: renamed from: a */
    public final Locale f6088a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1780a(Locale locale) {
        this.f6088a = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1780a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC1665j.m2981a(this.f6088a.toLanguageTag(), ((C1780a) obj).f6088a.toLanguageTag());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6088a.toLanguageTag().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f6088a.toLanguageTag();
    }
}
