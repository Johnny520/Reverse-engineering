package yyds;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛲᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0272 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Method f1475;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object[] f1476;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f1477;

    public C0272(Method method, Object[] objArr, int i) {
        AbstractC2328.m4341(-924345254445934L);
        AbstractC2328.m4341(-924375319217006L);
        this.f1475 = method;
        this.f1476 = objArr;
        this.f1477 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0272)) {
            return false;
        }
        C0272 c0272 = (C0272) obj;
        return this.f1475.equals(c0272.f1475) && AbstractC1544.m3188(this.f1476, c0272.f1476) && this.f1477 == c0272.f1477;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1477) + ((Arrays.hashCode(this.f1476) + (this.f1475.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-924448333661038L));
        sb.append(this.f1475);
        sb.append(AbstractC2328.m4341(-924534233006958L));
        sb.append(Arrays.toString(this.f1476));
        sb.append(AbstractC2328.m4341(-924568592745326L));
        return AbstractC0897.m1999(sb, this.f1477, ')');
    }
}
