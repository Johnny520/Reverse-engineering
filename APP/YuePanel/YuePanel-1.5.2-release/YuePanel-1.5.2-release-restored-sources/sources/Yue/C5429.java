package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5429<T> implements Iterable<C5428<? extends T>>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5122<Iterator<T>> f13332;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5429(@InterfaceC6399 InterfaceC5122<? extends Iterator<? extends T>> interfaceC5122) {
        C5499.m17103(interfaceC5122, "iteratorFactory");
        this.f13332 = interfaceC5122;
    }

    @Override // java.lang.Iterable
    @InterfaceC6399
    public Iterator<C5428<T>> iterator() {
        return new C5430(this.f13332.invoke());
    }
}
