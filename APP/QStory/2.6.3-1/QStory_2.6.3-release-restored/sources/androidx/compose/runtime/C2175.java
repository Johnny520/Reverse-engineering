package androidx.compose.runtime;

import androidx.activity.compose.C0851;
import androidx.collection.C1091;
import androidx.collection.C1094;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.internal.C2086;
import kotlin.jvm.internal.AbstractC5220;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2175 implements InterfaceC2191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f4247;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f4248;

    public C2175(C2221 c2221) {
        this.f4248 = new AtomicInt(0);
        this.f4246 = new C2080(0);
        this.f4247 = new C0851(this, 5, c2221);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo1500(int i, int i2, int i3) {
        C1094 c1094 = (C1094) this.f4248;
        c1094.m1355(3);
        c1094.m1355(i);
        c1094.m1355(i2);
        c1094.m1355(i3);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo1501() {
        ((C1094) this.f4248).m1355(8);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1502(Object obj) {
        ((C1094) this.f4248).m1355(1);
        ((C1091) this.f4246).m1335(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo1503(int i, Object obj) {
        C1094 c1094 = (C1094) this.f4248;
        c1094.m1355(5);
        c1094.m1355(i);
        ((C1091) this.f4246).m1335(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2989(C2613 c2613, C2086 c2086) {
        Exception exc;
        Exception exc2;
        int i;
        C1094 c1094 = (C1094) this.f4248;
        int i2 = c1094.f1330;
        C1091 c1091 = (C1091) this.f4246;
        C1091 c10912 = new C1091();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (c1094.m1416(i3)) {
                        case 0:
                            c2613.mo1506();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            c2613.mo1502(c1091.m1441(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            c2613.mo1507(c1094.m1416(i5), c1094.m1416(i7));
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
                                c2613.mo1500(c1094.m1416(i5), c1094.m1416(i8), c1094.m1416(i));
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i;
                                throw new ComposePausableCompositionException(c1091, c10912, c1094, i3 - 1, exc);
                            }
                            break;
                        case 4:
                            c2613.m3887();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            int i9 = i4 + 1;
                            c2613.mo1503(c1094.m1416(i5), c1091.m1441(i4));
                            i4 = i9;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                c1094.m1416(i5);
                                int i10 = i4 + 1;
                                i4 = i10;
                            } catch (Exception e3) {
                                exc2 = e3;
                                exc = exc2;
                                throw new ComposePausableCompositionException(c1091, c10912, c1094, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i11 = i4 + 1;
                            Object objM1441 = c1091.m1441(i4);
                            objM1441.getClass();
                            AbstractC5220.m9447(2, objM1441);
                            i4 += 2;
                            c2613.mo1509(c1091.m1441(i11), (InterfaceC7383) objM1441);
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = c2613.f5559;
                            if (obj instanceof InterfaceC2205) {
                                InterfaceC2205 interfaceC2205 = (InterfaceC2205) obj;
                                if (((C2059) c2086.f3973).m2615(interfaceC2205)) {
                                    interfaceC2205.mo3064();
                                }
                            }
                            c10912.m1335(obj);
                            c2613.mo1501();
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
                    throw new ComposePausableCompositionException(c1091, c10912, c1094, i3 - 1, exc);
                }
            } catch (Throwable th) {
                c2613.mo2997();
                throw th;
            }
        }
        if (i4 != c1091.f1349) {
            AbstractC2209.m3067("Applier operation size mismatch");
        }
        c1091.m1339();
        c1094.f1330 = 0;
        c2613.mo2997();
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo1506() {
        ((C1094) this.f4248).m1355(0);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo1507(int i, int i2) {
        C1094 c1094 = (C1094) this.f4248;
        c1094.m1355(2);
        c1094.m1355(i);
        c1094.m1355(i2);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public Object mo1508() {
        return this.f4247;
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo1509(Object obj, InterfaceC7383 interfaceC7383) {
        ((C1094) this.f4248).m1355(7);
        C1091 c1091 = (C1091) this.f4246;
        c1091.m1335(interfaceC7383);
        c1091.m1335(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo1510(int i, Object obj) {
        C1094 c1094 = (C1094) this.f4248;
        c1094.m1355(6);
        c1094.m1355(i);
        ((C1091) this.f4246).m1335(obj);
    }

    public C2175(Object obj) {
        this.f4248 = new C1094();
        this.f4246 = new C1091();
        this.f4247 = obj;
    }
}
