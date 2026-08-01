package p264s0;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s0.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6800k0 {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f21798a = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static final NumberFormat m26975a(int i10, int i11, boolean z10, Locale locale) {
        String str = i10 + '.' + i11 + '.' + z10 + '.' + locale.toLanguageTag();
        WeakHashMap weakHashMap = f21798a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(z10);
            integerInstance.setMinimumIntegerDigits(i10);
            integerInstance.setMaximumIntegerDigits(i11);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return (NumberFormat) obj2;
    }

    /* JADX INFO: renamed from: b */
    public static final String m26976b(int i10, int i11, int i12, boolean z10, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return m26975a(i11, i12, z10, locale).format(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m26977c(int i10, int i11, int i12, boolean z10, Locale locale, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1;
        }
        if ((i13 & 2) != 0) {
            i12 = 40;
        }
        if ((i13 & 4) != 0) {
            z10 = false;
        }
        if ((i13 & 8) != 0) {
            locale = null;
        }
        return m26976b(i10, i11, i12, z10, locale);
    }
}
