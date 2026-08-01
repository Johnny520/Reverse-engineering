package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1162 implements InterfaceC2168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f1406;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1220 f1407;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C1161 f1408;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f1409;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public long f1410;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Float f1411;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2230 f1412;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Float f1413;

    public C1162(C1161 c1161, Float f, Float f2, C1152 c1152) {
        C1203 c1203 = AbstractC1176.f1468;
        this.f1408 = c1161;
        this.f1413 = f;
        this.f1411 = f2;
        this.f1412 = AbstractC2202.m3034(f);
        this.f1407 = new C1220(c1152, c1203, this.f1413, this.f1411, null);
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        return ((AbstractC2182) this.f1412).getValue();
    }
}
