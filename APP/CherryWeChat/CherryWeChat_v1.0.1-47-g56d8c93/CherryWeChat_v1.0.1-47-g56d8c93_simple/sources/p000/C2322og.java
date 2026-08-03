package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: og */
/* JADX INFO: loaded from: classes.dex */
public final class C2322og extends AbstractC0000A implements InterfaceC2279ng, Serializable {

    /* JADX INFO: renamed from: a */
    public final Enum[] f8168a;

    public C2322og(Enum[] r1) {
        this.f8168a = r1;
    }

    @Override // p000.AbstractC0000A
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f8168a.length;
    }

    @Override // p000.AbstractC0000A, java.util.List, java.util.Collection
    public final boolean contains(Object r4) {
        if ((r4 instanceof Enum) == false) goto L16;
        Enum r42 = (Enum) r4;
        int r0 = r42.ordinal();
        if (r0 < 0) goto L10;
        Enum[] r1 = this.f8168a;
        if (r0 >= r1.length) goto L10;
        Enum r02 = r1[r0];
    L11:
        if (r02 != r42) goto L14;
        return true;
    L14:
        return false;
    L10:
        r02 = null;
        goto L11
    L16:
        return false;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        Enum[] r0 = this.f8168a;
        int r1 = r0.length;
        if (r5 < 0) goto L8;
        if (r5 >= r1) goto L8;
        return r0[r5];
    L8:
        throw new IndexOutOfBoundsException("index: " + r5 + ", size: " + r1);
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r52 = (Enum) r5;
        int r0 = r52.ordinal();
        if (r0 < 0) goto L10;
        Enum[] r2 = this.f8168a;
        if (r0 >= r2.length) goto L10;
        Enum r22 = r2[r0];
    L11:
        if (r22 != r52) goto L13;
        return r0;
    L13:
        return -1;
    L10:
        r22 = null;
        goto L11
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final int lastIndexOf(Object r5) {
        if ((r5 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r52 = (Enum) r5;
        int r0 = r52.ordinal();
        if (r0 < 0) goto L10;
        Enum[] r2 = this.f8168a;
        if (r0 >= r2.length) goto L10;
        Enum r22 = r2[r0];
    L11:
        if (r22 != r52) goto L13;
        return r0;
    L13:
        return -1;
    L10:
        r22 = null;
        goto L11
    }
}
