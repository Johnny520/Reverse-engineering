package af;

/* JADX INFO: renamed from: af.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0339l extends AbstractC0332e {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0338k) {
            return m1086h((C0338k) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public /* bridge */ boolean m1086h(C0338k c0338k) {
        return super.contains(c0338k);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0338k) {
            return m1087l((C0338k) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public /* bridge */ int m1087l(C0338k c0338k) {
        return super.indexOf(c0338k);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0338k) {
            return m1088o((C0338k) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public /* bridge */ int m1088o(C0338k c0338k) {
        return super.lastIndexOf(c0338k);
    }

    /* JADX INFO: renamed from: p */
    public /* bridge */ boolean m1089p(C0338k c0338k) {
        return super.remove(c0338k);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0338k) {
            return m1089p((C0338k) obj);
        }
        return false;
    }
}
