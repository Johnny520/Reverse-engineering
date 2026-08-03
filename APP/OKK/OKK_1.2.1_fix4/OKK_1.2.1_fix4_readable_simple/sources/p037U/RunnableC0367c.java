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

    public /* synthetic */ RunnableC0367c(C0371g r1, ArrayList r2, int r3) {
        this.f777a = r3;
        this.f779c = r1;
        this.f778b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f777a) {
            case 0: goto L16;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        ArrayList r02 = this.f778b;
        Iterator r1 = r02.iterator();
        boolean r2 = r1.hasNext();
        C0371g r3 = this.f779c;
        if (r2 == true) goto L8;
        r02.clear();
        r3.f789l.remove(r02);
        return;
    L8:
        AbstractC0355O r03 = (AbstractC0355O) r1.next();
        r3.getClass();
        r03.getClass();
        throw null;
    L10:
        ArrayList r04 = this.f778b;
        Iterator r12 = r04.iterator();
    L11:
        boolean r22 = r12.hasNext();
        C0371g r32 = this.f779c;
        if (r22 == false) goto L14;
        AbstractC0369e r23 = (AbstractC0369e) r12.next();
        r32.getClass();
        r23.getClass();
        r23.getClass();
        ArrayList r24 = r32.f795r;
        long r25 = r32.f881f;
        goto L11
    L14:
        r04.clear();
        r32.f791n.remove(r04);
        return;
    L16:
        ArrayList r05 = this.f778b;
        Iterator r13 = r05.iterator();
        boolean r26 = r13.hasNext();
        C0371g r33 = this.f779c;
        if (r26 == true) goto L20;
        r05.clear();
        r33.f790m.remove(r05);
        return;
    L20:
        ((AbstractC0370f) r13.next()).getClass();
        r33.getClass();
        throw null;
    }
}
