package io.sentry;

import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1790k;
import java.io.File;
import java.io.FilenameFilter;
import p000.AbstractC0042Az;
import p000.AbstractC0085Bz;
import p000.AbstractC2675wh;

/* JADX INFO: renamed from: io.sentry.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2025u implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7214b;

    public /* synthetic */ C2025u(int r1, Object r2) {
        this.f7213a = r1;
        this.f7214b = r2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File r6, String r7) {
        switch(this.f7213a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        C1789j r0 = (C1789j) this.f7214b;
        if (AbstractC0085Bz.m132J(r7, false, ".jpg") == false) goto L9;
        File r2 = new File(r6, r7);
        Long r62 = AbstractC0042Az.m62I(AbstractC2675wh.m5240c0(r2));
        if (r62 == null) goto L9;
        C1790k r3 = new C1790k(r2, r62.longValue(), null);
        r0.f6505h.add(r3);
    L9:
        return false;
    L11:
        return ((AbstractC2052w) this.f7214b).mo3587a(r7);
    }
}
