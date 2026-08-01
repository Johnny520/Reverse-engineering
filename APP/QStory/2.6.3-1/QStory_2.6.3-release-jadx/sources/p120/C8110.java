package p120;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.impl.types.C5745;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8110 extends AbstractC8112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19725;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f19726;

    @Override // p120.AbstractC8112
    public final Object get(int i) {
        return AbstractC5179.m9383(i, this.f19726);
    }

    @Override // p120.AbstractC8112, java.lang.Iterable
    public final Iterator iterator() {
        return new C8111(this);
    }

    @Override // p120.AbstractC8112
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo13058(int i, C5745 c5745) {
        Object[] objArr = this.f19726;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.f19726 = Arrays.copyOf(this.f19726, length);
        }
        Object[] objArr2 = this.f19726;
        if (objArr2[i] == null) {
            this.f19725++;
        }
        objArr2[i] = c5745;
    }

    @Override // p120.AbstractC8112
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo13059() {
        return this.f19725;
    }
}
