package p064;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7348 extends C7341 implements InterfaceC7342 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7348 f18172 = new C7348(1, 0, 1);

    @Override // p064.C7341
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7348)) {
            return false;
        }
        if (isEmpty() && ((C7348) obj).isEmpty()) {
            return true;
        }
        C7348 c7348 = (C7348) obj;
        return this.f18163 == c7348.f18163 && this.f18161 == c7348.f18161;
    }

    @Override // p064.C7341
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18163 * 31) + this.f18161;
    }

    @Override // p064.C7341
    public final boolean isEmpty() {
        return this.f18163 > this.f18161;
    }

    @Override // p064.C7341
    public final String toString() {
        return this.f18163 + ".." + this.f18161;
    }
}
