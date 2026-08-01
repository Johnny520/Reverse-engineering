package androidx.compose.foundation.lazy.grid;

import androidx.activity.C0863;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1203;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C1318;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.foundation.lazy.layout.AbstractC1563;
import androidx.compose.foundation.lazy.layout.C1531;
import androidx.compose.foundation.lazy.layout.C1544;
import androidx.compose.foundation.lazy.layout.C1553;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import io.ktor.client.plugins.api.C4718;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC6154;
import p068.InterfaceC7383;
import p132.AbstractC8176;
import p192.AbstractC8570;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1517 implements InterfaceC1354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f2221 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f2222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1318 f2223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f2224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0955 f2226;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1553 f2228;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1544 f2229;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2230 f2230;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC2230 f2231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4718 f2227 = new C4718(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f2225 = AbstractC2202.m3035(AbstractC1516.f2220, C2188.f4265);

    static {
        AbstractC8176.m13099(new C1594(1), new C0863(23));
    }

    public C1517(int i, int i2) {
        this.f2226 = new C0955(i, i2);
        AbstractC6154.m10892(1, BufferOverflow.DROP_OLDEST);
        this.f2223 = new C1318(new C1905(this, 4));
        this.f2222 = true;
        this.f2229 = new C1544();
        this.f2228 = new C1553();
        new C0955(4);
        new SnapshotStateList();
        AbstractC1563.m2083();
        AbstractC1563.m2083();
        Boolean bool = Boolean.FALSE;
        this.f2230 = AbstractC2202.m3034(bool);
        this.f2231 = AbstractC2202.m3034(bool);
        C1203 c1203 = AbstractC1176.f1468;
        Float fValueOf = Float.valueOf(0.0f);
        AbstractC1176.m1570(c1203, fValueOf, fValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2029(int i, int i2) {
        C0955 c0955 = this.f2226;
        InterfaceC2233 interfaceC2233 = (InterfaceC2233) c0955.f664;
        InterfaceC2233 interfaceC22332 = (InterfaceC2233) c0955.f665;
        if (((AbstractC2181) interfaceC2233).m2992() != i || ((AbstractC2181) interfaceC22332).m2992() != i2) {
            C1553 c1553 = this.f2228;
            c1553.m2070();
            c1553.f2356 = null;
        }
        if (i < 0.0f) {
            AbstractC8570.m13656("Index should be non-negative");
        }
        ((AbstractC2181) ((InterfaceC2233) c0955.f664)).m2993(i);
        ((C1531) c0955.f663).m2054(i);
        ((AbstractC2181) interfaceC22332).m2993(i2);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1808(float f) {
        return this.f2223.mo1808(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1847() {
        return ((Boolean) ((AbstractC2182) this.f2230).getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1848() {
        return ((Boolean) ((AbstractC2182) this.f2231).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.f2223.mo1809(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1809(MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        if (continuationImpl instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuationImpl;
            int i = lazyGridState$scroll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label = i - Integer.MIN_VALUE;
            } else {
                lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuationImpl);
            }
        }
        Object obj = lazyGridState$scroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyGridState$scroll$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (((AbstractC2182) this.f2225).getValue() == AbstractC1516.f2220) {
                lazyGridState$scroll$1.L$0 = mutatePriority;
                lazyGridState$scroll$1.L$1 = interfaceC7383;
                lazyGridState$scroll$1.label = 1;
                if (this.f2229.m2061(lazyGridState$scroll$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC7383 = (InterfaceC7383) lazyGridState$scroll$1.L$1;
            mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$0;
            AbstractC6017.m10769(obj);
        }
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.label = 2;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1810() {
        return this.f2223.mo1810();
    }
}
