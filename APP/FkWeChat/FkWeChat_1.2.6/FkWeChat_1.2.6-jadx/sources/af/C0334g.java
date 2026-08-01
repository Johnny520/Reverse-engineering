package af;

/* JADX INFO: renamed from: af.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0334g extends AbstractC0332e {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0333f) {
            return m1035h((C0333f) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public /* bridge */ boolean m1035h(C0333f c0333f) {
        return super.contains(c0333f);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0333f) {
            return m1036l((C0333f) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public /* bridge */ int m1036l(C0333f c0333f) {
        return super.indexOf(c0333f);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0333f) {
            return m1037o((C0333f) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public /* bridge */ int m1037o(C0333f c0333f) {
        return super.lastIndexOf(c0333f);
    }

    /* JADX INFO: renamed from: p */
    public /* bridge */ boolean m1038p(C0333f c0333f) {
        return super.remove(c0333f);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0333f) {
            return m1038p((C0333f) obj);
        }
        return false;
    }
}
