package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1217 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1210 f1612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1613;

    public /* synthetic */ C1217(C1210 c1210, int i) {
        this.f1613 = i;
        this.f1612 = c1210;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f1613;
        C1210 c1210 = this.f1612;
        switch (i) {
            case 0:
                return Boolean.valueOf((AbstractC5227.m9466(((AbstractC2182) c1210.f1586).getValue(), c1210.m1626()) && c1210.f1591.m2957() == Long.MIN_VALUE && !((Boolean) ((AbstractC2182) c1210.f1590).getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(c1210.m1627());
        }
    }
}
