package p000a;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: renamed from: a.e6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0552e6<T extends Enum<T>> extends AbstractC0887w<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final T[] f2042a;

    public C0552e6(T[] tArr) {
        this.f2042a = tArr;
    }

    @Override // p000a.AbstractC0849u
    /* JADX INFO: renamed from: a */
    public final int mo1328a() {
        return this.f2042a.length;
    }

    @Override // p000a.AbstractC0849u, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        C0631i9.m1482e(r4, "element");
        T[] tArr = this.f2042a;
        int iOrdinal = r4.ordinal();
        return ((iOrdinal < 0 || iOrdinal >= tArr.length) ? null : tArr[iOrdinal]) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.f2042a;
        int length = tArr.length;
        if (i >= 0 && i < length) {
            return tArr[i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + length);
    }

    @Override // p000a.AbstractC0887w, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        C0631i9.m1482e(r4, "element");
        int iOrdinal = r4.ordinal();
        T[] tArr = this.f2042a;
        if (((iOrdinal < 0 || iOrdinal >= tArr.length) ? null : tArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000a.AbstractC0887w, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        C0631i9.m1482e(r2, "element");
        return indexOf(r2);
    }
}
