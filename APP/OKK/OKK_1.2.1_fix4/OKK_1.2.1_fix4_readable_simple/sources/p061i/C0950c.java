package p061i;

import java.util.Map;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0950c implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f3369a;

    /* JADX INFO: renamed from: b */
    public final Object f3370b;

    /* JADX INFO: renamed from: c */
    public C0950c f3371c;

    /* JADX INFO: renamed from: d */
    public C0950c f3372d;

    public C0950c(Object r1, Object r2) {
        this.f3369a = r1;
        this.f3370b = r2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0950c) == true) goto L8;
        return false;
    L8:
        C0950c r52 = (C0950c) r5;
        Object r1 = r52.f3369a;
        if (this.f3369a.equals(r1) == false) goto L14;
        if (this.f3370b.equals(r52.f3370b) == false) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3369a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3370b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3369a.hashCode() ^ this.f3370b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3369a + "=" + this.f3370b;
    }
}
