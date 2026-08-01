package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1460 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1460 f4157 = new C1460();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1452 c1452 = (C1452) obj;
        C1452 c14522 = (C1452) obj2;
        if (AbstractC1459.m2612(c1452) && AbstractC1459.m2612(c14522)) {
            C1748 c1748M3336 = AbstractC1785.m3336(c1452);
            C1748 c1748M33362 = AbstractC1785.m3336(c14522);
            if (!AbstractC4394.m8917(c1748M3336, c1748M33362)) {
                Object[] objArr = new C1748[16];
                int i = 0;
                while (c1748M3336 != null) {
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
                    objArr[0] = c1748M3336;
                    i++;
                    c1748M3336 = c1748M3336.m3246();
                }
                Object[] objArr3 = new C1748[16];
                int i3 = 0;
                while (c1748M33362 != null) {
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
                    objArr3[0] = c1748M33362;
                    i3++;
                    c1748M33362 = c1748M33362.m3246();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (AbstractC4394.m8917(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return AbstractC4394.m8915(((C1748) objArr[i5]).m3243(), ((C1748) objArr3[i5]).m3243());
                }
                C5919.m11250("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (AbstractC1459.m2612(c1452)) {
                return -1;
            }
            if (AbstractC1459.m2612(c14522)) {
                return 1;
            }
        }
        return 0;
    }
}
