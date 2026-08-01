package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5682 extends AbstractC5678 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15611;

    public C5682(String str) {
        this.f15611 = str;
    }

    public final String toString() {
        return AbstractC0053.m151(new StringBuilder("CopyQuotedStrategy [formatField="), this.f15611, "]");
    }

    @Override // org.apache.commons.lang3.time.AbstractC5678
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11050(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
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

    @Override // org.apache.commons.lang3.time.AbstractC5678
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11051() {
        return false;
    }
}
