package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0900;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC6523;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6511 extends AbstractC6507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f15953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Locale f15954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15955;

    public C6511(int i, Calendar calendar, Locale locale) {
        this.f15955 = i;
        int i2 = AbstractC6523.f15971;
        this.f15954 = locale != null ? locale : Locale.getDefault();
        StringBuilder sbM700 = AbstractC0900.m700("((?iu)");
        this.f15953 = FastDateParser.appendDisplayNames(calendar, locale, i, sbM700);
        sbM700.setLength(sbM700.length() - 1);
        sbM700.append(")");
        this.f15946 = Pattern.compile(sbM700.toString());
    }

    @Override // org.apache.commons.lang3.time.AbstractC6507
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.f15955 + ", locale=" + this.f15954 + ", lKeyValues=" + this.f15953 + ", pattern=" + this.f15946 + "]";
    }

    @Override // org.apache.commons.lang3.time.AbstractC6507
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11607(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.f15954);
        Map map = this.f15953;
        Integer num = (Integer) map.get(lowerCase);
        if (num == null) {
            num = (Integer) map.get(lowerCase + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        int i = this.f15955;
        if (9 != i || num.intValue() <= 1) {
            calendar.set(i, num.intValue());
        }
    }
}
