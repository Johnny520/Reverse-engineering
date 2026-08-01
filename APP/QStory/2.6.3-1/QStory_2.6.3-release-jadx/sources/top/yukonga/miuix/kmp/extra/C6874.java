package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1177;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6874 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16872;

    public /* synthetic */ C6874(Object obj, int i) {
        this.f16872 = i;
        this.f16871 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f16872;
        Object obj2 = this.f16871;
        switch (i) {
            case 0:
                return C0824xf492e0a0.invokeSuspend$lambda$4((InterfaceC7387) obj2, (C1177) obj);
            case 1:
                return C0825xfca3ec7b.invokeSuspend$lambda$0((InterfaceC7387) obj2, (C1177) obj);
            default:
                LayoutDirection layoutDirection = (LayoutDirection) obj2;
                InterfaceC2415 interfaceC2415 = (InterfaceC2415) obj;
                interfaceC2415.getClass();
                ((C2408) interfaceC2415).m3425(layoutDirection == LayoutDirection.Rtl ? -1.0f : 1.0f);
                return C6008.f15084;
        }
    }
}
