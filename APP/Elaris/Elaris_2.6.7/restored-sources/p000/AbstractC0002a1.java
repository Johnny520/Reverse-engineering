package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0002a1 extends AbstractC0260i5 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i2 */
    public static String m5i2(Object[] objArr, InterfaceC0482u5 interfaceC0482u5) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            AbstractC0486u9.m1049b(sb, obj, interfaceC0482u5);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j2 */
    public static List m6j2(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return C0021b4.f57a;
        }
        if (length == 1) {
            return AbstractC0260i5.m567S0(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k2 */
    public static List m7k2(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0541y0(objArr)) : AbstractC0260i5.m567S0(objArr[0]) : C0021b4.f57a;
    }
}
