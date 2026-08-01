package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p052b1.AbstractC0503h;
import p075l.C0745c;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0396k {

    /* JADX INFO: renamed from: i */
    public static final Object f1173i = new Object();

    /* JADX INFO: renamed from: j */
    public static volatile C0396k f1174j;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f1175a;

    /* JADX INFO: renamed from: b */
    public final C0745c f1176b;

    /* JADX INFO: renamed from: c */
    public volatile int f1177c;

    /* JADX INFO: renamed from: d */
    public final Handler f1178d;

    /* JADX INFO: renamed from: e */
    public final C0392g f1179e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0395j f1180f;

    /* JADX INFO: renamed from: g */
    public final int f1181g;

    /* JADX INFO: renamed from: h */
    public final C0390e f1182h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0396k(C0402q c0402q) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1175a = reentrantReadWriteLock;
        this.f1177c = 3;
        InterfaceC0395j interfaceC0395j = c0402q.f1204a;
        this.f1180f = interfaceC0395j;
        int i2 = c0402q.f1205b;
        this.f1181g = i2;
        this.f1182h = c0402q.f1206c;
        this.f1178d = new Handler(Looper.getMainLooper());
        this.f1176b = new C0745c();
        C0392g c0392g = new C0392g(this);
        this.f1179e = c0392g;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1177c = 0;
            } catch (Throwable th) {
                this.f1175a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m762b() == 0) {
            try {
                interfaceC0395j.mo145q(new C0391f(c0392g));
            } catch (Throwable th2) {
                m764d(th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0396k m761a() {
        C0396k c0396k;
        synchronized (f1173i) {
            try {
                c0396k = f1174j;
                if (!(c0396k != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0396k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m762b() {
        this.f1175a.readLock().lock();
        try {
            return this.f1177c;
        } finally {
            this.f1175a.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m763c() {
        if (!(this.f1181g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m762b() == 1) {
            return;
        }
        this.f1175a.writeLock().lock();
        try {
            if (this.f1177c == 0) {
                return;
            }
            this.f1177c = 0;
            this.f1175a.writeLock().unlock();
            C0392g c0392g = this.f1179e;
            C0396k c0396k = c0392g.f1168a;
            try {
                c0396k.f1180f.mo145q(new C0391f(c0392g));
            } catch (Throwable th) {
                c0396k.m764d(th);
            }
        } finally {
            this.f1175a.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m764d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1175a.writeLock().lock();
        try {
            this.f1177c = 2;
            arrayList.addAll(this.f1176b);
            this.f1176b.clear();
            this.f1175a.writeLock().unlock();
            this.f1178d.post(new RunnableC0394i(arrayList, this.f1177c, th));
        } catch (Throwable th2) {
            this.f1175a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:47:0x007a, B:49:0x0084, B:51:0x0087, B:53:0x008b, B:55:0x009b, B:56:0x009e, B:58:0x00ab, B:61:0x00b3, B:66:0x00d2, B:72:0x00de, B:75:0x00ea, B:76:0x00f4, B:77:0x0103, B:79:0x010a, B:80:0x010f, B:82:0x011a, B:84:0x0121, B:86:0x0125, B:88:0x012b, B:90:0x012f, B:93:0x0137, B:96:0x0143, B:97:0x0148, B:99:0x0156, B:45:0x0070), top: B:124:0x0051 }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:64:0x00ce
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence m765e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.m762b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L19d
            if (r13 < 0) goto L195
            if (r14 < 0) goto L18d
            if (r13 > r14) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L185
            r0 = 0
            if (r12 != 0) goto L1c
            return r0
        L1c:
            int r3 = r12.length()
            if (r13 > r3) goto L24
            r3 = r2
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 == 0) goto L17d
            int r3 = r12.length()
            if (r14 > r3) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto L175
            int r3 = r12.length()
            if (r3 == 0) goto L174
            if (r13 != r14) goto L3c
            goto L174
        L3c:
            androidx.emoji2.text.g r3 = r11.f1179e
            H.a r3 = r3.f1169b
            r3.getClass()
            boolean r4 = r12 instanceof androidx.emoji2.text.C0406u
            if (r4 == 0) goto L4d
            r5 = r12
            androidx.emoji2.text.u r5 = (androidx.emoji2.text.C0406u) r5
            r5.m778a()
        L4d:
            java.lang.Class<androidx.emoji2.text.v> r5 = androidx.emoji2.text.C0407v.class
            if (r4 != 0) goto L70
            boolean r6 = r12 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L56
            goto L70
        L56:
            boolean r6 = r12 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L78
            r6 = r12
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch: java.lang.Throwable -> L6d
            int r7 = r13 + (-1)
            int r8 = r14 + 1
            int r6 = r6.nextSpanTransition(r7, r8, r5)     // Catch: java.lang.Throwable -> L6d
            if (r6 > r14) goto L78
            androidx.emoji2.text.x r0 = new androidx.emoji2.text.x     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L6d
            goto L78
        L6d:
            r13 = move-exception
            goto L16c
        L70:
            androidx.emoji2.text.x r0 = new androidx.emoji2.text.x     // Catch: java.lang.Throwable -> L6d
            r6 = r12
            android.text.Spannable r6 = (android.text.Spannable) r6     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L6d
        L78:
            if (r0 == 0) goto La9
            android.text.Spannable r6 = r0.f1221b     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r5 = r6.getSpans(r13, r14, r5)     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.v[] r5 = (androidx.emoji2.text.C0407v[]) r5     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto La9
            int r6 = r5.length     // Catch: java.lang.Throwable -> L6d
            if (r6 <= 0) goto La9
            int r6 = r5.length     // Catch: java.lang.Throwable -> L6d
            r7 = r1
        L89:
            if (r7 >= r6) goto La9
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L6d
            android.text.Spannable r9 = r0.f1221b     // Catch: java.lang.Throwable -> L6d
            int r9 = r9.getSpanStart(r8)     // Catch: java.lang.Throwable -> L6d
            android.text.Spannable r10 = r0.f1221b     // Catch: java.lang.Throwable -> L6d
            int r10 = r10.getSpanEnd(r8)     // Catch: java.lang.Throwable -> L6d
            if (r9 == r14) goto L9e
            r0.removeSpan(r8)     // Catch: java.lang.Throwable -> L6d
        L9e:
            int r13 = java.lang.Math.min(r9, r13)     // Catch: java.lang.Throwable -> L6d
            int r14 = java.lang.Math.max(r10, r14)     // Catch: java.lang.Throwable -> L6d
            int r7 = r7 + 1
            goto L89
        La9:
            if (r13 == r14) goto L169
            int r5 = r12.length()     // Catch: java.lang.Throwable -> L6d
            if (r13 < r5) goto Lb3
            goto L169
        Lb3:
            androidx.emoji2.text.o r5 = new androidx.emoji2.text.o     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r3.f443b     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.s r6 = (androidx.emoji2.text.C0404s) r6     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r6.f1211c     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.r r6 = (androidx.emoji2.text.C0403r) r6     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6d
            int r6 = java.lang.Character.codePointAt(r12, r13)     // Catch: java.lang.Throwable -> L6d
            r7 = r6
            r6 = r1
            r1 = r0
        Lc7:
            r0 = r13
        Lc8:
            r8 = 33
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2
            if (r13 >= r14) goto L121
            if (r6 >= r9) goto L121
            int r9 = r5.m769a(r7)     // Catch: java.lang.Throwable -> L6d
            if (r9 == r2) goto L10f
            if (r9 == r10) goto L103
            r10 = 3
            if (r9 == r10) goto Lde
            goto Lc8
        Lde:
            androidx.emoji2.text.r r9 = r5.f1192d     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.n r9 = r9.f1208b     // Catch: java.lang.Throwable -> L6d
            boolean r9 = r3.m331q(r12, r0, r13, r9)     // Catch: java.lang.Throwable -> L6d
            if (r9 != 0) goto Lc7
            if (r1 != 0) goto Lf4
            androidx.emoji2.text.x r1 = new androidx.emoji2.text.x     // Catch: java.lang.Throwable -> L6d
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L6d
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L6d
        Lf4:
            androidx.emoji2.text.r r9 = r5.f1192d     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.n r9 = r9.f1208b     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.v r10 = new androidx.emoji2.text.v     // Catch: java.lang.Throwable -> L6d
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L6d
            r1.setSpan(r10, r0, r13, r8)     // Catch: java.lang.Throwable -> L6d
            int r6 = r6 + 1
            goto Lc7
        L103:
            int r8 = java.lang.Character.charCount(r7)     // Catch: java.lang.Throwable -> L6d
            int r13 = r13 + r8
            if (r13 >= r14) goto Lc8
            int r7 = java.lang.Character.codePointAt(r12, r13)     // Catch: java.lang.Throwable -> L6d
            goto Lc8
        L10f:
            int r13 = java.lang.Character.codePointAt(r12, r0)     // Catch: java.lang.Throwable -> L6d
            int r13 = java.lang.Character.charCount(r13)     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + r13
            if (r0 >= r14) goto L11f
            int r13 = java.lang.Character.codePointAt(r12, r0)     // Catch: java.lang.Throwable -> L6d
            r7 = r13
        L11f:
            r13 = r0
            goto Lc8
        L121:
            int r14 = r5.f1189a     // Catch: java.lang.Throwable -> L6d
            if (r14 != r10) goto L154
            androidx.emoji2.text.r r14 = r5.f1191c     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.n r14 = r14.f1208b     // Catch: java.lang.Throwable -> L6d
            if (r14 == 0) goto L154
            int r14 = r5.f1194f     // Catch: java.lang.Throwable -> L6d
            if (r14 > r2) goto L135
            boolean r14 = r5.m771c()     // Catch: java.lang.Throwable -> L6d
            if (r14 == 0) goto L154
        L135:
            if (r6 >= r9) goto L154
            androidx.emoji2.text.r r14 = r5.f1191c     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.n r14 = r14.f1208b     // Catch: java.lang.Throwable -> L6d
            boolean r14 = r3.m331q(r12, r0, r13, r14)     // Catch: java.lang.Throwable -> L6d
            if (r14 != 0) goto L154
            if (r1 != 0) goto L148
            androidx.emoji2.text.x r1 = new androidx.emoji2.text.x     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L6d
        L148:
            androidx.emoji2.text.r r14 = r5.f1191c     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.n r14 = r14.f1208b     // Catch: java.lang.Throwable -> L6d
            androidx.emoji2.text.v r2 = new androidx.emoji2.text.v     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L6d
            r1.setSpan(r2, r0, r13, r8)     // Catch: java.lang.Throwable -> L6d
        L154:
            if (r1 == 0) goto L160
            android.text.Spannable r13 = r1.f1221b     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L15f
            androidx.emoji2.text.u r12 = (androidx.emoji2.text.C0406u) r12
            r12.m779b()
        L15f:
            return r13
        L160:
            if (r4 == 0) goto L174
        L162:
            r13 = r12
            androidx.emoji2.text.u r13 = (androidx.emoji2.text.C0406u) r13
            r13.m779b()
            return r12
        L169:
            if (r4 == 0) goto L174
            goto L162
        L16c:
            if (r4 == 0) goto L173
            androidx.emoji2.text.u r12 = (androidx.emoji2.text.C0406u) r12
            r12.m779b()
        L173:
            throw r13
        L174:
            return r12
        L175:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "end should be < than charSequence length"
            r12.<init>(r13)
            throw r12
        L17d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "start should be < than charSequence length"
            r12.<init>(r13)
            throw r12
        L185:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "start should be <= than end"
            r12.<init>(r13)
            throw r12
        L18d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "end cannot be negative"
            r12.<init>(r13)
            throw r12
        L195:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "start cannot be negative"
            r12.<init>(r13)
            throw r12
        L19d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0396k.m765e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m766f(AbstractC0393h abstractC0393h) {
        AbstractC0503h.m979g(abstractC0393h, "initCallback cannot be null");
        this.f1175a.writeLock().lock();
        try {
            if (this.f1177c == 1 || this.f1177c == 2) {
                this.f1178d.post(new RunnableC0394i(Arrays.asList(abstractC0393h), this.f1177c, null));
            } else {
                this.f1176b.add(abstractC0393h);
            }
            this.f1175a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1175a.writeLock().unlock();
            throw th;
        }
    }
}
