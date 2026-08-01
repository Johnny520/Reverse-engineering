package p254v4;

/* JADX INFO: renamed from: v4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3366m extends AbstractC3358e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10455d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [v4.f.a():java.lang.Object, v4.g.a():java.lang.Object] */
    public /* synthetic */ C3366m(int i5) {
        this.f10455d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.f10455d) {
            case 0:
                if (obj instanceof C3365l) {
                    return super.contains((C3365l) obj);
                }
                return false;
            default:
                if (obj instanceof C3368o) {
                    return super.contains((C3368o) obj);
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.f10455d) {
            case 0:
                if (obj instanceof C3365l) {
                    return super.indexOf((C3365l) obj);
                }
                return -1;
            default:
                if (obj instanceof C3368o) {
                    return super.indexOf((C3368o) obj);
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f10455d) {
            case 0:
                if (obj instanceof C3365l) {
                    return super.lastIndexOf((C3365l) obj);
                }
                return -1;
            default:
                if (obj instanceof C3368o) {
                    return super.lastIndexOf((C3368o) obj);
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        switch (this.f10455d) {
            case 0:
                if (obj instanceof C3365l) {
                    return super.remove((C3365l) obj);
                }
                return false;
            default:
                if (obj instanceof C3368o) {
                    return super.remove((C3368o) obj);
                }
                return false;
        }
    }
}
