package p000;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yf0 extends AbstractC0832w2 implements xf0, RandomAccess, Serializable {

    /* JADX INFO: renamed from: h */
    public final Enum[] f13433h;

    public yf0(Enum[] enumArr) {
        this.f13433h = enumArr;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f13433h.length;
    }

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) AbstractC0460mg.m3099n0(r2.ordinal(), this.f13433h)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f13433h;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", length));
        return null;
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC0460mg.m3099n0(iOrdinal, this.f13433h)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC0460mg.m3099n0(iOrdinal, this.f13433h)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
