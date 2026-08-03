package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
public abstract class AbstractC0069<E> extends java.util.AbstractList<E> implements java.util.List<E>, Yue.InterfaceC3447 {
    public AbstractC0069() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int r1, E r2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.mo429(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int r1, E r2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.mo428()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract int mo428();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract E mo429(int r1);
}
