package io.ktor.server.engine;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.lazy.C0755;
import androidx.window.area.C2558;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4058;
import io.ktor.server.application.C4059;
import io.ktor.server.cio.C4081;
import io.ktor.server.cio.C4082;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC5399;
import p230.C8049;
import p230.C8053;
import p240.C8135;
import p252.AbstractC8187;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4102 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f12452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ReentrantReadWriteLock f12453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4082 f12454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4092 f12455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8049 f12456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4059 f12457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4081 f12458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C4058 f12459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC5184 f12460;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f12461;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ClassLoader f12462;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f12463;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final List f12464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f12465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f12466;

    public C4102(C4059 c4059, C1067 c1067) {
        this.f12457 = c4059;
        C4092 c4092 = c4059.f12352;
        C8049 c8049 = c4092.f12435;
        this.f12456 = c8049;
        this.f12455 = c4092;
        C4082 c4082 = new C4082();
        Runtime.getRuntime().availableProcessors();
        c4082.f12399 = 1000L;
        c4082.f12398 = new ArrayList();
        c4082.f12397 = 45;
        c1067.invoke(c4082);
        this.f12454 = c4082;
        this.f12453 = new ReentrantReadWriteLock();
        List listM13545 = EmptyList.INSTANCE;
        this.f12461 = listM13545;
        C8053 c8053 = c4092.f12436;
        C8053 c8053M13542 = c8053.m13542("ktor.deployment.watch");
        List listM135452 = c8053M13542 != null ? c8053M13542.m13545() : null;
        listM135452 = listM135452 == null ? listM13545 : listM135452;
        this.f12465 = listM135452;
        this.f12466 = AbstractC4344.m8793(c4059.f12350, listM135452);
        C8053 c8053M135422 = c8053.m13542("ktor.application.modules");
        listM13545 = c8053M135422 != null ? c8053M135422.m13545() : listM13545;
        this.f12463 = listM13545;
        this.f12464 = listM13545;
        this.f12459 = new C4058(c4092, c4059.f12348, c4059.f12349, c8049, c4059.f12347, new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.EmbeddedServer$_applicationInstance$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return ((C4102) this.receiver).f12458;
            }
        });
        this.f12458 = new C4081(c4092, c8049, c4059.f12348, c4082, new EmbeddedServer$engine$1(this));
        this.f12460 = AbstractC5187.m10214(new C2558(5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8502(String str, ClassLoader classLoader, C4058 c4058) {
        C0755 c0755 = new C0755(classLoader, str, c4058, 5);
        ThreadLocal threadLocal = AbstractC8187.f22560;
        Object arrayList = threadLocal.get();
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            threadLocal.set(arrayList);
        }
        List list = (List) arrayList;
        if (list.contains(str)) {
            C5925.m11312(AbstractC0053.m158("Module startup is already in progress for function ", str, " (recursive module startup from module main?)"));
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
    public final void m8503() {
        C1030 c1030 = new C1030(this, 11);
        if (AbstractC4088.f12424) {
            this.f12456.m13534(AbstractC4060.f12358, new C4091(this, 2, c1030));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12453;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i = 0; i < readHoldCount; i++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                Pair pairM8507 = m8507();
                C4058 c4058 = (C4058) pairM8507.component1();
                ClassLoader classLoader = (ClassLoader) pairM8507.component2();
                this.f12459 = c4058;
                this.f12462 = classLoader;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.lock();
                }
                writeLock.unlock();
                AbstractC5399.m10477(AbstractC5399.m10489(m8506().f12343), null, null, new EmbeddedServer$start$3(this, null), 3);
                this.f12458.m8482(false);
            } catch (Throwable th) {
                m8505();
                if (!this.f12466.isEmpty()) {
                    try {
                        WatchService watchService = (WatchService) this.f12460.getValue();
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
    public final C4058 m8504(ClassLoader classLoader) {
        C4058 c4058;
        if (this.f12452 || (c4058 = this.f12459) == null) {
            C4059 c4059 = this.f12457;
            c4058 = new C4058(this.f12455, c4059.f12348, c4059.f12349, this.f12456, c4059.f12347, new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.EmbeddedServer$instantiateAndConfigureApplication$newInstance$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
                public Object get() {
                    return ((C4102) this.receiver).f12458;
                }
            });
        } else {
            this.f12452 = true;
        }
        C8135 c8135 = AbstractC4060.f12358;
        C8049 c8049 = this.f12456;
        c8049.getClass();
        try {
            c8049.m13532(c8135, c4058);
        } catch (Throwable unused) {
        }
        try {
            new C0755(this, classLoader, c4058, 4).invoke();
            ThreadLocal threadLocal = AbstractC8187.f22560;
            List list = (List) threadLocal.get();
            if (list != null && list.isEmpty()) {
                threadLocal.remove();
            }
            C8135 c81352 = AbstractC4060.f12357;
            c8049.getClass();
            try {
                c8049.m13532(c81352, c4058);
            } catch (Throwable unused2) {
            }
            return c4058;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8505() {
        C4058 c4058 = this.f12459;
        ClassLoader classLoader = this.f12462;
        this.f12459 = null;
        this.f12462 = null;
        if (c4058 != null) {
            C8135 c8135 = AbstractC4060.f12354;
            C8049 c8049 = this.f12456;
            c8049.getClass();
            try {
                c8049.m13532(c8135, c4058);
            } catch (Throwable unused) {
            }
            try {
                c4058.m8463();
                C4096 c4096 = classLoader instanceof C4096 ? (C4096) classLoader : null;
                if (c4096 != null) {
                    c4096.close();
                }
            } catch (Throwable th) {
                this.f12455.f12437.error("Failed to destroy application instance.", th);
            }
            C8135 c81352 = AbstractC4060.f12353;
            c8049.getClass();
            try {
                c8049.m13532(c81352, c4058);
            } catch (Throwable unused2) {
            }
        }
        Iterator it = this.f12461.iterator();
        while (it.hasNext()) {
            ((WatchKey) it.next()).cancel();
        }
        this.f12461 = new ArrayList();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4058 m8506() {
        InterfaceC9141 interfaceC9141 = this.f12455.f12437;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12453;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            C4058 c4058 = this.f12459;
            if (c4058 == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.f12457.f12348) {
                List list = this.f12461;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<WatchEvent<?>> listPollEvents = ((WatchKey) it.next()).pollEvents();
                    listPollEvents.getClass();
                    AbstractC4344.m8804(listPollEvents, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    interfaceC9141.info("Changes in application detected.");
                    int size = arrayList.size();
                    while (true) {
                        Thread.sleep(200L);
                        List list2 = this.f12461;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List<WatchEvent<?>> listPollEvents2 = ((WatchKey) it2.next()).pollEvents();
                            listPollEvents2.getClass();
                            AbstractC4344.m8804(listPollEvents2, arrayList2);
                        }
                        if (arrayList2.isEmpty()) {
                            break;
                        }
                        interfaceC9141.debug("Waiting for more changes.");
                        size += arrayList2.size();
                    }
                    interfaceC9141.debug("Changes to " + size + " files caused application restart.");
                    Iterator it3 = AbstractC4344.m8799(5, arrayList).iterator();
                    while (it3.hasNext()) {
                        interfaceC9141.debug("...  " + ((WatchEvent) it3.next()).context());
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
                        m8505();
                        Pair pairM8507 = m8507();
                        C4058 c40582 = (C4058) pairM8507.component1();
                        ClassLoader classLoader = (ClassLoader) pairM8507.component2();
                        this.f12459 = c40582;
                        this.f12462 = classLoader;
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        c4058 = this.f12459;
                        if (c4058 == null) {
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
            return c4058;
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
    public final kotlin.Pair m8507() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.C4102.m8507():kotlin.Pair");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8508(long j, long j2) throws Throwable {
        TimeUnit.MILLISECONDS.getClass();
        try {
            this.f12458.m8480(j, j2);
        } catch (Exception e) {
            this.f12455.f12437.warn("Exception occurred during engine shutdown", e);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12453;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            m8505();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (this.f12466.isEmpty()) {
                return;
            }
            try {
                WatchService watchService = (WatchService) this.f12460.getValue();
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
