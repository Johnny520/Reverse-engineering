package io.ktor.http.cio.internals;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4786 implements CharSequence {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C4785 f12517;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f12519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12520;

    public C4786(C4785 c4785, int i, int i2) {
        this.f12517 = c4785;
        this.f12520 = i;
        this.f12518 = i2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f12520 + i;
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "index is negative: "));
            return (char) 0;
        }
        if (i2 < this.f12518) {
            return this.f12517.m8898(i2);
        }
        StringBuilder sbM710 = AbstractC0900.m710(i, "index (", ") should be less than length (");
        sbM710.append(length());
        sbM710.append(')');
        throw new IllegalArgumentException(sbM710.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length()) {
                int length = length();
                for (int i = 0; i < length; i++) {
                    if (this.f12517.m8898(this.f12520 + i) != charSequence.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12519;
        if (str != null) {
            return str.hashCode();
        }
        int iM8898 = 0;
        for (int i = this.f12520; i < this.f12518; i++) {
            iM8898 = (iM8898 * 31) + this.f12517.m8898(i);
        }
        return iM8898;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12518 - this.f12520;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "start is negative: "));
            return null;
        }
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        }
        int i3 = this.f12518;
        int i4 = this.f12520;
        if (i2 > i3 - i4) {
            C5043.m9160(length(), 41, "end should be less than length (");
            return null;
        }
        if (i == i2) {
            return "";
        }
        return new C4786(this.f12517, i + i4, i4 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12519;
        if (str != null) {
            return str;
        }
        String string = this.f12517.m8899(this.f12520, this.f12518).toString();
        this.f12519 = string;
        return string;
    }
}
