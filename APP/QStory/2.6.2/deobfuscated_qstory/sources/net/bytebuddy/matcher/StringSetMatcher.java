package net.bytebuddy.matcher;

import java.util.Set;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class StringSetMatcher extends ElementMatcher.Junction.ForNonNullValues<String> {
    private final Set<String> values;

    public StringSetMatcher(Set<String> set) {
        this.values = set;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.values.equals(((StringSetMatcher) obj).values);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return this.values.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("in(");
        boolean z = true;
        for (String str : this.values) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(String str) {
        return this.values.contains(str);
    }
}
