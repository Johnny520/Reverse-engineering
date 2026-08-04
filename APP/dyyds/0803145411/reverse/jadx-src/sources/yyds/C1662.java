package yyds;

import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᛷᲇᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1662 extends AbstractC1311 implements RandomAccess {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2534[] f8465;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int[] f8466;

    public C1662(C2534[] c2534Arr, int[] iArr) {
        this.f8465 = c2534Arr;
        this.f8466 = iArr;
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C2534) {
            return super.contains((C2534) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f8465[i];
    }

    @Override // yyds.AbstractC1311, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C2534) {
            return super.indexOf((C2534) obj);
        }
        return -1;
    }

    @Override // yyds.AbstractC1311, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C2534) {
            return super.lastIndexOf((C2534) obj);
        }
        return -1;
    }

    @Override // yyds.AbstractC0280
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo927() {
        return this.f8465.length;
    }
}
