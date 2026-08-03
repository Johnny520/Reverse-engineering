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
    public final C0134D4 f8204b = new C0134D4();

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

    public C2335ot(Runnable runnable) {
        this.f8203a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f8206d = i >= 34 ? AbstractC0295Gu.m615h(new C1514ht(0, this), new C1514ht(1, this), new C2115jt(this, 0), new C2115jt(this, 1)) : new C2655w3(1, new C2115jt(this, 2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4741a() {
        Object objPrevious;
        if (this.f8205c == null) {
            C0134D4 c0134d4 = this.f8204b;
            ListIterator<E> listIterator = c0134d4.listIterator(c0134d4.size());
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
        this.f8205c = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4742b() {
        Object objPrevious;
        C2461ri c2461ri = this.f8205c;
        if (c2461ri == null) {
            C0134D4 c0134d4 = this.f8204b;
            c0134d4.getClass();
            ListIterator listIterator = c0134d4.listIterator(c0134d4.f348c);
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
            c2461ri = (C2461ri) objPrevious;
        }
        this.f8205c = null;
        if (c2461ri == null) {
            this.f8203a.run();
            return;
        }
        AbstractC2805zi abstractC2805zi = c2461ri.f8676d;
        abstractC2805zi.m5427y(true);
        if (abstractC2805zi.f9499h.f8673a) {
            abstractC2805zi.m5388O();
        } else {
            abstractC2805zi.f9498g.m4742b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4743c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8207e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f8206d) == null) {
            return;
        }
        if (z && !this.f8208f) {
            AbstractC0988X.m1880f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8208f = true;
        } else {
            if (z || !this.f8208f) {
                return;
            }
            AbstractC0988X.m1881g(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8208f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4744d() {
        boolean z = this.f8209g;
        boolean z2 = false;
        C0134D4 c0134d4 = this.f8204b;
        if (c0134d4 == null || !c0134d4.isEmpty()) {
            Iterator<E> it = c0134d4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C2461ri) it.next()).f8673a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f8209g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m4743c(z2);
    }
}
