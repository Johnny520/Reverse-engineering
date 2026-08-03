package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.protocol.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1967q implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6994a;

    /* JADX INFO: renamed from: b */
    public Integer f6995b;

    /* JADX INFO: renamed from: c */
    public Integer f6996c;

    /* JADX INFO: renamed from: d */
    public Integer f6997d;

    /* JADX INFO: renamed from: e */
    public HashMap f6998e;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6994a != null) {
            c1901c.m4106p("sdk_name");
            c1901c.m4115z(this.f6994a);
        }
        if (this.f6995b != null) {
            c1901c.m4106p("version_major");
            c1901c.m4114y(this.f6995b);
        }
        if (this.f6996c != null) {
            c1901c.m4106p("version_minor");
            c1901c.m4114y(this.f6996c);
        }
        if (this.f6997d != null) {
            c1901c.m4106p("version_patchlevel");
            c1901c.m4114y(this.f6997d);
        }
        HashMap map = this.f6998e;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6998e, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
