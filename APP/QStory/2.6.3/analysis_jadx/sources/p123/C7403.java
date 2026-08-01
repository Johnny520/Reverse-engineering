package p123;

import androidx.compose.ui.graphics.vector.C1541;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7403 extends AbstractC7408 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1541 f20073;

    public C7403(C1541 c1541) {
        this.f20073 = c1541;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f20082;
        this.f20082 = i + 2;
        Object[] objArr = this.f20083;
        return new C7402(this.f20073, objArr[i], objArr[i + 1]);
    }
}
