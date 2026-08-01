package io.ktor.util;

import kotlin.text.AbstractC5144;
import p059.C6857;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6857 f12698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12699;

    public C4209(String str, C6857 c6857) {
        this.f12699 = str;
        this.f12698 = c6857;
        if (AbstractC5144.m10172(str)) {
            C5925.m11310("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4209)) {
            return false;
        }
        C4209 c4209 = (C4209) obj;
        return this.f12699.equals(c4209.f12699) && this.f12698.equals(c4209.f12698);
    }

    public final int hashCode() {
        return this.f12698.hashCode() + (this.f12699.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.f12699);
    }
}
