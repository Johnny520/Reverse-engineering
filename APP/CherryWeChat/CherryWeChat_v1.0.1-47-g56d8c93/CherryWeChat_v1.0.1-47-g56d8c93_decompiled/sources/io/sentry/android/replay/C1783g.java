package io.sentry.android.replay;

import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.protocol.C1970t;
import java.io.File;
import java.io.IOException;
import p000.AbstractC0073Bn;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1783g extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1789j f6481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1783g(C1789j c1789j, int i) {
        super(0);
        this.f6480b = i;
        this.f6481c = c1789j;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws IOException {
        switch (this.f6480b) {
            case 0:
                C1789j c1789j = this.f6481c;
                if (c1789j.m3972f() == null) {
                    return null;
                }
                File file = new File(c1789j.m3972f(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                C1789j c1789j2 = this.f6481c;
                C2046v2 c2046v2 = c1789j2.f6498a;
                C1970t c1970t = c1789j2.f6499b;
                String cacheDirPath = c2046v2.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                File file2 = new File(c2046v2.getCacheDirPath(), "replay_" + c1970t);
                file2.mkdirs();
                return file2;
        }
    }
}
