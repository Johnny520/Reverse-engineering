package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1451 extends C1515 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1466 f2048;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC7387 f2049;

    @Override // androidx.compose.foundation.layout.AbstractC1425, androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        View viewM3897 = AbstractC2620.m3897(this);
        C1466 c1466 = this.f2048;
        if (c1466 != null) {
            int i = c1466.f2092 - 1;
            c1466.f2092 = i;
            if (i == 0) {
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                AbstractC3026.m4564(viewM3897, null);
                AbstractC3103.m4802(viewM3897, null);
                viewM3897.removeOnAttachStateChangeListener(c1466.f2094);
            }
        }
        super.mo1686();
    }

    @Override // androidx.compose.foundation.layout.AbstractC1425, androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        View viewM3897 = AbstractC2620.m3897(this);
        WeakHashMap weakHashMap = C1466.f2085;
        C1466 c1466M2019 = C1487.m2019(viewM3897);
        c1466M2019.m1950(viewM3897);
        InterfaceC1449 interfaceC1449 = (InterfaceC1449) this.f2049.invoke(c1466M2019);
        if (!AbstractC5227.m9466(interfaceC1449, this.f2219)) {
            this.f2219 = interfaceC1449;
            mo1918();
        }
        this.f2048 = c1466M2019;
        super.mo1661();
    }
}
