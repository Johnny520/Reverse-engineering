package net.bytebuddy.matcher;

import java.lang.ClassLoader;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class ClassLoaderParentMatcher<T extends ClassLoader> extends ElementMatcher.Junction.AbstractBase<T> {

    @MaybeNull
    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final ClassLoader classLoader;

    public ClassLoaderParentMatcher(@MaybeNull ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassLoader classLoader = this.classLoader;
        ClassLoader classLoader2 = ((ClassLoaderParentMatcher) obj).classLoader;
        if (classLoader2 != null) {
            return classLoader != null && classLoader.equals(classLoader2);
        }
        if (classLoader != null) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode() * 31;
        ClassLoader classLoader = this.classLoader;
        return classLoader != null ? classLoader.hashCode() + iHashCode : iHashCode;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull T t) {
        for (ClassLoader parent = this.classLoader; parent != null; parent = parent.getParent()) {
            if (parent == t) {
                return true;
            }
        }
        return t == null;
    }

    public String toString() {
        return "isParentOf(" + this.classLoader + ')';
    }
}
