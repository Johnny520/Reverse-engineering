package com.google.gson.internal;

import bsh.C2632;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3236 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3236 f10895;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C3236 f10896;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object f10897;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10898;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f10899;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f10900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3236 f10901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3236 f10902;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3236 f10903;

    public C3236(boolean z, C3236 c3236, Object obj, C3236 c32362, C3236 c32363) {
        this.f10903 = c3236;
        this.f10899 = obj;
        this.f10900 = z;
        this.f10898 = 1;
        this.f10896 = c32362;
        this.f10895 = c32363;
        c32363.f10896 = this;
        c32362.f10895 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f10899;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f10897;
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
        return this.f10899;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10897;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f10899;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10897;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f10900) {
            C2632.m5298("value == null");
            return null;
        }
        Object obj2 = this.f10897;
        this.f10897 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10899 + "=" + this.f10897;
    }

    public C3236(boolean z) {
        this.f10899 = null;
        this.f10900 = z;
        this.f10895 = this;
        this.f10896 = this;
    }
}
