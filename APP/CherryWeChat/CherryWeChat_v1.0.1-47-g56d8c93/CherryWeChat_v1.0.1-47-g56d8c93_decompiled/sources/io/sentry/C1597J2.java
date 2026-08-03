package io.sentry;

import io.sentry.protocol.C1970t;
import io.sentry.util.AbstractC2038j;
import io.sentry.util.InterfaceC2031c;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.J2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1597J2 implements InterfaceC2031c, InterfaceC2000s1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f5761b;

    public /* synthetic */ C1597J2(C1970t c1970t, String str) {
        this.f5760a = 2;
        this.f5761b = str;
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X interfaceC1645X) {
        interfaceC1645X.mo3758H(this.f5761b);
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        int i = this.f5760a;
        String str = this.f5761b;
        switch (i) {
            case 0:
                return str;
            default:
                Charset charset = AbstractC2038j.f7226a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    public /* synthetic */ C1597J2(String str, int i) {
        this.f5760a = i;
        this.f5761b = str;
    }
}
