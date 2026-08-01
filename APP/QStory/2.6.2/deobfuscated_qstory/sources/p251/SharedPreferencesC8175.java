package p251;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0099;
import androidx.appcompat.widget.C0137;
import androidx.fragment.app.RunnableC2346;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
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
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC8175 implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final int f22513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f22517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f22518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4484 f22519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public FileChannel f22523;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public FileChannel f22524;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f22525;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f22526;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public MappedByteBuffer f22527;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public MappedByteBuffer f22528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22533;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f22537;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0137 f22539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f22540;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final byte[] f22515 = new byte[0];

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f22514 = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final HashMap f22536 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile boolean f22535 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f22538 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f22530 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ExecutorC8177 f22529 = new ExecutorC8177();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f22534 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f22531 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Handler f22532 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f22516 = true;

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
        f22513 = iIntValue;
    }

    public SharedPreferencesC8175(String str, String str2, C8176[] c8176Arr, C4484 c4484, int i) {
        int i2 = 1;
        this.f22522 = str;
        this.f22521 = str2;
        this.f22519 = c4484;
        this.f22526 = i;
        HashMap map = new HashMap();
        if (c8176Arr != null) {
            for (C8176 c8176 : c8176Arr) {
                c8176.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC3054.m6618(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c8176);
                }
            }
        }
        map.put("StringSet", C8176.f22541);
        this.f22520 = map;
        synchronized (this.f22536) {
            AbstractC8174.m13623().execute(new RunnableC8181(this, i2));
            if (!this.f22535) {
                try {
                    this.f22536.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13628(String str) {
        if (str == null || str.isEmpty()) {
            C5919.m11249("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f22516 = true;
        m13632();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC3056.m6694(this);
            if (this.f22526 != 0) {
                AbstractC3056.m6692(this);
            }
            m13629(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f22516 = true;
        return m13632();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f22536.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f22536.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f22536.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC8172 abstractC8172 = (AbstractC8172) entry.getValue();
            switch (abstractC8172.mo13593()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C8171) abstractC8172).f22509);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C8168) abstractC8172).f22506);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C8169) abstractC8172).f22507);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C8180) abstractC8172).f22547);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C8170) abstractC8172).f22508);
                    break;
                case 6:
                    C8183 c8183 = (C8183) abstractC8172;
                    objValueOf = c8183.f22554 ? AbstractC3056.m6667(this, c8183, this.f22519) : c8183.f22557;
                    break;
                case 7:
                    C8173 c8173 = (C8173) abstractC8172;
                    objValueOf = c8173.f22554 ? AbstractC3056.m6691(this, c8173, this.f22519) : c8173.f22557;
                    break;
                case 8:
                    C8179 c8179 = (C8179) abstractC8172;
                    objValueOf = c8179.f22554 ? AbstractC3056.m6669(this, c8179, this.f22519) : ((C8179) abstractC8172).f22557;
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
        AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
        if (abstractC8172 != null) {
            z = abstractC8172.mo13592();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
        if (abstractC8172 != null) {
            f = abstractC8172.mo13591();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
        if (abstractC8172 != null) {
            i = abstractC8172.mo13590();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
        if (abstractC8172 != null) {
            j = abstractC8172.mo13589();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
        if (abstractC8172 == null) {
            return str2;
        }
        if (abstractC8172.mo13593() == 6) {
            C8183 c8183 = (C8183) abstractC8172;
            if (c8183.f22554) {
                String strM6667 = AbstractC3056.m6667(this, c8183, this.f22519);
                if (strM6667 != null && !strM6667.isEmpty()) {
                    c8183.f22557 = strM6667;
                    c8183.f22554 = false;
                    return strM6667;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC8172.mo13588();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m13631(str);
        }
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m13628(str);
            AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
            if (abstractC8172 != null && abstractC8172.mo13593() != 1) {
                remove(str);
                abstractC8172 = null;
            }
            C8171 c8171 = (C8171) abstractC8172;
            if (c8171 == null) {
                m13637(str, f22514[1], (byte) 1);
                C0137 c0137 = this.f22539;
                int i = c0137.f596;
                c0137.m578(z ? (byte) 1 : (byte) 0);
                m13634();
                this.f22536.put(str, new C8171(i, z));
                m13630(str);
            } else if (c8171.f22509 != z) {
                c8171.f22509 = z;
                m13635(z ? (byte) 1 : (byte) 0, c8171.f22510);
                m13630(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m13628(str);
            AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
            if (abstractC8172 != null && abstractC8172.mo13593() != 3) {
                remove(str);
                abstractC8172 = null;
            }
            C8169 c8169 = (C8169) abstractC8172;
            if (c8169 == null) {
                m13637(str, f22514[3], (byte) 3);
                C0137 c0137 = this.f22539;
                int i = c0137.f596;
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C4484 c4484 = this.f22519;
                if (c4484 != null) {
                    c4484.m9062(iFloatToRawIntBits);
                }
                c0137.m569(iFloatToRawIntBits);
                m13634();
                this.f22536.put(str, new C8169(i, f));
                m13630(str);
            } else if (c8169.f22507 != f) {
                int iFloatToRawIntBits2 = Float.floatToRawIntBits(f);
                C4484 c44842 = this.f22519;
                if (c44842 != null) {
                    c44842.m9062(iFloatToRawIntBits2);
                }
                long jM581 = ((long) (this.f22539.m581(c8169.f22510) ^ iFloatToRawIntBits2)) & 4294967295L;
                c8169.f22507 = f;
                m13638(iFloatToRawIntBits2, c8169.f22510, jM581);
                m13630(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m13628(str);
            AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
            if (abstractC8172 != null && abstractC8172.mo13593() != 2) {
                remove(str);
                abstractC8172 = null;
            }
            C8168 c8168 = (C8168) abstractC8172;
            if (c8168 == null) {
                m13637(str, f22514[2], (byte) 2);
                C0137 c0137 = this.f22539;
                int i2 = c0137.f596;
                C4484 c4484 = this.f22519;
                if (c4484 != null) {
                    c4484.m9062(i);
                }
                c0137.m569(i);
                m13634();
                this.f22536.put(str, new C8168(i2, i));
                m13630(str);
            } else if (c8168.f22506 != i) {
                C4484 c44842 = this.f22519;
                if (c44842 != null) {
                    c44842.m9062(i);
                }
                int iM581 = this.f22519 != null ? this.f22539.m581(c8168.f22510) : c8168.f22506;
                c8168.f22506 = i;
                m13638(i, c8168.f22510, ((long) (iM581 ^ i)) & 4294967295L);
                m13630(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j) {
        Throwable th;
        SharedPreferencesC8175 sharedPreferencesC8175;
        SharedPreferencesC8175 sharedPreferencesC81752;
        try {
            try {
                m13628(str);
                AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
                if (abstractC8172 != null) {
                    try {
                        if (abstractC8172.mo13593() != 4) {
                            remove(str);
                            abstractC8172 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sharedPreferencesC8175 = this;
                        throw th;
                    }
                }
                C8180 c8180 = (C8180) abstractC8172;
                if (c8180 != null) {
                    if (c8180.f22547 != j) {
                        C4484 c4484 = this.f22519;
                        if (c4484 != null) {
                            c4484.m9061(j);
                        }
                        long jM580 = j ^ (this.f22519 != null ? this.f22539.m580(c8180.f22510) : c8180.f22547);
                        c8180.f22547 = j;
                        sharedPreferencesC81752 = this;
                        sharedPreferencesC81752.m13639(j, jM580, c8180.f22510);
                        sharedPreferencesC81752.m13630(str);
                    }
                    return sharedPreferencesC81752;
                }
                m13637(str, f22514[4], (byte) 4);
                C0137 c0137 = this.f22539;
                int i = c0137.f596;
                C4484 c44842 = this.f22519;
                if (c44842 != null) {
                    c44842.m9061(j);
                }
                c0137.m574(c0137.f596, j);
                c0137.f596 += 8;
                m13634();
                this.f22536.put(str, new C8180(i, j));
                m13630(str);
                sharedPreferencesC81752 = this;
                return sharedPreferencesC81752;
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC8175 = this;
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
        SharedPreferencesC8175 sharedPreferencesC8175;
        SharedPreferencesC8175 sharedPreferencesC81752;
        try {
            try {
                m13628(str);
                try {
                } catch (Throwable th2) {
                    th = th2;
                    sharedPreferencesC8175 = this;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC8175 = this;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (str2 != null) {
            AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
            if (abstractC8172 != null && abstractC8172.mo13593() != 6) {
                remove(str);
                abstractC8172 = null;
            }
            C8183 c8183 = (C8183) abstractC8172;
            if (c8183 != null && !c8183.f22554 && str2.equals(c8183.f22557)) {
                return this;
            }
            byte[] bytes = str2.isEmpty() ? f22515 : str2.getBytes(StandardCharsets.UTF_8);
            C4484 c4484 = this.f22519;
            if (c4484 != null) {
                bytes = c4484.m9063(bytes);
            }
            byte[] bArr = bytes;
            if (bArr == null) {
                Log.e("FastKV", this.f22521, new Exception("Encrypt failed"));
                return this;
            }
            sharedPreferencesC81752 = this;
            sharedPreferencesC81752.m13633(str, str2, bArr, c8183, (byte) 6);
            sharedPreferencesC81752.m13630(str);
            throw th;
        }
        remove(str);
        sharedPreferencesC81752 = this;
        return sharedPreferencesC81752;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                m13645(str, set, C8176.f22541);
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
        if (!this.f22531.contains(onSharedPreferenceChangeListener)) {
            this.f22531.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
            if (abstractC8172 != null) {
                this.f22536.remove(str);
                byte bMo13593 = abstractC8172.mo13593();
                String str2 = null;
                if (bMo13593 <= 5) {
                    int iM561 = C0137.m561(str);
                    int i = abstractC8172.f22510;
                    m13642(bMo13593, i - (iM561 + 2), i + f22514[bMo13593]);
                } else {
                    AbstractC8184 abstractC8184 = (AbstractC8184) abstractC8172;
                    m13642(bMo13593, abstractC8184.f22556, abstractC8184.f22510 + abstractC8184.f22555);
                    if (abstractC8184.f22554) {
                        str2 = (String) abstractC8184.f22557;
                    }
                }
                byte b = (byte) (bMo13593 | (-128));
                if (this.f22526 == 0) {
                    this.f22527.putLong(4, this.f22517);
                    this.f22527.put(this.f22525, b);
                    this.f22528.putLong(4, this.f22517);
                    this.f22528.put(this.f22525, b);
                } else {
                    this.f22539.m574(4, this.f22517);
                }
                this.f22525 = 0;
                if (str2 != null) {
                    if (this.f22526 == 0) {
                        AbstractC8174.m13623().execute(new RunnableC0099(this, 22, str2));
                    } else {
                        this.f22538.add(str2);
                    }
                }
                if (this.f22533 >= 8192 || this.f22534.size() >= 100) {
                    AbstractC3055.m6646(this, 0);
                }
                if (this.f22526 != 0 && this.f22516) {
                    m13632();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f22522 + " name:" + this.f22521;
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f22531.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized void m13629(String str) {
        if (this.f22531.isEmpty()) {
            return;
        }
        Iterator it = this.f22531.iterator();
        while (it.hasNext()) {
            this.f22532.post(new RunnableC2346(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 11));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13630(String str) {
        if (this.f22526 != 0 && this.f22516) {
            m13632();
        }
        m13629(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized Object m13631(String str) {
        AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
        if (abstractC8172 != null && abstractC8172.mo13593() == 8) {
            C8179 c8179 = (C8179) abstractC8172;
            if (!c8179.f22554) {
                return c8179.f22557;
            }
            LinkedHashSet linkedHashSetM6669 = AbstractC3056.m6669(this, c8179, this.f22519);
            if (linkedHashSetM6669 == null) {
                remove(str);
                return null;
            }
            c8179.f22557 = linkedHashSetM6669;
            c8179.f22554 = false;
            return linkedHashSetM6669;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m13632() {
        int i = this.f22526;
        if (i == 1) {
            this.f22529.execute(new RunnableC8181(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC3056.m6705(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13633(String str, Object obj, byte[] bArr, AbstractC8184 abstractC8184, byte b) {
        if (abstractC8184 == null) {
            int iM13636 = m13636(str, bArr, b);
            if (iM13636 > 0) {
                int length = bArr.length;
                int i = this.f22540;
                this.f22536.put(str, b == 6 ? new C8183(i, iM13636, (String) obj, length, false) : b == 7 ? new C8173(i, iM13636, obj, length, false) : new C8179(i, iM13636, obj, length, false));
                m13634();
                return;
            }
            return;
        }
        if (abstractC8184.f22554 || abstractC8184.f22555 != bArr.length) {
            int iM136362 = m13636(str, bArr, abstractC8184.mo13593());
            if (iM136362 > 0) {
                String str2 = abstractC8184.f22554 ? (String) abstractC8184.f22557 : null;
                m13642(abstractC8184.mo13593(), abstractC8184.f22556, abstractC8184.f22510 + abstractC8184.f22555);
                abstractC8184.f22556 = this.f22540;
                abstractC8184.f22510 = iM136362;
                abstractC8184.f22554 = false;
                abstractC8184.f22557 = obj;
                abstractC8184.f22555 = bArr.length;
                m13634();
                if (this.f22533 >= 8192 || this.f22534.size() >= 100) {
                    AbstractC3055.m6646(this, 0);
                }
                if (str2 != null) {
                    if (this.f22526 == 0) {
                        AbstractC8174.m13623().execute(new RunnableC0099(this, 22, str2));
                        return;
                    } else {
                        this.f22538.add(str2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i2 = abstractC8184.f22510;
        int length2 = bArr.length;
        this.f22517 ^= this.f22539.m565(i2, length2);
        C0137 c0137 = this.f22539;
        c0137.f596 = i2;
        c0137.m570(bArr);
        long jM565 = this.f22517 ^ this.f22539.m565(i2, length2);
        this.f22517 = jM565;
        if (this.f22526 == 0) {
            this.f22527.putInt(0, -1);
            this.f22527.putLong(4, this.f22517);
            this.f22527.position(i2);
            this.f22527.put(bArr);
            MappedByteBuffer mappedByteBuffer = this.f22527;
            int i3 = this.f22518 - 12;
            if (this.f22519 != null) {
                i3 |= 1073741824;
            }
            mappedByteBuffer.putInt(0, i3);
            this.f22528.putLong(4, this.f22517);
            this.f22528.position(i2);
            this.f22528.put(bArr);
        } else {
            this.f22539.m574(4, jM565);
        }
        abstractC8184.f22557 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m13634() {
        this.f22517 ^= this.f22539.m565(this.f22540, this.f22537);
        int i = this.f22518 - 12;
        if (this.f22519 != null) {
            i |= 1073741824;
        }
        if (this.f22526 == 0) {
            this.f22527.putInt(0, -1);
            m13643(this.f22527);
            this.f22527.putInt(0, i);
            this.f22528.putInt(0, i);
            m13643(this.f22528);
        } else {
            this.f22539.m573(0, i);
            this.f22539.m574(4, this.f22517);
        }
        this.f22525 = 0;
        this.f22537 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13635(byte b, int i) {
        long jM6701 = this.f22517 ^ AbstractC3056.m6701(i, 1L);
        this.f22517 = jM6701;
        if (this.f22526 == 0) {
            this.f22527.putLong(4, jM6701);
            this.f22527.put(i, b);
            this.f22528.putLong(4, this.f22517);
            this.f22528.put(i, b);
        } else {
            this.f22539.m574(4, jM6701);
        }
        ((byte[]) this.f22539.f594)[i] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m13636(String str, byte[] bArr, byte b) {
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
        m13637(str, (z ? 4 : 2) + bArr.length, b);
        C0137 c0137 = this.f22539;
        if (z) {
            c0137.m569(bArr.length);
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
        C0137 c01372 = this.f22539;
        int i3 = c01372.f596;
        c01372.m570(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m13637(String str, int i, byte b) {
        C4484 c4484 = this.f22519;
        if (c4484 != null) {
            byte[] bArrM9063 = c4484.m9063(str.getBytes(StandardCharsets.UTF_8));
            int length = bArrM9063.length;
            m13641(b, length, i);
            this.f22539.m578((byte) length);
            C0137 c0137 = this.f22539;
            System.arraycopy(bArrM9063, 0, (byte[]) c0137.f594, c0137.f596, length);
            this.f22539.f596 += length;
            return true;
        }
        int iM561 = C0137.m561(str);
        m13641(b, iM561, i);
        this.f22539.m578((byte) iM561);
        int length2 = str.length();
        C0137 c01372 = this.f22539;
        if (iM561 != length2) {
            c01372.m571(str);
            return true;
        }
        str.getBytes(0, iM561, (byte[]) c01372.f594, c01372.f596);
        this.f22539.f596 += iM561;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13638(int i, int i2, long j) {
        long jM6701 = AbstractC3056.m6701(i2, j) ^ this.f22517;
        this.f22517 = jM6701;
        if (this.f22526 == 0) {
            this.f22527.putLong(4, jM6701);
            this.f22527.putInt(i2, i);
            this.f22528.putLong(4, this.f22517);
            this.f22528.putInt(i2, i);
        } else {
            this.f22539.m574(4, jM6701);
        }
        this.f22539.m573(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13639(long j, long j2, int i) {
        long jM6701 = AbstractC3056.m6701(i, j2) ^ this.f22517;
        this.f22517 = jM6701;
        if (this.f22526 == 0) {
            this.f22527.putLong(4, jM6701);
            this.f22527.putLong(i, j);
            this.f22528.putLong(4, this.f22517);
            this.f22528.putLong(i, j);
        } else {
            this.f22539.m574(4, jM6701);
        }
        this.f22539.m574(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final synchronized void m13640(String str, byte[] bArr) {
        Throwable th;
        SharedPreferencesC8175 sharedPreferencesC8175;
        SharedPreferencesC8175 sharedPreferencesC81752;
        try {
            try {
                m13628(str);
            } catch (Throwable th2) {
                th = th2;
                sharedPreferencesC8175 = this;
                th = th;
                throw th;
            }
            try {
                if (bArr == null) {
                    remove(str);
                    sharedPreferencesC81752 = this;
                } else {
                    AbstractC8172 abstractC8172 = (AbstractC8172) this.f22536.get(str);
                    if (abstractC8172 != null && abstractC8172.mo13593() != 7) {
                        remove(str);
                        abstractC8172 = null;
                    }
                    C8173 c8173 = (C8173) abstractC8172;
                    C4484 c4484 = this.f22519;
                    sharedPreferencesC81752 = this;
                    sharedPreferencesC81752.m13633(str, bArr, c4484 != null ? c4484.m9063(bArr) : bArr, c8173, (byte) 7);
                    sharedPreferencesC81752.m13630(str);
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC8175 = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13641(byte b, int i, int i2) {
        if (i > 255) {
            C5919.m11249("key's length must less than 256");
            return;
        }
        int i3 = i + 2 + i2;
        this.f22537 = i3;
        int length = ((byte[]) this.f22539.f594).length;
        int i4 = this.f22518 + i3;
        if (i4 >= length) {
            int i5 = this.f22533;
            if (i5 <= i3 || i5 <= 8192) {
                int iM6685 = AbstractC3056.m6685(length, i4);
                byte[] bArr = new byte[iM6685];
                System.arraycopy((byte[]) this.f22539.f594, 0, bArr, 0, this.f22518);
                this.f22539.f594 = bArr;
                if (this.f22526 == 0) {
                    MappedByteBuffer mappedByteBufferM6653 = AbstractC3056.m6653(this.f22524, iM6685);
                    MappedByteBuffer mappedByteBufferM66532 = AbstractC3056.m6653(this.f22523, iM6685);
                    if (mappedByteBufferM6653 == null || mappedByteBufferM66532 == null) {
                        Log.e("FastKV", this.f22521, new Exception("map failed"));
                        int i6 = this.f22518 - 12;
                        if (this.f22519 != null) {
                            i6 |= 1073741824;
                        }
                        this.f22539.m573(0, i6);
                        this.f22539.m574(4, this.f22517);
                        AbstractC3056.m6710(this);
                    } else {
                        this.f22527 = mappedByteBufferM6653;
                        this.f22528 = mappedByteBufferM66532;
                    }
                }
            } else {
                AbstractC3055.m6646(this, i3);
            }
        }
        int i7 = this.f22518;
        this.f22540 = i7;
        this.f22518 = this.f22537 + i7;
        C0137 c0137 = this.f22539;
        c0137.f596 = i7;
        c0137.m578(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13642(byte b, int i, int i2) {
        this.f22533 = (i2 - i) + this.f22533;
        C8178 c8178 = new C8178();
        c8178.f22545 = i;
        c8178.f22544 = i2;
        this.f22534.add(c8178);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f22539.f594;
        this.f22517 = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f22517;
        bArr[i] = b2;
        this.f22525 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13643(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f22517);
        int i = this.f22525;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f22539.f594)[i]);
        }
        if (this.f22537 != 0) {
            mappedByteBuffer.position(this.f22540);
            mappedByteBuffer.put((byte[]) this.f22539.f594, this.f22540, this.f22537);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #2 {all -> 0x001a, blocks: (B:6:0x000f, B:8:0x0015, B:14:0x0023, B:16:0x0036, B:17:0x0039, B:25:0x0064), top: B:44:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x0001, B:12:0x001f, B:19:0x0056, B:23:0x0060, B:26:0x0067), top: B:40:0x0001 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m13644(java.lang.String r9, double r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            m13628(r9)     // Catch: java.lang.Throwable -> L80
            java.util.HashMap r0 = r8.f22536     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L80
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪世苏兰哲 r0 = (p251.AbstractC8172) r0     // Catch: java.lang.Throwable -> L80
            r1 = 5
            if (r0 == 0) goto L1f
            byte r2 = r0.mo13593()     // Catch: java.lang.Throwable -> L1a
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
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪世哲兰苏 r0 = (p251.C8170) r0     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L56
            int[] r0 = p251.SharedPreferencesC8175.f22514     // Catch: java.lang.Throwable -> L1a
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1a
            r8.m13637(r9, r0, r1)     // Catch: java.lang.Throwable -> L1a
            androidx.appcompat.widget.飘花落叶言子世苏楪哲兰 r0 = r8.f22539     // Catch: java.lang.Throwable -> L1a
            int r1 = r0.f596     // Catch: java.lang.Throwable -> L1a
            long r2 = java.lang.Double.doubleToRawLongBits(r10)     // Catch: java.lang.Throwable -> L1a
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = r8.f22519     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L39
            r4.m9061(r2)     // Catch: java.lang.Throwable -> L1a
        L39:
            int r4 = r0.f596     // Catch: java.lang.Throwable -> L1a
            r0.m574(r4, r2)     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.f596     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 + 8
            r0.f596 = r2     // Catch: java.lang.Throwable -> L1a
            r8.m13634()     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap r0 = r8.f22536     // Catch: java.lang.Throwable -> L1a
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪世哲兰苏 r2 = new 飘花落叶言楪兰子苏哲世.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1, r10)     // Catch: java.lang.Throwable -> L1a
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L1a
            r8.m13630(r9)     // Catch: java.lang.Throwable -> L1a
        L54:
            r2 = r8
            goto L88
        L56:
            double r1 = r0.f22508     // Catch: java.lang.Throwable -> L80
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L54
            long r3 = java.lang.Double.doubleToRawLongBits(r10)     // Catch: java.lang.Throwable -> L83
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = r8.f22519     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L67
            r1.m9061(r3)     // Catch: java.lang.Throwable -> L1a
        L67:
            androidx.appcompat.widget.飘花落叶言子世苏楪哲兰 r1 = r8.f22539     // Catch: java.lang.Throwable -> L80
            int r2 = r0.f22510     // Catch: java.lang.Throwable -> L80
            long r1 = r1.m580(r2)     // Catch: java.lang.Throwable -> L80
            long r5 = r3 ^ r1
            r0.f22508 = r10     // Catch: java.lang.Throwable -> L80
            int r7 = r0.f22510     // Catch: java.lang.Throwable -> L80
            r2 = r8
            r2.m13639(r3, r5, r7)     // Catch: java.lang.Throwable -> L7d
            r2.m13630(r9)     // Catch: java.lang.Throwable -> L7d
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
        throw new UnsupportedOperationException("Method not decompiled: p251.SharedPreferencesC8175.m13644(java.lang.String, double):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized void m13645(String str, Object obj, C8176 c8176) {
        SharedPreferencesC8175 sharedPreferencesC8175;
        Throwable th;
        byte[] bArrM13646;
        try {
            try {
                m13628(str);
                if (c8176 == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f22520.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC8172 abstractC8172 = null;
                    try {
                        try {
                            bArrM13646 = C8176.m13646(obj);
                        } catch (Throwable th2) {
                            sharedPreferencesC8175 = this;
                            th = th2;
                        }
                    } catch (Exception e) {
                        Log.e("FastKV", this.f22521, e);
                        bArrM13646 = null;
                    }
                    if (bArrM13646 == null) {
                        remove(str);
                        return;
                    }
                    AbstractC8172 abstractC81722 = (AbstractC8172) this.f22536.get(str);
                    if (abstractC81722 == null || abstractC81722.mo13593() == 8) {
                        abstractC8172 = abstractC81722;
                    } else {
                        remove(str);
                    }
                    C8179 c8179 = (C8179) abstractC8172;
                    int iM561 = C0137.m561("StringSet");
                    C0137 c0137 = new C0137(iM561 + 1 + bArrM13646.length);
                    c0137.m578((byte) iM561);
                    c0137.m571("StringSet");
                    c0137.m570(bArrM13646);
                    byte[] bArrM9063 = (byte[]) c0137.f594;
                    C4484 c4484 = this.f22519;
                    if (c4484 != null) {
                        bArrM9063 = c4484.m9063(bArrM9063);
                    }
                    byte[] bArr = bArrM9063;
                    if (bArr == null) {
                        return;
                    }
                    m13633(str, obj, bArr, c8179, (byte) 8);
                    m13630(str);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sharedPreferencesC8175 = this;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            sharedPreferencesC8175 = this;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
