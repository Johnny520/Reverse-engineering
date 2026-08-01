package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛶᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0779 extends java.util.AbstractList implements java.util.List, xhss.InterfaceC0601 {
    public AbstractC0779() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.mo1228(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.mo1230()
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public abstract java.lang.Object mo1228(int r1);

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public abstract int mo1230();
}
