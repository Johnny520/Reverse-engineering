package p139;

import androidx.compose.p001ui.graphics.vector.C2376;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8232 extends AbstractC8237 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2376 f20418;

    public C8232(C2376 c2376) {
        this.f20418 = c2376;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f20427;
        this.f20427 = i + 2;
        Object[] objArr = this.f20428;
        return new C8231(this.f20418, objArr[i], objArr[i + 1]);
    }
}
