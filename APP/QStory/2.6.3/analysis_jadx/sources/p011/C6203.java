package p011;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.InterfaceC6136;
import p012.C6218;
import p012.C6220;
import p012.C6221;
import p012.InterfaceC6215;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p015.C6235;
import p016.C6237;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6203 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f17070;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f17071;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f17072;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f17073;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f17074;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0734 f17075;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f17076;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public volatile C0734 f17077;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public volatile boolean f17078;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AtomicBoolean f17079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6204 f17080;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C6207 f17081;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f17082;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f17083;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC6210 f17084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6125 f17085;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6205 f17086;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6127 f17087;

    public C6203(C6127 c6127, C6125 c6125) {
        c6127.getClass();
        this.f17087 = c6127;
        this.f17085 = c6125;
        this.f17086 = (C6205) c6127.f16719.f16014;
        c6127.f16727.getClass();
        C6204 c6204 = new C6204(this);
        c6204.mo11455(c6127.f16736);
        this.f17080 = c6204;
        this.f17079 = new AtomicBoolean();
        this.f17070 = true;
        this.f17076 = new CopyOnWriteArrayList();
        new AtomicReference(c6125.f16712);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11632(C6203 c6203) {
        StringBuilder sb = new StringBuilder();
        sb.append(c6203.f17078 ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(c6203.f17085.f16716.m11546());
        return sb.toString();
    }

    public final void cancel() {
        if (this.f17078) {
            return;
        }
        this.f17078 = true;
        C0734 c0734 = this.f17077;
        if (c0734 != null) {
            ((InterfaceC6215) c0734.f2069).cancel();
        }
        Iterator it = this.f17076.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC6201) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new C6203(this.f17087, this.f17085);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11633(boolean z) {
        C0734 c0734;
        synchronized (this) {
            if (!this.f17070) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c0734 = this.f17077) != null) {
            ((InterfaceC6215) c0734.f2069).cancel();
            ((C6203) c0734.f2071).m11641(c0734, true, true, true, true, null);
        }
        this.f17075 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6131 m11634() {
        if (!this.f17079.compareAndSet(false, true)) {
            C5925.m11311("Already Executed");
            return null;
        }
        this.f17080.m11494();
        AbstractC6238 abstractC6238 = AbstractC6238.f17198;
        this.f17083 = AbstractC6238.f17198.mo11722();
        try {
            C0325 c0325 = this.f17087.f16730;
            synchronized (c0325) {
                ((ArrayDeque) c0325.f1093).add(this);
            }
            return m11639();
        } finally {
            C0325 c03252 = this.f17087.f16730;
            c03252.getClass();
            C0325.m956(c03252, null, this, null, 5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11635(InterfaceC6136 interfaceC6136) {
        if (!this.f17079.compareAndSet(false, true)) {
            C5925.m11311("Already Executed");
            return;
        }
        AbstractC6238 abstractC6238 = AbstractC6238.f17198;
        this.f17083 = AbstractC6238.f17198.mo11722();
        C0325 c0325 = this.f17087.f16730;
        RunnableC6211 runnableC6211 = new RunnableC6211(this, interfaceC6136);
        c0325.getClass();
        C0325.m956(c0325, runnableC6211, null, null, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final IOException m11636(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM11638;
        TimeZone timeZone = AbstractC6230.f17167;
        C6207 c6207 = this.f17081;
        if (c6207 != null) {
            synchronized (c6207) {
                socketM11638 = m11638();
            }
            if (this.f17081 == null) {
                if (socketM11638 != null) {
                    AbstractC6230.m11696(socketM11638);
                }
            } else if (socketM11638 != null) {
                C5925.m11311("Check failed.");
                return null;
            }
        }
        if (!this.f17082 && this.f17080.m11495()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11637(C6207 c6207) {
        c6207.getClass();
        TimeZone timeZone = AbstractC6230.f17167;
        if (this.f17081 != null) {
            C5925.m11311("Check failed.");
        } else {
            this.f17081 = c6207;
            c6207.f17118.add(new C6212(this, this.f17083));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Socket m11638() {
        C6207 c6207 = this.f17081;
        c6207.getClass();
        TimeZone timeZone = AbstractC6230.f17167;
        ArrayList arrayList = c6207.f17118;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC4395.m8907(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C5925.m11311("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f17081 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c6207.f17116 = System.nanoTime();
        C6205 c6205 = this.f17086;
        ConcurrentLinkedQueue concurrentLinkedQueue = c6205.f17089;
        TimeZone timeZone2 = AbstractC6230.f17167;
        if (!c6207.f17124) {
            c6205.f17091.m11715(c6205.f17090, 0L);
            return null;
        }
        c6207.f17124 = true;
        concurrentLinkedQueue.remove(c6207);
        if (concurrentLinkedQueue.isEmpty()) {
            C6235 c6235 = c6205.f17091;
            synchronized (c6235.f17191) {
                if (c6235.m11716()) {
                    c6235.f17191.m11710(c6235);
                }
            }
        }
        return c6207.f17110;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6131 m11639() {
        ArrayList arrayList = new ArrayList();
        AbstractC4344.m8804(this.f17087.f16729, arrayList);
        arrayList.add(new C6220(this.f17087));
        arrayList.add(new C6220(this.f17087.f16748));
        this.f17087.getClass();
        arrayList.add(new C6237(0));
        arrayList.add(C6198.f17058);
        AbstractC4344.m8804(this.f17087.f16728, arrayList);
        arrayList.add(C6218.f17140);
        C6125 c6125 = this.f17085;
        C6127 c6127 = this.f17087;
        try {
            try {
                C6131 c6131M11673 = new C6221(this, arrayList, 0, null, c6125, c6127.f16733, c6127.f16734, c6127.f16724).m11673(c6125);
                if (this.f17078) {
                    AbstractC6225.m11680(c6131M11673);
                    throw new IOException("Canceled");
                }
                m11640(null);
                return c6131M11673;
            } catch (IOException e) {
                IOException iOExceptionM11640 = m11640(e);
                iOExceptionM11640.getClass();
                throw iOExceptionM11640;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m11640(null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final IOException m11640(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f17070) {
                this.f17070 = false;
                if (!this.f17074 && !this.f17073 && !this.f17072) {
                    if (!this.f17071) {
                        z = true;
                    }
                }
            }
        }
        return z ? m11636(iOException) : iOException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final IOException m11641(C0734 c0734, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        c0734.getClass();
        if (c0734.equals(this.f17077)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.f17074) {
                            if ((z2 || !this.f17073) && ((!z4 || !this.f17072) && (!z3 || !this.f17071))) {
                            }
                        }
                        if (z) {
                            this.f17074 = false;
                        }
                        if (z2) {
                            this.f17073 = false;
                        }
                        if (z4) {
                            this.f17072 = false;
                        }
                        if (z3) {
                            this.f17071 = false;
                        }
                        boolean z7 = (this.f17074 || this.f17073 || this.f17072 || this.f17071) ? false : true;
                        if (z7) {
                            if (!this.f17070) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.f17077 = null;
                C6207 c6207 = this.f17081;
                if (c6207 != null) {
                    synchronized (c6207) {
                        c6207.f17115++;
                    }
                }
            }
            if (z6) {
                return m11636(iOException);
            }
        }
        return iOException;
    }
}
