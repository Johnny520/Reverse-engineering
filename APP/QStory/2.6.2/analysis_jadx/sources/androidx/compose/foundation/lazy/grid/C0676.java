package androidx.compose.foundation.lazy.grid;

import androidx.activity.C0016;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0357;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.gestures.C0477;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.foundation.lazy.layout.AbstractC0722;
import androidx.compose.foundation.lazy.layout.C0690;
import androidx.compose.foundation.lazy.layout.C0703;
import androidx.compose.foundation.lazy.layout.C0712;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import io.ktor.client.plugins.api.C3885;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5321;
import p116.AbstractC7346;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0676 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f1875 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f1876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0477 f1877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f1878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0108 f1880;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0712 f1882;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0703 f1883;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC1395 f1884;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC1395 f1885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3885 f1881 = new C3885(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f1879 = AbstractC1367.m2466(AbstractC0675.f1874, C1353.f3919);

    static {
        AbstractC7346.m12513(new C0753(1), new C0016(23));
    }

    public C0676(int i, int i2) {
        this.f1880 = new C0108(i, i2);
        AbstractC5321.m10329(1, BufferOverflow.DROP_OLDEST);
        this.f1877 = new C0477(new C1067(this, 4));
        this.f1876 = true;
        this.f1883 = new C0703();
        this.f1882 = new C0712();
        new C0108(4);
        new SnapshotStateList();
        AbstractC0722.m1513();
        AbstractC0722.m1513();
        Boolean bool = Boolean.FALSE;
        this.f1884 = AbstractC1367.m2465(bool);
        this.f1885 = AbstractC1367.m2465(bool);
        C0357 c0357 = AbstractC0330.f1123;
        Float fValueOf = Float.valueOf(0.0f);
        AbstractC0330.m1009(c0357, fValueOf, fValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1459(int i, int i2) {
        C0108 c0108 = this.f1880;
        InterfaceC1398 interfaceC1398 = (InterfaceC1398) c0108.f319;
        InterfaceC1398 interfaceC13982 = (InterfaceC1398) c0108.f320;
        if (((AbstractC1346) interfaceC1398).m2422() != i || ((AbstractC1346) interfaceC13982).m2422() != i2) {
            C0712 c0712 = this.f1882;
            c0712.m1500();
            c0712.f2010 = null;
        }
        if (i < 0.0f) {
            AbstractC7740.m13069("Index should be non-negative");
        }
        ((AbstractC1346) ((InterfaceC1398) c0108.f319)).m2423(i);
        ((C0690) c0108.f318).m1484(i);
        ((AbstractC1346) interfaceC13982).m2423(i2);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1238(float f) {
        return this.f1877.mo1238(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1277() {
        return ((Boolean) ((AbstractC1347) this.f1884).getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1278() {
        return ((Boolean) ((AbstractC1347) this.f1885).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.f1877.mo1239(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1239(androidx.compose.foundation.MutatePriority r7, p052.InterfaceC6553 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5184.m10206(r9)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6553) r8
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            kotlin.AbstractC5184.m10206(r9)
            goto L5c
        L3e:
            kotlin.AbstractC5184.m10206(r9)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r9 = r6.f1879
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r9 = (androidx.compose.runtime.AbstractC1347) r9
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.lazy.grid.飘花落叶言子楪世苏哲兰 r2 = androidx.compose.foundation.lazy.grid.AbstractC0675.f1874
            if (r9 != r2) goto L5c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世兰苏哲 r9 = r6.f1883
            java.lang.Object r9 = r9.m1491(r0)
            if (r9 != r1) goto L5c
            goto L6a
        L5c:
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲 r6 = r6.f1877
            java.lang.Object r6 = r6.mo1239(r7, r8, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.C0676.mo1239(androidx.compose.foundation.MutatePriority, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1240() {
        return this.f1877.mo1240();
    }
}
