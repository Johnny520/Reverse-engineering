package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes.dex */
public final class C2145kf extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2192lf f7501f;

    public C2145kf(C2192lf r1) {
        this.f7501f = r1;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: H */
    public final void mo2561H(Throwable r2) {
        this.f7501f.f7644a.m4801d(r2);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: I */
    public final void mo2562I(C2428qs r7) {
        C2192lf r0 = this.f7501f;
        r0.f7646c = r7;
        C2428qs r1 = r0.f7646c;
        C2372pf r2 = r0.f7644a;
        C2220m6 r3 = r2.f8349g;
        C0749Rc r22 = r2.f8351i;
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Set<int[]> r4 = AbstractC2587uf.m5094a();
    L6:
        r0.f7645b = new C2656w4(r1, r3, r22, r4);
        C2372pf r72 = r0.f7644a;
        r72.getClass();
        ArrayList r02 = new ArrayList();
        r72.f8343a.writeLock().lock();
        r72.f8345c = 1;     // Catch: Throwable -> L10
        r02.addAll(r72.f8344b);     // Catch: Throwable -> L10
        r72.f8344b.clear();     // Catch: Throwable -> L10
        r72.f8343a.writeLock().unlock();
        r72.f8346d.post(new RunnableC0308H6(r02, r72.f8345c, null));
        return;
    L10:
        th = move-exception;
        r72.f8343a.writeLock().unlock();
        throw th;
    L5:
        r4 = AbstractC0295Gu.m623p();
        goto L6
    }
}
