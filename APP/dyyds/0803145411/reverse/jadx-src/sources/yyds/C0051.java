package yyds;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛱᛱᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0051 implements Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Pattern f548;

    public C0051(String str) {
        this.f548 = Pattern.compile(str);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0644 m377(C0051 c0051, String str) {
        Matcher matcher = c0051.f548.matcher(str);
        if (matcher.find(0)) {
            return new C0644(matcher);
        }
        return null;
    }

    public final String toString() {
        return this.f548.toString();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0644 m378(CharSequence charSequence, int i) {
        Matcher matcherRegion = this.f548.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (matcherRegion.lookingAt()) {
            return new C0644(matcherRegion);
        }
        return null;
    }
}
