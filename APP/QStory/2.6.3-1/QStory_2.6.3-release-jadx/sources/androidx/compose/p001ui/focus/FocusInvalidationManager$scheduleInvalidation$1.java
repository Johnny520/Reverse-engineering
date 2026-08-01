package androidx.compose.p001ui.focus;

import androidx.collection.C1082;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;
import p226.AbstractC8765;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class FocusInvalidationManager$scheduleInvalidation$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public FocusInvalidationManager$scheduleInvalidation$1(Object obj) {
        super(0, obj, C2315.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3148invoke() {
        C2646 c2646;
        C2315 c2315 = (C2315) this.receiver;
        C1082 c1082 = c2315.f4543;
        C1082 c10822 = c2315.f4542;
        C2313 c2313 = c2315.f4545;
        C2287 c2287M3203 = c2313.m3203();
        if (c2287M3203 == null) {
            Object[] objArr = c10822.f1345;
            long[] jArr = c10822.f1346;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                ((InterfaceC2297) objArr[(i << 3) + i3]).mo2208(FocusStateImpl.Inactive);
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
        } else if (c2287M3203.f6624) {
            if (c1082.m1434(c2287M3203)) {
                c2287M3203.m3158();
            }
            FocusStateImpl focusStateImplM3157 = c2287M3203.m3157();
            if (!c2287M3203.f6637.f6624) {
                AbstractC8765.m13982("visitAncestors called on an unattached node");
            }
            AbstractC2961 abstractC2961 = c2287M3203.f6637;
            C2583 c2583M3906 = AbstractC2620.m3906(c2287M3203);
            int i4 = 0;
            while (c2583M3906 != null) {
                if ((c2583M3906.f5439.f5628.f6630 & 5120) != 0) {
                    while (abstractC2961 != null) {
                        int i5 = abstractC2961.f6636;
                        if ((i5 & 5120) != 0) {
                            if ((i5 & 1024) != 0) {
                                i4++;
                            }
                            if ((abstractC2961 instanceof InterfaceC2297) && c10822.m1434(abstractC2961)) {
                                if (i4 <= 1) {
                                    ((InterfaceC2297) abstractC2961).mo2208(focusStateImplM3157);
                                } else {
                                    ((InterfaceC2297) abstractC2961).mo2208(FocusStateImpl.ActiveParent);
                                }
                                c10822.m1306(abstractC2961);
                            }
                        }
                        abstractC2961 = abstractC2961.f6629;
                    }
                }
                c2583M3906 = c2583M3906.m3816();
                abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
            }
            Object[] objArr2 = c10822.f1345;
            long[] jArr2 = c10822.f1346;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr2[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j2 & 255) < 128) {
                                ((InterfaceC2297) objArr2[(i6 << 3) + i8]).mo2208(FocusStateImpl.Inactive);
                            }
                            j2 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 == length2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
        }
        if (c2313.m3203() == null || c2313.f4535.m3157() == FocusStateImpl.Inactive) {
            c2313.m3200();
        }
        c1082.m1300();
        c10822.m1300();
        c2315.f4541 = false;
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m3148invoke();
        return C6008.f15084;
    }
}
