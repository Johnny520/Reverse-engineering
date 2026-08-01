package io.ktor.util;

import kotlin.text.AbstractC5143;
import p059.C6856;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6856 f12694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12695;

    public C4208(String str, C6856 c6856) {
        this.f12695 = str;
        this.f12694 = c6856;
        if (AbstractC5143.m10164(str)) {
            C5919.m11249("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4208)) {
            return false;
        }
        C4208 c4208 = (C4208) obj;
        return this.f12695.equals(c4208.f12695) && this.f12694.equals(c4208.f12694);
    }

    public final int hashCode() {
        return this.f12694.hashCode() + (this.f12695.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.f12695);
    }
}
