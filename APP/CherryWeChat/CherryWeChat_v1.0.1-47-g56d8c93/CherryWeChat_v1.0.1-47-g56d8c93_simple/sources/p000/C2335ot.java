package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ot */
/* JADX INFO: loaded from: classes.dex */
public final class C2335ot {

    /* JADX INFO: renamed from: a */
    public final Runnable f8203a;

    /* JADX INFO: renamed from: b */
    public final C0134D4 f8204b;

    /* JADX INFO: renamed from: c */
    public C2461ri f8205c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f8206d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f8207e;

    /* JADX INFO: renamed from: f */
    public boolean f8208f;

    /* JADX INFO: renamed from: g */
    public boolean f8209g;

    public C2335ot(Runnable r5) {
        this.f8203a = r5;
        this.f8204b = new C0134D4();
        int r52 = Build.VERSION.SDK_INT;
        if (r52 >= 33) goto L5;
        return;
    L5:
        if (r52 < 34) goto L7;
        OnBackInvokedCallback r53 = AbstractC0295Gu.m615h(new C1514ht(0, this), new C1514ht(1, this), new C2115jt(this, 0), new C2115jt(this, 1));
    L8:
        this.f8206d = r53;
        return;
    L7:
        r53 = new C2655w3(1, new C2115jt(this, 2));
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public final void m4741a() {
        if (this.f8205c != null) goto L12;
        C0134D4 r0 = this.f8204b;
        ListIterator<E> r02 = r0.listIterator(r0.size());
    L6:
        if (r02.hasPrevious() == false) goto L10;
        Object r2 = r02.previous();
        if (((C2461ri) r2).f8673a == false) goto L6;
    L11:
        C2461ri r22 = (C2461ri) r2;
        goto L12
    L10:
        r2 = null;
    L12:
        this.f8205c = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4742b() {
        C2461ri r0 = this.f8205c;
        if (r0 != null) goto L12;
        C0134D4 r02 = this.f8204b;
        r02.getClass();
        ListIterator r03 = r02.listIterator(r02.f348c);
    L6:
        if (r03.hasPrevious() == false) goto L10;
        Object r2 = r03.previous();
        if (((C2461ri) r2).f8673a == false) goto L6;
    L11:
        r0 = (C2461ri) r2;
        goto L12
    L10:
        r2 = null;
    L12:
        this.f8205c = null;
        if (r0 == null) goto L20;
        AbstractC2805zi r04 = r0.f8676d;
        r04.m5427y(true);
        if (r04.f9499h.f8673a == false) goto L18;
        r04.m5388O();
        return;
    L18:
        r04.f9498g.m4742b();
        return;
    L20:
        this.f8203a.run();
    }

    /* JADX INFO: renamed from: c */
    public final void m4743c(boolean r4) {
        OnBackInvokedDispatcher r0 = this.f8207e;
        if (r0 == null) goto L16;
        OnBackInvokedCallback r1 = this.f8206d;
        if (r1 == null) goto L17;
        if (r4 == true) goto L8;
    L11:
        if (r4 == false) goto L13;
        return;
    L13:
        if (this.f8208f == false) goto L19;
        AbstractC0988X.m1881g(r0, r1);
        this.f8208f = false;
        return;
    L19:
        return;
    L8:
        if (this.f8208f == true) goto L11;
        AbstractC0988X.m1880f(r0, r1);
        this.f8208f = true;
        return;
    L17:
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m4744d() {
        boolean r0 = this.f8209g;
        boolean r1 = false;
        C0134D4 r2 = this.f8204b;
        if (r2 != null) goto L5;
    L7:
        Iterator<E> r22 = r2.iterator();
    L9:
        if (r22.hasNext() == false) goto L13;
        if (((C2461ri) r22.next()).f8673a == false) goto L9;
        r1 = true;
    L13:
        this.f8209g = r1;
        if (r1 != r0) goto L16;
        return;
    L16:
        if (Build.VERSION.SDK_INT < 33) goto L23;
        m4743c(r1);
        return;
    L23:
        return;
    L5:
        if (r2.isEmpty() == false) goto L7;
        goto L7
    }
}
