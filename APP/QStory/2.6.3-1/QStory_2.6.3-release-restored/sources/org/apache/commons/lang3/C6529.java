package org.apache.commons.lang3;

import bsh.C3466;
import java.util.Iterator;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6529 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CharRange f15979;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15980;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char f15981;

    public C6529(CharRange charRange) {
        this.f15979 = charRange;
        this.f15980 = true;
        if (!charRange.negated) {
            this.f15981 = charRange.start;
            return;
        }
        if (charRange.start != 0) {
            this.f15981 = (char) 0;
        } else if (charRange.end == 65535) {
            this.f15980 = false;
        } else {
            this.f15981 = (char) (charRange.end + 1);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15980;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15980) {
            C3466.m5896();
            return null;
        }
        char c = this.f15981;
        CharRange charRange = this.f15979;
        boolean z = charRange.negated;
        char c2 = this.f15981;
        if (z) {
            if (c2 == 65535) {
                this.f15980 = false;
            } else if (c2 + 1 != charRange.start) {
                this.f15981 = (char) (this.f15981 + 1);
            } else if (charRange.end == 65535) {
                this.f15980 = false;
            } else {
                this.f15981 = (char) (charRange.end + 1);
            }
        } else if (c2 < charRange.end) {
            this.f15981 = (char) (this.f15981 + 1);
        } else {
            this.f15980 = false;
        }
        return Character.valueOf(c);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
