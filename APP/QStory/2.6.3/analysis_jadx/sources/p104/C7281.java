package p104;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.impl.types.C4913;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7281 extends AbstractC7283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f19381;

    @Override // p104.AbstractC7283
    public final Object get(int i) {
        return AbstractC4347.m8824(i, this.f19381);
    }

    @Override // p104.AbstractC7283, java.lang.Iterable
    public final Iterator iterator() {
        return new C7282(this);
    }

    @Override // p104.AbstractC7283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12499(int i, C4913 c4913) {
        Object[] objArr = this.f19381;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.f19381 = Arrays.copyOf(this.f19381, length);
        }
        Object[] objArr2 = this.f19381;
        if (objArr2[i] == null) {
            this.f19380++;
        }
        objArr2[i] = c4913;
    }

    @Override // p104.AbstractC7283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo12500() {
        return this.f19380;
    }
}
