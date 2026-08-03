package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4883 implements Iterator<Float>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(mo470());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Float m1795() {
        return Float.valueOf(mo470());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract float mo470();
}
