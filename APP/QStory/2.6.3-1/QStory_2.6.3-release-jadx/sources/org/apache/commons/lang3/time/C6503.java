package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0900;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6503 extends AbstractC6508 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15938;

    public C6503(int i) {
        this.f15938 = i;
    }

    public final String toString() {
        return AbstractC0900.m707(new StringBuilder("NumberStrategy [field="), "]", this.f15938);
    }

    @Override // org.apache.commons.lang3.time.AbstractC6508
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo11609(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
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
        calendar.set(this.f15938, mo11608(fastDateParser, i3));
        return true;
    }

    @Override // org.apache.commons.lang3.time.AbstractC6508
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo11610() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int mo11608(FastDateParser fastDateParser, int i) {
        return i;
    }
}
