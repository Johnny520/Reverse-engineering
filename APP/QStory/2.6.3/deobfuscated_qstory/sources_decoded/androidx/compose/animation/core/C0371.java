package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0371 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0364 f1267;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1268;

    public /* synthetic */ C0371(C0364 c0364, int i) {
        this.f1268 = i;
        this.f1267 = c0364;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f1268;
        C0364 c0364 = this.f1267;
        switch (i) {
            case 0:
                return Boolean.valueOf((AbstractC4395.m8907(((AbstractC1347) c0364.f1241).getValue(), c0364.m1066()) && c0364.f1246.m2397() == Long.MIN_VALUE && !((Boolean) ((AbstractC1347) c0364.f1245).getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(c0364.m1067());
        }
    }
}
