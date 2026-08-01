package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5672 extends AbstractC5677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15593;

    public C5672(int i) {
        this.f15593 = i;
    }

    public final String toString() {
        return AbstractC0053.m147(new StringBuilder("NumberStrategy [field="), "]", this.f15593);
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo10993(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int index = parsePosition.getIndex();
        int length = str.length();
        if (i == 0) {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
            parsePosition.setIndex(index);
        } else {
            int i2 = i + index;
            if (length > i2) {
                length = i2;
            }
        }
        while (index < length && Character.isDigit(str.charAt(index))) {
            index++;
        }
        if (parsePosition.getIndex() == index) {
            parsePosition.setErrorIndex(index);
            return false;
        }
        int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
        parsePosition.setIndex(index);
        calendar.set(this.f15593, mo10992(fastDateParser, i3));
        return true;
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo10994() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int mo10992(FastDateParser fastDateParser, int i) {
        return i;
    }
}
