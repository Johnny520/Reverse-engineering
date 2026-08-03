package Yue;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6605 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۦۦ$ۥ */
    @InterfaceC7113(29)
    public static class C1028 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T extends Parcelable> List<T> m3069(@InterfaceC6391 Parcel parcel, @InterfaceC6391 List<T> list, @InterfaceC6490 ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۦۦ$ۥ۟ */
    @InterfaceC7113(30)
    public static class C1029 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Parcelable.Creator<?> m3070(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۦۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C6606 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T[] m3071(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static <T> ArrayList<T> m3072(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <V, K> HashMap<K, V> m20959(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T> void m20960(@InterfaceC6391 Parcel parcel, @InterfaceC6391 List<? super T> list, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <K, V> void m20961(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static <T extends Parcelable> T m20962(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static <T> T[] m20963(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static <T> Parcelable.Creator<T> m20964(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static <T> List<T> m20965(@InterfaceC6391 Parcel parcel, @InterfaceC6391 List<T> list, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static <T extends Serializable> T m20966(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static <T> SparseArray<T> m20967(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    @InterfaceC6490
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ */
    public static <T> Object[] m3067(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C6606.m3071(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @InterfaceC6490
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> ArrayList<T> m3068(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C6606.m3072(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m20947(@InterfaceC6391 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @InterfaceC6490
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <K, V> HashMap<K, V> m20948(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<? extends K> cls, @InterfaceC6391 Class<? extends V> cls2) {
        return Build.VERSION.SDK_INT >= 34 ? C6606.m20959(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T> void m20949(@InterfaceC6391 Parcel parcel, @InterfaceC6391 List<? super T> list, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            C6606.m20960(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <K, V> void m20950(@InterfaceC6391 Parcel parcel, @InterfaceC6391 Map<? super K, ? super V> map, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<K> cls, @InterfaceC6391 Class<V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            C6606.m20961(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static <T extends Parcelable> T m20951(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C6606.m20962(parcel, classLoader, cls);
        }
        T t = (T) parcel.readParcelable(classLoader);
        if (t == null || cls.isInstance(t)) {
            return t;
        }
        throw new BadParcelableException("Parcelable " + t.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: android.os.Parcelable[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6490
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <T> T[] m20952(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) C6606.m20963(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i = 0; i < tArr.length; i++) {
            try {
                tArr2[i] = cls.cast(tArr[i]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    @InterfaceC6490
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static <T> Parcelable[] m20953(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) C6606.m20963(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @InterfaceC6490
    @InterfaceC7113(30)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <T> Parcelable.Creator<T> m20954(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C6606.m20964(parcel, classLoader, cls) : (Parcelable.Creator<T>) C1029.m3070(parcel, classLoader);
    }

    @InterfaceC6391
    @InterfaceC7113(api = 29)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> List<T> m20955(@InterfaceC6391 Parcel parcel, @InterfaceC6391 List<T> list, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C6606.m20965(parcel, list, classLoader, cls) : C1028.m3069(parcel, list, classLoader);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static <T extends Serializable> T m20956(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) C6606.m20966(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static <T> SparseArray<T> m20957(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C6606.m20967(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m20958(@InterfaceC6391 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
