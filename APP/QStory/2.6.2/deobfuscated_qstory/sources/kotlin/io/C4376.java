package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final File f12951;

    public C4376(File file, List list) {
        list.getClass();
        this.f12951 = file;
        this.f12950 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4376)) {
            return false;
        }
        C4376 c4376 = (C4376) obj;
        return this.f12951.equals(c4376.f12951) && AbstractC4394.m8917(this.f12950, c4376.f12950);
    }

    public final int hashCode() {
        return this.f12950.hashCode() + (this.f12951.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f12951 + ", segments=" + this.f12950 + ')';
    }
}
