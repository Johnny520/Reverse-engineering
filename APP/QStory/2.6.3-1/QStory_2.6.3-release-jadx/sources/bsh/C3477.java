package bsh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.function.Predicate;
import org.apache.commons.p014io.filefilter.WildcardFilter;
import top.suzhelan.qstory.hook.item.chat.C6693;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3477 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f8259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8260;

    public /* synthetic */ C3477(Object obj, int i) {
        this.f8260 = i;
        this.f8259 = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f8260;
        Object obj2 = this.f8259;
        switch (i) {
            case 0:
                Method method = (Method) obj2;
                Method method2 = (Method) obj;
                return method.getName().equals(method2.getName()) && (method2.getModifiers() & 1026) == 0 && AbstractC3495.m5938(method.getParameterTypes(), method2.getParameterTypes());
            case 1:
                return ((Field) obj).getType() == ((Class) obj2);
            case 2:
                return ((Boolean) ((C6693) obj2).invoke(obj)).booleanValue();
            default:
                return WildcardFilter.lambda$accept$2((Path) obj2, (String) obj);
        }
    }
}
