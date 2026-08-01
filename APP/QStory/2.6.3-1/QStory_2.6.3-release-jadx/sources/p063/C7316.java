package p063;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.InterfaceC5893;
import kotlin.reflect.jvm.internal.InterfaceC5896;
import kotlin.reflect.jvm.internal.InterfaceC5907;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p064.C7348;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7316 implements InterfaceC7318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0955 f18123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7318 f18125;

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
    */
    public C7316(List list, InterfaceC5896 interfaceC5896, InterfaceC7318 interfaceC7318, boolean z) {
        Class clsM1704;
        Method declaredMethod;
        boolean z2;
        List listMo10520;
        Iterator it;
        int size;
        int size2;
        C0955 c0955;
        Member memberMo12555;
        Class clsM17042;
        InterfaceC5919 interfaceC5919M10629;
        interfaceC5896.getClass();
        list.getClass();
        this.f18125 = interfaceC7318;
        this.f18124 = z;
        InterfaceC5919 returnType = interfaceC5896.getReturnType();
        boolean z3 = interfaceC5896 instanceof InterfaceC5893;
        if ((z3 && ((InterfaceC5893) interfaceC5896).isSuspend() && (interfaceC5919M10629 = AbstractC5899.m10629(returnType)) != null && AbstractC1298.m1708(interfaceC5919M10629)) || (clsM1704 = AbstractC1298.m1704(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsM1704.getDeclaredMethod("box-impl", AbstractC1298.m1730(clsM1704, interfaceC5896).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                C5043.m9172("No box method found in inline class: ", clsM1704, " (calling ", interfaceC5896);
                throw null;
            }
        }
        if (interfaceC5896 instanceof InterfaceC5938) {
            InterfaceC5920 interfaceC5920Mo10509 = ((InterfaceC5938) interfaceC5896).mo10509();
            interfaceC5920Mo10509.getClass();
            if (AbstractC1298.m1707((InterfaceC5907) interfaceC5920Mo10509)) {
                c0955 = new C0955(C7348.f18172, new Method[0], declaredMethod);
            } else {
                int i = -1;
                if (!(interfaceC7318 instanceof C7332) || ((C7332) interfaceC7318).f18153) {
                    if (!AbstractC5894.m10599(interfaceC5896)) {
                        List parameters = interfaceC5896.getParameters();
                        if (parameters == null || !parameters.isEmpty()) {
                            Iterator it2 = parameters.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((InterfaceC5940) it2.next()).getKind() == KParameter$Kind.INSTANCE) {
                                    AbstractC5835 abstractC5835Mo10502 = interfaceC5896.mo10502();
                                    C5836 c5836 = abstractC5835Mo10502 instanceof C5836 ? (C5836) abstractC5835Mo10502 : null;
                                    if (c5836 == null || !c5836.mo9443()) {
                                        i = 1;
                                    }
                                }
                            }
                            i = 0;
                        }
                    } else if (!(interfaceC7318 instanceof InterfaceC7319)) {
                        i = 0;
                    }
                }
                this.f18125.mo12555();
                ArrayList arrayList = new ArrayList();
                InterfaceC5923 interfaceC5923Mo10502 = interfaceC5896.mo10502();
                if (!AbstractC5894.m10599(interfaceC5896) && (interfaceC5923Mo10502 instanceof InterfaceC5925)) {
                    InterfaceC5925 interfaceC5925 = (InterfaceC5925) interfaceC5923Mo10502;
                    if (interfaceC5925.mo9443()) {
                        arrayList.add(AbstractC5238.m9491(interfaceC5925));
                    }
                }
                if (AbstractC5894.m10599(interfaceC5896)) {
                    InterfaceC5925 interfaceC59252 = interfaceC5923Mo10502 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5923Mo10502 : null;
                    if (interfaceC59252 != null && interfaceC59252.mo9441()) {
                        z2 = true;
                    }
                    while (r6.hasNext()) {
                    }
                    listMo10520 = interfaceC5896.mo10520();
                    if (listMo10520 == null) {
                        it = listMo10520.iterator();
                        while (it.hasNext()) {
                        }
                        size = arrayList.size();
                    }
                } else {
                    z2 = false;
                    for (InterfaceC5940 interfaceC5940 : interfaceC5896.mo10520()) {
                        if (interfaceC5940.getKind() != KParameter$Kind.INSTANCE || z2) {
                            arrayList.add(interfaceC5940.getType());
                        }
                    }
                    listMo10520 = interfaceC5896.mo10520();
                    if (listMo10520 == null && listMo10520.isEmpty()) {
                        size = arrayList.size();
                        if (z3) {
                            size2 = arrayList.size() + i + (this.f18124 ? ((size + 31) / 32) + 1 : 0) + ((z3 && ((InterfaceC5893) interfaceC5896).isSuspend()) ? 1 : 0);
                            boolean z4 = this.f18124;
                            if (getParameterTypes().size() == size2) {
                            }
                        }
                    } else {
                        it = listMo10520.iterator();
                        while (it.hasNext()) {
                            if (((InterfaceC5940) it.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                size = arrayList.size() - 1;
                                break;
                            }
                        }
                        size = arrayList.size();
                        size2 = arrayList.size() + i + (this.f18124 ? ((size + 31) / 32) + 1 : 0) + ((z3 && ((InterfaceC5893) interfaceC5896).isSuspend()) ? 1 : 0);
                        boolean z42 = this.f18124;
                        if (getParameterTypes().size() == size2) {
                            StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                            sb.append(this.f18125.getParameterTypes().size());
                            sb.append(" != ");
                            sb.append(size2);
                            sb.append("\nCalling: ");
                            sb.append(interfaceC5896);
                            List parameterTypes = this.f18125.getParameterTypes();
                            sb.append("\nParameter types: ");
                            sb.append(parameterTypes);
                            sb.append(")\nDefault: ");
                            sb.append(z42);
                            throw new KotlinReflectionInternalError(sb.toString());
                        }
                        C7348 c7348M5627 = AbstractC3400.m5627(Math.max(i, 0), arrayList.size() + i);
                        Method[] methodArr = new Method[size2];
                        int i2 = 0;
                        while (i2 < size2) {
                            methodArr[i2] = (i2 > c7348M5627.f18161 || c7348M5627.f18163 > i2 || (clsM17042 = AbstractC1298.m1704((InterfaceC5919) arrayList.get(i2 - i))) == null) ? null : AbstractC1298.m1730(clsM17042, interfaceC5896);
                            i2++;
                        }
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            methodArr[((Number) it3.next()).intValue()] = null;
                        }
                        InterfaceC5923 interfaceC5923Mo105022 = interfaceC5896.mo10502();
                        if (!AbstractC5894.m10599(interfaceC5896) && (interfaceC5923Mo105022 instanceof InterfaceC5925) && ((InterfaceC5925) interfaceC5923Mo105022).mo9443() && (memberMo12555 = this.f18125.mo12555()) != null) {
                            if (memberMo12555.getDeclaringClass() == null ? false : !AbstractC5228.f13320.mo9476(r11).mo9443()) {
                                methodArr[0] = null;
                            }
                        }
                        c0955 = new C0955(c7348M5627, methodArr, declaredMethod);
                    }
                }
            }
        }
        this.f18123 = c0955;
    }

    @Override // p063.InterfaceC7318
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method;
        objArr.getClass();
        C0955 c0955 = this.f18123;
        C7348 c7348 = (C7348) c0955.f664;
        Method[] methodArr = (Method[]) c0955.f665;
        Method method2 = (Method) c0955.f663;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objM10620 = objArr[i];
            int i2 = c7348.f18163;
            if (i <= c7348.f18161 && i2 <= i && (method = methodArr[i]) != null) {
                if (objM10620 != null) {
                    objM10620 = method.invoke(objM10620, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objM10620 = AbstractC5899.m10620(returnType);
                }
            }
            objArr2[i] = objM10620;
        }
        Object objCall = this.f18125.call(objArr2);
        return (objCall == CoroutineSingletons.COROUTINE_SUSPENDED || method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p063.InterfaceC7318
    public final List getParameterTypes() {
        return this.f18125.getParameterTypes();
    }

    @Override // p063.InterfaceC7318
    public final Type getReturnType() {
        return this.f18125.getReturnType();
    }

    @Override // p063.InterfaceC7318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo12554() {
        return this.f18125 instanceof C7334;
    }

    @Override // p063.InterfaceC7318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Member mo12555() {
        return this.f18125.mo12555();
    }
}
