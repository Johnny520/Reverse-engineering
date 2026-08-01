package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC5692;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5680 extends AbstractC5676 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f15608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Locale f15609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15610;

    public C5680(int i, Calendar calendar, Locale locale) {
        this.f15610 = i;
        int i2 = AbstractC5692.f15626;
        this.f15609 = locale != null ? locale : Locale.getDefault();
        StringBuilder sbM149 = AbstractC0053.m149("((?iu)");
        this.f15608 = FastDateParser.appendDisplayNames(calendar, locale, i, sbM149);
        sbM149.setLength(sbM149.length() - 1);
        sbM149.append(")");
        this.f15601 = Pattern.compile(sbM149.toString());
    }

    @Override // org.apache.commons.lang3.time.AbstractC5676
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.f15610 + ", locale=" + this.f15609 + ", lKeyValues=" + this.f15608 + ", pattern=" + this.f15601 + "]";
    }

    @Override // org.apache.commons.lang3.time.AbstractC5676
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10991(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.f15609);
        Map map = this.f15608;
        Integer num = (Integer) map.get(lowerCase);
        if (num == null) {
            num = (Integer) map.get(lowerCase + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        int i = this.f15610;
        if (9 != i || num.intValue() <= 1) {
            calendar.set(i, num.intValue());
        }
    }
}
