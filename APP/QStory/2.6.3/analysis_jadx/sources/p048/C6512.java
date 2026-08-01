package p048;

import io.ktor.client.plugins.AbstractC3933;
import java.util.Iterator;
import p054.InterfaceC6567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6512 implements Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f17816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f17817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f17818;

    public C6512(int i, int i2, int i3) {
        if (i3 == 0) {
            C5925.m11310("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C5925.m11310("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f17818 = i;
        this.f17816 = AbstractC3933.m8307(i, i2, i3);
        this.f17817 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6512)) {
            return false;
        }
        if (isEmpty() && ((C6512) obj).isEmpty()) {
            return true;
        }
        C6512 c6512 = (C6512) obj;
        return this.f17818 == c6512.f17818 && this.f17816 == c6512.f17816 && this.f17817 == c6512.f17817;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f17818 * 31) + this.f17816) * 31) + this.f17817;
    }

    public boolean isEmpty() {
        int i = this.f17816;
        int i2 = this.f17817;
        int i3 = this.f17818;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6517(this.f17818, this.f17816, this.f17817);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f17816;
        int i2 = this.f17817;
        int i3 = this.f17818;
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
