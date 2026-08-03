package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: og */
/* JADX INFO: loaded from: classes.dex */
public final class C2322og extends AbstractC0000A implements InterfaceC2279ng, Serializable {

    /* JADX INFO: renamed from: a */
    public final Enum[] f8168a;

    public C2322og(Enum[] enumArr) {
        this.f8168a = enumArr;
    }

    @Override // p000.AbstractC0000A
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f8168a.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // p000.AbstractC0000A, java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f8168a;
            r0 = iOrdinal < enumArr.length ? enumArr[iOrdinal] : null;
        }
        return r0 == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f8168a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + length);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // p000.AbstractC0000A, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f8168a;
            r2 = iOrdinal < enumArr.length ? enumArr[iOrdinal] : null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // p000.AbstractC0000A, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f8168a;
            r2 = iOrdinal < enumArr.length ? enumArr[iOrdinal] : null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }
}
