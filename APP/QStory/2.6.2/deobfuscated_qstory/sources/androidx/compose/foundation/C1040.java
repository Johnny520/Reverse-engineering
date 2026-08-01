package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0477;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1040 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4870 f3054 = new C4870(new C1041(), 13, new C1077(5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f3055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1398 f3060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1362 f3061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0477 f3062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1362 f3063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1398 f3059 = AbstractC1367.m2468(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1398 f3058 = AbstractC1367.m2468(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0573 f3057 = new C0573();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1398 f3056 = AbstractC1367.m2468(Integer.MAX_VALUE);

    public C1040(int i) {
        this.f3060 = AbstractC1367.m2468(i);
        final int i2 = 0;
        final int i3 = 1;
        this.f3062 = new C0477(new C1067(this, i3));
        this.f3061 = AbstractC1367.m2486(new InterfaceC6542(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪兰苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1040 f3088;

            {
                this.f3088 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i4 = i2;
                C1040 c1040 = this.f3088;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c1040.m1935() < ((AbstractC1346) c1040.f3056).m2422());
                    default:
                        return Boolean.valueOf(c1040.m1935() > 0);
                }
            }
        });
        this.f3063 = AbstractC1367.m2486(new InterfaceC6542(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪兰苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1040 f3088;

            {
                this.f3088 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i4 = i3;
                C1040 c1040 = this.f3088;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c1040.m1935() < ((AbstractC1346) c1040.f3056).m2422());
                    default:
                        return Boolean.valueOf(c1040.m1935() > 0);
                }
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m1935() {
        return ((AbstractC1346) this.f3060).m2422();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1238(float f) {
        return this.f3062.mo1238(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1277() {
        return ((Boolean) this.f3061.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1278() {
        return ((Boolean) this.f3063.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo1239(MutatePriority mutatePriority, InterfaceC6553 interfaceC6553, ContinuationImpl continuationImpl) {
        Object objMo1239 = this.f3062.mo1239(mutatePriority, interfaceC6553, continuationImpl);
        return objMo1239 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1239 : C5175.f14739;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1240() {
        return this.f3062.mo1240();
    }
}
