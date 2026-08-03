package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.C1586H;
import io.sentry.C1656a1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import java.io.File;

/* JADX INFO: renamed from: io.sentry.android.core.P */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC1673P extends FileObserver {

    /* JADX INFO: renamed from: a */
    public final String f6002a;

    /* JADX INFO: renamed from: b */
    public final C1656a1 f6003b;

    /* JADX INFO: renamed from: c */
    public final ILogger f6004c;

    /* JADX INFO: renamed from: d */
    public final long f6005d;

    public FileObserverC1673P(String str, C1656a1 c1656a1, ILogger iLogger, long j) {
        super(str);
        this.f6002a = str;
        this.f6003b = c1656a1;
        AbstractC1856a.m4048D("Logger is required.", iLogger);
        this.f6004c = iLogger;
        this.f6005d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.f6002a;
        ILogger iLogger = this.f6004c;
        iLogger.mo3680e(enumC1657a2, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        C1586H c1586hM4059e = AbstractC1856a.m4059e(new C1672O(this.f6005d, iLogger));
        String str3 = str2 + File.separator + str;
        C1656a1 c1656a1 = this.f6003b;
        c1656a1.getClass();
        AbstractC1856a.m4048D("Path is required.", str3);
        c1656a1.mo3588b(new File(str3), c1586hM4059e);
    }
}
