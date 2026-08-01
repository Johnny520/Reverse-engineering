package p123;

import androidx.collection.C0265;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7404 extends AbstractC7408 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f20074;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20074) {
            case 0:
                int i = this.f20082;
                this.f20082 = i + 2;
                Object[] objArr = this.f20083;
                return new C0265(objArr[i], 1, objArr[i + 1]);
            case 1:
                int i2 = this.f20082;
                this.f20082 = i2 + 2;
                return this.f20083[i2];
            default:
                int i3 = this.f20082;
                this.f20082 = i3 + 2;
                return this.f20083[i3 + 1];
        }
    }
}
