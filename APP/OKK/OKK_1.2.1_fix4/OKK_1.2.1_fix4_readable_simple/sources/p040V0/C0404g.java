package p040V0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p026N0.C0268i;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: V0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0404g implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public Object f902a;

    /* JADX INFO: renamed from: b */
    public int f903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0268i f904c;

    public C0404g(C0268i r1) {
        this.f904c = r1;
        this.f903b = -2;
    }

    /* JADX INFO: renamed from: a */
    public final void m989a() {
        int r02 = this.f903b;
        C0268i r2 = this.f904c;
        if (r02 != (-2)) goto L5;
        Object r03 = ((InterfaceC0275a) r2.f562b).invoke();
    L6:
        this.f902a = r03;
        if (r03 != null) goto L9;
        int r04 = 0;
    L10:
        this.f903b = r04;
        return;
    L9:
        r04 = 1;
        goto L10
    L5:
        InterfaceC0286l r05 = (InterfaceC0286l) r2.f563c;
        Object r1 = this.f902a;
        AbstractC0307g.m700b(r1);
        r03 = r05.invoke(r1);
        goto L6
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f903b >= 0) goto L6;
        m989a();
    L6:
        if (this.f903b == 1) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f903b >= 0) goto L6;
        m989a();
    L6:
        if (this.f903b == 0) goto L10;
        Object r02 = this.f902a;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f903b = -1;
        return r02;
    L10:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
