package net.bytebuddy.matcher;

import androidx.profileinstaller.AbstractC2442;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class MethodOverrideMatcher<T extends MethodDescription> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final ElementMatcher<? super TypeDescription.Generic> matcher;

    public MethodOverrideMatcher(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        this.matcher = elementMatcher;
    }

    private boolean matches(MethodDescription methodDescription, TypeDefinition typeDefinition) {
        Iterator<T> it = typeDefinition.getDeclaredMethods().filter(ElementMatchers.isVirtual()).iterator();
        while (it.hasNext()) {
            if (((MethodDescription) it.next()).asSignatureToken().equals(methodDescription.asSignatureToken())) {
                return this.matcher.matches(typeDefinition.asGenericType());
            }
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        HashSet hashSet = new HashSet();
        for (TypeDefinition typeDefinition : t.getDeclaringType()) {
            if (matches(t, typeDefinition) || matches(t, typeDefinition.getInterfaces(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((MethodOverrideMatcher) obj).matcher);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return this.matcher.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2442.m4574(new StringBuilder("isOverriddenFrom("), this.matcher, ")");
    }

    private boolean matches(MethodDescription methodDescription, List<? extends TypeDefinition> list, Set<TypeDescription> set) {
        for (TypeDefinition typeDefinition : list) {
            if (set.add(typeDefinition.asErasure()) && (matches(methodDescription, typeDefinition) || matches(methodDescription, typeDefinition.getInterfaces(), set))) {
                return true;
            }
        }
        return false;
    }
}
