package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes.dex */
public final class C2145kf extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2192lf f7501f;

    public C2145kf(C2192lf c2192lf) {
        this.f7501f = c2192lf;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: H */
    public final void mo2561H(Throwable th) {
        this.f7501f.f7644a.m4801d(th);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: I */
    public final void mo2562I(C2428qs c2428qs) {
        C2192lf c2192lf = this.f7501f;
        c2192lf.f7646c = c2428qs;
        C2428qs c2428qs2 = c2192lf.f7646c;
        C2372pf c2372pf = c2192lf.f7644a;
        c2192lf.f7645b = new C2656w4(c2428qs2, c2372pf.f8349g, c2372pf.f8351i, Build.VERSION.SDK_INT >= 34 ? AbstractC2587uf.m5094a() : AbstractC0295Gu.m623p());
        C2372pf c2372pf2 = c2192lf.f7644a;
        c2372pf2.getClass();
        ArrayList arrayList = new ArrayList();
        c2372pf2.f8343a.writeLock().lock();
        try {
            c2372pf2.f8345c = 1;
            arrayList.addAll(c2372pf2.f8344b);
            c2372pf2.f8344b.clear();
            c2372pf2.f8343a.writeLock().unlock();
            c2372pf2.f8346d.post(new RunnableC0308H6(arrayList, c2372pf2.f8345c, (Throwable) null));
        } catch (Throwable th) {
            c2372pf2.f8343a.writeLock().unlock();
            throw th;
        }
    }
}
