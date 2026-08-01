package net.bytebuddy.utility;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
