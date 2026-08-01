package p049I2;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
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
import me.dartcv.nuke.BuildConfig;
import p021D3.RunnableC0267d;
import p021D3.RunnableC0270g;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: I2.n */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC0796n implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: x */
    public static final byte[] f2545x = new byte[0];

    /* JADX INFO: renamed from: y */
    public static final int[] f2546y = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: z */
    public static final int f2547z;

    /* JADX INFO: renamed from: a */
    public final String f2548a;

    /* JADX INFO: renamed from: b */
    public final String f2549b;

    /* JADX INFO: renamed from: c */
    public final HashMap f2550c;

    /* JADX INFO: renamed from: d */
    public int f2551d;

    /* JADX INFO: renamed from: e */
    public long f2552e;

    /* JADX INFO: renamed from: h */
    public C0793k f2555h;

    /* JADX INFO: renamed from: i */
    public int f2556i;

    /* JADX INFO: renamed from: j */
    public int f2557j;

    /* JADX INFO: renamed from: m */
    public int f2560m;

    /* JADX INFO: renamed from: q */
    public FileChannel f2564q;

    /* JADX INFO: renamed from: r */
    public FileChannel f2565r;

    /* JADX INFO: renamed from: s */
    public MappedByteBuffer f2566s;

    /* JADX INFO: renamed from: t */
    public MappedByteBuffer f2567t;

    /* JADX INFO: renamed from: u */
    public int f2568u;

    /* JADX INFO: renamed from: v */
    public int f2569v;

    /* JADX INFO: renamed from: f */
    public final HashMap f2553f = new HashMap();

    /* JADX INFO: renamed from: g */
    public volatile boolean f2554g = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2558k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ExecutorC0798p f2559l = new ExecutorC0798p();

    /* JADX INFO: renamed from: n */
    public final ArrayList f2561n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ArrayList f2562o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final Handler f2563p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: w */
    public boolean f2570w = true;

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
        f2547z = iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SharedPreferencesC0796n(String str, String str2, C0800r[] c0800rArr, int i5) {
        this.f2548a = str;
        this.f2549b = str2;
        this.f2569v = i5;
        HashMap map = new HashMap();
        if (c0800rArr != null) {
            for (C0800r c0800r : c0800rArr) {
                c0800r.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC1922d.m3430k(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c0800r);
                }
            }
        }
        map.put("StringSet", C0800r.f2577a);
        this.f2550c = map;
        synchronized (this.f2553f) {
            AbstractC0797o.m1393r().execute(new RunnableC0794l(this, 1));
            if (!this.f2554g) {
                try {
                    this.f2553f.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1358b(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1359a(String str, Object obj, byte[] bArr, AbstractC0792j abstractC0792j, byte b2) {
        if (abstractC0792j == null) {
            int iM1371n = m1371n(str, bArr, b2);
            if (iM1371n > 0) {
                int length = bArr.length;
                this.f2553f.put(str, b2 == 6 ? new C0791i(this.f2556i, iM1371n, (String) obj, length, false) : b2 == 7 ? new C0783a(this.f2556i, iM1371n, obj, length, false) : new C0790h(this.f2556i, iM1371n, obj, length, false));
                m1368k();
                return;
            }
            return;
        }
        if (!abstractC0792j.f2535e && abstractC0792j.f2534d == bArr.length) {
            int i5 = abstractC0792j.f2526a;
            int length2 = bArr.length;
            this.f2552e ^= this.f2555h.m1342f(i5, length2);
            C0793k c0793k = this.f2555h;
            c0793k.f2537e = i5;
            c0793k.m1349o(bArr);
            long jM1342f = this.f2552e ^ this.f2555h.m1342f(i5, length2);
            this.f2552e = jM1342f;
            if (this.f2569v == 0) {
                this.f2566s.putInt(0, -1);
                this.f2566s.putLong(4, this.f2552e);
                this.f2566s.position(i5);
                this.f2566s.put(bArr);
                this.f2566s.putInt(0, this.f2551d - 12);
                this.f2567t.putLong(4, this.f2552e);
                this.f2567t.position(i5);
                this.f2567t.put(bArr);
            } else {
                this.f2555h.m1352r(jM1342f, 4);
            }
            abstractC0792j.f2532b = obj;
            return;
        }
        int iM1371n2 = m1371n(str, bArr, abstractC0792j.mo1331a());
        if (iM1371n2 > 0) {
            String str2 = abstractC0792j.f2535e ? (String) abstractC0792j.f2532b : null;
            m1365h(abstractC0792j.mo1331a(), abstractC0792j.f2533c, abstractC0792j.f2526a + abstractC0792j.f2534d);
            abstractC0792j.f2533c = this.f2556i;
            abstractC0792j.f2526a = iM1371n2;
            abstractC0792j.f2535e = false;
            abstractC0792j.f2532b = obj;
            abstractC0792j.f2534d = bArr.length;
            m1368k();
            if (this.f2560m >= 8192 || this.f2561n.size() >= 100) {
                AbstractC1785a.m3249i(this, 0);
            }
            if (str2 != null) {
                if (this.f2569v == 0) {
                    AbstractC0797o.m1393r().execute(new RunnableC0270g(2, this, str2));
                } else {
                    this.f2558k.add(str2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f2570w = true;
        m1360c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1360c() {
        int i5 = this.f2569v;
        if (i5 == 1) {
            this.f2559l.execute(new RunnableC0794l(this, 0));
            return true;
        }
        if (i5 == 2) {
            return AbstractC1784a.m3216b0(this);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC1784a.m3225k(this);
            if (this.f2569v != 0) {
                AbstractC1784a.m3230p(this);
            }
            m1363f(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f2570w = true;
        return m1360c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f2553f.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized Object m1361d(String str) {
        AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
        if (abstractC0784b != null && abstractC0784b.mo1331a() == 8) {
            C0790h c0790h = (C0790h) abstractC0784b;
            if (!c0790h.f2535e) {
                return c0790h.f2532b;
            }
            LinkedHashSet linkedHashSetM3188B = AbstractC1784a.m3188B(this, c0790h);
            if (linkedHashSetM3188B == null) {
                remove(str);
                return null;
            }
            c0790h.f2532b = linkedHashSetM3188B;
            c0790h.f2535e = false;
            return linkedHashSetM3188B;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1362e(String str) {
        if (this.f2569v != 0 && this.f2570w) {
            m1360c();
        }
        m1363f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m1363f(String str) {
        if (this.f2562o.isEmpty()) {
            return;
        }
        Iterator it = this.f2562o.iterator();
        while (it.hasNext()) {
            this.f2563p.post(new RunnableC0267d(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m1364g(String str, Object obj, C0800r c0800r) throws Throwable {
        Throwable th;
        byte[] bArrM1405b;
        try {
            try {
                m1358b(str);
                if (c0800r == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f2550c.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0784b abstractC0784b = null;
                    try {
                        bArrM1405b = c0800r.m1405b(obj);
                    } catch (Exception e5) {
                        Log.e("FastKV", this.f2549b, e5);
                        bArrM1405b = null;
                    }
                    if (bArrM1405b == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0784b abstractC0784b2 = (AbstractC0784b) this.f2553f.get(str);
                    if (abstractC0784b2 == null || abstractC0784b2.mo1331a() == 8) {
                        abstractC0784b = abstractC0784b2;
                    } else {
                        remove(str);
                    }
                    C0790h c0790h = (C0790h) abstractC0784b;
                    int iM1337l = C0793k.m1337l("StringSet");
                    C0793k c0793k = new C0793k(iM1337l + 1 + bArrM1405b.length, 0);
                    byte[] bArr = (byte[]) c0793k.f2539g;
                    c0793k.f2537e = 1;
                    bArr[0] = (byte) iM1337l;
                    c0793k.m1353s("StringSet");
                    c0793k.m1349o(bArrM1405b);
                    byte[] bArr2 = (byte[]) c0793k.f2539g;
                    if (bArr2 == null) {
                        return;
                    }
                    m1359a(str, obj, bArr2, c0790h, (byte) 8);
                    m1362e(str);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
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
        Object objM3189C;
        int size = this.f2553f.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f2553f.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC0784b abstractC0784b = (AbstractC0784b) entry.getValue();
            Object objValueOf = null;
            switch (abstractC0784b.mo1331a()) {
                case BuildConfig.VERSION_CODE /* 1 */:
                    objValueOf = Boolean.valueOf(((C0785c) abstractC0784b).f2527b);
                    if (objValueOf == null) {
                        map.put(str, objValueOf);
                    }
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C0788f) abstractC0784b).f2530b);
                    if (objValueOf == null) {
                    }
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C0787e) abstractC0784b).f2529b);
                    if (objValueOf == null) {
                    }
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C0789g) abstractC0784b).f2531b);
                    if (objValueOf == null) {
                    }
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C0786d) abstractC0784b).f2528b);
                    if (objValueOf == null) {
                    }
                    break;
                case 6:
                    C0791i c0791i = (C0791i) abstractC0784b;
                    objM3189C = c0791i.f2535e ? AbstractC1784a.m3189C(this, c0791i) : c0791i.f2532b;
                    objValueOf = objM3189C;
                    if (objValueOf == null) {
                    }
                    break;
                case 7:
                    C0783a c0783a = (C0783a) abstractC0784b;
                    if (c0783a.f2535e) {
                        String str2 = this.f2549b;
                        try {
                            objM3189C = AbstractC1923e.m3486y(new File(this.f2548a + str2, (String) c0783a.f2532b));
                            if (objM3189C != null) {
                            }
                        } catch (Exception e5) {
                            Log.e("FastKV", str2, e5);
                        }
                        if (objValueOf == null) {
                        }
                    } else {
                        objM3189C = c0783a.f2532b;
                    }
                    objValueOf = objM3189C;
                    if (objValueOf == null) {
                    }
                    break;
                case 8:
                    C0790h c0790h = (C0790h) abstractC0784b;
                    objM3189C = c0790h.f2535e ? AbstractC1784a.m3188B(this, c0790h) : ((C0790h) abstractC0784b).f2532b;
                    objValueOf = objM3189C;
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
    public final synchronized boolean getBoolean(String str, boolean z5) {
        AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
        if (abstractC0784b != null) {
            z5 = abstractC0784b.mo1332b();
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f2) {
        AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
        if (abstractC0784b != null) {
            f2 = abstractC0784b.mo1333c();
        }
        return f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i5) {
        AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
        if (abstractC0784b != null) {
            i5 = abstractC0784b.mo1334d();
        }
        return i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j5) {
        AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
        if (abstractC0784b != null) {
            j5 = abstractC0784b.mo1335e();
        }
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
        if (abstractC0784b == null) {
            return str2;
        }
        if (abstractC0784b.mo1331a() == 6) {
            C0791i c0791i = (C0791i) abstractC0784b;
            if (c0791i.f2535e) {
                String strM3189C = AbstractC1784a.m3189C(this, c0791i);
                if (strM3189C != null && !strM3189C.isEmpty()) {
                    c0791i.f2532b = strM3189C;
                    c0791i.f2535e = false;
                    return strM3189C;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC0784b.mo1336f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m1361d(str);
        }
        return set2 != null ? set2 : set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1365h(byte b2, int i5, int i6) {
        this.f2560m = (i6 - i5) + this.f2560m;
        C0799q c0799q = new C0799q();
        c0799q.f2575d = i5;
        c0799q.f2576e = i6;
        this.f2561n.add(c0799q);
        byte b5 = (byte) (b2 | (-128));
        byte[] bArr = (byte[]) this.f2555h.f2539g;
        this.f2552e = ((((long) (bArr[i5] ^ b5)) & 255) << ((i5 & 7) << 3)) ^ this.f2552e;
        bArr[i5] = b5;
        this.f2568u = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1366i(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f2552e);
        int i5 = this.f2568u;
        if (i5 != 0) {
            mappedByteBuffer.put(i5, ((byte[]) this.f2555h.f2539g)[i5]);
        }
        if (this.f2557j != 0) {
            mappedByteBuffer.position(this.f2556i);
            mappedByteBuffer.put((byte[]) this.f2555h.f2539g, this.f2556i, this.f2557j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1367j(byte b2, int i5) {
        long jM3204R = this.f2552e ^ AbstractC1784a.m3204R(1L, i5);
        this.f2552e = jM3204R;
        if (this.f2569v == 0) {
            this.f2566s.putLong(4, jM3204R);
            this.f2566s.put(i5, b2);
            this.f2567t.putLong(4, this.f2552e);
            this.f2567t.put(i5, b2);
        } else {
            this.f2555h.m1352r(jM3204R, 4);
        }
        ((byte[]) this.f2555h.f2539g)[i5] = b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1368k() {
        this.f2552e ^= this.f2555h.m1342f(this.f2556i, this.f2557j);
        int i5 = this.f2551d - 12;
        if (this.f2569v == 0) {
            this.f2566s.putInt(0, -1);
            m1366i(this.f2566s);
            this.f2566s.putInt(0, i5);
            this.f2567t.putInt(0, i5);
            m1366i(this.f2567t);
        } else {
            this.f2555h.m1351q(0, i5);
            this.f2555h.m1352r(this.f2552e, 4);
        }
        this.f2568u = 0;
        this.f2557j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m1369l(int i5, int i6, long j5) {
        long jM3204R = AbstractC1784a.m3204R(j5, i6) ^ this.f2552e;
        this.f2552e = jM3204R;
        if (this.f2569v == 0) {
            this.f2566s.putLong(4, jM3204R);
            this.f2566s.putInt(i6, i5);
            this.f2567t.putLong(4, this.f2552e);
            this.f2567t.putInt(i6, i5);
        } else {
            this.f2555h.m1352r(jM3204R, 4);
        }
        this.f2555h.m1351q(i6, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1370m(int i5, long j5, long j6) {
        long jM3204R = AbstractC1784a.m3204R(j6, i5) ^ this.f2552e;
        this.f2552e = jM3204R;
        if (this.f2569v == 0) {
            this.f2566s.putLong(4, jM3204R);
            this.f2566s.putLong(i5, j5);
            this.f2567t.putLong(4, this.f2552e);
            this.f2567t.putLong(i5, j5);
        } else {
            this.f2555h.m1352r(jM3204R, 4);
        }
        this.f2555h.m1352r(j5, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final int m1371n(String str, byte[] bArr, byte b2) {
        boolean z5 = bArr.length >= 65535;
        if (z5) {
            if (b2 == 6) {
                b2 = 9;
            } else if (b2 == 7) {
                b2 = 10;
            } else if (b2 == 8) {
                b2 = 11;
            }
        }
        m1372o(str, b2, (z5 ? 4 : 2) + bArr.length);
        if (z5) {
            this.f2555h.m1350p(bArr.length);
        } else {
            C0793k c0793k = this.f2555h;
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0793k.f2539g;
            int i5 = c0793k.f2537e;
            int i6 = i5 + 1;
            c0793k.f2537e = i6;
            bArr2[i5] = (byte) length;
            c0793k.f2537e = i5 + 2;
            bArr2[i6] = (byte) (length >> 8);
        }
        C0793k c0793k2 = this.f2555h;
        int i7 = c0793k2.f2537e;
        c0793k2.m1349o(bArr);
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m1372o(String str, byte b2, int i5) {
        int iM1337l = C0793k.m1337l(str);
        if (iM1337l > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
        int i6 = iM1337l + 2 + i5;
        this.f2557j = i6;
        int length = ((byte[]) this.f2555h.f2539g).length;
        int i7 = this.f2551d + i6;
        if (i7 >= length) {
            int i8 = this.f2560m;
            if (i8 <= i6 || i8 <= 8192) {
                int iM3187A = AbstractC1784a.m3187A(length, i7);
                byte[] bArr = new byte[iM3187A];
                System.arraycopy((byte[]) this.f2555h.f2539g, 0, bArr, 0, this.f2551d);
                this.f2555h.f2539g = bArr;
                if (this.f2569v == 0) {
                    MappedByteBuffer mappedByteBufferM3197K = AbstractC1784a.m3197K(this.f2564q, iM3187A);
                    MappedByteBuffer mappedByteBufferM3197K2 = AbstractC1784a.m3197K(this.f2565r, iM3187A);
                    if (mappedByteBufferM3197K == null || mappedByteBufferM3197K2 == null) {
                        Log.e("FastKV", this.f2549b, new Exception("map failed"));
                        this.f2555h.m1351q(0, this.f2551d - 12);
                        this.f2555h.m1352r(this.f2552e, 4);
                        AbstractC1784a.m3206T(this);
                    } else {
                        this.f2566s = mappedByteBufferM3197K;
                        this.f2567t = mappedByteBufferM3197K2;
                    }
                }
            } else {
                AbstractC1785a.m3249i(this, i6);
            }
        }
        int i9 = this.f2551d;
        this.f2556i = i9;
        this.f2551d = this.f2557j + i9;
        C0793k c0793k = this.f2555h;
        byte[] bArr2 = (byte[]) c0793k.f2539g;
        int i10 = i9 + 1;
        c0793k.f2537e = i10;
        bArr2[i9] = b2;
        c0793k.f2537e = i9 + 2;
        bArr2[i10] = (byte) iM1337l;
        if (iM1337l != str.length()) {
            this.f2555h.m1353s(str);
            return;
        }
        C0793k c0793k2 = this.f2555h;
        str.getBytes(0, iM1337l, (byte[]) c0793k2.f2539g, c0793k2.f2537e);
        this.f2555h.f2537e += iM1337l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z5) {
        try {
            m1358b(str);
            AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
            if (abstractC0784b != null && abstractC0784b.mo1331a() != 1) {
                remove(str);
                abstractC0784b = null;
            }
            C0785c c0785c = (C0785c) abstractC0784b;
            if (c0785c == null) {
                m1372o(str, (byte) 1, f2546y[1]);
                C0793k c0793k = this.f2555h;
                int i5 = c0793k.f2537e;
                byte b2 = z5 ? (byte) 1 : (byte) 0;
                byte[] bArr = (byte[]) c0793k.f2539g;
                c0793k.f2537e = i5 + 1;
                bArr[i5] = b2;
                m1368k();
                this.f2553f.put(str, new C0785c(i5, z5));
                m1362e(str);
            } else if (c0785c.f2527b != z5) {
                c0785c.f2527b = z5;
                m1367j(z5 ? (byte) 1 : (byte) 0, c0785c.f2526a);
                m1362e(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f2) {
        try {
            m1358b(str);
            AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
            if (abstractC0784b != null && abstractC0784b.mo1331a() != 3) {
                remove(str);
                abstractC0784b = null;
            }
            C0787e c0787e = (C0787e) abstractC0784b;
            if (c0787e == null) {
                m1372o(str, (byte) 3, f2546y[3]);
                C0793k c0793k = this.f2555h;
                int i5 = c0793k.f2537e;
                c0793k.m1350p(Float.floatToRawIntBits(f2));
                m1368k();
                this.f2553f.put(str, new C0787e(f2, i5));
                m1362e(str);
            } else if (c0787e.f2529b != f2) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                C0793k c0793k2 = this.f2555h;
                int i6 = c0787e.f2526a;
                byte[] bArr = (byte[]) c0793k2.f2539g;
                long j5 = ((long) (((bArr[i6 + 3] << 24) | ((((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255)) | ((bArr[i6 + 2] & 255) << 16))) ^ iFloatToRawIntBits)) & 4294967295L;
                c0787e.f2529b = f2;
                m1369l(iFloatToRawIntBits, i6, j5);
                m1362e(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i5) {
        try {
            m1358b(str);
            AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
            if (abstractC0784b != null && abstractC0784b.mo1331a() != 2) {
                remove(str);
                abstractC0784b = null;
            }
            C0788f c0788f = (C0788f) abstractC0784b;
            if (c0788f == null) {
                m1372o(str, (byte) 2, f2546y[2]);
                C0793k c0793k = this.f2555h;
                int i6 = c0793k.f2537e;
                c0793k.m1350p(i5);
                m1368k();
                this.f2553f.put(str, new C0788f(i6, i5));
                m1362e(str);
            } else {
                int i7 = c0788f.f2530b;
                if (i7 != i5) {
                    c0788f.f2530b = i5;
                    m1369l(i5, c0788f.f2526a, ((long) (i7 ^ i5)) & 4294967295L);
                    m1362e(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j5) throws Throwable {
        Throwable th;
        SharedPreferencesC0796n sharedPreferencesC0796n;
        try {
            try {
                m1358b(str);
                AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
                if (abstractC0784b != null) {
                    try {
                        if (abstractC0784b.mo1331a() != 4) {
                            remove(str);
                            abstractC0784b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C0789g c0789g = (C0789g) abstractC0784b;
                if (c0789g != null) {
                    long j6 = c0789g.f2531b;
                    if (j6 != j5) {
                        long j7 = j5 ^ j6;
                        c0789g.f2531b = j5;
                        sharedPreferencesC0796n = this;
                        sharedPreferencesC0796n.m1370m(c0789g.f2526a, j5, j7);
                        m1362e(str);
                    }
                    return sharedPreferencesC0796n;
                }
                m1372o(str, (byte) 4, f2546y[4]);
                C0793k c0793k = this.f2555h;
                int i5 = c0793k.f2537e;
                c0793k.m1352r(j5, i5);
                c0793k.f2537e += 8;
                m1368k();
                this.f2553f.put(str, new C0789g(j5, i5));
                m1362e(str);
                sharedPreferencesC0796n = this;
                return sharedPreferencesC0796n;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) {
        Throwable th;
        SharedPreferencesC0796n sharedPreferencesC0796n;
        try {
            try {
                m1358b(str);
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (str2 != null) {
            AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
            if (abstractC0784b != null && abstractC0784b.mo1331a() != 6) {
                remove(str);
                abstractC0784b = null;
            }
            C0791i c0791i = (C0791i) abstractC0784b;
            if (c0791i != null && !c0791i.f2535e && str2.equals(c0791i.f2532b)) {
                return this;
            }
            byte[] bytes = str2.isEmpty() ? f2545x : str2.getBytes(StandardCharsets.UTF_8);
            if (bytes == null) {
                Log.e("FastKV", this.f2549b, new Exception("Encrypt failed"));
                return this;
            }
            sharedPreferencesC0796n = this;
            sharedPreferencesC0796n.m1359a(str, str2, bytes, c0791i, (byte) 6);
            m1362e(str);
            th = th;
            throw th;
        }
        remove(str);
        sharedPreferencesC0796n = this;
        return sharedPreferencesC0796n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                m1364g(str, set, C0800r.f2577a);
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
        if (!this.f2562o.contains(onSharedPreferenceChangeListener)) {
            this.f2562o.add(onSharedPreferenceChangeListener);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC0784b abstractC0784b = (AbstractC0784b) this.f2553f.get(str);
            if (abstractC0784b != null) {
                this.f2553f.remove(str);
                byte bMo1331a = abstractC0784b.mo1331a();
                String str2 = null;
                if (bMo1331a <= 5) {
                    int iM1337l = C0793k.m1337l(str);
                    int i5 = abstractC0784b.f2526a;
                    m1365h(bMo1331a, i5 - (iM1337l + 2), i5 + f2546y[bMo1331a]);
                } else {
                    AbstractC0792j abstractC0792j = (AbstractC0792j) abstractC0784b;
                    m1365h(bMo1331a, abstractC0792j.f2533c, abstractC0792j.f2526a + abstractC0792j.f2534d);
                    if (abstractC0792j.f2535e) {
                        str2 = (String) abstractC0792j.f2532b;
                    }
                }
                byte b2 = (byte) (bMo1331a | (-128));
                if (this.f2569v == 0) {
                    this.f2566s.putLong(4, this.f2552e);
                    this.f2566s.put(this.f2568u, b2);
                    this.f2567t.putLong(4, this.f2552e);
                    this.f2567t.put(this.f2568u, b2);
                } else {
                    this.f2555h.m1352r(this.f2552e, 4);
                }
                this.f2568u = 0;
                if (str2 != null) {
                    if (this.f2569v == 0) {
                        AbstractC0797o.m1393r().execute(new RunnableC0270g(2, this, str2));
                    } else {
                        this.f2558k.add(str2);
                    }
                }
                if (this.f2560m >= 8192 || this.f2561n.size() >= 100) {
                    AbstractC1785a.m3249i(this, 0);
                }
                if (this.f2569v != 0 && this.f2570w) {
                    m1360c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FastKV: path:" + this.f2548a + " name:" + this.f2549b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2562o.remove(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
