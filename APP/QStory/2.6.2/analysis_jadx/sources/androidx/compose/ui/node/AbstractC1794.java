package androidx.compose.ui.node;

import android.os.Build;
import android.view.ViewParent;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0108;
import androidx.collection.AbstractC0234;
import androidx.collection.C0244;
import androidx.collection.C0252;
import androidx.collection.C0255;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.C1576;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.C1586;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1606;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.C1615;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.graphics.layer.InterfaceC1514;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.C1663;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.platform.C1911;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4210;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.C5175;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p112.C7326;
import p112.C7327;
import p112.C7328;
import p112.C7329;
import p144.C7546;
import p175.AbstractC7738;
import p205.C7907;
import p205.InterfaceC7895;
import p210.AbstractC7935;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1794 extends AbstractC1754 implements InterfaceC1655, InterfaceC1695, InterfaceC1804 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f5242;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float f5243;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C1775 f5245;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C7329 f5246;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC1657 f5247;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C0252 f5248;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC7895 f5249;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC6557 f5250;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public LayoutDirection f5252;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f5253;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5254;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC1794 f5255;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC1794 f5256;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5257;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1748 f5258;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public InterfaceC1806 f5259;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public C1516 f5260;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f5261;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public boolean f5263;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public InterfaceC1601 f5264;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public InterfaceC6553 f5265;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final InterfaceC6557 f5238 = new InterfaceC6557() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public final void invoke(AbstractC1794 abstractC1794) throws Throwable {
            C1748 c1748 = abstractC1794.f5258;
            try {
                if (abstractC1794.mo3245()) {
                    abstractC1794.m3400(true);
                }
            } catch (Throwable th) {
                c1748.m3267(th);
                throw null;
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((AbstractC1794) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final InterfaceC6557 f5237 = new InterfaceC6557() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void invoke(AbstractC1794 abstractC1794) {
            InterfaceC1806 interfaceC1806 = abstractC1794.f5259;
            if (interfaceC1806 != null) {
                ((C1911) interfaceC1806).m3600();
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC1794) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static final C1573 f5236 = new C1573();

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static final C1775 f5235 = new C1775();

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static final float[] f5234 = C1587.m2897();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final C1812 f5239 = new C1812();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static final C1809 f5240 = new C1809();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public float f5251 = 0.8f;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public long f5244 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC1569 f5241 = AbstractC1581.f4661;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InterfaceC6542 f5262 = new InterfaceC6542() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3150invoke() {
            AbstractC1794 abstractC1794 = this.this$0.f5255;
            if (abstractC1794 != null) {
                abstractC1794.m3372();
            }
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3150invoke();
            return C5175.f14739;
        }
    };

    public AbstractC1794(C1748 c1748) {
        this.f5258 = c1748;
        this.f5249 = c1748.f5098;
        this.f5252 = c1748.f5099;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public static AbstractC1794 m3369(InterfaceC1695 interfaceC1695) {
        AbstractC1794 abstractC1794;
        C1663 c1663 = interfaceC1695 instanceof C1663 ? (C1663) interfaceC1695 : null;
        if (c1663 != null && (abstractC1794 = c1663.f4877.f5062) != null) {
            return abstractC1794;
        }
        interfaceC1695.getClass();
        return (AbstractC1794) interfaceC1695;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f5258.f5099;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final long mo3066(long j) {
        if (!mo3272().f6278) {
            AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3373();
        while (this != null) {
            C1748 c1748 = this.f5258;
            if (this == c1748.f5093.f5284 && !c1748.f5123) {
                long jM3678 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getRectManager().m3678(c1748);
                if (!C7907.m13336(jM3678, 9223372034707292159L)) {
                    return AbstractC7738.m13035(j, jM3678);
                }
            }
            InterfaceC1806 interfaceC1806 = this.f5259;
            if (interfaceC1806 != null) {
                C1911 c1911 = (C1911) interfaceC1806;
                float[] fArrM3601 = c1911.m3601();
                if (!c1911.f5641) {
                    j = C1587.m2896(j, fArrM3601);
                }
            }
            j = AbstractC7738.m13035(j, this.f5244);
            this = this.f5255;
        }
        return j;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo3067(InterfaceC1695 interfaceC1695, float[] fArr) {
        AbstractC1794 abstractC1794M3369 = m3369(interfaceC1695);
        abstractC1794M3369.m3373();
        AbstractC1794 abstractC1794M3390 = m3390(abstractC1794M3369);
        C1587.m2894(fArr);
        abstractC1794M3369.m3378(abstractC1794M3390, fArr);
        m3379(abstractC1794M3390, fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final long mo3068(long j) {
        if (!mo3272().f6278) {
            AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC1695 interfaceC1695M3103 = AbstractC1670.m3103(this);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(this.f5258);
        viewTreeObserverOnGlobalLayoutListenerC1884.m3516();
        return mo3075(interfaceC1695M3103, C7328.m12499(C1587.m2896(j, viewTreeObserverOnGlobalLayoutListenerC1884.f5488), interfaceC1695M3103.mo3066(0L)));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo3069(long j) {
        if (!mo3272().f6278) {
            AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo3075(AbstractC1670.m3103(this), ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(this.f5258)).m3524(j));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC1695 mo3070() {
        boolean z = mo3272().f6278;
        C1748 c1748 = this.f5258;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C1748 c1748M3246 = c1748; c1748M3246 != null; c1748M3246 = c1748M3246.m3246()) {
                sb.append("\n|");
                sb.append(c1748M3246);
                sb.append(" isAttached=");
                sb.append(c1748M3246.m3233());
                sb.append(" modifier=");
                sb.append(c1748M3246.f5132);
                sb.append(" tail=");
                sb.append(mo3272());
            }
            AbstractC7935.m13395(sb.toString());
        }
        m3373();
        return c1748.f5093.f5284.f5255;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3046() {
        C1748 c1748 = this.f5258;
        if (!c1748.f5093.m3418(64)) {
            return null;
        }
        mo3272();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (AbstractC2128 abstractC2128 = c1748.f5093.f5283; abstractC2128 != null; abstractC2128 = abstractC2128.f6283) {
            if ((abstractC2128.f6290 & 64) != 0) {
                ?? M3329 = abstractC2128;
                ?? c1224 = 0;
                while (M3329 != 0) {
                    if (M3329 instanceof InterfaceC1799) {
                        ref$ObjectRef.element = ((InterfaceC1799) M3329).mo1366(ref$ObjectRef.element);
                    } else if ((M3329.f6290 & 64) != 0 && (M3329 instanceof AbstractC1788)) {
                        AbstractC2128 abstractC21282 = ((AbstractC1788) M3329).f5225;
                        int i = 0;
                        M3329 = M3329;
                        c1224 = c1224;
                        while (abstractC21282 != null) {
                            if ((abstractC21282.f6290 & 64) != 0) {
                                i++;
                                c1224 = c1224;
                                if (i == 1) {
                                    M3329 = abstractC21282;
                                } else {
                                    if (c1224 == 0) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (M3329 != 0) {
                                        c1224.m2037(M3329);
                                        M3329 = 0;
                                    }
                                    c1224.m2037(abstractC21282);
                                }
                            }
                            abstractC21282 = abstractC21282.f6287;
                            M3329 = M3329;
                            c1224 = c1224;
                        }
                        if (i == 1) {
                        }
                    }
                    M3329 = AbstractC1785.m3329(c1224);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void m3370() {
        AbstractC2128 abstractC2128Mo3272;
        boolean zM3368 = AbstractC1793.m3368(128);
        AbstractC2128 abstractC2128M3383 = m3383(zM3368);
        if (abstractC2128M3383 == null || (abstractC2128M3383.f6291.f6284 & 128) == 0) {
            return;
        }
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            if (!zM3368) {
                abstractC2128Mo3272 = mo3272().f6283;
                if (abstractC2128Mo3272 == null) {
                }
            }
            abstractC2128Mo3272 = mo3272();
            for (AbstractC2128 abstractC2128M33832 = m3383(zM3368); abstractC2128M33832 != null; abstractC2128M33832 = abstractC2128M33832.f6287) {
                if ((abstractC2128M33832.f6284 & 128) == 0) {
                    break;
                }
                if ((abstractC2128M33832.f6290 & 128) != 0) {
                    ?? M3329 = abstractC2128M33832;
                    ?? c1224 = 0;
                    while (M3329 != 0) {
                        if (M3329 instanceof InterfaceC1740) {
                            ((InterfaceC1740) M3329).mo1311(this.f4997);
                        } else if ((M3329.f6290 & 128) != 0 && (M3329 instanceof AbstractC1788)) {
                            AbstractC2128 abstractC2128 = ((AbstractC1788) M3329).f5225;
                            int i = 0;
                            M3329 = M3329;
                            c1224 = c1224;
                            while (abstractC2128 != null) {
                                if ((abstractC2128.f6290 & 128) != 0) {
                                    i++;
                                    c1224 = c1224;
                                    if (i == 1) {
                                        M3329 = abstractC2128;
                                    } else {
                                        if (c1224 == 0) {
                                            c1224 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (M3329 != 0) {
                                            c1224.m2037(M3329);
                                            M3329 = 0;
                                        }
                                        c1224.m2037(abstractC2128);
                                    }
                                }
                                abstractC2128 = abstractC2128.f6287;
                                M3329 = M3329;
                                c1224 = c1224;
                            }
                            if (i == 1) {
                            }
                        }
                        M3329 = AbstractC1785.m3329(c1224);
                    }
                }
                if (abstractC2128M33832 == abstractC2128Mo3272) {
                    break;
                }
            }
        } finally {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final void m3371() {
        boolean zM3368 = AbstractC1793.m3368(4194304);
        AbstractC2128 abstractC2128Mo3272 = mo3272();
        if (!zM3368 && (abstractC2128Mo3272 = abstractC2128Mo3272.f6283) == null) {
            return;
        }
        for (AbstractC2128 abstractC2128M3383 = m3383(zM3368); abstractC2128M3383 != null && (abstractC2128M3383.f6284 & 4194304) != 0; abstractC2128M3383 = abstractC2128M3383.f6287) {
            if ((abstractC2128M3383.f6290 & 4194304) != 0) {
                ?? M3329 = abstractC2128M3383;
                ?? c1224 = 0;
                while (M3329 != 0) {
                    if (M3329 instanceof InterfaceC1776) {
                        ((InterfaceC1776) M3329).mo1566(this);
                    } else if ((M3329.f6290 & 4194304) != 0 && (M3329 instanceof AbstractC1788)) {
                        AbstractC2128 abstractC2128 = ((AbstractC1788) M3329).f5225;
                        int i = 0;
                        M3329 = M3329;
                        c1224 = c1224;
                        while (abstractC2128 != null) {
                            if ((abstractC2128.f6290 & 4194304) != 0) {
                                i++;
                                c1224 = c1224;
                                if (i == 1) {
                                    M3329 = abstractC2128;
                                } else {
                                    if (c1224 == 0) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (M3329 != 0) {
                                        c1224.m2037(M3329);
                                        M3329 = 0;
                                    }
                                    c1224.m2037(abstractC2128);
                                }
                            }
                            abstractC2128 = abstractC2128.f6287;
                            M3329 = M3329;
                            c1224 = c1224;
                        }
                        if (i == 1) {
                        }
                    }
                    M3329 = AbstractC1785.m3329(c1224);
                }
            }
            if (abstractC2128M3383 == abstractC2128Mo3272) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m3372() {
        InterfaceC1806 interfaceC1806 = this.f5259;
        if (interfaceC1806 != null) {
            ((C1911) interfaceC1806).m3600();
            return;
        }
        AbstractC1794 abstractC1794 = this.f5255;
        if (abstractC1794 != null) {
            abstractC1794.m3372();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public void mo3316(InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z) {
        AbstractC1794 abstractC1794 = this.f5256;
        if (abstractC1794 != null) {
            abstractC1794.m3382(interfaceC1810, abstractC1794.m3391(j), c1780, i, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void m3373() {
        this.f5258.f5131.m3290();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final boolean m3374() {
        if (this.f5259 != null && this.f5251 <= 0.0f) {
            return true;
        }
        AbstractC1794 abstractC1794 = this.f5255;
        if (abstractC1794 != null) {
            return abstractC1794.m3374();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final C7327 m3375() {
        if (mo3272().f6278) {
            InterfaceC1695 interfaceC1695M3103 = AbstractC1670.m3103(this);
            C7329 c7329 = this.f5246;
            if (c7329 == null) {
                c7329 = new C7329();
                this.f5246 = c7329;
            }
            long jM3394 = m3394(m3393());
            int i = (int) (jM3394 >> 32);
            c7329.f19550 = -Float.intBitsToFloat(i);
            int i2 = (int) (jM3394 & 4294967295L);
            c7329.f19549 = -Float.intBitsToFloat(i2);
            c7329.f19548 = Float.intBitsToFloat(i) + mo3129();
            c7329.f19547 = Float.intBitsToFloat(i2) + mo3128();
            while (this != interfaceC1695M3103) {
                this.m3387(c7329, false, true);
                if (!c7329.m12507()) {
                    this = this.f5255;
                    this.getClass();
                }
            }
            return new C7327(c7329.f19550, c7329.f19549, c7329.f19548, c7329.f19547);
        }
        return C7327.f19541;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m3376(InterfaceC1657 interfaceC1657) {
        AbstractC1794 abstractC1794;
        InterfaceC1657 interfaceC16572 = this.f5247;
        if (interfaceC1657 != interfaceC16572) {
            this.f5247 = interfaceC1657;
            C1748 c1748 = this.f5258;
            int i = 0;
            if (interfaceC16572 == null || interfaceC1657.mo1463() != interfaceC16572.mo1463() || interfaceC1657.mo1464() != interfaceC16572.mo1464()) {
                int iMo1463 = interfaceC1657.mo1463();
                int iMo1464 = interfaceC1657.mo1464();
                InterfaceC1806 interfaceC1806 = this.f5259;
                if (interfaceC1806 != null) {
                    ((C1911) interfaceC1806).m3598((((long) iMo1463) << 32) | (((long) iMo1464) & 4294967295L));
                } else if (c1748.m3232() && (abstractC1794 = this.f5255) != null) {
                    abstractC1794.m3372();
                }
                m3131((((long) iMo1464) & 4294967295L) | (((long) iMo1463) << 32));
                if (this.f5250 != null) {
                    m3400(false);
                }
                boolean zM3368 = AbstractC1793.m3368(4);
                AbstractC2128 abstractC2128Mo3272 = mo3272();
                if (zM3368 || (abstractC2128Mo3272 = abstractC2128Mo3272.f6283) != null) {
                    for (AbstractC2128 abstractC2128M3383 = m3383(zM3368); abstractC2128M3383 != null && (abstractC2128M3383.f6284 & 4) != 0; abstractC2128M3383 = abstractC2128M3383.f6287) {
                        if ((abstractC2128M3383.f6290 & 4) != 0) {
                            ?? M3329 = abstractC2128M3383;
                            ?? c1224 = 0;
                            while (M3329 != 0) {
                                if (M3329 instanceof InterfaceC1781) {
                                    ((InterfaceC1781) M3329).mo2561();
                                } else if ((M3329.f6290 & 4) != 0 && (M3329 instanceof AbstractC1788)) {
                                    AbstractC2128 abstractC2128 = ((AbstractC1788) M3329).f5225;
                                    int i2 = 0;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                    while (abstractC2128 != null) {
                                        if ((abstractC2128.f6290 & 4) != 0) {
                                            i2++;
                                            c1224 = c1224;
                                            if (i2 == 1) {
                                                M3329 = abstractC2128;
                                            } else {
                                                if (c1224 == 0) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (M3329 != 0) {
                                                    c1224.m2037(M3329);
                                                    M3329 = 0;
                                                }
                                                c1224.m2037(abstractC2128);
                                            }
                                        }
                                        abstractC2128 = abstractC2128.f6287;
                                        M3329 = M3329;
                                        c1224 = c1224;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3329 = AbstractC1785.m3329(c1224);
                            }
                        }
                        if (abstractC2128M3383 == abstractC2128Mo3272) {
                            break;
                        }
                    }
                }
                InterfaceC1801 interfaceC1801 = c1748.f5104;
                if (interfaceC1801 != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3520(c1748);
                }
                c1748.m3223(this);
            }
            C0252 c0252 = this.f5248;
            if ((c0252 == null || c0252.f914 == 0) && interfaceC1657.mo1462().isEmpty()) {
                return;
            }
            C0252 c02522 = this.f5248;
            Map mapMo1462 = interfaceC1657.mo1462();
            if (c02522 != null && c02522.f914 == mapMo1462.size()) {
                Object[] objArr = c02522.f917;
                int[] iArr = c02522.f916;
                long[] jArr = c02522.f918;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapMo1462.get((AbstractC1689) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            c1748.f5131.f5166.f5019.m3314();
            C0252 c02523 = this.f5248;
            if (c02523 == null) {
                C0252 c02524 = AbstractC0234.f874;
                c02523 = new C0252();
                this.f5248 = c02523;
            }
            c02523.m806();
            for (Map.Entry entry : interfaceC1657.mo1462().entrySet()) {
                c02523.m807(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m3377(final AbstractC2128 abstractC2128, final InterfaceC1810 interfaceC1810, final long j, final C1780 c1780, final int i, final boolean z, final float f) {
        int i2;
        if (abstractC2128 == null) {
            mo3316(interfaceC1810, j, c1780, i, z);
            return;
        }
        if (!interfaceC1810.mo3406(abstractC2128)) {
            m3377(AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410()), interfaceC1810, j, c1780, i, z, f);
            return;
        }
        if (!interfaceC1810.mo3408(abstractC2128)) {
            m3389(AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410()), interfaceC1810, j, c1780, i, z, f, false);
            return;
        }
        InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3152invoke() {
                AbstractC1794 abstractC1794 = this.this$0;
                AbstractC2128 abstractC2128M3330 = AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410());
                InterfaceC1810 interfaceC18102 = interfaceC1810;
                long j2 = j;
                C1780 c17802 = c1780;
                int i3 = i;
                boolean z2 = z;
                float f2 = f;
                InterfaceC6557 interfaceC6557 = AbstractC1794.f5238;
                abstractC1794.m3389(abstractC2128M3330, interfaceC18102, j2, c17802, i3, z2, f2, false);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3152invoke();
                return C5175.f14739;
            }
        };
        C0255 c0255 = c1780.f5218;
        C0244 c0244 = c1780.f5220;
        int i3 = c1780.f5219;
        int i4 = c0244.f1004;
        if (i3 != i4 - 1) {
            long jM3322 = c1780.m3322();
            int i5 = c1780.f5219;
            int i6 = c0244.f1004;
            int i7 = i6 - 1;
            c1780.f5219 = i7;
            c1780.m3321(i6, c0244.f1004);
            c1780.f5219++;
            c0244.m774(abstractC2128);
            c0255.m818(AbstractC1785.m3333(f, z, false));
            interfaceC6542.invoke();
            c1780.f5219 = i7;
            long jM33222 = c1780.m3322();
            if (c1780.f5219 + 1 >= c0244.f1004 - 1 || AbstractC1785.m3347(jM3322, jM33222) <= 0) {
                c1780.m3321(c1780.f5219 + 1, c0244.f1004);
            } else {
                int i8 = i5 + 1;
                boolean zM3345 = AbstractC1785.m3345(jM33222);
                int i9 = c1780.f5219;
                c1780.m3321(i8, zM3345 ? i9 + 2 : i9 + 1);
            }
            c1780.f5219 = i5;
            return;
        }
        int i10 = i3 + 1;
        c1780.m3321(i10, i4);
        c1780.f5219++;
        c0244.m774(abstractC2128);
        c0255.m818(AbstractC1785.m3333(f, z, false));
        interfaceC6542.invoke();
        c1780.f5219 = i3;
        if (i10 == c0244.f1004 - 1 || AbstractC1785.m3345(c1780.m3322())) {
            int i11 = c1780.f5219;
            int i12 = i11 + 1;
            c0244.m776(i12);
            if (i12 < 0 || i12 >= (i2 = c0255.f930)) {
                C7546.m12743("Index must be between 0 and size");
                return;
            }
            long[] jArr = c0255.f931;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                AbstractC4346.m8835(jArr, jArr, i12, i11 + 2, i2);
            }
            c0255.f930--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m3378(AbstractC1794 abstractC1794, float[] fArr) {
        while (!this.equals(abstractC1794)) {
            InterfaceC1806 interfaceC1806 = this.f5259;
            if (interfaceC1806 != null) {
                C1587.m2893(fArr, ((C1911) interfaceC1806).m3601());
            }
            if (!C7907.m13336(this.f5244, 0L)) {
                float[] fArr2 = f5234;
                C1587.m2894(fArr2);
                C1587.m2892(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                C1587.m2893(fArr, fArr2);
            }
            this = this.f5255;
            this.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void m3379(AbstractC1794 abstractC1794, float[] fArr) {
        float[] fArrM3602;
        if (AbstractC4394.m8917(abstractC1794, this)) {
            return;
        }
        AbstractC1794 abstractC17942 = this.f5255;
        abstractC17942.getClass();
        abstractC17942.m3379(abstractC1794, fArr);
        if (!C7907.m13336(this.f5244, 0L)) {
            float[] fArr2 = f5234;
            C1587.m2894(fArr2);
            long j = this.f5244;
            C1587.m2892(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            C1587.m2893(fArr, fArr2);
        }
        InterfaceC1806 interfaceC1806 = this.f5259;
        if (interfaceC1806 == null || (fArrM3602 = ((C1911) interfaceC1806).m3602()) == null) {
            return;
        }
        C1587.m2893(fArr, fArrM3602);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final AbstractC2128 m3380(int i) {
        boolean zM3368 = AbstractC1793.m3368(i);
        AbstractC2128 abstractC2128Mo3272 = mo3272();
        if (!zM3368 && (abstractC2128Mo3272 = abstractC2128Mo3272.f6283) == null) {
            return null;
        }
        for (AbstractC2128 abstractC2128M3383 = m3383(zM3368); abstractC2128M3383 != null && (abstractC2128M3383.f6284 & i) != 0; abstractC2128M3383 = abstractC2128M3383.f6287) {
            if ((abstractC2128M3383.f6290 & i) != 0) {
                return abstractC2128M3383;
            }
            if (abstractC2128M3383 == abstractC2128Mo3272) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public abstract AbstractC2128 mo3272();

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m3381(AbstractC2128 abstractC2128, InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z, float f) {
        if (abstractC2128 == null) {
            mo3316(interfaceC1810, j, c1780, i, z);
            return;
        }
        if (!interfaceC1810.mo3406(abstractC2128)) {
            m3381(AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410()), interfaceC1810, j, c1780, i, z, f);
            return;
        }
        int i2 = c1780.f5219;
        C0244 c0244 = c1780.f5220;
        c1780.m3321(i2 + 1, c0244.f1004);
        c1780.f5219++;
        c0244.m774(abstractC2128);
        c1780.f5218.m818(AbstractC1785.m3333(f, z, false));
        m3389(AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410()), interfaceC1810, j, c1780, i, z, f, true);
        c1780.f5219 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m3382(InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z) {
        boolean z2;
        boolean z3;
        AbstractC2128 abstractC2128M3380 = m3380(interfaceC1810.mo3410());
        if (!m3399(j)) {
            if (i == 1) {
                float fM3397 = m3397(j, m3393());
                if ((Float.floatToRawIntBits(fM3397) & Integer.MAX_VALUE) < 2139095040) {
                    if (c1780.f5219 != c1780.f5220.f1004 - 1) {
                        if (AbstractC1785.m3347(c1780.m3322(), AbstractC1785.m3333(fM3397, false, false)) <= 0) {
                            return;
                        }
                    }
                    m3381(abstractC2128M3380, interfaceC1810, j, c1780, i, false, fM3397);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC2128M3380 == null) {
            mo3316(interfaceC1810, j, c1780, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo3129() && fIntBitsToFloat2 < mo3128()) {
            m3384(abstractC2128M3380, interfaceC1810, j, c1780, i, z);
            return;
        }
        float fM33972 = i == 1 ? m3397(j, m3393()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM33972) & Integer.MAX_VALUE) < 2139095040) {
            if (c1780.f5219 != c1780.f5220.f1004 - 1) {
                z2 = z;
                if (AbstractC1785.m3347(c1780.m3322(), AbstractC1785.m3333(fM33972, z2, false)) > 0) {
                }
                m3389(abstractC2128M3380, interfaceC1810, j, c1780, i, z2, fM33972, z3);
            }
            z2 = z;
            z3 = true;
            m3389(abstractC2128M3380, interfaceC1810, j, c1780, i, z2, fM33972, z3);
        }
        z2 = z;
        z3 = false;
        m3389(abstractC2128M3380, interfaceC1810, j, c1780, i, z2, fM33972, z3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final AbstractC2128 m3383(boolean z) {
        AbstractC2128 abstractC2128Mo3272;
        C1811 c1811 = this.f5258.f5093;
        if (c1811.f5284 == this) {
            return c1811.f5282;
        }
        AbstractC1794 abstractC1794 = this.f5255;
        if (!z) {
            if (abstractC1794 != null) {
                return abstractC1794.mo3272();
            }
            return null;
        }
        if (abstractC1794 == null || (abstractC2128Mo3272 = abstractC1794.mo3272()) == null) {
            return null;
        }
        return abstractC2128Mo3272.f6287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m3384(AbstractC2128 abstractC2128, InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z) {
        if (abstractC2128 == null) {
            mo3316(interfaceC1810, j, c1780, i, z);
            return;
        }
        if (!interfaceC1810.mo3406(abstractC2128)) {
            m3384(AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410()), interfaceC1810, j, c1780, i, z);
            return;
        }
        int i2 = c1780.f5219;
        C0244 c0244 = c1780.f5220;
        c1780.m3321(i2 + 1, c0244.f1004);
        c1780.f5219++;
        c0244.m774(abstractC2128);
        c1780.f5218.m818(AbstractC1785.m3333(-1.0f, z, false));
        m3384(AbstractC1785.m3330(abstractC2128, interfaceC1810.mo3410()), interfaceC1810, j, c1780, i, z);
        c1780.f5219 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void m3385(long j, float f, InterfaceC6557 interfaceC6557) {
        m3401(interfaceC6557, false);
        boolean zM13336 = C7907.m13336(this.f5244, j);
        C1748 c1748 = this.f5258;
        if (!zM13336) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).m3514(-4.0f);
            this.f5244 = j;
            InterfaceC1806 interfaceC1806 = this.f5259;
            if (interfaceC1806 != null) {
                ((C1911) interfaceC1806).m3599(j);
            } else {
                AbstractC1794 abstractC1794 = this.f5255;
                if (abstractC1794 != null) {
                    abstractC1794.m3372();
                }
            }
            c1748.m3223(this);
            AbstractC1754.m3278(this);
            InterfaceC1801 interfaceC1801 = c1748.f5104;
            if (interfaceC1801 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3520(c1748);
            }
        }
        this.f5243 = f;
        if (this == c1748.f5093.f5284) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getRectManager().m3676(c1748);
        }
        if (this.f5146) {
            return;
        }
        m3283(mo3191());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public abstract void mo3273(InterfaceC1601 interfaceC1601, C1516 c1516);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void m3386() {
        if (this.f5259 != null) {
            m3401(null, false);
            this.f5258.m3215(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3387(p112.C7329 r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1794.m3387(飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏哲兰, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void m3388() {
        boolean zM3368 = AbstractC1793.m3368(1048576);
        AbstractC2128 abstractC2128M3383 = m3383(zM3368);
        if (abstractC2128M3383 == null || (abstractC2128M3383.f6291.f6284 & 1048576) == 0) {
            return;
        }
        AbstractC2128 abstractC2128Mo3272 = mo3272();
        if (!zM3368 && (abstractC2128Mo3272 = abstractC2128Mo3272.f6283) == null) {
            return;
        }
        for (AbstractC2128 abstractC2128M33832 = m3383(zM3368); abstractC2128M33832 != null && (abstractC2128M33832.f6284 & 1048576) != 0; abstractC2128M33832 = abstractC2128M33832.f6287) {
            if ((abstractC2128M33832.f6290 & 1048576) != 0) {
                AbstractC2128 abstractC2128M3329 = abstractC2128M33832;
                C1224 c1224 = null;
                while (abstractC2128M3329 != null) {
                    if ((abstractC2128M3329.f6290 & 1048576) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                        int i = 0;
                        for (AbstractC2128 abstractC2128 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
                            if ((abstractC2128.f6290 & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC2128M3329 = abstractC2128;
                                } else {
                                    if (c1224 == null) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (abstractC2128M3329 != null) {
                                        c1224.m2037(abstractC2128M3329);
                                        abstractC2128M3329 = null;
                                    }
                                    c1224.m2037(abstractC2128);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC2128M3329 = AbstractC1785.m3329(c1224);
                }
            }
            if (abstractC2128M33832 == abstractC2128Mo3272) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9 A[PHI: r4
  0x01a9: PHI (r4v11 ??) = (r4v1 ??), (r4v1 ??), (r4v13 ??) binds: [B:57:0x0175, B:59:0x0179, B:73:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3389(final androidx.compose.ui.AbstractC2128 r17, final androidx.compose.ui.node.InterfaceC1810 r18, final long r19, final androidx.compose.ui.node.C1780 r21, int r22, final boolean r23, final float r24, final boolean r25) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1794.m3389(androidx.compose.ui.飘花落叶言子楪哲苏世兰, androidx.compose.ui.node.飘花落叶言子苏楪兰哲世, long, androidx.compose.ui.node.飘花落叶言子楪哲兰苏世, int, boolean, float, boolean):void");
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final AbstractC1754 mo3190() {
        return this.f5255;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final InterfaceC1657 mo3191() {
        InterfaceC1657 interfaceC1657 = this.f5247;
        if (interfaceC1657 != null) {
            return interfaceC1657;
        }
        C5919.m11250("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final long mo3192() {
        return this.f5244;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final AbstractC1794 m3390(AbstractC1794 abstractC1794) {
        C1748 c1748M3246 = abstractC1794.f5258;
        C1748 c1748 = this.f5258;
        if (c1748M3246 == c1748) {
            AbstractC2128 abstractC2128Mo3272 = abstractC1794.mo3272();
            AbstractC2128 abstractC2128Mo32722 = mo3272();
            if (!abstractC2128Mo32722.f6291.f6278) {
                AbstractC7935.m13395("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC2128 abstractC2128 = abstractC2128Mo32722.f6291.f6283; abstractC2128 != null; abstractC2128 = abstractC2128.f6283) {
                if ((abstractC2128.f6290 & 2) != 0 && abstractC2128 == abstractC2128Mo3272) {
                    return abstractC1794;
                }
            }
            return this;
        }
        while (c1748M3246.f5114 > c1748.f5114) {
            c1748M3246 = c1748M3246.m3246();
            c1748M3246.getClass();
        }
        C1748 c1748M32462 = c1748;
        while (c1748M32462.f5114 > c1748M3246.f5114) {
            c1748M32462 = c1748M32462.m3246();
            c1748M32462.getClass();
        }
        while (c1748M3246 != c1748M32462) {
            c1748M3246 = c1748M3246.m3246();
            c1748M32462 = c1748M32462.m3246();
            if (c1748M3246 == null || c1748M32462 == null) {
                C5919.m11249("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c1748M32462 != c1748) {
            if (c1748M3246 != abstractC1794.f5258) {
                return c1748M3246.f5093.f5285;
            }
            return abstractC1794;
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final long m3391(long j) {
        long j2 = this.f5244;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        InterfaceC1806 interfaceC1806 = this.f5259;
        if (interfaceC1806 != null) {
            C1911 c1911 = (C1911) interfaceC1806;
            float[] fArrM3602 = c1911.m3602();
            if (fArrM3602 == null) {
                return 9187343241974906880L;
            }
            if (!c1911.f5641) {
                return C1587.m2896(jFloatToRawIntBits, fArrM3602);
            }
        }
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void m3392(InterfaceC1601 interfaceC1601, C1516 c1516) {
        AbstractC1794 abstractC1794;
        InterfaceC1601 interfaceC16012;
        C1516 c15162;
        AbstractC2128 abstractC2128M3380 = m3380(4);
        if (abstractC2128M3380 == null) {
            mo3273(interfaceC1601, c1516);
            return;
        }
        C1748 c1748 = this.f5258;
        c1748.getClass();
        C1758 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getSharedDrawScope();
        long jM13654 = AbstractC8189.m13654(this.f4997);
        sharedDrawScope.getClass();
        C1224 c1224 = null;
        while (abstractC2128M3380 != null) {
            if (abstractC2128M3380 instanceof InterfaceC1781) {
                abstractC1794 = this;
                interfaceC16012 = interfaceC1601;
                c15162 = c1516;
                sharedDrawScope.m3300(interfaceC16012, jM13654, abstractC1794, (InterfaceC1781) abstractC2128M3380, c15162);
            } else {
                abstractC1794 = this;
                interfaceC16012 = interfaceC1601;
                c15162 = c1516;
                if ((abstractC2128M3380.f6290 & 4) != 0 && (abstractC2128M3380 instanceof AbstractC1788)) {
                    int i = 0;
                    for (AbstractC2128 abstractC2128 = ((AbstractC1788) abstractC2128M3380).f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
                        if ((abstractC2128.f6290 & 4) != 0) {
                            i++;
                            if (i == 1) {
                                abstractC2128M3380 = abstractC2128;
                            } else {
                                if (c1224 == null) {
                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                }
                                if (abstractC2128M3380 != null) {
                                    c1224.m2037(abstractC2128M3380);
                                    abstractC2128M3380 = null;
                                }
                                c1224.m2037(abstractC2128);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC1601 = interfaceC16012;
                this = abstractC1794;
                c1516 = c15162;
            }
            abstractC2128M3380 = AbstractC1785.m3329(c1224);
            interfaceC1601 = interfaceC16012;
            this = abstractC1794;
            c1516 = c15162;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public abstract void mo3274();

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final long m3393() {
        return this.f5249.mo1332(this.f5258.f5095.mo3269());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract AbstractC1745 mo3275();

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final AbstractC1754 mo3193() {
        return this.f5256;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final C1748 mo3194() {
        return this.f5258;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo3196() {
        return this.f5247 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final long m3394(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo3129();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo3128();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final long m3395(AbstractC1794 abstractC1794, long j) {
        if (abstractC1794 == this) {
            return j;
        }
        AbstractC1794 abstractC17942 = this.f5255;
        return (abstractC17942 == null || AbstractC4394.m8917(abstractC1794, abstractC17942)) ? m3391(j) : m3391(abstractC17942.m3395(abstractC1794, j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m3396(InterfaceC1601 interfaceC1601, C1516 c1516) {
        InterfaceC1806 interfaceC1806 = this.f5259;
        if (interfaceC1806 == null) {
            long j = this.f5244;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC1601.mo2675(f, f2);
            m3392(interfaceC1601, c1516);
            interfaceC1601.mo2675(-f, -f2);
            return;
        }
        C1911 c1911 = (C1911) interfaceC1806;
        C1507 c1507 = c1911.f5635;
        c1911.m3603();
        c1911.f5640 = c1911.f5653.f4355.mo2720() > 0.0f;
        C0108 c0108 = c1507.f4283;
        c0108.m364(interfaceC1601);
        c0108.f320 = c1516;
        c1911.f5653.m2785(c1507.mo2696().m385(), (C1516) c1507.mo2696().f320);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final float m3397(long j, long j2) {
        if (mo3129() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo3128() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3394 = m3394(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3394 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3394 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo3129());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo3128()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo3201() {
        mo3118(this.f5244, this.f5243, this.f5250);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void m3398(AbstractC1794 abstractC1794, C7329 c7329, boolean z) {
        if (abstractC1794 == this) {
            return;
        }
        AbstractC1794 abstractC17942 = this.f5255;
        if (abstractC17942 != null) {
            abstractC17942.m3398(abstractC1794, c7329, z);
        }
        long j = this.f5244;
        float f = (int) (j >> 32);
        c7329.f19550 -= f;
        c7329.f19548 -= f;
        float f2 = (int) (j & 4294967295L);
        c7329.f19549 -= f2;
        c7329.f19547 -= f2;
        InterfaceC1806 interfaceC1806 = this.f5259;
        if (interfaceC1806 != null) {
            C1911 c1911 = (C1911) interfaceC1806;
            float[] fArrM3602 = c1911.m3602();
            if (!c1911.f5641) {
                if (fArrM3602 == null) {
                    c7329.f19550 = 0.0f;
                    c7329.f19549 = 0.0f;
                    c7329.f19548 = 0.0f;
                    c7329.f19547 = 0.0f;
                } else {
                    C1587.m2895(fArrM3602, c7329);
                }
            }
            if (this.f5253 && z) {
                long j2 = this.f4997;
                c7329.m12508(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo3071(InterfaceC1695 interfaceC1695, long j) {
        return mo3075(interfaceC1695, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3072(long j) {
        long jMo3066 = mo3066(j);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(this.f5258);
        viewTreeObserverOnGlobalLayoutListenerC1884.m3516();
        return C1587.m2896(jMo3066, viewTreeObserverOnGlobalLayoutListenerC1884.f5492);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f5258.f5098.mo1246();
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3245() {
        return (this.f5259 == null || this.f5254 || !this.f5258.m3233()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo3074(long j) {
        if (!mo3272().f6278) {
            AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(this.f5258)).m3528(mo3066(j));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo3075(InterfaceC1695 interfaceC1695, long j) {
        if (interfaceC1695 instanceof C1663) {
            C1663 c1663 = (C1663) interfaceC1695;
            c1663.f4877.f5062.m3373();
            return c1663.mo3075(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC1794 abstractC1794M3369 = m3369(interfaceC1695);
        abstractC1794M3369.m3373();
        AbstractC1794 abstractC1794M3390 = m3390(abstractC1794M3369);
        while (abstractC1794M3369 != abstractC1794M3390) {
            InterfaceC1806 interfaceC1806 = abstractC1794M3369.f5259;
            if (interfaceC1806 != null) {
                C1911 c1911 = (C1911) interfaceC1806;
                float[] fArrM3601 = c1911.m3601();
                if (!c1911.f5641) {
                    j = C1587.m2896(j, fArrM3601);
                }
            }
            j = AbstractC7738.m13035(j, abstractC1794M3369.f5244);
            abstractC1794M3369 = abstractC1794M3369.f5255;
            abstractC1794M3369.getClass();
        }
        return m3395(abstractC1794M3390, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo3076() {
        return mo3272().f6278;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3077(float[] fArr) {
        InterfaceC1801 interfaceC1801M3296 = AbstractC1757.m3296(this.f5258);
        AbstractC1794 abstractC1794M3369 = m3369(AbstractC1670.m3103(this));
        m3378(abstractC1794M3369, fArr);
        if (interfaceC1801M3296 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3296).m3529(fArr);
            return;
        }
        long jMo3074 = abstractC1794M3369.mo3074(0L);
        if ((9223372034707292159L & jMo3074) != 9205357640488583168L) {
            C1587.m2892(fArr, Float.intBitsToFloat((int) (jMo3074 >> 32)), Float.intBitsToFloat((int) (jMo3074 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final long mo3078() {
        return this.f4997;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C7327 mo3079(InterfaceC1695 interfaceC1695, boolean z) {
        if (!mo3272().f6278) {
            AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC1695.mo3076()) {
            AbstractC7935.m13395("LayoutCoordinates " + interfaceC1695 + " is not attached!");
        }
        AbstractC1794 abstractC1794M3369 = m3369(interfaceC1695);
        abstractC1794M3369.m3373();
        AbstractC1794 abstractC1794M3390 = m3390(abstractC1794M3369);
        C7329 c7329 = this.f5246;
        if (c7329 == null) {
            c7329 = new C7329();
            this.f5246 = c7329;
        }
        c7329.f19550 = 0.0f;
        c7329.f19549 = 0.0f;
        c7329.f19548 = (int) (interfaceC1695.mo3078() >> 32);
        c7329.f19547 = (int) (interfaceC1695.mo3078() & 4294967295L);
        while (abstractC1794M3369 != abstractC1794M3390) {
            abstractC1794M3369.m3387(c7329, z, false);
            if (c7329.m12507()) {
                return C7327.f19541;
            }
            abstractC1794M3369 = abstractC1794M3369.f5255;
            abstractC1794M3369.getClass();
        }
        m3398(abstractC1794M3390, c7329, z);
        return new C7327(c7329.f19550, c7329.f19549, c7329.f19548, c7329.f19547);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f5258.f5098.mo1247();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3399(long r24) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1794.m3399(long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void m3400(boolean z) {
        char c;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884;
        boolean z2;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842;
        InterfaceC1801 interfaceC1801;
        InterfaceC6542 interfaceC6542;
        InterfaceC6542 interfaceC65422;
        InterfaceC1806 interfaceC1806 = this.f5259;
        final InterfaceC6557 interfaceC6557 = this.f5250;
        if (interfaceC1806 == null) {
            if (interfaceC6557 == null) {
                return;
            }
            AbstractC7935.m13395("null layer with a non-null layerBlock");
            return;
        }
        if (interfaceC6557 == null) {
            throw AbstractC0053.m139("updateLayerParameters requires a non-null layerBlock");
        }
        C1573 c1573 = f5236;
        c1573.m2846();
        C1748 c1748 = this.f5258;
        c1573.f4642 = c1748.f5098;
        c1573.f4641 = c1748.f5099;
        c1573.f4643 = AbstractC8189.m13654(this.f4997);
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getSnapshotObserver().f5273.m2236(this, f5238, new InterfaceC6542() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3153invoke() {
                InterfaceC6557 interfaceC65572 = interfaceC6557;
                C1573 c15732 = AbstractC1794.f5236;
                interfaceC65572.invoke(c15732);
                boolean zM8917 = AbstractC4394.m8917(this.f5241, c15732.f4633);
                AbstractC1794 abstractC1794 = this;
                boolean z3 = abstractC1794.f5242;
                boolean z4 = c15732.f4632;
                boolean z5 = z3 != z4;
                if (!zM8917 || z5) {
                    abstractC1794.f5241 = c15732.f4633;
                    abstractC1794.f5242 = z4;
                    if (abstractC1794.f5261 && (z5 || (z4 && !zM8917))) {
                        abstractC1794.f5258.m3235();
                    }
                }
                this.f5261 = true;
                c15732.f4638 = c15732.f4633.mo1912(c15732.f4643, c15732.f4641, c15732.f4642);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3153invoke();
                return C5175.f14739;
            }
        });
        C1775 c1775 = this.f5245;
        if (c1775 == null) {
            c1775 = new C1775();
            this.f5245 = c1775;
        }
        C1775 c17752 = f5235;
        c17752.getClass();
        c17752.f5209 = c1775.f5209;
        c17752.f5208 = c1775.f5208;
        c17752.f5207 = c1775.f5207;
        c17752.f5206 = c1775.f5206;
        c17752.f5205 = c1775.f5205;
        c17752.f5204 = c1775.f5204;
        c17752.f5211 = c1775.f5211;
        c17752.f5210 = c1775.f5210;
        float f = c1573.f4650;
        c1775.f5209 = f;
        c1775.f5208 = c1573.f4651;
        c1775.f5207 = c1573.f4644;
        c1775.f5206 = c1573.f4648;
        c1775.f5205 = c1573.f4637;
        c1775.f5204 = c1573.f4636;
        c1775.f5211 = c1573.f4635;
        long j = c1573.f4634;
        c1775.f5210 = j;
        C1911 c1911 = (C1911) interfaceC1806;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18843 = c1911.f5652;
        int i = c1573.f4652 | c1911.f5634;
        c1911.f5636 = c1573.f4641;
        c1911.f5637 = c1573.f4642;
        int i2 = i & 4096;
        if (i2 != 0) {
            c1911.f5633 = j;
        }
        if ((i & 1) != 0) {
            InterfaceC1514 interfaceC1514 = c1911.f5653.f4355;
            if (interfaceC1514.mo2728() != f) {
                interfaceC1514.mo2734(f);
            }
        }
        if ((i & 2) != 0) {
            C1516 c1516 = c1911.f5653;
            float f2 = c1573.f4651;
            InterfaceC1514 interfaceC15142 = c1516.f4355;
            if (interfaceC15142.mo2709() != f2) {
                interfaceC15142.mo2746(f2);
            }
        }
        if ((i & 4) != 0) {
            c1911.f5653.m2782(c1573.f4645);
        }
        if ((i & 8) != 0) {
            C1516 c15162 = c1911.f5653;
            float f3 = c1573.f4644;
            InterfaceC1514 interfaceC15143 = c15162.f4355;
            if (interfaceC15143.mo2717() != f3) {
                interfaceC15143.mo2724(f3);
            }
        }
        if ((i & 16) != 0) {
            C1516 c15163 = c1911.f5653;
            float f4 = c1573.f4648;
            InterfaceC1514 interfaceC15144 = c15163.f4355;
            if (interfaceC15144.mo2731() != f4) {
                interfaceC15144.mo2725(f4);
            }
        }
        if ((i & 32) != 0) {
            C1516 c15164 = c1911.f5653;
            float f5 = c1573.f4649;
            InterfaceC1514 interfaceC15145 = c15164.f4355;
            if (interfaceC15145.mo2720() != f5) {
                interfaceC15145.mo2727(f5);
                c15164.f4369 = true;
                c15164.m2787();
            }
            if (c1573.f4649 > 0.0f && !c1911.f5640 && (interfaceC65422 = c1911.f5645) != null) {
                interfaceC65422.invoke();
            }
        }
        if ((i & 64) != 0) {
            C1516 c15165 = c1911.f5653;
            long j2 = c1573.f4646;
            InterfaceC1514 interfaceC15146 = c15165.f4355;
            if (!C1599.m2939(j2, interfaceC15146.mo2740())) {
                interfaceC15146.mo2736(j2);
            }
        }
        if ((i & 128) != 0) {
            C1516 c15166 = c1911.f5653;
            long j3 = c1573.f4647;
            InterfaceC1514 interfaceC15147 = c15166.f4355;
            if (!C1599.m2939(j3, interfaceC15147.mo2735())) {
                interfaceC15147.mo2723(j3);
            }
        }
        if ((i & 1024) != 0) {
            InterfaceC1514 interfaceC15148 = c1911.f5653.f4355;
            if (interfaceC15148.mo2742() != 0.0f) {
                interfaceC15148.mo2713();
            }
        }
        if ((i & 256) != 0) {
            C1516 c15167 = c1911.f5653;
            float f6 = c1573.f4637;
            InterfaceC1514 interfaceC15149 = c15167.f4355;
            if (interfaceC15149.mo2715() != f6) {
                interfaceC15149.mo2712(f6);
            }
        }
        if ((i & 512) != 0) {
            C1516 c15168 = c1911.f5653;
            float f7 = c1573.f4636;
            InterfaceC1514 interfaceC151410 = c15168.f4355;
            if (interfaceC151410.mo2737() != f7) {
                interfaceC151410.mo2729(f7);
            }
        }
        if ((i & 2048) != 0) {
            C1516 c15169 = c1911.f5653;
            float f8 = c1573.f4635;
            InterfaceC1514 interfaceC151411 = c15169.f4355;
            if (interfaceC151411.mo2718() != f8) {
                interfaceC151411.mo2721(f8);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zM2975 = C1615.m2975(c1911.f5633, C1615.f4726);
            C1516 c151610 = c1911.f5653;
            if (!zM2975) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c1911.f5633 & 4294967295L)) * ((int) (c1911.f5649 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c1911.f5633 >> 32)) * ((int) (c1911.f5649 >> 32)))) << 32);
                if (!C7328.m12501(c151610.f4361, jFloatToRawIntBits)) {
                    c151610.f4361 = jFloatToRawIntBits;
                    c151610.f4355.mo2739(jFloatToRawIntBits);
                }
            } else if (!C7328.m12501(c151610.f4361, 9205357640488583168L)) {
                c151610.f4361 = 9205357640488583168L;
                c151610.f4355.mo2739(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            C1516 c151611 = c1911.f5653;
            boolean z3 = c1573.f4632;
            if (c151611.f4358 != z3) {
                c151611.f4358 = z3;
                c151611.f4369 = true;
                c151611.m2787();
            }
        }
        if ((131072 & i) != 0) {
            C1516 c151612 = c1911.f5653;
            C1606 c1606 = c1573.f4640;
            InterfaceC1514 interfaceC151412 = c151612.f4355;
            if (!AbstractC4394.m8917(interfaceC151412.mo2726(), c1606)) {
                interfaceC151412.mo2719(c1606);
            }
        }
        if ((262144 & i) != 0) {
            InterfaceC1514 interfaceC151413 = c1911.f5653.f4355;
            if (!AbstractC4394.m8917(interfaceC151413.mo2745(), null)) {
                interfaceC151413.mo2733();
            }
        }
        if ((524288 & i) != 0) {
            C1516 c151613 = c1911.f5653;
            int i3 = c1573.f4639;
            InterfaceC1514 interfaceC151414 = c151613.f4355;
            if (interfaceC151414.mo2711() != i3) {
                interfaceC151414.mo2743(i3);
            }
        }
        if ((32768 & i) != 0) {
            InterfaceC1514 interfaceC151415 = c1911.f5653.f4355;
            if (interfaceC151415.mo2748() != 0) {
                interfaceC151415.mo2714(0);
            }
        }
        if ((i & 7963) != 0) {
            c1911.f5643 = true;
            c1911.f5642 = true;
        }
        if (AbstractC4394.m8917(c1911.f5644, c1573.f4638)) {
            viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
            z2 = false;
        } else {
            AbstractC1581 abstractC1581 = c1573.f4638;
            c1911.f5644 = abstractC1581;
            if (abstractC1581 == null) {
                viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
            } else {
                C1516 c151614 = c1911.f5653;
                if (abstractC1581 instanceof C1585) {
                    C7327 c7327 = ((C1585) abstractC1581).f4671;
                    float f9 = c7327.f19545;
                    float f10 = c7327.f19544;
                    viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
                    c151614.m2788(0.0f, (((long) Float.floatToRawIntBits(f9)) << c) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), (((long) Float.floatToRawIntBits(c7327.f19543 - f9)) << c) | (((long) Float.floatToRawIntBits(c7327.f19542 - f10)) & 4294967295L));
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
                    if (abstractC1581 instanceof C1586) {
                        C1614 c1614 = ((C1586) abstractC1581).f4672;
                        c151614.f4370 = null;
                        c151614.f4372 = 9205357640488583168L;
                        c151614.f4368 = 0L;
                        c151614.f4373 = 0.0f;
                        c151614.f4369 = true;
                        c151614.f4362 = false;
                        c151614.f4371 = c1614;
                        c151614.m2787();
                    } else {
                        if (!(abstractC1581 instanceof C1576)) {
                            C4210.m8621();
                            return;
                        }
                        C1576 c1576 = (C1576) abstractC1581;
                        C1614 c16142 = c1576.f4656;
                        if (c16142 != null) {
                            c151614.f4370 = null;
                            c151614.f4372 = 9205357640488583168L;
                            c151614.f4368 = 0L;
                            c151614.f4373 = 0.0f;
                            c151614.f4369 = true;
                            c151614.f4362 = false;
                            c151614.f4371 = c16142;
                            c151614.m2787();
                        } else {
                            C7326 c7326 = c1576.f4655;
                            float f11 = c7326.f19537;
                            float f12 = c7326.f19538;
                            c151614.m2788(Float.intBitsToFloat((int) (c7326.f19539 >> c)), (((long) Float.floatToRawIntBits(f12)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(c7326.f19536 - f12)) << c) | (((long) Float.floatToRawIntBits(c7326.f19535 - f11)) & 4294967295L));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC1581 instanceof C1586) || ((abstractC1581 instanceof C1576) && !AbstractC4921.m9877(((C1576) abstractC1581).f4655))) && (interfaceC6542 = c1911.f5645) != null)) {
                    interfaceC6542.invoke();
                }
            }
            z2 = true;
        }
        c1911.f5634 = c1573.f4652;
        if (i != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC18842 = viewTreeObserverOnGlobalLayoutListenerC1884;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC18842, viewTreeObserverOnGlobalLayoutListenerC18842);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC18842 = viewTreeObserverOnGlobalLayoutListenerC1884;
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC1884.m3505()) {
                viewTreeObserverOnGlobalLayoutListenerC18842.m3514(0.0f);
            }
        }
        boolean z4 = this.f5253;
        this.f5253 = c1573.f4632;
        this.f5251 = c1573.f4645;
        boolean z5 = c17752.f5209 == c1775.f5209 && c17752.f5208 == c1775.f5208 && c17752.f5207 == c1775.f5207 && c17752.f5206 == c1775.f5206 && c17752.f5205 == c1775.f5205 && c17752.f5204 == c1775.f5204 && c17752.f5211 == c1775.f5211 && C1615.m2975(c17752.f5210, c1775.f5210);
        if (z && ((!z5 || z4 != this.f5253) && (interfaceC1801 = c1748.f5104) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3520(c1748);
        }
        if (z5) {
            return;
        }
        c1748.m3223(this);
        if (c1748.f5126 > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18844 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748);
            C0076 c0076 = viewTreeObserverOnGlobalLayoutListenerC18844.f5493.f5047;
            c0076.getClass();
            if (c1748.f5126 > 0) {
                ((C1224) c0076.f227).m2037(c1748);
                c1748.f5127 = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC18844.m3525(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m3401(InterfaceC6557 interfaceC6557, boolean z) {
        InterfaceC1801 interfaceC1801;
        C1224 c1224;
        Reference referencePoll;
        InterfaceC6553 interfaceC6553;
        C1224 c12242;
        Reference referencePoll2;
        Object obj;
        C1748 c1748 = this.f5258;
        boolean z2 = (!z && this.f5250 == interfaceC6557 && AbstractC4394.m8917(this.f5249, c1748.f5098) && this.f5252 == c1748.f5099) ? false : true;
        this.f5249 = c1748.f5098;
        this.f5252 = c1748.f5099;
        boolean zM3233 = c1748.m3233();
        InterfaceC6542 interfaceC6542 = this.f5262;
        if (!zM3233 || interfaceC6557 == null) {
            this.f5250 = null;
            InterfaceC1806 interfaceC1806 = this.f5259;
            if (interfaceC1806 != null) {
                C1911 c1911 = (C1911) interfaceC1806;
                if (!AbstractC1581.m2876(c1911.m3601())) {
                    c1748.m3223(this);
                }
                c1911.f5646 = null;
                c1911.f5645 = null;
                c1911.f5650 = true;
                c1911.m3597(false);
                InterfaceC1583 interfaceC1583 = c1911.f5651;
                if (interfaceC1583 != null) {
                    interfaceC1583.mo2571(c1911.f5653);
                    ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c1911.f5652;
                    C0076 c0076 = viewTreeObserverOnGlobalLayoutListenerC1884.f5469;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c0076.f228;
                        c1224 = (C1224) c0076.f227;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            c1224.m2045(referencePoll);
                        }
                    } while (referencePoll != null);
                    c1224.m2037(new WeakReference(c1911, (ReferenceQueue) c0076.f228));
                    viewTreeObserverOnGlobalLayoutListenerC1884.f5421.m775(c1911);
                }
                this.f5259 = null;
                c1748.f5135 = true;
                interfaceC6542.invoke();
                if (mo3272().f6278 && c1748.m3232() && (interfaceC1801 = c1748.f5104) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3520(c1748);
                }
            }
            this.f5263 = false;
            return;
        }
        this.f5250 = interfaceC6557;
        if (this.f5259 != null) {
            if (z2) {
                m3400(true);
                return;
            }
            return;
        }
        InterfaceC1801 interfaceC1801M3296 = AbstractC1757.m3296(c1748);
        InterfaceC6553 interfaceC65532 = this.f5265;
        if (interfaceC65532 == null) {
            final InterfaceC6542 interfaceC65422 = new InterfaceC6542() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3149invoke() {
                    AbstractC1794 abstractC1794 = this.this$0;
                    InterfaceC1601 interfaceC1601 = abstractC1794.f5264;
                    interfaceC1601.getClass();
                    abstractC1794.m3392(interfaceC1601, this.this$0.f5260);
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3149invoke();
                    return C5175.f14739;
                }
            };
            InterfaceC6553 interfaceC65533 = new InterfaceC6553() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1601 interfaceC1601, C1516 c1516) {
                    boolean zM3232 = this.this$0.f5258.m3232();
                    AbstractC1794 abstractC1794 = this.this$0;
                    if (!zM3232) {
                        abstractC1794.f5263 = true;
                        return;
                    }
                    abstractC1794.f5264 = interfaceC1601;
                    abstractC1794.f5260 = c1516;
                    C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(abstractC1794.f5258)).getSnapshotObserver();
                    snapshotObserver.f5273.m2236(this.this$0, AbstractC1794.f5237, interfaceC65422);
                    this.this$0.f5263 = false;
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((InterfaceC1601) obj2, (C1516) obj3);
                    return C5175.f14739;
                }
            };
            this.f5265 = interfaceC65533;
            interfaceC6553 = interfaceC65533;
        } else {
            interfaceC6553 = interfaceC65532;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3296;
        C0076 c00762 = viewTreeObserverOnGlobalLayoutListenerC18842.f5469;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c00762.f228;
            c12242 = (C1224) c00762.f227;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                c12242.m2045(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i = c12242.f3519;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) c12242.m2043(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        InterfaceC1806 c19112 = (InterfaceC1806) obj;
        if (c19112 != null) {
            C1911 c19113 = (C1911) c19112;
            InterfaceC1583 interfaceC15832 = c19113.f5651;
            if (interfaceC15832 == null) {
                throw AbstractC0053.m139("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c19113.f5653.f4357) {
                AbstractC7935.m13397("layer should have been released before reuse");
            }
            c19113.f5653 = interfaceC15832.mo2570();
            c19113.f5650 = false;
            c19113.f5646 = interfaceC6553;
            c19113.f5645 = interfaceC6542;
            c19113.f5643 = false;
            c19113.f5642 = false;
            c19113.f5641 = true;
            C1587.m2894(c19113.f5647);
            float[] fArr = c19113.f5648;
            if (fArr != null) {
                C1587.m2894(fArr);
            }
            c19113.f5633 = C1615.f4726;
            c19113.f5640 = false;
            c19113.f5649 = 9223372034707292159L;
            c19113.f5644 = null;
            c19113.f5634 = 0;
        } else {
            c19112 = new C1911(viewTreeObserverOnGlobalLayoutListenerC18842.getGraphicsContext().mo2570(), viewTreeObserverOnGlobalLayoutListenerC18842.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC18842, interfaceC6553, interfaceC6542);
        }
        C1911 c19114 = (C1911) c19112;
        c19114.m3598(this.f4997);
        c19114.m3599(this.f5244);
        this.f5259 = c19112;
        m3400(true);
        c1748.f5135 = true;
        interfaceC6542.invoke();
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final InterfaceC1695 mo3195() {
        return this;
    }
}
