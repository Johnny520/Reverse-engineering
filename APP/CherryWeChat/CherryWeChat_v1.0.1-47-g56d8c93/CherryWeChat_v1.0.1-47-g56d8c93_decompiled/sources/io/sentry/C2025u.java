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

    public /* synthetic */ C2025u(int i, Object obj) {
        this.f7213a = i;
        this.f7214b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f7213a) {
            case 0:
                return ((AbstractC2052w) this.f7214b).mo3587a(str);
            default:
                C1789j c1789j = (C1789j) this.f7214b;
                if (AbstractC0085Bz.m132J(str, false, ".jpg")) {
                    File file2 = new File(file, str);
                    Long lM62I = AbstractC0042Az.m62I(AbstractC2675wh.m5240c0(file2));
                    if (lM62I != null) {
                        c1789j.f6505h.add(new C1790k(file2, lM62I.longValue(), null));
                    }
                }
                return false;
        }
    }
}
