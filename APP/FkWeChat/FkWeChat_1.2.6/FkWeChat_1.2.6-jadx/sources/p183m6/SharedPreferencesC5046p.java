package p183m6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p196n6.InterfaceC5496a;
import p196n6.InterfaceC5497b;
import p376zd.C9987e;

/* JADX INFO: renamed from: m6.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC5046p implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public final String f15328a;

    /* JADX INFO: renamed from: b */
    public final String f15329b;

    /* JADX INFO: renamed from: c */
    public final Map f15330c;

    /* JADX INFO: renamed from: d */
    public int f15331d;

    /* JADX INFO: renamed from: e */
    public long f15332e;

    /* JADX INFO: renamed from: h */
    public C5042l f15335h;

    /* JADX INFO: renamed from: i */
    public int f15336i;

    /* JADX INFO: renamed from: j */
    public int f15337j;

    /* JADX INFO: renamed from: o */
    public int f15342o;

    /* JADX INFO: renamed from: s */
    public FileChannel f15346s;

    /* JADX INFO: renamed from: t */
    public FileChannel f15347t;

    /* JADX INFO: renamed from: u */
    public MappedByteBuffer f15348u;

    /* JADX INFO: renamed from: v */
    public MappedByteBuffer f15349v;

    /* JADX INFO: renamed from: w */
    public int f15350w;

    /* JADX INFO: renamed from: x */
    public int f15351x;

    /* JADX INFO: renamed from: z */
    public static final byte[] f15327z = new byte[0];

    /* JADX INFO: renamed from: A */
    public static final int[] f15325A = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: B */
    public static final int f15326B = AbstractC5056z.m20465f();

    /* JADX INFO: renamed from: f */
    public final HashMap f15333f = new HashMap();

    /* JADX INFO: renamed from: g */
    public volatile boolean f15334g = false;

    /* JADX INFO: renamed from: k */
    public final List f15338k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public boolean f15339l = false;

    /* JADX INFO: renamed from: m */
    public boolean f15340m = false;

    /* JADX INFO: renamed from: n */
    public final Executor f15341n = new ExecutorC5052v();

    /* JADX INFO: renamed from: p */
    public final ArrayList f15343p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final ArrayList f15344q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final Handler f15345r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: y */
    public boolean f15352y = true;

    /* JADX INFO: renamed from: m6.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: e */
        public static final Map f15353e = new ConcurrentHashMap();

        /* JADX INFO: renamed from: a */
        public final String f15354a;

        /* JADX INFO: renamed from: b */
        public final String f15355b;

        /* JADX INFO: renamed from: c */
        public InterfaceC5497b[] f15356c;

        /* JADX INFO: renamed from: d */
        public int f15357d = 0;

        public a(Context context, String str) {
            if (context == null) {
                C9987e.m38645a("context is null");
                throw null;
            }
            if (str == null || str.isEmpty()) {
                C9987e.m38645a("name is empty");
                throw null;
            }
            this.f15354a = context.getFilesDir().getAbsolutePath() + "/fastkv/";
            this.f15355b = str;
        }

        /* JADX INFO: renamed from: a */
        public SharedPreferencesC5046p m20406a() {
            SharedPreferencesC5046p sharedPreferencesC5046p;
            String str = this.f15354a + this.f15355b;
            Map map = f15353e;
            SharedPreferencesC5046p sharedPreferencesC5046p2 = (SharedPreferencesC5046p) map.get(str);
            if (sharedPreferencesC5046p2 != null) {
                return sharedPreferencesC5046p2;
            }
            synchronized (a.class) {
                try {
                    sharedPreferencesC5046p = (SharedPreferencesC5046p) map.get(str);
                    if (sharedPreferencesC5046p == null) {
                        SharedPreferencesC5046p sharedPreferencesC5046p3 = new SharedPreferencesC5046p(this.f15354a, this.f15355b, this.f15356c, null, this.f15357d);
                        map.put(str, sharedPreferencesC5046p3);
                        sharedPreferencesC5046p = sharedPreferencesC5046p3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return sharedPreferencesC5046p;
        }
    }

    public SharedPreferencesC5046p(String str, String str2, InterfaceC5497b[] interfaceC5497bArr, InterfaceC5496a interfaceC5496a, int i10) {
        this.f15328a = str;
        this.f15329b = str2;
        this.f15351x = i10;
        HashMap map = new HashMap();
        if (interfaceC5497bArr != null) {
            for (InterfaceC5497b interfaceC5497b : interfaceC5497bArr) {
                String strTag = interfaceC5497b.tag();
                if (map.containsKey(strTag)) {
                    AbstractC5053w.m20452b(this, "duplicate encoder tag:" + strTag);
                } else {
                    map.put(strTag, interfaceC5497b);
                }
            }
        }
        C5055y c5055y = C5055y.f15367a;
        map.put(c5055y.tag(), c5055y);
        this.f15330c = map;
        synchronized (this.f15333f) {
            AbstractC5047q.m20407a().execute(new Runnable() { // from class: m6.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15324q.m20395p();
                }
            });
            if (!this.f15334g) {
                try {
                    this.f15333f.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20371b(SharedPreferencesC5046p sharedPreferencesC5046p) {
        sharedPreferencesC5046p.getClass();
        AbstractC5049s.m20412E(sharedPreferencesC5046p);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20372c(SharedPreferencesC5046p sharedPreferencesC5046p, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        sharedPreferencesC5046p.getClass();
        onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC5046p, str);
    }

    /* JADX INFO: renamed from: A */
    public final void m20373A(byte b10, int i10) {
        long jM20437y = this.f15332e ^ AbstractC5049s.m20437y(1L, i10);
        this.f15332e = jM20437y;
        if (this.f15351x == 0) {
            this.f15348u.putLong(4, jM20437y);
            this.f15348u.put(i10, b10);
            this.f15349v.putLong(4, this.f15332e);
            this.f15349v.put(i10, b10);
        } else {
            this.f15335h.m20369z(4, jM20437y);
        }
        this.f15335h.f15318b[i10] = b10;
    }

    /* JADX INFO: renamed from: B */
    public final void m20374B(int i10, byte[] bArr) {
        int length = bArr.length;
        this.f15332e ^= this.f15335h.m20352g(i10, length);
        C5042l c5042l = this.f15335h;
        c5042l.f15319c = i10;
        c5042l.m20366w(bArr);
        long jM20352g = this.f15332e ^ this.f15335h.m20352g(i10, length);
        this.f15332e = jM20352g;
        if (this.f15351x != 0) {
            this.f15335h.m20369z(4, jM20352g);
            return;
        }
        this.f15348u.putInt(0, -1);
        this.f15348u.putLong(4, this.f15332e);
        this.f15348u.position(i10);
        this.f15348u.put(bArr);
        this.f15348u.putInt(0, m20397r(this.f15331d - 12));
        this.f15349v.putLong(4, this.f15332e);
        this.f15349v.position(i10);
        this.f15349v.put(bArr);
    }

    /* JADX INFO: renamed from: C */
    public final void m20375C() {
        this.f15332e ^= this.f15335h.m20352g(this.f15336i, this.f15337j);
        int iM20397r = m20397r(this.f15331d - 12);
        if (this.f15351x == 0) {
            this.f15348u.putInt(0, -1);
            m20405z(this.f15348u);
            this.f15348u.putInt(0, iM20397r);
            this.f15349v.putInt(0, iM20397r);
            m20405z(this.f15349v);
        } else {
            this.f15335h.m20368y(0, iM20397r);
            this.f15335h.m20369z(4, this.f15332e);
        }
        this.f15350w = 0;
        this.f15337j = 0;
    }

    /* JADX INFO: renamed from: D */
    public final void m20376D(int i10, long j10, int i11) {
        long jM20437y = AbstractC5049s.m20437y(j10, i11) ^ this.f15332e;
        this.f15332e = jM20437y;
        if (this.f15351x == 0) {
            this.f15348u.putLong(4, jM20437y);
            this.f15348u.putInt(i11, i10);
            this.f15349v.putLong(4, this.f15332e);
            this.f15349v.putInt(i11, i10);
        } else {
            this.f15335h.m20369z(4, jM20437y);
        }
        this.f15335h.m20368y(i11, i10);
    }

    /* JADX INFO: renamed from: E */
    public final void m20377E(long j10, long j11, int i10) {
        long jM20437y = AbstractC5049s.m20437y(j11, i10) ^ this.f15332e;
        this.f15332e = jM20437y;
        if (this.f15351x == 0) {
            this.f15348u.putLong(4, jM20437y);
            this.f15348u.putLong(i10, j10);
            this.f15349v.putLong(4, this.f15332e);
            this.f15349v.putLong(i10, j10);
        } else {
            this.f15335h.m20369z(4, jM20437y);
        }
        this.f15335h.m20369z(i10, j10);
    }

    /* JADX INFO: renamed from: F */
    public final void m20378F(String str, Object obj, byte[] bArr, AbstractC5040j abstractC5040j) {
        int iM20379G = m20379G(str, bArr, abstractC5040j.mo20322a());
        if (iM20379G > 0) {
            String str2 = abstractC5040j.f15316e ? (String) abstractC5040j.f15313b : null;
            m20403x(abstractC5040j.mo20322a(), abstractC5040j.f15314c, abstractC5040j.f15306a + abstractC5040j.f15315d);
            abstractC5040j.f15314c = this.f15336i;
            abstractC5040j.f15306a = iM20379G;
            abstractC5040j.f15316e = false;
            abstractC5040j.f15313b = obj;
            abstractC5040j.f15315d = bArr.length;
            m20375C();
            AbstractC5050t.m20439a(this);
            if (str2 != null) {
                m20404y(str2);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m20379G(String str, byte[] bArr, byte b10) {
        boolean z10 = bArr.length >= 65535;
        if (z10) {
            b10 = m20389j(b10);
        }
        if (!m20381I(str, b10, (z10 ? 4 : 2) + bArr.length)) {
            return 0;
        }
        C5042l c5042l = this.f15335h;
        if (z10) {
            c5042l.m20367x(bArr.length);
        } else {
            c5042l.m20342B((short) bArr.length);
        }
        C5042l c5042l2 = this.f15335h;
        int i10 = c5042l2.f15319c;
        c5042l2.m20366w(bArr);
        return i10;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m20380H(String str, byte b10) {
        return m20381I(str, b10, f15325A[b10]);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m20381I(String str, byte b10, int i10) {
        int iM20339s = C5042l.m20339s(str);
        m20398s(iM20339s, i10, b10);
        m20382J(str, iM20339s);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final void m20382J(String str, int i10) {
        this.f15335h.m20365v((byte) i10);
        int length = str.length();
        C5042l c5042l = this.f15335h;
        if (i10 != length) {
            c5042l.m20343C(str);
            return;
        }
        str.getBytes(0, i10, c5042l.f15318b, c5042l.f15319c);
        this.f15335h.f15319c += i10;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized void apply() {
        if (this.f15340m) {
            return;
        }
        this.f15352y = true;
        m20387h();
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        try {
            if (this.f15340m) {
                return this;
            }
            AbstractC5049s.m20414b(this);
            if (this.f15351x != 0) {
                AbstractC5049s.m20418f(this);
            }
            m20396q(null);
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized boolean commit() {
        if (this.f15340m) {
            return false;
        }
        this.f15352y = true;
        return m20387h();
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.f15333f.containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m20383d(String str, Object obj, byte[] bArr, byte b10) {
        AbstractC5040j c5031a;
        int iM20379G = m20379G(str, bArr, b10);
        if (iM20379G > 0) {
            int length = bArr.length;
            if (b10 == 6) {
                c5031a = new C5039i(this.f15336i, iM20379G, (String) obj, length, false);
            } else {
                int i10 = this.f15336i;
                c5031a = b10 == 7 ? new C5031a(i10, iM20379G, obj, length, false) : new C5038h(i10, iM20379G, obj, length, false);
            }
            this.f15333f.put(str, c5031a);
            m20375C();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20384e(String str, Object obj, byte[] bArr, AbstractC5040j abstractC5040j, byte b10) {
        if (abstractC5040j == null) {
            m20383d(str, obj, bArr, b10);
        } else if (abstractC5040j.f15316e || abstractC5040j.f15315d != bArr.length) {
            m20378F(str, obj, bArr, abstractC5040j);
        } else {
            m20374B(abstractC5040j.f15306a, bArr);
            abstractC5040j.f15313b = obj;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20385f() {
        if (this.f15351x == 0 || !this.f15352y) {
            return;
        }
        m20387h();
    }

    /* JADX INFO: renamed from: g */
    public final void m20386g(String str) {
        if (str == null || str.isEmpty()) {
            C9987e.m38645a("key is empty");
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized Map getAll() {
        Object objM20423k;
        int size = this.f15333f.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f15333f.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC5032b abstractC5032b = (AbstractC5032b) entry.getValue();
            Object objValueOf = null;
            switch (abstractC5032b.mo20322a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C5033c) abstractC5032b).f15307b);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C5036f) abstractC5032b).f15310b);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C5035e) abstractC5032b).f15309b);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C5037g) abstractC5032b).f15311b);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C5034d) abstractC5032b).f15308b);
                    break;
                case 6:
                    C5039i c5039i = (C5039i) abstractC5032b;
                    objM20423k = c5039i.f15316e ? AbstractC5049s.m20423k(this, c5039i, null) : c5039i.f15313b;
                    objValueOf = objM20423k;
                    break;
                case 7:
                    C5031a c5031a = (C5031a) abstractC5032b;
                    objM20423k = c5031a.f15316e ? AbstractC5049s.m20420h(this, c5031a, null) : c5031a.f15313b;
                    objValueOf = objM20423k;
                    break;
                case 8:
                    C5038h c5038h = (C5038h) abstractC5032b;
                    objM20423k = c5038h.f15316e ? AbstractC5049s.m20422j(this, c5038h, null) : ((C5038h) abstractC5032b).f15313b;
                    objValueOf = objM20423k;
                    break;
            }
            if (objValueOf != null) {
                map.put(str, objValueOf);
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z10) {
        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
        if (abstractC5032b != null) {
            z10 = abstractC5032b.mo20323b();
        }
        return z10;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f10) {
        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
        if (abstractC5032b != null) {
            f10 = abstractC5032b.mo20324c();
        }
        return f10;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i10) {
        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
        if (abstractC5032b != null) {
            i10 = abstractC5032b.mo20325d();
        }
        return i10;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j10) {
        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
        if (abstractC5032b != null) {
            j10 = abstractC5032b.mo20326e();
        }
        return j10;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
        if (abstractC5032b == null) {
            return str2;
        }
        if (abstractC5032b.mo20322a() == 6) {
            C5039i c5039i = (C5039i) abstractC5032b;
            if (c5039i.f15316e) {
                String strM20423k = AbstractC5049s.m20423k(this, c5039i, null);
                if (strM20423k != null && !strM20423k.isEmpty()) {
                    c5039i.f15313b = strM20423k;
                    c5039i.f15316e = false;
                    return strM20423k;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC5032b.mo20327f();
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Set setM20393n = m20393n(str);
        return setM20393n != null ? setM20393n : set;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m20387h() {
        int i10 = this.f15351x;
        if (i10 == 1) {
            this.f15341n.execute(new Runnable() { // from class: m6.n
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferencesC5046p.m20371b(this.f15323q);
                }
            });
        } else if (i10 == 2) {
            return AbstractC5049s.m20412E(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m20388i() {
        this.f15352y = false;
    }

    /* JADX INFO: renamed from: j */
    public final byte m20389j(byte b10) {
        if (b10 == 6) {
            return (byte) 9;
        }
        if (b10 == 7) {
            return (byte) 10;
        }
        if (b10 != 8) {
            return b10;
        }
        return (byte) 11;
    }

    /* JADX INFO: renamed from: k */
    public final long m20390k(double d10) {
        return Double.doubleToRawLongBits(d10);
    }

    /* JADX INFO: renamed from: l */
    public final int m20391l(float f10) {
        return Float.floatToRawIntBits(f10);
    }

    /* JADX INFO: renamed from: m */
    public synchronized Object m20392m(String str) {
        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
        if (abstractC5032b != null && abstractC5032b.mo20322a() == 8) {
            C5038h c5038h = (C5038h) abstractC5032b;
            if (!c5038h.f15316e) {
                return c5038h.f15313b;
            }
            Object objM20422j = AbstractC5049s.m20422j(this, c5038h, null);
            if (objM20422j == null) {
                remove(str);
                return null;
            }
            c5038h.f15313b = objM20422j;
            c5038h.f15316e = false;
            return objM20422j;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public synchronized Set m20393n(String str) {
        return (Set) m20392m(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m20394o(String str) {
        m20385f();
        m20396q(str);
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m20395p() {
        try {
            synchronized (this.f15333f) {
                this.f15334g = true;
                this.f15333f.notify();
            }
            System.nanoTime();
            if (!AbstractC5049s.m20427o(this) && this.f15351x == 0) {
                AbstractC5049s.m20426n(this);
            }
            if (this.f15335h == null) {
                this.f15335h = new C5042l(f15326B);
            }
            if (this.f15331d == 0) {
                this.f15331d = 12;
            }
            if (this.f15339l) {
                AbstractC5049s.m20436x(this);
                AbstractC5053w.m20453c(this, "rewrite data");
            }
            Executor executor = AbstractC5047q.f15358a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z10) {
        try {
            if (this.f15340m) {
                return this;
            }
            m20386g(str);
            AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
            if (abstractC5032b != null && abstractC5032b.mo20322a() != 1) {
                remove(str);
                abstractC5032b = null;
            }
            C5033c c5033c = (C5033c) abstractC5032b;
            if (c5033c == null) {
                if (!m20380H(str, (byte) 1)) {
                    return this;
                }
                C5042l c5042l = this.f15335h;
                int i10 = c5042l.f15319c;
                c5042l.m20365v(z10 ? (byte) 1 : (byte) 0);
                m20375C();
                this.f15333f.put(str, new C5033c(i10, z10));
                m20394o(str);
            } else if (c5033c.f15307b != z10) {
                c5033c.f15307b = z10;
                m20373A(z10 ? (byte) 1 : (byte) 0, c5033c.f15306a);
                m20394o(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f10) {
        try {
            if (this.f15340m) {
                return this;
            }
            m20386g(str);
            AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
            if (abstractC5032b != null && abstractC5032b.mo20322a() != 3) {
                remove(str);
                abstractC5032b = null;
            }
            C5035e c5035e = (C5035e) abstractC5032b;
            if (c5035e == null) {
                if (!m20380H(str, (byte) 3)) {
                    return this;
                }
                C5042l c5042l = this.f15335h;
                int i10 = c5042l.f15319c;
                c5042l.m20367x(m20391l(f10));
                m20375C();
                this.f15333f.put(str, new C5035e(i10, f10));
                m20394o(str);
            } else if (c5035e.f15309b != f10) {
                int iM20391l = m20391l(f10);
                long jM20356k = ((long) (this.f15335h.m20356k(c5035e.f15306a) ^ iM20391l)) & 4294967295L;
                c5035e.f15309b = f10;
                m20376D(iM20391l, jM20356k, c5035e.f15306a);
                m20394o(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i10) {
        try {
            if (this.f15340m) {
                return this;
            }
            m20386g(str);
            AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
            if (abstractC5032b != null && abstractC5032b.mo20322a() != 2) {
                remove(str);
                abstractC5032b = null;
            }
            C5036f c5036f = (C5036f) abstractC5032b;
            if (c5036f != null) {
                int i11 = c5036f.f15310b;
                if (i11 != i10) {
                    c5036f.f15310b = i10;
                    m20376D(i10, ((long) (i11 ^ i10)) & 4294967295L, c5036f.f15306a);
                    m20394o(str);
                }
            } else {
                if (!m20380H(str, (byte) 2)) {
                    return this;
                }
                C5042l c5042l = this.f15335h;
                int i12 = c5042l.f15319c;
                c5042l.m20367x(i10);
                m20375C();
                this.f15333f.put(str, new C5036f(i12, i10));
                m20394o(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j10) {
        Throwable th;
        SharedPreferencesC5046p sharedPreferencesC5046p;
        try {
            try {
                if (this.f15340m) {
                    return this;
                }
                m20386g(str);
                AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
                if (abstractC5032b != null) {
                    try {
                        if (abstractC5032b.mo20322a() != 4) {
                            remove(str);
                            abstractC5032b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C5037g c5037g = (C5037g) abstractC5032b;
                if (c5037g != null) {
                    long j11 = c5037g.f15311b;
                    if (j11 != j10) {
                        long j12 = j10 ^ j11;
                        c5037g.f15311b = j10;
                        sharedPreferencesC5046p = this;
                        sharedPreferencesC5046p.m20377E(j10, j12, c5037g.f15306a);
                        m20394o(str);
                    }
                    return sharedPreferencesC5046p;
                }
                if (!m20380H(str, (byte) 4)) {
                    return this;
                }
                C5042l c5042l = this.f15335h;
                int i10 = c5042l.f15319c;
                c5042l.m20341A(j10);
                m20375C();
                this.f15333f.put(str, new C5037g(i10, j10));
                m20394o(str);
                sharedPreferencesC5046p = this;
                return sharedPreferencesC5046p;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String str, String str2) {
        Throwable th;
        SharedPreferencesC5046p sharedPreferencesC5046p;
        try {
            try {
                if (this.f15340m) {
                    return this;
                }
                m20386g(str);
                try {
                    if (str2 == null) {
                        remove(str);
                        sharedPreferencesC5046p = this;
                    } else {
                        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
                        if (abstractC5032b != null && abstractC5032b.mo20322a() != 6) {
                            remove(str);
                            abstractC5032b = null;
                        }
                        C5039i c5039i = (C5039i) abstractC5032b;
                        if (c5039i != null && !c5039i.f15316e && str2.equals(c5039i.f15313b)) {
                            return this;
                        }
                        byte[] bytes = str2.isEmpty() ? f15327z : str2.getBytes(StandardCharsets.UTF_8);
                        if (bytes == null) {
                            AbstractC5053w.m20451a(this, new Exception("Encrypt failed"));
                            return this;
                        }
                        sharedPreferencesC5046p = this;
                        sharedPreferencesC5046p.m20384e(str, str2, bytes, c5039i, (byte) 6);
                        m20394o(str);
                    }
                    return sharedPreferencesC5046p;
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

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (this.f15340m) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                m20402w(str, set, C5055y.f15367a);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m20396q(final String str) {
        if (this.f15344q.isEmpty()) {
            return;
        }
        for (final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f15344q) {
            this.f15345r.post(new Runnable() { // from class: m6.m
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferencesC5046p.m20372c(this.f15320q, onSharedPreferenceChangeListener, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m20397r(int i10) {
        return AbstractC5049s.m20429q(i10, false);
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f15344q.contains(onSharedPreferenceChangeListener)) {
            this.f15344q.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor remove(String str) {
        try {
            if (this.f15340m) {
                return this;
            }
            AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
            if (abstractC5032b != null) {
                this.f15333f.remove(str);
                byte bMo20322a = abstractC5032b.mo20322a();
                String str2 = null;
                if (bMo20322a <= 5) {
                    int iM20339s = C5042l.m20339s(str);
                    int i10 = abstractC5032b.f15306a;
                    m20403x(bMo20322a, i10 - (iM20339s + 2), i10 + f15325A[bMo20322a]);
                } else {
                    AbstractC5040j abstractC5040j = (AbstractC5040j) abstractC5032b;
                    m20403x(bMo20322a, abstractC5040j.f15314c, abstractC5040j.f15306a + abstractC5040j.f15315d);
                    if (abstractC5040j.f15316e) {
                        str2 = (String) abstractC5040j.f15313b;
                    }
                }
                byte b10 = (byte) (bMo20322a | (-128));
                if (this.f15351x == 0) {
                    this.f15348u.putLong(4, this.f15332e);
                    this.f15348u.put(this.f15350w, b10);
                    this.f15349v.putLong(4, this.f15332e);
                    this.f15349v.put(this.f15350w, b10);
                } else {
                    this.f15335h.m20369z(4, this.f15332e);
                }
                this.f15350w = 0;
                if (str2 != null) {
                    if (this.f15351x == 0) {
                        AbstractC5049s.m20419g(this, str2);
                    } else {
                        this.f15338k.add(str2);
                    }
                }
                AbstractC5050t.m20439a(this);
                m20385f();
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m20398s(int i10, int i11, byte b10) {
        if (i10 > 255) {
            C9987e.m38645a("key's length must less than 256");
            return;
        }
        this.f15337j = i10 + 2 + i11;
        m20399t();
        this.f15335h.m20365v(b10);
    }

    /* JADX INFO: renamed from: t */
    public final void m20399t() {
        AbstractC5050t.m20442d(this, this.f15337j);
        int i10 = this.f15331d;
        this.f15336i = i10;
        this.f15331d = this.f15337j + i10;
        this.f15335h.f15319c = i10;
    }

    public String toString() {
        return "FastKV: path:" + this.f15328a + " name:" + this.f15329b;
    }

    /* JADX INFO: renamed from: u */
    public synchronized SharedPreferences.Editor m20400u(String str, byte[] bArr) {
        Throwable th;
        SharedPreferencesC5046p sharedPreferencesC5046p;
        try {
            try {
                if (this.f15340m) {
                    return this;
                }
                m20386g(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        sharedPreferencesC5046p = this;
                    } else {
                        AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
                        if (abstractC5032b != null && abstractC5032b.mo20322a() != 7) {
                            remove(str);
                            abstractC5032b = null;
                        }
                        sharedPreferencesC5046p = this;
                        sharedPreferencesC5046p.m20384e(str, bArr, bArr, (C5031a) abstractC5032b, (byte) 7);
                        m20394o(str);
                    }
                    return sharedPreferencesC5046p;
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

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f15344q.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: v */
    public synchronized SharedPreferences.Editor m20401v(String str, double d10) {
        Throwable th;
        SharedPreferencesC5046p sharedPreferencesC5046p;
        try {
            try {
                if (this.f15340m) {
                    return this;
                }
                m20386g(str);
                AbstractC5032b abstractC5032b = (AbstractC5032b) this.f15333f.get(str);
                if (abstractC5032b != null) {
                    try {
                        if (abstractC5032b.mo20322a() != 5) {
                            remove(str);
                            abstractC5032b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C5034d c5034d = (C5034d) abstractC5032b;
                if (c5034d != null) {
                    if (c5034d.f15308b != d10) {
                        long jM20390k = m20390k(d10);
                        long jM20359n = jM20390k ^ this.f15335h.m20359n(c5034d.f15306a);
                        c5034d.f15308b = d10;
                        sharedPreferencesC5046p = this;
                        sharedPreferencesC5046p.m20377E(jM20390k, jM20359n, c5034d.f15306a);
                        m20394o(str);
                    }
                    return sharedPreferencesC5046p;
                }
                if (!m20380H(str, (byte) 5)) {
                    return this;
                }
                C5042l c5042l = this.f15335h;
                int i10 = c5042l.f15319c;
                c5042l.m20341A(m20390k(d10));
                m20375C();
                this.f15333f.put(str, new C5034d(i10, d10));
                m20394o(str);
                sharedPreferencesC5046p = this;
                return sharedPreferencesC5046p;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m20402w(String str, Object obj, InterfaceC5497b interfaceC5497b) {
        Throwable th;
        byte[] bArrMo20457b;
        try {
            try {
                if (this.f15340m) {
                    return;
                }
                m20386g(str);
                if (interfaceC5497b == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                String strTag = interfaceC5497b.tag();
                if (strTag == null || strTag.isEmpty() || strTag.length() > 50) {
                    throw new IllegalArgumentException("Invalid encoder tag:" + strTag);
                }
                if (!this.f15330c.containsKey(strTag)) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC5032b abstractC5032b = null;
                    try {
                        bArrMo20457b = interfaceC5497b.mo20457b(obj);
                    } catch (Exception e10) {
                        AbstractC5053w.m20451a(this, e10);
                        bArrMo20457b = null;
                    }
                    if (bArrMo20457b == null) {
                        remove(str);
                        return;
                    }
                    AbstractC5032b abstractC5032b2 = (AbstractC5032b) this.f15333f.get(str);
                    if (abstractC5032b2 == null || abstractC5032b2.mo20322a() == 8) {
                        abstractC5032b = abstractC5032b2;
                    } else {
                        remove(str);
                    }
                    C5038h c5038h = (C5038h) abstractC5032b;
                    int iM20339s = C5042l.m20339s(strTag);
                    C5042l c5042l = new C5042l(iM20339s + 1 + bArrMo20457b.length);
                    c5042l.m20365v((byte) iM20339s);
                    c5042l.m20343C(strTag);
                    c5042l.m20366w(bArrMo20457b);
                    byte[] bArr = c5042l.f15318b;
                    if (bArr == null) {
                        return;
                    }
                    m20384e(str, obj, bArr, c5038h, (byte) 8);
                    m20394o(str);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    /* JADX INFO: renamed from: x */
    public final void m20403x(byte b10, int i10, int i11) {
        AbstractC5050t.m20441c(this, i10, i11);
        byte b11 = (byte) (b10 | (-128));
        byte[] bArr = this.f15335h.f15318b;
        this.f15332e = ((((long) (bArr[i10] ^ b11)) & 255) << ((i10 & 7) << 3)) ^ this.f15332e;
        bArr[i10] = b11;
        this.f15350w = i10;
    }

    /* JADX INFO: renamed from: y */
    public final void m20404y(String str) {
        if (this.f15351x == 0) {
            AbstractC5049s.m20419g(this, str);
        } else {
            this.f15338k.add(str);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m20405z(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f15332e);
        int i10 = this.f15350w;
        if (i10 != 0) {
            mappedByteBuffer.put(i10, this.f15335h.f15318b[i10]);
        }
        if (this.f15337j != 0) {
            mappedByteBuffer.position(this.f15336i);
            mappedByteBuffer.put(this.f15335h.f15318b, this.f15336i, this.f15337j);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }
}
