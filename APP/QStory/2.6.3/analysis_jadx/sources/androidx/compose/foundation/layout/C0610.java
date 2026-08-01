package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.ui.node.AbstractC1785;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0610 extends C0674 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0625 f1703;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC6558 f1704;

    @Override // androidx.compose.foundation.layout.AbstractC0584, androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        View viewM3337 = AbstractC1785.m3337(this);
        C0625 c0625 = this.f1703;
        if (c0625 != null) {
            int i = c0625.f1747 - 1;
            c0625.f1747 = i;
            if (i == 0) {
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                AbstractC2193.m4004(viewM3337, null);
                AbstractC2270.m4242(viewM3337, null);
                viewM3337.removeOnAttachStateChangeListener(c0625.f1749);
            }
        }
        super.mo1126();
    }

    @Override // androidx.compose.foundation.layout.AbstractC0584, androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        View viewM3337 = AbstractC1785.m3337(this);
        WeakHashMap weakHashMap = C0625.f1740;
        C0625 c0625M1459 = C0646.m1459(viewM3337);
        c0625M1459.m1390(viewM3337);
        InterfaceC0608 interfaceC0608 = (InterfaceC0608) this.f1704.invoke(c0625M1459);
        if (!AbstractC4395.m8907(interfaceC0608, this.f1874)) {
            this.f1874 = interfaceC0608;
            mo1358();
        }
        this.f1703 = c0625M1459;
        super.mo1101();
    }
}
