package p183;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8537 implements InterfaceC8536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21255 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21256 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f21257;

    public C8537(int i) {
        this.f21257 = i;
    }

    @Override // p183.InterfaceC8536
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo9603(CharSequence charSequence, int i, int i2, C8528 c8528) {
        int i3 = this.f21257;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f21255 = i;
        this.f21256 = i2;
        return false;
    }

    @Override // p183.InterfaceC8536
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9602() {
        return this;
    }
}
