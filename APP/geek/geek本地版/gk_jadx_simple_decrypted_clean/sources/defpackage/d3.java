package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {
    public static LocaleList a(Object r0) {
        return ((LocaleManager) r0).getApplicationLocales();
    }

    public static void b(Object r0, LocaleList r1) {
        ((LocaleManager) r0).setApplicationLocales(r1);
    }
}
