package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: rd */
/* JADX INFO: loaded from: classes.dex */
public final class C2456rd implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f8650a;

    /* JADX INFO: renamed from: b */
    public int f8651b;

    /* JADX INFO: renamed from: c */
    public int f8652c;

    /* JADX INFO: renamed from: d */
    public C0286Gl f8653d;

    /* JADX INFO: renamed from: e */
    public int f8654e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2499sd f8655f;

    public C2456rd(C2499sd r2) {
        this.f8655f = r2;
        this.f8650a = -1;
        int r22 = AbstractC0828TB.m1639f(0, ((CharSequence) r2.f8787d).length());
        this.f8651b = r22;
        this.f8652c = r22;
    }

    /* JADX INFO: renamed from: a */
    public final void m4947a() {
        int r0 = this.f8652c;
        int r1 = 0;
        if (r0 >= 0) goto L6;
        this.f8650a = 0;
        this.f8653d = null;
        return;
    L6:
        C2499sd r2 = this.f8655f;
        int r3 = r2.f8785b;
        if (r3 <= 0) goto L11;
        int r6 = this.f8654e + 1;
        this.f8654e = r6;
        if (r6 < r3) goto L11;
    L12:
        this.f8653d = new C0286Gl(this.f8651b, AbstractC2564tz.m5053N((CharSequence) r2.f8787d), 1);
        this.f8652c = -1;
    L20:
        this.f8650a = 1;
        return;
    L11:
        if (r0 > ((CharSequence) r2.f8787d).length()) goto L12;
        C0208Et r02 = (C0208Et) r2.f8786c.mo446d((CharSequence) r2.f8787d, Integer.valueOf(this.f8652c));
        if (r02 != null) goto L16;
        this.f8653d = new C0286Gl(this.f8651b, AbstractC2564tz.m5053N((CharSequence) r2.f8787d), 1);
        this.f8652c = -1;
        goto L20
    L16:
        int r22 = ((Number) r02.f613a).intValue();
        int r03 = ((Number) r02.f614b).intValue();
        this.f8653d = AbstractC0828TB.m1632J(this.f8651b, r22);
        int r23 = r22 + r03;
        this.f8651b = r23;
        if (r03 != 0) goto L19;
        r1 = 1;
    L19:
        this.f8652c = r23 + r1;
        goto L20
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8650a != (-1)) goto L6;
        m4947a();
    L6:
        if (this.f8650a != 1) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8650a != (-1)) goto L6;
        m4947a();
    L6:
        if (this.f8650a == 0) goto L10;
        C0286Gl r0 = this.f8653d;
        this.f8653d = null;
        this.f8650a = -1;
        return r0;
    L10:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
