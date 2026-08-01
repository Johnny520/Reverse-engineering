package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.foundation.AbstractC1075;
import androidx.compose.foundation.C1045;
import androidx.compose.foundation.C1079;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.C2125;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p121.InterfaceC7392;
import p205.C7903;
import p205.C7906;
import p205.InterfaceC7896;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0936 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2652;

    public /* synthetic */ C0936(Object obj, int i, Object obj2) {
        this.f2652 = i;
        this.f2650 = obj;
        this.f2651 = obj2;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2652;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2651;
        Object obj3 = this.f2650;
        switch (i) {
            case 0:
                InterfaceC7896 interfaceC7896 = (InterfaceC7896) obj3;
                C7903 c7903 = (C7903) obj;
                ((InterfaceC1395) obj2).setValue(new C7906((((long) interfaceC7896.mo1343(C7903.m13354(c7903.f21872))) & 4294967295L) | (((long) interfaceC7896.mo1343(C7903.m13353(c7903.f21872))) << 32)));
                return c5176;
            case 1:
                C0914 c0914 = new C0914((InterfaceC6543) obj, 3);
                C0936 c0936 = new C0936((InterfaceC7896) obj3, 0, (InterfaceC1395) obj2);
                if (AbstractC1075.m1993()) {
                    return AbstractC1075.m1993() ? new C1079(c0914, c0936, Build.VERSION.SDK_INT == 28 ? C1045.f3085 : C1045.f3084) : C2125.f6276;
                }
                C5925.m11308("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj2;
                InterfaceC7392 interfaceC7392 = (InterfaceC7392) obj;
                ((InterfaceC6543) obj3).invoke();
                if (interfaceC6543 != null ? ((Boolean) interfaceC6543.invoke()).booleanValue() : true) {
                    interfaceC7392.close();
                }
                return c5176;
        }
    }
}
