package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.ui.node.AbstractC1785;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0610 extends C0674 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0625 f1702;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC6557 f1703;

    @Override // androidx.compose.foundation.layout.AbstractC0584, androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        View viewM3327 = AbstractC1785.m3327(this);
        C0625 c0625 = this.f1702;
        if (c0625 != null) {
            int i = c0625.f1746 - 1;
            c0625.f1746 = i;
            if (i == 0) {
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                AbstractC2193.m3994(viewM3327, null);
                AbstractC2270.m4232(viewM3327, null);
                viewM3327.removeOnAttachStateChangeListener(c0625.f1748);
            }
        }
        super.mo1125();
    }

    @Override // androidx.compose.foundation.layout.AbstractC0584, androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        View viewM3327 = AbstractC1785.m3327(this);
        WeakHashMap weakHashMap = C0625.f1739;
        C0625 c0625M1449 = C0646.m1449(viewM3327);
        c0625M1449.m1380(viewM3327);
        InterfaceC0608 interfaceC0608 = (InterfaceC0608) this.f1703.invoke(c0625M1449);
        if (!AbstractC4394.m8917(interfaceC0608, this.f1873)) {
            this.f1873 = interfaceC0608;
            mo1348();
        }
        this.f1702 = c0625M1449;
        super.mo1100();
    }
}
