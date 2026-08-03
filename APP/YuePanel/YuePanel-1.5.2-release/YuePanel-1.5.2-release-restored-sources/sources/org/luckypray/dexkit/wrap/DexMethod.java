package org.luckypray.dexkit.wrap;

import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
import Yue.C5689;
import Yue.C7628;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDexMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexMethod.kt\norg/luckypray/dexkit/wrap/DexMethod\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,185:1\n11328#2:186\n11663#2,3:187\n11328#2:190\n11663#2,3:191\n*S KotlinDebug\n*F\n+ 1 DexMethod.kt\norg/luckypray/dexkit/wrap/DexMethod\n*L\n115#1:186\n115#1:187,3\n129#1:190\n129#1:191,3\n*E\n"})
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0012\u0018\u0000 42\u00020\u0001:\u00014B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0015\b\u0016\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\rR\u001b\u0010-\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\rR\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\rR\u0011\u00100\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0011\u00103\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Lorg/luckypray/dexkit/wrap/DexMethod;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "", "descriptor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "Ljava/lang/reflect/Method;", "method", "(Ljava/lang/reflect/Method;)V", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "getSign", "()Ljava/lang/String;", "Ljava/lang/ClassLoader;", "classLoader", "getConstructorInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;", "", "isStatic", "getMethodInstance", "(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;", "toString", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "className", "Ljava/lang/String;", "getClassName", "name", "getName", "", "paramTypeNames", "Ljava/util/List;", "getParamTypeNames", "()Ljava/util/List;", "returnTypeName", "getReturnTypeName", "methodSign$delegate", "LYue/ۥ۠ۦۨۨ;", "getMethodSign", "methodSign", "getDeclaredClassName", "declaredClassName", "isConstructor", "()Z", "isStaticInitializer", "isMethod", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class DexMethod implements ISerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private final String className;

    /* JADX INFO: renamed from: methodSign$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 methodSign;

    @InterfaceC6399
    private final String name;

    @InterfaceC6399
    private final List<String> paramTypeNames;

    @InterfaceC6399
    private final String returnTypeName;

    @InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/wrap/DexMethod$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexMethod;", "descriptor", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final DexMethod deserialize(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            return new DexMethod(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexMethod(@InterfaceC6399 String str) {
        C5499.m17103(str, "descriptor");
        this.methodSign = C5689.m2370(new DexMethod$methodSign$2(this));
        int iM24057 = C7628.m24057(str, "->", 0, false, 6, null);
        int iM240572 = C7628.m24057(str, "(", iM24057 + 1, false, 4, null);
        int i = iM240572 + 1;
        int iM240573 = C7628.m24057(str, ")", i, false, 4, null);
        if (iM24057 == -1 || iM240572 == -1 || iM240573 == -1) {
            throw new IllegalAccessError("not method descriptor: " + str);
        }
        String strSubstring = str.substring(0, iM24057);
        C5499.m17102(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.className = DexSignUtil.getTypeName(strSubstring);
        String strSubstring2 = str.substring(iM24057 + 2, iM240572);
        C5499.m17102(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.name = strSubstring2;
        String strSubstring3 = str.substring(i, iM240573);
        C5499.m17102(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.paramTypeNames = DexSignUtil.getParamTypeNames(strSubstring3);
        String strSubstring4 = str.substring(iM240573 + 1);
        C5499.m17102(strSubstring4, "(this as java.lang.String).substring(startIndex)");
        this.returnTypeName = DexSignUtil.getTypeName(strSubstring4);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final DexMethod deserialize(@InterfaceC6399 String str) {
        return INSTANCE.deserialize(str);
    }

    public static /* synthetic */ Method getMethodInstance$default(DexMethod dexMethod, ClassLoader classLoader, Boolean bool, int i, Object obj) throws NoSuchMethodException {
        if ((i & 2) != 0) {
            bool = null;
        }
        return dexMethod.getMethodInstance(classLoader, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSign() {
        String str = "(" + C3888.m10923(this.paramTypeNames, "", null, null, 0, null, DexMethod$getSign$1$1.INSTANCE, 30, null) + ")" + DexSignUtil.getTypeSign(this.returnTypeName);
        C5499.m17102(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public boolean equals(@InterfaceC6489 Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DexMethod)) {
            return false;
        }
        DexMethod dexMethod = (DexMethod) other;
        return C5499.m17094(this.className, dexMethod.className) && C5499.m17094(this.name, dexMethod.name) && C5499.m17094(this.paramTypeNames, dexMethod.paramTypeNames) && C5499.m17094(this.returnTypeName, dexMethod.returnTypeName);
    }

    @InterfaceC6399
    public final String getClassName() {
        return this.className;
    }

    @InterfaceC6399
    public final Constructor<?> getConstructorInstance(@InterfaceC6399 ClassLoader classLoader) throws NoSuchMethodException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getConstructorInstance(classLoader, this);
    }

    @InterfaceC6399
    public final String getDeclaredClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final Method getMethodInstance(@InterfaceC6399 ClassLoader classLoader) throws NoSuchMethodException {
        C5499.m17103(classLoader, "classLoader");
        return getMethodInstance$default(this, classLoader, null, 2, null);
    }

    @InterfaceC6399
    public final String getMethodSign() {
        return (String) this.methodSign.getValue();
    }

    @InterfaceC6399
    public final String getName() {
        return this.name;
    }

    @InterfaceC6399
    public final List<String> getParamTypeNames() {
        return this.paramTypeNames;
    }

    @InterfaceC6399
    public final String getReturnTypeName() {
        return this.returnTypeName;
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + (this.name.hashCode() * 31) + (this.paramTypeNames.hashCode() * 31) + this.returnTypeName.hashCode();
    }

    public final boolean isConstructor() {
        return C5499.m17094(this.name, MethodDescription.CONSTRUCTOR_INTERNAL_NAME);
    }

    public final boolean isMethod() {
        return (isStaticInitializer() || isConstructor()) ? false : true;
    }

    public final boolean isStaticInitializer() {
        return C5499.m17094(this.name, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME);
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    @InterfaceC6399
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    @InterfaceC6399
    public String toString() {
        String str = DexSignUtil.getTypeSign(this.className) + "->" + this.name + getMethodSign();
        C5499.m17102(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final Method getMethodInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6489 Boolean isStatic) throws NoSuchMethodException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getMethodInstance(classLoader, this, isStatic);
    }

    public DexMethod(@InterfaceC6399 Method method) {
        C5499.m17103(method, "method");
        this.methodSign = C5689.m2370(new DexMethod$methodSign$2(this));
        Class<?> declaringClass = method.getDeclaringClass();
        C5499.m17102(declaringClass, "method.declaringClass");
        this.className = DexSignUtil.getTypeName(declaringClass);
        String name = method.getName();
        C5499.m17102(name, "method.name");
        this.name = name;
        Class<?>[] parameterTypes = method.getParameterTypes();
        C5499.m17102(parameterTypes, "method.parameterTypes");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            C5499.m17102(cls, "it");
            arrayList.add(DexSignUtil.getTypeName(cls));
        }
        this.paramTypeNames = arrayList;
        Class<?> returnType = method.getReturnType();
        C5499.m17102(returnType, "method.returnType");
        this.returnTypeName = DexSignUtil.getTypeName(returnType);
    }

    public DexMethod(@InterfaceC6399 Constructor<?> constructor) {
        C5499.m17103(constructor, "constructor");
        this.methodSign = C5689.m2370(new DexMethod$methodSign$2(this));
        String name = constructor.getDeclaringClass().getName();
        C5499.m17102(name, "constructor.declaringClass.name");
        this.className = name;
        this.name = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        C5499.m17102(parameterTypes, "constructor.parameterTypes");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            C5499.m17102(cls, "it");
            arrayList.add(DexSignUtil.getTypeName(cls));
        }
        this.paramTypeNames = arrayList;
        this.returnTypeName = "void";
    }
}
