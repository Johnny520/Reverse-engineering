package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.AbstractC1075;
import androidx.compose.foundation.C1045;
import androidx.compose.foundation.C1079;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.C2125;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p121.InterfaceC7391;
import p205.C7902;
import p205.C7905;
import p205.InterfaceC7895;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0936 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2649;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2651;

    public /* synthetic */ C0936(Object obj, int i, Object obj2) {
        this.f2651 = i;
        this.f2649 = obj;
        this.f2650 = obj2;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2651;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2650;
        Object obj3 = this.f2649;
        switch (i) {
            case 0:
                InterfaceC7895 interfaceC7895 = (InterfaceC7895) obj3;
                C7902 c7902 = (C7902) obj;
                ((InterfaceC1395) obj2).setValue(new C7905((((long) interfaceC7895.mo1333(C7902.m13326(c7902.f21875))) & 4294967295L) | (((long) interfaceC7895.mo1333(C7902.m13325(c7902.f21875))) << 32)));
                return c5175;
            case 1:
                C0914 c0914 = new C0914((InterfaceC6542) obj, 3);
                C0936 c0936 = new C0936((InterfaceC7895) obj3, 0, (InterfaceC1395) obj2);
                if (AbstractC1075.m1983()) {
                    return AbstractC1075.m1983() ? new C1079(c0914, c0936, Build.VERSION.SDK_INT == 28 ? C1045.f3084 : C1045.f3083) : C2125.f6275;
                }
                C5919.m11247("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj2;
                InterfaceC7391 interfaceC7391 = (InterfaceC7391) obj;
                ((InterfaceC6542) obj3).invoke();
                if (interfaceC6542 != null ? ((Boolean) interfaceC6542.invoke()).booleanValue() : true) {
                    interfaceC7391.close();
                }
                return c5175;
        }
    }
}
