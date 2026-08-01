package io.ktor.util;

import kotlin.text.AbstractC5976;
import p075.C7686;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7686 f13043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13044;

    public C5041(String str, C7686 c7686) {
        this.f13044 = str;
        this.f13043 = c7686;
        if (AbstractC5976.m10731(str)) {
            C6755.m11869("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5041)) {
            return false;
        }
        C5041 c5041 = (C5041) obj;
        return this.f13044.equals(c5041.f13044) && this.f13043.equals(c5041.f13043);
    }

    public final int hashCode() {
        return this.f13043.hashCode() + (this.f13044.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.f13044);
    }
}
