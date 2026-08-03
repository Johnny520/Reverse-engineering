package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3619 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۤ$ۥ */
    @InterfaceC7113(33)
    public static class C0196 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T m670(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static <T> T[] m671(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> ArrayList<T> m9767(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends Serializable> T m9768(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <T> SparseArray<T> m9769(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static IBinder m668(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str) {
        return bundle.getBinder(str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> T m669(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C0196.m670(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @InterfaceC6490
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Parcelable[] m9762(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) C0196.m671(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @InterfaceC6490
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> ArrayList<T> m9763(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C0196.m9767(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T extends Serializable> T m9764(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C0196.m9768(bundle, str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <T> SparseArray<T> m9765(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C0196.m9769(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m9766(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6490 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
