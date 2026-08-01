package retrofit2;

import androidx.appcompat.widget.C0978;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6588 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f16115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0978 f16116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f16117 = new Object[0];

    public C6588(C0978 c0978, Class cls) {
        this.f16116 = c0978;
        this.f16115 = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r10 = retrofit2.AbstractC6614.m11732(r7, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r7.f923).put(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        r7 = (retrofit2.AbstractC6614) r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC6614 abstractC6614M11732;
        AbstractC6614 abstractC6614;
        Class cls = this.f16115;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f16117;
        }
        Object[] objArr2 = objArr;
        C6611 c6611 = AbstractC6591.f16158;
        if (c6611.mo11714(method)) {
            return c6611.mo11715(method, cls, obj, objArr2);
        }
        C0978 c0978 = this.f16116;
        while (true) {
            Object objPutIfAbsent = ((ConcurrentHashMap) c0978.f923).get(method);
            if (objPutIfAbsent instanceof AbstractC6614) {
                abstractC6614M11732 = (AbstractC6614) objPutIfAbsent;
                break;
            }
            if (objPutIfAbsent == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        objPutIfAbsent = ((ConcurrentHashMap) c0978.f923).putIfAbsent(method, obj2);
                        if (objPutIfAbsent != null) {
                            synchronized (objPutIfAbsent) {
                                try {
                                    Object obj3 = ((ConcurrentHashMap) c0978.f923).get(method);
                                    if (obj3 != null) {
                                        break;
                                    }
                                } finally {
                                }
                            }
                            abstractC6614M11732 = abstractC6614;
                            break;
                        }
                        try {
                            break;
                        } catch (Throwable th) {
                            ((ConcurrentHashMap) c0978.f923).remove(method);
                            throw th;
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
            }
        }
        return abstractC6614M11732.mo11733(new C6598(abstractC6614M11732.f16222, obj, objArr2, abstractC6614M11732.f16221, abstractC6614M11732.f16220), objArr2);
    }
}
