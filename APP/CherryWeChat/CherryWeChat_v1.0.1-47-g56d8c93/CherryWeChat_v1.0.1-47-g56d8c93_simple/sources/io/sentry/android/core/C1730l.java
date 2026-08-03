package io.sentry.android.core;

import io.sentry.EnumC1657a2;
import io.sentry.android.core.cache.C1689a;
import io.sentry.util.InterfaceC2031c;
import java.io.File;

/* JADX INFO: renamed from: io.sentry.android.core.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1730l implements InterfaceC2031c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SentryAndroidOptions f6271a;

    public /* synthetic */ C1730l(SentryAndroidOptions r1) {
        this.f6271a = r1;
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        int r0 = C1689a.f6094k;
        SentryAndroidOptions r02 = this.f6271a;
        String r1 = r02.getOutboxPath();
        boolean r2 = false;
        if (r1 != null) goto L5;
        r02.getLogger().mo3680e(EnumC1657a2.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
    L15:
        return Boolean.valueOf(r2);
    L5:
        File r3 = new File(r1, "startup_crash");
        boolean r12 = r3.exists();     // Catch: Throwable -> L12
        if (r12 == true) goto L9;
    L11:
        r2 = r12;
        goto L15
    L9:
        if (r3.delete() == true) goto L11;
        r02.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete the startup crash marker file. %s.", new Object[]{r3.getAbsolutePath()});     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r02.getLogger().mo3683r(EnumC1657a2.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
        goto L15
    }
}
