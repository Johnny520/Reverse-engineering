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

    public /* synthetic */ C1791l(C0382Iv c0382Iv, int i) {
        this.f6511a = i;
        this.f6512b = c0382Iv;
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public final void mo1424b(InterfaceC1645X interfaceC1645X) {
        int i = this.f6511a;
        C0382Iv c0382Iv = this.f6512b;
        switch (i) {
            case 0:
                int i2 = ReplayIntegration.f6381q;
                String strMo3775s = interfaceC1645X.mo3775s();
                c0382Iv.f1315a = strMo3775s != null ? AbstractC2564tz.m5068c0(strMo3775s, '.') : null;
                break;
            default:
                c0382Iv.f1315a = new ArrayList(interfaceC1645X.mo3782z());
                break;
        }
    }
}
