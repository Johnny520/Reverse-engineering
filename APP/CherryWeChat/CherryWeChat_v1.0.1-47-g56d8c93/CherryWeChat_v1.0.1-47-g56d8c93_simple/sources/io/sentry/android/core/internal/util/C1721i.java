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
    public static final Charset f6238g = null;

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

    static {
        f6238g = Charset.forName("UTF-8");
    }

    public C1721i(Context r13, C1666I r14, ILogger r15) {
        Runtime r2 = Runtime.getRuntime();
        this.f6239a = r13;
        AbstractC1856a.m4048D("The BuildInfoProvider is required.", r14);
        this.f6240b = r14;
        AbstractC1856a.m4048D("The Logger is required.", r15);
        this.f6241c = r15;
        this.f6242d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f6243e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        AbstractC1856a.m4048D("The Runtime is required.", r2);
        this.f6244f = r2;
    }
}
