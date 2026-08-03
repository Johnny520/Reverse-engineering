package Yue;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class AbstractC4809 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f10816;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f10817;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f10818;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final ReentrantLock f10819 = C8582.m4552();

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۧ$ۥ */
    @InterfaceC7507({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    public static final class C0495 implements InterfaceC7472 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC4809 f10820;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public long f10821;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f10822;

        public C0495(@InterfaceC6399 AbstractC4809 abstractC4809, long j) {
            C5499.m17103(abstractC4809, "fileHandle");
            this.f10820 = abstractC4809;
            this.f10821 = j;
        }

        @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f10822) {
                return;
            }
            this.f10822 = true;
            ReentrantLock reentrantLockM14552 = this.f10820.m14552();
            reentrantLockM14552.lock();
            try {
                AbstractC4809 abstractC4809 = this.f10820;
                abstractC4809.f10818--;
                if (this.f10820.f10818 == 0 && this.f10820.f10817) {
                    C8107 c8107 = C8107.f3222;
                    reentrantLockM14552.unlock();
                    this.f10820.mo14556();
                }
            } finally {
                reentrantLockM14552.unlock();
            }
        }

        @Override // Yue.InterfaceC7472, java.io.Flushable
        public void flush() throws IOException {
            if (!(!this.f10822)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f10820.mo14557();
        }

        @Override // Yue.InterfaceC7472
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo516() {
            return C7827.f23434;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m1713() {
            return this.f10822;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AbstractC4809 m14574() {
            return this.f10820;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long m14575() {
            return this.f10821;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m14576(boolean z) {
            this.f10822 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m14577(long j) {
            this.f10821 = j;
        }

        @Override // Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            if (!(!this.f10822)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f10820.m14573(this.f10821, c3600, j);
            this.f10821 += j;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۧ$ۥ۟ */
    @InterfaceC7507({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    public static final class C0496 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC4809 f10823;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public long f10824;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f10825;

        public C0496(@InterfaceC6399 AbstractC4809 abstractC4809, long j) {
            C5499.m17103(abstractC4809, "fileHandle");
            this.f10823 = abstractC4809;
            this.f10824 = j;
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f10825) {
                return;
            }
            this.f10825 = true;
            ReentrantLock reentrantLockM14552 = this.f10823.m14552();
            reentrantLockM14552.lock();
            try {
                AbstractC4809 abstractC4809 = this.f10823;
                abstractC4809.f10818--;
                if (this.f10823.f10818 == 0 && this.f10823.f10817) {
                    C8107 c8107 = C8107.f3222;
                    reentrantLockM14552.unlock();
                    this.f10823.mo14556();
                }
            } finally {
                reentrantLockM14552.unlock();
            }
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return C7827.f23434;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m1714() {
            return this.f10825;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AbstractC4809 m14578() {
            return this.f10823;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long m14579() {
            return this.f10824;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m14580(boolean z) {
            this.f10825 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m14581(long j) {
            this.f10824 = j;
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            if (!(!this.f10825)) {
                throw new IllegalStateException("closed".toString());
            }
            long jM14564 = this.f10823.m14564(this.f10824, c3600, j);
            if (jM14564 != -1) {
                this.f10824 += jM14564;
            }
            return jM14564;
        }
    }

    public AbstractC4809(boolean z) {
        this.f10816 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7472 m14549(AbstractC4809 abstractC4809, long j, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return abstractC4809.m14568(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7506 m14550(AbstractC4809 abstractC4809, long j, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return abstractC4809.m14570(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (this.f10817) {
                return;
            }
            this.f10817 = true;
            if (this.f10818 != 0) {
                return;
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            mo14556();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() throws IOException {
        if (!this.f10816) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            mo14557();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC7472 m14551() throws IOException {
        return m14568(m14569());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final ReentrantLock m14552() {
        return this.f10819;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m14553() {
        return this.f10816;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final long m14554(@InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException {
        long jM9684;
        C5499.m17103(interfaceC7472, "sink");
        if (interfaceC7472 instanceof C7022) {
            C7022 c7022 = (C7022) interfaceC7472;
            jM9684 = c7022.f21162.m9684();
            interfaceC7472 = c7022.f21161;
        } else {
            jM9684 = 0;
        }
        if (!(interfaceC7472 instanceof C0495) || ((C0495) interfaceC7472).m14574() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        C0495 c0495 = (C0495) interfaceC7472;
        if (!c0495.m1713()) {
            return c0495.m14575() + jM9684;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long m14555(@InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException {
        long jM9684;
        C5499.m17103(interfaceC7506, "source");
        if (interfaceC7506 instanceof C7023) {
            C7023 c7023 = (C7023) interfaceC7506;
            jM9684 = c7023.f21166.m9684();
            interfaceC7506 = c7023.f21165;
        } else {
            jM9684 = 0;
        }
        if (!(interfaceC7506 instanceof C0496) || ((C0496) interfaceC7506).m14578() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        C0496 c0496 = (C0496) interfaceC7506;
        if (!c0496.m1714()) {
            return c0496.m14579() - jM9684;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract void mo14556() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public abstract void mo14557() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public abstract int mo14558(long j, @InterfaceC6399 byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public abstract void mo14559(long j) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract long mo14560() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public abstract void mo14561(long j, @InterfaceC6399 byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int m14562(long j, @InterfaceC6399 byte[] bArr, int i, int i2) throws IOException {
        C5499.m17103(bArr, "array");
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            return mo14558(j, bArr, i, i2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final long m14563(long j, @InterfaceC6399 C3600 c3600, long j2) throws IOException {
        C5499.m17103(c3600, "sink");
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            return m14564(j, c3600, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final long m14564(long j, C3600 c3600, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = j2 + j;
        long j4 = j;
        while (true) {
            if (j4 >= j3) {
                break;
            }
            C7275 c7275M9687 = c3600.m9687(1);
            int iMo14558 = mo14558(j4, c7275M9687.f2778, c7275M9687.f21950, (int) Math.min(j3 - j4, 8192 - r7));
            if (iMo14558 == -1) {
                if (c7275M9687.f2779 == c7275M9687.f21950) {
                    c3600.f6209 = c7275M9687.m3540();
                    C7278.m22744(c7275M9687);
                }
                if (j == j4) {
                    return -1L;
                }
            } else {
                c7275M9687.f21950 += iMo14558;
                long j5 = iMo14558;
                j4 += j5;
                c3600.m9680(c3600.m9684() + j5);
            }
        }
        return j4 - j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m14565(@InterfaceC6399 InterfaceC7472 interfaceC7472, long j) throws IOException {
        C5499.m17103(interfaceC7472, "sink");
        if (!(interfaceC7472 instanceof C7022)) {
            if (!(interfaceC7472 instanceof C0495) || ((C0495) interfaceC7472).m14574() != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
            }
            C0495 c0495 = (C0495) interfaceC7472;
            if (!(!c0495.m1713())) {
                throw new IllegalStateException("closed".toString());
            }
            c0495.m14577(j);
            return;
        }
        C7022 c7022 = (C7022) interfaceC7472;
        InterfaceC7472 interfaceC74722 = c7022.f21161;
        if (!(interfaceC74722 instanceof C0495) || ((C0495) interfaceC74722).m14574() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        C0495 c04952 = (C0495) interfaceC74722;
        if (!(!c04952.m1713())) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.mo9614();
        c04952.m14577(j);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m14566(@InterfaceC6399 InterfaceC7506 interfaceC7506, long j) throws IOException {
        C5499.m17103(interfaceC7506, "source");
        if (!(interfaceC7506 instanceof C7023)) {
            if (!(interfaceC7506 instanceof C0496) || ((C0496) interfaceC7506).m14578() != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle".toString());
            }
            C0496 c0496 = (C0496) interfaceC7506;
            if (!(!c0496.m1714())) {
                throw new IllegalStateException("closed".toString());
            }
            c0496.m14581(j);
            return;
        }
        C7023 c7023 = (C7023) interfaceC7506;
        InterfaceC7506 interfaceC75062 = c7023.f21165;
        if (!(interfaceC75062 instanceof C0496) || ((C0496) interfaceC75062).m14578() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        C0496 c04962 = (C0496) interfaceC75062;
        if (!(!c04962.m1714())) {
            throw new IllegalStateException("closed".toString());
        }
        long jM9684 = c7023.f21166.m9684();
        long jM14579 = j - (c04962.m14579() - jM9684);
        if (0 <= jM14579 && jM14579 < jM9684) {
            c7023.skip(jM14579);
        } else {
            c7023.f21166.m9603();
            c04962.m14581(j);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m14567(long j) throws IOException {
        if (!this.f10816) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            mo14559(j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC7472 m14568(long j) throws IOException {
        if (!this.f10816) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f10818++;
            reentrantLock.unlock();
            return new C0495(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final long m14569() throws IOException {
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            return mo14560();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final InterfaceC7506 m14570(long j) throws IOException {
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f10818++;
            reentrantLock.unlock();
            return new C0496(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m14571(long j, @InterfaceC6399 C3600 c3600, long j2) throws IOException {
        C5499.m17103(c3600, "source");
        if (!this.f10816) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            m14573(j, c3600, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m14572(long j, @InterfaceC6399 byte[] bArr, int i, int i2) throws IOException {
        C5499.m17103(bArr, "array");
        if (!this.f10816) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f10819;
        reentrantLock.lock();
        try {
            if (!(!this.f10817)) {
                throw new IllegalStateException("closed".toString());
            }
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            mo14561(j, bArr, i, i2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final void m14573(long j, C3600 c3600, long j2) throws IOException {
        C2963.m5677(c3600.m9684(), 0L, j2);
        long j3 = j2 + j;
        while (j < j3) {
            C7275 c7275 = c3600.f6209;
            C5499.m17100(c7275);
            int iMin = (int) Math.min(j3 - j, c7275.f21950 - c7275.f2779);
            mo14561(j, c7275.f2778, c7275.f2779, iMin);
            c7275.f2779 += iMin;
            long j4 = iMin;
            j += j4;
            c3600.m9680(c3600.m9684() - j4);
            if (c7275.f2779 == c7275.f21950) {
                c3600.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            }
        }
    }
}
