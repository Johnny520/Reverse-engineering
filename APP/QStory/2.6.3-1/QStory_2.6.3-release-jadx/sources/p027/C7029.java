package p027;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7029 implements InterfaceC7030 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7036 f17407;

    public C7029(C7036 c7036) {
        c7036.getClass();
        this.f17407 = c7036;
    }

    @Override // p027.InterfaceC7030, p028.InterfaceC7045
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p027.InterfaceC7030
    public final boolean isReady() {
        return true;
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C7028 mo12179() {
        throw new IllegalStateException("already connected");
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C7028 mo12181() {
        throw new IllegalStateException("already connected");
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7036 mo12182() {
        return this.f17407;
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC7030 mo12183() {
        throw new IllegalStateException("unexpected retry");
    }
}
