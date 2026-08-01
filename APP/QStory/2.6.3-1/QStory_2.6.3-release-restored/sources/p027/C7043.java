package p027;

import android.util.Log;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.lazy.layout.C1575;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC6019;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p029.AbstractC7059;
import p031.C7063;
import p246.C8878;
import p246.C8879;
import p246.C8880;
import p246.C8882;
import p246.InterfaceC8881;
import p302.C9226;
import p302.InterfaceC9222;
import p302.InterfaceC9225;
import p304.C9239;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7043 implements InterfaceC7039, InterfaceC8881 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f17479;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f17480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f17481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f17482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f17483;

    public C7043(C7035 c7035, C7063 c7063) {
        c7063.getClass();
        this.f17481 = c7035;
        this.f17482 = c7063;
        this.f17483 = Long.MIN_VALUE;
        this.f17480 = new CopyOnWriteArrayList();
        this.f17479 = new LinkedBlockingDeque();
    }

    @Override // p027.InterfaceC7039
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C7035 mo11820() {
        return (C7035) this.f17481;
    }

    @Override // p246.InterfaceC8881
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public File mo12213(InterfaceC9222 interfaceC9222) {
        String strM14102 = ((C8882) this.f17481).m14102(interfaceC9222);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM14102 + " for for Key: " + interfaceC9222);
        }
        try {
            C8878 c8878M14549 = m12214().m14549(strM14102);
            if (c8878M14549 != null) {
                return ((File[]) c8878M14549.f22564)[0];
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public synchronized C9239 m12214() {
        try {
            if (((C9239) this.f17479) == null) {
                this.f17479 = C9239.m14541(this.f17483, (File) this.f17482);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C9239) this.f17479;
    }

    @Override // p246.InterfaceC8881
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo12215(InterfaceC9222 interfaceC9222, C0955 c0955) {
        C8880 c8880;
        boolean z;
        String strM14102 = ((C8882) this.f17481).m14102(interfaceC9222);
        C5703 c5703 = (C5703) this.f17480;
        synchronized (c5703) {
            c8880 = (C8880) ((HashMap) c5703.f14509).get(strM14102);
            if (c8880 == null) {
                C8879 c8879 = (C8879) c5703.f14510;
                synchronized (c8879.f22566) {
                    c8880 = (C8880) c8879.f22566.poll();
                }
                if (c8880 == null) {
                    c8880 = new C8880();
                }
                ((HashMap) c5703.f14509).put(strM14102, c8880);
            }
            c8880.f22567++;
        }
        c8880.f22568.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM14102 + " for for Key: " + interfaceC9222);
            }
            try {
                C9239 c9239M12214 = m12214();
                if (c9239M12214.m14549(strM14102) == null) {
                    C1575 c1575M14547 = c9239M12214.m14547(strM14102);
                    if (c1575M14547 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM14102));
                    }
                    try {
                        if (((InterfaceC9225) c0955.f664).mo859(c0955.f665, c1575M14547.m2099(), (C9226) c0955.f663)) {
                            C9239.m14538((C9239) c1575M14547.f2414, c1575M14547, true);
                            c1575M14547.f2417 = true;
                        }
                        if (!z) {
                            try {
                                c1575M14547.m2101();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c1575M14547.f2417) {
                            try {
                                c1575M14547.m2101();
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
            ((C5703) this.f17480).m10312(strM14102);
        }
    }

    @Override // p027.InterfaceC7039
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C7036 mo11821() throws IOException {
        C7028 c7028M12217;
        long j;
        C7028 c7028;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f17480).isEmpty() && !((C7035) this.f17481).m12205(null)) {
                    m12216();
                    iOException.getClass();
                    throw iOException;
                }
                if (((C7035) this.f17481).f17450.f17423) {
                    throw new IOException("Canceled");
                }
                C6686 c6686 = ((C7063) this.f17482).f17526;
                long jNanoTime = System.nanoTime();
                long j2 = this.f17483 - jNanoTime;
                if (((CopyOnWriteArrayList) this.f17480).isEmpty() || j2 <= 0) {
                    c7028M12217 = m12217();
                    j = 250000000;
                    this.f17483 = jNanoTime + 250000000;
                } else {
                    j = j2;
                    c7028M12217 = null;
                }
                if (c7028M12217 == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f17480;
                    if (copyOnWriteArrayList.isEmpty() || (c7028 = (C7028) ((LinkedBlockingDeque) this.f17479).poll(j, timeUnit)) == null) {
                        c7028M12217 = null;
                    } else {
                        copyOnWriteArrayList.remove(c7028.f17406);
                        c7028M12217 = c7028;
                    }
                    if (c7028M12217 == null) {
                    }
                }
                boolean z = false;
                if (c7028M12217.f17405 == null && c7028M12217.f17404 == null) {
                    m12216();
                    if (!c7028M12217.f17406.isReady()) {
                        c7028M12217 = c7028M12217.f17406.mo12179();
                    }
                    if (c7028M12217.f17405 == null && c7028M12217.f17404 == null) {
                        z = true;
                    }
                    if (z) {
                        return c7028M12217.f17406.mo12182();
                    }
                }
                Throwable th = c7028M12217.f17404;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        AbstractC6019.m10775(iOException, th);
                    }
                }
                InterfaceC7030 interfaceC7030 = c7028M12217.f17405;
                if (interfaceC7030 != null) {
                    ((C7035) this.f17481).f17447.addFirst(interfaceC7030);
                }
            } finally {
                m12216();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m12216() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f17480;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            InterfaceC7030 interfaceC7030 = (InterfaceC7030) it.next();
            interfaceC7030.cancel();
            InterfaceC7030 interfaceC7030Mo12183 = interfaceC7030.mo12183();
            if (interfaceC7030Mo12183 != null) {
                ((C7035) this.f17481).f17447.addLast(interfaceC7030Mo12183);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7028 m12217() {
        InterfaceC7030 c7038;
        C7035 c7035 = (C7035) this.f17481;
        if (c7035.m12205(null)) {
            try {
                c7038 = c7035.m12204();
            } catch (Throwable th) {
                c7038 = new C7038(th);
            }
            if (c7038.isReady()) {
                return new C7028(c7038, (Throwable) null, 6);
            }
            if (c7038 instanceof C7038) {
                return ((C7038) c7038).f17472;
            }
            ((CopyOnWriteArrayList) this.f17480).add(c7038);
            ((C7063) this.f17482).m12268().m12274(new C7042(AbstractC7059.f17511 + " connect " + c7035.f17452.f17160.m12105(), c7038, this), 0L);
        }
        return null;
    }

    public C7043(File file) {
        this.f17480 = new C5703(29);
        this.f17482 = file;
        this.f17483 = 262144000L;
        this.f17481 = new C8882(0);
    }
}
