package Yue;

import Yue.InterfaceC7144;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC8178 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f24290 = "VersionedParcel";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24291 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f24292 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f24293 = -3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f24294 = -4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f24295 = -5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f24296 = -6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f24297 = -7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f24298 = -9;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f24299 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f24300 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f24301 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f24302 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f24303 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f24304 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f24305 = 8;

    /* JADX INFO: renamed from: ۥ */
    public final C3394<String, Method> f3290;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C3394<String, Method> f3291;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C3394<String, Class> f24306;

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۡ$ۥ */
    public class C1451 extends ObjectInputStream {
        public C1451(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۡ$ۥ۟ */
    public static class C1452 extends RuntimeException {
        public C1452(Throwable th) {
            super(th);
        }
    }

    public AbstractC8178(C3394<String, Method> c3394, C3394<String, Method> c33942, C3394<String, Class> c33943) {
        this.f3290 = c3394;
        this.f3291 = c33942;
        this.f24306 = c33943;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Throwable m26979(@InterfaceC6391 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo4207();

    /* JADX INFO: renamed from: ۥ۟ */
    public final Exception m4208(int i, String str) {
        switch (i) {
            case f24298 /* -9 */:
                return (Exception) mo27024();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
            case f24297 /* -7 */:
                return new UnsupportedOperationException(str);
            case f24296 /* -6 */:
                return new NetworkOnMainThreadException();
            case f24295 /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract AbstractC8178 mo26980();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Class m26981(Class<? extends InterfaceC8181> cls) throws ClassNotFoundException {
        Class cls2 = this.f24306.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f24306.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Method m26982(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f3290.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC8178.class.getClassLoader()).getDeclaredMethod("read", AbstractC8178.class);
        this.f3290.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final <T> int m26983(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof InterfaceC8181) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Method m26984(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f3291.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM26981 = m26981(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM26981.getDeclaredMethod("write", cls, AbstractC8178.class);
        this.f3291.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo26985() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public <T> T[] m26986(T[] tArr) {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iMo27014);
        if (iMo27014 != 0) {
            int iMo270142 = mo27014();
            if (iMo27014 < 0) {
                return null;
            }
            if (iMo270142 == 1) {
                while (iMo27014 > 0) {
                    arrayList.add(m27035());
                    iMo27014--;
                }
            } else if (iMo270142 == 2) {
                while (iMo27014 > 0) {
                    arrayList.add(mo27024());
                    iMo27014--;
                }
            } else if (iMo270142 == 3) {
                while (iMo27014 > 0) {
                    arrayList.add(m27026());
                    iMo27014--;
                }
            } else if (iMo270142 == 4) {
                while (iMo27014 > 0) {
                    arrayList.add(mo27031());
                    iMo27014--;
                }
            } else if (iMo270142 == 5) {
                while (iMo27014 > 0) {
                    arrayList.add(mo27033());
                    iMo27014--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public <T> T[] m26987(T[] tArr, int i) {
        return !mo27008(i) ? tArr : (T[]) m26986(tArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract boolean mo26988();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m26989(boolean z, int i) {
        return !mo27008(i) ? z : mo26988();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean[] m26990() {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[iMo27014];
        for (int i = 0; i < iMo27014; i++) {
            zArr[i] = mo27014() != 0;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean[] m26991(boolean[] zArr, int i) {
        return !mo27008(i) ? zArr : m26990();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract Bundle mo26992();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Bundle m26993(Bundle bundle, int i) {
        return !mo27008(i) ? bundle : mo26992();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public byte m26994(byte b, int i) {
        return !mo27008(i) ? b : (byte) (mo27014() & 255);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract byte[] mo26995();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public byte[] m26996(byte[] bArr, int i) {
        return !mo27008(i) ? bArr : mo26995();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public char[] m26997(char[] cArr, int i) {
        if (!mo27008(i)) {
            return cArr;
        }
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        char[] cArr2 = new char[iMo27014];
        for (int i2 = 0; i2 < iMo27014; i2++) {
            cArr2[i2] = (char) mo27014();
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract CharSequence mo26998();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public CharSequence m26999(CharSequence charSequence, int i) {
        return !mo27008(i) ? charSequence : mo26998();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final <T, S extends Collection<T>> S m27000(S s) {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        if (iMo27014 != 0) {
            int iMo270142 = mo27014();
            if (iMo27014 < 0) {
                return null;
            }
            if (iMo270142 == 1) {
                while (iMo27014 > 0) {
                    s.add(m27035());
                    iMo27014--;
                }
            } else if (iMo270142 == 2) {
                while (iMo27014 > 0) {
                    s.add(mo27024());
                    iMo27014--;
                }
            } else if (iMo270142 == 3) {
                while (iMo27014 > 0) {
                    s.add(m27026());
                    iMo27014--;
                }
            } else if (iMo270142 == 4) {
                while (iMo27014 > 0) {
                    s.add(mo27031());
                    iMo27014--;
                }
            } else if (iMo270142 == 5) {
                while (iMo27014 > 0) {
                    s.add(mo27033());
                    iMo27014--;
                }
            }
        }
        return s;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract double mo27001();

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public double m27002(double d, int i) {
        return !mo27008(i) ? d : mo27001();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public double[] m27003() {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        double[] dArr = new double[iMo27014];
        for (int i = 0; i < iMo27014; i++) {
            dArr[i] = mo27001();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public double[] m27004(double[] dArr, int i) {
        return !mo27008(i) ? dArr : m27003();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Exception m27005(int i, String str) {
        return m4208(i, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Exception m27006(Exception exc, int i) {
        int iM27007;
        return (mo27008(i) && (iM27007 = m27007()) != 0) ? m27005(iM27007, mo27031()) : exc;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m27007() {
        return mo27014();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public abstract boolean mo27008(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public abstract float mo27009();

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float m27010(float f, int i) {
        return !mo27008(i) ? f : mo27009();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float[] m27011() {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        float[] fArr = new float[iMo27014];
        for (int i = 0; i < iMo27014; i++) {
            fArr[i] = mo27009();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float[] m27012(float[] fArr, int i) {
        return !mo27008(i) ? fArr : m27011();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public <T extends InterfaceC8181> T m27013(String str, AbstractC8178 abstractC8178) {
        try {
            return (T) m26982(str).invoke(null, abstractC8178);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public abstract int mo27014();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int m27015(int i, int i2) {
        return !mo27008(i2) ? i : mo27014();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int[] m27016() {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        int[] iArr = new int[iMo27014];
        for (int i = 0; i < iMo27014; i++) {
            iArr[i] = mo27014();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int[] m27017(int[] iArr, int i) {
        return !mo27008(i) ? iArr : m27016();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public <T> List<T> m27018(List<T> list, int i) {
        return !mo27008(i) ? list : (List) m27000(new ArrayList());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public abstract long mo27019();

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public long m27020(long j, int i) {
        return !mo27008(i) ? j : mo27019();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public long[] m27021() {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        long[] jArr = new long[iMo27014];
        for (int i = 0; i < iMo27014; i++) {
            jArr[i] = mo27019();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public long[] m27022(long[] jArr, int i) {
        return !mo27008(i) ? jArr : m27021();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Yue.ۥۣ۠ۨۧ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public <K, V> Map<K, V> m27023(Map<K, V> map, int i) {
        if (!mo27008(i)) {
            return map;
        }
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        C3394 c3394 = new C3394();
        if (iMo27014 == 0) {
            return c3394;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m27000(arrayList);
        m27000(arrayList2);
        for (int i2 = 0; i2 < iMo27014; i2++) {
            c3394.put(arrayList.get(i2), arrayList2.get(i2));
        }
        return c3394;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public abstract <T extends Parcelable> T mo27024();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public <T extends Parcelable> T m27025(T t, int i) {
        return !mo27008(i) ? t : (T) mo27024();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Serializable m27026() {
        String strMo27031 = mo27031();
        if (strMo27031 == null) {
            return null;
        }
        try {
            return (Serializable) new C1451(new ByteArrayInputStream(mo26995())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + strMo27031 + ")", e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + strMo27031 + ")", e2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public <T> Set<T> m27027(Set<T> set, int i) {
        return !mo27008(i) ? set : (Set) m27000(new C3399());
    }

    @InterfaceC7113(api = 21)
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Size m27028(Size size, int i) {
        if (!mo27008(i)) {
            return size;
        }
        if (mo26988()) {
            return new Size(mo27014(), mo27014());
        }
        return null;
    }

    @InterfaceC7113(api = 21)
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public SizeF m27029(SizeF sizeF, int i) {
        if (!mo27008(i)) {
            return sizeF;
        }
        if (mo26988()) {
            return new SizeF(mo27009(), mo27009());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public SparseBooleanArray m27030(SparseBooleanArray sparseBooleanArray, int i) {
        if (!mo27008(i)) {
            return sparseBooleanArray;
        }
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(iMo27014);
        for (int i2 = 0; i2 < iMo27014; i2++) {
            sparseBooleanArray2.put(mo27014(), mo26988());
        }
        return sparseBooleanArray2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public abstract String mo27031();

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public String m27032(String str, int i) {
        return !mo27008(i) ? str : mo27031();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public abstract IBinder mo27033();

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public IBinder m27034(IBinder iBinder, int i) {
        return !mo27008(i) ? iBinder : mo27033();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public <T extends InterfaceC8181> T m27035() {
        String strMo27031 = mo27031();
        if (strMo27031 == null) {
            return null;
        }
        return (T) m27013(strMo27031, mo26980());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public <T extends InterfaceC8181> T m27036(T t, int i) {
        return !mo27008(i) ? t : (T) m27035();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public abstract void mo27037(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void mo27038(boolean z, boolean z2) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public <T> void m27039(T[] tArr) {
        if (tArr == 0) {
            mo27066(-1);
            return;
        }
        int length = tArr.length;
        mo27066(length);
        if (length > 0) {
            int i = 0;
            int iM26983 = m26983(tArr[0]);
            mo27066(iM26983);
            if (iM26983 == 1) {
                while (i < length) {
                    m27092((InterfaceC8181) tArr[i]);
                    i++;
                }
                return;
            }
            if (iM26983 == 2) {
                while (i < length) {
                    mo27077((Parcelable) tArr[i]);
                    i++;
                }
                return;
            }
            if (iM26983 == 3) {
                while (i < length) {
                    m27079((Serializable) tArr[i]);
                    i++;
                }
            } else if (iM26983 == 4) {
                while (i < length) {
                    mo27085((String) tArr[i]);
                    i++;
                }
            } else {
                if (iM26983 != 5) {
                    return;
                }
                while (i < length) {
                    mo27087((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public <T> void m27040(T[] tArr, int i) {
        mo27037(i);
        m27039(tArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public abstract void mo27041(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m27042(boolean z, int i) {
        mo27037(i);
        mo27041(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m27043(boolean[] zArr) {
        if (zArr == null) {
            mo27066(-1);
            return;
        }
        mo27066(zArr.length);
        for (boolean z : zArr) {
            mo27066(z ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m27044(boolean[] zArr, int i) {
        mo27037(i);
        m27043(zArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public abstract void mo27045(Bundle bundle);

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public void m27046(Bundle bundle, int i) {
        mo27037(i);
        mo27045(bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public void m27047(byte b, int i) {
        mo27037(i);
        mo27066(b);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public abstract void mo27048(byte[] bArr);

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m27049(byte[] bArr, int i) {
        mo27037(i);
        mo27048(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public abstract void mo27050(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m27051(byte[] bArr, int i, int i2, int i3) {
        mo27037(i3);
        mo27050(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m27052(char[] cArr, int i) {
        mo27037(i);
        if (cArr == null) {
            mo27066(-1);
            return;
        }
        mo27066(cArr.length);
        for (char c : cArr) {
            mo27066(c);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public abstract void mo27053(CharSequence charSequence);

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m27054(CharSequence charSequence, int i) {
        mo27037(i);
        mo27053(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public final <T> void m27055(Collection<T> collection) {
        if (collection == null) {
            mo27066(-1);
        }
        int size = collection.size();
        mo27066(size);
        if (size > 0) {
            int iM26983 = m26983(collection.iterator().next());
            mo27066(iM26983);
            switch (iM26983) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        m27092((InterfaceC8181) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        mo27077((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        m27079((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        mo27085((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        mo27087((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        mo27066(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        mo27062(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final <T> void m27056(Collection<T> collection, int i) {
        mo27037(i);
        m27055(collection);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public abstract void mo27057(double d);

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m27058(double d, int i) {
        mo27037(i);
        mo27057(d);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m27059(double[] dArr) {
        if (dArr == null) {
            mo27066(-1);
            return;
        }
        mo27066(dArr.length);
        for (double d : dArr) {
            mo27057(d);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m27060(double[] dArr, int i) {
        mo27037(i);
        m27059(dArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Exception */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public void m27061(Exception exc, int i) {
        mo27037(i);
        if (exc == 0) {
            m27076();
            return;
        }
        int i2 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        mo27066(i2);
        if (i2 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        mo27085(exc.getMessage());
        if (i2 != -9) {
            return;
        }
        mo27077((Parcelable) exc);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public abstract void mo27062(float f);

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m27063(float f, int i) {
        mo27037(i);
        mo27062(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void m27064(float[] fArr) {
        if (fArr == null) {
            mo27066(-1);
            return;
        }
        mo27066(fArr.length);
        for (float f : fArr) {
            mo27062(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public void m27065(float[] fArr, int i) {
        mo27037(i);
        m27064(fArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public abstract void mo27066(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public void m27067(int i, int i2) {
        mo27037(i2);
        mo27066(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public void m27068(int[] iArr) {
        if (iArr == null) {
            mo27066(-1);
            return;
        }
        mo27066(iArr.length);
        for (int i : iArr) {
            mo27066(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public void m27069(int[] iArr, int i) {
        mo27037(i);
        m27068(iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public <T> void m27070(List<T> list, int i) {
        m27056(list, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public abstract void mo27071(long j);

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public void m27072(long j, int i) {
        mo27037(i);
        mo27071(j);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m27073(long[] jArr) {
        if (jArr == null) {
            mo27066(-1);
            return;
        }
        mo27066(jArr.length);
        for (long j : jArr) {
            mo27071(j);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m27074(long[] jArr, int i) {
        mo27037(i);
        m27073(jArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public <K, V> void m27075(Map<K, V> map, int i) {
        mo27037(i);
        if (map == null) {
            mo27066(-1);
            return;
        }
        int size = map.size();
        mo27066(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        m27055(arrayList);
        m27055(arrayList2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m27076() {
        mo27066(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public abstract void mo27077(Parcelable parcelable);

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public void m27078(Parcelable parcelable, int i) {
        mo27037(i);
        mo27077(parcelable);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final void m27079(Serializable serializable) {
        if (serializable == null) {
            mo27085(null);
            return;
        }
        String name = serializable.getClass().getName();
        mo27085(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            mo27048(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public void m27080(Serializable serializable, int i) {
        mo27037(i);
        m27079(serializable);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public <T> void m27081(Set<T> set, int i) {
        m27056(set, i);
    }

    @InterfaceC7113(api = 21)
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public void m27082(Size size, int i) {
        mo27037(i);
        mo27041(size != null);
        if (size != null) {
            mo27066(size.getWidth());
            mo27066(size.getHeight());
        }
    }

    @InterfaceC7113(api = 21)
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void m27083(SizeF sizeF, int i) {
        mo27037(i);
        mo27041(sizeF != null);
        if (sizeF != null) {
            mo27062(sizeF.getWidth());
            mo27062(sizeF.getHeight());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m27084(SparseBooleanArray sparseBooleanArray, int i) {
        mo27037(i);
        if (sparseBooleanArray == null) {
            mo27066(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        mo27066(size);
        for (int i2 = 0; i2 < size; i2++) {
            mo27066(sparseBooleanArray.keyAt(i2));
            mo27041(sparseBooleanArray.valueAt(i2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public abstract void mo27085(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public void m27086(String str, int i) {
        mo27037(i);
        mo27085(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public abstract void mo27087(IBinder iBinder);

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public void m27088(IBinder iBinder, int i) {
        mo27037(i);
        mo27087(iBinder);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public abstract void mo27089(IInterface iInterface);

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public void m27090(IInterface iInterface, int i) {
        mo27037(i);
        mo27089(iInterface);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public <T extends InterfaceC8181> void m27091(T t, AbstractC8178 abstractC8178) {
        try {
            m26984(t.getClass()).invoke(null, t, abstractC8178);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m27092(InterfaceC8181 interfaceC8181) {
        if (interfaceC8181 == null) {
            mo27085(null);
            return;
        }
        m27094(interfaceC8181);
        AbstractC8178 abstractC8178Mo26980 = mo26980();
        m27091(interfaceC8181, abstractC8178Mo26980);
        abstractC8178Mo26980.mo4207();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m27093(InterfaceC8181 interfaceC8181, int i) {
        mo27037(i);
        m27092(interfaceC8181);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣۢۦۡ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final void m27094(InterfaceC8181 interfaceC8181) {
        try {
            mo27085(m26981(interfaceC8181.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC8181.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }
}
