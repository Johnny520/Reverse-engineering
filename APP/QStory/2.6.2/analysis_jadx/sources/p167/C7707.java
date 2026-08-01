package p167;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7707 implements InterfaceC7706 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20915 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f20916 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f20917;

    public C7707(int i) {
        this.f20917 = i;
    }

    @Override // p167.InterfaceC7706
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo9054(CharSequence charSequence, int i, int i2, C7698 c7698) {
        int i3 = this.f20917;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f20915 = i;
        this.f20916 = i2;
        return false;
    }

    @Override // p167.InterfaceC7706
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9053() {
        return this;
    }
}
