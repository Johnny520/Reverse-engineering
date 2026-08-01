package kotlin.p008io;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final File f13300;

    public C5209(File file, List list) {
        list.getClass();
        this.f13300 = file;
        this.f13299 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5209)) {
            return false;
        }
        C5209 c5209 = (C5209) obj;
        return this.f13300.equals(c5209.f13300) && AbstractC5227.m9466(this.f13299, c5209.f13299);
    }

    public final int hashCode() {
        return this.f13299.hashCode() + (this.f13300.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f13300 + ", segments=" + this.f13299 + ')';
    }
}
