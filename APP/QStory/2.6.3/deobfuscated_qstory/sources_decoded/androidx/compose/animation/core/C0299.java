package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0299 implements InterfaceC0311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f1030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1032;

    public C0299(float f, float f2, Object obj) {
        this.f1032 = f;
        this.f1031 = f2;
        this.f1030 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0299) {
            C0299 c0299 = (C0299) obj;
            if (c0299.f1032 == this.f1032 && c0299.f1031 == this.f1031 && AbstractC4395.m8907(c0299.f1030, this.f1030)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1030;
        return Float.hashCode(this.f1031) + AbstractC0053.m145((obj != null ? obj.hashCode() : 0) * 31, this.f1032, 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC0360 mo927(InterfaceC0358 interfaceC0358) {
        Object obj = this.f1030;
        return new C0113(this.f1032, this.f1031, obj == null ? null : (AbstractC0343) interfaceC0358.mo1062().invoke(obj));
    }

    public /* synthetic */ C0299(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
