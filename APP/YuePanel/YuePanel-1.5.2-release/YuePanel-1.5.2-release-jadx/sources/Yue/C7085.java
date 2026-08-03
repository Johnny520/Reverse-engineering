package Yue;

import Yue.C3630;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7085 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1161 f21404 = new C1161(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f21405 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f21406 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f21407;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f21408;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long f21409 = 32;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public RandomAccessFile f2666;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public InterfaceC7506 f2667;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f21410;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C3630 f21411;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long f21412;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public Thread f21413;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f21414;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f21415;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f21416;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f21417;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۧ$ۥ */
    public static final class C1161 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۣۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1161(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C7085 m3373(@InterfaceC6399 File file, @InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630, long j) throws IOException {
            C5499.m17103(file, "file");
            C5499.m17103(interfaceC7506, "upstream");
            C5499.m17103(c3630, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            C7085 c7085 = new C7085(randomAccessFile, interfaceC7506, 0L, c3630, j, null);
            randomAccessFile.setLength(0L);
            c7085.m22114(C7085.f21408, -1L, -1L);
            return c7085;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C7085 m3374(@InterfaceC6399 File file) throws IOException {
            C5499.m17103(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            C5499.m17102(channel, "randomAccessFile.channel");
            C4812 c4812 = new C4812(channel);
            C3600 c3600 = new C3600();
            c4812.m1719(0L, c3600, 32L);
            if (!C5499.m17094(c3600.mo9612(r1.m9852()), C7085.f21407)) {
                throw new IOException("unreadable cache file");
            }
            long j = c3600.readLong();
            long j2 = c3600.readLong();
            C3600 c36002 = new C3600();
            c4812.m1719(j + 32, c36002, j2);
            return new C7085(randomAccessFile, null, j, c36002.mo9648(), 0L, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1161() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۧ$ۥ۟ */
    @InterfaceC7507({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class C1162 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C7827 f21418 = new C7827();

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6489
        public C4812 f21419;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public long f21420;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C1162() {
            RandomAccessFile randomAccessFileM22099 = C7085.this.m22099();
            C5499.m17100(randomAccessFileM22099);
            FileChannel channel = randomAccessFileM22099.getChannel();
            C5499.m17102(channel, "file!!.channel");
            this.f21419 = new C4812(channel);
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f21419 == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f21419 = null;
            C7085 c7085 = C7085.this;
            synchronized (c7085) {
                try {
                    c7085.m22110(c7085.m22100() - 1);
                    if (c7085.m22100() == 0) {
                        RandomAccessFile randomAccessFileM22099 = c7085.m22099();
                        c7085.m22109(null);
                        randomAccessFile = randomAccessFileM22099;
                    }
                    C8107 c8107 = C8107.f3222;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                C8158.m26844(randomAccessFile);
            }
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return this.f21418;
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            char c;
            C5499.m17103(c3600, "sink");
            if (this.f21419 == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C7085 c7085 = C7085.this;
            synchronized (c7085) {
                while (true) {
                    try {
                        if (this.f21420 != c7085.m22103()) {
                            long jM22103 = c7085.m22103() - c7085.m22096().m9684();
                            if (this.f21420 >= jM22103) {
                                long jMin = Math.min(j, c7085.m22103() - this.f21420);
                                c7085.m22096().m9620(c3600, this.f21420 - jM22103, jMin);
                                this.f21420 += jMin;
                                return jMin;
                            }
                            c = 2;
                        } else if (!c7085.m22098()) {
                            if (c7085.m22104() == null) {
                                c7085.m22113(Thread.currentThread());
                                c = 1;
                                break;
                            }
                            this.f21418.m24848(c7085);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c == 2) {
                    long jMin2 = Math.min(j, C7085.this.m22103() - this.f21420);
                    C4812 c4812 = this.f21419;
                    C5499.m17100(c4812);
                    c4812.m1719(this.f21420 + 32, c3600, jMin2);
                    this.f21420 += jMin2;
                    return jMin2;
                }
                try {
                    InterfaceC7506 interfaceC7506M22101 = C7085.this.m22101();
                    C5499.m17100(interfaceC7506M22101);
                    long jMo9103 = interfaceC7506M22101.mo9103(C7085.this.m22102(), C7085.this.m22097());
                    if (jMo9103 == -1) {
                        C7085 c70852 = C7085.this;
                        c70852.m3372(c70852.m22103());
                        C7085 c70853 = C7085.this;
                        synchronized (c70853) {
                            c70853.m22113(null);
                            C5499.m17101(c70853, "null cannot be cast to non-null type java.lang.Object");
                            c70853.notifyAll();
                            C8107 c8107 = C8107.f3222;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(jMo9103, j);
                    C7085.this.m22102().m9620(c3600, 0L, jMin3);
                    this.f21420 += jMin3;
                    C4812 c48122 = this.f21419;
                    C5499.m17100(c48122);
                    c48122.m1720(C7085.this.m22103() + 32, C7085.this.m22102().clone(), jMo9103);
                    C7085 c70854 = C7085.this;
                    synchronized (c70854) {
                        try {
                            c70854.m22096().mo9102(c70854.m22102(), jMo9103);
                            if (c70854.m22096().m9684() > c70854.m22097()) {
                                c70854.m22096().skip(c70854.m22096().m9684() - c70854.m22097());
                            }
                            c70854.m22112(c70854.m22103() + jMo9103);
                            C8107 c81072 = C8107.f3222;
                        } finally {
                        }
                    }
                    C7085 c70855 = C7085.this;
                    synchronized (c70855) {
                        c70855.m22113(null);
                        C5499.m17101(c70855, "null cannot be cast to non-null type java.lang.Object");
                        c70855.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th2) {
                    C7085 c70856 = C7085.this;
                    synchronized (c70856) {
                        c70856.m22113(null);
                        C5499.m17101(c70856, "null cannot be cast to non-null type java.lang.Object");
                        c70856.notifyAll();
                        C8107 c81073 = C8107.f3222;
                        throw th2;
                    }
                }
            }
        }
    }

    static {
        C3630.C0198 c0198 = C3630.f6370;
        f21407 = c0198.m9876("OkHttp cache v1\n");
        f21408 = c0198.m9876("OkHttp DIRTY :(\n");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.io.RandomAccessFile), (r2v0 Yue.ۥۣۢ۟ۦ), (r3v0 long), (r5v0 Yue.ۥۣ۟ۥۤ), (r6v0 long) A[MD:(java.io.RandomAccessFile, Yue.ۥۣۢ۟ۦ, long, Yue.ۥۣ۟ۥۤ, long):void (m)] (LINE:1) call: Yue.ۥۡۦۣۧ.<init>(java.io.RandomAccessFile, Yue.ۥۣۢ۟ۦ, long, Yue.ۥۣ۟ۥۤ, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C7085(RandomAccessFile randomAccessFile, InterfaceC7506 interfaceC7506, long j, C3630 c3630, long j2, C4335 c4335) {
        this(randomAccessFile, interfaceC7506, j, c3630, j2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3372(long j) throws IOException {
        m22115(j);
        RandomAccessFile randomAccessFile = this.f2666;
        C5499.m17100(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        m22114(f21407, j, this.f21411.m9852());
        RandomAccessFile randomAccessFile2 = this.f2666;
        C5499.m17100(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f21415 = true;
            C8107 c8107 = C8107.f3222;
        }
        InterfaceC7506 interfaceC7506 = this.f2667;
        if (interfaceC7506 != null) {
            C8158.m26844(interfaceC7506);
        }
        this.f2667 = null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C3600 m22096() {
        return this.f21416;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long m22097() {
        return this.f21412;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m22098() {
        return this.f21415;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final RandomAccessFile m22099() {
        return this.f2666;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m22100() {
        return this.f21417;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final InterfaceC7506 m22101() {
        return this.f2667;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C3600 m22102() {
        return this.f21414;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final long m22103() {
        return this.f21410;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Thread m22104() {
        return this.f21413;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m22105() {
        return this.f2666 == null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C3630 m22106() {
        return this.f21411;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final InterfaceC7506 m22107() {
        synchronized (this) {
            if (this.f2666 == null) {
                return null;
            }
            this.f21417++;
            return new C1162();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m22108(boolean z) {
        this.f21415 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m22109(@InterfaceC6489 RandomAccessFile randomAccessFile) {
        this.f2666 = randomAccessFile;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m22110(int i) {
        this.f21417 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m22111(@InterfaceC6489 InterfaceC7506 interfaceC7506) {
        this.f2667 = interfaceC7506;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m22112(long j) {
        this.f21410 = j;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m22113(@InterfaceC6489 Thread thread) {
        this.f21413 = thread;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m22114(C3630 c3630, long j, long j2) throws IOException {
        C3600 c3600 = new C3600();
        c3600.mo9668(c3630);
        c3600.writeLong(j);
        c3600.writeLong(j2);
        if (c3600.m9684() != 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.f2666;
        C5499.m17100(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C5499.m17102(channel, "file!!.channel");
        new C4812(channel).m1720(0L, c3600, 32L);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m22115(long j) throws IOException {
        C3600 c3600 = new C3600();
        c3600.mo9668(this.f21411);
        RandomAccessFile randomAccessFile = this.f2666;
        C5499.m17100(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C5499.m17102(channel, "file!!.channel");
        new C4812(channel).m1720(32 + j, c3600, this.f21411.m9852());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7085(RandomAccessFile randomAccessFile, InterfaceC7506 interfaceC7506, long j, C3630 c3630, long j2) {
        this.f2666 = randomAccessFile;
        this.f2667 = interfaceC7506;
        this.f21410 = j;
        this.f21411 = c3630;
        this.f21412 = j2;
        this.f21414 = new C3600();
        this.f21415 = this.f2667 == null;
        this.f21416 = new C3600();
    }
}
