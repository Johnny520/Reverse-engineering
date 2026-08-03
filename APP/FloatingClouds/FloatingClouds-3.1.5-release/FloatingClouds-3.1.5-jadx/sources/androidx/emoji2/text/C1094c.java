package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000a.AbstractC0313R5;
import p000a.C0202L1;
import p000a.C0277P4;
import p000a.C0296Q5;
import p000a.C0431Xf;
import p000a.C0671kb;
import p000a.C0726n9;
import p000a.C0731ne;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1094c {

    /* JADX INFO: renamed from: j */
    public static final Object f4483j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C1094c f4484k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f4485a;

    /* JADX INFO: renamed from: b */
    public final C0202L1 f4486b;

    /* JADX INFO: renamed from: c */
    public volatile int f4487c;

    /* JADX INFO: renamed from: d */
    public final Handler f4488d;

    /* JADX INFO: renamed from: e */
    public final a f4489e;

    /* JADX INFO: renamed from: f */
    public final g f4490f;

    /* JADX INFO: renamed from: g */
    public final d f4491g;

    /* JADX INFO: renamed from: h */
    public final int f4492h;

    /* JADX INFO: renamed from: i */
    public final C0277P4 f4493i;

    /* JADX INFO: renamed from: androidx.emoji2.text.c$a */
    public static final class a extends b {

        /* JADX INFO: renamed from: b */
        public volatile C0296Q5 f4494b;

        /* JADX INFO: renamed from: c */
        public volatile C0671kb f4495c;
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C1094c f4496a;

        public b(C1094c c1094c) {
            this.f4496a = c1094c;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final g f4497a;

        /* JADX INFO: renamed from: b */
        public int f4498b = 0;

        /* JADX INFO: renamed from: c */
        public final C0277P4 f4499c = new C0277P4();

        public c(g gVar) {
            this.f4497a = gVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$d */
    public static class d {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$e */
    public static abstract class e {
        /* JADX INFO: renamed from: a */
        public void mo2369a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo746b() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$f */
    public static class f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ArrayList f4500a;

        /* JADX INFO: renamed from: b */
        public final int f4501b;

        public f(List list, int i, Throwable th) {
            C0726n9.m1665h(list, "initCallbacks cannot be null");
            this.f4500a = new ArrayList(list);
            this.f4501b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f4500a;
            int size = arrayList.size();
            int i = 0;
            if (this.f4501b != 1) {
                while (i < size) {
                    ((e) arrayList.get(i)).mo2369a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((e) arrayList.get(i)).mo746b();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo2501a(h hVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$h */
    public static abstract class h {
        /* JADX INFO: renamed from: a */
        public abstract void mo2503a(Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo2504b(C0671kb c0671kb);
    }

    public C1094c(EmojiCompatInitializer.C1089a c1089a) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4485a = reentrantReadWriteLock;
        this.f4487c = 3;
        g gVar = c1089a.f4497a;
        this.f4490f = gVar;
        int i = c1089a.f4498b;
        this.f4492h = i;
        this.f4493i = c1089a.f4499c;
        this.f4488d = new Handler(Looper.getMainLooper());
        this.f4486b = new C0202L1();
        this.f4491g = new d();
        a aVar = new a(this);
        this.f4489e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f4487c = 0;
            } catch (Throwable th) {
                this.f4485a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m2506b() == 0) {
            try {
                gVar.mo2501a(new C1093b(aVar));
            } catch (Throwable th2) {
                m2508d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1094c m2505a() {
        C1094c c1094c;
        synchronized (f4483j) {
            try {
                c1094c = f4484k;
                if (!(c1094c != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c1094c;
    }

    /* JADX INFO: renamed from: b */
    public final int m2506b() {
        this.f4485a.readLock().lock();
        try {
            return this.f4487c;
        } finally {
            this.f4485a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2507c() {
        if (!(this.f4492h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m2506b() == 1) {
            return;
        }
        this.f4485a.writeLock().lock();
        try {
            if (this.f4487c == 0) {
                return;
            }
            this.f4487c = 0;
            this.f4485a.writeLock().unlock();
            a aVar = this.f4489e;
            C1094c c1094c = aVar.f4496a;
            try {
                c1094c.f4490f.mo2501a(new C1093b(aVar));
            } catch (Throwable th) {
                c1094c.m2508d(th);
            }
        } finally {
            this.f4485a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2508d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4485a.writeLock().lock();
        try {
            this.f4487c = 2;
            arrayList.addAll(this.f4486b);
            this.f4486b.clear();
            this.f4485a.writeLock().unlock();
            this.f4488d.post(new f(arrayList, this.f4487c, th));
        } catch (Throwable th2) {
            this.f4485a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #1 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:91:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:91:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #2 {all -> 0x00f4, blocks: (B:59:0x00c1, B:62:0x00c9, B:44:0x0085), top: B:93:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m2509e(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        AbstractC0313R5[] abstractC0313R5Arr;
        if (!(m2506b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C0726n9.m1663f("start should be <= than end", i <= i2);
        C0431Xf c0431Xf = null;
        if (charSequence == null) {
            return null;
        }
        C0726n9.m1663f("start should be < than charSequence length", i <= charSequence.length());
        C0726n9.m1663f("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0296Q5 c0296q5 = this.f4489e.f4494b;
        c0296q5.getClass();
        boolean z = charSequence instanceof C0731ne;
        if (z) {
            ((C0731ne) charSequence).m1684a();
        }
        if (z) {
            c0431Xf = new C0431Xf((Spannable) charSequence);
            if (c0431Xf != null) {
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4) {
            }
            ((C0731ne) charSequence2).m1685b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, AbstractC0313R5.class) <= i2) {
                    c0431Xf = new C0431Xf();
                    c0431Xf.f1616a = false;
                    c0431Xf.f1617b = new SpannableString(charSequence);
                }
                if (c0431Xf != null) {
                    while (i < r5) {
                    }
                }
                i3 = i;
                i4 = i2;
                if (i3 == i4) {
                    charSequence2 = charSequence;
                    if (!z) {
                    }
                }
                ((C0731ne) charSequence2).m1685b();
                return charSequence2;
            }
            try {
                c0431Xf = new C0431Xf((Spannable) charSequence);
                if (c0431Xf != null && (abstractC0313R5Arr = (AbstractC0313R5[]) c0431Xf.f1617b.getSpans(i, i2, AbstractC0313R5.class)) != null && abstractC0313R5Arr.length > 0) {
                    for (AbstractC0313R5 abstractC0313R5 : abstractC0313R5Arr) {
                        int spanStart = c0431Xf.f1617b.getSpanStart(abstractC0313R5);
                        int spanEnd = c0431Xf.f1617b.getSpanEnd(abstractC0313R5);
                        if (spanStart != i2) {
                            c0431Xf.removeSpan(abstractC0313R5);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                i3 = i;
                i4 = i2;
                if (i3 == i4 || i3 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        C0431Xf c0431Xf2 = (C0431Xf) c0296q5.m838c(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C0296Q5.a(c0431Xf, c0296q5.f1078a));
                        if (c0431Xf2 != null) {
                            Spannable spannable = c0431Xf2.f1617b;
                            if (z) {
                                ((C0731ne) charSequence2).m1685b();
                            }
                            return spannable;
                        }
                        if (!z) {
                            return charSequence2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                        }
                    }
                }
                ((C0731ne) charSequence2).m1685b();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((C0731ne) charSequence2).m1685b();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m2510f(e eVar) {
        C0726n9.m1665h(eVar, "initCallback cannot be null");
        this.f4485a.writeLock().lock();
        try {
            if (this.f4487c == 1 || this.f4487c == 2) {
                this.f4488d.post(new f(Arrays.asList(eVar), this.f4487c, null));
            } else {
                this.f4486b.add(eVar);
            }
            this.f4485a.writeLock().unlock();
        } catch (Throwable th) {
            this.f4485a.writeLock().unlock();
            throw th;
        }
    }
}
