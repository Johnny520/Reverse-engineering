package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.C1666I;
import io.sentry.config.AbstractC1856a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1721i {

    /* JADX INFO: renamed from: g */
    public static final Charset f6238g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f6239a;

    /* JADX INFO: renamed from: b */
    public final C1666I f6240b;

    /* JADX INFO: renamed from: c */
    public final ILogger f6241c;

    /* JADX INFO: renamed from: d */
    public final String[] f6242d;

    /* JADX INFO: renamed from: e */
    public final String[] f6243e;

    /* JADX INFO: renamed from: f */
    public final Runtime f6244f;

    public C1721i(Context context, C1666I c1666i, ILogger iLogger) {
        Runtime runtime = Runtime.getRuntime();
        this.f6239a = context;
        AbstractC1856a.m4048D("The BuildInfoProvider is required.", c1666i);
        this.f6240b = c1666i;
        AbstractC1856a.m4048D("The Logger is required.", iLogger);
        this.f6241c = iLogger;
        this.f6242d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f6243e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        AbstractC1856a.m4048D("The Runtime is required.", runtime);
        this.f6244f = runtime;
    }
}
