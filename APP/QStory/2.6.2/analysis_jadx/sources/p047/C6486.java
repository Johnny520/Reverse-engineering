package p047;

import androidx.appcompat.app.C0108;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.AbstractC5066;
import p048.C6518;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6486 implements InterfaceC6488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0108 f17782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6488 f17784;

    /* JADX WARN: Removed duplicated region for block: B:100:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[EDGE_INSN: B:148:0x008c->B:32:0x008c BREAK  A[LOOP:4: B:39:0x009f->B:150:?]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6486(java.util.List r11, kotlin.reflect.jvm.internal.InterfaceC5063 r12, p047.InterfaceC6488 r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047.C6486.<init>(java.util.List, kotlin.reflect.jvm.internal.飘花落叶言楪子世苏兰哲, 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲, boolean):void");
    }

    @Override // p047.InterfaceC6488
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method;
        objArr.getClass();
        C0108 c0108 = this.f17782;
        C6518 c6518 = (C6518) c0108.f319;
        Method[] methodArr = (Method[]) c0108.f320;
        Method method2 = (Method) c0108.f318;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objM10057 = objArr[i];
            int i2 = c6518.f17822;
            if (i <= c6518.f17820 && i2 <= i && (method = methodArr[i]) != null) {
                if (objM10057 != null) {
                    objM10057 = method.invoke(objM10057, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objM10057 = AbstractC5066.m10057(returnType);
                }
            }
            objArr2[i] = objM10057;
        }
        Object objCall = this.f17784.call(objArr2);
        return (objCall == CoroutineSingletons.COROUTINE_SUSPENDED || method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p047.InterfaceC6488
    public final List getParameterTypes() {
        return this.f17784.getParameterTypes();
    }

    @Override // p047.InterfaceC6488
    public final Type getReturnType() {
        return this.f17784.getReturnType();
    }

    @Override // p047.InterfaceC6488
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo11952() {
        return this.f17784 instanceof C6504;
    }

    @Override // p047.InterfaceC6488
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Member mo11953() {
        return this.f17784.mo11953();
    }
}
