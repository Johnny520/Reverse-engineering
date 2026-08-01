package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p031c4.AbstractC1319e;
import p031c4.AbstractC1320f;
import p031c4.C1323i;
import p031c4.C1324j;
import p117i.C3042c;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0644c {

    /* JADX INFO: renamed from: o */
    public static final Object f1856o = new Object();

    /* JADX INFO: renamed from: p */
    public static final Object f1857p = new Object();

    /* JADX INFO: renamed from: q */
    public static volatile C0644c f1858q;

    /* JADX INFO: renamed from: b */
    public final Set f1860b;

    /* JADX INFO: renamed from: e */
    public final b f1863e;

    /* JADX INFO: renamed from: f */
    public final h f1864f;

    /* JADX INFO: renamed from: g */
    public final j f1865g;

    /* JADX INFO: renamed from: h */
    public final boolean f1866h;

    /* JADX INFO: renamed from: i */
    public final boolean f1867i;

    /* JADX INFO: renamed from: j */
    public final int[] f1868j;

    /* JADX INFO: renamed from: k */
    public final boolean f1869k;

    /* JADX INFO: renamed from: l */
    public final int f1870l;

    /* JADX INFO: renamed from: m */
    public final int f1871m;

    /* JADX INFO: renamed from: n */
    public final e f1872n;

    /* JADX INFO: renamed from: a */
    public final ReadWriteLock f1859a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    public volatile int f1861c = 3;

    /* JADX INFO: renamed from: d */
    public final Handler f1862d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.emoji2.text.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends b {

        /* JADX INFO: renamed from: b */
        public volatile C0645d f1873b;

        /* JADX INFO: renamed from: c */
        public volatile C0647f f1874c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class C10053a extends i {
            public C10053a() {
            }

            @Override // androidx.emoji2.text.C0644c.i
            /* JADX INFO: renamed from: a */
            public void mo2498a(Throwable th) {
                a.this.f1876a.m2527n(th);
            }

            @Override // androidx.emoji2.text.C0644c.i
            /* JADX INFO: renamed from: b */
            public void mo2499b(C0647f c0647f) {
                a.this.m2537f(c0647f);
            }
        }

        public a(C0644c c0644c) {
            super(c0644c);
        }

        @Override // androidx.emoji2.text.C0644c.b
        /* JADX INFO: renamed from: a */
        public int mo2532a(CharSequence charSequence, int i10) {
            return this.f1873b.m2543a(charSequence, i10);
        }

        @Override // androidx.emoji2.text.C0644c.b
        /* JADX INFO: renamed from: b */
        public int mo2533b(CharSequence charSequence, int i10) {
            return this.f1873b.m2544b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.C0644c.b
        /* JADX INFO: renamed from: c */
        public void mo2534c() {
            try {
                this.f1876a.f1864f.mo2496a(new C10053a());
            } catch (Throwable th) {
                this.f1876a.m2527n(th);
            }
        }

        @Override // androidx.emoji2.text.C0644c.b
        /* JADX INFO: renamed from: d */
        public CharSequence mo2535d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f1873b.m2547e(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.C0644c.b
        /* JADX INFO: renamed from: e */
        public void mo2536e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f1874c.m2574e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f1876a.f1866h);
        }

        /* JADX INFO: renamed from: f */
        public void m2537f(C0647f c0647f) {
            if (c0647f == null) {
                this.f1876a.m2527n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f1874c = c0647f;
            C0647f c0647f2 = this.f1874c;
            j jVar = this.f1876a.f1865g;
            e eVar = this.f1876a.f1872n;
            C0644c c0644c = this.f1876a;
            this.f1873b = new C0645d(c0647f2, jVar, eVar, c0644c.f1867i, c0644c.f1868j, AbstractC1319e.m5300a());
            this.f1876a.m2528o();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C0644c f1876a;

        public b(C0644c c0644c) {
            this.f1876a = c0644c;
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo2532a(CharSequence charSequence, int i10);

        /* JADX INFO: renamed from: b */
        public abstract int mo2533b(CharSequence charSequence, int i10);

        /* JADX INFO: renamed from: c */
        public abstract void mo2534c();

        /* JADX INFO: renamed from: d */
        public abstract CharSequence mo2535d(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        /* JADX INFO: renamed from: e */
        public abstract void mo2536e(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final h f1877a;

        /* JADX INFO: renamed from: b */
        public j f1878b;

        /* JADX INFO: renamed from: c */
        public boolean f1879c;

        /* JADX INFO: renamed from: d */
        public boolean f1880d;

        /* JADX INFO: renamed from: e */
        public int[] f1881e;

        /* JADX INFO: renamed from: f */
        public Set f1882f;

        /* JADX INFO: renamed from: g */
        public boolean f1883g;

        /* JADX INFO: renamed from: h */
        public int f1884h = -16711936;

        /* JADX INFO: renamed from: i */
        public int f1885i = 0;

        /* JADX INFO: renamed from: j */
        public e f1886j = new C0643b();

        public c(h hVar) {
            AbstractC9170c.m35615d(hVar, "metadataLoader cannot be null.");
            this.f1877a = hVar;
        }

        /* JADX INFO: renamed from: a */
        public final h m2538a() {
            return this.f1877a;
        }

        /* JADX INFO: renamed from: b */
        public c m2539b(int i10) {
            this.f1885i = i10;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d implements j {
        @Override // androidx.emoji2.text.C0644c.j
        /* JADX INFO: renamed from: a */
        public AbstractC1320f mo2540a(C1323i c1323i) {
            return new C1324j(c1323i);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo2513a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public abstract void mo2541a(Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo2542b();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo2496a(i iVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class i {
        /* JADX INFO: renamed from: a */
        public abstract void mo2498a(Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo2499b(C0647f c0647f);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface j {
        /* JADX INFO: renamed from: a */
        AbstractC1320f mo2540a(C1323i c1323i);
    }

    public C0644c(c cVar) {
        this.f1866h = cVar.f1879c;
        this.f1867i = cVar.f1880d;
        this.f1868j = cVar.f1881e;
        this.f1869k = cVar.f1883g;
        this.f1870l = cVar.f1884h;
        this.f1864f = cVar.f1877a;
        this.f1871m = cVar.f1885i;
        this.f1872n = cVar.f1886j;
        C3042c c3042c = new C3042c();
        this.f1860b = c3042c;
        j jVar = cVar.f1878b;
        this.f1865g = jVar == null ? new d() : jVar;
        Set set = cVar.f1882f;
        if (set != null && !set.isEmpty()) {
            c3042c.addAll(cVar.f1882f);
        }
        this.f1863e = new a(this);
        m2526m();
    }

    /* JADX INFO: renamed from: c */
    public static C0644c m2516c() {
        C0644c c0644c;
        synchronized (f1856o) {
            c0644c = f1858q;
            AbstractC9170c.m35616e(c0644c != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c0644c;
    }

    /* JADX INFO: renamed from: h */
    public static C0644c m2517h(c cVar) {
        C0644c c0644c;
        C0644c c0644c2 = f1858q;
        if (c0644c2 != null) {
            return c0644c2;
        }
        synchronized (f1856o) {
            try {
                c0644c = f1858q;
                if (c0644c == null) {
                    c0644c = new C0644c(cVar);
                    f1858q = c0644c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0644c;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2518i() {
        return f1858q != null;
    }

    /* JADX INFO: renamed from: d */
    public int m2519d(CharSequence charSequence, int i10) {
        AbstractC9170c.m35616e(m2524k(), "Not initialized yet");
        AbstractC9170c.m35615d(charSequence, "charSequence cannot be null");
        return this.f1863e.mo2532a(charSequence, i10);
    }

    /* JADX INFO: renamed from: e */
    public int m2520e() {
        return this.f1870l;
    }

    /* JADX INFO: renamed from: f */
    public int m2521f(CharSequence charSequence, int i10) {
        AbstractC9170c.m35616e(m2524k(), "Not initialized yet");
        AbstractC9170c.m35615d(charSequence, "charSequence cannot be null");
        return this.f1863e.mo2533b(charSequence, i10);
    }

    /* JADX INFO: renamed from: g */
    public int m2522g() {
        this.f1859a.readLock().lock();
        try {
            return this.f1861c;
        } finally {
            this.f1859a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m2523j() {
        return this.f1869k;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2524k() {
        return m2522g() == 1;
    }

    /* JADX INFO: renamed from: l */
    public void m2525l() {
        AbstractC9170c.m35616e(this.f1871m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m2524k()) {
            return;
        }
        this.f1859a.writeLock().lock();
        try {
            if (this.f1861c == 0) {
                return;
            }
            this.f1861c = 0;
            this.f1859a.writeLock().unlock();
            this.f1863e.mo2534c();
        } finally {
            this.f1859a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2526m() {
        this.f1859a.writeLock().lock();
        try {
            if (this.f1871m == 0) {
                this.f1861c = 0;
            }
            this.f1859a.writeLock().unlock();
            if (m2522g() == 0) {
                this.f1863e.mo2534c();
            }
        } catch (Throwable th) {
            this.f1859a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2527n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1859a.writeLock().lock();
        try {
            this.f1861c = 2;
            arrayList.addAll(this.f1860b);
            this.f1860b.clear();
            this.f1859a.writeLock().unlock();
            this.f1862d.post(new g(arrayList, this.f1861c, th));
        } catch (Throwable th2) {
            this.f1859a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2528o() {
        ArrayList arrayList = new ArrayList();
        this.f1859a.writeLock().lock();
        try {
            this.f1861c = 1;
            arrayList.addAll(this.f1860b);
            this.f1860b.clear();
            this.f1859a.writeLock().unlock();
            this.f1862d.post(new g(arrayList, this.f1861c));
        } catch (Throwable th) {
            this.f1859a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m2529p(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        AbstractC9170c.m35616e(m2524k(), "Not initialized yet");
        AbstractC9170c.m35613b(i10, "start cannot be negative");
        AbstractC9170c.m35613b(i11, "end cannot be negative");
        AbstractC9170c.m35613b(i12, "maxEmojiCount cannot be negative");
        AbstractC9170c.m35612a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        AbstractC9170c.m35612a(i10 <= charSequence.length(), "start should be < than charSequence length");
        AbstractC9170c.m35612a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f1866h : false;
        } else {
            z10 = true;
        }
        return this.f1863e.mo2535d(charSequence, i10, i11, i12, z10);
    }

    /* JADX INFO: renamed from: q */
    public void m2530q(f fVar) {
        AbstractC9170c.m35615d(fVar, "initCallback cannot be null");
        this.f1859a.writeLock().lock();
        try {
            if (this.f1861c == 1 || this.f1861c == 2) {
                this.f1862d.post(new g(fVar, this.f1861c));
            } else {
                this.f1860b.add(fVar);
            }
            this.f1859a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1859a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2531r(EditorInfo editorInfo) {
        if (!m2524k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f1863e.mo2536e(editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g implements Runnable {

        /* JADX INFO: renamed from: q */
        public final List f1887q;

        /* JADX INFO: renamed from: r */
        public final Throwable f1888r;

        /* JADX INFO: renamed from: s */
        public final int f1889s;

        public g(f fVar, int i10) {
            this(Arrays.asList((f) AbstractC9170c.m35615d(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1887q.size();
            int i10 = 0;
            if (this.f1889s != 1) {
                while (i10 < size) {
                    ((f) this.f1887q.get(i10)).mo2541a(this.f1888r);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f1887q.get(i10)).mo2542b();
                    i10++;
                }
            }
        }

        public g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        public g(Collection collection, int i10, Throwable th) {
            AbstractC9170c.m35615d(collection, "initCallbacks cannot be null");
            this.f1887q = new ArrayList(collection);
            this.f1889s = i10;
            this.f1888r = th;
        }
    }
}
