package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5681 extends AbstractC5677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15611;

    public C5681(String str) {
        this.f15611 = str;
    }

    public final String toString() {
        return AbstractC0053.m146(new StringBuilder("CopyQuotedStrategy [formatField="), this.f15611, "]");
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo10993(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int i2 = 0;
        while (true) {
            String str2 = this.f15611;
            if (i2 >= str2.length()) {
                parsePosition.setIndex(parsePosition.getIndex() + str2.length());
                return true;
            }
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (str2.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            i2++;
        }
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10994() {
        return false;
    }
}
