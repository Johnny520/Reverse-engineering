package androidx.compose.runtime.tooling;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.C2159;
import java.util.List;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import p068.InterfaceC7383;
import p142.InterfaceC8259;
import p321.C9452;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2127 implements InterfaceC8259, InterfaceC5186 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9452 f4124 = new C9452(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2159 f4125;

    public C2127(C2159 c2159) {
        this.f4125 = c2159;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final /* bridge */ Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final /* bridge */ InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5186
    public final InterfaceC5193 getKey() {
        return f4124;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final /* bridge */ InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final /* bridge */ InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // p142.InterfaceC8259
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean mo2859() {
        return this.f4125.f4191;
    }

    @Override // p142.InterfaceC8259
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final List mo2860(Integer num) {
        return this.f4125.m2919();
    }
}
