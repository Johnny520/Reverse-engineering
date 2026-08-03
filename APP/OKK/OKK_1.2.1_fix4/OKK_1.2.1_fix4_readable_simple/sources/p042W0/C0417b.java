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
    public int f922a;

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

    public C0417b(C0418c r3) {
        this.f927f = r3;
        this.f922a = -1;
        int r32 = AbstractC0040p.m111p(r3.f929b, 0, r3.f928a.length());
        this.f923b = r32;
        this.f924c = r32;
    }

    /* JADX INFO: renamed from: a */
    public final void m1001a() {
        int r02 = this.f924c;
        int r1 = 0;
        if (r02 >= 0) goto L5;
        this.f922a = 0;
        this.f925d = null;
        return;
    L5:
        C0418c r2 = this.f927f;
        int r3 = r2.f930c;
        CharSequence r5 = r2.f928a;
        if (r3 <= 0) goto L10;
        int r7 = this.f926e + 1;
        this.f926e = r7;
        if (r7 < r3) goto L10;
    L11:
        this.f925d = new C0340c(this.f923b, AbstractC0425j.m1007L0(r5), 1);
        this.f924c = -1;
    L23:
        this.f922a = 1;
        return;
    L10:
        if (r02 > r5.length()) goto L11;
        C0139e r03 = (C0139e) r2.f931d.mo518b(r5, Integer.valueOf(this.f924c));
        if (r03 != null) goto L15;
        this.f925d = new C0340c(this.f923b, AbstractC0425j.m1007L0(r5), 1);
        this.f924c = -1;
        goto L23
    L15:
        int r22 = ((Number) r03.f328a).intValue();
        int r04 = ((Number) r03.f329b).intValue();
        int r32 = this.f923b;
        if (r22 > Integer.MIN_VALUE) goto L18;
        C0340c r33 = C0340c.f664d;
    L19:
        this.f925d = r33;
        int r23 = r22 + r04;
        this.f923b = r23;
        if (r04 != 0) goto L22;
        r1 = 1;
    L22:
        this.f924c = r23 + r1;
        goto L23
    L18:
        r33 = new C0340c(r32, r22 - 1, 1);
        goto L19
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f922a != (-1)) goto L6;
        m1001a();
    L6:
        if (this.f922a == 1) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f922a != (-1)) goto L6;
        m1001a();
    L6:
        if (this.f922a == 0) goto L10;
        C0340c r02 = this.f925d;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f925d = null;
        this.f922a = -1;
        return r02;
    L10:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
