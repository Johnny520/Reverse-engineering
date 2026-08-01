package androidx.compose.p001ui.focus;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2295 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2295 f4503 = new C2295();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2287 c2287 = (C2287) obj;
        C2287 c22872 = (C2287) obj2;
        if (AbstractC2294.m3182(c2287) && AbstractC2294.m3182(c22872)) {
            C2583 c2583M3906 = AbstractC2620.m3906(c2287);
            C2583 c2583M39062 = AbstractC2620.m3906(c22872);
            if (!AbstractC5227.m9466(c2583M3906, c2583M39062)) {
                Object[] objArr = new C2583[16];
                int i = 0;
                while (c2583M3906 != null) {
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
                    objArr[0] = c2583M3906;
                    i++;
                    c2583M3906 = c2583M3906.m3816();
                }
                Object[] objArr3 = new C2583[16];
                int i3 = 0;
                while (c2583M39062 != null) {
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
                    objArr3[0] = c2583M39062;
                    i3++;
                    c2583M39062 = c2583M39062.m3816();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (AbstractC5227.m9466(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return AbstractC5227.m9464(((C2583) objArr[i5]).m3813(), ((C2583) objArr3[i5]).m3813());
                }
                C6755.m11870("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (AbstractC2294.m3182(c2287)) {
                return -1;
            }
            if (AbstractC2294.m3182(c22872)) {
                return 1;
            }
        }
        return 0;
    }
}
