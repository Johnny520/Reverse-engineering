package p048;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6515 implements InterfaceC6512, Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final char f17823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f17824 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final char f17825;

    static {
        new C6515((char) 1, (char) 0);
    }

    public C6515(char c, char c2) {
        this.f17825 = c;
        this.f17823 = (char) AbstractC0455.m1155(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6515)) {
            return false;
        }
        char c = this.f17825;
        char c2 = this.f17823;
        if (AbstractC4394.m8915(c, c2) > 0) {
            C6515 c6515 = (C6515) obj;
            if (AbstractC4394.m8915(c6515.f17825, c6515.f17823) > 0) {
                return true;
            }
        }
        C6515 c65152 = (C6515) obj;
        return c == c65152.f17825 && c2 == c65152.f17823;
    }

    public final int hashCode() {
        char c = this.f17825;
        char c2 = this.f17823;
        if (AbstractC4394.m8915(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6516(this.f17825, this.f17823, this.f17824);
    }

    public final String toString() {
        return this.f17825 + ".." + this.f17823;
    }
}
