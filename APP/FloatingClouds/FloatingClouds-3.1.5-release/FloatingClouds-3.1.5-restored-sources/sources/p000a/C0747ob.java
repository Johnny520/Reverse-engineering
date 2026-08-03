package p000a;

/* JADX INFO: renamed from: a.ob */
/* JADX INFO: loaded from: classes.dex */
public final class C0747ob extends AbstractC0435Y1<C0690lb> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0690lb) {
            return super.contains((C0690lb) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0690lb) {
            return super.indexOf((C0690lb) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0690lb) {
            return super.lastIndexOf((C0690lb) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0690lb) {
            return super.remove((C0690lb) obj);
        }
        return false;
    }
}
