package androidx.compose.p001ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.p001ui.input.pointer.C2469;
import androidx.compose.p001ui.input.pointer.InterfaceC2476;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2661 f5663 = new C2661();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4019(View view, InterfaceC2476 interfaceC2476) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC2476 instanceof C2469 ? PointerIcon.getSystemIcon(context, ((C2469) interfaceC2476).f5124) : PointerIcon.getSystemIcon(context, DescriptorProtos$Edition.EDITION_2023_VALUE);
        if (AbstractC5227.m9466(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
