package p064;

import bsh.C3466;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7346 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f18168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f18169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f18170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18171 = 0;

    public C7346(char c, char c2, int i) {
        boolean z = false;
        this.f18169 = i;
        this.f18170 = c2;
        if (i <= 0 ? AbstractC5227.m9464(c, c2) >= 0 : AbstractC5227.m9464(c, c2) <= 0) {
            z = true;
        }
        this.f18168 = z;
        this.f18167 = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18171) {
        }
        return this.f18168;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18171) {
            case 0:
                int i = this.f18167;
                if (i != this.f18170) {
                    this.f18167 = this.f18169 + i;
                } else {
                    if (!this.f18168) {
                        C3466.m5896();
                        return null;
                    }
                    this.f18168 = false;
                }
                return Character.valueOf((char) i);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i = this.f18167;
        if (i != this.f18170) {
            this.f18167 = this.f18169 + i;
            return i;
        }
        if (this.f18168) {
            this.f18168 = false;
            return i;
        }
        C3466.m5896();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18171) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7346(int i, int i2, int i3) {
        this.f18169 = i3;
        this.f18170 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f18168 = z;
        this.f18167 = z ? i : i2;
    }
}
