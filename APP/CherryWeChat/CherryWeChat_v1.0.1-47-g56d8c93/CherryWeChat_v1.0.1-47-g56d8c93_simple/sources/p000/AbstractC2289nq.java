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
        if (C1517hw.f5367c != null) goto L6;
        C1517hw.f5367c = new C1517hw(20);
        return;
    }

    /* JADX INFO: renamed from: a */
    public int m4624a(int r3) {
        if (r3 < this.f8036c) goto L5;
        return 0;
    L5:
        return ((ByteBuffer) this.f8037d).getShort(this.f8035b + r3);
    }

    /* JADX INFO: renamed from: b */
    public void m4625b() {
        if (((C2332oq) this.f8037d).f8188h != this.f8036c) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo2051c(View r1);

    /* JADX INFO: renamed from: d */
    public abstract void mo2052d(View r1, Object r2);

    /* JADX INFO: renamed from: e */
    public void m4626e() {
    L2:
        int r0 = this.f8034a;
        C2332oq r1 = (C2332oq) this.f8037d;
        if (r0 >= r1.f8186f) goto L7;
        if (r1.f8183c[r0] >= 0) goto L10;
        this.f8034a = r0 + 1;
        goto L2
    L10:
        return;
    }

    /* JADX INFO: renamed from: f */
    public void m4627f(View r3, Object r4) {
        if (Build.VERSION.SDK_INT < this.f8035b) goto L7;
        mo2052d(r3, r4);
        return;
    L7:
        if (Build.VERSION.SDK_INT < this.f8035b) goto L9;
        Object r0 = mo2051c(r3);
    L14:
        if (mo2053g(r0, r4) == false) goto L26;
        View.AccessibilityDelegate r02 = AbstractC2185lE.m4390c(r3);
        if (r02 != null) goto L19;
        C0645P r03 = null;
    L22:
        if (r03 != null) goto L24;
        r03 = new C0645P();
    L24:
        AbstractC2185lE.m4399l(r3, r03);
        r3.setTag(this.f8034a, r4);
        AbstractC2185lE.m4393f(r3, this.f8036c);
        return;
    L19:
        if ((r02 instanceof C0602O) == false) goto L21;
        r03 = ((C0602O) r02).f1942a;
        goto L22
    L21:
        r03 = new C0645P(r02);
        goto L22
    L26:
        return;
    L9:
        r0 = r3.getTag(this.f8034a);
        if (((Class) this.f8037d).isInstance(r0) == true) goto L14;
        r0 = null;
        goto L14
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2053g(Object r1, Object r2);

    public boolean hasNext() {
        if (this.f8034a >= ((C2332oq) this.f8037d).f8186f) goto L6;
        return true;
    L6:
        return false;
    }

    public void remove() {
        C2332oq r0 = (C2332oq) this.f8037d;
        m4625b();
        if (this.f8035b == (-1)) goto L7;
        r0.m4729b();
        r0.m4735h(this.f8035b);
        this.f8035b = -1;
        this.f8036c = r0.f8188h;
        return;
    L7:
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
