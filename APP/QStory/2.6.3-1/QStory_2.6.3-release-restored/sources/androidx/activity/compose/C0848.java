package androidx.activity.compose;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p367.AbstractC9690;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0848 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f349;

    public /* synthetic */ C0848(C1720 c1720, boolean z, int i) {
        this.f349 = 1;
        this.f348 = c1720;
        this.f347 = z;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f349;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f348;
        boolean z = this.f347;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1298.m1721(z, (InterfaceC7372) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1821.m2449((C1720) obj3, z, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC9690.m15082(z, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(385));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C0848(boolean z, InterfaceC6000 interfaceC6000, int i, int i2) {
        this.f349 = i2;
        this.f347 = z;
        this.f348 = interfaceC6000;
    }
}
