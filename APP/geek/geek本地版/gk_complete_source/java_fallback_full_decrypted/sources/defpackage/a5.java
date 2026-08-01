package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a5 {
    public static android.os.LocaleList a(java.lang.String r0) {
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
            return r0
    }

    public static void b(android.widget.TextView r0, android.os.LocaleList r1) {
            r0.setTextLocales(r1)
            return
    }
}
