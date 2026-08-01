package com.google.gson.internal;

import bsh.C3466;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4069 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C4069 f11245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C4069 f11246;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object f11247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11248;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f11249;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f11250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C4069 f11251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C4069 f11252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C4069 f11253;

    public C4069(boolean z, C4069 c4069, Object obj, C4069 c40692, C4069 c40693) {
        this.f11253 = c4069;
        this.f11249 = obj;
        this.f11250 = z;
        this.f11248 = 1;
        this.f11246 = c40692;
        this.f11245 = c40693;
        c40693.f11246 = this;
        c40692.f11245 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f11249;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f11247;
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
        return this.f11249;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11247;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f11249;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f11247;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f11250) {
            C3466.m5903("value == null");
            return null;
        }
        Object obj2 = this.f11247;
        this.f11247 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f11249 + "=" + this.f11247;
    }

    public C4069(boolean z) {
        this.f11249 = null;
        this.f11250 = z;
        this.f11245 = this;
        this.f11246 = this;
    }
}
