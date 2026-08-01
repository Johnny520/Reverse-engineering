package p089R2;

import java.io.Serializable;
import java.util.RandomAccess;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0965e;
import p061L2.AbstractC0972l;

/* JADX INFO: renamed from: R2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1227b extends AbstractC0965e implements InterfaceC1226a, RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public final Enum[] f4094d;

    public C1227b(Enum[] enumArr) {
        this.f4094d = enumArr;
    }

    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f4094d.length;
    }

    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) AbstractC0972l.m2003a0(r4.ordinal(), this.f4094d)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Enum[] enumArr = this.f4094d;
        int length = enumArr.length;
        if (i5 < 0 || i5 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", length));
        }
        return enumArr[i5];
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) AbstractC0972l.m2003a0(iOrdinal, this.f4094d)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) AbstractC0972l.m2003a0(iOrdinal, this.f4094d)) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}
