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

    public C0240a(Enum[] r1) {
        this.f482a = r1;
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        return this.f482a.length;
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public final boolean contains(Object r4) {
        if ((r4 instanceof Enum) == true) goto L5;
        return false;
    L5:
        Enum r42 = (Enum) r4;
        AbstractC0307g.m703e(r42, "element");
        Enum[] r02 = this.f482a;
        if (((Enum) AbstractC0179j.m537n0(r42.ordinal(), r02)) != r42) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        Enum[] r02 = this.f482a;
        int r1 = r02.length;
        if (r5 < 0) goto L8;
        if (r5 >= r1) goto L8;
        return r02[r5];
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r1));
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public final int indexOf(Object r4) {
        if ((r4 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r42 = (Enum) r4;
        AbstractC0307g.m703e(r42, "element");
        int r02 = r42.ordinal();
        if (((Enum) AbstractC0179j.m537n0(r02, this.f482a)) == r42) goto L8;
        return -1;
    L8:
        return r02;
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public final int lastIndexOf(Object r2) {
        if ((r2 instanceof Enum) == true) goto L6;
        return -1;
    L6:
        Enum r22 = (Enum) r2;
        AbstractC0307g.m703e(r22, "element");
        return indexOf(r22);
    }
}
