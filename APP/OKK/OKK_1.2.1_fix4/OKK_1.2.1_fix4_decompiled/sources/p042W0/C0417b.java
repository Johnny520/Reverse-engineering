package p042W0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;
import p036T0.C0340c;

/* JADX INFO: renamed from: W0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0417b implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public int f922a = -1;

    /* JADX INFO: renamed from: b */
    public int f923b;

    /* JADX INFO: renamed from: c */
    public int f924c;

    /* JADX INFO: renamed from: d */
    public C0340c f925d;

    /* JADX INFO: renamed from: e */
    public int f926e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0418c f927f;

    public C0417b(C0418c c0418c) {
        this.f927f = c0418c;
        int iM111p = AbstractC0040p.m111p(c0418c.f929b, 0, c0418c.f928a.length());
        this.f923b = iM111p;
        this.f924c = iM111p;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1001a() {
        int i2 = this.f924c;
        if (i2 < 0) {
            this.f922a = 0;
            this.f925d = null;
            return;
        }
        C0418c c0418c = this.f927f;
        int i3 = c0418c.f930c;
        CharSequence charSequence = c0418c.f928a;
        if (i3 > 0) {
            int i4 = this.f926e + 1;
            this.f926e = i4;
            if (i4 < i3) {
                if (i2 > charSequence.length()) {
                    this.f925d = new C0340c(this.f923b, AbstractC0425j.m1007L0(charSequence), 1);
                    this.f924c = -1;
                } else {
                    C0139e c0139e = (C0139e) c0418c.f931d.mo518b(charSequence, Integer.valueOf(this.f924c));
                    if (c0139e == null) {
                        this.f925d = new C0340c(this.f923b, AbstractC0425j.m1007L0(charSequence), 1);
                        this.f924c = -1;
                    } else {
                        int iIntValue = ((Number) c0139e.f328a).intValue();
                        int iIntValue2 = ((Number) c0139e.f329b).intValue();
                        this.f925d = iIntValue <= Integer.MIN_VALUE ? C0340c.f664d : new C0340c(this.f923b, iIntValue - 1, 1);
                        int i5 = iIntValue + iIntValue2;
                        this.f923b = i5;
                        this.f924c = i5 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        this.f922a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f922a == -1) {
            m1001a();
        }
        return this.f922a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f922a == -1) {
            m1001a();
        }
        if (this.f922a == 0) {
            throw new NoSuchElementException();
        }
        C0340c c0340c = this.f925d;
        AbstractC0307g.m701c(c0340c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f925d = null;
        this.f922a = -1;
        return c0340c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
