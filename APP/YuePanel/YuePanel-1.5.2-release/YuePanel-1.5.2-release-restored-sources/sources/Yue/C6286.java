package Yue;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6286<E> extends AbstractC2986<E> implements RandomAccess {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<E> f15825;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f15826;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f15827;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends E> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6286(@InterfaceC6399 List<? extends E> list) {
        C5499.m17103(list, "list");
        this.f15825 = list;
    }

    @Override // Yue.AbstractC2986, java.util.List
    public E get(int i) {
        AbstractC2986.f4328.m52(i, this.f15827);
        return this.f15825.get(this.f15826 + i);
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979
    /* JADX INFO: renamed from: ۥ */
    public int mo41() {
        return this.f15827;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2760(int i, int i2) {
        AbstractC2986.f4328.m5792(i, i2, this.f15825.size());
        this.f15826 = i;
        this.f15827 = i2 - i;
    }
}
