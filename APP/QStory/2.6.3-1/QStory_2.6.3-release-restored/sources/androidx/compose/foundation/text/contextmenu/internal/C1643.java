package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1643 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2639;

    public /* synthetic */ C1643(Object obj, int i) {
        this.f2639 = i;
        this.f2638 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2639;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2638;
        switch (i) {
            case 0:
                ((InterfaceC2230) obj2).setValue((InterfaceC2530) obj);
                break;
            case 1:
                ((InterfaceC2230) obj2).setValue((InterfaceC2530) obj);
                break;
            default:
                Drawable drawable = (Drawable) obj2;
                InterfaceC2339 interfaceC2339 = (InterfaceC2339) obj;
                InterfaceC2436 interfaceC2436M946 = interfaceC2339.mo3266().m946();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC2339.mo3265() & 4294967295L)));
                drawable.draw(AbstractC2429.m3475(interfaceC2436M946));
                break;
        }
        return c6008;
    }
}
