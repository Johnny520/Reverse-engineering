package net.bytebuddy.utility.privilege;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.Arrays;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class GetMethodAction implements PrivilegedAction<Method> {
    private final String name;
    private final Class<?>[] parameter;
    private final String type;

    public GetMethodAction(String str, String str2, Class<?>... clsArr) {
        this.type = str;
        this.name = str2;
        this.parameter = clsArr;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetMethodAction getMethodAction = (GetMethodAction) obj;
        return this.type.equals(getMethodAction.type) && this.name.equals(getMethodAction.name) && Arrays.equals(this.parameter, getMethodAction.parameter);
    }

    public int hashCode() {
        return AbstractC6136.m11539(AbstractC6136.m11539(getClass().hashCode() * 31, 31, this.type), 31, this.name) + Arrays.hashCode(this.parameter);
    }

    @Override // java.security.PrivilegedAction
    @MaybeNull
    public Method run() {
        try {
            return Class.forName(this.type).getMethod(this.name, this.parameter);
        } catch (Exception unused) {
            return null;
        }
    }
}
