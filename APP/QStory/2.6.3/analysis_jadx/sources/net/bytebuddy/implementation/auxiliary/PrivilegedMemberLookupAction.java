package net.bytebuddy.implementation.auxiliary;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.FieldAccessor;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.RandomString;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum PrivilegedMemberLookupAction implements AuxiliaryType {
    FOR_PUBLIC_METHOD("getMethod", "name", String.class, "parameters", Class[].class),
    FOR_DECLARED_METHOD("getDeclaredMethod", "name", String.class, "parameters", Class[].class),
    FOR_PUBLIC_CONSTRUCTOR("getConstructor", "parameters", Class[].class),
    FOR_DECLARED_CONSTRUCTOR(TypeProxy.SilentConstruction.Appender.GET_DECLARED_CONSTRUCTOR_METHOD_NAME, "parameters", Class[].class);

    private static final MethodDescription.InDefinedShape DEFAULT_CONSTRUCTOR = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(Object.class).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();
    private static final String TYPE_FIELD = "type";
    private final Map<String, Class<?>> fields;
    private final MethodDescription.InDefinedShape methodDescription;

    PrivilegedMemberLookupAction(String str, String str2, Class cls, String str3, Class cls2) {
        try {
            this.methodDescription = new MethodDescription.ForLoadedMethod(Class.class.getMethod(str, cls, cls2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.fields = linkedHashMap;
            linkedHashMap.put(str2, cls);
            linkedHashMap.put(str3, cls2);
        } catch (NoSuchMethodException e) {
            C8791.m14473(AbstractC0053.m157("Could not locate method: ", str), e);
            throw null;
        }
    }

    public static AuxiliaryType of(MethodDescription methodDescription) {
        if (methodDescription.isConstructor()) {
            return methodDescription.isPublic() ? FOR_PUBLIC_CONSTRUCTOR : FOR_DECLARED_CONSTRUCTOR;
        }
        if (methodDescription.isMethod()) {
            return methodDescription.isPublic() ? FOR_PUBLIC_METHOD : FOR_DECLARED_METHOD;
        }
        C5925.m11311(AbstractC2442.m4573("Cannot load constant for type initializer: ", methodDescription));
        return null;
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public String getSuffix() {
        return RandomString.hashOf(name().hashCode());
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        Implementation.Composable composableAndThen = MethodCall.invoke(DEFAULT_CONSTRUCTOR).andThen(FieldAccessor.ofField(TYPE_FIELD).setsArgumentAt(0));
        Iterator<String> it = this.fields.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            composableAndThen = composableAndThen.andThen(FieldAccessor.ofField(it.next()).setsArgumentAt(i));
            i++;
        }
        DynamicType.Builder builderDefineField = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).subclass(PrivilegedExceptionAction.class, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(AuxiliaryType.DEFAULT_TYPE_MODIFIER).defineConstructor(Visibility.PUBLIC).withParameters(CompoundList.of(Class.class, new ArrayList(this.fields.values()))).intercept(composableAndThen).method(ElementMatchers.named("run")).intercept(MethodCall.invoke(this.methodDescription).onField(TYPE_FIELD).withField((String[]) this.fields.keySet().toArray(new String[0]))).defineField(TYPE_FIELD, Class.class, Visibility.PRIVATE);
        for (Map.Entry<String, Class<?>> entry : this.fields.entrySet()) {
            builderDefineField = builderDefineField.defineField(entry.getKey(), entry.getValue(), Visibility.PRIVATE);
        }
        return builderDefineField.make();
    }

    PrivilegedMemberLookupAction(String str, String str2, Class cls) {
        try {
            this.methodDescription = new MethodDescription.ForLoadedMethod(Class.class.getMethod(str, cls));
            this.fields = Collections.singletonMap(str2, cls);
        } catch (NoSuchMethodException e) {
            C8791.m14473(AbstractC0053.m157("Could not locate method: ", str), e);
            throw null;
        }
    }
}
