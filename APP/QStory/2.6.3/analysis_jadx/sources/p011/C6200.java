package p011;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6200 implements InterfaceC6201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6207 f17062;

    public C6200(C6207 c6207) {
        c6207.getClass();
        this.f17062 = c6207;
    }

    @Override // p011.InterfaceC6201, p012.InterfaceC6216
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p011.InterfaceC6201
    public final boolean isReady() {
        return true;
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C6199 mo11620() {
        throw new IllegalStateException("already connected");
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C6199 mo11622() {
        throw new IllegalStateException("already connected");
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6207 mo11623() {
        return this.f17062;
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6201 mo11624() {
        throw new IllegalStateException("unexpected retry");
    }
}
