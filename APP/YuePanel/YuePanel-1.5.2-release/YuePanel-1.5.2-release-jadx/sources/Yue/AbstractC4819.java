package Yue;

import Yue.C6618;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"})
public abstract class AbstractC4819 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0500 f1138 = new C0500(null);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final AbstractC4819 f1139;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6618 f10860;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final AbstractC4819 f10861;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۤ$ۥ */
    public static final class C0500 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۡۨۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0500(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "get")
        /* JADX INFO: renamed from: ۥ */
        public final AbstractC4819 m1733(@InterfaceC6399 FileSystem fileSystem) {
            C5499.m17103(fileSystem, "<this>");
            return new C6373(fileSystem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0500() {
        }
    }

    static {
        AbstractC4819 c5581;
        try {
            Class.forName("java.nio.file.Files");
            c5581 = new C6374();
        } catch (ClassNotFoundException unused) {
            c5581 = new C5581();
        }
        f1139 = c5581;
        C6618.C1032 c1032 = C6618.f16986;
        String property = System.getProperty("java.io.tmpdir");
        C5499.m17102(property, "getProperty(...)");
        f10860 = C6618.C1032.m21047(c1032, property, false, 1, null);
        ClassLoader classLoader = C7122.class.getClassLoader();
        C5499.m17102(classLoader, "getClassLoader(...)");
        f10861 = new C7122(classLoader, false, null, 4, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m14627(AbstractC4819 abstractC4819, C6618 c6618, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        C5499.m17103(c6618, "file");
        C5499.m17103(interfaceC5124, "writerAction");
        InterfaceC3603 interfaceC3603M20830 = C6542.m20830(abstractC4819.mo14662(c6618, z));
        Throwable th = null;
        try {
            objInvoke = interfaceC5124.invoke(interfaceC3603M20830);
            C5437.m16930(1);
            if (interfaceC3603M20830 != null) {
                try {
                    interfaceC3603M20830.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            C5437.m16929(1);
        } catch (Throwable th3) {
            C5437.m16930(1);
            if (interfaceC3603M20830 != null) {
                try {
                    interfaceC3603M20830.close();
                } catch (Throwable th4) {
                    C4741.m1656(th3, th4);
                }
            }
            C5437.m16929(1);
            objInvoke = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        C5499.m17100(objInvoke);
        return objInvoke;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7472 m14628(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return abstractC4819.mo14638(c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m14629(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC4819.m14643(c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m14630(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC4819.mo14645(c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m14631(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC4819.mo14648(c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m14632(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC4819.m14650(c6618, z);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "get")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final AbstractC4819 m14633(@InterfaceC6399 FileSystem fileSystem) {
        return f1138.m1733(fileSystem);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m14634(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return abstractC4819.mo14655(c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ AbstractC4809 m14635(AbstractC4819 abstractC4819, C6618 c6618, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return abstractC4819.mo14660(c6618, z, z2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7472 m14636(AbstractC4819 abstractC4819, C6618 c6618, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return abstractC4819.mo14662(c6618, z);
    }

    @InterfaceC5572(name = "-read")
    /* JADX INFO: renamed from: ۥ */
    public final <T> T m1731(@InterfaceC6399 C6618 c6618, @InterfaceC6399 InterfaceC5124<? super InterfaceC3604, ? extends T> interfaceC5124) throws Throwable {
        T tInvoke;
        C5499.m17103(c6618, "file");
        C5499.m17103(interfaceC5124, "readerAction");
        InterfaceC3604 interfaceC3604M20831 = C6542.m20831(mo14663(c6618));
        Throwable th = null;
        try {
            tInvoke = interfaceC5124.invoke(interfaceC3604M20831);
            C5437.m16930(1);
            if (interfaceC3604M20831 != null) {
                try {
                    interfaceC3604M20831.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            C5437.m16929(1);
        } catch (Throwable th3) {
            C5437.m16930(1);
            if (interfaceC3604M20831 != null) {
                try {
                    interfaceC3604M20831.close();
                } catch (Throwable th4) {
                    C4741.m1656(th3, th4);
                }
            }
            C5437.m16929(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        C5499.m17100(tInvoke);
        return tInvoke;
    }

    @InterfaceC5572(name = "-write")
    /* JADX INFO: renamed from: ۥ۟ */
    public final <T> T m1732(@InterfaceC6399 C6618 c6618, boolean z, @InterfaceC6399 InterfaceC5124<? super InterfaceC3603, ? extends T> interfaceC5124) throws Throwable {
        T tInvoke;
        C5499.m17103(c6618, "file");
        C5499.m17103(interfaceC5124, "writerAction");
        InterfaceC3603 interfaceC3603M20830 = C6542.m20830(mo14662(c6618, z));
        Throwable th = null;
        try {
            tInvoke = interfaceC5124.invoke(interfaceC3603M20830);
            C5437.m16930(1);
            if (interfaceC3603M20830 != null) {
                try {
                    interfaceC3603M20830.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            C5437.m16929(1);
        } catch (Throwable th3) {
            C5437.m16930(1);
            if (interfaceC3603M20830 != null) {
                try {
                    interfaceC3603M20830.close();
                } catch (Throwable th4) {
                    C4741.m1656(th3, th4);
                }
            }
            C5437.m16929(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        C5499.m17100(tInvoke);
        return tInvoke;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final InterfaceC7472 m14637(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        return mo14638(c6618, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract InterfaceC7472 mo14638(@InterfaceC6399 C6618 c6618, boolean z) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract C6618 mo14640(@InterfaceC6399 C6618 c6618) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m14641(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        C2954.m15(this, c6618, c66182);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m14642(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "dir");
        m14643(c6618, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m14643(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "dir");
        C2954.m5557(this, c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m14644(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "dir");
        mo14645(c6618, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract void mo14645(@InterfaceC6399 C6618 c6618, boolean z) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m14647(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        mo14648(c6618, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract void mo14648(@InterfaceC6399 C6618 c6618, boolean z) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m14649(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "fileOrDirectory");
        m14650(c6618, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m14650(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "fileOrDirectory");
        C2954.m5558(this, c6618, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m14651(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        return C2954.m5559(this, c6618);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract List<C6618> mo14652(@InterfaceC6399 C6618 c6618) throws IOException;

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public abstract List<C6618> mo14653(@InterfaceC6399 C6618 c6618);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final InterfaceC7326<C6618> m14654(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "dir");
        return mo14655(c6618, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public InterfaceC7326<C6618> mo14655(@InterfaceC6399 C6618 c6618, boolean z) {
        C5499.m17103(c6618, "dir");
        return C2954.m5560(this, c6618, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final C4811 m14656(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        return C2954.m5561(this, c6618);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public abstract C4811 mo14657(@InterfaceC6399 C6618 c6618) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public abstract AbstractC4809 mo14658(@InterfaceC6399 C6618 c6618) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final AbstractC4809 m14659(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        return mo14660(c6618, false, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract AbstractC4809 mo14660(@InterfaceC6399 C6618 c6618, boolean z, boolean z2) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final InterfaceC7472 m14661(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        return mo14662(c6618, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public abstract InterfaceC7472 mo14662(@InterfaceC6399 C6618 c6618, boolean z) throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public abstract InterfaceC7506 mo14663(@InterfaceC6399 C6618 c6618) throws IOException;
}
