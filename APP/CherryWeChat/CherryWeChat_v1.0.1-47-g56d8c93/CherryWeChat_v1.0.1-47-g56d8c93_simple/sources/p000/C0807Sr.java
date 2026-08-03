package p000;

/* JADX INFO: renamed from: Sr */
/* JADX INFO: loaded from: classes.dex */
public final class C0807Sr extends AbstractC2657w5 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof C0764Rr) == true) goto L7;
        return false;
    L7:
        return super.contains((C0764Rr) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof C0764Rr) == true) goto L7;
        return -1;
    L7:
        return super.indexOf((C0764Rr) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof C0764Rr) == true) goto L7;
        return -1;
    L7:
        return super.lastIndexOf((C0764Rr) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof C0764Rr) == true) goto L7;
        return false;
    L7:
        return super.remove((C0764Rr) r2);
    }
}
