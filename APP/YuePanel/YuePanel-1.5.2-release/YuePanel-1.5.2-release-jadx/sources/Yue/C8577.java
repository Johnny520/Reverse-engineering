package Yue;

import Yue.C6618;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class C8577 extends AbstractC4819 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1553 f25453 = new C1553(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6618 f25454 = C6618.C1032.m21047(C6618.f16986, "/", false, 1, null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C6618 f25455;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4819 f25456;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final Map<C6618, C8576> f25457;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f25458;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۧ$ۥ */
    public static final class C1553 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۦۣۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1553(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C6618 m4547() {
            return C8577.f25454;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1553() {
        }
    }

    public C8577(@InterfaceC6399 C6618 c6618, @InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 Map<C6618, C8576> map, @InterfaceC6489 String str) {
        C5499.m17103(c6618, "zipPath");
        C5499.m17103(abstractC4819, "fileSystem");
        C5499.m17103(map, "entries");
        this.f25455 = c6618;
        this.f25456 = abstractC4819;
        this.f25457 = map;
        this.f25458 = str;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    private final List<C6618> m28571(C6618 c6618, boolean z) throws IOException {
        C8576 c8576 = this.f25457.get(m28572(c6618));
        if (c8576 != null) {
            return C3888.m11062(c8576.m4546());
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + c6618);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC7472 mo14638(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C6618 mo14640(@InterfaceC6399 C6618 c6618) throws FileNotFoundException {
        C5499.m17103(c6618, "path");
        C6618 c6618M28572 = m28572(c6618);
        if (this.f25457.containsKey(c6618M28572)) {
            return c6618M28572;
        }
        throw new FileNotFoundException(String.valueOf(c6618));
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo14645(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo14648(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public List<C6618> mo14652(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "dir");
        List<C6618> listM28571 = m28571(c6618, true);
        C5499.m17100(listM28571);
        return listM28571;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public List<C6618> mo14653(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "dir");
        return m28571(c6618, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:13:0x0054, B:31:0x0080, B:37:0x008b, B:26:0x0076, B:23:0x0071, B:14:0x0060), top: B:56:0x0054, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:13:0x0054, B:31:0x0080, B:37:0x008b, B:26:0x0076, B:23:0x0071, B:14:0x0060), top: B:56:0x0054, inners: #1, #5 }] */
    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4811 mo14657(@InterfaceC6399 C6618 c6618) throws Throwable {
        C4811 c4811M28579;
        Throwable th;
        C5499.m17103(c6618, "path");
        C8576 c8576 = this.f25457.get(m28572(c6618));
        Throwable th2 = null;
        if (c8576 == null) {
            return null;
        }
        C4811 c4811 = new C4811(!c8576.m28569(), c8576.m28569(), null, c8576.m28569() ? null : Long.valueOf(c8576.m28568()), null, c8576.m28566(), null, null, 128, null);
        if (c8576.m28567() == -1) {
            return c4811;
        }
        AbstractC4809 abstractC4809Mo14658 = this.f25456.mo14658(this.f25455);
        try {
            InterfaceC3604 interfaceC3604M20831 = C6542.m20831(abstractC4809Mo14658.m14570(c8576.m28567()));
            try {
                c4811M28579 = C8578.m28579(interfaceC3604M20831, c4811);
            } catch (Throwable th3) {
                if (interfaceC3604M20831 != null) {
                    try {
                        interfaceC3604M20831.close();
                    } catch (Throwable th4) {
                        C4741.m1656(th3, th4);
                    }
                }
                th = th3;
                c4811M28579 = null;
            }
            if (interfaceC3604M20831 != null) {
                try {
                    interfaceC3604M20831.close();
                    th = null;
                } catch (Throwable th5) {
                    th = th5;
                }
                if (th == null) {
                    throw th;
                }
                C5499.m17100(c4811M28579);
                if (abstractC4809Mo14658 != null) {
                    try {
                        abstractC4809Mo14658.close();
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
            } else {
                th = null;
                if (th == null) {
                }
            }
        } catch (Throwable th7) {
            if (abstractC4809Mo14658 != null) {
                try {
                    abstractC4809Mo14658.close();
                } catch (Throwable th8) {
                    C4741.m1656(th7, th8);
                }
            }
            c4811M28579 = null;
            th2 = th7;
        }
        if (th2 != null) {
            throw th2;
        }
        C5499.m17100(c4811M28579);
        return c4811M28579;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public AbstractC4809 mo14658(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC4809 mo14660(@InterfaceC6399 C6618 c6618, boolean z, boolean z2) throws IOException {
        C5499.m17103(c6618, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC7472 mo14662(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public InterfaceC7506 mo14663(@InterfaceC6399 C6618 c6618) throws Throwable {
        InterfaceC3604 interfaceC3604M20831;
        C5499.m17103(c6618, "file");
        C8576 c8576 = this.f25457.get(m28572(c6618));
        if (c8576 == null) {
            throw new FileNotFoundException("no such file: " + c6618);
        }
        AbstractC4809 abstractC4809Mo14658 = this.f25456.mo14658(this.f25455);
        Throwable th = null;
        try {
            interfaceC3604M20831 = C6542.m20831(abstractC4809Mo14658.m14570(c8576.m28567()));
            if (abstractC4809Mo14658 != null) {
                try {
                    abstractC4809Mo14658.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (abstractC4809Mo14658 != null) {
                try {
                    abstractC4809Mo14658.close();
                } catch (Throwable th4) {
                    C4741.m1656(th3, th4);
                }
            }
            interfaceC3604M20831 = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        C5499.m17100(interfaceC3604M20831);
        C8578.m28582(interfaceC3604M20831);
        return c8576.m28564() == 0 ? new C4864(interfaceC3604M20831, c8576.m28568(), true) : new C4864(new C5432(new C4864(interfaceC3604M20831, c8576.m28563(), true), new Inflater(true)), c8576.m28568(), false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final C6618 m28572(C6618 c6618) {
        return f25454.m21040(c6618, true);
    }
}
