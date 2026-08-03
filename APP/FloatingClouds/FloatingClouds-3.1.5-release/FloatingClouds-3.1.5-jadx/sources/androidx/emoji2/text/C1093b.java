package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.C1094c;
import java.util.ArrayList;
import p000a.C0224M5;
import p000a.C0296Q5;
import p000a.C0671kb;
import p000a.C0889w1;

/* JADX INFO: renamed from: androidx.emoji2.text.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1093b extends C1094c.h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1094c.a f4482a;

    public C1093b(C1094c.a aVar) {
        this.f4482a = aVar;
    }

    @Override // androidx.emoji2.text.C1094c.h
    /* JADX INFO: renamed from: a */
    public final void mo2503a(Throwable th) {
        this.f4482a.f4496a.m2508d(th);
    }

    @Override // androidx.emoji2.text.C1094c.h
    /* JADX INFO: renamed from: b */
    public final void mo2504b(C0671kb c0671kb) {
        C1094c.a aVar = this.f4482a;
        aVar.f4495c = c0671kb;
        C0671kb c0671kb2 = aVar.f4495c;
        C1094c c1094c = aVar.f4496a;
        aVar.f4494b = new C0296Q5(c0671kb2, c1094c.f4491g, c1094c.f4493i, Build.VERSION.SDK_INT >= 34 ? C0224M5.m616a() : C0889w1.m2116B());
        C1094c c1094c2 = aVar.f4496a;
        c1094c2.getClass();
        ArrayList arrayList = new ArrayList();
        c1094c2.f4485a.writeLock().lock();
        try {
            c1094c2.f4487c = 1;
            arrayList.addAll(c1094c2.f4486b);
            c1094c2.f4486b.clear();
            c1094c2.f4485a.writeLock().unlock();
            c1094c2.f4488d.post(new C1094c.f(arrayList, c1094c2.f4487c, null));
        } catch (Throwable th) {
            c1094c2.f4485a.writeLock().unlock();
            throw th;
        }
    }
}
