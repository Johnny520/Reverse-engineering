package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC4344;
import p018.AbstractC6253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5040 extends AbstractC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f14526;

    public C5040(Class cls) {
        cls.getClass();
        Object[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        C5032 c5032 = new C5032(2);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c5032);
            }
        }
        List listAsList = Arrays.asList(declaredMethods);
        listAsList.getClass();
        this.f14526 = listAsList;
    }

    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final String mo9995() {
        return AbstractC4344.m8810(this.f14526, "", "<init>(", ")V", C5016.f14468, 24);
    }
}
