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

    public C2163kt(C1514ht r1, C1514ht r2, C2115jt r3, C2115jt r4) {
        this.f7541a = r1;
        this.f7542b = r2;
        this.f7543c = r3;
        this.f7544d = r4;
    }

    public final void onBackCancelled() {
        this.f7544d.mo6a();
    }

    public final void onBackInvoked() {
        this.f7543c.mo6a();
    }

    public final void onBackProgressed(BackEvent r3) {
        AbstractC1031Y.m1963k(r3);
        AbstractC1031Y.m1964l(r3);
        AbstractC1031Y.m1960h(r3);
        AbstractC1031Y.m1962j(r3);
        C2335ot r32 = (C2335ot) this.f7542b.f5363c;
        if (r32.f8205c != null) goto L16;
        C0134D4 r33 = r32.f8204b;
        ListIterator r34 = r33.listIterator(r33.size());
    L6:
        if (r34.hasPrevious() == false) goto L10;
        Object r0 = r34.previous();
        if (((C2461ri) r0).f8673a == false) goto L6;
    L11:
        C2461ri r02 = (C2461ri) r0;
        return;
    L10:
        r0 = null;
        goto L11
    }

    public final void onBackStarted(BackEvent r4) {
        AbstractC1031Y.m1963k(r4);
        AbstractC1031Y.m1964l(r4);
        AbstractC1031Y.m1960h(r4);
        AbstractC1031Y.m1962j(r4);
        C2335ot r42 = (C2335ot) this.f7541a.f5363c;
        C0134D4 r0 = r42.f8204b;
        ListIterator r02 = r0.listIterator(r0.size());
    L4:
        if (r02.hasPrevious() == false) goto L8;
        Object r1 = r02.previous();
        if (((C2461ri) r1).f8673a == false) goto L4;
    L9:
        C2461ri r12 = (C2461ri) r1;
        if (r42.f8205c == null) goto L12;
        r42.m4741a();
    L12:
        r42.f8205c = r12;
        return;
    L8:
        r1 = null;
        goto L9
    }
}
