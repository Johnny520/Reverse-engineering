package p185m8;

import java.util.List;
import p080f9.C2363j;

/* JADX INFO: renamed from: m8.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5073d0 extends AbstractC5070c0 {
    /* JADX INFO: renamed from: Q */
    public static List m20509Q(List list) {
        list.getClass();
        return new C5117y0(list);
    }

    /* JADX INFO: renamed from: R */
    public static List m20510R(List list) {
        list.getClass();
        return new C5115x0(list);
    }

    /* JADX INFO: renamed from: S */
    public static final int m20511S(List list, int i10) {
        if (i10 >= 0 && i10 <= AbstractC5114x.m20802q(list)) {
            return AbstractC5114x.m20802q(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new C2363j(0, AbstractC5114x.m20802q(list)) + "].");
    }

    /* JADX INFO: renamed from: T */
    public static final int m20512T(List list, int i10) {
        return AbstractC5114x.m20802q(list) - i10;
    }

    /* JADX INFO: renamed from: U */
    public static final int m20513U(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new C2363j(0, list.size()) + "].");
    }
}
