package org.apache.commons.lang3.time;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5677 extends AbstractC5678 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Pattern f15601;

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.f15601 + "]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo11048(Calendar calendar, String str);

    @Override // org.apache.commons.lang3.time.AbstractC5678
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11050(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.f15601.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        mo11048(calendar, matcher.group(1));
        return true;
    }

    @Override // org.apache.commons.lang3.time.AbstractC5678
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11051() {
        return false;
    }
}
