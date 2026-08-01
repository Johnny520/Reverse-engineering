package p275t0;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: t0.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7963h0 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC7951e0 m30731a(Locale locale) {
        return new C7955f0(locale);
    }

    /* JADX INFO: renamed from: b */
    public static final String m30732b(long j10, String str, Locale locale, Map map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            map.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j10));
    }
}
