package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0477;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1040 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4871 f3055 = new C4871(new C1041(), 13, new C1077(5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f3056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1398 f3061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1362 f3062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0477 f3063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1362 f3064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1398 f3060 = AbstractC1367.m2477(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1398 f3059 = AbstractC1367.m2477(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0573 f3058 = new C0573();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1398 f3057 = AbstractC1367.m2477(Integer.MAX_VALUE);

    public C1040(int i) {
        this.f3061 = AbstractC1367.m2477(i);
        final int i2 = 0;
        final int i3 = 1;
        this.f3063 = new C0477(new C1067(this, i3));
        this.f3062 = AbstractC1367.m2496(new InterfaceC6543(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪兰苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1040 f3089;

            {
                this.f3089 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i4 = i2;
                C1040 c1040 = this.f3089;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c1040.m1945() < ((AbstractC1346) c1040.f3057).m2432());
                    default:
                        return Boolean.valueOf(c1040.m1945() > 0);
                }
            }
        });
        this.f3064 = AbstractC1367.m2496(new InterfaceC6543(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪兰苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1040 f3089;

            {
                this.f3089 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i4 = i3;
                C1040 c1040 = this.f3089;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c1040.m1945() < ((AbstractC1346) c1040.f3057).m2432());
                    default:
                        return Boolean.valueOf(c1040.m1945() > 0);
                }
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m1945() {
        return ((AbstractC1346) this.f3061).m2432();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1248(float f) {
        return this.f3063.mo1248(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1287() {
        return ((Boolean) this.f3062.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1288() {
        return ((Boolean) this.f3064.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo1249(MutatePriority mutatePriority, InterfaceC6554 interfaceC6554, ContinuationImpl continuationImpl) {
        Object objMo1249 = this.f3063.mo1249(mutatePriority, interfaceC6554, continuationImpl);
        return objMo1249 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1249 : C5176.f14739;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1250() {
        return this.f3063.mo1250();
    }
}
