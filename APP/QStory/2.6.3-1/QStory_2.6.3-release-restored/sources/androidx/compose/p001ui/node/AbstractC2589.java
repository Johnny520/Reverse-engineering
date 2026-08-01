package androidx.compose.p001ui.node;

import androidx.appcompat.widget.C1038;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.AbstractC2555;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2499;
import androidx.compose.p001ui.layout.C2514;
import androidx.compose.p001ui.layout.C2520;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import java.util.Map;
import kotlin.C6008;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.C8735;
import p221.C8737;
import p226.AbstractC8765;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2589 extends AbstractC2559 implements InterfaceC2572, InterfaceC2488 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final InterfaceC7387 f5488 = new InterfaceC7387() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(C2635 c2635) {
            if (c2635.mo3815()) {
                AbstractC2589 abstractC2589 = c2635.f5612;
                if (abstractC2589.f5492) {
                    return;
                }
                InterfaceC7387 interfaceC7387Mo2030 = c2635.f5613.mo2030();
                C1083 c1083 = abstractC2589.f5489;
                if (interfaceC7387Mo2030 != null) {
                    abstractC2589.m3854(c2635, 9223372034707292159L, 0L);
                    abstractC2589.f5497 = interfaceC7387Mo2030;
                    return;
                }
                if (c1083 != null) {
                    Object[] objArr = c1083.f1224;
                    long[] jArr = c1083.f1226;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        abstractC2589.m3849((C1082) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    c1083.m1314();
                }
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2635) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C1083 f5489;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C1038 f5490;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C2499 f5491 = new C2499(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5492;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5493;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2635 f5494;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5495;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2590 f5496;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC7387 f5497;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static void m3848(AbstractC2629 abstractC2629) {
        C2594 c2594;
        AbstractC2629 abstractC26292 = abstractC2629.f5602;
        C2583 c2583 = abstractC2629.f5604;
        if (!AbstractC5227.m9466(abstractC26292 != null ? abstractC26292.f5604 : null, c2583)) {
            c2583.f5477.f5512.f5365.m3884();
            return;
        }
        InterfaceC2604 interfaceC2604Mo3735 = c2583.f5477.f5512.mo3735();
        if (interfaceC2604Mo3735 == null || (c2594 = ((C2573) interfaceC2604Mo3735).f5365) == null) {
            return;
        }
        c2594.m3884();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2572
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3724(boolean z) {
        AbstractC2589 abstractC2589Mo3760 = mo3760();
        C2583 c2583Mo3764 = abstractC2589Mo3760 != null ? abstractC2589Mo3760.mo3764() : null;
        if (AbstractC5227.m9466(c2583Mo3764, mo3764())) {
            this.f5495 = z;
            return;
        }
        if ((c2583Mo3764 != null ? c2583Mo3764.f5477.f5504 : null) != LayoutNode$LayoutState.LayingOut) {
            if ((c2583Mo3764 != null ? c2583Mo3764.f5477.f5504 : null) != LayoutNode$LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        this.f5495 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void m3849(C1082 c1082) {
        C2583 c2583;
        Object[] objArr = c1082.f1345;
        long[] jArr = c1082.f1346;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (c2583 = (C2583) ((C2597) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo2057()) {
                            c2583.m3788(false);
                        } else {
                            c2583.m3785(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public abstract AbstractC2589 mo3760();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract InterfaceC2492 mo3761();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final C2590 m3850() {
        C2590 c2590 = this.f5496;
        if (c2590 != null) {
            return c2590;
        }
        C2590 c25902 = new C2590(this);
        this.f5496 = c25902;
        return c25902;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public abstract long mo3762();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public abstract AbstractC2589 mo3763();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final int m3851(AbstractC2524 abstractC2524) {
        int iMo3846;
        if (!mo3766() || (iMo3846 = mo3846(abstractC2524)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = abstractC2524 instanceof C2514;
        long j = this.f5340;
        return iMo3846 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public abstract C2583 mo3764();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public abstract InterfaceC2530 mo3765();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public abstract boolean mo3766();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract void mo3771();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3852(C2583 c2583, AbstractC2555 abstractC2555) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        C1083 c1083 = this.f5489;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (c1083 != null) {
            Object[] objArr = c1083.f1224;
            long[] jArr3 = c1083.f1226;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                C1082 c1082 = (C1082) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = c1082.f1345;
                                long[] jArr4 = c1082.f1346;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    C2583 c25832 = (C2583) ((C2597) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (c25832 != null) {
                                                        boolean zM3803 = c25832.m3803();
                                                        i4 = i8;
                                                        if (zM3803) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    c1082.m1302(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        }
        C1083 c10832 = this.f5489;
        if (c10832 != null) {
            long[] jArr5 = c10832.f1226;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((C1082) c10832.f1224[i18]).m1433()) {
                                    c10832.m1319(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        C1083 c10833 = this.f5489;
        if (c10833 == null) {
            c10833 = new C1083();
            this.f5489 = c10833;
        }
        Object objM1317 = c10833.m1317(abstractC2555);
        if (objM1317 == null) {
            objM1317 = new C1082();
            c10833.m1315(abstractC2555, objM1317);
        }
        ((C1082) objM1317).m1305(new C2597(c2583));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3853(InterfaceC2492 interfaceC2492) {
        long j;
        long j2;
        C1083 c1083 = this.f5489;
        if (this.f5492) {
            return;
        }
        InterfaceC7387 interfaceC7387Mo2030 = interfaceC2492.mo2030();
        if (interfaceC7387Mo2030 != null) {
            boolean z = this.f5497 != interfaceC7387Mo2030;
            if (z || !m3850().f5501) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                InterfaceC2530 interfaceC2530Mo3765 = mo3765();
                long jM14240 = AbstractC9019.m14240(interfaceC2530Mo3765.mo3644(0L));
                long jMo3648 = interfaceC2530Mo3765.mo3648();
                j2 = jM14240;
                j = jMo3648;
                z = (C8737.m13923(jM14240, m3850().f5499) && C8735.m13916(jMo3648, m3850().f5500)) ? false : true;
            }
            if (z) {
                C2635 c2635 = this.f5494;
                if (c2635 != null) {
                    c2635.f5613 = interfaceC2492;
                } else {
                    c2635 = new C2635(interfaceC2492, this);
                    this.f5494 = c2635;
                }
                m3854(c2635, j2, j);
                this.f5497 = interfaceC2492.mo2030();
                return;
            }
            return;
        }
        if (c1083 != null) {
            Object[] objArr = c1083.f1224;
            long[] jArr = c1083.f1226;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                m3849((C1082) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c1083.m1314();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3854(final C2635 c2635, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        C2583 c2583;
        boolean z2;
        int i;
        char c2;
        long j6;
        C2638 snapshotObserver;
        C1083 c1083 = this.f5489;
        C1038 c1038 = this.f5490;
        if (c1038 == null) {
            c1038 = new C1038();
            this.f5490 = c1038;
        }
        C1038 c10382 = c1038;
        InterfaceC2636 interfaceC2636 = mo3764().f5450;
        if (interfaceC2636 != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).getSnapshotObserver()) != null) {
            snapshotObserver.f5619.m2806(c2635, f5488, new InterfaceC7372() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3712invoke() {
                    AbstractC2589 abstractC2589 = this.this$0;
                    InterfaceC7387 interfaceC7387 = AbstractC2589.f5488;
                    abstractC2589.m3850().f5501 = false;
                    this.this$0.m3850().f5499 = j;
                    this.this$0.m3850().f5500 = j2;
                    InterfaceC7387 interfaceC7387Mo2030 = c2635.f5613.mo2030();
                    if (interfaceC7387Mo2030 != null) {
                        interfaceC7387Mo2030.invoke(this.this$0.m3850());
                    }
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3712invoke();
                    return C6008.f15084;
                }
            });
        }
        boolean zMo2057 = mo2057();
        C1082 c1082 = (C1082) c10382.f1091;
        C1082 c10822 = (C1082) c10382.f1097;
        int i2 = c10382.f1095;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c10382.f1092)[i3];
            if (b == 3) {
                AbstractC2555 abstractC2555 = ((AbstractC2555[]) c10382.f1094)[i3];
                abstractC2555.getClass();
                c10822.m1305(abstractC2555);
            } else if (b != 0 && c1083 != null) {
                AbstractC2555 abstractC25552 = ((AbstractC2555[]) c10382.f1094)[i3];
                abstractC25552.getClass();
                C1082 c10823 = (C1082) c1083.m1318(abstractC25552);
                if (c10823 != null) {
                    c1082.m1308(c10823);
                }
            }
        }
        int i4 = c10382.f1095;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c10382.f1092;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                AbstractC2555[] abstractC2555Arr = (AbstractC2555[]) c10382.f1094;
                abstractC2555Arr[i6 - i5] = abstractC2555Arr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c10382.f1095;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((AbstractC2555[]) c10382.f1094)[i8] = null;
        }
        c10382.f1095 -= i5;
        AbstractC2589 abstractC2589Mo3760 = mo3760();
        Object[] objArr = c10822.f1345;
        long[] jArr = c10822.f1346;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            AbstractC2555 abstractC25553 = (AbstractC2555) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            AbstractC2589 abstractC2589 = abstractC2589Mo3760 == null ? this : abstractC2589Mo3760;
                            i = i9;
                            AbstractC2589 abstractC25892 = abstractC2589;
                            while (true) {
                                C1038 c10383 = abstractC25892.f5490;
                                if (c10383 != null) {
                                    z2 = zMo2057;
                                    if (!AbstractC5179.m9396(abstractC25553, (AbstractC2555[]) c10383.f1094)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z2 = zMo2057;
                                AbstractC2589 abstractC2589Mo37602 = abstractC25892.mo3760();
                                if (abstractC2589Mo37602 == null) {
                                    break;
                                }
                                abstractC25892 = abstractC2589Mo37602;
                                zMo2057 = z2;
                            }
                            C1083 c10832 = abstractC25892.f5489;
                            C1082 c10824 = c10832 != null ? (C1082) c10832.m1318(abstractC25553) : null;
                            if (c10824 != null) {
                                abstractC2589.m3849(c10824);
                            }
                        } else {
                            z2 = zMo2057;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zMo2057 = z2;
                    }
                    z = zMo2057;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo2057;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zMo2057 = z;
                i9 = 8;
            }
        } else {
            z = zMo2057;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c10822.m1300();
        Object[] objArr2 = c1082.f1345;
        long[] jArr2 = c1082.f1346;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c2583 = (C2583) ((C2597) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                c2583.m3788(false);
                            } else {
                                c2583.m3785(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c1082.m1300();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public abstract int mo3846(AbstractC2524 abstractC2524);

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC2492 mo2056(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC8765.m13982("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2520(i, i2, map, interfaceC7387, interfaceC73872, this, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public boolean mo2057() {
        return false;
    }
}
