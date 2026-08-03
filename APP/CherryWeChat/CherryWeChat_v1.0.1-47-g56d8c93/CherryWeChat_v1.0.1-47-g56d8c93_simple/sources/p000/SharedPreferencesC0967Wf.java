package p000;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Wf */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC0967Wf implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f3011a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f3012b;

    /* JADX INFO: renamed from: c */
    public final String f3013c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1435g1 f3014d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2714xd f3015e;

    public SharedPreferencesC0967Wf(String r1, SharedPreferences r2, InterfaceC1435g1 r3, InterfaceC2714xd r4) {
        this.f3013c = r1;
        this.f3011a = r2;
        this.f3014d = r3;
        this.f3015e = r4;
        this.f3012b = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1846c(String r1) {
        if ("__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(r1) == false) goto L5;
        return true;
    L5:
        if ("__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(r1) == true) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final String m1847a(String r4) {
        if (r4 != null) goto L15;
        r4 = "__NULL__";
    L15:
    L10:
        e = move-exception;
        throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
    L13:
        return new String(AbstractC2485s5.m4970b(this.f3015e.mo4458a(r4.getBytes(StandardCharsets.UTF_8), this.f3013c.getBytes())), "US-ASCII");
    L7:
        e = move-exception;
        throw new AssertionError(e);     // Catch: GeneralSecurityException -> L10
    }

    /* JADX INFO: renamed from: b */
    public final Object m1848b(String r14) {
        if (m1846c(r14) == true) goto L75;
        if (r14 != null) goto L76;
        r14 = "__NULL__";
    L76:
        String r142 = m1847a(r14);     // Catch: GeneralSecurityException -> L37
        String r3 = this.f3011a.getString(r142, null);     // Catch: GeneralSecurityException -> L37
        if (r3 == null) goto L68;
        byte[] r32 = AbstractC2485s5.m4969a(r3);     // Catch: GeneralSecurityException -> L37
        InterfaceC1435g1 r5 = this.f3014d;     // Catch: GeneralSecurityException -> L37
        Charset r6 = StandardCharsets.UTF_8;     // Catch: GeneralSecurityException -> L37
        ByteBuffer r143 = ByteBuffer.wrap(r5.mo1003b(r32, r142.getBytes(r6)));     // Catch: GeneralSecurityException -> L37
        boolean r33 = false;
        r143.position(0);     // Catch: GeneralSecurityException -> L37
        int r52 = r143.getInt();     // Catch: GeneralSecurityException -> L37
        if (r52 == 0) goto L23;
        if (r52 == 1) goto L22;
        if (r52 == 2) goto L21;
        if (r52 == 3) goto L20;
        if (r52 == 4) goto L19;
        if (r52 == 5) goto L18;
        int r12 = 0;
    L24:
        if (r12 == 0) goto L71;
        int r1 = AbstractC0213Ey.m424v(r12);     // Catch: GeneralSecurityException -> L37
        if (r1 == 0) goto L66;
        if (r1 == 1) goto L56;
        if (r1 == 2) goto L55;
        if (r1 == 3) goto L53;
        if (r1 == 4) goto L51;
        if (r1 != 5) goto L40;
        if (r143.get() == 0) goto L36;
        r33 = true;
    L36:
        return Boolean.valueOf(r33);
    L40:
        switch(r12) {
            case 1: goto L47;
            case 2: goto L46;
            case 3: goto L45;
            case 4: goto L44;
            case 5: goto L43;
            case 6: goto L42;
            default: goto L41;
        };     // Catch: GeneralSecurityException -> L37
    L41:
        String r13 = "null";
    L49:
        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(r13));     // Catch: GeneralSecurityException -> L37
    L42:
        r13 = "BOOLEAN";
        goto L49
    L43:
        r13 = "FLOAT";
        goto L49
    L44:
        r13 = "LONG";
        goto L49
    L45:
        r13 = "INT";
        goto L49
    L46:
        r13 = "STRING_SET";
        goto L49
    L47:
        r13 = "STRING";
        goto L49
    L51:
        return Float.valueOf(r143.getFloat());
    L53:
        return Long.valueOf(r143.getLong());
    L55:
        return Integer.valueOf(r143.getInt());
    L56:
        C0607O4 r0 = new C0607O4();     // Catch: GeneralSecurityException -> L37
    L58:
        if (r143.hasRemaining() == false) goto L61;
        int r15 = r143.getInt();     // Catch: GeneralSecurityException -> L37
        ByteBuffer r53 = r143.slice();     // Catch: GeneralSecurityException -> L37
        r53.limit(r15);     // Catch: GeneralSecurityException -> L37
        r143.position(r143.position() + r15);     // Catch: GeneralSecurityException -> L37
        r0.add(StandardCharsets.UTF_8.decode(r53).toString());     // Catch: GeneralSecurityException -> L37
        goto L58
    L61:
        if (r0.f1947c == 1) goto L63;
    L65:
        return r0;
    L63:
        if ("__NULL__".equals(r0.f1946b[0]) == false) goto L65;
    L66:
        int r02 = r143.getInt();     // Catch: GeneralSecurityException -> L37
        ByteBuffer r16 = r143.slice();     // Catch: GeneralSecurityException -> L37
        r143.limit(r02);     // Catch: GeneralSecurityException -> L37
        String r144 = r6.decode(r16).toString();     // Catch: GeneralSecurityException -> L37
        if (r144.equals("__NULL__") == true) goto L68;
        return r144;
    L71:
        throw new SecurityException("Unknown type ID for encrypted pref value: " + r52);     // Catch: GeneralSecurityException -> L37
    L18:
        r12 = 6;
        goto L24
    L19:
        r12 = 5;
        goto L24
    L20:
        r12 = 4;
        goto L24
    L21:
        r12 = 3;
        goto L24
    L22:
        r12 = 2;
        goto L24
    L23:
        r12 = 1;
    L68:
        return null;
    L37:
        e = move-exception;
        throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
    L75:
        throw new SecurityException(AbstractC0213Ey.m407e(r14, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String r3) {
        if (m1846c(r3) == true) goto L7;
        String r32 = m1847a(r3);
        return this.f3011a.contains(r32);
    L7:
        throw new SecurityException(AbstractC0213Ey.m407e(r3, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0924Vf(this, this.f3011a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap r0 = new HashMap();
        Iterator<Map.Entry<String, ?>> r1 = this.f3011a.getAll().entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L15;
        Map.Entry<String, ?> r2 = r1.next();
        if (m1846c(r2.getKey()) == true) goto L4;
        String r3 = new String(this.f3015e.mo4459b(AbstractC2485s5.m4969a(r2.getKey()), this.f3013c.getBytes()), StandardCharsets.UTF_8);     // Catch: GeneralSecurityException -> L12
        if (r3.equals("__NULL__") == false) goto L11;
        r3 = null;
    L11:
        r0.put(r3, m1848b(r3));
    L12:
        e = move-exception;
        throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
    L15:
        return r0;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String r2, boolean r3) {
        Object r22 = m1848b(r2);
        if ((r22 instanceof Boolean) == true) goto L5;
        return r3;
    L5:
        return ((Boolean) r22).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String r2, float r3) {
        Object r22 = m1848b(r2);
        if ((r22 instanceof Float) == true) goto L5;
        return r3;
    L5:
        return ((Float) r22).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String r2, int r3) {
        Object r22 = m1848b(r2);
        if ((r22 instanceof Integer) == true) goto L5;
        return r3;
    L5:
        return ((Integer) r22).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String r2, long r3) {
        Object r22 = m1848b(r2);
        if ((r22 instanceof Long) == true) goto L5;
        return r3;
    L5:
        return ((Long) r22).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String r2, String r3) {
        Object r22 = m1848b(r2);
        if ((r22 instanceof String) == true) goto L5;
        return r3;
    L5:
        return (String) r22;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String r2, Set r3) {
        Object r22 = m1848b(r2);
        if ((r22 instanceof Set) == false) goto L5;
        Set r23 = (Set) r22;
    L7:
        if (r23.size() <= 0) goto L9;
        return r23;
    L9:
        return r3;
    L5:
        r23 = new C0607O4();
        goto L7
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r2) {
        this.f3012b.add(r2);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r2) {
        this.f3012b.remove(r2);
    }
}
