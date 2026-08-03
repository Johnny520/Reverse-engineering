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
    public static final Object f8341j = null;

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

    static {
        f8341j = new Object();
    }

    public C2372pf(C0669Ph r5) {
        ReentrantReadWriteLock r0 = new ReentrantReadWriteLock();
        this.f8343a = r0;
        this.f8345c = 3;
        InterfaceC2321of r1 = r5.f2134a;
        this.f8348f = r1;
        int r2 = r5.f2135b;
        this.f8350h = r2;
        this.f8351i = r5.f2136c;
        this.f8346d = new Handler(Looper.getMainLooper());
        this.f8344b = new C0607O4();
        this.f8349g = new C2220m6(17);
        C2192lf r52 = new C2192lf(this);
        this.f8347e = r52;
        r0.writeLock().lock();
        if (r2 == 0) goto L17;
    L10:
        r0.writeLock().unlock();
        if (m4799b() != 0) goto L21;
        r1.mo1218a(new C2145kf(r52));     // Catch: Throwable -> L14
        return;
    L14:
        th = move-exception;
        m4801d(th);
        return;
    L21:
        return;
    L17:
        this.f8345c = 0;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        this.f8343a.writeLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static C2372pf m4798a() {
        Object r0 = f8341j;
        monitor-enter(r0);
        C2372pf r1 = f8342k;     // Catch: Throwable -> L12
        if (r1 == null) goto L7;
        boolean r2 = true;
    L9:
        if (r2 == false) goto L15;
        monitor-exit(r0);     // Catch: Throwable -> L12
        return r1;
    L15:
        throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");     // Catch: Throwable -> L12
    L7:
        r2 = false;
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final int m4799b() {
        this.f8343a.readLock().lock();
        int r0 = this.f8345c;     // Catch: Throwable -> L6
        this.f8343a.readLock().unlock();
        return r0;
    L6:
        th = move-exception;
        this.f8343a.readLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final void m4800c() {
        if (this.f8350h != 1) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L26;
        if (m4799b() != 1) goto L10;
        return;
    L10:
        this.f8343a.writeLock().lock();
    L22:
        th = move-exception;
        this.f8343a.writeLock().unlock();
        throw th;
    L12:
        if (this.f8345c != 0) goto L15;
        this.f8343a.writeLock().unlock();
        return;
    L15:
        this.f8345c = 0;     // Catch: Throwable -> L22
        this.f8343a.writeLock().unlock();
        C2192lf r02 = this.f8347e;
        C2372pf r1 = r02.f7644a;
        r1.f8348f.mo1218a(new C2145kf(r02));     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        r1.m4801d(th);
        return;
    L26:
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m4801d(Throwable r5) {
        ArrayList r0 = new ArrayList();
        this.f8343a.writeLock().lock();
        this.f8345c = 2;     // Catch: Throwable -> L6
        r0.addAll(this.f8344b);     // Catch: Throwable -> L6
        this.f8344b.clear();     // Catch: Throwable -> L6
        this.f8343a.writeLock().unlock();
        this.f8346d.post(new RunnableC0308H6(r0, this.f8345c, r5));
        return;
    L6:
        th = move-exception;
        this.f8343a.writeLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m4802e(CharSequence r11, int r12, int r13) {
        int r1 = 0;
        boolean r2 = true;
        if (m4799b() != 1) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L93;
        if (r12 < 0) goto L91;
        if (r13 < 0) goto L89;
        if (r12 > r13) goto L11;
        boolean r02 = true;
    L12:
        AbstractC1293cr.m2545d("start should be <= than end", r02);
        C1316dD r03 = null;
        if (r11 != null) goto L16;
        return null;
    L16:
        if (r12 > r11.length()) goto L18;
        boolean r3 = true;
    L19:
        AbstractC1293cr.m2545d("start should be < than charSequence length", r3);
        if (r13 <= r11.length()) goto L23;
        r2 = false;
    L23:
        AbstractC1293cr.m2545d("end should be < than charSequence length", r2);
        if (r11.length() == 0) goto L87;
        if (r12 == r13) goto L87;
        C2656w4 r32 = this.f8347e.f7645b;
        r32.getClass();
        boolean r22 = r11 instanceof C0428Jy;
        if (r22 == false) goto L31;
        ((C0428Jy) r11).m883a();
    L31:
        if (r22 == true) goto L96;
    L42:
        th = move-exception;
        Throwable r122 = th;
        CharSequence r4 = r11;
    L84:
        if (r22 == false) goto L103;
        ((C0428Jy) r4).m884b();
        throw r122;
    L103:
        throw r122;
    L33:
        if ((r11 instanceof Spannable) == true) goto L96;
        if ((r11 instanceof Spanned) == true) goto L38;
    L45:
        if (r03 == null) goto L57;
        C1086ZB[] r42 = (C1086ZB[]) r03.f4776b.getSpans(r12, r13, C1086ZB.class);     // Catch: Throwable -> L42
        if (r42 == null) goto L57;
        if (r42.length <= 0) goto L57;
        int r5 = r42.length;     // Catch: Throwable -> L42
    L51:
        if (r1 >= r5) goto L57;
        C1086ZB r6 = r42[r1];     // Catch: Throwable -> L42
        int r7 = r03.f4776b.getSpanStart(r6);     // Catch: Throwable -> L42
        int r8 = r03.f4776b.getSpanEnd(r6);     // Catch: Throwable -> L42
        if (r7 == r13) goto L55;
        r03.removeSpan(r6);     // Catch: Throwable -> L42
    L55:
        r12 = Math.min(r7, r12);     // Catch: Throwable -> L42
        r13 = Math.max(r8, r13);     // Catch: Throwable -> L42
        r1 = r1 + 1;
    L57:
        int r52 = r12;
        int r62 = r13;
        if (r52 != r62) goto L60;
    L61:
        r4 = r11;
        if (r22 == false) goto L105;
    L76:
        ((C0428Jy) r4).m884b();
        return r4;
    L105:
        return r4;
    L60:
        if (r52 >= r11.length()) goto L61;
        r4 = r11;
        C1316dD r112 = (C1316dD) r32.m5194C(r4, r52, r62, Integer.MAX_VALUE, false, new C0649P3(15, r03, (C2220m6) r32.f9196b));     // Catch: Throwable -> L73
        if (r112 == null) goto L75;
        Spannable r113 = r112.f4776b;     // Catch: Throwable -> L73
        if (r22 == false) goto L72;
        ((C0428Jy) r4).m884b();
    L72:
        return r113;
    L75:
        if (r22 == true) goto L76;
        return r4;
    L73:
        th = th;
    L74:
        r122 = th;
    L78:
        th = th;
        r4 = r11;
    L80:
        th = move-exception;
        r4 = r11;
        r122 = th;
        goto L84
    L38:
        if (((Spanned) r11).nextSpanTransition(r12 - 1, r13 + 1, C1086ZB.class) > r13) goto L45;
        r03 = new C1316dD();     // Catch: Throwable -> L42
        r03.f4775a = false;     // Catch: Throwable -> L42
        r03.f4776b = new SpannableString(r11);     // Catch: Throwable -> L42
    L96:
        r03 = new C1316dD((Spannable) r11);     // Catch: Throwable -> L78
    L87:
        return r11;
    L18:
        r3 = false;
        goto L19
    L11:
        r02 = false;
        goto L12
    L89:
        throw new IllegalArgumentException("end cannot be negative");
    L91:
        throw new IllegalArgumentException("start cannot be negative");
    L93:
        throw new IllegalStateException("Not initialized yet");
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public final void m4803f(AbstractC2278nf r5) {
        AbstractC1293cr.m2548g("initCallback cannot be null", r5);
        this.f8343a.writeLock().lock();
    L9:
        th = move-exception;
        this.f8343a.writeLock().unlock();
        throw th;
    L4:
        if (this.f8345c != 1) goto L6;
    L11:
        Handler r0 = this.f8346d;     // Catch: Throwable -> L9
        int r2 = this.f8345c;     // Catch: Throwable -> L9
        r0.post(new RunnableC0308H6(Arrays.asList(new AbstractC2278nf[]{r5}), r2, null));     // Catch: Throwable -> L9
    L12:
        this.f8343a.writeLock().unlock();
        return;
    L6:
        if (this.f8345c == 2) goto L11;
        this.f8344b.add(r5);     // Catch: Throwable -> L9
        goto L12
    }
}
