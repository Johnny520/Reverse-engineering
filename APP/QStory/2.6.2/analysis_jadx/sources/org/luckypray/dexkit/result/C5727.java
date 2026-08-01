package org.luckypray.dexkit.result;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.C0325;
import bsh.C2632;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Result;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.util.AbstractC5729;
import org.luckypray.dexkit.util.AbstractC5730;
import org.luckypray.dexkit.util.NativeReflect;
import org.luckypray.dexkit.wrap.C5733;
import p052.InterfaceC6542;
import p365.AbstractC8944;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5727 extends AbstractC8944 {

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
    public final InterfaceC5183 f15711;

    public C5727(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f15708 = i3;
        this.f15707 = i4;
        this.f15706 = str;
        this.f15710 = i5;
        this.f15709 = arrayList;
        this.f15711 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$dexMethod$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5733 invoke() {
                return new C5733(this.this$0.f15706);
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$declaredClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5723 invoke() {
                return dexKitBridge.m11035(new long[]{AbstractC8944.m14538(i2, this.f15708)}).firstOrNull();
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$returnType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5723 invoke() {
                return dexKitBridge.m11035(new long[]{AbstractC8944.m14538(i2, this.f15710)}).firstOrNull();
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$paramTypes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final ClassDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList2 = this.f15709;
                int i6 = i2;
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(AbstractC8944.m14538(i6, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11035(AbstractC4343.m8805(arrayList3));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$paramNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<String> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11043(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<C5722> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11049(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$paramAnnotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<List<C5722>> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11044(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$opCodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<Integer> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11046(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$callers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11051(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$invokes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11050(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$usingStrings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<String> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11041(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.MethodData$usingFields$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<C5725> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11042(AbstractC8944.m14538(i6, i7));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5727) && AbstractC4394.m8917(((C5727) obj).f15706, this.f15706);
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
        sb.append(m11070().f15719);
        sb.append(" ");
        sb.append(m11070().f15722);
        sb.append(".");
        sb.append(m11070().f15721);
        sb.append("(");
        return AbstractC0053.m146(sb, AbstractC4343.m8813(m11070().f15720, ", ", null, null, null, 62), ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m11069(ClassLoader classLoader) {
        Object objM8755constructorimpl;
        Object objM162;
        Object objM1622;
        Object objM1623;
        classLoader.getClass();
        C5733 c5733M11070 = m11070();
        Boolean boolValueOf = Boolean.valueOf(Modifier.isStatic(this.f15707));
        c5733M11070.getClass();
        InterfaceC5183 interfaceC5183 = c5733M11070.f15718;
        C0325 c0325 = AbstractC5729.f15714;
        String str = c5733M11070.f15721;
        if (AbstractC4394.m8917(str, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || AbstractC4394.m8917(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            throw new IllegalArgumentException((c5733M11070 + " not a method").toString());
        }
        Class clsM11071 = AbstractC5729.m11071(classLoader, c5733M11070.f15722);
        ArrayList arrayList = c5733M11070.f15720;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    objM1623 = Result.m8755constructorimpl(AbstractC5729.m11071(classLoader, (String) it.next()));
                } catch (Throwable th) {
                    objM1623 = AbstractC0053.m162(th);
                }
                Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(objM1623);
                if (thM8758exceptionOrNullimpl != null) {
                    objM8755constructorimpl = AbstractC0053.m162(thM8758exceptionOrNullimpl);
                    break;
                }
                arrayList2.add((Class) objM1623);
            } else {
                Object[] array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    C2632.m5298("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                objM8755constructorimpl = Result.m8755constructorimpl(array);
            }
        }
        Throwable thM8758exceptionOrNullimpl2 = Result.m8758exceptionOrNullimpl(objM8755constructorimpl);
        if (thM8758exceptionOrNullimpl2 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + c5733M11070 + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM8758exceptionOrNullimpl2);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM8755constructorimpl;
        try {
            objM162 = Result.m8755constructorimpl(AbstractC5729.m11071(classLoader, c5733M11070.f15719));
        } catch (Throwable th2) {
            objM162 = AbstractC0053.m162(th2);
        }
        Throwable thM8758exceptionOrNullimpl3 = Result.m8758exceptionOrNullimpl(objM162);
        if (thM8758exceptionOrNullimpl3 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + c5733M11070 + " not available: return type missing");
            noSuchMethodException2.initCause(thM8758exceptionOrNullimpl3);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM162;
        Class superclass = clsM11071;
        while (true) {
            boolean z = 1;
            z = 1;
            if (superclass == null) {
                for (Class superclass2 = clsM11071; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    try {
                        Method[] declaredMethods = superclass2.getDeclaredMethods();
                        declaredMethods.getClass();
                        for (Method method : declaredMethods) {
                            if (AbstractC4394.m8917(method.getName(), str) && AbstractC4394.m8917((String) interfaceC5183.getValue(), AbstractC5730.m11076(method))) {
                                method.setAccessible(true);
                                z = method;
                                return z;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsM11071, str, (String) interfaceC5183.getValue(), boolValueOf);
                if (reflectedMethod != null) {
                    Method method2 = (Method) reflectedMethod;
                    method2.setAccessible(z);
                    return method2;
                }
                throw new NoSuchMethodException("Method " + c5733M11070 + " not found");
            }
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                objM1622 = Result.m8755constructorimpl(declaredMethod);
            } catch (Throwable th3) {
                objM1622 = AbstractC0053.m162(th3);
            }
            if (Result.m8761isFailureimpl(objM1622)) {
                objM1622 = null;
            }
            Method method3 = (Method) objM1622;
            if (method3 != null && AbstractC4394.m8917(method3.getReturnType(), cls)) {
                return method3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5733 m11070() {
        return (C5733) this.f15711.getValue();
    }
}
