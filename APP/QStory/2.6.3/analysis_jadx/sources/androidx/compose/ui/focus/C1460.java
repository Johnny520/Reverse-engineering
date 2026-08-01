package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1460 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1460 f4158 = new C1460();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1452 c1452 = (C1452) obj;
        C1452 c14522 = (C1452) obj2;
        if (AbstractC1459.m2622(c1452) && AbstractC1459.m2622(c14522)) {
            C1748 c1748M3346 = AbstractC1785.m3346(c1452);
            C1748 c1748M33462 = AbstractC1785.m3346(c14522);
            if (!AbstractC4395.m8907(c1748M3346, c1748M33462)) {
                Object[] objArr = new C1748[16];
                int i = 0;
                while (c1748M3346 != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = c1748M3346;
                    i++;
                    c1748M3346 = c1748M3346.m3256();
                }
                Object[] objArr3 = new C1748[16];
                int i3 = 0;
                while (c1748M33462 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = c1748M33462;
                    i3++;
                    c1748M33462 = c1748M33462.m3256();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (AbstractC4395.m8907(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return AbstractC4395.m8905(((C1748) objArr[i5]).m3253(), ((C1748) objArr3[i5]).m3253());
                }
                C5925.m11311("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (AbstractC1459.m2622(c1452)) {
                return -1;
            }
            if (AbstractC1459.m2622(c14522)) {
                return 1;
            }
        }
        return 0;
    }
}
