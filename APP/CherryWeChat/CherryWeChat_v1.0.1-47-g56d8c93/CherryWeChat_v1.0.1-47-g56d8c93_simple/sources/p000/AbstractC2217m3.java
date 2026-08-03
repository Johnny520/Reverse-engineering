package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2217m3 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m4461a(Object r0) {
        return ((LocaleManager) r0).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m4462b(Object r0, LocaleList r1) {
        ((LocaleManager) r0).setApplicationLocales(r1);
    }
}
