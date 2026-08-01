package p169;

import android.net.Uri;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f20958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f20959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f20960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Uri f20963;

    public C8431(String str, String str2) {
        this.f20963 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f20962 = 0;
        this.f20961 = 400;
        this.f20960 = false;
        this.f20959 = str2;
        this.f20958 = 0;
    }

    public C8431(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f20963 = uri;
        this.f20962 = i;
        this.f20961 = i2;
        this.f20960 = z;
        this.f20959 = str;
        this.f20958 = i3;
    }
}
