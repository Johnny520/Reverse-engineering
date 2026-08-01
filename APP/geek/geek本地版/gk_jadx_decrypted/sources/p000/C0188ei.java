package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ei */
/* JADX INFO: loaded from: classes.dex */
public final class C0188ei {

    /* JADX INFO: renamed from: i */
    public static final Object f1776i = new Object();

    /* JADX INFO: renamed from: j */
    public static volatile C0188ei f1777j;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f1778a;

    /* JADX INFO: renamed from: b */
    public final C0623q6 f1779b;

    /* JADX INFO: renamed from: c */
    public volatile int f1780c;

    /* JADX INFO: renamed from: d */
    public final Handler f1781d;

    /* JADX INFO: renamed from: e */
    public final C0967zh f1782e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0152di f1783f;

    /* JADX INFO: renamed from: g */
    public final int f1784g;

    /* JADX INFO: renamed from: h */
    public final C0483mf f1785h;

    public C0188ei(C0859wk c0859wk) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1778a = reentrantReadWriteLock;
        this.f1780c = 3;
        InterfaceC0152di interfaceC0152di = (InterfaceC0152di) c0859wk.f144b;
        this.f1783f = interfaceC0152di;
        int i = c0859wk.f143a;
        this.f1784g = i;
        this.f1785h = (C0483mf) c0859wk.f145c;
        this.f1781d = new Handler(Looper.getMainLooper());
        this.f1779b = new C0623q6();
        C0967zh c0967zh = new C0967zh(this);
        this.f1782e = c0967zh;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1780c = 0;
            } catch (Throwable th) {
                this.f1778a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1030b() == 0) {
            try {
                interfaceC0152di.mo943e(new C0930yh(c0967zh));
            } catch (Throwable th2) {
                m1032d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0188ei m1029a() {
        C0188ei c0188ei;
        synchronized (f1776i) {
            try {
                c0188ei = f1777j;
                if (!(c0188ei != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0188ei;
    }

    /* JADX INFO: renamed from: b */
    public final int m1030b() {
        this.f1778a.readLock().lock();
        try {
            return this.f1780c;
        } finally {
            this.f1778a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1031c() {
        if (!(this.f1784g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1030b() == 1) {
            return;
        }
        this.f1778a.writeLock().lock();
        try {
            if (this.f1780c == 0) {
                return;
            }
            this.f1780c = 0;
            this.f1778a.writeLock().unlock();
            C0967zh c0967zh = this.f1782e;
            C0188ei c0188ei = c0967zh.f5557a;
            try {
                c0188ei.f1783f.mo943e(new C0930yh(c0967zh));
            } catch (Throwable th) {
                c0188ei.m1032d(th);
            }
        } finally {
            this.f1778a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1032d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1778a.writeLock().lock();
        try {
            this.f1780c = 2;
            arrayList.addAll(this.f1779b);
            this.f1779b.clear();
            this.f1778a.writeLock().unlock();
            this.f1781d.post(new RunnableC0178e8(arrayList, this.f1780c, th));
        } catch (Throwable th2) {
            this.f1778a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:44:0x0083, B:46:0x008d, B:48:0x0090, B:50:0x0094, B:52:0x00a4, B:53:0x00a7, B:55:0x00b4, B:58:0x00bc, B:63:0x00db, B:69:0x00e7, B:72:0x00f3, B:73:0x00fd, B:74:0x010c, B:76:0x0113, B:77:0x0118, B:79:0x0123, B:81:0x012a, B:83:0x012e, B:85:0x0134, B:87:0x0138, B:90:0x0140, B:93:0x014c, B:94:0x0151, B:96:0x015f, B:42:0x0079), top: B:115:0x005a }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00d7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence m1033e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0188ei.m1033e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: renamed from: f */
    public final void m1034f(AbstractC0105ci abstractC0105ci) {
        AbstractC0979zt.m2825f("initCallback cannot be null", abstractC0105ci);
        this.f1778a.writeLock().lock();
        try {
            if (this.f1780c == 1 || this.f1780c == 2) {
                this.f1781d.post(new RunnableC0178e8(Arrays.asList(abstractC0105ci), this.f1780c, (Throwable) null));
            } else {
                this.f1779b.add(abstractC0105ci);
            }
            this.f1778a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1778a.writeLock().unlock();
            throw th;
        }
    }
}
