package Yue;

import java.util.function.Supplier;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3892 {
    /* JADX INFO: renamed from: ۥ */
    public static C4607 m919(AbstractC4662 abstractC4662, C4605 c4605) {
        abstractC4662.mo11186();
        return (C4607) c4605.m13812().filter(abstractC4662.m1617(c4605)).collect(Collectors.toCollection(new Supplier() { // from class: Yue.ۥ۟ۥۢۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C4607();
            }
        }));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C4605 m920(AbstractC4662 abstractC4662, C4605 c4605) {
        abstractC4662.mo11186();
        return c4605.m13812().filter(abstractC4662.m1617(c4605)).findFirst().orElse(null);
    }
}
