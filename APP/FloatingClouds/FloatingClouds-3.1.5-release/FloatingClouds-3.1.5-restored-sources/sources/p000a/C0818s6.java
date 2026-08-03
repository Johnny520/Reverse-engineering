package p000a;

/* JADX INFO: renamed from: a.s6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0818s6 extends AbstractC0435Y1<C0799r6> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0799r6) {
            return super.contains((C0799r6) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0799r6) {
            return super.indexOf((C0799r6) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0799r6) {
            return super.lastIndexOf((C0799r6) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0799r6) {
            return super.remove((C0799r6) obj);
        }
        return false;
    }
}
