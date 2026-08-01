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
import org.apache.commons.lang3.AbstractC5693;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5668 extends AbstractC5677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TreeMap f15584 = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Locale f15585;

    public C5668(Locale locale) {
        int i = AbstractC5693.f15626;
        this.f15585 = locale != null ? locale : Locale.getDefault();
        StringBuilder sbM140 = AbstractC0053.m140("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                C5676 c5676 = new C5676(timeZone, false);
                C5676 c56762 = c5676;
                for (int i2 = 1; i2 < strArr.length; i2++) {
                    if (i2 == 3) {
                        c56762 = new C5676(timeZone, true);
                    } else if (i2 == 5) {
                        c56762 = c5676;
                    }
                    String str2 = strArr[i2];
                    if (str2 != null && treeSet.add(str2)) {
                        this.f15584.put(str2, c56762);
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
                    this.f15584.put(displayName, new C5676(timeZone2, timeZone2.observesDaylightTime()));
                }
            }
        }
        treeSet.forEach(new C5683(sbM140, 1));
        sbM140.append(")");
        this.f15601 = Pattern.compile(sbM140.toString());
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    public final String toString() {
        return "TimeZoneStrategy [locale=" + this.f15585 + ", tzNames=" + this.f15584 + ", pattern=" + this.f15601 + "]";
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo11048(Calendar calendar, String str) {
        TimeZone timeZoneM11045 = AbstractC5657.m11045(str);
        if (timeZoneM11045 != null) {
            calendar.setTimeZone(timeZoneM11045);
            return;
        }
        TreeMap treeMap = this.f15584;
        C5676 c5676 = (C5676) treeMap.get(str);
        if (c5676 == null) {
            c5676 = (C5676) treeMap.get(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            if (c5676 == null) {
                char[] charArray = str.toCharArray();
                throw new IllegalStateException(String.format("Can't find time zone '%s' (%d %s) in %s", str, Integer.valueOf(charArray.length), Arrays.toString(charArray), new TreeSet(treeMap.keySet())));
            }
        }
        calendar.set(16, c5676.f15599);
        calendar.set(15, c5676.f15600.getRawOffset());
    }
}
