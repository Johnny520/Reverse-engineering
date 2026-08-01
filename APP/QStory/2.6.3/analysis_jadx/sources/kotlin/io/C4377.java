package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4377 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final File f12955;

    public C4377(File file, List list) {
        list.getClass();
        this.f12955 = file;
        this.f12954 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4377)) {
            return false;
        }
        C4377 c4377 = (C4377) obj;
        return this.f12955.equals(c4377.f12955) && AbstractC4395.m8907(this.f12954, c4377.f12954);
    }

    public final int hashCode() {
        return this.f12954.hashCode() + (this.f12955.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f12955 + ", segments=" + this.f12954 + ')';
    }
}
