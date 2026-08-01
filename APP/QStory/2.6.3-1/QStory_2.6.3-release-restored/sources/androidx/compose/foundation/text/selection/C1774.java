package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.AbstractC1913;
import androidx.compose.foundation.C1883;
import androidx.compose.foundation.C1917;
import androidx.compose.p001ui.C2958;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p137.InterfaceC8221;
import p221.C8732;
import p221.C8735;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1774 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2997;

    public /* synthetic */ C1774(Object obj, int i, Object obj2) {
        this.f2997 = i;
        this.f2995 = obj;
        this.f2996 = obj2;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2997;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2996;
        Object obj3 = this.f2995;
        switch (i) {
            case 0:
                InterfaceC8725 interfaceC8725 = (InterfaceC8725) obj3;
                C8732 c8732 = (C8732) obj;
                ((InterfaceC2230) obj2).setValue(new C8735((((long) interfaceC8725.mo1903(C8732.m13913(c8732.f22217))) & 4294967295L) | (((long) interfaceC8725.mo1903(C8732.m13912(c8732.f22217))) << 32)));
                return c6008;
            case 1:
                C1752 c1752 = new C1752((InterfaceC7372) obj, 3);
                C1774 c1774 = new C1774((InterfaceC8725) obj3, 0, (InterfaceC2230) obj2);
                if (AbstractC1913.m2553()) {
                    return AbstractC1913.m2553() ? new C1917(c1752, c1774, Build.VERSION.SDK_INT == 28 ? C1883.f3430 : C1883.f3429) : C2958.f6621;
                }
                C6755.m11867("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj2;
                InterfaceC8221 interfaceC8221 = (InterfaceC8221) obj;
                ((InterfaceC7372) obj3).invoke();
                if (interfaceC7372 != null ? ((Boolean) interfaceC7372.invoke()).booleanValue() : true) {
                    interfaceC8221.close();
                }
                return c6008;
        }
    }
}
