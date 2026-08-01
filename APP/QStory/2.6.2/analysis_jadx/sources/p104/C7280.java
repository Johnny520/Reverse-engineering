package p104;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.impl.types.C4912;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7280 extends AbstractC7282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object[] f19386;

    @Override // p104.AbstractC7282
    public final Object get(int i) {
        return AbstractC4346.m8845(i, this.f19386);
    }

    @Override // p104.AbstractC7282, java.lang.Iterable
    public final Iterator iterator() {
        return new C7281(this);
    }

    @Override // p104.AbstractC7282
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12472(int i, C4912 c4912) {
        Object[] objArr = this.f19386;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.f19386 = Arrays.copyOf(this.f19386, length);
        }
        Object[] objArr2 = this.f19386;
        if (objArr2[i] == null) {
            this.f19385++;
        }
        objArr2[i] = c4912;
    }

    @Override // p104.AbstractC7282
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo12473() {
        return this.f19385;
    }
}
