package net.bytebuddy.utility;

import java.lang.reflect.Constructor;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ConstructorComparator implements Comparator<Constructor<?>> {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(Constructor<?> constructor, Constructor<?> constructor2) {
        if (constructor == constructor2) {
            return 0;
        }
        int iCompareTo = constructor.getName().compareTo(constructor2.getName());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
        if (parameterTypes.length < parameterTypes2.length) {
            return -1;
        }
        if (parameterTypes.length > parameterTypes2.length) {
            return 1;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            int iCompareTo2 = parameterTypes[i].getName().compareTo(parameterTypes2[i].getName());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return 0;
    }
}
