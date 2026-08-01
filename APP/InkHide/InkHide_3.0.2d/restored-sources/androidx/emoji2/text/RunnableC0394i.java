package androidx.emoji2.text;

import java.util.ArrayList;
import java.util.List;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: androidx.emoji2.text.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0394i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1171a;

    /* JADX INFO: renamed from: b */
    public final int f1172b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0394i(List list, int i2, Throwable th) {
        AbstractC0503h.m979g(list, "initCallbacks cannot be null");
        this.f1171a = new ArrayList(list);
        this.f1172b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1171a;
        int size = arrayList.size();
        int i2 = 0;
        if (this.f1172b != 1) {
            while (i2 < size) {
                ((AbstractC0393h) arrayList.get(i2)).getClass();
                i2++;
            }
        } else {
            while (i2 < size) {
                ((AbstractC0393h) arrayList.get(i2)).mo335a();
                i2++;
            }
        }
    }
}
