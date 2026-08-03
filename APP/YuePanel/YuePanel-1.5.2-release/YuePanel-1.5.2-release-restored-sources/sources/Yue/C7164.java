package Yue;

import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥۡۦۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164<T> implements Comparator<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Comparator<T> f21578;

    public C7164(@InterfaceC6399 Comparator<T> comparator) {
        C5499.m17103(comparator, "comparator");
        this.f21578 = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.f21578.compare(t2, t);
    }

    @Override // java.util.Comparator
    @InterfaceC6399
    public final Comparator<T> reversed() {
        return this.f21578;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Comparator<T> m3451() {
        return this.f21578;
    }
}
