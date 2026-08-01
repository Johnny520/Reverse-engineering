package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0803 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2294;

    public /* synthetic */ C0803(Object obj, int i) {
        this.f2294 = i;
        this.f2293 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2294;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2293;
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
                InterfaceC1601 interfaceC1601M386 = interfaceC1504.mo2706().m386();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC1504.mo2705() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC1504.mo2705() & 4294967295L)));
                drawable.draw(AbstractC1594.m2915(interfaceC1601M386));
                break;
        }
        return c5176;
    }
}
