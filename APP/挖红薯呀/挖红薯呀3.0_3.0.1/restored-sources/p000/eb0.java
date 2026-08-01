package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 {

    /* JADX INFO: renamed from: a */
    public final Locale f1368a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eb0(Locale locale) {
        this.f1368a = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eb0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return p30.m3002l(this.f1368a.toLanguageTag(), ((eb0) obj).f1368a.toLanguageTag());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1368a.toLanguageTag().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f1368a.toLanguageTag();
    }
}
