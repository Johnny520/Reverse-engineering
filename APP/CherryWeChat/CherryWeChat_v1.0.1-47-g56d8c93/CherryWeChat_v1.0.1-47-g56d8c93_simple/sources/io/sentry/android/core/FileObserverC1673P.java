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

    public FileObserverC1673P(String r1, C1656a1 r2, ILogger r3, long r4) {
        super(r1);
        this.f6002a = r1;
        this.f6003b = r2;
        AbstractC1856a.m4048D("Logger is required.", r3);
        this.f6004c = r3;
        this.f6005d = r4;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int r6, String r7) {
        if (r7 != null) goto L4;
        return;
    L4:
        if (r6 != 8) goto L9;
        EnumC1657a2 r0 = EnumC1657a2.DEBUG;
        Integer r62 = Integer.valueOf(r6);
        String r1 = this.f6002a;
        ILogger r2 = this.f6004c;
        r2.mo3680e(r0, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", new Object[]{r62, r1, r7});
        C1586H r63 = AbstractC1856a.m4059e(new C1672O(this.f6005d, r2));
        String r72 = r1 + File.separator + r7;
        C1656a1 r02 = this.f6003b;
        r02.getClass();
        AbstractC1856a.m4048D("Path is required.", r72);
        r02.mo3588b(new File(r72), r63);
        return;
    }
}
