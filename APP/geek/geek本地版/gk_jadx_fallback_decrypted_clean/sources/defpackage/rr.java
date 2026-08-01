package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rr {
    public static android.os.LocaleList a(java.util.Locale... r1) {
            android.os.LocaleList r0 = new android.os.LocaleList
            r0.<init>(r1)
            return r0
    }

    public static android.os.LocaleList b() {
            android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
            return r0
    }

    public static android.os.LocaleList c() {
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            return r0
    }
}
