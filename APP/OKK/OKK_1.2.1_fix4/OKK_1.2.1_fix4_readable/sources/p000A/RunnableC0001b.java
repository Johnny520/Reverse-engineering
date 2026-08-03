package p000A;

import androidx.emoji2.text.AbstractC0483h;
import java.util.ArrayList;
import java.util.List;
import p001A0.AbstractC0040p;
import p006D.C0095d;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: A.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0001b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3a = 0;

    /* JADX INFO: renamed from: b */
    public final int f4b;

    /* JADX INFO: renamed from: c */
    public final Object f5c;

    public RunnableC0001b(C0095d c0095d, int i2) {
        this.f5c = c0095d;
        this.f4b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3a) {
            case 0:
                AbstractC1083b abstractC1083b = (AbstractC1083b) ((C0095d) this.f5c).f251b;
                if (abstractC1083b != null) {
                    abstractC1083b.mo2163f(this.f4b);
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f5c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f4b == 1) {
                    while (i2 < size) {
                        ((AbstractC0483h) arrayList.get(i2)).mo685b();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((AbstractC0483h) arrayList.get(i2)).mo686a();
                        i2++;
                    }
                }
                break;
        }
    }

    public RunnableC0001b(List list, int i2, Throwable th) {
        AbstractC0040p.m106i(list, "initCallbacks cannot be null");
        this.f5c = new ArrayList(list);
        this.f4b = i2;
    }
}
