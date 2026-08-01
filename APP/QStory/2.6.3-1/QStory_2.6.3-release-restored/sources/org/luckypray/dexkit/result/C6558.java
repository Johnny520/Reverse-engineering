package org.luckypray.dexkit.result;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.C1171;
import bsh.C3466;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.util.AbstractC6560;
import org.luckypray.dexkit.util.AbstractC6561;
import org.luckypray.dexkit.util.NativeReflect;
import org.luckypray.dexkit.wrap.C6564;
import p068.InterfaceC7372;
import p381.AbstractC9777;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6558 extends AbstractC9777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f16051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16053;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f16054;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f16055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6016 f16056;

    public C6558(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f16053 = i3;
        this.f16052 = i4;
        this.f16051 = str;
        this.f16055 = i5;
        this.f16054 = arrayList;
        this.f16056 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$dexMethod$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6564 invoke() {
                return new C6564(this.this$0.f16051);
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$declaredClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6554 invoke() {
                return dexKitBridge.m11651(new long[]{AbstractC9777.m15116(i2, this.f16053)}).firstOrNull();
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$returnType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6554 invoke() {
                return dexKitBridge.m11651(new long[]{AbstractC9777.m15116(i2, this.f16055)}).firstOrNull();
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$paramTypes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final ClassDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList2 = this.f16054;
                int i6 = i2;
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(AbstractC9777.m15116(i6, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11651(AbstractC5176.m9344(arrayList3));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$paramNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<String> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11659(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<C6553> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11665(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$paramAnnotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<List<C6553>> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11660(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$opCodes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<Integer> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11662(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$callers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11667(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$invokes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11666(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$usingStrings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<String> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11657(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.MethodData$usingFields$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<C6556> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6558 c6558 = this;
                int i6 = i2;
                int i7 = i;
                c6558.getClass();
                return dexKitBridge2.m11658(AbstractC9777.m15116(i6, i7));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6558) && AbstractC5227.m9466(((C6558) obj).f16051, this.f16051);
    }

    public final int hashCode() {
        return this.f16051.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f16052;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m11686().f16064);
        sb.append(" ");
        sb.append(m11686().f16067);
        sb.append(".");
        sb.append(m11686().f16066);
        sb.append("(");
        return AbstractC0900.m711(sb, AbstractC5176.m9369(m11686().f16065, ", ", null, null, null, 62), ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m11685(ClassLoader classLoader) {
        Object objM9304constructorimpl;
        Object objM723;
        Object objM7232;
        Object objM7233;
        classLoader.getClass();
        C6564 c6564M11686 = m11686();
        Boolean boolValueOf = Boolean.valueOf(Modifier.isStatic(this.f16052));
        c6564M11686.getClass();
        InterfaceC6016 interfaceC6016 = c6564M11686.f16063;
        C1171 c1171 = AbstractC6560.f16059;
        String str = c6564M11686.f16066;
        if (AbstractC5227.m9466(str, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || AbstractC5227.m9466(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            throw new IllegalArgumentException((c6564M11686 + " not a method").toString());
        }
        Class clsM11687 = AbstractC6560.m11687(classLoader, c6564M11686.f16067);
        ArrayList arrayList = c6564M11686.f16065;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    objM7233 = Result.m9304constructorimpl(AbstractC6560.m11687(classLoader, (String) it.next()));
                } catch (Throwable th) {
                    objM7233 = AbstractC0900.m723(th);
                }
                Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(objM7233);
                if (thM9307exceptionOrNullimpl != null) {
                    objM9304constructorimpl = AbstractC0900.m723(thM9307exceptionOrNullimpl);
                    break;
                }
                arrayList2.add((Class) objM7233);
            } else {
                Object[] array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    C3466.m5903("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                objM9304constructorimpl = Result.m9304constructorimpl(array);
            }
        }
        Throwable thM9307exceptionOrNullimpl2 = Result.m9307exceptionOrNullimpl(objM9304constructorimpl);
        if (thM9307exceptionOrNullimpl2 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + c6564M11686 + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM9307exceptionOrNullimpl2);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM9304constructorimpl;
        try {
            objM723 = Result.m9304constructorimpl(AbstractC6560.m11687(classLoader, c6564M11686.f16064));
        } catch (Throwable th2) {
            objM723 = AbstractC0900.m723(th2);
        }
        Throwable thM9307exceptionOrNullimpl3 = Result.m9307exceptionOrNullimpl(objM723);
        if (thM9307exceptionOrNullimpl3 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + c6564M11686 + " not available: return type missing");
            noSuchMethodException2.initCause(thM9307exceptionOrNullimpl3);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM723;
        Class superclass = clsM11687;
        while (true) {
            boolean z = 1;
            z = 1;
            if (superclass == null) {
                for (Class superclass2 = clsM11687; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    try {
                        Method[] declaredMethods = superclass2.getDeclaredMethods();
                        declaredMethods.getClass();
                        for (Method method : declaredMethods) {
                            if (AbstractC5227.m9466(method.getName(), str) && AbstractC5227.m9466((String) interfaceC6016.getValue(), AbstractC6561.m11692(method))) {
                                method.setAccessible(true);
                                z = method;
                                return z;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsM11687, str, (String) interfaceC6016.getValue(), boolValueOf);
                if (reflectedMethod != null) {
                    Method method2 = (Method) reflectedMethod;
                    method2.setAccessible(z);
                    return method2;
                }
                throw new NoSuchMethodException("Method " + c6564M11686 + " not found");
            }
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                objM7232 = Result.m9304constructorimpl(declaredMethod);
            } catch (Throwable th3) {
                objM7232 = AbstractC0900.m723(th3);
            }
            if (Result.m9310isFailureimpl(objM7232)) {
                objM7232 = null;
            }
            Method method3 = (Method) objM7232;
            if (method3 != null && AbstractC5227.m9466(method3.getReturnType(), cls)) {
                return method3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6564 m11686() {
        return (C6564) this.f16056.getValue();
    }
}
