package kotlin.text;

import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5146 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f14691;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f14692;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14693;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f14695;

    public C5146(String str) {
        this.f14695 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f14693;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f14691 < 0) {
            this.f14693 = 2;
            return false;
        }
        String str = this.f14695;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f14694; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f14693 = 1;
                this.f14691 = i;
                this.f14692 = length;
                return true;
            }
        }
        i = -1;
        this.f14693 = 1;
        this.f14691 = i;
        this.f14692 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        this.f14693 = 0;
        int i = this.f14692;
        int i2 = this.f14694;
        this.f14694 = this.f14691 + i;
        return this.f14695.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
