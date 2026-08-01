package io.ktor.http.content;

import p243.AbstractC8150;
import p243.C8147;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3978 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8147 f12226;

    public C3978(C8147 c8147) {
        this.f12226 = c8147;
        AbstractC8150.m13601(c8147.f22472, c8147.f22470, c8147.f22471, c8147.f22464, c8147.f22469, c8147.f22466);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3978) && this.f12226.equals(((C3978) obj).f12226);
    }

    public final int hashCode() {
        return this.f12226.hashCode();
    }

    public final String toString() {
        return "LastModifiedVersion(lastModified=" + this.f12226 + ')';
    }
}
