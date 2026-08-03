package Yue;

import java.util.Map.Entry;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0067<E extends java.util.Map.Entry<? extends K, ? extends V>, K, V> extends Yue.AbstractC0071<E> {
    public AbstractC0067() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.m424(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.mo426(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m424(@Yue.InterfaceC4418 E r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = r1.mo425(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract boolean mo425(@Yue.InterfaceC4418 java.util.Map.Entry<? extends K, ? extends V> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public /* bridge */ boolean mo426(java.util.Map.Entry<?, ?> r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }
}
