package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: gi */
/* JADX INFO: loaded from: classes.dex */
public final class C0262gi {

    /* JADX INFO: renamed from: i */
    public static final Object f1987i = new Object();

    /* JADX INFO: renamed from: j */
    public static volatile C0262gi f1988j;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f1989a;

    /* JADX INFO: renamed from: b */
    public final C0622q6 f1990b;

    /* JADX INFO: renamed from: c */
    public volatile int f1991c;

    /* JADX INFO: renamed from: d */
    public final Handler f1992d;

    /* JADX INFO: renamed from: e */
    public final C0069bi f1993e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0225fi f1994f;

    /* JADX INFO: renamed from: g */
    public final int f1995g;

    /* JADX INFO: renamed from: h */
    public final C0520nf f1996h;

    public C0262gi(C0933yk c0933yk) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1989a = reentrantReadWriteLock;
        this.f1991c = 3;
        InterfaceC0225fi interfaceC0225fi = (InterfaceC0225fi) c0933yk.f897b;
        this.f1994f = interfaceC0225fi;
        int i = c0933yk.f896a;
        this.f1995g = i;
        this.f1996h = (C0520nf) c0933yk.f898c;
        this.f1992d = new Handler(Looper.getMainLooper());
        this.f1990b = new C0622q6();
        C0069bi c0069bi = new C0069bi(this);
        this.f1993e = c0069bi;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1991c = 0;
            } catch (Throwable th) {
                this.f1989a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1278b() == 0) {
            try {
                interfaceC0225fi.mo1102b(new C0019ai(c0069bi));
            } catch (Throwable th2) {
                m1280d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0262gi m1277a() {
        C0262gi c0262gi;
        synchronized (f1987i) {
            try {
                c0262gi = f1988j;
                if (!(c0262gi != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0262gi;
    }

    /* JADX INFO: renamed from: b */
    public final int m1278b() {
        this.f1989a.readLock().lock();
        try {
            return this.f1991c;
        } finally {
            this.f1989a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1279c() {
        if (!(this.f1995g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1278b() == 1) {
            return;
        }
        this.f1989a.writeLock().lock();
        try {
            if (this.f1991c == 0) {
                return;
            }
            this.f1991c = 0;
            this.f1989a.writeLock().unlock();
            C0069bi c0069bi = this.f1993e;
            C0262gi c0262gi = c0069bi.f730a;
            try {
                c0262gi.f1994f.mo1102b(new C0019ai(c0069bi));
            } catch (Throwable th) {
                c0262gi.m1280d(th);
            }
        } finally {
            this.f1989a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1280d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1989a.writeLock().lock();
        try {
            this.f1991c = 2;
            arrayList.addAll(this.f1990b);
            this.f1990b.clear();
            this.f1989a.writeLock().unlock();
            this.f1992d.post(new RunnableC0550o8(arrayList, this.f1991c, th));
        } catch (Throwable th2) {
            this.f1989a.writeLock().unlock();
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
    public final java.lang.CharSequence m1281e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0262gi.m1281e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: renamed from: f */
    public final void m1282f(AbstractC0188ei abstractC0188ei) {
        AbstractC0498mu.m1887d("initCallback cannot be null", abstractC0188ei);
        this.f1989a.writeLock().lock();
        try {
            if (this.f1991c == 1 || this.f1991c == 2) {
                this.f1992d.post(new RunnableC0550o8(Arrays.asList(abstractC0188ei), this.f1991c, (Throwable) null));
            } else {
                this.f1990b.add(abstractC0188ei);
            }
            this.f1989a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1989a.writeLock().unlock();
            throw th;
        }
    }
}
