package net.bytebuddy.matcher;

import java.lang.ClassLoader;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class ClassLoaderHierarchyMatcher<T extends ClassLoader> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ElementMatcher<? super ClassLoader> matcher;

    public ClassLoaderHierarchyMatcher(ElementMatcher<? super ClassLoader> elementMatcher) {
        this.matcher = elementMatcher;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((ClassLoaderHierarchyMatcher) obj).matcher);
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.matcher.hashCode();
    }

    public String toString() {
        return "hasChild(" + this.matcher + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: matches(Ljava/lang/Object;)Z */
    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull T t) {
        while (t != null) {
            if (this.matcher.matches(t)) {
                return true;
            }
            t = (T) t.getParent();
        }
        return this.matcher.matches(null);
    }
}
