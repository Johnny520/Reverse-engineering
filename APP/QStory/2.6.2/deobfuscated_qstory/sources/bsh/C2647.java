package bsh;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2647 implements Comparator {
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
