package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0803 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2293;

    public /* synthetic */ C0803(Object obj, int i) {
        this.f2293 = i;
        this.f2292 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2293;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2292;
        switch (i) {
            case 0:
                ((InterfaceC1395) obj2).setValue((InterfaceC1695) obj);
                break;
            case 1:
                ((InterfaceC1395) obj2).setValue((InterfaceC1695) obj);
                break;
            default:
                Drawable drawable = (Drawable) obj2;
                InterfaceC1504 interfaceC1504 = (InterfaceC1504) obj;
                InterfaceC1601 interfaceC1601M385 = interfaceC1504.mo2696().m385();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC1504.mo2695() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC1504.mo2695() & 4294967295L)));
                drawable.draw(AbstractC1594.m2905(interfaceC1601M385));
                break;
        }
        return c5175;
    }
}
