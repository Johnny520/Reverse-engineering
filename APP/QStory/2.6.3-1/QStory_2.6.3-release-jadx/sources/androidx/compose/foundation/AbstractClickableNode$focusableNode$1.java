package androidx.compose.foundation;

import androidx.collection.C1101;
import androidx.compose.foundation.interaction.C1416;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractC1892.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z) {
        AbstractC1892 abstractC1892 = (AbstractC1892) this.receiver;
        C1101 c1101 = abstractC1892.f3462;
        if (z) {
            abstractC1892.m2527();
            return;
        }
        if (abstractC1892.f3474 != null) {
            Object[] objArr = c1101.f1272;
            long[] jArr = c1101.f1274;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                AbstractC6231.m11036(abstractC1892.m4427(), null, null, new AbstractClickableNode$onFocusChange$1$1(abstractC1892, (C1416) objArr[(i << 3) + i3], null), 3);
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
            C1416 c1416 = abstractC1892.f3459;
            if (c1416 != null) {
                AbstractC6231.m11036(abstractC1892.m4427(), null, null, new AbstractClickableNode$onFocusChange$2$1(abstractC1892, c1416, null), 3);
            }
        }
        c1101.m1377();
        abstractC1892.f3459 = null;
        abstractC1892.mo2488();
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C6008.f15084;
    }
}
