package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: rr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699rr {

    /* JADX INFO: renamed from: j */
    public static final Object f5538j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C0699rr f5539k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f5540a;

    /* JADX INFO: renamed from: b */
    public final C0164e9 f5541b;

    /* JADX INFO: renamed from: c */
    public volatile int f5542c;

    /* JADX INFO: renamed from: d */
    public final Handler f5543d;

    /* JADX INFO: renamed from: e */
    public final C0561or f5544e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0662qr f5545f;

    /* JADX INFO: renamed from: g */
    public final C0675r3 f5546g;

    /* JADX INFO: renamed from: h */
    public final int f5547h;

    /* JADX INFO: renamed from: i */
    public final C0930xl f5548i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0699rr(C0780tv c0780tv) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5540a = reentrantReadWriteLock;
        this.f5542c = 3;
        InterfaceC0662qr interfaceC0662qr = c0780tv.f6052a;
        this.f5545f = interfaceC0662qr;
        int i = c0780tv.f6053b;
        this.f5547h = i;
        this.f5548i = c0780tv.f6054c;
        this.f5543d = new Handler(Looper.getMainLooper());
        this.f5541b = new C0164e9();
        this.f5546g = new C0675r3(17);
        C0561or c0561or = new C0561or(this);
        this.f5544e = c0561or;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f5542c = 0;
            } catch (Throwable th) {
                this.f5540a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m3982b() == 0) {
            try {
                interfaceC0662qr.mo3324a(new C0522nr(c0561or));
            } catch (Throwable th2) {
                m3984d(th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0699rr m3981a() {
        C0699rr c0699rr;
        synchronized (f5538j) {
            try {
                c0699rr = f5539k;
                if (!(c0699rr != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0699rr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m3982b() {
        this.f5540a.readLock().lock();
        try {
            return this.f5542c;
        } finally {
            this.f5540a.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3983c() {
        if (!(this.f5547h == 1)) {
            C0921xc.m5134o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m3982b() == 1) {
            return;
        }
        this.f5540a.writeLock().lock();
        try {
            if (this.f5542c == 0) {
                return;
            }
            this.f5542c = 0;
            this.f5540a.writeLock().unlock();
            C0561or c0561or = this.f5544e;
            C0699rr c0699rr = c0561or.f4609a;
            try {
                c0699rr.f5545f.mo3324a(new C0522nr(c0561or));
            } catch (Throwable th) {
                c0699rr.m3984d(th);
            }
        } finally {
            this.f5540a.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3984d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5540a.writeLock().lock();
        try {
            this.f5542c = 2;
            arrayList.addAll(this.f5541b);
            this.f5541b.clear();
            this.f5540a.writeLock().unlock();
            this.f5543d.post(new RunnableC0625pr(arrayList, this.f5542c, th));
        } catch (Throwable th2) {
            this.f5540a.writeLock().unlock();
            throw th2;
        }
    }
}
