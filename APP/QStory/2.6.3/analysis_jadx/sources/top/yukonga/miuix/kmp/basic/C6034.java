package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1397;
import androidx.window.area.AbstractC2567;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p116.AbstractC7347;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4871 f16481 = AbstractC7347.m12540(new C6031(7), new C6029(3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1397 f16482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1397 f16483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f16484;

    public C6034(float f, float f2, float f3) {
        this.f16484 = f;
        this.f16483 = AbstractC1367.m2478(f3);
        this.f16482 = AbstractC1367.m2478(f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11394(float f) {
        ((AbstractC1349) this.f16482).m2435(AbstractC2567.m5071(f, this.f16484, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m11395() {
        return ((AbstractC1349) this.f16482).m2434();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m11396() {
        if (this.f16484 == 0.0f) {
            return 0.0f;
        }
        return m11395() / this.f16484;
    }
}
