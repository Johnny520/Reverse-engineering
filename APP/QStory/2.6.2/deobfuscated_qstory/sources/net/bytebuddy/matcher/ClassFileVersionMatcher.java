package net.bytebuddy.matcher;

import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class ClassFileVersionMatcher<T extends TypeDescription> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final boolean atMost;
    private final ClassFileVersion classFileVersion;

    public ClassFileVersionMatcher(ClassFileVersion classFileVersion, boolean z) {
        this.classFileVersion = classFileVersion;
        this.atMost = z;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        ClassFileVersion classFileVersion = t.getClassFileVersion();
        if (classFileVersion == null) {
            return false;
        }
        boolean z = this.atMost;
        ClassFileVersion classFileVersion2 = this.classFileVersion;
        return z ? classFileVersion.isAtMost(classFileVersion2) : classFileVersion.isAtLeast(classFileVersion2);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassFileVersionMatcher classFileVersionMatcher = (ClassFileVersionMatcher) obj;
        return this.atMost == classFileVersionMatcher.atMost && this.classFileVersion.equals(classFileVersionMatcher.classFileVersion);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return ((this.classFileVersion.hashCode() + (super.hashCode() * 31)) * 31) + (this.atMost ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("hasClassFileVersion(at ");
        sb.append(this.atMost ? "most" : "least");
        sb.append(" ");
        sb.append(this.classFileVersion);
        sb.append(")");
        return sb.toString();
    }
}
