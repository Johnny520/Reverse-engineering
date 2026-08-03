package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4491 implements Iterator<Double>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(mo469());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Double m1420() {
        return Double.valueOf(mo469());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract double mo469();
}
