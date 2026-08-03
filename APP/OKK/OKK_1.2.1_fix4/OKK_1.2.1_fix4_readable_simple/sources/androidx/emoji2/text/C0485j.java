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
    public static final Object f1353j = null;

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

    static {
        f1353j = new Object();
    }

    public C0485j(C0493r r6) {
        ReentrantReadWriteLock r02 = new ReentrantReadWriteLock();
        this.f1355a = r02;
        this.f1357c = 3;
        InterfaceC0484i r1 = r6.f1388a;
        this.f1360f = r1;
        int r2 = r6.f1389b;
        this.f1362h = r2;
        this.f1363i = r6.f1390c;
        this.f1358d = new Handler(Looper.getMainLooper());
        C0958c r62 = new C0958c();
        r62.f3398a = C0958c.f3392e;
        r62.f3399b = C0958c.f3393f;
        r62.f3400c = 0;
        this.f1356b = r62;
        this.f1361g = new C1121e(21);
        C0481f r63 = new C0481f(this);
        this.f1359e = r63;
        r02.writeLock().lock();
        if (r2 == 0) goto L16;
    L9:
        r02.writeLock().unlock();
        if (m1200b() != 0) goto L20;
        r1.mo350p(new C0480e(r63));     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        m1202d(th);
        return;
    L20:
        return;
    L16:
        this.f1357c = 0;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        this.f1355a.writeLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static C0485j m1199a() {
        Object r02 = f1353j;
        monitor-enter(r02);
        C0485j r1 = f1354k;     // Catch: Throwable -> L12
        if (r1 == null) goto L7;
        boolean r2 = true;
    L9:
        if (r2 == false) goto L15;
        monitor-exit(r02);     // Catch: Throwable -> L12
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
    public final int m1200b() {
        this.f1355a.readLock().lock();
        int r02 = this.f1357c;     // Catch: Throwable -> L6
        this.f1355a.readLock().unlock();
        return r02;
    L6:
        th = move-exception;
        this.f1355a.readLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final void m1201c() {
        if (this.f1362h != 1) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L26;
        if (m1200b() != 1) goto L10;
        return;
    L10:
        this.f1355a.writeLock().lock();
    L22:
        th = move-exception;
        this.f1355a.writeLock().unlock();
        throw th;
    L12:
        if (this.f1357c != 0) goto L15;
        this.f1355a.writeLock().unlock();
        return;
    L15:
        this.f1357c = 0;     // Catch: Throwable -> L22
        this.f1355a.writeLock().unlock();
        C0481f r03 = this.f1359e;
        C0485j r1 = r03.f1350a;
        r1.f1360f.mo350p(new C0480e(r03));     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        r1.m1202d(th);
        return;
    L26:
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m1202d(Throwable r5) {
        ArrayList r02 = new ArrayList();
        this.f1355a.writeLock().lock();
        this.f1357c = 2;     // Catch: Throwable -> L6
        r02.addAll(this.f1356b);     // Catch: Throwable -> L6
        this.f1356b.clear();     // Catch: Throwable -> L6
        this.f1355a.writeLock().unlock();
        this.f1358d.post(new RunnableC0001b(r02, this.f1357c, r5));
        return;
    L6:
        th = move-exception;
        this.f1355a.writeLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final void m1203e() {
        ArrayList r02 = new ArrayList();
        this.f1355a.writeLock().lock();
        this.f1357c = 1;     // Catch: Throwable -> L6
        r02.addAll(this.f1356b);     // Catch: Throwable -> L6
        this.f1356b.clear();     // Catch: Throwable -> L6
        this.f1355a.writeLock().unlock();
        this.f1358d.post(new RunnableC0001b(r02, this.f1357c, null));
        return;
    L6:
        th = move-exception;
        this.f1355a.writeLock().unlock();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m1204f(CharSequence r11, int r12, int r13) {
        int r1 = 0;
        boolean r2 = true;
        if (m1200b() != 1) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L79;
        if (r12 < 0) goto L77;
        if (r13 < 0) goto L75;
        if (r12 > r13) goto L11;
        boolean r03 = true;
    L12:
        AbstractC0040p.m104g("start should be <= than end", r03);
        C0500y r04 = null;
        if (r11 != null) goto L16;
        return null;
    L16:
        if (r12 > r11.length()) goto L18;
        boolean r3 = true;
    L19:
        AbstractC0040p.m104g("start should be < than charSequence length", r3);
        if (r13 <= r11.length()) goto L23;
        r2 = false;
    L23:
        AbstractC0040p.m104g("end should be < than charSequence length", r2);
        if (r11.length() == 0) goto L73;
        if (r12 == r13) goto L73;
        C0234d r32 = this.f1359e.f1351b;
        r32.getClass();
        boolean r22 = r11 instanceof C0496u;
        if (r22 == false) goto L31;
        ((C0496u) r11).m1213a();
    L31:
        if (r22 == false) goto L80;
    L42:
        r04 = new C0500y((Spannable) r11);     // Catch: Throwable -> L40
    L43:
        if (r04 == null) goto L54;
        C0498w[] r4 = (C0498w[]) r04.f1407b.getSpans(r12, r13, C0498w.class);     // Catch: Throwable -> L40
        if (r4 == null) goto L54;
        if (r4.length <= 0) goto L54;
        int r5 = r4.length;     // Catch: Throwable -> L40
    L49:
        if (r1 >= r5) goto L54;
        C0498w r6 = r4[r1];     // Catch: Throwable -> L40
        int r7 = r04.f1407b.getSpanStart(r6);     // Catch: Throwable -> L40
        int r8 = r04.f1407b.getSpanEnd(r6);     // Catch: Throwable -> L40
        if (r7 == r13) goto L53;
        r04.removeSpan(r6);     // Catch: Throwable -> L40
    L53:
        r12 = Math.min(r7, r12);     // Catch: Throwable -> L40
        r13 = Math.max(r8, r13);     // Catch: Throwable -> L40
        r1 = r1 + 1;     // Catch: Throwable -> L40
    L54:
        int r52 = r12;
        int r62 = r13;
        if (r52 != r62) goto L57;
    L67:
        if (r22 == false) goto L87;
    L66:
        ((C0496u) r11).m1214b();
        return r11;
    L87:
        return r11;
    L57:
        if (r52 >= r11.length()) goto L67;
        C0500y r122 = (C0500y) r32.m656t(r11, r52, r62, Integer.MAX_VALUE, false, new C0002c(r04, (C1121e) r32.f474b, 7));     // Catch: Throwable -> L40
        if (r122 == null) goto L65;
        Spannable r123 = r122.f1407b;     // Catch: Throwable -> L40
        if (r22 == false) goto L69;
        ((C0496u) r11).m1214b();
    L69:
        return r123;
    L40:
        th = move-exception;
        if (r22 == false) goto L72;
        ((C0496u) r11).m1214b();
    L72:
        throw th;
    L65:
        if (r22 == true) goto L66;
        return r11;
    L80:
        if ((r11 instanceof Spannable) == true) goto L42;
        if ((r11 instanceof Spanned) == false) goto L43;
        if (((Spanned) r11).nextSpanTransition(r12 - 1, r13 + 1, C0498w.class) > r13) goto L43;
        r04 = new C0500y();     // Catch: Throwable -> L40
        r04.f1406a = false;     // Catch: Throwable -> L40
        r04.f1407b = new SpannableString(r11);     // Catch: Throwable -> L40
    L73:
        return r11;
    L18:
        r3 = false;
        goto L19
    L11:
        r03 = false;
        goto L12
    L75:
        throw new IllegalArgumentException("end cannot be negative");
    L77:
        throw new IllegalArgumentException("start cannot be negative");
    L79:
        throw new IllegalStateException("Not initialized yet");
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final void m1205g(AbstractC0483h r5) {
        AbstractC0040p.m106i(r5, "initCallback cannot be null");
        this.f1355a.writeLock().lock();
    L9:
        th = move-exception;
        this.f1355a.writeLock().unlock();
        throw th;
    L4:
        if (this.f1357c != 1) goto L6;
    L11:
        Handler r02 = this.f1358d;     // Catch: Throwable -> L9
        int r2 = this.f1357c;     // Catch: Throwable -> L9
        r02.post(new RunnableC0001b(Arrays.asList(new AbstractC0483h[]{r5}), r2, null));     // Catch: Throwable -> L9
    L12:
        this.f1355a.writeLock().unlock();
        return;
    L6:
        if (this.f1357c == 2) goto L11;
        this.f1356b.add(r5);     // Catch: Throwable -> L9
        goto L12
    }
}
