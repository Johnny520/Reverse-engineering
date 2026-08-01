package p123;

import androidx.collection.C0265;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7403 extends AbstractC7407 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f20079;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20079) {
            case 0:
                int i = this.f20087;
                this.f20087 = i + 2;
                Object[] objArr = this.f20088;
                return new C0265(objArr[i], 1, objArr[i + 1]);
            case 1:
                int i2 = this.f20087;
                this.f20087 = i2 + 2;
                return this.f20088[i2];
            default:
                int i3 = this.f20087;
                this.f20087 = i3 + 2;
                return this.f20088[i3 + 1];
        }
    }
}
