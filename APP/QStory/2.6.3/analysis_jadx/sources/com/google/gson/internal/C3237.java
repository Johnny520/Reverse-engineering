package com.google.gson.internal;

import bsh.C2633;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3237 implements Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3237 f10900;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C3237 f10901;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object f10902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10903;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f10904;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f10905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3237 f10906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3237 f10907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3237 f10908;

    public C3237(boolean z, C3237 c3237, Object obj, C3237 c32372, C3237 c32373) {
        this.f10908 = c3237;
        this.f10904 = obj;
        this.f10905 = z;
        this.f10903 = 1;
        this.f10901 = c32372;
        this.f10900 = c32373;
        c32373.f10901 = this;
        c32372.f10900 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f10904;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f10902;
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
        return this.f10904;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10902;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f10904;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10902;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f10905) {
            C2633.m5343("value == null");
            return null;
        }
        Object obj2 = this.f10902;
        this.f10902 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10904 + "=" + this.f10902;
    }

    public C3237(boolean z) {
        this.f10904 = null;
        this.f10905 = z;
        this.f10900 = this;
        this.f10901 = this;
    }
}
