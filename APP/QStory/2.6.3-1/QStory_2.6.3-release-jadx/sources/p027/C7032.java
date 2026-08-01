package p027;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.lazy.layout.C1575;
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
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.InterfaceC6965;
import p028.C7047;
import p028.C7049;
import p028.C7050;
import p028.InterfaceC7044;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p031.C7064;
import p032.C7066;
import p033.AbstractC7067;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7032 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f17415;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f17416;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f17417;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f17418;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f17419;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C1575 f17420;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f17421;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public volatile C1575 f17422;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public volatile boolean f17423;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AtomicBoolean f17424;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7033 f17425;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C7036 f17426;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f17427;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f17428;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC7039 f17429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6954 f17430;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7034 f17431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6956 f17432;

    public C7032(C6956 c6956, C6954 c6954) {
        c6956.getClass();
        this.f17432 = c6956;
        this.f17430 = c6954;
        this.f17431 = (C7034) c6956.f17064.f16359;
        c6956.f17072.getClass();
        C7033 c7033 = new C7033(this);
        c7033.mo12014(c6956.f17081);
        this.f17425 = c7033;
        this.f17424 = new AtomicBoolean();
        this.f17415 = true;
        this.f17421 = new CopyOnWriteArrayList();
        new AtomicReference(c6954.f17057);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m12191(C7032 c7032) {
        StringBuilder sb = new StringBuilder();
        sb.append(c7032.f17423 ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(c7032.f17430.f17061.m12105());
        return sb.toString();
    }

    public final void cancel() {
        if (this.f17423) {
            return;
        }
        this.f17423 = true;
        C1575 c1575 = this.f17422;
        if (c1575 != null) {
            ((InterfaceC7044) c1575.f2414).cancel();
        }
        Iterator it = this.f17421.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC7030) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new C7032(this.f17432, this.f17430);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12192(boolean z) {
        C1575 c1575;
        synchronized (this) {
            if (!this.f17415) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c1575 = this.f17422) != null) {
            ((InterfaceC7044) c1575.f2414).cancel();
            ((C7032) c1575.f2416).m12200(c1575, true, true, true, true, null);
        }
        this.f17420 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6960 m12193() {
        if (!this.f17424.compareAndSet(false, true)) {
            C6755.m11870("Already Executed");
            return null;
        }
        this.f17425.m12053();
        AbstractC7067 abstractC7067 = AbstractC7067.f17543;
        this.f17428 = AbstractC7067.f17543.mo12281();
        try {
            C1171 c1171 = this.f17432.f17075;
            synchronized (c1171) {
                ((ArrayDeque) c1171.f1438).add(this);
            }
            return m12198();
        } finally {
            C1171 c11712 = this.f17432.f17075;
            c11712.getClass();
            C1171.m1516(c11712, null, this, null, 5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12194(InterfaceC6965 interfaceC6965) {
        if (!this.f17424.compareAndSet(false, true)) {
            C6755.m11870("Already Executed");
            return;
        }
        AbstractC7067 abstractC7067 = AbstractC7067.f17543;
        this.f17428 = AbstractC7067.f17543.mo12281();
        C1171 c1171 = this.f17432.f17075;
        RunnableC7040 runnableC7040 = new RunnableC7040(this, interfaceC6965);
        c1171.getClass();
        C1171.m1516(c1171, runnableC7040, null, null, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final IOException m12195(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM12197;
        TimeZone timeZone = AbstractC7059.f17512;
        C7036 c7036 = this.f17426;
        if (c7036 != null) {
            synchronized (c7036) {
                socketM12197 = m12197();
            }
            if (this.f17426 == null) {
                if (socketM12197 != null) {
                    AbstractC7059.m12255(socketM12197);
                }
            } else if (socketM12197 != null) {
                C6755.m11870("Check failed.");
                return null;
            }
        }
        if (!this.f17427 && this.f17425.m12054()) {
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
    public final void m12196(C7036 c7036) {
        c7036.getClass();
        TimeZone timeZone = AbstractC7059.f17512;
        if (this.f17426 != null) {
            C6755.m11870("Check failed.");
        } else {
            this.f17426 = c7036;
            c7036.f17463.add(new C7041(this, this.f17428));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Socket m12197() {
        C7036 c7036 = this.f17426;
        c7036.getClass();
        TimeZone timeZone = AbstractC7059.f17512;
        ArrayList arrayList = c7036.f17463;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC5227.m9466(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C6755.m11870("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f17426 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c7036.f17461 = System.nanoTime();
        C7034 c7034 = this.f17431;
        ConcurrentLinkedQueue concurrentLinkedQueue = c7034.f17434;
        TimeZone timeZone2 = AbstractC7059.f17512;
        if (!c7036.f17469) {
            c7034.f17436.m12274(c7034.f17435, 0L);
            return null;
        }
        c7036.f17469 = true;
        concurrentLinkedQueue.remove(c7036);
        if (concurrentLinkedQueue.isEmpty()) {
            C7064 c7064 = c7034.f17436;
            synchronized (c7064.f17536) {
                if (c7064.m12275()) {
                    c7064.f17536.m12269(c7064);
                }
            }
        }
        return c7036.f17455;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6960 m12198() {
        ArrayList arrayList = new ArrayList();
        AbstractC5176.m9363(this.f17432.f17074, arrayList);
        arrayList.add(new C7049(this.f17432));
        arrayList.add(new C7049(this.f17432.f17093));
        this.f17432.getClass();
        arrayList.add(new C7066(0));
        arrayList.add(C7027.f17403);
        AbstractC5176.m9363(this.f17432.f17073, arrayList);
        arrayList.add(C7047.f17485);
        C6954 c6954 = this.f17430;
        C6956 c6956 = this.f17432;
        try {
            try {
                C6960 c6960M12232 = new C7050(this, arrayList, 0, null, c6954, c6956.f17078, c6956.f17079, c6956.f17069).m12232(c6954);
                if (this.f17423) {
                    AbstractC7054.m12239(c6960M12232);
                    throw new IOException("Canceled");
                }
                m12199(null);
                return c6960M12232;
            } catch (IOException e) {
                IOException iOExceptionM12199 = m12199(e);
                iOExceptionM12199.getClass();
                throw iOExceptionM12199;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m12199(null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final IOException m12199(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f17415) {
                this.f17415 = false;
                if (!this.f17419 && !this.f17418 && !this.f17417) {
                    if (!this.f17416) {
                        z = true;
                    }
                }
            }
        }
        return z ? m12195(iOException) : iOException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final IOException m12200(C1575 c1575, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        c1575.getClass();
        if (c1575.equals(this.f17422)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.f17419) {
                            if ((z2 || !this.f17418) && ((!z4 || !this.f17417) && (!z3 || !this.f17416))) {
                            }
                        }
                        if (z) {
                            this.f17419 = false;
                        }
                        if (z2) {
                            this.f17418 = false;
                        }
                        if (z4) {
                            this.f17417 = false;
                        }
                        if (z3) {
                            this.f17416 = false;
                        }
                        boolean z7 = (this.f17419 || this.f17418 || this.f17417 || this.f17416) ? false : true;
                        if (z7) {
                            if (!this.f17415) {
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
                this.f17422 = null;
                C7036 c7036 = this.f17426;
                if (c7036 != null) {
                    synchronized (c7036) {
                        c7036.f17460++;
                    }
                }
            }
            if (z6) {
                return m12195(iOException);
            }
        }
        return iOException;
    }
}
