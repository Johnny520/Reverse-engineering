package p167;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7708 implements InterfaceC7707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20910 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f20911 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f20912;

    public C7708(int i) {
        this.f20912 = i;
    }

    @Override // p167.InterfaceC7707
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo9044(CharSequence charSequence, int i, int i2, C7699 c7699) {
        int i3 = this.f20912;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f20910 = i;
        this.f20911 = i2;
        return false;
    }

    @Override // p167.InterfaceC7707
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9043() {
        return this;
    }
}
