package p057g;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: g.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854D {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2166a(String r02) {
        return LocaleList.forLanguageTags(r02);
    }

    /* JADX INFO: renamed from: b */
    public static void m2167b(TextView r02, LocaleList r1) {
        r02.setTextLocales(r1);
    }
}
