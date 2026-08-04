package yyds;

import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲈᛱᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2598 implements Map.Entry {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2598 f12793;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f12794;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2598 f12795;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f12796;

    public C2598(Object obj, Object obj2) {
        this.f12794 = obj;
        this.f12796 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2598)) {
            return false;
        }
        C2598 c2598 = (C2598) obj;
        return this.f12794.equals(c2598.f12794) && this.f12796.equals(c2598.f12796);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12794;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12796;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12796.hashCode() ^ this.f12794.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12794 + "=" + this.f12796;
    }
}
