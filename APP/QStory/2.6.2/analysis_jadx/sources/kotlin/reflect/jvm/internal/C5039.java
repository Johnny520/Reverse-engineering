package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC4343;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5039 extends AbstractC8174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f14524;

    public C5039(Class cls) {
        cls.getClass();
        Object[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        C5031 c5031 = new C5031(2);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c5031);
            }
        }
        List listAsList = Arrays.asList(declaredMethods);
        listAsList.getClass();
        this.f14524 = listAsList;
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo9998() {
        return AbstractC4343.m8813(this.f14524, "", "<init>(", ")V", C5015.f14466, 24);
    }
}
