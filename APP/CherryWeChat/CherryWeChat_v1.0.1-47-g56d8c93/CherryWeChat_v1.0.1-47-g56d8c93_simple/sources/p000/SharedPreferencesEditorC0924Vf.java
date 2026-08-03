package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Vf */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC0924Vf implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public final SharedPreferencesC0967Wf f2883a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences.Editor f2884b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f2885c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f2886d;

    public SharedPreferencesEditorC0924Vf(SharedPreferencesC0967Wf r3, SharedPreferences.Editor r4) {
        this.f2886d = new AtomicBoolean(false);
        this.f2883a = r3;
        this.f2884b = r4;
        this.f2885c = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m1783a() {
        if (this.f2886d.getAndSet(false) == false) goto L12;
        SharedPreferencesC0967Wf r0 = this.f2883a;
        Iterator r1 = ((HashMap) r0.getAll()).keySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L20;
        String r2 = (String) r1.next();
        if (this.f2885c.contains(r2) == true) goto L6;
        if (SharedPreferencesC0967Wf.m1846c(r2) == true) goto L6;
        this.f2884b.remove(r0.m1847a(r2));
        goto L6
    L20:
        return;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        m1783a();
        this.f2884b.apply();
        m1784b();
        this.f2885c.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m1784b() {
        SharedPreferencesC0967Wf r0 = this.f2883a;
        Iterator r1 = r0.f3012b.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        SharedPreferences.OnSharedPreferenceChangeListener r2 = (SharedPreferences.OnSharedPreferenceChangeListener) r1.next();
        Iterator r3 = this.f2885c.iterator();
    L7:
        if (r3.hasNext() == false) goto L4;
        r2.onSharedPreferenceChanged(r0, (String) r3.next());
        goto L7
    }

    /* JADX INFO: renamed from: c */
    public final void m1785c(String r4, byte[] r5) {
        SharedPreferencesC0967Wf r0 = this.f2883a;
        r0.getClass();
        if (SharedPreferencesC0967Wf.m1846c(r4) == true) goto L19;
        this.f2885c.add(r4);
        if (r4 != null) goto L22;
        r4 = "__NULL__";
    L22:
        String r42 = r0.m1847a(r4);     // Catch: GeneralSecurityException -> L11
        Pair r02 = new Pair(r42, new String(AbstractC2485s5.m4970b(r0.f3014d.mo1002a(r5, r42.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));     // Catch: GeneralSecurityException -> L11
        this.f2884b.putString((String) r02.first, (String) r02.second);     // Catch: GeneralSecurityException -> L11
        return;
    L13:
        e = move-exception;
        throw new AssertionError(e);     // Catch: GeneralSecurityException -> L11
    L11:
        e = move-exception;
        throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
    L19:
        throw new SecurityException(AbstractC0213Ey.m407e(r4, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f2886d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList r0 = this.f2885c;
        m1783a();
        boolean r1 = this.f2884b.commit();     // Catch: Throwable -> L6
        m1784b();
        r0.clear();
        return r1;
    L6:
        th = move-exception;
        m1784b();
        r0.clear();
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String r3, boolean r4) {
        ByteBuffer r1 = ByteBuffer.allocate(5);
        r1.putInt(5);
        r1.put(r4 ? 1 : 0);
        m1785c(r3, r1.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String r3, float r4) {
        ByteBuffer r0 = ByteBuffer.allocate(8);
        r0.putInt(4);
        r0.putFloat(r4);
        m1785c(r3, r0.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String r3, int r4) {
        ByteBuffer r0 = ByteBuffer.allocate(8);
        r0.putInt(2);
        r0.putInt(r4);
        m1785c(r3, r0.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String r3, long r4) {
        ByteBuffer r0 = ByteBuffer.allocate(12);
        r0.putInt(3);
        r0.putLong(r4);
        m1785c(r3, r0.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String r4, String r5) {
        if (r5 != null) goto L4;
        r5 = "__NULL__";
    L4:
        byte[] r52 = r5.getBytes(StandardCharsets.UTF_8);
        int r0 = r52.length;
        ByteBuffer r1 = ByteBuffer.allocate(r0 + 8);
        r1.putInt(0);
        r1.putInt(r0);
        r1.put(r52);
        m1785c(r4, r1.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String r5, Set r6) {
        if (r6 != null) goto L4;
        r6 = new C0607O4();
        r6.add("__NULL__");
    L4:
        ArrayList r0 = new ArrayList(r6.size());
        int r1 = r6.size() * 4;
        Iterator r62 = r6.iterator();
    L6:
        if (r62.hasNext() == false) goto L8;
        byte[] r2 = ((String) r62.next()).getBytes(StandardCharsets.UTF_8);
        r0.add(r2);
        r1 = r1 + r2.length;
        goto L6
    L8:
        ByteBuffer r63 = ByteBuffer.allocate(r1 + 4);
        r63.putInt(1);
        Iterator r02 = r0.iterator();
    L10:
        if (r02.hasNext() == false) goto L12;
        byte[] r12 = (byte[]) r02.next();
        r63.putInt(r12.length);
        r63.put(r12);
        goto L10
    L12:
        m1785c(r5, r63.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String r3) {
        SharedPreferencesC0967Wf r0 = this.f2883a;
        r0.getClass();
        if (SharedPreferencesC0967Wf.m1846c(r3) == true) goto L7;
        this.f2884b.remove(r0.m1847a(r3));
        this.f2885c.add(r3);
        return this;
    L7:
        throw new SecurityException(AbstractC0213Ey.m407e(r3, " is a reserved key for the encryption keyset."));
    }
}
