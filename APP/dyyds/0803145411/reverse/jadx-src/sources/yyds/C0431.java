package yyds;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᛲᲀᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0431 extends AbstractC1311 implements RandomAccess {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f2187;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC1311 f2188;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2189;

    public C0431(AbstractC1311 abstractC1311, int i, int i2) {
        this.f2188 = abstractC1311;
        this.f2189 = i;
        AbstractC1960.m3783(i, i2, abstractC1311.mo927());
        this.f2187 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f2187;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return this.f2188.get(this.f2189 + i);
    }

    @Override // yyds.AbstractC1311, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1960.m3783(i, i2, this.f2187);
        int i3 = this.f2189;
        return new C0431(this.f2188, i + i3, i3 + i2);
    }

    @Override // yyds.AbstractC0280
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo927() {
        return this.f2187;
    }
}
