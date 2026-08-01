package org.apache.commons.lang3;

import bsh.C2632;
import java.util.Iterator;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5698 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CharRange f15634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15635;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char f15636;

    public C5698(CharRange charRange) {
        this.f15634 = charRange;
        this.f15635 = true;
        if (!charRange.negated) {
            this.f15636 = charRange.start;
            return;
        }
        if (charRange.start != 0) {
            this.f15636 = (char) 0;
        } else if (charRange.end == 65535) {
            this.f15635 = false;
        } else {
            this.f15636 = (char) (charRange.end + 1);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15635;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15635) {
            C2632.m5291();
            return null;
        }
        char c = this.f15636;
        CharRange charRange = this.f15634;
        boolean z = charRange.negated;
        char c2 = this.f15636;
        if (z) {
            if (c2 == 65535) {
                this.f15635 = false;
            } else if (c2 + 1 != charRange.start) {
                this.f15636 = (char) (this.f15636 + 1);
            } else if (charRange.end == 65535) {
                this.f15635 = false;
            } else {
                this.f15636 = (char) (charRange.end + 1);
            }
        } else if (c2 < charRange.end) {
            this.f15636 = (char) (this.f15636 + 1);
        } else {
            this.f15635 = false;
        }
        return Character.valueOf(c);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
