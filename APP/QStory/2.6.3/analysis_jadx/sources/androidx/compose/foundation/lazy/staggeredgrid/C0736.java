package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.activity.C0016;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0131;
import androidx.appcompat.widget.C0137;
import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.gestures.C0477;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.foundation.lazy.layout.AbstractC0722;
import androidx.compose.foundation.lazy.layout.C0686;
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
import com.alibaba.fastjson2.C2942;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5322;
import p052.InterfaceC6554;
import p116.AbstractC7347;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final /* synthetic */ int f2073 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0131 f2077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0738 f2078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0686 f2080;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f2081;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0703 f2082;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f2083;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f2084;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C0712 f2085;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f2086;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0477 f2087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f2076 = AbstractC1367.m2475(AbstractC0737.f2088, C1353.f3920);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0137 f2075 = new C0137((byte) 0, 1);

    static {
        AbstractC7347.m12540(new C0753(3), new C0016(26));
    }

    public C0736(int[] iArr, int[] iArr2) {
        this.f2077 = new C0131(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        Boolean bool = Boolean.FALSE;
        this.f2074 = AbstractC1367.m2474(bool);
        this.f2083 = AbstractC1367.m2474(bool);
        this.f2082 = new C0703();
        this.f2086 = true;
        new C0108(4);
        this.f2087 = new C0477(new C1067(this, 5));
        C0246 c0246 = AbstractC0273.f978;
        new C0246();
        AbstractC5322.m10333(1, BufferOverflow.DROP_OLDEST);
        new SnapshotStateList();
        this.f2085 = new C0712();
        this.f2081 = AbstractC0722.m1523();
        AbstractC0722.m1523();
        this.f2080 = new C0686();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1543(float f, C0738 c0738) {
        if (!this.f2086 || c0738.f2098.isEmpty()) {
            return;
        }
        List list = c0738.f2098;
        if (f < 0.0f) {
            AbstractC4344.m8808(list).getClass();
            C2942.m6394();
        } else {
            AbstractC4344.m8820(list).getClass();
            C2942.m6394();
        }
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1248(float f) {
        return this.f2087.mo1248(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1287() {
        return ((Boolean) ((AbstractC1347) this.f2074).getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1288() {
        return ((Boolean) ((AbstractC1347) this.f2083).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.f2087.mo1249(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1249(androidx.compose.foundation.MutatePriority r7, p052.InterfaceC6554 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            kotlin.AbstractC5185.m10210(r9)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L31:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6554) r8
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            kotlin.AbstractC5185.m10210(r9)
            goto L5c
        L3e:
            kotlin.AbstractC5185.m10210(r9)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r9 = r6.f2076
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r9 = (androidx.compose.runtime.AbstractC1347) r9
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.lazy.staggeredgrid.飘花落叶言子楪世苏哲兰 r2 = androidx.compose.foundation.lazy.staggeredgrid.AbstractC0737.f2088
            if (r9 != r2) goto L5c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世兰苏哲 r9 = r6.f2082
            java.lang.Object r9 = r9.m1501(r0)
            if (r9 != r1) goto L5c
            goto L6a
        L5c:
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲 r6 = r6.f2087
            java.lang.Object r6 = r6.mo1249(r7, r8, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.C0736.mo1249(androidx.compose.foundation.MutatePriority, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1250() {
        return this.f2087.mo1250();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1544(int i, int i2) {
        C0131 c0131 = this.f2077;
        InterfaceC1398 interfaceC1398 = (InterfaceC1398) c0131.f575;
        InterfaceC1398 interfaceC13982 = (InterfaceC1398) c0131.f574;
        if (((AbstractC1346) interfaceC1398).m2432() != i || ((AbstractC1346) interfaceC13982).m2432() != i2) {
            C0712 c0712 = this.f2085;
            c0712.m1510();
            c0712.f2011 = null;
        }
        C0738 c0738 = (C0738) ((AbstractC1347) this.f2076).getValue();
        C0738 c07382 = AbstractC0737.f2088;
        if (!c0738.f2098.isEmpty()) {
            AbstractC4344.m8820(c0738.f2098).getClass();
            C2942.m6394();
            return;
        }
        ?? r5 = (int[]) ((InterfaceC6554) c0131.f576).invoke(Integer.valueOf(i), Integer.valueOf(((int[]) c0131.f578).length));
        int length = r5.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i2;
        }
        c0131.f578 = r5;
        ((AbstractC1346) ((InterfaceC1398) c0131.f575)).m2433(C0131.m544(r5));
        c0131.f577 = iArr;
        ((AbstractC1346) interfaceC13982).m2433(C0131.m543(r5, iArr));
        ((C0690) c0131.f573).m1494(i);
    }
}
