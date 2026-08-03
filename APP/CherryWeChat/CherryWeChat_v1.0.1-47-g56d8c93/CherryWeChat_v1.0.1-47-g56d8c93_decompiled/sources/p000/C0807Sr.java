package p000;

/* JADX INFO: renamed from: Sr */
/* JADX INFO: loaded from: classes.dex */
public final class C0807Sr extends AbstractC2657w5 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0764Rr) {
            return super.contains((C0764Rr) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0764Rr) {
            return super.indexOf((C0764Rr) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0764Rr) {
            return super.lastIndexOf((C0764Rr) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0764Rr) {
            return super.remove((C0764Rr) obj);
        }
        return false;
    }
}
