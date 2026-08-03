package p001;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ۟.a9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0144a9 {

    /* JADX INFO: renamed from: ۥ */
    @Deprecated
    public volatile InterfaceC0146ab f681;

    /* JADX INFO: renamed from: ۥ۟ */
    public Executor f682;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC0160bb f1305;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final C0279k4 f1306;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f1307;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    @Deprecated
    public List<a> f1308;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public HashMap f1309;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f1310 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final ThreadLocal<Integer> f1311 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final HashMap f1312;

    /* JADX INFO: renamed from: ۟.a9$a */
    public static abstract class a {
    }

    /* JADX INFO: renamed from: ۟.a9$b */
    public static class b {

        /* JADX INFO: renamed from: ۥ */
        public HashMap<Integer, TreeMap<Integer, AbstractC0401t5>> f683 = new HashMap<>();

        /* JADX INFO: renamed from: ۥ */
        public final void m810(AbstractC0401t5... abstractC0401t5Arr) {
            for (AbstractC0401t5 abstractC0401t5 : abstractC0401t5Arr) {
                int i = abstractC0401t5.f1107;
                int i2 = abstractC0401t5.f1108;
                TreeMap<Integer, AbstractC0401t5> treeMap = this.f683.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    this.f683.put(Integer.valueOf(i), treeMap);
                }
                AbstractC0401t5 abstractC0401t52 = treeMap.get(Integer.valueOf(i2));
                if (abstractC0401t52 != null) {
                    Log.w("ROOM", "Overriding migration " + abstractC0401t52 + " with " + abstractC0401t5);
                }
                treeMap.put(Integer.valueOf(i2), abstractC0401t5);
            }
        }
    }

    public AbstractC0144a9() {
        Collections.synchronizedMap(new HashMap());
        this.f1306 = mo986();
        this.f1312 = new HashMap();
        this.f1309 = new HashMap();
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static Object m993(Class cls, InterfaceC0160bb interfaceC0160bb) {
        if (cls.isInstance(interfaceC0160bb)) {
            return interfaceC0160bb;
        }
        if (interfaceC0160bb instanceof InterfaceC0262j1) {
            return m993(cls, ((InterfaceC0262j1) interfaceC0160bb).mo1048());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final void m808() {
        if (this.f1307) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m809() {
        if (!this.f1305.mo1024().mo999() && this.f1311.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract C0279k4 mo986();

    /* JADX INFO: renamed from: ۥ۟۠ */
    public abstract InterfaceC0160bb mo987(C0206f1 c0206f1);

    /* JADX INFO: renamed from: ۥ۟ۡ */
    public List mo988() {
        return Collections.emptyList();
    }

    /* JADX INFO: renamed from: ۥ۟ۢ */
    public Set<Class<? extends InterfaceC0473z>> mo989() {
        return Collections.emptySet();
    }

    /* JADX INFO: renamed from: ۥۣ۟ */
    public Map<Class<?>, List<Class<?>>> mo990() {
        return Collections.emptyMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m994() {
        this.f1305.mo1024().mo811();
        if (this.f1305.mo1024().mo999()) {
            return;
        }
        C0279k4 c0279k4 = this.f1306;
        if (c0279k4.f1623.compareAndSet(false, true)) {
            c0279k4.f1622.f682.execute(c0279k4.f1629);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final Cursor m995(InterfaceC0188db interfaceC0188db) {
        m808();
        m809();
        return this.f1305.mo1024().mo997(interfaceC0188db);
    }
}
