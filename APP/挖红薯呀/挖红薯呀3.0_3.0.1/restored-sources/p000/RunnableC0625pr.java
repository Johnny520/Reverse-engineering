package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: pr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0625pr implements Runnable {

    /* JADX INFO: renamed from: d */
    public final ArrayList f4946d;

    /* JADX INFO: renamed from: e */
    public final int f4947e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0625pr(List list, int i, Throwable th) {
        v50.m4402g(list, "initCallbacks cannot be null");
        this.f4946d = new ArrayList(list);
        this.f4947e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f4946d;
        int size = arrayList.size();
        int i = 0;
        if (this.f4947e != 1) {
            while (i < size) {
                ((C1008zl) arrayList.get(i)).f7922b.f7232e = pf1.f4840f;
                i++;
            }
            return;
        }
        while (i < size) {
            C1008zl c1008zl = (C1008zl) arrayList.get(i);
            c1008zl.f7921a.setValue(Boolean.TRUE);
            c1008zl.f7922b.f7232e = new v00(true);
            i++;
        }
    }
}
