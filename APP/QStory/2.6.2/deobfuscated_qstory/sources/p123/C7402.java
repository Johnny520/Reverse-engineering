package p123;

import androidx.compose.ui.graphics.vector.C1541;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7402 extends AbstractC7407 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1541 f20078;

    public C7402(C1541 c1541) {
        this.f20078 = c1541;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f20087;
        this.f20087 = i + 2;
        Object[] objArr = this.f20088;
        return new C7401(this.f20078, objArr[i], objArr[i + 1]);
    }
}
