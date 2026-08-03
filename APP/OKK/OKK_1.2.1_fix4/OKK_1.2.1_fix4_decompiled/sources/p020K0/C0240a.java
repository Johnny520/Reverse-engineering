package p020K0;

import java.io.Serializable;
import p009E0.AbstractC0175f;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: K0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0240a extends AbstractC0175f implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Enum[] f482a;

    public C0240a(Enum[] enumArr) {
        this.f482a = enumArr;
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        return this.f482a.length;
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        AbstractC0307g.m703e(r4, "element");
        return ((Enum) AbstractC0179j.m537n0(r4.ordinal(), this.f482a)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Enum[] enumArr = this.f482a;
        int length = enumArr.length;
        if (i2 < 0 || i2 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", length));
        }
        return enumArr[i2];
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        AbstractC0307g.m703e(r4, "element");
        int iOrdinal = r4.ordinal();
        if (((Enum) AbstractC0179j.m537n0(iOrdinal, this.f482a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        AbstractC0307g.m703e(r2, "element");
        return indexOf(r2);
    }
}
