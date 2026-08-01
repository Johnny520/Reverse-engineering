package p048;

import io.ktor.client.plugins.AbstractC3933;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6516 implements InterfaceC6513, Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final char f17819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f17820 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final char f17821;

    static {
        new C6516((char) 1, (char) 0);
    }

    public C6516(char c, char c2) {
        this.f17821 = c;
        this.f17819 = (char) AbstractC3933.m8307(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6516)) {
            return false;
        }
        char c = this.f17821;
        char c2 = this.f17819;
        if (AbstractC4395.m8905(c, c2) > 0) {
            C6516 c6516 = (C6516) obj;
            if (AbstractC4395.m8905(c6516.f17821, c6516.f17819) > 0) {
                return true;
            }
        }
        C6516 c65162 = (C6516) obj;
        return c == c65162.f17821 && c2 == c65162.f17819;
    }

    public final int hashCode() {
        char c = this.f17821;
        char c2 = this.f17819;
        if (AbstractC4395.m8905(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6517(this.f17821, this.f17819, this.f17820);
    }

    public final String toString() {
        return this.f17821 + ".." + this.f17819;
    }
}
