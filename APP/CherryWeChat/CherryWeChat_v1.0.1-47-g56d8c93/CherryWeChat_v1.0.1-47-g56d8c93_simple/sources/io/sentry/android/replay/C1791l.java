package io.sentry.android.replay;

import io.sentry.InterfaceC1645X;
import io.sentry.InterfaceC2000s1;
import java.util.ArrayList;
import p000.AbstractC2564tz;
import p000.C0382Iv;

/* JADX INFO: renamed from: io.sentry.android.replay.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1791l implements InterfaceC2000s1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0382Iv f6512b;

    public /* synthetic */ C1791l(C0382Iv r1, int r2) {
        this.f6511a = r2;
        this.f6512b = r1;
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public final void mo1424b(InterfaceC1645X r3) {
        int r0 = this.f6511a;
        C0382Iv r1 = this.f6512b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.f1315a = new ArrayList(r3.mo3782z());
        return;
    L6:
        int r02 = ReplayIntegration.f6381q;
        String r32 = r3.mo3775s();
        if (r32 == null) goto L9;
        String r33 = AbstractC2564tz.m5068c0(r32, '.');
    L10:
        r1.f1315a = r33;
        return;
    L9:
        r33 = null;
        goto L10
    }
}
