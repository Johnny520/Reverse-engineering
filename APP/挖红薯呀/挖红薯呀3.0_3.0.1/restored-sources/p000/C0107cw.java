package p000;

import android.net.Uri;

/* JADX INFO: renamed from: cw */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0107cw {

    /* JADX INFO: renamed from: a */
    public final Uri f898a;

    /* JADX INFO: renamed from: b */
    public final int f899b;

    /* JADX INFO: renamed from: c */
    public final int f900c;

    /* JADX INFO: renamed from: d */
    public final boolean f901d;

    /* JADX INFO: renamed from: e */
    public final String f902e;

    /* JADX INFO: renamed from: f */
    public final int f903f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0107cw(String str, String str2) {
        this.f898a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f899b = 0;
        this.f900c = 400;
        this.f901d = false;
        this.f902e = str2;
        this.f903f = 0;
    }

    public C0107cw(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f898a = uri;
        this.f899b = i;
        this.f900c = i2;
        this.f901d = z;
        this.f902e = str;
        this.f903f = i3;
    }
}
