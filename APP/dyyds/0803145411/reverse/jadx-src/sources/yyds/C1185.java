package yyds;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛵᲀᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1185 extends IOException {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f5424;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f5425;

    public C1185(String str, int i, String str2) {
        super(str);
        this.f5424 = i;
        this.f5425 = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Locale locale = Locale.US;
        return super.getMessage() + " (" + this.f5424 + " " + this.f5425 + ")";
    }
}
