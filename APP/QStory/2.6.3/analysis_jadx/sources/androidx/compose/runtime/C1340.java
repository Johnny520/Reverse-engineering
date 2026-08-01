package androidx.compose.runtime;

import androidx.activity.compose.C0004;
import androidx.collection.C0244;
import androidx.collection.C0247;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.ui.node.C1778;
import kotlin.jvm.internal.AbstractC4388;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1340 implements InterfaceC1356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f3901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f3902;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f3903;

    public C1340(C1386 c1386) {
        this.f3903 = new AtomicInt(0);
        this.f3901 = new C1245(0);
        this.f3902 = new C0004(this, 5, c1386);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo940(int i, int i2, int i3) {
        C0247 c0247 = (C0247) this.f3903;
        c0247.m795(3);
        c0247.m795(i);
        c0247.m795(i2);
        c0247.m795(i3);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo941() {
        ((C0247) this.f3903).m795(8);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo942(Object obj) {
        ((C0247) this.f3903).m795(1);
        ((C0244) this.f3901).m775(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo943(int i, Object obj) {
        C0247 c0247 = (C0247) this.f3903;
        c0247.m795(5);
        c0247.m795(i);
        ((C0244) this.f3901).m775(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2429(C1778 c1778, C1251 c1251) {
        Exception exc;
        Exception exc2;
        int i;
        C0247 c0247 = (C0247) this.f3903;
        int i2 = c0247.f985;
        C0244 c0244 = (C0244) this.f3901;
        C0244 c02442 = new C0244();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (c0247.m856(i3)) {
                        case 0:
                            c1778.mo946();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            c1778.mo942(c0244.m881(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            c1778.mo947(c0247.m856(i5), c0247.m856(i7));
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
                                c1778.mo940(c0247.m856(i5), c0247.m856(i8), c0247.m856(i));
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i;
                                throw new ComposePausableCompositionException(c0244, c02442, c0247, i3 - 1, exc);
                            }
                            break;
                        case 4:
                            c1778.m3327();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            int i9 = i4 + 1;
                            c1778.mo943(c0247.m856(i5), c0244.m881(i4));
                            i4 = i9;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                c0247.m856(i5);
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
                            Object objM881 = c0244.m881(i4);
                            objM881.getClass();
                            AbstractC4388.m8888(2, objM881);
                            i4 += 2;
                            c1778.mo949(c0244.m881(i11), (InterfaceC6554) objM881);
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = c1778.f5214;
                            if (obj instanceof InterfaceC1370) {
                                InterfaceC1370 interfaceC1370 = (InterfaceC1370) obj;
                                if (((C1224) c1251.f3628).m2055(interfaceC1370)) {
                                    interfaceC1370.mo2504();
                                }
                            }
                            c02442.m775(obj);
                            c1778.mo941();
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
                c1778.mo2437();
                throw th;
            }
        }
        if (i4 != c0244.f1004) {
            AbstractC1374.m2507("Applier operation size mismatch");
        }
        c0244.m779();
        c0247.f985 = 0;
        c1778.mo2437();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo946() {
        ((C0247) this.f3903).m795(0);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo947(int i, int i2) {
        C0247 c0247 = (C0247) this.f3903;
        c0247.m795(2);
        c0247.m795(i);
        c0247.m795(i2);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public Object mo948() {
        return this.f3902;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo949(Object obj, InterfaceC6554 interfaceC6554) {
        ((C0247) this.f3903).m795(7);
        C0244 c0244 = (C0244) this.f3901;
        c0244.m775(interfaceC6554);
        c0244.m775(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo950(int i, Object obj) {
        C0247 c0247 = (C0247) this.f3903;
        c0247.m795(6);
        c0247.m795(i);
        ((C0244) this.f3901).m775(obj);
    }

    public C1340(Object obj) {
        this.f3903 = new C0247();
        this.f3901 = new C0244();
        this.f3902 = obj;
    }
}
