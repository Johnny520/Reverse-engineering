package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛳᲀᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0667 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Pattern f3166 = Pattern.compile("\\s*,\\s*");

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List f3167;

    public C0667(ArrayList arrayList) {
        this.f3167 = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return "[" + AbstractC0902.m2014(",", "", this.f3167) + "]";
    }
}
