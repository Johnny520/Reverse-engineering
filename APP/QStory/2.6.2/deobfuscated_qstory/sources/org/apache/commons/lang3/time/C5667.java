package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC5692;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5667 extends AbstractC5676 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TreeMap f15584 = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Locale f15585;

    public C5667(Locale locale) {
        int i = AbstractC5692.f15626;
        this.f15585 = locale != null ? locale : Locale.getDefault();
        StringBuilder sbM149 = AbstractC0053.m149("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                C5675 c5675 = new C5675(timeZone, false);
                C5675 c56752 = c5675;
                for (int i2 = 1; i2 < strArr.length; i2++) {
                    if (i2 == 3) {
                        c56752 = new C5675(timeZone, true);
                    } else if (i2 == 5) {
                        c56752 = c5675;
                    }
                    String str2 = strArr[i2];
                    if (str2 != null && treeSet.add(str2)) {
                        this.f15584.put(str2, c56752);
                    }
                }
            }
        }
        String[] availableIDs = TimeZone.getAvailableIDs();
        if (availableIDs != null) {
            Arrays.sort(availableIDs);
        }
        for (String str3 : availableIDs) {
            if (!str3.equalsIgnoreCase("GMT")) {
                TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                String displayName = timeZone2.getDisplayName(locale);
                if (treeSet.add(displayName)) {
                    this.f15584.put(displayName, new C5675(timeZone2, timeZone2.observesDaylightTime()));
                }
            }
        }
        treeSet.forEach(new C5682(sbM149, 1));
        sbM149.append(")");
        this.f15601 = Pattern.compile(sbM149.toString());
    }

    @Override // org.apache.commons.lang3.time.AbstractC5676
    public final String toString() {
        return "TimeZoneStrategy [locale=" + this.f15585 + ", tzNames=" + this.f15584 + ", pattern=" + this.f15601 + "]";
    }

    @Override // org.apache.commons.lang3.time.AbstractC5676
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo10991(Calendar calendar, String str) {
        TimeZone timeZoneM10988 = AbstractC5656.m10988(str);
        if (timeZoneM10988 != null) {
            calendar.setTimeZone(timeZoneM10988);
            return;
        }
        TreeMap treeMap = this.f15584;
        C5675 c5675 = (C5675) treeMap.get(str);
        if (c5675 == null) {
            c5675 = (C5675) treeMap.get(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            if (c5675 == null) {
                char[] charArray = str.toCharArray();
                throw new IllegalStateException(String.format("Can't find time zone '%s' (%d %s) in %s", str, Integer.valueOf(charArray.length), Arrays.toString(charArray), new TreeSet(treeMap.keySet())));
            }
        }
        calendar.set(16, c5675.f15599);
        calendar.set(15, c5675.f15600.getRawOffset());
    }
}
