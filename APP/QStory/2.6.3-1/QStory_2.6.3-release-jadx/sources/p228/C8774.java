package p228;

import java.text.CharacterIterator;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8774 implements CharacterIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22336;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22337 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CharSequence f22338;

    public C8774(CharSequence charSequence, int i) {
        this.f22338 = charSequence;
        this.f22336 = i;
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
        int i = this.f22337;
        if (i == this.f22336) {
            return (char) 65535;
        }
        return this.f22338.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f22337 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f22336;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f22337;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f22336;
        if (i == 0) {
            this.f22337 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f22337 = i2;
        return this.f22338.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f22337 + 1;
        this.f22337 = i;
        int i2 = this.f22336;
        if (i < i2) {
            return this.f22338.charAt(i);
        }
        this.f22337 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f22337;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f22337 = i2;
        return this.f22338.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f22336 || i < 0) {
            C6755.m11869("invalid position");
            return (char) 0;
        }
        this.f22337 = i;
        return current();
    }
}
