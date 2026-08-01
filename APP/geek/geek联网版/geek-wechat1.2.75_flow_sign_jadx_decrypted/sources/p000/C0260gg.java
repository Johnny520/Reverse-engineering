package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gg */
/* JADX INFO: loaded from: classes.dex */
public final class C0260gg implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f1980a = -1;

    /* JADX INFO: renamed from: b */
    public int f1981b;

    /* JADX INFO: renamed from: c */
    public int f1982c;

    /* JADX INFO: renamed from: d */
    public C0456lp f1983d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0297hg f1984e;

    public C0260gg(C0297hg c0297hg) {
        this.f1984e = c0297hg;
        int iM1620e = AbstractC0387ju.m1620e(0, ((CharSequence) c0297hg.f2222b).length());
        this.f1981b = iM1620e;
        this.f1982c = iM1620e;
    }

    /* JADX INFO: renamed from: a */
    public final void m1274a() {
        C0723sx c0723sx;
        C0297hg c0297hg = this.f1984e;
        CharSequence charSequence = (CharSequence) c0297hg.f2222b;
        int i = this.f1982c;
        if (i < 0) {
            this.f1980a = 0;
            this.f1983d = null;
            return;
        }
        if (i <= charSequence.length() && (c0723sx = (C0723sx) ((C0633qh) c0297hg.f2223c).mo36e(charSequence, Integer.valueOf(this.f1982c))) != null) {
            int iIntValue = ((Number) c0723sx.f4373a).intValue();
            int iIntValue2 = ((Number) c0723sx.f4374b).intValue();
            this.f1983d = iIntValue <= Integer.MIN_VALUE ? C0456lp.f3038d : new C0456lp(this.f1981b, iIntValue - 1, 1);
            int i2 = iIntValue + iIntValue2;
            this.f1981b = i2;
            this.f1982c = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f1983d = new C0456lp(this.f1981b, i50.m1459B(charSequence), 1);
            this.f1982c = -1;
        }
        this.f1980a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1980a == -1) {
            m1274a();
        }
        return this.f1980a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1980a == -1) {
            m1274a();
        }
        if (this.f1980a == 0) {
            throw new NoSuchElementException();
        }
        C0456lp c0456lp = this.f1983d;
        AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.ranges.IntRange", c0456lp);
        this.f1983d = null;
        this.f1980a = -1;
        return c0456lp;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
