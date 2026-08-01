package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.C0644c;
import bsh.C1193i2;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p031c4.AbstractC1317c;
import p252r3.AbstractC6483n;
import p278t3.AbstractC8105h;
import p280t5.C8130u;
import p292u3.AbstractC8503f;
import p292u3.C8500c;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0646e extends C0644c.c {

    /* JADX INFO: renamed from: k */
    public static final a f1909k = new a();

    /* JADX INFO: renamed from: androidx.emoji2.text.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public Typeface m2562a(Context context, AbstractC8503f.b bVar) {
            return AbstractC8503f.m32740a(context, null, new AbstractC8503f.b[]{bVar});
        }

        /* JADX INFO: renamed from: b */
        public AbstractC8503f.a m2563b(Context context, C8500c c8500c) {
            return AbstractC8503f.m32741b(context, null, c8500c);
        }

        /* JADX INFO: renamed from: c */
        public void m2564c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements C0644c.h {

        /* JADX INFO: renamed from: a */
        public final Context f1910a;

        /* JADX INFO: renamed from: b */
        public final C8500c f1911b;

        /* JADX INFO: renamed from: c */
        public final a f1912c;

        /* JADX INFO: renamed from: d */
        public final Object f1913d = new Object();

        /* JADX INFO: renamed from: e */
        public Handler f1914e;

        /* JADX INFO: renamed from: f */
        public Executor f1915f;

        /* JADX INFO: renamed from: g */
        public ThreadPoolExecutor f1916g;

        /* JADX INFO: renamed from: h */
        public C0644c.i f1917h;

        /* JADX INFO: renamed from: i */
        public ContentObserver f1918i;

        /* JADX INFO: renamed from: j */
        public Runnable f1919j;

        public b(Context context, C8500c c8500c, a aVar) {
            AbstractC9170c.m35615d(context, "Context cannot be null");
            AbstractC9170c.m35615d(c8500c, "FontRequest cannot be null");
            this.f1910a = context.getApplicationContext();
            this.f1911b = c8500c;
            this.f1912c = aVar;
        }

        @Override // androidx.emoji2.text.C0644c.h
        /* JADX INFO: renamed from: a */
        public void mo2496a(C0644c.i iVar) {
            AbstractC9170c.m35615d(iVar, "LoaderCallback cannot be null");
            synchronized (this.f1913d) {
                this.f1917h = iVar;
            }
            m2567d();
        }

        /* JADX INFO: renamed from: b */
        public final void m2565b() {
            synchronized (this.f1913d) {
                try {
                    this.f1917h = null;
                    ContentObserver contentObserver = this.f1918i;
                    if (contentObserver != null) {
                        this.f1912c.m2564c(this.f1910a, contentObserver);
                        this.f1918i = null;
                    }
                    Handler handler = this.f1914e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f1919j);
                    }
                    this.f1914e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f1916g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f1915f = null;
                    this.f1916g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2566c() {
            synchronized (this.f1913d) {
                try {
                    if (this.f1917h == null) {
                        return;
                    }
                    try {
                        AbstractC8503f.b bVarM2568e = m2568e();
                        int iM32747b = bVarM2568e.m32747b();
                        if (iM32747b == 2) {
                            synchronized (this.f1913d) {
                            }
                        }
                        if (iM32747b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iM32747b + ")");
                        }
                        try {
                            AbstractC8105h.m31324a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceM2562a = this.f1912c.m2562a(this.f1910a, bVarM2568e);
                            ByteBuffer byteBufferM25684a = AbstractC6483n.m25684a(this.f1910a, null, bVarM2568e.m32749d());
                            if (byteBufferM25684a == null || typefaceM2562a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            C0647f c0647fM2570b = C0647f.m2570b(typefaceM2562a, byteBufferM25684a);
                            AbstractC8105h.m31325b();
                            synchronized (this.f1913d) {
                                try {
                                    C0644c.i iVar = this.f1917h;
                                    if (iVar != null) {
                                        iVar.mo2499b(c0647fM2570b);
                                    }
                                } finally {
                                }
                            }
                            m2565b();
                        } catch (Throwable th) {
                            AbstractC8105h.m31325b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f1913d) {
                            try {
                                C0644c.i iVar2 = this.f1917h;
                                if (iVar2 != null) {
                                    iVar2.mo2498a(th2);
                                }
                                m2565b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2567d() {
            synchronized (this.f1913d) {
                try {
                    if (this.f1917h == null) {
                        return;
                    }
                    if (this.f1915f == null) {
                        ThreadPoolExecutor threadPoolExecutorM5297b = AbstractC1317c.m5297b("emojiCompat");
                        this.f1916g = threadPoolExecutorM5297b;
                        this.f1915f = threadPoolExecutorM5297b;
                    }
                    this.f1915f.execute(new Runnable() { // from class: c4.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3955q.m2566c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC8503f.b m2568e() {
            try {
                AbstractC8503f.a aVarM2563b = this.f1912c.m2563b(this.f1910a, this.f1911b);
                if (aVarM2563b.m32745d() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + aVarM2563b.m32745d() + ")");
                }
                AbstractC8503f.b[] bVarArrM32744c = aVarM2563b.m32744c();
                if (bVarArrM32744c != null && bVarArrM32744c.length != 0) {
                    return bVarArrM32744c[0];
                }
                C1193i2.m4438a("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e10) {
                C8130u.m31512a("provider not found", e10);
                return null;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m2569f(Executor executor) {
            synchronized (this.f1913d) {
                this.f1915f = executor;
            }
        }
    }

    public C0646e(Context context, C8500c c8500c) {
        super(new b(context, c8500c, f1909k));
    }

    /* JADX INFO: renamed from: c */
    public C0646e m2561c(Executor executor) {
        ((b) m2538a()).m2569f(executor);
        return this;
    }
}
