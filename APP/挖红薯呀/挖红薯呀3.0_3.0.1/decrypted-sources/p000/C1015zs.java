package p000;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: zs */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1015zs extends AbstractC0945y implements InterfaceC0974ys, RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public final Enum[] f7990d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1015zs(Enum[] enumArr) {
        this.f7990d = enumArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        return this.f7990d.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) AbstractC0201f9.m1065k0(r2.ordinal(), this.f7990d)) == r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f7990d;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, length, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC0201f9.m1065k0(iOrdinal, this.f7990d)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC0201f9.m1065k0(iOrdinal, this.f7990d)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
