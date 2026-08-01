package org.apache.commons.lang3.time;

import io.ktor.util.C5043;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.Function;
import p332.C9496;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6496 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15924;

    public /* synthetic */ C6496(AbstractC6494 abstractC6494, String str, TimeZone timeZone, Locale locale) {
        this.f15924 = 1;
        this.f15923 = str;
        this.f15921 = timeZone;
        this.f15922 = locale;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f15924;
        Object obj2 = this.f15922;
        Object obj3 = this.f15921;
        Object obj4 = this.f15923;
        switch (i) {
            case 0:
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Locale locale = (Locale) obj2;
                try {
                    return ((SimpleDateFormat) (num == null ? DateFormat.getTimeInstance(num2.intValue(), locale) : num2 == null ? DateFormat.getDateInstance(num.intValue(), locale) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale))).toPattern();
                } catch (ClassCastException unused) {
                    C5043.m9163(locale, "No date time pattern for locale: ");
                    return null;
                }
            case 1:
                return new FastDateFormat((String) obj4, (TimeZone) obj3, (Locale) obj2);
            default:
                String str = (String) obj4;
                try {
                    return C9496.m14950(str, (byte[]) obj3, (ClassLoader) obj2).loadClass(str);
                } catch (Exception e) {
                    System.err.println("[BeanShell] getClassByCode: " + e);
                    return null;
                }
        }
    }

    public /* synthetic */ C6496(int i, Serializable serializable, Object obj, Object obj2) {
        this.f15924 = i;
        this.f15923 = obj;
        this.f15921 = serializable;
        this.f15922 = obj2;
    }
}
