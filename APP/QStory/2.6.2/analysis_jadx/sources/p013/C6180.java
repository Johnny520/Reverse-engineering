package p013;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6180 implements InterfaceC6174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6181 f16900;

    public C6180(C6181 c6181) {
        c6181.getClass();
        this.f16900 = c6181;
    }

    @Override // p013.InterfaceC6174, p021.InterfaceC6254
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p013.InterfaceC6174
    public final boolean isReady() {
        return true;
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6175 mo11600() {
        throw new IllegalStateException("already connected");
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C6175 mo11603() {
        throw new IllegalStateException("already connected");
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6181 mo11604() {
        return this.f16900;
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6174 mo11605() {
        throw new IllegalStateException("unexpected retry");
    }
}
