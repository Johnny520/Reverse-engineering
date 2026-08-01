package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0900;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC6523;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6498 extends AbstractC6507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TreeMap f15929 = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Locale f15930;

    public C6498(Locale locale) {
        int i = AbstractC6523.f15971;
        this.f15930 = locale != null ? locale : Locale.getDefault();
        StringBuilder sbM700 = AbstractC0900.m700("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                C6506 c6506 = new C6506(timeZone, false);
                C6506 c65062 = c6506;
                for (int i2 = 1; i2 < strArr.length; i2++) {
                    if (i2 == 3) {
                        c65062 = new C6506(timeZone, true);
                    } else if (i2 == 5) {
                        c65062 = c6506;
                    }
                    String str2 = strArr[i2];
                    if (str2 != null && treeSet.add(str2)) {
                        this.f15929.put(str2, c65062);
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
                    this.f15929.put(displayName, new C6506(timeZone2, timeZone2.observesDaylightTime()));
                }
            }
        }
        treeSet.forEach(new C6513(sbM700, 1));
        sbM700.append(")");
        this.f15946 = Pattern.compile(sbM700.toString());
    }

    @Override // org.apache.commons.lang3.time.AbstractC6507
    public final String toString() {
        return "TimeZoneStrategy [locale=" + this.f15930 + ", tzNames=" + this.f15929 + ", pattern=" + this.f15946 + "]";
    }

    @Override // org.apache.commons.lang3.time.AbstractC6507
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo11607(Calendar calendar, String str) {
        TimeZone timeZoneM11604 = AbstractC6487.m11604(str);
        if (timeZoneM11604 != null) {
            calendar.setTimeZone(timeZoneM11604);
            return;
        }
        TreeMap treeMap = this.f15929;
        C6506 c6506 = (C6506) treeMap.get(str);
        if (c6506 == null) {
            c6506 = (C6506) treeMap.get(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            if (c6506 == null) {
                char[] charArray = str.toCharArray();
                throw new IllegalStateException(String.format("Can't find time zone '%s' (%d %s) in %s", str, Integer.valueOf(charArray.length), Arrays.toString(charArray), new TreeSet(treeMap.keySet())));
            }
        }
        calendar.set(16, c6506.f15944);
        calendar.set(15, c6506.f15945.getRawOffset());
    }
}
