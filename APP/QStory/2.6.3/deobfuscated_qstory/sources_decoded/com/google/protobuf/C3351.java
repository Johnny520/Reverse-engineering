package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3351 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f10998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3350 f10999;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Comparable f11000;

    public C3351(C3350 c3350, Comparable comparable, Object obj) {
        this.f10999 = c3350;
        this.f11000 = comparable;
        this.f10998 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11000.compareTo(((C3351) obj).f11000);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f11000;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f10998;
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
        return this.f11000;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10998;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11000;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10998;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10999.m7408();
        Object obj2 = this.f10998;
        this.f10998 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f11000 + "=" + this.f10998;
    }
}
