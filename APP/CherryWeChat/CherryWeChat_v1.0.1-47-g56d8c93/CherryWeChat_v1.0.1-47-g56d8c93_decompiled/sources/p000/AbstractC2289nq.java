package p000;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: nq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2289nq {

    /* JADX INFO: renamed from: a */
    public int f8034a;

    /* JADX INFO: renamed from: b */
    public int f8035b;

    /* JADX INFO: renamed from: c */
    public int f8036c;

    /* JADX INFO: renamed from: d */
    public Object f8037d;

    public AbstractC2289nq() {
        if (C1517hw.f5367c == null) {
            C1517hw.f5367c = new C1517hw(20);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m4624a(int i) {
        if (i < this.f8036c) {
            return ((ByteBuffer) this.f8037d).getShort(this.f8035b + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m4625b() {
        if (((C2332oq) this.f8037d).f8188h != this.f8036c) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo2051c(View view);

    /* JADX INFO: renamed from: d */
    public abstract void mo2052d(View view, Object obj);

    /* JADX INFO: renamed from: e */
    public void m4626e() {
        while (true) {
            int i = this.f8034a;
            C2332oq c2332oq = (C2332oq) this.f8037d;
            if (i >= c2332oq.f8186f || c2332oq.f8183c[i] >= 0) {
                return;
            } else {
                this.f8034a = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4627f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f8035b) {
            mo2052d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f8035b) {
            tag = mo2051c(view);
        } else {
            tag = view.getTag(this.f8034a);
            if (!((Class) this.f8037d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo2053g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM4390c = AbstractC2185lE.m4390c(view);
            C0645P c0645p = accessibilityDelegateM4390c == null ? null : accessibilityDelegateM4390c instanceof C0602O ? ((C0602O) accessibilityDelegateM4390c).f1942a : new C0645P(accessibilityDelegateM4390c);
            if (c0645p == null) {
                c0645p = new C0645P();
            }
            AbstractC2185lE.m4399l(view, c0645p);
            view.setTag(this.f8034a, obj);
            AbstractC2185lE.m4393f(view, this.f8036c);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2053g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f8034a < ((C2332oq) this.f8037d).f8186f;
    }

    public void remove() {
        C2332oq c2332oq = (C2332oq) this.f8037d;
        m4625b();
        if (this.f8035b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c2332oq.m4729b();
        c2332oq.m4735h(this.f8035b);
        this.f8035b = -1;
        this.f8036c = c2332oq.f8188h;
    }
}
