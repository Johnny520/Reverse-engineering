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

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        int i = C1689a.f6094k;
        SentryAndroidOptions sentryAndroidOptions = this.f6271a;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zExists = file.exists();
                if (zExists && !file.delete()) {
                    sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z = zExists;
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            }
        }
        return Boolean.valueOf(z);
    }
}
