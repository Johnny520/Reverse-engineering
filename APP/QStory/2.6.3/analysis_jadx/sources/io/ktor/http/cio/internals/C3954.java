package io.ktor.http.cio.internals;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3954 implements CharSequence {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3953 f12172;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f12174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12175;

    public C3954(C3953 c3953, int i, int i2) {
        this.f12172 = c3953;
        this.f12175 = i;
        this.f12173 = i2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f12175 + i;
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "index is negative: "));
            return (char) 0;
        }
        if (i2 < this.f12173) {
            return this.f12172.m8339(i2);
        }
        StringBuilder sbM150 = AbstractC0053.m150(i, "index (", ") should be less than length (");
        sbM150.append(length());
        sbM150.append(')');
        throw new IllegalArgumentException(sbM150.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length()) {
                int length = length();
                for (int i = 0; i < length; i++) {
                    if (this.f12172.m8339(this.f12175 + i) != charSequence.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12174;
        if (str != null) {
            return str.hashCode();
        }
        int iM8339 = 0;
        for (int i = this.f12175; i < this.f12173; i++) {
            iM8339 = (iM8339 * 31) + this.f12172.m8339(i);
        }
        return iM8339;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12173 - this.f12175;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "start is negative: "));
            return null;
        }
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        }
        int i3 = this.f12173;
        int i4 = this.f12175;
        if (i2 > i3 - i4) {
            C4211.m8601(length(), 41, "end should be less than length (");
            return null;
        }
        if (i == i2) {
            return "";
        }
        return new C3954(this.f12172, i + i4, i4 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12174;
        if (str != null) {
            return str;
        }
        String string = this.f12172.m8340(this.f12175, this.f12173).toString();
        this.f12174 = string;
        return string;
    }
}
