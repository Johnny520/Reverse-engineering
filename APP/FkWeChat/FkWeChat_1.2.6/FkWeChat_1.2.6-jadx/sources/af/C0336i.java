package af;

/* JADX INFO: renamed from: af.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0336i extends AbstractC0332e {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0335h) {
            return m1056h((C0335h) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public /* bridge */ boolean m1056h(C0335h c0335h) {
        return super.contains(c0335h);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0335h) {
            return m1057l((C0335h) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public /* bridge */ int m1057l(C0335h c0335h) {
        return super.indexOf(c0335h);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0335h) {
            return m1058o((C0335h) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public /* bridge */ int m1058o(C0335h c0335h) {
        return super.lastIndexOf(c0335h);
    }

    /* JADX INFO: renamed from: p */
    public /* bridge */ boolean m1059p(C0335h c0335h) {
        return super.remove(c0335h);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0335h) {
            return m1059p((C0335h) obj);
        }
        return false;
    }
}
