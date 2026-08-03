package Yue;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6135 {

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥ$ۥ */
    @InterfaceC7113(28)
    public static class C0913 {
        /* JADX INFO: renamed from: ۥ */
        public static CharSequence m2633(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = it.next().toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static CharSequence m2632(@InterfaceC6391 Context context, @InterfaceC6391 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0913.m2633(context, serviceInfo);
        }
        return null;
    }
}
