package p153;

import android.net.Uri;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7601 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f20618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f20619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f20620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Uri f20623;

    public C7601(String str, String str2) {
        this.f20623 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f20622 = 0;
        this.f20621 = 400;
        this.f20620 = false;
        this.f20619 = str2;
        this.f20618 = 0;
    }

    public C7601(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f20623 = uri;
        this.f20622 = i;
        this.f20621 = i2;
        this.f20620 = z;
        this.f20619 = str;
        this.f20618 = i3;
    }
}
