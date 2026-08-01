package io.ktor.server.engine;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.lazy.C0755;
import androidx.window.area.C2558;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4057;
import io.ktor.server.application.C4058;
import io.ktor.server.cio.C4080;
import io.ktor.server.cio.C4081;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC5398;
import p230.C8048;
import p230.C8052;
import p240.C8134;
import p252.AbstractC8186;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f12448;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ReentrantReadWriteLock f12449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4081 f12450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4091 f12451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8048 f12452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4058 f12453;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4080 f12454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C4057 f12455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC5183 f12456;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f12457;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ClassLoader f12458;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f12459;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final List f12460;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f12461;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f12462;

    public C4101(C4058 c4058, C1067 c1067) {
        this.f12453 = c4058;
        C4091 c4091 = c4058.f12348;
        C8048 c8048 = c4091.f12431;
        this.f12452 = c8048;
        this.f12451 = c4091;
        C4081 c4081 = new C4081();
        Runtime.getRuntime().availableProcessors();
        c4081.f12395 = 1000L;
        c4081.f12394 = new ArrayList();
        c4081.f12393 = 45;
        c1067.invoke(c4081);
        this.f12450 = c4081;
        this.f12449 = new ReentrantReadWriteLock();
        List listM13516 = EmptyList.INSTANCE;
        this.f12457 = listM13516;
        C8052 c8052 = c4091.f12432;
        C8052 c8052M13513 = c8052.m13513("ktor.deployment.watch");
        List listM135162 = c8052M13513 != null ? c8052M13513.m13516() : null;
        listM135162 = listM135162 == null ? listM13516 : listM135162;
        this.f12461 = listM135162;
        this.f12462 = AbstractC4343.m8825(c4058.f12346, listM135162);
        C8052 c8052M135132 = c8052.m13513("ktor.application.modules");
        listM13516 = c8052M135132 != null ? c8052M135132.m13516() : listM13516;
        this.f12459 = listM13516;
        this.f12460 = listM13516;
        this.f12455 = new C4057(c4091, c4058.f12344, c4058.f12345, c8048, c4058.f12343, new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.EmbeddedServer$_applicationInstance$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return ((C4101) this.receiver).f12454;
            }
        });
        this.f12454 = new C4080(c4091, c8048, c4058.f12344, c4081, new EmbeddedServer$engine$1(this));
        this.f12456 = AbstractC5186.m10210(new C2558(5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8512(String str, ClassLoader classLoader, C4057 c4057) {
        C0755 c0755 = new C0755(classLoader, str, c4057, 5);
        ThreadLocal threadLocal = AbstractC8186.f22561;
        Object arrayList = threadLocal.get();
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            threadLocal.set(arrayList);
        }
        List list = (List) arrayList;
        if (list.contains(str)) {
            C5919.m11251(AbstractC0053.m156("Module startup is already in progress for function ", str, " (recursive module startup from module main?)"));
            return;
        }
        list.add(str);
        try {
            c0755.invoke();
        } finally {
            list.remove(str);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8513() {
        C1030 c1030 = new C1030(this, 11);
        if (AbstractC4087.f12420) {
            this.f12452.m13504(AbstractC4059.f12354, new C4090(this, 2, c1030));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12449;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i = 0; i < readHoldCount; i++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                Pair pairM8517 = m8517();
                C4057 c4057 = (C4057) pairM8517.component1();
                ClassLoader classLoader = (ClassLoader) pairM8517.component2();
                this.f12455 = c4057;
                this.f12458 = classLoader;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.lock();
                }
                writeLock.unlock();
                AbstractC5398.m10473(AbstractC5398.m10485(m8516().f12339), null, null, new EmbeddedServer$start$3(this, null), 3);
                this.f12454.m8492(false);
            } catch (Throwable th) {
                m8515();
                if (!this.f12462.isEmpty()) {
                    try {
                        WatchService watchService = (WatchService) this.f12456.getValue();
                        if (watchService != null) {
                            watchService.close();
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.lock();
            }
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4057 m8514(ClassLoader classLoader) {
        C4057 c4057;
        if (this.f12448 || (c4057 = this.f12455) == null) {
            C4058 c4058 = this.f12453;
            c4057 = new C4057(this.f12451, c4058.f12344, c4058.f12345, this.f12452, c4058.f12343, new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.EmbeddedServer$instantiateAndConfigureApplication$newInstance$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
                public Object get() {
                    return ((C4101) this.receiver).f12454;
                }
            });
        } else {
            this.f12448 = true;
        }
        C8134 c8134 = AbstractC4059.f12354;
        C8048 c8048 = this.f12452;
        c8048.getClass();
        try {
            c8048.m13505(c8134, c4057);
        } catch (Throwable unused) {
        }
        try {
            new C0755(this, classLoader, c4057, 4).invoke();
            ThreadLocal threadLocal = AbstractC8186.f22561;
            List list = (List) threadLocal.get();
            if (list != null && list.isEmpty()) {
                threadLocal.remove();
            }
            C8134 c81342 = AbstractC4059.f12353;
            c8048.getClass();
            try {
                c8048.m13505(c81342, c4057);
            } catch (Throwable unused2) {
            }
            return c4057;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8515() {
        C4057 c4057 = this.f12455;
        ClassLoader classLoader = this.f12458;
        this.f12455 = null;
        this.f12458 = null;
        if (c4057 != null) {
            C8134 c8134 = AbstractC4059.f12350;
            C8048 c8048 = this.f12452;
            c8048.getClass();
            try {
                c8048.m13505(c8134, c4057);
            } catch (Throwable unused) {
            }
            try {
                c4057.m8473();
                C4095 c4095 = classLoader instanceof C4095 ? (C4095) classLoader : null;
                if (c4095 != null) {
                    c4095.close();
                }
            } catch (Throwable th) {
                this.f12451.f12433.error("Failed to destroy application instance.", th);
            }
            C8134 c81342 = AbstractC4059.f12349;
            c8048.getClass();
            try {
                c8048.m13505(c81342, c4057);
            } catch (Throwable unused2) {
            }
        }
        Iterator it = this.f12457.iterator();
        while (it.hasNext()) {
            ((WatchKey) it.next()).cancel();
        }
        this.f12457 = new ArrayList();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4057 m8516() {
        InterfaceC9156 interfaceC9156 = this.f12451.f12433;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12449;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            C4057 c4057 = this.f12455;
            if (c4057 == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.f12453.f12344) {
                List list = this.f12457;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<WatchEvent<?>> listPollEvents = ((WatchKey) it.next()).pollEvents();
                    listPollEvents.getClass();
                    AbstractC4343.m8794(listPollEvents, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    interfaceC9156.info("Changes in application detected.");
                    int size = arrayList.size();
                    while (true) {
                        Thread.sleep(200L);
                        List list2 = this.f12457;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List<WatchEvent<?>> listPollEvents2 = ((WatchKey) it2.next()).pollEvents();
                            listPollEvents2.getClass();
                            AbstractC4343.m8794(listPollEvents2, arrayList2);
                        }
                        if (arrayList2.isEmpty()) {
                            break;
                        }
                        interfaceC9156.debug("Waiting for more changes.");
                        size += arrayList2.size();
                    }
                    interfaceC9156.debug("Changes to " + size + " files caused application restart.");
                    Iterator it3 = AbstractC4343.m8816(5, arrayList).iterator();
                    while (it3.hasNext()) {
                        interfaceC9156.debug("...  " + ((WatchEvent) it3.next()).context());
                    }
                    ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                    int i = 0;
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        lock2.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        m8515();
                        Pair pairM8517 = m8517();
                        C4057 c40572 = (C4057) pairM8517.component1();
                        ClassLoader classLoader = (ClassLoader) pairM8517.component2();
                        this.f12455 = c40572;
                        this.f12458 = classLoader;
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        c4057 = this.f12455;
                        if (c4057 == null) {
                            throw new IllegalStateException("EmbeddedServer was stopped");
                        }
                    } catch (Throwable th) {
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
            }
            lock.unlock();
            return c4057;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair m8517() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.C4101.m8517():kotlin.Pair");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8518(long j, long j2) throws Throwable {
        TimeUnit.MILLISECONDS.getClass();
        try {
            this.f12454.m8490(j, j2);
        } catch (Exception e) {
            this.f12451.f12433.warn("Exception occurred during engine shutdown", e);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12449;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            m8515();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (this.f12462.isEmpty()) {
                return;
            }
            try {
                WatchService watchService = (WatchService) this.f12456.getValue();
                if (watchService != null) {
                    watchService.close();
                }
            } catch (NoClassDefFoundError unused) {
            }
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
