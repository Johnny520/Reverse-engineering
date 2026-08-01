package p342;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9572 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f24982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f24983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f24984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f24985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24987;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final CompletableFuture f24988;

    public C9572(String str, String str2, String str3, int i, String str4) {
        "authKey";
        str.getClass();
        "redPacketID";
        str2.getClass();
        "troopUin";
        str3.getClass();
        "senderUin";
        str4.getClass();
        this.f24987 = i;
        this.f24986 = str;
        this.f24985 = str2;
        this.f24984 = str3;
        this.f24983 = str4;
        this.f24982 = Math.abs(new Random().nextInt()) % 16;
        this.f24988 = new CompletableFuture();
    }
}
