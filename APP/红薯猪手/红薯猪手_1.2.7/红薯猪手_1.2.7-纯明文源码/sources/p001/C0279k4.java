package p001;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001.C0200e9;

/* JADX INFO: renamed from: ۟.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0279k4 {

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final String[] f1621 = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: ۥ۟ */
    public final String[] f906;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final AbstractC0144a9 f1622;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public volatile InterfaceC0202eb f1625;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final b f1626;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public AtomicBoolean f1623 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public volatile boolean f1624 = false;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    @SuppressLint({"RestrictedApi"})
    public final C0200e9<c, d> f1627 = new C0200e9<>();

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final Object f1628 = new Object();

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public a f1629 = new a();

    /* JADX INFO: renamed from: ۥ */
    public final HashMap<String, Integer> f905 = new HashMap<>();

    /* JADX INFO: renamed from: ۟.k4$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            ReentrantReadWriteLock.ReadLock lock = C0279k4.this.f1622.f1310.readLock();
            lock.lock();
            HashSet hashSetM881 = null;
            try {
                try {
                } finally {
                    lock.unlock();
                    C0279k4.this.getClass();
                }
            } catch (SQLiteException e) {
                e = e;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e2) {
                e = e2;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
            if (C0279k4.this.m879() && C0279k4.this.f1623.compareAndSet(true, false) && !C0279k4.this.f1622.f1305.mo1024().mo999()) {
                InterfaceC0146ab interfaceC0146abMo1024 = C0279k4.this.f1622.f1305.mo1024();
                interfaceC0146abMo1024.mo1002();
                try {
                    hashSetM881 = m881();
                    interfaceC0146abMo1024.mo1001();
                    interfaceC0146abMo1024.mo811();
                    if (hashSetM881 == null || hashSetM881.isEmpty()) {
                        return;
                    }
                    synchronized (C0279k4.this.f1627) {
                        C0200e9.c cVar = (C0200e9.c) C0279k4.this.f1627.iterator();
                        if (cVar.hasNext()) {
                            ((d) ((Map.Entry) cVar.next()).getValue()).getClass();
                            throw null;
                        }
                    }
                } catch (Throwable th) {
                    interfaceC0146abMo1024.mo811();
                    throw th;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public final HashSet m881() {
            HashSet hashSet = new HashSet();
            Cursor cursorM995 = C0279k4.this.f1622.m995(new C0251i4("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorM995.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorM995.getInt(0)));
                } catch (Throwable th) {
                    cursorM995.close();
                    throw th;
                }
            }
            cursorM995.close();
            if (!hashSet.isEmpty()) {
                C0279k4.this.f1625.mo1055();
            }
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: ۟.k4$b */
    public static class b {

        /* JADX INFO: renamed from: ۥ */
        public final long[] f908;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean[] f909;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] f1630;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public boolean f1631;

        public b(int i) {
            long[] jArr = new long[i];
            this.f908 = jArr;
            boolean[] zArr = new boolean[i];
            this.f909 = zArr;
            this.f1630 = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* JADX INFO: renamed from: ۥ */
        public final int[] m882() {
            synchronized (this) {
                if (!this.f1631) {
                    return null;
                }
                int length = this.f908.length;
                for (int i = 0; i < length; i++) {
                    int i2 = 1;
                    boolean z = this.f908[i] > 0;
                    boolean[] zArr = this.f909;
                    if (z != zArr[i]) {
                        int[] iArr = this.f1630;
                        if (!z) {
                            i2 = 2;
                        }
                        iArr[i] = i2;
                    } else {
                        this.f1630[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.f1631 = false;
                return (int[]) this.f1630.clone();
            }
        }
    }

    /* JADX INFO: renamed from: ۟.k4$c */
    public static abstract class c {
        /* JADX INFO: renamed from: ۥ */
        public abstract void m883(Set<String> set);
    }

    /* JADX INFO: renamed from: ۟.k4$d */
    public static class d {
    }

    public C0279k4(AbstractC0144a9 abstractC0144a9, HashMap map, HashMap map2, String... strArr) {
        this.f1622 = abstractC0144a9;
        this.f1626 = new b(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f906 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f905.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) map.get(strArr[i]);
            if (str2 != null) {
                this.f906[i] = str2.toLowerCase(locale);
            } else {
                this.f906[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f905.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f905;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final boolean m879() {
        InterfaceC0146ab interfaceC0146ab = this.f1622.f681;
        if (!(interfaceC0146ab != null && interfaceC0146ab.isOpen())) {
            return false;
        }
        if (!this.f1624) {
            this.f1622.f1305.mo1024();
        }
        if (this.f1624) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m880(int i, InterfaceC0146ab interfaceC0146ab) {
        interfaceC0146ab.mo996("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f906[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f1621;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            interfaceC0146ab.mo996(sb.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1114(InterfaceC0146ab interfaceC0146ab) {
        if (interfaceC0146ab.mo999()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f1622.f1310.readLock();
            lock.lock();
            try {
                synchronized (this.f1628) {
                    int[] iArrM882 = this.f1626.m882();
                    if (iArrM882 == null) {
                        return;
                    }
                    int length = iArrM882.length;
                    if (interfaceC0146ab.mo1000()) {
                        interfaceC0146ab.mo1002();
                    } else {
                        interfaceC0146ab.mo812();
                    }
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrM882[i];
                            if (i2 == 1) {
                                m880(i, interfaceC0146ab);
                            } else if (i2 == 2) {
                                String str = this.f906[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f1621;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    interfaceC0146ab.mo996(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            interfaceC0146ab.mo811();
                            throw th;
                        }
                    }
                    interfaceC0146ab.mo1001();
                    interfaceC0146ab.mo811();
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        }
    }
}
