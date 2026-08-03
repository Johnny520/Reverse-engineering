package p000;

import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Wf */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC0967Wf implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f3011a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f3012b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final String f3013c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1435g1 f3014d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2714xd f3015e;

    public SharedPreferencesC0967Wf(String str, SharedPreferences sharedPreferences, InterfaceC1435g1 interfaceC1435g1, InterfaceC2714xd interfaceC2714xd) {
        this.f3013c = str;
        this.f3011a = sharedPreferences;
        this.f3014d = interfaceC1435g1;
        this.f3015e = interfaceC2714xd;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1846c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m1847a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(AbstractC2485s5.m4970b(this.f3015e.mo4458a(str.getBytes(StandardCharsets.UTF_8), this.f3013c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m1848b(String str) {
        String str2;
        if (m1846c(str)) {
            throw new SecurityException(AbstractC0213Ey.m407e(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM1847a = m1847a(str);
            String string = this.f3011a.getString(strM1847a, null);
            if (string != null) {
                byte[] bArrM4969a = AbstractC2485s5.m4969a(string);
                InterfaceC1435g1 interfaceC1435g1 = this.f3014d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC1435g1.mo1003b(bArrM4969a, strM1847a.getBytes(charset)));
                byteBufferWrap.position(0);
                int i = byteBufferWrap.getInt();
                int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
                if (i2 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                }
                int iM424v = AbstractC0213Ey.m424v(i2);
                if (iM424v == 0) {
                    int i3 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i3);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iM424v != 1) {
                        if (iM424v == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iM424v == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iM424v == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iM424v == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i2) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    C0607O4 c0607o4 = new C0607O4();
                    while (byteBufferWrap.hasRemaining()) {
                        int i4 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i4);
                        byteBufferWrap.position(byteBufferWrap.position() + i4);
                        c0607o4.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c0607o4.f1947c != 1 || !"__NULL__".equals(c0607o4.f1946b[0])) {
                        return c0607o4;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (m1846c(str)) {
            throw new SecurityException(AbstractC0213Ey.m407e(str, " is a reserved key for the encryption keyset."));
        }
        return this.f3011a.contains(m1847a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0924Vf(this, this.f3011a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f3011a.getAll().entrySet()) {
            if (!m1846c(entry.getKey())) {
                try {
                    String str = new String(this.f3015e.mo4459b(AbstractC2485s5.m4969a(entry.getKey()), this.f3013c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, m1848b(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objM1848b = m1848b(str);
        return objM1848b instanceof Boolean ? ((Boolean) objM1848b).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objM1848b = m1848b(str);
        return objM1848b instanceof Float ? ((Float) objM1848b).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objM1848b = m1848b(str);
        return objM1848b instanceof Integer ? ((Integer) objM1848b).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objM1848b = m1848b(str);
        return objM1848b instanceof Long ? ((Long) objM1848b).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objM1848b = m1848b(str);
        return objM1848b instanceof String ? (String) objM1848b : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objM1848b = m1848b(str);
        Set c0607o4 = objM1848b instanceof Set ? (Set) objM1848b : new C0607O4();
        return c0607o4.size() > 0 ? c0607o4 : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3012b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3012b.remove(onSharedPreferenceChangeListener);
    }
}
