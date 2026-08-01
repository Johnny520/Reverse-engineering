package io.ktor.http.content;

import p259.AbstractC8979;
import p259.C8976;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4810 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8976 f12571;

    public C4810(C8976 c8976) {
        this.f12571 = c8976;
        AbstractC8979.m14160(c8976.f22817, c8976.f22815, c8976.f22816, c8976.f22809, c8976.f22814, c8976.f22811);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4810) && this.f12571.equals(((C4810) obj).f12571);
    }

    public final int hashCode() {
        return this.f12571.hashCode();
    }

    public final String toString() {
        return "LastModifiedVersion(lastModified=" + this.f12571 + ')';
    }
}
