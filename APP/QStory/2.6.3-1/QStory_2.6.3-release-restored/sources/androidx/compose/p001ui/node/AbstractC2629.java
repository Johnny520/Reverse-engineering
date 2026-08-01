package androidx.compose.p001ui.node;

import android.os.Build;
import android.view.ViewParent;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0955;
import androidx.collection.AbstractC1081;
import androidx.collection.C1091;
import androidx.collection.C1099;
import androidx.collection.C1102;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2438;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.C2411;
import androidx.compose.p001ui.graphics.C2420;
import androidx.compose.p001ui.graphics.C2421;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2441;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.C2450;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.graphics.layer.InterfaceC2349;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.C2498;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.platform.AbstractC2751;
import androidx.compose.p001ui.platform.C2746;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import io.ktor.util.C5043;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.C6008;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8156;
import p128.C8157;
import p128.C8158;
import p128.C8159;
import p160.C8376;
import p221.C8737;
import p221.InterfaceC8725;
import p226.AbstractC8765;
import p267.AbstractC9004;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2629 extends AbstractC2589 implements InterfaceC2490, InterfaceC2530, InterfaceC2639 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f5588;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float f5589;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C2610 f5591;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C8159 f5592;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC2492 f5593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C1099 f5594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC8725 f5595;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC7387 f5596;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public LayoutDirection f5598;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f5599;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5600;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC2629 f5601;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC2629 f5602;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2583 f5604;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public InterfaceC2641 f5605;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public C2351 f5606;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f5607;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public boolean f5609;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public InterfaceC2436 f5610;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public InterfaceC7383 f5611;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final InterfaceC7387 f5584 = new InterfaceC7387() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public final void invoke(AbstractC2629 abstractC2629) throws Throwable {
            C2583 c2583 = abstractC2629.f5604;
            try {
                if (abstractC2629.mo3815()) {
                    abstractC2629.m3970(true);
                }
            } catch (Throwable th) {
                c2583.m3837(th);
                throw null;
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((AbstractC2629) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final InterfaceC7387 f5583 = new InterfaceC7387() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void invoke(AbstractC2629 abstractC2629) {
            InterfaceC2641 interfaceC2641 = abstractC2629.f5605;
            if (interfaceC2641 != null) {
                ((C2746) interfaceC2641).m4170();
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC2629) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static final C2408 f5582 = new C2408();

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static final C2610 f5581 = new C2610();

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static final float[] f5580 = C2422.m3467();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final C2647 f5585 = new C2647();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static final C2644 f5586 = new C2644();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public float f5597 = 0.8f;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public long f5590 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC2404 f5587 = AbstractC2416.f5007;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InterfaceC7372 f5608 = new InterfaceC7372() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3720invoke() {
            AbstractC2629 abstractC2629 = this.this$0.f5601;
            if (abstractC2629 != null) {
                abstractC2629.m3942();
            }
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3720invoke();
            return C6008.f15084;
        }
    };

    public AbstractC2629(C2583 c2583) {
        this.f5604 = c2583;
        this.f5595 = c2583.f5444;
        this.f5598 = c2583.f5445;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public static AbstractC2629 m3939(InterfaceC2530 interfaceC2530) {
        AbstractC2629 abstractC2629;
        C2498 c2498 = interfaceC2530 instanceof C2498 ? (C2498) interfaceC2530 : null;
        if (c2498 != null && (abstractC2629 = c2498.f5223.f5408) != null) {
            return abstractC2629;
        }
        interfaceC2530.getClass();
        return (AbstractC2629) interfaceC2530;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f5604.f5445;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final long mo3636(long j) {
        if (!mo3842().f6624) {
            AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3943();
        while (this != null) {
            C2583 c2583 = this.f5604;
            if (this == c2583.f5439.f5630 && !c2583.f5469) {
                long jM4248 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getRectManager().m4248(c2583);
                if (!C8737.m13923(jM4248, 9223372034707292159L)) {
                    return AbstractC9019.m14254(j, jM4248);
                }
            }
            InterfaceC2641 interfaceC2641 = this.f5605;
            if (interfaceC2641 != null) {
                C2746 c2746 = (C2746) interfaceC2641;
                float[] fArrM4171 = c2746.m4171();
                if (!c2746.f5987) {
                    j = C2422.m3466(j, fArrM4171);
                }
            }
            j = AbstractC9019.m14254(j, this.f5590);
            this = this.f5601;
        }
        return j;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo3637(InterfaceC2530 interfaceC2530, float[] fArr) {
        AbstractC2629 abstractC2629M3939 = m3939(interfaceC2530);
        abstractC2629M3939.m3943();
        AbstractC2629 abstractC2629M3960 = m3960(abstractC2629M3939);
        C2422.m3464(fArr);
        abstractC2629M3939.m3948(abstractC2629M3960, fArr);
        m3949(abstractC2629M3960, fArr);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final long mo3638(long j) {
        if (!mo3842().f6624) {
            AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC2530 interfaceC2530M3673 = AbstractC2505.m3673(this);
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5604);
        viewTreeObserverOnGlobalLayoutListenerC2719.m4086();
        return mo3645(interfaceC2530M3673, C8158.m13085(C2422.m3466(j, viewTreeObserverOnGlobalLayoutListenerC2719.f5834), interfaceC2530M3673.mo3636(0L)));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final long mo3639(long j) {
        if (!mo3842().f6624) {
            AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo3645(AbstractC2505.m3673(this), ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5604)).m4094(j));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC2530 mo3640() {
        boolean z = mo3842().f6624;
        C2583 c2583 = this.f5604;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C2583 c2583M3816 = c2583; c2583M3816 != null; c2583M3816 = c2583M3816.m3816()) {
                sb.append("\n|");
                sb.append(c2583M3816);
                sb.append(" isAttached=");
                sb.append(c2583M3816.m3803());
                sb.append(" modifier=");
                sb.append(c2583M3816.f5478);
                sb.append(" tail=");
                sb.append(mo3842());
            }
            AbstractC8765.m13982(sb.toString());
        }
        m3943();
        return c2583.f5439.f5630.f5601;
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
    @Override // androidx.compose.p001ui.layout.AbstractC2559, androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3616() {
        C2583 c2583 = this.f5604;
        if (!c2583.f5439.m3988(64)) {
            return null;
        }
        mo3842();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (AbstractC2961 abstractC2961 = c2583.f5439.f5629; abstractC2961 != null; abstractC2961 = abstractC2961.f6629) {
            if ((abstractC2961.f6636 & 64) != 0) {
                ?? M3899 = abstractC2961;
                ?? c2059 = 0;
                while (M3899 != 0) {
                    if (M3899 instanceof InterfaceC2634) {
                        ref$ObjectRef.element = ((InterfaceC2634) M3899).mo1936(ref$ObjectRef.element);
                    } else if ((M3899.f6636 & 64) != 0 && (M3899 instanceof AbstractC2623)) {
                        AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                        int i = 0;
                        M3899 = M3899;
                        c2059 = c2059;
                        while (abstractC29612 != null) {
                            if ((abstractC29612.f6636 & 64) != 0) {
                                i++;
                                c2059 = c2059;
                                if (i == 1) {
                                    M3899 = abstractC29612;
                                } else {
                                    if (c2059 == 0) {
                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (M3899 != 0) {
                                        c2059.m2607(M3899);
                                        M3899 = 0;
                                    }
                                    c2059.m2607(abstractC29612);
                                }
                            }
                            abstractC29612 = abstractC29612.f6633;
                            M3899 = M3899;
                            c2059 = c2059;
                        }
                        if (i == 1) {
                        }
                    }
                    M3899 = AbstractC2620.m3899(c2059);
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
    public final void m3940() {
        AbstractC2961 abstractC2961Mo3842;
        boolean zM3938 = AbstractC2628.m3938(128);
        AbstractC2961 abstractC2961M3953 = m3953(zM3938);
        if (abstractC2961M3953 == null || (abstractC2961M3953.f6637.f6630 & 128) == 0) {
            return;
        }
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            if (!zM3938) {
                abstractC2961Mo3842 = mo3842().f6629;
                if (abstractC2961Mo3842 == null) {
                }
            }
            abstractC2961Mo3842 = mo3842();
            for (AbstractC2961 abstractC2961M39532 = m3953(zM3938); abstractC2961M39532 != null; abstractC2961M39532 = abstractC2961M39532.f6633) {
                if ((abstractC2961M39532.f6630 & 128) == 0) {
                    break;
                }
                if ((abstractC2961M39532.f6636 & 128) != 0) {
                    ?? M3899 = abstractC2961M39532;
                    ?? c2059 = 0;
                    while (M3899 != 0) {
                        if (M3899 instanceof InterfaceC2575) {
                            ((InterfaceC2575) M3899).mo1881(this.f5343);
                        } else if ((M3899.f6636 & 128) != 0 && (M3899 instanceof AbstractC2623)) {
                            AbstractC2961 abstractC2961 = ((AbstractC2623) M3899).f5571;
                            int i = 0;
                            M3899 = M3899;
                            c2059 = c2059;
                            while (abstractC2961 != null) {
                                if ((abstractC2961.f6636 & 128) != 0) {
                                    i++;
                                    c2059 = c2059;
                                    if (i == 1) {
                                        M3899 = abstractC2961;
                                    } else {
                                        if (c2059 == 0) {
                                            c2059 = new C2059(0, new AbstractC2961[16]);
                                        }
                                        if (M3899 != 0) {
                                            c2059.m2607(M3899);
                                            M3899 = 0;
                                        }
                                        c2059.m2607(abstractC2961);
                                    }
                                }
                                abstractC2961 = abstractC2961.f6633;
                                M3899 = M3899;
                                c2059 = c2059;
                            }
                            if (i == 1) {
                            }
                        }
                        M3899 = AbstractC2620.m3899(c2059);
                    }
                }
                if (abstractC2961M39532 == abstractC2961Mo3842) {
                    break;
                }
            }
        } finally {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
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
    public final void m3941() {
        boolean zM3938 = AbstractC2628.m3938(4194304);
        AbstractC2961 abstractC2961Mo3842 = mo3842();
        if (!zM3938 && (abstractC2961Mo3842 = abstractC2961Mo3842.f6629) == null) {
            return;
        }
        for (AbstractC2961 abstractC2961M3953 = m3953(zM3938); abstractC2961M3953 != null && (abstractC2961M3953.f6630 & 4194304) != 0; abstractC2961M3953 = abstractC2961M3953.f6633) {
            if ((abstractC2961M3953.f6636 & 4194304) != 0) {
                ?? M3899 = abstractC2961M3953;
                ?? c2059 = 0;
                while (M3899 != 0) {
                    if (M3899 instanceof InterfaceC2611) {
                        ((InterfaceC2611) M3899).mo2136(this);
                    } else if ((M3899.f6636 & 4194304) != 0 && (M3899 instanceof AbstractC2623)) {
                        AbstractC2961 abstractC2961 = ((AbstractC2623) M3899).f5571;
                        int i = 0;
                        M3899 = M3899;
                        c2059 = c2059;
                        while (abstractC2961 != null) {
                            if ((abstractC2961.f6636 & 4194304) != 0) {
                                i++;
                                c2059 = c2059;
                                if (i == 1) {
                                    M3899 = abstractC2961;
                                } else {
                                    if (c2059 == 0) {
                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (M3899 != 0) {
                                        c2059.m2607(M3899);
                                        M3899 = 0;
                                    }
                                    c2059.m2607(abstractC2961);
                                }
                            }
                            abstractC2961 = abstractC2961.f6633;
                            M3899 = M3899;
                            c2059 = c2059;
                        }
                        if (i == 1) {
                        }
                    }
                    M3899 = AbstractC2620.m3899(c2059);
                }
            }
            if (abstractC2961M3953 == abstractC2961Mo3842) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m3942() {
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 != null) {
            ((C2746) interfaceC2641).m4170();
            return;
        }
        AbstractC2629 abstractC2629 = this.f5601;
        if (abstractC2629 != null) {
            abstractC2629.m3942();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public void mo3886(InterfaceC2645 interfaceC2645, long j, C2615 c2615, int i, boolean z) {
        AbstractC2629 abstractC2629 = this.f5602;
        if (abstractC2629 != null) {
            abstractC2629.m3952(interfaceC2645, abstractC2629.m3961(j), c2615, i, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void m3943() {
        this.f5604.f5477.m3860();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final boolean m3944() {
        if (this.f5605 != null && this.f5597 <= 0.0f) {
            return true;
        }
        AbstractC2629 abstractC2629 = this.f5601;
        if (abstractC2629 != null) {
            return abstractC2629.m3944();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final C8157 m3945() {
        if (mo3842().f6624) {
            InterfaceC2530 interfaceC2530M3673 = AbstractC2505.m3673(this);
            C8159 c8159 = this.f5592;
            if (c8159 == null) {
                c8159 = new C8159();
                this.f5592 = c8159;
            }
            long jM3964 = m3964(m3963());
            int i = (int) (jM3964 >> 32);
            c8159.f19890 = -Float.intBitsToFloat(i);
            int i2 = (int) (jM3964 & 4294967295L);
            c8159.f19889 = -Float.intBitsToFloat(i2);
            c8159.f19888 = Float.intBitsToFloat(i) + mo3699();
            c8159.f19887 = Float.intBitsToFloat(i2) + mo3698();
            while (this != interfaceC2530M3673) {
                this.m3957(c8159, false, true);
                if (!c8159.m13093()) {
                    this = this.f5601;
                    this.getClass();
                }
            }
            return new C8157(c8159.f19890, c8159.f19889, c8159.f19888, c8159.f19887);
        }
        return C8157.f19881;
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
    public final void m3946(InterfaceC2492 interfaceC2492) {
        AbstractC2629 abstractC2629;
        InterfaceC2492 interfaceC24922 = this.f5593;
        if (interfaceC2492 != interfaceC24922) {
            this.f5593 = interfaceC2492;
            C2583 c2583 = this.f5604;
            int i = 0;
            if (interfaceC24922 == null || interfaceC2492.mo2033() != interfaceC24922.mo2033() || interfaceC2492.mo2034() != interfaceC24922.mo2034()) {
                int iMo2033 = interfaceC2492.mo2033();
                int iMo2034 = interfaceC2492.mo2034();
                InterfaceC2641 interfaceC2641 = this.f5605;
                if (interfaceC2641 != null) {
                    ((C2746) interfaceC2641).m4168((((long) iMo2033) << 32) | (((long) iMo2034) & 4294967295L));
                } else if (c2583.m3802() && (abstractC2629 = this.f5601) != null) {
                    abstractC2629.m3942();
                }
                m3701((((long) iMo2034) & 4294967295L) | (((long) iMo2033) << 32));
                if (this.f5596 != null) {
                    m3970(false);
                }
                boolean zM3938 = AbstractC2628.m3938(4);
                AbstractC2961 abstractC2961Mo3842 = mo3842();
                if (zM3938 || (abstractC2961Mo3842 = abstractC2961Mo3842.f6629) != null) {
                    for (AbstractC2961 abstractC2961M3953 = m3953(zM3938); abstractC2961M3953 != null && (abstractC2961M3953.f6630 & 4) != 0; abstractC2961M3953 = abstractC2961M3953.f6633) {
                        if ((abstractC2961M3953.f6636 & 4) != 0) {
                            ?? M3899 = abstractC2961M3953;
                            ?? c2059 = 0;
                            while (M3899 != 0) {
                                if (M3899 instanceof InterfaceC2616) {
                                    ((InterfaceC2616) M3899).mo3131();
                                } else if ((M3899.f6636 & 4) != 0 && (M3899 instanceof AbstractC2623)) {
                                    AbstractC2961 abstractC2961 = ((AbstractC2623) M3899).f5571;
                                    int i2 = 0;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                    while (abstractC2961 != null) {
                                        if ((abstractC2961.f6636 & 4) != 0) {
                                            i2++;
                                            c2059 = c2059;
                                            if (i2 == 1) {
                                                M3899 = abstractC2961;
                                            } else {
                                                if (c2059 == 0) {
                                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (M3899 != 0) {
                                                    c2059.m2607(M3899);
                                                    M3899 = 0;
                                                }
                                                c2059.m2607(abstractC2961);
                                            }
                                        }
                                        abstractC2961 = abstractC2961.f6633;
                                        M3899 = M3899;
                                        c2059 = c2059;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3899 = AbstractC2620.m3899(c2059);
                            }
                        }
                        if (abstractC2961M3953 == abstractC2961Mo3842) {
                            break;
                        }
                    }
                }
                InterfaceC2636 interfaceC2636 = c2583.f5450;
                if (interfaceC2636 != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).m4090(c2583);
                }
                c2583.m3793(this);
            }
            C1099 c1099 = this.f5594;
            if ((c1099 == null || c1099.f1259 == 0) && interfaceC2492.mo2032().isEmpty()) {
                return;
            }
            C1099 c10992 = this.f5594;
            Map mapMo2032 = interfaceC2492.mo2032();
            if (c10992 != null && c10992.f1259 == mapMo2032.size()) {
                Object[] objArr = c10992.f1262;
                int[] iArr = c10992.f1261;
                long[] jArr = c10992.f1263;
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
                                Integer num = (Integer) mapMo2032.get((AbstractC2524) obj);
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
            c2583.f5477.f5512.f5365.m3884();
            C1099 c10993 = this.f5594;
            if (c10993 == null) {
                C1099 c10994 = AbstractC1081.f1219;
                c10993 = new C1099();
                this.f5594 = c10993;
            }
            c10993.m1367();
            for (Map.Entry entry : interfaceC2492.mo2032().entrySet()) {
                c10993.m1368(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m3947(final AbstractC2961 abstractC2961, final InterfaceC2645 interfaceC2645, final long j, final C2615 c2615, final int i, final boolean z, final float f) {
        int i2;
        if (abstractC2961 == null) {
            mo3886(interfaceC2645, j, c2615, i, z);
            return;
        }
        if (!interfaceC2645.mo3976(abstractC2961)) {
            m3947(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z, f);
            return;
        }
        if (!interfaceC2645.mo3978(abstractC2961)) {
            m3959(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z, f, false);
            return;
        }
        InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3722invoke() {
                AbstractC2629 abstractC2629 = this.this$0;
                AbstractC2961 abstractC2961M3900 = AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980());
                InterfaceC2645 interfaceC26452 = interfaceC2645;
                long j2 = j;
                C2615 c26152 = c2615;
                int i3 = i;
                boolean z2 = z;
                float f2 = f;
                InterfaceC7387 interfaceC7387 = AbstractC2629.f5584;
                abstractC2629.m3959(abstractC2961M3900, interfaceC26452, j2, c26152, i3, z2, f2, false);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3722invoke();
                return C6008.f15084;
            }
        };
        C1102 c1102 = c2615.f5564;
        C1091 c1091 = c2615.f5566;
        int i3 = c2615.f5565;
        int i4 = c1091.f1349;
        if (i3 != i4 - 1) {
            long jM3892 = c2615.m3892();
            int i5 = c2615.f5565;
            int i6 = c1091.f1349;
            int i7 = i6 - 1;
            c2615.f5565 = i7;
            c2615.m3891(i6, c1091.f1349);
            c2615.f5565++;
            c1091.m1335(abstractC2961);
            c1102.m1379(AbstractC2620.m3903(f, z, false));
            interfaceC7372.invoke();
            c2615.f5565 = i7;
            long jM38922 = c2615.m3892();
            if (c2615.f5565 + 1 >= c1091.f1349 - 1 || AbstractC2620.m3917(jM3892, jM38922) <= 0) {
                c2615.m3891(c2615.f5565 + 1, c1091.f1349);
            } else {
                int i8 = i5 + 1;
                boolean zM3915 = AbstractC2620.m3915(jM38922);
                int i9 = c2615.f5565;
                c2615.m3891(i8, zM3915 ? i9 + 2 : i9 + 1);
            }
            c2615.f5565 = i5;
            return;
        }
        int i10 = i3 + 1;
        c2615.m3891(i10, i4);
        c2615.f5565++;
        c1091.m1335(abstractC2961);
        c1102.m1379(AbstractC2620.m3903(f, z, false));
        interfaceC7372.invoke();
        c2615.f5565 = i3;
        if (i10 == c1091.f1349 - 1 || AbstractC2620.m3915(c2615.m3892())) {
            int i11 = c2615.f5565;
            int i12 = i11 + 1;
            c1091.m1337(i12);
            if (i12 < 0 || i12 >= (i2 = c1102.f1275)) {
                C8376.m13331("Index must be between 0 and size");
                return;
            }
            long[] jArr = c1102.f1276;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                AbstractC5179.m9401(jArr, jArr, i12, i11 + 2, i2);
            }
            c1102.f1275--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m3948(AbstractC2629 abstractC2629, float[] fArr) {
        while (!this.equals(abstractC2629)) {
            InterfaceC2641 interfaceC2641 = this.f5605;
            if (interfaceC2641 != null) {
                C2422.m3463(fArr, ((C2746) interfaceC2641).m4171());
            }
            if (!C8737.m13923(this.f5590, 0L)) {
                float[] fArr2 = f5580;
                C2422.m3464(fArr2);
                C2422.m3462(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                C2422.m3463(fArr, fArr2);
            }
            this = this.f5601;
            this.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void m3949(AbstractC2629 abstractC2629, float[] fArr) {
        float[] fArrM4172;
        if (AbstractC5227.m9466(abstractC2629, this)) {
            return;
        }
        AbstractC2629 abstractC26292 = this.f5601;
        abstractC26292.getClass();
        abstractC26292.m3949(abstractC2629, fArr);
        if (!C8737.m13923(this.f5590, 0L)) {
            float[] fArr2 = f5580;
            C2422.m3464(fArr2);
            long j = this.f5590;
            C2422.m3462(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            C2422.m3463(fArr, fArr2);
        }
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 == null || (fArrM4172 = ((C2746) interfaceC2641).m4172()) == null) {
            return;
        }
        C2422.m3463(fArr, fArrM4172);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final AbstractC2961 m3950(int i) {
        boolean zM3938 = AbstractC2628.m3938(i);
        AbstractC2961 abstractC2961Mo3842 = mo3842();
        if (!zM3938 && (abstractC2961Mo3842 = abstractC2961Mo3842.f6629) == null) {
            return null;
        }
        for (AbstractC2961 abstractC2961M3953 = m3953(zM3938); abstractC2961M3953 != null && (abstractC2961M3953.f6630 & i) != 0; abstractC2961M3953 = abstractC2961M3953.f6633) {
            if ((abstractC2961M3953.f6636 & i) != 0) {
                return abstractC2961M3953;
            }
            if (abstractC2961M3953 == abstractC2961Mo3842) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public abstract AbstractC2961 mo3842();

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m3951(AbstractC2961 abstractC2961, InterfaceC2645 interfaceC2645, long j, C2615 c2615, int i, boolean z, float f) {
        if (abstractC2961 == null) {
            mo3886(interfaceC2645, j, c2615, i, z);
            return;
        }
        if (!interfaceC2645.mo3976(abstractC2961)) {
            m3951(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z, f);
            return;
        }
        int i2 = c2615.f5565;
        C1091 c1091 = c2615.f5566;
        c2615.m3891(i2 + 1, c1091.f1349);
        c2615.f5565++;
        c1091.m1335(abstractC2961);
        c2615.f5564.m1379(AbstractC2620.m3903(f, z, false));
        m3959(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z, f, true);
        c2615.f5565 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m3952(InterfaceC2645 interfaceC2645, long j, C2615 c2615, int i, boolean z) {
        boolean z2;
        boolean z3;
        AbstractC2961 abstractC2961M3950 = m3950(interfaceC2645.mo3980());
        if (!m3969(j)) {
            if (i == 1) {
                float fM3967 = m3967(j, m3963());
                if ((Float.floatToRawIntBits(fM3967) & Integer.MAX_VALUE) < 2139095040) {
                    if (c2615.f5565 != c2615.f5566.f1349 - 1) {
                        if (AbstractC2620.m3917(c2615.m3892(), AbstractC2620.m3903(fM3967, false, false)) <= 0) {
                            return;
                        }
                    }
                    m3951(abstractC2961M3950, interfaceC2645, j, c2615, i, false, fM3967);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC2961M3950 == null) {
            mo3886(interfaceC2645, j, c2615, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo3699() && fIntBitsToFloat2 < mo3698()) {
            m3954(abstractC2961M3950, interfaceC2645, j, c2615, i, z);
            return;
        }
        float fM39672 = i == 1 ? m3967(j, m3963()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM39672) & Integer.MAX_VALUE) < 2139095040) {
            if (c2615.f5565 != c2615.f5566.f1349 - 1) {
                z2 = z;
                if (AbstractC2620.m3917(c2615.m3892(), AbstractC2620.m3903(fM39672, z2, false)) > 0) {
                }
                m3959(abstractC2961M3950, interfaceC2645, j, c2615, i, z2, fM39672, z3);
            }
            z2 = z;
            z3 = true;
            m3959(abstractC2961M3950, interfaceC2645, j, c2615, i, z2, fM39672, z3);
        }
        z2 = z;
        z3 = false;
        m3959(abstractC2961M3950, interfaceC2645, j, c2615, i, z2, fM39672, z3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final AbstractC2961 m3953(boolean z) {
        AbstractC2961 abstractC2961Mo3842;
        C2646 c2646 = this.f5604.f5439;
        if (c2646.f5630 == this) {
            return c2646.f5628;
        }
        AbstractC2629 abstractC2629 = this.f5601;
        if (!z) {
            if (abstractC2629 != null) {
                return abstractC2629.mo3842();
            }
            return null;
        }
        if (abstractC2629 == null || (abstractC2961Mo3842 = abstractC2629.mo3842()) == null) {
            return null;
        }
        return abstractC2961Mo3842.f6633;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m3954(AbstractC2961 abstractC2961, InterfaceC2645 interfaceC2645, long j, C2615 c2615, int i, boolean z) {
        if (abstractC2961 == null) {
            mo3886(interfaceC2645, j, c2615, i, z);
            return;
        }
        if (!interfaceC2645.mo3976(abstractC2961)) {
            m3954(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z);
            return;
        }
        int i2 = c2615.f5565;
        C1091 c1091 = c2615.f5566;
        c2615.m3891(i2 + 1, c1091.f1349);
        c2615.f5565++;
        c1091.m1335(abstractC2961);
        c2615.f5564.m1379(AbstractC2620.m3903(-1.0f, z, false));
        m3954(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z);
        c2615.f5565 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void m3955(long j, float f, InterfaceC7387 interfaceC7387) {
        m3971(interfaceC7387, false);
        boolean zM13923 = C8737.m13923(this.f5590, j);
        C2583 c2583 = this.f5604;
        if (!zM13923) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).m4084(-4.0f);
            this.f5590 = j;
            InterfaceC2641 interfaceC2641 = this.f5605;
            if (interfaceC2641 != null) {
                ((C2746) interfaceC2641).m4169(j);
            } else {
                AbstractC2629 abstractC2629 = this.f5601;
                if (abstractC2629 != null) {
                    abstractC2629.m3942();
                }
            }
            c2583.m3793(this);
            AbstractC2589.m3848(this);
            InterfaceC2636 interfaceC2636 = c2583.f5450;
            if (interfaceC2636 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).m4090(c2583);
            }
        }
        this.f5589 = f;
        if (this == c2583.f5439.f5630) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getRectManager().m4246(c2583);
        }
        if (this.f5492) {
            return;
        }
        m3853(mo3761());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public abstract void mo3843(InterfaceC2436 interfaceC2436, C2351 c2351);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void m3956() {
        if (this.f5605 != null) {
            m3971(null, false);
            this.f5604.m3785(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3957(C8159 c8159, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 != null) {
            if (this.f5599) {
                if (z2) {
                    long jM3963 = m3963();
                    float f = c8159.f19890;
                    float f2 = c8159.f19889;
                    if (c8159.f19888 >= 0.0f) {
                        long j = this.f5343;
                        if (f > ((int) (j >> 32)) || c8159.f19887 < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3963 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3963 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (c8159.f19888 - c8159.f19890)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (c8159.f19887 - c8159.f19889)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        long j2 = this.f5343;
                        float f7 = (int) (j2 >> 32);
                        int i = (int) (jM3963 >> 32);
                        float f8 = (int) (j2 & 4294967295L);
                        int i2 = (int) (jM3963 & 4294967295L);
                        c8159.m13094(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                    }
                } else if (z) {
                    long j3 = this.f5343;
                    c8159.m13094(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (c8159.m13093()) {
                    return;
                }
            }
            C2746 c2746 = (C2746) interfaceC2641;
            float[] fArrM4171 = c2746.m4171();
            if (!c2746.f5987) {
                if (fArrM4171 == null) {
                    c8159.f19890 = 0.0f;
                    c8159.f19889 = 0.0f;
                    c8159.f19888 = 0.0f;
                    c8159.f19887 = 0.0f;
                } else {
                    C2422.m3465(fArrM4171, c8159);
                }
            }
        }
        long j4 = this.f5590;
        float f9 = (int) (j4 >> 32);
        c8159.f19890 += f9;
        c8159.f19888 += f9;
        float f10 = (int) (j4 & 4294967295L);
        c8159.f19889 += f10;
        c8159.f19887 += f10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void m3958() {
        boolean zM3938 = AbstractC2628.m3938(1048576);
        AbstractC2961 abstractC2961M3953 = m3953(zM3938);
        if (abstractC2961M3953 == null || (abstractC2961M3953.f6637.f6630 & 1048576) == 0) {
            return;
        }
        AbstractC2961 abstractC2961Mo3842 = mo3842();
        if (!zM3938 && (abstractC2961Mo3842 = abstractC2961Mo3842.f6629) == null) {
            return;
        }
        for (AbstractC2961 abstractC2961M39532 = m3953(zM3938); abstractC2961M39532 != null && (abstractC2961M39532.f6630 & 1048576) != 0; abstractC2961M39532 = abstractC2961M39532.f6633) {
            if ((abstractC2961M39532.f6636 & 1048576) != 0) {
                AbstractC2961 abstractC2961M3899 = abstractC2961M39532;
                C2059 c2059 = null;
                while (abstractC2961M3899 != null) {
                    if ((abstractC2961M3899.f6636 & 1048576) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                        int i = 0;
                        for (AbstractC2961 abstractC2961 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
                            if ((abstractC2961.f6636 & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC2961M3899 = abstractC2961;
                                } else {
                                    if (c2059 == null) {
                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (abstractC2961M3899 != null) {
                                        c2059.m2607(abstractC2961M3899);
                                        abstractC2961M3899 = null;
                                    }
                                    c2059.m2607(abstractC2961);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC2961M3899 = AbstractC2620.m3899(c2059);
                }
            }
            if (abstractC2961M39532 == abstractC2961Mo3842) {
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
    */
    public final void m3959(final AbstractC2961 abstractC2961, final InterfaceC2645 interfaceC2645, final long j, final C2615 c2615, int i, final boolean z, final float f, final boolean z2) {
        ?? M3899;
        if (abstractC2961 == null) {
            mo3886(interfaceC2645, j, c2615, i, z);
            return;
        }
        if (!interfaceC2645.mo3976(abstractC2961)) {
            m3959(AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980()), interfaceC2645, j, c2615, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (i2 == 3 || i2 == 4) {
            ?? c2059 = 0;
            ?? r3 = abstractC2961;
            while (true) {
                if (r3 == 0) {
                    break;
                }
                if (r3 instanceof InterfaceC2631) {
                    long jMo2209 = ((InterfaceC2631) r3).mo2209();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    C2583 c2583 = this.f5604;
                    LayoutDirection layoutDirection = c2583.f5445;
                    int i4 = AbstractC2598.f5524;
                    long j2 = Long.MIN_VALUE & jMo2209;
                    if (fIntBitsToFloat >= (-((j2 == 0 || layoutDirection == LayoutDirection.Ltr) ? C2644.m3975(0, jMo2209) : C2644.m3975(2, jMo2209)))) {
                        if (Float.intBitsToFloat(i3) < mo3699() + ((j2 == 0 || c2583.f5445 == LayoutDirection.Ltr) ? C2644.m3975(2, jMo2209) : C2644.m3975(0, jMo2209))) {
                            int i5 = (int) (j & 4294967295L);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i5);
                            int i6 = AbstractC2598.f5524;
                            if (fIntBitsToFloat2 >= (-C2644.m3975(1, jMo2209))) {
                                if (Float.intBitsToFloat(i5) < C2644.m3975(3, jMo2209) + mo3698()) {
                                    final int i7 = i2;
                                    InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m3721invoke() {
                                            AbstractC2629 abstractC2629 = this.this$0;
                                            AbstractC2961 abstractC2961M3900 = AbstractC2620.m3900(abstractC2961, interfaceC2645.mo3980());
                                            InterfaceC2645 interfaceC26452 = interfaceC2645;
                                            long j3 = j;
                                            C2615 c26152 = c2615;
                                            int i8 = i7;
                                            boolean z3 = z;
                                            float f2 = f;
                                            boolean z4 = z2;
                                            InterfaceC7387 interfaceC7387 = AbstractC2629.f5584;
                                            abstractC2629.m3959(abstractC2961M3900, interfaceC26452, j3, c26152, i8, z3, f2, z4);
                                        }

                                        @Override // p068.InterfaceC7372
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m3721invoke();
                                            return C6008.f15084;
                                        }
                                    };
                                    C1102 c1102 = c2615.f5564;
                                    C1091 c1091 = c2615.f5566;
                                    int i8 = c2615.f5565;
                                    int i9 = c1091.f1349;
                                    if (i8 == i9 - 1) {
                                        c2615.m3891(i8 + 1, i9);
                                        c2615.f5565++;
                                        c1091.m1335(abstractC2961);
                                        c1102.m1379(AbstractC2620.m3903(0.0f, z, true));
                                        interfaceC7372.invoke();
                                        c2615.f5565 = i8;
                                        return;
                                    }
                                    long jM3892 = c2615.m3892();
                                    int i10 = c2615.f5565;
                                    if (!AbstractC2620.m3915(jM3892)) {
                                        if (AbstractC2620.m3919(jM3892) > 0.0f) {
                                            int i11 = c2615.f5565;
                                            c2615.m3891(i11 + 1, c1091.f1349);
                                            c2615.f5565++;
                                            c1091.m1335(abstractC2961);
                                            c1102.m1379(AbstractC2620.m3903(0.0f, z, true));
                                            interfaceC7372.invoke();
                                            c2615.f5565 = i11;
                                            return;
                                        }
                                        return;
                                    }
                                    int i12 = c1091.f1349;
                                    int i13 = i12 - 1;
                                    c2615.f5565 = i13;
                                    c2615.m3891(i12, c1091.f1349);
                                    c2615.f5565++;
                                    c1091.m1335(abstractC2961);
                                    c1102.m1379(AbstractC2620.m3903(0.0f, z, true));
                                    interfaceC7372.invoke();
                                    c2615.f5565 = i13;
                                    if (AbstractC2620.m3919(c2615.m3892()) < 0.0f) {
                                        c2615.m3891(i10 + 1, c2615.f5565 + 1);
                                    }
                                    c2615.f5565 = i10;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((r3.f6636 & 16) == 0 || !(r3 instanceof AbstractC2623)) {
                        M3899 = AbstractC2620.m3899(c2059);
                    } else {
                        AbstractC2961 abstractC29612 = ((AbstractC2623) r3).f5571;
                        int i14 = 0;
                        M3899 = r3;
                        c2059 = c2059;
                        while (abstractC29612 != null) {
                            if ((abstractC29612.f6636 & 16) != 0) {
                                i14++;
                                c2059 = c2059;
                                if (i14 == 1) {
                                    M3899 = abstractC29612;
                                } else {
                                    if (c2059 == 0) {
                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (M3899 != 0) {
                                        c2059.m2607(M3899);
                                        M3899 = 0;
                                    }
                                    c2059.m2607(abstractC29612);
                                }
                            }
                            abstractC29612 = abstractC29612.f6633;
                            M3899 = M3899;
                            c2059 = c2059;
                        }
                        if (i14 == 1) {
                        }
                    }
                    i2 = i;
                    r3 = M3899;
                    c2059 = c2059;
                }
            }
        }
        if (z2) {
            m3951(abstractC2961, interfaceC2645, j, c2615, i, z, f);
        } else {
            m3947(abstractC2961, interfaceC2645, j, c2615, i, z, f);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final AbstractC2589 mo3760() {
        return this.f5601;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final InterfaceC2492 mo3761() {
        InterfaceC2492 interfaceC2492 = this.f5593;
        if (interfaceC2492 != null) {
            return interfaceC2492;
        }
        C6755.m11870("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final long mo3762() {
        return this.f5590;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final AbstractC2629 m3960(AbstractC2629 abstractC2629) {
        C2583 c2583M3816 = abstractC2629.f5604;
        C2583 c2583 = this.f5604;
        if (c2583M3816 == c2583) {
            AbstractC2961 abstractC2961Mo3842 = abstractC2629.mo3842();
            AbstractC2961 abstractC2961Mo38422 = mo3842();
            if (!abstractC2961Mo38422.f6637.f6624) {
                AbstractC8765.m13982("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC2961 abstractC2961 = abstractC2961Mo38422.f6637.f6629; abstractC2961 != null; abstractC2961 = abstractC2961.f6629) {
                if ((abstractC2961.f6636 & 2) != 0 && abstractC2961 == abstractC2961Mo3842) {
                    return abstractC2629;
                }
            }
            return this;
        }
        while (c2583M3816.f5460 > c2583.f5460) {
            c2583M3816 = c2583M3816.m3816();
            c2583M3816.getClass();
        }
        C2583 c2583M38162 = c2583;
        while (c2583M38162.f5460 > c2583M3816.f5460) {
            c2583M38162 = c2583M38162.m3816();
            c2583M38162.getClass();
        }
        while (c2583M3816 != c2583M38162) {
            c2583M3816 = c2583M3816.m3816();
            c2583M38162 = c2583M38162.m3816();
            if (c2583M3816 == null || c2583M38162 == null) {
                C6755.m11869("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c2583M38162 != c2583) {
            if (c2583M3816 != abstractC2629.f5604) {
                return c2583M3816.f5439.f5631;
            }
            return abstractC2629;
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final long m3961(long j) {
        long j2 = this.f5590;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 != null) {
            C2746 c2746 = (C2746) interfaceC2641;
            float[] fArrM4172 = c2746.m4172();
            if (fArrM4172 == null) {
                return 9187343241974906880L;
            }
            if (!c2746.f5987) {
                return C2422.m3466(jFloatToRawIntBits, fArrM4172);
            }
        }
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void m3962(InterfaceC2436 interfaceC2436, C2351 c2351) {
        AbstractC2629 abstractC2629;
        InterfaceC2436 interfaceC24362;
        C2351 c23512;
        AbstractC2961 abstractC2961M3950 = m3950(4);
        if (abstractC2961M3950 == null) {
            mo3843(interfaceC2436, c2351);
            return;
        }
        C2583 c2583 = this.f5604;
        c2583.getClass();
        C2593 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getSharedDrawScope();
        long jM1700 = AbstractC1298.m1700(this.f5343);
        sharedDrawScope.getClass();
        C2059 c2059 = null;
        while (abstractC2961M3950 != null) {
            if (abstractC2961M3950 instanceof InterfaceC2616) {
                abstractC2629 = this;
                interfaceC24362 = interfaceC2436;
                c23512 = c2351;
                sharedDrawScope.m3870(interfaceC24362, jM1700, abstractC2629, (InterfaceC2616) abstractC2961M3950, c23512);
            } else {
                abstractC2629 = this;
                interfaceC24362 = interfaceC2436;
                c23512 = c2351;
                if ((abstractC2961M3950.f6636 & 4) != 0 && (abstractC2961M3950 instanceof AbstractC2623)) {
                    int i = 0;
                    for (AbstractC2961 abstractC2961 = ((AbstractC2623) abstractC2961M3950).f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
                        if ((abstractC2961.f6636 & 4) != 0) {
                            i++;
                            if (i == 1) {
                                abstractC2961M3950 = abstractC2961;
                            } else {
                                if (c2059 == null) {
                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                }
                                if (abstractC2961M3950 != null) {
                                    c2059.m2607(abstractC2961M3950);
                                    abstractC2961M3950 = null;
                                }
                                c2059.m2607(abstractC2961);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC2436 = interfaceC24362;
                this = abstractC2629;
                c2351 = c23512;
            }
            abstractC2961M3950 = AbstractC2620.m3899(c2059);
            interfaceC2436 = interfaceC24362;
            this = abstractC2629;
            c2351 = c23512;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public abstract void mo3844();

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final long m3963() {
        return this.f5595.mo1902(this.f5604.f5441.mo3839());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract AbstractC2580 mo3845();

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final AbstractC2589 mo3763() {
        return this.f5602;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final C2583 mo3764() {
        return this.f5604;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo3766() {
        return this.f5593 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final long m3964(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo3699();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo3698();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final long m3965(AbstractC2629 abstractC2629, long j) {
        if (abstractC2629 == this) {
            return j;
        }
        AbstractC2629 abstractC26292 = this.f5601;
        return (abstractC26292 == null || AbstractC5227.m9466(abstractC2629, abstractC26292)) ? m3961(j) : m3961(abstractC26292.m3965(abstractC2629, j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m3966(InterfaceC2436 interfaceC2436, C2351 c2351) {
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 == null) {
            long j = this.f5590;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC2436.mo3245(f, f2);
            m3962(interfaceC2436, c2351);
            interfaceC2436.mo3245(-f, -f2);
            return;
        }
        C2746 c2746 = (C2746) interfaceC2641;
        C2342 c2342 = c2746.f5981;
        c2746.m4173();
        c2746.f5986 = c2746.f5999.f4701.mo3290() > 0.0f;
        C0955 c0955 = c2342.f4629;
        c0955.m925(interfaceC2436);
        c0955.f665 = c2351;
        c2746.f5999.m3355(c2342.mo3266().m946(), (C2351) c2342.mo3266().f665);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final float m3967(long j, long j2) {
        if (mo3699() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo3698() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3964 = m3964(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3964 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3964 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo3699());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo3698()))) & 4294967295L);
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

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final void mo3771() {
        mo3688(this.f5590, this.f5589, this.f5596);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void m3968(AbstractC2629 abstractC2629, C8159 c8159, boolean z) {
        if (abstractC2629 == this) {
            return;
        }
        AbstractC2629 abstractC26292 = this.f5601;
        if (abstractC26292 != null) {
            abstractC26292.m3968(abstractC2629, c8159, z);
        }
        long j = this.f5590;
        float f = (int) (j >> 32);
        c8159.f19890 -= f;
        c8159.f19888 -= f;
        float f2 = (int) (j & 4294967295L);
        c8159.f19889 -= f2;
        c8159.f19887 -= f2;
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 != null) {
            C2746 c2746 = (C2746) interfaceC2641;
            float[] fArrM4172 = c2746.m4172();
            if (!c2746.f5987) {
                if (fArrM4172 == null) {
                    c8159.f19890 = 0.0f;
                    c8159.f19889 = 0.0f;
                    c8159.f19888 = 0.0f;
                    c8159.f19887 = 0.0f;
                } else {
                    C2422.m3465(fArrM4172, c8159);
                }
            }
            if (this.f5599 && z) {
                long j2 = this.f5343;
                c8159.m13094(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo3641(InterfaceC2530 interfaceC2530, long j) {
        return mo3645(interfaceC2530, j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3642(long j) {
        long jMo3636 = mo3636(j);
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5604);
        viewTreeObserverOnGlobalLayoutListenerC2719.m4086();
        return C2422.m3466(jMo3636, viewTreeObserverOnGlobalLayoutListenerC2719.f5838);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5604.f5444.mo1816();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2639
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3815() {
        return (this.f5605 == null || this.f5600 || !this.f5604.m3803()) ? false : true;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo3644(long j) {
        if (!mo3842().f6624) {
            AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5604)).m4098(mo3636(j));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo3645(InterfaceC2530 interfaceC2530, long j) {
        if (interfaceC2530 instanceof C2498) {
            C2498 c2498 = (C2498) interfaceC2530;
            c2498.f5223.f5408.m3943();
            return c2498.mo3645(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC2629 abstractC2629M3939 = m3939(interfaceC2530);
        abstractC2629M3939.m3943();
        AbstractC2629 abstractC2629M3960 = m3960(abstractC2629M3939);
        while (abstractC2629M3939 != abstractC2629M3960) {
            InterfaceC2641 interfaceC2641 = abstractC2629M3939.f5605;
            if (interfaceC2641 != null) {
                C2746 c2746 = (C2746) interfaceC2641;
                float[] fArrM4171 = c2746.m4171();
                if (!c2746.f5987) {
                    j = C2422.m3466(j, fArrM4171);
                }
            }
            j = AbstractC9019.m14254(j, abstractC2629M3939.f5590);
            abstractC2629M3939 = abstractC2629M3939.f5601;
            abstractC2629M3939.getClass();
        }
        return m3965(abstractC2629M3960, j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo3646() {
        return mo3842().f6624;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3647(float[] fArr) {
        InterfaceC2636 interfaceC2636M3866 = AbstractC2592.m3866(this.f5604);
        AbstractC2629 abstractC2629M3939 = m3939(AbstractC2505.m3673(this));
        m3948(abstractC2629M3939, fArr);
        if (interfaceC2636M3866 instanceof ViewTreeObserverOnGlobalLayoutListenerC2719) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636M3866).m4099(fArr);
            return;
        }
        long jMo3644 = abstractC2629M3939.mo3644(0L);
        if ((9223372034707292159L & jMo3644) != 9205357640488583168L) {
            C2422.m3462(fArr, Float.intBitsToFloat((int) (jMo3644 >> 32)), Float.intBitsToFloat((int) (jMo3644 & 4294967295L)));
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final long mo3648() {
        return this.f5343;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8157 mo3649(InterfaceC2530 interfaceC2530, boolean z) {
        if (!mo3842().f6624) {
            AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC2530.mo3646()) {
            AbstractC8765.m13982("LayoutCoordinates " + interfaceC2530 + " is not attached!");
        }
        AbstractC2629 abstractC2629M3939 = m3939(interfaceC2530);
        abstractC2629M3939.m3943();
        AbstractC2629 abstractC2629M3960 = m3960(abstractC2629M3939);
        C8159 c8159 = this.f5592;
        if (c8159 == null) {
            c8159 = new C8159();
            this.f5592 = c8159;
        }
        c8159.f19890 = 0.0f;
        c8159.f19889 = 0.0f;
        c8159.f19888 = (int) (interfaceC2530.mo3648() >> 32);
        c8159.f19887 = (int) (interfaceC2530.mo3648() & 4294967295L);
        while (abstractC2629M3939 != abstractC2629M3960) {
            abstractC2629M3939.m3957(c8159, z, false);
            if (c8159.m13093()) {
                return C8157.f19881;
            }
            abstractC2629M3939 = abstractC2629M3939.f5601;
            abstractC2629M3939.getClass();
        }
        m3968(abstractC2629M3960, c8159, z);
        return new C8157(c8159.f19890, c8159.f19889, c8159.f19888, c8159.f19887);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5604.f5444.mo1817();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3969(long j) {
        boolean z;
        boolean z2;
        boolean zM4186;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        InterfaceC2641 interfaceC2641 = this.f5605;
        if (interfaceC2641 == null || !this.f5599) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C2351 c2351 = ((C2746) interfaceC2641).f5999;
        if (c2351.f4704) {
            AbstractC2416 abstractC2416M3353 = c2351.m3353();
            if (abstractC2416M3353 instanceof C2420) {
                C8157 c8157 = ((C2420) abstractC2416M3353).f5017;
                if (c8157.f19885 > fIntBitsToFloat || fIntBitsToFloat >= c8157.f19883 || c8157.f19884 > fIntBitsToFloat2 || fIntBitsToFloat2 >= c8157.f19882) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (abstractC2416M3353 instanceof C2411) {
                C8156 c8156 = ((C2411) abstractC2416M3353).f5001;
                float f = c8156.f19876;
                float f2 = c8156.f19877;
                float f3 = c8156.f19875;
                float f4 = c8156.f19878;
                long j2 = c8156.f19873;
                long j3 = c8156.f19879;
                z = false;
                z2 = true;
                long j4 = c8156.f19880;
                long j5 = c8156.f19874;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    zM4186 = (fIntBitsToFloat >= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat >= fIntBitsToFloat12 || fIntBitsToFloat2 <= fIntBitsToFloat11) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) ? (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : AbstractC2751.m4186(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, c8156.f19880) : AbstractC2751.m4186(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, c8156.f19873) : AbstractC2751.m4186(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, c8156.f19879) : AbstractC2751.m4186(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, c8156.f19874);
                                } else {
                                    C2449 c2449M3517 = AbstractC2438.m3517();
                                    C2449.m3537(c2449M3517, c8156);
                                    zM4186 = AbstractC2751.m4185(fIntBitsToFloat, fIntBitsToFloat2, c2449M3517);
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(abstractC2416M3353 instanceof C2421)) {
                    C5043.m9170();
                    return false;
                }
                zM4186 = AbstractC2751.m4185(fIntBitsToFloat, fIntBitsToFloat2, ((C2421) abstractC2416M3353).f5018);
            }
            zM4186 = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM4186 ? z2 : z;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void m3970(boolean z) {
        char c;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719;
        boolean z2;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192;
        InterfaceC2636 interfaceC2636;
        InterfaceC7372 interfaceC7372;
        InterfaceC7372 interfaceC73722;
        InterfaceC2641 interfaceC2641 = this.f5605;
        final InterfaceC7387 interfaceC7387 = this.f5596;
        if (interfaceC2641 == null) {
            if (interfaceC7387 == null) {
                return;
            }
            AbstractC8765.m13982("null layer with a non-null layerBlock");
            return;
        }
        if (interfaceC7387 == null) {
            throw AbstractC0900.m699("updateLayerParameters requires a non-null layerBlock");
        }
        C2408 c2408 = f5582;
        c2408.m3416();
        C2583 c2583 = this.f5604;
        c2408.f4988 = c2583.f5444;
        c2408.f4987 = c2583.f5445;
        c2408.f4989 = AbstractC1298.m1700(this.f5343);
        ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getSnapshotObserver().f5619.m2806(this, f5584, new InterfaceC7372() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3723invoke() {
                InterfaceC7387 interfaceC73872 = interfaceC7387;
                C2408 c24082 = AbstractC2629.f5582;
                interfaceC73872.invoke(c24082);
                boolean zM9466 = AbstractC5227.m9466(this.f5587, c24082.f4979);
                AbstractC2629 abstractC2629 = this;
                boolean z3 = abstractC2629.f5588;
                boolean z4 = c24082.f4978;
                boolean z5 = z3 != z4;
                if (!zM9466 || z5) {
                    abstractC2629.f5587 = c24082.f4979;
                    abstractC2629.f5588 = z4;
                    if (abstractC2629.f5607 && (z5 || (z4 && !zM9466))) {
                        abstractC2629.f5604.m3805();
                    }
                }
                this.f5607 = true;
                c24082.f4984 = c24082.f4979.mo2482(c24082.f4989, c24082.f4987, c24082.f4988);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3723invoke();
                return C6008.f15084;
            }
        });
        C2610 c2610 = this.f5591;
        if (c2610 == null) {
            c2610 = new C2610();
            this.f5591 = c2610;
        }
        C2610 c26102 = f5581;
        c26102.getClass();
        c26102.f5555 = c2610.f5555;
        c26102.f5554 = c2610.f5554;
        c26102.f5553 = c2610.f5553;
        c26102.f5552 = c2610.f5552;
        c26102.f5551 = c2610.f5551;
        c26102.f5550 = c2610.f5550;
        c26102.f5557 = c2610.f5557;
        c26102.f5556 = c2610.f5556;
        float f = c2408.f4996;
        c2610.f5555 = f;
        c2610.f5554 = c2408.f4997;
        c2610.f5553 = c2408.f4990;
        c2610.f5552 = c2408.f4994;
        c2610.f5551 = c2408.f4983;
        c2610.f5550 = c2408.f4982;
        c2610.f5557 = c2408.f4981;
        long j = c2408.f4980;
        c2610.f5556 = j;
        C2746 c2746 = (C2746) interfaceC2641;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27193 = c2746.f5998;
        int i = c2408.f4998 | c2746.f5980;
        c2746.f5982 = c2408.f4987;
        c2746.f5983 = c2408.f4988;
        int i2 = i & 4096;
        if (i2 != 0) {
            c2746.f5979 = j;
        }
        if ((i & 1) != 0) {
            InterfaceC2349 interfaceC2349 = c2746.f5999.f4701;
            if (interfaceC2349.mo3298() != f) {
                interfaceC2349.mo3304(f);
            }
        }
        if ((i & 2) != 0) {
            C2351 c2351 = c2746.f5999;
            float f2 = c2408.f4997;
            InterfaceC2349 interfaceC23492 = c2351.f4701;
            if (interfaceC23492.mo3279() != f2) {
                interfaceC23492.mo3316(f2);
            }
        }
        if ((i & 4) != 0) {
            c2746.f5999.m3352(c2408.f4991);
        }
        if ((i & 8) != 0) {
            C2351 c23512 = c2746.f5999;
            float f3 = c2408.f4990;
            InterfaceC2349 interfaceC23493 = c23512.f4701;
            if (interfaceC23493.mo3287() != f3) {
                interfaceC23493.mo3294(f3);
            }
        }
        if ((i & 16) != 0) {
            C2351 c23513 = c2746.f5999;
            float f4 = c2408.f4994;
            InterfaceC2349 interfaceC23494 = c23513.f4701;
            if (interfaceC23494.mo3301() != f4) {
                interfaceC23494.mo3295(f4);
            }
        }
        if ((i & 32) != 0) {
            C2351 c23514 = c2746.f5999;
            float f5 = c2408.f4995;
            InterfaceC2349 interfaceC23495 = c23514.f4701;
            if (interfaceC23495.mo3290() != f5) {
                interfaceC23495.mo3297(f5);
                c23514.f4715 = true;
                c23514.m3357();
            }
            if (c2408.f4995 > 0.0f && !c2746.f5986 && (interfaceC73722 = c2746.f5991) != null) {
                interfaceC73722.invoke();
            }
        }
        if ((i & 64) != 0) {
            C2351 c23515 = c2746.f5999;
            long j2 = c2408.f4992;
            InterfaceC2349 interfaceC23496 = c23515.f4701;
            if (!C2434.m3509(j2, interfaceC23496.mo3310())) {
                interfaceC23496.mo3306(j2);
            }
        }
        if ((i & 128) != 0) {
            C2351 c23516 = c2746.f5999;
            long j3 = c2408.f4993;
            InterfaceC2349 interfaceC23497 = c23516.f4701;
            if (!C2434.m3509(j3, interfaceC23497.mo3305())) {
                interfaceC23497.mo3293(j3);
            }
        }
        if ((i & 1024) != 0) {
            InterfaceC2349 interfaceC23498 = c2746.f5999.f4701;
            if (interfaceC23498.mo3312() != 0.0f) {
                interfaceC23498.mo3283();
            }
        }
        if ((i & 256) != 0) {
            C2351 c23517 = c2746.f5999;
            float f6 = c2408.f4983;
            InterfaceC2349 interfaceC23499 = c23517.f4701;
            if (interfaceC23499.mo3285() != f6) {
                interfaceC23499.mo3282(f6);
            }
        }
        if ((i & 512) != 0) {
            C2351 c23518 = c2746.f5999;
            float f7 = c2408.f4982;
            InterfaceC2349 interfaceC234910 = c23518.f4701;
            if (interfaceC234910.mo3307() != f7) {
                interfaceC234910.mo3299(f7);
            }
        }
        if ((i & 2048) != 0) {
            C2351 c23519 = c2746.f5999;
            float f8 = c2408.f4981;
            InterfaceC2349 interfaceC234911 = c23519.f4701;
            if (interfaceC234911.mo3288() != f8) {
                interfaceC234911.mo3291(f8);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zM3545 = C2450.m3545(c2746.f5979, C2450.f5072);
            C2351 c235110 = c2746.f5999;
            if (!zM3545) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c2746.f5979 & 4294967295L)) * ((int) (c2746.f5995 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c2746.f5979 >> 32)) * ((int) (c2746.f5995 >> 32)))) << 32);
                if (!C8158.m13087(c235110.f4707, jFloatToRawIntBits)) {
                    c235110.f4707 = jFloatToRawIntBits;
                    c235110.f4701.mo3309(jFloatToRawIntBits);
                }
            } else if (!C8158.m13087(c235110.f4707, 9205357640488583168L)) {
                c235110.f4707 = 9205357640488583168L;
                c235110.f4701.mo3309(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            C2351 c235111 = c2746.f5999;
            boolean z3 = c2408.f4978;
            if (c235111.f4704 != z3) {
                c235111.f4704 = z3;
                c235111.f4715 = true;
                c235111.m3357();
            }
        }
        if ((131072 & i) != 0) {
            C2351 c235112 = c2746.f5999;
            C2441 c2441 = c2408.f4986;
            InterfaceC2349 interfaceC234912 = c235112.f4701;
            if (!AbstractC5227.m9466(interfaceC234912.mo3296(), c2441)) {
                interfaceC234912.mo3289(c2441);
            }
        }
        if ((262144 & i) != 0) {
            InterfaceC2349 interfaceC234913 = c2746.f5999.f4701;
            if (!AbstractC5227.m9466(interfaceC234913.mo3315(), null)) {
                interfaceC234913.mo3303();
            }
        }
        if ((524288 & i) != 0) {
            C2351 c235113 = c2746.f5999;
            int i3 = c2408.f4985;
            InterfaceC2349 interfaceC234914 = c235113.f4701;
            if (interfaceC234914.mo3281() != i3) {
                interfaceC234914.mo3313(i3);
            }
        }
        if ((32768 & i) != 0) {
            InterfaceC2349 interfaceC234915 = c2746.f5999.f4701;
            if (interfaceC234915.mo3318() != 0) {
                interfaceC234915.mo3284(0);
            }
        }
        if ((i & 7963) != 0) {
            c2746.f5989 = true;
            c2746.f5988 = true;
        }
        if (AbstractC5227.m9466(c2746.f5990, c2408.f4984)) {
            viewTreeObserverOnGlobalLayoutListenerC2719 = viewTreeObserverOnGlobalLayoutListenerC27193;
            z2 = false;
        } else {
            AbstractC2416 abstractC2416 = c2408.f4984;
            c2746.f5990 = abstractC2416;
            if (abstractC2416 == null) {
                viewTreeObserverOnGlobalLayoutListenerC2719 = viewTreeObserverOnGlobalLayoutListenerC27193;
            } else {
                C2351 c235114 = c2746.f5999;
                if (abstractC2416 instanceof C2420) {
                    C8157 c8157 = ((C2420) abstractC2416).f5017;
                    float f9 = c8157.f19885;
                    float f10 = c8157.f19884;
                    viewTreeObserverOnGlobalLayoutListenerC2719 = viewTreeObserverOnGlobalLayoutListenerC27193;
                    c235114.m3358(0.0f, (((long) Float.floatToRawIntBits(f9)) << c) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), (((long) Float.floatToRawIntBits(c8157.f19883 - f9)) << c) | (((long) Float.floatToRawIntBits(c8157.f19882 - f10)) & 4294967295L));
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC2719 = viewTreeObserverOnGlobalLayoutListenerC27193;
                    if (abstractC2416 instanceof C2421) {
                        C2449 c2449 = ((C2421) abstractC2416).f5018;
                        c235114.f4716 = null;
                        c235114.f4718 = 9205357640488583168L;
                        c235114.f4714 = 0L;
                        c235114.f4719 = 0.0f;
                        c235114.f4715 = true;
                        c235114.f4708 = false;
                        c235114.f4717 = c2449;
                        c235114.m3357();
                    } else {
                        if (!(abstractC2416 instanceof C2411)) {
                            C5043.m9170();
                            return;
                        }
                        C2411 c2411 = (C2411) abstractC2416;
                        C2449 c24492 = c2411.f5002;
                        if (c24492 != null) {
                            c235114.f4716 = null;
                            c235114.f4718 = 9205357640488583168L;
                            c235114.f4714 = 0L;
                            c235114.f4719 = 0.0f;
                            c235114.f4715 = true;
                            c235114.f4708 = false;
                            c235114.f4717 = c24492;
                            c235114.m3357();
                        } else {
                            C8156 c8156 = c2411.f5001;
                            float f11 = c8156.f19877;
                            float f12 = c8156.f19878;
                            c235114.m3358(Float.intBitsToFloat((int) (c8156.f19879 >> c)), (((long) Float.floatToRawIntBits(f12)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(c8156.f19876 - f12)) << c) | (((long) Float.floatToRawIntBits(c8156.f19875 - f11)) & 4294967295L));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC2416 instanceof C2421) || ((abstractC2416 instanceof C2411) && !AbstractC9004.m14197(((C2411) abstractC2416).f5001))) && (interfaceC7372 = c2746.f5991) != null)) {
                    interfaceC7372.invoke();
                }
            }
            z2 = true;
        }
        c2746.f5980 = c2408.f4998;
        if (i != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC2719.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC27192 = viewTreeObserverOnGlobalLayoutListenerC2719;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC27192, viewTreeObserverOnGlobalLayoutListenerC27192);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC27192 = viewTreeObserverOnGlobalLayoutListenerC2719;
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC2719.m4075()) {
                viewTreeObserverOnGlobalLayoutListenerC27192.m4084(0.0f);
            }
        }
        boolean z4 = this.f5599;
        this.f5599 = c2408.f4978;
        this.f5597 = c2408.f4991;
        boolean z5 = c26102.f5555 == c2610.f5555 && c26102.f5554 == c2610.f5554 && c26102.f5553 == c2610.f5553 && c26102.f5552 == c2610.f5552 && c26102.f5551 == c2610.f5551 && c26102.f5550 == c2610.f5550 && c26102.f5557 == c2610.f5557 && C2450.m3545(c26102.f5556, c2610.f5556);
        if (z && ((!z5 || z4 != this.f5599) && (interfaceC2636 = c2583.f5450) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).m4090(c2583);
        }
        if (z5) {
            return;
        }
        c2583.m3793(this);
        if (c2583.f5472 > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27194 = (ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583);
            C0923 c0923 = viewTreeObserverOnGlobalLayoutListenerC27194.f5839.f5393;
            c0923.getClass();
            if (c2583.f5472 > 0) {
                ((C2059) c0923.f572).m2607(c2583);
                c2583.f5473 = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC27194.m4095(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m3971(InterfaceC7387 interfaceC7387, boolean z) {
        InterfaceC2636 interfaceC2636;
        C2059 c2059;
        Reference referencePoll;
        InterfaceC7383 interfaceC7383;
        C2059 c20592;
        Reference referencePoll2;
        Object obj;
        C2583 c2583 = this.f5604;
        boolean z2 = (!z && this.f5596 == interfaceC7387 && AbstractC5227.m9466(this.f5595, c2583.f5444) && this.f5598 == c2583.f5445) ? false : true;
        this.f5595 = c2583.f5444;
        this.f5598 = c2583.f5445;
        boolean zM3803 = c2583.m3803();
        InterfaceC7372 interfaceC7372 = this.f5608;
        if (!zM3803 || interfaceC7387 == null) {
            this.f5596 = null;
            InterfaceC2641 interfaceC2641 = this.f5605;
            if (interfaceC2641 != null) {
                C2746 c2746 = (C2746) interfaceC2641;
                if (!AbstractC2416.m3446(c2746.m4171())) {
                    c2583.m3793(this);
                }
                c2746.f5992 = null;
                c2746.f5991 = null;
                c2746.f5996 = true;
                c2746.m4167(false);
                InterfaceC2418 interfaceC2418 = c2746.f5997;
                if (interfaceC2418 != null) {
                    interfaceC2418.mo3141(c2746.f5999);
                    ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = c2746.f5998;
                    C0923 c0923 = viewTreeObserverOnGlobalLayoutListenerC2719.f5815;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c0923.f573;
                        c2059 = (C2059) c0923.f572;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            c2059.m2615(referencePoll);
                        }
                    } while (referencePoll != null);
                    c2059.m2607(new WeakReference(c2746, (ReferenceQueue) c0923.f573));
                    viewTreeObserverOnGlobalLayoutListenerC2719.f5767.m1336(c2746);
                }
                this.f5605 = null;
                c2583.f5481 = true;
                interfaceC7372.invoke();
                if (mo3842().f6624 && c2583.m3802() && (interfaceC2636 = c2583.f5450) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).m4090(c2583);
                }
            }
            this.f5609 = false;
            return;
        }
        this.f5596 = interfaceC7387;
        if (this.f5605 != null) {
            if (z2) {
                m3970(true);
                return;
            }
            return;
        }
        InterfaceC2636 interfaceC2636M3866 = AbstractC2592.m3866(c2583);
        InterfaceC7383 interfaceC73832 = this.f5611;
        if (interfaceC73832 == null) {
            final InterfaceC7372 interfaceC73722 = new InterfaceC7372() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3719invoke() {
                    AbstractC2629 abstractC2629 = this.this$0;
                    InterfaceC2436 interfaceC2436 = abstractC2629.f5610;
                    interfaceC2436.getClass();
                    abstractC2629.m3962(interfaceC2436, this.this$0.f5606);
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3719invoke();
                    return C6008.f15084;
                }
            };
            InterfaceC7383 interfaceC73833 = new InterfaceC7383() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2436 interfaceC2436, C2351 c2351) {
                    boolean zM3802 = this.this$0.f5604.m3802();
                    AbstractC2629 abstractC2629 = this.this$0;
                    if (!zM3802) {
                        abstractC2629.f5609 = true;
                        return;
                    }
                    abstractC2629.f5610 = interfaceC2436;
                    abstractC2629.f5606 = c2351;
                    C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(abstractC2629.f5604)).getSnapshotObserver();
                    snapshotObserver.f5619.m2806(this.this$0, AbstractC2629.f5583, interfaceC73722);
                    this.this$0.f5609 = false;
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((InterfaceC2436) obj2, (C2351) obj3);
                    return C6008.f15084;
                }
            };
            this.f5611 = interfaceC73833;
            interfaceC7383 = interfaceC73833;
        } else {
            interfaceC7383 = interfaceC73832;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192 = (ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636M3866;
        C0923 c09232 = viewTreeObserverOnGlobalLayoutListenerC27192.f5815;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c09232.f573;
            c20592 = (C2059) c09232.f572;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                c20592.m2615(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i = c20592.f3865;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) c20592.m2613(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        InterfaceC2641 c27462 = (InterfaceC2641) obj;
        if (c27462 != null) {
            C2746 c27463 = (C2746) c27462;
            InterfaceC2418 interfaceC24182 = c27463.f5997;
            if (interfaceC24182 == null) {
                throw AbstractC0900.m699("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c27463.f5999.f4703) {
                AbstractC8765.m13984("layer should have been released before reuse");
            }
            c27463.f5999 = interfaceC24182.mo3140();
            c27463.f5996 = false;
            c27463.f5992 = interfaceC7383;
            c27463.f5991 = interfaceC7372;
            c27463.f5989 = false;
            c27463.f5988 = false;
            c27463.f5987 = true;
            C2422.m3464(c27463.f5993);
            float[] fArr = c27463.f5994;
            if (fArr != null) {
                C2422.m3464(fArr);
            }
            c27463.f5979 = C2450.f5072;
            c27463.f5986 = false;
            c27463.f5995 = 9223372034707292159L;
            c27463.f5990 = null;
            c27463.f5980 = 0;
        } else {
            c27462 = new C2746(viewTreeObserverOnGlobalLayoutListenerC27192.getGraphicsContext().mo3140(), viewTreeObserverOnGlobalLayoutListenerC27192.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC27192, interfaceC7383, interfaceC7372);
        }
        C2746 c27464 = (C2746) c27462;
        c27464.m4168(this.f5343);
        c27464.m4169(this.f5590);
        this.f5605 = c27462;
        m3970(true);
        c2583.f5481 = true;
        interfaceC7372.invoke();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final InterfaceC2530 mo3765() {
        return this;
    }
}
