package p064;

import io.ktor.client.plugins.AbstractC4765;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7345 implements InterfaceC7342, Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final char f18164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f18165 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final char f18166;

    static {
        new C7345((char) 1, (char) 0);
    }

    public C7345(char c, char c2) {
        this.f18166 = c;
        this.f18164 = (char) AbstractC4765.m8866(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7345)) {
            return false;
        }
        char c = this.f18166;
        char c2 = this.f18164;
        if (AbstractC5227.m9464(c, c2) > 0) {
            C7345 c7345 = (C7345) obj;
            if (AbstractC5227.m9464(c7345.f18166, c7345.f18164) > 0) {
                return true;
            }
        }
        C7345 c73452 = (C7345) obj;
        return c == c73452.f18166 && c2 == c73452.f18164;
    }

    public final int hashCode() {
        char c = this.f18166;
        char c2 = this.f18164;
        if (AbstractC5227.m9464(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7346(this.f18166, this.f18164, this.f18165);
    }

    public final String toString() {
        return this.f18166 + ".." + this.f18164;
    }
}
