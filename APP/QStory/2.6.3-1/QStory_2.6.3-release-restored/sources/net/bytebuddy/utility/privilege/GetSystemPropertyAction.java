package net.bytebuddy.utility.privilege;

import java.security.PrivilegedAction;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
