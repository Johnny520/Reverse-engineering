package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: H6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0308H6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1022a;

    /* JADX INFO: renamed from: b */
    public final int f1023b;

    /* JADX INFO: renamed from: c */
    public final Object f1024c;

    public /* synthetic */ RunnableC0308H6(int i, int i2, Object obj) {
        this.f1022a = i2;
        this.f1024c = obj;
        this.f1023b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1022a) {
            case 0:
                AbstractC0585Nj abstractC0585Nj = (AbstractC0585Nj) ((C1017Xm) this.f1024c).f3226b;
                if (abstractC0585Nj != null) {
                    abstractC0585Nj.mo1159I(this.f1023b);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f1024c;
                int size = arrayList.size();
                int i = 0;
                if (this.f1023b == 1) {
                    while (i < size) {
                        ((AbstractC2278nf) arrayList.get(i)).mo296b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((AbstractC2278nf) arrayList.get(i)).mo295a();
                        i++;
                    }
                }
                break;
            default:
                ((C0549Mq) this.f1024c).f1780a0.smoothScrollToPosition(this.f1023b);
                break;
        }
    }

    public RunnableC0308H6(List list, int i, Throwable th) {
        this.f1022a = 1;
        AbstractC1293cr.m2548g("initCallbacks cannot be null", list);
        this.f1024c = new ArrayList(list);
        this.f1023b = i;
    }
}
