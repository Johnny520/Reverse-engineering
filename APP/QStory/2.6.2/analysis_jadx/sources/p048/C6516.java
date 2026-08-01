package p048;

import bsh.C2632;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6516 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17826;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f17828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f17829;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17830 = 0;

    public C6516(char c, char c2, int i) {
        boolean z = false;
        this.f17828 = i;
        this.f17829 = c2;
        if (i <= 0 ? AbstractC4394.m8915(c, c2) >= 0 : AbstractC4394.m8915(c, c2) <= 0) {
            z = true;
        }
        this.f17827 = z;
        this.f17826 = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17830) {
        }
        return this.f17827;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17830) {
            case 0:
                int i = this.f17826;
                if (i != this.f17829) {
                    this.f17826 = this.f17828 + i;
                } else {
                    if (!this.f17827) {
                        C2632.m5291();
                        return null;
                    }
                    this.f17827 = false;
                }
                return Character.valueOf((char) i);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i = this.f17826;
        if (i != this.f17829) {
            this.f17826 = this.f17828 + i;
            return i;
        }
        if (this.f17827) {
            this.f17827 = false;
            return i;
        }
        C2632.m5291();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17830) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6516(int i, int i2, int i3) {
        this.f17828 = i3;
        this.f17829 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f17827 = z;
        this.f17826 = z ? i : i2;
    }
}
