package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0622;
import androidx.compose.runtime.AbstractC1347;
import kotlin.C5175;
import kotlin.InterfaceC5167;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0373 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5167 f1272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1273;

    public /* synthetic */ C0373(InterfaceC5167 interfaceC5167, int i) {
        this.f1273 = i;
        this.f1272 = interfaceC5167;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1273;
        InterfaceC5167 interfaceC5167 = this.f1272;
        switch (i) {
            case 0:
                C0345 c0345 = (C0345) obj;
                ((C0622) interfaceC5167).invoke(((AbstractC1347) c0345.f1183).getValue(), Float.valueOf(((C0347) c0345.f1182).f1193));
                return C5175.f14739;
            default:
                Long l = (Long) obj;
                l.getClass();
                return ((InterfaceC6557) interfaceC5167).invoke(l);
        }
    }
}
