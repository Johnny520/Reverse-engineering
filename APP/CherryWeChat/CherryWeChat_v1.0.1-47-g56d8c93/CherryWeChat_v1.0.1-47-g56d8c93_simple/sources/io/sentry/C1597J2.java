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

    public /* synthetic */ C1597J2(C1970t r1, String r2) {
        this.f5760a = 2;
        this.f5761b = r2;
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X r2) {
        r2.mo3758H(this.f5761b);
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        int r0 = this.f5760a;
        String r1 = this.f5761b;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Charset r02 = AbstractC2038j.f7226a;
        if (r1.equals("0000-0000") == false) goto L8;
        r1 = "00000000-0000-0000-0000-000000000000";
    L8:
        return r1.replace("-", "");
    L9:
        return r1;
    }

    public /* synthetic */ C1597J2(String r1, int r2) {
        this.f5760a = r2;
        this.f5761b = r1;
    }
}
