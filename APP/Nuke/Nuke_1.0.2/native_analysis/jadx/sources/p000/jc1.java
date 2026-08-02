package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 {

    /* JADX INFO: renamed from: a */
    public final Locale f4962a;

    public jc1(Locale locale) {
        this.f4962a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof jc1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return t11.m5086l(this.f4962a.toLanguageTag(), ((jc1) obj).f4962a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f4962a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f4962a.toLanguageTag();
    }
}
