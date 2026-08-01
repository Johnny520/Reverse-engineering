package p048;

import bsh.C2633;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6517 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17822;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f17824;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f17825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17826 = 0;

    public C6517(char c, char c2, int i) {
        boolean z = false;
        this.f17824 = i;
        this.f17825 = c2;
        if (i <= 0 ? AbstractC4395.m8905(c, c2) >= 0 : AbstractC4395.m8905(c, c2) <= 0) {
            z = true;
        }
        this.f17823 = z;
        this.f17822 = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17826) {
        }
        return this.f17823;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17826) {
            case 0:
                int i = this.f17822;
                if (i != this.f17825) {
                    this.f17822 = this.f17824 + i;
                } else {
                    if (!this.f17823) {
                        C2633.m5336();
                        return null;
                    }
                    this.f17823 = false;
                }
                return Character.valueOf((char) i);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i = this.f17822;
        if (i != this.f17825) {
            this.f17822 = this.f17824 + i;
            return i;
        }
        if (this.f17823) {
            this.f17823 = false;
            return i;
        }
        C2633.m5336();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17826) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6517(int i, int i2, int i3) {
        this.f17824 = i3;
        this.f17825 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f17823 = z;
        this.f17822 = z ? i : i2;
    }
}
