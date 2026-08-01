package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0371 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0364 f1267;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1268;

    public /* synthetic */ C0371(C0364 c0364, int i) {
        this.f1268 = i;
        this.f1267 = c0364;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f1268;
        C0364 c0364 = this.f1267;
        switch (i) {
            case 0:
                return Boolean.valueOf((AbstractC4394.m8917(((AbstractC1347) c0364.f1241).getValue(), c0364.m1065()) && c0364.f1246.m2387() == Long.MIN_VALUE && !((Boolean) ((AbstractC1347) c0364.f1245).getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(c0364.m1066());
        }
    }
}
