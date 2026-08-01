package p000;

/* JADX INFO: renamed from: ω */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1101 extends java.util.AbstractList implements java.util.List, p000.no0 {
    public AbstractC1101() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.mo4828(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.mo4827()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public abstract int mo4827();

    /* JADX INFO: renamed from: β */
    public abstract java.lang.Object mo4828(int r1);
}
