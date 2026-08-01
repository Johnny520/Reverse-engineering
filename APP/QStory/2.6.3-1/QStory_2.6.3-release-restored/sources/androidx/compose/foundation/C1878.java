package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C1318;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1878 implements InterfaceC1354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5703 f3400 = new C5703(new C1879(), 13, new C1915(5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f3401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2233 f3406;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2197 f3407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1318 f3408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2197 f3409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2233 f3405 = AbstractC2202.m3037(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2233 f3404 = AbstractC2202.m3037(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1414 f3403 = new C1414();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2233 f3402 = AbstractC2202.m3037(Integer.MAX_VALUE);

    public C1878(int i) {
        this.f3406 = AbstractC2202.m3037(i);
        final int i2 = 0;
        final int i3 = 1;
        this.f3408 = new C1318(new C1905(this, i3));
        this.f3407 = AbstractC2202.m3056(new InterfaceC7372(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪兰苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1878 f3434;

            {
                this.f3434 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i4 = i2;
                C1878 c1878 = this.f3434;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c1878.m2505() < ((AbstractC2181) c1878.f3402).m2992());
                    default:
                        return Boolean.valueOf(c1878.m2505() > 0);
                }
            }
        });
        this.f3409 = AbstractC2202.m3056(new InterfaceC7372(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪兰苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1878 f3434;

            {
                this.f3434 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i4 = i3;
                C1878 c1878 = this.f3434;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c1878.m2505() < ((AbstractC2181) c1878.f3402).m2992());
                    default:
                        return Boolean.valueOf(c1878.m2505() > 0);
                }
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m2505() {
        return ((AbstractC2181) this.f3406).m2992();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1808(float f) {
        return this.f3408.mo1808(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1847() {
        return ((Boolean) this.f3407.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1848() {
        return ((Boolean) this.f3409.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo1809(MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        Object objMo1809 = this.f3408.mo1809(mutatePriority, interfaceC7383, continuationImpl);
        return objMo1809 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1809 : C6008.f15084;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1810() {
        return this.f3408.mo1810();
    }
}
