package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC5176;
import p034.AbstractC7082;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5872 extends AbstractC7082 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f14871;

    public C5872(Class cls) {
        cls.getClass();
        Object[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        C5864 c5864 = new C5864(2);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c5864);
            }
        }
        List listAsList = Arrays.asList(declaredMethods);
        listAsList.getClass();
        this.f14871 = listAsList;
    }

    @Override // p034.AbstractC7082
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final String mo10554() {
        return AbstractC5176.m9369(this.f14871, "", "<init>(", ")V", C5848.f14813, 24);
    }
}
