package p002a1;

import bsh.C1189h4;
import java.util.ListIterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: a1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010a implements ListIterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public int f9q;

    /* JADX INFO: renamed from: r */
    public int f10r;

    public AbstractC0010a(int i10, int i11) {
        this.f9q = i10;
        this.f10r = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: g */
    public final void m21g() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f9q < this.f10r;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f9q > 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m22l() {
        if (hasPrevious()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f9q;
    }

    /* JADX INFO: renamed from: o */
    public final int m23o() {
        return this.f9q;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f9q - 1;
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
    public final int m24v() {
        return this.f10r;
    }

    /* JADX INFO: renamed from: x */
    public final void m25x(int i10) {
        this.f9q = i10;
    }

    /* JADX INFO: renamed from: y */
    public final void m26y(int i10) {
        this.f10r = i10;
    }
}
