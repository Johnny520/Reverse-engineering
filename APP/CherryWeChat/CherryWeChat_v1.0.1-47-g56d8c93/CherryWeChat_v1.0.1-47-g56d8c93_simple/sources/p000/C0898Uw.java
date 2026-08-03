package p000;

import java.util.Map;

/* JADX INFO: renamed from: Uw */
/* JADX INFO: loaded from: classes.dex */
public final class C0898Uw implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f2791a;

    /* JADX INFO: renamed from: b */
    public final Object f2792b;

    /* JADX INFO: renamed from: c */
    public C0898Uw f2793c;

    /* JADX INFO: renamed from: d */
    public C0898Uw f2794d;

    public C0898Uw(Object r1, Object r2) {
        this.f2791a = r1;
        this.f2792b = r2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0898Uw) == true) goto L8;
        return false;
    L8:
        C0898Uw r52 = (C0898Uw) r5;
        if (this.f2791a.equals(r52.f2791a) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.f2792b.equals(r52.f2792b) == false) goto L13;
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2791a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2792b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2791a.hashCode() ^ this.f2792b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2791a + "=" + this.f2792b;
    }
}
