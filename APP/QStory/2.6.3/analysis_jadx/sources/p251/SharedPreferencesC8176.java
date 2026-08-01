package p251;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0099;
import androidx.appcompat.widget.C0137;
import androidx.fragment.app.RunnableC2346;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3066;
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
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesC8176 implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final int f22512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f22516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f22517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4485 f22518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22521;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public FileChannel f22522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public FileChannel f22523;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f22524;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f22525;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public MappedByteBuffer f22526;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public MappedByteBuffer f22527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22532;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f22536;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0137 f22538;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f22539;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final byte[] f22514 = new byte[0];

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f22513 = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final HashMap f22535 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile boolean f22534 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f22537 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f22529 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ExecutorC8178 f22528 = new ExecutorC8178();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f22533 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f22530 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Handler f22531 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f22515 = true;

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
        f22512 = iIntValue;
    }

    public SharedPreferencesC8176(String str, String str2, C8177[] c8177Arr, C4485 c4485, int i) {
        int i2 = 1;
        this.f22521 = str;
        this.f22520 = str2;
        this.f22518 = c4485;
        this.f22525 = i;
        HashMap map = new HashMap();
        if (c8177Arr != null) {
            for (C8177 c8177 : c8177Arr) {
                c8177.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC3066.m6866(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c8177);
                }
            }
        }
        map.put("StringSet", C8177.f22540);
        this.f22519 = map;
        synchronized (this.f22535) {
            AbstractC8175.m13635().execute(new RunnableC8182(this, i2));
            if (!this.f22534) {
                try {
                    this.f22535.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13652(String str) {
        if (str == null || str.isEmpty()) {
            C5925.m11310("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f22515 = true;
        m13656();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC3056.m6699(this);
            if (this.f22525 != 0) {
                AbstractC3056.m6719(this);
            }
            m13653(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f22515 = true;
        return m13656();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f22535.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f22535.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f22535.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC8173 abstractC8173 = (AbstractC8173) entry.getValue();
            switch (abstractC8173.mo13622()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C8172) abstractC8173).f22507);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C8169) abstractC8173).f22504);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C8170) abstractC8173).f22505);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C8181) abstractC8173).f22546);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C8171) abstractC8173).f22506);
                    break;
                case 6:
                    C8184 c8184 = (C8184) abstractC8173;
                    objValueOf = c8184.f22553 ? AbstractC3056.m6710(this, c8184, this.f22518) : c8184.f22556;
                    break;
                case 7:
                    C8174 c8174 = (C8174) abstractC8173;
                    objValueOf = c8174.f22553 ? AbstractC3056.m6715(this, c8174, this.f22518) : c8174.f22556;
                    break;
                case 8:
                    C8180 c8180 = (C8180) abstractC8173;
                    objValueOf = c8180.f22553 ? AbstractC3056.m6709(this, c8180, this.f22518) : ((C8180) abstractC8173).f22556;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            if (objValueOf != null) {
                map.put(str, objValueOf);
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean getBoolean(String str, boolean z) {
        AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
        if (abstractC8173 != null) {
            z = abstractC8173.mo13621();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
        if (abstractC8173 != null) {
            f = abstractC8173.mo13620();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
        if (abstractC8173 != null) {
            i = abstractC8173.mo13619();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
        if (abstractC8173 != null) {
            j = abstractC8173.mo13618();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
        if (abstractC8173 == null) {
            return str2;
        }
        if (abstractC8173.mo13622() == 6) {
            C8184 c8184 = (C8184) abstractC8173;
            if (c8184.f22553) {
                String strM6710 = AbstractC3056.m6710(this, c8184, this.f22518);
                if (strM6710 != null && !strM6710.isEmpty()) {
                    c8184.f22556 = strM6710;
                    c8184.f22553 = false;
                    return strM6710;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC8173.mo13617();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m13655(str);
        }
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m13652(str);
            AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
            if (abstractC8173 != null && abstractC8173.mo13622() != 1) {
                remove(str);
                abstractC8173 = null;
            }
            C8172 c8172 = (C8172) abstractC8173;
            if (c8172 == null) {
                m13661(str, f22513[1], (byte) 1);
                C0137 c0137 = this.f22538;
                int i = c0137.f596;
                c0137.m579(z ? (byte) 1 : (byte) 0);
                m13658();
                this.f22535.put(str, new C8172(i, z));
                m13654(str);
            } else if (c8172.f22507 != z) {
                c8172.f22507 = z;
                m13659(z ? (byte) 1 : (byte) 0, c8172.f22508);
                m13654(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m13652(str);
            AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
            if (abstractC8173 != null && abstractC8173.mo13622() != 3) {
                remove(str);
                abstractC8173 = null;
            }
            C8170 c8170 = (C8170) abstractC8173;
            if (c8170 == null) {
                m13661(str, f22513[3], (byte) 3);
                C0137 c0137 = this.f22538;
                int i = c0137.f596;
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C4485 c4485 = this.f22518;
                if (c4485 != null) {
                    c4485.m9052(iFloatToRawIntBits);
                }
                c0137.m570(iFloatToRawIntBits);
                m13658();
                this.f22535.put(str, new C8170(i, f));
                m13654(str);
            } else if (c8170.f22505 != f) {
                int iFloatToRawIntBits2 = Float.floatToRawIntBits(f);
                C4485 c44852 = this.f22518;
                if (c44852 != null) {
                    c44852.m9052(iFloatToRawIntBits2);
                }
                long jM582 = ((long) (this.f22538.m582(c8170.f22508) ^ iFloatToRawIntBits2)) & 4294967295L;
                c8170.f22505 = f;
                m13662(iFloatToRawIntBits2, c8170.f22508, jM582);
                m13654(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m13652(str);
            AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
            if (abstractC8173 != null && abstractC8173.mo13622() != 2) {
                remove(str);
                abstractC8173 = null;
            }
            C8169 c8169 = (C8169) abstractC8173;
            if (c8169 == null) {
                m13661(str, f22513[2], (byte) 2);
                C0137 c0137 = this.f22538;
                int i2 = c0137.f596;
                C4485 c4485 = this.f22518;
                if (c4485 != null) {
                    c4485.m9052(i);
                }
                c0137.m570(i);
                m13658();
                this.f22535.put(str, new C8169(i2, i));
                m13654(str);
            } else if (c8169.f22504 != i) {
                C4485 c44852 = this.f22518;
                if (c44852 != null) {
                    c44852.m9052(i);
                }
                int iM582 = this.f22518 != null ? this.f22538.m582(c8169.f22508) : c8169.f22504;
                c8169.f22504 = i;
                m13662(i, c8169.f22508, ((long) (iM582 ^ i)) & 4294967295L);
                m13654(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j) {
        Throwable th;
        SharedPreferencesC8176 sharedPreferencesC8176;
        SharedPreferencesC8176 sharedPreferencesC81762;
        try {
            try {
                m13652(str);
                AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
                if (abstractC8173 != null) {
                    try {
                        if (abstractC8173.mo13622() != 4) {
                            remove(str);
                            abstractC8173 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sharedPreferencesC8176 = this;
                        throw th;
                    }
                }
                C8181 c8181 = (C8181) abstractC8173;
                if (c8181 != null) {
                    if (c8181.f22546 != j) {
                        C4485 c4485 = this.f22518;
                        if (c4485 != null) {
                            c4485.m9051(j);
                        }
                        long jM581 = j ^ (this.f22518 != null ? this.f22538.m581(c8181.f22508) : c8181.f22546);
                        c8181.f22546 = j;
                        sharedPreferencesC81762 = this;
                        sharedPreferencesC81762.m13663(j, jM581, c8181.f22508);
                        sharedPreferencesC81762.m13654(str);
                    }
                    return sharedPreferencesC81762;
                }
                m13661(str, f22513[4], (byte) 4);
                C0137 c0137 = this.f22538;
                int i = c0137.f596;
                C4485 c44852 = this.f22518;
                if (c44852 != null) {
                    c44852.m9051(j);
                }
                c0137.m575(c0137.f596, j);
                c0137.f596 += 8;
                m13658();
                this.f22535.put(str, new C8181(i, j));
                m13654(str);
                sharedPreferencesC81762 = this;
                return sharedPreferencesC81762;
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC8176 = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) {
        Throwable th;
        SharedPreferencesC8176 sharedPreferencesC8176;
        SharedPreferencesC8176 sharedPreferencesC81762;
        try {
            try {
                m13652(str);
                try {
                } catch (Throwable th2) {
                    th = th2;
                    sharedPreferencesC8176 = this;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC8176 = this;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (str2 != null) {
            AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
            if (abstractC8173 != null && abstractC8173.mo13622() != 6) {
                remove(str);
                abstractC8173 = null;
            }
            C8184 c8184 = (C8184) abstractC8173;
            if (c8184 != null && !c8184.f22553 && str2.equals(c8184.f22556)) {
                return this;
            }
            byte[] bytes = str2.isEmpty() ? f22514 : str2.getBytes(StandardCharsets.UTF_8);
            C4485 c4485 = this.f22518;
            if (c4485 != null) {
                bytes = c4485.m9053(bytes);
            }
            byte[] bArr = bytes;
            if (bArr == null) {
                Log.e("FastKV", this.f22520, new Exception("Encrypt failed"));
                return this;
            }
            sharedPreferencesC81762 = this;
            sharedPreferencesC81762.m13657(str, str2, bArr, c8184, (byte) 6);
            sharedPreferencesC81762.m13654(str);
            throw th;
        }
        remove(str);
        sharedPreferencesC81762 = this;
        return sharedPreferencesC81762;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                m13669(str, set, C8177.f22540);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f22530.contains(onSharedPreferenceChangeListener)) {
            this.f22530.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
            if (abstractC8173 != null) {
                this.f22535.remove(str);
                byte bMo13622 = abstractC8173.mo13622();
                String str2 = null;
                if (bMo13622 <= 5) {
                    int iM562 = C0137.m562(str);
                    int i = abstractC8173.f22508;
                    m13666(bMo13622, i - (iM562 + 2), i + f22513[bMo13622]);
                } else {
                    AbstractC8185 abstractC8185 = (AbstractC8185) abstractC8173;
                    m13666(bMo13622, abstractC8185.f22555, abstractC8185.f22508 + abstractC8185.f22554);
                    if (abstractC8185.f22553) {
                        str2 = (String) abstractC8185.f22556;
                    }
                }
                byte b = (byte) (bMo13622 | (-128));
                if (this.f22525 == 0) {
                    this.f22526.putLong(4, this.f22516);
                    this.f22526.put(this.f22524, b);
                    this.f22527.putLong(4, this.f22516);
                    this.f22527.put(this.f22524, b);
                } else {
                    this.f22538.m575(4, this.f22516);
                }
                this.f22524 = 0;
                if (str2 != null) {
                    if (this.f22525 == 0) {
                        AbstractC8175.m13635().execute(new RunnableC0099(this, 22, str2));
                    } else {
                        this.f22537.add(str2);
                    }
                }
                if (this.f22532 >= 8192 || this.f22533.size() >= 100) {
                    AbstractC3055.m6651(this, 0);
                }
                if (this.f22525 != 0 && this.f22515) {
                    m13656();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f22521 + " name:" + this.f22520;
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f22530.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized void m13653(String str) {
        if (this.f22530.isEmpty()) {
            return;
        }
        Iterator it = this.f22530.iterator();
        while (it.hasNext()) {
            this.f22531.post(new RunnableC2346(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 11));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13654(String str) {
        if (this.f22525 != 0 && this.f22515) {
            m13656();
        }
        m13653(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized Object m13655(String str) {
        AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
        if (abstractC8173 != null && abstractC8173.mo13622() == 8) {
            C8180 c8180 = (C8180) abstractC8173;
            if (!c8180.f22553) {
                return c8180.f22556;
            }
            LinkedHashSet linkedHashSetM6709 = AbstractC3056.m6709(this, c8180, this.f22518);
            if (linkedHashSetM6709 == null) {
                remove(str);
                return null;
            }
            c8180.f22556 = linkedHashSetM6709;
            c8180.f22553 = false;
            return linkedHashSetM6709;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m13656() {
        int i = this.f22525;
        if (i == 1) {
            this.f22528.execute(new RunnableC8182(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC3056.m6724(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13657(String str, Object obj, byte[] bArr, AbstractC8185 abstractC8185, byte b) {
        if (abstractC8185 == null) {
            int iM13660 = m13660(str, bArr, b);
            if (iM13660 > 0) {
                int length = bArr.length;
                int i = this.f22539;
                this.f22535.put(str, b == 6 ? new C8184(i, iM13660, (String) obj, length, false) : b == 7 ? new C8174(i, iM13660, obj, length, false) : new C8180(i, iM13660, obj, length, false));
                m13658();
                return;
            }
            return;
        }
        if (abstractC8185.f22553 || abstractC8185.f22554 != bArr.length) {
            int iM136602 = m13660(str, bArr, abstractC8185.mo13622());
            if (iM136602 > 0) {
                String str2 = abstractC8185.f22553 ? (String) abstractC8185.f22556 : null;
                m13666(abstractC8185.mo13622(), abstractC8185.f22555, abstractC8185.f22508 + abstractC8185.f22554);
                abstractC8185.f22555 = this.f22539;
                abstractC8185.f22508 = iM136602;
                abstractC8185.f22553 = false;
                abstractC8185.f22556 = obj;
                abstractC8185.f22554 = bArr.length;
                m13658();
                if (this.f22532 >= 8192 || this.f22533.size() >= 100) {
                    AbstractC3055.m6651(this, 0);
                }
                if (str2 != null) {
                    if (this.f22525 == 0) {
                        AbstractC8175.m13635().execute(new RunnableC0099(this, 22, str2));
                        return;
                    } else {
                        this.f22537.add(str2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i2 = abstractC8185.f22508;
        int length2 = bArr.length;
        this.f22516 ^= this.f22538.m566(i2, length2);
        C0137 c0137 = this.f22538;
        c0137.f596 = i2;
        c0137.m571(bArr);
        long jM566 = this.f22516 ^ this.f22538.m566(i2, length2);
        this.f22516 = jM566;
        if (this.f22525 == 0) {
            this.f22526.putInt(0, -1);
            this.f22526.putLong(4, this.f22516);
            this.f22526.position(i2);
            this.f22526.put(bArr);
            MappedByteBuffer mappedByteBuffer = this.f22526;
            int i3 = this.f22517 - 12;
            if (this.f22518 != null) {
                i3 |= 1073741824;
            }
            mappedByteBuffer.putInt(0, i3);
            this.f22527.putLong(4, this.f22516);
            this.f22527.position(i2);
            this.f22527.put(bArr);
        } else {
            this.f22538.m575(4, jM566);
        }
        abstractC8185.f22556 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m13658() {
        this.f22516 ^= this.f22538.m566(this.f22539, this.f22536);
        int i = this.f22517 - 12;
        if (this.f22518 != null) {
            i |= 1073741824;
        }
        if (this.f22525 == 0) {
            this.f22526.putInt(0, -1);
            m13667(this.f22526);
            this.f22526.putInt(0, i);
            this.f22527.putInt(0, i);
            m13667(this.f22527);
        } else {
            this.f22538.m574(0, i);
            this.f22538.m575(4, this.f22516);
        }
        this.f22524 = 0;
        this.f22536 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13659(byte b, int i) {
        long jM6727 = this.f22516 ^ AbstractC3056.m6727(i, 1L);
        this.f22516 = jM6727;
        if (this.f22525 == 0) {
            this.f22526.putLong(4, jM6727);
            this.f22526.put(i, b);
            this.f22527.putLong(4, this.f22516);
            this.f22527.put(i, b);
        } else {
            this.f22538.m575(4, jM6727);
        }
        ((byte[]) this.f22538.f594)[i] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m13660(String str, byte[] bArr, byte b) {
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
        m13661(str, (z ? 4 : 2) + bArr.length, b);
        C0137 c0137 = this.f22538;
        if (z) {
            c0137.m570(bArr.length);
        } else {
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0137.f594;
            int i = c0137.f596;
            int i2 = i + 1;
            c0137.f596 = i2;
            bArr2[i] = (byte) length;
            c0137.f596 = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        C0137 c01372 = this.f22538;
        int i3 = c01372.f596;
        c01372.m571(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m13661(String str, int i, byte b) {
        C4485 c4485 = this.f22518;
        if (c4485 != null) {
            byte[] bArrM9053 = c4485.m9053(str.getBytes(StandardCharsets.UTF_8));
            int length = bArrM9053.length;
            m13665(b, length, i);
            this.f22538.m579((byte) length);
            C0137 c0137 = this.f22538;
            System.arraycopy(bArrM9053, 0, (byte[]) c0137.f594, c0137.f596, length);
            this.f22538.f596 += length;
            return true;
        }
        int iM562 = C0137.m562(str);
        m13665(b, iM562, i);
        this.f22538.m579((byte) iM562);
        int length2 = str.length();
        C0137 c01372 = this.f22538;
        if (iM562 != length2) {
            c01372.m572(str);
            return true;
        }
        str.getBytes(0, iM562, (byte[]) c01372.f594, c01372.f596);
        this.f22538.f596 += iM562;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13662(int i, int i2, long j) {
        long jM6727 = AbstractC3056.m6727(i2, j) ^ this.f22516;
        this.f22516 = jM6727;
        if (this.f22525 == 0) {
            this.f22526.putLong(4, jM6727);
            this.f22526.putInt(i2, i);
            this.f22527.putLong(4, this.f22516);
            this.f22527.putInt(i2, i);
        } else {
            this.f22538.m575(4, jM6727);
        }
        this.f22538.m574(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13663(long j, long j2, int i) {
        long jM6727 = AbstractC3056.m6727(i, j2) ^ this.f22516;
        this.f22516 = jM6727;
        if (this.f22525 == 0) {
            this.f22526.putLong(4, jM6727);
            this.f22526.putLong(i, j);
            this.f22527.putLong(4, this.f22516);
            this.f22527.putLong(i, j);
        } else {
            this.f22538.m575(4, jM6727);
        }
        this.f22538.m575(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final synchronized void m13664(String str, byte[] bArr) {
        Throwable th;
        SharedPreferencesC8176 sharedPreferencesC8176;
        SharedPreferencesC8176 sharedPreferencesC81762;
        try {
            try {
                m13652(str);
            } catch (Throwable th2) {
                th = th2;
                sharedPreferencesC8176 = this;
                th = th;
                throw th;
            }
            try {
                if (bArr == null) {
                    remove(str);
                    sharedPreferencesC81762 = this;
                } else {
                    AbstractC8173 abstractC8173 = (AbstractC8173) this.f22535.get(str);
                    if (abstractC8173 != null && abstractC8173.mo13622() != 7) {
                        remove(str);
                        abstractC8173 = null;
                    }
                    C8174 c8174 = (C8174) abstractC8173;
                    C4485 c4485 = this.f22518;
                    sharedPreferencesC81762 = this;
                    sharedPreferencesC81762.m13657(str, bArr, c4485 != null ? c4485.m9053(bArr) : bArr, c8174, (byte) 7);
                    sharedPreferencesC81762.m13654(str);
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC8176 = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13665(byte b, int i, int i2) {
        if (i > 255) {
            C5925.m11310("key's length must less than 256");
            return;
        }
        int i3 = i + 2 + i2;
        this.f22536 = i3;
        int length = ((byte[]) this.f22538.f594).length;
        int i4 = this.f22517 + i3;
        if (i4 >= length) {
            int i5 = this.f22532;
            if (i5 <= i3 || i5 <= 8192) {
                int iM6705 = AbstractC3056.m6705(length, i4);
                byte[] bArr = new byte[iM6705];
                System.arraycopy((byte[]) this.f22538.f594, 0, bArr, 0, this.f22517);
                this.f22538.f594 = bArr;
                if (this.f22525 == 0) {
                    MappedByteBuffer mappedByteBufferM6677 = AbstractC3056.m6677(this.f22523, iM6705);
                    MappedByteBuffer mappedByteBufferM66772 = AbstractC3056.m6677(this.f22522, iM6705);
                    if (mappedByteBufferM6677 == null || mappedByteBufferM66772 == null) {
                        Log.e("FastKV", this.f22520, new Exception("map failed"));
                        int i6 = this.f22517 - 12;
                        if (this.f22518 != null) {
                            i6 |= 1073741824;
                        }
                        this.f22538.m574(0, i6);
                        this.f22538.m575(4, this.f22516);
                        AbstractC3056.m6726(this);
                    } else {
                        this.f22526 = mappedByteBufferM6677;
                        this.f22527 = mappedByteBufferM66772;
                    }
                }
            } else {
                AbstractC3055.m6651(this, i3);
            }
        }
        int i7 = this.f22517;
        this.f22539 = i7;
        this.f22517 = this.f22536 + i7;
        C0137 c0137 = this.f22538;
        c0137.f596 = i7;
        c0137.m579(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13666(byte b, int i, int i2) {
        this.f22532 = (i2 - i) + this.f22532;
        C8179 c8179 = new C8179();
        c8179.f22544 = i;
        c8179.f22543 = i2;
        this.f22533.add(c8179);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f22538.f594;
        this.f22516 = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f22516;
        bArr[i] = b2;
        this.f22524 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13667(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f22516);
        int i = this.f22524;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f22538.f594)[i]);
        }
        if (this.f22536 != 0) {
            mappedByteBuffer.position(this.f22539);
            mappedByteBuffer.put((byte[]) this.f22538.f594, this.f22539, this.f22536);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #2 {all -> 0x001a, blocks: (B:6:0x000f, B:8:0x0015, B:14:0x0023, B:16:0x0036, B:17:0x0039, B:25:0x0064), top: B:44:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x0001, B:12:0x001f, B:19:0x0056, B:23:0x0060, B:26:0x0067), top: B:40:0x0001 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m13668(java.lang.String r9, double r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            m13652(r9)     // Catch: java.lang.Throwable -> L80
            java.util.HashMap r0 = r8.f22535     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L80
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪世苏兰哲 r0 = (p251.AbstractC8173) r0     // Catch: java.lang.Throwable -> L80
            r1 = 5
            if (r0 == 0) goto L1f
            byte r2 = r0.mo13622()     // Catch: java.lang.Throwable -> L1a
            if (r2 == r1) goto L1f
            r8.remove(r9)     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            goto L1f
        L1a:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L8a
        L1f:
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪世哲兰苏 r0 = (p251.C8171) r0     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L56
            int[] r0 = p251.SharedPreferencesC8176.f22513     // Catch: java.lang.Throwable -> L1a
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1a
            r8.m13661(r9, r0, r1)     // Catch: java.lang.Throwable -> L1a
            androidx.appcompat.widget.飘花落叶言子世苏楪哲兰 r0 = r8.f22538     // Catch: java.lang.Throwable -> L1a
            int r1 = r0.f596     // Catch: java.lang.Throwable -> L1a
            long r2 = java.lang.Double.doubleToRawLongBits(r10)     // Catch: java.lang.Throwable -> L1a
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = r8.f22518     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L39
            r4.m9051(r2)     // Catch: java.lang.Throwable -> L1a
        L39:
            int r4 = r0.f596     // Catch: java.lang.Throwable -> L1a
            r0.m575(r4, r2)     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.f596     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 + 8
            r0.f596 = r2     // Catch: java.lang.Throwable -> L1a
            r8.m13658()     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap r0 = r8.f22535     // Catch: java.lang.Throwable -> L1a
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪世哲兰苏 r2 = new 飘花落叶言楪兰子苏哲世.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1, r10)     // Catch: java.lang.Throwable -> L1a
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L1a
            r8.m13654(r9)     // Catch: java.lang.Throwable -> L1a
        L54:
            r2 = r8
            goto L88
        L56:
            double r1 = r0.f22506     // Catch: java.lang.Throwable -> L80
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L54
            long r3 = java.lang.Double.doubleToRawLongBits(r10)     // Catch: java.lang.Throwable -> L83
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = r8.f22518     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L67
            r1.m9051(r3)     // Catch: java.lang.Throwable -> L1a
        L67:
            androidx.appcompat.widget.飘花落叶言子世苏楪哲兰 r1 = r8.f22538     // Catch: java.lang.Throwable -> L80
            int r2 = r0.f22508     // Catch: java.lang.Throwable -> L80
            long r1 = r1.m581(r2)     // Catch: java.lang.Throwable -> L80
            long r5 = r3 ^ r1
            r0.f22506 = r10     // Catch: java.lang.Throwable -> L80
            int r7 = r0.f22508     // Catch: java.lang.Throwable -> L80
            r2 = r8
            r2.m13663(r3, r5, r7)     // Catch: java.lang.Throwable -> L7d
            r2.m13654(r9)     // Catch: java.lang.Throwable -> L7d
            goto L88
        L7d:
            r0 = move-exception
        L7e:
            r9 = r0
            goto L8a
        L80:
            r0 = move-exception
            r2 = r8
            goto L7e
        L83:
            r0 = move-exception
            r2 = r8
            r8 = r0
            r9 = r8
            goto L8a
        L88:
            monitor-exit(r2)
            return
        L8a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p251.SharedPreferencesC8176.m13668(java.lang.String, double):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized void m13669(String str, Object obj, C8177 c8177) {
        SharedPreferencesC8176 sharedPreferencesC8176;
        Throwable th;
        byte[] bArrM13670;
        try {
            try {
                m13652(str);
                if (c8177 == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f22519.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC8173 abstractC8173 = null;
                    try {
                        try {
                            bArrM13670 = C8177.m13670(obj);
                        } catch (Throwable th2) {
                            sharedPreferencesC8176 = this;
                            th = th2;
                        }
                    } catch (Exception e) {
                        Log.e("FastKV", this.f22520, e);
                        bArrM13670 = null;
                    }
                    if (bArrM13670 == null) {
                        remove(str);
                        return;
                    }
                    AbstractC8173 abstractC81732 = (AbstractC8173) this.f22535.get(str);
                    if (abstractC81732 == null || abstractC81732.mo13622() == 8) {
                        abstractC8173 = abstractC81732;
                    } else {
                        remove(str);
                    }
                    C8180 c8180 = (C8180) abstractC8173;
                    int iM562 = C0137.m562("StringSet");
                    C0137 c0137 = new C0137(iM562 + 1 + bArrM13670.length);
                    c0137.m579((byte) iM562);
                    c0137.m572("StringSet");
                    c0137.m571(bArrM13670);
                    byte[] bArrM9053 = (byte[]) c0137.f594;
                    C4485 c4485 = this.f22518;
                    if (c4485 != null) {
                        bArrM9053 = c4485.m9053(bArrM9053);
                    }
                    byte[] bArr = bArrM9053;
                    if (bArr == null) {
                        return;
                    }
                    m13657(str, obj, bArr, c8180, (byte) 8);
                    m13654(str);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sharedPreferencesC8176 = this;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            sharedPreferencesC8176 = this;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
