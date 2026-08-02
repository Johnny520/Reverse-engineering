package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bi0 implements SharedPreferences, SharedPreferences.Editor {
    public static final byte[] x = new byte[0];
    public static final int[] y = {0, 1, 4, 4, 8, 8};
    public static final int z;
    public final String a;
    public final String b;
    public final HashMap c;
    public int d;
    public long e;
    public e9 h;
    public int i;
    public int j;
    public int m;
    public FileChannel q;
    public FileChannel r;
    public MappedByteBuffer s;
    public MappedByteBuffer t;
    public int u;
    public int v;
    public final HashMap f = new HashMap();
    public volatile boolean g = false;
    public final ArrayList k = new ArrayList();
    public final ra1 l = new ra1();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final Handler p = new Handler(Looper.getMainLooper());
    public boolean w = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iIntValue;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            iIntValue = ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            iIntValue = 16384;
        }
        z = iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bi0(String str, String str2, ov2[] ov2VarArr, int i) {
        int i2 = 1;
        this.a = str;
        this.b = str2;
        this.v = i;
        HashMap map = new HashMap();
        if (ov2VarArr != null) {
            for (ov2 ov2Var : ov2VarArr) {
                ov2Var.getClass();
                if (map.containsKey("StringSet")) {
                    s11.I(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", ov2Var);
                }
            }
        }
        map.put("StringSet", ov2.a);
        this.c = map;
        synchronized (this.f) {
            ci0.J().execute(new zh0(this, i2));
            if (!this.g) {
                try {
                    this.f.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(String str) {
        if (str == null || str.isEmpty()) {
            s.j("key is empty");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str, Object obj, byte[] bArr, yz yzVar, byte b) {
        if (yzVar == null) {
            int iN = n(str, bArr, b);
            if (iN > 0) {
                int length = bArr.length;
                int i = this.i;
                this.f.put(str, b == 6 ? new xz(i, iN, (String) obj, length, false) : b == 7 ? new pz(i, iN, obj, length, false) : new wz(i, iN, obj, length, false));
                k();
                return;
            }
            return;
        }
        if (!yzVar.e && yzVar.d == bArr.length) {
            int i2 = yzVar.a;
            int length2 = bArr.length;
            this.e ^= this.h.f(i2, length2);
            e9 e9Var = this.h;
            e9Var.i = i2;
            e9Var.o(bArr);
            long jF = this.e ^ this.h.f(i2, length2);
            this.e = jF;
            if (this.v == 0) {
                this.s.putInt(0, -1);
                this.s.putLong(4, this.e);
                this.s.position(i2);
                this.s.put(bArr);
                this.s.putInt(0, this.d - 12);
                this.t.putLong(4, this.e);
                this.t.position(i2);
                this.t.put(bArr);
            } else {
                this.h.r(jF, 4);
            }
            yzVar.b = obj;
            return;
        }
        int iN2 = n(str, bArr, yzVar.a());
        if (iN2 > 0) {
            String str2 = yzVar.e ? (String) yzVar.b : null;
            h(yzVar.a(), yzVar.c, yzVar.a + yzVar.d);
            yzVar.c = this.i;
            yzVar.a = iN2;
            yzVar.e = false;
            yzVar.b = obj;
            yzVar.d = bArr.length;
            k();
            if (this.m >= 8192 || this.n.size() >= 100) {
                tp0.t(this, 0);
            }
            if (str2 != null) {
                if (this.v == 0) {
                    ci0.J().execute(new t7(2, this, str2));
                } else {
                    this.k.add(str2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.w = true;
        c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        int i = this.v;
        if (i == 1) {
            this.l.execute(new zh0(this, 0));
            return true;
        }
        if (i == 2) {
            return te.t0(this);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            te.q(this);
            if (this.v != 0) {
                te.v(this);
            }
            f(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.w = true;
        return c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Object d(String str) {
        qz qzVar = (qz) this.f.get(str);
        if (qzVar != null && qzVar.a() == 8) {
            wz wzVar = (wz) qzVar;
            if (!wzVar.e) {
                return wzVar.b;
            }
            LinkedHashSet linkedHashSetH = te.H(this, wzVar);
            if (linkedHashSetH == null) {
                remove(str);
                return null;
            }
            wzVar.b = linkedHashSetH;
            wzVar.e = false;
            return linkedHashSetH;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(String str) {
        if (this.v != 0 && this.w) {
            c();
        }
        f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void f(String str) {
        if (this.o.isEmpty()) {
            return;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            this.p.post(new lb(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 6));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void g(String str, Object obj, ov2 ov2Var) throws Throwable {
        bi0 bi0Var;
        Throwable th;
        byte[] bArrB;
        try {
            try {
                b(str);
                if (ov2Var == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.c.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    qz qzVar = null;
                    try {
                        try {
                            bArrB = ov2.b(obj);
                        } catch (Throwable th2) {
                            bi0Var = this;
                            th = th2;
                        }
                    } catch (Exception e) {
                        Log.e("FastKV", this.b, e);
                        bArrB = null;
                    }
                    if (bArrB == null) {
                        remove(str);
                        return;
                    }
                    qz qzVar2 = (qz) this.f.get(str);
                    if (qzVar2 == null || qzVar2.a() == 8) {
                        qzVar = qzVar2;
                    } else {
                        remove(str);
                    }
                    wz wzVar = (wz) qzVar;
                    int iL = e9.l("StringSet");
                    e9 e9Var = new e9(iL + 1 + bArrB.length, 3);
                    byte b = (byte) iL;
                    byte[] bArr = (byte[]) e9Var.k;
                    e9Var.i = 1;
                    bArr[0] = b;
                    e9Var.s("StringSet");
                    e9Var.o(bArrB);
                    byte[] bArr2 = (byte[]) e9Var.k;
                    if (bArr2 == null) {
                        return;
                    }
                    a(str, obj, bArr2, wzVar, (byte) 8);
                    e(str);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    bi0Var = this;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            bi0Var = this;
        }
        th = th;
        throw th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0028 A[SYNTHETIC] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Map getAll() {
        Object objK;
        int size = this.f.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f.entrySet()) {
            String str = (String) entry.getKey();
            qz qzVar = (qz) entry.getValue();
            Object objValueOf = null;
            switch (qzVar.a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((rz) qzVar).b);
                    if (objValueOf == null) {
                        map.put(str, objValueOf);
                    }
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((uz) qzVar).b);
                    if (objValueOf == null) {
                    }
                    break;
                case 3:
                    objValueOf = Float.valueOf(((tz) qzVar).b);
                    if (objValueOf == null) {
                    }
                    break;
                case 4:
                    objValueOf = Long.valueOf(((vz) qzVar).b);
                    if (objValueOf == null) {
                    }
                    break;
                case 5:
                    objValueOf = Double.valueOf(((sz) qzVar).b);
                    if (objValueOf == null) {
                    }
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    xz xzVar = (xz) qzVar;
                    objK = xzVar.e ? te.K(this, xzVar) : xzVar.b;
                    objValueOf = objK;
                    if (objValueOf == null) {
                    }
                    break;
                case 7:
                    pz pzVar = (pz) qzVar;
                    if (pzVar.e) {
                        String str2 = this.b;
                        try {
                            objK = hg3.e(new File(this.a + str2, (String) pzVar.b));
                            if (objK != null) {
                            }
                        } catch (Exception e) {
                            Log.e("FastKV", str2, e);
                        }
                        if (objValueOf == null) {
                        }
                    } else {
                        objK = pzVar.b;
                    }
                    objValueOf = objK;
                    if (objValueOf == null) {
                    }
                    break;
                case 8:
                    wz wzVar = (wz) qzVar;
                    objK = wzVar.e ? te.H(this, wzVar) : ((wz) qzVar).b;
                    objValueOf = objK;
                    if (objValueOf == null) {
                    }
                    break;
                default:
                    if (objValueOf == null) {
                    }
                    break;
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized boolean getBoolean(String str, boolean z2) {
        qz qzVar = (qz) this.f.get(str);
        if (qzVar != null) {
            z2 = qzVar.b();
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        qz qzVar = (qz) this.f.get(str);
        if (qzVar != null) {
            f = qzVar.c();
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        qz qzVar = (qz) this.f.get(str);
        if (qzVar != null) {
            i = qzVar.d();
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        qz qzVar = (qz) this.f.get(str);
        if (qzVar != null) {
            j = qzVar.e();
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        qz qzVar = (qz) this.f.get(str);
        if (qzVar == null) {
            return str2;
        }
        if (qzVar.a() == 6) {
            xz xzVar = (xz) qzVar;
            if (xzVar.e) {
                String strK = te.K(this, xzVar);
                if (strK != null && !strK.isEmpty()) {
                    xzVar.b = strK;
                    xzVar.e = false;
                    return strK;
                }
                remove(str);
                return str2;
            }
        }
        return qzVar.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) d(str);
        }
        return set2 != null ? set2 : set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(byte b, int i, int i2) {
        this.m = (i2 - i) + this.m;
        nm2 nm2Var = new nm2();
        nm2Var.h = i;
        nm2Var.i = i2;
        this.n.add(nm2Var);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.h.k;
        this.e = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.e;
        bArr[i] = b2;
        this.u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.e);
        int i = this.u;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.h.k)[i]);
        }
        if (this.j != 0) {
            mappedByteBuffer.position(this.i);
            mappedByteBuffer.put((byte[]) this.h.k, this.i, this.j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(byte b, int i) {
        long jF0 = this.e ^ te.f0(1L, i);
        this.e = jF0;
        if (this.v == 0) {
            this.s.putLong(4, jF0);
            this.s.put(i, b);
            this.t.putLong(4, this.e);
            this.t.put(i, b);
        } else {
            this.h.r(jF0, 4);
        }
        ((byte[]) this.h.k)[i] = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        this.e ^= this.h.f(this.i, this.j);
        int i = this.d - 12;
        if (this.v == 0) {
            this.s.putInt(0, -1);
            i(this.s);
            this.s.putInt(0, i);
            this.t.putInt(0, i);
            i(this.t);
        } else {
            this.h.q(0, i);
            this.h.r(this.e, 4);
        }
        this.u = 0;
        this.j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, int i2, long j) {
        long jF0 = te.f0(j, i2) ^ this.e;
        this.e = jF0;
        if (this.v == 0) {
            this.s.putLong(4, jF0);
            this.s.putInt(i2, i);
            this.t.putLong(4, this.e);
            this.t.putInt(i2, i);
        } else {
            this.h.r(jF0, 4);
        }
        this.h.q(i2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i, long j, long j2) {
        long jF0 = te.f0(j2, i) ^ this.e;
        this.e = jF0;
        if (this.v == 0) {
            this.s.putLong(4, jF0);
            this.s.putLong(i, j);
            this.t.putLong(4, this.e);
            this.t.putLong(i, j);
        } else {
            this.h.r(jF0, 4);
        }
        this.h.r(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int n(String str, byte[] bArr, byte b) {
        boolean z2 = bArr.length >= 65535;
        if (z2) {
            if (b == 6) {
                b = 9;
            } else if (b == 7) {
                b = 10;
            } else if (b == 8) {
                b = 11;
            }
        }
        o(str, b, (z2 ? 4 : 2) + bArr.length);
        e9 e9Var = this.h;
        if (z2) {
            e9Var.p(bArr.length);
        } else {
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) e9Var.k;
            int i = e9Var.i;
            int i2 = i + 1;
            e9Var.i = i2;
            bArr2[i] = (byte) length;
            e9Var.i = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        e9 e9Var2 = this.h;
        int i3 = e9Var2.i;
        e9Var2.o(bArr);
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(String str, byte b, int i) {
        int iL = e9.l(str);
        if (iL > 255) {
            s.j("key's length must less than 256");
            return;
        }
        int i2 = iL + 2 + i;
        this.j = i2;
        int length = ((byte[]) this.h.k).length;
        int i3 = this.d + i2;
        if (i3 >= length) {
            int i4 = this.m;
            if (i4 <= i2 || i4 <= 8192) {
                int iG = te.G(length, i3);
                byte[] bArr = new byte[iG];
                System.arraycopy((byte[]) this.h.k, 0, bArr, 0, this.d);
                this.h.k = bArr;
                if (this.v == 0) {
                    MappedByteBuffer mappedByteBufferA0 = te.a0(this.q, iG);
                    MappedByteBuffer mappedByteBufferA02 = te.a0(this.r, iG);
                    if (mappedByteBufferA0 == null || mappedByteBufferA02 == null) {
                        Log.e("FastKV", this.b, new Exception("map failed"));
                        this.h.q(0, this.d - 12);
                        this.h.r(this.e, 4);
                        te.k0(this);
                    } else {
                        this.s = mappedByteBufferA0;
                        this.t = mappedByteBufferA02;
                    }
                }
            } else {
                tp0.t(this, i2);
            }
        }
        int i5 = this.d;
        this.i = i5;
        this.d = this.j + i5;
        e9 e9Var = this.h;
        byte[] bArr2 = (byte[]) e9Var.k;
        int i6 = i5 + 1;
        e9Var.i = i6;
        bArr2[i5] = b;
        e9Var.i = i5 + 2;
        bArr2[i6] = (byte) iL;
        int length2 = str.length();
        e9 e9Var2 = this.h;
        if (iL != length2) {
            e9Var2.s(str);
            return;
        }
        str.getBytes(0, iL, (byte[]) e9Var2.k, e9Var2.i);
        this.h.i += iL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z2) {
        try {
            b(str);
            qz qzVar = (qz) this.f.get(str);
            if (qzVar != null && qzVar.a() != 1) {
                remove(str);
                qzVar = null;
            }
            rz rzVar = (rz) qzVar;
            if (rzVar == null) {
                o(str, (byte) 1, y[1]);
                e9 e9Var = this.h;
                int i = e9Var.i;
                byte b = z2 ? (byte) 1 : (byte) 0;
                byte[] bArr = (byte[]) e9Var.k;
                e9Var.i = i + 1;
                bArr[i] = b;
                k();
                this.f.put(str, new rz(i, z2));
                e(str);
            } else if (rzVar.b != z2) {
                rzVar.b = z2;
                j(z2 ? (byte) 1 : (byte) 0, rzVar.a);
                e(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            b(str);
            qz qzVar = (qz) this.f.get(str);
            if (qzVar != null && qzVar.a() != 3) {
                remove(str);
                qzVar = null;
            }
            tz tzVar = (tz) qzVar;
            if (tzVar == null) {
                o(str, (byte) 3, y[3]);
                e9 e9Var = this.h;
                int i = e9Var.i;
                e9Var.p(Float.floatToRawIntBits(f));
                k();
                this.f.put(str, new tz(f, i));
                e(str);
            } else if (tzVar.b != f) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                e9 e9Var2 = this.h;
                int i2 = tzVar.a;
                byte[] bArr = (byte[]) e9Var2.k;
                long j = ((long) (((bArr[i2 + 3] << 24) | ((((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255)) | ((bArr[i2 + 2] & 255) << 16))) ^ iFloatToRawIntBits)) & 4294967295L;
                tzVar.b = f;
                l(iFloatToRawIntBits, i2, j);
                e(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            b(str);
            qz qzVar = (qz) this.f.get(str);
            if (qzVar != null && qzVar.a() != 2) {
                remove(str);
                qzVar = null;
            }
            uz uzVar = (uz) qzVar;
            if (uzVar == null) {
                o(str, (byte) 2, y[2]);
                e9 e9Var = this.h;
                int i2 = e9Var.i;
                e9Var.p(i);
                k();
                this.f.put(str, new uz(i2, i));
                e(str);
            } else {
                int i3 = uzVar.b;
                if (i3 != i) {
                    uzVar.b = i;
                    l(i, uzVar.a, ((long) (i3 ^ i)) & 4294967295L);
                    e(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j) throws Throwable {
        Throwable th;
        bi0 bi0Var;
        bi0 bi0Var2;
        try {
            try {
                b(str);
                qz qzVar = (qz) this.f.get(str);
                if (qzVar != null) {
                    try {
                        if (qzVar.a() != 4) {
                            remove(str);
                            qzVar = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bi0Var = this;
                        throw th;
                    }
                }
                vz vzVar = (vz) qzVar;
                if (vzVar != null) {
                    long j2 = vzVar.b;
                    if (j2 != j) {
                        long j3 = j ^ j2;
                        vzVar.b = j;
                        bi0Var2 = this;
                        bi0Var2.m(vzVar.a, j, j3);
                        bi0Var2.e(str);
                    }
                    return bi0Var2;
                }
                o(str, (byte) 4, y[4]);
                e9 e9Var = this.h;
                int i = e9Var.i;
                e9Var.r(j, i);
                e9Var.i += 8;
                k();
                this.f.put(str, new vz(j, i));
                e(str);
                bi0Var2 = this;
                return bi0Var2;
            } catch (Throwable th3) {
                th = th3;
                bi0Var = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) throws Throwable {
        bi0 bi0Var;
        Throwable th;
        bi0 bi0Var2;
        try {
            try {
                b(str);
                try {
                } catch (Throwable th2) {
                    th = th2;
                    bi0Var = this;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            bi0Var = this;
        }
        if (str2 != null) {
            qz qzVar = (qz) this.f.get(str);
            if (qzVar != null && qzVar.a() != 6) {
                remove(str);
                qzVar = null;
            }
            xz xzVar = (xz) qzVar;
            if (xzVar != null && !xzVar.e && str2.equals(xzVar.b)) {
                return this;
            }
            byte[] bytes = str2.isEmpty() ? x : str2.getBytes(StandardCharsets.UTF_8);
            if (bytes == null) {
                Log.e("FastKV", this.b, new Exception("Encrypt failed"));
                return this;
            }
            bi0Var2 = this;
            bi0Var2.a(str, str2, bytes, xzVar, (byte) 6);
            bi0Var2.e(str);
            th = th;
            throw th;
        }
        remove(str);
        bi0Var2 = this;
        return bi0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                g(str, set, ov2.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.o.contains(onSharedPreferenceChangeListener)) {
            this.o.add(onSharedPreferenceChangeListener);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            qz qzVar = (qz) this.f.get(str);
            if (qzVar != null) {
                this.f.remove(str);
                byte bA = qzVar.a();
                int i = 2;
                String str2 = null;
                if (bA <= 5) {
                    int iL = e9.l(str);
                    int i2 = qzVar.a;
                    h(bA, i2 - (iL + 2), i2 + y[bA]);
                } else {
                    yz yzVar = (yz) qzVar;
                    h(bA, yzVar.c, yzVar.a + yzVar.d);
                    if (yzVar.e) {
                        str2 = (String) yzVar.b;
                    }
                }
                byte b = (byte) (bA | (-128));
                if (this.v == 0) {
                    this.s.putLong(4, this.e);
                    this.s.put(this.u, b);
                    this.t.putLong(4, this.e);
                    this.t.put(this.u, b);
                } else {
                    this.h.r(this.e, 4);
                }
                this.u = 0;
                if (str2 != null) {
                    if (this.v == 0) {
                        ci0.J().execute(new t7(i, this, str2));
                    } else {
                        this.k.add(str2);
                    }
                }
                if (this.m >= 8192 || this.n.size() >= 100) {
                    tp0.t(this, 0);
                }
                if (this.v != 0 && this.w) {
                    c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FastKV: path:" + this.a + " name:" + this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.o.remove(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
