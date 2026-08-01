package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr {
    public static final Locale[] a = null;

    static {
        a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};
    }

    public static Locale a(String r0) {
        return Locale.forLanguageTag(r0);
    }

    public static boolean b(Locale r5, Locale r6) {
        if (r5.equals(r6) == false) goto L6;
        return true;
    L6:
        if (r5.getLanguage().equals(r6.getLanguage()) == false) goto L27;
        Locale[] r0 = a;
        int r2 = r0.length;
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L14;
        if (r0[r3].equals(r5) == true) goto L27;
        r3 = r3 + 1;
        goto L9
    L14:
        int r22 = r0.length;
        int r32 = 0;
    L15:
        if (r32 >= r22) goto L20;
        if (r0[r32].equals(r6) == true) goto L27;
        r32 = r32 + 1;
        goto L15
    L20:
        String r02 = qo.c(qo.a(qo.b(r5)));
        if (r02.isEmpty() == false) goto L31;
        String r52 = r5.getCountry();
        if (r52.isEmpty() == false) goto L25;
        return true;
    L25:
        if (r52.equals(r6.getCountry()) == false) goto L27;
        return true;
    L31:
        return r02.equals(qo.c(qo.a(qo.b(r6))));
    L27:
        return false;
    }
}
