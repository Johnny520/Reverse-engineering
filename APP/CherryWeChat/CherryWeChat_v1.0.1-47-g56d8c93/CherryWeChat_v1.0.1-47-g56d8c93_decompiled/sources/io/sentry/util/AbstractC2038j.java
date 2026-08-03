package io.sentry.util;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.util.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2038j {

    /* JADX INFO: renamed from: a */
    public static final Charset f7226a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Pattern f7227b = Pattern.compile("[\\W_]+");

    /* JADX INFO: renamed from: a */
    public static String m4182a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m4183b(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }
}
