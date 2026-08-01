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
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import io.ktor.util.C4211;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.C5176;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p112.C7327;
import p112.C7328;
import p112.C7329;
import p112.C7330;
import p144.C7547;
import p205.C7908;
import p205.InterfaceC7896;
import p210.AbstractC7936;
import p251.AbstractC8175;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1794 extends AbstractC1754 implements InterfaceC1655, InterfaceC1695, InterfaceC1804 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f5243;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float f5244;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C1775 f5246;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C7330 f5247;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC1657 f5248;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C0252 f5249;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC7896 f5250;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC6558 f5251;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public LayoutDirection f5253;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f5254;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5255;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC1794 f5256;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC1794 f5257;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5258;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1748 f5259;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public InterfaceC1806 f5260;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public C1516 f5261;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f5262;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public boolean f5264;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public InterfaceC1601 f5265;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public InterfaceC6554 f5266;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final InterfaceC6558 f5239 = new InterfaceC6558() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public final void invoke(AbstractC1794 abstractC1794) throws Throwable {
            C1748 c1748 = abstractC1794.f5259;
            try {
                if (abstractC1794.mo3255()) {
                    abstractC1794.m3410(true);
                }
            } catch (Throwable th) {
                c1748.m3277(th);
                throw null;
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((AbstractC1794) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final InterfaceC6558 f5238 = new InterfaceC6558() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void invoke(AbstractC1794 abstractC1794) {
            InterfaceC1806 interfaceC1806 = abstractC1794.f5260;
            if (interfaceC1806 != null) {
                ((C1911) interfaceC1806).m3610();
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC1794) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static final C1573 f5237 = new C1573();

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static final C1775 f5236 = new C1775();

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static final float[] f5235 = C1587.m2907();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final C1812 f5240 = new C1812();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static final C1809 f5241 = new C1809();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public float f5252 = 0.8f;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public long f5245 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC1569 f5242 = AbstractC1581.f4662;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InterfaceC6543 f5263 = new InterfaceC6543() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3160invoke() {
            AbstractC1794 abstractC1794 = this.this$0.f5256;
            if (abstractC1794 != null) {
                abstractC1794.m3382();
            }
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3160invoke();
            return C5176.f14739;
        }
    };

    public AbstractC1794(C1748 c1748) {
        this.f5259 = c1748;
        this.f5250 = c1748.f5099;
        this.f5253 = c1748.f5100;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public static AbstractC1794 m3379(InterfaceC1695 interfaceC1695) {
        AbstractC1794 abstractC1794;
        C1663 c1663 = interfaceC1695 instanceof C1663 ? (C1663) interfaceC1695 : null;
        if (c1663 != null && (abstractC1794 = c1663.f4878.f5063) != null) {
            return abstractC1794;
        }
        interfaceC1695.getClass();
        return (AbstractC1794) interfaceC1695;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f5259.f5100;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final long mo3076(long j) {
        if (!mo3282().f6279) {
            AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3383();
        while (this != null) {
            C1748 c1748 = this.f5259;
            if (this == c1748.f5094.f5285 && !c1748.f5124) {
                long jM3688 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getRectManager().m3688(c1748);
                if (!C7908.m13364(jM3688, 9223372034707292159L)) {
                    return AbstractC8190.m13695(j, jM3688);
                }
            }
            InterfaceC1806 interfaceC1806 = this.f5260;
            if (interfaceC1806 != null) {
                C1911 c1911 = (C1911) interfaceC1806;
                float[] fArrM3611 = c1911.m3611();
                if (!c1911.f5642) {
                    j = C1587.m2906(j, fArrM3611);
                }
            }
            j = AbstractC8190.m13695(j, this.f5245);
            this = this.f5256;
        }
        return j;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo3077(InterfaceC1695 interfaceC1695, float[] fArr) {
        AbstractC1794 abstractC1794M3379 = m3379(interfaceC1695);
        abstractC1794M3379.m3383();
        AbstractC1794 abstractC1794M3400 = m3400(abstractC1794M3379);
        C1587.m2904(fArr);
        abstractC1794M3379.m3388(abstractC1794M3400, fArr);
        m3389(abstractC1794M3400, fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final long mo3078(long j) {
        if (!mo3282().f6279) {
            AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC1695 interfaceC1695M3113 = AbstractC1670.m3113(this);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(this.f5259);
        viewTreeObserverOnGlobalLayoutListenerC1884.m3526();
        return mo3085(interfaceC1695M3113, C7329.m12526(C1587.m2906(j, viewTreeObserverOnGlobalLayoutListenerC1884.f5489), interfaceC1695M3113.mo3076(0L)));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo3079(long j) {
        if (!mo3282().f6279) {
            AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo3085(AbstractC1670.m3113(this), ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(this.f5259)).m3534(j));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC1695 mo3080() {
        boolean z = mo3282().f6279;
        C1748 c1748 = this.f5259;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C1748 c1748M3256 = c1748; c1748M3256 != null; c1748M3256 = c1748M3256.m3256()) {
                sb.append("\n|");
                sb.append(c1748M3256);
                sb.append(" isAttached=");
                sb.append(c1748M3256.m3243());
                sb.append(" modifier=");
                sb.append(c1748M3256.f5133);
                sb.append(" tail=");
                sb.append(mo3282());
            }
            AbstractC7936.m13423(sb.toString());
        }
        m3383();
        return c1748.f5094.f5285.f5256;
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
    public final Object mo3056() {
        C1748 c1748 = this.f5259;
        if (!c1748.f5094.m3428(64)) {
            return null;
        }
        mo3282();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (AbstractC2128 abstractC2128 = c1748.f5094.f5284; abstractC2128 != null; abstractC2128 = abstractC2128.f6284) {
            if ((abstractC2128.f6291 & 64) != 0) {
                ?? M3339 = abstractC2128;
                ?? c1224 = 0;
                while (M3339 != 0) {
                    if (M3339 instanceof InterfaceC1799) {
                        ref$ObjectRef.element = ((InterfaceC1799) M3339).mo1376(ref$ObjectRef.element);
                    } else if ((M3339.f6291 & 64) != 0 && (M3339 instanceof AbstractC1788)) {
                        AbstractC2128 abstractC21282 = ((AbstractC1788) M3339).f5226;
                        int i = 0;
                        M3339 = M3339;
                        c1224 = c1224;
                        while (abstractC21282 != null) {
                            if ((abstractC21282.f6291 & 64) != 0) {
                                i++;
                                c1224 = c1224;
                                if (i == 1) {
                                    M3339 = abstractC21282;
                                } else {
                                    if (c1224 == 0) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (M3339 != 0) {
                                        c1224.m2047(M3339);
                                        M3339 = 0;
                                    }
                                    c1224.m2047(abstractC21282);
                                }
                            }
                            abstractC21282 = abstractC21282.f6288;
                            M3339 = M3339;
                            c1224 = c1224;
                        }
                        if (i == 1) {
                        }
                    }
                    M3339 = AbstractC1785.m3339(c1224);
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
    public final void m3380() {
        AbstractC2128 abstractC2128Mo3282;
        boolean zM3378 = AbstractC1793.m3378(128);
        AbstractC2128 abstractC2128M3393 = m3393(zM3378);
        if (abstractC2128M3393 == null || (abstractC2128M3393.f6292.f6285 & 128) == 0) {
            return;
        }
        AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
        AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
        try {
            if (!zM3378) {
                abstractC2128Mo3282 = mo3282().f6284;
                if (abstractC2128Mo3282 == null) {
                }
            }
            abstractC2128Mo3282 = mo3282();
            for (AbstractC2128 abstractC2128M33932 = m3393(zM3378); abstractC2128M33932 != null; abstractC2128M33932 = abstractC2128M33932.f6288) {
                if ((abstractC2128M33932.f6285 & 128) == 0) {
                    break;
                }
                if ((abstractC2128M33932.f6291 & 128) != 0) {
                    ?? M3339 = abstractC2128M33932;
                    ?? c1224 = 0;
                    while (M3339 != 0) {
                        if (M3339 instanceof InterfaceC1740) {
                            ((InterfaceC1740) M3339).mo1321(this.f4998);
                        } else if ((M3339.f6291 & 128) != 0 && (M3339 instanceof AbstractC1788)) {
                            AbstractC2128 abstractC2128 = ((AbstractC1788) M3339).f5226;
                            int i = 0;
                            M3339 = M3339;
                            c1224 = c1224;
                            while (abstractC2128 != null) {
                                if ((abstractC2128.f6291 & 128) != 0) {
                                    i++;
                                    c1224 = c1224;
                                    if (i == 1) {
                                        M3339 = abstractC2128;
                                    } else {
                                        if (c1224 == 0) {
                                            c1224 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (M3339 != 0) {
                                            c1224.m2047(M3339);
                                            M3339 = 0;
                                        }
                                        c1224.m2047(abstractC2128);
                                    }
                                }
                                abstractC2128 = abstractC2128.f6288;
                                M3339 = M3339;
                                c1224 = c1224;
                            }
                            if (i == 1) {
                            }
                        }
                        M3339 = AbstractC1785.m3339(c1224);
                    }
                }
                if (abstractC2128M33932 == abstractC2128Mo3282) {
                    break;
                }
            }
        } finally {
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
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
    public final void m3381() {
        boolean zM3378 = AbstractC1793.m3378(4194304);
        AbstractC2128 abstractC2128Mo3282 = mo3282();
        if (!zM3378 && (abstractC2128Mo3282 = abstractC2128Mo3282.f6284) == null) {
            return;
        }
        for (AbstractC2128 abstractC2128M3393 = m3393(zM3378); abstractC2128M3393 != null && (abstractC2128M3393.f6285 & 4194304) != 0; abstractC2128M3393 = abstractC2128M3393.f6288) {
            if ((abstractC2128M3393.f6291 & 4194304) != 0) {
                ?? M3339 = abstractC2128M3393;
                ?? c1224 = 0;
                while (M3339 != 0) {
                    if (M3339 instanceof InterfaceC1776) {
                        ((InterfaceC1776) M3339).mo1576(this);
                    } else if ((M3339.f6291 & 4194304) != 0 && (M3339 instanceof AbstractC1788)) {
                        AbstractC2128 abstractC2128 = ((AbstractC1788) M3339).f5226;
                        int i = 0;
                        M3339 = M3339;
                        c1224 = c1224;
                        while (abstractC2128 != null) {
                            if ((abstractC2128.f6291 & 4194304) != 0) {
                                i++;
                                c1224 = c1224;
                                if (i == 1) {
                                    M3339 = abstractC2128;
                                } else {
                                    if (c1224 == 0) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (M3339 != 0) {
                                        c1224.m2047(M3339);
                                        M3339 = 0;
                                    }
                                    c1224.m2047(abstractC2128);
                                }
                            }
                            abstractC2128 = abstractC2128.f6288;
                            M3339 = M3339;
                            c1224 = c1224;
                        }
                        if (i == 1) {
                        }
                    }
                    M3339 = AbstractC1785.m3339(c1224);
                }
            }
            if (abstractC2128M3393 == abstractC2128Mo3282) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m3382() {
        InterfaceC1806 interfaceC1806 = this.f5260;
        if (interfaceC1806 != null) {
            ((C1911) interfaceC1806).m3610();
            return;
        }
        AbstractC1794 abstractC1794 = this.f5256;
        if (abstractC1794 != null) {
            abstractC1794.m3382();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public void mo3326(InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z) {
        AbstractC1794 abstractC1794 = this.f5257;
        if (abstractC1794 != null) {
            abstractC1794.m3392(interfaceC1810, abstractC1794.m3401(j), c1780, i, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void m3383() {
        this.f5259.f5132.m3300();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final boolean m3384() {
        if (this.f5260 != null && this.f5252 <= 0.0f) {
            return true;
        }
        AbstractC1794 abstractC1794 = this.f5256;
        if (abstractC1794 != null) {
            return abstractC1794.m3384();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final C7328 m3385() {
        if (mo3282().f6279) {
            InterfaceC1695 interfaceC1695M3113 = AbstractC1670.m3113(this);
            C7330 c7330 = this.f5247;
            if (c7330 == null) {
                c7330 = new C7330();
                this.f5247 = c7330;
            }
            long jM3404 = m3404(m3403());
            int i = (int) (jM3404 >> 32);
            c7330.f19545 = -Float.intBitsToFloat(i);
            int i2 = (int) (jM3404 & 4294967295L);
            c7330.f19544 = -Float.intBitsToFloat(i2);
            c7330.f19543 = Float.intBitsToFloat(i) + mo3139();
            c7330.f19542 = Float.intBitsToFloat(i2) + mo3138();
            while (this != interfaceC1695M3113) {
                this.m3397(c7330, false, true);
                if (!c7330.m12534()) {
                    this = this.f5256;
                    this.getClass();
                }
            }
            return new C7328(c7330.f19545, c7330.f19544, c7330.f19543, c7330.f19542);
        }
        return C7328.f19536;
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
    public final void m3386(InterfaceC1657 interfaceC1657) {
        AbstractC1794 abstractC1794;
        InterfaceC1657 interfaceC16572 = this.f5248;
        if (interfaceC1657 != interfaceC16572) {
            this.f5248 = interfaceC1657;
            C1748 c1748 = this.f5259;
            int i = 0;
            if (interfaceC16572 == null || interfaceC1657.mo1473() != interfaceC16572.mo1473() || interfaceC1657.mo1474() != interfaceC16572.mo1474()) {
                int iMo1473 = interfaceC1657.mo1473();
                int iMo1474 = interfaceC1657.mo1474();
                InterfaceC1806 interfaceC1806 = this.f5260;
                if (interfaceC1806 != null) {
                    ((C1911) interfaceC1806).m3608((((long) iMo1473) << 32) | (((long) iMo1474) & 4294967295L));
                } else if (c1748.m3242() && (abstractC1794 = this.f5256) != null) {
                    abstractC1794.m3382();
                }
                m3141((((long) iMo1474) & 4294967295L) | (((long) iMo1473) << 32));
                if (this.f5251 != null) {
                    m3410(false);
                }
                boolean zM3378 = AbstractC1793.m3378(4);
                AbstractC2128 abstractC2128Mo3282 = mo3282();
                if (zM3378 || (abstractC2128Mo3282 = abstractC2128Mo3282.f6284) != null) {
                    for (AbstractC2128 abstractC2128M3393 = m3393(zM3378); abstractC2128M3393 != null && (abstractC2128M3393.f6285 & 4) != 0; abstractC2128M3393 = abstractC2128M3393.f6288) {
                        if ((abstractC2128M3393.f6291 & 4) != 0) {
                            ?? M3339 = abstractC2128M3393;
                            ?? c1224 = 0;
                            while (M3339 != 0) {
                                if (M3339 instanceof InterfaceC1781) {
                                    ((InterfaceC1781) M3339).mo2571();
                                } else if ((M3339.f6291 & 4) != 0 && (M3339 instanceof AbstractC1788)) {
                                    AbstractC2128 abstractC2128 = ((AbstractC1788) M3339).f5226;
                                    int i2 = 0;
                                    M3339 = M3339;
                                    c1224 = c1224;
                                    while (abstractC2128 != null) {
                                        if ((abstractC2128.f6291 & 4) != 0) {
                                            i2++;
                                            c1224 = c1224;
                                            if (i2 == 1) {
                                                M3339 = abstractC2128;
                                            } else {
                                                if (c1224 == 0) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (M3339 != 0) {
                                                    c1224.m2047(M3339);
                                                    M3339 = 0;
                                                }
                                                c1224.m2047(abstractC2128);
                                            }
                                        }
                                        abstractC2128 = abstractC2128.f6288;
                                        M3339 = M3339;
                                        c1224 = c1224;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3339 = AbstractC1785.m3339(c1224);
                            }
                        }
                        if (abstractC2128M3393 == abstractC2128Mo3282) {
                            break;
                        }
                    }
                }
                InterfaceC1801 interfaceC1801 = c1748.f5105;
                if (interfaceC1801 != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3530(c1748);
                }
                c1748.m3233(this);
            }
            C0252 c0252 = this.f5249;
            if ((c0252 == null || c0252.f914 == 0) && interfaceC1657.mo1472().isEmpty()) {
                return;
            }
            C0252 c02522 = this.f5249;
            Map mapMo1472 = interfaceC1657.mo1472();
            if (c02522 != null && c02522.f914 == mapMo1472.size()) {
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
                                Integer num = (Integer) mapMo1472.get((AbstractC1689) obj);
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
            c1748.f5132.f5167.f5020.m3324();
            C0252 c02523 = this.f5249;
            if (c02523 == null) {
                C0252 c02524 = AbstractC0234.f874;
                c02523 = new C0252();
                this.f5249 = c02523;
            }
            c02523.m807();
            for (Map.Entry entry : interfaceC1657.mo1472().entrySet()) {
                c02523.m808(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m3387(final AbstractC2128 abstractC2128, final InterfaceC1810 interfaceC1810, final long j, final C1780 c1780, final int i, final boolean z, final float f) {
        int i2;
        if (abstractC2128 == null) {
            mo3326(interfaceC1810, j, c1780, i, z);
            return;
        }
        if (!interfaceC1810.mo3416(abstractC2128)) {
            m3387(AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420()), interfaceC1810, j, c1780, i, z, f);
            return;
        }
        if (!interfaceC1810.mo3418(abstractC2128)) {
            m3399(AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420()), interfaceC1810, j, c1780, i, z, f, false);
            return;
        }
        InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3162invoke() {
                AbstractC1794 abstractC1794 = this.this$0;
                AbstractC2128 abstractC2128M3340 = AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420());
                InterfaceC1810 interfaceC18102 = interfaceC1810;
                long j2 = j;
                C1780 c17802 = c1780;
                int i3 = i;
                boolean z2 = z;
                float f2 = f;
                InterfaceC6558 interfaceC6558 = AbstractC1794.f5239;
                abstractC1794.m3399(abstractC2128M3340, interfaceC18102, j2, c17802, i3, z2, f2, false);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3162invoke();
                return C5176.f14739;
            }
        };
        C0255 c0255 = c1780.f5219;
        C0244 c0244 = c1780.f5221;
        int i3 = c1780.f5220;
        int i4 = c0244.f1004;
        if (i3 != i4 - 1) {
            long jM3332 = c1780.m3332();
            int i5 = c1780.f5220;
            int i6 = c0244.f1004;
            int i7 = i6 - 1;
            c1780.f5220 = i7;
            c1780.m3331(i6, c0244.f1004);
            c1780.f5220++;
            c0244.m775(abstractC2128);
            c0255.m819(AbstractC1785.m3343(f, z, false));
            interfaceC6543.invoke();
            c1780.f5220 = i7;
            long jM33322 = c1780.m3332();
            if (c1780.f5220 + 1 >= c0244.f1004 - 1 || AbstractC1785.m3357(jM3332, jM33322) <= 0) {
                c1780.m3331(c1780.f5220 + 1, c0244.f1004);
            } else {
                int i8 = i5 + 1;
                boolean zM3355 = AbstractC1785.m3355(jM33322);
                int i9 = c1780.f5220;
                c1780.m3331(i8, zM3355 ? i9 + 2 : i9 + 1);
            }
            c1780.f5220 = i5;
            return;
        }
        int i10 = i3 + 1;
        c1780.m3331(i10, i4);
        c1780.f5220++;
        c0244.m775(abstractC2128);
        c0255.m819(AbstractC1785.m3343(f, z, false));
        interfaceC6543.invoke();
        c1780.f5220 = i3;
        if (i10 == c0244.f1004 - 1 || AbstractC1785.m3355(c1780.m3332())) {
            int i11 = c1780.f5220;
            int i12 = i11 + 1;
            c0244.m777(i12);
            if (i12 < 0 || i12 >= (i2 = c0255.f930)) {
                C7547.m12772("Index must be between 0 and size");
                return;
            }
            long[] jArr = c0255.f931;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                AbstractC4347.m8842(jArr, jArr, i12, i11 + 2, i2);
            }
            c0255.f930--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m3388(AbstractC1794 abstractC1794, float[] fArr) {
        while (!this.equals(abstractC1794)) {
            InterfaceC1806 interfaceC1806 = this.f5260;
            if (interfaceC1806 != null) {
                C1587.m2903(fArr, ((C1911) interfaceC1806).m3611());
            }
            if (!C7908.m13364(this.f5245, 0L)) {
                float[] fArr2 = f5235;
                C1587.m2904(fArr2);
                C1587.m2902(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                C1587.m2903(fArr, fArr2);
            }
            this = this.f5256;
            this.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void m3389(AbstractC1794 abstractC1794, float[] fArr) {
        float[] fArrM3612;
        if (AbstractC4395.m8907(abstractC1794, this)) {
            return;
        }
        AbstractC1794 abstractC17942 = this.f5256;
        abstractC17942.getClass();
        abstractC17942.m3389(abstractC1794, fArr);
        if (!C7908.m13364(this.f5245, 0L)) {
            float[] fArr2 = f5235;
            C1587.m2904(fArr2);
            long j = this.f5245;
            C1587.m2902(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            C1587.m2903(fArr, fArr2);
        }
        InterfaceC1806 interfaceC1806 = this.f5260;
        if (interfaceC1806 == null || (fArrM3612 = ((C1911) interfaceC1806).m3612()) == null) {
            return;
        }
        C1587.m2903(fArr, fArrM3612);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final AbstractC2128 m3390(int i) {
        boolean zM3378 = AbstractC1793.m3378(i);
        AbstractC2128 abstractC2128Mo3282 = mo3282();
        if (!zM3378 && (abstractC2128Mo3282 = abstractC2128Mo3282.f6284) == null) {
            return null;
        }
        for (AbstractC2128 abstractC2128M3393 = m3393(zM3378); abstractC2128M3393 != null && (abstractC2128M3393.f6285 & i) != 0; abstractC2128M3393 = abstractC2128M3393.f6288) {
            if ((abstractC2128M3393.f6291 & i) != 0) {
                return abstractC2128M3393;
            }
            if (abstractC2128M3393 == abstractC2128Mo3282) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public abstract AbstractC2128 mo3282();

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m3391(AbstractC2128 abstractC2128, InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z, float f) {
        if (abstractC2128 == null) {
            mo3326(interfaceC1810, j, c1780, i, z);
            return;
        }
        if (!interfaceC1810.mo3416(abstractC2128)) {
            m3391(AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420()), interfaceC1810, j, c1780, i, z, f);
            return;
        }
        int i2 = c1780.f5220;
        C0244 c0244 = c1780.f5221;
        c1780.m3331(i2 + 1, c0244.f1004);
        c1780.f5220++;
        c0244.m775(abstractC2128);
        c1780.f5219.m819(AbstractC1785.m3343(f, z, false));
        m3399(AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420()), interfaceC1810, j, c1780, i, z, f, true);
        c1780.f5220 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m3392(InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z) {
        boolean z2;
        boolean z3;
        AbstractC2128 abstractC2128M3390 = m3390(interfaceC1810.mo3420());
        if (!m3409(j)) {
            if (i == 1) {
                float fM3407 = m3407(j, m3403());
                if ((Float.floatToRawIntBits(fM3407) & Integer.MAX_VALUE) < 2139095040) {
                    if (c1780.f5220 != c1780.f5221.f1004 - 1) {
                        if (AbstractC1785.m3357(c1780.m3332(), AbstractC1785.m3343(fM3407, false, false)) <= 0) {
                            return;
                        }
                    }
                    m3391(abstractC2128M3390, interfaceC1810, j, c1780, i, false, fM3407);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC2128M3390 == null) {
            mo3326(interfaceC1810, j, c1780, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo3139() && fIntBitsToFloat2 < mo3138()) {
            m3394(abstractC2128M3390, interfaceC1810, j, c1780, i, z);
            return;
        }
        float fM34072 = i == 1 ? m3407(j, m3403()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM34072) & Integer.MAX_VALUE) < 2139095040) {
            if (c1780.f5220 != c1780.f5221.f1004 - 1) {
                z2 = z;
                if (AbstractC1785.m3357(c1780.m3332(), AbstractC1785.m3343(fM34072, z2, false)) > 0) {
                }
                m3399(abstractC2128M3390, interfaceC1810, j, c1780, i, z2, fM34072, z3);
            }
            z2 = z;
            z3 = true;
            m3399(abstractC2128M3390, interfaceC1810, j, c1780, i, z2, fM34072, z3);
        }
        z2 = z;
        z3 = false;
        m3399(abstractC2128M3390, interfaceC1810, j, c1780, i, z2, fM34072, z3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final AbstractC2128 m3393(boolean z) {
        AbstractC2128 abstractC2128Mo3282;
        C1811 c1811 = this.f5259.f5094;
        if (c1811.f5285 == this) {
            return c1811.f5283;
        }
        AbstractC1794 abstractC1794 = this.f5256;
        if (!z) {
            if (abstractC1794 != null) {
                return abstractC1794.mo3282();
            }
            return null;
        }
        if (abstractC1794 == null || (abstractC2128Mo3282 = abstractC1794.mo3282()) == null) {
            return null;
        }
        return abstractC2128Mo3282.f6288;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m3394(AbstractC2128 abstractC2128, InterfaceC1810 interfaceC1810, long j, C1780 c1780, int i, boolean z) {
        if (abstractC2128 == null) {
            mo3326(interfaceC1810, j, c1780, i, z);
            return;
        }
        if (!interfaceC1810.mo3416(abstractC2128)) {
            m3394(AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420()), interfaceC1810, j, c1780, i, z);
            return;
        }
        int i2 = c1780.f5220;
        C0244 c0244 = c1780.f5221;
        c1780.m3331(i2 + 1, c0244.f1004);
        c1780.f5220++;
        c0244.m775(abstractC2128);
        c1780.f5219.m819(AbstractC1785.m3343(-1.0f, z, false));
        m3394(AbstractC1785.m3340(abstractC2128, interfaceC1810.mo3420()), interfaceC1810, j, c1780, i, z);
        c1780.f5220 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void m3395(long j, float f, InterfaceC6558 interfaceC6558) {
        m3411(interfaceC6558, false);
        boolean zM13364 = C7908.m13364(this.f5245, j);
        C1748 c1748 = this.f5259;
        if (!zM13364) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).m3524(-4.0f);
            this.f5245 = j;
            InterfaceC1806 interfaceC1806 = this.f5260;
            if (interfaceC1806 != null) {
                ((C1911) interfaceC1806).m3609(j);
            } else {
                AbstractC1794 abstractC1794 = this.f5256;
                if (abstractC1794 != null) {
                    abstractC1794.m3382();
                }
            }
            c1748.m3233(this);
            AbstractC1754.m3288(this);
            InterfaceC1801 interfaceC1801 = c1748.f5105;
            if (interfaceC1801 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3530(c1748);
            }
        }
        this.f5244 = f;
        if (this == c1748.f5094.f5285) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getRectManager().m3686(c1748);
        }
        if (this.f5147) {
            return;
        }
        m3293(mo3201());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public abstract void mo3283(InterfaceC1601 interfaceC1601, C1516 c1516);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void m3396() {
        if (this.f5260 != null) {
            m3411(null, false);
            this.f5259.m3225(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3397(p112.C7330 r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1794.m3397(飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏哲兰, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void m3398() {
        boolean zM3378 = AbstractC1793.m3378(1048576);
        AbstractC2128 abstractC2128M3393 = m3393(zM3378);
        if (abstractC2128M3393 == null || (abstractC2128M3393.f6292.f6285 & 1048576) == 0) {
            return;
        }
        AbstractC2128 abstractC2128Mo3282 = mo3282();
        if (!zM3378 && (abstractC2128Mo3282 = abstractC2128Mo3282.f6284) == null) {
            return;
        }
        for (AbstractC2128 abstractC2128M33932 = m3393(zM3378); abstractC2128M33932 != null && (abstractC2128M33932.f6285 & 1048576) != 0; abstractC2128M33932 = abstractC2128M33932.f6288) {
            if ((abstractC2128M33932.f6291 & 1048576) != 0) {
                AbstractC2128 abstractC2128M3339 = abstractC2128M33932;
                C1224 c1224 = null;
                while (abstractC2128M3339 != null) {
                    if ((abstractC2128M3339.f6291 & 1048576) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                        int i = 0;
                        for (AbstractC2128 abstractC2128 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
                            if ((abstractC2128.f6291 & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC2128M3339 = abstractC2128;
                                } else {
                                    if (c1224 == null) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (abstractC2128M3339 != null) {
                                        c1224.m2047(abstractC2128M3339);
                                        abstractC2128M3339 = null;
                                    }
                                    c1224.m2047(abstractC2128);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC2128M3339 = AbstractC1785.m3339(c1224);
                }
            }
            if (abstractC2128M33932 == abstractC2128Mo3282) {
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
    public final void m3399(final androidx.compose.ui.AbstractC2128 r17, final androidx.compose.ui.node.InterfaceC1810 r18, final long r19, final androidx.compose.ui.node.C1780 r21, int r22, final boolean r23, final float r24, final boolean r25) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1794.m3399(androidx.compose.ui.飘花落叶言子楪哲苏世兰, androidx.compose.ui.node.飘花落叶言子苏楪兰哲世, long, androidx.compose.ui.node.飘花落叶言子楪哲兰苏世, int, boolean, float, boolean):void");
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final AbstractC1754 mo3200() {
        return this.f5256;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final InterfaceC1657 mo3201() {
        InterfaceC1657 interfaceC1657 = this.f5248;
        if (interfaceC1657 != null) {
            return interfaceC1657;
        }
        C5925.m11311("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final long mo3202() {
        return this.f5245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final AbstractC1794 m3400(AbstractC1794 abstractC1794) {
        C1748 c1748M3256 = abstractC1794.f5259;
        C1748 c1748 = this.f5259;
        if (c1748M3256 == c1748) {
            AbstractC2128 abstractC2128Mo3282 = abstractC1794.mo3282();
            AbstractC2128 abstractC2128Mo32822 = mo3282();
            if (!abstractC2128Mo32822.f6292.f6279) {
                AbstractC7936.m13423("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC2128 abstractC2128 = abstractC2128Mo32822.f6292.f6284; abstractC2128 != null; abstractC2128 = abstractC2128.f6284) {
                if ((abstractC2128.f6291 & 2) != 0 && abstractC2128 == abstractC2128Mo3282) {
                    return abstractC1794;
                }
            }
            return this;
        }
        while (c1748M3256.f5115 > c1748.f5115) {
            c1748M3256 = c1748M3256.m3256();
            c1748M3256.getClass();
        }
        C1748 c1748M32562 = c1748;
        while (c1748M32562.f5115 > c1748M3256.f5115) {
            c1748M32562 = c1748M32562.m3256();
            c1748M32562.getClass();
        }
        while (c1748M3256 != c1748M32562) {
            c1748M3256 = c1748M3256.m3256();
            c1748M32562 = c1748M32562.m3256();
            if (c1748M3256 == null || c1748M32562 == null) {
                C5925.m11310("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c1748M32562 != c1748) {
            if (c1748M3256 != abstractC1794.f5259) {
                return c1748M3256.f5094.f5286;
            }
            return abstractC1794;
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final long m3401(long j) {
        long j2 = this.f5245;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        InterfaceC1806 interfaceC1806 = this.f5260;
        if (interfaceC1806 != null) {
            C1911 c1911 = (C1911) interfaceC1806;
            float[] fArrM3612 = c1911.m3612();
            if (fArrM3612 == null) {
                return 9187343241974906880L;
            }
            if (!c1911.f5642) {
                return C1587.m2906(jFloatToRawIntBits, fArrM3612);
            }
        }
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void m3402(InterfaceC1601 interfaceC1601, C1516 c1516) {
        AbstractC1794 abstractC1794;
        InterfaceC1601 interfaceC16012;
        C1516 c15162;
        AbstractC2128 abstractC2128M3390 = m3390(4);
        if (abstractC2128M3390 == null) {
            mo3283(interfaceC1601, c1516);
            return;
        }
        C1748 c1748 = this.f5259;
        c1748.getClass();
        C1758 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getSharedDrawScope();
        long jM1140 = AbstractC0455.m1140(this.f4998);
        sharedDrawScope.getClass();
        C1224 c1224 = null;
        while (abstractC2128M3390 != null) {
            if (abstractC2128M3390 instanceof InterfaceC1781) {
                abstractC1794 = this;
                interfaceC16012 = interfaceC1601;
                c15162 = c1516;
                sharedDrawScope.m3310(interfaceC16012, jM1140, abstractC1794, (InterfaceC1781) abstractC2128M3390, c15162);
            } else {
                abstractC1794 = this;
                interfaceC16012 = interfaceC1601;
                c15162 = c1516;
                if ((abstractC2128M3390.f6291 & 4) != 0 && (abstractC2128M3390 instanceof AbstractC1788)) {
                    int i = 0;
                    for (AbstractC2128 abstractC2128 = ((AbstractC1788) abstractC2128M3390).f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
                        if ((abstractC2128.f6291 & 4) != 0) {
                            i++;
                            if (i == 1) {
                                abstractC2128M3390 = abstractC2128;
                            } else {
                                if (c1224 == null) {
                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                }
                                if (abstractC2128M3390 != null) {
                                    c1224.m2047(abstractC2128M3390);
                                    abstractC2128M3390 = null;
                                }
                                c1224.m2047(abstractC2128);
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
            abstractC2128M3390 = AbstractC1785.m3339(c1224);
            interfaceC1601 = interfaceC16012;
            this = abstractC1794;
            c1516 = c15162;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public abstract void mo3284();

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final long m3403() {
        return this.f5250.mo1342(this.f5259.f5096.mo3279());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract AbstractC1745 mo3285();

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final AbstractC1754 mo3203() {
        return this.f5257;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final C1748 mo3204() {
        return this.f5259;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo3206() {
        return this.f5248 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final long m3404(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo3139();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo3138();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final long m3405(AbstractC1794 abstractC1794, long j) {
        if (abstractC1794 == this) {
            return j;
        }
        AbstractC1794 abstractC17942 = this.f5256;
        return (abstractC17942 == null || AbstractC4395.m8907(abstractC1794, abstractC17942)) ? m3401(j) : m3401(abstractC17942.m3405(abstractC1794, j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m3406(InterfaceC1601 interfaceC1601, C1516 c1516) {
        InterfaceC1806 interfaceC1806 = this.f5260;
        if (interfaceC1806 == null) {
            long j = this.f5245;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC1601.mo2685(f, f2);
            m3402(interfaceC1601, c1516);
            interfaceC1601.mo2685(-f, -f2);
            return;
        }
        C1911 c1911 = (C1911) interfaceC1806;
        C1507 c1507 = c1911.f5636;
        c1911.m3613();
        c1911.f5641 = c1911.f5654.f4356.mo2730() > 0.0f;
        C0108 c0108 = c1507.f4284;
        c0108.m365(interfaceC1601);
        c0108.f320 = c1516;
        c1911.f5654.m2795(c1507.mo2706().m386(), (C1516) c1507.mo2706().f320);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final float m3407(long j, long j2) {
        if (mo3139() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo3138() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3404 = m3404(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3404 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3404 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo3139());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo3138()))) & 4294967295L);
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
    public final void mo3211() {
        mo3128(this.f5245, this.f5244, this.f5251);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void m3408(AbstractC1794 abstractC1794, C7330 c7330, boolean z) {
        if (abstractC1794 == this) {
            return;
        }
        AbstractC1794 abstractC17942 = this.f5256;
        if (abstractC17942 != null) {
            abstractC17942.m3408(abstractC1794, c7330, z);
        }
        long j = this.f5245;
        float f = (int) (j >> 32);
        c7330.f19545 -= f;
        c7330.f19543 -= f;
        float f2 = (int) (j & 4294967295L);
        c7330.f19544 -= f2;
        c7330.f19542 -= f2;
        InterfaceC1806 interfaceC1806 = this.f5260;
        if (interfaceC1806 != null) {
            C1911 c1911 = (C1911) interfaceC1806;
            float[] fArrM3612 = c1911.m3612();
            if (!c1911.f5642) {
                if (fArrM3612 == null) {
                    c7330.f19545 = 0.0f;
                    c7330.f19544 = 0.0f;
                    c7330.f19543 = 0.0f;
                    c7330.f19542 = 0.0f;
                } else {
                    C1587.m2905(fArrM3612, c7330);
                }
            }
            if (this.f5254 && z) {
                long j2 = this.f4998;
                c7330.m12535(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo3081(InterfaceC1695 interfaceC1695, long j) {
        return mo3085(interfaceC1695, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3082(long j) {
        long jMo3076 = mo3076(j);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(this.f5259);
        viewTreeObserverOnGlobalLayoutListenerC1884.m3526();
        return C1587.m2906(jMo3076, viewTreeObserverOnGlobalLayoutListenerC1884.f5493);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f5259.f5099.mo1256();
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3255() {
        return (this.f5260 == null || this.f5255 || !this.f5259.m3243()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo3084(long j) {
        if (!mo3282().f6279) {
            AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(this.f5259)).m3538(mo3076(j));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo3085(InterfaceC1695 interfaceC1695, long j) {
        if (interfaceC1695 instanceof C1663) {
            C1663 c1663 = (C1663) interfaceC1695;
            c1663.f4878.f5063.m3383();
            return c1663.mo3085(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC1794 abstractC1794M3379 = m3379(interfaceC1695);
        abstractC1794M3379.m3383();
        AbstractC1794 abstractC1794M3400 = m3400(abstractC1794M3379);
        while (abstractC1794M3379 != abstractC1794M3400) {
            InterfaceC1806 interfaceC1806 = abstractC1794M3379.f5260;
            if (interfaceC1806 != null) {
                C1911 c1911 = (C1911) interfaceC1806;
                float[] fArrM3611 = c1911.m3611();
                if (!c1911.f5642) {
                    j = C1587.m2906(j, fArrM3611);
                }
            }
            j = AbstractC8190.m13695(j, abstractC1794M3379.f5245);
            abstractC1794M3379 = abstractC1794M3379.f5256;
            abstractC1794M3379.getClass();
        }
        return m3405(abstractC1794M3400, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo3086() {
        return mo3282().f6279;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3087(float[] fArr) {
        InterfaceC1801 interfaceC1801M3306 = AbstractC1757.m3306(this.f5259);
        AbstractC1794 abstractC1794M3379 = m3379(AbstractC1670.m3113(this));
        m3388(abstractC1794M3379, fArr);
        if (interfaceC1801M3306 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3306).m3539(fArr);
            return;
        }
        long jMo3084 = abstractC1794M3379.mo3084(0L);
        if ((9223372034707292159L & jMo3084) != 9205357640488583168L) {
            C1587.m2902(fArr, Float.intBitsToFloat((int) (jMo3084 >> 32)), Float.intBitsToFloat((int) (jMo3084 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final long mo3088() {
        return this.f4998;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C7328 mo3089(InterfaceC1695 interfaceC1695, boolean z) {
        if (!mo3282().f6279) {
            AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC1695.mo3086()) {
            AbstractC7936.m13423("LayoutCoordinates " + interfaceC1695 + " is not attached!");
        }
        AbstractC1794 abstractC1794M3379 = m3379(interfaceC1695);
        abstractC1794M3379.m3383();
        AbstractC1794 abstractC1794M3400 = m3400(abstractC1794M3379);
        C7330 c7330 = this.f5247;
        if (c7330 == null) {
            c7330 = new C7330();
            this.f5247 = c7330;
        }
        c7330.f19545 = 0.0f;
        c7330.f19544 = 0.0f;
        c7330.f19543 = (int) (interfaceC1695.mo3088() >> 32);
        c7330.f19542 = (int) (interfaceC1695.mo3088() & 4294967295L);
        while (abstractC1794M3379 != abstractC1794M3400) {
            abstractC1794M3379.m3397(c7330, z, false);
            if (c7330.m12534()) {
                return C7328.f19536;
            }
            abstractC1794M3379 = abstractC1794M3379.f5256;
            abstractC1794M3379.getClass();
        }
        m3408(abstractC1794M3400, c7330, z);
        return new C7328(c7330.f19545, c7330.f19544, c7330.f19543, c7330.f19542);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f5259.f5099.mo1257();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3409(long r24) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1794.m3409(long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void m3410(boolean z) {
        char c;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884;
        boolean z2;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842;
        InterfaceC1801 interfaceC1801;
        InterfaceC6543 interfaceC6543;
        InterfaceC6543 interfaceC65432;
        InterfaceC1806 interfaceC1806 = this.f5260;
        final InterfaceC6558 interfaceC6558 = this.f5251;
        if (interfaceC1806 == null) {
            if (interfaceC6558 == null) {
                return;
            }
            AbstractC7936.m13423("null layer with a non-null layerBlock");
            return;
        }
        if (interfaceC6558 == null) {
            throw AbstractC0053.m139("updateLayerParameters requires a non-null layerBlock");
        }
        C1573 c1573 = f5237;
        c1573.m2856();
        C1748 c1748 = this.f5259;
        c1573.f4643 = c1748.f5099;
        c1573.f4642 = c1748.f5100;
        c1573.f4644 = AbstractC0455.m1140(this.f4998);
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getSnapshotObserver().f5274.m2246(this, f5239, new InterfaceC6543() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3163invoke() {
                InterfaceC6558 interfaceC65582 = interfaceC6558;
                C1573 c15732 = AbstractC1794.f5237;
                interfaceC65582.invoke(c15732);
                boolean zM8907 = AbstractC4395.m8907(this.f5242, c15732.f4634);
                AbstractC1794 abstractC1794 = this;
                boolean z3 = abstractC1794.f5243;
                boolean z4 = c15732.f4633;
                boolean z5 = z3 != z4;
                if (!zM8907 || z5) {
                    abstractC1794.f5242 = c15732.f4634;
                    abstractC1794.f5243 = z4;
                    if (abstractC1794.f5262 && (z5 || (z4 && !zM8907))) {
                        abstractC1794.f5259.m3245();
                    }
                }
                this.f5262 = true;
                c15732.f4639 = c15732.f4634.mo1922(c15732.f4644, c15732.f4642, c15732.f4643);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3163invoke();
                return C5176.f14739;
            }
        });
        C1775 c1775 = this.f5246;
        if (c1775 == null) {
            c1775 = new C1775();
            this.f5246 = c1775;
        }
        C1775 c17752 = f5236;
        c17752.getClass();
        c17752.f5210 = c1775.f5210;
        c17752.f5209 = c1775.f5209;
        c17752.f5208 = c1775.f5208;
        c17752.f5207 = c1775.f5207;
        c17752.f5206 = c1775.f5206;
        c17752.f5205 = c1775.f5205;
        c17752.f5212 = c1775.f5212;
        c17752.f5211 = c1775.f5211;
        float f = c1573.f4651;
        c1775.f5210 = f;
        c1775.f5209 = c1573.f4652;
        c1775.f5208 = c1573.f4645;
        c1775.f5207 = c1573.f4649;
        c1775.f5206 = c1573.f4638;
        c1775.f5205 = c1573.f4637;
        c1775.f5212 = c1573.f4636;
        long j = c1573.f4635;
        c1775.f5211 = j;
        C1911 c1911 = (C1911) interfaceC1806;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18843 = c1911.f5653;
        int i = c1573.f4653 | c1911.f5635;
        c1911.f5637 = c1573.f4642;
        c1911.f5638 = c1573.f4643;
        int i2 = i & 4096;
        if (i2 != 0) {
            c1911.f5634 = j;
        }
        if ((i & 1) != 0) {
            InterfaceC1514 interfaceC1514 = c1911.f5654.f4356;
            if (interfaceC1514.mo2738() != f) {
                interfaceC1514.mo2744(f);
            }
        }
        if ((i & 2) != 0) {
            C1516 c1516 = c1911.f5654;
            float f2 = c1573.f4652;
            InterfaceC1514 interfaceC15142 = c1516.f4356;
            if (interfaceC15142.mo2719() != f2) {
                interfaceC15142.mo2756(f2);
            }
        }
        if ((i & 4) != 0) {
            c1911.f5654.m2792(c1573.f4646);
        }
        if ((i & 8) != 0) {
            C1516 c15162 = c1911.f5654;
            float f3 = c1573.f4645;
            InterfaceC1514 interfaceC15143 = c15162.f4356;
            if (interfaceC15143.mo2727() != f3) {
                interfaceC15143.mo2734(f3);
            }
        }
        if ((i & 16) != 0) {
            C1516 c15163 = c1911.f5654;
            float f4 = c1573.f4649;
            InterfaceC1514 interfaceC15144 = c15163.f4356;
            if (interfaceC15144.mo2741() != f4) {
                interfaceC15144.mo2735(f4);
            }
        }
        if ((i & 32) != 0) {
            C1516 c15164 = c1911.f5654;
            float f5 = c1573.f4650;
            InterfaceC1514 interfaceC15145 = c15164.f4356;
            if (interfaceC15145.mo2730() != f5) {
                interfaceC15145.mo2737(f5);
                c15164.f4370 = true;
                c15164.m2797();
            }
            if (c1573.f4650 > 0.0f && !c1911.f5641 && (interfaceC65432 = c1911.f5646) != null) {
                interfaceC65432.invoke();
            }
        }
        if ((i & 64) != 0) {
            C1516 c15165 = c1911.f5654;
            long j2 = c1573.f4647;
            InterfaceC1514 interfaceC15146 = c15165.f4356;
            if (!C1599.m2949(j2, interfaceC15146.mo2750())) {
                interfaceC15146.mo2746(j2);
            }
        }
        if ((i & 128) != 0) {
            C1516 c15166 = c1911.f5654;
            long j3 = c1573.f4648;
            InterfaceC1514 interfaceC15147 = c15166.f4356;
            if (!C1599.m2949(j3, interfaceC15147.mo2745())) {
                interfaceC15147.mo2733(j3);
            }
        }
        if ((i & 1024) != 0) {
            InterfaceC1514 interfaceC15148 = c1911.f5654.f4356;
            if (interfaceC15148.mo2752() != 0.0f) {
                interfaceC15148.mo2723();
            }
        }
        if ((i & 256) != 0) {
            C1516 c15167 = c1911.f5654;
            float f6 = c1573.f4638;
            InterfaceC1514 interfaceC15149 = c15167.f4356;
            if (interfaceC15149.mo2725() != f6) {
                interfaceC15149.mo2722(f6);
            }
        }
        if ((i & 512) != 0) {
            C1516 c15168 = c1911.f5654;
            float f7 = c1573.f4637;
            InterfaceC1514 interfaceC151410 = c15168.f4356;
            if (interfaceC151410.mo2747() != f7) {
                interfaceC151410.mo2739(f7);
            }
        }
        if ((i & 2048) != 0) {
            C1516 c15169 = c1911.f5654;
            float f8 = c1573.f4636;
            InterfaceC1514 interfaceC151411 = c15169.f4356;
            if (interfaceC151411.mo2728() != f8) {
                interfaceC151411.mo2731(f8);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zM2985 = C1615.m2985(c1911.f5634, C1615.f4727);
            C1516 c151610 = c1911.f5654;
            if (!zM2985) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c1911.f5634 & 4294967295L)) * ((int) (c1911.f5650 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c1911.f5634 >> 32)) * ((int) (c1911.f5650 >> 32)))) << 32);
                if (!C7329.m12528(c151610.f4362, jFloatToRawIntBits)) {
                    c151610.f4362 = jFloatToRawIntBits;
                    c151610.f4356.mo2749(jFloatToRawIntBits);
                }
            } else if (!C7329.m12528(c151610.f4362, 9205357640488583168L)) {
                c151610.f4362 = 9205357640488583168L;
                c151610.f4356.mo2749(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            C1516 c151611 = c1911.f5654;
            boolean z3 = c1573.f4633;
            if (c151611.f4359 != z3) {
                c151611.f4359 = z3;
                c151611.f4370 = true;
                c151611.m2797();
            }
        }
        if ((131072 & i) != 0) {
            C1516 c151612 = c1911.f5654;
            C1606 c1606 = c1573.f4641;
            InterfaceC1514 interfaceC151412 = c151612.f4356;
            if (!AbstractC4395.m8907(interfaceC151412.mo2736(), c1606)) {
                interfaceC151412.mo2729(c1606);
            }
        }
        if ((262144 & i) != 0) {
            InterfaceC1514 interfaceC151413 = c1911.f5654.f4356;
            if (!AbstractC4395.m8907(interfaceC151413.mo2755(), null)) {
                interfaceC151413.mo2743();
            }
        }
        if ((524288 & i) != 0) {
            C1516 c151613 = c1911.f5654;
            int i3 = c1573.f4640;
            InterfaceC1514 interfaceC151414 = c151613.f4356;
            if (interfaceC151414.mo2721() != i3) {
                interfaceC151414.mo2753(i3);
            }
        }
        if ((32768 & i) != 0) {
            InterfaceC1514 interfaceC151415 = c1911.f5654.f4356;
            if (interfaceC151415.mo2758() != 0) {
                interfaceC151415.mo2724(0);
            }
        }
        if ((i & 7963) != 0) {
            c1911.f5644 = true;
            c1911.f5643 = true;
        }
        if (AbstractC4395.m8907(c1911.f5645, c1573.f4639)) {
            viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
            z2 = false;
        } else {
            AbstractC1581 abstractC1581 = c1573.f4639;
            c1911.f5645 = abstractC1581;
            if (abstractC1581 == null) {
                viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
            } else {
                C1516 c151614 = c1911.f5654;
                if (abstractC1581 instanceof C1585) {
                    C7328 c7328 = ((C1585) abstractC1581).f4672;
                    float f9 = c7328.f19540;
                    float f10 = c7328.f19539;
                    viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
                    c151614.m2798(0.0f, (((long) Float.floatToRawIntBits(f9)) << c) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), (((long) Float.floatToRawIntBits(c7328.f19538 - f9)) << c) | (((long) Float.floatToRawIntBits(c7328.f19537 - f10)) & 4294967295L));
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC1884 = viewTreeObserverOnGlobalLayoutListenerC18843;
                    if (abstractC1581 instanceof C1586) {
                        C1614 c1614 = ((C1586) abstractC1581).f4673;
                        c151614.f4371 = null;
                        c151614.f4373 = 9205357640488583168L;
                        c151614.f4369 = 0L;
                        c151614.f4374 = 0.0f;
                        c151614.f4370 = true;
                        c151614.f4363 = false;
                        c151614.f4372 = c1614;
                        c151614.m2797();
                    } else {
                        if (!(abstractC1581 instanceof C1576)) {
                            C4211.m8611();
                            return;
                        }
                        C1576 c1576 = (C1576) abstractC1581;
                        C1614 c16142 = c1576.f4657;
                        if (c16142 != null) {
                            c151614.f4371 = null;
                            c151614.f4373 = 9205357640488583168L;
                            c151614.f4369 = 0L;
                            c151614.f4374 = 0.0f;
                            c151614.f4370 = true;
                            c151614.f4363 = false;
                            c151614.f4372 = c16142;
                            c151614.m2797();
                        } else {
                            C7327 c7327 = c1576.f4656;
                            float f11 = c7327.f19532;
                            float f12 = c7327.f19533;
                            c151614.m2798(Float.intBitsToFloat((int) (c7327.f19534 >> c)), (((long) Float.floatToRawIntBits(f12)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(c7327.f19531 - f12)) << c) | (((long) Float.floatToRawIntBits(c7327.f19530 - f11)) & 4294967295L));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC1581 instanceof C1586) || ((abstractC1581 instanceof C1576) && !AbstractC8175.m13638(((C1576) abstractC1581).f4656))) && (interfaceC6543 = c1911.f5646) != null)) {
                    interfaceC6543.invoke();
                }
            }
            z2 = true;
        }
        c1911.f5635 = c1573.f4653;
        if (i != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC18842 = viewTreeObserverOnGlobalLayoutListenerC1884;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC18842, viewTreeObserverOnGlobalLayoutListenerC18842);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC18842 = viewTreeObserverOnGlobalLayoutListenerC1884;
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC1884.m3515()) {
                viewTreeObserverOnGlobalLayoutListenerC18842.m3524(0.0f);
            }
        }
        boolean z4 = this.f5254;
        this.f5254 = c1573.f4633;
        this.f5252 = c1573.f4646;
        boolean z5 = c17752.f5210 == c1775.f5210 && c17752.f5209 == c1775.f5209 && c17752.f5208 == c1775.f5208 && c17752.f5207 == c1775.f5207 && c17752.f5206 == c1775.f5206 && c17752.f5205 == c1775.f5205 && c17752.f5212 == c1775.f5212 && C1615.m2985(c17752.f5211, c1775.f5211);
        if (z && ((!z5 || z4 != this.f5254) && (interfaceC1801 = c1748.f5105) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3530(c1748);
        }
        if (z5) {
            return;
        }
        c1748.m3233(this);
        if (c1748.f5127 > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18844 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748);
            C0076 c0076 = viewTreeObserverOnGlobalLayoutListenerC18844.f5494.f5048;
            c0076.getClass();
            if (c1748.f5127 > 0) {
                ((C1224) c0076.f227).m2047(c1748);
                c1748.f5128 = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC18844.m3535(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m3411(InterfaceC6558 interfaceC6558, boolean z) {
        InterfaceC1801 interfaceC1801;
        C1224 c1224;
        Reference referencePoll;
        InterfaceC6554 interfaceC6554;
        C1224 c12242;
        Reference referencePoll2;
        Object obj;
        C1748 c1748 = this.f5259;
        boolean z2 = (!z && this.f5251 == interfaceC6558 && AbstractC4395.m8907(this.f5250, c1748.f5099) && this.f5253 == c1748.f5100) ? false : true;
        this.f5250 = c1748.f5099;
        this.f5253 = c1748.f5100;
        boolean zM3243 = c1748.m3243();
        InterfaceC6543 interfaceC6543 = this.f5263;
        if (!zM3243 || interfaceC6558 == null) {
            this.f5251 = null;
            InterfaceC1806 interfaceC1806 = this.f5260;
            if (interfaceC1806 != null) {
                C1911 c1911 = (C1911) interfaceC1806;
                if (!AbstractC1581.m2886(c1911.m3611())) {
                    c1748.m3233(this);
                }
                c1911.f5647 = null;
                c1911.f5646 = null;
                c1911.f5651 = true;
                c1911.m3607(false);
                InterfaceC1583 interfaceC1583 = c1911.f5652;
                if (interfaceC1583 != null) {
                    interfaceC1583.mo2581(c1911.f5654);
                    ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c1911.f5653;
                    C0076 c0076 = viewTreeObserverOnGlobalLayoutListenerC1884.f5470;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c0076.f228;
                        c1224 = (C1224) c0076.f227;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            c1224.m2055(referencePoll);
                        }
                    } while (referencePoll != null);
                    c1224.m2047(new WeakReference(c1911, (ReferenceQueue) c0076.f228));
                    viewTreeObserverOnGlobalLayoutListenerC1884.f5422.m776(c1911);
                }
                this.f5260 = null;
                c1748.f5136 = true;
                interfaceC6543.invoke();
                if (mo3282().f6279 && c1748.m3242() && (interfaceC1801 = c1748.f5105) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3530(c1748);
                }
            }
            this.f5264 = false;
            return;
        }
        this.f5251 = interfaceC6558;
        if (this.f5260 != null) {
            if (z2) {
                m3410(true);
                return;
            }
            return;
        }
        InterfaceC1801 interfaceC1801M3306 = AbstractC1757.m3306(c1748);
        InterfaceC6554 interfaceC65542 = this.f5266;
        if (interfaceC65542 == null) {
            final InterfaceC6543 interfaceC65432 = new InterfaceC6543() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3159invoke() {
                    AbstractC1794 abstractC1794 = this.this$0;
                    InterfaceC1601 interfaceC1601 = abstractC1794.f5265;
                    interfaceC1601.getClass();
                    abstractC1794.m3402(interfaceC1601, this.this$0.f5261);
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3159invoke();
                    return C5176.f14739;
                }
            };
            InterfaceC6554 interfaceC65543 = new InterfaceC6554() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1601 interfaceC1601, C1516 c1516) {
                    boolean zM3242 = this.this$0.f5259.m3242();
                    AbstractC1794 abstractC1794 = this.this$0;
                    if (!zM3242) {
                        abstractC1794.f5264 = true;
                        return;
                    }
                    abstractC1794.f5265 = interfaceC1601;
                    abstractC1794.f5261 = c1516;
                    C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(abstractC1794.f5259)).getSnapshotObserver();
                    snapshotObserver.f5274.m2246(this.this$0, AbstractC1794.f5238, interfaceC65432);
                    this.this$0.f5264 = false;
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((InterfaceC1601) obj2, (C1516) obj3);
                    return C5176.f14739;
                }
            };
            this.f5266 = interfaceC65543;
            interfaceC6554 = interfaceC65543;
        } else {
            interfaceC6554 = interfaceC65542;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3306;
        C0076 c00762 = viewTreeObserverOnGlobalLayoutListenerC18842.f5470;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c00762.f228;
            c12242 = (C1224) c00762.f227;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                c12242.m2055(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i = c12242.f3520;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) c12242.m2053(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        InterfaceC1806 c19112 = (InterfaceC1806) obj;
        if (c19112 != null) {
            C1911 c19113 = (C1911) c19112;
            InterfaceC1583 interfaceC15832 = c19113.f5652;
            if (interfaceC15832 == null) {
                throw AbstractC0053.m139("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c19113.f5654.f4358) {
                AbstractC7936.m13425("layer should have been released before reuse");
            }
            c19113.f5654 = interfaceC15832.mo2580();
            c19113.f5651 = false;
            c19113.f5647 = interfaceC6554;
            c19113.f5646 = interfaceC6543;
            c19113.f5644 = false;
            c19113.f5643 = false;
            c19113.f5642 = true;
            C1587.m2904(c19113.f5648);
            float[] fArr = c19113.f5649;
            if (fArr != null) {
                C1587.m2904(fArr);
            }
            c19113.f5634 = C1615.f4727;
            c19113.f5641 = false;
            c19113.f5650 = 9223372034707292159L;
            c19113.f5645 = null;
            c19113.f5635 = 0;
        } else {
            c19112 = new C1911(viewTreeObserverOnGlobalLayoutListenerC18842.getGraphicsContext().mo2580(), viewTreeObserverOnGlobalLayoutListenerC18842.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC18842, interfaceC6554, interfaceC6543);
        }
        C1911 c19114 = (C1911) c19112;
        c19114.m3608(this.f4998);
        c19114.m3609(this.f5245);
        this.f5260 = c19112;
        m3410(true);
        c1748.f5136 = true;
        interfaceC6543.invoke();
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final InterfaceC1695 mo3205() {
        return this;
    }
}
