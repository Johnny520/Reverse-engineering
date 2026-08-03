package net.bytebuddy.matcher;

import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

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
        return (((super.hashCode() * 31) + this.classFileVersion.hashCode()) * 31) + (this.atMost ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("hasClassFileVersion(at ");
        sb.append(this.atMost ? "most" : "least");
        sb.append(" ");
        sb.append(this.classFileVersion);
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: doMatch(Ljava/lang/Object;)Z */
    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        ClassFileVersion classFileVersion = t.getClassFileVersion();
        return classFileVersion != null && (!this.atMost ? !classFileVersion.isAtLeast(this.classFileVersion) : !classFileVersion.isAtMost(this.classFileVersion));
    }
}
