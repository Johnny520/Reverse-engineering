package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
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

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f2886d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f2885c = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC0924Vf(SharedPreferencesC0967Wf sharedPreferencesC0967Wf, SharedPreferences.Editor editor) {
        this.f2883a = sharedPreferencesC0967Wf;
        this.f2884b = editor;
    }

    /* JADX INFO: renamed from: a */
    public final void m1783a() {
        if (this.f2886d.getAndSet(false)) {
            SharedPreferencesC0967Wf sharedPreferencesC0967Wf = this.f2883a;
            for (String str : ((HashMap) sharedPreferencesC0967Wf.getAll()).keySet()) {
                if (!this.f2885c.contains(str) && !SharedPreferencesC0967Wf.m1846c(str)) {
                    this.f2884b.remove(sharedPreferencesC0967Wf.m1847a(str));
                }
            }
        }
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
        SharedPreferencesC0967Wf sharedPreferencesC0967Wf = this.f2883a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC0967Wf.f3012b) {
            Iterator it = this.f2885c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC0967Wf, (String) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1785c(String str, byte[] bArr) {
        SharedPreferencesC0967Wf sharedPreferencesC0967Wf = this.f2883a;
        sharedPreferencesC0967Wf.getClass();
        if (SharedPreferencesC0967Wf.m1846c(str)) {
            throw new SecurityException(AbstractC0213Ey.m407e(str, " is a reserved key for the encryption keyset."));
        }
        this.f2885c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM1847a = sharedPreferencesC0967Wf.m1847a(str);
            try {
                Pair pair = new Pair(strM1847a, new String(AbstractC2485s5.m4970b(sharedPreferencesC0967Wf.f3014d.mo1002a(bArr, strM1847a.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f2884b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f2886d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2885c;
        m1783a();
        try {
            return this.f2884b.commit();
        } finally {
            m1784b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        m1785c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f);
        m1785c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i);
        m1785c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        m1785c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        m1785c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C0607O4();
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        m1785c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC0967Wf sharedPreferencesC0967Wf = this.f2883a;
        sharedPreferencesC0967Wf.getClass();
        if (SharedPreferencesC0967Wf.m1846c(str)) {
            throw new SecurityException(AbstractC0213Ey.m407e(str, " is a reserved key for the encryption keyset."));
        }
        this.f2884b.remove(sharedPreferencesC0967Wf.m1847a(str));
        this.f2885c.add(str);
        return this;
    }
}
