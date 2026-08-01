package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3255 extends AbstractC3257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedTreeMap f10952 = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3255) && ((C3255) obj).f10952.equals(this.f10952);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10952.hashCode();
    }
}
