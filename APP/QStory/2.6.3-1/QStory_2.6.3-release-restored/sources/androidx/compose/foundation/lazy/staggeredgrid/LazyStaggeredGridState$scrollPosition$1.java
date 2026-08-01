package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.appcompat.widget.C0984;
import androidx.compose.foundation.lazy.layout.C1519;
import androidx.compose.runtime.AbstractC2182;
import com.alibaba.fastjson2.C3775;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5183;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7383;
import p192.AbstractC8570;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, C1577.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] invoke(int i, int i2) {
        int i3;
        C1577 c1577 = (C1577) this.receiver;
        int i4 = C1577.f2418;
        c1577.getClass();
        int[] iArr = new int[i2];
        C0960 c0960 = ((C1579) ((AbstractC2182) c1577.f2421).getValue()).f2441;
        if (i >= 0) {
            C1519 c1519 = (C1519) c0960.f702;
            if (i < c1519.f2239) {
                C0955 c0955 = c1519.m2036(i).f2372;
                C3775.m6954();
                return null;
            }
        }
        C0984 c0984 = c1577.f2420;
        int i5 = i + i2;
        C5183 c5183 = (C5183) c0984.f939;
        int i6 = c0984.f941;
        int i7 = i5 - i6;
        int iMin = 0;
        if (i7 < 0 || i7 >= 131072) {
            int iMax = Math.max(i5 - (((int[]) c0984.f940).length / 2), 0);
            c0984.f941 = iMax;
            int i8 = iMax - i6;
            int[] iArr2 = (int[]) c0984.f940;
            if (i8 >= 0) {
                if (i8 < iArr2.length) {
                    AbstractC5179.m9395(0, i8, iArr2.length, iArr2, iArr2);
                }
                int[] iArr3 = (int[]) c0984.f940;
                Arrays.fill(iArr3, Math.max(0, iArr3.length - i8), ((int[]) c0984.f940).length, 0);
            } else {
                int i9 = -i8;
                if (iArr2.length + i9 < 131072) {
                    c0984.m1127(iArr2.length + i9 + 1, i9);
                } else {
                    if (i9 < iArr2.length) {
                        AbstractC5179.m9395(i9, 0, iArr2.length - i9, iArr2, iArr2);
                    }
                    int[] iArr4 = (int[]) c0984.f940;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i9), 0);
                }
            }
        } else {
            c0984.m1127(i7 + 1, 0);
        }
        if (!c5183.isEmpty()) {
            c5183.first().getClass();
            C3775.m6954();
            return null;
        }
        if (!c5183.isEmpty()) {
            c5183.last().getClass();
            C3775.m6954();
            return null;
        }
        int i10 = c0984.f941;
        if (i >= i10) {
            i3 = i >= ((int[]) c0984.f940).length + i10 ? -1 : r3[i - i10] - 1;
        }
        if (i3 != -2 && i3 != -1) {
            if (i3 < 0) {
                AbstractC8570.m13656("Expected positive lane number, got " + i3 + " instead.");
            }
            iMin = Math.min(i3, i2);
        }
        int i11 = iMin - 1;
        int i12 = i;
        while (true) {
            if (-1 >= i11) {
                break;
            }
            i12--;
            while (true) {
                if (-1 >= i12) {
                    i12 = -1;
                    break;
                }
                int i13 = c0984.f941;
                if (i12 >= i13) {
                    int i14 = i12 >= ((int[]) c0984.f940).length + i13 ? -1 : r7[i12 - i13] - 1;
                    if (i14 == i11 || i14 == -1 || i14 == -2) {
                        break;
                    }
                    i12--;
                }
            }
            iArr[i11] = i12;
            if (i12 == -1) {
                AbstractC5179.m9389(iArr, -1, i11, 2);
                break;
            }
            i11--;
        }
        iArr[iMin] = i;
        while (true) {
            iMin++;
            if (iMin >= i2) {
                return iArr;
            }
            i++;
            int length = c0984.f941 + ((int[]) c0984.f940).length;
            while (true) {
                int i15 = c0984.f941;
                if (i >= length) {
                    i = i15 + ((int[]) c0984.f940).length;
                    break;
                }
                if (i >= i15) {
                    int i16 = i >= ((int[]) c0984.f940).length + i15 ? -1 : r5[i - i15] - 1;
                    if (i16 == iMin || i16 == -1 || i16 == -2) {
                        break;
                    }
                    i++;
                }
            }
            iArr[iMin] = i;
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
