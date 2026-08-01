package p011;

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
import kotlin.AbstractC5187;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p013.AbstractC6230;
import p015.C6234;
import p230.C8049;
import p230.C8050;
import p230.C8051;
import p230.C8053;
import p230.InterfaceC8052;
import p286.C8397;
import p286.InterfaceC8393;
import p286.InterfaceC8396;
import p288.C8410;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6214 implements InterfaceC6210, InterfaceC8052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f17134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f17135;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f17136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f17137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f17138;

    public C6214(C6206 c6206, C6234 c6234) {
        c6234.getClass();
        this.f17136 = c6206;
        this.f17137 = c6234;
        this.f17138 = Long.MIN_VALUE;
        this.f17135 = new CopyOnWriteArrayList();
        this.f17134 = new LinkedBlockingDeque();
    }

    @Override // p011.InterfaceC6210
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C6206 mo11261() {
        return (C6206) this.f17136;
    }

    @Override // p230.InterfaceC8052
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public File mo11654(InterfaceC8393 interfaceC8393) {
        String strM13543 = ((C8053) this.f17136).m13543(interfaceC8393);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM13543 + " for for Key: " + interfaceC8393);
        }
        try {
            C8049 c8049M13990 = m11655().m13990(strM13543);
            if (c8049M13990 != null) {
                return ((File[]) c8049M13990.f22219)[0];
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
    public synchronized C8410 m11655() {
        try {
            if (((C8410) this.f17134) == null) {
                this.f17134 = C8410.m13982(this.f17138, (File) this.f17137);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C8410) this.f17134;
    }

    @Override // p230.InterfaceC8052
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo11656(InterfaceC8393 interfaceC8393, C0108 c0108) {
        C8051 c8051;
        boolean z;
        String strM13543 = ((C8053) this.f17136).m13543(interfaceC8393);
        C4871 c4871 = (C4871) this.f17135;
        synchronized (c4871) {
            c8051 = (C8051) ((HashMap) c4871.f14164).get(strM13543);
            if (c8051 == null) {
                C8050 c8050 = (C8050) c4871.f14165;
                synchronized (c8050.f22221) {
                    c8051 = (C8051) c8050.f22221.poll();
                }
                if (c8051 == null) {
                    c8051 = new C8051();
                }
                ((HashMap) c4871.f14164).put(strM13543, c8051);
            }
            c8051.f22222++;
        }
        c8051.f22223.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM13543 + " for for Key: " + interfaceC8393);
            }
            try {
                C8410 c8410M11655 = m11655();
                if (c8410M11655.m13990(strM13543) == null) {
                    C0734 c0734M13988 = c8410M11655.m13988(strM13543);
                    if (c0734M13988 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM13543));
                    }
                    try {
                        if (((InterfaceC8396) c0108.f319).mo299(c0108.f320, c0734M13988.m1539(), (C8397) c0108.f318)) {
                            C8410.m13979((C8410) c0734M13988.f2069, c0734M13988, true);
                            c0734M13988.f2072 = true;
                        }
                        if (!z) {
                            try {
                                c0734M13988.m1541();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c0734M13988.f2072) {
                            try {
                                c0734M13988.m1541();
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
            ((C4871) this.f17135).m9753(strM13543);
        }
    }

    @Override // p011.InterfaceC6210
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C6207 mo11262() throws IOException {
        C6199 c6199M11658;
        long j;
        C6199 c6199;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f17135).isEmpty() && !((C6206) this.f17136).m11646(null)) {
                    m11657();
                    iOException.getClass();
                    throw iOException;
                }
                if (((C6206) this.f17136).f17105.f17078) {
                    throw new IOException("Canceled");
                }
                C5856 c5856 = ((C6234) this.f17137).f17181;
                long jNanoTime = System.nanoTime();
                long j2 = this.f17138 - jNanoTime;
                if (((CopyOnWriteArrayList) this.f17135).isEmpty() || j2 <= 0) {
                    c6199M11658 = m11658();
                    j = 250000000;
                    this.f17138 = jNanoTime + 250000000;
                } else {
                    j = j2;
                    c6199M11658 = null;
                }
                if (c6199M11658 == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f17135;
                    if (copyOnWriteArrayList.isEmpty() || (c6199 = (C6199) ((LinkedBlockingDeque) this.f17134).poll(j, timeUnit)) == null) {
                        c6199M11658 = null;
                    } else {
                        copyOnWriteArrayList.remove(c6199.f17061);
                        c6199M11658 = c6199;
                    }
                    if (c6199M11658 == null) {
                    }
                }
                boolean z = false;
                if (c6199M11658.f17060 == null && c6199M11658.f17059 == null) {
                    m11657();
                    if (!c6199M11658.f17061.isReady()) {
                        c6199M11658 = c6199M11658.f17061.mo11620();
                    }
                    if (c6199M11658.f17060 == null && c6199M11658.f17059 == null) {
                        z = true;
                    }
                    if (z) {
                        return c6199M11658.f17061.mo11623();
                    }
                }
                Throwable th = c6199M11658.f17059;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        AbstractC5187.m10216(iOException, th);
                    }
                }
                InterfaceC6201 interfaceC6201 = c6199M11658.f17060;
                if (interfaceC6201 != null) {
                    ((C6206) this.f17136).f17102.addFirst(interfaceC6201);
                }
            } finally {
                m11657();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11657() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f17135;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            InterfaceC6201 interfaceC6201 = (InterfaceC6201) it.next();
            interfaceC6201.cancel();
            InterfaceC6201 interfaceC6201Mo11624 = interfaceC6201.mo11624();
            if (interfaceC6201Mo11624 != null) {
                ((C6206) this.f17136).f17102.addLast(interfaceC6201Mo11624);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6199 m11658() {
        InterfaceC6201 c6209;
        C6206 c6206 = (C6206) this.f17136;
        if (c6206.m11646(null)) {
            try {
                c6209 = c6206.m11645();
            } catch (Throwable th) {
                c6209 = new C6209(th);
            }
            if (c6209.isReady()) {
                return new C6199(c6209, (Throwable) null, 6);
            }
            if (c6209 instanceof C6209) {
                return ((C6209) c6209).f17127;
            }
            ((CopyOnWriteArrayList) this.f17135).add(c6209);
            ((C6234) this.f17137).m11709().m11715(new C6213(AbstractC6230.f17166 + " connect " + c6206.f17107.f16815.m11546(), c6209, this), 0L);
        }
        return null;
    }

    public C6214(File file) {
        this.f17135 = new C4871(29);
        this.f17137 = file;
        this.f17138 = 262144000L;
        this.f17136 = new C8053(0);
    }
}
