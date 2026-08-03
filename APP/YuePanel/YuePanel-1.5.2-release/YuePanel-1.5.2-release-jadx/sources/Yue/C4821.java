package Yue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4821 implements InterfaceC7326<File> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final File f1140;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final EnumC4834 f1141;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5124<File, Boolean> f10865;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5124<File, C8107> f10866;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5138<File, IOException, C8107> f10867;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f10868;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ */
    @InterfaceC7507({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class AbstractC0501 extends AbstractC4826 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0501(@InterfaceC6399 File file) {
            super(file);
            C5499.m17103(file, "rootDir");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟ */
    public final class C0502 extends AbstractC2985<File> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final ArrayDeque<AbstractC4826> f10869;

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ, reason: contains not printable characters */
        public final class C4822 extends AbstractC0501 {

            /* JADX INFO: renamed from: ۥ۟ */
            public boolean f1142;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            @InterfaceC6489
            public File[] f10871;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f10872;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public boolean f10873;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C0502 f10874;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4822(@InterfaceC6399 C0502 c0502, File file) {
                super(file);
                C5499.m17103(file, "rootDir");
                this.f10874 = c0502;
            }

            @Override // Yue.C4821.AbstractC4826
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            public File mo1736() {
                if (!this.f10873 && this.f10871 == null) {
                    InterfaceC5124 interfaceC5124 = C4821.this.f10865;
                    if (interfaceC5124 != null && !((Boolean) interfaceC5124.invoke(m1737())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = m1737().listFiles();
                    this.f10871 = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        InterfaceC5138 interfaceC5138 = C4821.this.f10867;
                        if (interfaceC5138 != null) {
                            interfaceC5138.invoke(m1737(), new C3022(m1737(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f10873 = true;
                    }
                }
                File[] fileArr = this.f10871;
                if (fileArr != null) {
                    int i = this.f10872;
                    C5499.m17100(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f10871;
                        C5499.m17100(fileArr2);
                        int i2 = this.f10872;
                        this.f10872 = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f1142) {
                    this.f1142 = true;
                    return m1737();
                }
                InterfaceC5124 interfaceC51242 = C4821.this.f10866;
                if (interfaceC51242 != null) {
                    interfaceC51242.invoke(m1737());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        public final class C4823 extends AbstractC4826 {

            /* JADX INFO: renamed from: ۥ۟ */
            public boolean f1143;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ C0502 f10875;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4823(@InterfaceC6399 C0502 c0502, File file) {
                super(file);
                C5499.m17103(file, "rootFile");
                this.f10875 = c0502;
            }

            @Override // Yue.C4821.AbstractC4826
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            public File mo1736() {
                if (this.f1143) {
                    return null;
                }
                this.f1143 = true;
                return m1737();
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟, reason: contains not printable characters */
        public final class C4824 extends AbstractC0501 {

            /* JADX INFO: renamed from: ۥ۟ */
            public boolean f1144;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            @InterfaceC6489
            public File[] f10876;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f10877;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ C0502 f10878;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4824(@InterfaceC6399 C0502 c0502, File file) {
                super(file);
                C5499.m17103(file, "rootDir");
                this.f10878 = c0502;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // Yue.C4821.AbstractC4826
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File mo1736() {
                InterfaceC5138 interfaceC5138;
                if (!this.f1144) {
                    InterfaceC5124 interfaceC5124 = C4821.this.f10865;
                    if (interfaceC5124 != null && !((Boolean) interfaceC5124.invoke(m1737())).booleanValue()) {
                        return null;
                    }
                    this.f1144 = true;
                    return m1737();
                }
                File[] fileArr = this.f10876;
                if (fileArr != null) {
                    int i = this.f10877;
                    C5499.m17100(fileArr);
                    if (i >= fileArr.length) {
                        InterfaceC5124 interfaceC51242 = C4821.this.f10866;
                        if (interfaceC51242 != null) {
                            interfaceC51242.invoke(m1737());
                        }
                        return null;
                    }
                }
                if (this.f10876 == null) {
                    File[] fileArrListFiles = m1737().listFiles();
                    this.f10876 = fileArrListFiles;
                    if (fileArrListFiles == null && (interfaceC5138 = C4821.this.f10867) != null) {
                        interfaceC5138.invoke(m1737(), new C3022(m1737(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f10876;
                    if (fileArr2 != null) {
                        C5499.m17100(fileArr2);
                    }
                    InterfaceC5124 interfaceC51243 = C4821.this.f10866;
                    if (interfaceC51243 != null) {
                        interfaceC51243.invoke(m1737());
                    }
                    return null;
                }
                File[] fileArr3 = this.f10876;
                C5499.m17100(fileArr3);
                int i2 = this.f10877;
                this.f10877 = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
        public /* synthetic */ class C4825 {

            /* JADX INFO: renamed from: ۥ */
            public static final /* synthetic */ int[] f1145;

            static {
                int[] iArr = new int[EnumC4834.values().length];
                try {
                    iArr[EnumC4834.f10897.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4834.f10898.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f1145 = iArr;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0502() {
            ArrayDeque<AbstractC4826> arrayDeque = new ArrayDeque<>();
            this.f10869 = arrayDeque;
            if (C4821.this.f1140.isDirectory()) {
                arrayDeque.push(m14675(C4821.this.f1140));
            } else if (C4821.this.f1140.isFile()) {
                arrayDeque.push(new C4823(this, C4821.this.f1140));
            } else {
                m50();
            }
        }

        @Override // Yue.AbstractC2985
        /* JADX INFO: renamed from: ۥ */
        public void mo49() {
            File fileM14676 = m14676();
            if (fileM14676 != null) {
                m5789(fileM14676);
            } else {
                m50();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final AbstractC0501 m14675(File file) {
            int i = C4825.f1145[C4821.this.f1141.ordinal()];
            if (i == 1) {
                return new C4824(this, file);
            }
            if (i == 2) {
                return new C4822(this, file);
            }
            throw new C6380();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final File m14676() {
            File fileMo1736;
            while (true) {
                AbstractC4826 abstractC4826Peek = this.f10869.peek();
                if (abstractC4826Peek == null) {
                    return null;
                }
                fileMo1736 = abstractC4826Peek.mo1736();
                if (fileMo1736 == null) {
                    this.f10869.pop();
                } else {
                    if (C5499.m17094(fileMo1736, abstractC4826Peek.m1737()) || !fileMo1736.isDirectory() || this.f10869.size() >= C4821.this.f10868) {
                        break;
                    }
                    this.f10869.push(m14675(fileMo1736));
                }
            }
            return fileMo1736;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC4826 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final File f1146;

        public AbstractC4826(@InterfaceC6399 File file) {
            C5499.m17103(file, "root");
            this.f1146 = file;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final File m1737() {
            return this.f1146;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public abstract File mo1736();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.io.File, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.io.File, Yue.ۥۣۢ۠ۤ> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.io.File, ? super java.io.IOException, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4821(File file, EnumC4834 enumC4834, InterfaceC5124<? super File, Boolean> interfaceC5124, InterfaceC5124<? super File, C8107> interfaceC51242, InterfaceC5138<? super File, ? super IOException, C8107> interfaceC5138, int i) {
        this.f1140 = file;
        this.f1141 = enumC4834;
        this.f10865 = interfaceC5124;
        this.f10866 = interfaceC51242;
        this.f10867 = interfaceC5138;
        this.f10868 = i;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<File> iterator() {
        return new C0502();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C4821 m14671(int i) {
        if (i > 0) {
            return new C4821(this.f1140, this.f1141, this.f10865, this.f10866, this.f10867, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C4821 m14672(@InterfaceC6399 InterfaceC5124<? super File, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC5124, "function");
        return new C4821(this.f1140, this.f1141, interfaceC5124, this.f10866, this.f10867, this.f10868);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C4821 m14673(@InterfaceC6399 InterfaceC5138<? super File, ? super IOException, C8107> interfaceC5138) {
        C5499.m17103(interfaceC5138, "function");
        return new C4821(this.f1140, this.f1141, this.f10865, this.f10866, interfaceC5138, this.f10868);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C4821 m14674(@InterfaceC6399 InterfaceC5124<? super File, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "function");
        return new C4821(this.f1140, this.f1141, this.f10865, interfaceC5124, this.f10867, this.f10868);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r8v0 java.io.File)
  (wrap:Yue.ۥ۠ۢ۟ۢ:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۠ۢ۟ۢ:0x0004: SGET  A[WRAPPED] (LINE:8) Yue.ۥ۠ۢ۟ۢ.ۥۣ۟۟۠ Yue.ۥ۠ۢ۟ۢ) : (r9v0 Yue.ۥ۠ۢ۟ۢ))
  (r10v0 Yue.ۥۣ۠ۡ۟)
  (r11v0 Yue.ۥۣ۠ۡ۟)
  (r12v0 Yue.ۥۣ۠ۢۢ)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r13v0 int))
 A[MD:(java.io.File, Yue.ۥ۠ۢ۟ۢ, Yue.ۥۣ۠ۡ۟<? super java.io.File, java.lang.Boolean>, Yue.ۥۣ۠ۡ۟<? super java.io.File, Yue.ۥۣۢ۠ۤ>, Yue.ۥۣ۠ۢۢ<? super java.io.File, ? super java.io.IOException, Yue.ۥۣۢ۠ۤ>, int):void (m)] (LINE:9) call: Yue.ۥ۠ۡۨۦ.<init>(java.io.File, Yue.ۥ۠ۢ۟ۢ, Yue.ۥۣ۠ۡ۟, Yue.ۥۣ۠ۡ۟, Yue.ۥۣ۠ۢۢ, int):void type: THIS */
    public /* synthetic */ C4821(File file, EnumC4834 enumC4834, InterfaceC5124 interfaceC5124, InterfaceC5124 interfaceC51242, InterfaceC5138 interfaceC5138, int i, int i2, C4335 c4335) {
        this(file, (i2 & 2) != 0 ? EnumC4834.f10897 : enumC4834, interfaceC5124, interfaceC51242, interfaceC5138, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4821(@InterfaceC6399 File file, @InterfaceC6399 EnumC4834 enumC4834) {
        this(file, enumC4834, null, null, null, 0, 32, null);
        C5499.m17103(file, "start");
        C5499.m17103(enumC4834, "direction");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.io.File)
  (wrap:Yue.ۥ۠ۢ۟ۢ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۠ۢ۟ۢ:0x0004: SGET  A[WRAPPED] (LINE:11) Yue.ۥ۠ۢ۟ۢ.ۥۣ۟۟۠ Yue.ۥ۠ۢ۟ۢ) : (r2v0 Yue.ۥ۠ۢ۟ۢ))
 A[MD:(java.io.File, Yue.ۥ۠ۢ۟ۢ):void (m)] (LINE:11) call: Yue.ۥ۠ۡۨۦ.<init>(java.io.File, Yue.ۥ۠ۢ۟ۢ):void type: THIS */
    public /* synthetic */ C4821(File file, EnumC4834 enumC4834, int i, C4335 c4335) {
        this(file, (i & 2) != 0 ? EnumC4834.f10897 : enumC4834);
    }
}
