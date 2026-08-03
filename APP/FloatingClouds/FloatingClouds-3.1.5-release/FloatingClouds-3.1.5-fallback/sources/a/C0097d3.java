package a;

/* JADX INFO: renamed from: a.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097d3 extends a.Y1<a.C0060b3> {
    public C0097d3() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0060b3
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            a.b3 r2 = (a.C0060b3) r2
            boolean r2 = super.contains(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0060b3
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            a.b3 r2 = (a.C0060b3) r2
            int r2 = super.indexOf(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0060b3
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            a.b3 r2 = (a.C0060b3) r2
            int r2 = super.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0060b3
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            a.b3 r2 = (a.C0060b3) r2
            boolean r2 = super.remove(r2)
            return r2
    }
}
