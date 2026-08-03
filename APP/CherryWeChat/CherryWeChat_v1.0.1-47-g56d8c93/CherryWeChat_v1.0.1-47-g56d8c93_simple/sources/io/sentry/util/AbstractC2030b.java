package io.sentry.util;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.util.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2030b {

    /* JADX INFO: renamed from: a */
    public static final Charset f7215a = null;

    static {
        f7215a = Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m4174a(Calendar r3) {
        HashMap r0 = new HashMap();
        r0.put("year", Integer.valueOf(r3.get(1)));
        r0.put("month", Integer.valueOf(r3.get(2)));
        r0.put("dayOfMonth", Integer.valueOf(r3.get(5)));
        r0.put("hourOfDay", Integer.valueOf(r3.get(11)));
        r0.put("minute", Integer.valueOf(r3.get(12)));
        r0.put("second", Integer.valueOf(r3.get(13)));
        return r0;
    }
}
