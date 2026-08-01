package p064;

import io.ktor.client.plugins.AbstractC4765;
import java.util.Iterator;
import p070.InterfaceC7396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7341 implements Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f18161;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f18162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18163;

    public C7341(int i, int i2, int i3) {
        if (i3 == 0) {
            C6755.m11869("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C6755.m11869("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f18163 = i;
        this.f18161 = AbstractC4765.m8866(i, i2, i3);
        this.f18162 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7341)) {
            return false;
        }
        if (isEmpty() && ((C7341) obj).isEmpty()) {
            return true;
        }
        C7341 c7341 = (C7341) obj;
        return this.f18163 == c7341.f18163 && this.f18161 == c7341.f18161 && this.f18162 == c7341.f18162;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f18163 * 31) + this.f18161) * 31) + this.f18162;
    }

    public boolean isEmpty() {
        int i = this.f18161;
        int i2 = this.f18162;
        int i3 = this.f18163;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7346(this.f18163, this.f18161, this.f18162);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f18161;
        int i2 = this.f18162;
        int i3 = this.f18163;
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
