package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l10 implements Map.Entry {
    public final Object a;
    public final Object b;
    public l10 c;
    public l10 d;

    public l10(Object r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof l10) == true) goto L8;
        return false;
    L8:
        l10 r52 = (l10) r5;
        if (this.a.equals(r52.a) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.b.equals(r52.b) == false) goto L13;
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
