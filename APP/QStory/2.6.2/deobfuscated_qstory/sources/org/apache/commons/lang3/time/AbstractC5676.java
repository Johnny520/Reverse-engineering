package org.apache.commons.lang3.time;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5676 extends AbstractC5677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Pattern f15601;

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.f15601 + "]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo10991(Calendar calendar, String str);

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo10993(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.f15601.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        mo10991(calendar, matcher.group(1));
        return true;
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10994() {
        return false;
    }
}
