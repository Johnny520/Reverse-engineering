package Yue;

import Yue.C3630;
import Yue.C4408;
import Yue.C5256;
import Yue.C6668;
import Yue.C7101;
import Yue.C7141;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3633 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3637 f6376 = new C3637(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f6377 = 201105;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f6378 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f6379 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f6380 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C4408 f6381;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f6382;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f6383;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f6384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f6385;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f6386;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ */
    public static final class C0199 extends AbstractC7142 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final C4408.C4411 f6387;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6489
        public final String f6388;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6489
        public final String f6389;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3604 f6390;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C3634 extends AbstractC5068 {

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C0199 f6391;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3634(InterfaceC7506 interfaceC7506, C0199 c0199) {
                super(interfaceC7506);
                this.f6391 = c0199;
            }

            @Override // Yue.AbstractC5068, Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f6391.m9920().close();
                super.close();
            }
        }

        public C0199(@InterfaceC6399 C4408.C4411 c4411, @InterfaceC6489 String str, @InterfaceC6489 String str2) {
            C5499.m17103(c4411, "snapshot");
            this.f6387 = c4411;
            this.f6388 = str;
            this.f6389 = str2;
            this.f6390 = C6542.m20831(new C3634(c4411.m12820(1), this));
        }

        @Override // Yue.AbstractC7142
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public long mo9917() {
            String str = this.f6389;
            if (str != null) {
                return C8158.m26891(str, -1L);
            }
            return -1L;
        }

        @Override // Yue.AbstractC7142
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public C6149 mo9918() {
            String str = this.f6388;
            if (str != null) {
                return C6149.f15045.m18956(str);
            }
            return null;
        }

        @Override // Yue.AbstractC7142
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public InterfaceC3604 mo9919() {
            return this.f6390;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public final C4408.C4411 m9920() {
            return this.f6387;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ۟ */
    public final class C0200 implements InterfaceC3643 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final C4408.C0402 f424;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final InterfaceC7472 f425;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC7472 f6392;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f6393;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C3633 f6394;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C3635 extends AbstractC5067 {

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C3633 f6395;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C0200 f6396;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3635(C3633 c3633, C0200 c0200, InterfaceC7472 interfaceC7472) {
                super(interfaceC7472);
                this.f6395 = c3633;
                this.f6396 = c0200;
            }

            @Override // Yue.AbstractC5067, Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                C3633 c3633 = this.f6395;
                C0200 c0200 = this.f6396;
                synchronized (c3633) {
                    if (c0200.m691()) {
                        return;
                    }
                    c0200.m9921(true);
                    c3633.m9909(c3633.m9899() + 1);
                    super.close();
                    this.f6396.f424.m1360();
                }
            }
        }

        public C0200(@InterfaceC6399 C3633 c3633, C4408.C0402 c0402) {
            C5499.m17103(c0402, "editor");
            this.f6394 = c3633;
            this.f424 = c0402;
            InterfaceC7472 interfaceC7472M12799 = c0402.m12799(1);
            this.f425 = interfaceC7472M12799;
            this.f6392 = new C3635(c3633, this, interfaceC7472M12799);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m691() {
            return this.f6393;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m9921(boolean z) {
            this.f6393 = z;
        }

        @Override // Yue.InterfaceC3643
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public InterfaceC7472 mo9922() {
            return this.f6392;
        }

        @Override // Yue.InterfaceC3643
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void mo9923() {
            C3633 c3633 = this.f6394;
            synchronized (c3633) {
                if (this.f6393) {
                    return;
                }
                this.f6393 = true;
                c3633.m9908(c3633.m9898() + 1);
                C8158.m26844(this.f425);
                try {
                    this.f424.m1359();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"})
    public static final class C3636 implements Iterator<String>, InterfaceC5594 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<C4408.C4411> f6397;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6489
        public String f6398;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f6399;

        public C3636(C3633 c3633) {
            this.f6397 = c3633.m9897().m12793();
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6398 != null) {
                return true;
            }
            this.f6399 = false;
            while (this.f6397.hasNext()) {
                try {
                    C4408.C4411 next = this.f6397.next();
                    try {
                        continue;
                        this.f6398 = C6542.m20831(next.m12820(0)).mo9655();
                        C3849.m904(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f6399) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.f6397.remove();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f6398;
            C5499.m17100(str);
            this.f6398 = null;
            this.f6399 = true;
            return str;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    public static final class C3637 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۥۧ.ۥ۟۟۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C3637(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m693(@InterfaceC6399 C7141 c7141) {
            C5499.m17103(c7141, "<this>");
            return m9925(c7141.m22320()).contains(InterfaceC5949.f14892);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final String m694(@InterfaceC6399 C5385 c5385) {
            C5499.m17103(c5385, "url");
            return C3630.f6370.m9876(c5385.toString()).m9843().mo9828();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m9924(@InterfaceC6399 InterfaceC3604 interfaceC3604) throws IOException {
            C5499.m17103(interfaceC3604, "source");
            try {
                long jMo9633 = interfaceC3604.mo9633();
                String strMo9655 = interfaceC3604.mo9655();
                if (jMo9633 >= 0 && jMo9633 <= 2147483647L && strMo9655.length() <= 0) {
                    return (int) jMo9633;
                }
                throw new IOException("expected an int but was \"" + jMo9633 + strMo9655 + C8039.f3212);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Set<String> m9925(C5256 c5256) {
            int size = c5256.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (C7627.m23974("Vary", c5256.m16114(i), true)) {
                    String strM16118 = c5256.m16118(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C7627.m23980(C7610.f2968));
                    }
                    Iterator it = C7628.m24136(strM16118, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(C7628.m24174((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C7387.m23125() : treeSet;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5256 m9926(C5256 c5256, C5256 c52562) {
            Set<String> setM9925 = m9925(c52562);
            if (setM9925.isEmpty()) {
                return C8158.f3266;
            }
            C5256.C0687 c0687 = new C5256.C0687();
            int size = c5256.size();
            for (int i = 0; i < size; i++) {
                String strM16114 = c5256.m16114(i);
                if (setM9925.contains(strM16114)) {
                    c0687.m2022(strM16114, c5256.m16118(i));
                }
            }
            return c0687.m16126();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C5256 m9927(@InterfaceC6399 C7141 c7141) {
            C5499.m17103(c7141, "<this>");
            C7141 c7141M22325 = c7141.m22325();
            C5499.m17100(c7141M22325);
            return m9926(c7141M22325.m22331().m22153(), c7141.m22320());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m9928(@InterfaceC6399 C7141 c7141, @InterfaceC6399 C5256 c5256, @InterfaceC6399 C7101 c7101) {
            C5499.m17103(c7141, "cachedResponse");
            C5499.m17103(c5256, "cachedRequest");
            C5499.m17103(c7101, "newRequest");
            Set<String> setM9925 = m9925(c7141.m22320());
            if ((setM9925 instanceof Collection) && setM9925.isEmpty()) {
                return true;
            }
            for (String str : setM9925) {
                if (!C5499.m17094(c5256.m16119(str), c7101.m22154(str))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C3637() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3633(@InterfaceC6399 File file, long j, @InterfaceC6399 InterfaceC4817 interfaceC4817) {
        C5499.m17103(file, "directory");
        C5499.m17103(interfaceC4817, "fileSystem");
        this.f6381 = new C4408(interfaceC4817, file, f6377, 2, j, C7733.f23262);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String m9891(@InterfaceC6399 C5385 c5385) {
        return f6376.m694(c5385);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6381.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f6381.flush();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "directory", imports = {}))
    @InterfaceC5572(name = "-deprecated_directory")
    /* JADX INFO: renamed from: ۥ۟ */
    public final File m689() {
        return this.f6381.m12774();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m9892(C4408.C0402 c0402) {
        if (c0402 != null) {
            try {
                c0402.m1359();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m9893() throws IOException {
        this.f6381.m12768();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "directory")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final File m9894() {
        return this.f6381.m12774();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m9895() throws IOException {
        this.f6381.m12771();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C7141 m9896(@InterfaceC6399 C7101 c7101) {
        C5499.m17103(c7101, "request");
        try {
            C4408.C4411 c4411M12772 = this.f6381.m12772(f6376.m694(c7101.m22160()));
            if (c4411M12772 == null) {
                return null;
            }
            try {
                C3638 c3638 = new C3638(c4411M12772.m12820(0));
                C7141 c7141M9930 = c3638.m9930(c4411M12772);
                if (c3638.m696(c7101, c7141M9930)) {
                    return c7141M9930;
                }
                AbstractC7142 abstractC7142M22311 = c7141M9930.m22311();
                if (abstractC7142M22311 != null) {
                    C8158.m26844(abstractC7142M22311);
                }
                return null;
            } catch (IOException unused) {
                C8158.m26844(c4411M12772);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C4408 m9897() {
        return this.f6381;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m9898() {
        return this.f6383;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m9899() {
        return this.f6382;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final synchronized int m9900() {
        return this.f6385;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m9901() throws IOException {
        this.f6381.m12779();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m9902() {
        return this.f6381.m12780();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final long m9903() {
        return this.f6381.m12777();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final synchronized int m9904() {
        return this.f6384;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۠۟ۡۨ.ۥ۟۟ۡۡ(Yue.ۥ۠۟ۡۨ, java.lang.String, long, int, java.lang.Object):Yue.ۥ۠۟ۡۨ$ۥ۟ */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final InterfaceC3643 m9905(@InterfaceC6399 C7141 c7141) {
        C4408.C0402 c0402M12765;
        C5499.m17103(c7141, "response");
        String strM22156 = c7141.m22331().m22156();
        if (C5383.f1469.m2139(c7141.m22331().m22156())) {
            try {
                m9906(c7141.m22331());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!C5499.m17094(strM22156, "GET")) {
            return null;
        }
        C3637 c3637 = f6376;
        if (c3637.m693(c7141)) {
            return null;
        }
        C3638 c3638 = new C3638(c7141);
        try {
            c0402M12765 = C4408.m12765(this.f6381, c3637.m694(c7141.m22331().m22160()), 0L, 2, null);
            if (c0402M12765 == null) {
                return null;
            }
            try {
                c3638.m9932(c0402M12765);
                return new C0200(this, c0402M12765);
            } catch (IOException unused2) {
                m9892(c0402M12765);
                return null;
            }
        } catch (IOException unused3) {
            c0402M12765 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m9906(@InterfaceC6399 C7101 c7101) throws IOException {
        C5499.m17103(c7101, "request");
        this.f6381.m12787(f6376.m694(c7101.m22160()));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final synchronized int m9907() {
        return this.f6386;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m9908(int i) {
        this.f6383 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m9909(int i) {
        this.f6382 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final long m9910() throws IOException {
        return this.f6381.m12792();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final synchronized void m9911() {
        this.f6385++;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final synchronized void m9912(@InterfaceC6399 C3644 c3644) {
        try {
            C5499.m17103(c3644, "cacheStrategy");
            this.f6386++;
            if (c3644.m707() != null) {
                this.f6384++;
            } else if (c3644.m706() != null) {
                this.f6385++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final void m9913(@InterfaceC6399 C7141 c7141, @InterfaceC6399 C7141 c71412) {
        C4408.C0402 c0402M1363;
        C5499.m17103(c7141, "cached");
        C5499.m17103(c71412, "network");
        C3638 c3638 = new C3638(c71412);
        AbstractC7142 abstractC7142M22311 = c7141.m22311();
        C5499.m17101(abstractC7142M22311, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            c0402M1363 = ((C0199) abstractC7142M22311).m9920().m1363();
            if (c0402M1363 == null) {
                return;
            }
            try {
                c3638.m9932(c0402M1363);
                c0402M1363.m1360();
            } catch (IOException unused) {
                m9892(c0402M1363);
            }
        } catch (IOException unused2) {
            c0402M1363 = null;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final Iterator<String> m9914() throws IOException {
        return new C3636(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final synchronized int m9915() {
        return this.f6383;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final synchronized int m9916() {
        return this.f6382;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3633(@InterfaceC6399 File file, long j) {
        this(file, j, InterfaceC4817.f1136);
        C5499.m17103(file, "directory");
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C3638 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public static final C0201 f6400 = new C0201(null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f6401;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f6402;

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final C5385 f426;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final C5256 f427;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final String f6403;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final EnumC6835 f6404;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f6405;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final String f6406;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        public final C5256 f6407;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6489
        public final C5241 f6408;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final long f6409;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final long f6410;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۧ$ۥ۟۟۟۟$ۥ */
        public static final class C0201 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۥۧ.ۥ۟۟۟۟.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0201(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0201() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            C6668.C1054 c1054 = C6668.f2226;
            sb.append(c1054.m21321().m21314());
            sb.append("-Sent-Millis");
            f6401 = sb.toString();
            f6402 = c1054.m21321().m21314() + "-Received-Millis";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public C3638(@InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException {
            C5499.m17103(interfaceC7506, "rawSource");
            try {
                InterfaceC3604 interfaceC3604M20831 = C6542.m20831(interfaceC7506);
                String strMo9655 = interfaceC3604M20831.mo9655();
                C5385 c5385M16859 = C5385.f13231.m16859(strMo9655);
                if (c5385M16859 == null) {
                    IOException iOException = new IOException("Cache corruption for " + strMo9655);
                    C6668.f2226.m21321().m21315("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f426 = c5385M16859;
                this.f6403 = interfaceC3604M20831.mo9655();
                C5256.C0687 c0687 = new C5256.C0687();
                int iM9924 = C3633.f6376.m9924(interfaceC3604M20831);
                for (int i = 0; i < iM9924; i++) {
                    c0687.m16123(interfaceC3604M20831.mo9655());
                }
                this.f427 = c0687.m16126();
                C7597 c7597M3757 = C7597.f22994.m3757(interfaceC3604M20831.mo9655());
                this.f6404 = c7597M3757.f2959;
                this.f6405 = c7597M3757.f2960;
                this.f6406 = c7597M3757.f22999;
                C5256.C0687 c06872 = new C5256.C0687();
                int iM99242 = C3633.f6376.m9924(interfaceC3604M20831);
                for (int i2 = 0; i2 < iM99242; i2++) {
                    c06872.m16123(interfaceC3604M20831.mo9655());
                }
                String str = f6401;
                String strM16127 = c06872.m16127(str);
                String str2 = f6402;
                String strM161272 = c06872.m16127(str2);
                c06872.m16129(str);
                c06872.m16129(str2);
                this.f6409 = strM16127 != null ? Long.parseLong(strM16127) : 0L;
                this.f6410 = strM161272 != null ? Long.parseLong(strM161272) : 0L;
                this.f6407 = c06872.m16126();
                if (m695()) {
                    String strMo96552 = interfaceC3604M20831.mo9655();
                    if (strMo96552.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo96552 + C8039.f3212);
                    }
                    this.f6408 = C5241.f12481.m2009(!interfaceC3604M20831.mo9622() ? EnumC7852.f23467.m3941(interfaceC3604M20831.mo9655()) : EnumC7852.SSL_3_0, C3820.f521.m868(interfaceC3604M20831.mo9655()), m9929(interfaceC3604M20831), m9929(interfaceC3604M20831));
                } else {
                    this.f6408 = null;
                }
                C8107 c8107 = C8107.f3222;
                C3849.m904(interfaceC7506, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C3849.m904(interfaceC7506, th);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m695() {
            return C5499.m17094(this.f426.m16789(), "https");
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m696(@InterfaceC6399 C7101 c7101, @InterfaceC6399 C7141 c7141) {
            C5499.m17103(c7101, "request");
            C5499.m17103(c7141, "response");
            return C5499.m17094(this.f426, c7101.m22160()) && C5499.m17094(this.f6403, c7101.m22156()) && C3633.f6376.m9928(c7141, this.f427, c7101);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final List<Certificate> m9929(InterfaceC3604 interfaceC3604) throws IOException {
            int iM9924 = C3633.f6376.m9924(interfaceC3604);
            if (iM9924 == -1) {
                return C3880.m10735();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM9924);
                for (int i = 0; i < iM9924; i++) {
                    String strMo9655 = interfaceC3604.mo9655();
                    C3600 c3600 = new C3600();
                    C3630 c3630M9873 = C3630.f6370.m9873(strMo9655);
                    if (c3630M9873 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c3600.mo9668(c3630M9873);
                    arrayList.add(certificateFactory.generateCertificate(c3600.mo9607()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C7141 m9930(@InterfaceC6399 C4408.C4411 c4411) {
            C5499.m17103(c4411, "snapshot");
            String strM16111 = this.f6407.m16111(C5375.f13182);
            String strM161112 = this.f6407.m16111("Content-Length");
            return new C7141.C1185().m22362(new C7101.C1165().m22186(this.f426).m22174(this.f6403, null).m22173(this.f427).m3393()).m22359(this.f6404).m22338(this.f6405).m22356(this.f6406).m22354(this.f6407).m3432(new C0199(c4411, strM16111, strM161112)).m22352(this.f6408).m22363(this.f6409).m22360(this.f6410).m22334();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m9931(InterfaceC3603 interfaceC3603, List<? extends Certificate> list) throws IOException {
            try {
                interfaceC3603.mo9671(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    C3630.C0198 c0198 = C3630.f6370;
                    C5499.m17102(encoded, "bytes");
                    interfaceC3603.mo9638(C3630.C0198.m9867(c0198, encoded, 0, 0, 3, null).mo9816()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m9932(@InterfaceC6399 C4408.C0402 c0402) throws IOException {
            C5499.m17103(c0402, "editor");
            InterfaceC3603 interfaceC3603M20830 = C6542.m20830(c0402.m12799(0));
            try {
                interfaceC3603M20830.mo9638(this.f426.toString()).writeByte(10);
                interfaceC3603M20830.mo9638(this.f6403).writeByte(10);
                interfaceC3603M20830.mo9671(this.f427.size()).writeByte(10);
                int size = this.f427.size();
                for (int i = 0; i < size; i++) {
                    interfaceC3603M20830.mo9638(this.f427.m16114(i)).mo9638(": ").mo9638(this.f427.m16118(i)).writeByte(10);
                }
                interfaceC3603M20830.mo9638(new C7597(this.f6404, this.f6405, this.f6406).toString()).writeByte(10);
                interfaceC3603M20830.mo9671(this.f6407.size() + 2).writeByte(10);
                int size2 = this.f6407.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    interfaceC3603M20830.mo9638(this.f6407.m16114(i2)).mo9638(": ").mo9638(this.f6407.m16118(i2)).writeByte(10);
                }
                interfaceC3603M20830.mo9638(f6401).mo9638(": ").mo9671(this.f6409).writeByte(10);
                interfaceC3603M20830.mo9638(f6402).mo9638(": ").mo9671(this.f6410).writeByte(10);
                if (m695()) {
                    interfaceC3603M20830.writeByte(10);
                    C5241 c5241 = this.f6408;
                    C5499.m17100(c5241);
                    interfaceC3603M20830.mo9638(c5241.m16062().m10531()).writeByte(10);
                    m9931(interfaceC3603M20830, this.f6408.m16066());
                    m9931(interfaceC3603M20830, this.f6408.m16064());
                    interfaceC3603M20830.mo9638(this.f6408.m16068().m24919()).writeByte(10);
                }
                C8107 c8107 = C8107.f3222;
                C3849.m904(interfaceC3603M20830, null);
            } finally {
            }
        }

        public C3638(@InterfaceC6399 C7141 c7141) {
            C5499.m17103(c7141, "response");
            this.f426 = c7141.m22331().m22160();
            this.f427 = C3633.f6376.m9927(c7141);
            this.f6403 = c7141.m22331().m22156();
            this.f6404 = c7141.m22329();
            this.f6405 = c7141.m22315();
            this.f6406 = c7141.m22324();
            this.f6407 = c7141.m22320();
            this.f6408 = c7141.m22317();
            this.f6409 = c7141.m22332();
            this.f6410 = c7141.m22330();
        }
    }
}
