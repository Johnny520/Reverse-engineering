package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4087 extends AbstractC4089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedTreeMap f11297 = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4087) && ((C4087) obj).f11297.equals(this.f11297);
        }
        return true;
    }

    public final int hashCode() {
        return this.f11297.hashCode();
    }
}
