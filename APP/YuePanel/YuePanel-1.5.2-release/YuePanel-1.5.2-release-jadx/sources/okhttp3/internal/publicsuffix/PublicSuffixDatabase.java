package okhttp3.internal.publicsuffix;

import Yue.C3849;
import Yue.C3879;
import Yue.C3880;
import Yue.C3888;
import Yue.C4335;
import Yue.C4750;
import Yue.C5230;
import Yue.C5499;
import Yue.C6542;
import Yue.C6668;
import Yue.C7060;
import Yue.C7342;
import Yue.C7628;
import Yue.C8107;
import Yue.C8158;
import Yue.InterfaceC3604;
import Yue.InterfaceC5949;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "domain", "ۥ۟۟", "(Ljava/lang/String;)Ljava/lang/String;", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "LYue/ۥۣۢ۠ۤ;", "ۥ۟۟۟۠", "([B[B)V", "", "ۥ۟۟۟ۡ", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "ۥ۟", "(Ljava/util/List;)Ljava/util/List;", "ۥ۟۟۟۟", "ۥ۟۟۟", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ۥ", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "[B", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f30958 = "publicsuffixes.gz";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final char f30961 = '!';

    /* JADX INFO: renamed from: ۥ, reason: from kotlin metadata */
    @InterfaceC6399
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥ۟, reason: from kotlin metadata */
    @InterfaceC6399
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and from kotlin metadata */
    public byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and from kotlin metadata */
    public byte[] publicSuffixExceptionListBytes;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f30959 = {C4750.f10567};

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final List<String> f30960 = C3879.m10715(InterfaceC5949.f14892);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final PublicSuffixDatabase f30962 = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.publicsuffix.PublicSuffixDatabase.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final String m5441(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int iM26833;
            boolean z;
            int iM268332;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iM26833 = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        iM26833 = C8158.m26833(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    iM268332 = iM26833 - C8158.m26833(bArr[i5 + i10], 255);
                    if (iM268332 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (iM268332 >= 0) {
                    if (iM268332 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                C5499.m17102(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final PublicSuffixDatabase m31139() {
            return PublicSuffixDatabase.f30962;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<String> m5439(List<String> domainLabels) {
        String str;
        String strM5441;
        String str2;
        List<String> listM10735;
        List<String> listM107352;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m31136();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str3 = domainLabels.get(i);
            Charset charset = StandardCharsets.UTF_8;
            C5499.m17102(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strM5441 = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                C5499.m17132("publicSuffixListBytes");
                bArr2 = null;
            }
            strM5441 = companion.m5441(bArr2, bArr, i2);
            if (strM5441 != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = f30959;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    C5499.m17132("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strM54412 = companion2.m5441(bArr4, bArr3, i3);
                if (strM54412 != null) {
                    str2 = strM54412;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    C5499.m17132("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strM54413 = companion3.m5441(bArr5, bArr, i5);
                if (strM54413 != null) {
                    str = strM54413;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return C7628.m24136(f30961 + str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}, false, 0, 6, null);
        }
        if (strM5441 == null && str2 == null) {
            return f30960;
        }
        if (strM5441 == null || (listM10735 = C7628.m24136(strM5441, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}, false, 0, 6, null)) == null) {
            listM10735 = C3880.m10735();
        }
        if (str2 == null || (listM107352 = C7628.m24136(str2, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}, false, 0, 6, null)) == null) {
            listM107352 = C3880.m10735();
        }
        return listM10735.size() > listM107352.size() ? listM10735 : listM107352;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m31134(@InterfaceC6399 String domain) {
        int size;
        int size2;
        C5499.m17103(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        C5499.m17102(unicode, "unicodeDomain");
        List<String> listM31138 = m31138(unicode);
        List<String> listM5439 = m5439(listM31138);
        if (listM31138.size() == listM5439.size() && listM5439.get(0).charAt(0) != '!') {
            return null;
        }
        if (listM5439.get(0).charAt(0) == '!') {
            size = listM31138.size();
            size2 = listM5439.size();
        } else {
            size = listM31138.size();
            size2 = listM5439.size() + 1;
        }
        return C7342.m22979(C7342.m22933(C3888.m10833(m31138(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m31135() throws IOException {
        try {
            C7060.C7066 c7066 = new C7060.C7066();
            C7060.C7066 c70662 = new C7060.C7066();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f30958);
            if (resourceAsStream == null) {
                return;
            }
            InterfaceC3604 interfaceC3604M20831 = C6542.m20831(new C5230(C6542.m20847(resourceAsStream)));
            try {
                c7066.f21353 = interfaceC3604M20831.mo9661(interfaceC3604M20831.readInt());
                c70662.f21353 = interfaceC3604M20831.mo9661(interfaceC3604M20831.readInt());
                C8107 c8107 = C8107.f3222;
                C3849.m904(interfaceC3604M20831, null);
                synchronized (this) {
                    T t = c7066.f21353;
                    C5499.m17100(t);
                    this.publicSuffixListBytes = (byte[]) t;
                    T t2 = c70662.f21353;
                    C5499.m17100(t2);
                    this.publicSuffixExceptionListBytes = (byte[]) t2;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m31136() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m31135();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C6668.f2226.m21321().m21315("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m31137(@InterfaceC6399 byte[] publicSuffixListBytes, @InterfaceC6399 byte[] publicSuffixExceptionListBytes) {
        C5499.m17103(publicSuffixListBytes, "publicSuffixListBytes");
        C5499.m17103(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final List<String> m31138(String domain) {
        List<String> listM24136 = C7628.m24136(domain, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}, false, 0, 6, null);
        return C5499.m17094(C3888.m10926(listM24136), "") ? C3888.m10862(listM24136, 1) : listM24136;
    }
}
