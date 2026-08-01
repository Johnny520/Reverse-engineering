package p048;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6518 extends C6511 implements InterfaceC6512 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C6518 f17831 = new C6518(1, 0, 1);

    @Override // p048.C6511
    public final boolean equals(Object obj) {
        if (!(obj instanceof C6518)) {
            return false;
        }
        if (isEmpty() && ((C6518) obj).isEmpty()) {
            return true;
        }
        C6518 c6518 = (C6518) obj;
        return this.f17822 == c6518.f17822 && this.f17820 == c6518.f17820;
    }

    @Override // p048.C6511
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f17822 * 31) + this.f17820;
    }

    @Override // p048.C6511
    public final boolean isEmpty() {
        return this.f17822 > this.f17820;
    }

    @Override // p048.C6511
    public final String toString() {
        return this.f17822 + ".." + this.f17820;
    }
}
