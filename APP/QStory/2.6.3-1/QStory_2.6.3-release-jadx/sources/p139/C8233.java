package p139;

import androidx.collection.C1112;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8233 extends AbstractC8237 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f20419;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20419) {
            case 0:
                int i = this.f20427;
                this.f20427 = i + 2;
                Object[] objArr = this.f20428;
                return new C1112(objArr[i], 1, objArr[i + 1]);
            case 1:
                int i2 = this.f20427;
                this.f20427 = i2 + 2;
                return this.f20428[i2];
            default:
                int i3 = this.f20427;
                this.f20427 = i3 + 2;
                return this.f20428[i3 + 1];
        }
    }
}
