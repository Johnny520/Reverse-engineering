package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ai */
/* JADX INFO: loaded from: classes.dex */
public final class C0019ai extends AbstractC0259gf {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0069bi f83y;

    public C0019ai(C0069bi c0069bi) {
        this.f83y = c0069bi;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: J */
    public final void mo51J(Throwable th) {
        this.f83y.f730a.m1280d(th);
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: M */
    public final void mo52M(C0402k8 c0402k8) {
        C0069bi c0069bi = this.f83y;
        c0069bi.f732c = c0402k8;
        c0069bi.f731b = new C0138d4(c0069bi.f732c, new C0893xh(19), c0069bi.f730a.f1996h);
        C0262gi c0262gi = c0069bi.f730a;
        c0262gi.getClass();
        ArrayList arrayList = new ArrayList();
        c0262gi.f1989a.writeLock().lock();
        try {
            c0262gi.f1991c = 1;
            arrayList.addAll(c0262gi.f1990b);
            c0262gi.f1990b.clear();
            c0262gi.f1989a.writeLock().unlock();
            c0262gi.f1992d.post(new RunnableC0550o8(arrayList, c0262gi.f1991c, (Throwable) null));
        } catch (Throwable th) {
            c0262gi.f1989a.writeLock().unlock();
            throw th;
        }
    }
}
