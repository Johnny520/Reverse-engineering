package p000;

/* JADX INFO: renamed from: D9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0139D9 extends AbstractC2657w5 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0096C9) {
            return super.contains((C0096C9) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0096C9) {
            return super.indexOf((C0096C9) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0096C9) {
            return super.lastIndexOf((C0096C9) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0096C9) {
            return super.remove((C0096C9) obj);
        }
        return false;
    }
}
