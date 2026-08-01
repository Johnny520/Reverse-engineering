package p153;

import android.net.Uri;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7602 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f20613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f20614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f20615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Uri f20618;

    public C7602(String str, String str2) {
        this.f20618 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f20617 = 0;
        this.f20616 = 400;
        this.f20615 = false;
        this.f20614 = str2;
        this.f20613 = 0;
    }

    public C7602(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f20618 = uri;
        this.f20617 = i;
        this.f20616 = i2;
        this.f20615 = z;
        this.f20614 = str;
        this.f20613 = i3;
    }
}
