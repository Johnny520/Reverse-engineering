package io.sentry.util;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.util.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2038j {

    /* JADX INFO: renamed from: a */
    public static final Charset f7226a = null;

    /* JADX INFO: renamed from: b */
    public static final Pattern f7227b = null;

    static {
        f7226a = Charset.forName("UTF-8");
        f7227b = Pattern.compile("[\\W_]+");
    }

    /* JADX INFO: renamed from: a */
    public static String m4182a(String r4) {
        if (r4 != null) goto L4;
        return r4;
    L4:
        if (r4.isEmpty() == true) goto L9;
        StringBuilder r0 = new StringBuilder();
        String r1 = r4.substring(0, 1);
        Locale r3 = Locale.ROOT;
        r0.append(r1.toUpperCase(r3));
        r0.append(r4.substring(1).toLowerCase(r3));
        return r0.toString();
    L9:
        return r4;
    }

    /* JADX INFO: renamed from: b */
    public static String m4183b(String r2) {
        if (r2 != null) goto L4;
        return r2;
    L4:
        if (r2.startsWith("\"") == true) goto L6;
        return r2;
    L6:
        if (r2.endsWith("\"") == true) goto L8;
        return r2;
    L8:
        return r2.substring(1, r2.length() - 1);
    }
}
