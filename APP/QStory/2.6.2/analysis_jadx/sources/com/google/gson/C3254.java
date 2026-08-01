package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3254 extends AbstractC3256 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedTreeMap f10947 = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3254) && ((C3254) obj).f10947.equals(this.f10947);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10947.hashCode();
    }
}
