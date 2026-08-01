package p374zb;

import bsh.C1189h4;
import java.util.ListIterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: zb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9927a implements ListIterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public int f33457q;

    /* JADX INFO: renamed from: r */
    public int f33458r;

    public AbstractC9927a(int i10, int i11) {
        this.f33457q = i10;
        this.f33458r = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: g */
    public final void m38486g() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f33457q < this.f33458r;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f33457q > 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m38487l() {
        if (hasPrevious()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f33457q;
    }

    /* JADX INFO: renamed from: o */
    public final int m38488o() {
        return this.f33457q;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f33457q - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: v */
    public final int m38489v() {
        return this.f33458r;
    }

    /* JADX INFO: renamed from: x */
    public final void m38490x(int i10) {
        this.f33457q = i10;
    }
}
