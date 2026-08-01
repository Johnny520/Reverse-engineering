package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC5693;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5681 extends AbstractC5677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f15608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Locale f15609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15610;

    public C5681(int i, Calendar calendar, Locale locale) {
        this.f15610 = i;
        int i2 = AbstractC5693.f15626;
        this.f15609 = locale != null ? locale : Locale.getDefault();
        StringBuilder sbM140 = AbstractC0053.m140("((?iu)");
        this.f15608 = FastDateParser.appendDisplayNames(calendar, locale, i, sbM140);
        sbM140.setLength(sbM140.length() - 1);
        sbM140.append(")");
        this.f15601 = Pattern.compile(sbM140.toString());
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.f15610 + ", locale=" + this.f15609 + ", lKeyValues=" + this.f15608 + ", pattern=" + this.f15601 + "]";
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11048(Calendar calendar, String str) {
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
