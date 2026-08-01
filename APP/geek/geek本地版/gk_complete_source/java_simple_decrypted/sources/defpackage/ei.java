package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class ei {
    public static final Object i = null;
    public static volatile ei j;
    public final ReentrantReadWriteLock a;
    public final q6 b;
    public volatile int c;
    public final Handler d;
    public final zh e;
    public final di f;
    public final int g;
    public final mf h;

    static {
        i = new Object();
    }

    public ei(wk r5) {
        ReentrantReadWriteLock r0 = new ReentrantReadWriteLock();
        this.a = r0;
        this.c = 3;
        di r1 = (di) r5.b;
        this.f = r1;
        int r2 = r5.a;
        this.g = r2;
        this.h = (mf) r5.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new q6();
        zh r52 = new zh(this);
        this.e = r52;
        r0.writeLock().lock();
        if (r2 == 0) goto L17;
    L10:
        r0.writeLock().unlock();
        if (b() != 0) goto L21;
        r1.e(new yh(r52));     // Catch: Throwable -> L14
        return;
    L14:
        th = move-exception;
        d(th);
        return;
    L21:
        return;
    L17:
        this.c = 0;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    }

    public static ei a() {
        Object r0 = i;
        monitor-enter(r0);
        ei r1 = j;     // Catch: Throwable -> L12
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

    public final int b() {
        this.a.readLock().lock();
        int r0 = this.c;     // Catch: Throwable -> L6
        this.a.readLock().unlock();
        return r0;
    L6:
        th = move-exception;
        this.a.readLock().unlock();
        throw th;
    }

    public final void c() {
        if (this.g != 1) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L26;
        if (b() != 1) goto L10;
        return;
    L10:
        this.a.writeLock().lock();
    L22:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    L12:
        if (this.c != 0) goto L15;
        this.a.writeLock().unlock();
        return;
    L15:
        this.c = 0;     // Catch: Throwable -> L22
        this.a.writeLock().unlock();
        zh r02 = this.e;
        ei r1 = r02.a;
        r1.f.e(new yh(r02));     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        r1.d(th);
        return;
    L26:
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    L5:
        r0 = false;
        goto L6
    }

    public final void d(Throwable r5) {
        ArrayList r0 = new ArrayList();
        this.a.writeLock().lock();
        this.c = 2;     // Catch: Throwable -> L6
        r0.addAll(this.b);     // Catch: Throwable -> L6
        this.b.clear();     // Catch: Throwable -> L6
        this.a.writeLock().unlock();
        this.d.post(new e8(r0, this.c, r5));
        return;
    L6:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    }

    public final CharSequence e(CharSequence r12, int r13, int r14) {
        if (b() != 1) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L114;
        if (r13 < 0) goto L112;
        if (r14 < 0) goto L110;
        if (r13 > r14) goto L11;
        boolean r02 = true;
    L12:
        zt.d("start should be <= than end", r02);
        s80 r03 = null;
        if (r12 != null) goto L16;
        return null;
    L16:
        if (r13 > r12.length()) goto L18;
        boolean r3 = true;
    L19:
        zt.d("start should be < than charSequence length", r3);
        if (r14 > r12.length()) goto L22;
        boolean r32 = true;
    L23:
        zt.d("end should be < than charSequence length", r32);
        if (r12.length() == 0) goto L108;
        if (r13 == r14) goto L108;
        d4 r33 = this.e.b;
        r33.getClass();
        boolean r4 = r12 instanceof d40;
        if (r4 == false) goto L31;
        ((d40) r12).a();
    L31:
        if (r4 == false) goto L115;
    L42:
        r03 = new s80((Spannable) r12);     // Catch: Throwable -> L40
    L43:
        if (r03 == null) goto L54;
        g80[] r5 = (g80[]) r03.b.getSpans(r13, r14, g80.class);     // Catch: Throwable -> L40
        if (r5 == null) goto L54;
        if (r5.length <= 0) goto L54;
        int r6 = r5.length;     // Catch: Throwable -> L40
        int r7 = 0;
    L49:
        if (r7 >= r6) goto L54;
        g80 r8 = r5[r7];     // Catch: Throwable -> L40
        int r9 = r03.b.getSpanStart(r8);     // Catch: Throwable -> L40
        int r10 = r03.b.getSpanEnd(r8);     // Catch: Throwable -> L40
        if (r9 == r14) goto L53;
        r03.removeSpan(r8);     // Catch: Throwable -> L40
    L53:
        r13 = Math.min(r9, r13);     // Catch: Throwable -> L40
        r14 = Math.max(r10, r14);     // Catch: Throwable -> L40
        r7 = r7 + 1;     // Catch: Throwable -> L40
    L54:
        if (r13 != r14) goto L56;
    L103:
        if (r4 == false) goto L108;
    L101:
        ((d40) r12).b();
        return r12;
    L56:
        if (r13 >= r12.length()) goto L103;
        oi r52 = new oi((xv) ((a8) r33.b).c);     // Catch: Throwable -> L40
        int r72 = Character.codePointAt(r12, r13);     // Catch: Throwable -> L40
        int r62 = 0;
        s80 r1 = r03;
    L59:
        int r04 = r13;
    L61:
        if (r13 >= r14) goto L82;
        if (r62 >= Integer.MAX_VALUE) goto L82;
        int r102 = r52.a(r72);     // Catch: Throwable -> L40
        if (r102 != 1) goto L65;
        r04 = r04 + Character.charCount(Character.codePointAt(r12, r04));     // Catch: Throwable -> L40
        if (r04 >= r14) goto L80;
        r72 = Character.codePointAt(r12, r04);     // Catch: Throwable -> L40
    L80:
        r13 = r04;
        goto L61
    L65:
        if (r102 != 2) goto L67;
        r13 = r13 + Character.charCount(r72);     // Catch: Throwable -> L40
        if (r13 >= r14) goto L61;
        r72 = Character.codePointAt(r12, r13);     // Catch: Throwable -> L40
        goto L61
    L67:
        if (r102 != 3) goto L61;
        if (r33.w(r12, r04, r13, r52.d.b) == true) goto L59;
        if (r1 != null) goto L73;
        r1 = new s80(new SpannableString(r12));     // Catch: Throwable -> L40
    L73:
        r1.setSpan(new g80(r52.d.b), r04, r13, 33);     // Catch: Throwable -> L40
        r62 = r62 + 1;     // Catch: Throwable -> L40
    L82:
        if (r52.a == 2) goto L84;
    L95:
        if (r1 == null) goto L100;
        Spannable r132 = r1.b;     // Catch: Throwable -> L40
        if (r4 == false) goto L99;
        ((d40) r12).b();
    L99:
        return r132;
    L40:
        th = move-exception;
        if (r4 == false) goto L107;
        ((d40) r12).b();
    L107:
        throw th;
    L100:
        if (r4 == false) goto L108;
    L84:
        if (r52.c.b == null) goto L95;
        if (r52.f <= 1) goto L88;
    L89:
        if (r62 >= Integer.MAX_VALUE) goto L95;
        if (r33.w(r12, r04, r13, r52.c.b) == true) goto L95;
        if (r1 != null) goto L94;
        r1 = new s80(r12);     // Catch: Throwable -> L40
    L94:
        r1.setSpan(new g80(r52.c.b), r04, r13, 33);     // Catch: Throwable -> L40
        goto L95
    L88:
        if (r52.c() == false) goto L95;
    L115:
        if ((r12 instanceof Spannable) == true) goto L42;
        if ((r12 instanceof Spanned) == false) goto L43;
        if (((Spanned) r12).nextSpanTransition(r13 - 1, r14 + 1, g80.class) > r14) goto L43;
        r03 = new s80(r12);     // Catch: Throwable -> L40
    L108:
        return r12;
    L22:
        r32 = false;
        goto L23
    L18:
        r3 = false;
        goto L19
    L11:
        r02 = false;
        goto L12
    L110:
        throw new IllegalArgumentException("end cannot be negative");
    L112:
        throw new IllegalArgumentException("start cannot be negative");
    L114:
        throw new IllegalStateException("Not initialized yet");
    L5:
        r0 = false;
        goto L6
    }

    public final void f(ci r5) {
        zt.f("initCallback cannot be null", r5);
        this.a.writeLock().lock();
    L9:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    L4:
        if (this.c != 1) goto L6;
    L11:
        Handler r0 = this.d;     // Catch: Throwable -> L9
        int r2 = this.c;     // Catch: Throwable -> L9
        r0.post(new e8(Arrays.asList(new ci[]{r5}), r2, null));     // Catch: Throwable -> L9
    L12:
        this.a.writeLock().unlock();
        return;
    L6:
        if (this.c == 2) goto L11;
        this.b.add(r5);     // Catch: Throwable -> L9
        goto L12
    }
}
