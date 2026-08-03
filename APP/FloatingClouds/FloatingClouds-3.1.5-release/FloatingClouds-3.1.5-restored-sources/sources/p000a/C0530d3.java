package p000a;

/* JADX INFO: renamed from: a.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0530d3 extends AbstractC0435Y1<C0492b3> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0492b3) {
            return super.contains((C0492b3) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0492b3) {
            return super.indexOf((C0492b3) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0492b3) {
            return super.lastIndexOf((C0492b3) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0492b3) {
            return super.remove((C0492b3) obj);
        }
        return false;
    }
}
