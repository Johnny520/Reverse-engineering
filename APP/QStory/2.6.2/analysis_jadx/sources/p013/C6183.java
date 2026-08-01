package p013;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6183 implements InterfaceC6174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6175 f16921;

    public C6183(Throwable th) {
        this.f16921 = new C6175(this, th, 2);
    }

    @Override // p013.InterfaceC6174, p021.InterfaceC6254
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p013.InterfaceC6174
    public final boolean isReady() {
        return false;
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6175 mo11600() {
        return this.f16921;
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C6175 mo11603() {
        return this.f16921;
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6181 mo11604() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6174 mo11605() {
        throw new IllegalStateException("unexpected retry");
    }
}
