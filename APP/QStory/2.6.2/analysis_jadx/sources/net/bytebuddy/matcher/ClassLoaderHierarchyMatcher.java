package net.bytebuddy.matcher;

import java.lang.ClassLoader;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        return this.matcher.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull T t) {
        while (true) {
            ElementMatcher<? super ClassLoader> elementMatcher = this.matcher;
            if (t == null) {
                return elementMatcher.matches(null);
            }
            if (elementMatcher.matches(t)) {
                return true;
            }
            t = (T) t.getParent();
        }
    }

    public String toString() {
        return "hasChild(" + this.matcher + ')';
    }
}
