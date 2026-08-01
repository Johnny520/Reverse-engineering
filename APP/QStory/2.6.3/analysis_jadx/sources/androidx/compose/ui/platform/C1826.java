package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.C1634;
import androidx.compose.ui.input.pointer.InterfaceC1641;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1826 f5318 = new C1826();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3459(View view, InterfaceC1641 interfaceC1641) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC1641 instanceof C1634 ? PointerIcon.getSystemIcon(context, ((C1634) interfaceC1641).f4779) : PointerIcon.getSystemIcon(context, DescriptorProtos$Edition.EDITION_2023_VALUE);
        if (AbstractC4395.m8907(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
