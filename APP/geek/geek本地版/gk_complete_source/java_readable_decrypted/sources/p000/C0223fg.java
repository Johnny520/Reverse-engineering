package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: fg */
/* JADX INFO: loaded from: classes.dex */
public final class C0223fg implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f1960a = -1;

    /* JADX INFO: renamed from: b */
    public int f1961b;

    /* JADX INFO: renamed from: c */
    public int f1962c;

    /* JADX INFO: renamed from: d */
    public C0306hp f1963d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0260gg f1964e;

    public C0223fg(C0260gg c0260gg) {
        this.f1964e = c0260gg;
        int iM1304e = AbstractC0273gt.m1304e(0, ((CharSequence) c0260gg.f2125b).length());
        this.f1961b = iM1304e;
        this.f1962c = iM1304e;
    }

    /* JADX INFO: renamed from: a */
    public final void m1211a() {
        C0427kx c0427kx;
        C0260gg c0260gg = this.f1964e;
        CharSequence charSequence = (CharSequence) c0260gg.f2125b;
        int i = this.f1962c;
        if (i < 0) {
            this.f1960a = 0;
            this.f1963d = null;
            return;
        }
        if (i <= charSequence.length() && (c0427kx = (C0427kx) ((C0559oh) c0260gg.f2126c).mo472e(charSequence, Integer.valueOf(this.f1962c))) != null) {
            int iIntValue = ((Number) c0427kx.f2976a).intValue();
            int iIntValue2 = ((Number) c0427kx.f2977b).intValue();
            this.f1963d = iIntValue <= Integer.MIN_VALUE ? C0306hp.f2295d : new C0306hp(this.f1961b, iIntValue - 1, 1);
            int i2 = iIntValue + iIntValue2;
            this.f1961b = i2;
            this.f1962c = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f1963d = new C0306hp(this.f1961b, b50.m518D(charSequence), 1);
            this.f1962c = -1;
        }
        this.f1960a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1960a == -1) {
            m1211a();
        }
        return this.f1960a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1960a == -1) {
            m1211a();
        }
        if (this.f1960a == 0) {
            throw new NoSuchElementException();
        }
        C0306hp c0306hp = this.f1963d;
        AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.ranges.IntRange", c0306hp);
        this.f1963d = null;
        this.f1960a = -1;
        return c0306hp;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
