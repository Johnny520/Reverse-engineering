package io.sentry.android.replay;

import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.protocol.C1970t;
import java.io.File;
import p000.AbstractC0073Bn;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1783g extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1789j f6481c;

    public /* synthetic */ C1783g(C1789j r1, int r2) {
        this.f6480b = r2;
        this.f6481c = r1;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f6480b) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        C1789j r0 = this.f6481c;
        C2046v2 r1 = r0.f6498a;
        C1970t r02 = r0.f6499b;
        String r2 = r1.getCacheDirPath();
        if (r2 != null) goto L7;
    L10:
        r1.getLogger().mo3680e(EnumC1657a2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
        return null;
    L7:
        if (r2.length() == 0) goto L10;
        File r22 = new File(r1.getCacheDirPath(), "replay_" + r02);
        r22.mkdirs();
        return r22;
    L12:
        C1789j r03 = this.f6481c;
        if (r03.m3972f() != null) goto L15;
        return null;
    L15:
        File r12 = new File(r03.m3972f(), ".ongoing_segment");
        if (r12.exists() == true) goto L19;
        r12.createNewFile();
    L19:
        return r12;
    }
}
