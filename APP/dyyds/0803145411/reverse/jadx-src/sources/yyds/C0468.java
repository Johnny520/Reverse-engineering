package yyds;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᛲᲁᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0468 extends AbstractC1311 implements InterfaceC0318, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Enum[] f2326;

    public C0468(Enum[] enumArr) {
        this.f2326 = enumArr;
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) AbstractC2070.m3931(r2.ordinal(), this.f2326)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f2326;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // yyds.AbstractC1311, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC2070.m3931(iOrdinal, this.f2326)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // yyds.AbstractC1311, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC2070.m3931(iOrdinal, this.f2326)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // yyds.AbstractC0280
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo927() {
        return this.f2326.length;
    }
}
