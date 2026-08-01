package org.luckypray.dexkit.result;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.C0325;
import bsh.C2633;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Result;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.util.AbstractC5730;
import org.luckypray.dexkit.util.AbstractC5731;
import org.luckypray.dexkit.util.NativeReflect;
import org.luckypray.dexkit.wrap.C5734;
import p052.InterfaceC6543;
import p365.AbstractC8948;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5728 extends AbstractC8948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f15706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f15707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f15708;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f15709;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f15710;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC5184 f15711;

    public C5728(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f15708 = i3;
        this.f15707 = i4;
        this.f15706 = str;
        this.f15710 = i5;
        this.f15709 = arrayList;
        this.f15711 = AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$dexMethod$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5734 invoke() {
                return new C5734(this.this$0.f15706);
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$declaredClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5724 invoke() {
                return dexKitBridge.m11092(new long[]{AbstractC8948.m14557(i2, this.f15708)}).firstOrNull();
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$returnType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5724 invoke() {
                return dexKitBridge.m11092(new long[]{AbstractC8948.m14557(i2, this.f15710)}).firstOrNull();
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$paramTypes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final ClassDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList2 = this.f15709;
                int i6 = i2;
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(AbstractC8948.m14557(i6, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11092(AbstractC4344.m8785(arrayList3));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$paramNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<String> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11100(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<C5723> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11106(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$paramAnnotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<List<C5723>> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11101(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$opCodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<Integer> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11103(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$callers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11108(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$invokes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11107(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$usingStrings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<String> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11098(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.MethodData$usingFields$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<C5726> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5728 c5728 = this;
                int i6 = i2;
                int i7 = i;
                c5728.getClass();
                return dexKitBridge2.m11099(AbstractC8948.m14557(i6, i7));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5728) && AbstractC4395.m8907(((C5728) obj).f15706, this.f15706);
    }

    public final int hashCode() {
        return this.f15706.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f15707;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m11127().f15719);
        sb.append(" ");
        sb.append(m11127().f15722);
        sb.append(".");
        sb.append(m11127().f15721);
        sb.append("(");
        return AbstractC0053.m151(sb, AbstractC4344.m8810(m11127().f15720, ", ", null, null, null, 62), ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m11126(ClassLoader classLoader) {
        Object objM8745constructorimpl;
        Object objM163;
        Object objM1632;
        Object objM1633;
        classLoader.getClass();
        C5734 c5734M11127 = m11127();
        Boolean boolValueOf = Boolean.valueOf(Modifier.isStatic(this.f15707));
        c5734M11127.getClass();
        InterfaceC5184 interfaceC5184 = c5734M11127.f15718;
        C0325 c0325 = AbstractC5730.f15714;
        String str = c5734M11127.f15721;
        if (AbstractC4395.m8907(str, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || AbstractC4395.m8907(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            throw new IllegalArgumentException((c5734M11127 + " not a method").toString());
        }
        Class clsM11128 = AbstractC5730.m11128(classLoader, c5734M11127.f15722);
        ArrayList arrayList = c5734M11127.f15720;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    objM1633 = Result.m8745constructorimpl(AbstractC5730.m11128(classLoader, (String) it.next()));
                } catch (Throwable th) {
                    objM1633 = AbstractC0053.m163(th);
                }
                Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(objM1633);
                if (thM8748exceptionOrNullimpl != null) {
                    objM8745constructorimpl = AbstractC0053.m163(thM8748exceptionOrNullimpl);
                    break;
                }
                arrayList2.add((Class) objM1633);
            } else {
                Object[] array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    C2633.m5343("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                objM8745constructorimpl = Result.m8745constructorimpl(array);
            }
        }
        Throwable thM8748exceptionOrNullimpl2 = Result.m8748exceptionOrNullimpl(objM8745constructorimpl);
        if (thM8748exceptionOrNullimpl2 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + c5734M11127 + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM8748exceptionOrNullimpl2);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM8745constructorimpl;
        try {
            objM163 = Result.m8745constructorimpl(AbstractC5730.m11128(classLoader, c5734M11127.f15719));
        } catch (Throwable th2) {
            objM163 = AbstractC0053.m163(th2);
        }
        Throwable thM8748exceptionOrNullimpl3 = Result.m8748exceptionOrNullimpl(objM163);
        if (thM8748exceptionOrNullimpl3 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + c5734M11127 + " not available: return type missing");
            noSuchMethodException2.initCause(thM8748exceptionOrNullimpl3);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM163;
        Class superclass = clsM11128;
        while (true) {
            boolean z = 1;
            z = 1;
            if (superclass == null) {
                for (Class superclass2 = clsM11128; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    try {
                        Method[] declaredMethods = superclass2.getDeclaredMethods();
                        declaredMethods.getClass();
                        for (Method method : declaredMethods) {
                            if (AbstractC4395.m8907(method.getName(), str) && AbstractC4395.m8907((String) interfaceC5184.getValue(), AbstractC5731.m11133(method))) {
                                method.setAccessible(true);
                                z = method;
                                return z;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsM11128, str, (String) interfaceC5184.getValue(), boolValueOf);
                if (reflectedMethod != null) {
                    Method method2 = (Method) reflectedMethod;
                    method2.setAccessible(z);
                    return method2;
                }
                throw new NoSuchMethodException("Method " + c5734M11127 + " not found");
            }
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                objM1632 = Result.m8745constructorimpl(declaredMethod);
            } catch (Throwable th3) {
                objM1632 = AbstractC0053.m163(th3);
            }
            if (Result.m8751isFailureimpl(objM1632)) {
                objM1632 = null;
            }
            Method method3 = (Method) objM1632;
            if (method3 != null && AbstractC4395.m8907(method3.getReturnType(), cls)) {
                return method3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5734 m11127() {
        return (C5734) this.f15711.getValue();
    }
}
