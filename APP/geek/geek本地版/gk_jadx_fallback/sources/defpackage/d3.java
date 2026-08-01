package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {
    public static android.os.LocaleList a(java.lang.Object r0) {
            android.app.LocaleManager r0 = (android.app.LocaleManager) r0
            android.os.LocaleList r0 = r0.getApplicationLocales()
            return r0
    }

    public static void b(java.lang.Object r0, android.os.LocaleList r1) {
            android.app.LocaleManager r0 = (android.app.LocaleManager) r0
            r0.setApplicationLocales(r1)
            return
    }
}
