package yyds;

import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲈᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2580 implements Map.Entry {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object f12719;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f12720;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2580 f12721;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2580 f12722;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f12723;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Object f12724;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2580 f12725;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2580 f12726;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2580 f12727;

    public C2580(boolean z, C2580 c2580, Object obj, C2580 c25802, C2580 c25803) {
        this.f12725 = c2580;
        this.f12719 = obj;
        this.f12720 = z;
        this.f12723 = 1;
        this.f12726 = c25802;
        this.f12722 = c25803;
        c25803.f12726 = this;
        c25802.f12722 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f12719;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f12724;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12719;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12724;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f12719;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f12724;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f12720) {
            C0188.m789("value == null");
            return null;
        }
        Object obj2 = this.f12724;
        this.f12724 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f12719 + "=" + this.f12724;
    }

    public C2580(boolean z) {
        this.f12719 = null;
        this.f12720 = z;
        this.f12722 = this;
        this.f12726 = this;
    }
}
