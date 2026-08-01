package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2197;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1840 implements InterfaceC1354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2197 f3282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2197 f3283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1354 f3284;

    public C1840(InterfaceC1354 interfaceC1354, final C1836 c1836) {
        this.f3284 = interfaceC1354;
        final int i = 0;
        this.f3283 = AbstractC2202.m3056(new InterfaceC7372() { // from class: androidx.compose.foundation.text.飘花落叶言子苏兰楪世哲
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i2 = i;
                C1836 c18362 = c1836;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(c18362.m2479() < ((AbstractC2184) c18362.f3274).m2994());
                    default:
                        return Boolean.valueOf(c18362.m2479() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.f3282 = AbstractC2202.m3056(new InterfaceC7372() { // from class: androidx.compose.foundation.text.飘花落叶言子苏兰楪世哲
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i22 = i2;
                C1836 c18362 = c1836;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(c18362.m2479() < ((AbstractC2184) c18362.f3274).m2994());
                    default:
                        return Boolean.valueOf(c18362.m2479() > 0.0f);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1808(float f) {
        return this.f3284.mo1808(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1847() {
        return ((Boolean) this.f3283.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1848() {
        return ((Boolean) this.f3282.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo1809(MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        return this.f3284.mo1809(mutatePriority, interfaceC7383, continuationImpl);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1810() {
        return this.f3284.mo1810();
    }
}
