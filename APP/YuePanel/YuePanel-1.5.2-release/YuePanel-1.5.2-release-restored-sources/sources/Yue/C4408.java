package Yue;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
public final class C4408 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0401 f9081 = new C0401(null);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9082 = "journal";

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9083 = "journal.tmp";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9084 = "journal.bkp";

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9085 = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9086 = "1";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    @InterfaceC5568
    public static final long f9087 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7075 f9088 = new C7075("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9089 = "CLEAN";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9090 = "DIRTY";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9091 = "REMOVE";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f9092 = "READ";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4817 f9093;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final File f9094;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f9095;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f9096;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public long f9097;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final File f9098;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final File f9099;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public final File f9100;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public long f9101;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC3603 f9102;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final LinkedHashMap<String, C4410> f9103;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f9104;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f9105;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f9106;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f9107;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f9108;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f9109;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f9110;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public long f9111;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7731 f9112;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C4412 f9113;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ */
    public static final class C0401 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠۟ۡۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0401(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0401() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟ */
    public final class C0402 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final C4410 f875;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public final boolean[] f876;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f9114;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C4408 f9115;

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C4409 extends AbstractC5673 implements InterfaceC5124<IOException, C8107> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C4408 f9116;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C0402 f9117;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4409(C4408 c4408, C0402 c0402) {
                super(1);
                this.f9116 = c4408;
                this.f9117 = c0402;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // Yue.InterfaceC5124
            public /* bridge */ /* synthetic */ C8107 invoke(IOException iOException) {
                m12801(iOException);
                return C8107.f3222;
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final void m12801(@InterfaceC6399 IOException iOException) {
                C5499.m17103(iOException, "it");
                C4408 c4408 = this.f9116;
                C0402 c0402 = this.f9117;
                synchronized (c4408) {
                    c0402.m12796();
                    C8107 c8107 = C8107.f3222;
                }
            }
        }

        public C0402(@InterfaceC6399 C4408 c4408, C4410 c4410) {
            C5499.m17103(c4410, "entry");
            this.f9115 = c4408;
            this.f875 = c4410;
            this.f876 = c4410.m12806() ? null : new boolean[c4408.m12778()];
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m1359() throws IOException {
            C4408 c4408 = this.f9115;
            synchronized (c4408) {
                try {
                    if (!(!this.f9114)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (C5499.m17094(this.f875.m1362(), this)) {
                        c4408.m12767(this, false);
                    }
                    this.f9114 = true;
                    C8107 c8107 = C8107.f3222;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m1360() throws IOException {
            C4408 c4408 = this.f9115;
            synchronized (c4408) {
                try {
                    if (!(!this.f9114)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (C5499.m17094(this.f875.m1362(), this)) {
                        c4408.m12767(this, true);
                    }
                    this.f9114 = true;
                    C8107 c8107 = C8107.f3222;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m12796() throws IOException {
            if (C5499.m17094(this.f875.m1362(), this)) {
                if (this.f9115.f9106) {
                    this.f9115.m12767(this, false);
                } else {
                    this.f875.m12816(true);
                }
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C4410 m12797() {
            return this.f875;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean[] m12798() {
            return this.f876;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final InterfaceC7472 m12799(int i) {
            C4408 c4408 = this.f9115;
            synchronized (c4408) {
                if (!(!this.f9114)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!C5499.m17094(this.f875.m1362(), this)) {
                    return C6542.m20829();
                }
                if (!this.f875.m12806()) {
                    boolean[] zArr = this.f876;
                    C5499.m17100(zArr);
                    zArr[i] = true;
                }
                try {
                    return new C4794(c4408.m12775().mo1730(this.f875.m12802().get(i)), new C4409(c4408, this));
                } catch (FileNotFoundException unused) {
                    return C6542.m20829();
                }
            }
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final InterfaceC7506 m12800(int i) {
            C4408 c4408 = this.f9115;
            synchronized (c4408) {
                if (!(!this.f9114)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                InterfaceC7506 interfaceC7506Mo1729 = null;
                if (!this.f875.m12806() || !C5499.m17094(this.f875.m1362(), this) || this.f875.m12808()) {
                    return null;
                }
                try {
                    interfaceC7506Mo1729 = c4408.m12775().mo1729(this.f875.m1361().get(i));
                } catch (FileNotFoundException unused) {
                }
                return interfaceC7506Mo1729;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class C4410 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final String f877;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final long[] f878;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<File> f9118;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<File> f9119;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f9120;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f9121;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6489
        public C0402 f9122;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f9123;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public long f9124;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final /* synthetic */ C4408 f9125;

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟۟$ۥ */
        public static final class C0403 extends AbstractC5068 {

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public boolean f9126;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C4408 f9127;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ C4410 f9128;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0403(InterfaceC7506 interfaceC7506, C4408 c4408, C4410 c4410) {
                super(interfaceC7506);
                this.f9127 = c4408;
                this.f9128 = c4410;
            }

            @Override // Yue.AbstractC5068, Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.f9126) {
                    return;
                }
                this.f9126 = true;
                C4408 c4408 = this.f9127;
                C4410 c4410 = this.f9128;
                synchronized (c4408) {
                    try {
                        c4410.m12813(c4410.m12805() - 1);
                        if (c4410.m12805() == 0 && c4410.m12808()) {
                            c4408.m12788(c4410);
                        }
                        C8107 c8107 = C8107.f3222;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C4410(@InterfaceC6399 C4408 c4408, String str) {
            C5499.m17103(str, C6659.f17103);
            this.f9125 = c4408;
            this.f877 = str;
            this.f878 = new long[c4408.m12778()];
            this.f9118 = new ArrayList();
            this.f9119 = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            int length = sb.length();
            int iM12778 = c4408.m12778();
            for (int i = 0; i < iM12778; i++) {
                sb.append(i);
                this.f9118.add(new File(this.f9125.m12774(), sb.toString()));
                sb.append(".tmp");
                this.f9119.add(new File(this.f9125.m12774(), sb.toString()));
                sb.setLength(length);
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final List<File> m1361() {
            return this.f9118;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0402 m1362() {
            return this.f9122;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final List<File> m12802() {
            return this.f9119;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String m12803() {
            return this.f877;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final long[] m12804() {
            return this.f878;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int m12805() {
            return this.f9123;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m12806() {
            return this.f9120;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final long m12807() {
            return this.f9124;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m12808() {
            return this.f9121;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final Void m12809(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final InterfaceC7506 m12810(int i) throws FileNotFoundException {
            InterfaceC7506 interfaceC7506Mo1729 = this.f9125.m12775().mo1729(this.f9118.get(i));
            if (this.f9125.f9106) {
                return interfaceC7506Mo1729;
            }
            this.f9123++;
            return new C0403(interfaceC7506Mo1729, this.f9125, this);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m12811(@InterfaceC6489 C0402 c0402) {
            this.f9122 = c0402;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m12812(@InterfaceC6399 List<String> list) throws IOException {
            C5499.m17103(list, "strings");
            if (list.size() != this.f9125.m12778()) {
                m12809(list);
                throw new C5667();
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.f878[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                m12809(list);
                throw new C5667();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m12813(int i) {
            this.f9123 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m12814(boolean z) {
            this.f9120 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m12815(long j) {
            this.f9124 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m12816(boolean z) {
            this.f9121 = z;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final C4411 m12817() {
            C4408 c4408 = this.f9125;
            if (C8158.f24182 && !Thread.holdsLock(c4408)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c4408);
            }
            if (!this.f9120) {
                return null;
            }
            if (!this.f9125.f9106 && (this.f9122 != null || this.f9121)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f878.clone();
            try {
                int iM12778 = this.f9125.m12778();
                for (int i = 0; i < iM12778; i++) {
                    arrayList.add(m12810(i));
                }
                return new C4411(this.f9125, this.f877, this.f9124, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C8158.m26844((InterfaceC7506) it.next());
                }
                try {
                    this.f9125.m12788(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final void m12818(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException {
            C5499.m17103(interfaceC3603, "writer");
            for (long j : this.f878) {
                interfaceC3603.writeByte(32).mo9671(j);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C4411 implements Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final String f9129;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final long f9130;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final List<InterfaceC7506> f9131;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        public final long[] f9132;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ C4408 f9133;

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends Yue.ۥۣۢ۟ۦ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4411(@InterfaceC6399 C4408 c4408, String str, @InterfaceC6399 long j, @InterfaceC6399 List<? extends InterfaceC7506> list, long[] jArr) {
            C5499.m17103(str, C6659.f17103);
            C5499.m17103(list, "sources");
            C5499.m17103(jArr, "lengths");
            this.f9133 = c4408;
            this.f9129 = str;
            this.f9130 = j;
            this.f9131 = list;
            this.f9132 = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<InterfaceC7506> it = this.f9131.iterator();
            while (it.hasNext()) {
                C8158.m26844(it.next());
            }
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0402 m1363() throws IOException {
            return this.f9133.m12770(this.f9129, this.f9130);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long m12819(int i) {
            return this.f9132[i];
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final InterfaceC7506 m12820(int i) {
            return this.f9131.get(i);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final String m12821() {
            return this.f9129;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4412 extends AbstractC7724 {
        public C4412(String str) {
            super(str, false, 2, null);
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long mo12822() {
            C4408 c4408 = C4408.this;
            synchronized (c4408) {
                if (!c4408.f9107 || c4408.m12773()) {
                    return -1L;
                }
                try {
                    c4408.m12794();
                } catch (IOException unused) {
                    c4408.f9109 = true;
                }
                try {
                    if (c4408.m12781()) {
                        c4408.m12786();
                        c4408.f9104 = 0;
                    }
                } catch (IOException unused2) {
                    c4408.f9110 = true;
                    c4408.f9102 = C6542.m20830(C6542.m20829());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n*L\n304#1:1066,4\n*E\n"})
    public static final class C4413 extends AbstractC5673 implements InterfaceC5124<IOException, C8107> {
        public C4413() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(IOException iOException) {
            m12823(iOException);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m12823(@InterfaceC6399 IOException iOException) {
            C5499.m17103(iOException, "it");
            C4408 c4408 = C4408.this;
            if (!C8158.f24182 || Thread.holdsLock(c4408)) {
                C4408.this.f9105 = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c4408);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"})
    public static final class C4414 implements Iterator<C4411>, InterfaceC5594 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<C4410> f9136;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6489
        public C4411 f9137;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public C4411 f9138;

        public C4414() {
            Iterator<C4410> it = new ArrayList(C4408.this.m12776().values()).iterator();
            C5499.m17102(it, "ArrayList(lruEntries.values).iterator()");
            this.f9136 = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C4411 c4411M12817;
            if (this.f9137 != null) {
                return true;
            }
            C4408 c4408 = C4408.this;
            synchronized (c4408) {
                if (c4408.m12773()) {
                    return false;
                }
                while (this.f9136.hasNext()) {
                    C4410 next = this.f9136.next();
                    if (next != null && (c4411M12817 = next.m12817()) != null) {
                        this.f9137 = c4411M12817;
                        return true;
                    }
                }
                C8107 c8107 = C8107.f3222;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C4411 c4411 = this.f9138;
            if (c4411 == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                C4408.this.m12787(c4411.m12821());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f9138 = null;
                throw th;
            }
            this.f9138 = null;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C4411 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C4411 c4411 = this.f9137;
            this.f9138 = c4411;
            this.f9137 = null;
            C5499.m17100(c4411);
            return c4411;
        }
    }

    public C4408(@InterfaceC6399 InterfaceC4817 interfaceC4817, @InterfaceC6399 File file, int i, int i2, long j, @InterfaceC6399 C7733 c7733) {
        C5499.m17103(interfaceC4817, "fileSystem");
        C5499.m17103(file, "directory");
        C5499.m17103(c7733, "taskRunner");
        this.f9093 = interfaceC4817;
        this.f9094 = file;
        this.f9095 = i;
        this.f9096 = i2;
        this.f9097 = j;
        this.f9103 = new LinkedHashMap<>(0, 0.75f, true);
        this.f9112 = c7733.m24605();
        this.f9113 = new C4412(C8158.f24183 + " Cache");
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f9098 = new File(file, f9082);
        this.f9099 = new File(file, f9083);
        this.f9100 = new File(file, f9084);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ C0402 m12765(C4408 c4408, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = f9087;
        }
        return c4408.m12770(str, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        C0402 c0402M1362;
        try {
            if (this.f9107 && !this.f9108) {
                Collection<C4410> collectionValues = this.f9103.values();
                C5499.m17102(collectionValues, "lruEntries.values");
                for (C4410 c4410 : (C4410[]) collectionValues.toArray(new C4410[0])) {
                    if (c4410.m1362() != null && (c0402M1362 = c4410.m1362()) != null) {
                        c0402M1362.m12796();
                    }
                }
                m12794();
                InterfaceC3603 interfaceC3603 = this.f9102;
                C5499.m17100(interfaceC3603);
                interfaceC3603.close();
                this.f9102 = null;
                this.f9108 = true;
                return;
            }
            this.f9108 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f9107) {
            m12766();
            m12794();
            InterfaceC3603 interfaceC3603 = this.f9102;
            C5499.m17100(interfaceC3603);
            interfaceC3603.flush();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final synchronized void m12766() {
        if (!(!this.f9108)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final synchronized void m12767(@InterfaceC6399 C0402 c0402, boolean z) throws IOException {
        C5499.m17103(c0402, "editor");
        C4410 c4410M12797 = c0402.m12797();
        if (!C5499.m17094(c4410M12797.m1362(), c0402)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z && !c4410M12797.m12806()) {
            int i = this.f9096;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArrM12798 = c0402.m12798();
                C5499.m17100(zArrM12798);
                if (!zArrM12798[i2]) {
                    c0402.m1359();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.f9093.mo14622(c4410M12797.m12802().get(i2))) {
                    c0402.m1359();
                    return;
                }
            }
        }
        int i3 = this.f9096;
        for (int i4 = 0; i4 < i3; i4++) {
            File file = c4410M12797.m12802().get(i4);
            if (!z || c4410M12797.m12808()) {
                this.f9093.mo14624(file);
            } else if (this.f9093.mo14622(file)) {
                File file2 = c4410M12797.m1361().get(i4);
                this.f9093.mo14623(file, file2);
                long j = c4410M12797.m12804()[i4];
                long jMo14626 = this.f9093.mo14626(file2);
                c4410M12797.m12804()[i4] = jMo14626;
                this.f9101 = (this.f9101 - j) + jMo14626;
            }
        }
        c4410M12797.m12811(null);
        if (c4410M12797.m12808()) {
            m12788(c4410M12797);
            return;
        }
        this.f9104++;
        InterfaceC3603 interfaceC3603 = this.f9102;
        C5499.m17100(interfaceC3603);
        if (c4410M12797.m12806() || z) {
            c4410M12797.m12814(true);
            interfaceC3603.mo9638(f9089).writeByte(32);
            interfaceC3603.mo9638(c4410M12797.m12803());
            c4410M12797.m12818(interfaceC3603);
            interfaceC3603.writeByte(10);
            if (z) {
                long j2 = this.f9111;
                this.f9111 = 1 + j2;
                c4410M12797.m12815(j2);
            }
        } else {
            this.f9103.remove(c4410M12797.m12803());
            interfaceC3603.mo9638(f9091).writeByte(32);
            interfaceC3603.mo9638(c4410M12797.m12803());
            interfaceC3603.writeByte(10);
        }
        interfaceC3603.flush();
        if (this.f9101 > this.f9097 || m12781()) {
            C7731.m24579(this.f9112, this.f9113, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m12768() throws IOException {
        close();
        this.f9093.mo14621(this.f9094);
    }

    @InterfaceC5573
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final C0402 m12769(@InterfaceC6399 String str) throws IOException {
        C5499.m17103(str, C6659.f17103);
        return m12765(this, str, 0L, 2, null);
    }

    @InterfaceC5573
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final synchronized C0402 m12770(@InterfaceC6399 String str, long j) throws IOException {
        C5499.m17103(str, C6659.f17103);
        m12779();
        m12766();
        m12795(str);
        C4410 c4410 = this.f9103.get(str);
        if (j != f9087 && (c4410 == null || c4410.m12807() != j)) {
            return null;
        }
        if ((c4410 != null ? c4410.m1362() : null) != null) {
            return null;
        }
        if (c4410 != null && c4410.m12805() != 0) {
            return null;
        }
        if (!this.f9109 && !this.f9110) {
            InterfaceC3603 interfaceC3603 = this.f9102;
            C5499.m17100(interfaceC3603);
            interfaceC3603.mo9638(f9090).writeByte(32).mo9638(str).writeByte(10);
            interfaceC3603.flush();
            if (this.f9105) {
                return null;
            }
            if (c4410 == null) {
                c4410 = new C4410(this, str);
                this.f9103.put(str, c4410);
            }
            C0402 c0402 = new C0402(this, c4410);
            c4410.m12811(c0402);
            return c0402;
        }
        C7731.m24579(this.f9112, this.f9113, 0L, 2, null);
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final synchronized void m12771() throws IOException {
        try {
            m12779();
            Collection<C4410> collectionValues = this.f9103.values();
            C5499.m17102(collectionValues, "lruEntries.values");
            for (C4410 c4410 : (C4410[]) collectionValues.toArray(new C4410[0])) {
                C5499.m17102(c4410, "entry");
                m12788(c4410);
            }
            this.f9109 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final synchronized C4411 m12772(@InterfaceC6399 String str) throws IOException {
        C5499.m17103(str, C6659.f17103);
        m12779();
        m12766();
        m12795(str);
        C4410 c4410 = this.f9103.get(str);
        if (c4410 == null) {
            return null;
        }
        C4411 c4411M12817 = c4410.m12817();
        if (c4411M12817 == null) {
            return null;
        }
        this.f9104++;
        InterfaceC3603 interfaceC3603 = this.f9102;
        C5499.m17100(interfaceC3603);
        interfaceC3603.mo9638(f9092).writeByte(32).mo9638(str).writeByte(10);
        if (m12781()) {
            C7731.m24579(this.f9112, this.f9113, 0L, 2, null);
        }
        return c4411M12817;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m12773() {
        return this.f9108;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final File m12774() {
        return this.f9094;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final InterfaceC4817 m12775() {
        return this.f9093;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final LinkedHashMap<String, C4410> m12776() {
        return this.f9103;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final synchronized long m12777() {
        return this.f9097;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m12778() {
        return this.f9096;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final synchronized void m12779() throws IOException {
        try {
            if (C8158.f24182 && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f9107) {
                return;
            }
            if (this.f9093.mo14622(this.f9100)) {
                if (this.f9093.mo14622(this.f9098)) {
                    this.f9093.mo14624(this.f9100);
                } else {
                    this.f9093.mo14623(this.f9100, this.f9098);
                }
            }
            this.f9106 = C8158.m26868(this.f9093, this.f9100);
            if (this.f9093.mo14622(this.f9098)) {
                try {
                    m12784();
                    m12783();
                    this.f9107 = true;
                    return;
                } catch (IOException e) {
                    C6668.f2226.m21321().m21315("DiskLruCache " + this.f9094 + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        m12768();
                        this.f9108 = false;
                        m12786();
                        this.f9107 = true;
                    } catch (Throwable th) {
                        this.f9108 = false;
                        throw th;
                    }
                }
            }
            m12786();
            this.f9107 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final synchronized boolean m12780() {
        return this.f9108;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final boolean m12781() {
        int i = this.f9104;
        return i >= 2000 && i >= this.f9103.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final InterfaceC3603 m12782() throws FileNotFoundException {
        return C6542.m20830(new C4794(this.f9093.mo14625(this.f9098), new C4413()));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final void m12783() throws IOException {
        this.f9093.mo14624(this.f9099);
        Iterator<C4410> it = this.f9103.values().iterator();
        while (it.hasNext()) {
            C4410 next = it.next();
            C5499.m17102(next, "i.next()");
            C4410 c4410 = next;
            int i = 0;
            if (c4410.m1362() == null) {
                int i2 = this.f9096;
                while (i < i2) {
                    this.f9101 += c4410.m12804()[i];
                    i++;
                }
            } else {
                c4410.m12811(null);
                int i3 = this.f9096;
                while (i < i3) {
                    this.f9093.mo14624(c4410.m1361().get(i));
                    this.f9093.mo14624(c4410.m12802().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m12784() throws IOException {
        InterfaceC3604 interfaceC3604M20831 = C6542.m20831(this.f9093.mo1729(this.f9098));
        try {
            String strMo9655 = interfaceC3604M20831.mo9655();
            String strMo96552 = interfaceC3604M20831.mo9655();
            String strMo96553 = interfaceC3604M20831.mo9655();
            String strMo96554 = interfaceC3604M20831.mo9655();
            String strMo96555 = interfaceC3604M20831.mo9655();
            if (!C5499.m17094(f9085, strMo9655) || !C5499.m17094(f9086, strMo96552) || !C5499.m17094(String.valueOf(this.f9095), strMo96553) || !C5499.m17094(String.valueOf(this.f9096), strMo96554) || strMo96555.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo9655 + ", " + strMo96552 + ", " + strMo96554 + ", " + strMo96555 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m12785(interfaceC3604M20831.mo9655());
                    i++;
                } catch (EOFException unused) {
                    this.f9104 = i - this.f9103.size();
                    if (interfaceC3604M20831.mo9622()) {
                        this.f9102 = m12782();
                    } else {
                        m12786();
                    }
                    C8107 c8107 = C8107.f3222;
                    C3849.m904(interfaceC3604M20831, null);
                    return;
                }
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m12785(String str) throws IOException {
        String strSubstring;
        int iM24056 = C7628.m24056(str, ' ', 0, false, 6, null);
        if (iM24056 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iM24056 + 1;
        int iM240562 = C7628.m24056(str, ' ', i, false, 4, null);
        if (iM240562 == -1) {
            strSubstring = str.substring(i);
            C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f9091;
            if (iM24056 == str2.length() && C7627.m24008(str, str2, false, 2, null)) {
                this.f9103.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM240562);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C4410 c4410 = this.f9103.get(strSubstring);
        if (c4410 == null) {
            c4410 = new C4410(this, strSubstring);
            this.f9103.put(strSubstring, c4410);
        }
        if (iM240562 != -1) {
            String str3 = f9089;
            if (iM24056 == str3.length() && C7627.m24008(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iM240562 + 1);
                C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listM24136 = C7628.m24136(strSubstring2, new char[]{' '}, false, 0, 6, null);
                c4410.m12814(true);
                c4410.m12811(null);
                c4410.m12812(listM24136);
                return;
            }
        }
        if (iM240562 == -1) {
            String str4 = f9090;
            if (iM24056 == str4.length() && C7627.m24008(str, str4, false, 2, null)) {
                c4410.m12811(new C0402(this, c4410));
                return;
            }
        }
        if (iM240562 == -1) {
            String str5 = f9092;
            if (iM24056 == str5.length() && C7627.m24008(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final synchronized void m12786() throws IOException {
        try {
            InterfaceC3603 interfaceC3603 = this.f9102;
            if (interfaceC3603 != null) {
                interfaceC3603.close();
            }
            InterfaceC3603 interfaceC3603M20830 = C6542.m20830(this.f9093.mo1730(this.f9099));
            try {
                interfaceC3603M20830.mo9638(f9085).writeByte(10);
                interfaceC3603M20830.mo9638(f9086).writeByte(10);
                interfaceC3603M20830.mo9671(this.f9095).writeByte(10);
                interfaceC3603M20830.mo9671(this.f9096).writeByte(10);
                interfaceC3603M20830.writeByte(10);
                for (C4410 c4410 : this.f9103.values()) {
                    if (c4410.m1362() != null) {
                        interfaceC3603M20830.mo9638(f9090).writeByte(32);
                        interfaceC3603M20830.mo9638(c4410.m12803());
                        interfaceC3603M20830.writeByte(10);
                    } else {
                        interfaceC3603M20830.mo9638(f9089).writeByte(32);
                        interfaceC3603M20830.mo9638(c4410.m12803());
                        c4410.m12818(interfaceC3603M20830);
                        interfaceC3603M20830.writeByte(10);
                    }
                }
                C8107 c8107 = C8107.f3222;
                C3849.m904(interfaceC3603M20830, null);
                if (this.f9093.mo14622(this.f9098)) {
                    this.f9093.mo14623(this.f9098, this.f9100);
                }
                this.f9093.mo14623(this.f9099, this.f9098);
                this.f9093.mo14624(this.f9100);
                this.f9102 = m12782();
                this.f9105 = false;
                this.f9110 = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final synchronized boolean m12787(@InterfaceC6399 String str) throws IOException {
        C5499.m17103(str, C6659.f17103);
        m12779();
        m12766();
        m12795(str);
        C4410 c4410 = this.f9103.get(str);
        if (c4410 == null) {
            return false;
        }
        boolean zM12788 = m12788(c4410);
        if (zM12788 && this.f9101 <= this.f9097) {
            this.f9109 = false;
        }
        return zM12788;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final boolean m12788(@InterfaceC6399 C4410 c4410) throws IOException {
        InterfaceC3603 interfaceC3603;
        C5499.m17103(c4410, "entry");
        if (!this.f9106) {
            if (c4410.m12805() > 0 && (interfaceC3603 = this.f9102) != null) {
                interfaceC3603.mo9638(f9090);
                interfaceC3603.writeByte(32);
                interfaceC3603.mo9638(c4410.m12803());
                interfaceC3603.writeByte(10);
                interfaceC3603.flush();
            }
            if (c4410.m12805() > 0 || c4410.m1362() != null) {
                c4410.m12816(true);
                return true;
            }
        }
        C0402 c0402M1362 = c4410.m1362();
        if (c0402M1362 != null) {
            c0402M1362.m12796();
        }
        int i = this.f9096;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9093.mo14624(c4410.m1361().get(i2));
            this.f9101 -= c4410.m12804()[i2];
            c4410.m12804()[i2] = 0;
        }
        this.f9104++;
        InterfaceC3603 interfaceC36032 = this.f9102;
        if (interfaceC36032 != null) {
            interfaceC36032.mo9638(f9091);
            interfaceC36032.writeByte(32);
            interfaceC36032.mo9638(c4410.m12803());
            interfaceC36032.writeByte(10);
        }
        this.f9103.remove(c4410.m12803());
        if (m12781()) {
            C7731.m24579(this.f9112, this.f9113, 0L, 2, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final boolean m12789() throws IOException {
        for (C4410 c4410 : this.f9103.values()) {
            if (!c4410.m12808()) {
                C5499.m17102(c4410, "toEvict");
                m12788(c4410);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m12790(boolean z) {
        this.f9108 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final synchronized void m12791(long j) {
        this.f9097 = j;
        if (this.f9107) {
            C7731.m24579(this.f9112, this.f9113, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final synchronized long m12792() throws IOException {
        m12779();
        return this.f9101;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final synchronized Iterator<C4411> m12793() throws IOException {
        m12779();
        return new C4414();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final void m12794() throws IOException {
        while (this.f9101 > this.f9097) {
            if (!m12789()) {
                return;
            }
        }
        this.f9109 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m12795(String str) {
        if (f9088.m22055(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + C8039.f3212).toString());
    }
}
