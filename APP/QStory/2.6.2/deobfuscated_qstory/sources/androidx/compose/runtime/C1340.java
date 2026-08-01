package androidx.compose.runtime;

import androidx.activity.compose.C0004;
import androidx.collection.C0244;
import androidx.collection.C0247;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.ui.node.C1778;
import kotlin.jvm.internal.AbstractC4387;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1340 implements InterfaceC1356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f3900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f3901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f3902;

    public C1340(C1386 c1386) {
        this.f3902 = new AtomicInt(0);
        this.f3900 = new C1245(0);
        this.f3901 = new C0004(this, 5, c1386);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo939(int i, int i2, int i3) {
        C0247 c0247 = (C0247) this.f3902;
        c0247.m794(3);
        c0247.m794(i);
        c0247.m794(i2);
        c0247.m794(i3);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo940() {
        ((C0247) this.f3902).m794(8);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo941(Object obj) {
        ((C0247) this.f3902).m794(1);
        ((C0244) this.f3900).m774(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo942(int i, Object obj) {
        C0247 c0247 = (C0247) this.f3902;
        c0247.m794(5);
        c0247.m794(i);
        ((C0244) this.f3900).m774(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2419(C1778 c1778, C1251 c1251) {
        Exception exc;
        Exception exc2;
        int i;
        C0247 c0247 = (C0247) this.f3902;
        int i2 = c0247.f985;
        C0244 c0244 = (C0244) this.f3900;
        C0244 c02442 = new C0244();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (c0247.m855(i3)) {
                        case 0:
                            c1778.mo946();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            c1778.mo941(c0244.m880(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            c1778.mo947(c0247.m855(i5), c0247.m855(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                i = i3 + 3;
                            } catch (Exception e) {
                                exc = e;
                                i3 = i8;
                            }
                            try {
                                i3 += 4;
                                c1778.mo939(c0247.m855(i5), c0247.m855(i8), c0247.m855(i));
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i;
                                throw new ComposePausableCompositionException(c0244, c02442, c0247, i3 - 1, exc);
                            }
                            break;
                        case 4:
                            c1778.m3317();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            int i9 = i4 + 1;
                            c1778.mo942(c0247.m855(i5), c0244.m880(i4));
                            i4 = i9;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                c0247.m855(i5);
                                int i10 = i4 + 1;
                                i4 = i10;
                            } catch (Exception e3) {
                                exc2 = e3;
                                exc = exc2;
                                throw new ComposePausableCompositionException(c0244, c02442, c0247, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i11 = i4 + 1;
                            Object objM880 = c0244.m880(i4);
                            objM880.getClass();
                            AbstractC4387.m8898(2, objM880);
                            i4 += 2;
                            c1778.mo948(c0244.m880(i11), (InterfaceC6553) objM880);
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = c1778.f5213;
                            if (obj instanceof InterfaceC1370) {
                                InterfaceC1370 interfaceC1370 = (InterfaceC1370) obj;
                                if (((C1224) c1251.f3627).m2045(interfaceC1370)) {
                                    interfaceC1370.mo2494();
                                }
                            }
                            c02442.m774(obj);
                            c1778.mo940();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e4) {
                    exc2 = e4;
                    i3 = i5;
                    exc = exc2;
                    throw new ComposePausableCompositionException(c0244, c02442, c0247, i3 - 1, exc);
                }
            } catch (Throwable th) {
                c1778.mo2427();
                throw th;
            }
        }
        if (i4 != c0244.f1004) {
            AbstractC1374.m2497("Applier operation size mismatch");
        }
        c0244.m778();
        c0247.f985 = 0;
        c1778.mo2427();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Object mo944() {
        return this.f3901;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo946() {
        ((C0247) this.f3902).m794(0);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo947(int i, int i2) {
        C0247 c0247 = (C0247) this.f3902;
        c0247.m794(2);
        c0247.m794(i);
        c0247.m794(i2);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo948(Object obj, InterfaceC6553 interfaceC6553) {
        ((C0247) this.f3902).m794(7);
        C0244 c0244 = (C0244) this.f3900;
        c0244.m774(interfaceC6553);
        c0244.m774(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo949(int i, Object obj) {
        C0247 c0247 = (C0247) this.f3902;
        c0247.m794(6);
        c0247.m794(i);
        ((C0244) this.f3900).m774(obj);
    }

    public C1340(Object obj) {
        this.f3902 = new C0247();
        this.f3900 = new C0244();
        this.f3901 = obj;
    }
}
