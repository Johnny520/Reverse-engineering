package p048;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Iterator;
import p054.InterfaceC6566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6511 implements Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f17820;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f17821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f17822;

    public C6511(int i, int i2, int i3) {
        if (i3 == 0) {
            C5919.m11249("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C5919.m11249("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f17822 = i;
        this.f17820 = AbstractC0455.m1155(i, i2, i3);
        this.f17821 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6511)) {
            return false;
        }
        if (isEmpty() && ((C6511) obj).isEmpty()) {
            return true;
        }
        C6511 c6511 = (C6511) obj;
        return this.f17822 == c6511.f17822 && this.f17820 == c6511.f17820 && this.f17821 == c6511.f17821;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f17822 * 31) + this.f17820) * 31) + this.f17821;
    }

    public boolean isEmpty() {
        int i = this.f17820;
        int i2 = this.f17821;
        int i3 = this.f17822;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6516(this.f17822, this.f17820, this.f17821);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f17820;
        int i2 = this.f17821;
        int i3 = this.f17822;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
