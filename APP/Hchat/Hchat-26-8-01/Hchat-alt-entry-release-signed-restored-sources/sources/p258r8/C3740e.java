package p258r8;

import android.os.Handler;
import android.os.Looper;
import ca.C0532s;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import ng.AbstractC3015m;
import ng.C3011i;
import p025bc.C0260j;
import p036c9.C0415a0;
import p036c9.ThreadFactoryC0478q;
import p054dg.C0795n;
import p085fg.InterfaceC1220a;
import p211o9.C3092e;
import p218og.AbstractC3149m;
import p255r4.C3683m;
import tf.AbstractC4170q;

/* JADX INFO: renamed from: r8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3740e {

    /* JADX INFO: renamed from: a */
    public static final Handler f12138a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f12139b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f12140c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public static final Object f12141d = new Object();

    /* JADX INFO: renamed from: e */
    public static final ExecutorService f12142e = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(23));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m7754a(EnumC3738c enumC3738c) {
        AtomicInteger atomicInteger;
        int i9;
        int i10;
        do {
            atomicInteger = f12140c;
            i9 = atomicInteger.get();
            i10 = enumC3738c.f12129g;
            if (i9 >= i10) {
                break;
            }
        } while (!atomicInteger.compareAndSet(i9, i10));
        Set setEntrySet = f12139b.entrySet();
        setEntrySet.getClass();
        C3011i c3011i = new C3011i(new C0795n(setEntrySet, 6), true, new C3092e(29));
        C0415a0 c0415a0 = new C0415a0(new C0415a0(new C3683m(3), 26), 27);
        ArrayList<Map.Entry> arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0415a0);
        for (Map.Entry entry : arrayList) {
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            m7757d((String) key, (C3739d) value);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m7755b(EnumC3738c enumC3738c) {
        return f12140c.get() >= enumC3738c.f12129g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m7756c(Runnable runnable) {
        synchronized (f12141d) {
            runnable.run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m7757d(String str, C3739d c3739d) {
        InterfaceC1220a interfaceC1220a;
        if (m7755b(c3739d.f12131b) && !c3739d.f12134e.get() && (interfaceC1220a = c3739d.f12133d) != null && c3739d.f12135f.compareAndSet(false, true)) {
            f12142e.execute(new RunnableC3737b(c3739d, str, interfaceC1220a, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m7758e(int i9, InterfaceC1220a interfaceC1220a, String str, String str2, EnumC3738c enumC3738c) {
        enumC3738c.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        Object objComputeIfAbsent = f12139b.computeIfAbsent(str, new C0260j(new C0532s(str2, 16), 12));
        objComputeIfAbsent.getClass();
        C3739d c3739d = (C3739d) objComputeIfAbsent;
        c3739d.f12130a = str2;
        c3739d.f12131b = enumC3738c;
        c3739d.f12132c = i9;
        c3739d.f12133d = interfaceC1220a;
        if (m7755b(enumC3738c)) {
            if (!c3739d.f12134e.get() && !c3739d.f12135f.get() && !c3739d.f12136g.get() && c3739d.f12137h.get() >= 6) {
                c3739d.f12137h.set(0);
            }
            m7757d(str, c3739d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7759f(int i9, InterfaceC1220a interfaceC1220a, String str, String str2, EnumC3738c enumC3738c) {
        if ((i9 & 4) != 0) {
            enumC3738c = EnumC3738c.BRIDGE;
        }
        m7758e((i9 & 8) != 0 ? 0 : -100, interfaceC1220a, str, str2, enumC3738c);
    }
}
