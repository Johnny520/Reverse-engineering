package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: pf */
/* JADX INFO: loaded from: classes.dex */
public final class C2372pf {

    /* JADX INFO: renamed from: j */
    public static final Object f8341j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C2372pf f8342k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f8343a;

    /* JADX INFO: renamed from: b */
    public final C0607O4 f8344b;

    /* JADX INFO: renamed from: c */
    public volatile int f8345c;

    /* JADX INFO: renamed from: d */
    public final Handler f8346d;

    /* JADX INFO: renamed from: e */
    public final C2192lf f8347e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2321of f8348f;

    /* JADX INFO: renamed from: g */
    public final C2220m6 f8349g;

    /* JADX INFO: renamed from: h */
    public final int f8350h;

    /* JADX INFO: renamed from: i */
    public final C0749Rc f8351i;

    public C2372pf(C0669Ph c0669Ph) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8343a = reentrantReadWriteLock;
        this.f8345c = 3;
        InterfaceC2321of interfaceC2321of = c0669Ph.f2134a;
        this.f8348f = interfaceC2321of;
        int i = c0669Ph.f2135b;
        this.f8350h = i;
        this.f8351i = c0669Ph.f2136c;
        this.f8346d = new Handler(Looper.getMainLooper());
        this.f8344b = new C0607O4();
        this.f8349g = new C2220m6(17);
        C2192lf c2192lf = new C2192lf(this);
        this.f8347e = c2192lf;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f8345c = 0;
            } catch (Throwable th) {
                this.f8343a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m4799b() == 0) {
            try {
                interfaceC2321of.mo1218a(new C2145kf(c2192lf));
            } catch (Throwable th2) {
                m4801d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2372pf m4798a() {
        C2372pf c2372pf;
        synchronized (f8341j) {
            try {
                c2372pf = f8342k;
                if (!(c2372pf != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c2372pf;
    }

    /* JADX INFO: renamed from: b */
    public final int m4799b() {
        this.f8343a.readLock().lock();
        try {
            return this.f8345c;
        } finally {
            this.f8343a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4800c() {
        if (!(this.f8350h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m4799b() == 1) {
            return;
        }
        this.f8343a.writeLock().lock();
        try {
            if (this.f8345c == 0) {
                return;
            }
            this.f8345c = 0;
            this.f8343a.writeLock().unlock();
            C2192lf c2192lf = this.f8347e;
            C2372pf c2372pf = c2192lf.f7644a;
            try {
                c2372pf.f8348f.mo1218a(new C2145kf(c2192lf));
            } catch (Throwable th) {
                c2372pf.m4801d(th);
            }
        } finally {
            this.f8343a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4801d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f8343a.writeLock().lock();
        try {
            this.f8345c = 2;
            arrayList.addAll(this.f8344b);
            this.f8344b.clear();
            this.f8343a.writeLock().unlock();
            this.f8346d.post(new RunnableC0308H6(arrayList, this.f8345c, th));
        } catch (Throwable th2) {
            this.f8343a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f8, TRY_ENTER, TryCatch #1 {all -> 0x00f8, blocks: (B:59:0x00c1, B:62:0x00c9, B:65:0x00d1, B:44:0x0085), top: B:96:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m4802e(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        C1086ZB[] c1086zbArr;
        if (!(m4799b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC1293cr.m2545d("start should be <= than end", i <= i2);
        C1316dD c1316dD = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC1293cr.m2545d("start should be < than charSequence length", i <= charSequence.length());
        AbstractC1293cr.m2545d("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C2656w4 c2656w4 = this.f8347e.f7645b;
        c2656w4.getClass();
        boolean z = charSequence instanceof C0428Jy;
        if (z) {
            ((C0428Jy) charSequence).m883a();
        }
        if (z) {
            c1316dD = new C1316dD((Spannable) charSequence);
            if (c1316dD != null) {
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4) {
            }
            ((C0428Jy) charSequence2).m884b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C1086ZB.class) <= i2) {
                    c1316dD = new C1316dD();
                    c1316dD.f4775a = false;
                    c1316dD.f4776b = new SpannableString(charSequence);
                }
                if (c1316dD != null) {
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
                ((C0428Jy) charSequence2).m884b();
                return charSequence2;
            }
            try {
                c1316dD = new C1316dD((Spannable) charSequence);
                if (c1316dD != null && (c1086zbArr = (C1086ZB[]) c1316dD.f4776b.getSpans(i, i2, C1086ZB.class)) != null && c1086zbArr.length > 0) {
                    for (C1086ZB c1086zb : c1086zbArr) {
                        int spanStart = c1316dD.f4776b.getSpanStart(c1086zb);
                        int spanEnd = c1316dD.f4776b.getSpanEnd(c1086zb);
                        if (spanStart != i2) {
                            c1316dD.removeSpan(c1086zb);
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
                    try {
                        charSequence2 = charSequence;
                    } catch (Throwable th2) {
                        charSequence2 = charSequence;
                        th = th2;
                    }
                    try {
                        C1316dD c1316dD2 = (C1316dD) c2656w4.m5194C(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C0649P3(15, c1316dD, (C2220m6) c2656w4.f9196b));
                        if (c1316dD2 != null) {
                            Spannable spannable = c1316dD2.f4776b;
                            if (z) {
                                ((C0428Jy) charSequence2).m884b();
                            }
                            return spannable;
                        }
                        if (!z) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z) {
                        }
                    }
                }
                ((C0428Jy) charSequence2).m884b();
                return charSequence2;
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th = th;
                if (!z) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((C0428Jy) charSequence2).m884b();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m4803f(AbstractC2278nf abstractC2278nf) {
        AbstractC1293cr.m2548g("initCallback cannot be null", abstractC2278nf);
        this.f8343a.writeLock().lock();
        try {
            if (this.f8345c == 1 || this.f8345c == 2) {
                this.f8346d.post(new RunnableC0308H6(Arrays.asList(abstractC2278nf), this.f8345c, (Throwable) null));
            } else {
                this.f8344b.add(abstractC2278nf);
            }
            this.f8343a.writeLock().unlock();
        } catch (Throwable th) {
            this.f8343a.writeLock().unlock();
            throw th;
        }
    }
}
