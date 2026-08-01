// Decompiled by JEB v5.42.0.202606242140

package androidx.versionedparcelable;

import android.os.Parcelable;
import c.ᵢʼ.CLS320;
import java.lang.reflect.InvocationTargetException;

public abstract class VersionedParcel {
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable throwable0) {
            super(throwable0);
        }
    }

    public void MTH708(Parcelable parcelable0, int v) {
        this.MTH725(v);
        this.MTH709(parcelable0);
    }

    public abstract void MTH709(Parcelable arg1);

    public static Class MTH710(CLS320 ﾞⁱ0) {
        return VersionedParcel.MTH716(ﾞⁱ0.getClass());
    }

    public static CLS320 MTH711(String s, VersionedParcel versionedParcel0) {
        try {
            return (CLS320)Class.forName(s, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class).invoke(null, versionedParcel0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getCause() instanceof RuntimeException ? ((RuntimeException)invocationTargetException0.getCause()) : new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException0);
        }
    }

    public final void MTH712(CLS320 ﾞⁱ0) {
        Class class0;
        try {
            class0 = VersionedParcel.MTH716(ﾞⁱ0.getClass());
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException(ﾞⁱ0.getClass().getSimpleName() + " does not have a Parcelizer", classNotFoundException0);
        }
        this.MTH717(class0.getName());
    }

    public abstract Parcelable MTH713();

    public boolean MTH714() [...] // Inlined contents

    public Parcelable MTH715(Parcelable parcelable0, int v) {
        return this.MTH730(v) ? this.MTH713() : parcelable0;
    }

    public static Class MTH716(Class class0) {
        return Class.forName(String.format("%s.%sParcelizer", class0.getPackage().getName(), class0.getSimpleName()), false, class0.getClassLoader());
    }

    public abstract void MTH717(String arg1);

    public int MTH718(int v, int v1) {
        return this.MTH730(v1) ? this.MTH731() : v;
    }

    public abstract byte[] MTH719();

    public void MTH720(CLS320 ﾞⁱ0) {
        if(ﾞⁱ0 == null) {
            this.MTH717(null);
            return;
        }
        this.MTH712(ﾞⁱ0);
        VersionedParcel versionedParcel0 = this.MTH736();
        VersionedParcel.MTH726(ﾞⁱ0, versionedParcel0);
        versionedParcel0.MTH732();
    }

    public abstract String MTH721();

    public abstract void MTH722(int arg1);

    public abstract void MTH723(byte[] arg1);

    public void MTH724(byte[] arr_b, int v) {
        this.MTH725(v);
        this.MTH723(arr_b);
    }

    public abstract void MTH725(int arg1);

    public static void MTH726(CLS320 ﾞⁱ0, VersionedParcel versionedParcel0) {
        try {
            VersionedParcel.MTH710(ﾞⁱ0).getDeclaredMethod("write", ﾞⁱ0.getClass(), VersionedParcel.class).invoke(null, ﾞⁱ0, versionedParcel0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getCause() instanceof RuntimeException ? ((RuntimeException)invocationTargetException0.getCause()) : new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException0);
        }
    }

    public void MTH727(int v, int v1) {
        this.MTH725(v1);
        this.MTH722(v);
    }

    public void MTH728(boolean z, boolean z1) {
    }

    public String MTH729(String s, int v) {
        return this.MTH730(v) ? this.MTH721() : s;
    }

    public abstract boolean MTH730(int arg1);

    public abstract int MTH731();

    public abstract void MTH732();

    public CLS320 MTH733() {
        String s = this.MTH721();
        return s == null ? null : VersionedParcel.MTH711(s, this.MTH736());
    }

    public void MTH734(String s, int v) {
        this.MTH725(v);
        this.MTH717(s);
    }

    public byte[] MTH735(byte[] arr_b, int v) {
        return this.MTH730(v) ? this.MTH719() : arr_b;
    }

    public abstract VersionedParcel MTH736();
}

