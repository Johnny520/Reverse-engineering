package net.bytebuddy.utility;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum TypeComparator implements Comparator<Class<?>> {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(Class<?> cls, Class<?> cls2) {
        if (cls == cls2) {
            return 0;
        }
        return cls.getName().compareTo(cls2.getName());
    }
}
