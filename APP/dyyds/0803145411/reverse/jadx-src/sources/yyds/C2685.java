package yyds;

import android.net.Uri;

/* JADX INFO: renamed from: yyds.ᲈᛶᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2685 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f13148;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Uri f13149;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f13150;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f13151;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f13152;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f13153;

    public C2685(String str, String str2) {
        this.f13149 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f13150 = 0;
        this.f13151 = 400;
        this.f13153 = false;
        this.f13148 = str2;
        this.f13152 = 0;
    }

    public C2685(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f13149 = uri;
        this.f13150 = i;
        this.f13151 = i2;
        this.f13153 = z;
        this.f13148 = str;
        this.f13152 = i3;
    }
}
