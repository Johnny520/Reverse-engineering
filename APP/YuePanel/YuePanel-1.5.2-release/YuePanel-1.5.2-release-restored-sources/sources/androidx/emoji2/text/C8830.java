package androidx.emoji2.text;

import Yue.C4075;
import Yue.C5045;
import Yue.C5058;
import Yue.C6740;
import Yue.C7950;
import Yue.C8032;
import Yue.InterfaceC5225;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8532;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.emoji2.text.C8812;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8830 extends C8812.AbstractC8815 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C1675 f29555 = new C1675();

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ */
    public static class C1674 extends AbstractC8832 {

        /* JADX INFO: renamed from: ۥ */
        public final long f3781;

        /* JADX INFO: renamed from: ۥ۟ */
        public long f3782;

        public C1674(long j) {
            this.f3781 = j;
        }

        @Override // androidx.emoji2.text.C8830.AbstractC8832
        /* JADX INFO: renamed from: ۥ */
        public long mo4796() {
            if (this.f3782 == 0) {
                this.f3782 = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f3782;
            if (jUptimeMillis > this.f3781) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.f3781 - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C1675 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Typeface m4797(@InterfaceC6391 Context context, @InterfaceC6391 C5058.C5059 c5059) throws PackageManager.NameNotFoundException {
            return C5058.m1876(context, null, new C5058.C5059[]{c5059});
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C5058.C0628 m4798(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045) throws PackageManager.NameNotFoundException {
            return C5058.m1877(context, null, c5045);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29688(@InterfaceC6391 Context context, @InterfaceC6391 Uri uri, @InterfaceC6391 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29689(@InterfaceC6391 Context context, @InterfaceC6391 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class C8831 implements C8812.InterfaceC8821 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final String f29556 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final Context f3783;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final C5045 f3784;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final C1675 f29557;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final Object f29558 = new Object();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public Handler f29559;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public Executor f29560;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public ThreadPoolExecutor f29561;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public AbstractC8832 f29562;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public C8812.AbstractC8822 f29563;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public ContentObserver f29564;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        @InterfaceC5225("mLock")
        @InterfaceC6490
        public Runnable f29565;

        /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟$ۥ */
        public class C1676 extends ContentObserver {
            public C1676(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                C8831.this.m29691();
            }
        }

        public C8831(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, @InterfaceC6391 C1675 c1675) {
            C6740.m21416(context, "Context cannot be null");
            C6740.m21416(c5045, "FontRequest cannot be null");
            this.f3783 = context.getApplicationContext();
            this.f3784 = c5045;
            this.f29557 = c1675;
        }

        @Override // androidx.emoji2.text.C8812.InterfaceC8821
        @InterfaceC7113(19)
        /* JADX INFO: renamed from: ۥ */
        public void mo4771(@InterfaceC6391 C8812.AbstractC8822 abstractC8822) {
            C6740.m21416(abstractC8822, "LoaderCallback cannot be null");
            synchronized (this.f29558) {
                this.f29563 = abstractC8822;
            }
            m29691();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4799() {
            synchronized (this.f29558) {
                try {
                    this.f29563 = null;
                    ContentObserver contentObserver = this.f29564;
                    if (contentObserver != null) {
                        this.f29557.m29689(this.f3783, contentObserver);
                        this.f29564 = null;
                    }
                    Handler handler = this.f29559;
                    if (handler != null) {
                        handler.removeCallbacks(this.f29565);
                    }
                    this.f29559 = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f29561;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f29560 = null;
                    this.f29561 = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC7113(19)
        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29690() {
            synchronized (this.f29558) {
                try {
                    if (this.f29563 == null) {
                        return;
                    }
                    try {
                        C5058.C5059 c5059M29692 = m29692();
                        int iM1881 = c5059M29692.m1881();
                        if (iM1881 == 2) {
                            synchronized (this.f29558) {
                                try {
                                    AbstractC8832 abstractC8832 = this.f29562;
                                    if (abstractC8832 != null) {
                                        long jMo4796 = abstractC8832.mo4796();
                                        if (jMo4796 >= 0) {
                                            m29693(c5059M29692.m15585(), jMo4796);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (iM1881 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iM1881 + ")");
                        }
                        try {
                            C7950.m3971(f29556);
                            Typeface typefaceM4797 = this.f29557.m4797(this.f3783, c5059M29692);
                            ByteBuffer byteBufferM25393 = C8032.m25393(this.f3783, null, c5059M29692.m15585());
                            if (byteBufferM25393 == null || typefaceM4797 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            C8833 c8833M29698 = C8833.m29698(typefaceM4797, byteBufferM25393);
                            C7950.m25086();
                            synchronized (this.f29558) {
                                try {
                                    C8812.AbstractC8822 abstractC8822 = this.f29563;
                                    if (abstractC8822 != null) {
                                        abstractC8822.mo4773(c8833M29698);
                                    }
                                } finally {
                                }
                            }
                            m4799();
                        } catch (Throwable th) {
                            C7950.m25086();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f29558) {
                            try {
                                C8812.AbstractC8822 abstractC88222 = this.f29563;
                                if (abstractC88222 != null) {
                                    abstractC88222.mo4772(th2);
                                }
                                m4799();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @InterfaceC7113(19)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29691() {
            synchronized (this.f29558) {
                try {
                    if (this.f29563 == null) {
                        return;
                    }
                    if (this.f29560 == null) {
                        ThreadPoolExecutor threadPoolExecutorM11507 = C4075.m11507("emojiCompat");
                        this.f29561 = threadPoolExecutorM11507;
                        this.f29560 = threadPoolExecutorM11507;
                    }
                    this.f29560.execute(new Runnable() { // from class: Yue.ۥ۠ۢۥۨ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11961.m29690();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5058.C5059 m29692() {
            try {
                C5058.C0628 c0628M4798 = this.f29557.m4798(this.f3783, this.f3784);
                if (c0628M4798.m15583() == 0) {
                    C5058.C5059[] c5059ArrM1879 = c0628M4798.m1879();
                    if (c5059ArrM1879 == null || c5059ArrM1879.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return c5059ArrM1879[0];
                }
                throw new RuntimeException("fetchFonts failed (" + c0628M4798.m15583() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @InterfaceC7113(19)
        @InterfaceC8532
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m29693(Uri uri, long j) {
            synchronized (this.f29558) {
                try {
                    Handler handlerM11509 = this.f29559;
                    if (handlerM11509 == null) {
                        handlerM11509 = C4075.m11509();
                        this.f29559 = handlerM11509;
                    }
                    if (this.f29564 == null) {
                        C1676 c1676 = new C1676(handlerM11509);
                        this.f29564 = c1676;
                        this.f29557.m29688(this.f3783, uri, c1676);
                    }
                    if (this.f29565 == null) {
                        this.f29565 = new Runnable() { // from class: Yue.ۥ۠ۢۦ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f11962.m29691();
                            }
                        };
                    }
                    handlerM11509.postDelayed(this.f29565, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29694(@InterfaceC6391 Executor executor) {
            synchronized (this.f29558) {
                this.f29560 = executor;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29695(@InterfaceC6490 AbstractC8832 abstractC8832) {
            synchronized (this.f29558) {
                this.f29562 = abstractC8832;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8832 {
        /* JADX INFO: renamed from: ۥ */
        public abstract long mo4796();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8830(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045) {
        super(new C8831(context, c5045, f29555));
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C8830 m29685(@InterfaceC6490 Handler handler) {
        if (handler == null) {
            return this;
        }
        m29686(C4075.m1028(handler));
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C8830 m29686(@InterfaceC6391 Executor executor) {
        ((C8831) m4785()).m29694(executor);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C8830 m29687(@InterfaceC6490 AbstractC8832 abstractC8832) {
        ((C8831) m4785()).m29695(abstractC8832);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C8830(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, @InterfaceC6391 C1675 c1675) {
        super(new C8831(context, c5045, c1675));
    }
}
