package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000A.C0002c;
import p000A.RunnableC0001b;
import p001A0.AbstractC0040p;
import p018J0.C0234d;
import p063j.C0958c;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.emoji2.text.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0485j {

    /* JADX INFO: renamed from: j */
    public static final Object f1353j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C0485j f1354k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f1355a;

    /* JADX INFO: renamed from: b */
    public final C0958c f1356b;

    /* JADX INFO: renamed from: c */
    public volatile int f1357c;

    /* JADX INFO: renamed from: d */
    public final Handler f1358d;

    /* JADX INFO: renamed from: e */
    public final C0481f f1359e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0484i f1360f;

    /* JADX INFO: renamed from: g */
    public final C1121e f1361g;

    /* JADX INFO: renamed from: h */
    public final int f1362h;

    /* JADX INFO: renamed from: i */
    public final C0479d f1363i;

    public C0485j(C0493r c0493r) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1355a = reentrantReadWriteLock;
        this.f1357c = 3;
        InterfaceC0484i interfaceC0484i = c0493r.f1388a;
        this.f1360f = interfaceC0484i;
        int i2 = c0493r.f1389b;
        this.f1362h = i2;
        this.f1363i = c0493r.f1390c;
        this.f1358d = new Handler(Looper.getMainLooper());
        C0958c c0958c = new C0958c();
        c0958c.f3398a = C0958c.f3392e;
        c0958c.f3399b = C0958c.f3393f;
        c0958c.f3400c = 0;
        this.f1356b = c0958c;
        this.f1361g = new C1121e(21);
        C0481f c0481f = new C0481f(this);
        this.f1359e = c0481f;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1357c = 0;
            } catch (Throwable th) {
                this.f1355a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1200b() == 0) {
            try {
                interfaceC0484i.mo350p(new C0480e(c0481f));
            } catch (Throwable th2) {
                m1202d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0485j m1199a() {
        C0485j c0485j;
        synchronized (f1353j) {
            try {
                c0485j = f1354k;
                if (!(c0485j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0485j;
    }

    /* JADX INFO: renamed from: b */
    public final int m1200b() {
        this.f1355a.readLock().lock();
        try {
            return this.f1357c;
        } finally {
            this.f1355a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1201c() {
        if (!(this.f1362h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1200b() == 1) {
            return;
        }
        this.f1355a.writeLock().lock();
        try {
            if (this.f1357c == 0) {
                return;
            }
            this.f1357c = 0;
            this.f1355a.writeLock().unlock();
            C0481f c0481f = this.f1359e;
            C0485j c0485j = c0481f.f1350a;
            try {
                c0485j.f1360f.mo350p(new C0480e(c0481f));
            } catch (Throwable th) {
                c0485j.m1202d(th);
            }
        } finally {
            this.f1355a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1202d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1355a.writeLock().lock();
        try {
            this.f1357c = 2;
            arrayList.addAll(this.f1356b);
            this.f1356b.clear();
            this.f1355a.writeLock().unlock();
            this.f1358d.post(new RunnableC0001b(arrayList, this.f1357c, th));
        } catch (Throwable th2) {
            this.f1355a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1203e() {
        ArrayList arrayList = new ArrayList();
        this.f1355a.writeLock().lock();
        try {
            this.f1357c = 1;
            arrayList.addAll(this.f1356b);
            this.f1356b.clear();
            this.f1355a.writeLock().unlock();
            this.f1358d.post(new RunnableC0001b(arrayList, this.f1357c, null));
        } catch (Throwable th) {
            this.f1355a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m1204f(CharSequence charSequence, int i2, int i3) {
        C0498w[] c0498wArr;
        if (!(m1200b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC0040p.m104g("start should be <= than end", i2 <= i3);
        C0500y c0500y = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC0040p.m104g("start should be < than charSequence length", i2 <= charSequence.length());
        AbstractC0040p.m104g("end should be < than charSequence length", i3 <= charSequence.length());
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        C0234d c0234d = this.f1359e.f1351b;
        c0234d.getClass();
        boolean z2 = charSequence instanceof C0496u;
        if (z2) {
            ((C0496u) charSequence).m1213a();
        }
        if (z2) {
            c0500y = new C0500y((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c0500y = new C0500y((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, C0498w.class) <= i3) {
                    c0500y = new C0500y();
                    c0500y.f1406a = false;
                    c0500y.f1407b = new SpannableString(charSequence);
                }
            } finally {
                if (z2) {
                    ((C0496u) charSequence).m1214b();
                }
            }
        }
        if (c0500y != null && (c0498wArr = (C0498w[]) c0500y.f1407b.getSpans(i2, i3, C0498w.class)) != null && c0498wArr.length > 0) {
            for (C0498w c0498w : c0498wArr) {
                int spanStart = c0500y.f1407b.getSpanStart(c0498w);
                int spanEnd = c0500y.f1407b.getSpanEnd(c0498w);
                if (spanStart != i3) {
                    c0500y.removeSpan(c0498w);
                }
                i2 = Math.min(spanStart, i2);
                i3 = Math.max(spanEnd, i3);
            }
        }
        int i4 = i2;
        int i5 = i3;
        if (i4 != i5 && i4 < charSequence.length()) {
            C0500y c0500y2 = (C0500y) c0234d.m656t(charSequence, i4, i5, Integer.MAX_VALUE, false, new C0002c(c0500y, (C1121e) c0234d.f474b, 7));
            if (c0500y2 != null) {
                Spannable spannable = c0500y2.f1407b;
                if (z2) {
                    ((C0496u) charSequence).m1214b();
                }
                return spannable;
            }
            if (!z2) {
                return charSequence;
            }
        } else if (!z2) {
            return charSequence;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: g */
    public final void m1205g(AbstractC0483h abstractC0483h) {
        AbstractC0040p.m106i(abstractC0483h, "initCallback cannot be null");
        this.f1355a.writeLock().lock();
        try {
            if (this.f1357c == 1 || this.f1357c == 2) {
                this.f1358d.post(new RunnableC0001b(Arrays.asList(abstractC0483h), this.f1357c, null));
            } else {
                this.f1356b.add(abstractC0483h);
            }
            this.f1355a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1355a.writeLock().unlock();
            throw th;
        }
    }
}
