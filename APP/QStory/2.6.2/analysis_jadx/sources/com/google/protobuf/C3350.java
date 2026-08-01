package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3350 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f10993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3349 f10994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Comparable f10995;

    public C3350(C3349 c3349, Comparable comparable, Object obj) {
        this.f10994 = c3349;
        this.f10995 = comparable;
        this.f10993 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10995.compareTo(((C3350) obj).f10995);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f10995;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f10993;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10995;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10993;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f10995;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10993;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10994.m7421();
        Object obj2 = this.f10993;
        this.f10993 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10995 + "=" + this.f10993;
    }
}
