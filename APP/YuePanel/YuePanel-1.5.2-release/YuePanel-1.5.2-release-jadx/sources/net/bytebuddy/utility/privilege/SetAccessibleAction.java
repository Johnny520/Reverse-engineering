package net.bytebuddy.utility.privilege;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class SetAccessibleAction<T extends AccessibleObject> implements PrivilegedAction<T> {
    private final T accessibleObject;

    public SetAccessibleAction(T t) {
        this.accessibleObject = t;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.accessibleObject.equals(((SetAccessibleAction) obj).accessibleObject);
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.accessibleObject.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
    @Override // java.security.PrivilegedAction
    public T run() {
        this.accessibleObject.setAccessible(true);
        return this.accessibleObject;
    }
}
