package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0622;
import androidx.compose.runtime.AbstractC1347;
import kotlin.C5176;
import kotlin.InterfaceC5168;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0373 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5168 f1272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1273;

    public /* synthetic */ C0373(InterfaceC5168 interfaceC5168, int i) {
        this.f1273 = i;
        this.f1272 = interfaceC5168;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1273;
        InterfaceC5168 interfaceC5168 = this.f1272;
        switch (i) {
            case 0:
                C0345 c0345 = (C0345) obj;
                ((C0622) interfaceC5168).invoke(((AbstractC1347) c0345.f1183).getValue(), Float.valueOf(((C0347) c0345.f1182).f1193));
                return C5176.f14739;
            default:
                Long l = (Long) obj;
                l.getClass();
                return ((InterfaceC6558) interfaceC5168).invoke(l);
        }
    }
}
