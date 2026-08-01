package org.apache.commons.lang3.time;

import io.ktor.util.C4211;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.Function;
import p316.C8667;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5666 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15579;

    public /* synthetic */ C5666(AbstractC5664 abstractC5664, String str, TimeZone timeZone, Locale locale) {
        this.f15579 = 1;
        this.f15578 = str;
        this.f15576 = timeZone;
        this.f15577 = locale;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f15579;
        Object obj2 = this.f15577;
        Object obj3 = this.f15576;
        Object obj4 = this.f15578;
        switch (i) {
            case 0:
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Locale locale = (Locale) obj2;
                try {
                    return ((SimpleDateFormat) (num == null ? DateFormat.getTimeInstance(num2.intValue(), locale) : num2 == null ? DateFormat.getDateInstance(num.intValue(), locale) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale))).toPattern();
                } catch (ClassCastException unused) {
                    C4211.m8604(locale, "No date time pattern for locale: ");
                    return null;
                }
            case 1:
                return new FastDateFormat((String) obj4, (TimeZone) obj3, (Locale) obj2);
            default:
                String str = (String) obj4;
                try {
                    return C8667.m14391(str, (byte[]) obj3, (ClassLoader) obj2).loadClass(str);
                } catch (Exception e) {
                    System.err.println("[BeanShell] getClassByCode: " + e);
                    return null;
                }
        }
    }

    public /* synthetic */ C5666(int i, Serializable serializable, Object obj, Object obj2) {
        this.f15579 = i;
        this.f15578 = obj;
        this.f15576 = serializable;
        this.f15577 = obj2;
    }
}
