package androidx.compose.animation.core;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1181 f1396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Float f1397;

    public C1159(Float f, InterfaceC1181 interfaceC1181) {
        this.f1397 = f;
        this.f1396 = interfaceC1181;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1159)) {
            return false;
        }
        C1159 c1159 = (C1159) obj;
        return c1159.f1397.equals(this.f1397) && AbstractC5227.m9466(c1159.f1396, this.f1396);
    }

    public final int hashCode() {
        return this.f1396.hashCode() + AbstractC0900.m704(0, this.f1397.hashCode() * 31, 31);
    }
}
