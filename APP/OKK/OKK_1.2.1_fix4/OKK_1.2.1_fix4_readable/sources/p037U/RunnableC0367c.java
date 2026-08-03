package p037U;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: U.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0367c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0371g f779c;

    public /* synthetic */ RunnableC0367c(C0371g c0371g, ArrayList arrayList, int i2) {
        this.f777a = i2;
        this.f779c = c0371g;
        this.f778b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f777a) {
            case 0:
                ArrayList arrayList = this.f778b;
                Iterator it = arrayList.iterator();
                boolean zHasNext = it.hasNext();
                C0371g c0371g = this.f779c;
                if (zHasNext) {
                    ((AbstractC0370f) it.next()).getClass();
                    c0371g.getClass();
                    throw null;
                }
                arrayList.clear();
                c0371g.f790m.remove(arrayList);
                return;
            case 1:
                ArrayList arrayList2 = this.f778b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C0371g c0371g2 = this.f779c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0371g2.f791n.remove(arrayList2);
                        return;
                    }
                    AbstractC0369e abstractC0369e = (AbstractC0369e) it2.next();
                    c0371g2.getClass();
                    abstractC0369e.getClass();
                    abstractC0369e.getClass();
                    ArrayList arrayList3 = c0371g2.f795r;
                    long j2 = c0371g2.f881f;
                }
                break;
            default:
                ArrayList arrayList4 = this.f778b;
                Iterator it3 = arrayList4.iterator();
                boolean zHasNext3 = it3.hasNext();
                C0371g c0371g3 = this.f779c;
                if (!zHasNext3) {
                    arrayList4.clear();
                    c0371g3.f789l.remove(arrayList4);
                    return;
                } else {
                    AbstractC0355O abstractC0355O = (AbstractC0355O) it3.next();
                    c0371g3.getClass();
                    abstractC0355O.getClass();
                    throw null;
                }
        }
    }
}
