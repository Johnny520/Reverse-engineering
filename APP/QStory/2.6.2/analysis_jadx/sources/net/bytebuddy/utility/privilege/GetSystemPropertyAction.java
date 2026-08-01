package net.bytebuddy.utility.privilege;

import java.security.PrivilegedAction;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class GetSystemPropertyAction implements PrivilegedAction<String> {
    private final String key;

    public GetSystemPropertyAction(String str) {
        this.key = str;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.key.equals(((GetSystemPropertyAction) obj).key);
    }

    public int hashCode() {
        return this.key.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // java.security.PrivilegedAction
    public String run() {
        return System.getProperty(this.key);
    }
}
