package p047;

import androidx.appcompat.app.C0108;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.AbstractC5067;
import p048.C6519;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6487 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0108 f17778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6489 f17780;

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
    public C6487(java.util.List r11, kotlin.reflect.jvm.internal.InterfaceC5064 r12, p047.InterfaceC6489 r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047.C6487.<init>(java.util.List, kotlin.reflect.jvm.internal.飘花落叶言楪子世苏兰哲, 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲, boolean):void");
    }

    @Override // p047.InterfaceC6489
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method;
        objArr.getClass();
        C0108 c0108 = this.f17778;
        C6519 c6519 = (C6519) c0108.f319;
        Method[] methodArr = (Method[]) c0108.f320;
        Method method2 = (Method) c0108.f318;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objM10061 = objArr[i];
            int i2 = c6519.f17818;
            if (i <= c6519.f17816 && i2 <= i && (method = methodArr[i]) != null) {
                if (objM10061 != null) {
                    objM10061 = method.invoke(objM10061, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objM10061 = AbstractC5067.m10061(returnType);
                }
            }
            objArr2[i] = objM10061;
        }
        Object objCall = this.f17780.call(objArr2);
        return (objCall == CoroutineSingletons.COROUTINE_SUSPENDED || method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p047.InterfaceC6489
    public final List getParameterTypes() {
        return this.f17780.getParameterTypes();
    }

    @Override // p047.InterfaceC6489
    public final Type getReturnType() {
        return this.f17780.getReturnType();
    }

    @Override // p047.InterfaceC6489
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo11995() {
        return this.f17780 instanceof C6505;
    }

    @Override // p047.InterfaceC6489
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Member mo11996() {
        return this.f17780.mo11996();
    }
}
