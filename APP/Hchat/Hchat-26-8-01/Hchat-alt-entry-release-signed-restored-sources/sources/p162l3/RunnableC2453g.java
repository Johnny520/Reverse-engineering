package p162l3;

import ac.AbstractC0063p;
import java.util.ArrayList;
import java.util.List;
import p237q2.AbstractC3436j;
import p237q2.C3433g;
import p237q2.C3437k;

/* JADX INFO: renamed from: l3.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2453g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final ArrayList f8058g;

    /* JADX INFO: renamed from: h */
    public final int f8059h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC2453g(List list, int i9, Throwable th2) {
        AbstractC0063p.m418k(list, "initCallbacks cannot be null");
        this.f8058g = new ArrayList(list);
        this.f8059h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f8058g;
        int size = arrayList.size();
        int i9 = 0;
        if (this.f8059h != 1) {
            while (i9 < size) {
                ((C3433g) arrayList.get(i9)).f11124b.f8339h = AbstractC3436j.f11127a;
                i9++;
            }
            return;
        }
        while (i9 < size) {
            C3433g c3433g = (C3433g) arrayList.get(i9);
            c3433g.f11123a.setValue(Boolean.TRUE);
            c3433g.f11124b.f8339h = new C3437k(true);
            i9++;
        }
    }
}
