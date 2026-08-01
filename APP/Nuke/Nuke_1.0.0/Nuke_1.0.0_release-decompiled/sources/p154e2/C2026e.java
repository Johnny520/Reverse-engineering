package p154e2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: e2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2026e implements InterfaceC2022a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2029h f6756a;

    public C2026e(C2029h c2029h) {
        this.f6756a = c2029h;
    }

    @Override // p154e2.InterfaceC2022a
    /* JADX INFO: renamed from: a */
    public final void mo3612a(boolean z5) {
        ArrayList arrayList;
        AbstractC2511o.m4452a();
        synchronized (this.f6756a) {
            arrayList = new ArrayList((HashSet) this.f6756a.f6764g);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2022a) it.next()).mo3612a(z5);
        }
    }
}
