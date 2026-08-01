package io.ktor.http.cio.internals;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3953 implements CharSequence {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3952 f12168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f12170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12171;

    public C3953(C3952 c3952, int i, int i2) {
        this.f12168 = c3952;
        this.f12171 = i;
        this.f12169 = i2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f12171 + i;
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "index is negative: "));
            return (char) 0;
        }
        if (i2 < this.f12169) {
            return this.f12168.m8349(i2);
        }
        StringBuilder sbM148 = AbstractC0053.m148(i, "index (", ") should be less than length (");
        sbM148.append(length());
        sbM148.append(')');
        throw new IllegalArgumentException(sbM148.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length()) {
                int length = length();
                for (int i = 0; i < length; i++) {
                    if (this.f12168.m8349(this.f12171 + i) != charSequence.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12170;
        if (str != null) {
            return str.hashCode();
        }
        int iM8349 = 0;
        for (int i = this.f12171; i < this.f12169; i++) {
            iM8349 = (iM8349 * 31) + this.f12168.m8349(i);
        }
        return iM8349;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12169 - this.f12171;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "start is negative: "));
            return null;
        }
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        }
        int i3 = this.f12169;
        int i4 = this.f12171;
        if (i2 > i3 - i4) {
            C4210.m8611(length(), 41, "end should be less than length (");
            return null;
        }
        if (i == i2) {
            return "";
        }
        return new C3953(this.f12168, i + i4, i4 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12170;
        if (str != null) {
            return str;
        }
        String string = this.f12168.m8350(this.f12171, this.f12169).toString();
        this.f12170 = string;
        return string;
    }
}
