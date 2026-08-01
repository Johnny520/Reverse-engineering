package p013;

import android.util.Log;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.lazy.layout.C0734;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC5186;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p012.C6164;
import p017.AbstractC6238;
import p230.C8048;
import p230.C8049;
import p230.C8050;
import p230.C8052;
import p230.InterfaceC8051;
import p286.C8396;
import p286.InterfaceC8392;
import p286.InterfaceC8395;
import p288.C8418;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6188 implements InterfaceC6184, InterfaceC8051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f16928;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f16929;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f16930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f16931;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f16932;

    public C6188(C6179 c6179, C6164 c6164) {
        c6164.getClass();
        this.f16930 = c6179;
        this.f16931 = c6164;
        this.f16932 = Long.MIN_VALUE;
        this.f16929 = new CopyOnWriteArrayList();
        this.f16928 = new LinkedBlockingDeque();
    }

    @Override // p013.InterfaceC6184
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C6179 mo11199() {
        return (C6179) this.f16930;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6175 m11634() {
        InterfaceC6174 c6183;
        C6179 c6179 = (C6179) this.f16930;
        if (c6179.m11626(null)) {
            try {
                c6183 = c6179.m11625();
            } catch (Throwable th) {
                c6183 = new C6183(th);
            }
            if (c6183.isReady()) {
                return new C6175(c6183, (Throwable) null, 6);
            }
            if (c6183 instanceof C6183) {
                return ((C6183) c6183).f16921;
            }
            ((CopyOnWriteArrayList) this.f16929).add(c6183);
            ((C6164) this.f16931).m11587().m11593(new C6187(AbstractC6238.f17189 + " connect " + c6179.f16898.f17054.m11675(), c6183, this), 0L);
        }
        return null;
    }

    @Override // p230.InterfaceC8051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo11635(InterfaceC8392 interfaceC8392, C0108 c0108) {
        C8050 c8050;
        boolean z;
        String strM13514 = ((C8052) this.f16930).m13514(interfaceC8392);
        C4870 c4870 = (C4870) this.f16929;
        synchronized (c4870) {
            c8050 = (C8050) ((HashMap) c4870.f14160).get(strM13514);
            if (c8050 == null) {
                C8049 c8049 = (C8049) c4870.f14161;
                synchronized (c8049.f22223) {
                    c8050 = (C8050) c8049.f22223.poll();
                }
                if (c8050 == null) {
                    c8050 = new C8050();
                }
                ((HashMap) c4870.f14160).put(strM13514, c8050);
            }
            c8050.f22224++;
        }
        c8050.f22225.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM13514 + " for for Key: " + interfaceC8392);
            }
            try {
                C8418 c8418M11636 = m11636();
                if (c8418M11636.m13971(strM13514) == null) {
                    C0734 c0734M13969 = c8418M11636.m13969(strM13514);
                    if (c0734M13969 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM13514));
                    }
                    try {
                        if (((InterfaceC8395) c0108.f319).mo298(c0108.f320, c0734M13969.m1529(), (C8396) c0108.f318)) {
                            C8418.m13960((C8418) c0734M13969.f2068, c0734M13969, true);
                            c0734M13969.f2071 = true;
                        }
                        if (!z) {
                            try {
                                c0734M13969.m1531();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c0734M13969.f2071) {
                            try {
                                c0734M13969.m1531();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            ((C4870) this.f16929).m9761(strM13514);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public synchronized C8418 m11636() {
        try {
            if (((C8418) this.f16928) == null) {
                this.f16928 = C8418.m13963(this.f16932, (File) this.f16931);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C8418) this.f16928;
    }

    @Override // p013.InterfaceC6184
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C6181 mo11200() throws IOException {
        C6175 c6175M11634;
        long j;
        C6175 c6175;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f16929).isEmpty() && !((C6179) this.f16930).m11626(null)) {
                    m11637();
                    iOException.getClass();
                    throw iOException;
                }
                if (((C6179) this.f16930).f16896.f16873) {
                    throw new IOException("Canceled");
                }
                C5851 c5851 = ((C6164) this.f16931).f16799;
                long jNanoTime = System.nanoTime();
                long j2 = this.f16932 - jNanoTime;
                if (((CopyOnWriteArrayList) this.f16929).isEmpty() || j2 <= 0) {
                    c6175M11634 = m11634();
                    j = 250000000;
                    this.f16932 = jNanoTime + 250000000;
                } else {
                    j = j2;
                    c6175M11634 = null;
                }
                if (c6175M11634 == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f16929;
                    if (copyOnWriteArrayList.isEmpty() || (c6175 = (C6175) ((LinkedBlockingDeque) this.f16928).poll(j, timeUnit)) == null) {
                        c6175M11634 = null;
                    } else {
                        copyOnWriteArrayList.remove(c6175.f16857);
                        c6175M11634 = c6175;
                    }
                    if (c6175M11634 == null) {
                    }
                }
                boolean z = false;
                if (c6175M11634.f16856 == null && c6175M11634.f16855 == null) {
                    m11637();
                    if (!c6175M11634.f16857.isReady()) {
                        c6175M11634 = c6175M11634.f16857.mo11600();
                    }
                    if (c6175M11634.f16856 == null && c6175M11634.f16855 == null) {
                        z = true;
                    }
                    if (z) {
                        return c6175M11634.f16857.mo11604();
                    }
                }
                Throwable th = c6175M11634.f16855;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        AbstractC5186.m10212(iOException, th);
                    }
                }
                InterfaceC6174 interfaceC6174 = c6175M11634.f16856;
                if (interfaceC6174 != null) {
                    ((C6179) this.f16930).f16893.addFirst(interfaceC6174);
                }
            } finally {
                m11637();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11637() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f16929;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            InterfaceC6174 interfaceC6174 = (InterfaceC6174) it.next();
            interfaceC6174.cancel();
            InterfaceC6174 interfaceC6174Mo11605 = interfaceC6174.mo11605();
            if (interfaceC6174Mo11605 != null) {
                ((C6179) this.f16930).f16893.addLast(interfaceC6174Mo11605);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // p230.InterfaceC8051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public File mo11638(InterfaceC8392 interfaceC8392) {
        String strM13514 = ((C8052) this.f16930).m13514(interfaceC8392);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM13514 + " for for Key: " + interfaceC8392);
        }
        try {
            C8048 c8048M13971 = m11636().m13971(strM13514);
            if (c8048M13971 != null) {
                return ((File[]) c8048M13971.f22221)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public C6188(File file) {
        this.f16929 = new C4870(29);
        this.f16931 = file;
        this.f16932 = 262144000L;
        this.f16930 = new C8052(0);
    }
}
