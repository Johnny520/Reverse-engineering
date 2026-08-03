package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.ListIterator;

/* JADX INFO: renamed from: kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2163kt implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1514ht f7541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1514ht f7542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2115jt f7543c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2115jt f7544d;

    public C2163kt(C1514ht c1514ht, C1514ht c1514ht2, C2115jt c2115jt, C2115jt c2115jt2) {
        this.f7541a = c1514ht;
        this.f7542b = c1514ht2;
        this.f7543c = c2115jt;
        this.f7544d = c2115jt2;
    }

    public final void onBackCancelled() {
        this.f7544d.mo6a();
    }

    public final void onBackInvoked() {
        this.f7543c.mo6a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Object objPrevious;
        AbstractC1031Y.m1963k(backEvent);
        AbstractC1031Y.m1964l(backEvent);
        AbstractC1031Y.m1960h(backEvent);
        AbstractC1031Y.m1962j(backEvent);
        C2335ot c2335ot = (C2335ot) this.f7542b.f5363c;
        if (c2335ot.f8205c == null) {
            C0134D4 c0134d4 = c2335ot.f8204b;
            ListIterator listIterator = c0134d4.listIterator(c0134d4.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((C2461ri) objPrevious).f8673a) {
                        break;
                    }
                }
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        Object objPrevious;
        AbstractC1031Y.m1963k(backEvent);
        AbstractC1031Y.m1964l(backEvent);
        AbstractC1031Y.m1960h(backEvent);
        AbstractC1031Y.m1962j(backEvent);
        C2335ot c2335ot = (C2335ot) this.f7541a.f5363c;
        C0134D4 c0134d4 = c2335ot.f8204b;
        ListIterator listIterator = c0134d4.listIterator(c0134d4.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((C2461ri) objPrevious).f8673a) {
                    break;
                }
            }
        }
        C2461ri c2461ri = (C2461ri) objPrevious;
        if (c2335ot.f8205c != null) {
            c2335ot.m4741a();
        }
        c2335ot.f8205c = c2461ri;
    }
}
