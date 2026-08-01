package androidx.compose.foundation.gestures;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.InterfaceC2959;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1350 implements InterfaceC2959 {
    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // androidx.compose.p001ui.InterfaceC2959
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final float mo1846() {
        return 1.0f;
    }
}
