package p267;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0946;
import androidx.appcompat.widget.C0984;
import androidx.fragment.app.RunnableC3179;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3898;
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
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesC9005 implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final int f22857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f22861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f22862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5317 f22863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22866;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public FileChannel f22867;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public FileChannel f22868;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f22869;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f22870;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public MappedByteBuffer f22871;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public MappedByteBuffer f22872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22877;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f22881;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0984 f22883;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f22884;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final byte[] f22859 = new byte[0];

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f22858 = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final HashMap f22880 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile boolean f22879 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f22882 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f22874 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ExecutorC9007 f22873 = new ExecutorC9007();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f22878 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f22875 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Handler f22876 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f22860 = true;

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
        f22857 = iIntValue;
    }

    public SharedPreferencesC9005(String str, String str2, C9006[] c9006Arr, C5317 c5317, int i) {
        int i2 = 1;
        this.f22866 = str;
        this.f22865 = str2;
        this.f22863 = c5317;
        this.f22870 = i;
        HashMap map = new HashMap();
        if (c9006Arr != null) {
            for (C9006 c9006 : c9006Arr) {
                c9006.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC3898.m7426(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c9006);
                }
            }
        }
        map.put("StringSet", C9006.f22885);
        this.f22864 = map;
        synchronized (this.f22880) {
            AbstractC9004.m14194().execute(new RunnableC9011(this, i2));
            if (!this.f22879) {
                try {
                    this.f22880.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14211(String str) {
        if (str == null || str.isEmpty()) {
            C6755.m11869("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f22860 = true;
        m14215();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC3888.m7259(this);
            if (this.f22870 != 0) {
                AbstractC3888.m7279(this);
            }
            m14212(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f22860 = true;
        return m14215();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f22880.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f22880.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f22880.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC9002 abstractC9002 = (AbstractC9002) entry.getValue();
            switch (abstractC9002.mo14181()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C9001) abstractC9002).f22852);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C8998) abstractC9002).f22849);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C8999) abstractC9002).f22850);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C9010) abstractC9002).f22891);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C9000) abstractC9002).f22851);
                    break;
                case 6:
                    C9013 c9013 = (C9013) abstractC9002;
                    objValueOf = c9013.f22898 ? AbstractC3888.m7270(this, c9013, this.f22863) : c9013.f22901;
                    break;
                case 7:
                    C9003 c9003 = (C9003) abstractC9002;
                    objValueOf = c9003.f22898 ? AbstractC3888.m7275(this, c9003, this.f22863) : c9003.f22901;
                    break;
                case 8:
                    C9009 c9009 = (C9009) abstractC9002;
                    objValueOf = c9009.f22898 ? AbstractC3888.m7269(this, c9009, this.f22863) : ((C9009) abstractC9002).f22901;
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
        AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
        if (abstractC9002 != null) {
            z = abstractC9002.mo14180();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
        if (abstractC9002 != null) {
            f = abstractC9002.mo14179();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
        if (abstractC9002 != null) {
            i = abstractC9002.mo14178();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
        if (abstractC9002 != null) {
            j = abstractC9002.mo14177();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
        if (abstractC9002 == null) {
            return str2;
        }
        if (abstractC9002.mo14181() == 6) {
            C9013 c9013 = (C9013) abstractC9002;
            if (c9013.f22898) {
                String strM7270 = AbstractC3888.m7270(this, c9013, this.f22863);
                if (strM7270 != null && !strM7270.isEmpty()) {
                    c9013.f22901 = strM7270;
                    c9013.f22898 = false;
                    return strM7270;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC9002.mo14176();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m14214(str);
        }
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m14211(str);
            AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
            if (abstractC9002 != null && abstractC9002.mo14181() != 1) {
                remove(str);
                abstractC9002 = null;
            }
            C9001 c9001 = (C9001) abstractC9002;
            if (c9001 == null) {
                m14220(str, f22858[1], (byte) 1);
                C0984 c0984 = this.f22883;
                int i = c0984.f941;
                c0984.m1139(z ? (byte) 1 : (byte) 0);
                m14217();
                this.f22880.put(str, new C9001(i, z));
                m14213(str);
            } else if (c9001.f22852 != z) {
                c9001.f22852 = z;
                m14218(z ? (byte) 1 : (byte) 0, c9001.f22853);
                m14213(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m14211(str);
            AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
            if (abstractC9002 != null && abstractC9002.mo14181() != 3) {
                remove(str);
                abstractC9002 = null;
            }
            C8999 c8999 = (C8999) abstractC9002;
            if (c8999 == null) {
                m14220(str, f22858[3], (byte) 3);
                C0984 c0984 = this.f22883;
                int i = c0984.f941;
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C5317 c5317 = this.f22863;
                if (c5317 != null) {
                    c5317.m9611(iFloatToRawIntBits);
                }
                c0984.m1130(iFloatToRawIntBits);
                m14217();
                this.f22880.put(str, new C8999(i, f));
                m14213(str);
            } else if (c8999.f22850 != f) {
                int iFloatToRawIntBits2 = Float.floatToRawIntBits(f);
                C5317 c53172 = this.f22863;
                if (c53172 != null) {
                    c53172.m9611(iFloatToRawIntBits2);
                }
                long jM1142 = ((long) (this.f22883.m1142(c8999.f22853) ^ iFloatToRawIntBits2)) & 4294967295L;
                c8999.f22850 = f;
                m14221(iFloatToRawIntBits2, c8999.f22853, jM1142);
                m14213(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m14211(str);
            AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
            if (abstractC9002 != null && abstractC9002.mo14181() != 2) {
                remove(str);
                abstractC9002 = null;
            }
            C8998 c8998 = (C8998) abstractC9002;
            if (c8998 == null) {
                m14220(str, f22858[2], (byte) 2);
                C0984 c0984 = this.f22883;
                int i2 = c0984.f941;
                C5317 c5317 = this.f22863;
                if (c5317 != null) {
                    c5317.m9611(i);
                }
                c0984.m1130(i);
                m14217();
                this.f22880.put(str, new C8998(i2, i));
                m14213(str);
            } else if (c8998.f22849 != i) {
                C5317 c53172 = this.f22863;
                if (c53172 != null) {
                    c53172.m9611(i);
                }
                int iM1142 = this.f22863 != null ? this.f22883.m1142(c8998.f22853) : c8998.f22849;
                c8998.f22849 = i;
                m14221(i, c8998.f22853, ((long) (iM1142 ^ i)) & 4294967295L);
                m14213(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j) {
        Throwable th;
        SharedPreferencesC9005 sharedPreferencesC9005;
        SharedPreferencesC9005 sharedPreferencesC90052;
        try {
            try {
                m14211(str);
                AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
                if (abstractC9002 != null) {
                    try {
                        if (abstractC9002.mo14181() != 4) {
                            remove(str);
                            abstractC9002 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sharedPreferencesC9005 = this;
                        throw th;
                    }
                }
                C9010 c9010 = (C9010) abstractC9002;
                if (c9010 != null) {
                    if (c9010.f22891 != j) {
                        C5317 c5317 = this.f22863;
                        if (c5317 != null) {
                            c5317.m9610(j);
                        }
                        long jM1141 = j ^ (this.f22863 != null ? this.f22883.m1141(c9010.f22853) : c9010.f22891);
                        c9010.f22891 = j;
                        sharedPreferencesC90052 = this;
                        sharedPreferencesC90052.m14222(j, jM1141, c9010.f22853);
                        sharedPreferencesC90052.m14213(str);
                    }
                    return sharedPreferencesC90052;
                }
                m14220(str, f22858[4], (byte) 4);
                C0984 c0984 = this.f22883;
                int i = c0984.f941;
                C5317 c53172 = this.f22863;
                if (c53172 != null) {
                    c53172.m9610(j);
                }
                c0984.m1135(c0984.f941, j);
                c0984.f941 += 8;
                m14217();
                this.f22880.put(str, new C9010(i, j));
                m14213(str);
                sharedPreferencesC90052 = this;
                return sharedPreferencesC90052;
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC9005 = this;
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
        SharedPreferencesC9005 sharedPreferencesC9005;
        SharedPreferencesC9005 sharedPreferencesC90052;
        try {
            try {
                m14211(str);
                try {
                } catch (Throwable th2) {
                    th = th2;
                    sharedPreferencesC9005 = this;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC9005 = this;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (str2 != null) {
            AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
            if (abstractC9002 != null && abstractC9002.mo14181() != 6) {
                remove(str);
                abstractC9002 = null;
            }
            C9013 c9013 = (C9013) abstractC9002;
            if (c9013 != null && !c9013.f22898 && str2.equals(c9013.f22901)) {
                return this;
            }
            byte[] bytes = str2.isEmpty() ? f22859 : str2.getBytes(StandardCharsets.UTF_8);
            C5317 c5317 = this.f22863;
            if (c5317 != null) {
                bytes = c5317.m9612(bytes);
            }
            byte[] bArr = bytes;
            if (bArr == null) {
                Log.e("FastKV", this.f22865, new Exception("Encrypt failed"));
                return this;
            }
            sharedPreferencesC90052 = this;
            sharedPreferencesC90052.m14216(str, str2, bArr, c9013, (byte) 6);
            sharedPreferencesC90052.m14213(str);
            throw th;
        }
        remove(str);
        sharedPreferencesC90052 = this;
        return sharedPreferencesC90052;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                m14228(str, set, C9006.f22885);
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
        if (!this.f22875.contains(onSharedPreferenceChangeListener)) {
            this.f22875.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
            if (abstractC9002 != null) {
                this.f22880.remove(str);
                byte bMo14181 = abstractC9002.mo14181();
                String str2 = null;
                if (bMo14181 <= 5) {
                    int iM1122 = C0984.m1122(str);
                    int i = abstractC9002.f22853;
                    m14225(bMo14181, i - (iM1122 + 2), i + f22858[bMo14181]);
                } else {
                    AbstractC9014 abstractC9014 = (AbstractC9014) abstractC9002;
                    m14225(bMo14181, abstractC9014.f22900, abstractC9014.f22853 + abstractC9014.f22899);
                    if (abstractC9014.f22898) {
                        str2 = (String) abstractC9014.f22901;
                    }
                }
                byte b = (byte) (bMo14181 | (-128));
                if (this.f22870 == 0) {
                    this.f22871.putLong(4, this.f22861);
                    this.f22871.put(this.f22869, b);
                    this.f22872.putLong(4, this.f22861);
                    this.f22872.put(this.f22869, b);
                } else {
                    this.f22883.m1135(4, this.f22861);
                }
                this.f22869 = 0;
                if (str2 != null) {
                    if (this.f22870 == 0) {
                        AbstractC9004.m14194().execute(new RunnableC0946(this, 22, str2));
                    } else {
                        this.f22882.add(str2);
                    }
                }
                if (this.f22877 >= 8192 || this.f22878.size() >= 100) {
                    AbstractC3887.m7211(this, 0);
                }
                if (this.f22870 != 0 && this.f22860) {
                    m14215();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f22866 + " name:" + this.f22865;
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f22875.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized void m14212(String str) {
        if (this.f22875.isEmpty()) {
            return;
        }
        Iterator it = this.f22875.iterator();
        while (it.hasNext()) {
            this.f22876.post(new RunnableC3179(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 11));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14213(String str) {
        if (this.f22870 != 0 && this.f22860) {
            m14215();
        }
        m14212(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized Object m14214(String str) {
        AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
        if (abstractC9002 != null && abstractC9002.mo14181() == 8) {
            C9009 c9009 = (C9009) abstractC9002;
            if (!c9009.f22898) {
                return c9009.f22901;
            }
            LinkedHashSet linkedHashSetM7269 = AbstractC3888.m7269(this, c9009, this.f22863);
            if (linkedHashSetM7269 == null) {
                remove(str);
                return null;
            }
            c9009.f22901 = linkedHashSetM7269;
            c9009.f22898 = false;
            return linkedHashSetM7269;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14215() {
        int i = this.f22870;
        if (i == 1) {
            this.f22873.execute(new RunnableC9011(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC3888.m7284(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14216(String str, Object obj, byte[] bArr, AbstractC9014 abstractC9014, byte b) {
        if (abstractC9014 == null) {
            int iM14219 = m14219(str, bArr, b);
            if (iM14219 > 0) {
                int length = bArr.length;
                int i = this.f22884;
                this.f22880.put(str, b == 6 ? new C9013(i, iM14219, (String) obj, length, false) : b == 7 ? new C9003(i, iM14219, obj, length, false) : new C9009(i, iM14219, obj, length, false));
                m14217();
                return;
            }
            return;
        }
        if (abstractC9014.f22898 || abstractC9014.f22899 != bArr.length) {
            int iM142192 = m14219(str, bArr, abstractC9014.mo14181());
            if (iM142192 > 0) {
                String str2 = abstractC9014.f22898 ? (String) abstractC9014.f22901 : null;
                m14225(abstractC9014.mo14181(), abstractC9014.f22900, abstractC9014.f22853 + abstractC9014.f22899);
                abstractC9014.f22900 = this.f22884;
                abstractC9014.f22853 = iM142192;
                abstractC9014.f22898 = false;
                abstractC9014.f22901 = obj;
                abstractC9014.f22899 = bArr.length;
                m14217();
                if (this.f22877 >= 8192 || this.f22878.size() >= 100) {
                    AbstractC3887.m7211(this, 0);
                }
                if (str2 != null) {
                    if (this.f22870 == 0) {
                        AbstractC9004.m14194().execute(new RunnableC0946(this, 22, str2));
                        return;
                    } else {
                        this.f22882.add(str2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i2 = abstractC9014.f22853;
        int length2 = bArr.length;
        this.f22861 ^= this.f22883.m1126(i2, length2);
        C0984 c0984 = this.f22883;
        c0984.f941 = i2;
        c0984.m1131(bArr);
        long jM1126 = this.f22861 ^ this.f22883.m1126(i2, length2);
        this.f22861 = jM1126;
        if (this.f22870 == 0) {
            this.f22871.putInt(0, -1);
            this.f22871.putLong(4, this.f22861);
            this.f22871.position(i2);
            this.f22871.put(bArr);
            MappedByteBuffer mappedByteBuffer = this.f22871;
            int i3 = this.f22862 - 12;
            if (this.f22863 != null) {
                i3 |= 1073741824;
            }
            mappedByteBuffer.putInt(0, i3);
            this.f22872.putLong(4, this.f22861);
            this.f22872.position(i2);
            this.f22872.put(bArr);
        } else {
            this.f22883.m1135(4, jM1126);
        }
        abstractC9014.f22901 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14217() {
        this.f22861 ^= this.f22883.m1126(this.f22884, this.f22881);
        int i = this.f22862 - 12;
        if (this.f22863 != null) {
            i |= 1073741824;
        }
        if (this.f22870 == 0) {
            this.f22871.putInt(0, -1);
            m14226(this.f22871);
            this.f22871.putInt(0, i);
            this.f22872.putInt(0, i);
            m14226(this.f22872);
        } else {
            this.f22883.m1134(0, i);
            this.f22883.m1135(4, this.f22861);
        }
        this.f22869 = 0;
        this.f22881 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14218(byte b, int i) {
        long jM7287 = this.f22861 ^ AbstractC3888.m7287(i, 1L);
        this.f22861 = jM7287;
        if (this.f22870 == 0) {
            this.f22871.putLong(4, jM7287);
            this.f22871.put(i, b);
            this.f22872.putLong(4, this.f22861);
            this.f22872.put(i, b);
        } else {
            this.f22883.m1135(4, jM7287);
        }
        ((byte[]) this.f22883.f939)[i] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m14219(String str, byte[] bArr, byte b) {
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
        m14220(str, (z ? 4 : 2) + bArr.length, b);
        C0984 c0984 = this.f22883;
        if (z) {
            c0984.m1130(bArr.length);
        } else {
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0984.f939;
            int i = c0984.f941;
            int i2 = i + 1;
            c0984.f941 = i2;
            bArr2[i] = (byte) length;
            c0984.f941 = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        C0984 c09842 = this.f22883;
        int i3 = c09842.f941;
        c09842.m1131(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m14220(String str, int i, byte b) {
        C5317 c5317 = this.f22863;
        if (c5317 != null) {
            byte[] bArrM9612 = c5317.m9612(str.getBytes(StandardCharsets.UTF_8));
            int length = bArrM9612.length;
            m14224(b, length, i);
            this.f22883.m1139((byte) length);
            C0984 c0984 = this.f22883;
            System.arraycopy(bArrM9612, 0, (byte[]) c0984.f939, c0984.f941, length);
            this.f22883.f941 += length;
            return true;
        }
        int iM1122 = C0984.m1122(str);
        m14224(b, iM1122, i);
        this.f22883.m1139((byte) iM1122);
        int length2 = str.length();
        C0984 c09842 = this.f22883;
        if (iM1122 != length2) {
            c09842.m1132(str);
            return true;
        }
        str.getBytes(0, iM1122, (byte[]) c09842.f939, c09842.f941);
        this.f22883.f941 += iM1122;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14221(int i, int i2, long j) {
        long jM7287 = AbstractC3888.m7287(i2, j) ^ this.f22861;
        this.f22861 = jM7287;
        if (this.f22870 == 0) {
            this.f22871.putLong(4, jM7287);
            this.f22871.putInt(i2, i);
            this.f22872.putLong(4, this.f22861);
            this.f22872.putInt(i2, i);
        } else {
            this.f22883.m1135(4, jM7287);
        }
        this.f22883.m1134(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14222(long j, long j2, int i) {
        long jM7287 = AbstractC3888.m7287(i, j2) ^ this.f22861;
        this.f22861 = jM7287;
        if (this.f22870 == 0) {
            this.f22871.putLong(4, jM7287);
            this.f22871.putLong(i, j);
            this.f22872.putLong(4, this.f22861);
            this.f22872.putLong(i, j);
        } else {
            this.f22883.m1135(4, jM7287);
        }
        this.f22883.m1135(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final synchronized void m14223(String str, byte[] bArr) {
        Throwable th;
        SharedPreferencesC9005 sharedPreferencesC9005;
        SharedPreferencesC9005 sharedPreferencesC90052;
        try {
            try {
                m14211(str);
            } catch (Throwable th2) {
                th = th2;
                sharedPreferencesC9005 = this;
                th = th;
                throw th;
            }
            try {
                if (bArr == null) {
                    remove(str);
                    sharedPreferencesC90052 = this;
                } else {
                    AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
                    if (abstractC9002 != null && abstractC9002.mo14181() != 7) {
                        remove(str);
                        abstractC9002 = null;
                    }
                    C9003 c9003 = (C9003) abstractC9002;
                    C5317 c5317 = this.f22863;
                    sharedPreferencesC90052 = this;
                    sharedPreferencesC90052.m14216(str, bArr, c5317 != null ? c5317.m9612(bArr) : bArr, c9003, (byte) 7);
                    sharedPreferencesC90052.m14213(str);
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferencesC9005 = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14224(byte b, int i, int i2) {
        if (i > 255) {
            C6755.m11869("key's length must less than 256");
            return;
        }
        int i3 = i + 2 + i2;
        this.f22881 = i3;
        int length = ((byte[]) this.f22883.f939).length;
        int i4 = this.f22862 + i3;
        if (i4 >= length) {
            int i5 = this.f22877;
            if (i5 <= i3 || i5 <= 8192) {
                int iM7265 = AbstractC3888.m7265(length, i4);
                byte[] bArr = new byte[iM7265];
                System.arraycopy((byte[]) this.f22883.f939, 0, bArr, 0, this.f22862);
                this.f22883.f939 = bArr;
                if (this.f22870 == 0) {
                    MappedByteBuffer mappedByteBufferM7237 = AbstractC3888.m7237(this.f22868, iM7265);
                    MappedByteBuffer mappedByteBufferM72372 = AbstractC3888.m7237(this.f22867, iM7265);
                    if (mappedByteBufferM7237 == null || mappedByteBufferM72372 == null) {
                        Log.e("FastKV", this.f22865, new Exception("map failed"));
                        int i6 = this.f22862 - 12;
                        if (this.f22863 != null) {
                            i6 |= 1073741824;
                        }
                        this.f22883.m1134(0, i6);
                        this.f22883.m1135(4, this.f22861);
                        AbstractC3888.m7286(this);
                    } else {
                        this.f22871 = mappedByteBufferM7237;
                        this.f22872 = mappedByteBufferM72372;
                    }
                }
            } else {
                AbstractC3887.m7211(this, i3);
            }
        }
        int i7 = this.f22862;
        this.f22884 = i7;
        this.f22862 = this.f22881 + i7;
        C0984 c0984 = this.f22883;
        c0984.f941 = i7;
        c0984.m1139(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14225(byte b, int i, int i2) {
        this.f22877 = (i2 - i) + this.f22877;
        C9008 c9008 = new C9008();
        c9008.f22889 = i;
        c9008.f22888 = i2;
        this.f22878.add(c9008);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f22883.f939;
        this.f22861 = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f22861;
        bArr[i] = b2;
        this.f22869 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14226(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f22861);
        int i = this.f22869;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f22883.f939)[i]);
        }
        if (this.f22881 != 0) {
            mappedByteBuffer.position(this.f22884);
            mappedByteBuffer.put((byte[]) this.f22883.f939, this.f22884, this.f22881);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #2 {all -> 0x001a, blocks: (B:6:0x000f, B:8:0x0015, B:14:0x0023, B:16:0x0036, B:17:0x0039, B:25:0x0064), top: B:44:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x0001, B:12:0x001f, B:19:0x0056, B:23:0x0060, B:26:0x0067), top: B:40:0x0001 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m14227(String str, double d) {
        Throwable th;
        SharedPreferencesC9005 sharedPreferencesC9005;
        C9000 c9000;
        SharedPreferencesC9005 sharedPreferencesC90052;
        try {
            try {
                m14211(str);
                AbstractC9002 abstractC9002 = (AbstractC9002) this.f22880.get(str);
                if (abstractC9002 == null) {
                    c9000 = (C9000) abstractC9002;
                    if (c9000 == null) {
                    }
                    sharedPreferencesC90052 = this;
                    return;
                }
                try {
                    if (abstractC9002.mo14181() != 5) {
                        remove(str);
                        abstractC9002 = null;
                    }
                    c9000 = (C9000) abstractC9002;
                    if (c9000 == null) {
                        if (c9000.f22851 != d) {
                            try {
                                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
                                C5317 c5317 = this.f22863;
                                if (c5317 != null) {
                                    c5317.m9610(jDoubleToRawLongBits);
                                }
                                long jM1141 = jDoubleToRawLongBits ^ this.f22883.m1141(c9000.f22853);
                                c9000.f22851 = d;
                                sharedPreferencesC90052 = this;
                                sharedPreferencesC90052.m14222(jDoubleToRawLongBits, jM1141, c9000.f22853);
                                sharedPreferencesC90052.m14213(str);
                            } catch (Throwable th2) {
                                sharedPreferencesC9005 = this;
                                th = th2;
                            }
                        }
                        return;
                    }
                    m14220(str, f22858[5], (byte) 5);
                    C0984 c0984 = this.f22883;
                    int i = c0984.f941;
                    long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(d);
                    C5317 c53172 = this.f22863;
                    if (c53172 != null) {
                        c53172.m9610(jDoubleToRawLongBits2);
                    }
                    c0984.m1135(c0984.f941, jDoubleToRawLongBits2);
                    c0984.f941 += 8;
                    m14217();
                    this.f22880.put(str, new C9000(i, d));
                    m14213(str);
                    sharedPreferencesC90052 = this;
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sharedPreferencesC9005 = this;
                }
            } catch (Throwable th4) {
                th = th4;
                sharedPreferencesC9005 = this;
                th = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized void m14228(String str, Object obj, C9006 c9006) {
        SharedPreferencesC9005 sharedPreferencesC9005;
        Throwable th;
        byte[] bArrM14229;
        try {
            try {
                m14211(str);
                if (c9006 == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f22864.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC9002 abstractC9002 = null;
                    try {
                        try {
                            bArrM14229 = C9006.m14229(obj);
                        } catch (Throwable th2) {
                            sharedPreferencesC9005 = this;
                            th = th2;
                        }
                    } catch (Exception e) {
                        Log.e("FastKV", this.f22865, e);
                        bArrM14229 = null;
                    }
                    if (bArrM14229 == null) {
                        remove(str);
                        return;
                    }
                    AbstractC9002 abstractC90022 = (AbstractC9002) this.f22880.get(str);
                    if (abstractC90022 == null || abstractC90022.mo14181() == 8) {
                        abstractC9002 = abstractC90022;
                    } else {
                        remove(str);
                    }
                    C9009 c9009 = (C9009) abstractC9002;
                    int iM1122 = C0984.m1122("StringSet");
                    C0984 c0984 = new C0984(iM1122 + 1 + bArrM14229.length);
                    c0984.m1139((byte) iM1122);
                    c0984.m1132("StringSet");
                    c0984.m1131(bArrM14229);
                    byte[] bArrM9612 = (byte[]) c0984.f939;
                    C5317 c5317 = this.f22863;
                    if (c5317 != null) {
                        bArrM9612 = c5317.m9612(bArrM9612);
                    }
                    byte[] bArr = bArrM9612;
                    if (bArr == null) {
                        return;
                    }
                    m14216(str, obj, bArr, c9009, (byte) 8);
                    m14213(str);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sharedPreferencesC9005 = this;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            sharedPreferencesC9005 = this;
        }
        th = th;
        throw th;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
