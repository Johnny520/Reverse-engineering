package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6044 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16527;

    public /* synthetic */ C6044(Object obj, int i) {
        this.f16527 = i;
        this.f16526 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f16527;
        Object obj2 = this.f16526;
        switch (i) {
            case 0:
                return BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1.invokeSuspend$lambda$4((InterfaceC6558) obj2, (C0331) obj);
            case 1:
                return BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1.invokeSuspend$lambda$0((InterfaceC6558) obj2, (C0331) obj);
            default:
                LayoutDirection layoutDirection = (LayoutDirection) obj2;
                InterfaceC1580 interfaceC1580 = (InterfaceC1580) obj;
                interfaceC1580.getClass();
                ((C1573) interfaceC1580).m2865(layoutDirection == LayoutDirection.Rtl ? -1.0f : 1.0f);
                return C5176.f14739;
        }
    }
}
