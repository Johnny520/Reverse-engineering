package io.ktor.server.engine;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.lazy.C1596;
import androidx.window.area.C3391;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.C4891;
import io.ktor.server.application.InterfaceC4887;
import io.ktor.server.cio.C4913;
import io.ktor.server.cio.C4914;
import io.ktor.util.C5036;
import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.p010io.InterfaceC6313;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p246.C8878;
import p246.C8882;
import p252.C8926;
import p256.C8964;
import p268.AbstractC9016;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4934 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f12797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ReentrantReadWriteLock f12798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4914 f12799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4924 f12800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8878 f12801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4891 f12802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4913 f12803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C4890 f12804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC6016 f12805;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f12806;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ClassLoader f12807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f12808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final List f12809;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f12810;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f12811;

    public C4934(C4891 c4891, C1905 c1905) {
        this.f12802 = c4891;
        C4924 c4924 = c4891.f12697;
        C8878 c8878 = c4924.f12780;
        this.f12801 = c8878;
        this.f12800 = c4924;
        C4914 c4914 = new C4914();
        Runtime.getRuntime().availableProcessors();
        c4914.f12744 = 1000L;
        c4914.f12743 = new ArrayList();
        c4914.f12742 = 45;
        c1905.invoke(c4914);
        this.f12799 = c4914;
        this.f12798 = new ReentrantReadWriteLock();
        List listM14104 = EmptyList.INSTANCE;
        this.f12806 = listM14104;
        C8882 c8882 = c4924.f12781;
        C8882 c8882M14101 = c8882.m14101("ktor.deployment.watch");
        List listM141042 = c8882M14101 != null ? c8882M14101.m14104() : null;
        listM141042 = listM141042 == null ? listM14104 : listM141042;
        this.f12810 = listM141042;
        this.f12811 = AbstractC5176.m9352(c4891.f12695, listM141042);
        C8882 c8882M141012 = c8882.m14101("ktor.application.modules");
        listM14104 = c8882M141012 != null ? c8882M141012.m14104() : listM14104;
        this.f12808 = listM14104;
        this.f12809 = listM14104;
        this.f12804 = new C4890(c4924, c4891.f12693, c4891.f12694, c8878, c4891.f12692, new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.EmbeddedServer$_applicationInstance$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return ((C4934) this.receiver).f12803;
            }
        });
        this.f12803 = new C4913(c4924, c8878, c4891.f12693, c4914, new EmbeddedServer$engine$1(this));
        this.f12805 = AbstractC6019.m10773(new C3391(5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m9061(String str, ClassLoader classLoader, C4890 c4890) {
        C1596 c1596 = new C1596(classLoader, str, c4890, 5);
        ThreadLocal threadLocal = AbstractC9016.f22905;
        Object arrayList = threadLocal.get();
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            threadLocal.set(arrayList);
        }
        List list = (List) arrayList;
        if (list.contains(str)) {
            C6755.m11871(AbstractC0900.m718("Module startup is already in progress for function ", str, " (recursive module startup from module main?)"));
            return;
        }
        list.add(str);
        try {
            c1596.invoke();
        } finally {
            list.remove(str);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m9062() {
        C1868 c1868 = new C1868(this, 11);
        if (AbstractC4920.f12769) {
            this.f12801.m14093(AbstractC4892.f12703, new C4923(this, 2, c1868));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12798;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i = 0; i < readHoldCount; i++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                Pair pairM9066 = m9066();
                C4890 c4890 = (C4890) pairM9066.component1();
                ClassLoader classLoader = (ClassLoader) pairM9066.component2();
                this.f12804 = c4890;
                this.f12807 = classLoader;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.lock();
                }
                writeLock.unlock();
                AbstractC6231.m11036(AbstractC6231.m11048(m9065().f12688), null, null, new EmbeddedServer$start$3(this, null), 3);
                this.f12803.m9041(false);
            } catch (Throwable th) {
                m9064();
                if (!this.f12811.isEmpty()) {
                    try {
                        WatchService watchService = (WatchService) this.f12805.getValue();
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
    public final C4890 m9063(ClassLoader classLoader) {
        C4890 c4890;
        if (this.f12797 || (c4890 = this.f12804) == null) {
            C4891 c4891 = this.f12802;
            c4890 = new C4890(this.f12800, c4891.f12693, c4891.f12694, this.f12801, c4891.f12692, new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.EmbeddedServer$instantiateAndConfigureApplication$newInstance$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
                public Object get() {
                    return ((C4934) this.receiver).f12803;
                }
            });
        } else {
            this.f12797 = true;
        }
        C8964 c8964 = AbstractC4892.f12703;
        C8878 c8878 = this.f12801;
        c8878.getClass();
        try {
            c8878.m14091(c8964, c4890);
        } catch (Throwable unused) {
        }
        try {
            new C1596(this, classLoader, c4890, 4).invoke();
            ThreadLocal threadLocal = AbstractC9016.f22905;
            List list = (List) threadLocal.get();
            if (list != null && list.isEmpty()) {
                threadLocal.remove();
            }
            C8964 c89642 = AbstractC4892.f12702;
            c8878.getClass();
            try {
                c8878.m14091(c89642, c4890);
            } catch (Throwable unused2) {
            }
            return c4890;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9064() {
        C4890 c4890 = this.f12804;
        ClassLoader classLoader = this.f12807;
        this.f12804 = null;
        this.f12807 = null;
        if (c4890 != null) {
            C8964 c8964 = AbstractC4892.f12699;
            C8878 c8878 = this.f12801;
            c8878.getClass();
            try {
                c8878.m14091(c8964, c4890);
            } catch (Throwable unused) {
            }
            try {
                c4890.m9022();
                C4928 c4928 = classLoader instanceof C4928 ? (C4928) classLoader : null;
                if (c4928 != null) {
                    c4928.close();
                }
            } catch (Throwable th) {
                this.f12800.f12782.error("Failed to destroy application instance.", th);
            }
            C8964 c89642 = AbstractC4892.f12698;
            c8878.getClass();
            try {
                c8878.m14091(c89642, c4890);
            } catch (Throwable unused2) {
            }
        }
        Iterator it = this.f12806.iterator();
        while (it.hasNext()) {
            ((WatchKey) it.next()).cancel();
        }
        this.f12806 = new ArrayList();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4890 m9065() {
        InterfaceC9970 interfaceC9970 = this.f12800.f12782;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12798;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            C4890 c4890 = this.f12804;
            if (c4890 == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.f12802.f12693) {
                List list = this.f12806;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<WatchEvent<?>> listPollEvents = ((WatchKey) it.next()).pollEvents();
                    listPollEvents.getClass();
                    AbstractC5176.m9363(listPollEvents, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    interfaceC9970.info("Changes in application detected.");
                    int size = arrayList.size();
                    while (true) {
                        Thread.sleep(200L);
                        List list2 = this.f12806;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List<WatchEvent<?>> listPollEvents2 = ((WatchKey) it2.next()).pollEvents();
                            listPollEvents2.getClass();
                            AbstractC5176.m9363(listPollEvents2, arrayList2);
                        }
                        if (arrayList2.isEmpty()) {
                            break;
                        }
                        interfaceC9970.debug("Waiting for more changes.");
                        size += arrayList2.size();
                    }
                    interfaceC9970.debug("Changes to " + size + " files caused application restart.");
                    Iterator it3 = AbstractC5176.m9358(5, arrayList).iterator();
                    while (it3.hasNext()) {
                        interfaceC9970.debug("...  " + ((WatchEvent) it3.next()).context());
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
                        m9064();
                        Pair pairM9066 = m9066();
                        C4890 c48902 = (C4890) pairM9066.component1();
                        ClassLoader classLoader = (ClassLoader) pairM9066.component2();
                        this.f12804 = c48902;
                        this.f12807 = classLoader;
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        c4890 = this.f12804;
                        if (c4890 == null) {
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
            return c4890;
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
    */
    public final Pair m9066() throws IOException {
        WatchEvent.Modifier modifier;
        Object objM723;
        boolean zM10735;
        C4924 c4924 = this.f12800;
        InterfaceC9970 interfaceC9970 = c4924.f12782;
        ClassLoader c4928 = c4924.f12783;
        if (this.f12802.f12693) {
            ArrayList arrayList = this.f12811;
            if (arrayList.isEmpty()) {
                interfaceC9970.info("No ktor.deployment.watch patterns specified, automatic reload is not active.");
            } else {
                Set setM9052 = AbstractC4925.m9052(c4928);
                String parent = new File(System.getProperty("java.home")).getParent();
                Set set = setM9052;
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((URL) it.next()).getFile());
                }
                interfaceC9970.debug("Java Home: " + parent);
                StringBuilder sb = new StringBuilder("Class Loader: ");
                sb.append(c4928);
                sb.append(": ");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    String string = ((String) obj).toString();
                    parent.getClass();
                    if (!AbstractC5971.m10698(string, parent, false)) {
                        arrayList3.add(obj);
                    }
                }
                sb.append(arrayList3);
                interfaceC9970.debug(sb.toString());
                List listM12490 = AbstractC7176.m12490(InterfaceC4887.class, AbstractC5027.class, C8926.class, InterfaceC7387.class, InterfaceC9970.class, InterfaceC5084.class, InterfaceC6313.class, C5036.class);
                HashSet hashSet = new HashSet();
                Iterator it2 = listM12490.iterator();
                while (it2.hasNext()) {
                    URL location = ((Class) it2.next()).getProtectionDomain().getCodeSource().getLocation();
                    if (location != null) {
                        hashSet.add(location);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : set) {
                    URL url = (URL) obj2;
                    if (!hashSet.contains(url) && !arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                String str = (String) it3.next();
                                url.getClass();
                                str.getClass();
                                String path = url.getPath();
                                if (path != null) {
                                    char c = File.separatorChar;
                                    String strReplace = path.replace(c, '/');
                                    strReplace.getClass();
                                    String strReplace2 = str.replace(c, '/');
                                    strReplace2.getClass();
                                    zM10735 = AbstractC5976.m10735(strReplace, strReplace2, true);
                                } else {
                                    zM10735 = false;
                                }
                                if (zM10735) {
                                    String path2 = url.getPath();
                                    if (path2 == null) {
                                        path2 = "";
                                    }
                                    parent.getClass();
                                    if (!AbstractC5971.m10698(path2, parent, false)) {
                                        arrayList4.add(obj2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList4.isEmpty()) {
                    interfaceC9970.info("No ktor.deployment.watch patterns match classpath entries, automatic reload is not active");
                } else {
                    HashSet<Path> hashSet2 = new HashSet();
                    Iterator it4 = arrayList4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        String path3 = ((URL) it4.next()).getPath();
                        if (path3 != null) {
                            try {
                                objM723 = Result.m9304constructorimpl(new File(URLDecoder.decode(path3, "utf-8")).toPath());
                            } catch (Throwable th) {
                                objM723 = AbstractC0900.m723(th);
                            }
                            Path path4 = (Path) (Result.m9310isFailureimpl(objM723) ? null : objM723);
                            if (path4 != null && Files.exists(path4, new LinkOption[0])) {
                                C4942 c4942 = new C4942(hashSet2);
                                if (Files.isDirectory(path4, new LinkOption[0])) {
                                    Files.walkFileTree(path4, c4942);
                                }
                            }
                        }
                    }
                    Iterator it5 = hashSet2.iterator();
                    while (it5.hasNext()) {
                        interfaceC9970.debug("Watching " + ((Path) it5.next()) + " for changes.");
                    }
                    ThreadLocal threadLocal = AbstractC9016.f22905;
                    if (System.getenv("ANDROID_DATA") != null) {
                        modifier = null;
                        WatchEvent.Modifier[] modifierArr = modifier == null ? new WatchEvent.Modifier[]{modifier} : new WatchEvent.Modifier[0];
                        ArrayList arrayList5 = new ArrayList();
                        for (Path path5 : hashSet2) {
                            WatchService watchService = (WatchService) this.f12805.getValue();
                            WatchKey watchKeyRegister = watchService != null ? path5.register(watchService, new WatchEvent.Kind[]{StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY}, (WatchEvent.Modifier[]) Arrays.copyOf(modifierArr, modifierArr.length)) : null;
                            if (watchKeyRegister != null) {
                                arrayList5.add(watchKeyRegister);
                            }
                        }
                        this.f12806 = arrayList5;
                        c4928 = new C4928(arrayList4, c4928);
                    } else {
                        try {
                            Class<?> cls = Class.forName("com.sun.nio.file.SensitivityWatchEventModifier");
                            Object obj3 = cls.getField("HIGH").get(cls);
                            if (obj3 instanceof WatchEvent.Modifier) {
                                modifier = (WatchEvent.Modifier) obj3;
                            }
                        } catch (Throwable unused) {
                        }
                        if (modifier == null) {
                        }
                        ArrayList arrayList52 = new ArrayList();
                        while (r4.hasNext()) {
                        }
                        this.f12806 = arrayList52;
                        c4928 = new C4928(arrayList4, c4928);
                    }
                }
            }
        } else {
            interfaceC9970.info("Autoreload is disabled because the development mode is off.");
        }
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        threadCurrentThread.setContextClassLoader(c4928);
        try {
            return new Pair(m9063(c4928), c4928);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9067(long j, long j2) throws Throwable {
        TimeUnit.MILLISECONDS.getClass();
        try {
            this.f12803.m9039(j, j2);
        } catch (Exception e) {
            this.f12800.f12782.warn("Exception occurred during engine shutdown", e);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12798;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            m9064();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (this.f12811.isEmpty()) {
                return;
            }
            try {
                WatchService watchService = (WatchService) this.f12805.getValue();
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
