package p212;

import java.text.CharacterIterator;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7945 implements CharacterIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f21991;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21992 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CharSequence f21993;

    public C7945(CharSequence charSequence, int i) {
        this.f21993 = charSequence;
        this.f21991 = i;
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
        int i = this.f21992;
        if (i == this.f21991) {
            return (char) 65535;
        }
        return this.f21993.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f21992 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f21991;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f21992;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f21991;
        if (i == 0) {
            this.f21992 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f21992 = i2;
        return this.f21993.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f21992 + 1;
        this.f21992 = i;
        int i2 = this.f21991;
        if (i < i2) {
            return this.f21993.charAt(i);
        }
        this.f21992 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f21992;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f21992 = i2;
        return this.f21993.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f21991 || i < 0) {
            C5925.m11310("invalid position");
            return (char) 0;
        }
        this.f21992 = i;
        return current();
    }
}
