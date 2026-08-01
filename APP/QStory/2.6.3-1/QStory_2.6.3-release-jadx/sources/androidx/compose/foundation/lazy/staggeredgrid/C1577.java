package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.activity.C0863;
import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C0978;
import androidx.appcompat.widget.C0984;
import androidx.collection.AbstractC1120;
import androidx.collection.C1093;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C1318;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.foundation.lazy.layout.AbstractC1563;
import androidx.compose.foundation.lazy.layout.C1527;
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
import com.alibaba.fastjson2.C3775;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC6154;
import p068.InterfaceC7383;
import p132.AbstractC8176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1577 implements InterfaceC1354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final /* synthetic */ int f2418 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f2419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0978 f2422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1579 f2423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1527 f2425;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f2426;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1544 f2427;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f2428;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f2429;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1553 f2430;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f2431;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1318 f2432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f2421 = AbstractC2202.m3035(AbstractC1578.f2433, C2188.f4265);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0984 f2420 = new C0984((byte) 0, 1);

    static {
        AbstractC8176.m13099(new C1594(3), new C0863(26));
    }

    public C1577(int[] iArr, int[] iArr2) {
        this.f2422 = new C0978(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        Boolean bool = Boolean.FALSE;
        this.f2419 = AbstractC2202.m3034(bool);
        this.f2428 = AbstractC2202.m3034(bool);
        this.f2427 = new C1544();
        this.f2431 = true;
        new C0955(4);
        this.f2432 = new C1318(new C1905(this, 5));
        C1093 c1093 = AbstractC1120.f1323;
        new C1093();
        AbstractC6154.m10892(1, BufferOverflow.DROP_OLDEST);
        new SnapshotStateList();
        this.f2430 = new C1553();
        this.f2426 = AbstractC1563.m2083();
        AbstractC1563.m2083();
        this.f2425 = new C1527();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2103(float f, C1579 c1579) {
        if (!this.f2431 || c1579.f2443.isEmpty()) {
            return;
        }
        List list = c1579.f2443;
        if (f < 0.0f) {
            AbstractC5176.m9367(list).getClass();
            C3775.m6954();
        } else {
            AbstractC5176.m9379(list).getClass();
            C3775.m6954();
        }
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1808(float f) {
        return this.f2432.mo1808(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1847() {
        return ((Boolean) ((AbstractC2182) this.f2419).getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1848() {
        return ((Boolean) ((AbstractC2182) this.f2428).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.f2432.mo1809(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1809(MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        if (continuationImpl instanceof LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (LazyStaggeredGridState$scroll$1) continuationImpl;
            int i = lazyStaggeredGridState$scroll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.label = i - Integer.MIN_VALUE;
            } else {
                lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, continuationImpl);
            }
        }
        Object obj = lazyStaggeredGridState$scroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyStaggeredGridState$scroll$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (((AbstractC2182) this.f2421).getValue() == AbstractC1578.f2433) {
                lazyStaggeredGridState$scroll$1.L$0 = mutatePriority;
                lazyStaggeredGridState$scroll$1.L$1 = interfaceC7383;
                lazyStaggeredGridState$scroll$1.label = 1;
                if (this.f2427.m2061(lazyStaggeredGridState$scroll$1) != coroutineSingletons) {
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
            interfaceC7383 = (InterfaceC7383) lazyStaggeredGridState$scroll$1.L$1;
            mutatePriority = (MutatePriority) lazyStaggeredGridState$scroll$1.L$0;
            AbstractC6017.m10769(obj);
        }
        lazyStaggeredGridState$scroll$1.L$0 = null;
        lazyStaggeredGridState$scroll$1.L$1 = null;
        lazyStaggeredGridState$scroll$1.label = 2;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1810() {
        return this.f2432.mo1810();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2104(int i, int i2) {
        C0978 c0978 = this.f2422;
        InterfaceC2233 interfaceC2233 = (InterfaceC2233) c0978.f920;
        InterfaceC2233 interfaceC22332 = (InterfaceC2233) c0978.f919;
        if (((AbstractC2181) interfaceC2233).m2992() != i || ((AbstractC2181) interfaceC22332).m2992() != i2) {
            C1553 c1553 = this.f2430;
            c1553.m2070();
            c1553.f2356 = null;
        }
        C1579 c1579 = (C1579) ((AbstractC2182) this.f2421).getValue();
        C1579 c15792 = AbstractC1578.f2433;
        if (!c1579.f2443.isEmpty()) {
            AbstractC5176.m9379(c1579.f2443).getClass();
            C3775.m6954();
            return;
        }
        ?? r5 = (int[]) ((InterfaceC7383) c0978.f921).invoke(Integer.valueOf(i), Integer.valueOf(((int[]) c0978.f923).length));
        int length = r5.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i2;
        }
        c0978.f923 = r5;
        ((AbstractC2181) ((InterfaceC2233) c0978.f920)).m2993(C0978.m1104(r5));
        c0978.f922 = iArr;
        ((AbstractC2181) interfaceC22332).m2993(C0978.m1103(r5, iArr));
        ((C1531) c0978.f918).m2054(i);
    }
}
