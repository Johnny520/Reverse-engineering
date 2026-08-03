package ac;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
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
import p002a1.RunnableC0006d;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p092g4.AbstractC1341a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;

/* JADX INFO: renamed from: ac.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC0062o implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: A */
    public static final int f188A;

    /* JADX INFO: renamed from: y */
    public static final byte[] f189y = new byte[0];

    /* JADX INFO: renamed from: z */
    public static final int[] f190z = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: a */
    public final String f191a;

    /* JADX INFO: renamed from: b */
    public final String f192b;

    /* JADX INFO: renamed from: c */
    public final HashMap f193c;

    /* JADX INFO: renamed from: d */
    public int f194d;

    /* JADX INFO: renamed from: e */
    public long f195e;

    /* JADX INFO: renamed from: h */
    public C0058k f198h;

    /* JADX INFO: renamed from: i */
    public int f199i;

    /* JADX INFO: renamed from: j */
    public int f200j;

    /* JADX INFO: renamed from: n */
    public int f204n;

    /* JADX INFO: renamed from: r */
    public FileChannel f208r;

    /* JADX INFO: renamed from: s */
    public FileChannel f209s;

    /* JADX INFO: renamed from: t */
    public MappedByteBuffer f210t;

    /* JADX INFO: renamed from: u */
    public MappedByteBuffer f211u;

    /* JADX INFO: renamed from: v */
    public int f212v;

    /* JADX INFO: renamed from: w */
    public int f213w;

    /* JADX INFO: renamed from: f */
    public final HashMap f196f = new HashMap();

    /* JADX INFO: renamed from: g */
    public volatile boolean f197g = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f201k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public boolean f202l = false;

    /* JADX INFO: renamed from: m */
    public final ExecutorC0064q f203m = new ExecutorC0064q();

    /* JADX INFO: renamed from: o */
    public final ArrayList f205o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final ArrayList f206p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final Handler f207q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x */
    public boolean f214x = true;

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
        f188A = iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SharedPreferencesC0062o(String str, String str2, C0066s[] c0066sArr, int i9) {
        this.f191a = str;
        this.f192b = str2;
        this.f213w = i9;
        HashMap map = new HashMap();
        if (c0066sArr != null) {
            for (C0066s c0066s : c0066sArr) {
                c0066s.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC1341a.m3597m(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c0066s);
                }
            }
        }
        map.put("StringSet", C0066s.f221a);
        this.f193c = map;
        synchronized (this.f196f) {
            AbstractC0063p.m430w().execute(new RunnableC0060m(this, 1));
            if (!this.f197g) {
                try {
                    this.f196f.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m375b(String str) {
        if (str == null || str.isEmpty()) {
            C2104o.m5294t("key is empty");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m376a(String str, Object obj, byte[] bArr, AbstractC0057j abstractC0057j, byte b10) {
        if (abstractC0057j == null) {
            int iM389o = m389o(str, bArr, b10);
            if (iM389o > 0) {
                int length = bArr.length;
                int i9 = this.f199i;
                this.f196f.put(str, b10 == 6 ? new C0056i(i9, iM389o, (String) obj, length, false) : b10 == 7 ? new C0048a(i9, iM389o, obj, length, false) : new C0055h(i9, iM389o, obj, length, false));
                m386l();
                return;
            }
            return;
        }
        if (!abstractC0057j.f174e && abstractC0057j.f173d == bArr.length) {
            int i10 = abstractC0057j.f165a;
            int length2 = bArr.length;
            this.f195e ^= this.f198h.m362m(i10, length2);
            C0058k c0058k = this.f198h;
            c0058k.f176h = i10;
            c0058k.m337C(bArr);
            long jM362m = this.f195e ^ this.f198h.m362m(i10, length2);
            this.f195e = jM362m;
            if (this.f213w == 0) {
                this.f210t.putInt(0, -1);
                this.f210t.putLong(4, this.f195e);
                this.f210t.position(i10);
                this.f210t.put(bArr);
                this.f210t.putInt(0, this.f194d - 12);
                this.f211u.putLong(4, this.f195e);
                this.f211u.position(i10);
                this.f211u.put(bArr);
            } else {
                this.f198h.m340F(4, jM362m);
            }
            abstractC0057j.f171b = obj;
            return;
        }
        int iM389o2 = m389o(str, bArr, abstractC0057j.mo327a());
        if (iM389o2 > 0) {
            String str2 = abstractC0057j.f174e ? (String) abstractC0057j.f171b : null;
            m383i(abstractC0057j.mo327a(), abstractC0057j.f172c, abstractC0057j.f165a + abstractC0057j.f173d);
            abstractC0057j.f172c = this.f199i;
            abstractC0057j.f165a = iM389o2;
            abstractC0057j.f174e = false;
            abstractC0057j.f171b = obj;
            abstractC0057j.f173d = bArr.length;
            m386l();
            if (this.f204n >= 8192 || this.f205o.size() >= 100) {
                AbstractC1184v0.m3209s(this, 0);
            }
            if (str2 != null) {
                if (this.f213w == 0) {
                    AbstractC0063p.m430w().execute(new RunnableC0006d(this, 1, str2));
                } else {
                    this.f201k.add(str2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        if (this.f202l) {
            return;
        }
        this.f214x = true;
        m378d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized void m377c() {
        if (!this.f202l) {
            this.f202l = true;
            if (this.f213w == 0) {
                FileChannel fileChannel = this.f208r;
                if (fileChannel != null) {
                    try {
                        fileChannel.force(true);
                    } catch (IOException unused) {
                    }
                }
                FileChannel fileChannel2 = this.f208r;
                if (fileChannel2 != null) {
                    try {
                        fileChannel2.close();
                    } catch (IOException unused2) {
                    }
                }
                FileChannel fileChannel3 = this.f209s;
                if (fileChannel3 != null) {
                    try {
                        fileChannel3.force(true);
                    } catch (IOException unused3) {
                    }
                }
                FileChannel fileChannel4 = this.f209s;
                if (fileChannel4 != null) {
                    try {
                        fileChannel4.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }
        synchronized (C0061n.class) {
            C0061n.f185c.remove(this.f191a + this.f192b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            if (this.f202l) {
                return this;
            }
            AbstractC1089i.m2771i(this);
            if (this.f213w != 0) {
                AbstractC1089i.m2787r(this);
            }
            m381g(null);
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        if (this.f202l) {
            return false;
        }
        this.f214x = true;
        return m378d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f196f.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m378d() {
        int i9 = this.f213w;
        if (i9 == 1) {
            this.f203m.execute(new RunnableC0060m(this, 0));
            return true;
        }
        if (i9 == 2) {
            return AbstractC1089i.m2750T0(this);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized Object m379e(String str) {
        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
        if (abstractC0049b != null && abstractC0049b.mo327a() == 8) {
            C0055h c0055h = (C0055h) abstractC0049b;
            if (!c0055h.f174e) {
                return c0055h.f171b;
            }
            LinkedHashSet linkedHashSetM2730H = AbstractC1089i.m2730H(this, c0055h);
            if (linkedHashSetM2730H == null) {
                remove(str);
                return null;
            }
            c0055h.f171b = linkedHashSetM2730H;
            c0055h.f174e = false;
            return linkedHashSetM2730H;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m380f(String str) {
        if (this.f213w != 0 && this.f214x) {
            m378d();
        }
        m381g(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m381g(String str) {
        if (this.f206p.isEmpty()) {
            return;
        }
        Iterator it = this.f206p.iterator();
        while (it.hasNext()) {
            this.f207q.post(new RunnableC0059l(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0028 A[SYNTHETIC] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Map getAll() {
        Object objM2733J;
        int size = this.f196f.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f196f.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC0049b abstractC0049b = (AbstractC0049b) entry.getValue();
            Object objValueOf = null;
            switch (abstractC0049b.mo327a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C0050c) abstractC0049b).f166b);
                    if (objValueOf == null) {
                        map.put(str, objValueOf);
                    }
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C0053f) abstractC0049b).f169b);
                    if (objValueOf == null) {
                    }
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C0052e) abstractC0049b).f168b);
                    if (objValueOf == null) {
                    }
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C0054g) abstractC0049b).f170b);
                    if (objValueOf == null) {
                    }
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C0051d) abstractC0049b).f167b);
                    if (objValueOf == null) {
                    }
                    break;
                case 6:
                    C0056i c0056i = (C0056i) abstractC0049b;
                    objM2733J = c0056i.f174e ? AbstractC1089i.m2733J(this, c0056i) : c0056i.f171b;
                    objValueOf = objM2733J;
                    if (objValueOf == null) {
                    }
                    break;
                case 7:
                    C0048a c0048a = (C0048a) abstractC0049b;
                    if (c0048a.f174e) {
                        String str2 = this.f192b;
                        try {
                            objM2733J = AbstractC2043a.m5047u(new File(this.f191a + str2, (String) c0048a.f171b));
                            if (objM2733J != null) {
                            }
                        } catch (Exception e6) {
                            Log.e("FastKV", str2, e6);
                        }
                        if (objValueOf == null) {
                        }
                    } else {
                        objM2733J = c0048a.f171b;
                    }
                    objValueOf = objM2733J;
                    if (objValueOf == null) {
                    }
                    break;
                case 8:
                    C0055h c0055h = (C0055h) abstractC0049b;
                    objM2733J = c0055h.f174e ? AbstractC1089i.m2730H(this, c0055h) : ((C0055h) abstractC0049b).f171b;
                    objValueOf = objM2733J;
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
    public final synchronized boolean getBoolean(String str, boolean z9) {
        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
        if (abstractC0049b != null) {
            z9 = abstractC0049b.mo328b();
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f3) {
        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
        if (abstractC0049b != null) {
            f3 = abstractC0049b.mo329c();
        }
        return f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i9) {
        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
        if (abstractC0049b != null) {
            i9 = abstractC0049b.mo330d();
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j3) {
        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
        if (abstractC0049b != null) {
            j3 = abstractC0049b.mo331e();
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
        if (abstractC0049b == null) {
            return str2;
        }
        if (abstractC0049b.mo327a() == 6) {
            C0056i c0056i = (C0056i) abstractC0049b;
            if (c0056i.f174e) {
                String strM2733J = AbstractC1089i.m2733J(this, c0056i);
                if (strM2733J != null && !strM2733J.isEmpty()) {
                    c0056i.f171b = strM2733J;
                    c0056i.f174e = false;
                    return strM2733J;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC0049b.mo332f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m379e(str);
        }
        return set2 != null ? set2 : set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m382h(String str, Object obj, C0066s c0066s) throws Throwable {
        Throwable th2;
        byte[] bArrM436b;
        try {
            try {
                if (this.f202l) {
                    return;
                }
                m375b(str);
                if (c0066s == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f193c.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0049b abstractC0049b = null;
                    try {
                        bArrM436b = C0066s.m436b(obj);
                    } catch (Exception e6) {
                        Log.e("FastKV", this.f192b, e6);
                        bArrM436b = null;
                    }
                    if (bArrM436b == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0049b abstractC0049b2 = (AbstractC0049b) this.f196f.get(str);
                    if (abstractC0049b2 == null || abstractC0049b2.mo327a() == 8) {
                        abstractC0049b = abstractC0049b2;
                    } else {
                        remove(str);
                    }
                    C0055h c0055h = (C0055h) abstractC0049b;
                    int iM335x = C0058k.m335x("StringSet");
                    C0058k c0058k = new C0058k(iM335x + 1 + bArrM436b.length);
                    byte[] bArr = (byte[]) c0058k.f178j;
                    c0058k.f176h = 1;
                    bArr[0] = (byte) iM335x;
                    c0058k.m341G("StringSet");
                    c0058k.m337C(bArrM436b);
                    byte[] bArr2 = (byte[]) c0058k.f178j;
                    if (bArr2 == null) {
                        return;
                    }
                    m376a(str, obj, bArr2, c0055h, (byte) 8);
                    m380f(str);
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m383i(byte b10, int i9, int i10) {
        this.f204n = (i10 - i9) + this.f204n;
        C0065r c0065r = new C0065r();
        c0065r.f219g = i9;
        c0065r.f220h = i10;
        this.f205o.add(c0065r);
        byte b11 = (byte) (b10 | (-128));
        byte[] bArr = (byte[]) this.f198h.f178j;
        this.f195e = ((((long) (bArr[i9] ^ b11)) & 255) << ((i9 & 7) << 3)) ^ this.f195e;
        bArr[i9] = b11;
        this.f212v = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m384j(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f195e);
        int i9 = this.f212v;
        if (i9 != 0) {
            mappedByteBuffer.put(i9, ((byte[]) this.f198h.f178j)[i9]);
        }
        if (this.f200j != 0) {
            mappedByteBuffer.position(this.f199i);
            mappedByteBuffer.put((byte[]) this.f198h.f178j, this.f199i, this.f200j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m385k(byte b10, int i9) {
        long jM2731H0 = this.f195e ^ AbstractC1089i.m2731H0(i9, 1L);
        this.f195e = jM2731H0;
        if (this.f213w == 0) {
            this.f210t.putLong(4, jM2731H0);
            this.f210t.put(i9, b10);
            this.f211u.putLong(4, this.f195e);
            this.f211u.put(i9, b10);
        } else {
            this.f198h.m340F(4, jM2731H0);
        }
        ((byte[]) this.f198h.f178j)[i9] = b10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m386l() {
        this.f195e ^= this.f198h.m362m(this.f199i, this.f200j);
        int i9 = this.f194d - 12;
        if (this.f213w == 0) {
            this.f210t.putInt(0, -1);
            m384j(this.f210t);
            this.f210t.putInt(0, i9);
            this.f211u.putInt(0, i9);
            m384j(this.f211u);
        } else {
            this.f198h.m339E(0, i9);
            this.f198h.m340F(4, this.f195e);
        }
        this.f212v = 0;
        this.f200j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m387m(int i9, int i10, long j3) {
        long jM2731H0 = AbstractC1089i.m2731H0(i10, j3) ^ this.f195e;
        this.f195e = jM2731H0;
        if (this.f213w == 0) {
            this.f210t.putLong(4, jM2731H0);
            this.f210t.putInt(i10, i9);
            this.f211u.putLong(4, this.f195e);
            this.f211u.putInt(i10, i9);
        } else {
            this.f198h.m340F(4, jM2731H0);
        }
        this.f198h.m339E(i10, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m388n(long j3, long j4, int i9) {
        long jM2731H0 = AbstractC1089i.m2731H0(i9, j4) ^ this.f195e;
        this.f195e = jM2731H0;
        if (this.f213w == 0) {
            this.f210t.putLong(4, jM2731H0);
            this.f210t.putLong(i9, j3);
            this.f211u.putLong(4, this.f195e);
            this.f211u.putLong(i9, j3);
        } else {
            this.f198h.m340F(4, jM2731H0);
        }
        this.f198h.m340F(i9, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m389o(String str, byte[] bArr, byte b10) {
        boolean z9 = bArr.length >= 65535;
        if (z9) {
            if (b10 == 6) {
                b10 = 9;
            } else if (b10 == 7) {
                b10 = 10;
            } else if (b10 == 8) {
                b10 = 11;
            }
        }
        m390p(b10, (z9 ? 4 : 2) + bArr.length, str);
        C0058k c0058k = this.f198h;
        if (z9) {
            c0058k.m338D(bArr.length);
        } else {
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0058k.f178j;
            int i9 = c0058k.f176h;
            int i10 = i9 + 1;
            c0058k.f176h = i10;
            bArr2[i9] = (byte) length;
            c0058k.f176h = i9 + 2;
            bArr2[i10] = (byte) (length >> 8);
        }
        C0058k c0058k2 = this.f198h;
        int i11 = c0058k2.f176h;
        c0058k2.m337C(bArr);
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m390p(byte b10, int i9, String str) {
        int iM335x = C0058k.m335x(str);
        if (iM335x > 255) {
            C2104o.m5294t("key's length must less than 256");
            return;
        }
        int i10 = iM335x + 2 + i9;
        this.f200j = i10;
        int length = ((byte[]) this.f198h.f178j).length;
        int i11 = this.f194d + i10;
        if (i11 >= length) {
            int i12 = this.f204n;
            if (i12 <= i10 || i12 <= 8192) {
                int iM2728G = AbstractC1089i.m2728G(length, i11);
                byte[] bArr = new byte[iM2728G];
                System.arraycopy((byte[]) this.f198h.f178j, 0, bArr, 0, this.f194d);
                this.f198h.f178j = bArr;
                if (this.f213w == 0) {
                    MappedByteBuffer mappedByteBufferM2796v0 = AbstractC1089i.m2796v0(this.f208r, iM2728G);
                    MappedByteBuffer mappedByteBufferM2796v02 = AbstractC1089i.m2796v0(this.f209s, iM2728G);
                    if (mappedByteBufferM2796v0 == null || mappedByteBufferM2796v02 == null) {
                        Log.e("FastKV", this.f192b, new Exception("map failed"));
                        this.f198h.m339E(0, this.f194d - 12);
                        this.f198h.m340F(4, this.f195e);
                        AbstractC1089i.m2734J0(this);
                    } else {
                        this.f210t = mappedByteBufferM2796v0;
                        this.f211u = mappedByteBufferM2796v02;
                    }
                }
            } else {
                AbstractC1184v0.m3209s(this, i10);
            }
        }
        int i13 = this.f194d;
        this.f199i = i13;
        this.f194d = this.f200j + i13;
        C0058k c0058k = this.f198h;
        byte[] bArr2 = (byte[]) c0058k.f178j;
        int i14 = i13 + 1;
        c0058k.f176h = i14;
        bArr2[i13] = b10;
        c0058k.f176h = i13 + 2;
        bArr2[i14] = (byte) iM335x;
        int length2 = str.length();
        C0058k c0058k2 = this.f198h;
        if (iM335x != length2) {
            c0058k2.m341G(str);
            return;
        }
        str.getBytes(0, iM335x, (byte[]) c0058k2.f178j, c0058k2.f176h);
        this.f198h.f176h += iM335x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z9) {
        try {
            if (this.f202l) {
                return this;
            }
            m375b(str);
            AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
            if (abstractC0049b != null && abstractC0049b.mo327a() != 1) {
                remove(str);
                abstractC0049b = null;
            }
            C0050c c0050c = (C0050c) abstractC0049b;
            if (c0050c == null) {
                m390p((byte) 1, f190z[1], str);
                C0058k c0058k = this.f198h;
                int i9 = c0058k.f176h;
                byte b10 = z9 ? (byte) 1 : (byte) 0;
                byte[] bArr = (byte[]) c0058k.f178j;
                c0058k.f176h = i9 + 1;
                bArr[i9] = b10;
                m386l();
                this.f196f.put(str, new C0050c(i9, z9));
                m380f(str);
            } else if (c0050c.f166b != z9) {
                c0050c.f166b = z9;
                m385k(z9 ? (byte) 1 : (byte) 0, c0050c.f165a);
                m380f(str);
            }
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f3) {
        try {
            if (this.f202l) {
                return this;
            }
            m375b(str);
            AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
            if (abstractC0049b != null && abstractC0049b.mo327a() != 3) {
                remove(str);
                abstractC0049b = null;
            }
            C0052e c0052e = (C0052e) abstractC0049b;
            if (c0052e == null) {
                m390p((byte) 3, f190z[3], str);
                C0058k c0058k = this.f198h;
                int i9 = c0058k.f176h;
                c0058k.m338D(Float.floatToRawIntBits(f3));
                m386l();
                this.f196f.put(str, new C0052e(i9, f3));
                m380f(str);
            } else if (c0052e.f168b != f3) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                C0058k c0058k2 = this.f198h;
                int i10 = c0052e.f165a;
                byte[] bArr = (byte[]) c0058k2.f178j;
                long j3 = ((long) (((bArr[i10 + 3] << 24) | ((((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255)) | ((bArr[i10 + 2] & 255) << 16))) ^ iFloatToRawIntBits)) & 4294967295L;
                c0052e.f168b = f3;
                m387m(iFloatToRawIntBits, i10, j3);
                m380f(str);
            }
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i9) {
        try {
            if (this.f202l) {
                return this;
            }
            m375b(str);
            AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
            if (abstractC0049b != null && abstractC0049b.mo327a() != 2) {
                remove(str);
                abstractC0049b = null;
            }
            C0053f c0053f = (C0053f) abstractC0049b;
            if (c0053f == null) {
                m390p((byte) 2, f190z[2], str);
                C0058k c0058k = this.f198h;
                int i10 = c0058k.f176h;
                c0058k.m338D(i9);
                m386l();
                this.f196f.put(str, new C0053f(i10, i9));
                m380f(str);
            } else {
                int i11 = c0053f.f169b;
                if (i11 != i9) {
                    c0053f.f169b = i9;
                    m387m(i9, c0053f.f165a, ((long) (i11 ^ i9)) & 4294967295L);
                    m380f(str);
                }
            }
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j3) throws Throwable {
        Throwable th2;
        SharedPreferencesC0062o sharedPreferencesC0062o;
        try {
            try {
                if (this.f202l) {
                    return this;
                }
                m375b(str);
                AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
                if (abstractC0049b != null) {
                    try {
                        if (abstractC0049b.mo327a() != 4) {
                            remove(str);
                            abstractC0049b = null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                C0054g c0054g = (C0054g) abstractC0049b;
                if (c0054g != null) {
                    long j4 = c0054g.f170b;
                    if (j4 != j3) {
                        long j5 = j3 ^ j4;
                        c0054g.f170b = j3;
                        sharedPreferencesC0062o = this;
                        sharedPreferencesC0062o.m388n(j3, j5, c0054g.f165a);
                        m380f(str);
                    }
                    return sharedPreferencesC0062o;
                }
                m390p((byte) 4, f190z[4], str);
                C0058k c0058k = this.f198h;
                int i9 = c0058k.f176h;
                c0058k.m340F(i9, j3);
                c0058k.f176h += 8;
                m386l();
                this.f196f.put(str, new C0054g(i9, j3));
                m380f(str);
                sharedPreferencesC0062o = this;
                return sharedPreferencesC0062o;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) throws Throwable {
        Throwable th2;
        SharedPreferencesC0062o sharedPreferencesC0062o;
        try {
            try {
                if (this.f202l) {
                    return this;
                }
                m375b(str);
                try {
                    if (str2 == null) {
                        remove(str);
                        sharedPreferencesC0062o = this;
                    } else {
                        AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
                        if (abstractC0049b != null && abstractC0049b.mo327a() != 6) {
                            remove(str);
                            abstractC0049b = null;
                        }
                        C0056i c0056i = (C0056i) abstractC0049b;
                        if (c0056i != null && !c0056i.f174e && str2.equals(c0056i.f171b)) {
                            return this;
                        }
                        byte[] bytes = str2.isEmpty() ? f189y : str2.getBytes(StandardCharsets.UTF_8);
                        if (bytes == null) {
                            Log.e("FastKV", this.f192b, new Exception("Encrypt failed"));
                            return this;
                        }
                        sharedPreferencesC0062o = this;
                        sharedPreferencesC0062o.m376a(str, str2, bytes, c0056i, (byte) 6);
                        m380f(str);
                    }
                    return sharedPreferencesC0062o;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (this.f202l) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                m382h(str, set, C0066s.f221a);
            }
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f206p.contains(onSharedPreferenceChangeListener)) {
            this.f206p.add(onSharedPreferenceChangeListener);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            if (this.f202l) {
                return this;
            }
            AbstractC0049b abstractC0049b = (AbstractC0049b) this.f196f.get(str);
            if (abstractC0049b != null) {
                this.f196f.remove(str);
                byte bMo327a = abstractC0049b.mo327a();
                String str2 = null;
                if (bMo327a <= 5) {
                    int iM335x = C0058k.m335x(str);
                    int i9 = abstractC0049b.f165a;
                    m383i(bMo327a, i9 - (iM335x + 2), i9 + f190z[bMo327a]);
                } else {
                    AbstractC0057j abstractC0057j = (AbstractC0057j) abstractC0049b;
                    m383i(bMo327a, abstractC0057j.f172c, abstractC0057j.f165a + abstractC0057j.f173d);
                    if (abstractC0057j.f174e) {
                        str2 = (String) abstractC0057j.f171b;
                    }
                }
                byte b10 = (byte) (bMo327a | (-128));
                if (this.f213w == 0) {
                    this.f210t.putLong(4, this.f195e);
                    this.f210t.put(this.f212v, b10);
                    this.f211u.putLong(4, this.f195e);
                    this.f211u.put(this.f212v, b10);
                } else {
                    this.f198h.m340F(4, this.f195e);
                }
                this.f212v = 0;
                if (str2 != null) {
                    if (this.f213w == 0) {
                        AbstractC0063p.m430w().execute(new RunnableC0006d(this, 1, str2));
                    } else {
                        this.f201k.add(str2);
                    }
                }
                if (this.f204n >= 8192 || this.f205o.size() >= 100) {
                    AbstractC1184v0.m3209s(this, 0);
                }
                if (this.f213w != 0 && this.f214x) {
                    m378d();
                }
            }
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FastKV: path:" + this.f191a + " name:" + this.f192b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f206p.remove(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
