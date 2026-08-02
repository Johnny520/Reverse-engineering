package p000;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 extends AbstractC0832w2 implements RandomAccess {

    /* JADX INFO: renamed from: h */
    public final C0505no[] f7344h;

    /* JADX INFO: renamed from: i */
    public final int[] f7345i;

    public nv1(C0505no[] c0505noArr, int[] iArr) {
        this.f7344h = c0505noArr;
        this.f7345i = iArr;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f7344h.length;
    }

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0505no) {
            return super.contains((C0505no) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f7344h[i];
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0505no) {
            return super.indexOf((C0505no) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0505no) {
            return super.lastIndexOf((C0505no) obj);
        }
        return -1;
    }
}
