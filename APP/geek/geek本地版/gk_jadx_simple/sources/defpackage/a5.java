package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class a5 {
    public static LocaleList a(String r0) {
        return LocaleList.forLanguageTags(r0);
    }

    public static void b(TextView r0, LocaleList r1) {
        r0.setTextLocales(r1);
    }
}
