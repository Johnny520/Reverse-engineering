package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bi0 implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: x */
    public static final byte[] f864x = new byte[0];

    /* JADX INFO: renamed from: y */
    public static final int[] f865y = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: z */
    public static final int f866z;

    /* JADX INFO: renamed from: a */
    public final String f867a;

    /* JADX INFO: renamed from: b */
    public final String f868b;

    /* JADX INFO: renamed from: c */
    public final HashMap f869c;

    /* JADX INFO: renamed from: d */
    public int f870d;

    /* JADX INFO: renamed from: e */
    public long f871e;

    /* JADX INFO: renamed from: h */
    public C0158e9 f874h;

    /* JADX INFO: renamed from: i */
    public int f875i;

    /* JADX INFO: renamed from: j */
    public int f876j;

    /* JADX INFO: renamed from: m */
    public int f879m;

    /* JADX INFO: renamed from: q */
    public FileChannel f883q;

    /* JADX INFO: renamed from: r */
    public FileChannel f884r;

    /* JADX INFO: renamed from: s */
    public MappedByteBuffer f885s;

    /* JADX INFO: renamed from: t */
    public MappedByteBuffer f886t;

    /* JADX INFO: renamed from: u */
    public int f887u;

    /* JADX INFO: renamed from: v */
    public int f888v;

    /* JADX INFO: renamed from: f */
    public final HashMap f872f = new HashMap();

    /* JADX INFO: renamed from: g */
    public volatile boolean f873g = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f877k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ra1 f878l = new ra1();

    /* JADX INFO: renamed from: n */
    public final ArrayList f880n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ArrayList f881o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final Handler f882p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: w */
    public boolean f889w = true;

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
        f866z = iIntValue;
    }

    public bi0(String str, String str2, ov2[] ov2VarArr, int i) {
        int i2 = 1;
        this.f867a = str;
        this.f868b = str2;
        this.f888v = i;
        HashMap map = new HashMap();
        if (ov2VarArr != null) {
            for (ov2 ov2Var : ov2VarArr) {
                ov2Var.getClass();
                if (map.containsKey("StringSet")) {
                    s11.m4664I(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", ov2Var);
                }
            }
        }
        map.put("StringSet", ov2.f7859a);
        this.f869c = map;
        synchronized (this.f872f) {
            ci0.m785J().execute(new zh0(this, i2));
            if (!this.f873g) {
                try {
                    this.f872f.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m535b(String str) {
        if (str == null || str.isEmpty()) {
            C0676s.m4651j("key is empty");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m536a(String str, Object obj, byte[] bArr, AbstractC0943yz abstractC0943yz, byte b) {
        if (abstractC0943yz == null) {
            int iM548n = m548n(str, bArr, b);
            if (iM548n > 0) {
                int length = bArr.length;
                int i = this.f875i;
                this.f872f.put(str, b == 6 ? new C0904xz(i, iM548n, (String) obj, length, false) : b == 7 ? new C0598pz(i, iM548n, obj, length, false) : new C0865wz(i, iM548n, obj, length, false));
                m545k();
                return;
            }
            return;
        }
        if (!abstractC0943yz.f13680e && abstractC0943yz.f13679d == bArr.length) {
            int i2 = abstractC0943yz.f9291a;
            int length2 = bArr.length;
            this.f871e ^= this.f874h.m1299f(i2, length2);
            C0158e9 c0158e9 = this.f874h;
            c0158e9.f2352i = i2;
            c0158e9.m1306o(bArr);
            long jM1299f = this.f871e ^ this.f874h.m1299f(i2, length2);
            this.f871e = jM1299f;
            if (this.f888v == 0) {
                this.f885s.putInt(0, -1);
                this.f885s.putLong(4, this.f871e);
                this.f885s.position(i2);
                this.f885s.put(bArr);
                this.f885s.putInt(0, this.f870d - 12);
                this.f886t.putLong(4, this.f871e);
                this.f886t.position(i2);
                this.f886t.put(bArr);
            } else {
                this.f874h.m1309r(jM1299f, 4);
            }
            abstractC0943yz.f13677b = obj;
            return;
        }
        int iM548n2 = m548n(str, bArr, abstractC0943yz.mo4017a());
        if (iM548n2 > 0) {
            String str2 = abstractC0943yz.f13680e ? (String) abstractC0943yz.f13677b : null;
            m542h(abstractC0943yz.mo4017a(), abstractC0943yz.f13678c, abstractC0943yz.f9291a + abstractC0943yz.f13679d);
            abstractC0943yz.f13678c = this.f875i;
            abstractC0943yz.f9291a = iM548n2;
            abstractC0943yz.f13680e = false;
            abstractC0943yz.f13677b = obj;
            abstractC0943yz.f13679d = bArr.length;
            m545k();
            if (this.f879m >= 8192 || this.f880n.size() >= 100) {
                tp0.m5372t(this, 0);
            }
            if (str2 != null) {
                if (this.f888v == 0) {
                    ci0.m785J().execute(new RunnableC0724t7(2, this, str2));
                } else {
                    this.f877k.add(str2);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f889w = true;
        m537c();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m537c() {
        int i = this.f888v;
        if (i == 1) {
            this.f878l.execute(new zh0(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC0731te.m5237t0(this);
        }
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC0731te.m5230q(this);
            if (this.f888v != 0) {
                AbstractC0731te.m5239v(this);
            }
            m540f(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f889w = true;
        return m537c();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f872f.containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Object m538d(String str) {
        AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
        if (abstractC0637qz != null && abstractC0637qz.mo4017a() == 8) {
            C0865wz c0865wz = (C0865wz) abstractC0637qz;
            if (!c0865wz.f13680e) {
                return c0865wz.f13677b;
            }
            LinkedHashSet linkedHashSetM5179H = AbstractC0731te.m5179H(this, c0865wz);
            if (linkedHashSetM5179H == null) {
                remove(str);
                return null;
            }
            c0865wz.f13677b = linkedHashSetM5179H;
            c0865wz.f13680e = false;
            return linkedHashSetM5179H;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m539e(String str) {
        if (this.f888v != 0 && this.f889w) {
            m537c();
        }
        m540f(str);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m540f(String str) {
        if (this.f881o.isEmpty()) {
            return;
        }
        Iterator it = this.f881o.iterator();
        while (it.hasNext()) {
            this.f882p.post(new RunnableC0418lb(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 6));
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m541g(String str, Object obj, ov2 ov2Var) throws Throwable {
        bi0 bi0Var;
        Throwable th;
        byte[] bArrM3645b;
        try {
            try {
                m535b(str);
                if (ov2Var == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f869c.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0637qz abstractC0637qz = null;
                    try {
                        try {
                            bArrM3645b = ov2.m3645b(obj);
                        } catch (Throwable th2) {
                            bi0Var = this;
                            th = th2;
                        }
                    } catch (Exception e) {
                        Log.e("FastKV", this.f868b, e);
                        bArrM3645b = null;
                    }
                    if (bArrM3645b == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0637qz abstractC0637qz2 = (AbstractC0637qz) this.f872f.get(str);
                    if (abstractC0637qz2 == null || abstractC0637qz2.mo4017a() == 8) {
                        abstractC0637qz = abstractC0637qz2;
                    } else {
                        remove(str);
                    }
                    C0865wz c0865wz = (C0865wz) abstractC0637qz;
                    int iM1294l = C0158e9.m1294l("StringSet");
                    C0158e9 c0158e9 = new C0158e9(iM1294l + 1 + bArrM3645b.length, 3);
                    byte b = (byte) iM1294l;
                    byte[] bArr = (byte[]) c0158e9.f2354k;
                    c0158e9.f2352i = 1;
                    bArr[0] = b;
                    c0158e9.m1310s("StringSet");
                    c0158e9.m1306o(bArrM3645b);
                    byte[] bArr2 = (byte[]) c0158e9.f2354k;
                    if (bArr2 == null) {
                        return;
                    }
                    m536a(str, obj, bArr2, c0865wz, (byte) 8);
                    m539e(str);
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0028 A[SYNTHETIC] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Map getAll() {
        Object objM5182K;
        int size = this.f872f.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f872f.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC0637qz abstractC0637qz = (AbstractC0637qz) entry.getValue();
            Object objValueOf = null;
            switch (abstractC0637qz.mo4017a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C0675rz) abstractC0637qz).f9826b);
                    if (objValueOf == null) {
                        map.put(str, objValueOf);
                    }
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C0791uz) abstractC0637qz).f11565b);
                    if (objValueOf == null) {
                    }
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C0754tz) abstractC0637qz).f11004b);
                    if (objValueOf == null) {
                    }
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C0828vz) abstractC0637qz).f12230b);
                    if (objValueOf == null) {
                    }
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C0713sz) abstractC0637qz).f10434b);
                    if (objValueOf == null) {
                    }
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    C0904xz c0904xz = (C0904xz) abstractC0637qz;
                    objM5182K = c0904xz.f13680e ? AbstractC0731te.m5182K(this, c0904xz) : c0904xz.f13677b;
                    objValueOf = objM5182K;
                    if (objValueOf == null) {
                    }
                    break;
                case 7:
                    C0598pz c0598pz = (C0598pz) abstractC0637qz;
                    if (c0598pz.f13680e) {
                        String str2 = this.f868b;
                        try {
                            objM5182K = hg3.m2167e(new File(this.f867a + str2, (String) c0598pz.f13677b));
                            if (objM5182K != null) {
                            }
                        } catch (Exception e) {
                            Log.e("FastKV", str2, e);
                        }
                        if (objValueOf == null) {
                        }
                    } else {
                        objM5182K = c0598pz.f13677b;
                    }
                    objValueOf = objM5182K;
                    if (objValueOf == null) {
                    }
                    break;
                case 8:
                    C0865wz c0865wz = (C0865wz) abstractC0637qz;
                    objM5182K = c0865wz.f13680e ? AbstractC0731te.m5179H(this, c0865wz) : ((C0865wz) abstractC0637qz).f13677b;
                    objValueOf = objM5182K;
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

    @Override // android.content.SharedPreferences
    public final synchronized boolean getBoolean(String str, boolean z) {
        AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
        if (abstractC0637qz != null) {
            z = abstractC0637qz.mo4296b();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
        if (abstractC0637qz != null) {
            f = abstractC0637qz.mo4297c();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
        if (abstractC0637qz != null) {
            i = abstractC0637qz.mo4298d();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
        if (abstractC0637qz != null) {
            j = abstractC0637qz.mo4299e();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
        if (abstractC0637qz == null) {
            return str2;
        }
        if (abstractC0637qz.mo4017a() == 6) {
            C0904xz c0904xz = (C0904xz) abstractC0637qz;
            if (c0904xz.f13680e) {
                String strM5182K = AbstractC0731te.m5182K(this, c0904xz);
                if (strM5182K != null && !strM5182K.isEmpty()) {
                    c0904xz.f13677b = strM5182K;
                    c0904xz.f13680e = false;
                    return strM5182K;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC0637qz.mo4300f();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m538d(str);
        }
        return set2 != null ? set2 : set;
    }

    /* JADX INFO: renamed from: h */
    public final void m542h(byte b, int i, int i2) {
        this.f879m = (i2 - i) + this.f879m;
        nm2 nm2Var = new nm2();
        nm2Var.f7259h = i;
        nm2Var.f7260i = i2;
        this.f880n.add(nm2Var);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f874h.f2354k;
        this.f871e = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f871e;
        bArr[i] = b2;
        this.f887u = i;
    }

    /* JADX INFO: renamed from: i */
    public final void m543i(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f871e);
        int i = this.f887u;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f874h.f2354k)[i]);
        }
        if (this.f876j != 0) {
            mappedByteBuffer.position(this.f875i);
            mappedByteBuffer.put((byte[]) this.f874h.f2354k, this.f875i, this.f876j);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m544j(byte b, int i) {
        long jM5209f0 = this.f871e ^ AbstractC0731te.m5209f0(1L, i);
        this.f871e = jM5209f0;
        if (this.f888v == 0) {
            this.f885s.putLong(4, jM5209f0);
            this.f885s.put(i, b);
            this.f886t.putLong(4, this.f871e);
            this.f886t.put(i, b);
        } else {
            this.f874h.m1309r(jM5209f0, 4);
        }
        ((byte[]) this.f874h.f2354k)[i] = b;
    }

    /* JADX INFO: renamed from: k */
    public final void m545k() {
        this.f871e ^= this.f874h.m1299f(this.f875i, this.f876j);
        int i = this.f870d - 12;
        if (this.f888v == 0) {
            this.f885s.putInt(0, -1);
            m543i(this.f885s);
            this.f885s.putInt(0, i);
            this.f886t.putInt(0, i);
            m543i(this.f886t);
        } else {
            this.f874h.m1308q(0, i);
            this.f874h.m1309r(this.f871e, 4);
        }
        this.f887u = 0;
        this.f876j = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m546l(int i, int i2, long j) {
        long jM5209f0 = AbstractC0731te.m5209f0(j, i2) ^ this.f871e;
        this.f871e = jM5209f0;
        if (this.f888v == 0) {
            this.f885s.putLong(4, jM5209f0);
            this.f885s.putInt(i2, i);
            this.f886t.putLong(4, this.f871e);
            this.f886t.putInt(i2, i);
        } else {
            this.f874h.m1309r(jM5209f0, 4);
        }
        this.f874h.m1308q(i2, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m547m(int i, long j, long j2) {
        long jM5209f0 = AbstractC0731te.m5209f0(j2, i) ^ this.f871e;
        this.f871e = jM5209f0;
        if (this.f888v == 0) {
            this.f885s.putLong(4, jM5209f0);
            this.f885s.putLong(i, j);
            this.f886t.putLong(4, this.f871e);
            this.f886t.putLong(i, j);
        } else {
            this.f874h.m1309r(jM5209f0, 4);
        }
        this.f874h.m1309r(j, i);
    }

    /* JADX INFO: renamed from: n */
    public final int m548n(String str, byte[] bArr, byte b) {
        boolean z = bArr.length >= 65535;
        if (z) {
            if (b == 6) {
                b = 9;
            } else if (b == 7) {
                b = 10;
            } else if (b == 8) {
                b = 11;
            }
        }
        m549o(str, b, (z ? 4 : 2) + bArr.length);
        C0158e9 c0158e9 = this.f874h;
        if (z) {
            c0158e9.m1307p(bArr.length);
        } else {
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0158e9.f2354k;
            int i = c0158e9.f2352i;
            int i2 = i + 1;
            c0158e9.f2352i = i2;
            bArr2[i] = (byte) length;
            c0158e9.f2352i = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        C0158e9 c0158e92 = this.f874h;
        int i3 = c0158e92.f2352i;
        c0158e92.m1306o(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: o */
    public final void m549o(String str, byte b, int i) {
        int iM1294l = C0158e9.m1294l(str);
        if (iM1294l > 255) {
            C0676s.m4651j("key's length must less than 256");
            return;
        }
        int i2 = iM1294l + 2 + i;
        this.f876j = i2;
        int length = ((byte[]) this.f874h.f2354k).length;
        int i3 = this.f870d + i2;
        if (i3 >= length) {
            int i4 = this.f879m;
            if (i4 <= i2 || i4 <= 8192) {
                int iM5178G = AbstractC0731te.m5178G(length, i3);
                byte[] bArr = new byte[iM5178G];
                System.arraycopy((byte[]) this.f874h.f2354k, 0, bArr, 0, this.f870d);
                this.f874h.f2354k = bArr;
                if (this.f888v == 0) {
                    MappedByteBuffer mappedByteBufferM5199a0 = AbstractC0731te.m5199a0(this.f883q, iM5178G);
                    MappedByteBuffer mappedByteBufferM5199a02 = AbstractC0731te.m5199a0(this.f884r, iM5178G);
                    if (mappedByteBufferM5199a0 == null || mappedByteBufferM5199a02 == null) {
                        Log.e("FastKV", this.f868b, new Exception("map failed"));
                        this.f874h.m1308q(0, this.f870d - 12);
                        this.f874h.m1309r(this.f871e, 4);
                        AbstractC0731te.m5219k0(this);
                    } else {
                        this.f885s = mappedByteBufferM5199a0;
                        this.f886t = mappedByteBufferM5199a02;
                    }
                }
            } else {
                tp0.m5372t(this, i2);
            }
        }
        int i5 = this.f870d;
        this.f875i = i5;
        this.f870d = this.f876j + i5;
        C0158e9 c0158e9 = this.f874h;
        byte[] bArr2 = (byte[]) c0158e9.f2354k;
        int i6 = i5 + 1;
        c0158e9.f2352i = i6;
        bArr2[i5] = b;
        c0158e9.f2352i = i5 + 2;
        bArr2[i6] = (byte) iM1294l;
        int length2 = str.length();
        C0158e9 c0158e92 = this.f874h;
        if (iM1294l != length2) {
            c0158e92.m1310s(str);
            return;
        }
        str.getBytes(0, iM1294l, (byte[]) c0158e92.f2354k, c0158e92.f2352i);
        this.f874h.f2352i += iM1294l;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m535b(str);
            AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
            if (abstractC0637qz != null && abstractC0637qz.mo4017a() != 1) {
                remove(str);
                abstractC0637qz = null;
            }
            C0675rz c0675rz = (C0675rz) abstractC0637qz;
            if (c0675rz == null) {
                m549o(str, (byte) 1, f865y[1]);
                C0158e9 c0158e9 = this.f874h;
                int i = c0158e9.f2352i;
                byte b = z ? (byte) 1 : (byte) 0;
                byte[] bArr = (byte[]) c0158e9.f2354k;
                c0158e9.f2352i = i + 1;
                bArr[i] = b;
                m545k();
                this.f872f.put(str, new C0675rz(i, z));
                m539e(str);
            } else if (c0675rz.f9826b != z) {
                c0675rz.f9826b = z;
                m544j(z ? (byte) 1 : (byte) 0, c0675rz.f9291a);
                m539e(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m535b(str);
            AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
            if (abstractC0637qz != null && abstractC0637qz.mo4017a() != 3) {
                remove(str);
                abstractC0637qz = null;
            }
            C0754tz c0754tz = (C0754tz) abstractC0637qz;
            if (c0754tz == null) {
                m549o(str, (byte) 3, f865y[3]);
                C0158e9 c0158e9 = this.f874h;
                int i = c0158e9.f2352i;
                c0158e9.m1307p(Float.floatToRawIntBits(f));
                m545k();
                this.f872f.put(str, new C0754tz(f, i));
                m539e(str);
            } else if (c0754tz.f11004b != f) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C0158e9 c0158e92 = this.f874h;
                int i2 = c0754tz.f9291a;
                byte[] bArr = (byte[]) c0158e92.f2354k;
                long j = ((long) (((bArr[i2 + 3] << 24) | ((((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255)) | ((bArr[i2 + 2] & 255) << 16))) ^ iFloatToRawIntBits)) & 4294967295L;
                c0754tz.f11004b = f;
                m546l(iFloatToRawIntBits, i2, j);
                m539e(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m535b(str);
            AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
            if (abstractC0637qz != null && abstractC0637qz.mo4017a() != 2) {
                remove(str);
                abstractC0637qz = null;
            }
            C0791uz c0791uz = (C0791uz) abstractC0637qz;
            if (c0791uz == null) {
                m549o(str, (byte) 2, f865y[2]);
                C0158e9 c0158e9 = this.f874h;
                int i2 = c0158e9.f2352i;
                c0158e9.m1307p(i);
                m545k();
                this.f872f.put(str, new C0791uz(i2, i));
                m539e(str);
            } else {
                int i3 = c0791uz.f11565b;
                if (i3 != i) {
                    c0791uz.f11565b = i;
                    m546l(i, c0791uz.f9291a, ((long) (i3 ^ i)) & 4294967295L);
                    m539e(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j) throws Throwable {
        Throwable th;
        bi0 bi0Var;
        bi0 bi0Var2;
        try {
            try {
                m535b(str);
                AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
                if (abstractC0637qz != null) {
                    try {
                        if (abstractC0637qz.mo4017a() != 4) {
                            remove(str);
                            abstractC0637qz = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bi0Var = this;
                        throw th;
                    }
                }
                C0828vz c0828vz = (C0828vz) abstractC0637qz;
                if (c0828vz != null) {
                    long j2 = c0828vz.f12230b;
                    if (j2 != j) {
                        long j3 = j ^ j2;
                        c0828vz.f12230b = j;
                        bi0Var2 = this;
                        bi0Var2.m547m(c0828vz.f9291a, j, j3);
                        bi0Var2.m539e(str);
                    }
                    return bi0Var2;
                }
                m549o(str, (byte) 4, f865y[4]);
                C0158e9 c0158e9 = this.f874h;
                int i = c0158e9.f2352i;
                c0158e9.m1309r(j, i);
                c0158e9.f2352i += 8;
                m545k();
                this.f872f.put(str, new C0828vz(j, i));
                m539e(str);
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

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) throws Throwable {
        bi0 bi0Var;
        Throwable th;
        bi0 bi0Var2;
        try {
            try {
                m535b(str);
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
            AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
            if (abstractC0637qz != null && abstractC0637qz.mo4017a() != 6) {
                remove(str);
                abstractC0637qz = null;
            }
            C0904xz c0904xz = (C0904xz) abstractC0637qz;
            if (c0904xz != null && !c0904xz.f13680e && str2.equals(c0904xz.f13677b)) {
                return this;
            }
            byte[] bytes = str2.isEmpty() ? f864x : str2.getBytes(StandardCharsets.UTF_8);
            if (bytes == null) {
                Log.e("FastKV", this.f868b, new Exception("Encrypt failed"));
                return this;
            }
            bi0Var2 = this;
            bi0Var2.m536a(str, str2, bytes, c0904xz, (byte) 6);
            bi0Var2.m539e(str);
            th = th;
            throw th;
        }
        remove(str);
        bi0Var2 = this;
        return bi0Var2;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                m541g(str, set, ov2.f7859a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f881o.contains(onSharedPreferenceChangeListener)) {
            this.f881o.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC0637qz abstractC0637qz = (AbstractC0637qz) this.f872f.get(str);
            if (abstractC0637qz != null) {
                this.f872f.remove(str);
                byte bMo4017a = abstractC0637qz.mo4017a();
                int i = 2;
                String str2 = null;
                if (bMo4017a <= 5) {
                    int iM1294l = C0158e9.m1294l(str);
                    int i2 = abstractC0637qz.f9291a;
                    m542h(bMo4017a, i2 - (iM1294l + 2), i2 + f865y[bMo4017a]);
                } else {
                    AbstractC0943yz abstractC0943yz = (AbstractC0943yz) abstractC0637qz;
                    m542h(bMo4017a, abstractC0943yz.f13678c, abstractC0943yz.f9291a + abstractC0943yz.f13679d);
                    if (abstractC0943yz.f13680e) {
                        str2 = (String) abstractC0943yz.f13677b;
                    }
                }
                byte b = (byte) (bMo4017a | (-128));
                if (this.f888v == 0) {
                    this.f885s.putLong(4, this.f871e);
                    this.f885s.put(this.f887u, b);
                    this.f886t.putLong(4, this.f871e);
                    this.f886t.put(this.f887u, b);
                } else {
                    this.f874h.m1309r(this.f871e, 4);
                }
                this.f887u = 0;
                if (str2 != null) {
                    if (this.f888v == 0) {
                        ci0.m785J().execute(new RunnableC0724t7(i, this, str2));
                    } else {
                        this.f877k.add(str2);
                    }
                }
                if (this.f879m >= 8192 || this.f880n.size() >= 100) {
                    tp0.m5372t(this, 0);
                }
                if (this.f888v != 0 && this.f889w) {
                    m537c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f867a + " name:" + this.f868b;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f881o.remove(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
