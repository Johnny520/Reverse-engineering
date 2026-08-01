package p011;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6209 implements InterfaceC6201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6199 f17127;

    public C6209(Throwable th) {
        this.f17127 = new C6199(this, th, 2);
    }

    @Override // p011.InterfaceC6201, p012.InterfaceC6216
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p011.InterfaceC6201
    public final boolean isReady() {
        return false;
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C6199 mo11620() {
        return this.f17127;
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C6199 mo11622() {
        return this.f17127;
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6207 mo11623() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6201 mo11624() {
        throw new IllegalStateException("unexpected retry");
    }
}
