package bsh;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2648 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Method method = (Method) obj;
        Method method2 = (Method) obj2;
        if ((method.getModifiers() & 1) > 0 || (method2.getModifiers() & 5) == 0) {
            return -1;
        }
        return (method.getModifiers() & 7) == (method2.getModifiers() & 7) ? 0 : 1;
    }
}
