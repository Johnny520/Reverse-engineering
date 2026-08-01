package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2906 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2870 f6480;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6481;

    public C2906(String str, C2870 c2870) {
        this.f6481 = str;
        this.f6480 = c2870;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2906)) {
            return false;
        }
        C2906 c2906 = (C2906) obj;
        return this.f6481.equals(c2906.f6481) && AbstractC5227.m9466(this.f6480, c2906.f6480);
    }

    public final int hashCode() {
        int iHashCode = this.f6481.hashCode() * 31;
        C2870 c2870 = this.f6480;
        return (iHashCode + (c2870 != null ? c2870.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f6481, ')');
    }
}
