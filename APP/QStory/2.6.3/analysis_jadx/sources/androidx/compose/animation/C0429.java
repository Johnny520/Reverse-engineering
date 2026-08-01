package androidx.compose.animation;

import androidx.activity.AbstractC0053;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0429 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Map f1389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f1390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0375 f1391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0405 f1392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0433 f1393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0384 f1394;

    public /* synthetic */ C0429(C0384 c0384, C0433 c0433, C0405 c0405, C0375 c0375, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c0384, (i & 2) != 0 ? null : c0433, (i & 4) != 0 ? null : c0405, (i & 8) != 0 ? null : c0375, (i & 32) == 0, (i & 64) != 0 ? AbstractC4339.m8776() : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0429)) {
            return false;
        }
        C0429 c0429 = (C0429) obj;
        return AbstractC4395.m8907(this.f1394, c0429.f1394) && AbstractC4395.m8907(this.f1393, c0429.f1393) && AbstractC4395.m8907(this.f1392, c0429.f1392) && AbstractC4395.m8907(this.f1391, c0429.f1391) && this.f1390 == c0429.f1390 && AbstractC4395.m8907(this.f1389, c0429.f1389);
    }

    public final int hashCode() {
        C0384 c0384 = this.f1394;
        int iHashCode = (c0384 == null ? 0 : c0384.hashCode()) * 31;
        C0433 c0433 = this.f1393;
        int iHashCode2 = (iHashCode + (c0433 == null ? 0 : c0433.hashCode())) * 31;
        C0405 c0405 = this.f1392;
        int iHashCode3 = (iHashCode2 + (c0405 == null ? 0 : c0405.hashCode())) * 31;
        C0375 c0375 = this.f1391;
        return this.f1389.hashCode() + AbstractC0053.m141((iHashCode3 + (c0375 != null ? c0375.hashCode() : 0)) * 961, 31, this.f1390);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f1394 + ", slide=" + this.f1393 + ", changeSize=" + this.f1392 + ", scale=" + this.f1391 + ", veil=null, hold=" + this.f1390 + ", effectsMap=" + this.f1389 + ')';
    }

    public C0429(C0384 c0384, C0433 c0433, C0405 c0405, C0375 c0375, boolean z, Map map) {
        this.f1394 = c0384;
        this.f1393 = c0433;
        this.f1392 = c0405;
        this.f1391 = c0375;
        this.f1390 = z;
        this.f1389 = map;
    }
}
