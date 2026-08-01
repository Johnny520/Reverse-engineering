package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: yh */
/* JADX INFO: loaded from: classes.dex */
public final class C0930yh extends AbstractC0346ip {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C0967zh f5341C;

    public C0930yh(C0967zh c0967zh) {
        this.f5341C = c0967zh;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: F */
    public final void mo1276F(Throwable th) {
        this.f5341C.f5557a.m1032d(th);
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: I */
    public final void mo1277I(C0009a8 c0009a8) {
        C0967zh c0967zh = this.f5341C;
        c0967zh.f5559c = c0009a8;
        c0967zh.f5558b = new C0138d4(c0967zh.f5559c, new C0819vh(17), c0967zh.f5557a.f1785h);
        C0188ei c0188ei = c0967zh.f5557a;
        c0188ei.getClass();
        ArrayList arrayList = new ArrayList();
        c0188ei.f1778a.writeLock().lock();
        try {
            c0188ei.f1780c = 1;
            arrayList.addAll(c0188ei.f1779b);
            c0188ei.f1779b.clear();
            c0188ei.f1778a.writeLock().unlock();
            c0188ei.f1781d.post(new RunnableC0178e8(arrayList, c0188ei.f1780c, (Throwable) null));
        } catch (Throwable th) {
            c0188ei.f1778a.writeLock().unlock();
            throw th;
        }
    }
}
