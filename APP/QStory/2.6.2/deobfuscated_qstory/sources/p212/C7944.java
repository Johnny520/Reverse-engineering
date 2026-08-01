package p212;

import java.text.CharacterIterator;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7944 implements CharacterIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f21994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21995 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CharSequence f21996;

    public C7944(CharSequence charSequence, int i) {
        this.f21996 = charSequence;
        this.f21994 = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f21995;
        if (i == this.f21994) {
            return (char) 65535;
        }
        return this.f21996.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f21995 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f21994;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f21995;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f21994;
        if (i == 0) {
            this.f21995 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f21995 = i2;
        return this.f21996.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f21995 + 1;
        this.f21995 = i;
        int i2 = this.f21994;
        if (i < i2) {
            return this.f21996.charAt(i);
        }
        this.f21995 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f21995;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f21995 = i2;
        return this.f21996.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f21994 || i < 0) {
            C5919.m11249("invalid position");
            return (char) 0;
        }
        this.f21995 = i;
        return current();
    }
}
